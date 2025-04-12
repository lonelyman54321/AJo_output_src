/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

import com.ajio.ril.core.network.APIUtils$Companion;

public final class APIUtils {
    public static final APIUtils$Companion Companion;

    static {
        APIUtils$Companion aPIUtils$Companion;
        Companion = aPIUtils$Companion = new APIUtils$Companion(null);
    }

    public static final boolean isChevronApi(String string2) {
        return Companion.isChevronApi(string2);
    }

    public static final boolean isHamburgerApi(String string2) {
        return Companion.isHamburgerApi(string2);
    }

    public static final boolean isHamburgerOrChevronApi(String string2) {
        return Companion.isHamburgerOrChevronApi(string2);
    }
}

