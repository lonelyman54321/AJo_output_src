/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

public class LogChannel {
    final long batchCount;
    final String channelName;
    private int currentBatchRetryAttempts;
    final String encryptionLevel;
    final String endPointProd;
    final String endpointSBX;
    final String environment;
    Map headers;
    final JSONObject keyProd;
    final JSONObject keySBX;
    private final ConcurrentLinkedQueue logsQueue;
    final int priority;
    final int retryAttempts;

    public LogChannel(int n3, long l2, String string2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string5, String string6) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        this.channelName = string2;
        this.endPointProd = string3;
        this.endpointSBX = string4;
        this.keyProd = jSONObject;
        this.keySBX = jSONObject2;
        this.headers = map2;
        this.priority = n4;
        this.environment = string5;
        this.encryptionLevel = string6;
        this.retryAttempts = n3;
        this.batchCount = l2;
        this.currentBatchRetryAttempts = 0;
        this.logsQueue = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    public void addToLogsQueue(byte[] byArray) {
        this.logsQueue.add(byArray);
    }

    public long getBatchCount() {
        return this.batchCount;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getCurrentBatchRetryAttempts() {
        return this.currentBatchRetryAttempts;
    }

    public String getEncryptionLevel() {
        return this.encryptionLevel;
    }

    public String getEndPointProd() {
        return this.endPointProd;
    }

    public String getEndpointSBX() {
        return this.endpointSBX;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Map getHeaders() {
        return this.headers;
    }

    public JSONObject getKeyProd() {
        return this.keyProd;
    }

    public JSONObject getKeySBX() {
        return this.keySBX;
    }

    public ConcurrentLinkedQueue getLogsQueue() {
        return this.logsQueue;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getRetryAttempts() {
        return this.retryAttempts;
    }

    public void pollLogsQueue() {
        this.logsQueue.poll();
    }

    public void setCurrentBatchRetryAttempts(int n3) {
        this.currentBatchRetryAttempts = n3;
    }

    public void setHeaders(Map map2) {
        this.headers = map2;
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
        string3.put(string2, l2);
        return jSONObject.toString();
    }
}

