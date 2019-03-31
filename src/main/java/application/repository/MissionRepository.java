package application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Mission;
import application.model.MissionPK;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Class<MissionPK>> {
	@Query("select o from Mission o ,DeptGen p where p.code =:codeDept and o.deptGen= p.code ")
	List<Mission> findMissionByDept(String codeDept);

	@Query("select m from Mission m where m.code=:code and m.numMission=:numMission")
	Optional<Mission> recherche(@Param("code")String code , @Param("numMission")String numMission);
}
