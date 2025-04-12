/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;

public final class AdMobAdapter
extends AbstractAdViewAdapter {
    static final String AD_JSON_PARAMETER = "adJson";
    static final String AD_PARAMETER = "_ad";
    static final String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final String NEW_BUNDLE = "_newBundle";

    public Bundle buildExtrasBundle(Bundle object, Bundle object2) {
        String string2;
        boolean bl2;
        if (object == null) {
            object = new Bundle();
        }
        if (bl2 = object.getBoolean(string2 = NEW_BUNDLE)) {
            string2 = new Bundle(object);
            object = string2;
        }
        boolean bl3 = true;
        object.putInt("gw", (int)(bl3 ? 1 : 0));
        string2 = HOUSE_ADS_PARAMETER;
        String string3 = object2.getString(string2);
        object.putString(string2, string3);
        string2 = AD_JSON_PARAMETER;
        string3 = object2.getString(string2);
        boolean bl4 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl4) {
            object2 = object2.getString(string2);
            string2 = AD_PARAMETER;
            object.putString(string2, (String)object2);
        }
        object.putBoolean("_noRefresh", bl3);
        return object;
    }
}

