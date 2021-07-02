package com.example.practice37_dagger2.model.remote

import com.example.practice37_dagger2.model.data.CharacterResponse
import com.example.practice37_dagger2.model.data.GetCoursesResponce
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
//    @GET("Course/getCourses/")
//    fun getCourseList()
//            : Response<GetCoursesResponce>

    @GET("Course/getCourses/")
    fun getCourseList(): Observable<GetCoursesResponce>
}