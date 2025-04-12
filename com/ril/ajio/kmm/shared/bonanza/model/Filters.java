/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.Filters$Companion;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Filters {
    private static final KSerializer[] $childSerializers;
    public static final Filters$Companion Companion;
    private List couponAttributeValues;
    private String key;

    static {
        Object object = new Filters$Companion(null);
        Companion = object;
        KSerializer[] kSerializerArray = CouponAttributeValues$$serializer.INSTANCE;
        object = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{object, null};
        $childSerializers = kSerializerArray;
    }

    public Filters() {
        this(null, null, 3, null);
    }

    public /* synthetic */ Filters(int n3, List list, String string2, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.couponAttributeValues = n4 == 0 ? null : list;
        this.key = (n3 &= 2) == 0 ? null : string2;
    }

    public Filters(List list, String string2) {
        this.couponAttributeValues = list;
        this.key = string2;
    }

    public /* synthetic */ Filters(List list, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(list, string2);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Filters copy$default(Filters filters, List list, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = filters.couponAttributeValues;
        }
        if ((n3 &= 2) != 0) {
            string2 = filters.key;
        }
        return filters.copy(list, string2);
    }

    public static final /* synthetic */ void write$Self$shared_release(Filters object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        List list;
        Object object2 = $childSerializers;
        boolean bl2 = false;
        Object object3 = null;
        boolean bl3 = u30_02.I(serialDescriptor, 0);
        if (bl3 || (list = ((Filters)object).couponAttributeValues) != null) {
            object2 = object2[0];
            list = ((Filters)object).couponAttributeValues;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, list);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((Filters)object).key) != null) {
            object3 = pe3_2.a;
            object = ((Filters)object).key;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final List component1() {
        return this.couponAttributeValues;
    }

    public final String component2() {
        return this.key;
    }

    public final Filters copy(List list, String string2) {
        Filters filters = new Filters(list, string2);
        return filters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Filters;
        if (!bl3) {
            return false;
        }
        object = (Filters)object;
        Object object2 = this.couponAttributeValues;
        List list = ((Filters)object).couponAttributeValues;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.key;
        object = ((Filters)object).key;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getCouponAttributeValues() {
        return this.couponAttributeValues;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int n3;
        List list = this.couponAttributeValues;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        String string2 = this.key;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setCouponAttributeValues(List list) {
        this.couponAttributeValues = list;
    }

    public final void setKey(String string2) {
        this.key = string2;
    }

    public String toString() {
        List list = this.couponAttributeValues;
        String string2 = this.key;
        StringBuilder stringBuilder = new StringBuilder("Filters(couponAttributeValues=");
        stringBuilder.append(list);
        stringBuilder.append(", key=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

