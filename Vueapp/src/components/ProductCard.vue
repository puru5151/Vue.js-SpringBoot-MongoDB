<template>
  
    <div class="col-lg-4 col-md-6 mb-4">
        <div class="card h-100 text-left">
          <img class="card-img-top" src="../assets/logo.png" alt="">
          <div class="card-body">
            <h4 class="card-title">{{product.productname}}</h4>
             <p class="card-text"> {{product.productdescription}} </p>
              <p class="card-text"> {{product.producttype}} </p>
            <p class="card-text"> {{product.productgender}} </p>
            <strong> {{product.productsize}}</strong>
          </div>
          <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
        </div>
    
</div>
</template>

<script>
export default {
    props: ["product"],
   
}
</script>

<style>

</style>