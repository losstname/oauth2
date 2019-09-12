package com.losstname.oauth2.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-09-12.
 */
@Entity
class OauthClientDetails implements Serializable{

    @Id
    String clientId

    String resourceIds

    String clientSecret

    String scope

    String authorizedGrantTypes

    String webServerRedirectUri

    String authorities

    Integer accessTokenValidity

    Integer refreshTokenValidity

    @Column(length = 4096)
    String additionalInformation

    String autoapprove

}
