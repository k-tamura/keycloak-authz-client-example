package org.t246osslab;

import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.representations.idm.authorization.AuthorizationRequest;
import org.keycloak.representations.idm.authorization.AuthorizationResponse;

public class KeycloakAuthzClientExample {

    public static void main(String[] args) {

        AuthzClient authzClient = AuthzClient.create();
        AuthorizationRequest request = new AuthorizationRequest();
        AuthorizationResponse response = authzClient.authorization("admin", "password")
                .authorize(request);
        String token = response.getToken();
        System.out.println(token);
    }
}
