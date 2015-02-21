package org.keycloak.protocol.oidc;

import org.keycloak.models.ClientSessionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.ProtocolMapperModel;
import org.keycloak.models.UserSessionModel;
import org.keycloak.representations.AccessToken;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface OIDCAccessTokenTransformer {

    AccessToken transformToken(AccessToken token, ProtocolMapperModel mappingModel, KeycloakSession session,
                               UserSessionModel userSession, ClientSessionModel clientSession);
}
