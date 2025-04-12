/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CMSResponse {
    private boolean isNewData;

    private CMSResponse(boolean bl2) {
        this.isNewData = bl2;
    }

    public /* synthetic */ CMSResponse(boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        this(bl2, null);
    }

    public /* synthetic */ CMSResponse(boolean bl2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bl2);
    }

    public final boolean isNewData() {
        return this.isNewData;
    }

    public final void setNewData(boolean bl2) {
        this.isNewData = bl2;
    }
}

