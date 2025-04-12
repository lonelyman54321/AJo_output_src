/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.Status;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import com.ril.ajio.kmm.shared.model.home.CMSData$Companion;
import com.ril.ajio.kmm.shared.model.home.Data;
import com.ril.ajio.kmm.shared.model.home.Data$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CMSData
extends StatusInfo {
    public static final CMSData$Companion Companion;
    private Data data;
    private String usergroup;

    static {
        CMSData$Companion cMSData$Companion;
        Companion = cMSData$Companion = new CMSData$Companion(null);
    }

    public CMSData() {
        this(null, null, 3, null);
    }

    public /* synthetic */ CMSData(int n3, Status status, int n4, Data data, String string2, a03_0 a03_02) {
        super(n3, status, n4, a03_02);
        int n7 = n3 & 4;
        n4 = 0;
        this.data = n7 == 0 ? null : data;
        this.usergroup = (n3 &= 8) == 0 ? null : string2;
    }

    public CMSData(Data data, String string2) {
        super(null, 0, 3, null);
        this.data = data;
        this.usergroup = string2;
    }

    public /* synthetic */ CMSData(Data data, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            data = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(data, string2);
    }

    public static /* synthetic */ CMSData copy$default(CMSData cMSData, Data data, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            data = cMSData.data;
        }
        if ((n3 &= 2) != 0) {
            string2 = cMSData.usergroup;
        }
        return cMSData.copy(data, string2);
    }

    public static final /* synthetic */ void write$Self$shared_release(CMSData object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        StatusInfo.write$Self((StatusInfo)object, u30_02, serialDescriptor);
        int n3 = 2;
        boolean bl2 = u30_02.I(serialDescriptor, n3);
        if (bl2 || (object2 = ((CMSData)object).data) != null) {
            object2 = Data$$serializer.INSTANCE;
            Data data = ((CMSData)object).data;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, data);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object2 = ((CMSData)object).usergroup) != null) {
            object2 = pe3_2.a;
            object = ((CMSData)object).usergroup;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.usergroup;
    }

    public final CMSData copy(Data data, String string2) {
        CMSData cMSData = new CMSData(data, string2);
        return cMSData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSData;
        if (!bl3) {
            return false;
        }
        object = (CMSData)object;
        Object object2 = this.data;
        Data data = ((CMSData)object).data;
        bl3 = Intrinsics.areEqual(object2, data);
        if (!bl3) {
            return false;
        }
        object2 = this.usergroup;
        object = ((CMSData)object).usergroup;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getUsergroup() {
        return this.usergroup;
    }

    public int hashCode() {
        int n3;
        Data data = this.data;
        int n4 = 0;
        if (data == null) {
            n3 = 0;
            data = null;
        } else {
            n3 = data.hashCode();
        }
        n3 *= 31;
        String string2 = this.usergroup;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setData(Data data) {
        this.data = data;
    }

    public final void setUsergroup(String string2) {
        this.usergroup = string2;
    }

    public String toString() {
        Data data = this.data;
        String string2 = this.usergroup;
        StringBuilder stringBuilder = new StringBuilder("CMSData(data=");
        stringBuilder.append(data);
        stringBuilder.append(", usergroup=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

