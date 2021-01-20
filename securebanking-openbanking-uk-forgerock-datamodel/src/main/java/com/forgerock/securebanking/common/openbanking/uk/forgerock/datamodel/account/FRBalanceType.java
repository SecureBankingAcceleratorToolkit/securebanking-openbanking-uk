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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account;

import java.util.stream.Stream;

public enum FRBalanceType {
    CLOSINGAVAILABLE("ClosingAvailable"),
    CLOSINGBOOKED("ClosingBooked"),
    CLOSINGCLEARED("ClosingCleared"),
    EXPECTED("Expected"),
    FORWARDAVAILABLE("ForwardAvailable"),
    INFORMATION("Information"),
    INTERIMAVAILABLE("InterimAvailable"),
    INTERIMBOOKED("InterimBooked"),
    INTERIMCLEARED("InterimCleared"),
    OPENINGAVAILABLE("OpeningAvailable"),
    OPENINGBOOKED("OpeningBooked"),
    OPENINGCLEARED("OpeningCleared"),
    PREVIOUSLYCLOSEDBOOKED("PreviouslyClosedBooked");

    private String value;

    FRBalanceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static FRBalanceType fromValue(String value) {
        return Stream.of(values())
                .filter(type -> type.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }
}