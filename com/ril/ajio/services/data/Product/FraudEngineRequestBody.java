/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.FraudEngineItemDetailRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineRequestBody {
    private FraudEngineItemDetailRequest itemDetail;
    private String pincode;
    private String userId;

    public FraudEngineRequestBody() {
        this(null, null, null, 7, null);
    }

    public FraudEngineRequestBody(String string2, String string3, FraudEngineItemDetailRequest fraudEngineItemDetailRequest) {
        this.userId = string2;
        this.pincode = string3;
        this.itemDetail = fraudEngineItemDetailRequest;
    }

    public /* synthetic */ FraudEngineRequestBody(String string2, String string3, FraudEngineItemDetailRequest fraudEngineItemDetailRequest, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            fraudEngineItemDetailRequest = null;
        }
        this(string2, string3, fraudEngineItemDetailRequest);
    }

    public static /* synthetic */ FraudEngineRequestBody copy$default(FraudEngineRequestBody fraudEngineRequestBody, String string2, String string3, FraudEngineItemDetailRequest fraudEngineItemDetailRequest, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fraudEngineRequestBody.userId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = fraudEngineRequestBody.pincode;
        }
        if ((n3 &= 4) != 0) {
            fraudEngineItemDetailRequest = fraudEngineRequestBody.itemDetail;
        }
        return fraudEngineRequestBody.copy(string2, string3, fraudEngineItemDetailRequest);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.pincode;
    }

    public final FraudEngineItemDetailRequest component3() {
        return this.itemDetail;
    }

    public final FraudEngineRequestBody copy(String string2, String string3, FraudEngineItemDetailRequest fraudEngineItemDetailRequest) {
        FraudEngineRequestBody fraudEngineRequestBody = new FraudEngineRequestBody(string2, string3, fraudEngineItemDetailRequest);
        return fraudEngineRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineRequestBody;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineRequestBody)object;
        Object object2 = this.userId;
        String string2 = ((FraudEngineRequestBody)object).userId;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.pincode;
        string2 = ((FraudEngineRequestBody)object).pincode;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.itemDetail;
        object = ((FraudEngineRequestBody)object).itemDetail;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final FraudEngineItemDetailRequest getItemDetail() {
        return this.itemDetail;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.userId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.pincode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.itemDetail;
        if (object != null) {
            n7 = ((FraudEngineItemDetailRequest)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setItemDetail(FraudEngineItemDetailRequest fraudEngineItemDetailRequest) {
        this.itemDetail = fraudEngineItemDetailRequest;
    }

    public final void setPincode(String string2) {
        this.pincode = string2;
    }

    public final void setUserId(String string2) {
        this.userId = string2;
    }

    public String toString() {
        CharSequence charSequence = this.userId;
        String string2 = this.pincode;
        FraudEngineItemDetailRequest fraudEngineItemDetailRequest = this.itemDetail;
        charSequence = og_1.a("FraudEngineRequestBody(userId=", (String)charSequence, ", pincode=", string2, ", itemDetail=");
        ((StringBuilder)charSequence).append(fraudEngineItemDetailRequest);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

