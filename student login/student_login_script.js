 function login(event) {
            event.preventDefault();

           let rollNo = document.getElementById("rollNo").value;
           let dept = document.getElementById("dept").value;
           let error = document.getElementById("error");

           const data = JSON.parse(localStorage.getItem("student_data")) || [];
           const matchedStudent = data.find(st => st.rollNo === rollNo && st.department === dept);

            if (matchedStudent) {
                document.getElementById("rollNo").value = "";
                document.getElementById("dept").value = "";

                localStorage.setItem("current_student", JSON.stringify(matchedStudent));

                error.textContent = "";
                alert("Login successful");
                window.location.href = "../result/result.html";
            }
            else if (rollNo === '' || dept === '') {
                error.textContent = "";
            }
            else {
                error.textContent = "Student not found";
            }

        }