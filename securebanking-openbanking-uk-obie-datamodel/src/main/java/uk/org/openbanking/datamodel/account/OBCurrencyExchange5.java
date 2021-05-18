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
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Set of elements used to provide details on the currency exchange.
 */
@ApiModel(description = "Set of elements used to provide details on the currency exchange.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBCurrencyExchange5 {
    @JsonProperty("ContractIdentification")
    private String contractIdentification = null;

    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate = null;

    @JsonProperty("InstructedAmount")
    private OBCurrencyExchange5InstructedAmount instructedAmount = null;

    @JsonProperty("QuotationDate")
    private DateTime quotationDate = null;

    @JsonProperty("SourceCurrency")
    private String sourceCurrency = null;

    @JsonProperty("TargetCurrency")
    private String targetCurrency = null;

    @JsonProperty("UnitCurrency")
    private String unitCurrency = null;

    public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique identification to unambiguously identify the foreign exchange contract.
     * @return contractIdentification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique identification to unambiguously identify the foreign exchange contract.")
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate &#x3D; UnitCurrency/QuotedCurrency).
     * @return exchangeRate
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     * @return instructedAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBCurrencyExchange5 quotationDate(DateTime quotationDate) {
        this.quotationDate = quotationDate;
        return this;
    }

    /**
     * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return quotationDate
     **/
    @ApiModelProperty(value = "Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(DateTime quotationDate) {
        this.quotationDate = quotationDate;
    }

    public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
        return this;
    }

    /**
     * Currency from which an amount is to be converted in a currency conversion.
     * @return sourceCurrency
     **/
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
        return this;
    }

    /**
     * Currency into which an amount is to be converted in a currency conversion.
     * @return targetCurrency
     **/
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(value = "Currency into which an amount is to be converted in a currency conversion.")
    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP.
     * @return unitCurrency
     **/
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
        return Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
                Objects.equals(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
                Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount) &&
                Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
                Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
                Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
                Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractIdentification, exchangeRate, instructedAmount, quotationDate, sourceCurrency, targetCurrency, unitCurrency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCurrencyExchange5 {\n");

        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
        sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
        sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
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

