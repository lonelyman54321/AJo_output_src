/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.MetaData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrandDetails
implements Serializable {
    private String brandCode;
    private String brandId;
    private String image;
    private String logo;
    private MetaData metaData;
    private String name;
    private String pageHeader;

    public BrandDetails() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public BrandDetails(String string2, String string3, String string4, String string5, MetaData metaData, String string6, String string7) {
        this.name = string2;
        this.logo = string3;
        this.pageHeader = string4;
        this.image = string5;
        this.metaData = metaData;
        this.brandId = string6;
        this.brandCode = string7;
    }

    public /* synthetic */ BrandDetails(String object, String object2, String string2, String string3, MetaData object3, String object4, String string4, int n3, DefaultConstructorMarker object5) {
        String string5;
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
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x20;
        Object object8 = n7 != 0 ? null : object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        string3 = string6;
        object3 = string7;
        object4 = object7;
        string4 = object8;
        this((String)object5, (String)object6, string6, string7, (MetaData)object7, (String)object8, string5);
    }

    public static /* synthetic */ BrandDetails copy$default(BrandDetails brandDetails, String string2, String object, String string3, String object2, MetaData object3, String string4, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = brandDetails.name;
        }
        if ((n4 = n3 & 2) != 0) {
            object = brandDetails.logo;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = brandDetails.pageHeader;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = brandDetails.image;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = brandDetails.metaData;
        }
        MetaData metaData = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string4 = brandDetails.brandId;
        }
        String string7 = string4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object4 = brandDetails.brandCode;
        }
        String string8 = object4;
        object = brandDetails;
        string3 = string2;
        object2 = object5;
        object3 = string5;
        string4 = string6;
        object4 = metaData;
        object5 = string8;
        return brandDetails.copy(string2, (String)object2, string5, string6, metaData, string7, string8);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.logo;
    }

    public final String component3() {
        return this.pageHeader;
    }

    public final String component4() {
        return this.image;
    }

    public final MetaData component5() {
        return this.metaData;
    }

    public final String component6() {
        return this.brandId;
    }

    public final String component7() {
        return this.brandCode;
    }

    public final BrandDetails copy(String string2, String string3, String string4, String string5, MetaData metaData, String string6, String string7) {
        BrandDetails brandDetails = new BrandDetails(string2, string3, string4, string5, metaData, string6, string7);
        return brandDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrandDetails;
        if (!bl3) {
            return false;
        }
        object = (BrandDetails)object;
        Object object2 = this.name;
        Object object3 = ((BrandDetails)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((BrandDetails)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageHeader;
        object3 = ((BrandDetails)object).pageHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.image;
        object3 = ((BrandDetails)object).image;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metaData;
        object3 = ((BrandDetails)object).metaData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandId;
        object3 = ((BrandDetails)object).brandId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandCode;
        object = ((BrandDetails)object).brandCode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandCode() {
        return this.brandCode;
    }

    public final String getBrandId() {
        return this.brandId;
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

    public final String getName() {
        return this.name;
    }

    public final String getPageHeader() {
        return this.pageHeader;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.logo;
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
        object = this.image;
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
        object = this.brandId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandCode;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public final void setBrandId(String string2) {
        this.brandId = string2;
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

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPageHeader(String string2) {
        this.pageHeader = string2;
    }

    public String toString() {
        CharSequence charSequence = this.name;
        String string2 = this.logo;
        String string3 = this.pageHeader;
        String string4 = this.image;
        MetaData metaData = this.metaData;
        String string5 = this.brandId;
        String string6 = this.brandCode;
        charSequence = og_1.a("BrandDetails(name=", (String)charSequence, ", logo=", string2, ", pageHeader=");
        X50.a((StringBuilder)charSequence, string3, ", image=", string4, ", metaData=");
        ((StringBuilder)charSequence).append(metaData);
        ((StringBuilder)charSequence).append(", brandId=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", brandCode=");
        return h30_0.a((StringBuilder)charSequence, string6, ")");
    }
}

