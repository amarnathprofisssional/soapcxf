package com.test.endpoint;

import org.example.testwsdlfile.TestWSDLFile;
import org.example.useroperationschema.AddCardRequest;
import org.example.useroperationschema.AddCardResponse;
import org.example.useroperationschema.UserOperationRequest;
import org.example.useroperationschema.UserOperationResponse;

import javax.jws.WebParam;

public class TestWSDLEndPoint implements TestWSDLFile {

    @Override
    public UserOperationResponse newOperation(@WebParam(name = "UserOperationRequest",
            targetNamespace = "http://www.example.org/TestWSDLFile/", partName = "parameters")
                                                          UserOperationRequest parameters) {
        AddCardRequest addCardRequest = (AddCardRequest) parameters;
        String str = addCardRequest.getTest1();
        System.out.println("str: " + str);
        AddCardResponse cardResponse = new AddCardResponse();
        cardResponse.setTest2("Welcome");
        return cardResponse;
    }
}
