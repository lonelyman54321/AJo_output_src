/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import kotlin.jvm.internal.Intrinsics;

public final class LocationItemDataHelper {
    private String imageUrl;
    private String page;
    private String query;
    private String uid;
    private String urlLink;

    public LocationItemDataHelper(String string2, String string3, String string4, String string5, String string6) {
        this.imageUrl = string2;
        this.uid = string3;
        this.urlLink = string4;
        this.page = string5;
        this.query = string6;
    }

    public static /* synthetic */ LocationItemDataHelper copy$default(LocationItemDataHelper locationItemDataHelper, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = locationItemDataHelper.imageUrl;
        }
        if ((n4 = n3 & 2) != 0) {
            object = locationItemDataHelper.uid;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = locationItemDataHelper.urlLink;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = locationItemDataHelper.page;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = locationItemDataHelper.query;
        }
        String string7 = string4;
        object = locationItemDataHelper;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return locationItemDataHelper.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.uid;
    }

    public final String component3() {
        return this.urlLink;
    }

    public final String component4() {
        return this.page;
    }

    public final String component5() {
        return this.query;
    }

    public final LocationItemDataHelper copy(String string2, String string3, String string4, String string5, String string6) {
        LocationItemDataHelper locationItemDataHelper = new LocationItemDataHelper(string2, string3, string4, string5, string6);
        return locationItemDataHelper;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LocationItemDataHelper;
        if (!bl3) {
            return false;
        }
        object = (LocationItemDataHelper)object;
        String string2 = this.imageUrl;
        String string3 = ((LocationItemDataHelper)object).imageUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uid;
        string3 = ((LocationItemDataHelper)object).uid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.urlLink;
        string3 = ((LocationItemDataHelper)object).urlLink;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.page;
        string3 = ((LocationItemDataHelper)object).page;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.query;
        object = ((LocationItemDataHelper)object).query;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUrlLink() {
        return this.urlLink;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.imageUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.uid;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.urlLink;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.page;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.query;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setUid(String string2) {
        this.uid = string2;
    }

    public final void setUrlLink(String string2) {
        this.urlLink = string2;
    }

    public String toString() {
        CharSequence charSequence = this.imageUrl;
        String string2 = this.uid;
        String string3 = this.urlLink;
        String string4 = this.page;
        String string5 = this.query;
        charSequence = og_1.a("LocationItemDataHelper(imageUrl=", charSequence, ", uid=", string2, ", urlLink=");
        X50.a((StringBuilder)charSequence, string3, ", page=", string4, ", query=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

