<template>

<div class="page-container">
    <md-app>
        <md-app-toolbar class="md-primary">
            <span class="md-title">SOP</span>
        </md-app-toolbar>
        <md-app-drawer md-permanent="full">
            <!--  <md-toolbar class="md-transparent" md-elevation="0">
          Navigation
        </md-toolbar> -->
            <md-list v-for="route in this.$router.options.routes">
                <md-list-item>
                    <md-icon>label</md-icon>
                    <!-- <span class="md-list-item-text">Test</span> -->
                    <router-link :to="route.path" class="md-list-item-text">{{route.name}}</router-link>
                </md-list-item>
            </md-list>
        </md-app-drawer>

        <md-app-content>
            <b-card no-body>
                <b-tabs card>
                    <b-tab title="Results" active>
                        <sopTable></sopTable>
                    </b-tab>
                    <b-tab title="Form">
                        <sopForm></sopForm>
                    </b-tab>
                    <b-tab title="Empty">

                    </b-tab>
                </b-tabs>
            </b-card>
        </md-app-content>
    </md-app>

</div>

</template>

<script>

import sopTable from '@/components/sop/SopTable';
import sopForm from '@/components/sop/SopForm';
export default {
    name: 'Test',
    data: () => ({

    }),
    mounted() {

    },
    methods: {

    },
    components: {
        sopTable,
        sopForm
    }
}

</script>
<style lang="scss" scoped>

.md-table + .md-table {
    margin-top: 16px
}

.md-app {
    /*max-height: px; */
    border: 1px solid rgba(#000, .12);
}

.md-drawer {
    max-width: 250px;
}

</style>
