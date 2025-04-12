/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

public class Personalization {
    public static final String ANALYTICS_ORIGIN_PERSONALIZATION = "fp";
    public static final String ARM_INDEX = "armIndex";
    public static final String CHOICE_ID = "choiceId";
    public static final String EXTERNAL_ARM_INDEX_PARAM = "arm_index";
    public static final String EXTERNAL_ARM_VALUE_PARAM = "arm_value";
    public static final String EXTERNAL_EVENT = "personalization_assignment";
    public static final String EXTERNAL_GROUP_PARAM = "group";
    public static final String EXTERNAL_PERSONALIZATION_ID_PARAM = "personalization_id";
    public static final String EXTERNAL_RC_PARAMETER_PARAM = "arm_key";
    public static final String GROUP = "group";
    public static final String INTERNAL_CHOICE_ID_PARAM = "_fpid";
    public static final String INTERNAL_EVENT = "_fpc";
    public static final String PERSONALIZATION_ID = "personalizationId";
    private final Provider analyticsConnector;
    private final Map loggedChoiceIds;

    public Personalization(Provider provider) {
        Map map2 = new Map();
        this.loggedChoiceIds = map2 = Collections.synchronizedMap(map2);
        this.analyticsConnector = provider;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void logArmActive(String string2, ConfigContainer object) {
        int n3;
        AnalyticsConnector analyticsConnector = (AnalyticsConnector)this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return;
        }
        JSONObject jSONObject = ((ConfigContainer)object).getPersonalizationMetadata();
        int n4 = jSONObject.length();
        if (n4 < (n3 = 1)) {
            return;
        }
        n4 = (object = ((ConfigContainer)object).getConfigs()).length();
        if (n4 < n3) {
            return;
        }
        if ((jSONObject = jSONObject.optJSONObject(string2)) == null) {
            return;
        }
        String string3 = jSONObject.optString(CHOICE_ID);
        n3 = (int)(string3.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        Map map2 = this.loggedChoiceIds;
        // MONITORENTER : map2
        Map<String, String> map3 = this.loggedChoiceIds;
        map3 = map3.get(string2);
        boolean bl2 = string3.equals(map3);
        if (bl2) {
            // MONITOREXIT : map2
            return;
        }
        map3 = this.loggedChoiceIds;
        map3.put(string2, string3);
        // MONITOREXIT : map2
        map2 = E1.a(EXTERNAL_RC_PARAMETER_PARAM, string2);
        string2 = object.optString(string2);
        map2.putString(EXTERNAL_ARM_VALUE_PARAM, string2);
        object = jSONObject.optString(PERSONALIZATION_ID);
        map2.putString(EXTERNAL_PERSONALIZATION_ID_PARAM, (String)object);
        int n7 = jSONObject.optInt(ARM_INDEX, -1);
        map2.putInt(EXTERNAL_ARM_INDEX_PARAM, n7);
        object = jSONObject.optString("group");
        map2.putString("group", (String)object);
        analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, EXTERNAL_EVENT, (Bundle)map2);
        string2 = new Bundle();
        string2.putString(INTERNAL_CHOICE_ID_PARAM, string3);
        analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, INTERNAL_EVENT, (Bundle)string2);
    }
}

