package USA.TEAM.PACKMON.domain.collection_request.service;

import USA.TEAM.PACKMON.domain.collection_request.domain.repository.Collection_RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import USA.TEAM.PACKMON.domain.collection_request.domain.Collection_Request;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Collection_RequestService {

    private final Collection_RequestRepository collection_requestRepository;

    public Collection_Request createRequest(Long trashcanId, String location, Long requestedByUserId) {
        Collection_Request request = new Collection_Request(
                trashcanId,
                location,
                requestedByUserId
        );
        return collection_requestRepository.save(request);
    }

    public List<Collection_Request> getAllRequests() {
        return collection_requestRepository.findAll();
    }

    public void deleteRequest(Long id) {
        collection_requestRepository.deleteById(id);
    }
}
