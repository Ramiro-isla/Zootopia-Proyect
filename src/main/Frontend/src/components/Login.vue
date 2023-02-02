<script setup>

</script>


<template>
<div class="mainContainer">
    <div class="box">
            <div class="title">
                <img src="../assets/img/Logo.png" alt="Logo">
                <h2>Welcome to the jungle</h2>
            </div>
            <div class="form">
                <label>Enter your Username 
                <br> <input type="text" Username> 
                </label>
                <label>Enter your Password 
                <br> <input type="text" Password> 
                </label>
            </div>
            <div class="foot">
                <h3>
                    Did you forget your password?
                </h3>
                <button>
                       Login   
                </button>
            </div>
        </div>
</div>
</template>


<style lang="scss" scoped>

*{
    padding: 0;
    margin: 0;
}
.mainContainer{
    display: flex;
    justify-content: center;
}
.box{
    display: flex;
    flex-direction: column;
    align-items: center;
    width: fit-content;
    background-color: yellow;
    border-radius: 20px;
    border: 2px solid white;
    padding: 3%;
    .title{
        display: flex;
        img{
            width: 5vw;
        }
        h2{
            font-size: 36px;
            text-decoration:underline solid black 2px;
        }
    }
    .form{
        display: flex;
        flex-direction: column;
        align-items: flex-end;
    }
    .foot{
        display: flex;
        justify-content: space-around;
        width: 100%;
        h3{
            font-size: 14px;
            align-self: center;
        }
        button{
            background-color: green;
            color: white;
            border-radius: 20px;
            border: 4px solid black;
            font-size: 24px;
            padding-inline: 20px;
        }
    }
}
</style>