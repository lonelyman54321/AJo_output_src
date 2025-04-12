/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.LowCostEmi;
import com.ril.ajio.services.data.Payment.NoCostEmi;
import com.ril.ajio.services.data.Payment.StandardEmi;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EmiOptions
implements Serializable {
    private final LowCostEmi lowCostEmi;
    private final NoCostEmi noCostEmi;
    private final Boolean showOnlyEmi;
    private final StandardEmi standardEmi;

    public EmiOptions() {
        this(null, null, null, null, 15, null);
    }

    public EmiOptions(LowCostEmi lowCostEmi, NoCostEmi noCostEmi, Boolean bl2, StandardEmi standardEmi) {
        this.lowCostEmi = lowCostEmi;
        this.noCostEmi = noCostEmi;
        this.showOnlyEmi = bl2;
        this.standardEmi = standardEmi;
    }

    public /* synthetic */ EmiOptions(LowCostEmi lowCostEmi, NoCostEmi noCostEmi, Boolean bl2, StandardEmi standardEmi, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            lowCostEmi = null;
        }
        if ((n4 = n3 & 2) != 0) {
            noCostEmi = null;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = null;
        }
        if ((n3 &= 8) != 0) {
            standardEmi = null;
        }
        this(lowCostEmi, noCostEmi, bl2, standardEmi);
    }

    public static /* synthetic */ EmiOptions copy$default(EmiOptions emiOptions, LowCostEmi lowCostEmi, NoCostEmi noCostEmi, Boolean bl2, StandardEmi standardEmi, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            lowCostEmi = emiOptions.lowCostEmi;
        }
        if ((n4 = n3 & 2) != 0) {
            noCostEmi = emiOptions.noCostEmi;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = emiOptions.showOnlyEmi;
        }
        if ((n3 &= 8) != 0) {
            standardEmi = emiOptions.standardEmi;
        }
        return emiOptions.copy(lowCostEmi, noCostEmi, bl2, standardEmi);
    }

    public final LowCostEmi component1() {
        return this.lowCostEmi;
    }

    public final NoCostEmi component2() {
        return this.noCostEmi;
    }

    public final Boolean component3() {
        return this.showOnlyEmi;
    }

    public final StandardEmi component4() {
        return this.standardEmi;
    }

    public final EmiOptions copy(LowCostEmi lowCostEmi, NoCostEmi noCostEmi, Boolean bl2, StandardEmi standardEmi) {
        EmiOptions emiOptions = new EmiOptions(lowCostEmi, noCostEmi, bl2, standardEmi);
        return emiOptions;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EmiOptions;
        if (!bl3) {
            return false;
        }
        object = (EmiOptions)object;
        Serializable serializable = this.lowCostEmi;
        Serializable serializable2 = ((EmiOptions)object).lowCostEmi;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.noCostEmi;
        serializable2 = ((EmiOptions)object).noCostEmi;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.showOnlyEmi;
        serializable2 = ((EmiOptions)object).showOnlyEmi;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.standardEmi;
        object = ((EmiOptions)object).standardEmi;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final LowCostEmi getLowCostEmi() {
        return this.lowCostEmi;
    }

    public final NoCostEmi getNoCostEmi() {
        return this.noCostEmi;
    }

    public final Boolean getShowOnlyEmi() {
        return this.showOnlyEmi;
    }

    public final StandardEmi getStandardEmi() {
        return this.standardEmi;
    }

    public int hashCode() {
        int n3;
        int n4;
        LowCostEmi lowCostEmi = this.lowCostEmi;
        int n7 = 0;
        if (lowCostEmi == null) {
            n4 = 0;
            lowCostEmi = null;
        } else {
            n4 = lowCostEmi.hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.noCostEmi;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((NoCostEmi)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.showOnlyEmi;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.standardEmi;
        if (serializable != null) {
            n7 = ((StandardEmi)serializable).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        LowCostEmi lowCostEmi = this.lowCostEmi;
        NoCostEmi noCostEmi = this.noCostEmi;
        Boolean bl2 = this.showOnlyEmi;
        StandardEmi standardEmi = this.standardEmi;
        StringBuilder stringBuilder = new StringBuilder("EmiOptions(lowCostEmi=");
        stringBuilder.append(lowCostEmi);
        stringBuilder.append(", noCostEmi=");
        stringBuilder.append(noCostEmi);
        stringBuilder.append(", showOnlyEmi=");
        stringBuilder.append(bl2);
        stringBuilder.append(", standardEmi=");
        stringBuilder.append(standardEmi);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

