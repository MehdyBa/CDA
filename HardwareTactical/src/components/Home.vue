<script>

</script>
<style>
   .container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100px; /* Ajustez la hauteur en fonction de vos besoins */
    }

    .center-image {
        width: 100px; /* Largeur souhaitée */
        height: 100px; /* Hauteur souhaitée */
    }

    .center-image img {
        max-width: 100%; /* Assurez-vous que l'image ne dépasse pas la largeur de la div */
        height: auto; /* Laissez la hauteur s'ajuster automatiquement pour maintenir les proportions de l'image */
    }
.carousel-item img {
  border-radius: 20px; /* Ajustez la valeur selon votre préférence */
}
.btn-category {
    height: 50px; /* Ajustez la hauteur selon vos préférences */
    display: flex;
    flex-direction: column;
    justify-content: center;
    text-align: center;
}
.white-text {
  color: white;
}
#carouselExampleRide {
    max-width: 50%; /* Réduire la largeur à 50% */
    margin: 0 auto; /* Centrer le carousel */
  }

  #carouselExampleRide .carousel-inner .carousel-item img {
    max-width: 100%; /* Ajuster la largeur de l'image à 100% du carousel */
    height: auto; /* Ajuster la hauteur de l'image automatiquement */
  }
</style>
<template>
 <div class="container-xl justify-content-center">
         <h1 id="h11" class="text-center">Hardware Tactical</h1>
         <div class="container">
    <div class="center-image">
        <img src="asset/Hardware Tactical.png" alt="Image centrée">
    </div>
</div>
<br>
         <div id="carouselExampleRide" class="carousel slide" data-bs-ride="true">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="asset/Carousel1.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
              <img src="asset/Carousel2.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
              <img src="asset/Carousel3.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
               <img src="asset/Carousel4.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel5.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel6.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel7.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel8.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel9.png" class="d-block w-100" alt="...">
             </div>
             <div class="carousel-item">
               <img src="asset/Carousel10.png" class="d-block w-100" alt="...">
             </div>
          </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleRide" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleRide" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
     <br>
     <br>
               <p name="PRESENTATION-TEXT" class="text-center"> <strong>
                Welcome to Hardware Tactical, your go-to destination for everything tactical. Whether you’re looking for sturdy backpacks, durable clothing or essential accessories for your adventures, you’ll find everything you need at Hardware Tactical.
                    <br>
                    <br>
                    As a registered member on our site, you can also enjoy our blog. Share your knowledge, experience and advice with other enthusiasts. Discuss outdoor survival techniques, exchange tips to optimize your equipment or explore the latest trends in tactical equipment.
                    <br>
                    <br>
                    Signing up for Hardware Tactical is fast and free. Join our online community today and enjoy an interactive space where you can learn, exchange and inspire each other.
                    <br>
                    <br>
                    At Hardware Tactical, every item you find on our site is designed to withstand the most demanding conditions and meet your specific needs.
                    <br>
                    <br>
                    Hardware Tactical is here to accompany you in all your tactical adventures, offering you the best products and an active community ready to share its expertise.
               </strong></p>
               <div class="row justify-content-center">
    <div class="card mx-3 my-3 col-4 col-md-2" style="width: 18rem;">
      <br>
        <img src="asset/backPack.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">Backpacks</h5>
            <p class="card-text">Carry your gear with ease with our durable and functional tactical backpacks. With spacious compartments and modular attachment systems, stay organized and ready for action.</p>
            <a class="btn btn-secondary btn-category">
            <RouterLink to="/Backpack" class="white-text">Backpacks</RouterLink>
            </a>
          </div>
    </div>
    <div class="card mx-3 my-3 col-4 col-md-2" style="width: 18rem;">
      <br>
        <img src="asset/vêtement.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">Outerwears</h5>
            <p class="card-text">Resistant and functional clothing, designed for professionals and lovers of tactical activities. Protect yourself with our jackets, pants, and vests with multiple pockets and sturdy closures.</p>
            <a class="btn btn-secondary btn-category">
            <RouterLink to="/Outerwear" class="white-text">Outerwears</RouterLink>
            </a>
          </div>
    </div>
    <div class="card mx-3 my-3 col-4 col-md-2" style="width: 18rem;">
      <br>
        <img src="asset/accessoire.jpg" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">Accessories</h5>
            <p class="card-text">Improve your performance with our top-quality tactical accessories such as powerful flashlights, tough gloves, and reliable compasses. Be ready to face all challenges.</p>
            <br>
            
            <a class="btn btn-secondary btn-category">
            <RouterLink to="/Accessory" class="white-text">Accessories</RouterLink>
            </a>
          </div>
    </div>
</div>
  </div>
</template>