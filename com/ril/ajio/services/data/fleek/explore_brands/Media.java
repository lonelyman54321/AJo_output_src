/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Media {
    private MetaData metadata;
    private String redirectionUrl;
    private String thumbnailUrl;
    private String type;
    private String url;

    public Media() {
        this(null, null, null, null, null, 31, null);
    }

    public Media(MetaData metaData, String string2, String string3, String string4, String string5) {
        this.metadata = metaData;
        this.redirectionUrl = string2;
        this.thumbnailUrl = string3;
        this.type = string4;
        this.url = string5;
    }

    public /* synthetic */ Media(MetaData object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((MetaData)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ Media copy$default(Media media, MetaData metaData, String object, String object2, String object3, String string2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            metaData = media.metadata;
        }
        if ((n4 = n3 & 2) != 0) {
            object = media.redirectionUrl;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = media.thumbnailUrl;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = media.type;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = media.url;
        }
        String string5 = string2;
        object = media;
        object2 = metaData;
        object3 = object4;
        string2 = string3;
        object4 = string5;
        return media.copy(metaData, (String)object3, string3, string4, string5);
    }

    public final MetaData component1() {
        return this.metadata;
    }

    public final String component2() {
        return this.redirectionUrl;
    }

    public final String component3() {
        return this.thumbnailUrl;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.url;
    }

    public final Media copy(MetaData metaData, String string2, String string3, String string4, String string5) {
        Media media = new Media(metaData, string2, string3, string4, string5);
        return media;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Media;
        if (!bl3) {
            return false;
        }
        object = (Media)object;
        Object object2 = this.metadata;
        Object object3 = ((Media)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.redirectionUrl;
        object3 = ((Media)object).redirectionUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnailUrl;
        object3 = ((Media)object).thumbnailUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Media)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object = ((Media)object).url;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        int n4;
        MetaData metaData = this.metadata;
        int n7 = 0;
        if (metaData == null) {
            n4 = 0;
            metaData = null;
        } else {
            n4 = metaData.hashCode();
        }
        n4 *= 31;
        String string2 = this.redirectionUrl;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.thumbnailUrl;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.type;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.url;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setMetadata(MetaData metaData) {
        this.metadata = metaData;
    }

    public final void setRedirectionUrl(String string2) {
        this.redirectionUrl = string2;
    }

    public final void setThumbnailUrl(String string2) {
        this.thumbnailUrl = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        MetaData metaData = this.metadata;
        String string2 = this.redirectionUrl;
        String string3 = this.thumbnailUrl;
        String string4 = this.type;
        String string5 = this.url;
        StringBuilder stringBuilder = new StringBuilder("Media(metadata=");
        stringBuilder.append(metaData);
        stringBuilder.append(", redirectionUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", thumbnailUrl=");
        X50.a(stringBuilder, string3, ", type=", string4, ", url=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

