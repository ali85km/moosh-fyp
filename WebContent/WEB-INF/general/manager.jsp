<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
	
		<meta charset="utf-8">
		<title>Manager</title>
		
		<!-- CSS -->
		<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="css/social-icons.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="css/login.css" media="screen">
        <link rel="stylesheet" media="screen, print, handheld" type="text/css" href="css/calendar.css" />
		<!-- ENDS CSS -->	
		
		
		<!-- JS -->
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/custom.js"></script>
		<script type="text/javascript" src="js/slider.js"></script>
		<script src="js/slides/source/slides.min.jquery.js"></script>
		<script src="js/quicksand.js"></script>
        <script type="text/javascript" src="js/calendar.js"></script>

		<!-- superfish -->
		<link rel="stylesheet" media="screen" href="css/superfish.css" /> 
		<script type="text/javascript" src="js/superfish-1.4.8/js/hoverIntent.js"></script>
		<script type="text/javascript" src="js/superfish-1.4.8/js/superfish.js"></script>
		<script type="text/javascript" src="js/superfish-1.4.8/js/supersubs.js"></script>
		<!-- ENDS superfish -->

		<!-- poshytip -->
		<link rel="stylesheet" href="js/poshytip-1.0/src/tip-twitter/tip-twitter.css" type="text/css" />
		<link rel="stylesheet" href="js/poshytip-1.0/src/tip-yellowsimple/tip-yellowsimple.css" type="text/css" />
		<script type="text/javascript" src="js/poshytip-1.0/src/jquery.poshytip.min.js"></script>
		<!-- ENDS poshytip -->
		
		<!-- Tweet -->
		<link rel="stylesheet" href="css/jquery.tweet.css" media="all"  type="text/css"/> 
		<script src="js/tweet/jquery.tweet.js" type="text/javascript"></script> 
		<!-- ENDS Tweet -->
		
		<!-- prettyPhoto -->
		<script type="text/javascript" src="js/prettyPhoto/js/jquery.prettyPhoto.js"></script>
		<link rel="stylesheet" href="js/prettyPhoto/css/prettyPhoto.css" type="text/css" media="screen" />
		<!-- ENDS prettyPhoto -->
		
		<!-- GOOGLE FONTS -->
		<link href='http://fonts.googleapis.com/css?family=Droid+Serif:400italic' rel='stylesheet' type='text/css'>
	</head>
	
	<body>
	
		<!-- Dynamic Background -->
		<div id="headerimgs">
			<div id="headerimg1" class="headerimg"></div>
			<div id="headerimg2" class="headerimg"></div>
		</div>
		<!-- ENDS Dynamic Background -->
		
		<!-- background nav -->
		<div id="headernav">
			<div id="back" class="btn"></div>
			<div id="next" class="btn"></div>
		</div>
		<!-- ENDS background nav -->
		
		<div id="top-gap"></div>

		<!-- wrapper -->
		<div class="wrapper">
			<a href="index.html"><img  id="logo" src="img\logo.jpg" alt="Kroft"></a>
			
			<!-- nav bar holder -->
			<div id="nav-bar-holder">
				<!-- Navigation -->
				<ul id="nav" class="sf-menu">
					<li><a href="./manager">Home</a></li>
					<li><a href="./result">Result</a></li>
					<li><a href="">Forms</a>
						<ul>
							<li><a href="">View Forms</a></li>
							<li><a href="./telecommuterform">View TC Forms</a></li>
                            <li><a href="./managerform">Fill Forms</a></li>
						</ul>
					</li>
					<li><a href="./">Logout</a></li>
				</ul>
				<!-- ENDS Navigation -->
				
				<!-- Social -->
				<ul class="social">
					<li><a href="http://www.facebook.com" class="poshytip  facebook" title="Become a fan"></a></li>
					<li><a href="http://www.twitter.com" class="poshytip  twitter" title="Follow my tweets"></a></li>
					<li><a href="http://www.mmu.edu.my" class="poshytip  dribbble" title="Multimedia University"></a></li>
				</ul>
				<!-- ENDS Social -->
			</div>
			<!-- ENDS nav bar holder -->
				
			<!-- content wrap -->	    	
	        <div id="content-wrap">
	        	
	        	<!-- Page wrap -->
	        	<div id="page-wrap">
					<div class="page-title"><h1>SUNRISE</h1> <span>Welcome To Sunrise KPI System</span></div>
					
					<!-- side content -->
					<div id="side-content">
						<!-- single -->
						<div class="single-post">
							<div class="post">
								<div class="post-feature-img">
									<img src="img/My image/Manager.jpg" alt="Pic" />
								</div>
								<img src="img/feature-post-shadow.png" alt="shadow" />
								<h4><!--------INTRO----------></h4>
								<div class="content"></div>	
							</div>
						</div>	
						<!-- ENDS single -->											
					</div>
					<!-- ENDS side content -->
						
					<!-- sidebar -->
					<div id="sidebar">
						<div class="sideblock">
							<h6 class="side-title">Calendar</h6>
				    	</div>
						<!-- calndar -->
						<script type="text/javascript">
							calendar();
						</script>
					</div>
					<!-- ENDS sidebar -->
	        	
	        	</div>
	        	<!-- ENDS Page wrap -->
	        	
	        </div>
	        <!-- ENDS content wrap -->
	        
        </div>
		<!-- ENDS Wrapper -->
		
		
		<!-- FOOTER -->

		<!-- footer-bottom -->
		<div id="footer-bottom">
			<div class="bottom-wrapper">
				<div id="bottom-left">
					&copy; Copyright © 2012 Sunrise Inc. All rights reserved.
				</div>
				
			</div>
		</div>
		<!-- ENDS footer-bottom --> 
		
	</body>
</html>