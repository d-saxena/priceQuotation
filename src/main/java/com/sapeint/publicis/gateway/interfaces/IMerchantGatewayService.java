package com.sapeint.publicis.gateway.interfaces;

import com.sapeint.publicis.models.ProductQuatationRequest;
import com.sapeint.publicis.models.ProductQuatationResponse;

public interface IMerchantGatewayService {

    public ProductQuatationResponse getPricesFromMerchants(ProductQuatationRequest productQuatationRequest);
}
