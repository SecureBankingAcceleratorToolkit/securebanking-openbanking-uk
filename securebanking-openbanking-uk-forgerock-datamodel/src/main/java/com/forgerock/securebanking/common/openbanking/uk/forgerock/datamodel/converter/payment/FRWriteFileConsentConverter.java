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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteFileConsent;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteFileConsentData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteFileDataInitiation;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter;
import uk.org.openbanking.datamodel.payment.OBFile1;
import uk.org.openbanking.datamodel.payment.OBFile2;
import uk.org.openbanking.datamodel.payment.OBWriteDataFileConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteDataFileConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteFile2DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3Data;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBCashAccount3;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRDataAuthorisationConverter.toFRDataAuthorisation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRRemittanceInformationConverter.toFRRemittanceInformation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRRemittanceInformationConverter.toOBRemittanceInformation1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRPaymentSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRPaymentSupplementaryDataConverter.toOBSupplementaryData1;

public class FRWriteFileConsentConverter {

    // OB to FR
    public static FRWriteFileConsent toFRWriteFileConsent(OBWriteFileConsent1 obWriteFileConsent1) {
        return obWriteFileConsent1 == null ? null : FRWriteFileConsent.builder()
                .data(toFRWriteFileConsentData(obWriteFileConsent1.getData()))
                .build();
    }

    public static FRWriteFileConsent toFRWriteFileConsent(OBWriteFileConsent2 obWriteFileConsent2) {
        return obWriteFileConsent2 == null ? null : FRWriteFileConsent.builder()
                .data(toFRWriteFileConsentData(obWriteFileConsent2.getData()))
                .build();
    }

    public static FRWriteFileConsent toFRWriteFileConsent(OBWriteFileConsent3 obWriteFileConsent3) {
        return obWriteFileConsent3 == null ? null : FRWriteFileConsent.builder()
                .data(toFRWriteFileConsentData(obWriteFileConsent3.getData()))
                .build();
    }

    public static FRWriteFileConsentData toFRWriteFileConsentData(OBWriteDataFileConsent1 data) {
        return data == null ? null : FRWriteFileConsentData.builder()
                .initiation(toFRWriteFileDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .build();
    }

    public static FRWriteFileConsentData toFRWriteFileConsentData(OBWriteDataFileConsent2 data) {
        return data == null ? null : FRWriteFileConsentData.builder()
                .initiation(toFRWriteFileDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .build();
    }

    public static FRWriteFileConsentData toFRWriteFileConsentData(OBWriteFileConsent3Data data) {
        return data == null ? null : FRWriteFileConsentData.builder()
                .initiation(toFRWriteFileDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteFileDataInitiation toFRWriteFileDataInitiation(OBFile1 initiation) {
        return initiation == null ? null : FRWriteFileDataInitiation.builder()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .build();
    }

    public static FRWriteFileDataInitiation toFRWriteFileDataInitiation(OBFile2 initiation) {
        return initiation == null ? null : FRWriteFileDataInitiation.builder()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    public static FRWriteFileDataInitiation toFRWriteFileDataInitiation(OBWriteFile2DataInitiation initiation) {
        return initiation == null ? null : FRWriteFileDataInitiation.builder()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    // FR to OB
    public static OBWriteFile2DataInitiation toOBWriteFile2DataInitiation(FRWriteFileDataInitiation initiation) {
        return initiation == null ? null : new OBWriteFile2DataInitiation()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBFile1 toOBFile1(FRWriteFileDataInitiation initiation) {
        return initiation == null ? null : new OBFile1()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBFile2 toOBFile2(FRWriteFileDataInitiation initiation) {
        return initiation == null ? null : new OBFile2()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(initiation.getSupplementaryData()));
    }
}
