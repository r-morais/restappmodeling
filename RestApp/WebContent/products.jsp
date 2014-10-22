<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML>
<head>
<title>RestApp | Home </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
<link href='http://fonts.googleapis.com/css?family=Carrois+Gothic+SC' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/Chart.js"></script>
 <script type="text/javascript" src="js/jquery.easing.js"></script>
 <script type="text/javascript" src="js/jquery.ulslide.js"></script>
 <!----Calender -------->
  <link rel="stylesheet" href="css/clndr.css" type="text/css" />
  <script src="js/underscore-min.js"></script>
  <script src= "js/moment-2.2.1.js"></script>
  <script src="js/clndr.js"></script>
  <script src="js/site.js"></script>
  <!----End Calender -------->
</head>
<body>			       
	    <div class="wrap">	 
	      <div class="header">
	      	  <div class="header_top">
					  <div class="menu">
						  <a class="toggleMenu" href="#"><img src="images/nav.png" alt="" /></a>
							<ul class="nav">
								<li><a href="#"><i><img src="images/settings.png" alt="" /></i>Settings</a></li>
								<li class="active"><a href="#"><i><img src="images/user.png" alt="" /></i>Account</a></li>
								<li><a href="#"><i><img src="images/mail.png" alt="" /></i>Messages <span class="messages">5</span></a></li>
								<li><a href="#"><i><img src="images/favourite.png" alt="" /></i>Favorites</a></li>
							<div class="clear"></div>
						    </ul>
							<script type="text/javascript" src="js/responsive-nav.js"></script>
				        </div>	
					  <div class="profile_details">
				    		   <div id="loginContainer">
				                  <a id="loginButton" class=""><span>Me</span></a>   
				                    <div id="loginBox">                
				                      <form id="loginForm">
				                        <fieldset id="body">
				                            <div class="user-info">
							        			<h4>Hello,<a href="#"> Username</a></h4>
							        			<ul>
							        				<li class="profile active"><a href="#">Profile </a></li>
							        				<li class="logout"><a href="#"> Logout</a></li>
							        				<div class="clear"></div>		
							        			</ul>
							        		</div>			                            
				                        </fieldset>
				                    </form>
				                </div>
				            </div>
				             <div class="profile_img">	
				             	<a href="#"><img src="images/profile_img40x40.jpg" alt="" />	</a>
				             </div>		
				             <div class="clear"></div>		  	
					    </div>	
		 		      <div class="clear"></div>				 
				   </div>
			</div>	  					     
	</div>
	  <div class="main">  
	    <div class="wrap">  		 
	       <div class="column_left">	          
	    		 <div class="menu_box">
	    		 	 <h3>Menu Box</h3>
	    		 	   <div class="menu_box_list"> 
				      		<ul>
				      			<li><s:a cssClass="events" action="show_products"><span>Produtos</span></s:a></li>
						  		<li><s:a cssClass="events" action="show_users"><span>Usuários</span></s:a></li>		  	
				    		</ul>
				      </div>
	    		 </div>
	  		</div> 
	  		
            <div class="column_middle">              
		         <div class="weather">
		               <h3><i><img src="images/location.png" alt="" /> </i> Products</h3>
		     		   <div class="temp_list">
				      			<ul>
						  		    <li><a href="#"><span class="day_name">Coca-cola</span>&nbsp; Bebidas 
						  			<label class="digits">25 <i><img src="images/sun_icon1.png" alt="" /></i></label><div class="clear"></div></a></li>
						  			<li><a href="#"><span class="day_name">Mon</span>&nbsp; 01/07 
						  			<label class="digits">24<em>o</em> <i><img src="images/clouds.png" alt="" /></i></label><div class="clear"></div></a></li>
						  			<li><a href="#"><span class="day_name">Tue</span>&nbsp; 02/07 
						  			<label class="digits">26<em>o</em> <i><img src="images/sun_icon1.png" alt="" /></i></label><div class="clear"></div></a></li>
						  			<li><a href="#"><span class="day_name">Wed</span>&nbsp; 03/07 
						  			<label class="digits">27<em>o</em> <i><img src="images/sun_icon2.png" alt="" /></i></label><div class="clear"></div></a></li>
						  			<li><a href="#"><span class="day_name">Thu</span>&nbsp; 04/07
						  			<label class="digits">29<em>o</em> <i><img src="images/sun_icon2.png" alt="" /></i></label><div class="clear"></div></a></li>
				    		</ul>
				    		<div class="button" style="text-align:center"><a href="#">Add Product</a></div>
				      </div>
		          </div>		          		       
    	    </div>
    	    
            <div class="column_right">
         			  
            </div>
    	<div class="clear"></div>
 	 </div>
   </div>   
 
</body>
</html>

