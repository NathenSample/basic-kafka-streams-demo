
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module basic.kafka.streams.demo.services {
    requires transitive basic.kafka.streams.demo.api;

    exports io.github.nathensample.basic.kafka.streams.demo.services;

    provides ComponentDescriptor with
            io.github.nathensample.basic.kafka.streams.demo.services.ExampleServiceDescriptor;
}
