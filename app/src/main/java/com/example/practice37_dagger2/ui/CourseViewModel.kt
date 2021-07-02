package com.example.practice37_dagger2.ui

import com.example.practice37_dagger2.model.data.GetCoursesResponce
import com.example.practice37_dagger2.repository.MainRepository

class CourseViewMode(mainRepository: MainRepository) {

     var mainRep = mainRepository

    fun getCourseList():GetCoursesResponce?{

        return mainRep.getCoursesList()
    }



}