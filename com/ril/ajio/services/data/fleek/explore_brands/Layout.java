/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Layout {
    private p83_0 components;
    private String pageName;
    private String pageTitle;
    private String platform;
    private String store;
    private String topDescription;

    public Layout() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Layout(p83_0 p83_02, String string2, String string3, String string4, String string5, String string6) {
        this.components = p83_02;
        this.pageName = string2;
        this.pageTitle = string3;
        this.platform = string4;
        this.store = string5;
        this.topDescription = string6;
    }

    public /* synthetic */ Layout(p83_0 object, String object2, String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker object3) {
        String string6;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string7 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string8 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string9 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        this((p83_0)object3, (String)object4, string7, string8, string9, string6);
    }

    public static /* synthetic */ Layout copy$default(Layout layout2, p83_0 p83_02, String object, String object2, String object3, String string2, String string3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            p83_02 = layout2.components;
        }
        if ((n4 = n3 & 2) != 0) {
            object = layout2.pageName;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = layout2.pageTitle;
        }
        String string4 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = layout2.platform;
        }
        String string5 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = layout2.store;
        }
        String string6 = string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = layout2.topDescription;
        }
        String string7 = string3;
        object = layout2;
        object2 = p83_02;
        object3 = object4;
        string2 = string4;
        string3 = string5;
        object4 = string7;
        return layout2.copy(p83_02, (String)object3, string4, string5, string6, string7);
    }

    public final p83_0 component1() {
        return this.components;
    }

    public final String component2() {
        return this.pageName;
    }

    public final String component3() {
        return this.pageTitle;
    }

    public final String component4() {
        return this.platform;
    }

    public final String component5() {
        return this.store;
    }

    public final String component6() {
        return this.topDescription;
    }

    public final Layout copy(p83_0 p83_02, String string2, String string3, String string4, String string5, String string6) {
        Layout layout2 = new Layout(p83_02, string2, string3, string4, string5, string6);
        return layout2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Layout;
        if (!bl3) {
            return false;
        }
        object = (Layout)object;
        Object object2 = this.components;
        Object object3 = ((Layout)object).components;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageName;
        object3 = ((Layout)object).pageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageTitle;
        object3 = ((Layout)object).pageTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.platform;
        object3 = ((Layout)object).platform;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.store;
        object3 = ((Layout)object).store;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.topDescription;
        object = ((Layout)object).topDescription;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final p83_0 getComponents() {
        return this.components;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getTopDescription() {
        return this.topDescription;
    }

    public int hashCode() {
        int n3;
        int n4;
        p83_0 p83_02 = this.components;
        int n7 = 0;
        if (p83_02 == null) {
            n4 = 0;
            p83_02 = null;
        } else {
            n4 = p83_02.hashCode();
        }
        n4 *= 31;
        String string2 = this.pageName;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.pageTitle;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.platform;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.store;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.topDescription;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setComponents(p83_0 p83_02) {
        this.components = p83_02;
    }

    public final void setPageName(String string2) {
        this.pageName = string2;
    }

    public final void setPageTitle(String string2) {
        this.pageTitle = string2;
    }

    public final void setPlatform(String string2) {
        this.platform = string2;
    }

    public final void setStore(String string2) {
        this.store = string2;
    }

    public final void setTopDescription(String string2) {
        this.topDescription = string2;
    }

    public String toString() {
        p83_0 p83_02 = this.components;
        String string2 = this.pageName;
        String string3 = this.pageTitle;
        String string4 = this.platform;
        String string5 = this.store;
        String string6 = this.topDescription;
        StringBuilder stringBuilder = new StringBuilder("Layout(components=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", pageName=");
        stringBuilder.append(string2);
        stringBuilder.append(", pageTitle=");
        X50.a(stringBuilder, string3, ", platform=", string4, ", store=");
        return ko_0.a(stringBuilder, string5, ", topDescription=", string6, ")");
    }
}

