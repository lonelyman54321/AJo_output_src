/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.FuturesGetChecked;
import com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidator;

class FuturesGetChecked$GetCheckedTypeValidatorHolder {
    static final FuturesGetChecked$GetCheckedTypeValidator BEST_VALIDATOR = FuturesGetChecked$GetCheckedTypeValidatorHolder.getBestValidator();

    public static FuturesGetChecked$GetCheckedTypeValidator getBestValidator() {
        return FuturesGetChecked.weakSetValidator();
    }
}

