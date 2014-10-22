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
		         <div class="chart">
		               <h3>Os Audience Stats</h3>
		                <div class="diagram">
		                  <canvas id="canvas" height="220" width="220"> </canvas>
		                  <h4><span>June</span><br />2013</h4>   
		                 </div>
		                     
		               <!----		              
						<span><img src="images/chart.png" alt="" /></span>
						----->					
						<div class="chart_list">
			           	  <ul>
			           	  	<li><a href="#" class="red">ios<p class="percentage">21<em>%</em></p></a></li>
			           	  	<li><a href="#" class="purple">Mac<p class="percentage">48<em>%</em></p></a></li>
			           	  	<li><a href="#" class="yellow">Linux<p class="percentage">9<em>%</em></p></a></li>
			           	  	<li><a href="#" class="blue">Win<p class="percentage">32<em>%</em></p></a></li>
			           	  	<div class="clear"></div>	
			           	  </ul>
			           </div>
			           <script>
						var doughnutData = [
								{
									value: 21,
									color:"#E64C65"
								},
								{
									value : 48,
									color : "#11A8AB"
								},							
								{
									value : 32,
									color : "#4FC4F6"
								},	
								{
									value : 9,
									color : "#FCB150"
								},							
							
							];				
							var myDoughnut = new Chart(document.getElementById("canvas").getContext("2d")).Doughnut(doughnutData);					
					</script>
		          </div>		          		       
    	    </div>
    	    
            <div class="column_right">
         			  <div class="graph">
		             	<canvas id="line-chart"> </canvas>
		             	<script>
							var lineChartData = {
								labels : ["Apr","May","Jun"],
								datasets : [									
									{
										fillColor : "rgba(255, 255, 255, 0)",
										strokeColor : "#FFF",
										pointColor : "#11a8ab",
										pointStrokeColor : "#FFF",
										data : [21,48,35]
									}
								]
								
							}
					
						var myLine = new Chart(document.getElementById("line-chart").getContext("2d")).Line(lineChartData);
						
						</script>
		             	<!---
		             	<img src="images/graph.png" alt="" />
		             	------->
		             	<div class="graph_list">
		             		 <div class="week-month-year">
		             		 	<p><a href="#">Week</a></p>
		             		 	<p><a href="#" class="active">Month</a></p>
		             		 	<p><a href="#">year</a></p>
		             		 	<div class="clear"></div>
		             		 </div>
				      			<ul>
						  		    <li><a href="#"><span class="day_name">Apr</span> 2013 
						  			<label class="digits"><span>+</span>21<em>%</em></label><div class="clear"></div></a></li>
						  			<li class="active"><a href="#"><span class="day_name">May</span> 2013 
						  			<label class="digits"><span>+</span>48<em>%</em></label><div class="clear"></div></a></li>
						  			<li><a href="#"><span class="day_name">Jun</span> 2013 
						  			<label class="digits"><span>+</span>35<em>%</em> </label><div class="clear"></div></a></li>						  			
				    		</ul>
				      </div>
		             </div> 
             </div>
    	<div class="clear"></div>
 	 </div>
   </div>   
 
</body>
</html>

