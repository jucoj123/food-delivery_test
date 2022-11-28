<template>

    <v-data-table
        :headers="headers"
        :items="vieworderdetails"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'VieworderdetailsView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            vieworderdetails : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/vieworderdetails'))

            temp.data._embedded.vieworderdetails.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.vieworderdetails = temp.data._embedded.vieworderdetails;
        },
        methods: {
        }
    }
</script>

