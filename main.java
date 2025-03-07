// Get the menu icon and navbar elements from the DOM (Document Object Model)
let menu = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');







// Add a click event listener to the menu icon
menu.onclick = () => {
  // When the menu icon is clicked, toggle the bx-x class to change its appearance 
  // for example switching from a menu icon to a close icon
  menu.classList.toggle('bx-x');
  
  // Also toggle the 'active' class on the navbar to show or hide the navigation menu
  navbar.classList.toggle('active');
}







// Add a scroll event listener to the window
window.onscroll = () => {
  // When the user scrolls remove the 'bx-x' class from the menu icon
  // and hide the navbar by removing the 'active' class
  menu.classList.remove('bx-x');
  navbar.classList.remove('active');
}









// Typing text animation using the Typed.js library
const typed = new Typed('.multiple-text', {
  // Define the array of strings that will be typed out, one after the other
  strings: ['Physical Fitness', 'Weight Gain', 'Strength Training', 'Fat Loss', 'Weight Lifting', 'Running'],
  
  // Set the speed at which each character is typed (in milliseconds)
  typeSpeed: 60,
  
  // Set the speed at which the text is erased (in milliseconds)
  backSpeed: 60,
  
  // Add a delay before starting to erase the text (in milliseconds)
  backDelay: 1000,
  
  // Make the animation loop forever, so the text keeps cycling
  loop: true,
});
