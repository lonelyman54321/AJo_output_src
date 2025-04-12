/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import org.json.JSONArray;
import org.json.JSONObject;

public class LogConfig {
    JSONArray allowWhileBuffering;
    JSONObject channels;
    JSONArray defaultChannels;
    int defaultPriority;
    long dontPushIfFileIsLastModifiedBeforeInHours;
    String encryptionLevel;
    public String errorUrl;
    public JSONArray fallBackPublicKeys;
    public JSONArray fallBackUrl;
    public String fileFormat;
    long filesCountLimit;
    long folderSizeLimit;
    JSONArray logChannelsConfig;
    JSONObject logHeaders;
    int logPostInterval;
    public JSONObject logProperties;
    int logSessioniseInterval;
    int maxFilesAllowed;
    long maxLogFileSize;
    long maxLogLineSize;
    long maxLogValueSize;
    long maxLogsPerPush;
    int maxRetryPerBatch;
    long maxSizeLimitPerPush;
    long minMemoryRequired;
    int numFilesToLeaveIfMaxFilesExceeded;
    String prodLogUrl;
    JSONObject publicKey;
    JSONObject publicKeySandbox;
    String sandboxLogUrl;
    public boolean shouldPush;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LogConfig(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String string2;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String string3;
        String string4;
        long l2;
        long l3;
        String string5;
        int n3;
        int n4;
        int n7;
        long l4;
        long l7;
        long l8;
        LogConfig logConfig = this;
        JSONObject jSONObject4 = jSONObject;
        String string6 = "fileFormat";
        String string7 = "allowWhileBuffering";
        String string8 = "logProperties";
        String string9 = "logHeaders";
        this.minMemoryRequired = l8 = 16384L;
        this.maxLogLineSize = l7 = 0x1400000L;
        this.maxLogFileSize = l7;
        this.maxLogValueSize = l4 = 32768L;
        this.maxFilesAllowed = n7 = 7;
        this.numFilesToLeaveIfMaxFilesExceeded = n4 = 5;
        this.dontPushIfFileIsLastModifiedBeforeInHours = 720L;
        this.logPostInterval = n3 = 2000;
        this.logSessioniseInterval = n3;
        this.encryptionLevel = string5 = "encryption";
        String string10 = string5;
        this.maxLogsPerPush = 75;
        this.maxSizeLimitPerPush = 204800L;
        this.maxRetryPerBatch = -1;
        this.defaultPriority = n4;
        this.folderSizeLimit = l3 = 0x3200000L;
        this.filesCountLimit = l2 = 200L;
        this.publicKeySandbox = string5;
        super();
        this.publicKey = string5;
        super();
        this.channels = string5;
        super();
        this.logChannelsConfig = string5;
        super();
        this.defaultChannels = string5;
        this.sandboxLogUrl = string5 = "https://debug.logs.juspay.net/godel/analytics";
        this.prodLogUrl = string4 = "https://logs.juspay.in/godel/analytics";
        n3 = 1;
        this.shouldPush = n3;
        this.fileFormat = string3 = "prefixByte";
        this.fallBackUrl = jSONArray3 = new JSONArray();
        this.fallBackPublicKeys = jSONArray2 = new JSONArray();
        this.errorUrl = string2 = "";
        this.logHeaders = jSONObject3 = new JSONObject();
        this.logProperties = jSONObject2 = new JSONObject();
        this.allowWhileBuffering = jSONArray = new JSONArray();
        if (jSONObject == null) return;
        String string11 = "logsConfig";
        try {
            String string12;
            String string13;
            String string14;
            String string15;
            JSONArray jSONArray4;
            int n8;
            JSONObject jSONObject5 = jSONObject.getJSONObject(string11);
            String string16 = "maxLogLineSize";
            this.maxLogLineSize = l8 = jSONObject5.optLong(string16, l7);
            String string17 = "maxLogFileSize";
            this.maxLogFileSize = l8 = jSONObject5.optLong(string17, l7);
            string17 = "minMemoryRequired";
            long l12 = 16384L;
            this.minMemoryRequired = l8 = jSONObject5.optLong(string17, l12);
            string17 = "maxFilesAllowed";
            int n10 = 7;
            this.maxFilesAllowed = n8 = jSONObject5.optInt(string17, n10);
            string17 = "maxLogValueSize";
            l12 = 32768L;
            this.maxLogValueSize = l8 = jSONObject5.optLong(string17, l12);
            string17 = "folderSizeLimit";
            l12 = 0x3200000L;
            this.folderSizeLimit = l8 = jSONObject5.optLong(string17, l12);
            string17 = "filesCountLimit";
            l12 = 200L;
            this.filesCountLimit = l8 = jSONObject5.optLong(string17, l12);
            string17 = "maxSizeLimitPerPush";
            l12 = 204800L;
            this.maxSizeLimitPerPush = l8 = jSONObject5.optLong(string17, l12);
            string17 = "encryptionLevelKey";
            this.encryptionLevel = string17 = jSONObject5.optString(string17, string10);
            string17 = "publicKeySandbox";
            string17 = jSONObject5.optJSONObject(string17);
            this.publicKeySandbox = string17;
            string17 = "publicKey";
            string17 = jSONObject5.optJSONObject(string17);
            this.publicKey = string17;
            string17 = "channels";
            string17 = jSONObject5.optJSONObject(string17);
            this.channels = string17;
            string17 = "defaultChannels";
            string17 = jSONObject.optJSONArray(string17);
            this.defaultChannels = string17;
            string17 = "numFilesToLeaveIfMaxFilesExceeded";
            n10 = 5;
            this.numFilesToLeaveIfMaxFilesExceeded = n8 = jSONObject5.optInt(string17, n10);
            string17 = "dontPushIfFileIsLastModifiedBeforeInHours";
            l12 = 720L;
            this.dontPushIfFileIsLastModifiedBeforeInHours = l8 = jSONObject5.optLong(string17, l12);
            string17 = "shouldPush";
            n10 = 1;
            n8 = (int)(jSONObject5.optBoolean(string17, n10 != 0) ? 1 : 0);
            this.shouldPush = n8;
            string17 = "logsUrlKeySandbox";
            this.sandboxLogUrl = string17 = jSONObject5.optString(string17, string5);
            string17 = "logsUrlKey";
            this.prodLogUrl = string17 = jSONObject5.optString(string17, string4);
            string17 = "defaultPriority";
            n10 = 5;
            this.defaultPriority = n8 = jSONObject5.optInt(string17, n10);
            string17 = "retryAttempts";
            n10 = -1;
            this.maxRetryPerBatch = n8 = jSONObject5.optInt(string17, n10);
            string17 = "batchCount";
            l12 = 75;
            this.maxLogsPerPush = l8 = jSONObject5.optLong(string17, l12);
            string17 = "logPusherTimerWithChannel";
            n10 = 2000;
            this.logPostInterval = n8 = jSONObject5.optInt(string17, n10);
            string17 = "sessioniseTimer";
            this.logSessioniseInterval = n8 = jSONObject5.optInt(string17, n10);
            string17 = "logChannelsConfig";
            this.logChannelsConfig = jSONArray4 = jSONObject.optJSONArray(string17);
            boolean bl2 = jSONObject5.has(string9);
            if (bl2) {
                JSONObject jSONObject6;
                this.logHeaders = jSONObject6 = jSONObject5.getJSONObject(string9);
            }
            if (bl2 = jSONObject5.has(string8)) {
                JSONObject jSONObject7;
                logConfig.logProperties = jSONObject7 = jSONObject5.getJSONObject(string8);
            }
            if (bl2 = jSONObject5.has(string7)) {
                JSONArray jSONArray5;
                logConfig.allowWhileBuffering = jSONArray5 = jSONObject5.getJSONArray(string7);
            }
            if (bl2 = jSONObject5.has(string6)) {
                String string18;
                logConfig.fileFormat = string18 = jSONObject5.optString(string6, string3);
            }
            if (bl2 = jSONObject5.has(string15 = "fallBackUrl")) {
                JSONArray jSONArray6;
                String string19 = "fallBackUrl";
                logConfig.fallBackUrl = jSONArray6 = jSONObject5.optJSONArray(string19);
            }
            if (bl2 = jSONObject5.has(string14 = "fallBackPublicKeys")) {
                JSONArray jSONArray7;
                String string20 = "fallBackPublicKeys";
                logConfig.fallBackPublicKeys = jSONArray7 = jSONObject5.optJSONArray(string20);
            }
            if (!(bl2 = jSONObject5.has(string13 = "errorUrl"))) return;
            String string21 = "errorUrl";
            logConfig.errorUrl = string12 = jSONObject5.optString(string21, string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

