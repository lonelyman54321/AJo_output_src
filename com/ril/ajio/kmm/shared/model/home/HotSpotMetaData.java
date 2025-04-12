/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class HotSpotMetaData {
    public static final HotSpotMetaData$Companion Companion;
    private String event;
    private Integer hotspotMetadataId;

    static {
        HotSpotMetaData$Companion hotSpotMetaData$Companion;
        Companion = hotSpotMetaData$Companion = new HotSpotMetaData$Companion(null);
    }

    public HotSpotMetaData() {
        this(null, null, 3, null);
    }

    public /* synthetic */ HotSpotMetaData(int n3, String string2, Integer n4, a03_0 a03_02) {
        int n7 = n3 & 1;
        this.event = n7 == 0 ? null : string2;
        this.hotspotMetadataId = (n3 &= 2) == 0 ? null : n4;
    }

    public HotSpotMetaData(String string2, Integer n3) {
        this.event = string2;
        this.hotspotMetadataId = n3;
    }

    public /* synthetic */ HotSpotMetaData(String string2, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n4 &= 2) != 0) {
            n3 = null;
        }
        this(string2, n3);
    }

    public static /* synthetic */ HotSpotMetaData copy$default(HotSpotMetaData hotSpotMetaData, String string2, Integer n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = hotSpotMetaData.event;
        }
        if ((n4 &= 2) != 0) {
            n3 = hotSpotMetaData.hotspotMetadataId;
        }
        return hotSpotMetaData.copy(string2, n3);
    }

    public static final /* synthetic */ void write$Self$shared_release(HotSpotMetaData object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((HotSpotMetaData)object).event) != null) {
            object2 = pe3_2.a;
            String string2 = ((HotSpotMetaData)object).event;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((HotSpotMetaData)object).hotspotMetadataId) != null) {
            object2 = yi1_2.a;
            object = ((HotSpotMetaData)object).hotspotMetadataId;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final String component1() {
        return this.event;
    }

    public final Integer component2() {
        return this.hotspotMetadataId;
    }

    public final HotSpotMetaData copy(String string2, Integer n3) {
        HotSpotMetaData hotSpotMetaData = new HotSpotMetaData(string2, n3);
        return hotSpotMetaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HotSpotMetaData;
        if (!bl3) {
            return false;
        }
        object = (HotSpotMetaData)object;
        Object object2 = this.event;
        String string2 = ((HotSpotMetaData)object).event;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.hotspotMetadataId;
        object = ((HotSpotMetaData)object).hotspotMetadataId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEvent() {
        return this.event;
    }

    public final Integer getHotspotMetadataId() {
        return this.hotspotMetadataId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.event;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Integer n7 = this.hotspotMetadataId;
        if (n7 != null) {
            n4 = ((Object)n7).hashCode();
        }
        return n3 + n4;
    }

    public final void setEvent(String string2) {
        this.event = string2;
    }

    public final void setHotspotMetadataId(Integer n3) {
        this.hotspotMetadataId = n3;
    }

    public String toString() {
        String string2 = this.event;
        Integer n3 = this.hotspotMetadataId;
        StringBuilder stringBuilder = new StringBuilder("HotSpotMetaData(event=");
        stringBuilder.append(string2);
        stringBuilder.append(", hotspotMetadataId=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

