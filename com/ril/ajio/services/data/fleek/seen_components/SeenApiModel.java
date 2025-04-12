/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import com.ril.ajio.services.data.fleek.seen_components.FailedIds;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SeenApiModel {
    private ArrayList errors;
    private FailedIds failedIds;
    private String status;

    public SeenApiModel() {
        this(null, null, null, 7, null);
    }

    public SeenApiModel(String string2, FailedIds failedIds, ArrayList arrayList) {
        this.status = string2;
        this.failedIds = failedIds;
        this.errors = arrayList;
    }

    public /* synthetic */ SeenApiModel(String string2, FailedIds failedIds, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            failedIds = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList = null;
        }
        this(string2, failedIds, arrayList);
    }

    public static /* synthetic */ SeenApiModel copy$default(SeenApiModel seenApiModel, String string2, FailedIds failedIds, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = seenApiModel.status;
        }
        if ((n4 = n3 & 2) != 0) {
            failedIds = seenApiModel.failedIds;
        }
        if ((n3 &= 4) != 0) {
            arrayList = seenApiModel.errors;
        }
        return seenApiModel.copy(string2, failedIds, arrayList);
    }

    public final String component1() {
        return this.status;
    }

    public final FailedIds component2() {
        return this.failedIds;
    }

    public final ArrayList component3() {
        return this.errors;
    }

    public final SeenApiModel copy(String string2, FailedIds failedIds, ArrayList arrayList) {
        SeenApiModel seenApiModel = new SeenApiModel(string2, failedIds, arrayList);
        return seenApiModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SeenApiModel;
        if (!bl3) {
            return false;
        }
        object = (SeenApiModel)object;
        Object object2 = this.status;
        Object object3 = ((SeenApiModel)object).status;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.failedIds;
        object3 = ((SeenApiModel)object).failedIds;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.errors;
        object = ((SeenApiModel)object).errors;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getErrors() {
        return this.errors;
    }

    public final FailedIds getFailedIds() {
        return this.failedIds;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.status;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.failedIds;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FailedIds)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errors;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setErrors(ArrayList arrayList) {
        this.errors = arrayList;
    }

    public final void setFailedIds(FailedIds failedIds) {
        this.failedIds = failedIds;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        String string2 = this.status;
        FailedIds failedIds = this.failedIds;
        ArrayList arrayList = this.errors;
        StringBuilder stringBuilder = new StringBuilder("SeenApiModel(status=");
        stringBuilder.append(string2);
        stringBuilder.append(", failedIds=");
        stringBuilder.append(failedIds);
        stringBuilder.append(", errors=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

