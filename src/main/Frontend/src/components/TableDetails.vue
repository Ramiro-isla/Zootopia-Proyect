<script setup></script>

<template>
  <div class="table-responsive" id="Table">
    <div id="Caption-Align">
    <h2>Animals List</h2>
        <button id="buttonAdd">Add New Animal</button>
    
   

    <div id="Filter-By-Align">
        <label class="dropdown">

            <div class="dd-button">
                Filter By
            </div>
          
            <input type="checkbox" class="dd-input" id="test">
          
            <ul class="dd-menu">
              <li>Family</li>
              <li>Origin Country</li>
              
            </ul>
            
        </label>
    </div>
        </div>
    </div>
    <table class="table">
      <tr>
        <th>ISBN</th>
        <th>Name</th>
        <th>Type</th>
        <th>Gender</th>
        <th>Family</th>
        <th>Date of Ingress</th>
      </tr>
    </table>
</template>

<style lang="scss" scoped>
th {
  color: red;
}

body {
  color: #000000;
  font-family: Sans-Serif;
  padding: 30px;
  background-color: #f6f6f6;
}

a {
  text-decoration: none;
  color: #000000;
}

a:hover {
  color: #222222;
}

/* Dropdown */

.dropdown {
  display: inline-block;
  position: relative;
}

.dd-button {
  display: inline-block;
  border: 1px solid gray;
  border-radius: 4px;
  padding: 10px 30px 10px 20px;
  background-color: #44ff57;
  cursor: pointer;
  white-space: nowrap;
}

.dd-button:after {
  content: "";
  position: absolute;
  top: 50%;
  right: 15px;
  transform: translateY(-50%);
  width: 0;
  height: 0;
  border-left: 5px solid transparent;
  border-right: 5px solid transparent;
  border-top: 5px solid black;
}

.dd-button:hover {
  background-color: #eeeeee;
}

.dd-input {
  display: none;
}

.dd-menu {
  position: absolute;
  top: 100%;
  border: 1px solid #ccc;
  border-radius: 4px;
  padding: 0;
  margin: 2px 0 0 0;
  box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.1);
  background-color: #ffffff;
  list-style-type: none;
}

.dd-input + .dd-menu {
  display: none;
}

.dd-input:checked + .dd-menu {
  display: block;
}

.dd-menu li {
  padding: 10px 20px;
  cursor: pointer;
  white-space: nowrap;
}

.dd-menu li:hover {
  background-color: #f6f6f6;
}

.dd-menu li a {
  display: block;
  margin: -10px -20px;
  padding: 10px 20px;
}

.dd-menu li.divider {
  padding: 0;
  border-bottom: 1px solid #cccccc;
}

#Table{
    display: flex;
    justify-content: center;
}

#Caption-Align {
   width: 90%;
}
</style> 
