/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class SharedWithMe {
    public static final int $stable;
    public static final SharedWithMe$Companion Companion;
    private List productsShared;
    private ShareProductExperience shareProductExperience;

    static {
        SharedWithMe$Companion sharedWithMe$Companion;
        Companion = sharedWithMe$Companion = new SharedWithMe$Companion(null);
        $stable = 8;
    }

    public SharedWithMe() {
        ArrayList arrayList;
        this.productsShared = arrayList = new ArrayList();
    }

    public final List getProductsShared() {
        return this.productsShared;
    }

    public final ShareProductExperience getShareProductExperience() {
        return this.shareProductExperience;
    }

    public final boolean isEmpty() {
        return this.productsShared.isEmpty();
    }

    public final boolean isLinkExpired() {
        boolean bl2;
        ShareProductExperience shareProductExperience = this.shareProductExperience;
        if (shareProductExperience != null) {
            bl2 = shareProductExperience.isLinkExpired();
        } else {
            bl2 = false;
            shareProductExperience = null;
        }
        return bl2;
    }

    public final void setProductsShared(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productsShared = list;
    }

    public final void setShareProductExperience(ShareProductExperience shareProductExperience) {
        this.shareProductExperience = shareProductExperience;
    }

    public String toString() {
        Object object = this.shareProductExperience;
        object = object != null ? ((ShareProductExperience)object).toString() : null;
        List list = this.productsShared;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(list);
        return stringBuilder.toString();
    }
}

