/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigContainer$1;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigContainer$Builder {
    private JSONArray builderAbtExperiments;
    private JSONObject builderConfigsJson;
    private Date builderFetchTime;
    private JSONObject builderPersonalizationMetadata;
    private JSONArray builderRolloutMetadata;
    private long builderTemplateVersionNumber;

    private ConfigContainer$Builder() {
        Object object;
        this.builderConfigsJson = object = new JSONObject();
        object = ConfigContainer.access$000();
        this.builderFetchTime = object;
        this.builderAbtExperiments = object;
        this.builderPersonalizationMetadata = object = new JSONObject();
        this.builderTemplateVersionNumber = 0L;
        super();
        this.builderRolloutMetadata = object;
    }

    public /* synthetic */ ConfigContainer$Builder(ConfigContainer$1 configContainer$1) {
        this();
    }

    public ConfigContainer$Builder(ConfigContainer configContainer) {
        long l2;
        Object object;
        this.builderConfigsJson = object = configContainer.getConfigs();
        object = configContainer.getFetchTime();
        this.builderFetchTime = object;
        object = configContainer.getAbtExperiments();
        this.builderAbtExperiments = object;
        this.builderPersonalizationMetadata = object = configContainer.getPersonalizationMetadata();
        this.builderTemplateVersionNumber = l2 = configContainer.getTemplateVersionNumber();
        configContainer = configContainer.getRolloutMetadata();
        this.builderRolloutMetadata = configContainer;
    }

    public ConfigContainer build() {
        JSONObject jSONObject = this.builderConfigsJson;
        Date date = this.builderFetchTime;
        JSONArray jSONArray = this.builderAbtExperiments;
        JSONObject jSONObject2 = this.builderPersonalizationMetadata;
        long l2 = this.builderTemplateVersionNumber;
        JSONArray jSONArray2 = this.builderRolloutMetadata;
        ConfigContainer configContainer = new ConfigContainer(jSONObject, date, jSONArray, jSONObject2, l2, jSONArray2, null);
        return configContainer;
    }

    public ConfigContainer$Builder replaceConfigsWith(Map map2) {
        JSONObject jSONObject;
        this.builderConfigsJson = jSONObject = new JSONObject(map2);
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ConfigContainer$Builder replaceConfigsWith(JSONObject object) {
        String string2;
        try {
            string2 = object.toString();
        }
        catch (JSONException jSONException) {
            return this;
        }
        JSONObject jSONObject = new JSONObject(string2);
        this.builderConfigsJson = jSONObject;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ConfigContainer$Builder withAbtExperiments(JSONArray object) {
        String string2;
        try {
            string2 = object.toString();
        }
        catch (JSONException jSONException) {
            return this;
        }
        JSONArray jSONArray = new JSONArray(string2);
        this.builderAbtExperiments = jSONArray;
        return this;
    }

    public ConfigContainer$Builder withFetchTime(Date date) {
        this.builderFetchTime = date;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ConfigContainer$Builder withPersonalizationMetadata(JSONObject object) {
        String string2;
        try {
            string2 = object.toString();
        }
        catch (JSONException jSONException) {
            return this;
        }
        JSONObject jSONObject = new JSONObject(string2);
        this.builderPersonalizationMetadata = jSONObject;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ConfigContainer$Builder withRolloutMetadata(JSONArray object) {
        String string2;
        try {
            string2 = object.toString();
        }
        catch (JSONException jSONException) {
            return this;
        }
        JSONArray jSONArray = new JSONArray(string2);
        this.builderRolloutMetadata = jSONArray;
        return this;
    }

    public ConfigContainer$Builder withTemplateVersionNumber(long l2) {
        this.builderTemplateVersionNumber = l2;
        return this;
    }
}

