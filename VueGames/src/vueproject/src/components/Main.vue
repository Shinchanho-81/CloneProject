<template>
<main>
  <div class="container-fluid">
    <div class="main-contents-search">
      <span>
        <a class="search-style" href="#">탐색</a>
        <a class="search-style" href="#">찾아보기</a>
      </span>
      <span style="float: right;">
        <button type="button" class="search-btn"><img src="../assets/img/search-btn.png" alt=""></button>
        <input type="text" class="search-input">
      </span>
    </div>
    <div class="main-contents-carousel" style="margin:20px 0px 350px;">
      <div style="width: 100%; height: 300px; color: white; float: left;">
        <div style="display: block" id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="../assets/img/carousel2.jpg" class="d-block w-100" alt="..." width="100%" height="600px" style="border-radius: 5px 5px 5px 5px;" >
              <div class="carousel-caption d-none d-md-block" style="text-align: left;">
                  <h5>마지막 사전 구매 기회</h5>
                  <p style="font-weight: bold;">HUMANKIND™ Digital Deluxe Edition과 한정판 사전 구매 콘텐츠를 17% 할인된 가격으로 사전 구매할 수 있는 기회가 얼마 남지 않았습니다. 어서 서두르세요!</p>
                  <p><span style="text-decoration:line-through; color: gray; font-weight: bold;">₩62,000</span> ₩51,460 에서 시작</p>
                </div>
            </div>
            <div class="carousel-item">
              <img src="../assets/img/carousel1.jpg" width="100%" height="600px" alt="..." style="border-radius: 5px 5px 5px 5px;">
                <div class="carousel-caption d-none d-md-block" style="text-align: left;">
                  <h5>8월 12일 출시[미국 동부시간 기준]</h5>
                  <p style="font-weight: bold;">15% 할인에 사전 구매할 수 있는 마지막 기회를 이용하여 차원 간 급행열차의 승무원이 되세요!</p>
                  <p><span style="text-decoration:line-through; color: gray; font-weight: bold;">₩30,000</span> ₩25,500 에서 시작</p>
                </div>
            </div>
            <div class="carousel-item">
              <img src="../assets/img/carousel3.jpg" class="d-block w-100" alt="..." width="100%" height="600px" style="border-radius: 5px 5px 5px 5px;">
              <div class="carousel-caption d-none d-md-block" style="text-align: left;">
                  <h5>게임 업데이트 이용 가능</h5>
                  <p style="font-weight: bold;">광활한 Galencourt 시를 훼손하거나 방어하세요. 이번 무료 업데이트로 Arena Mode에서 적과 전투하는 등 더 풍부하게 즐길 수 있습니다.</p>
                  <p style="font-weight: bold;">₩41,000 에서 시작</p>
                </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="main-contents-sale">
      <h2 style="float: left; color: white; font-size: 19px;  font-weight: bold;">할인 게임</h2>
      <div style="height: 50px"></div>
      <a style="cursor:pointer" v-on:click="moveGameDetail(1)">
        <div style="float: left; width: 33%; margin-right: 0.5%">
          <img src="../assets/img/doomsday2.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div>
          <span style="float: left; color: white; font-size: 14px; width: 100%; text-align: left">Doomsday Vault</span>
          <div style="margin-top: 35px;">
            <div class="sale-show-item">-10%</div>
            <div style="float: left; text-decoration:line-through; color: gray; font-size: 14px; margin-right: 10px; padding-top: 2px;">₩17,000</div>
            <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩15,300</span>
          </div>
        </div>
        </div>
      </a>
      <a style="cursor:pointer" v-on:click="moveGameDetail(2)">
      <div style="float: left; width: 33%;  margin-right: 0.5%" >
        <img src="../assets/img/EGS_Dreamscaper.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
      <div>
        <span style="float: left; color: white; font-size: 14px; width: 100%; text-align: left">Dreamscaper</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left; width: 100%; text-align: left">Afterburner | Freedom Games</span>
        </div>
        <div style="margin-top: 35px;">
          <div class="sale-show-item">-10%</div>
          <div style="float: left; text-decoration:line-through; color: gray; font-size: 14px; margin-right: 10px; padding-top: 2px;">₩17,000</div>
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩15,300</span>
        </div>
      </div>
      </div>
      </a>
      <a style="cursor:pointer" v-on:click="moveGameDetail(3)">
      <div style="float: left; width: 33%;" class="detail_move_img">
        <img src="../assets/img/EGS_TheFalconeer.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
      <div>
        <span style="float: left; color: white; font-size: 14px; width: 100%; text-align: left">The Falconeer</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left; width: 100%; text-align: left">Tomas Sala | Wired Productions</span>
        </div>
        <div style="margin-top: 35px;">
          <div class="sale-show-item">-10%</div>
          <div style="float: left; text-decoration:line-through; color: gray; font-size: 14px; margin-right: 10px; padding-top: 2px;">₩20,000</div>
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩18,000</span>
        </div>
      </div>
      </div>
      </a>
    </div>
    <div class="main-contents-public">
      <div style="width: 32%; float: left; margin-right: 2%;">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/farcry5.jpg" alt="" style="width: 100%;" class="detail_move_img">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">Far Cry 5 - 주말 무료 체험</h4>
          <span style="font-size: 13px">
            무료 체험판이 지금 진행 중입니다. 8월 9일(미국 동부시간 기준) 까지 무료로 다운로드하고 플레이하세요.
          </span>
        </div>
      </a>
      </div>
      <div style="width: 32%; float: left; margin-right: 2%">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/fortnite.jpg" alt="" style="width: 100%;" class="detail_move_img">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">실례합니다! 아리아나 그란데 등장하실게요!</h4>
          <span style="font-size: 13px">
            한국 시간 8월 7일 오전 7시 부터, 아리아나 그란데와 함게하는 포트나이트 리프트 투어에 참석 해보세요! #RiftTour
          </span>
        </div>
      </a>
      </div>
      <div style="width: 32%; float: left;">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/lust.jpg" alt="" style="width: 100%;" class="detail_move_img">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">Hitman3 신규 DLC - 음욕</h4>
          <span style="font-size: 13px">
            Dartmoor의 영구 무료 이벤트를 포함하여 뜨끈뜨끈한 콘텐츠를 즐기고 팬들의 사랑을 받는 Goldballer를 잠금 해제하세요.
          </span>
          <div style="margin-top: 15px">
            <span style="font-size: 14px;">₩6,300</span>
          </div>
        </div>
      </a>
      </div>
    </div>
    <div class="main-contents-freeGames">
      <div style="float: left; height: 50px;">
        <img src="../assets/img/free_icon.png" alt="">
        <span style="color: white">무료 게임</span>
      </div>
      <div style="height: 50px"></div>
      <div style="float: left; width: 32%; margin-right: 2%">
        <div>
          <img src="../assets/img/inno.jpg" alt="" width="100%" style="border-radius: 6px 6px 0px 0px" class="detail_move_img">
        </div>
        <div style="float: left; background-color: rgb(0,116,228); width: 100%; border-radius: 0px 0px 6px 6px;">
          <span style="color: white; font-size: 12px; font-weight: bold;">
            지금 무료
          </span>
        </div>
        <div style="margin-top: 50px; font-size: 13px;">
          <span style="float: left; color: white; width: 100%; text-align: left">A Plague Tale: Innocence</span>
          <span style="float: left; color: gray;">8월 13일 00:00까지 무료</span>
        </div>
      </div>
      <div style="float: left; width: 32%; margin-right: 2%">
        <div>
          <img src="../assets/img/MINIT.jpg" alt="" width="100%" style="border-radius: 6px 6px 0px 0px" class="detail_move_img">
        </div>
        <div style="float: left; background-color: rgb(0,116,228); width: 100%; border-radius: 0px 0px 6px 6px;" >
          <span style="color: white; font-size: 12px; font-weight: bold;">
            지금 무료
          </span>
        </div>
        <div style="margin-top: 50px; font-size: 13px;">
          <span style="float: left; color: white; width: 100%; text-align: left">Minit</span>
          <span style="float: left; color: gray;">8월 13일 00:00까지 무료</span>
        </div>
      </div>
      <div style="float: left; width: 32%;">
        <div>
          <img src="../assets/img/rebelgalaxy.jpg" alt="" width="100%" style="border-radius: 6px 6px 0px 0px" class="detail_move_img">
        </div>
        <div style="float: left; background-color: #000; width: 100%; border-radius: 0px 0px 6px 6px;">
          <span style="color: white; font-size: 12px; font-weight: bold;">
            곧 출시
          </span>
        </div>
        <div style="margin-top: 50px; font-size: 13px;">
          <span style="float: left; color: white; width: 100%; text-align: left">Rebel Galaxy</span>
          <span style="float: left; color: gray;">무료 다운로드: 8월 13 - 8월 20일</span>
        </div>
      </div>
    </div>
    <div class="main-contents-newGames">
      <h2 style="float: left; color: white; font-size: 19px;  font-weight: bold; width: 100%; text-align: left">신규 및 인기작</h2>
      <div style="width: 32%; margin: 10px 2% 15px 0px; background: rgba(255, 255, 255, 0.1); float: left; border-radius: 7px;">
        <div style="float: left;">
          <span style="float: left; color: white; font-size: 16px; margin: 15px 0px 0px 10px">신규 출시</span>
        </div>
        <a style="cursor:pointer" v-on:click="moveGameDetail(1)">
          <div style="float: left; margin-top: 15px; padding: 5px" class="div-hover-style">
            <img src="../assets/img/doomsday-vault.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Doomsday Vault</span>
            <div class="sale-show-item" style="margin-left: 10px;">-10%</div>
            <span style="text-decoration:line-through; color: gray; font-size: 14px; float: left;">₩17,000</span>
            <br>
            <span style="color: white; font-size: 14px; float: left; margin-left:10px">₩15,300</span>
          </div>
        </a>
        <a style="cursor:pointer" v-on:click="moveGameDetail(2)">
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img2.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Dreamscaper</span>
            <div class="sale-show-item" style="margin-left: 10px;">-25%</div>
            <span style="text-decoration:line-through; color: gray; font-size: 14px; float: left;">₩25,000</span>
            <br>
            <span style="color: white; font-size: 14px; float: left; margin-left:10px">₩18,750</span>
          </div>
        </a>
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img3.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">GRIME</span>
            <div class="sale-show-item" style="margin-left: 10px;">-10%</div>
            <span style="text-decoration:line-through; color: gray; font-size: 14px; float: left;">₩25,000</span>
            <br>
            <span style="color: white; font-size: 14px; float: left; margin-left:10px">₩22,500</span>
          </div>
          <div style="float: left; padding: 5px; margin-bottom: 15px;" class="div-hover-style">
            <img src="../assets/img/img4.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">No Longer Home</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px;">₩15,500</span>
          </div>
      </div>
      <div style="width: 32%; margin: 10px 2% 15px 0px; background: rgba(255, 255, 255, 0.1); float: left;  border-radius: 7px;">
        <div style="float: left;">
          <span style="float: left; color: white; font-size: 16px; margin: 15px 0px 0px 10px">베스트셀러</span>
        </div>
        <a style="cursor:pointer" v-on:click="moveGameDetail(4)">
          <div style="float: left; margin-top: 15px; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img5.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Grand Theft Auto V: Premium Edition</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩33,000</span>
          </div>
        </a>
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img6.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">HITMAN 3</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩64,900</span>
          </div>
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img7.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Chivalry 2</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩41,000</span>
          </div>
          <div style="float: left; padding: 5px; margin-bottom: 15px;" class="div-hover-style">
            <img src="../assets/img/img8.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Assassin's Creed: Valhalla</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩65,000</span>
          </div>
      </div>
      <div style="width: 32%; margin-top: 10px; background: rgba(255, 255, 255, 0.1); float: left;  border-radius: 7px;">
        <div style="float: left;">
          <span style="float: left; color: white; font-size: 16px; margin: 15px 0px 0px 10px">출시 예정</span>
        </div>
          <div style="float: left; margin-top: 15px; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img9.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Train Life: A RailWay Simulator</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">곧 출시</span>
          </div>
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img10.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">A Plague Tale: Requiem</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">곧 출시</span>
          </div>
          <div style="float: left; padding: 5px" class="div-hover-style">
            <img src="../assets/img/img11.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Pathfinder: Wrath of the Righteous</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩55,880</span>
          </div>
          <div style="float: left; padding: 5px; margin-bottom: 15px;" class="div-hover-style">
            <img src="../assets/img/img12.jpg" alt="" width="20%" style="float: left; margin: 5px">
            <span style="color: white; float: left; width: 72%; text-align: left; margin-left: 10px; font-size: 18px">Farming Simulator 22</span>
            <span style="color: white; font-size: 14px; float: left;margin-left: 10px">₩44,000</span>
          </div>
      </div>
    </div>
    <div class="main-contents-LimitedDate">
      <div style="width: 32%; float: left; margin-right: 2%;">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/grime.jpg" alt="" style="width: 100%;">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">GRIME - 지금 이용 가능</h4>
          <span style="font-size: 13px">
            GRIME에 빠져들 준비가 되었나요? 10% 할인으로 지금 이용하세요!
          </span>
          <div style="margin-top: 40px;">
            <div class="sale-show-item">-10%</div>
            <div style="text-decoration:line-through; float: left; color: gray; font-size: 14px; margin-right: 10px; padding-top: 2px;">₩25,000</div>
            <span style="font-size: 14px">₩22,500</span>
          </div>
        </div>
      </a>
      </div>
      <div style="width: 32%; float: left; margin-right: 2%">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/warships.jpg" alt="" style="width: 100%;">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">월드 오브 워쉽 - 기간 한정 행사</h4>
          <span style="font-size: 13px">
            25$ 가치의 제1차 세계 대전 함선 번들을 무료로 획득하고 궁극의 온라인 해상 경기장에서 나만의 방식으로 전투해보세요!
          </span>
          <div style="margin-top: 15px;">
            <div class="sale-show-item">-100%</div>
            <div style="text-decoration:line-through; float: left; color: gray; font-size: 14px; margin-right: 10px; padding-top: 2px;">₩28,310</div>
            <span style="font-size: 14px">무료</span>
          </div>
        </div>
      </a>
      </div>
      <div style="width: 32%; float: left;">
      <a href="#" class="public_item">
        <div>
          <img src="../assets/img/koc.jpg" alt="" style="width: 100%;">
        </div>
        <div style="padding: 10px; text-align: left; height: 230px; background-color: #202020;">
          <h4 style="font-size: 27px">Knockout City Season2 업데이트</h4>
          <span style="font-size: 13px">
            영화관에서 내 동작을 마음껏 펼쳐 보이세요! 이 업데이트는 새로운 공, 플레이 리스트, 지도와 장신구를 포함합니다.
          </span>
          <div style="margin-top: 15px;">
            <span style="font-size: 14px">₩22,000</span>
          </div>
        </div>
      </a>
      </div>
    </div>
    <div class="main-contents-topGames">
      <h2 style="float: left; color: white; font-size: 19px;  font-weight: bold;">최고 인기작</h2>
        <div style="height: 50px"></div>
      <a style="cursor:pointer" v-on:click="moveGameDetail(4)">
      <div style="float: left; width:19%; margin-right: 1.25%">
        <img src="../assets/img/gta5.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div style="padding: 10px"></div>
      <div>
        <span style="float: left; color: white; font-size: 14px; text-align: left;">Grand Theft Auto V: Premium Edition</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left; width: 100%; text-align: left">Rockstar Games</span>
        </div>
        <div style="margin-top: 35px;">
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩30,000</span>
        </div>
      </div>
      </div>
      </a>
      <div style="float: left; width: 19%;  margin-right: 1.25%">
        <img src="../assets/img/trainSim.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div style="padding: 10px"></div>
      <div>
        <span style="float: left; color: white; font-size: 14px">Train Sim World 2</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left; text-align: left;">Dovetail Games | Dovetail Games</span>
        </div>
        <div style="margin-top: 35px;">
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩30,000</span>
        </div>
      </div>
      </div>
      <div style="float: left; width: 19%; margin-right: 1.25%">
        <img src="../assets/img/amogusportrait.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div style="padding: 10px"></div>
      <div>
        <span style="float: left; color: white; font-size: 14px">Among Us</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left;">Innersloth | Innersloth</span>
        </div>
        <div style="margin-top: 35px;">
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩5,000</span>
        </div>
      </div>
      </div>
      <div style="float: left; width: 19%; margin-right: 1.25%">
        <img src="../assets/img/EGS_NBA2K21.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div style="padding: 10px"></div>
      <div>
        <span style="float: left; color: white; font-size: 14px">NBA 2K21</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left;">Visual Concepts | 2K</span>
        </div>
        <div style="margin-top: 35px;">
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩65,000</span>
        </div>
      </div>
      </div>
      <div style="float: left; width: 19%;">
        <img src="../assets/img/mothergunship.jpg" alt="" style="width: 100%; border-radius: 6px;" class="detail_move_img">
        <div style="padding: 10px"></div>
      <div>
        <span style="float: left; color: white; font-size: 14px">Mothergunship</span>
        <div style="margin-top: 20px;">
          <span style="color:gray; font-size: 14px; float: left; text-align: left;">Terrible Posture Games | Versus Evil</span>
        </div>
        <div style="margin-top: 35px;">
          <span style="float: left; color: white; font-size: 14px; padding-top: 3px;">₩27,000</span>
        </div>
      </div>
      </div>
    </div>
    <!-- <div class="main-contents-catalog"></div> -->
  </div>
