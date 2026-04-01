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

document.querySelectorAll('.chapter-accordion').forEach(details => {
  details.addEventListener('toggle', (e) => {
    const subNav = details.querySelector('.sub-nav');

    if (details.open) {
      subNav.style.animation = 'none';
      subNav.offsetHeight;
      subNav.style.animation = null;
    }
  });
});

document.addEventListener('DOMContentLoaded', (event) => {
    if (typeof Prism !== 'undefined') {
        Prism.highlightAll();
        console.log("Prism disparado com sucesso!");
    }
});
