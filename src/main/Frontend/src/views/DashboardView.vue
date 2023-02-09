<script setup>
import Graph from "../components/Graph.vue";
import Sidebar from "../components/Sidebar.vue";
import TableComponent from "../components/TableComponent.vue";
import TableDetails from "../components/TableDetails.vue";
import { useAnimalsStore } from "../stores/animalStore";
import { onBeforeMount } from "vue";

const store = useAnimalsStore();

onBeforeMount(async () => {
  await store.fetchAnimals();
});
</script>
<template>
  <div class="dashboard-container">
    <Sidebar />
    <div class="dashboard-list">
      <Graph />
      <TableDetails />
      <div v-for="animal in store.animals" :key="animal">
        <TableComponent
          :name="animal.name"
          :type="animal.type"
          :gender="animal.gender"
          :family="animal.family"
          :ingressDate="animal.ingressDate"
        />
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
.dashboard-container {
  display: flex;
  .dashboard-list {
    width: 100%;
  }
}
</style>
