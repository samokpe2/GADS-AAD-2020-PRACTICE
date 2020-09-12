package com.samokpe.gads2020.repositories

import com.samokpe.gads2020.models.LearningLeader
import com.samokpe.gads2020.models.Resource
import com.samokpe.gads2020.models.SkillIQLeader

interface MainRepository {
    suspend fun fetchLearningLeaders(): Resource<List<LearningLeader>>
    suspend fun fetchIQLeaders(): Resource<List<SkillIQLeader>>
    suspend fun submitProject(
        firstName: String, lastName: String, email: String, projectLink: String
    ): Resource<Int>
}