<template>
<main>
  <div style="padding-top: 30px; color: white">
    <div class="back-btn">
        <div style="margin-bottom: 10px; cursor:pointer" @click="mainPage" ><img src="../assets/img/gaming_icon.png" alt=""></div>
        <button type="button" @click="mainPage" class="backbtn-item">스토어로 돌아가기</button>
      </div>
    <div class="container-fluid">    
      <div class="title">
        <p>{{ productName }}</p>
      </div>
      <div class="title-img">
        <div style="width: 100%">
          <img :src="require(`@/assets/img/${detailImg}`)" alt="" width="100%" style="border-radius: 8px;">
        </div>
      </div>
      <div class="side-bar">
        <div>
          <img :src="require(`@/assets/img/${detailIcon}`)" alt="" width="230px" height="190px">
          <div style="width: 100%; height: 10px; margin-bottom: 20px"></div>
          <div class="product-discount">
            <span>{{ productDiscount }}</span>
          </div>
          <div style="text-align: left">
            <span class="product-price-contents" style="text-decoration:line-through; color: gray">₩{{ change_comma(productPrice) }}</span>
            <span class="product-price-contents">₩{{ change_comma(productPrice) }}</span>
          </div>
          <div style="margin-top: 10px; text-align: left;">
            <p style="font-size: 12px; font-weight: bold;">{{ detailReleaseDate + '할인 종료' }}</p>
          </div>
          <div>
            <button type="button" class="buybtn-contents">지금 구매</button>
          </div>
          <div  @click="moveCart" style="width: 300px; margin-bottom: 20px" class="cart_btn-style">
            <button type="button" class="cartbtn-contents">
              <img src="../assets/img/carticon.png"  alt="">위시리스트에 추가</button>
          </div>
          <div style="padding: 40px 0px 40px; border-bottom: 1px solid gray">
            <span class="Developer-contents1">개발사</span>
            <span class="Developer-contents2">{{ detailDeveloper }}</span>
          </div>
          <div style="padding: 5px 0px 40px; border-bottom: 1px solid gray">
            <span class="Developer-contents1">퍼블리셔</span>
            <span class="Developer-contents2">{{ detailDeveloper }}</span>
          </div>
          <div style="padding: 5px 0px 40px; border-bottom: 1px solid gray">
            <span class="Developer-contents1">출시일</span>
            <span class="Developer-contents2">{{ detailReleaseDate }}</span>
          </div>
          <div style="padding: 5px 0px 40px; border-bottom: 1px solid gray">
            <span class="Developer-contents1">플랫폼</span>
            <span class="Developer-contents2"><img src="../assets/img/windows.png" alt=""></span>
          </div>
        </div>
      </div>
      <div class="game-contents">
        <p style="padding-bottom: 30px;">{{ detailText }}</p>
        <div style="float: left;">
          <span class="game-contents-item" style="border-left: 1px solid rgba(255, 255, 255, 0.1);">장르</span>
          <br>
          <span class="game-contents-item">{{ detailGenre }}</span>
        </div>
        <div>
          <span class="game-contents-item" style="border-left: 1px solid rgba(255, 255, 255, 0.1);">기능</span>
          <br>
          <span class="game-contents-item">{{ detailFunction }}</span>
        </div>
        <div style="margin-top: 80px;">
          <p style="color: gray">{{ detailText2 }}</p>
        </div>
        <div>
          <p style="color: gray">{{ detailText3 }}</p>
        </div>
      </div>
      <div class="follow">
        <div>
          <h5 style="text-align: left">팔로우</h5>
        </div>
        <div class="follow-contetns">
          <img src="../assets/img/followicon1.png" alt="" class="follow-icon">
          <img src="../assets/img/followicon2.png" alt="" class="follow-icon">
        </div>
      </div>
      <div class="contents-spec">
        <div>
          <h5 style="text-align: left">사양</h5>
        </div>
        <div class="spec-contents-div">
          <div style="padding-top: 20px; border-bottom: 1px solid gray">
            <p style="text-align: left; font-size: 12px; font-weight: bold;">WINDOWS</p>
          </div>
          <div style="text-align: left; margin-top: 30px;">
            <p style="font-size: 13px; color: gray">권장</p>
            <span class="spec-text">운영체제 버전</span>
            <p class="spec-text1">{{ operatingSystem }}</p>
            <span class="spec-text">CPU</span>
            <p class="spec-text1">{{ processor }}</p>
            <span class="spec-text">메모리</span>
            <p class="spec-text1">{{ memory }}</p>
            <span class="spec-text">GPU</span>
            <p class="spec-text1">{{ graphics }}</p>
            <span class="spec-text">DirectX</span>
            <p class="spec-text1">{{ directX }}</p>
            <span class="spec-text">스토리지</span>
            <p class="spec-text1">{{ storage }}</p>
            <span class="spec-text">추가 입력 장치</span>
            <p class="spec-text1">{{ etc }}</p>
            <span class="spec-text">지원 언어</span>
            <p class="spec-text1">{{ language }}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</main>
</template>

