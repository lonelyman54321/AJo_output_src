/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.converter.ConverterToBase64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$converterToBase64$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$converterToBase64$2 INSTANCE;

    static {
        AffiseComponent$converterToBase64$2 affiseComponent$converterToBase64$2;
        INSTANCE = affiseComponent$converterToBase64$2 = new AffiseComponent$converterToBase64$2();
    }

    public AffiseComponent$converterToBase64$2() {
        super(0);
    }

    public final ConverterToBase64 invoke() {
        ConverterToBase64 converterToBase642 = new ConverterToBase64();
        return converterToBase642;
    }
}

