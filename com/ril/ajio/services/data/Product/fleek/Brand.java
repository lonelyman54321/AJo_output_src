/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.MetaData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Brand
implements Serializable {
    private String code;
    private String description;
    private String id;
    private String image;
    private Boolean isFollowed;
    private String logo;
    private MetaData metaData;
    private String motto;
    private String name;
    private String pageHeader;
    private List tags;

    public Brand() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public Brand(String string2, String string3, String string4, String string5, String string6, String string7, List list, String string8, String string9, MetaData metaData, Boolean bl2) {
        this.id = string2;
        this.name = string3;
        this.code = string4;
        this.logo = string5;
        this.description = string6;
        this.pageHeader = string7;
        this.tags = list;
        this.image = string8;
        this.motto = string9;
        this.metaData = metaData;
        this.isFollowed = bl2;
    }

    public /* synthetic */ Brand(String object, String string2, String string3, String string4, String string5, String string6, List object2, String object3, String string7, MetaData object4, Boolean serializable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        MetaData metaData;
        String string8;
        String string9;
        List list;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl2 = null;
        if (n7 != 0) {
            n7 = 0;
            string15 = null;
        } else {
            string15 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string10 = null;
        } else {
            string10 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            list = null;
        } else {
            list = object2;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string9 = null;
        } else {
            string9 = object3;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            metaData = null;
        } else {
            metaData = object4;
        }
        if ((n4 &= 0x400) == 0) {
            bl2 = serializable;
        }
        object = this;
        string2 = string15;
        string3 = string14;
        string4 = string13;
        string5 = string12;
        string6 = string11;
        object2 = string10;
        object3 = list;
        string7 = string9;
        object4 = string8;
        serializable = metaData;
        this(string15, string14, string13, string12, string11, string10, list, string9, string8, metaData, bl2);
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String string2, String string3, String string4, String string5, String string6, String string7, List list, String string8, String string9, MetaData metaData, Boolean bl2, int n3, Object object) {
        Brand brand2 = brand;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? brand.id : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? brand2.name : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? brand2.code : string4;
        int n14 = n4 & 8;
        String string13 = n14 != 0 ? brand2.logo : string5;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? brand2.description : string6;
        int n16 = n4 & 0x20;
        String string15 = n16 != 0 ? brand2.pageHeader : string7;
        int n17 = n4 & 0x40;
        List list2 = n17 != 0 ? brand2.tags : list;
        int n18 = n4 & 0x80;
        String string16 = n18 != 0 ? brand2.image : string8;
        int n19 = n4 & 0x100;
        String string17 = n19 != 0 ? brand2.motto : string9;
        int n20 = n4 & 0x200;
        MetaData metaData2 = n20 != 0 ? brand2.metaData : metaData;
        Boolean bl3 = (n4 &= 0x400) != 0 ? brand2.isFollowed : bl2;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        string7 = string15;
        list = list2;
        string8 = string16;
        string9 = string17;
        metaData = metaData2;
        bl2 = bl3;
        return brand.copy(string10, string11, string12, string13, string14, string15, list2, string16, string17, metaData2, bl3);
    }

    public final String component1() {
        return this.id;
    }

    public final MetaData component10() {
        return this.metaData;
    }

    public final Boolean component11() {
        return this.isFollowed;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.logo;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.pageHeader;
    }

    public final List component7() {
        return this.tags;
    }

    public final String component8() {
        return this.image;
    }

    public final String component9() {
        return this.motto;
    }

    public final Brand copy(String string2, String string3, String string4, String string5, String string6, String string7, List list, String string8, String string9, MetaData metaData, Boolean bl2) {
        Brand brand = new Brand(string2, string3, string4, string5, string6, string7, list, string8, string9, metaData, bl2);
        return brand;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Brand;
        if (!bl3) {
            return false;
        }
        object = (Brand)object;
        Object object2 = this.id;
        Object object3 = ((Brand)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((Brand)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.code;
        object3 = ((Brand)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((Brand)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((Brand)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageHeader;
        object3 = ((Brand)object).pageHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tags;
        object3 = ((Brand)object).tags;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.image;
        object3 = ((Brand)object).image;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.motto;
        object3 = ((Brand)object).motto;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metaData;
        object3 = ((Brand)object).metaData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isFollowed;
        object = ((Brand)object).isFollowed;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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

    public final MetaData getMetaData() {
        return this.metaData;
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
        Object object = this.name;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.code;
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
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metaData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isFollowed;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setFollowed(Boolean bl2) {
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

    public final void setMetaData(MetaData metaData) {
        this.metaData = metaData;
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

    public String toString() {
        CharSequence charSequence = this.id;
        String string2 = this.name;
        String string3 = this.code;
        String string4 = this.logo;
        String string5 = this.description;
        String string6 = this.pageHeader;
        List list = this.tags;
        String string7 = this.image;
        String string8 = this.motto;
        MetaData metaData = this.metaData;
        Boolean bl2 = this.isFollowed;
        charSequence = og_1.a("Brand(id=", (String)charSequence, ", name=", string2, ", code=");
        X50.a((StringBuilder)charSequence, string3, ", logo=", string4, ", description=");
        X50.a((StringBuilder)charSequence, string5, ", pageHeader=", string6, ", tags=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", image=");
        ((StringBuilder)charSequence).append(string7);
        ((StringBuilder)charSequence).append(", motto=");
        ((StringBuilder)charSequence).append(string8);
        ((StringBuilder)charSequence).append(", metaData=");
        ((StringBuilder)charSequence).append(metaData);
        ((StringBuilder)charSequence).append(", isFollowed=");
        return nx3_0.a((StringBuilder)charSequence, bl2, ")");
    }
}

