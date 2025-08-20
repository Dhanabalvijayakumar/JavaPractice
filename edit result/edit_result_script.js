window.onload = function() {
            document.getElementById("form").addEventListener("submit", edit_result);
        }
        
        function edit_result(e) {
            e.preventDefault();

            const data = new FormData(e.target);
            const details = {
                    name: data.get("name"),
                    rollNo: data.get("rollNo"),
                    department: data.get("dept"),
                    english: data.get("english"),
                    maths: data.get("maths"),
                    physics: data.get("physics"),
                    chemistry: data.get("chemistry"),
                    engineering_graphics: data.get("eg")
                };

            const student_data = JSON.parse(localStorage.getItem("student_data")) || [];
            const index = student_data.findIndex(s => s.rollNo === details.rollNo && s.department === details.department);

            if (index > -1) {
                student_data[index] = details;
            }
            else {
                student_data.push(details);
            }

            localStorage.setItem("student_data", JSON.stringify(student_data));
            alert("Result saved");
            e.target.reset();

        }


        function delete_result() {
            let rollNo = document.getElementById("rollNo").value;
           let dept = document.getElementById("dept").value;
           
           if (!rollNo || !dept) {
            alert("please enter roll no. and department to delete record");
           }
           
           let student_data = JSON.parse(localStorage.getItem("student_data")) || [];
           let index = student_data.findIndex(s => s.rollNo === rollNo && s.department === dept);

           if (index > -1) {
            let confirm_delete = confirm("Are you sure to delete the student record?");
            if (confirm_delete) {
                student_data.splice(index, 1);
                localStorage.setItem("student_data", JSON.stringify(student_data));
                alert("Student deleted successfully");
                document.getElementById("form").reset();
            }
           }
           else {
            alert("student record not found");
            document.getElementById("form").reset();
           }
         }
