package com.losstname.oauth2.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-09-12.
 */

@Entity
class OauthApprovals implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    String userid

    String clientid

    String scope

    String status

    Date expiresat

    Date lastmodifiedat
}
