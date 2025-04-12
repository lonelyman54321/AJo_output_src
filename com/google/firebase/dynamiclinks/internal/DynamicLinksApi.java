/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.firebase.dynamiclinks.internal.DynamicLinksApi$1;

public class DynamicLinksApi
extends GoogleApi {
    static final Api API;
    private static final Api$AbstractClientBuilder CLIENT_BUILDER;
    private static final Api$ClientKey CLIENT_KEY;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        CLIENT_KEY = api$ClientKey = new Api$ClientKey();
        DynamicLinksApi$1 dynamicLinksApi$1 = new DynamicLinksApi$1();
        CLIENT_BUILDER = dynamicLinksApi$1;
        API = api = new Api("DynamicLinks.API", dynamicLinksApi$1, api$ClientKey);
    }

    public DynamicLinksApi(Context context) {
        Api api = API;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }
}

