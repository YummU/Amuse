addEventListener("load", function () {
    setTimeout(hideURLbar, 0);
}, false);

function hideURLbar() {
    window.scrollTo(0, 1);
}

new Vue({
    el: '#mian',
    data: {
        nowYear: new Date().getFullYear(),
        logindata: {
            email: "123@foxmail.com",
            password: "admin123"
        },
        registerdata: {
            name: "123@foxmail.com",
            password: "admin123",
            confirmPassword: "admin123"
        },
        forgetdata: {
            email: "123@foxmail.com",
        }
    }
});