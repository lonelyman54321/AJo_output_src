/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.widget.Toast
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class JsInterface {
    private static final String LOG_TAG = "JsInterface";
    private final Context context;
    private final FileProviderService fileProviderService;
    protected final JuspayServices juspayServices;
    private final LogManager logManager;
    private final LogSessioniser logSessioniser;
    private final RemoteAssetService remoteAssetService;
    private final SdkTracker sdkTracker;
    private final SessionInfo sessionInfo;
    protected final Workspace workspace;

    public JsInterface(JuspayServices object) {
        Object object2;
        this.context = object2 = ((JuspayServices)object).getContext();
        this.juspayServices = object;
        object2 = ((JuspayServices)object).getWorkspace();
        this.workspace = object2;
        object2 = ((JuspayServices)object).getLogManager();
        this.logManager = object2;
        object2 = object2.logSessioniser;
        this.logSessioniser = object2;
        object2 = ((JuspayServices)object).getSessionInfo();
        this.sessionInfo = object2;
        object2 = ((JuspayServices)object).getSdkTracker();
        this.sdkTracker = object2;
        object2 = ((JuspayServices)object).getRemoteAssetService();
        this.remoteAssetService = object2;
        this.fileProviderService = object = ((JuspayServices)object).getFileProviderService();
    }

    public static /* synthetic */ void a(JsInterface jsInterface, String string2) {
        jsInterface.lambda$addLogProperties$0(string2);
    }

    public static /* synthetic */ void b(JsInterface jsInterface, String string2, String string3) {
        jsInterface.lambda$requestPendingLogs$2(string2, string3);
    }

    public static /* synthetic */ void c(JsInterface jsInterface, JSONObject jSONObject, String string2) {
        jsInterface.lambda$setAnalyticsHeader$1(jSONObject, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$addLogProperties$0(String object) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject((String)object);
            object = this.sdkTracker;
        }
        catch (Exception exception) {
            return;
        }
        ((SdkTracker)object).addLogProperties(jSONObject);
    }

    private /* synthetic */ void lambda$requestPendingLogs$2(String string2, String string3) {
        block12: {
            String string4;
            Object object;
            block11: {
                try {
                    object = this.juspayServices;
                }
                catch (Exception exception) {}
                object = ((JuspayServices)object).getWorkingLogger();
                string4 = "json-array";
                boolean bl2 = Objects.equals(object, string4);
                if (bl2) break block11;
                object = this.juspayServices;
                object = ((JuspayServices)object).getWorkingLogger();
                string4 = "both";
                bl2 = Objects.equals(object, string4);
                if (!bl2) break block12;
            }
            object = this.logSessioniser;
            string4 = new JSONObject(string2);
            string2 = ((LogSessioniser)object).getLogsFromSessionId((JSONObject)string4);
        }
        string2 = "{}";
        this.juspayServices.getJBridge().invokeCallbackInDUIWebview(string3, string2);
    }

    private /* synthetic */ void lambda$setAnalyticsHeader$1(JSONObject jSONObject, String string2) {
        this.juspayServices.getLogManager().setHeaders(jSONObject, string2);
    }

    public boolean addChannel(String string2, String string3) {
        return this.logManager.addChannel(string2, string3);
    }

    public boolean addChannelExp(String string2, String string3) {
        return this.logManager.addChannelExp(string2, string3);
    }

    public void addLogProperties(String string2) {
        J61 j61 = new J61(1, this, string2);
        ExecutorManager.runOnSdkTrackerPool(j61);
    }

    public void addToLogList(String object) {
        Object object2 = this.sessionInfo.getSessionId();
        if (object2 != null) {
            object2 = new JSONObject((String)object);
            object = this.sdkTracker;
            try {
                ((SdkTracker)object).track((JSONObject)object2);
            }
            catch (JSONException jSONException) {
                object2 = this.sdkTracker;
                String string2 = "log_pusher";
                String string3 = "Exception while parsing the JSON";
                String string4 = "action";
                String string5 = "system";
                ((SdkTracker)object2).trackException(string4, string5, string2, string3, jSONException);
            }
        } else {
            SdkTracker.addToBootLogs((String)object);
        }
    }

    public boolean checkIfVPNConnected() {
        return Utils.checkIfVPNConnected(this.context);
    }

    public String getChannelNames() {
        return Arrays.toString(this.logManager.getChannelNames());
    }

    public String getChannelNamesExp() {
        return Arrays.toString(this.logManager.getChannelNamesExp());
    }

    public String getFileDownloadTimes() {
        return this.remoteAssetService.getFileDownloadTimes().toString();
    }

    public String getFilePath(String string2) {
        return this.fileProviderService.appendSdkNameAndVersion(string2);
    }

    public String getFromSharedPrefs(String string2) {
        return this.workspace.getFromSharedPreference(string2, "__failed");
    }

    public String getLogList() {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.getLogList() method. It will be removed in future.");
        return "[]";
    }

    public String getMd5(String string2) {
        return EncryptionHelper.md5(string2.getBytes());
    }

    public String getResourceById(int n3) {
        return this.context.getResources().getString(n3);
    }

    public String getResourceByName(String string2) {
        Resources resources = this.context.getResources();
        String string3 = this.context.getPackageName();
        int n3 = resources.getIdentifier(string2, "string", string3);
        return this.getResourceById(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getRootFragmentSize() {
        JSONObject jSONObject = new JSONObject();
        Object object = this.juspayServices.getContainer();
        String string2 = "width";
        String string3 = "height";
        String string4 = "";
        if (object != null) {
            try {
                object = this.juspayServices;
                object = ((JuspayServices)object).getContainer();
                int n3 = object.getHeight();
                object = String.valueOf(n3);
                jSONObject.put(string3, object);
                object = this.juspayServices;
                object = ((JuspayServices)object).getContainer();
                n3 = object.getWidth();
                object = String.valueOf(n3);
                jSONObject.put(string2, object);
                return jSONObject.toString();
            }
            catch (JSONException jSONException) {
                try {
                    object = this.sessionInfo;
                    object = ((SessionInfo)object).getScreenHeight();
                    if (object != null) {
                        object = this.sessionInfo;
                        object = ((SessionInfo)object).getScreenHeight();
                    } else {
                        object = string4;
                    }
                    jSONObject.put(string3, object);
                    object = this.sessionInfo;
                    object = ((SessionInfo)object).getScreenWidth();
                    if (object != null) {
                        object = this.sessionInfo;
                        string4 = ((SessionInfo)object).getScreenWidth();
                    }
                    jSONObject.put(string2, (Object)string4);
                    return jSONObject.toString();
                }
                catch (JSONException jSONException2) {
                    return jSONObject.toString();
                }
            }
        }
        object = this.sessionInfo;
        if ((object = ((SessionInfo)object).getScreenHeight()) != null) {
            object = this.sessionInfo;
            object = ((SessionInfo)object).getScreenHeight();
        } else {
            object = string4;
        }
        jSONObject.put(string3, object);
        object = this.sessionInfo;
        object = ((SessionInfo)object).getScreenWidth();
        if (object != null) {
            object = this.sessionInfo;
            string4 = ((SessionInfo)object).getScreenWidth();
        }
        jSONObject.put(string2, (Object)string4);
        return jSONObject.toString();
    }

    public String getSessionAttribute(String string2, String string3) {
        return this.sessionInfo.get(string2, string3);
    }

    public String getSessionId() {
        return this.sessionInfo.getSessionId();
    }

    public String getSessionInfo() {
        this.sessionInfo.createSessionDataMap();
        return this.sessionInfo.toString();
    }

    public boolean isFilePresent(String string2) {
        FileProviderService fileProviderService = this.fileProviderService;
        Context context = this.context;
        return fileProviderService.isFilePresent(context, string2);
    }

    public boolean isNetworkAvailable() {
        return this.sessionInfo.isNetworkAvailable();
    }

    public String loadFileInDUI(String string2) {
        FileProviderService fileProviderService = this.fileProviderService;
        Context context = this.context;
        return fileProviderService.readFromFile(context, string2);
    }

    public String loadFileInDUI(String string2, int n3) {
        FileProviderService fileProviderService = this.fileProviderService;
        Context context = this.context;
        return fileProviderService.readFromFile(context, string2);
    }

    public void postLogs(String string2, String string3) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.postLogs() method. It will be removed in future.");
    }

    public void removeAttribute(String string2) {
        this.sessionInfo.removeAttribute(string2);
    }

    public void removeDataFromSharedPrefs(String string2) {
        this.workspace.removeFromSharedPreference(string2);
    }

    public void removeFromSharedPrefs(String string2) {
        this.workspace.removeFromSharedPreference(string2);
    }

    public void renewFile(String string2) {
        this.renewFile(string2, null, null);
    }

    public void renewFile(String string2, String string3) {
        this.renewFile(string2, string3, null);
    }

    public void renewFile(String string2, String string3, String string4) {
        RemoteAssetService remoteAssetService = this.remoteAssetService;
        Context context = this.context;
        long l2 = System.currentTimeMillis();
        remoteAssetService.renewFile(context, string2, string4, string3, l2);
    }

    public void renewSdkConfig() {
        SdkConfigService sdkConfigService = this.juspayServices.getSdkConfigService();
        Context context = this.context;
        sdkConfigService.renewConfig(context);
    }

    public String requestPendingLogs(String string2) {
        block12: {
            String string3;
            Object object;
            block11: {
                try {
                    object = this.juspayServices;
                }
                catch (JSONException jSONException) {}
                object = ((JuspayServices)object).getWorkingLogger();
                string3 = "json-array";
                boolean bl2 = Objects.equals(object, string3);
                if (bl2) break block11;
                object = this.juspayServices;
                object = ((JuspayServices)object).getWorkingLogger();
                string3 = "both";
                bl2 = Objects.equals(object, string3);
                if (!bl2) break block12;
            }
            object = this.logSessioniser;
            string3 = new JSONObject(string2);
            return ((LogSessioniser)object).getLogsFromSessionId((JSONObject)string3);
        }
        return "{}";
    }

    public void requestPendingLogs(String string2, String string3) {
        kl1_2 kl1_22 = new kl1_2(this, 0, string2, string3);
        ExecutorManager.runOnLogsPool(kl1_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sessioniseLogs(String string2) {
        JSONException jSONException;
        block3: {
            String string3;
            Object object;
            block2: {
                try {
                    object = this.juspayServices;
                    object = ((JuspayServices)object).getWorkingLogger();
                    string3 = "json-array";
                    boolean bl2 = Objects.equals(object, string3);
                    if (bl2) break block2;
                    object = this.juspayServices;
                    bl2 = Objects.equals(object = ((JuspayServices)object).getWorkingLogger(), string3 = "both");
                    if (!bl2) return;
                }
                catch (JSONException jSONException2) {
                    jSONException = jSONException2;
                    break block3;
                }
            }
            object = this.logSessioniser;
            string3 = new JSONObject(string2);
            ((LogSessioniser)object).sessioniseLogs((JSONObject)string3);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string4 = "Logs request has invalid format";
        String string5 = kp1_0.c(string4, string2);
        String string6 = "system";
        String string7 = "jbridge";
        String string8 = "action";
        sdkTracker.trackException(string8, string6, string7, string5, jSONException);
    }

    public void setAnalyticsEndPoint(String string2) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.setAnalyticsEndPoint() method. It will be removed in future.");
    }

    public boolean setAnalyticsHeader(String string2) {
        return this.setAnalyticsHeader(string2, "default");
    }

    public boolean setAnalyticsHeader(String object, String string2) {
        try {
            JSONObject jSONObject = new JSONObject((String)object);
            object = new ll1_2(this, jSONObject, string2);
        }
        catch (JSONException jSONException) {
            return false;
        }
        ExecutorManager.runOnLogPusherThread((Runnable)object);
        return true;
    }

    public void setInSharedPrefs(String string2, String string3) {
        this.workspace.writeToSharedPreference(string2, string3);
    }

    public void setSessionAttribute(String string2, String string3) {
        this.sessionInfo.set(string2, string3);
    }

    public void setSessionId(String string2) {
        String string3 = LOG_TAG;
        JuspayLogger.d(string3, "JBridge.setSessionId() is intended for changing the Session ID of the SDK. Not to be called by each micro-app");
        StringBuilder stringBuilder = new StringBuilder("Attempted Session ID: ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        JuspayLogger.d(string3, string2);
    }

    public void startPushingLogs() {
        this.logManager.startPushExp();
    }

    public void submitAllLogs() {
    }

    public void toast(String string2) {
        Toast.makeText((Context)this.context, (CharSequence)string2, (int)1).show();
    }

    public void updateLogList(String string2) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.updateLogList() method. It will be removed in future.");
    }
}

