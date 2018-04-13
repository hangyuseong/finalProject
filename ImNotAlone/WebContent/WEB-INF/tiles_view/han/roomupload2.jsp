<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
        <div class="page-bread mb70">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h3>submit listing</h3>
                    </div>
                    <div class="col-sm-6">

                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
            <h1 class="left-title">3단계 : 방 상세정보 등록</h1>
                <div class="col-md-9 mb30">
                <!-- 기본정보 -->
                    <div class="mb40">
                        <h3 class="left-title">상세정보</h3>
                        <div class="row">
                            <div class="col-sm-6">
                            <label>* 방분류</label>
                                <div class="form-group">
                                    <select name="property" class="form-control">
                                        <option>Property Type</option>
                                        <option>Apartment</option>
                                        <option>Condo</option>
                                        <option>House</option>
                                        <option>Villa</option>
                                    </select>
                                </div><!-- /.form-group -->
								<label>* 호스트 성별</label>
                                <div class="form-group">
                                    <select name="contract" class="form-control">
                                        <option>Contract</option>
                                        <option>Rent</option>
                                        <option>Sale</option>
                                    </select>
                                </div><!-- /.form-group -->
                                <label>* 보증금</label>
                                <div class="form-group">
                                    <select name="location" class="form-control">
                                        <option>India</option>
                                        <option>USA</option>
                                        <option>Paris</option>
                                        <option>Japan</option>
                                    </select>
                                </div><!-- /.form-group -->
                                <label>* 방면적</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-dollar"></i>
                                    <input type="email" class="form-control" placeholder="Min Price">
                                </div>
                                <label>* 월세</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-dollar"></i>
                                    <input type="email" class="form-control" placeholder="Min Price">
                                </div>
                                <label>* 관리비</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-dollar"></i>
                                    <input type="email" class="form-control" placeholder="Min Price">
                                </div>
                            </div>
                            
                            
                            <div class="col-sm-6">
                            	<label>* 인근 지하철역</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-home"></i>
                                    <input type="email" class="form-control" placeholder="Address">
                                </div>
                                <label>* 인근 대학교</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-phone"></i>
                                    <input type="email" class="form-control" placeholder="Phone">
                                </div>
                                <label>* 엘레베이터</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-location-arrow"></i>
                                    <input type="email" class="form-control" placeholder="City">
                                </div>
                                <label>* 건물 층수</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-envelope-o"></i>
                                    <input type="email" class="form-control" placeholder="Email">
                                </div>
                                <label>* 입주가능일</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-phone"></i>
                                    <input type="email" class="form-control" placeholder="Phone">
                                </div>
                                <label>* 반려동물여부</label>
                                <div class="form-group-icon mb15">
                                    <i class="fa fa-phone"></i>
                                    <input type="email" class="form-control" placeholder="Phone">
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- 추가옵션 -->
                    <div class="mb40">
                        <h3 class="left-title">추가 옵션</h3>
                        <ul class="amenities list-inline">
                            <li class="checkbox"><input type="checkbox" id="amenity-1"> <label for="amenity-1">무선 인터넷</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-2"> <label for="amenity-2">세탁기</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-3"> <label for="amenity-3">에어컨</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-4"> <label for="amenity-4">TV</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-5"> <label for="amenity-5">전자도어락</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-6"> <label for="amenity-6">중앙난방</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-7"> <label for="amenity-7">개인난방</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-8"> <label for="amenity-8">냉장고</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-9"> <label for="amenity-9">가스레인지</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-10"> <label for="amenity-10">전자레인지</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-11"> <label for="amenity-11">책장</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-12"> <label for="amenity-12">옷장</label></li>
                            <li class="checkbox"><input type="checkbox" id="amenity-13"> <label for="amenity-13">침대</label></li>
                        </ul>
                    </div>
                    <div class="text-right mb40">
                        <a href="/ImNotAlone/share/han/roomupload1" class="btn btn-lg btn-primary">PREV</a>
                        <a href="/ImNotAlone/share/han/uploadFInish" class="btn btn-lg btn-primary">FINISH</a>
                    </div>
                </div><!--/col-->
            </div>
        </div>
       
        <!-- jQuery-->

        <script src="js/plugins/all.js"></script>
        <script src="js/finder.custom.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB8VMR9FooFZN64_qR8pu0jY0NJ8j_sicE&libraries=places&callback=initAutocomplete"
        async defer></script>
        <script>
           
            
            //google-map-location-finder
            function initAutocomplete() {
                var map = new google.maps.Map(document.getElementById('map-canvas'), {
                    center: {lat: 26.981942, lng: 75.684486},
                    zoom: 13,
                    mapTypeId: 'roadmap'
                });

                // Create the search box and link it to the UI element.
                var input = document.getElementById('pac-input');
                var searchBox = new google.maps.places.SearchBox(input);
                map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

                // Bias the SearchBox results towards current map's viewport.
                map.addListener('bounds_changed', function () {
                    searchBox.setBounds(map.getBounds());
                });

                var markers = [];
                // Listen for the event fired when the user selects a prediction and retrieve
                // more details for that place.
                searchBox.addListener('places_changed', function () {
                    var places = searchBox.getPlaces();

                    if (places.length == 0) {
                        return;
                    }

                    // Clear out the old markers.
                    markers.forEach(function (marker) {
                        marker.setMap(null);
                    });
                    markers = [];

                    // For each place, get the icon, name and location.
                    var bounds = new google.maps.LatLngBounds();
                    places.forEach(function (place) {
                        if (!place.geometry) {
                            console.log("Returned place contains no geometry");
                            return;
                        }
                        var icon = {
                            url: place.icon,
                            size: new google.maps.Size(71, 71),
                            origin: new google.maps.Point(0, 0),
                            anchor: new google.maps.Point(17, 34),
                            scaledSize: new google.maps.Size(25, 25)
                        };

                        // Create a marker for each place.
                        markers.push(new google.maps.Marker({
                            map: map,
                            icon: icon,
                            title: place.name,
                            position: place.geometry.location
                        }));

                        if (place.geometry.viewport) {
                            // Only geocodes have viewport.
                            bounds.union(place.geometry.viewport);
                        } else {
                            bounds.extend(place.geometry.location);
                        }
                    });
                    map.fitBounds(bounds);
                });
            }

        </script>

    </body>
</html>