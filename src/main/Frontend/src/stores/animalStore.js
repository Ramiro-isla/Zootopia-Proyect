import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export  const useAnimalsStore = defineStore('animals', {
  state:()=>({
     characters: []
  }),
  actions:{
    async fetchAnimals(){
      const response =await fetch("http://localhost:8080/api/animals") 
      const responseJson = await response.json()
      console.log(responseJson);
      this.characters=responseJson
      return this.characters
    }
  }

})
