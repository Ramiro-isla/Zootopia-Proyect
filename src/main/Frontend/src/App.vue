<script setup>
import { RouterLink, RouterView } from 'vue-router'

</script>

<template>
  <header>
      <nav>
        <RouterLink to="/">Login</RouterLink> <br>
        <RouterLink to="/dashboard">dashboard</RouterLink> <br>
      </nav>
  </header>

  <RouterView />
</template>

<style lang="scss" scoped>

@use "./assets/sass/styles.scss";

</style>

