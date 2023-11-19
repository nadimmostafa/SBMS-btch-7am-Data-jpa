package org.nadim.repository;

import org.nadim.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ITeacherRepo extends JpaRepository<Teacher, Integer> {

	@Modifying
	@Transactional
	@Query("UPDATE Teacher SET tname=:name WHERE tId=:id")
	int updateNameById(String name, Integer id);

	@Modifying
	@Transactional
	@Query("Delete Teacher WHERE tId=:id")
	int removeById(Integer id);
}
