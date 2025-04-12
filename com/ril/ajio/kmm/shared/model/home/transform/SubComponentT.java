/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubComponentT {
    private int height;
    private String imageUrl;
    private int width;
    private int x;
    private int y;

    public SubComponentT(int n3, int n4, String string2, int n7, int n8) {
        this.width = n3;
        this.height = n4;
        this.imageUrl = string2;
        this.x = n7;
        this.y = n8;
    }

    public /* synthetic */ SubComponentT(int n3, int n4, String string2, int n7, int n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n10 &= 4) != 0) {
            string2 = null;
        }
        this(n3, n4, string2, n7, n8);
    }

    public static /* synthetic */ SubComponentT copy$default(SubComponentT subComponentT, int n3, int n4, String string2, int n7, int n8, int n10, Object object) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = subComponentT.width;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = subComponentT.height;
        }
        n14 = n4;
        n4 = n10 & 4;
        if (n4 != 0) {
            string2 = subComponentT.imageUrl;
        }
        String string3 = string2;
        n4 = n10 & 8;
        if (n4 != 0) {
            n7 = subComponentT.x;
        }
        int n15 = n7;
        n4 = n10 & 0x10;
        if (n4 != 0) {
            n8 = subComponentT.y;
        }
        n7 = n14;
        n10 = n15;
        n14 = n8;
        return subComponentT.copy(n3, n7, string3, n15, n8);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final int component4() {
        return this.x;
    }

    public final int component5() {
        return this.y;
    }

    public final SubComponentT copy(int n3, int n4, String string2, int n7, int n8) {
        SubComponentT subComponentT = new SubComponentT(n3, n4, string2, n7, n8);
        return subComponentT;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof SubComponentT;
        if (n3 == 0) {
            return false;
        }
        object = (SubComponentT)object;
        n3 = this.width;
        int n4 = ((SubComponentT)object).width;
        if (n3 != n4) {
            return false;
        }
        n3 = this.height;
        n4 = ((SubComponentT)object).height;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.imageUrl;
        String string3 = ((SubComponentT)object).imageUrl;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.x;
        n4 = ((SubComponentT)object).x;
        if (n3 != n4) {
            return false;
        }
        n3 = this.y;
        int n7 = ((SubComponentT)object).y;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        int n3 = this.width * 31;
        int n4 = this.height;
        n3 = (n3 + n4) * 31;
        String string2 = this.imageUrl;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.x;
        n3 = (n3 + n4) * 31;
        n4 = this.y;
        return n3 + n4;
    }

    public final void setHeight(int n3) {
        this.height = n3;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setWidth(int n3) {
        this.width = n3;
    }

    public final void setX(int n3) {
        this.x = n3;
    }

    public final void setY(int n3) {
        this.y = n3;
    }

    public String toString() {
        int n3 = this.width;
        int n4 = this.height;
        String string2 = this.imageUrl;
        int n7 = this.x;
        int n8 = this.y;
        StringBuilder stringBuilder = fQ2.a("SubComponentT(width=", ", height=", ", imageUrl=", n3, n4);
        stringBuilder.append(string2);
        stringBuilder.append(", x=");
        stringBuilder.append(n7);
        stringBuilder.append(", y=");
        return g30.a(n8, ")", stringBuilder);
    }
}

