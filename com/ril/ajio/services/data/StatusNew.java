/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StatusNew {
    private String messageDescription;

    public StatusNew() {
        this(null, 1, null);
    }

    public StatusNew(String string2) {
        this.messageDescription = string2;
    }

    public /* synthetic */ StatusNew(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final void setMessageDescription(String string2) {
        this.messageDescription = string2;
    }
}

