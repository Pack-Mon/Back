package USA.TEAM.PACKMON.domain.collector.presentation.controller;

import USA.TEAM.PACKMON.domain.collector.domain.Collector;
import USA.TEAM.PACKMON.domain.collector.service.CollectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/collector")
public class CollectorController {
    private final CollectorService collectorService;

    @PostMapping("/signup")
    public ResponseEntity<Collector> registerCollector(@RequestBody Collector collector) {
        Collector savedCollector = collectorService.registerCollector(collector);
        return ResponseEntity.ok(savedCollector);
    }

    @GetMapping
    public ResponseEntity<List<Collector>> getAllCollectors() {
        List<Collector> collectors = collectorService.getAllCollectors();
        return ResponseEntity.ok(collectors);
    }
}
