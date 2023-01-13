package com.sapeint.publicis.gateway.impl;

import com.sapeint.publicis.gateway.interfaces.IMerchantGatewayService;
import com.sapeint.publicis.models.ProductQuatationRequest;
import com.sapeint.publicis.models.ProductQuatationResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MerchantGatewayService implements IMerchantGatewayService {

    @Override
    public ProductQuatationResponse getPricesFromMerchants(ProductQuatationRequest productQuatationRequest) {
        RestTemplate rt = new RestTemplate();
        return rt.getForObject("http://", ProductQuatationResponse.class);

    }
}
