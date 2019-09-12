package com.losstname.oauth2.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-09-12.
 */
@Entity
class OauthCode implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    String code

    @Lob
    @Column(columnDefinition = "BLOB")
    byte[] authentication

}
