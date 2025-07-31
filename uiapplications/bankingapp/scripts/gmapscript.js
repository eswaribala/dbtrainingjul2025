window.addEventListener('load', function() {

    let myarea=this.document.querySelector('#myarea');
    if(this.navigator.geolocation) {
        this.navigator.geolocation.getCurrentPosition(function(position) {
            let lat = position.coords.latitude;
            let long = position.coords.longitude;
            let myLatLng = {lat: lat, lng: long};
           myarea.innerHTML = "found you!!!!!   Your latitude is:"+position.coords.latitude+" and longitude is:"+position.coords.longitude;

           var mapcanvas = document.createElement('div');  

            mapcanvas.id = 'mapcanvas';  

            mapcanvas.style.height = '400px';  

            mapcanvas.style.width = '560px'; 
            mapcanvas.style.border = '2px solid black';
            mapcanvas.style.margin = '25px auto';  

            myarea.appendChild(mapcanvas);    

            let map = new google.maps.Map(mapcanvas, {
                zoom: 15,
                center: myLatLng,
                mapTypeControl: false,  

                navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},  

                mapTypeId: google.maps.MapTypeId.SATELLITE 
            });

            let marker = new google.maps.Marker({
                position: myLatLng,
                map: map,
                title: 'You are here!'
            });
        });
    }




})