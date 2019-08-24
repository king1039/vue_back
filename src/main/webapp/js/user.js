new Vue({
    el: "#app",
    data: {
        user: {
            id: "",
            age: "",
            username: "",
            password: "",
            email: "",
            sex: ""
        },
        userList: []
    },
    methods: {
        query: function () {
            var _this = this;
            axios.get('http://127.0.0.1:8080/query')
                .then(function (response) {
                    _this.userList = response.data;
                    console.log("response:" + response.data)
                })
                .catch(function (error) {
                    console.log("error")
                })

        },
        findById: function (id) {

        },
        update: function (user) {

        }
    },
    created: function () {
        this.query();
    }
});