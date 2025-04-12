/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Layout {
    private String allPostSeen;
    private p83_0 components;
    private String pageName;
    private String pageTitle;
    private String platform;
    private String store;

    public Layout() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Layout(String string2, p83_0 p83_02, String string3, String string4, String string5, String string6) {
        this.allPostSeen = string2;
        this.components = p83_02;
        this.pageName = string3;
        this.pageTitle = string4;
        this.platform = string5;
        this.store = string6;
    }

    public /* synthetic */ Layout(String object, p83_0 object2, String object3, String string2, String string3, String string4, int n3, DefaultConstructorMarker object4) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 0x10;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object4;
        object3 = object5;
        string2 = object6;
        string3 = string6;
        string4 = string7;
        this((String)object4, (p83_0)object5, (String)object6, string6, string7, string5);
    }

    public static /* synthetic */ Layout copy$default(Layout layout2, String string2, p83_0 object, String string3, String object2, String string4, String string5, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = layout2.allPostSeen;
        }
        if ((n4 = n3 & 2) != 0) {
            object = layout2.components;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = layout2.pageName;
        }
        String string6 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = layout2.pageTitle;
        }
        String string7 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = layout2.platform;
        }
        String string8 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = layout2.store;
        }
        String string9 = string5;
        object = layout2;
        string3 = string2;
        object2 = object3;
        string4 = string6;
        string5 = string7;
        object3 = string9;
        return layout2.copy(string2, (p83_0)object2, string6, string7, string8, string9);
    }

    public final String component1() {
        return this.allPostSeen;
    }

    public final p83_0 component2() {
        return this.components;
    }

    public final String component3() {
        return this.pageName;
    }

    public final String component4() {
        return this.pageTitle;
    }

    public final String component5() {
        return this.platform;
    }

    public final String component6() {
        return this.store;
    }

    public final Layout copy(String string2, p83_0 p83_02, String string3, String string4, String string5, String string6) {
        Layout layout2 = new Layout(string2, p83_02, string3, string4, string5, string6);
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
        Object object2 = this.allPostSeen;
        Object object3 = ((Layout)object).allPostSeen;
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
        object = ((Layout)object).store;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAllPostSeen() {
        return this.allPostSeen;
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

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.allPostSeen;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.components;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageName;
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
        object = this.platform;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.store;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAllPostSeen(String string2) {
        this.allPostSeen = string2;
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

    public String toString() {
        String string2 = this.allPostSeen;
        p83_0 p83_02 = this.components;
        String string3 = this.pageName;
        String string4 = this.pageTitle;
        String string5 = this.platform;
        String string6 = this.store;
        StringBuilder stringBuilder = new StringBuilder("Layout(allPostSeen=");
        stringBuilder.append(string2);
        stringBuilder.append(", components=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", pageName=");
        X50.a(stringBuilder, string3, ", pageTitle=", string4, ", platform=");
        return ko_0.a(stringBuilder, string5, ", store=", string6, ")");
    }
}

