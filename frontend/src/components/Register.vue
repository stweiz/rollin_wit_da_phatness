<template>
  <form class="registerPage">
    <div class="registerEmailAddress" v-bind:class="{ 'registrationError': hasErrorModelEmail }">
      <span>E-Mail Adresse:</span>
      <input v-model="emailAddress">
    </div>

    <div class="registerUsername" v-bind:class="{ 'registrationError': hasErrorModelUsername }">
      <span>Benutzername:</span>
      <input v-model="username">
    </div>

    <div class="registerPassword" v-bind:class="{ 'registrationError': hasErrorModelPassword }">
      <span>Passwort:</span>
      <input v-model="password">
    </div>

    <div class="registerFirstName" v-bind:class="{ 'registrationError': hasErrorModelFirstName }">
      <span>Vorname:</span>
      <input v-model="firstName">
    </div>

    <div class="registerLastName" v-bind:class="{ 'registrationError': hasErrorModelLastName }">
      <span>Nachname:</span>
      <input v-model="lastName">
    </div>

    <div class="registerBirthday" v-bind:class="{ 'registrationError': hasErrorModelBirthday }">
      <span>Geburtstag:</span>
      <input v-model="birthday"> <!-- Später ein datepicker -->
    </div>

    <button v-on:click="doRegister">Registrieren</button>
    <button v-on:click="goBack">Zurück zum Login</button>
  </form>
</template>

<script>
  export default {
    name: 'Register',
    data() {
      return {
        emailAddress: '',
        username: '',
        password: '',
        firstName: '',
        lastName: '',
        birthday: '',
        hasErrorValue: false,
      }
    },
    methods: {
      doRegister: function () {
        // Send onSubmit, Check data
        // Show error or redirect after successful registration to login page and show successful message on login page
      },
      goBack: function () {
        // Go to Login
      },
    },
    computed: {
      hasErrorModelEmail: {
        get: function () {
          return this.hasErrorValue = this.emailAddress == null || this.emailAddress === '';
        },
      },
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
      hasErrorModelFirstName: {
        get: function () {
          return this.hasErrorValue = this.firstName == null || this.firstName === '';
        },
      },
      hasErrorModelLastName: {
        get: function () {
          return this.hasErrorValue = this.lastName == null || this.lastName === '';
        },
      },
      hasErrorModelBirthday: {
        get: function () {
          return this.hasErrorValue = this.birthday == null || this.birthday === '';
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

  .registrationError {
    color: #ff0000;
  }
</style>
