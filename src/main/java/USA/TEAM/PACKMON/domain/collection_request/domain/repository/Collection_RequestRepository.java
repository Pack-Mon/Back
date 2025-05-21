package USA.TEAM.PACKMON.domain.collection_request.domain.repository;

import USA.TEAM.PACKMON.domain.collection_request.domain.Collection_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Collection_RequestRepository extends JpaRepository<Collection_Request, Long> {

}
