<template>
  <form class="loginPage">
    <div class="emailAddress" v-bind:class="{ 'resetPasswordError': hasErrorModelReset }">
      <span>E-Mail Adresse:</span>
      <input v-model="emailAddress">
    </div>

    <button v-on:click="resetPassword">Passwort zurücksetzen</button>
  </form>
</template>

<script>
export default {
  name: 'ResetPassword',
  data() {
    return {
      emailAddress: '',
      hasErrorValue: false
    }
  },
  methods: {
    resetPassword: function () {
      // Fehlermeldung oder Weiterleitung auf Loginseite mit Bestätigung, dass Passwort resettet wurde.
    }
  },
  computed: {
    hasErrorModelReset: {
      get: function () {
        return this.hasErrorValue = this.emailAddress == null || this.emailAddress === '';
      }
    }
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

.resetPasswordError {
  color: #ff0000;
}
</style>
