const result = JSON.parse(localStorage.getItem("current_student")) || [];

        let english = +result.english;
        let maths = +result.maths;
        let physics = +result.physics;
        let chemistry = +result.chemistry;
        let engineering_graphics = +result.engineering_graphics;


        document.addEventListener("DOMContentLoaded", () => {

            document.querySelector(".header h3").textContent = `Progress Report of ${result.name}`;

            const cells = document.querySelectorAll(".details table td");
            cells[1].textContent = result.rollNo;
            cells[3].textContent = result.name;
            cells[5].textContent = result.department;
        })


        function getGrade(mark) {
            if (mark >= 95) return "O";
            else if (mark >= 90) return "A+";
            else if (mark >= 80) return "A";
            else if (mark >= 70) return "B+";
            else if (mark >= 60) return "B";
            else if (mark >= 50) return "C+";
            else if (mark >= 40) return "C";
            else return "U";
        }



        function report() {
            if (!result) {
                alert("Result data not found");
            }
            else {

                document.querySelector(".result-popup").style.display = "flex";

                document.querySelector(".result h3").textContent = `Academic performance of ${result.name}`;

                const markCells = document.querySelectorAll(".result table tr");
                markCells[1].children[1].textContent = result.english;
                markCells[2].children[1].textContent = result.maths;
                markCells[3].children[1].textContent = result.physics;
                markCells[4].children[1].textContent = result.chemistry;
                markCells[5].children[1].textContent = result.engineering_graphics;



                markCells[1].children[2].textContent = getGrade(english);
                markCells[2].children[2].textContent = getGrade(maths);
                markCells[3].children[2].textContent = getGrade(physics);
                markCells[4].children[2].textContent = getGrade(chemistry);
                markCells[5].children[2].textContent = getGrade(engineering_graphics);


                let total = english + maths + physics + chemistry + engineering_graphics;
                let percentage = (total / 500) * 100;

                let status = (percentage >= 40 && english >= 40 && maths >= 40 && physics >= 40 && chemistry >= 40 && engineering_graphics >= 40) ? "PASS" : "FAIL";

                markCells[6].children[1].textContent = status;
                markCells[7].children[1].textContent = total;
                markCells[8].children[1].textContent = percentage.toFixed(2);


            }

        }


        function close_popup() {
            document.querySelector(".result-popup").style.display = "none";
        }