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
 * Aggregated Event Polling API Specification
 * Swagger for Aggregated Event Polling API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBEventPolling1SetErrs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:58:23.513+01:00")
public class OBEventPolling1SetErrs {
    @JsonProperty("err")
    private String err = null;

    @JsonProperty("description")
    private String description = null;

    public OBEventPolling1SetErrs err(String err) {
        this.err = err;
        return this;
    }

    /**
     * A value from the IANA \&quot;Security Event Token Delivery Error Codes\&quot; registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
     *
     * @return err
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes")
    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public OBEventPolling1SetErrs description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A human-readable string that provides additional diagnostic information
     *
     * @return description
     **/
    @NotNull
    @Size(min = 1, max = 256)
    @ApiModelProperty(required = true, value = "A human-readable string that provides additional diagnostic information")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPolling1SetErrs obEventPolling1SetErrs = (OBEventPolling1SetErrs) o;
        return Objects.equals(this.err, obEventPolling1SetErrs.err) &&
                Objects.equals(this.description, obEventPolling1SetErrs.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(err, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPolling1SetErrs {\n");

        sb.append("    err: ").append(toIndentedString(err)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

