package oganesyan.rsoi_lab2.gateway.model

data class GatewayRatingResponse(
    var username: String? = null,
    var stars: Int? = null,
    var response: GatewayBaseResponse = GatewayBaseResponse()
)