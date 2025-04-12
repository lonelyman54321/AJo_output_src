/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.model;

import com.ajio.ril.core.network.model.Data;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ValiDateSessionUcp {
    private final Data data;
    private final List error;
    private final String message_id;
    private final Boolean success;

    public ValiDateSessionUcp() {
        this(null, null, null, null, 15, null);
    }

    public ValiDateSessionUcp(Data data, List list, String string2, Boolean bl2) {
        this.data = data;
        this.error = list;
        this.message_id = string2;
        this.success = bl2;
    }

    public /* synthetic */ ValiDateSessionUcp(Data data, List list, String string2, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            data = null;
        }
        if ((n4 = n3 & 2) != 0) {
            list = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            bl2 = null;
        }
        this(data, list, string2, bl2);
    }

    public static /* synthetic */ ValiDateSessionUcp copy$default(ValiDateSessionUcp valiDateSessionUcp, Data data, List list, String string2, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            data = valiDateSessionUcp.data;
        }
        if ((n4 = n3 & 2) != 0) {
            list = valiDateSessionUcp.error;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = valiDateSessionUcp.message_id;
        }
        if ((n3 &= 8) != 0) {
            bl2 = valiDateSessionUcp.success;
        }
        return valiDateSessionUcp.copy(data, list, string2, bl2);
    }

    public final Data component1() {
        return this.data;
    }

    public final List component2() {
        return this.error;
    }

    public final String component3() {
        return this.message_id;
    }

    public final Boolean component4() {
        return this.success;
    }

    public final ValiDateSessionUcp copy(Data data, List list, String string2, Boolean bl2) {
        ValiDateSessionUcp valiDateSessionUcp = new ValiDateSessionUcp(data, list, string2, bl2);
        return valiDateSessionUcp;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ValiDateSessionUcp;
        if (!bl3) {
            return false;
        }
        object = (ValiDateSessionUcp)object;
        Object object2 = this.data;
        Object object3 = ((ValiDateSessionUcp)object).data;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object3 = ((ValiDateSessionUcp)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message_id;
        object3 = ((ValiDateSessionUcp)object).message_id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.success;
        object = ((ValiDateSessionUcp)object).success;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Data getData() {
        return this.data;
    }

    public final List getError() {
        return this.error;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int n3;
        int n4;
        Data data = this.data;
        int n7 = 0;
        if (data == null) {
            n4 = 0;
            data = null;
        } else {
            n4 = data.hashCode();
        }
        n4 *= 31;
        Object object = this.error;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message_id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.success;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Data data = this.data;
        List list = this.error;
        String string2 = this.message_id;
        Boolean bl2 = this.success;
        StringBuilder stringBuilder = new StringBuilder("ValiDateSessionUcp(data=");
        stringBuilder.append(data);
        stringBuilder.append(", error=");
        stringBuilder.append(list);
        stringBuilder.append(", message_id=");
        stringBuilder.append(string2);
        stringBuilder.append(", success=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

