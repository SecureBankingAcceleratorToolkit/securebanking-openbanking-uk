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
 * Event Subscription API Specification - ASPSP Endpoints
 * Swagger for Event Subscription API Specification - ASPSP Endpoints
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
import uk.org.openbanking.datamodel.account.Links;
import uk.org.openbanking.datamodel.account.Meta;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBEventSubscriptionResponse1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:49:38.894+01:00")
public class OBEventSubscriptionResponse1 {
    @JsonProperty("Data")
    private OBEventSubscriptionResponse1Data data = null;

    @JsonProperty("Links")
    private Links links = null;

    @JsonProperty("Meta")
    private Meta meta = null;

    public OBEventSubscriptionResponse1 data(OBEventSubscriptionResponse1Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBEventSubscriptionResponse1Data getData() {
        return data;
    }

    public void setData(OBEventSubscriptionResponse1Data data) {
        this.data = data;
    }

    public OBEventSubscriptionResponse1 links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    @Valid
    @ApiModelProperty(value = "")
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBEventSubscriptionResponse1 meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     **/
    @Valid
    @ApiModelProperty(value = "")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscriptionResponse1 obEventSubscriptionResponse1 = (OBEventSubscriptionResponse1) o;
        return Objects.equals(this.data, obEventSubscriptionResponse1.data) &&
                Objects.equals(this.links, obEventSubscriptionResponse1.links) &&
                Objects.equals(this.meta, obEventSubscriptionResponse1.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, links, meta);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscriptionResponse1 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

