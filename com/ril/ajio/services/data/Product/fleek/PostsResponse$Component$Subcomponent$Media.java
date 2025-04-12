/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media$Metadata;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Media
implements Serializable {
    private final String mediaType;
    private final PostsResponse$Component$Subcomponent$Media$Metadata metadata;
    private final String thumbnailUrl;
    private final String url;

    public PostsResponse$Component$Subcomponent$Media(String string2, PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "mediaType");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Media$Metadata, "metadata");
        Intrinsics.checkNotNullParameter(string3, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(string4, "url");
        this.mediaType = string2;
        this.metadata = postsResponse$Component$Subcomponent$Media$Metadata;
        this.thumbnailUrl = string3;
        this.url = string4;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Media copy$default(PostsResponse$Component$Subcomponent$Media postsResponse$Component$Subcomponent$Media, String string2, PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent$Media.mediaType;
        }
        if ((n4 = n3 & 2) != 0) {
            postsResponse$Component$Subcomponent$Media$Metadata = postsResponse$Component$Subcomponent$Media.metadata;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = postsResponse$Component$Subcomponent$Media.thumbnailUrl;
        }
        if ((n3 &= 8) != 0) {
            string4 = postsResponse$Component$Subcomponent$Media.url;
        }
        return postsResponse$Component$Subcomponent$Media.copy(string2, postsResponse$Component$Subcomponent$Media$Metadata, string3, string4);
    }

    public final String component1() {
        return this.mediaType;
    }

    public final PostsResponse$Component$Subcomponent$Media$Metadata component2() {
        return this.metadata;
    }

    public final String component3() {
        return this.thumbnailUrl;
    }

    public final String component4() {
        return this.url;
    }

    public final PostsResponse$Component$Subcomponent$Media copy(String string2, PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "mediaType");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$Media$Metadata, "metadata");
        Intrinsics.checkNotNullParameter(string3, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(string4, "url");
        PostsResponse$Component$Subcomponent$Media postsResponse$Component$Subcomponent$Media = new PostsResponse$Component$Subcomponent$Media(string2, postsResponse$Component$Subcomponent$Media$Metadata, string3, string4);
        return postsResponse$Component$Subcomponent$Media;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Media;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Media)object;
        Object object2 = this.mediaType;
        Object object3 = ((PostsResponse$Component$Subcomponent$Media)object).mediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((PostsResponse$Component$Subcomponent$Media)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.thumbnailUrl;
        object3 = ((PostsResponse$Component$Subcomponent$Media)object).thumbnailUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object = ((PostsResponse$Component$Subcomponent$Media)object).url;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final PostsResponse$Component$Subcomponent$Media$Metadata getMetadata() {
        return this.metadata;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.mediaType.hashCode() * 31;
        int n4 = (this.metadata.hashCode() + n3) * 31;
        String string2 = this.thumbnailUrl;
        n3 = zy_2.b(n4, 31, string2);
        return this.url.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.mediaType;
        PostsResponse$Component$Subcomponent$Media$Metadata postsResponse$Component$Subcomponent$Media$Metadata = this.metadata;
        String string3 = this.thumbnailUrl;
        String string4 = this.url;
        StringBuilder stringBuilder = new StringBuilder("Media(mediaType=");
        stringBuilder.append(string2);
        stringBuilder.append(", metadata=");
        stringBuilder.append(postsResponse$Component$Subcomponent$Media$Metadata);
        stringBuilder.append(", thumbnailUrl=");
        return ko_0.a(stringBuilder, string3, ", url=", string4, ")");
    }
}

