<template>
  <form class="loginPage">
    <div class="loginUsername" v-bind:class="{ 'loginError': hasErrorModelUsername }">
      <span>Benutzername:</span>
      <input v-model="username">
    </div>

    <div class="loginPassword" v-bind:class="{ 'loginError': hasErrorModelPassword }">
      <span>Passwort:</span>
      <input v-model="password">
    </div>

    <button v-on:click="doLogin">Login</button>
    <button v-on:click="resetPassword">Passwort zurücksetzen</button>
  </form>
</template>

<script>
  export default {
    name: 'Login',
    data() {
      return {
        username: '',
        password: '',
        hasErrorValue: false,
      }
    },
    methods: {
      doLogin: function () {
        // Send onSubmit, Check data
        // Show error or redirect after successful login to members list
      },
      resetPassword: function () {
        //Go to ResetPassword
      },
    },
    computed: {
      hasErrorModelUsername: {
        get: function () {
          return this.hasErrorValue = this.username == null || this.username === '';
        },
      },
      hasErrorModelPassword: {
        get: function () {
          return this.hasErrorValue = this.password == null || this.password === '';
        },
      },
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }

  .loginError {
    color: #ff0000;
  }
</style>
