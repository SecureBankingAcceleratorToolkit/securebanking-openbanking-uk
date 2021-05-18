/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.5
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadDataTransaction6
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:46:29.699+01:00")
public class OBReadDataTransaction6 {
    @JsonProperty("Transaction")
    private List<OBTransaction6> transaction = null;

    public OBReadDataTransaction6 transaction(List<OBTransaction6> transaction) {
        this.transaction = transaction;
        return this;
    }

    public OBReadDataTransaction6 addTransactionItem(OBTransaction6 transactionItem) {
        if (this.transaction == null) {
            this.transaction = new ArrayList<OBTransaction6>();
        }
        this.transaction.add(transactionItem);
        return this;
    }

    /**
     * Get transaction
     *
     * @return transaction
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBTransaction6> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<OBTransaction6> transaction) {
        this.transaction = transaction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataTransaction6 obReadDataTransaction6 = (OBReadDataTransaction6) o;
        return Objects.equals(this.transaction, obReadDataTransaction6.transaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataTransaction6 {\n");

        sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

