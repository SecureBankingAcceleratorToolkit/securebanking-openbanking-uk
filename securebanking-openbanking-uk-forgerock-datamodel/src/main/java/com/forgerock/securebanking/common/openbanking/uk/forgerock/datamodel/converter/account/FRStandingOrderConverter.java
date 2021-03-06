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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRStandingOrderData;
import uk.org.openbanking.datamodel.account.OBExternalStandingOrderStatus1Code;
import uk.org.openbanking.datamodel.account.OBStandingOrder1;
import uk.org.openbanking.datamodel.account.OBStandingOrder2;
import uk.org.openbanking.datamodel.account.OBStandingOrder3;
import uk.org.openbanking.datamodel.account.OBStandingOrder4;
import uk.org.openbanking.datamodel.account.OBStandingOrder5;
import uk.org.openbanking.datamodel.account.OBStandingOrder6;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountSupplementaryDataConverter.toOBSupplementaryData1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBCashAccount1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBCashAccount3;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBCashAccount5;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.toOBCashAccount51;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAmountConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toFRFinancialAgent;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification2;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification4;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification5;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification51;

public class FRStandingOrderConverter {

    // FR to OB
    public static OBStandingOrder1 toOBStandingOrder1(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder1()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFirstPaymentAmount()))
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .nextPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getNextPaymentAmount()))
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFinalPaymentAmount()))
                .servicer(toOBBranchAndFinancialInstitutionIdentification2(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount1(standingOrder.getCreditorAccount()));
    }

    public static OBStandingOrder2 toOBStandingOrder2(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder2()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFirstPaymentAmount()))
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .nextPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getNextPaymentAmount()))
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFinalPaymentAmount()))
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification2(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount1(standingOrder.getCreditorAccount()));
    }

    public static OBStandingOrder3 toOBStandingOrder3(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder3()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getNextPaymentAmount()))
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFinalPaymentAmount()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification4(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(standingOrder.getCreditorAccount()));
    }

    public static OBStandingOrder4 toOBStandingOrder4(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder4()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getNextPaymentAmount()))
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFinalPaymentAmount()))
                .supplementaryData(toOBSupplementaryData1(standingOrder.getSupplementaryData()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification4(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(standingOrder.getCreditorAccount()));
    }

    public static OBStandingOrder5 toOBStandingOrder5(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder5()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toAccountOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toAccountOBActiveOrHistoricCurrencyAndAmount(standingOrder.getNextPaymentAmount()))
                .finalPaymentAmount(toAccountOBActiveOrHistoricCurrencyAndAmount(standingOrder.getFinalPaymentAmount()))
                .supplementaryData(toOBSupplementaryData1(standingOrder.getSupplementaryData()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification5(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount5(standingOrder.getCreditorAccount()));
    }

    public static OBStandingOrder6 toOBStandingOrder6(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder6()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(standingOrder.getLastPaymentDateTime())
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .numberOfPayments(standingOrder.getNumberOfPayments())
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount2(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount3(standingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount11(standingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount4(standingOrder.getFinalPaymentAmount()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification51(standingOrder.getCreditorAgent()))
                .creditorAccount(toOBCashAccount51(standingOrder.getCreditorAccount()))
                .supplementaryData(toOBSupplementaryData1(standingOrder.getSupplementaryData()));
    }

    public static OBExternalStandingOrderStatus1Code toOBExternalStandingOrderStatus1Code(FRStandingOrderData.FRStandingOrderStatus standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : OBExternalStandingOrderStatus1Code.valueOf(standingOrderStatusCode.name());
    }

    // OB to FR
    public static FRStandingOrderData toFRStandingOrderData(OBStandingOrder5 obStandingOrder) {
        return obStandingOrder == null ? null : FRStandingOrderData.builder()
                .accountId(obStandingOrder.getAccountId())
                .standingOrderId(obStandingOrder.getStandingOrderId())
                .frequency(obStandingOrder.getFrequency())
                .reference(obStandingOrder.getReference())
                .firstPaymentDateTime(obStandingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(obStandingOrder.getNextPaymentDateTime())
                .finalPaymentDateTime(obStandingOrder.getFinalPaymentDateTime())
                .standingOrderStatusCode(toFRStandingOrderStatus(obStandingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toFRAmount(obStandingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toFRAmount(obStandingOrder.getNextPaymentAmount()))
                .finalPaymentAmount(toFRAmount(obStandingOrder.getFinalPaymentAmount()))
                .creditorAgent(toFRFinancialAgent(obStandingOrder.getCreditorAgent()))
                .creditorAccount(toFRAccountIdentifier(obStandingOrder.getCreditorAccount()))
                .supplementaryData(toFRSupplementaryData(obStandingOrder.getSupplementaryData()))
                .build();
    }

    public static FRStandingOrderData toFRStandingOrderData(OBStandingOrder6 obStandingOrder) {
        return obStandingOrder == null ? null : FRStandingOrderData.builder()
                .accountId(obStandingOrder.getAccountId())
                .standingOrderId(obStandingOrder.getStandingOrderId())
                .frequency(obStandingOrder.getFrequency())
                .reference(obStandingOrder.getReference())
                .firstPaymentDateTime(obStandingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(obStandingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(obStandingOrder.getLastPaymentDateTime())
                .finalPaymentDateTime(obStandingOrder.getFinalPaymentDateTime())
                .numberOfPayments(obStandingOrder.getNumberOfPayments())
                .standingOrderStatusCode(toFRStandingOrderStatus(obStandingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(toFRAmount(obStandingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(toFRAmount(obStandingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(toFRAmount(obStandingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(toFRAmount(obStandingOrder.getFinalPaymentAmount()))
                .creditorAgent(toFRFinancialAgent(obStandingOrder.getCreditorAgent()))
                .creditorAccount(toFRAccountIdentifier(obStandingOrder.getCreditorAccount()))
                .supplementaryData(toFRSupplementaryData(obStandingOrder.getSupplementaryData()))
                .build();
    }

    public static FRStandingOrderData.FRStandingOrderStatus toFRStandingOrderStatus(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : FRStandingOrderData.FRStandingOrderStatus.valueOf(standingOrderStatusCode.name());
    }
}
