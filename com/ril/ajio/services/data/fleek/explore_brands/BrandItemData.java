/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class BrandItemData {
    private String code;
    private String description;
    private String id;
    private String image;
    private boolean isFollowed;
    private String logo;
    private String motto;
    private String name;
    private String pageHeader;
    private List tags;
    private String type;

    public BrandItemData() {
        this(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    public BrandItemData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, List list, String string9, String string10, boolean bl2) {
        this.id = string2;
        this.code = string3;
        this.name = string4;
        this.logo = string5;
        this.type = string6;
        this.description = string7;
        this.pageHeader = string8;
        this.tags = list;
        this.image = string9;
        this.motto = string10;
        this.isFollowed = bl2;
    }

    public /* synthetic */ BrandItemData(String object, String string2, String string3, String string4, String string5, String string6, String string7, List object2, String object3, String string8, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string9;
        List list;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        int n4 = n3;
        int n7 = n3 & 1;
        String string17 = null;
        if (n7 != 0) {
            n7 = 0;
            string16 = null;
        } else {
            string16 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string15 = null;
        } else {
            string15 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string14 = null;
        } else {
            string14 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string13 = null;
        } else {
            string13 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string12 = null;
        } else {
            string12 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string11 = null;
        } else {
            string11 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string10 = null;
        } else {
            string10 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            list = null;
        } else {
            list = object2;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string9 = null;
        } else {
            string9 = object3;
        }
        int n20 = n4 & 0x200;
        if (n20 == 0) {
            string17 = string8;
        }
        n4 = (n4 &= 0x400) != 0 ? 0 : (int)(bl2 ? 1 : 0);
        object = this;
        string2 = string16;
        string3 = string15;
        string4 = string14;
        string5 = string13;
        string6 = string12;
        string7 = string11;
        object2 = string10;
        object3 = list;
        string8 = string9;
        n3 = n4;
        this(string16, string15, string14, string13, string12, string11, string10, list, string9, string17, n4 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BrandItemData copy$default(BrandItemData brandItemData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, List list, String string9, String string10, boolean bl2, int n3, Object object) {
        void var12_13;
        BrandItemData brandItemData2 = brandItemData;
        int bl3 = var12_13;
        int n4 = var12_13 & 1;
        String string11 = n4 != 0 ? brandItemData.id : string2;
        int n7 = bl3 & 2;
        String string12 = n7 != 0 ? brandItemData2.code : string3;
        int n8 = bl3 & 4;
        String string13 = n8 != 0 ? brandItemData2.name : string4;
        int n10 = bl3 & 8;
        String string14 = n10 != 0 ? brandItemData2.logo : string5;
        int n14 = bl3 & 0x10;
        String string15 = n14 != 0 ? brandItemData2.type : string6;
        int n15 = bl3 & 0x20;
        String string16 = n15 != 0 ? brandItemData2.description : string7;
        int n16 = bl3 & 0x40;
        String string17 = n16 != 0 ? brandItemData2.pageHeader : string8;
        int n17 = bl3 & 0x80;
        List list2 = n17 != 0 ? brandItemData2.tags : list;
        int n18 = bl3 & 0x100;
        String string18 = n18 != 0 ? brandItemData2.image : string9;
        int n19 = bl3 & 0x200;
        String string19 = n19 != 0 ? brandItemData2.motto : string10;
        bl3 = (bl3 &= 0x400) ? (int)brandItemData2.isFollowed : (int)bl2;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        list = list2;
        string9 = string18;
        string10 = string19;
        int bl4 = bl3;
        return brandItemData.copy(string11, string12, string13, string14, string15, string16, string17, list2, string18, string19, (boolean)bl3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.motto;
    }

    public final boolean component11() {
        return this.isFollowed;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.logo;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.pageHeader;
    }

    public final List component8() {
        return this.tags;
    }

    public final String component9() {
        return this.image;
    }

    public final BrandItemData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, List list, String string9, String string10, boolean bl2) {
        BrandItemData brandItemData = new BrandItemData(string2, string3, string4, string5, string6, string7, string8, list, string9, string10, bl2);
        return brandItemData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrandItemData;
        if (!bl3) {
            return false;
        }
        object = (BrandItemData)object;
        Object object2 = this.id;
        Object object3 = ((BrandItemData)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.code;
        object3 = ((BrandItemData)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((BrandItemData)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((BrandItemData)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((BrandItemData)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((BrandItemData)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageHeader;
        object3 = ((BrandItemData)object).pageHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tags;
        object3 = ((BrandItemData)object).tags;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.image;
        object3 = ((BrandItemData)object).image;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.motto;
        object3 = ((BrandItemData)object).motto;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isFollowed;
        boolean bl4 = ((BrandItemData)object).isFollowed;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getMotto() {
        return this.motto;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageHeader() {
        return this.pageHeader;
    }

    public final List getTags() {
        return this.tags;
    }

    public final String getTagsFromList() {
        boolean bl2;
        Object object = new SpannableStringBuilder();
        Object object2 = this.tags;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            object2 = this.tags;
            if (object2 != null) {
                boolean bl3;
                object2 = ((Iterable)object2).iterator();
                while (bl3 = object2.hasNext()) {
                    String string2 = (String)object2.next();
                    object.append((CharSequence)string2);
                    string2 = "  ";
                    object.append((CharSequence)string2);
                }
            }
            object = object.toString();
            object2 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            object = "";
        }
        return object;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.id;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.code;
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
        object = this.logo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageHeader;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tags;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.image;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.motto;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isFollowed ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setFollowed(boolean bl2) {
        this.isFollowed = bl2;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setImage(String string2) {
        this.image = string2;
    }

    public final void setLogo(String string2) {
        this.logo = string2;
    }

    public final void setMotto(String string2) {
        this.motto = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPageHeader(String string2) {
        this.pageHeader = string2;
    }

    public final void setTags(List list) {
        this.tags = list;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        CharSequence charSequence = this.id;
        String string2 = this.code;
        String string3 = this.name;
        String string4 = this.logo;
        String string5 = this.type;
        String string6 = this.description;
        String string7 = this.pageHeader;
        List list = this.tags;
        String string8 = this.image;
        String string9 = this.motto;
        boolean bl2 = this.isFollowed;
        charSequence = og_1.a("BrandItemData(id=", (String)charSequence, ", code=", string2, ", name=");
        X50.a((StringBuilder)charSequence, string3, ", logo=", string4, ", type=");
        X50.a((StringBuilder)charSequence, string5, ", description=", string6, ", pageHeader=");
        ((StringBuilder)charSequence).append(string7);
        ((StringBuilder)charSequence).append(", tags=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", image=");
        X50.a((StringBuilder)charSequence, string8, ", motto=", string9, ", isFollowed=");
        return Vm.a(")", bl2, (StringBuilder)charSequence);
    }
}

