/** ======================== Home Mobile Navbar ======================== */

const navbarMobile = document.querySelector(".navbar-mobile");
const barsMobileBtn = document.querySelector(".mobile-menu-button");
const body = document.querySelector("body");

barsMobileBtn.addEventListener("click", () => {
  navbarMobile.classList.toggle("active");
  barsMobileBtn.classList.toggle("active");
  body.classList.toggle("no-scroll");
})
