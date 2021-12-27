package com.stevenhia.academy.ui.bookmark

import com.stevenhia.academy.ui.data.ModelCourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: ModelCourseEntity)
}
