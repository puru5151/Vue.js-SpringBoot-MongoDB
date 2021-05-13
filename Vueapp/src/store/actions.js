import axios from "axios";
export const getProducts = ({ commit }) => 
{
 axios.get('http://localhost:8080/api/products')
 .then(response => {
     commit('SET_PRODUCTS', response.data)
 })
}
export const getProduct = ({ commit, productID }) => {
    axios.get(`http://localhost:8080/api/product/${productID}`)
   .then(response => {
     commit('SET_PRODUCT', response.data)

 })

}




