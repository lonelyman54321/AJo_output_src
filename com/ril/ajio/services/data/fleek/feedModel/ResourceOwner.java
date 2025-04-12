/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 */
package com.ril.ajio.services.data.fleek.feedModel;

import android.text.SpannableStringBuilder;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ResourceOwner {
    private String brandCode;
    private String brandImage;
    private String brandPageHeader;
    private String code;
    private String description;
    private String id;
    private String imageUrl;
    private Boolean isFollowed;
    private Boolean isFollowing;
    private String isUserFollowing;
    private String logo;
    private MetaData metadata;
    private String motto;
    private String name;
    private List tags;
    private String type;

    public ResourceOwner() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (char)-1, null);
    }

    public ResourceOwner(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, List list, String string10, String string11, Boolean bl2, MetaData metaData, String string12, Boolean bl3, String string13) {
        this.brandCode = string2;
        this.brandImage = string3;
        this.brandPageHeader = string4;
        this.description = string5;
        this.id = string6;
        this.isUserFollowing = string7;
        this.logo = string8;
        this.name = string9;
        this.tags = list;
        this.type = string10;
        this.imageUrl = string11;
        this.isFollowing = bl2;
        this.metadata = metaData;
        this.code = string12;
        this.isFollowed = bl3;
        this.motto = string13;
    }

    public /* synthetic */ ResourceOwner(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, List object2, String object3, String string9, Boolean object4, MetaData object5, String object6, Boolean object7, String object8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string10;
        Boolean bl2;
        String string11;
        MetaData metaData;
        Boolean bl3;
        String string12;
        String string13;
        List list;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string21 = null;
        } else {
            string21 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string20 = null;
        } else {
            string20 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string19 = null;
        } else {
            string19 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string18 = null;
        } else {
            string18 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string17 = null;
        } else {
            string17 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string16 = null;
        } else {
            string16 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string15 = null;
        } else {
            string15 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string14 = null;
        } else {
            string14 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            list = null;
        } else {
            list = object2;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string13 = null;
        } else {
            string13 = object3;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string12 = null;
        } else {
            string12 = string9;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            bl3 = null;
        } else {
            bl3 = object4;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            metaData = null;
        } else {
            metaData = object5;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string11 = null;
        } else {
            string11 = object6;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            bl2 = null;
        } else {
            bl2 = object7;
        }
        int n27 = 32768;
        if ((n4 &= n27) != 0) {
            n4 = 0;
            string10 = null;
        } else {
            string10 = object8;
        }
        object = this;
        string2 = string21;
        string3 = string20;
        string4 = string19;
        string5 = string18;
        string6 = string17;
        string7 = string16;
        string8 = string15;
        object2 = string14;
        object3 = list;
        string9 = string13;
        object4 = string12;
        object5 = bl3;
        object6 = metaData;
        object7 = string11;
        object8 = bl2;
        this(string21, string20, string19, string18, string17, string16, string15, string14, list, string13, string12, bl3, metaData, string11, bl2, string10);
    }

    public static /* synthetic */ ResourceOwner copy$default(ResourceOwner resourceOwner, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, List list, String string10, String string11, Boolean bl2, MetaData metaData, String string12, Boolean object, String string13, int n3, Object object2) {
        ResourceOwner resourceOwner2 = resourceOwner;
        int n4 = n3;
        int n7 = n3 & 1;
        String string14 = n7 != 0 ? resourceOwner.brandCode : string2;
        int n8 = n4 & 2;
        String string15 = n8 != 0 ? resourceOwner2.brandImage : string3;
        int n10 = n4 & 4;
        String string16 = n10 != 0 ? resourceOwner2.brandPageHeader : string4;
        int n14 = n4 & 8;
        String string17 = n14 != 0 ? resourceOwner2.description : string5;
        int n15 = n4 & 0x10;
        String string18 = n15 != 0 ? resourceOwner2.id : string6;
        int n16 = n4 & 0x20;
        String string19 = n16 != 0 ? resourceOwner2.isUserFollowing : string7;
        int n17 = n4 & 0x40;
        String string20 = n17 != 0 ? resourceOwner2.logo : string8;
        int n18 = n4 & 0x80;
        String string21 = n18 != 0 ? resourceOwner2.name : string9;
        int n19 = n4 & 0x100;
        List list2 = n19 != 0 ? resourceOwner2.tags : list;
        int n20 = n4 & 0x200;
        String string22 = n20 != 0 ? resourceOwner2.type : string10;
        int n21 = n4 & 0x400;
        String string23 = n21 != 0 ? resourceOwner2.imageUrl : string11;
        int n22 = n4 & 0x800;
        Boolean bl3 = n22 != 0 ? resourceOwner2.isFollowing : bl2;
        int n24 = n4 & 0x1000;
        MetaData metaData2 = n24 != 0 ? resourceOwner2.metadata : metaData;
        int n25 = n4 & 0x2000;
        Object object3 = n25 != 0 ? resourceOwner2.code : string12;
        string12 = object3;
        n25 = n4 & 0x4000;
        object3 = n25 != 0 ? resourceOwner2.isFollowed : object;
        int n26 = 32768;
        String string24 = (n4 &= n26) != 0 ? resourceOwner2.motto : string13;
        string2 = string14;
        string3 = string15;
        string4 = string16;
        string5 = string17;
        string6 = string18;
        string7 = string19;
        string8 = string20;
        string9 = string21;
        list = list2;
        string10 = string22;
        string11 = string23;
        bl2 = bl3;
        metaData = metaData2;
        object = object3;
        string13 = string24;
        return resourceOwner.copy(string14, string15, string16, string17, string18, string19, string20, string21, list2, string22, string23, bl3, metaData2, string12, (Boolean)object3, string24);
    }

    public final String component1() {
        return this.brandCode;
    }

    public final String component10() {
        return this.type;
    }

    public final String component11() {
        return this.imageUrl;
    }

    public final Boolean component12() {
        return this.isFollowing;
    }

    public final MetaData component13() {
        return this.metadata;
    }

    public final String component14() {
        return this.code;
    }

    public final Boolean component15() {
        return this.isFollowed;
    }

    public final String component16() {
        return this.motto;
    }

    public final String component2() {
        return this.brandImage;
    }

    public final String component3() {
        return this.brandPageHeader;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.id;
    }

    public final String component6() {
        return this.isUserFollowing;
    }

    public final String component7() {
        return this.logo;
    }

    public final String component8() {
        return this.name;
    }

    public final List component9() {
        return this.tags;
    }

    public final ResourceOwner copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, List list, String string10, String string11, Boolean bl2, MetaData metaData, String string12, Boolean bl3, String string13) {
        ResourceOwner resourceOwner = new ResourceOwner(string2, string3, string4, string5, string6, string7, string8, string9, list, string10, string11, bl2, metaData, string12, bl3, string13);
        return resourceOwner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ResourceOwner;
        if (!bl3) {
            return false;
        }
        object = (ResourceOwner)object;
        Object object2 = this.brandCode;
        Object object3 = ((ResourceOwner)object).brandCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandImage;
        object3 = ((ResourceOwner)object).brandImage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandPageHeader;
        object3 = ((ResourceOwner)object).brandPageHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((ResourceOwner)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.id;
        object3 = ((ResourceOwner)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isUserFollowing;
        object3 = ((ResourceOwner)object).isUserFollowing;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((ResourceOwner)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((ResourceOwner)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tags;
        object3 = ((ResourceOwner)object).tags;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((ResourceOwner)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((ResourceOwner)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isFollowing;
        object3 = ((ResourceOwner)object).isFollowing;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((ResourceOwner)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.code;
        object3 = ((ResourceOwner)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isFollowed;
        object3 = ((ResourceOwner)object).isFollowed;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.motto;
        object = ((ResourceOwner)object).motto;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandCode() {
        return this.brandCode;
    }

    public final String getBrandImage() {
        return this.brandImage;
    }

    public final String getBrandPageHeader() {
        return this.brandPageHeader;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getMotto() {
        return this.motto;
    }

    public final String getName() {
        return this.name;
    }

    public final List getTags() {
        return this.tags;
    }

    public final String getTagsFromList() {
        boolean bl2;
        Object object = new SpannableStringBuilder();
        Object object2 = this.tags;
        String string2 = "";
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            object2 = this.tags;
            if (object2 != null) {
                boolean bl3;
                object2 = ((Iterable)object2).iterator();
                while (bl3 = object2.hasNext()) {
                    String string3 = (String)object2.next();
                    if (string3 == null || (string3 = ((Object)StringsKt.m0(string3)).toString()) == null) {
                        string3 = string2;
                    }
                    object.append((CharSequence)string3);
                    string3 = "  ";
                    object.append((CharSequence)string3);
                }
            }
            object = object.toString();
            object2 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = StringsKt.m0((CharSequence)object);
            string2 = object.toString();
        }
        return string2;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.brandImage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brandPageHeader;
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
        object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isUserFollowing;
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
        object = this.name;
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
        object = this.type;
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
        object = this.isFollowing;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
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
        object = this.isFollowed;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.motto;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    public final Boolean isFollowing() {
        return this.isFollowing;
    }

    public final String isUserFollowing() {
        return this.isUserFollowing;
    }

    public final void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public final void setBrandImage(String string2) {
        this.brandImage = string2;
    }

    public final void setBrandPageHeader(String string2) {
        this.brandPageHeader = string2;
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

    public final void setFollowing(Boolean bl2) {
        this.isFollowing = bl2;
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

    public final void setMetadata(MetaData metaData) {
        this.metadata = metaData;
    }

    public final void setMotto(String string2) {
        this.motto = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setTags(List list) {
        this.tags = list;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setUserFollowing(String string2) {
        this.isUserFollowing = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.brandCode;
        String string2 = this.brandImage;
        String string3 = this.brandPageHeader;
        String string4 = this.description;
        String string5 = this.id;
        String string6 = this.isUserFollowing;
        String string7 = this.logo;
        String string8 = this.name;
        List list = this.tags;
        String string9 = this.type;
        String string10 = this.imageUrl;
        Boolean bl2 = this.isFollowing;
        MetaData metaData = this.metadata;
        String string11 = this.code;
        Boolean bl3 = this.isFollowed;
        String string12 = this.motto;
        object = og_1.a("ResourceOwner(brandCode=", (String)object2, ", brandImage=", string2, ", brandPageHeader=");
        X50.a((StringBuilder)object, string3, ", description=", string4, ", id=");
        X50.a((StringBuilder)object, string5, ", isUserFollowing=", string6, ", logo=");
        X50.a((StringBuilder)object, string7, ", name=", string8, ", tags=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", imageUrl=");
        vw0_1.a(bl2, string10, ", isFollowing=", ", metadata=", (StringBuilder)object);
        ((StringBuilder)object).append(metaData);
        ((StringBuilder)object).append(", code=");
        object2 = string11;
        ((StringBuilder)object).append(string11);
        ((StringBuilder)object).append(", isFollowed=");
        object2 = bl3;
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", motto=");
        object2 = string12;
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

