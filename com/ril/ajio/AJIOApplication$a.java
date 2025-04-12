/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio;

import com.ril.ajio.AJIOApplication;
import kotlin.jvm.internal.Intrinsics;

public final class AJIOApplication$a {
    public static AJIOApplication a() {
        AJIOApplication aJIOApplication = AJIOApplication.g;
        if (aJIOApplication != null) {
            return aJIOApplication;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }
}

