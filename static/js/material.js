/** ======================== Material Mobile Navbar ======================== */

const materialNavbarMobile = document.querySelector(".navbar");
const materialBarsMobileBtn = document.querySelector(".mobile-btn");
const arrowIcon = document.querySelectorAll(".arrow-icon");

materialBarsMobileBtn.addEventListener("click", () => {
  materialNavbarMobile.classList.toggle("active");
  materialBarsMobileBtn.classList.toggle("active");
})

arrowIcon.forEach((icon) => {
  icon.addEventListener("click", () => {
    icon.classList.toggle("active");
  });
});
