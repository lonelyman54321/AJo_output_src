/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.brand_page;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Padding {
    private String bottom;
    private String left;
    private String right;
    private String top;

    public Padding() {
        this(null, null, null, null, 15, null);
    }

    public Padding(String string2, String string3, String string4, String string5) {
        this.left = string2;
        this.right = string3;
        this.bottom = string4;
        this.top = string5;
    }

    public /* synthetic */ Padding(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ Padding copy$default(Padding padding, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = padding.left;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = padding.right;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = padding.bottom;
        }
        if ((n3 &= 8) != 0) {
            string5 = padding.top;
        }
        return padding.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.left;
    }

    public final String component2() {
        return this.right;
    }

    public final String component3() {
        return this.bottom;
    }

    public final String component4() {
        return this.top;
    }

    public final Padding copy(String string2, String string3, String string4, String string5) {
        Padding padding = new Padding(string2, string3, string4, string5);
        return padding;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Padding;
        if (!bl3) {
            return false;
        }
        object = (Padding)object;
        String string2 = this.left;
        String string3 = ((Padding)object).left;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.right;
        string3 = ((Padding)object).right;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.bottom;
        string3 = ((Padding)object).bottom;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.top;
        object = ((Padding)object).top;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBottom() {
        return this.bottom;
    }

    public final String getLeft() {
        return this.left;
    }

    public final String getRight() {
        return this.right;
    }

    public final String getTop() {
        return this.top;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.left;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.right;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.bottom;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.top;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBottom(String string2) {
        this.bottom = string2;
    }

    public final void setLeft(String string2) {
        this.left = string2;
    }

    public final void setRight(String string2) {
        this.right = string2;
    }

    public final void setTop(String string2) {
        this.top = string2;
    }

    public String toString() {
        String string2 = this.left;
        String string3 = this.right;
        String string4 = this.bottom;
        String string5 = this.top;
        return ko_0.a(og_1.a("Padding(left=", string2, ", right=", string3, ", bottom="), string4, ", top=", string5, ")");
    }
}

