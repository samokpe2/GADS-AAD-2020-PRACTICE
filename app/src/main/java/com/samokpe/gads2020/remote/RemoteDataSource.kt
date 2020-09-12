package com.samokpe.gads2020.remote

import com.samokpe.gads2020.models.LearningLeader
import com.samokpe.gads2020.models.Resource
import com.samokpe.gads2020.models.SkillIQLeader

/**
 * Holds decoupled logic for api calls
 */
interface RemoteDataSource {
    suspend fun getTopLearningLeaders(): Resource<List<LearningLeader>>
    suspend fun getTopIQLeaders(): Resource<List<SkillIQLeader>>
    suspend fun submitProject(
        firstName: String,
        lastName: String,
        emailAddress: String,
        projectLink: String
    ): Resource<Int>
}