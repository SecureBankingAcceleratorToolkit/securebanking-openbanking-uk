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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRTransactionData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRTransactionData.FRBankTransactionCodeStructure;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRTransactionData.FRProprietaryBankTransactionCodeStructure;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRTransactionData.FRTransactionCashBalance;
import uk.org.openbanking.datamodel.account.*;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification3;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification6;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification61;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification62;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRAccountSupplementaryDataConverter.toOBSupplementaryData1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRCashBalanceConverter.toFRBalanceType;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRCashBalanceConverter.toOBBalanceType1Code;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRCreditDebitIndicatorConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRCurrencyExchangeConverter.toFRCurrencyExchange;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account.FRCurrencyExchangeConverter.toOBCurrencyExchange5;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAccountIdentifierConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAmountConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toFRFinancialAgent;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification2;

public class FRTransactionConverter {

    // FR to OB
    public static OBTransaction1 toOBTransaction1(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction1()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .amount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getAmount()))
                .creditDebitIndicator(toOBCreditDebitCode(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .transactionInformation(transaction.getTransactionInformation())
                .addressLine(transaction.getAddressLine())
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toProprietaryBankTransactionCodeStructure1(transaction.getProprietaryBankTransactionCode()))
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()));
    }

    public static OBTransaction2 toOBTransaction2(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction2()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .amount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getAmount()))
                .creditDebitIndicator(toOBCreditDebitCode(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .addressLine(transaction.getAddressLine())
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toProprietaryBankTransactionCodeStructure1(transaction.getProprietaryBankTransactionCode()))
                .equivalentAmount(null)
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification2(transaction.getCreditorAgent()))
                .debtorAgent(toOBBranchAndFinancialInstitutionIdentification2(transaction.getDebtorAgent()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .transactionInformation(transaction.getTransactionInformation())
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAccount(toOBCashAccount2(transaction.getCreditorAccount()))
                .debtorAccount(FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification2(transaction.getDebtorAccount()));
    }

    public static OBTransaction3 toOBTransaction3(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction3()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .creditDebitIndicator(toOBCreditDebitCode(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .addressLine(transaction.getAddressLine())
                .amount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getAmount()))
                .chargeAmount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getChargeAmount()))
                .currencyExchange(toOBCurrencyExchange5(transaction.getCurrencyExchange()))
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toOBTransaction3ProprietaryBankTransactionCode(transaction.getProprietaryBankTransactionCode()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(transaction.getCreditorAgent()))
                .debtorAgent(toOBBranchAndFinancialInstitutionIdentification3(transaction.getDebtorAgent()))
                .debtorAccount(toOBCashAccount3(transaction.getDebtorAccount()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .transactionInformation(transaction.getTransactionInformation())
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAccount(toOBCashAccount3(transaction.getCreditorAccount()));
    }

    public static OBTransaction4 toOBTransaction4(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction4()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .creditDebitIndicator(toOBCreditDebitCode(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .addressLine(transaction.getAddressLine())
                .amount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getAmount()))
                .chargeAmount(toOBActiveOrHistoricCurrencyAndAmount(transaction.getChargeAmount()))
                .currencyExchange(toOBCurrencyExchange5(transaction.getCurrencyExchange()))
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toOBTransaction3ProprietaryBankTransactionCode(transaction.getProprietaryBankTransactionCode()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .supplementaryData(toOBSupplementaryData1(transaction.getSupplementaryData()))
                .transactionInformation(transaction.getTransactionInformation())
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(transaction.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(transaction.getCreditorAccount()))
                .debtorAgent(toOBBranchAndFinancialInstitutionIdentification3(transaction.getDebtorAgent()))
                .debtorAccount(toOBCashAccount3(transaction.getDebtorAccount()));
    }

    public static OBTransaction5 toOBTransaction5(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction5()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .creditDebitIndicator(toOBTransaction5CreditDebitIndicatorEnum(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .addressLine(transaction.getAddressLine())
                .amount(toAccountOBActiveOrHistoricCurrencyAndAmount(transaction.getAmount()))
                .chargeAmount(toAccountOBActiveOrHistoricCurrencyAndAmount(transaction.getChargeAmount()))
                .currencyExchange(toOBCurrencyExchange5(transaction.getCurrencyExchange()))
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toOBTransaction5ProprietaryBankTransactionCode(transaction.getProprietaryBankTransactionCode()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .supplementaryData(toOBSupplementaryData1(transaction.getSupplementaryData()))
                .transactionInformation(transaction.getTransactionInformation())
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification6(transaction.getCreditorAgent()))
                .creditorAccount(toOBCashAccount6(transaction.getCreditorAccount()))
                .debtorAgent(toOBBranchAndFinancialInstitutionIdentification6(transaction.getDebtorAgent()))
                .debtorAccount(toOBCashAccount6(transaction.getDebtorAccount()));
    }

    public static OBTransaction6 toOBTransaction6(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction6()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .creditDebitIndicator(toOBCreditDebitCode1(transaction.getCreditDebitIndicator()))
                .status(toOBEntryStatus1Code(transaction.getStatus()))
                .transactionMutability(toOBTransactionMutability1Code(transaction.getTransactionMutability()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .transactionInformation(transaction.getTransactionInformation())
                .addressLine(transaction.getAddressLine())
                .amount(toOBActiveOrHistoricCurrencyAndAmount9(transaction.getAmount()))
                .chargeAmount(toOBActiveOrHistoricCurrencyAndAmount10(transaction.getChargeAmount()))
                .currencyExchange(toOBCurrencyExchange5(transaction.getCurrencyExchange()))
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toProprietaryBankTransactionCodeStructure1(transaction.getProprietaryBankTransactionCode()))
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification61(transaction.getCreditorAgent()))
                .creditorAccount(toOBCashAccount60(transaction.getCreditorAccount()))
                .debtorAgent(toOBBranchAndFinancialInstitutionIdentification62(transaction.getDebtorAgent()))
                .debtorAccount(toOBCashAccount61(transaction.getDebtorAccount()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .supplementaryData(toOBSupplementaryData1(transaction.getSupplementaryData()));
    }

    public static OBEntryStatus1Code toOBEntryStatus1Code(FRTransactionData.FREntryStatus status) {
        return status == null ? null : OBEntryStatus1Code.valueOf(status.name());
    }

    public static OBTransactionMutability1Code toOBTransactionMutability1Code(FRTransactionData.FRTransactionMutability transactionMutability) {
        return transactionMutability == null ? null : OBTransactionMutability1Code.valueOf(transactionMutability.name());
    }

    public static OBBankTransactionCodeStructure1 toOBBankTransactionCodeStructure1(FRBankTransactionCodeStructure transactionCode) {
        return transactionCode == null ? null : new OBBankTransactionCodeStructure1()
                .code(transactionCode.getCode())
                .subCode(transactionCode.getSubCode());
    }

    public static ProprietaryBankTransactionCodeStructure1 toProprietaryBankTransactionCodeStructure1(FRProprietaryBankTransactionCodeStructure proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : new ProprietaryBankTransactionCodeStructure1()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer());
    }

    public static OBTransaction3ProprietaryBankTransactionCode toOBTransaction3ProprietaryBankTransactionCode(FRProprietaryBankTransactionCodeStructure proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : new OBTransaction3ProprietaryBankTransactionCode()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer());
    }

    public static OBTransaction5ProprietaryBankTransactionCode toOBTransaction5ProprietaryBankTransactionCode(FRProprietaryBankTransactionCodeStructure proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : new OBTransaction5ProprietaryBankTransactionCode()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer());
    }

    public static OBTransactionCardInstrument1 toOBTransactionCardInstrument1(FRTransactionData.FRTransactionCardInstrument cardInstrument) {
        return cardInstrument == null ? null : new OBTransactionCardInstrument1()
                .cardSchemeName(toOBTransactionCardInstrument1CardSchemeName(cardInstrument.getCardSchemeName()))
                .authorisationType(toOBTransactionCardInstrument1AuthorisationType(cardInstrument.getAuthorisationType()))
                .name(cardInstrument.getName())
                .identification(cardInstrument.getIdentification());
    }

    public static OBTransactionCashBalance toOBTransactionCashBalance(FRTransactionCashBalance balance) {
        return balance == null ? null : new OBTransactionCashBalance()
                .amount(toOBTransactionCashBalanceAmount(balance.getAmount()))
                .creditDebitIndicator(toOBCreditDebitCode2(balance.getCreditDebitIndicator()))
                .type(toOBBalanceType1Code(balance.getType()));
    }

    public static OBMerchantDetails1 toOBMerchantDetails1(FRTransactionData.FRMerchantDetails merchantDetails) {
        return merchantDetails == null ? null : new OBMerchantDetails1()
                .merchantName(merchantDetails.getMerchantName())
                .merchantCategoryCode(merchantDetails.getMerchantCategoryCode());
    }

    public static OBExternalCardSchemeType1Code toOBExternalCardSchemeType1Code(FRTransactionData.FRCardScheme cardSchemeName) {
        return cardSchemeName == null ? null : OBExternalCardSchemeType1Code.valueOf(cardSchemeName.name());
    }

    public static OBTransactionCardInstrument1.CardSchemeNameEnum toOBTransactionCardInstrument1CardSchemeName(FRTransactionData.FRCardScheme cardSchemeName) {
        return cardSchemeName == null ? null : OBTransactionCardInstrument1.CardSchemeNameEnum.valueOf(cardSchemeName.name());
    }

    public static OBExternalCardAuthorisationType1Code toOBExternalCardAuthorisationType1Code(FRTransactionData.FRCardAuthorisationType authorisationType) {
        return authorisationType == null ? null : OBExternalCardAuthorisationType1Code.valueOf(authorisationType.name());
    }

    public static OBTransactionCardInstrument1.AuthorisationTypeEnum toOBTransactionCardInstrument1AuthorisationType(FRTransactionData.FRCardAuthorisationType authorisationType) {
        return authorisationType == null ? null : OBTransactionCardInstrument1.AuthorisationTypeEnum.valueOf(authorisationType.name());
    }

    // OB to FR
    public static FRTransactionData toFRTransactionData(OBTransaction5 transaction) {
        return transaction == null ? null : FRTransactionData.builder()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReferences(transaction.getStatementReference())
                .creditDebitIndicator(toFRCreditDebitIndicator(transaction.getCreditDebitIndicator()))
                .status(toFREntryStatus(transaction.getStatus()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .addressLine(transaction.getAddressLine())
                .amount(toFRAmount(transaction.getAmount()))
                .chargeAmount(toFRAmount(transaction.getChargeAmount()))
                .currencyExchange(toFRCurrencyExchange(transaction.getCurrencyExchange()))
                .bankTransactionCode(toFRBankTransactionCodeStructure(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toFRProprietaryBankTransactionCodeStructure(transaction.getProprietaryBankTransactionCode()))
                .cardInstrument(toFRTransactionCardInstrument(transaction.getCardInstrument()))
                .supplementaryData(toFRSupplementaryData(transaction.getSupplementaryData()))
                .transactionInformation(transaction.getTransactionInformation())
                .balance(toFRTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toFRMerchantDetails(transaction.getMerchantDetails()))
                .creditorAgent(toFRFinancialAgent(transaction.getCreditorAgent()))
                .creditorAccount(toFRAccountIdentifier(transaction.getCreditorAccount()))
                .debtorAgent(toFRFinancialAgent(transaction.getDebtorAgent()))
                .debtorAccount(toFRAccountIdentifier(transaction.getDebtorAccount()))
                .build();
    }

    public static FRTransactionData toFRTransactionData(OBTransaction6 transaction) {
        return transaction == null ? null : FRTransactionData.builder()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReferences(transaction.getStatementReference())
                .creditDebitIndicator(toFRCreditDebitIndicator(transaction.getCreditDebitIndicator()))
                .status(toFREntryStatus(transaction.getStatus()))
                .transactionMutability(toFRTransactionMutability(transaction.getTransactionMutability()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .transactionInformation(transaction.getTransactionInformation())
                .addressLine(transaction.getAddressLine())
                .amount(toFRAmount(transaction.getAmount()))
                .chargeAmount(toFRAmount(transaction.getChargeAmount()))
                .currencyExchange(toFRCurrencyExchange(transaction.getCurrencyExchange()))
                .bankTransactionCode(toFRBankTransactionCodeStructure(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toFRProprietaryBankTransactionCodeStructure(transaction.getProprietaryBankTransactionCode()))
                .balance(toFRTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toFRMerchantDetails(transaction.getMerchantDetails()))
                .creditorAgent(toFRFinancialAgent(transaction.getCreditorAgent()))
                .creditorAccount(toFRAccountIdentifier(transaction.getCreditorAccount()))
                .debtorAgent(toFRFinancialAgent(transaction.getDebtorAgent()))
                .debtorAccount(toFRAccountIdentifier(transaction.getDebtorAccount()))
                .cardInstrument(toFRTransactionCardInstrument(transaction.getCardInstrument()))
                .supplementaryData(toFRSupplementaryData(transaction.getSupplementaryData()))
                .build();
    }

    public static FRTransactionData.FREntryStatus toFREntryStatus(OBEntryStatus1Code status) {
        return status == null ? null : FRTransactionData.FREntryStatus.valueOf(status.name());
    }

    public static FRTransactionData.FRTransactionMutability toFRTransactionMutability(OBTransactionMutability1Code transactionMutability) {
        return transactionMutability == null ? null : FRTransactionData.FRTransactionMutability.valueOf(transactionMutability.name());
    }

    public static FRBankTransactionCodeStructure toFRBankTransactionCodeStructure(OBBankTransactionCodeStructure1 transactionCode) {
        return transactionCode == null ? null : FRBankTransactionCodeStructure.builder()
                .code(transactionCode.getCode())
                .subCode(transactionCode.getSubCode())
                .build();
    }

    private static FRProprietaryBankTransactionCodeStructure toFRProprietaryBankTransactionCodeStructure(OBTransaction5ProprietaryBankTransactionCode proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : FRProprietaryBankTransactionCodeStructure.builder()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer())
                .build();
    }

    public static FRProprietaryBankTransactionCodeStructure toFRProprietaryBankTransactionCodeStructure(ProprietaryBankTransactionCodeStructure1 proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : FRProprietaryBankTransactionCodeStructure.builder()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer())
                .build();
    }

    public static FRTransactionCashBalance toFRTransactionCashBalance(OBTransactionCashBalance balance) {
        return balance == null ? null : FRTransactionCashBalance.builder()
                .amount(toFRAmount(balance.getAmount()))
                .creditDebitIndicator(toFRCreditDebitIndicator(balance.getCreditDebitIndicator()))
                .type(toFRBalanceType(balance.getType()))
                .build();
    }

    public static FRTransactionData.FRMerchantDetails toFRMerchantDetails(OBMerchantDetails1 merchantDetails) {
        return merchantDetails == null ? null : FRTransactionData.FRMerchantDetails.builder()
                .merchantName(merchantDetails.getMerchantName())
                .merchantCategoryCode(merchantDetails.getMerchantCategoryCode())
                .build();
    }


    public static FRTransactionData.FRTransactionCardInstrument toFRTransactionCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        return cardInstrument == null ? null : FRTransactionData.FRTransactionCardInstrument.builder()
                .cardSchemeName(toFRCardScheme(cardInstrument.getCardSchemeName()))
                .authorisationType(toFRCardAuthorisationType(cardInstrument.getAuthorisationType()))
                .name(cardInstrument.getName())
                .identification(cardInstrument.getIdentification())
                .build();
    }

    public static FRTransactionData.FRCardScheme toFRCardScheme(OBExternalCardSchemeType1Code cardSchemeName) {
        return cardSchemeName == null ? null : FRTransactionData.FRCardScheme.valueOf(cardSchemeName.name());
    }

    public static FRTransactionData.FRCardScheme toFRCardScheme(OBTransactionCardInstrument1.CardSchemeNameEnum cardSchemeName) {
        return cardSchemeName == null ? null : FRTransactionData.FRCardScheme.valueOf(cardSchemeName.name());
    }

    public static FRTransactionData.FRCardAuthorisationType toFRCardAuthorisationType(OBExternalCardAuthorisationType1Code authorisationType) {
        return authorisationType == null ? null : FRTransactionData.FRCardAuthorisationType.valueOf(authorisationType.name());
    }

    public static FRTransactionData.FRCardAuthorisationType toFRCardAuthorisationType(OBTransactionCardInstrument1.AuthorisationTypeEnum authorisationType) {
        return authorisationType == null ? null : FRTransactionData.FRCardAuthorisationType.valueOf(authorisationType.name());
    }
}