<script>
export default {
  data() {
    return {
      productId: 0,
      productName: undefined,
      productDiscount: undefined,
      productFirstCost: undefined,
      productPrice: undefined,
      detailImg: undefined,
      detailIcon: undefined,
      detailReleaseDate: undefined,
      detailDeveloper: undefined,
      detailText: undefined,
      detailGenre: undefined,
      detailFunction: undefined,
      detailText2: undefined,
      detailText3: undefined,
      operatingSystem: undefined,
      processor: undefined,
      memory: undefined,
      graphics: undefined,
      directX: undefined,
      storage: undefined,
      etc: undefined,
      language: undefined,
      cartImg: undefined
    }
  },
  mounted(){
    let obj = this;
		obj.$axios.get('http://localhost:9010/vue/axiosGamesDetail', {
      params: {
        productId: obj.$route.params.productId
      }
    })
		.then(function(res){
			console.log(res);

      obj.productName = res.data.productName
      obj.productId = res.data.productId
      obj.productDiscount = res.data.productDiscount
      obj.productFirstCost = res.data.productFirstCost
      obj.productPrice = res.data.productPrice
      obj.detailImg = res.data.detailImg
      obj.detailIcon = res.data.detailIcon
      obj.detailReleaseDate = res.data.detailReleaseDate
      obj.detailDeveloper = res.data.detailDeveloper
      obj.detailText = res.data.detailText
      obj.detailGenre = res.data.detailGenre
      obj.detailFunction = res.data.detailFunction
      obj.detailText2 = res.data.detailText2
      obj.detailText3 = res.data.detailText3
      obj.operatingSystem = res.data.operatingSystem
      obj.processor = res.data.processor
      obj.memory = res.data.memory
      obj.graphics = res.data.graphics
      obj.directX = res.data.directX
      obj.storage = res.data.storage
      obj.etc = res.data.etc
      obj.language = res.data.language
      obj.cartImg = res.data.cartImg

		})
		.catch((err)=>{
			console.log(err);
      console.log("에러 발생");
		})
	},
  methods: {
    change_comma(value) {
      return value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
    },
    mainPage() {
      history.back(-1);
    },
    moveCart() {
      let thisView = this

      thisView.$axios.get("http://localhost:9010/vue/IsInCart", {
        params: {productId: thisView.productId}
      }).then(response => {
        //  중복일 경우?
        if(response.data) {
          console.log('pid ' + thisView.productId)
          //  갯수 업데이트
          thisView.$axios.put("http://localhost:9010/vue/AddCartItem", null, {
            params: {productId: thisView.productId}
          }).then(() => {
            thisView.$router.push({name: 'Cart'})
          }).catch(error => {console.error(error)})
        }
        //  새로운 아이템일 경우?
        else {
          //  추가
          thisView.$axios.post("http://localhost:9010/vue/axiosCartInsert", {
            productId: thisView.productId,
            cartImg: thisView.cartImg,
            productDiscount: thisView.productDiscount,
            productFirstCost: thisView.productFirstCost,
            productName: thisView.productName,
            productPrice: thisView.productPrice
          })
          .then (response => {
            console.log(response);
            thisView.$router.push({ name: "Cart"
            });
          })
          .catch (error => {
            console.error(error)
          })
        }
      }).catch(error => {console.error(error)})
    }
  }
}
</script>

<style scoped>
  @media (min-width: 992px) {
      .container-fluid {
        width: 1400px;
      }
  }
  .container-fluid {
    display: grid;
    grid-gap: 20px;
    grid-template-areas:  
    'title title title'
    'title-img title-img side-bar'
    'game-contents game-contents side-bar'
    'follow follow side-bar'
    'contents-spec contents-spec side-bar'
  }

  main {
    background: #1C1C1C;
    height: 240vh;
  }

  .back-btn-item {
    padding: 90px 0px 30px 0px;
    border-bottom: 1px solid rgba(255, 255, 255, 0.1);
  }

  .product_Name_item {
    font-size: 4vh;
    float: left;
    color: white;
  }

  .product-title-img {
    float: left;
  }

  .back-btn {
    border-bottom: 1px solid rgba(255, 255, 255, 0.1);
    padding-bottom: 20px;
  }

  .title {
    grid-area: title;
    text-align: left;
    font-size: 4vh;
  }

  .title-img {
    grid-area: title-img;
    width: 100%;
  }

  .side-bar {
    grid-area: side-bar;
  }

  .game-contents {
    grid-area: game-contents;
    text-align: left;
  }

  .follow {
    grid-area: follow;

  }

  .contents-spec {
    grid-area: contents-spec;
    margin-top: 50px;

  }

  .game-contents-item {
    padding: 0px 80px 50px 20px;
  }

  .follow-contetns {
    width: 100%;
    height: 70px;
    background-color: #262626;
    border-radius: 5px;
  }

  .follow-icon {
    margin: 17px
  }

  .spec-contents-div {
    width: 100%;
    height: 700px;
    background-color: #262626;
    border-radius: 5px;
    padding: 20px;
  }

  .spec-text {
    color: gray;
    font-size: 13px;
    font-weight: bold;
  }

  .spec-text1 {
    font-size: 13px;
    margin-bottom: 20px;
  }

  .product-discount {
    float: left;
    background-color: rgb(0,116,228);
    width: 50px;
    font-size: 12px;
    padding: 5px;
    border-radius: 5px;
    margin-right: 0px;
  }

  .product-price-contents {
    margin-left: 10px;
    font-size: 13px;
  }

  .buybtn-contents {
    width: 100%;
    padding: 15px;
    background-color: rgb(0,116,228);
    border: none;
    border-radius: 5px;
    color: white;
    font-weight: bold;
  }

  .cartbtn-contents {
    background: #1C1C1C;
    border: 1px solid silver;
    color: white;
    width: 100%;
    margin-top: 10px;
    padding: 3px;
    border-radius: 5px;
  }

  .Developer-contents1 {
    float: left;
  }

  .Developer-contents2 {
    float: right;
  }

  .backbtn-item {
    border: none;
    background: #1C1C1C;
    color: white;
    font-weight: bold;
  }

  .cart_btn-style:hover {
    opacity: 0.7;
  }
</style>