/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.autoCatchingClick;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoCatchingClickData {
    private final String id;
    private final String tag;
    private final String text;
    private final String typeView;

    public AutoCatchingClickData() {
        this(null, null, null, null, 15, null);
    }

    public AutoCatchingClickData(String string2, String string3, String string4, String string5) {
        this.id = string2;
        this.text = string3;
        this.tag = string4;
        this.typeView = string5;
    }

    public /* synthetic */ AutoCatchingClickData(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTypeView() {
        return this.typeView;
    }
}

