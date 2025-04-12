/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.affise.attribution.settings;

import android.app.Application;
import android.content.Context;
import com.affise.attribution.Affise;
import com.affise.attribution.init.AffiseInitProperties;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseSettings {
    private final String affiseAppId;
    private String appToken;
    private String domain;
    private boolean isProduction;
    private String partParamName;
    private String partParamNameToken;
    private final String secretKey;

    public AffiseSettings(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "affiseAppId");
        Intrinsics.checkNotNullParameter(string3, "secretKey");
        this.affiseAppId = string2;
        this.secretKey = string3;
        this.isProduction = true;
    }

    private final AffiseInitProperties getInitProperties() {
        String string2 = this.affiseAppId;
        String string3 = this.secretKey;
        boolean bl2 = this.isProduction;
        String string4 = this.partParamName;
        String string5 = this.partParamNameToken;
        String string6 = this.appToken;
        String string7 = this.domain;
        AffiseInitProperties affiseInitProperties = new AffiseInitProperties(string2, bl2, string4, string5, string6, string3, null, false, string7, 192, null);
        return affiseInitProperties;
    }

    public final String getAffiseAppId() {
        return this.affiseAppId;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final AffiseSettings setAppToken(String string2) {
        this.appToken = string2;
        return this;
    }

    public final AffiseSettings setDomain(String string2) {
        Intrinsics.checkNotNullParameter(string2, "domain");
        this.domain = string2;
        return this;
    }

    public final AffiseSettings setPartParamName(String string2) {
        this.partParamName = string2;
        return this;
    }

    public final AffiseSettings setPartParamNameToken(String string2) {
        this.partParamNameToken = string2;
        return this;
    }

    public final AffiseSettings setProduction(boolean bl2) {
        this.isProduction = bl2;
        return this;
    }

    public final void start(Context context) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        object = this.getInitProperties();
        context = context.getApplicationContext();
        String string2 = "null cannot be cast to non-null type android.app.Application";
        Intrinsics.checkNotNull(context, string2);
        context = (Application)context;
        try {
            Affise.start$attribution_release((AffiseInitProperties)object, (Application)context);
        }
        catch (Exception exception) {
            ((Object)exception).toString();
        }
    }
}

