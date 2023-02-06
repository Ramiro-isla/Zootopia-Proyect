<script setup>
import { RouterLink, RouterView } from 'vue-router'
import TableComponent from './components/TableComponent.vue';
</script>

<template>
  <header>
      <nav>
        <!-- <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/dashboard">dashboard</RouterLink> -->
      </nav>
  </header>
<TableComponent/>
  
</template>

<style lang="scss" scoped>

@use "../src/scss/default.scss";

</style>

