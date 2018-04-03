<template>
  <form v-on:submit="onSubmit" class="loginPage">
    <div class="loginUsername">
      <span>Benutzername:</span>
      <input v-model="username">
    </div>

    <div class="loginPassword">
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
        password: ''
      }
    },
    methods: {
      doLogin: function () {

      },
      resetPassword: function () {
        this.go('resetPassword')
      },
      onSubmit: function () {
        // Check data
        // Show error or redirect after successful login
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
</style>
