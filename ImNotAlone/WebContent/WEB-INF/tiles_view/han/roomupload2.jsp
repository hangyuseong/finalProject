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
                <div class="col-md-9 mb30">
                    
                    <div class="mb40">
                        <h2 class="left-title">Add Photos</h2>
                        <form id="my-awesome-dropzone" action="add-listing.html" class="dropzone"></form>
                    </div><!--/-->
                    <div class="text-right mb40">
                        <a href="#" class="btn btn-lg btn-primary">PREV</a>
                        <a href="#" class="btn btn-lg btn-primary">NEXT</a>
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