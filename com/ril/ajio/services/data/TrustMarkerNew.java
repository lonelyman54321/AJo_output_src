/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class TrustMarkerNew
implements Serializable {
    private String imageUrl;
    private String title;

    public TrustMarkerNew(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "imageUrl");
        Intrinsics.checkNotNullParameter(string3, "title");
        this.imageUrl = string2;
        this.title = string3;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setImageUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.imageUrl = string2;
    }

    public final void setTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.title = string2;
    }
}

