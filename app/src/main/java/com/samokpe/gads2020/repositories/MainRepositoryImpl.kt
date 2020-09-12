package com.samokpe.gads2020.repositories

import com.samokpe.gads2020.models.LearningLeader
import com.samokpe.gads2020.models.Resource
import com.samokpe.gads2020.models.SkillIQLeader
import com.samokpe.gads2020.remote.RemoteDataSource
import javax.inject.Inject

class MainRepositoryImpl
@Inject constructor(private val remoteDataSource: RemoteDataSource): MainRepository {
    override suspend fun fetchLearningLeaders(): Resource<List<LearningLeader>> =
        remoteDataSource.getTopLearningLeaders()

    override suspend fun fetchIQLeaders(): Resource<List<SkillIQLeader>> =
        remoteDataSource.getTopIQLeaders()

    override suspend fun submitProject(
        firstName: String, lastName: String, email: String, projectLink: String
    ): Resource<Int> =
        remoteDataSource.submitProject(firstName, lastName, email, projectLink)
}