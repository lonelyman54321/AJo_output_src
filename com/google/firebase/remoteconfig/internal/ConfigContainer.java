/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.ConfigContainer$1;
import com.google.firebase.remoteconfig.internal.ConfigContainer$Builder;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class ConfigContainer {
    static final String ABT_EXPERIMENTS_KEY = "abt_experiments_key";
    static final String CONFIGS_KEY = "configs_key";
    private static final Date DEFAULTS_FETCH_TIME;
    static final String FETCH_TIME_KEY = "fetch_time_key";
    static final String PERSONALIZATION_METADATA_KEY = "personalization_metadata_key";
    public static final String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final String ROLLOUT_METADATA_ID = "rolloutId";
    static final String ROLLOUT_METADATA_KEY = "rollout_metadata_key";
    public static final String ROLLOUT_METADATA_VARIANT_ID = "variantId";
    static final String TEMPLATE_VERSION_NUMBER_KEY = "template_version_number_key";
    private JSONArray abtExperiments;
    private JSONObject configsJson;
    private JSONObject containerJson;
    private Date fetchTime;
    private JSONObject personalizationMetadata;
    private JSONArray rolloutMetadata;
    private long templateVersionNumber;

    static {
        Date date;
        DEFAULTS_FETCH_TIME = date = new Date(0L);
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long l2, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CONFIGS_KEY, (Object)jSONObject);
        long l3 = date.getTime();
        jSONObject3.put(FETCH_TIME_KEY, l3);
        jSONObject3.put(ABT_EXPERIMENTS_KEY, (Object)jSONArray);
        jSONObject3.put(PERSONALIZATION_METADATA_KEY, (Object)jSONObject2);
        jSONObject3.put(TEMPLATE_VERSION_NUMBER_KEY, l2);
        jSONObject3.put(ROLLOUT_METADATA_KEY, (Object)jSONArray2);
        this.configsJson = jSONObject;
        this.fetchTime = date;
        this.abtExperiments = jSONArray;
        this.personalizationMetadata = jSONObject2;
        this.templateVersionNumber = l2;
        this.rolloutMetadata = jSONArray2;
        this.containerJson = jSONObject3;
    }

    public /* synthetic */ ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long l2, JSONArray jSONArray2, ConfigContainer$1 configContainer$1) {
        this(jSONObject, date, jSONArray, jSONObject2, l2, jSONArray2);
    }

    public static /* synthetic */ Date access$000() {
        return DEFAULTS_FETCH_TIME;
    }

    public static ConfigContainer copyOf(JSONObject jSONObject) {
        Object object = jSONObject.optJSONObject(PERSONALIZATION_METADATA_KEY);
        if (object == null) {
            object = new JSONObject();
        }
        JSONObject jSONObject2 = object;
        object = jSONObject.optJSONArray(ROLLOUT_METADATA_KEY);
        if (object == null) {
            object = new JSONArray();
        }
        JSONObject jSONObject3 = object;
        JSONObject jSONObject4 = jSONObject.getJSONObject(CONFIGS_KEY);
        long l2 = jSONObject.getLong(FETCH_TIME_KEY);
        Date date = new Date(l2);
        JSONArray jSONArray = jSONObject.getJSONArray(ABT_EXPERIMENTS_KEY);
        l2 = jSONObject.optLong(TEMPLATE_VERSION_NUMBER_KEY);
        object = new ConfigContainer(jSONObject4, date, jSONArray, jSONObject2, l2, (JSONArray)jSONObject3);
        return object;
    }

    private Map createRolloutParameterKeyMap() {
        JSONArray jSONArray;
        int n3;
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < (n3 = (jSONArray = this.getRolloutMetadata()).length()); ++i3) {
            int n4;
            jSONArray = this.getRolloutMetadata().getJSONObject(i3);
            String string2 = jSONArray.getString(ROLLOUT_METADATA_ID);
            String string3 = jSONArray.getString(ROLLOUT_METADATA_VARIANT_ID);
            jSONArray = jSONArray.getJSONArray(ROLLOUT_METADATA_AFFECTED_KEYS);
            for (int i8 = 0; i8 < (n4 = jSONArray.length()); ++i8) {
                Object object = jSONArray.getString(i8);
                boolean bl2 = hashMap.containsKey(object);
                if (!bl2) {
                    HashMap hashMap2 = new HashMap();
                    hashMap.put(object, hashMap2);
                }
                if ((object = (Map)hashMap.get(object)) == null) continue;
                object.put(string2, string3);
            }
        }
        return hashMap;
    }

    private static ConfigContainer deepCopyOf(JSONObject object) {
        object = object.toString();
        JSONObject jSONObject = new JSONObject((String)object);
        return ConfigContainer.copyOf(jSONObject);
    }

    public static ConfigContainer$Builder newBuilder() {
        ConfigContainer$Builder configContainer$Builder = new ConfigContainer$Builder(null);
        return configContainer$Builder;
    }

    public static ConfigContainer$Builder newBuilder(ConfigContainer configContainer) {
        ConfigContainer$Builder configContainer$Builder = new ConfigContainer$Builder(configContainer);
        return configContainer$Builder;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof ConfigContainer;
        if (!bl2) {
            return false;
        }
        object = (ConfigContainer)object;
        String string2 = this.containerJson.toString();
        object = ((ConfigContainer)object).toString();
        return string2.equals(object);
    }

    public JSONArray getAbtExperiments() {
        return this.abtExperiments;
    }

    public Set getChangedParams(ConfigContainer object) {
        boolean bl2;
        boolean bl3;
        Object object2 = ConfigContainer.deepCopyOf(((ConfigContainer)object).containerJson).getConfigs();
        Map map2 = this.createRolloutParameterKeyMap();
        Map map3 = ((ConfigContainer)object).createRolloutParameterKeyMap();
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = this.getConfigs().keys();
        while (bl3 = iterator.hasNext()) {
            boolean bl4;
            Object object3;
            String string2 = (String)iterator.next();
            Object object4 = ((ConfigContainer)object).getConfigs();
            boolean bl5 = object4.has(string2);
            if (!bl5) {
                hashSet.add(string2);
                continue;
            }
            object4 = this.getConfigs().get(string2);
            bl5 = object4.equals(object3 = ((ConfigContainer)object).getConfigs().get(string2));
            if (!bl5) {
                hashSet.add(string2);
                continue;
            }
            object4 = this.getPersonalizationMetadata();
            bl5 = object4.has(string2);
            if (bl5 && !(bl5 = (object4 = ((ConfigContainer)object).getPersonalizationMetadata()).has(string2)) || !(bl5 = (object4 = this.getPersonalizationMetadata()).has(string2)) && (bl5 = (object4 = ((ConfigContainer)object).getPersonalizationMetadata()).has(string2))) {
                hashSet.add(string2);
                continue;
            }
            object4 = this.getPersonalizationMetadata();
            bl5 = object4.has(string2);
            if (bl5 && (bl5 = (object4 = ((ConfigContainer)object).getPersonalizationMetadata()).has(string2)) && !(bl5 = ((String)(object4 = this.getPersonalizationMetadata().getJSONObject(string2).toString())).equals(object3 = ((ConfigContainer)object).getPersonalizationMetadata().getJSONObject(string2).toString()))) {
                hashSet.add(string2);
                continue;
            }
            bl5 = map2.containsKey(string2);
            if (bl5 != (bl4 = map3.containsKey(string2))) {
                hashSet.add(string2);
                continue;
            }
            bl5 = map2.containsKey(string2);
            if (bl5 && (bl5 = map3.containsKey(string2)) && !(bl5 = (object4 = (Map)map2.get(string2)).equals(object3 = map3.get(string2)))) {
                hashSet.add(string2);
                continue;
            }
            object2.remove(string2);
        }
        object = object2.keys();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            hashSet.add((String)object2);
        }
        return hashSet;
    }

    public JSONObject getConfigs() {
        return this.configsJson;
    }

    public Date getFetchTime() {
        return this.fetchTime;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.personalizationMetadata;
    }

    public JSONArray getRolloutMetadata() {
        return this.rolloutMetadata;
    }

    public long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    public int hashCode() {
        return this.containerJson.hashCode();
    }

    public String toString() {
        return this.containerJson.toString();
    }
}

