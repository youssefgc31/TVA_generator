<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">

<title>Saisie des factures</title>

<meta name="description"
	content="ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.">
<meta name="author" content="pixelcave">
<meta name="robots" content="noindex, nofollow">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Icons -->
<!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->
<link rel="shortcut icon" href="img/favicon.png">
<link rel="apple-touch-icon" href="img/icon57.png" sizes="57x57">
<link rel="apple-touch-icon" href="img/icon72.png" sizes="72x72">
<link rel="apple-touch-icon" href="img/icon76.png" sizes="76x76">
<link rel="apple-touch-icon" href="img/icon114.png" sizes="114x114">
<link rel="apple-touch-icon" href="img/icon120.png" sizes="120x120">
<link rel="apple-touch-icon" href="img/icon144.png" sizes="144x144">
<link rel="apple-touch-icon" href="img/icon152.png" sizes="152x152">
<link rel="apple-touch-icon" href="img/icon180.png" sizes="180x180">
<!-- END Icons -->

<!-- Stylesheets -->
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
<script language="javascript" type="text/javascript">
	function dynamicdropdown(listindex) {
		switch (listindex) {

		case "Trimistriel":
			document.getElementById("select2").options[0] = new Option(
					"Premier trimestre", "Premier trimestre");
			document.getElementById("select2").options[1] = new Option(
					"deuxième trimestre", "deuxième trimestre");
			document.getElementById("select2").options[2] = new Option(
					"Troizième trimestre", "Troizième trimestre");
			document.getElementById("select2").options[3] = new Option(
					"Quatrième trimestre", "Quatrième trimestre");
			//     	 document.getElementById("select2").options[4]=null;
			//     	 document.getElementById("select2").options[5]=null;
			// 		 document.getElementById("select2").options[6]=null;
			//		 document.getElementById("select2").options[7]=null;
			//       document.getElementById("select2").options[8]=null;
			//       document.getElementById("select2").options[9]=null;
			//       document.getElementById("select2").options[10]=null;
			//       document.getElementById("select2").options[11]=null;
			//       document.getElementById("select2").options[12]=null;
			//       document.getElementById("Décembre").options[12]=null;
			//       document.getElementById("Novembre").options[11]=null;
			//       document.getElementById("Septembre").options[9]=null;
			//       document.getElementById("Octobre").options[10]=null;
			//       document.getElementById("Aout").options[8]=null;
			//       document.getElementById("Juillet").options[7]=null;
			//       document.getElementById("Juin").options[6]=null;
			//       document.getElementById("Mai").options[5]=null;
			break;
		case "Mensuel":
			document.getElementById("select2").options[0] = new Option(
					"Choisis le régime", "");
			document.getElementById("select2").options[1] = new Option(
					"Janvier", "Janvier");
			document.getElementById("select2").options[2] = new Option(
					"Février", "Février");
			document.getElementById("select2").options[3] = new Option("Mars",
					"Mars");
			document.getElementById("select2").options[4] = new Option("Avril",
					"Avril");
			document.getElementById("select2").options[5] = new Option("Mai",
					"Mai");
			document.getElementById("select2").options[6] = new Option("Juin",
					"Juin");
			document.getElementById("select2").options[7] = new Option(
					"Juillet", "Juillet");
			document.getElementById("select2").options[8] = new Option("Aout",
					"Aout");
			document.getElementById("select2").options[9] = new Option(
					"Septembre", "Septembre");
			document.getElementById("select2").options[10] = new Option(
					"Octobre", "Octobre");
			document.getElementById("select2").options[11] = new Option(
					"Novembre", "Novembre");
			document.getElementById("select2").options[12] = new Option(
					"Décembre", "Décembre");
			break;
		}
		return true;
	}
