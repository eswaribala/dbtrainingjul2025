window.addEventListener('load',()=>{
    //alert('Welcome to the Banking App!');

    let timerElement = document.querySelector('#timer');
   
   // timerElement.textContent = new Date().toLocaleTimeString('en-IN', { hour: '2-digit', minute: '2-digit', second: '2-digit' });
    setInterval(() => {        
        timerElement.textContent = new Date().toLocaleTimeString('en-IN', { hour: '2-digit', minute: '2-digit', second: '2-digit' });
    }, 1000);

    let options={month: 'long', day: 'numeric', year: 'numeric'};
    document.querySelector('#article1 h2').textContent = 'News' +' | '+ new Date().toLocaleDateString('en-IN', options);

     document.querySelector('#article2 h2').textContent = 'Media Release' +' | '+ new Date().toLocaleDateString('en-IN', options);
      document.querySelector('#article3 h2').textContent = 'Media Release' +' | '+ new Date().toLocaleDateString('en-IN', options);
     document.querySelector('#article4 h2').textContent = 'News' +' | '+ new Date().toLocaleDateString('en-IN', options);
    })