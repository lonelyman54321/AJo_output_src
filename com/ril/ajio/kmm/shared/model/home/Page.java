/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Page$Companion;
import com.ril.ajio.kmm.shared.model.home.Slot$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Page {
    private static final KSerializer[] $childSerializers;
    public static final Page$Companion Companion;
    private String pageName;
    private String pageTitle;
    private List slots;

    static {
        Object object = new Page$Companion(null);
        Companion = object;
        KSerializer[] kSerializerArray = xe_1.p(Slot$$serializer.INSTANCE);
        object = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{null, null, object};
        $childSerializers = kSerializerArray;
    }

    public Page() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ Page(int n3, String string2, String string3, List list, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.pageName = n4 == 0 ? null : string2;
        int n7 = n3 & 2;
        this.pageTitle = n7 == 0 ? null : string3;
        this.slots = (n3 &= 4) == 0 ? null : list;
    }

    public Page(String string2, String string3, List list) {
        this.pageName = string2;
        this.pageTitle = string3;
        this.slots = list;
    }

    public /* synthetic */ Page(String string2, String string3, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            list = null;
        }
        this(string2, string3, list);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Page copy$default(Page page, String string2, String string3, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = page.pageName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = page.pageTitle;
        }
        if ((n3 &= 4) != 0) {
            list = page.slots;
        }
        return page.copy(string2, string3, list);
    }

    public static final /* synthetic */ void write$Self$shared_release(Page object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        String string2;
        Object object2;
        Object object3 = $childSerializers;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((Page)object).pageName) != null) {
            object2 = pe3_2.a;
            string2 = ((Page)object).pageName;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((Page)object).pageTitle) != null) {
            object2 = pe3_2.a;
            string2 = ((Page)object).pageTitle;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object2 = ((Page)object).slots) != null) {
            object3 = object3[n3];
            object = ((Page)object).slots;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final String component1() {
        return this.pageName;
    }

    public final String component2() {
        return this.pageTitle;
    }

    public final List component3() {
        return this.slots;
    }

    public final Page copy(String string2, String string3, List list) {
        Page page = new Page(string2, string3, list);
        return page;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Page;
        if (!bl3) {
            return false;
        }
        object = (Page)object;
        Object object2 = this.pageName;
        String string2 = ((Page)object).pageName;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.pageTitle;
        string2 = ((Page)object).pageTitle;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.slots;
        object = ((Page)object).slots;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final List getSlots() {
        return this.slots;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.pageName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.pageTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.slots;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setPageName(String string2) {
        this.pageName = string2;
    }

    public final void setPageTitle(String string2) {
        this.pageTitle = string2;
    }

    public final void setSlots(List list) {
        this.slots = list;
    }

    public String toString() {
        CharSequence charSequence = this.pageName;
        String string2 = this.pageTitle;
        List list = this.slots;
        charSequence = og_1.a("Page(pageName=", (String)charSequence, ", pageTitle=", string2, ", slots=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

