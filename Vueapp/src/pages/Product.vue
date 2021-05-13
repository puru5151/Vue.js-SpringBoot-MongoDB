<template>
   <div class="container">
           <div class = "row">
                <div class="col-5">

                    <div class="card mt-5">
                        <img class="card-img-top img-fluid w-100 h-40" src="../assets/logo.png" alt="">
                    </div>
                   </div>
                    <div class="col-7 mt-5" v-if="product">
                   
                        <h3 class="card-title">{{product.productname}}</h3>
                        <h4>{{product.producttype}}</h4>
                        <h4>{{product.productsize}}</h4>
                        <h4>{{product.productgender}}</h4>
                        <p class="card-text">{{product.productdescription}}</p>
                        <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
                        4.0 stars
                    
                            <hr>    
                            <div class="px-5 pb-3 m-auto">
                            <button type="button" name="" id="" class="btn btn-secondary btn-lg btn-block">Update</button>
                            
                            <button type="button" name="" id="" class="btn btn-danger btn-lg btn-block float-left">Delete</button>
                            </div>
                    </div>
                   
                </div>  

   </div>




   
    
</template>

<script>
export default {
    props:['id'],
    computed:{
    product(){
       return this.$store.state.product;
    }
    },
    mounted(){
        this.$store.dispatch('getProduct', this.id);
    }

}
</script>

<style>

</style>