import { defineStore } from "pinia";

export const useAnimalsStore = defineStore("animals", {
  state: () => ({
    animals: [],
  }),
  actions: {
    async fetchAnimals() {
      const response = await fetch("http://localhost:8080/api/animals");
      const responseJson = await response.json();
      this.animals = responseJson;
    },
  },
});
