package USA.TEAM.PACKMON.domain.collection_request.dto;

import lombok.Getter;

@Getter
public class CollectionRequestDto {
    private Long trashcanId;
    private String location;
    private Long requestedByUserId;
}
