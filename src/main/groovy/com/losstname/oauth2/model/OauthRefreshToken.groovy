package com.losstname.oauth2.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-09-12.
 */
@Entity
class OauthRefreshToken implements Serializable{

    @Id
    String tokenId

    @Lob
    @Column(columnDefinition = "BLOB")
    byte[] token

    @Lob
    @Column(columnDefinition = "BLOB")
    byte[] authentication

}
