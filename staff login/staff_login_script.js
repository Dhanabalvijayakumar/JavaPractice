
/* document.addEventListener("DOMContentLoaded", function () {
            const toggle = document.getElementById("togglePassword");
            const password = document.getElementById("password");

            toggle.addEventListener("click", function () {
                const type = password.getAttribute("type") === "password" ? "text" : "password";
                password.setAttribute("type", type);

                // Toggle eye icon
                this.classList.toggle("fa-eye");
                this.classList.toggle("fa-eye-slash");
            });
        }); */

    

        const staff = [
            { email: 'vdhanabal2003@gmail.com', password: 'dhi001' },
            { email: 'dhanabalmailbox@gmail.com', password: 'dhi002' },
            { email: 'abc@gmail.com', password: 'dhi003' }
        ];

        function login() {
            let email = document.getElementById("email").value.trim();
            let pass = document.getElementById("password").value.trim();
            let error = document.getElementById("error");

            const matchedStaff = staff.find(
                staff => staff.email === email && staff.password === pass
            );

            if (matchedStaff) {
                document.getElementById("email").value = "";
                document.getElementById("password").value = "";
                error.textContent = "";
                alert("Login successful");
                window.location.href = "../edit result/edit_result.html";
            }
            else {
                error.textContent = "Invalid credentials";
            }

            // if (email==='' || pas==='') {
            //     alert("Invalid");
            // }
        }

        function forgotPassword() {
            document.getElementById("form").style.display = "none";
            document.getElementById("resetSection").style.display = "block";
        }

        function resetPassword() {
            let email = document.getElementById("resetEmail").value.trim();
            let newPass = document.getElementById("newPassword").value.trim();
            let resetMsg = document.getElementById("resetMsg");

            let userIndex = staff.findIndex(user => user.email === email);

            if (userIndex !== -1) {
                staff[userIndex].password = newPass;
                resetMsg.textContent = "Password reset successful!";
            } else {
                resetMsg.textContent = "Email not found!";
                resetMsg.style.color = "red";
            }

            // Optional: Hide after success
            setTimeout(() => {
                document.getElementById("resetSection").style.display = "none";
                resetMsg.textContent = "";
                document.getElementById("form").style.display = "block";
            }, 3000);
        }
