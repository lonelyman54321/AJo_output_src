/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.deeplink;

import com.affise.attribution.deeplink.DeeplinkClickRepository;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkClickRepositoryImpl
implements DeeplinkClickRepository {
    private String _deeplink;
    private boolean isDeeplinkClick;

    public String getDeeplink() {
        return this._deeplink;
    }

    public boolean isDeeplinkClick() {
        return this.isDeeplinkClick;
    }

    public void setDeeplink(String string2) {
        Intrinsics.checkNotNullParameter(string2, "deeplink");
        this._deeplink = string2;
    }

    public void setDeeplinkClick(boolean bl2) {
        this.isDeeplinkClick = bl2;
    }
}

