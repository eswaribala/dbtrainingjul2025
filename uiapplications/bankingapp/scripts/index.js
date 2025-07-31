window.addEventListener('load',()=>{
    //alert('Welcome to the Banking App!');
    let options={month: 'long', day: 'numeric', year: 'numeric'};
    document.querySelector('#article1 h2').textContent = 'News' +' | '+ new Date().toLocaleDateString('en-US', options);

     document.querySelector('#article2 h2').textContent = 'Media Release' +' | '+ new Date().toLocaleDateString('en-US', options);
      document.querySelector('#article3 h2').textContent = 'Media Release' +' | '+ new Date().toLocaleDateString('en-US', options);
     document.querySelector('#article4 h2').textContent = 'News' +' | '+ new Date().toLocaleDateString('en-US', options);
    })