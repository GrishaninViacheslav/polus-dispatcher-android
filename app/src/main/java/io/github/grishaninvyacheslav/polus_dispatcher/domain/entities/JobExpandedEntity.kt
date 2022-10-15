package io.github.grishaninvyacheslav.polus_dispatcher.domain.entities

data class JobExpandedEntity(
    val id: Int,
    val title: String,
    val startDate: Long,
    val endDate: Long,
    val lon: Double,
    val lat: Double,
    var status: String,
    val customer: Customer,
    val typeVehicle: TypeVehicle,
    val executor: Executor
)

data class Customer(
    val id: Int,
    val login: String,
    val password: String,
    val type: String,
    val name: String
)

data class TypeVehicle(
    val id: Int,
    val type: String,
    val vehicleNumber: String,
    val modelVehicle: ModelVehicle
)

data class ModelVehicle(
    val id: Int,
    val model: String
)

data class Executor(
    val id: Int,
    val login: String,
    val password: String,
    val type: String,
    val name: String,
    val lon: Double,
    val lat: Double
)

