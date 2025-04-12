/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.build.BuildConfigPropertiesProviderImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$buildConfigPropertiesProvider$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$buildConfigPropertiesProvider$2 INSTANCE;

    static {
        AffiseComponent$buildConfigPropertiesProvider$2 affiseComponent$buildConfigPropertiesProvider$2;
        INSTANCE = affiseComponent$buildConfigPropertiesProvider$2 = new AffiseComponent$buildConfigPropertiesProvider$2();
    }

    public AffiseComponent$buildConfigPropertiesProvider$2() {
        super(0);
    }

    public final BuildConfigPropertiesProviderImpl invoke() {
        BuildConfigPropertiesProviderImpl buildConfigPropertiesProviderImpl = new BuildConfigPropertiesProviderImpl();
        return buildConfigPropertiesProviderImpl;
    }
}

