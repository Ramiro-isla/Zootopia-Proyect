<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Sidebar from './components/Sidebar.vue';
</script>

<template>
  <header>
      <!-- <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/list">list</RouterLink>
        <RouterLink to="/dashboard">dashboard</RouterLink>
      </nav> -->
      <Sidebar/>
    
  </header>

  <RouterView />
</template>

<style scoped>

</style>
