/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FetchEmiPlansResponse
implements Serializable {
    private Error error;
    private ArrayList featured_emi;
    private ArrayList no_cost_emi;
    private ArrayList standard_emi;
    private Boolean success;
    private Boolean valid;

    public FetchEmiPlansResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public FetchEmiPlansResponse(Boolean bl2, Boolean bl3, Error error, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.valid = bl2;
        this.success = bl3;
        this.error = error;
        this.standard_emi = arrayList;
        this.no_cost_emi = arrayList2;
        this.featured_emi = arrayList3;
    }

    public /* synthetic */ FetchEmiPlansResponse(Boolean serializable, Boolean object, Error serializable2, ArrayList serializable3, ArrayList arrayList, ArrayList arrayList2, int n3, DefaultConstructorMarker object2) {
        ArrayList arrayList3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = serializable;
        }
        int n7 = n3 & 2;
        Object object3 = n7 != 0 ? null : object;
        n7 = n3 & 4;
        Error error = n7 != 0 ? null : serializable2;
        n7 = n3 & 8;
        ArrayList arrayList4 = n7 != 0 ? null : serializable3;
        n7 = n3 & 0x10;
        ArrayList arrayList5 = n7 != 0 ? null : arrayList;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            arrayList3 = null;
        } else {
            arrayList3 = arrayList2;
        }
        serializable = this;
        object = object2;
        serializable2 = object3;
        serializable3 = error;
        arrayList = arrayList4;
        arrayList2 = arrayList5;
        this((Boolean)object2, (Boolean)object3, error, arrayList4, arrayList5, arrayList3);
    }

    public static /* synthetic */ FetchEmiPlansResponse copy$default(FetchEmiPlansResponse fetchEmiPlansResponse, Boolean bl2, Boolean serializable, Error serializable2, ArrayList object, ArrayList serializable3, ArrayList arrayList, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = fetchEmiPlansResponse.valid;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = fetchEmiPlansResponse.success;
        }
        object2 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            serializable2 = fetchEmiPlansResponse.error;
        }
        Error error = serializable2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object = fetchEmiPlansResponse.standard_emi;
        }
        ArrayList arrayList2 = object;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            serializable3 = fetchEmiPlansResponse.no_cost_emi;
        }
        ArrayList arrayList3 = serializable3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            arrayList = fetchEmiPlansResponse.featured_emi;
        }
        ArrayList arrayList4 = arrayList;
        serializable = fetchEmiPlansResponse;
        serializable2 = bl2;
        object = object2;
        serializable3 = error;
        arrayList = arrayList2;
        object2 = arrayList4;
        return fetchEmiPlansResponse.copy(bl2, (Boolean)object, error, arrayList2, arrayList3, arrayList4);
    }

    public final Boolean component1() {
        return this.valid;
    }

    public final Boolean component2() {
        return this.success;
    }

    public final Error component3() {
        return this.error;
    }

    public final ArrayList component4() {
        return this.standard_emi;
    }

    public final ArrayList component5() {
        return this.no_cost_emi;
    }

    public final ArrayList component6() {
        return this.featured_emi;
    }

    public final FetchEmiPlansResponse copy(Boolean bl2, Boolean bl3, Error error, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        FetchEmiPlansResponse fetchEmiPlansResponse = new FetchEmiPlansResponse(bl2, bl3, error, arrayList, arrayList2, arrayList3);
        return fetchEmiPlansResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FetchEmiPlansResponse;
        if (!bl3) {
            return false;
        }
        object = (FetchEmiPlansResponse)object;
        Serializable serializable = this.valid;
        Serializable serializable2 = ((FetchEmiPlansResponse)object).valid;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.success;
        serializable2 = ((FetchEmiPlansResponse)object).success;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.error;
        serializable2 = ((FetchEmiPlansResponse)object).error;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.standard_emi;
        serializable2 = ((FetchEmiPlansResponse)object).standard_emi;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.no_cost_emi;
        serializable2 = ((FetchEmiPlansResponse)object).no_cost_emi;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.featured_emi;
        object = ((FetchEmiPlansResponse)object).featured_emi;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final ArrayList getFeatured_emi() {
        return this.featured_emi;
    }

    public final ArrayList getNo_cost_emi() {
        return this.no_cost_emi;
    }

    public final ArrayList getStandard_emi() {
        return this.standard_emi;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.valid;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.success;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.error;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((Error)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.standard_emi;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ArrayList)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.no_cost_emi;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ArrayList)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.featured_emi;
        if (serializable != null) {
            n7 = ((ArrayList)serializable).hashCode();
        }
        return n4 + n7;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setFeatured_emi(ArrayList arrayList) {
        this.featured_emi = arrayList;
    }

    public final void setNo_cost_emi(ArrayList arrayList) {
        this.no_cost_emi = arrayList;
    }

    public final void setStandard_emi(ArrayList arrayList) {
        this.standard_emi = arrayList;
    }

    public final void setSuccess(Boolean bl2) {
        this.success = bl2;
    }

    public final void setValid(Boolean bl2) {
        this.valid = bl2;
    }

    public String toString() {
        Boolean bl2 = this.valid;
        Boolean bl3 = this.success;
        Error error = this.error;
        ArrayList arrayList = this.standard_emi;
        ArrayList arrayList2 = this.no_cost_emi;
        ArrayList arrayList3 = this.featured_emi;
        StringBuilder stringBuilder = new StringBuilder("FetchEmiPlansResponse(valid=");
        stringBuilder.append(bl2);
        stringBuilder.append(", success=");
        stringBuilder.append(bl3);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(", standard_emi=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", no_cost_emi=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", featured_emi=");
        stringBuilder.append(arrayList3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

