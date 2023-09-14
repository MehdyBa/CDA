<template>

    <div class="container-xl">
        <h1 class="text-center">Create Products</h1>
        <form id="myForm">
            <div class="row">
            <div class="col-12 mb-3 col-md-6">
                <label for="name" class="form-label">Brand :</label>
                <input class="form-control" type="text" aria-label="default input example">
            </div>
            <div class="col-12 mb-3 col-md-6">
                <label for="name" class="form-label">Model :</label>
                <input class="form-control" type="text" aria-label="default input example">
            </div>
            </div>
            <div class="col-12 mb-3">
                <label for="description" class="form-label">Description :</label> 
                    <textarea class="form-control" id="description" name="description" rows="3" style="height: 100px"></textarea>
            </div>
            <div class="col-12 mb-3">
                <label for="imageURL" class="form-label">Image :</label>
                <input
          class="form-control form-control-lg"
          id="formFileLg"
          type="file"
          accept=".jpg, .gif, .png"
          ref="fileInput"
          @change="handleFileChange"
                                     />
            </div>
            <div class="row">
                <div class="col-12 mb-3 col-md-4">
                    <label for="sizeId" class="form-label">Size :</label>
                    <select class="form-select" id="sizeId" aria-label="Default select example">
                         <option selected>Choose Size Product</option>
                         <option value="1">S</option>
                         <option value="2">M</option>
                         <option value="3">L</option>
                    </select>
                </div>
                <div class="col-12 mb-3 col-md-4">
                    <label id="categoryId" for="categoryId" class="form-label">Category
                        :</label>
                        <select class="form-select" aria-label="Default select example">
                         <option selected>Choose Category Product</option>
                         <option value="1">Backpacks</option>
                         <option value="2">Outerwears</option>
                         <option value="3">Accessories</option>
                    </select>
                    </div>
                <div class="col-12 mb-3 col-md-4">
                    <div>
                        <label for="price" class="form-label">Price :</label>
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">€</span>
                        <input type="number" id="price" name="price" class="form-control" step="0.01">
                    </div>
                </div>
            </div>
            <div class="d-md-flex justify-content-md-end">
                <button class="btn btn-primary col-12 col-md-3 justify-content-md-end" type="submit"
                    id="Create product">Create</button>
            </div>
            <br>
        </form>
    </div>
    <Toast></Toast>
</template>
<style>
    .is-invalid {
        border-color: red;
    }

    .is-valid {
        border-color: green;
    }

    .error-message {
        color: red;
        font-size: 12px;
    }
</style>

<script>
document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("myForm");

    form.addEventListener("submit", function (event) {
        event.preventDefault();

        const brand = document.querySelector('input[aria-label="default input example"]');
        const model = document.querySelector('input[aria-label="default input example"]');
        const description = document.getElementById("description");
        const sizeId = document.getElementById("sizeId");
        const categoryId = document.getElementById("categoryId");
        const price = document.getElementById("price");
        const imageInput = document.getElementById("formFileLg");

        // Réinitialisez les classes d'erreur et de succès pour chaque champ
        brand.classList.remove("is-invalid", "is-valid");
        model.classList.remove("is-invalid", "is-valid");
        description.classList.remove("is-invalid", "is-valid");
        sizeId.classList.remove("is-invalid", "is-valid");
        categoryId.classList.remove("is-invalid", "is-valid");
        price.classList.remove("is-invalid", "is-valid");
        imageInput.classList.remove("is-invalid", "is-valid");

        // Réinitialisez les messages d'erreur précédents
        const errorMessages = document.querySelectorAll(".error-message");
        errorMessages.forEach((errorMessage) => errorMessage.remove());

        // Validation du champ "Brand"
        if (brand.value.trim() === "") {
            brand.classList.add("is-invalid");
            createErrorMessage(brand, "Please enter a brand.");
        } else {
            brand.classList.add("is-valid");
        }

        // Validation du champ "Model"
        if (model.value.trim() === "") {
            model.classList.add("is-invalid");
            createErrorMessage(model, "Please enter a model.");
        } else {
            model.classList.add("is-valid");
        }

        // Validation du champ "Description"
        if (description.value.trim() === "") {
            description.classList.add("is-invalid");
            createErrorMessage(description, "Please enter a description.");
        } else {
            description.classList.add("is-valid");
        }

        // Validation du champ "Size"
        if (sizeId.value === "Choose Size Product") {
            sizeId.classList.add("is-invalid");
            createErrorMessage(sizeId, "Please choose a size.");
        } else {
            sizeId.classList.add("is-valid");
        }

        // Validation du champ "Category"
        if (categoryId.value === "Choose Category Product") {
            categoryId.classList.add("is-invalid");
            createErrorMessage(categoryId, "Please choose a category.");
        } else {
            categoryId.classList.add("is-valid");
        }

        // Validation du champ "Price"
        if (price.value.trim() === "") {
            price.classList.add("is-invalid");
            createErrorMessage(price, "Please enter a price.");
        } else {
            price.classList.add("is-valid");
        }
// Validation du champ "Image"
        if (imageInput.files.length > 0) {
            const imageFile = imageInput.files[0];
            const allowedExtensions = ["jpg", "png", "gif"];
            const maxSize = 1048576; // 1 Mo en octets

            if (!allowedExtensions.includes(imageFile.name.split('.').pop().toLowerCase())) {
                imageInput.classList.add("is-invalid");
                createErrorMessage(imageInput, "Invalid file format. Please choose a JPG, PNG, or GIF file.");
            } else if (imageFile.size > maxSize) {
                imageInput.classList.add("is-invalid");
                createErrorMessage(imageInput, "File size exceeds 1 MB.");
            } else {
                imageInput.classList.add("is-valid");
            }
        }

        // Si des erreurs sont présentes, n'envoyez pas le formulaire
        if (form.querySelectorAll(".is-invalid").length > 0) {
            return;
        }

        // Si tout est valide, vous pouvez soumettre le formulaire
        form.submit();
    });

    // Fonction pour créer et afficher un message d'erreur
    function createErrorMessage(element, message) {
        const errorMessage = document.createElement("div");
        errorMessage.classList.add("error-message");
        errorMessage.textContent = message;
        element.parentNode.appendChild(errorMessage);
    }
});
</script>