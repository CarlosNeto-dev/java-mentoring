/** ======================== Material Mobile Navbar ======================== */

const materialNavbarMobile = document.querySelector(".navbar");
const materialBarsMobileBtn = document.querySelector(".mobile-btn");

materialBarsMobileBtn.addEventListener("click", () => {
  materialNavbarMobile.classList.toggle("active");
  materialBarsMobileBtn.classList.toggle("active");
})
