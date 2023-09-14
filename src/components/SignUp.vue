<style>
        * {
            box-sizing: border-box;
        }

        .row {
            display: flex;
        }

        .column {
            flex: 50%;
            padding: 10px;
            height: 600px;
        }
    </style>

<template>
        <div class="container-xxl justify-content-center">
        <div class="row justify-content-center">
            <div class="column" style="background-color:clear;">
                <br>
                <h2 class="text-center">Sign Up</h2>
                <br>
                <form id="signupForm">
                    <label for="name" class="form-label">Last Name :</label>
                    <input class="form-control" id="name" type="text" placeholder="Last Name" aria-label="Nom" required>
                    <span class="error-message" id="nameError"></span>
                    <br>
                    <label for="lastName" class="form-label">Name :</label>
                    <input class="form-control" id="lastName" type="text" placeholder="Name" aria-label="Prénom"
                        required>
                    <span class="error-message" id="lastNameError"></span>
                    <br>
                    <label for="email" class="form-label">Email :</label>
                    <input class="form-control" type="email" id="email" placeholder="Email"
                        aria-label="Enter your mail addresses" required>
                    <span class="error-message" id="emailError"></span>
                    <br>
                    <label for="inputPassword5" class="form-label">Password :</label>
                    <input type="password" id="inputPassword5" placeholder="Password" class="form-control"
                        aria-labelledby="passwordHelpBlock" required>
                    <span class="error-message" id="passwordError"></span>
                    <br>
                    <label for="inputPassword6" class="form-label">Repeat Password :</label>
                    <input type="password" id="inputPassword6" placeholder="Repeat Password" class="form-control"
                        aria-labelledby="passwordHelpBlock" required>
                    <span class="error-message" id="confirmPasswordError"></span>
                    <br>
                    <div class="text-center">
                    <button type="submit" class="btn btn-light custom-button">Sign Up</button>
                </div>
                </form>
            </div>
            <div class="column" style="background-color:clear;">
                <br>
                <br>
              <p>
                <strong>
                    Our registration process is quick and easy. Fill in the information requested below to create your account:
                <br>
                <br>
                1. Email address: Provide a valid email address. It is through this address that we will communicate with you and send you important information.
                <br>
                <br>
                2. Password: You must choose a secure password to protect your account. It must contain at least 8 characters and not exceed 40 characters, at least one uppercase and lowercase letter [a-A], at least one digit [0,1, 2,3, etc.] and at least one special character [~,@,#,_, ,*,%,/,. ,+,: ,; ,=°].<br>
                <br>
                3. Password confirmation: Enter your password again to confirm the one chosen.
                <br>
                <br>
                Once you have filled in this information, you can click on the "Register" button to create your account. Please note that you must agree to our Terms of Service and Privacy Policy in order to proceed with registration.
                <br>
                <br>
                After creating your account, you will be able to access our services and enjoy all the benefits reserved for registered members.
                <br>
                <br>
                If you have any questions or encounter any issues during the registration process, please do not hesitate to contact our support team at the email address provided below. We would be delighted to help you ! Thank you for joining our community and enjoy your experience with us !
              </strong> </p>
            </div>
        </div>
    </div>
    <br>
    <br>
</template>

<script>
        // Function to show the tooltip
        function showTooltip(element, message) {
            var tooltip = new bootstrap.Tooltip(element, {
                title: message,
                placement: 'top',
                trigger: 'manual'
            });
            tooltip.show();
        }

        // Function to hide the tooltip
        function hideTooltip(element) {
            var tooltip = bootstrap.Tooltip.getInstance(element);
            if (tooltip) {
                tooltip.dispose();
            }
        }

        // Function to validate the form
        function validateForm(event) {
            event.preventDefault();
            var nameInput = document.getElementById('name');
            var lastNameInput = document.getElementById('lastName');
            var emailInput = document.getElementById('email');
            var passwordInput = document.getElementById('inputPassword5');
            var confirmPasswordInput = document.getElementById('inputPassword6');

            // Validation checks
            if (nameInput.value.trim() === '') {
                showTooltip(nameInput, 'Le nom ne peut pas être vide.');
                nameInput.style.borderColor = 'red';
            } else {
                hideTooltip(nameInput);
                nameInput.style.borderColor = '';
            }

            if (lastNameInput.value.trim() === '') {
                showTooltip(lastNameInput, 'Le prénom ne peut pas être vide.');
                lastNameInput.style.borderColor = 'red';
            } else {
                hideTooltip(lastNameInput);
                lastNameInput.style.borderColor = '';
            }

            if (emailInput.value.trim() === '' || !isValidEmail(emailInput.value)) {
                showTooltip(emailInput, 'Veuillez saisir une adresse e-mail valide.');
                emailInput.style.borderColor = 'red';
            } else {
                hideTooltip(emailInput);
                emailInput.style.borderColor = '';
            }

            if (passwordInput.value.trim() === '') {
                showTooltip(passwordInput, 'Le mot de passe ne peut pas être vide.');
                passwordInput.style.borderColor = 'red';
            } else {
                hideTooltip(passwordInput);
                passwordInput.style.borderColor = '';
            }

            if (confirmPasswordInput.value.trim() === '' || confirmPasswordInput.value !== passwordInput.value) {
                showTooltip(confirmPasswordInput, 'Les mots de passe ne correspondent pas.');
                confirmPasswordInput.style.borderColor = 'red';
            } else {
                hideTooltip(confirmPasswordInput);
                confirmPasswordInput.style.borderColor = '';
            }
        }

        // Function to check if the email is valid
        function isValidEmail(email) {
          
            return email.includes('@') && email.includes('.');
        }

        // Attach form validation on submit
        // document.getElementById('signupForm').addEventListener('submit', validateForm);
    </script>