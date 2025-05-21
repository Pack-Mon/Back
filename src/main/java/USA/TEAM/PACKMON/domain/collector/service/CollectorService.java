package USA.TEAM.PACKMON.domain.collector.service;

import USA.TEAM.PACKMON.domain.collector.domain.Collector;
import USA.TEAM.PACKMON.domain.collector.domain.repository.CollectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectorService {
    private final CollectorRepository collectorRepository;

    public Collector registerCollector(Collector collector) {
        return collectorRepository.save(collector);
    }

    public List<Collector> getAllCollectors() {
        return collectorRepository.findAll();
    }

}
