/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.text.TextUtils
 */
package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class SaveAccountLinkingTokenRequest$Builder {
    private PendingIntent zba;
    private String zbb;
    private String zbc;
    private List zbd;
    private String zbe;
    private int zbf;

    public SaveAccountLinkingTokenRequest$Builder() {
        ArrayList arrayList;
        this.zbd = arrayList = new ArrayList();
    }

    public SaveAccountLinkingTokenRequest build() {
        boolean bl2;
        Object object = this.zba;
        boolean bl3 = false;
        boolean bl4 = true;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2, "Consent PendingIntent cannot be null");
        object = this.zbb;
        Preconditions.checkArgument("auth_code".equals(object), "Invalid tokenType");
        bl2 = TextUtils.isEmpty((CharSequence)this.zbc) ^ bl4;
        String string2 = "serviceId cannot be null or empty";
        Preconditions.checkArgument(bl2, string2);
        object = this.zbd;
        if (object != null) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "scopes cannot be null");
        string2 = this.zba;
        String string3 = this.zbb;
        String string4 = this.zbc;
        List list = this.zbd;
        String string5 = this.zbe;
        int n3 = this.zbf;
        object = new SaveAccountLinkingTokenRequest((PendingIntent)string2, string3, string4, list, string5, n3);
        return object;
    }

    public SaveAccountLinkingTokenRequest$Builder setConsentPendingIntent(PendingIntent pendingIntent) {
        this.zba = pendingIntent;
        return this;
    }

    public SaveAccountLinkingTokenRequest$Builder setScopes(List list) {
        this.zbd = list;
        return this;
    }

    public SaveAccountLinkingTokenRequest$Builder setServiceId(String string2) {
        this.zbc = string2;
        return this;
    }

    public SaveAccountLinkingTokenRequest$Builder setTokenType(String string2) {
        this.zbb = string2;
        return this;
    }

    public final SaveAccountLinkingTokenRequest$Builder zba(String string2) {
        this.zbe = string2;
        return this;
    }

    public final SaveAccountLinkingTokenRequest$Builder zbb(int n3) {
        this.zbf = n3;
        return this;
    }
}

