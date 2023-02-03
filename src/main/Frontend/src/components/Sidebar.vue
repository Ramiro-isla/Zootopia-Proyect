<script setup>

</script>

<template>
<main class="sidebar">
    <div class="profile">
        <img src="../assets/img/profile.png" alt="Profile picture">
        <h2>User</h2>
        <h3>Admin</h3>
    </div>
    <div class="buttons">
        <button>Dashboard</button>
        <button>List</button>
    </div>
    <div class="footer">
        <img src="../assets/img/Logo.png" alt="logo">
        <h3>Zotopiapp ©</h3>
    </div>
</main>
</template>

<style lang="scss" scoped>

.sidebar{
    display: flex;          // Aqui se 
    flex-direction: column; // puede hacer    
    align-items: center;    // un mixin
    justify-content: space-around;
    float: left;
    height: 100vh;
    padding-inline: 1rem;
    
    .profile{
        display: flex; //
        flex-direction: column;
        align-items: center;
        img{
            width: 7rem;
            border-radius: 100%;
        }
    }
    .buttons{
        display: flex;
        flex-direction: column;
        align-items: center;
        button{
            width: 100%;
            background-color: $QuinaryColor;
            color: $SecondaryColor;
            border-radius: 10rem;
            border: 2px solid $SecondaryColor;
            font-size: 24px;
            padding-inline: 2.5rem;
            padding-bottom: 0.4rem;
            box-shadow: 2px 2px 2px rgb(77, 77, 77);
        }
    }
    .footer{
        display: flex;  //
        flex-direction: column;
        align-items: center;
        img{
            width: 8rem;
        }
    }
}

</style>