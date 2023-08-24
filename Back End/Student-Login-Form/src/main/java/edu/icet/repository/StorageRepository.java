package edu.icet.repository;

import edu.icet.dao.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<ImageData,Long>{


}
