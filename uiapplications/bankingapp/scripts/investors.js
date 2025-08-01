window.addEventListener('load', function() {

    let investors=this.document.querySelector('#investors');
    //creating ajax request to fetch investor data
    let xmlHttpRequest = new XMLHttpRequest();
    //ajax request to fetch data from a public API
    xmlHttpRequest.open('GET', 'https://jsonplaceholder.typicode.com/users', true);
    //request sent
    xmlHttpRequest.send();
    xmlHttpRequest.onreadystatechange = function() {    
        //checking if the request is complete and successful    
        if (xmlHttpRequest.readyState === 4 && xmlHttpRequest.status === 200) {
            //parsing the response text to JSON
            let response = JSON.parse(xmlHttpRequest.responseText);
            //dynamically creating a table to display the investor data
            let table = document.createElement('table');
            table.className = 'table table-striped';
            //creating table header
            table.style.width = '100%';
            let thead = document.createElement('thead');
            //creating header row
            let headerRow = document.createElement('tr');
            headerRow.innerHTML = `
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Website</th>
            `;
            
            thead.appendChild(headerRow);
            table.appendChild(thead);
            //creating table body
            response.forEach(function(investor) {
                //creating a row for each investor
                let row = document.createElement('tr');
                row.innerHTML = `
                    <td>${investor.id}</td>
                    <td>${investor.name}</td>
                    <td>${investor.email}</td>
                    <td>${investor.phone}</td>
                    <td>${investor.website}</td>
                `;
                table.appendChild(row);
            });
            //appending the table to the investors section

            investors.appendChild(table);   
        }
    };


})


