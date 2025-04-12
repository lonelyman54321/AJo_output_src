/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.converter.StringToSHA256Converter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$stringToSHA256Converter$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$stringToSHA256Converter$2 INSTANCE;

    static {
        AffiseComponent$stringToSHA256Converter$2 affiseComponent$stringToSHA256Converter$2;
        INSTANCE = affiseComponent$stringToSHA256Converter$2 = new AffiseComponent$stringToSHA256Converter$2();
    }

    public AffiseComponent$stringToSHA256Converter$2() {
        super(0);
    }

    public final StringToSHA256Converter invoke() {
        StringToSHA256Converter stringToSHA256Converter2 = new StringToSHA256Converter();
        return stringToSHA256Converter2;
    }
}

