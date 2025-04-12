/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Utils$Companion {
    private Utils$Companion() {
    }

    public /* synthetic */ Utils$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int checkAndGet3DigitRespCode(int n3) {
        int n4 = 1000;
        if (n3 > n4) {
            n3 /= 100;
        }
        return n3;
    }
}

