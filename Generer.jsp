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
					Remplissez les champs pour générer votre fichier xml<br>
					
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
								<i class="fa fa-angle-right"></i> Données relatives au
								Contribuable
							</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="IF">Identifiant
									fiscal<span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="IF" name="IF"
											class="form-control" placeholder="Identifiant fiscal"
											value=""> <span
											class="input-group-addon"><i class="gi gi-user"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="annee">
									Année de la déclaration<span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<div class="input-group">
										<input type="text" id="annee" name="annee"
											class="form-control" placeholder="exemple 2015"> <span
											class="input-group-addon"><i class="fa fa-hourglass-o"></i></span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="regime">
									Régime <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<select id="select1" name="select1" class="form-control"
										onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
										<option value="">Choisis le régime</option>
										<option value="Mensuel">Mensuel</option>
										<option value="Trimistriel">Trimistriel</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="periode">
									Période <span class="text-danger">*</span>
								</label>
								<div class="col-md-6">
									<select id="select2" name="select2" class="form-control">
									</select>
								</div>
							</div>
							
							<div class="form-group form-actions">
							<div class="col-md-8 col-md-offset-4">
								<input type="submit" class="btn btn-sm btn-primary"
									name="action" value="Generer" /> <input type="reset"
									value="Reset" class="btn btn-sm btn-warning" />

							</div>
						    </div>
							
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