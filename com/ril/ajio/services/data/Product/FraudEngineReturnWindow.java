/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.FraudEngineActionContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineReturnWindow {
    private final String action;
    private final FraudEngineActionContent actionContent;

    public FraudEngineReturnWindow() {
        this(null, null, 3, null);
    }

    public FraudEngineReturnWindow(String string2, FraudEngineActionContent fraudEngineActionContent) {
        this.action = string2;
        this.actionContent = fraudEngineActionContent;
    }

    public /* synthetic */ FraudEngineReturnWindow(String string2, FraudEngineActionContent fraudEngineActionContent, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = "";
        }
        if ((n3 &= 2) != 0) {
            fraudEngineActionContent = null;
        }
        this(string2, fraudEngineActionContent);
    }

    public static /* synthetic */ FraudEngineReturnWindow copy$default(FraudEngineReturnWindow fraudEngineReturnWindow, String string2, FraudEngineActionContent fraudEngineActionContent, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fraudEngineReturnWindow.action;
        }
        if ((n3 &= 2) != 0) {
            fraudEngineActionContent = fraudEngineReturnWindow.actionContent;
        }
        return fraudEngineReturnWindow.copy(string2, fraudEngineActionContent);
    }

    public final String component1() {
        return this.action;
    }

    public final FraudEngineActionContent component2() {
        return this.actionContent;
    }

    public final FraudEngineReturnWindow copy(String string2, FraudEngineActionContent fraudEngineActionContent) {
        FraudEngineReturnWindow fraudEngineReturnWindow = new FraudEngineReturnWindow(string2, fraudEngineActionContent);
        return fraudEngineReturnWindow;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineReturnWindow;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineReturnWindow)object;
        Object object2 = this.action;
        String string2 = ((FraudEngineReturnWindow)object).action;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.actionContent;
        object = ((FraudEngineReturnWindow)object).actionContent;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final FraudEngineActionContent getActionContent() {
        return this.actionContent;
    }

    public int hashCode() {
        int n3;
        String string2 = this.action;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        FraudEngineActionContent fraudEngineActionContent = this.actionContent;
        if (fraudEngineActionContent != null) {
            n4 = fraudEngineActionContent.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.action;
        FraudEngineActionContent fraudEngineActionContent = this.actionContent;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineReturnWindow(action=");
        stringBuilder.append(string2);
        stringBuilder.append(", actionContent=");
        stringBuilder.append(fraudEngineActionContent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

