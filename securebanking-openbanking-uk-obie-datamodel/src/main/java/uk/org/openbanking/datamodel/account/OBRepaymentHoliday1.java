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
 * OpenAPI spec version: v3.1.1
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

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of capital repayment holiday if any
 */
@ApiModel(description = "Details of capital repayment holiday if any")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBRepaymentHoliday1 {
    @JsonProperty("MaxHolidayLength")
    private Integer maxHolidayLength = null;

    @JsonProperty("MaxHolidayPeriod")
    private OBPeriod1Code maxHolidayPeriod = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    public OBRepaymentHoliday1 maxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
        return this;
    }

    /**
     * The maximum length/duration of a Repayment Holiday
     *
     * @return maxHolidayLength
     **/
    @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")
    public Integer getMaxHolidayLength() {
        return maxHolidayLength;
    }

    public void setMaxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
    }

    public OBRepaymentHoliday1 maxHolidayPeriod(OBPeriod1Code maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
        return this;
    }

    /**
     * Get maxHolidayPeriod
     *
     * @return maxHolidayPeriod
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPeriod1Code getMaxHolidayPeriod() {
        return maxHolidayPeriod;
    }

    public void setMaxHolidayPeriod(OBPeriod1Code maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
    }

    public OBRepaymentHoliday1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBRepaymentHoliday1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for adding details for repayment holiday
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Free text for adding details for repayment holiday")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRepaymentHoliday1 obRepaymentHoliday1 = (OBRepaymentHoliday1) o;
        return Objects.equals(this.maxHolidayLength, obRepaymentHoliday1.maxHolidayLength) &&
                Objects.equals(this.maxHolidayPeriod, obRepaymentHoliday1.maxHolidayPeriod) &&
                Objects.equals(this.notes, obRepaymentHoliday1.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxHolidayLength, maxHolidayPeriod, notes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRepaymentHoliday1 {\n");

        sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
        sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

