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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBEventSubscriptionResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:49:38.894+01:00")
public class OBEventSubscriptionResponse1Data {
    @JsonProperty("EventSubscriptionId")
    private String eventSubscriptionId = null;

    @JsonProperty("CallbackUrl")
    private String callbackUrl = null;

    @JsonProperty("Version")
    private String version = null;

    @JsonProperty("EventTypes")
    private List<String> eventTypes = null;

    public OBEventSubscriptionResponse1Data eventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.
     *
     * @return eventSubscriptionId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.")
    public String getEventSubscriptionId() {
        return eventSubscriptionId;
    }

    public void setEventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
    }

    public OBEventSubscriptionResponse1Data callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
     *
     * @return callbackUrl
     **/
    @ApiModelProperty(value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public OBEventSubscriptionResponse1Data version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @NotNull
    @Size(min = 1, max = 10)
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OBEventSubscriptionResponse1Data eventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public OBEventSubscriptionResponse1Data addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<String>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    /**
     * Get eventTypes
     *
     * @return eventTypes
     **/
    @ApiModelProperty(value = "")
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscriptionResponse1Data obEventSubscriptionResponse1Data = (OBEventSubscriptionResponse1Data) o;
        return Objects.equals(this.eventSubscriptionId, obEventSubscriptionResponse1Data.eventSubscriptionId) &&
                Objects.equals(this.callbackUrl, obEventSubscriptionResponse1Data.callbackUrl) &&
                Objects.equals(this.version, obEventSubscriptionResponse1Data.version) &&
                Objects.equals(this.eventTypes, obEventSubscriptionResponse1Data.eventTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubscriptionId, callbackUrl, version, eventTypes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscriptionResponse1Data {\n");

        sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

