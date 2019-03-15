<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title></title>
<script type="text/javascript">
	function confirmer(url) {
		var rep = confirm("voulez-vous supprimer?");
		if (rep == true) {
			document.location = url;
		}
	}
</script>
</head>
<body>
	<div>
		<form action="controleur.php" method="post">
			<table>
				<tr>
					<td>Mot Clé</td>
					<td><input type="text" name="motCle" value="${model.motCle}" />
					<td>
					<td><input type="submit" name="action" value="chercher"/>
					<td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<table>
			<tr>
				<th>Numéro de la facture</th>
				<th>Désignation</th>
				<th>TTC</th>
			</tr>
			<c:forEach items="${model.factures}" var="f">
				<tr>
				    <td>${f.facture_id}</td>
				    <td>${f.ordre}</td>
					<td>${f.num_facture}</td>
					<td>${f.designation}</td>
					<td>${f.mht}</td>
					<td>${f.tva}</td>
					<td>${f.ttc}</td>
					<td>${f.tax}</td>
					<td>${f.iff}</td>
					<div class="btn-group">
										<form action="controleur.php" method="post">
										<a
												href="controleur.php?action=edit%26facture_id=${f.facture_id}"
												 title="Edit"
												class="btn btn-xs btn-default"><i class="fa fa-pencil"></i></a>
											<a href="controleur.php?action=delete&facture_id=${f.facture_id}" 
												title="Delete" class="btn btn-xs btn-danger"><i
												class="fa fa-times"></i></a>
											<input type="submit" name="action" value="delete">
										</form>
										</div>
				</tr>
			</c:forEach>
			<tr>
				
				<button type="submit"
					onclick="window.open('file:///Users/mac/desktop/Simple_tva.xml')">Download!</button>
				<a href="file:///Users/mac/desktop/Simple_tva.xml" download>download</a>
				</td>
			</tr>
		</table>
	</div>
	<div class="form-group">
		<label class="col-md-3 control-label" for="example-file-input">File
			input</label>
		<div class="col-md-9">
			<input type="file" id="example-file-input" name="example-file-input">
		</div>
	</div>
	<!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->
	<script src="js/vendor/jquery.min.js"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/app.js"></script>
</body>

</html>