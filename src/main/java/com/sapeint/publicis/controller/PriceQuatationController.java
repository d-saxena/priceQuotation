package com.sapeint.publicis.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapeint.publicis.models.ProductQuatationRequest;
import com.sapeint.publicis.models.ProductQuatationResponse;
import com.sapeint.publicis.services.interfaces.IProductQuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productQuatation")
public class PriceQuatationController {

    @Autowired
    IProductQuotationService productQuotationService;

    public static final Logger log = LoggerFactory.getLogger(PriceQuatationController.class);

    @RequestMapping
    //public ResponseEntity<ProductQuatationResponse> getPriceFromMerchants(@RequestBody ProductQuatationRequest productQuatationRequest) throws JsonProcessingException {
    public ResponseEntity<ProductQuatationResponse> getPriceFromMerchants() throws JsonProcessingException {
        /*if(log.isDebugEnabled()) {
            log.debug("Request to IProductQuotationService:" + new ObjectMapper().writeValueAsString(productQuatationRequest));
        }*/

        //ProductQuatationResponse priceFromMerchants = productQuotationService.getPriceFromMerchants(productQuatationRequest);
        ProductQuatationResponse priceFromMerchants = new ProductQuatationResponse(null, "123",null);

        if(log.isDebugEnabled()) {
            log.debug("Response from IProductQuotationService:" + new ObjectMapper().writeValueAsString(priceFromMerchants));
        }

        return new ResponseEntity<>(priceFromMerchants, HttpStatus.OK);
    }
}
