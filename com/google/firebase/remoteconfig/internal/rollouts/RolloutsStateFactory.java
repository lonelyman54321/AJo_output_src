/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment$Builder;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

public class RolloutsStateFactory {
    ConfigCacheClient activatedConfigsCache;
    ConfigCacheClient defaultConfigsCache;

    public RolloutsStateFactory(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    public static RolloutsStateFactory create(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        RolloutsStateFactory rolloutsStateFactory = new RolloutsStateFactory(configCacheClient, configCacheClient2);
        return rolloutsStateFactory;
    }

    private String getParameterValue(String string2) {
        Object object = RolloutsStateFactory.getStringFromCache(this.activatedConfigsCache, string2);
        if (object != null) {
            return object;
        }
        object = this.defaultConfigsCache;
        if ((string2 = RolloutsStateFactory.getStringFromCache((ConfigCacheClient)object, string2)) != null) {
            return string2;
        }
        return "";
    }

    private static String getStringFromCache(ConfigCacheClient object, String string2) {
        if ((object = ((ConfigCacheClient)object).getBlocking()) == null) {
            return null;
        }
        try {
            object = ((ConfigContainer)object).getConfigs();
        }
        catch (JSONException jSONException) {
            return null;
        }
        return object.getString(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RolloutsState getActiveRolloutsState(ConfigContainer hashSet) {
        JSONException jSONException2;
        int n3 = 1;
        JSONArray jSONArray = ((ConfigContainer)((Object)hashSet)).getRolloutMetadata();
        long l2 = ((ConfigContainer)((Object)hashSet)).getTemplateVersionNumber();
        hashSet = new HashSet<Object>();
        int n4 = 0;
        while (true) {
            Object object;
            String string2;
            String string3;
            Object object2;
            Object object3;
            block4: {
                int n7;
                if (n4 >= (n7 = jSONArray.length())) {
                    return RolloutsState.create(hashSet);
                }
                try {
                    object3 = jSONArray.getJSONObject(n4);
                    object2 = "rolloutId";
                    object2 = object3.getString((String)object2);
                    string3 = "affectedParameterKeys";
                    string3 = object3.getJSONArray(string3);
                    int n8 = string3.length();
                    if (n8 <= n3) break block4;
                    string2 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s";
                    int n10 = 2;
                    object = new Object[n10];
                    object[0] = object2;
                    object[n3] = string3;
                    String.format(string2, (Object[])object);
                }
                catch (JSONException jSONException2) {
                    break;
                }
            }
            string2 = "";
            string3 = string3.optString(0, string2);
            string2 = this.getParameterValue(string3);
            object = RolloutAssignment.builder();
            object2 = ((RolloutAssignment$Builder)object).setRolloutId((String)object2);
            object = "variantId";
            object3 = object3.getString((String)object);
            object3 = ((RolloutAssignment$Builder)object2).setVariantId((String)object3);
            object3 = ((RolloutAssignment$Builder)object3).setParameterKey(string3);
            object3 = ((RolloutAssignment$Builder)object3).setParameterValue(string2);
            object3 = ((RolloutAssignment$Builder)object3).setTemplateVersion(l2);
            object3 = ((RolloutAssignment$Builder)object3).build();
            hashSet.add(object3);
            n4 += n3;
        }
        FirebaseRemoteConfigClientException firebaseRemoteConfigClientException = new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", jSONException2);
        throw firebaseRemoteConfigClientException;
    }
}

