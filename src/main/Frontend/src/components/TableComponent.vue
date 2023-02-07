<script setup></script>

<template>
  <div class="table-responsive" id="table-responsive">
    <table class="table" id="table">
      <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Gender</td>
        <td>Family</td>
        <td>Date</td>
        <td>
          <button>
            <img src="../assets/img/pencil.png" alt="edit item button" />
          </button>
          <button>
            <img src="../assets/img/Vectortrash.png" alt="delete item button" />
          </button>
        </td>
      </tr>
    </table>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

#table-responsive {
  #table {
    display: flex;
    justify-content: center;
    background-color: $TableColor;
    font-family: $font-family;
    tr {
      width: 90%;
      display: flex;
      justify-content: space-around;
      align-items: center;
      border: 1px solid $TableColor;
      border-radius: 8px;

      button {
        border: none;
      }
    }
  }
}
</style>
