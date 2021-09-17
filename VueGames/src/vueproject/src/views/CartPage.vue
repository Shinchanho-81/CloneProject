<template>
  <main>
    <div style="padding-top: 30px; color: white">
      <div class="back-btn">
        <div style="margin-bottom: 10px; cursor:pointer" @click="mainPage" ><img src="../assets/img/gaming_icon.png" alt=""></div>
          <button type="button" @click="mainPage" class="backbtn-item">스토어로 돌아가기</button>
      </div>
      <div>
        <div class="cart_item" v-for="cartItem in cartItems" v-bind:key="cartItem.productId">
          <ul>
            <li style="float: left; padding:11px 15px 0px 0px;"><img :src="require(`@/assets/img/${cartItem.cartImg}`)" alt="" width="88px" height="55px" style="border-radius: 6px;"></li>
            <li style="float: left; padding-top:26px">{{ cartItem.productName }}</li>
            <span class="cart-delete-btn" @click="cart_delete(cartItem.productId)">ㅡ</span>        
            <li style="float: right; padding: 26px 30px 0px 0px">₩{{ change_comma(cartItem.productPrice * cartItem.cartCount) }}</li>
            <li style="float: right; padding: 26px 15px 0px 0px; text-decoration:line-through; color: gray">₩{{ cartItem.productFirstCost * cartItem.cartCount }}</li>
            <li style="float: right; margin-top:26px" class="sale-show-item">{{ cartItem.productDiscount }}</li>
            <li style="float: right; margin: 27px; 60px;">{{ cartItem.cartCount }} (Qty)</li>
          </ul>
        </div>
        <div style="margin-top: 50px;">
          <span>총 가격 : ₩{{ change_comma(this.totalPrice) }}</span>
          <div class="buy-cartBtn">구매하기</div>
        </div>
      </div>
    </div>
    </main>
</template>

<script>
export default {
  data() {
    return {
      cartItems: [],
      totalPrice: 0
    }
  },
  methods: {
    change_comma(value) {
        return value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
    },
    mainPage() {
      this.$router.push({ name: 'Main' })
    },
    cart_delete(productId) {
      let obj = this;


      obj.$axios.get("http://localhost:9010/vue/cartQty", {
        params: {
          productId : productId
        }
      })
      .then(response => {
          if(response.data > 1) {
            obj.$axios.put("http://localhost:9010/vue/MinusCartItem", null, {
              params: {
                productId : productId
              }
            })
            .then(() =>{
              obj.$router.go()
            })
            .catch(error => {console.error(error);})
          }
          else {
            obj.$axios.delete("http://localhost:9010/vue/axiosCartDelete" , {
              params: {productId: productId}
            })
            .then(response => {
              console.log(response);
              obj.$router.go();
            })
            .catch(error => {console.error(error);})
          }
      })
      .catch(error => {
        console.error(error);
      })
    }
  },
  mounted(){
    let obj = this;

    obj.$axios.get("http://localhost:9010/vue/axiosCartList")
    .then(res => {
      console.log("성공");
      console.log(res)
      obj.cartItems = res.data
    })
    .catch(error => {
      console.error(error);
    })

    obj.$axios.get("http://localhost:9010/vue/getCartTotalPrice" , {

    })
    .then(response => {
      obj.totalPrice = response.data
    }).catch(error => {console.log(error)});

    // obj.$axios.get("http://localhost:9010/vue/PlusItemPrice", {
    //   params: { productId : obj.productId }
    // }).then(response => {
    //   console.log('id ' + obj.productId)
    //   obj.productPrice = response.data
    // }).catch(error => {console.error(error)});
  }
}
</script>

<style scoped>

  main {
    background: #1C1C1C;
    height: 100%;
    padding-bottom: 45vh;
  }

  .back-btn {
    border-bottom: 1px solid rgba(255, 255, 255, 0.1);
    padding-bottom: 20px;
    margin-bottom: 50px;
  }

  .backbtn-item {
    border: none;
    background: #1C1C1C;
    color: white;
    font-weight: bold;
  }
  
  .cart_item {
    background-color: #2a2a2a;
    height: 80px;
    margin-top: 5px;
    width: 80%;
    text-align: center;
    margin-left: 10%;
    border-radius: 5px;
    cursor: pointer;
  }
  .cart_item:hover {
    background-color: rgb(0, 116, 228);
  }

  .cart-delete-btn {
    float: right; 
    padding: 28px 40px 28px 40px;
  }
  
  .cart-delete-btn:hover {
    background-color: #1A82E7;
    color: white;
    border-radius: 5px;
  }

  .buy-cartBtn {
    background-color: rgb(0,116,228);
    margin-top: 50px;
    padding: 15px 10px 15px 10px;
    width: 30%;
    margin-left: 35%;
    border: none;
    border-radius: 5px;
    color: white;
    font-weight: bold;
  }
</style>