<script>
export default {
    data() {
        return {
            title: "StickMe",
            text: "Sticker created with success."
        }
    }
}
</script>

<template>
    <div class="toast-container position-fixed bottom-0 end-0 p-3">
        <div id="liveToast" class="toast bg-success text-white" role="alert">
            <div class="toast-header">
                <strong class="me-auto">{{ this.title }}</strong>
                <button type="button" class="btn-close" data-bs-dismiss="toast"></button>
            </div>
            <div class="toast-body">
                {{ this.text }}
            </div>
        </div>
    </div>
</template>