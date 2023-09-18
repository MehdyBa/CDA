<template>
<header>
  <nav class="navbar navbar-expand-lg bg-body-tertiary" style="background: linear-gradient(90deg, rgb(62, 62, 62) 0%, rgb(144, 144, 144) 50%, rgb(62, 62, 62) 100%); height: 100px;">
    <div class="container">
      <RouterLink to="/">
        <a class="navbar-brand" style="max-height: 40px;">
          <img src="asset/ICON.png" style="max-height: 100%; width: auto;"> Hardware Tactical
        </a>
      </RouterLink>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-center">
        <ul class="navbar-nav">
          <li class="nav-item">
            <RouterLink to="/" class="nav-link-bg-bg">Home</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/Products" class="nav-link-bg-bg">Products</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/Create-Products" class="nav-link-bg-bg">Create-products</RouterLink>
          </li>
          <!-- <li class="nav-item">
            <RouterLink to="/Outerwear" class="nav-link-bg-bg">Outerwears</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/Accessory" class="nav-link-bg-bg">Accessories</RouterLink>
          </li> -->
          <li class="nav-item">
            <RouterLink to="/Blog" class="nav-link-bg-bg">FAQ</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/sign-in" class="nav-link-bg-bg">Sign In/Up</RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>

</template>

<style>
  .nav-item {
    margin-right: 10px; /* Ajoutez la marge de votre choix ici */
  }
  .nav-link.btn.btn-light {
    color: black; /* Couleur du texte en noir */
    border: none; /* Supprime la bordure */
    text-decoration: none; /* Supprime la soulignement du texte */
  }
  .white-text {
  color: white !important; /* !important is used to override any other styles */
  text-decoration: none; /* Optionally, remove underline on links */
}
.nav-link-bg-bg {
  color: white !important;
  text-decoration: none;
  background-color: #000000; /* Set your desired background color here */
  padding: 8px 16px; /* Adjust padding as needed */
  border-radius: 10px; /* Optionally, add rounded corners */
  margin: 4px; /* Optionally, add margin between links */
  display: inline-block; /* Display links as inline-block to control spacing */
}
</style>