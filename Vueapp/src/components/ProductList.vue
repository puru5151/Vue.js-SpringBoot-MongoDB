<template>
    <div class = "container">
        <div class = "row pt-3">
           
            <product-card v-for="product in products" :key ="product.id" :product="product"/>
            
        </div>
    </div>
</template>

<script>
import ProductCard from './ProductCard.vue'
export default {
  components: { ProductCard },
  computed:{
  products(){
      return this.$store.state.products;
  }
  },
mounted(){
    this.$store.dispatch('getProducts');
}
}
</script>

<style>

</style>