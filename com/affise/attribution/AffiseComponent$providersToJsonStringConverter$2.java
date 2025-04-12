/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.converter.ProvidersToJsonStringConverter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$providersToJsonStringConverter$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$providersToJsonStringConverter$2 INSTANCE;

    static {
        AffiseComponent$providersToJsonStringConverter$2 affiseComponent$providersToJsonStringConverter$2;
        INSTANCE = affiseComponent$providersToJsonStringConverter$2 = new AffiseComponent$providersToJsonStringConverter$2();
    }

    public AffiseComponent$providersToJsonStringConverter$2() {
        super(0);
    }

    public final ProvidersToJsonStringConverter invoke() {
        ProvidersToJsonStringConverter providersToJsonStringConverter2 = new ProvidersToJsonStringConverter();
        return providersToJsonStringConverter2;
    }
}

