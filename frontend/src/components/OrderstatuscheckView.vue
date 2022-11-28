<template>

    <v-data-table
        :headers="headers"
        :items="orderstatuscheck"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderstatuscheckView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderstatuscheck : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderstatuschecks'))

            temp.data._embedded.orderstatuschecks.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderstatuscheck = temp.data._embedded.orderstatuschecks;
        },
        methods: {
        }
    }
</script>

