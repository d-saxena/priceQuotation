package com.sapeint.publicis.services.interfaces;

import com.sapeint.publicis.models.ProductQuatationRequest;
import com.sapeint.publicis.models.ProductQuatationResponse;

public interface IProductQuotationService {
    ProductQuatationResponse getPriceFromMerchants(ProductQuatationRequest productQuatationRequest);
}
