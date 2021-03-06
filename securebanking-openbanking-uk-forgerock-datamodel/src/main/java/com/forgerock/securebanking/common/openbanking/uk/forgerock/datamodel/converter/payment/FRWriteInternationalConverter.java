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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteInternational;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteInternationalData;
import uk.org.openbanking.datamodel.payment.OBWriteDataInternational1;
import uk.org.openbanking.datamodel.payment.OBWriteDataInternational2;
import uk.org.openbanking.datamodel.payment.OBWriteInternational1;
import uk.org.openbanking.datamodel.payment.OBWriteInternational2;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3Data;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRPaymentRiskConverter.toFRRisk;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRPaymentRiskConverter.toOBRisk1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRWriteInternationalConsentConverter.*;

public class FRWriteInternationalConverter {

    // OB to FR
    public static FRWriteInternational toFRWriteInternational(OBWriteInternational1 internationalPayment) {
        return internationalPayment == null ? null : FRWriteInternational.builder()
                .data(toFRWriteInternationalData(internationalPayment.getData()))
                .risk(toFRRisk(internationalPayment.getRisk()))
                .build();
    }

    public static FRWriteInternational toFRWriteInternational(OBWriteInternational2 internationalPayment) {
        return internationalPayment == null ? null : FRWriteInternational.builder()
                .data(toFRWriteInternationalData(internationalPayment.getData()))
                .risk(toFRRisk(internationalPayment.getRisk()))
                .build();
    }

    public static FRWriteInternational toFRWriteInternational(OBWriteInternational3 internationalPayment) {
        return internationalPayment == null ? null : FRWriteInternational.builder()
                .data(toFRWriteInternationalData(internationalPayment.getData()))
                .risk(toFRRisk(internationalPayment.getRisk()))
                .build();
    }

    public static FRWriteInternationalData toFRWriteInternationalData(OBWriteDataInternational1 data) {
        return data == null ? null : FRWriteInternationalData.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteInternationalDataInitiation(data.getInitiation()))
                .build();
    }

    public static FRWriteInternationalData toFRWriteInternationalData(OBWriteDataInternational2 data) {
        return data == null ? null : FRWriteInternationalData.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteInternationalDataInitiation(data.getInitiation()))
                .build();
    }

    public static FRWriteInternationalData toFRWriteInternationalData(OBWriteInternational3Data data) {
        return data == null ? null : FRWriteInternationalData.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteInternationalDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteInternational2 toOBWriteInternational2(FRWriteInternational internationalPayment) {
        return internationalPayment == null ? null : new OBWriteInternational2()
                .data(toOBWriteDataInternational2(internationalPayment.getData()))
                .risk(toOBRisk1(internationalPayment.getRisk()));
    }

    public static OBWriteDataInternational2 toOBWriteDataInternational2(FRWriteInternationalData data) {
        return data == null ? null : new OBWriteDataInternational2()
                .consentId(data.getConsentId())
                .initiation(toOBInternational2(data.getInitiation()));
    }

    public static OBWriteInternational3 toOBWriteInternational3(FRWriteInternational internationalPayment) {
        return internationalPayment == null ? null : new OBWriteInternational3()
                .data(toOBWriteInternational3Data(internationalPayment.getData()))
                .risk(toOBRisk1(internationalPayment.getRisk()));
    }

    public static OBWriteInternational3Data toOBWriteInternational3Data(FRWriteInternationalData data) {
        return data == null ? null : new OBWriteInternational3Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()));
    }
}
