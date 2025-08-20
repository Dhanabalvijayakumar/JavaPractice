/* window.onload = function () {
            document.getElementById("choose").selectedIndex = 0; // Reset to "select"
        } */

        function route() {
            let btn = document.getElementById("btn1");
            let select = document.getElementById("choose");
            if (select.value == "Staff") {
                if (confirm('Continue as staff?')) {
                    document.getElementById("spinner").style.display = "block";
                    setTimeout(() => {
                        window.open("../staff login/staff login.html", "_blank");
                    }, 1000);
                }
            }
            else if (select.value == "Student") {
                if (confirm('Continue as student?')) {
                    document.getElementById("spinner").style.display = "block";
                    setTimeout(() => {
                        window.open("../student login/student login.html", "_blank");
                    }, 1000);
                }
            }
            else {
                alert("Please choose your designation !!!")
            }
        }

        function toggleTheme() {
            const body = document.body;
            const btnIcon = document.querySelector("#themeToggle i");

            body.classList.toggle("dark");

            // Toggle icon
            if (body.classList.contains("dark")) {
                btnIcon.classList.remove("fa-moon");
                btnIcon.classList.add("fa-sun");
            } else {
                btnIcon.classList.remove("fa-sun");
                btnIcon.classList.add("fa-moon");
            }
        }
