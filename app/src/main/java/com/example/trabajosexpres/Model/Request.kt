/**
 * Jobs Express
 * This is a sample Express Jobs server. You can find out more about Express Jobs at [https://drive.google.com/drive/folders/1VyQ8tqiA7Q2J0zhWDIwg581wJdBFusmK?usp=sharing)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@ExpressJobs.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.example.trabajosexpres.Model

/**
 *
 * @param address client address
 * @param date Date the service is to be performed
 * @param requestStatus status of request
 * @param time Time the service is to be performed
 * @param trouble problem to solve
 * @param memberATE
 */
data class Request (

        val idRequest: Int ,
        /* client address */
        val address: kotlin.String,
        /* Date the service is to be performed */
        val date: String,
        /* status of request */
        val requestStatus: Int,
        /* Time the service is to be performed */
        val time: kotlin.String,
        /* problem to solve */
        val trouble: kotlin.String,
        val idMemberATE: Int,
        val idService: Int
)