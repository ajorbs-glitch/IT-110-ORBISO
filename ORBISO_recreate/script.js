const likeBtn = document.querySelector("#likeBtn");
const resetBtn = document.querySelector("#resetBtn");
const likeCount = document.querySelector("#likeCount");
const darkMode = document.querySelector("#darkMode");

let likes = 0;

likeBtn.addEventListener("click", function() {
    likes++;
    likeCount.textContent = likes;
});

resetBtn.addEventListener("click", function() {
    likes = 0;
    likeCount.textContent = likes;
});

darkMode.addEventListener("change", function() {
    document.body.classList.toggle("dark", darkMode.checked);
});

const links = document.querySelectorAll(".tab-link");
const pages = document.querySelectorAll(".page");

links.forEach(function(link) {
    link.addEventListener("click", function() {
        links.forEach(function(item) {
            item.classList.remove("active");
        });

        link.classList.add("active");

        pages.forEach(function(page) {
            page.hidden = true;
        });

        document.querySelector(link.getAttribute("href")).hidden = false;
    });
});