</main>
</template>
<script>
export default {
  data() {
    return {
      
    }
  },
  methods: {
    moveGameDetail(id) {
      console.log(id);
      this.$router.push({
        name: 'Detail',
        params: {
          productId: id
        }
      });
    }
  }
}
</script>

<style>
  @media (min-width: 992px) {
      .container-fluid {
        width: 1400px;
      }
  }

  main {
    background: rgb(18,18,18);
    height: 100%;
  }

  .container-fluid {
    display: grid;
    grid-gap: 20px;
    grid-template-areas:  
    'search search search'
    'carousel carousel carousel'
    'sale sale sale'
    'public public public'
    'freeGames freeGames freeGames'
    'newGames newGames newGames'
    'LimitedDate LimitedDate LimitedDate'
    'topGames topGames topGames'
    'catalog catalog catalog';
  }

  .container-fluid div {
    /* border: 1px solid #000; */
  }

  .main-contents-search {
    grid-area: search;
    width: 100%;
    margin: 60px 0px 0px 0px;
  }

  .main-contents-carousel {
    grid-area: carousel;
  }

  .main-contents-sale {
    grid-area: sale;
    margin-top: 30px;
  }
  
  .main-contents-public {
    grid-area: public;
    margin-top: 100px;
  }

  .main-contents-freeGames {
    grid-area: freeGames;
    background: rgba(255, 255, 255, 0.1);
    padding: 30px;
    border-radius: 8px;
    margin-top: 30px;
  }

  .main-contents-newGames {
    grid-area: newGames;
    margin-top: 40px;
  }

  .main-contents-LimitedDate {
    grid-area: LimitedDate;
    margin-top: 70px;
    
  }

  .main-contents-topGames {
    grid-area: topGames;
    margin-top: 60px;
  }

  .main-contents-catalog {
    grid-area: catalog;
  }

  .search-style {
    color: silver;
    float: left;
    margin-right: 20px;
  }

  .search-style:hover {
    color: white; text-decoration: none;
  }

  .search-btn {
    border: none;
    background-color: #202020;
    padding: 0px 15px 0px 15px;
    height: 40px;
    border-radius: 4px 0px 0px 4px;
  }

  .search-input {
    border: none;
    background-color: #202020;
    width: 210px;
    height: 40px;
    border-radius: 0px 4px 4px 0px;
  }

  .carousel-font {
    color: white;
  }

  ul li {
    list-style: none;
  }

  .carousel-items:hover {
    background-color: rgb(0, 116, 228);
  }

  .sale-show-item {
  float: left;
  color: white;
  background-color: rgb(0,116,228);
  border-radius: 5px;
  font-size: 11px;
  padding: 4px 9px 4px 9px;
  margin-right: 10px;
  }

  .public_item {
    color: white;
  }

  .public_item:hover {
    text-decoration: none;
    background-color: #202020;
    color: white;
  }

  .detail_move_img:hover {
    opacity: 0.7;
  }

  .div-hover-style:hover {
    background-color: rgba(255, 255, 255, 0.1);
  }
</style>