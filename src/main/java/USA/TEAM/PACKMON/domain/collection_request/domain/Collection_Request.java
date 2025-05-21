package USA.TEAM.PACKMON.domain.collection_request.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Collection_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long trashcanId;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Long requestedByUserId;

    public Collection_Request(Long trashcanId, String location, Long requestedByUserId) {
        this.trashcanId = trashcanId;
        this.location = location;
        this.requestedByUserId = requestedByUserId;
    }
}
