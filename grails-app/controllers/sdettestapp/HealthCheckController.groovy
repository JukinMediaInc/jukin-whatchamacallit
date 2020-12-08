package whatchamacallit
import grails.converters.JSON

class HealthCheckController{

    static allowedMethods = [
            thoroughHealthCheck: ['GET', 'HEAD']
    ]

    def healthcheck(){
        def output = ["Looking Good!"]
        render output as JSON
    }

}


