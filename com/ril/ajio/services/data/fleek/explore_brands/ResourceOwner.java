/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import android.text.SpannableStringBuilder;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ResourceOwner {
    private String code;
    private String description;
    private String id;
    private String imageUrl;
    private Boolean isFollowed;
    private String logo;
    private MetaData metadata;
    private String motto;
    private String name;
    private String pageHeader;
    private String resourceType;
    private List tags;
    private String type;

    public ResourceOwner() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public ResourceOwner(String string2, String string3, String string4, Boolean bl2, String string5, MetaData metaData, String string6, String string7, List list, String string8, String string9, String string10, String string11) {
        this.code = string2;
        this.description = string3;
        this.id = string4;
        this.isFollowed = bl2;
        this.logo = string5;
        this.metadata = metaData;
        this.name = string6;
        this.pageHeader = string7;
        this.tags = list;
        this.type = string8;
        this.resourceType = string9;
        this.imageUrl = string10;
        this.motto = string11;
    }

    public /* synthetic */ ResourceOwner(String object, String string2, String string3, Boolean object2, String object3, MetaData object4, String object5, String string4, List object6, String object7, String string5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        String string10;
        List list;
        String string11;
        String string12;
        MetaData metaData;
        String string13;
        Boolean bl2;
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
            bl2 = null;
        } else {
            bl2 = object2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string13 = null;
        } else {
            string13 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            metaData = null;
        } else {
            metaData = object4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string12 = null;
        } else {
            string12 = object5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string11 = null;
        } else {
            string11 = string4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            list = null;
        } else {
            list = object6;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string10 = null;
        } else {
            string10 = object7;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string9 = null;
        } else {
            string9 = string5;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x1000) == 0) {
            string17 = string7;
        }
        object = this;
        string2 = string16;
        string3 = string15;
        object2 = string14;
        object3 = bl2;
        object4 = string13;
        object5 = metaData;
        string4 = string12;
        object6 = string11;
        object7 = list;
        string5 = string10;
        string6 = string9;
        string7 = string8;
        this(string16, string15, string14, bl2, string13, metaData, string12, string11, list, string10, string9, string8, string17);
    }

    public static /* synthetic */ ResourceOwner copy$default(ResourceOwner resourceOwner, String string2, String string3, String string4, Boolean bl2, String string5, MetaData metaData, String string6, String string7, List list, String string8, String string9, String string10, String string11, int n3, Object object) {
        ResourceOwner resourceOwner2 = resourceOwner;
        int n4 = n3;
        int n7 = n3 & 1;
        String string12 = n7 != 0 ? resourceOwner.code : string2;
        int n8 = n4 & 2;
        String string13 = n8 != 0 ? resourceOwner2.description : string3;
        int n10 = n4 & 4;
        String string14 = n10 != 0 ? resourceOwner2.id : string4;
        int n14 = n4 & 8;
        Boolean bl3 = n14 != 0 ? resourceOwner2.isFollowed : bl2;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? resourceOwner2.logo : string5;
        int n16 = n4 & 0x20;
        MetaData metaData2 = n16 != 0 ? resourceOwner2.metadata : metaData;
        int n17 = n4 & 0x40;
        String string16 = n17 != 0 ? resourceOwner2.name : string6;
        int n18 = n4 & 0x80;
        String string17 = n18 != 0 ? resourceOwner2.pageHeader : string7;
        int n19 = n4 & 0x100;
        List list2 = n19 != 0 ? resourceOwner2.tags : list;
        int n20 = n4 & 0x200;
        String string18 = n20 != 0 ? resourceOwner2.type : string8;
        int n21 = n4 & 0x400;
        String string19 = n21 != 0 ? resourceOwner2.resourceType : string9;
        int n22 = n4 & 0x800;
        String string20 = n22 != 0 ? resourceOwner2.imageUrl : string10;
        String string21 = (n4 &= 0x1000) != 0 ? resourceOwner2.motto : string11;
        string2 = string12;
        string3 = string13;
        string4 = string14;
        bl2 = bl3;
        string5 = string15;
        metaData = metaData2;
        string6 = string16;
        string7 = string17;
        list = list2;
        string8 = string18;
        string9 = string19;
        string10 = string20;
        string11 = string21;
        return resourceOwner.copy(string12, string13, string14, bl3, string15, metaData2, string16, string17, list2, string18, string19, string20, string21);
    }

    public final String component1() {
        return this.code;
    }

    public final String component10() {
        return this.type;
    }

    public final String component11() {
        return this.resourceType;
    }

    public final String component12() {
        return this.imageUrl;
    }

    public final String component13() {
        return this.motto;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.id;
    }

    public final Boolean component4() {
        return this.isFollowed;
    }

    public final String component5() {
        return this.logo;
    }

    public final MetaData component6() {
        return this.metadata;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.pageHeader;
    }

    public final List component9() {
        return this.tags;
    }

    public final ResourceOwner copy(String string2, String string3, String string4, Boolean bl2, String string5, MetaData metaData, String string6, String string7, List list, String string8, String string9, String string10, String string11) {
        ResourceOwner resourceOwner = new ResourceOwner(string2, string3, string4, bl2, string5, metaData, string6, string7, list, string8, string9, string10, string11);
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
        Object object2 = this.code;
        Object object3 = ((ResourceOwner)object).code;
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
        object2 = this.isFollowed;
        object3 = ((ResourceOwner)object).isFollowed;
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
        object2 = this.metadata;
        object3 = ((ResourceOwner)object).metadata;
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
        object2 = this.pageHeader;
        object3 = ((ResourceOwner)object).pageHeader;
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
        object2 = this.resourceType;
        object3 = ((ResourceOwner)object).resourceType;
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
        object2 = this.motto;
        object = ((ResourceOwner)object).motto;
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

    public final String getPageHeader() {
        return this.pageHeader;
    }

    public final String getResourceType() {
        return this.resourceType;
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
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.description;
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
        object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
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
        object = this.type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.resourceType;
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
        object = this.motto;
        if (object != null) {
            n7 = ((String)object).hashCode();
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

    public final void setPageHeader(String string2) {
        this.pageHeader = string2;
    }

    public final void setResourceType(String string2) {
        this.resourceType = string2;
    }

    public final void setTags(List list) {
        this.tags = list;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.code;
        String string3 = this.description;
        String string4 = this.id;
        Boolean bl2 = this.isFollowed;
        String string5 = this.logo;
        MetaData metaData = this.metadata;
        String string6 = this.name;
        String string7 = this.pageHeader;
        List list = this.tags;
        String string8 = this.type;
        String string9 = this.resourceType;
        String string10 = this.imageUrl;
        String string11 = this.motto;
        object = og_1.a("ResourceOwner(code=", string2, ", description=", string3, ", id=");
        vw0_1.a(bl2, string4, ", isFollowed=", ", logo=", (StringBuilder)object);
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", metadata=");
        ((StringBuilder)object).append(metaData);
        ((StringBuilder)object).append(", name=");
        X50.a((StringBuilder)object, string6, ", pageHeader=", string7, ", tags=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", type=");
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", resourceType=");
        X50.a((StringBuilder)object, string9, ", imageUrl=", string10, ", motto=");
        return h30_0.a((StringBuilder)object, string11, ")");
    }
}

