<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>Simple_tva</title>

        <meta name="description" content="ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.">
        <meta name="author" content="pixelcave">
        <meta name="robots" content="noindex, nofollow">

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

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
                <h1 class="push-top-bottom text-light text-center"><strong>Pro</strong>UI</h1>
                <div class="inner">
                    <h3 class="text-light visible-lt-ie10"><strong>Loading..</strong></h3>
                    <div class="preloader-spinner hidden-lt-ie10"></div>
                </div>
            </div>
            <!-- END Preloader -->

            <!-- Page Container -->
            <!-- In the PHP version you can set the following options from inc/config file -->
            <!--
                Available #page-container classes:

                '' (None)                                       for a full main and alternative sidebar hidden by default (> 991px)

                'sidebar-visible-lg'                            for a full main sidebar visible by default (> 991px)
                'sidebar-partial'                               for a partial main sidebar which opens on mouse hover, hidden by default (> 991px)
                'sidebar-partial sidebar-visible-lg'            for a partial main sidebar which opens on mouse hover, visible by default (> 991px)
                'sidebar-mini sidebar-visible-lg-mini'          for a mini main sidebar with a flyout menu, enabled by default (> 991px + Best with static layout)
                'sidebar-mini sidebar-visible-lg'               for a mini main sidebar with a flyout menu, disabled by default (> 991px + Best with static layout)

                'sidebar-alt-visible-lg'                        for a full alternative sidebar visible by default (> 991px)
                'sidebar-alt-partial'                           for a partial alternative sidebar which opens on mouse hover, hidden by default (> 991px)
                'sidebar-alt-partial sidebar-alt-visible-lg'    for a partial alternative sidebar which opens on mouse hover, visible by default (> 991px)

                'sidebar-partial sidebar-alt-partial'           for both sidebars partial which open on mouse hover, hidden by default (> 991px)

                'sidebar-no-animations'                         add this as extra for disabling sidebar animations on large screens (> 991px) - Better performance with heavy pages!

                'style-alt'                                     for an alternative main style (without it: the default style)
                'footer-fixed'                                  for a fixed footer (without it: a static footer)

                'disable-menu-autoscroll'                       add this to disable the main menu auto scrolling when opening a submenu

                'header-fixed-top'                              has to be added only if the class 'navbar-fixed-top' was added on header.navbar
                'header-fixed-bottom'                           has to be added only if the class 'navbar-fixed-bottom' was added on header.navbar

                'enable-cookies'                                enables cookies for remembering active color theme when changed from the sidebar links
            -->
            <div id="page-container" class="sidebar-partial sidebar-visible-lg sidebar-no-animations">
                <!-- Alternative Sidebar -->
                <div id="sidebar-alt">
                    <!-- Wrapper for scrolling functionality -->
                    <div id="sidebar-alt-scroll">
                        <!-- Sidebar Content -->
                        <div class="sidebar-content">
                   
                        </div>
                        <!-- END Sidebar Content -->
                    </div>
                    <!-- END Wrapper for scrolling functionality -->
                </div>
                <!-- END Alternative Sidebar -->

                <!-- Main Sidebar -->
                <div id="sidebar">
                    <!-- Wrapper for scrolling functionality -->
                    <div id="sidebar-scroll">
                        <!-- Sidebar Content -->
                        <div class="sidebar-content">
                            <!-- Brand -->
                             <a href="acceuil.jsp" class="sidebar-brand">
                                <i class="gi gi-flash"></i><span class="sidebar-nav-mini-hide"><strong>Simple</strong>TVA</span>
                            </a>
                            <!-- END Brand -->

                            <!-- User Info -->
                            <div class="sidebar-section sidebar-user clearfix sidebar-nav-mini-hide">
                                <div class="sidebar-user-avatar">
                                    <a href="page_ready_user_profile.html">
                                        <img src="img/placeholders/photos/photo18.jpg" alt="avatar">
                                    </a>
                                </div>
                                <div class="sidebar-user-name"><%=session.getAttribute("login_email")%></div>
                             
                            </div>
                            <!-- END User Info -->

                            

                            <!-- Sidebar Navigation -->
                            <ul class="sidebar-nav">
                                <li>
                                    <a href="ajouter.jsp"><i class="gi gi-leaf sidebar-nav-icon"></i><span class="sidebar-nav-mini-hide">Saisir une facture</span></a>
                                </li>
                                <li>
                                    <a href="creer.jsp"><i class="gi gi-leaf sidebar-nav-icon"></i><span class="sidebar-nav-mini-hide">Générer le fichier XML</span></a>
                                </li>
                               <li>
                                    <a href="importer.jsp"><i class="gi gi-leaf sidebar-nav-icon"></i><span class="sidebar-nav-mini-hide">Fichier Excel</span></a>
                                </li>
                               
                               
                            </ul>
                            <!-- END Sidebar Navigation -->

                           
                        </div>
                        <!-- END Sidebar Content -->
                    </div>
                    <!-- END Wrapper for scrolling functionality -->
                </div>
                <!-- END Main Sidebar -->

                <!-- Main Container -->
                <div id="main-container">
                    <!-- Header -->
                    <!-- In the PHP version you can set the following options from inc/config file -->
                    <!--
                        Available header.navbar classes:

                        'navbar-default'            for the default light header
                        'navbar-inverse'            for an alternative dark header

                        'navbar-fixed-top'          for a top fixed header (fixed sidebars with scroll will be auto initialized, functionality can be found in js/app.js - handleSidebar())
                            'header-fixed-top'      has to be added on #page-container only if the class 'navbar-fixed-top' was added

                        'navbar-fixed-bottom'       for a bottom fixed header (fixed sidebars with scroll will be auto initialized, functionality can be found in js/app.js - handleSidebar()))
                            'header-fixed-bottom'   has to be added on #page-container only if the class 'navbar-fixed-bottom' was added
                    -->
                    <header class="navbar navbar-default">
                        <!-- Left Header Navigation -->
                        <ul class="nav navbar-nav-custom">
                            <!-- Main Sidebar Toggle Button -->
                            <li>
                                <a href="javascript:void(0)" onclick="App.sidebar('toggle-sidebar');this.blur();">
                                    <i class="fa fa-bars fa-fw"></i>
                                </a>
                            </li>
                            <!-- END Main Sidebar Toggle Button -->

                            <!-- Template Options -->
                            <!-- Change Options functionality can be found in js/app.js - templateOptions() -->
                            <li class="dropdown">
                                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="gi gi-settings"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-custom dropdown-options">
                                    <li class="dropdown-header text-center">Header Style</li>
                                    <li>
                                        <div class="btn-group btn-group-justified btn-group-sm">
                                            <a href="javascript:void(0)" class="btn btn-primary" id="options-header-default">Light</a>
                                            <a href="javascript:void(0)" class="btn btn-primary" id="options-header-inverse">Dark</a>
                                        </div>
                                    </li>
                                    <li class="dropdown-header text-center">Page Style</li>
                                    <li>
                                        <div class="btn-group btn-group-justified btn-group-sm">
                                            <a href="javascript:void(0)" class="btn btn-primary" id="options-main-style">Default</a>
                                            <a href="javascript:void(0)" class="btn btn-primary" id="options-main-style-alt">Alternative</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <!-- END Template Options -->
                        </ul>
                        <!-- END Left Header Navigation -->

                        <!-- Search Form -->
                        <form action="chercher" method="post" class="navbar-form-custom">
                            <div class="form-group">
                                <input type="text" name="motCle" value="${model.motCle}" id="top-search" class="form-control" placeholder="Search..">
                            </div>
                        </form>
                        <!-- END Search Form -->

                        <!-- Right Header Navigation -->
                        <ul class="nav navbar-nav-custom pull-right">
                            <!-- Alternative Sidebar Toggle Button -->
                            
                            <!-- END Alternative Sidebar Toggle Button -->

                            <!-- User Dropdown -->
                            <li class="dropdown">
                                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="img/placeholders/avatars/avatar2.jpg" alt="avatar"> <i class="fa fa-angle-down"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-custom dropdown-menu-right">
                                    
                                 <li>
                                        <form action=controleur.php method="post">
                                        <button type="submit" name="action" value="logout" class="btn btn-sm btn-danger" ><i class="fa fa-ban fa-fw pull-right"></i> Logout</button>
                                        </form>
                                        
                                    </li>
                                </ul>
                            </li>
                            <!-- END User Dropdown -->
                        </ul>
                        <!-- END Right Header Navigation -->
                    </header>
                    <!-- END Header -->

                    <!-- Page content -->
                    <div id="page-content">
                       
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
							</fieldset>
							</form>
                    </div>
                    <!-- END Page Content -->

                 
                </div>
                <!-- END Main Container -->
            </div>
            <!-- END Page Container -->
        </div>
        <!-- END Page Wrapper -->

        <!-- Scroll to top link, initialized in js/app.js - scrollToTop() -->
        <a href="#" id="to-top"><i class="fa fa-angle-double-up"></i></a>

        <!-- User Settings, modal which opens from Settings link (found in top right user menu) and the Cog link (found in sidebar user info) -->
       
        <!-- END User Settings -->

        <!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->
        <script src="js/vendor/jquery.min.js"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/app.js"></script>

        <!-- Load and execute javascript code used only in this page -->
        <script src="js/pages/tablesDatatables.js"></script>
        <script>$(function(){ TablesDatatables.init(); });</script>
    </body>
</html>