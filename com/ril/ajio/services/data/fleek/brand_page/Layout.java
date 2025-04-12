/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.brand_page;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Layout {
    private p83_0 components;
    private String pageName;
    private String pageTitle;
    private String platform;
    private Boolean searchEnabled;
    private String store;
    private String topDescription;

    public Layout() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Layout(String string2, String string3, String string4, String string5, String string6, p83_0 p83_02, Boolean bl2) {
        this.pageName = string2;
        this.platform = string3;
        this.store = string4;
        this.topDescription = string5;
        this.pageTitle = string6;
        this.components = p83_02;
        this.searchEnabled = bl2;
    }

    public /* synthetic */ Layout(String object, String object2, String string2, String string3, String string4, p83_0 object3, Boolean object4, int n3, DefaultConstructorMarker object5) {
        Boolean bl2;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string6 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string7 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            bl2 = null;
        } else {
            bl2 = object4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        string3 = string5;
        string4 = string6;
        object3 = string7;
        object4 = object7;
        this((String)object5, (String)object6, string5, string6, string7, (p83_0)object7, bl2);
    }

    public static /* synthetic */ Layout copy$default(Layout layout2, String string2, String object, String string3, String object2, String string4, p83_0 object3, Boolean object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = layout2.pageName;
        }
        if ((n4 = n3 & 2) != 0) {
            object = layout2.platform;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = layout2.store;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = layout2.topDescription;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = layout2.pageTitle;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object3 = layout2.components;
        }
        p83_0 p83_02 = object3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object4 = layout2.searchEnabled;
        }
        Boolean bl2 = object4;
        object = layout2;
        string3 = string2;
        object2 = object5;
        string4 = string5;
        object3 = string6;
        object4 = string7;
        object5 = bl2;
        return layout2.copy(string2, (String)object2, string5, string6, string7, p83_02, bl2);
    }

    public final String component1() {
        return this.pageName;
    }

    public final String component2() {
        return this.platform;
    }

    public final String component3() {
        return this.store;
    }

    public final String component4() {
        return this.topDescription;
    }

    public final String component5() {
        return this.pageTitle;
    }

    public final p83_0 component6() {
        return this.components;
    }

    public final Boolean component7() {
        return this.searchEnabled;
    }

    public final Layout copy(String string2, String string3, String string4, String string5, String string6, p83_0 p83_02, Boolean bl2) {
        Layout layout2 = new Layout(string2, string3, string4, string5, string6, p83_02, bl2);
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
        Object object2 = this.pageName;
        Object object3 = ((Layout)object).pageName;
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
        object3 = ((Layout)object).topDescription;
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
        object2 = this.components;
        object3 = ((Layout)object).components;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.searchEnabled;
        object = ((Layout)object).searchEnabled;
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

    public final Boolean getSearchEnabled() {
        return this.searchEnabled;
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
        String string2 = this.pageName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.platform;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.store;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.topDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.components;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.searchEnabled;
        if (object != null) {
            n7 = object.hashCode();
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

    public final void setSearchEnabled(Boolean bl2) {
        this.searchEnabled = bl2;
    }

    public final void setStore(String string2) {
        this.store = string2;
    }

    public final void setTopDescription(String string2) {
        this.topDescription = string2;
    }

    public String toString() {
        CharSequence charSequence = this.pageName;
        String string2 = this.platform;
        String string3 = this.store;
        String string4 = this.topDescription;
        String string5 = this.pageTitle;
        p83_0 p83_02 = this.components;
        Boolean bl2 = this.searchEnabled;
        charSequence = og_1.a("Layout(pageName=", (String)charSequence, ", platform=", string2, ", store=");
        X50.a((StringBuilder)charSequence, string3, ", topDescription=", string4, ", pageTitle=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", components=");
        ((StringBuilder)charSequence).append(p83_02);
        ((StringBuilder)charSequence).append(", searchEnabled=");
        return nx3_0.a((StringBuilder)charSequence, bl2, ")");
    }
}

