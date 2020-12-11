package org.sid.billingservice.Repository;

import org.sid.billingservice.Model.BillLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillLineRepository extends JpaRepository<BillLine,Long> {

}
