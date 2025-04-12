/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.helper;

import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UrlHelper$Companion {
    private UrlHelper$Companion() {
    }

    public /* synthetic */ UrlHelper$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean getISPREVIEW() {
        return UrlHelper.access$getISPREVIEW$cp();
    }

    public final UrlHelper getInstance() {
        UrlHelper urlHelper = UrlHelper.access$getUrlHelper$cp();
        if (urlHelper == null) {
            urlHelper = new UrlHelper(null);
            UrlHelper.access$setUrlHelper$cp(urlHelper);
        }
        urlHelper = UrlHelper.access$getUrlHelper$cp();
        Intrinsics.checkNotNull(urlHelper, "null cannot be cast to non-null type com.ril.ajio.services.helper.UrlHelper");
        return urlHelper;
    }

    public final void setISPREVIEW(boolean bl2) {
        UrlHelper.access$setISPREVIEW$cp(bl2);
    }
}

