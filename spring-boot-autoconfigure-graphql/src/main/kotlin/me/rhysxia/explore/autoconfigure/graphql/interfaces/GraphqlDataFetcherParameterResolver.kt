package me.rhysxia.explore.autoconfigure.graphql.interfaces

import graphql.schema.DataFetchingEnvironment
import kotlin.reflect.KParameter

interface GraphqlDataFetcherParameterResolver<T : Any> {
  fun support(parameter: KParameter): Boolean
  fun resolve(dfe: DataFetchingEnvironment, parameter: KParameter): T
}