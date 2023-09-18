<script>
export default {
    async mounted() {
        this.products = await this.get("products");
    },
    data() {
        return {
            products: []
        }
    },
    methods: {
        async get(endpoint) {
            const url = `http://localhost:8080/${endpoint}`;
            const response = await fetch(url);
            const header = response.headers;
            if (header.get("content-type") == "application/json") {
                return await response.json();
            }
            return null;
        }
    }
}
</script>

<template>
    <div class="container-xl">
        <h1 style="text-center">Products</h1>
        <div class="row justify-content-center">
            <div v-for="product in this.products" class="card mx-3 my-3 col-4 col-md-2">
                <img :src="product.imageURL" class="card-img-top" alt="...">
                <div class="card-body">
                    <a>
                        <RouterLink to="/product">
                            <h5 class="card-title">{{ product.brand }}</h5>
                        </RouterLink>
                    </a>
                    <p class="card-text">{{ product.model }}</p>
                    <p class="card-text">{{ product.price }}€</p>
                </div>
            </div>
        </div>
    </div>
</template>