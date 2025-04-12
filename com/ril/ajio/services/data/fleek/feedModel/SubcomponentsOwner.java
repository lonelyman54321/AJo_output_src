/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubcomponentsOwner {
    private String code;
    private String id;
    private String imageUrl;
    private Boolean isFollowed;
    private boolean isUserFollowing;
    private String logo;
    private String name;
    private String type;

    public SubcomponentsOwner() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public SubcomponentsOwner(String string2, String string3, String string4, Boolean bl2, String string5, String string6, String string7, boolean bl3) {
        this.code = string2;
        this.id = string3;
        this.imageUrl = string4;
        this.isFollowed = bl2;
        this.logo = string5;
        this.name = string6;
        this.type = string7;
        this.isUserFollowing = bl3;
    }

    public /* synthetic */ SubcomponentsOwner(String object, String string2, String string3, Boolean object2, String object3, String string4, String string5, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        String string7;
        Boolean bl3;
        String string8;
        String string9;
        String string10;
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = null;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            bl3 = null;
        } else {
            bl3 = object2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n17 = n4 & 0x40;
        if (n17 == 0) {
            string11 = string5;
        }
        n4 = (n4 &= 0x80) != 0 ? 0 : (int)(bl2 ? 1 : 0);
        object = this;
        string2 = string10;
        string3 = string9;
        object2 = string8;
        object3 = bl3;
        string4 = string7;
        string5 = string6;
        n3 = n4;
        this(string10, string9, string8, bl3, string7, string6, string11, n4 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ SubcomponentsOwner copy$default(SubcomponentsOwner subcomponentsOwner, String string2, String string3, String string4, Boolean bl2, String string5, String string6, String string7, boolean bl3, int n3, Object object) {
        void var9_10;
        SubcomponentsOwner subcomponentsOwner2 = subcomponentsOwner;
        int bl4 = var9_10;
        int n4 = var9_10 & 1;
        String string8 = n4 != 0 ? subcomponentsOwner.code : string2;
        int n7 = bl4 & 2;
        String string9 = n7 != 0 ? subcomponentsOwner2.id : string3;
        int n8 = bl4 & 4;
        String string10 = n8 != 0 ? subcomponentsOwner2.imageUrl : string4;
        int n10 = bl4 & 8;
        Boolean bl5 = n10 != 0 ? subcomponentsOwner2.isFollowed : bl2;
        int n14 = bl4 & 0x10;
        String string11 = n14 != 0 ? subcomponentsOwner2.logo : string5;
        int n15 = bl4 & 0x20;
        String string12 = n15 != 0 ? subcomponentsOwner2.name : string6;
        int n16 = bl4 & 0x40;
        String string13 = n16 != 0 ? subcomponentsOwner2.type : string7;
        bl4 = (bl4 &= 0x80) ? (int)subcomponentsOwner2.isUserFollowing : (int)bl3;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        bl2 = bl5;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        int bl6 = bl4;
        return subcomponentsOwner.copy(string8, string9, string10, bl5, string11, string12, string13, (boolean)bl4);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final Boolean component4() {
        return this.isFollowed;
    }

    public final String component5() {
        return this.logo;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.type;
    }

    public final boolean component8() {
        return this.isUserFollowing;
    }

    public final SubcomponentsOwner copy(String string2, String string3, String string4, Boolean bl2, String string5, String string6, String string7, boolean bl3) {
        SubcomponentsOwner subcomponentsOwner = new SubcomponentsOwner(string2, string3, string4, bl2, string5, string6, string7, bl3);
        return subcomponentsOwner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubcomponentsOwner;
        if (!bl3) {
            return false;
        }
        object = (SubcomponentsOwner)object;
        Object object2 = this.code;
        Object object3 = ((SubcomponentsOwner)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.id;
        object3 = ((SubcomponentsOwner)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((SubcomponentsOwner)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isFollowed;
        object3 = ((SubcomponentsOwner)object).isFollowed;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((SubcomponentsOwner)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((SubcomponentsOwner)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((SubcomponentsOwner)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isUserFollowing;
        boolean bl4 = ((SubcomponentsOwner)object).isUserFollowing;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isFollowed;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.logo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.name;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isUserFollowing ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    public final boolean isUserFollowing() {
        return this.isUserFollowing;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setFollowed(Boolean bl2) {
        this.isFollowed = bl2;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setLogo(String string2) {
        this.logo = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setUserFollowing(boolean bl2) {
        this.isUserFollowing = bl2;
    }

    public String toString() {
        CharSequence charSequence = this.code;
        String string2 = this.id;
        String string3 = this.imageUrl;
        Boolean bl2 = this.isFollowed;
        String string4 = this.logo;
        String string5 = this.name;
        String string6 = this.type;
        boolean bl3 = this.isUserFollowing;
        charSequence = og_1.a("SubcomponentsOwner(code=", (String)charSequence, ", id=", string2, ", imageUrl=");
        vw0_1.a(bl2, string3, ", isFollowed=", ", logo=", (StringBuilder)charSequence);
        X50.a((StringBuilder)charSequence, string4, ", name=", string5, ", type=");
        ((StringBuilder)charSequence).append(string6);
        ((StringBuilder)charSequence).append(", isUserFollowing=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

