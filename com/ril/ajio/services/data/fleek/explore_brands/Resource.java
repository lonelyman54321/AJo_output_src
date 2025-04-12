/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Resource {
    private String description;
    private String id;
    private List images;
    private String logo;
    private String motto;
    private String name;
    private String resourceUrl;
    private String type;

    public Resource() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public Resource(String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8) {
        this.description = string2;
        this.id = string3;
        this.images = list;
        this.name = string4;
        this.resourceUrl = string5;
        this.type = string6;
        this.logo = string7;
        this.motto = string8;
    }

    public /* synthetic */ Resource(String object, String string2, List object2, String object3, String string3, String string4, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        String string9;
        String string10;
        List list;
        String string11;
        String string12;
        int n4 = n3;
        int n7 = n3 & 1;
        String string13 = null;
        if (n7 != 0) {
            n7 = 0;
            string12 = null;
        } else {
            string12 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string11 = null;
        } else {
            string11 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            list = null;
        } else {
            list = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string10 = null;
        } else {
            string10 = object3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string9 = null;
        } else {
            string9 = string3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = string4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        if ((n4 &= 0x80) == 0) {
            string13 = string6;
        }
        object = this;
        string2 = string12;
        object2 = string11;
        object3 = list;
        string3 = string10;
        string4 = string9;
        string5 = string8;
        string6 = string7;
        this(string12, string11, list, string10, string9, string8, string7, string13);
    }

    public static /* synthetic */ Resource copy$default(Resource resource, String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8, int n3, Object object) {
        Resource resource2 = resource;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = n7 != 0 ? resource.description : string2;
        int n8 = n4 & 2;
        String string10 = n8 != 0 ? resource2.id : string3;
        int n10 = n4 & 4;
        List list2 = n10 != 0 ? resource2.images : list;
        int n14 = n4 & 8;
        String string11 = n14 != 0 ? resource2.name : string4;
        int n15 = n4 & 0x10;
        String string12 = n15 != 0 ? resource2.resourceUrl : string5;
        int n16 = n4 & 0x20;
        String string13 = n16 != 0 ? resource2.type : string6;
        int n17 = n4 & 0x40;
        String string14 = n17 != 0 ? resource2.logo : string7;
        String string15 = (n4 &= 0x80) != 0 ? resource2.motto : string8;
        string2 = string9;
        string3 = string10;
        list = list2;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        return resource.copy(string9, string10, list2, string11, string12, string13, string14, string15);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.id;
    }

    public final List component3() {
        return this.images;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.resourceUrl;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.logo;
    }

    public final String component8() {
        return this.motto;
    }

    public final Resource copy(String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8) {
        Resource resource = new Resource(string2, string3, list, string4, string5, string6, string7, string8);
        return resource;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Resource;
        if (!bl3) {
            return false;
        }
        object = (Resource)object;
        Object object2 = this.description;
        Object object3 = ((Resource)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.id;
        object3 = ((Resource)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.images;
        object3 = ((Resource)object).images;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((Resource)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resourceUrl;
        object3 = ((Resource)object).resourceUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Resource)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((Resource)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.motto;
        object = ((Resource)object).motto;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final List getImages() {
        return this.images;
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

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
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
        object = this.images;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.resourceUrl;
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
        object = this.logo;
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

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setImages(List list) {
        this.images = list;
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

    public final void setResourceUrl(String string2) {
        this.resourceUrl = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        CharSequence charSequence = this.description;
        String string2 = this.id;
        List list = this.images;
        String string3 = this.name;
        String string4 = this.resourceUrl;
        String string5 = this.type;
        String string6 = this.logo;
        String string7 = this.motto;
        charSequence = og_1.a("Resource(description=", (String)charSequence, ", id=", string2, ", images=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", name=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", resourceUrl=");
        X50.a((StringBuilder)charSequence, string4, ", type=", string5, ", logo=");
        return ko_0.a((StringBuilder)charSequence, string6, ", motto=", string7, ")");
    }
}

