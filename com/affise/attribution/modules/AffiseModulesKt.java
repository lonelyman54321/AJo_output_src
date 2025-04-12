/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules;

import com.affise.attribution.modules.AffiseModules;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseModulesKt {
    public static final AffiseModules toAffiseModules(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return AffiseModules.Companion.from(string2);
    }
}

