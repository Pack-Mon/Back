package USA.TEAM.PACKMON.domain.collection_request.presentation.controller;

import USA.TEAM.PACKMON.domain.collection_request.domain.Collection_Request;
import USA.TEAM.PACKMON.domain.collection_request.dto.CollectionRequestDto;
import USA.TEAM.PACKMON.domain.collection_request.service.Collection_RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collection_request")
public class Collection_RequestController {
    private final Collection_RequestService collection_requestService;

    @PostMapping
    public ResponseEntity<String> createRequest(@RequestBody CollectionRequestDto dto) {
        collection_requestService.createRequest(dto.getTrashcanId(), dto.getLocation(), dto.getRequestedByUserId());
        return ResponseEntity.ok("수거요청 생성 완료");
    }
    @GetMapping
    public ResponseEntity<List<Collection_Request>> getAllRequests() {
        return ResponseEntity.ok(collection_requestService.getAllRequests());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRequest(@PathVariable Long id) {
        collection_requestService.deleteRequest(id);
        return ResponseEntity.noContent().build();
    }
}
