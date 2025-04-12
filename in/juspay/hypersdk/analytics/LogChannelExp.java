/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogChannel;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LogChannelExp
extends LogChannel {
    private final String errorUrl;
    private final JSONArray fallBackPublicKeys;
    private final JSONArray fallBackUrls;
    private final ArrayList logsQueue;

    public LogChannelExp(int n3, long l2, String string2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string5, String string6, JSONArray jSONArray, JSONArray jSONArray2, String string7) {
        super(n3, l2, string2, string3, string4, jSONObject, jSONObject2, map2, n4, string5, string6);
        ArrayList arrayList;
        this.logsQueue = arrayList = new ArrayList();
        this.fallBackUrls = jSONArray;
        this.fallBackPublicKeys = jSONArray2;
        this.errorUrl = string7;
    }

    public void addToLogsQueue(String string2) {
        this.logsQueue.add(string2);
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public JSONArray getFallBackPublicKeys() {
        return this.fallBackPublicKeys;
    }

    public JSONArray getFallBackUrls() {
        return this.fallBackUrls;
    }

    public ArrayList getLogsQueueExp() {
        return this.logsQueue;
    }

    public void pollLogsQueue(String string2) {
        this.logsQueue.remove(string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        String string2;
        JSONObject jSONObject = new JSONObject();
        String string3 = "channelName";
        try {
            string2 = this.channelName;
        }
        catch (JSONException jSONException) {
            return jSONObject.toString();
        }
        string3 = jSONObject.put(string3, (Object)string2);
        string2 = "endPointProd";
        Object object = this.endPointProd;
        string3 = string3.put(string2, object);
        string2 = "headers";
        object = this.headers;
        string3 = string3.put(string2, object);
        string2 = "endpointSBX";
        object = this.endpointSBX;
        string3 = string3.put(string2, object);
        string2 = "keyProd";
        object = this.keyProd;
        string3 = string3.put(string2, object);
        string2 = "keySBX";
        object = this.keySBX;
        string3 = string3.put(string2, object);
        string2 = "encryptionLevel";
        object = this.encryptionLevel;
        string3 = string3.put(string2, object);
        string2 = "priority";
        int n3 = this.priority;
        string3 = string3.put(string2, n3);
        string2 = "environment";
        object = this.environment;
        string3 = string3.put(string2, object);
        string2 = "retryAttempts";
        n3 = this.retryAttempts;
        string3 = string3.put(string2, n3);
        string2 = "batchCount";
        long l2 = this.batchCount;
        string3 = string3.put(string2, l2);
        string2 = "fallBackUrls";
        object = this.fallBackUrls;
        string3 = string3.put(string2, object);
        string2 = "fallBackPublicKeys";
        object = this.fallBackUrls;
        string3 = string3.put(string2, object);
        string2 = "errorUrl";
        object = this.errorUrl;
        string3.put(string2, object);
        return jSONObject.toString();
    }
}

