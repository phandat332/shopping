package DANHHT.Fashion.repository;

import DANHHT.Fashion.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepsitory extends JpaRepository<Brand, Long> {

}
