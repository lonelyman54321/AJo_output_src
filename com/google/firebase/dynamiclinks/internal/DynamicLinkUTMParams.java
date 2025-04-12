/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

public class DynamicLinkUTMParams {
    public static final String KEY_CAMPAIGN = "campaign";
    public static final String KEY_CAMPAIGN_BUNDLE = "_cmp";
    public static final String KEY_MEDIUM = "medium";
    public static final String KEY_SCION_DATA_BUNDLE = "scionData";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_UTM_CAMPAIGN = "utm_campaign";
    public static final String KEY_UTM_MEDIUM = "utm_medium";
    public static final String KEY_UTM_SOURCE = "utm_source";
    private final DynamicLinkData dynamicLinkData;
    private final Bundle utmParamsBundle;

    public DynamicLinkUTMParams(DynamicLinkData dynamicLinkData) {
        this.dynamicLinkData = dynamicLinkData;
        dynamicLinkData = DynamicLinkUTMParams.initUTMParamsBundle(dynamicLinkData);
        this.utmParamsBundle = dynamicLinkData;
    }

    private static void checkAndAdd(String string2, String string3, Bundle bundle, Bundle bundle2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)(string2 = bundle.getString(string2)));
        if (!bl2) {
            bundle2.putString(string3, string2);
        }
    }

    private static Bundle initUTMParamsBundle(DynamicLinkData dynamicLinkData) {
        Object object;
        Bundle bundle = new Bundle();
        if (dynamicLinkData != null && (object = dynamicLinkData.getExtensionBundle()) != null) {
            dynamicLinkData = dynamicLinkData.getExtensionBundle();
            object = KEY_SCION_DATA_BUNDLE;
            if ((dynamicLinkData = dynamicLinkData.getBundle((String)object)) == null) {
                return bundle;
            }
            object = KEY_CAMPAIGN_BUNDLE;
            if ((dynamicLinkData = dynamicLinkData.getBundle((String)object)) == null) {
                return bundle;
            }
            DynamicLinkUTMParams.checkAndAdd(KEY_MEDIUM, KEY_UTM_MEDIUM, (Bundle)dynamicLinkData, bundle);
            DynamicLinkUTMParams.checkAndAdd(KEY_SOURCE, KEY_UTM_SOURCE, (Bundle)dynamicLinkData, bundle);
            object = KEY_CAMPAIGN;
            String string2 = KEY_UTM_CAMPAIGN;
            DynamicLinkUTMParams.checkAndAdd((String)object, string2, (Bundle)dynamicLinkData, bundle);
        }
        return bundle;
    }

    public Bundle asBundle() {
        Bundle bundle = this.utmParamsBundle;
        Bundle bundle2 = new Bundle(bundle);
        return bundle2;
    }
}

