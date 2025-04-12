/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.FraudEngineCOD;
import com.ril.ajio.services.data.Product.FraudEngineReturnWindow;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineResult {
    private final FraudEngineCOD cod;
    private final FraudEngineReturnWindow returnWindow;

    public FraudEngineResult() {
        this(null, null, 3, null);
    }

    public FraudEngineResult(FraudEngineCOD fraudEngineCOD, FraudEngineReturnWindow fraudEngineReturnWindow) {
        this.cod = fraudEngineCOD;
        this.returnWindow = fraudEngineReturnWindow;
    }

    public /* synthetic */ FraudEngineResult(FraudEngineCOD fraudEngineCOD, FraudEngineReturnWindow fraudEngineReturnWindow, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            fraudEngineCOD = null;
        }
        if ((n3 &= 2) != 0) {
            fraudEngineReturnWindow = null;
        }
        this(fraudEngineCOD, fraudEngineReturnWindow);
    }

    public static /* synthetic */ FraudEngineResult copy$default(FraudEngineResult fraudEngineResult, FraudEngineCOD fraudEngineCOD, FraudEngineReturnWindow fraudEngineReturnWindow, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            fraudEngineCOD = fraudEngineResult.cod;
        }
        if ((n3 &= 2) != 0) {
            fraudEngineReturnWindow = fraudEngineResult.returnWindow;
        }
        return fraudEngineResult.copy(fraudEngineCOD, fraudEngineReturnWindow);
    }

    public final FraudEngineCOD component1() {
        return this.cod;
    }

    public final FraudEngineReturnWindow component2() {
        return this.returnWindow;
    }

    public final FraudEngineResult copy(FraudEngineCOD fraudEngineCOD, FraudEngineReturnWindow fraudEngineReturnWindow) {
        FraudEngineResult fraudEngineResult = new FraudEngineResult(fraudEngineCOD, fraudEngineReturnWindow);
        return fraudEngineResult;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineResult;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineResult)object;
        Object object2 = this.cod;
        FraudEngineCOD fraudEngineCOD = ((FraudEngineResult)object).cod;
        bl3 = Intrinsics.areEqual(object2, fraudEngineCOD);
        if (!bl3) {
            return false;
        }
        object2 = this.returnWindow;
        object = ((FraudEngineResult)object).returnWindow;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final FraudEngineCOD getCod() {
        return this.cod;
    }

    public final FraudEngineReturnWindow getReturnWindow() {
        return this.returnWindow;
    }

    public int hashCode() {
        int n3;
        FraudEngineCOD fraudEngineCOD = this.cod;
        int n4 = 0;
        if (fraudEngineCOD == null) {
            n3 = 0;
            fraudEngineCOD = null;
        } else {
            n3 = fraudEngineCOD.hashCode();
        }
        n3 *= 31;
        FraudEngineReturnWindow fraudEngineReturnWindow = this.returnWindow;
        if (fraudEngineReturnWindow != null) {
            n4 = fraudEngineReturnWindow.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        FraudEngineCOD fraudEngineCOD = this.cod;
        FraudEngineReturnWindow fraudEngineReturnWindow = this.returnWindow;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineResult(cod=");
        stringBuilder.append(fraudEngineCOD);
        stringBuilder.append(", returnWindow=");
        stringBuilder.append(fraudEngineReturnWindow);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

