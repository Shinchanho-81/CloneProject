<template>
  <header>
    <div>
      <div class="nav-logo" style="cursor: pointer;"><img src="../assets/img/gaming_icon.png" alt="" @click="mainPage"></div>
      <a href="#" class="nav-contents" @click="mainPage">스토어</a>
      <a href="#" class="nav-contents">새소식</a>
      <a href="#" class="nav-contents">자주 묻는 질문</a>
      <button type="button" class="login-btn"><img src="../assets/img/loginIcon.png" alt="">로그인</button>
    </div>
  </header>
</template>

<script>
export default {
  methods: {
    mainPage() {
      this.$router.push({ name: 'Main' });
    }
  }
}
</script>

<style>
  header {
    background-color: #2a2a2a;
    height: 60px;
    width: 100%;
  }

  .nav-logo {
    float: left;
    color: white;
    padding:5px ;
    margin: 0px 15px;
  }

  .nav-contents {
    float: left;
    color: white;
    padding: 19px 15px;
    color: silver;
    font-size: 12px;
    height: 60px;
  }

  .nav-contents:hover {
    color: white; text-decoration: none;
    border-bottom: 5px solid deepskyblue;
  }

  .login-btn {
    border: none;
    background-color: #2a2a2a;
    height: 55px;
    color: white;
    float: right;
    color: silver;
    font-size: 12px;
    margin-right: 15px;
  }

  .login-btn:hover {
    color: white;
  }
</style>