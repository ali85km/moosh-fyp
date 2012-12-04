<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	
	     <!-- Head of fancy sign up -->
		<title>Signup</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Fancy Sliding Form with jQuery" />
        <meta name="keywords" content="jquery, form, sliding, usability, css3, validation, javascript"/>
        <link rel="stylesheet" href="css/SignupStyle.css" type="text/css" media="screen"/>
		<script type="text/javascript" src="js/Signup.js.js"></script>
        <script type="text/javascript" src="js/sliding.form.js"></script>
        <script type="text/javascript" src="css/SignupStyle.css"></script>
        <!-- Finish -->
        
        <!-- style fancy -->

	
		<meta charset="utf-8">
		<title>Homepage</title>
		
		<!-- CSS -->
		<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="css/social-icons.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="css/login.css" media="screen">		
		<!-- ENDS CSS -->	
		
		<!--[if IE]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

		
		<!-- JS -->
		<script type="text/javascript" src="js/jquery.min.js"></script>		
		<script type="text/javascript" src="js/custom.js"></script>
		<script type="text/javascript" src="js/slider.js"></script>
		<script src="js/slides/source/slides.min.jquery.js"></script>
		<script src="js/quicksand.js"></script>
		<!-- ENDS JS -->

		
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
	
	<!-----Moozhan ---->
	 <style>
        span.reference{
            position:fixed;
            left:5px;
            top:5px;
            font-size:10px;
            text-shadow:1px 1px 1px #fff;
        }
        span.reference a{
            color:#555;
            text-decoration:none;
			text-transform:uppercase;
        }
        span.reference a:hover{
            color:#000;
            
        }
        h1{
            color:#ccc;
            font-size:36px;
            text-shadow:1px 1px 1px #fff;
            padding:20px;
        }
    </style>
	<!---END Moozhan ---->
	
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
		
			<img  id="logo" src="img\logo.jpg" alt="Kroft"></a>
			
			
			<!-- nav bar holder -->
			<div id="nav-bar-holder">
			
				
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
	        	
					<div class="page-title"><h1>SUNRISE</h1> <span>Welcome Sunrise KPI System</span></div>
					
					<!-- side content -->
					<div id="side-content">
					
					<!----- Moozhan - Body --->
					        <div>

        </div>
        <div id="content">
            <h1>SIGNUP</h1>
            <div id="wrapper">
                <div id="steps">
                    <form id="formElem" name="formElem" action="./signupvalidator"  method="post">
                        <fieldset class="step">
                            <legend>Account</legend>
                            <p>
                                <label for="uname">User name</label>
                                <input id="uname" maxlength="12" name="uname" placeholder="Maximum 12 Character" />
                            </p>
                            <p>
                                <label for="password">Password</label>
                                <input id="password" name="password" type="password" AUTOCOMPLETE=OFF placeholder="Maximum 12 Character" />
                            </p>
                        </fieldset>
						
                        <fieldset class="step">
                            <legend>Personal Details</legend>
                            <p>
                                <label for="fname">First Name</label>
                                <input id="fname" name="fname" type="text" AUTOCOMPLETE=OFF />
                            </p>
							 <p>
                                <label for="lname">Last Name</label>
                                <input id="lname" name="lname" type="text" AUTOCOMPLETE=OFF />
                            </p>
							<p>
                                <label for="gender">Gender</label>
                                <select id="gender" name="gender">
                                    <option>Male</option>
                                    <option>Female</option>
                                </select>
                            </p>
							
							<p>
							  <label for="bdday">Birthday</label>
							  <br>
							  <br>
								<label align="left">  Day </label>
								<select name="bdday" id="dbday">
								  <option>1</option>
								  <option>2</option>
								  <option>3</option>
								  <option>4</option>
								  <option>5</option>
								  <option>6</option>
								  <option>7</option>
								  <option>8</option>
								  <option>9</option>
								  <option>10</option>
								  <option>11</option>
								  <option>12</option>
								  <option>13</option>
								  <option>14</option>
								  <option>15</option>
								  <option>16</option>
								  <option>17</option>
								  <option>18</option>
								  <option>19</option>
								  <option>20</option>
								  <option>21</option>
								  <option>22</option>
								  <option>23</option>
								  <option>24</option>
								  <option>25</option>
								  <option>26</option>
								  <option>27</option>
								  <option>28</option>
								  <option>29</option>
								  <option>30</option>
								  <option>31</option>
								</select>
								</br>
								
								<br>
								<label align="left">  Month </label>
								<select name="bdmonth" id="bdmonth">
								  <option>Jan</option>
								  <option>Feb</option>
								  <option>Mar</option>
								  <option>Apr</option>
								  <option>May</option>
								  <option>Jun</option>
								  <option>Jul</option>
								  <option>Aug</option>
								  <option>Sep</option>
								  <option>Oct</option>
								  <option>Nov</option>
								  <option>Dec</option>
								</select>
								</label>
								</br>
								
								<br>
								<label align="left">  Year </label>
								<select name="bdyear" id="bdyear">
								  <option>1990</option>
								  <option>1989</option>
								  <option>1988</option>
								  <option>1987</option>
								  <option>1986</option>
								  <option>1985</option>
								  <option>1984</option>
								  <option>1983</option>
								  <option>1982</option>
								  <option>1981</option>
								</select>
								</label>
								</br>
							</p>
						
							<p>
								<label for="citizen">Citizenship</label>
								<input id="citizen" name="citizen" type="text" AUTOCOMPLETE=OFF />
							</p>
						
							<p>
                                <label for="passport">IC/Passport Number</label>
                                <input id="passport" name="passport" type="text" AUTOCOMPLETE=OFF />
                            </p>
                        </fieldset>
						
						<fieldset class="step">
                            <legend>Contact</legend>
							 <p>
                                <label for="email">Email</label>
                                <input id="email" name="email" placeholder="info@tympanus.net" type="email" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="homephone">Phone</label>
                                <input id="homephone" name="homephone" placeholder="e.g. +351215555555" type="tel" AUTOCOMPLETE=OFF />
                            </p>
							
							<p>
                                <label for="cellphone">Cell Phone</label>
                                <input id="cellphone" name="cellphone" placeholder="e.g. +1(514)1111111" type="tel" AUTOCOMPLETE=OFF />
                            </p>
							
							<p>
                                <label  for="address">Address</label>						
								<textarea id="address" name="address" type="text" cols="45" rows="5"></textarea>
							</p> 
                        </fieldset>
                       
						<fieldset class="step">
                            <legend>Confirm</legend>
							<p>
								Everything in the form was correctly filled 
								if all the steps have a green checkmark icon.
								A red checkmark icon indicates that some field 
								is missing or filled out with invalid data. In this
								last step the user can confirm the submission of
								the form.
							</p>
                            <p class="submit">
                                <button id="registerButton" type="submit">Register</button>
                            </p>
                        </fieldset>
                    </form>
                </div>
				
                <div id="navigation" style="display:none;">
                    <ul>
                        <li class="selected">
                            <a href="#">Account</a>
                        </li>
                        <li>
                            <a href="#">Personal Details</a>
                        </li>
						<li>
                            <a href="#">Contact</a>
                        </li>
						<li>
                            <a href="#">Confirm</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        		
					</div>
					<!-- ENDS side content -->
					<!------ End Moozhan Body ---------->
					

				<div class="clear"></div>
	        	
	        	</div>
	        	<!-- ENDS Page wrap -->
	        	
	        </div>
	        <!-- ENDS content wrap -->
	        
        </div>
		<!-- ENDS Wrapper -->
		
		<!-- FOOTER -->
		<div id="footer">
			<div class="footer-wrapper">
				

		
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