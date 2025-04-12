/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Loyalty
implements Serializable {
    private Float earnPoints;
    private Float loyaltyPoints;
    private Float remainingPoints;
    private String splitUpId;
    private String status;

    public Loyalty() {
        this(null, null, null, null, null, 31, null);
    }

    public Loyalty(Float f5, Float f6, String string2, String string3, Float f7) {
        this.loyaltyPoints = f5;
        this.earnPoints = f6;
        this.status = string2;
        this.splitUpId = string3;
        this.remainingPoints = f7;
    }

    public /* synthetic */ Loyalty(Float serializable, Float object, String object2, String string2, Float object3, int n3, DefaultConstructorMarker object4) {
        int n4 = n3 & 1;
        Float f5 = Float.valueOf(0.0f);
        object4 = n4 != 0 ? f5 : serializable;
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? f5 : object;
        n7 = n3 & 4;
        object = null;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 8;
        String string3 = n7 != 0 ? null : string2;
        n7 = n3 & 0x10;
        Object object7 = n7 != 0 ? f5 : object3;
        serializable = this;
        object = object4;
        object2 = object5;
        string2 = object6;
        object3 = string3;
        this((Float)object4, (Float)object5, (String)object6, string3, (Float)object7);
    }

    public static /* synthetic */ Loyalty copy$default(Loyalty loyalty, Float f5, Float serializable, String object, String object2, Float object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = loyalty.loyaltyPoints;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = loyalty.earnPoints;
        }
        object4 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = loyalty.status;
        }
        String string2 = object;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = loyalty.splitUpId;
        }
        String string3 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = loyalty.remainingPoints;
        }
        Float f6 = object3;
        serializable = loyalty;
        object = f5;
        object2 = object4;
        object3 = string2;
        object4 = f6;
        return loyalty.copy(f5, (Float)object2, string2, string3, f6);
    }

    public final Float component1() {
        return this.loyaltyPoints;
    }

    public final Float component2() {
        return this.earnPoints;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.splitUpId;
    }

    public final Float component5() {
        return this.remainingPoints;
    }

    public final Loyalty copy(Float f5, Float f6, String string2, String string3, Float f7) {
        Loyalty loyalty = new Loyalty(f5, f6, string2, string3, f7);
        return loyalty;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Loyalty;
        if (!bl3) {
            return false;
        }
        object = (Loyalty)object;
        Object object2 = this.loyaltyPoints;
        Object object3 = ((Loyalty)object).loyaltyPoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.earnPoints;
        object3 = ((Loyalty)object).earnPoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object3 = ((Loyalty)object).status;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.splitUpId;
        object3 = ((Loyalty)object).splitUpId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.remainingPoints;
        object = ((Loyalty)object).remainingPoints;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getEarnPoints() {
        return this.earnPoints;
    }

    public final Float getLoyaltyPoints() {
        return this.loyaltyPoints;
    }

    public final Float getRemainingPoints() {
        return this.remainingPoints;
    }

    public final String getSplitUpId() {
        return this.splitUpId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.loyaltyPoints;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Object object = this.earnPoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.status;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.splitUpId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.remainingPoints;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setEarnPoints(Float f5) {
        this.earnPoints = f5;
    }

    public final void setLoyaltyPoints(Float f5) {
        this.loyaltyPoints = f5;
    }

    public final void setRemainingPoints(Float f5) {
        this.remainingPoints = f5;
    }

    public final void setSplitUpId(String string2) {
        this.splitUpId = string2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        Float f5 = this.loyaltyPoints;
        Float f6 = this.earnPoints;
        String string2 = this.status;
        String string3 = this.splitUpId;
        Float f7 = this.remainingPoints;
        StringBuilder stringBuilder = new StringBuilder("Loyalty(loyaltyPoints=");
        stringBuilder.append(f5);
        stringBuilder.append(", earnPoints=");
        stringBuilder.append(f6);
        stringBuilder.append(", status=");
        X50.a(stringBuilder, string2, ", splitUpId=", string3, ", remainingPoints=");
        stringBuilder.append(f7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

