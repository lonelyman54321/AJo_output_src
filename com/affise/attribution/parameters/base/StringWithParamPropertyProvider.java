/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.Provider;
import kotlin.jvm.internal.Intrinsics;

public abstract class StringWithParamPropertyProvider
implements Provider {
    private final String defaultValue;

    public StringWithParamPropertyProvider() {
        this.defaultValue = "";
    }

    public abstract String provideWithParam(String var1);

    public final String provideWithParamAndDefault(String string2) {
        String string3 = "param";
        Intrinsics.checkNotNullParameter(string2, string3);
        string2 = this.provideWithParam(string2);
        if (string2 == null) {
            string2 = this.defaultValue;
        }
        return string2;
    }
}