</script>
</head>
<body>
	<!-- Page Wrapper -->
	<!-- In the PHP version you can set the following options from inc/config file -->
	<!--
            Available classes:

            'page-loading'      enables page preloader
        -->
	<div id="page-wrapper">
		<!-- Preloader -->
		<!-- Preloader functionality (initialized in js/app.js) - pageLoading() -->
		<!-- Used only if page preloader is enabled from inc/config (PHP version) or the class 'page-loading' is added in #page-wrapper element (HTML version) -->
		<div class="preloader themed-background">
			<h1 class="push-top-bottom text-light text-center">
				<strong>Pro</strong>UI
			</h1>
			<div class="inner">
				<h3 class="text-light visible-lt-ie10">
					<strong>Loading..</strong>
				</h3>
				<div class="preloader-spinner hidden-lt-ie10"></div>
			</div>
		</div>
		<!-- END Preloader -->
	</div>
	<!-- Page content -->
	<div id="page-content">
		<!-- Validation Header -->
		<div class="content-header">
			<div class="header-section">
				<h1>
					Formulaire de Saisie et Validation d'une facture<br>
					<small>chaque facture doit etre unique</small>
				</h1>
			</div>
		</div>


		<!-- END Validation Header -->

		<div class="row">
			<div class="col-md-12">
				<!-- Form Validation Example Block -->
				<div class="block">
					<!-- Form Validation Example Title -->
					<div class="block-title">
						<h2>
							<strong>Remplissez tous les champs soigneusement</strong>
						</h2>
					</div>
					<!-- END Form Validation Example Title -->

					<!-- Form Validation Example Content -->
					<form id="form-validation" action="controleur.php" method="post"
						class="form-horizontal form-bordered">
						
						<fieldset>
							<legend>
								<i class="fa fa-angle-right"></i> Données relatives à la
								Facture
							</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="ordre">Ordre
									de la facture <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="val_digits" name="ordre"
											class="form-control" placeholder="1"
											value="${model.facture.ordre}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="num_facture">Numéro
									de la facture<span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="num_facture" name="num_facture"
											class="form-control" placeholder="1"
											value="${model.facture.num_facture}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							
							<div class="form-group">
								<label class="col-md-4 control-label" for="des">Désignation<span
									class="text-danger">*</span></label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="if" name="des" class="form-control"
											placeholder="Désignation"
											value="${model.facture.designation}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							
							<div class="form-group">
								<label class="col-md-4 control-label" for="mht">Mantant
									hors taxe MHT<span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="mht" name="mht" class="form-control"
											placeholder="1" value="${model.facture.mht}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="tva">TVA<span
									class="text-danger">*</span></label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="tva" name="tva" class="form-control"
											placeholder="1" value="${model.facture.tva}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="ttc">TTC<span
									class="text-danger">*</span></label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="ttc" name="ttc" class="form-control"
											placeholder="1" value="${model.facture.ttc}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							
				<!--  		<c:if test="${model.mode=='add'}">-->
							
		<!--  					</c:if>
							<c:if test="${model.mode=='edit'}">
							<div class="form-group">
								<label class="col-md-4 control-label" for="des">Désignation<span
									class="text-danger">*</span></label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="hidden" id="if" name="des" class="form-control"
											placeholder="${model.facture.designation}"
											value="${model.facture.designation}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>

							</div>
							</c:if>-->
						</fieldset>
						<fieldset>
							<legend>
								<i class="fa fa-angle-right"></i> Données relatives au
								Fournisseur
							</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="val_range">Id
									fiscal du fournisseur <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="val_range" name="val_range"
											class="form-control" placeholder="IF fournisseur"> <span
											class="input-group-addon"><i class="gi gi-user"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="val_range">Nom
									du fournisseur <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="val_range" name="val_range"
											class="form-control" placeholder="nom "> <span
											class="input-group-addon"><i class="gi gi-user"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="val_range">ICE
									du fournisseur <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="val_range" name="val_range"
											class="form-control" placeholder="ICE fournisseur"> <span
											class="input-group-addon"><i class="gi gi-user"></i></span>
									</div>
								</div>
							</div>

						</fieldset>
						<fieldset>
							<legend>
								<i class="fa fa-angle-right"></i> Données relatives au paiement
							</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="tax">Taux de
									la taxe <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="tax" name="tax" class="form-control"
											placeholder="20%" value="${model.facture.tax}"> <span
											class="input-group-addon"><i class="gi gi-asterisk"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="paiment"> Type
									de paiement <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<select id="paiment" name="paiment" class="form-control">
										<option value="espece">espèce</option>
										<option value="chèque">chèque</option>
										<option value="prelevement">Prélèvement</option>
										<option value="virement">Virement</option>
										<option value="effet">Effet</option>
										<option value="compensation">Compensation</option>
										<option value="autres">Autres</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="date_pai">Date
									de paiement</label>
								<div class="col-md-6">
									<input type="text" id="date_pai"
										name="date_pai"
										class="date_pai"
										data-date-format="dd-mm-yy" placeholder="dd-mm-yy">
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="date_facture">Date
									de la facture</label>
								<div class="col-md-6">
									<input type="text" id="date_facture"
										name="date_facture"
										class="form-control input-datepicker"
										data-date-format="dd-mm-yy" placeholder="dd-mm-yy">
								</div>
							</div>
						</fieldset>
						<div class="form-group form-actions">
							<div class="col-md-8 col-md-offset-4">
								<input type="submit" class="btn btn-sm btn-primary"
									name="action" value="Ajouter" /> <input type="reset"
									value="Reset" class="btn btn-sm btn-warning" />

							</div>
						</div>
					</form>
					<!-- END Form Validation Example Content -->
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->
	<script src="js/vendor/jquery.min.js"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/app.js"></script>

	<!-- Load and execute javascript code used only in this page -->
	<script src="js/pages/formsValidation.js"></script>
	<script>
		$(function() {
			FormsValidation.init();
		});
	</script>

</body>
</html>