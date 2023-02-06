<script setup>
import TableDetails from './components/TableDetails.vue';
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
      <nav>
       <!-- <RouterLink to="/">Home</RouterLink> -->
        <RouterLink to="/dashboard">dashboard</RouterLink>
      </nav>
  </header>
  <TableDetails/>
</template>

<style scoped>

</style>