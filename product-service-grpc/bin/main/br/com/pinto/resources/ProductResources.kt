package br.com.pinto.resources

import br.com.pinto.ProductServiceReply
import br.com.pinto.ProductServiceRequest
import br.com.pinto.ProductServiceServiceGrpc
import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService

@GrpcService
class ProductResources : ProductServiceServiceGrpc.ProductServiceServiceImplBase() {
    override fun send(request: ProductServiceRequest?, responseObserver: StreamObserver<ProductServiceReply>?) {
        //var toSend = request?.name.toString()

        val list = mutableListOf<String>()

        for (i in 1..10)
            list.add(request?.name.toString())

        val reply = ProductServiceReply.newBuilder()
            .setMessage(list.toString())
            .build()

        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}