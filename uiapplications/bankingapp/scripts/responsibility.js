window.addEventListener('load', function() {


    const form = document.getElementById('responsibility-form');
    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent the default form submission

        // Collect form data
        const formData = new FormData(form);
        const data = Object.fromEntries(formData.entries());

        // Log the data to the console (or handle it as needed)
        console.log('Form submitted:', data);

        // Optionally, you can send this data to a server or process it further

        let xmlHttpRequest = new XMLHttpRequest();
        xmlHttpRequest.open('POST', 'https://postman-echo.com/post', true);
        xmlHttpRequest.setRequestHeader('Content-Type', 'application/json');
        xmlHttpRequest.onreadystatechange = function() {
            if (xmlHttpRequest.readyState === XMLHttpRequest.DONE) {
                if (xmlHttpRequest.status === 200) {
                    alert('Response from server:', xmlHttpRequest.responseText);
                } else {
                    console.error('Error occurred:', xmlHttpRequest.statusText);
                }
            }
        };
        xmlHttpRequest.send(JSON.stringify(data));

    });

});