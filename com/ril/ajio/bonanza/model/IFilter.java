/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class IFilter {
    public static final int $stable = 8;
    private p83_0 couponAttributeValues;
    private boolean isSelected;
    private String key;

    public IFilter() {
        this(null, null, false, 7, null);
    }

    public IFilter(p83_0 p83_02, String string2, boolean bl2) {
        this.couponAttributeValues = p83_02;
        this.key = string2;
        this.isSelected = bl2;
    }

    public /* synthetic */ IFilter(p83_0 p83_02, String string2, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            p83_02 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        this(p83_02, string2, bl2);
    }

    public static /* synthetic */ IFilter copy$default(IFilter iFilter, p83_0 p83_02, String string2, boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            p83_02 = iFilter.couponAttributeValues;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = iFilter.key;
        }
        if ((n3 &= 4) != 0) {
            bl2 = iFilter.isSelected;
        }
        return iFilter.copy(p83_02, string2, bl2);
    }

    public final p83_0 component1() {
        return this.couponAttributeValues;
    }

    public final String component2() {
        return this.key;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final IFilter copy(p83_0 p83_02, String string2, boolean bl2) {
        IFilter iFilter = new IFilter(p83_02, string2, bl2);
        return iFilter;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof IFilter;
        if (!bl3) {
            return false;
        }
        object = (IFilter)object;
        Object object2 = this.couponAttributeValues;
        Object object3 = ((IFilter)object).couponAttributeValues;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.key;
        object3 = ((IFilter)object).key;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isSelected;
        boolean bl4 = ((IFilter)object).isSelected;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final p83_0 getCouponAttributeValues() {
        return this.couponAttributeValues;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int n3;
        p83_0 p83_02 = this.couponAttributeValues;
        int n4 = 0;
        if (p83_02 == null) {
            n3 = 0;
            p83_02 = null;
        } else {
            n3 = p83_02.hashCode();
        }
        n3 *= 31;
        String string2 = this.key;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isSelected ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCouponAttributeValues(p83_0 p83_02) {
        this.couponAttributeValues = p83_02;
    }

    public final void setKey(String string2) {
        this.key = string2;
    }

    public final void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public String toString() {
        p83_0 p83_02 = this.couponAttributeValues;
        String string2 = this.key;
        boolean bl2 = this.isSelected;
        StringBuilder stringBuilder = new StringBuilder("IFilter(couponAttributeValues=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", key=");
        stringBuilder.append(string2);
        stringBuilder.append(", isSelected=");
        return Vm.a(")", bl2, stringBuilder);
    }
}

