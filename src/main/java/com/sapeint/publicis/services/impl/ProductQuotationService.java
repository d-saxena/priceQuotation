package com.sapeint.publicis.services.impl;

import com.sapeint.publicis.exceptions.UnservicableLocationException;
import com.sapeint.publicis.gateway.interfaces.IMerchantGatewayService;
import com.sapeint.publicis.models.ProductQuatationRequest;
import com.sapeint.publicis.models.ProductQuatationResponse;
import com.sapeint.publicis.repository.IProductQuotationRepository;
import com.sapeint.publicis.services.interfaces.IProductQuotationService;
import com.sapeint.publicis.services.interfaces.IValidateLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductQuotationService implements IProductQuotationService {

    @Autowired
    IProductQuotationRepository productQuotationRepository;

    @Autowired
    IValidateLocationService validateLocationService;

    @Autowired
    IMerchantGatewayService merchantGatewayService;

    @Override
    public ProductQuatationResponse getPriceFromMerchants(ProductQuatationRequest productQuatationRequest) {

        if(!validateLocationService.isLocationValid(productQuatationRequest.getShippingAddress().getX(), productQuatationRequest.getShippingAddress().getY())) {
            throw new UnservicableLocationException("Sorry this location is not serviceable");
        }

        //identify the merchants


        //Call to merchants
        return merchantGatewayService.getPricesFromMerchants(productQuatationRequest);


    }
}
