/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Media {
    private String mediaUrl;
    private MetaData metaData;
    private Metadata metadata;
    private String redirectionUrl;
    private String thumbnailUrl;
    private String type;
    private String url;

    public Media() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Media(String string2, Metadata metadata, String string3, String string4, String string5, String string6, MetaData metaData) {
        this.mediaUrl = string2;
        this.metadata = metadata;
        this.thumbnailUrl = string3;
        this.type = string4;
        this.url = string5;
        this.redirectionUrl = string6;
        this.metaData = metaData;
    }

    public /* synthetic */ Media(String object, Metadata object2, String object3, String string2, String string3, String string4, MetaData object4, int n3, DefaultConstructorMarker object5) {
        MetaData metaData;
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
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 0x10;
        String string6 = n7 != 0 ? null : string3;
        n7 = n3 & 0x20;
        String string7 = n7 != 0 ? null : string4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            metaData = null;
        } else {
            metaData = object4;
        }
        object = this;
        object2 = object5;
        object3 = object6;
        string2 = object7;
        string3 = string5;
        string4 = string6;
        object4 = string7;
        this((String)object5, (Metadata)object6, (String)object7, string5, string6, string7, metaData);
    }

    public static /* synthetic */ Media copy$default(Media media, String string2, Metadata object, String string3, String object2, String string4, String string5, MetaData object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = media.mediaUrl;
        }
        if ((n4 = n3 & 2) != 0) {
            object = media.metadata;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = media.thumbnailUrl;
        }
        String string6 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = media.type;
        }
        String string7 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = media.url;
        }
        String string8 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = media.redirectionUrl;
        }
        String string9 = string5;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object3 = media.metaData;
        }
        MetaData metaData = object3;
        object = media;
        string3 = string2;
        object2 = object4;
        string4 = string6;
        string5 = string7;
        object3 = string8;
        object4 = metaData;
        return media.copy(string2, (Metadata)object2, string6, string7, string8, string9, metaData);
    }

    public final String component1() {
        return this.mediaUrl;
    }

    public final Metadata component2() {
        return this.metadata;
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

    public final String component6() {
        return this.redirectionUrl;
    }

    public final MetaData component7() {
        return this.metaData;
    }

    public final Media copy(String string2, Metadata metadata, String string3, String string4, String string5, String string6, MetaData metaData) {
        Media media = new Media(string2, metadata, string3, string4, string5, string6, metaData);
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
        Object object2 = this.mediaUrl;
        Object object3 = ((Media)object).mediaUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((Media)object).metadata;
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
        object3 = ((Media)object).url;
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
        object2 = this.metaData;
        object = ((Media)object).metaData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final Metadata getMetadata() {
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
        String string2 = this.mediaUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Metadata)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.thumbnailUrl;
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
        object = this.url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.redirectionUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metaData;
        if (object != null) {
            n7 = ((MetaData)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setMediaUrl(String string2) {
        this.mediaUrl = string2;
    }

    public final void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public final void setMetadata(Metadata metadata) {
        this.metadata = metadata;
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
        String string2 = this.mediaUrl;
        Metadata metadata = this.metadata;
        String string3 = this.thumbnailUrl;
        String string4 = this.type;
        String string5 = this.url;
        String string6 = this.redirectionUrl;
        MetaData metaData = this.metaData;
        StringBuilder stringBuilder = new StringBuilder("Media(mediaUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", metadata=");
        stringBuilder.append(metadata);
        stringBuilder.append(", thumbnailUrl=");
        X50.a(stringBuilder, string3, ", type=", string4, ", url=");
        X50.a(stringBuilder, string5, ", redirectionUrl=", string6, ", metaData=");
        stringBuilder.append(metaData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

