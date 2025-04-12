/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.lang.constant.Constable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineActionContent {
    private final Boolean isExchangeable;
    private final Boolean isReturnable;
    private final Integer returnWindow;

    public FraudEngineActionContent() {
        this(null, null, null, 7, null);
    }

    public FraudEngineActionContent(Integer n3, Boolean bl2, Boolean bl3) {
        this.returnWindow = n3;
        this.isReturnable = bl2;
        this.isExchangeable = bl3;
    }

    public /* synthetic */ FraudEngineActionContent(Integer n3, Boolean bl2, Boolean bl3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            bl2 = null;
        }
        if ((n4 &= 4) != 0) {
            bl3 = null;
        }
        this(n3, bl2, bl3);
    }

    public static /* synthetic */ FraudEngineActionContent copy$default(FraudEngineActionContent fraudEngineActionContent, Integer n3, Boolean bl2, Boolean bl3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = fraudEngineActionContent.returnWindow;
        }
        if ((n7 = n4 & 2) != 0) {
            bl2 = fraudEngineActionContent.isReturnable;
        }
        if ((n4 &= 4) != 0) {
            bl3 = fraudEngineActionContent.isExchangeable;
        }
        return fraudEngineActionContent.copy(n3, bl2, bl3);
    }

    public final Integer component1() {
        return this.returnWindow;
    }

    public final Boolean component2() {
        return this.isReturnable;
    }

    public final Boolean component3() {
        return this.isExchangeable;
    }

    public final FraudEngineActionContent copy(Integer n3, Boolean bl2, Boolean bl3) {
        FraudEngineActionContent fraudEngineActionContent = new FraudEngineActionContent(n3, bl2, bl3);
        return fraudEngineActionContent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineActionContent;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineActionContent)object;
        Constable constable = this.returnWindow;
        Constable constable2 = ((FraudEngineActionContent)object).returnWindow;
        bl3 = Intrinsics.areEqual(constable, constable2);
        if (!bl3) {
            return false;
        }
        constable = this.isReturnable;
        constable2 = ((FraudEngineActionContent)object).isReturnable;
        bl3 = Intrinsics.areEqual(constable, constable2);
        if (!bl3) {
            return false;
        }
        constable = this.isExchangeable;
        object = ((FraudEngineActionContent)object).isExchangeable;
        boolean bl4 = Intrinsics.areEqual(constable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getReturnWindow() {
        return this.returnWindow;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.returnWindow;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Boolean bl2 = this.isReturnable;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl2 = this.isExchangeable;
        if (bl2 != null) {
            n8 = ((Object)bl2).hashCode();
        }
        return n4 + n8;
    }

    public final Boolean isExchangeable() {
        return this.isExchangeable;
    }

    public final Boolean isReturnable() {
        return this.isReturnable;
    }

    public String toString() {
        Integer n3 = this.returnWindow;
        Boolean bl2 = this.isReturnable;
        Boolean bl3 = this.isExchangeable;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineActionContent(returnWindow=");
        stringBuilder.append(n3);
        stringBuilder.append(", isReturnable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isExchangeable=");
        return nx3_0.a(stringBuilder, bl3, ")");
    }
}

