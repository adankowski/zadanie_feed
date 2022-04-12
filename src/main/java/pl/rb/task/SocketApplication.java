package pl.rb.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
class SocketApplication {

    private final SocketService socketService;

    public SocketApplication(SocketService socketService) {
        this.socketService = socketService;
    }

    @GetMapping(value = "/getInstruments")
    public Collection<Unifeed> getInstruments() {
        return socketService.getUnifeedCollection();
    }
}
