/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.b;

public final class APIUtils$Companion {
    private APIUtils$Companion() {
    }

    public /* synthetic */ APIUtils$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isChevronApi(String string2) {
        String string3;
        boolean bl2;
        boolean bl3 = false;
        if (string2 != null && (bl2 = b.h(string2, string3 = "HomeCategoryContent", false))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean isHamburgerApi(String string2) {
        String string3;
        boolean bl2;
        boolean bl3 = false;
        if (string2 != null && (bl2 = b.h(string2, string3 = "_AllCategories", false))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean isHamburgerOrChevronApi(String string2) {
        boolean bl2;
        boolean bl3;
        if (string2 != null && ((bl3 = this.isHamburgerApi(string2)) || (bl2 = this.isChevronApi(string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }
}

