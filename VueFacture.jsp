<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<meta name="description"
	content="ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.">
<meta name="author" content="pixelcave">
<meta name="robots" content="noindex, nofollow">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">


<!-- Bootstrap is included in its original form, unaltered -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Related styles of various icon packs and plugins -->
<link rel="stylesheet" href="css/plugins.css">

<!-- The main stylesheet of this template. All Bootstrap overwrites are defined in here -->
<link rel="stylesheet" href="css/main.css">

<!-- Include a specific file here from css/themes/ folder to alter the default theme of the template -->

<!-- The themes stylesheet of this template (for using specific theme color in individual elements - must included last) -->
<link rel="stylesheet" href="css/themes.css">
<!-- END Stylesheets -->

<!-- Modernizr (browser feature detection library) -->
<script src="js/vendor/modernizr.min.js"></script>
</head>
<body>
	<div id="page-wrapper">


		<!-- Main Container -->
		<div id="main-container">

			<header class="navbar navbar-default"> <!-- Search Form -->
			<form action="controleur.php" method="post"
				class="navbar-form-custom">
				<div class="form-group">
					<input type="text" id="top-search" name="motCle"
						value="${model.motCle}" class="form-control"
						placeholder="Search.."> <input type="submit"
						name="action" value="chercher">
				</div>
			</form>
			<!-- END Search Form --> </header>
			<!-- END Header -->

			<!-- Page content -->
			<div id="page-content">

				<div class="block full">
					<div class="block-title">
						<h2>
							<strong>Datatables</strong> integration
						</h2>
					</div>
					<div class="table-responsive">
						<table id="example-datatable"
							class="table table-vcenter table-condensed table-bordered">
							<tr>
							    <th class="text-center">ID</th>
							    <th class="text-center">ORDRE</th>
								<th>Numéro de la facture</th>
								<th>Désignation</th>
								<th class="text-center">MHT</th>						
								<th class="text-center">TVA</th>
								<th class="text-center">TTC</th>
								<th class="text-center">TAX</th>
								<th class="text-center">Fournisseur</th>
								
							</tr>
							<c:forEach items="${model.factures}" var="f">
								<tr>
									<td class="text-center">${f.facture_id}</td>
									<td class="text-center">${f.ordre}</td>
									<td class="text-center">${f.num_facture}</td>
									<td class="text-center">${f.designation}</td>
									<td class="text-center">${f.mht}</td>
									<td class="text-center">${f.tva}</td>
									<td class="text-center">${f.ttc}</td>
									<td class="text-center">${f.tax}</td>
									<td class="text-center">${f.iff}</td>
									<td class="text-center">
								    <div class="btn-group">

											<form action="controleur.php" method="post">
										
											 <input type="hidden" name="facture_id" value="${f.facture_id}" >
												
											<input type="submit" name="action" value="delete" >
										</form>
										</div>
									</td>

								</tr>
							</c:forEach>
							<tr>

								</td>
							</tr>
						</table>

						<button type="submit"
							onclick="window.open('file:///Users/mac/desktop/Simple_tva.xml')">Download!</button>
						<a href="file:///Users/mac/desktop/Simple_tva.xml" download>download</a>


						<!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->
						<script src="js/vendor/jquery.min.js"></script>
						<script src="js/vendor/bootstrap.min.js"></script>
						<script src="js/plugins.js"></script>
						<script src="js/app.js"></script>
</body>
</html>