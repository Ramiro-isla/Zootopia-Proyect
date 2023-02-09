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
@import "../assets/sass/styles.scss";


.sidebar{
    @include displayFlex(column, center);
    justify-content: space-around;
    float: left;
    padding-inline: 1rem;
    background-color: $SidebarColor;
    
    .profile{
        @include displayFlex(column, center);
        img{
            width: 7rem;
            border-radius: 100%;
        }
        h3{
            color: $QuinaryColor;
        }
    }
    .buttons{
        @include displayFlex(column, center);
        gap: 2rem;
        button{
            width: 100%;
            background-color: $QuinaryColor;
            color: $SecondaryColor;
            border-radius: 10rem;
            border: 2px solid $SecondaryColor;
            font-size: 24px;
            padding-inline: 2.5rem;
            padding-block: 0.2rem;
            box-shadow: 2px 2px 2px rgb(77, 77, 77);
        }
    }
    .footer{
        @include displayFlex(column, center);
        img{
            width: 8rem;
        }
    }
}

</style>