<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
	   width:100%;
       max-height: 400px;
      margin: auto;
  }
  
  .fnt{
   font-family: "Times New Roman", Times, serif;
  }
  </style>
</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/image/Carousel/carousel1.jpg" width="350" height="275">
     <div class="fnt"> <h2><font color="#ce3175">Find a Collection</font></h2>
	  <h3><font color="#ce3175">Of Branded Watches Here</font></h3>
         </div>
	  </div>

      <div class="item">
        <img src="resources/image/Carousel/c2.jpg" width="460" height="345">
		<div class="fnt"><h2><font color="#ce3175">Collection of</font></h2>
		<h3><font color="#ce3175">Luxury Watches</font></h3>
      </div>
      </div>
    
      <div class="item">
        <img src="resources/image/Carousel/c8.jpg" width="350" height="275">
      <div class="fnt"><h2><font color="#ce3175">Classic</font></h2>
	  <h3><font color="#ce3175">Wall Clock</font></h3>
	  </div>
	  </div>
	

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>
