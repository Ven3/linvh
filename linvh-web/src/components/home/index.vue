<template>

  <el-card>
    <el-button type="primary" circle>
      <el-icon>
        <Aim/>
      </el-icon>
    </el-button>
    {{ msg }}
  </el-card>


</template>

<script>

export default {
  name: "HomePage",
  data() {
    return {
      msg: "oi!"
    }
  },
  mounted() {
    this.$http.get("/").then(resp => {
      console.log(resp.data)
      this.msg = resp.data
    })
  },
  methods: {

  }
}
</script>

<style scoped>

</style>