package whatchamacallit
import grails.converters.JSON

class HealthController {
    static allowedMethods = [
            thoroughHealthCheck: ['GET', 'HEAD']
    ]

    def healthcheck(){
        def output = ["Looking Good!"]
        render output as JSON
    }
}
