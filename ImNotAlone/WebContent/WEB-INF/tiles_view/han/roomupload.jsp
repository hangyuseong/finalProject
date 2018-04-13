<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
      #floating-panel {
        position: absolute;
        top: 10px;
        left: 25%;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: 'Roboto','sans-serif';
        line-height: 30px;
        padding-left: 10px;
      }
    </style>
</head>
        <div class="page-bread mb70">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h3>호스팅하기</h3>
                    </div>
                    <div class="col-sm-6">
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-9 mb30">
                     <div class="mb40">
                        <h2 class="left-title">1단계 : 방 위치 등록</h2>
                        <form action="#">
	                        <div class="mb15">
	                        <div id="map"></div>
									<p>
										  <b>주소입력 : </b>
				     					  <input id="address" type="text" size = "60" placeholder="주소를 입력하세요.">
				    					  <input id="submit" type="button" value="검색">
									</p>
									<p>
										  <b>상세주소 : </b>
										  <input id="address1" type="text" size = "60" placeholder="상세주소를 입력하세요.">
										  </br>
										  <input type = "text" name = "addr1" value = "">
										  <input type = "text" name = "addr2" value = "">
									</p>
								</div>
							</form>
						<div class="text-right mb40">
                        	<a href="/ImNotAlone/share/han/roomupload1" class="btn btn-lg btn-primary">NEXT</a>
                    	</div>
                    </div><!--mb40-->
                </div><!-- col-md-9 mb30 -->
            </div><!-- row -->
        </div><!-- Container -->
        
		<!-- jQuery-->
        <!-- <script src="js/plugins/all.js"></script>
        <script src="js/finder.custom.js"></script> -->
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCyI0LIUfIH6adaQGcyYdl7zyCWanMSLPY&callback=initMap"></script>
   	<script>
   		var map;
	  	var geocoder;
   	
      function initMap() {
    	     	  
        map = new google.maps.Map(document.getElementById('map'), {
          zoom: 15,
          center: {lat: 37.566535, lng: 126.97796919999996}
        });
        geocoder = new google.maps.Geocoder();
 /*        var geocoder = new google.maps.Geocoder;
        var infowindow = new google.maps.InfoWindow;
 */
        /* document.getElementById('submit').addEventListener('click', function() {
          geocodeLatLng(geocoder, map, infowindow);
        }); */
           document.getElementById('submit').addEventListener('click', function() {
          geocodeAddress(geocoder, map);
        });
      }
      	//역지오코딩
      	/* function geocodeLatLng(geocoder, map, infowindow) {
        var input = document.getElementById('latlng').value;
        var latlngStr = input.split(',', 2);
        var latlng = {lat: parseFloat(latlngStr[0]), lng: parseFloat(latlngStr[1])};
        geocoder.geocode({'location': latlng}, function(results, status) {
          if (status === 'OK') {
            if (results[1]) {
              map.setZoom(11);
              var marker = new google.maps.Marker({
                position: latlng,
                map: map
              });
              infowindow.setContent(results[1].formatted_address);
              infowindow.open(map, marker);
            } else {
              window.alert('No results found');
            }
          } else {
            window.alert('Geocoder failed due to: ' + status);
          }
        });
      } */
      	
		 //지오코딩
      function geocodeAddress(geocoder, resultsMap) {
       //map.clearOverlays();
        var address = document.getElementById('address').value;
        geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            resultsMap.setCenter(results[0].geometry.location);            
         
            var location = '<div>' + results[0].geometry.location + '</div>';
         
         var infowindow = new google.maps.InfoWindow({
            content: location
         });
         
         var marker = new google.maps.Marker({
              map: resultsMap,
              position: results[0].geometry.location
            });
         marker.addListener('click', function() {
            infowindow.open(resultsMap, marker);
         });

          } else {
            alert('정확한 주소를 입력해주세요 : ' + status);
          }
        });
      }
      
    </script>
</html>