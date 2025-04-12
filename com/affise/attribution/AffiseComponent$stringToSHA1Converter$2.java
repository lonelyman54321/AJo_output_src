/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.converter.StringToSHA1Converter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$stringToSHA1Converter$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$stringToSHA1Converter$2 INSTANCE;

    static {
        AffiseComponent$stringToSHA1Converter$2 affiseComponent$stringToSHA1Converter$2;
        INSTANCE = affiseComponent$stringToSHA1Converter$2 = new AffiseComponent$stringToSHA1Converter$2();
    }

    public AffiseComponent$stringToSHA1Converter$2() {
        super(0);
    }

    public final StringToSHA1Converter invoke() {
        StringToSHA1Converter stringToSHA1Converter2 = new StringToSHA1Converter();
        return stringToSHA1Converter2;
    }
}

