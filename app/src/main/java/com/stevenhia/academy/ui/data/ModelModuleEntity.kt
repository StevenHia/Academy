package com.stevenhia.academy.ui.data

data class ModelModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
){
    var contentEntity: ModelContentEntity? = null
}
