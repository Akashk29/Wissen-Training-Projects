console.log("app.js is here")

//DOM 
let alertBox = document.querySelector('.alert-info');
let showBtn = document.querySelector('.btn-primary');
let hideBtn = document.querySelector('.btn-danger');
let greetBtn = document.querySelector('.btn-success');

showBtn.addEventListener('click', function (e) {
    alertBox.style.display = '';
});

hideBtn.addEventListener('click', function (e) {
    alertBox.style.display = 'none';

});
greetBtn.addEventListener('click', function (e) {
    alertBox.innerHTML = 'Greetings traveller!';
});

let startBtn = document.querySelector('#start')
let stopBtn = document.querySelector('#stop')

let image = document.getElementById('pov')

stopBtn.setAttribute('disabled' , true)

startBtn.addEventListener('click' , function(e){

  stopBtn.removeAttribute('disabled')
  let idx = 0

  let interval = setInterval(() => {

  idx++;
  image.scr = `./images/${idx}.jpg`
  if(idx === 5) idx = 0;
  },1000)

})

stopBtn.addEventListener('click' , function(e){
    clearInterval(interval);
})

let loadBtn = document.querySelector('.btn-dark')

loadBtn.addEventListener('click' , ()=>{

    let apiURL = "https://jsonplaceholder.typicode.com/todos?_limit=3";
    let promise = fetch(apiURL)

    promise.then((reponse)=>response.json())
           .then(todos => {

              document.querySelector('.jumbotron')
              .innerText = JSON.stringify(todos) 
           })


})
