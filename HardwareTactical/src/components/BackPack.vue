<template>
    <div class="container-xl justify-content-center">
         <h1 class="text-center">Hardware Tactical</h1>
         <h3 class="text-center">Backpacks</h3>
      <div class="row justify-content-center">
        <div class="card" style="width: 18rem;">
          <div class="form-check">
      <input class="form-check-input" type="checkbox" v-model="isChecked" id="flexCheckDefault">
      <label class="form-check-label" for="flexCheckDefault">
        <i v-if="isChecked" class="fas fa-star"></i> <!-- Affiche l'étoile si la case est cochée -->
        <i v-else class="far fa-star"></i> <!-- Affiche une étoile vide si la case n'est pas cochée -->
      </label>
    </div>

          <br>
          <img src="asset/pexels-deybson-mallony-9448166.jpg" class="card-img-center" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
            </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-erik-mclean-16359253.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-erik-mclean-16359256.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-gül-işık-2452345.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-jonathan-borba-3155047.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>   
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-matheus-bertelli-2905238.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-wendy-wei-2994100.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
        <div class="card" style="width: 18rem;">
          <br>
          <img src="asset/pexels-deybson-mallony-9448166.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <p class="card-text">Brand :</p>
            <p class="card-text">Model :</p>
            <p class="card-text">Price :</p>
          </div>
        </div>
    </div>
  </div>
</template>

<style>
  .card {
    margin-bottom: 20px; /* Ajoute une marge en bas de chaque carte */
    margin-left: 10px;
    margin-right: 10px;
  }
</style>

<script>
// Importez la bibliothèque Font Awesome
import '@fortawesome/fontawesome-free/css/all.css';

export default {
  name: 'VotreComposant',
  data() {
    return {
      isChecked: false, // Initialisez l'état de la case à cocher comme non cochée
    };
  },
};
</script>