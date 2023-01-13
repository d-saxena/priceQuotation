package com.sapeint.publicis.repository;

import com.sapeint.publicis.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductQuotationRepository extends JpaRepository<Product,Long> {
}
