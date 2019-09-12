package com.losstname.oauth2.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-09-12.
 */
@Entity
class OauthClientToken implements Serializable{

    @Id
    String authenticationId

    String tokenId

    @Lob
    @Column(columnDefinition = "BLOB")
    byte[] token

    String userName

    String clientId

}
