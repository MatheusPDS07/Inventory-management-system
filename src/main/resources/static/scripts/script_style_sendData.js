const list = document.querySelectorAll('.list');
const content = document.querySelector('.content');

    function activeLink(){
      list.forEach(item => item.classList.remove('active'));
      this.classList.add('active');
      content.querySelector('.' + this.querySelector('div').getAttribute('data-target')).style.display = 'block';

    }
    list.forEach(item =>
      item.addEventListener('click', activeLink))


const div12 = document.querySelector('.div-12');
const div22 = document.querySelector('.div-22');
const div32 = document.querySelector('.div-32');
const div42 = document.querySelector('.div-42');
const div52 = document.querySelector('.div-52');

const div1 = document.querySelector('#div-1');
const div2 = document.querySelector('#div-2');
const div3 = document.querySelector('#div-3');
const div4 = document.querySelector('#div-4');
const div5 = document.querySelector('#div-5');

const btn1 = document.querySelector('#create');
const btn2 = document.querySelector('#edit');
const btn3 = document.querySelector('#delete');
const btn4 = document.querySelector('#download');

const div_btn1 = document.querySelector('#div_create');
const div_btn2 = document.querySelector('#div_edit');
const div_btn3 = document.querySelector('#div_delete');

const btn_cancel_1 = document.querySelector('.btn_cancel-1');
const btn_cancel_2 = document.querySelector('.btn_cancel-2');
const btn_cancel_3 = document.querySelector('.btn_cancel-3');

btn1.addEventListener('click', () => {
       div_btn1.style.display = 'block';
       div_btn2.style.display = 'none';
       div_btn3.style.display = 'none';
});
btn2.addEventListener('click', () => {
       div_btn1.style.display = 'none';
       div_btn2.style.display = 'block';
       div_btn3.style.display = 'none';
});
btn3.addEventListener('click', () => {
       div_btn1.style.display = 'none';
       div_btn2.style.display = 'none';
       div_btn3.style.display = 'block';
});

div12.addEventListener('click', () => {
  div1.style.display = 'block';
  div2.style.display = 'none';
  div3.style.display = 'none';
  div4.style.display = 'none';
  div5.style.display = 'none';

  btn1.style.display = 'block';
  btn2.style.display = 'block';
  btn3.style.display = 'block';
  btn4.style.display = 'block';
});

div22.addEventListener('click', () => {
  div1.style.display = 'none';
  div2.style.display = 'block';
  div3.style.display = 'none';
  div4.style.display = 'none';
  div5.style.display = 'none';

  btn1.style.display = 'none';
  btn2.style.display = 'none';
  btn3.style.display = 'none';
  btn4.style.display = 'none';
});

div32.addEventListener('click', () => {
  div1.style.display = 'none';
  div2.style.display = 'none';
  div3.style.display = 'block';
  div4.style.display = 'none';
  div5.style.display = 'none';

  btn1.style.display = 'none';
  btn2.style.display = 'none';
  btn3.style.display = 'none';
  btn4.style.display = 'none';
});

div42.addEventListener('click', () => {
  div1.style.display = 'none';
  div2.style.display = 'none';
  div3.style.display = 'none';
  div4.style.display = 'block';
  div5.style.display = 'none';

  btn1.style.display = 'none';
  btn2.style.display = 'none';
  btn3.style.display = 'none';
  btn4.style.display = 'none';
});

div52.addEventListener('click', () => {
  div1.style.display = 'none';
  div2.style.display = 'none';
  div3.style.display = 'none';
  div4.style.display = 'none';
  div5.style.display = 'block';

  btn1.style.display = 'none';
  btn2.style.display = 'none';
  btn3.style.display = 'none';
  btn4.style.display = 'none';
});

btn_cancel_1.addEventListener('click', () => {
  div_btn1.style.display = 'none';
});

btn_cancel_2.addEventListener('click', () => {
  div_btn2.style.display = 'none';
});

btn_cancel_3.addEventListener('click', () => {
  div_btn3.style.display = 'none';
});