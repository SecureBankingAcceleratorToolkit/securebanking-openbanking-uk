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
package uk.org.openbanking.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBDomesticVRPControlParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-21T09:44:44.818881+01:00[Europe/London]")

public class OBDomesticVRPControlParameters {
    @JsonProperty("ValidFromDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime validFromDateTime;

    @JsonProperty("ValidToDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime validToDateTime;

    @JsonProperty("MaximumIndividualAmount")
    private OBDomesticVRPControlParametersMaximumIndividualAmount maximumIndividualAmount;

    @JsonProperty("PeriodicLimits")
    @Valid
    private List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits = null;

    @JsonProperty("VRPType")
    @Valid
    private List<String> vrPType = new ArrayList<String>();

    @JsonProperty("PSUAuthenticationMethods")
    @Valid
    private List<String> psUAuthenticationMethods = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData; // use existing OBSupplementaryData1 for Payments

    public OBDomesticVRPControlParameters validFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
        return this;
    }

    /**
     * ^ Start date time for which the consent remains valid. | ISODateTime
     *
     * @return validFromDateTime
     */
    @ApiModelProperty(value = "^ Start date time for which the consent remains valid. | ISODateTime")

    @Valid

    public DateTime getValidFromDateTime() {
        return validFromDateTime;
    }

    public void setValidFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
    }

    public OBDomesticVRPControlParameters validToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
        return this;
    }

    /**
     * ^ End date time for which the consent remains valid. | ISODateTime
     *
     * @return validToDateTime
     */
    @ApiModelProperty(value = "^ End date time for which the consent remains valid. | ISODateTime")

    @Valid

    public DateTime getValidToDateTime() {
        return validToDateTime;
    }

    public void setValidToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
    }

    public OBDomesticVRPControlParameters maximumIndividualAmount(OBDomesticVRPControlParametersMaximumIndividualAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
        return this;
    }

    /**
     * Get maximumIndividualAmount
     *
     * @return maximumIndividualAmount
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBDomesticVRPControlParametersMaximumIndividualAmount getMaximumIndividualAmount() {
        return maximumIndividualAmount;
    }

    public void setMaximumIndividualAmount(OBDomesticVRPControlParametersMaximumIndividualAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
    }

    public OBDomesticVRPControlParameters periodicLimits(List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits) {
        this.periodicLimits = periodicLimits;
        return this;
    }

    public OBDomesticVRPControlParameters addPeriodicLimitsItem(OBDomesticVRPControlParametersPeriodicLimits periodicLimitsItem) {
        if (this.periodicLimits == null) {
            this.periodicLimits = new ArrayList<OBDomesticVRPControlParametersPeriodicLimits>();
        }
        this.periodicLimits.add(periodicLimitsItem);
        return this;
    }

    /**
     * Get periodicLimits
     *
     * @return periodicLimits
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<OBDomesticVRPControlParametersPeriodicLimits> getPeriodicLimits() {
        return periodicLimits;
    }

    public void setPeriodicLimits(List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits) {
        this.periodicLimits = periodicLimits;
    }

    public OBDomesticVRPControlParameters vrPType(List<String> vrPType) {
        this.vrPType = vrPType;
        return this;
    }

    public OBDomesticVRPControlParameters addVrPTypeItem(String vrPTypeItem) {
        this.vrPType.add(vrPTypeItem);
        return this;
    }

    /**
     * ^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.  | OBVRPConsentType - Namespaced Enumeration
     *
     * @return vrPType
     */
    @ApiModelProperty(required = true, value = "^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.  | OBVRPConsentType - Namespaced Enumeration")
    @NotNull

    @Size(min = 1)
    public List<String> getVrPType() {
        return vrPType;
    }

    public void setVrPType(List<String> vrPType) {
        this.vrPType = vrPType;
    }

    public OBDomesticVRPControlParameters psUAuthenticationMethods(List<String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
        return this;
    }

    public OBDomesticVRPControlParameters addPsUAuthenticationMethodsItem(String psUAuthenticationMethodsItem) {
        if (this.psUAuthenticationMethods == null) {
            this.psUAuthenticationMethods = new ArrayList<String>();
        }
        this.psUAuthenticationMethods.add(psUAuthenticationMethodsItem);
        return this;
    }

    /**
     * ^ Indicates that the PSU authentication methods supported.  | OBVRPAuthenticationMethods - Namespaced Enumeration
     *
     * @return psUAuthenticationMethods
     */
    @ApiModelProperty(value = "^ Indicates that the PSU authentication methods supported.  | OBVRPAuthenticationMethods - Namespaced Enumeration")

    @Size(min = 1)
    public List<String> getPsUAuthenticationMethods() {
        return psUAuthenticationMethods;
    }

    public void setPsUAuthenticationMethods(List<String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
    }

    public OBDomesticVRPControlParameters supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * ^ Additional information that can not be captured in the structured fields and/or any other specific block
     *
     * @return supplementaryData
     */
    @ApiModelProperty(value = "^ Additional information that can not be captured in the structured fields and/or any other specific block")

    @Valid

    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPControlParameters obDomesticVRPControlParameters = (OBDomesticVRPControlParameters) o;
        return Objects.equals(this.validFromDateTime, obDomesticVRPControlParameters.validFromDateTime) &&
                Objects.equals(this.validToDateTime, obDomesticVRPControlParameters.validToDateTime) &&
                Objects.equals(this.maximumIndividualAmount, obDomesticVRPControlParameters.maximumIndividualAmount) &&
                Objects.equals(this.periodicLimits, obDomesticVRPControlParameters.periodicLimits) &&
                Objects.equals(this.vrPType, obDomesticVRPControlParameters.vrPType) &&
                Objects.equals(this.psUAuthenticationMethods, obDomesticVRPControlParameters.psUAuthenticationMethods) &&
                Objects.equals(this.supplementaryData, obDomesticVRPControlParameters.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validFromDateTime, validToDateTime, maximumIndividualAmount, periodicLimits, vrPType, psUAuthenticationMethods, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPControlParameters {\n");

        sb.append("    validFromDateTime: ").append(toIndentedString(validFromDateTime)).append("\n");
        sb.append("    validToDateTime: ").append(toIndentedString(validToDateTime)).append("\n");
        sb.append("    maximumIndividualAmount: ").append(toIndentedString(maximumIndividualAmount)).append("\n");
        sb.append("    periodicLimits: ").append(toIndentedString(periodicLimits)).append("\n");
        sb.append("    vrPType: ").append(toIndentedString(vrPType)).append("\n");
        sb.append("    psUAuthenticationMethods: ").append(toIndentedString(psUAuthenticationMethods)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

