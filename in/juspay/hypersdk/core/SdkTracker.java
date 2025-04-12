/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.util.Log
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.Tracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class SdkTracker
implements TrackerInterface,
Tracker {
    private static final String LOG_TAG = "SdkTracker";
    private static final int MAX_LOG_SIZE = 22528;
    private static final Queue bootLogs;
    private String godelBuildVersion;
    private String godelVersion;
    private String hyperSdkVersion;
    private final JuspayServices juspayServices;
    private final HashSet labelsToDrop;
    private final JSONObject logProperties;
    private AtomicInteger serialNumberCounter;

    static {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        bootLogs = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SdkTracker(JuspayServices object) {
        int n3 = 1;
        Object object2 = new AtomicInteger(n3);
        this.serialNumberCounter = object2;
        object2 = "";
        this.hyperSdkVersion = object2;
        this.godelVersion = object2;
        this.godelBuildVersion = object2;
        object2 = new JSONObject();
        this.logProperties = object2;
        this.labelsToDrop = object2 = new HashSet();
        this.juspayServices = object;
        try {
            object2 = ((JuspayServices)object).getContext();
            object2 = IntegrationUtils.getSdkVersion(object2);
            this.hyperSdkVersion = object2;
            object2 = ((JuspayServices)object).getContext();
            object2 = IntegrationUtils.getGodelVersion(object2);
            this.godelVersion = object2;
            object = ((JuspayServices)object).getContext();
            this.godelBuildVersion = object = IntegrationUtils.getGodelBuildVersion((Context)object);
        }
        catch (Exception exception) {}
        object = new Object();
        ExecutorManager.runOnSdkTrackerPool((Runnable)object);
    }

    public static /* synthetic */ void a(String string2, String string3, String string4, String string5, Object object) {
        SdkTracker.lambda$trackBootAction$3(string2, string3, string4, string5, object);
    }

    public static void addToBootLogs(String string2) {
        on1_2 on1_22 = new on1_2(string2, 1);
        ExecutorManager.runOnSdkTrackerPool(on1_22);
    }

    public static /* synthetic */ void b() {
        SdkTracker.lambda$new$0();
    }

    public static /* synthetic */ void c(SdkTracker sdkTracker, JSONObject jSONObject) {
        sdkTracker.lambda$addLogToPersistedQueue$14(jSONObject);
    }

    private static JSONObject cloneJSON(JSONObject jSONObject) {
        int n3;
        JSONArray jSONArray = jSONObject.names();
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            String string2 = (String)jSONArray.opt(i3);
            Object object = jSONObject.opt(string2);
            boolean bl2 = object instanceof JSONObject;
            if (bl2) {
                object = SdkTracker.cloneJSON((JSONObject)object);
                jSONObject2.put(string2, object);
                continue;
            }
            bl2 = object instanceof JSONArray;
            if (bl2) {
                object = SdkTracker.cloneJSONArray((JSONArray)object);
                jSONObject2.put(string2, object);
                continue;
            }
            jSONObject2.put(string2, object);
        }
        return jSONObject2;
    }

    private static JSONArray cloneJSONArray(JSONArray jSONArray) {
        int n3;
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            Object object = jSONArray.opt(i3);
            boolean bl2 = object instanceof JSONObject;
            if (bl2) {
                object = SdkTracker.cloneJSON((JSONObject)object);
                jSONArray2.put(object);
                continue;
            }
            bl2 = object instanceof JSONArray;
            if (bl2) {
                object = SdkTracker.cloneJSONArray((JSONArray)object);
                jSONArray2.put(object);
                continue;
            }
            jSONArray2.put(object);
        }
        return jSONArray2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object cloneObject(Object object) {
        boolean bl2 = object instanceof JSONObject;
        if (bl2) {
            Object object2 = object;
            object2 = (JSONObject)object;
            return SdkTracker.cloneJSON((JSONObject)object2);
        }
        bl2 = object instanceof JSONArray;
        if (!bl2) return object;
        Object object3 = object;
        try {
            object3 = (JSONArray)object;
        }
        catch (Exception exception) {
            return object;
        }
        return SdkTracker.cloneJSONArray((JSONArray)object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject createApiExceptionLog(String string2, String charSequence, String string3, Long object, Long object2, Object object3, String string4, String string5, String string6, Throwable throwable, JSONArray jSONArray, JSONObject jSONObject) {
        Exception exception2;
        JSONObject jSONObject2;
        block4: {
            int n3;
            jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            String string7 = "url";
            try {
                jSONObject3.put(string7, (Object)string4);
                string4 = "start_time";
                jSONObject3.put(string4, object);
                object = "end_time";
                jSONObject3.put((String)object, object2);
                object = "payload";
                object2 = object3 == null ? JSONObject.NULL : SdkTracker.cloneObject(object3);
            }
            catch (Exception exception2) {
                break block4;
            }
            jSONObject3.put((String)object, object2);
            object = "method";
            jSONObject3.put((String)object, (Object)string5);
            object = "message";
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string6);
            object3 = ". ";
            ((StringBuilder)object2).append((String)object3);
            object3 = throwable.getLocalizedMessage();
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            jSONObject3.put((String)object, object2);
            object = "stacktrace";
            object2 = SdkTracker.formatThrowable(throwable);
            jSONObject3.put((String)object, object2);
            object = "category";
            jSONObject2.put((String)object, (Object)string2);
            string2 = "subcategory";
            jSONObject2.put(string2, (Object)charSequence);
            string2 = "level";
            charSequence = "exception";
            jSONObject2.put(string2, (Object)charSequence);
            string2 = "label";
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            string3 = "_";
            ((StringBuilder)charSequence).append(string3);
            string3 = Utils.getLogLevelFromThrowable(throwable);
            ((StringBuilder)charSequence).append(string3);
            charSequence = ((StringBuilder)charSequence).toString();
            jSONObject2.put(string2, (Object)charSequence);
            string2 = "value";
            jSONObject2.put(string2, (Object)jSONObject3);
            string2 = "at";
            long l2 = System.currentTimeMillis();
            jSONObject2.put(string2, l2);
            string2 = "service";
            charSequence = "sdk";
            jSONObject2.put(string2, (Object)charSequence);
            string2 = "channels";
            jSONObject2.put(string2, (Object)jSONArray);
            if (jSONObject == null || (string2 = jSONObject.names()) == null) return jSONObject2;
            charSequence = null;
            for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
                string3 = string2.getString(i3);
                object = jSONObject.getString(string3);
                jSONObject2.put(string3, object);
            }
            return jSONObject2;
        }
        charSequence = LOG_TAG;
        string3 = "Error while adding API exception log: ";
        JuspayLogger.e((String)charSequence, string3, exception2);
        return jSONObject2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject createApiLog(String string2, String string3, String string4, Integer object, String object2, Long l2, Long l3, Object object3, Object object4, String string5) {
        JSONException jSONException2;
        JSONObject jSONObject;
        block2: {
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String string6 = "url";
            try {
                jSONObject2.put(string6, object2);
                object2 = "status_code";
                jSONObject2.put((String)object2, object);
                object = "start_time";
                jSONObject2.put((String)object, (Object)l2);
                object = "end_time";
                jSONObject2.put((String)object, (Object)l3);
                object = "payload";
                object2 = object3 == null ? JSONObject.NULL : SdkTracker.cloneObject(object3);
            }
            catch (JSONException jSONException2) {
                break block2;
            }
            jSONObject2.put((String)object, object2);
            object = "response";
            object2 = SdkTracker.cloneObject(object4);
            jSONObject2.put((String)object, object2);
            object = "method";
            jSONObject2.put((String)object, (Object)string5);
            object = "category";
            object2 = "api_call";
            jSONObject.put((String)object, object2);
            object = "subcategory";
            jSONObject.put((String)object, (Object)string2);
            string2 = "level";
            jSONObject.put(string2, (Object)string3);
            string2 = "label";
            jSONObject.put(string2, (Object)string4);
            string2 = "value";
            jSONObject.put(string2, (Object)jSONObject2);
            string2 = "at";
            long l4 = System.currentTimeMillis();
            jSONObject.put(string2, l4);
            string2 = "service";
            string3 = "sdk";
            jSONObject.put(string2, (Object)string3);
            return jSONObject;
        }
        string3 = LOG_TAG;
        string4 = "Error while adding boot log: ";
        JuspayLogger.e(string3, string4, jSONException2);
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject createApiLog(String string2, String string3, String string4, Integer object, String string5, String string6, Long l2, Long l3, Object object2, Object object3, String string7, JSONArray jSONArray, JSONObject jSONObject) {
        JSONException jSONException2;
        JSONObject jSONObject2;
        block6: {
            int n3;
            JSONObject jSONObject3;
            block5: {
                jSONObject2 = new JSONObject();
                jSONObject3 = new JSONObject();
                String string8 = "url";
                try {
                    jSONObject3.put(string8, (Object)string5);
                    string5 = "status_code";
                    jSONObject3.put(string5, object);
                    object = "start_time";
                    jSONObject3.put((String)object, (Object)l2);
                    object = "end_time";
                    jSONObject3.put((String)object, (Object)l3);
                    object = "payload";
                    if (object2 != null) break block5;
                    object2 = JSONObject.NULL;
                }
                catch (JSONException jSONException2) {
                    break block6;
                }
            }
            jSONObject3.put((String)object, object2);
            object = "response";
            jSONObject3.put((String)object, object3);
            object = "method";
            jSONObject3.put((String)object, (Object)string7);
            if (string6 != null) {
                object = "api_tag";
                jSONObject3.put((String)object, (Object)string6);
            }
            object = "category";
            string5 = "api_call";
            jSONObject2.put((String)object, (Object)string5);
            object = "subcategory";
            jSONObject2.put((String)object, (Object)string2);
            string2 = "level";
            jSONObject2.put(string2, (Object)string3);
            string2 = "label";
            jSONObject2.put(string2, (Object)string4);
            string2 = "channels";
            jSONObject2.put(string2, (Object)jSONArray);
            string2 = "value";
            jSONObject2.put(string2, (Object)jSONObject3);
            string2 = "at";
            long l4 = System.currentTimeMillis();
            jSONObject2.put(string2, l4);
            string2 = "service";
            string3 = "sdk";
            jSONObject2.put(string2, (Object)string3);
            if (jSONObject == null || (string2 = jSONObject.names()) == null) return jSONObject2;
            string3 = null;
            for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
                string4 = string2.getString(i3);
                object = jSONObject.getString(string4);
                jSONObject2.put(string4, object);
            }
            return jSONObject2;
        }
        string3 = LOG_TAG;
        string4 = "Error while adding boot log: ";
        JuspayLogger.e(string3, string4, jSONException2);
        return jSONObject2;
    }

    private static JSONObject createExceptionLog(String string2, String string3, String string4, String string5, Throwable throwable) {
        return SdkTracker.createExceptionLog(string2, string3, string4, string5, throwable, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject createExceptionLog(String string2, String charSequence, String string3, String string4, Throwable throwable, boolean bl2) {
        JSONException jSONException2;
        JSONObject jSONObject;
        block4: {
            JSONObject jSONObject2;
            block3: {
                block2: {
                    jSONObject = new JSONObject();
                    jSONObject2 = new JSONObject();
                    String string5 = "message";
                    try {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string4);
                        string4 = ". ";
                        stringBuilder.append(string4);
                        string4 = throwable.getLocalizedMessage();
                        stringBuilder.append(string4);
                        string4 = stringBuilder.toString();
                        jSONObject2.put(string5, (Object)string4);
                        string4 = "stacktrace";
                        if (!bl2) break block2;
                        String string6 = SdkTracker.formatThrowable(throwable);
                        jSONObject2.put(string4, (Object)string6);
                        break block3;
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                }
                String string7 = Log.getStackTraceString((Throwable)throwable);
                jSONObject2.put(string4, (Object)string7);
            }
            string4 = "category";
            jSONObject.put(string4, (Object)string2);
            string2 = "subcategory";
            jSONObject.put(string2, (Object)charSequence);
            string2 = "level";
            charSequence = "exception";
            jSONObject.put(string2, (Object)charSequence);
            string2 = "label";
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            string3 = "_";
            ((StringBuilder)charSequence).append(string3);
            string3 = Utils.getLogLevelFromThrowable(throwable);
            ((StringBuilder)charSequence).append(string3);
            charSequence = ((StringBuilder)charSequence).toString();
            jSONObject.put(string2, (Object)charSequence);
            string2 = "value";
            jSONObject.put(string2, (Object)jSONObject2);
            string2 = "service";
            charSequence = "sdk";
            jSONObject.put(string2, (Object)charSequence);
            string2 = "at";
            long l2 = System.currentTimeMillis();
            jSONObject.put(string2, l2);
            return jSONObject;
        }
        charSequence = LOG_TAG;
        string3 = "Error while adding log: ";
        JuspayLogger.e((String)charSequence, string3, jSONException2);
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject createLog(String string2, String string3, String string4, String string5, String string6, Object object) {
        JSONException jSONException2;
        JSONObject jSONObject;
        block4: {
            JSONObject jSONObject2;
            block3: {
                jSONObject = new JSONObject();
                jSONObject2 = new JSONObject();
                if (object == null) {
                    try {
                        object = JSONObject.NULL;
                        break block3;
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                }
                object = SdkTracker.cloneObject(object);
            }
            jSONObject2.put(string6, object);
            string6 = "category";
            jSONObject.put(string6, (Object)string2);
            string2 = "subcategory";
            jSONObject.put(string2, (Object)string3);
            string2 = "level";
            jSONObject.put(string2, (Object)string4);
            string2 = "label";
            jSONObject.put(string2, (Object)string5);
            string2 = "value";
            jSONObject.put(string2, (Object)jSONObject2);
            string2 = "at";
            long l2 = System.currentTimeMillis();
            jSONObject.put(string2, l2);
            string2 = "service";
            string3 = "sdk";
            jSONObject.put(string2, (Object)string3);
            return jSONObject;
        }
        string3 = LOG_TAG;
        string4 = "Error while adding boot log: ";
        JuspayLogger.e(string3, string4, jSONException2);
        return jSONObject;
    }

    private static JSONObject createLogWithValue(String string2, String object, String string3, String string4, Object object2) {
        JSONObject jSONObject = new JSONObject();
        String string5 = "category";
        jSONObject.put(string5, (Object)string2);
        string2 = "subcategory";
        jSONObject.put(string2, object);
        string2 = "level";
        jSONObject.put(string2, (Object)string3);
        string2 = "label";
        jSONObject.put(string2, (Object)string4);
        string2 = "value";
        object = SdkTracker.cloneObject(object2);
        jSONObject.put(string2, object);
        string2 = "at";
        long l2 = System.currentTimeMillis();
        jSONObject.put(string2, l2);
        string2 = "service";
        object = "sdk";
        try {
            jSONObject.put(string2, object);
        }
        catch (JSONException jSONException) {
            object = LOG_TAG;
            string3 = "Error while adding boot log: ";
            JuspayLogger.e((String)object, string3, jSONException);
        }
        return jSONObject;
    }

    public static /* synthetic */ void d(SdkTracker sdkTracker, String string2, String string3, String string4, Integer n3, String string5, Long l2, Long l3, Object object, Object object2, String string6) {
        sdkTracker.lambda$trackApiCalls$9(string2, string3, string4, n3, string5, l2, l3, object, object2, string6);
    }

    public static /* synthetic */ void e(SdkTracker sdkTracker, Boolean bl2) {
        sdkTracker.lambda$setEndPointSandbox$18(bl2);
    }

    public static /* synthetic */ void f(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Object object) {
        sdkTracker.lambda$trackAction$8(string2, string3, string4, string5, object);
    }

    private static String formatThrowable(Throwable throwable) {
        String string2 = SdkTracker.getStackTraceAsString(throwable);
        StringBuilder stringBuilder = new StringBuilder(string2);
        for (throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause()) {
            stringBuilder.append("\nCaused by ");
            string2 = SdkTracker.getStackTraceAsString(throwable);
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ void g(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Object object) {
        sdkTracker.lambda$trackContext$11(string2, string3, string4, string5, object);
    }

    private static String getStackTraceAsString(Throwable stackTraceElementArray) {
        String string2 = stackTraceElementArray.toString();
        StringBuilder stringBuilder = new StringBuilder(string2);
        for (StackTraceElement stackTraceElement : stackTraceElementArray.getStackTrace()) {
            String string3 = "\n\tat ";
            stringBuilder.append(string3);
            String object = stackTraceElement.toString();
            stringBuilder.append(object);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ void h(String string2) {
        SdkTracker.lambda$addToBootLogs$1(string2);
    }

    public static /* synthetic */ void i(SdkTracker sdkTracker, String string2, String string3, String string4, Integer n3, String string5, String string6, long l2, Long l3, Object object, Object object2, String string7, JSONArray jSONArray, JSONObject jSONObject) {
        sdkTracker.lambda$trackApiCalls$10(string2, string3, string4, n3, string5, string6, l2, l3, object, object2, string7, jSONArray, jSONObject);
    }

    public static /* synthetic */ void j(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Object object) {
        sdkTracker.lambda$trackLifecycle$6(string2, string3, string4, string5, object);
    }

    public static /* synthetic */ void k(SdkTracker sdkTracker, String string2, String string3, String string4, JSONObject jSONObject) {
        sdkTracker.lambda$trackLifecycle$7(string2, string3, string4, jSONObject);
    }

    public static /* synthetic */ void l(SdkTracker sdkTracker, String string2, String string3, String string4, Object object) {
        sdkTracker.lambda$trackContext$12(string2, string3, string4, object);
    }

    private /* synthetic */ void lambda$addLogToPersistedQueue$14(JSONObject jSONObject) {
        this.juspayServices.getLogManager().addLogsToPersistedQueue(jSONObject);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void lambda$addToBootLogs$1(String object) {
        Exception exception2;
        String string2;
        String string3;
        block3: {
            String string4;
            block2: {
                string3 = "at";
                string4 = "DEBUG";
                string2 = LOG_TAG;
                JuspayLogger.log(string2, string4, (String)object);
                try {
                    string4 = new JSONObject((String)object);
                    boolean bl2 = string4.has(string3);
                    if (bl2) break block2;
                    long l2 = System.currentTimeMillis();
                    string4.put(string3, l2);
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            object = bootLogs;
            object.add(string4);
            return;
        }
        string3 = "addToBootLogs";
        JuspayLogger.e(string2, string3, exception2);
    }

    private static /* synthetic */ void lambda$new$0() {
        ExecutorManager.setTrackerThreadId(Thread.currentThread().getId());
    }

    private /* synthetic */ void lambda$setEndPointSandbox$18(Boolean bl2) {
        LogManager logManager = this.juspayServices.getLogManager();
        boolean bl3 = bl2;
        logManager.setEndPointSandbox(bl3);
    }

    private /* synthetic */ void lambda$track$17(JSONObject jSONObject) {
        Object object = "label";
        String string2 = "";
        object = jSONObject.optString((String)object, string2);
        boolean bl2 = this.shouldDropLog((String)object);
        if (bl2) {
            return;
        }
        object = "at";
        long l2 = System.currentTimeMillis();
        jSONObject.put((String)object, l2);
        try {
            this.trackParsed(jSONObject);
        }
        catch (JSONException jSONException) {
            String string3 = "log_pusher";
            String string4 = "Exception while parsing the JSON";
            string2 = "action";
            String string5 = "system";
            object = this;
            this.trackException(string2, string5, string3, string4, jSONException);
        }
    }

    private /* synthetic */ void lambda$trackAction$8(String string2, String object, String string3, String string4, Object object2) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string5 = "action";
        string2 = SdkTracker.createLog(string5, (String)object, string3, string2, string4, object2);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackAndLogApiException$16(String string2, String string3, Throwable throwable, String string4, String string5, String string6, Long l2, Long l3, Object object, String string7, String string8, JSONArray jSONArray, JSONObject jSONObject) {
        JuspayLogger.e(string2, string3, throwable);
        boolean bl2 = this.shouldDropLog(string4);
        if (bl2) {
            return;
        }
        this.trackPhoneState();
        SdkTracker sdkTracker = this;
        Object object2 = string5;
        sdkTracker = this.createApiExceptionLog(string5, string6, string4, l2, l3, object, string7, string8, string3, throwable, jSONArray, jSONObject);
        object2 = this.juspayServices.getSessionInfo().getSessionId();
        if (object2 != null) {
            this.trackParsed((JSONObject)sdkTracker);
        } else {
            object2 = bootLogs;
            object2.add(sdkTracker);
        }
    }

    private static /* synthetic */ void lambda$trackAndLogBootException$5(String string2, String string3, Throwable throwable, String string4, String string5, String string6) {
        JuspayLogger.e(string2, string3, throwable);
        string2 = SdkTracker.createExceptionLog(string4, string5, string6, string3, throwable);
        bootLogs.add(string2);
    }

    private /* synthetic */ void lambda$trackAndLogException$15(String string2, String object, String string3, Throwable throwable, String string4, String string5) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        JuspayLogger.e((String)object, string3, throwable);
        this.trackPhoneState();
        string2 = SdkTracker.createExceptionLog(string4, string5, string2, string3, throwable);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackApiCalls$10(String string2, String string3, String string4, Integer n3, String string5, String string6, long l2, Long l3, Object object, Object object2, String string7, JSONArray jSONArray, JSONObject jSONObject) {
        Long l4 = l2;
        String string8 = string2;
        Object object3 = string3;
        string8 = SdkTracker.createApiLog(string2, string3, string4, n3, string5, string6, l4, l3, object, object2, string7, jSONArray, jSONObject);
        object3 = this.juspayServices.getSessionInfo().getSessionId();
        if (object3 != null) {
            this.trackParsed((JSONObject)string8);
        } else {
            object3 = bootLogs;
            object3.add(string8);
        }
    }

    private /* synthetic */ void lambda$trackApiCalls$9(String string2, String string3, String string4, Integer n3, String string5, Long l2, Long l3, Object object, Object object2, String string6) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string7 = string3;
        Object object3 = string4;
        string7 = SdkTracker.createApiLog(string3, string4, string2, n3, string5, l2, l3, object, object2, string6);
        object3 = this.juspayServices.getSessionInfo().getSessionId();
        if (object3 != null) {
            this.trackParsed((JSONObject)string7);
        } else {
            object3 = bootLogs;
            object3.add(string7);
        }
    }

    private static /* synthetic */ void lambda$trackBootAction$3(String string2, String string3, String string4, String string5, Object object) {
        string2 = SdkTracker.createLog("action", string2, string3, string4, string5, object);
        bootLogs.add(string2);
    }

    private static /* synthetic */ void lambda$trackBootException$4(String string2, String string3, String string4, String string5, Throwable throwable) {
        string2 = SdkTracker.createExceptionLog(string2, string3, string4, string5, throwable);
        bootLogs.add(string2);
    }

    private static /* synthetic */ void lambda$trackBootLifecycle$2(String string2, String string3, String string4, String string5, Object object) {
        string2 = SdkTracker.createLog("lifecycle", string2, string3, string4, string5, object);
        bootLogs.add(string2);
    }

    private /* synthetic */ void lambda$trackContext$11(String string2, String object, String string3, String string4, Object object2) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string5 = "context";
        string2 = SdkTracker.createLog(string5, (String)object, string3, string2, string4, object2);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackContext$12(String string2, String object, String string3, Object object2) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string4 = "context";
        string2 = SdkTracker.createLogWithValue(string4, (String)object, string3, string2, object2);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackException$13(String string2, String object, String string3, String string4, Throwable throwable) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        string2 = SdkTracker.createExceptionLog((String)object, string3, string2, string4, throwable);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackLifecycle$6(String string2, String object, String string3, String string4, Object object2) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string5 = "lifecycle";
        string2 = SdkTracker.createLog(string5, (String)object, string3, string2, string4, object2);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    private /* synthetic */ void lambda$trackLifecycle$7(String string2, String object, String string3, JSONObject jSONObject) {
        boolean bl2 = this.shouldDropLog(string2);
        if (bl2) {
            return;
        }
        String string4 = "lifecycle";
        string2 = SdkTracker.createLogWithValue(string4, (String)object, string3, string2, jSONObject);
        object = this.juspayServices.getSessionInfo().getSessionId();
        if (object != null) {
            this.trackParsed((JSONObject)string2);
        } else {
            object = bootLogs;
            object.add(string2);
        }
    }

    public static /* synthetic */ void m(SdkTracker sdkTracker, JSONObject jSONObject) {
        sdkTracker.lambda$track$17(jSONObject);
    }

    public static /* synthetic */ void n(String string2, String string3, String string4, String string5, Object object) {
        SdkTracker.lambda$trackBootLifecycle$2(string2, string3, string4, string5, object);
    }

    public static /* synthetic */ void o(String string2, String string3, Throwable throwable, String string4, String string5, String string6) {
        SdkTracker.lambda$trackAndLogBootException$5(string2, string3, throwable, string4, string5, string6);
    }

    public static /* synthetic */ void p(SdkTracker sdkTracker, String string2, String string3, Throwable throwable, String string4, String string5, String string6, Long l2, Long l3, Object object, String string7, String string8, JSONArray jSONArray, JSONObject jSONObject) {
        sdkTracker.lambda$trackAndLogApiException$16(string2, string3, throwable, string4, string5, string6, l2, l3, object, string7, string8, jSONArray, jSONObject);
    }

    private void processBootLogs() {
        Queue queue;
        boolean bl2;
        while (!(bl2 = (queue = bootLogs).isEmpty())) {
            if ((queue = (JSONObject)queue.poll()) == null) continue;
            Object object = "label";
            Object object2 = "";
            object = queue.optString((String)object, (String)object2);
            bl2 = this.shouldDropLog((String)object);
            if (bl2) continue;
            this.signLog((JSONObject)queue);
            object = this.juspayServices;
            object = ((JuspayServices)object).getLogManager();
            object2 = this.juspayServices;
            object2 = ((JuspayServices)object2).getSessionInfo();
            object2 = ((SessionInfo)object2).getSessionId();
            try {
                ((LogManager)object).addLogLine((String)object2, (JSONObject)queue);
            }
            catch (Exception exception) {
                String string2 = "log_pusher";
                String string3 = "Exception while signing log line";
                object2 = "action";
                String string4 = "system";
                object = this;
                this.trackException((String)object2, string4, string2, string3, exception);
            }
        }
    }

    public static /* synthetic */ void q(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Throwable throwable) {
        sdkTracker.lambda$trackException$13(string2, string3, string4, string5, throwable);
    }

    public static /* synthetic */ void r(String string2, String string3, String string4, String string5, Throwable throwable) {
        SdkTracker.lambda$trackBootException$4(string2, string3, string4, string5, throwable);
    }

    public static /* synthetic */ void s(SdkTracker sdkTracker, String string2, String string3, String string4, Throwable throwable, String string5, String string6) {
        sdkTracker.lambda$trackAndLogException$15(string2, string3, string4, throwable, string5, string6);
    }

    private boolean shouldDropLog(String string2) {
        return this.labelsToDrop.contains(string2);
    }

    private void signLog(JSONObject jSONObject) {
        boolean bl2;
        int n3;
        Object object;
        String string2;
        Object object2 = this.juspayServices.getSessionInfo();
        Object object3 = "session_id";
        boolean bl3 = jSONObject.has((String)object3);
        if (!bl3) {
            string2 = ((SessionInfo)object2).getSessionId();
            jSONObject.put((String)object3, (Object)string2);
        }
        object3 = ((SessionInfo)object2).getClientId();
        string2 = "client_id";
        int n4 = jSONObject.has(string2);
        if (n4 == 0 && (n4 = ((String)object3).isEmpty()) == 0 && (n4 = ((String[])(object3 = ((String)object3).split((String)(object = "_"), n3 = 2))).length) > 0) {
            n4 = 0;
            object3 = object3[0];
            object = Locale.getDefault();
            object3 = ((String)object3).toLowerCase((Locale)object);
            jSONObject.put(string2, object3);
        }
        if (!(bl3 = ((String)(object3 = ((SessionInfo)object2).getMerchantId())).isEmpty()) && (n4 = jSONObject.has(string2 = "merchant_id")) == 0) {
            jSONObject.put(string2, object3);
        }
        if (!(bl3 = ((String)(object3 = ((SessionInfo)object2).getOrderId())).isEmpty()) && (n4 = (int)(jSONObject.has(string2 = "order_id") ? 1 : 0)) == 0) {
            jSONObject.put(string2, object3);
        }
        if (!(bl3 = jSONObject.has((String)(object3 = "package_name")))) {
            object2 = ((SessionInfo)object2).getPackageName();
            jSONObject.put((String)object3, object2);
        }
        if (!(bl2 = jSONObject.has((String)(object2 = "log_version")))) {
            object3 = "2.0.1";
            jSONObject.put((String)object2, object3);
        }
        int n7 = this.serialNumberCounter.getAndIncrement();
        object3 = "sn";
        jSONObject.put((String)object3, n7);
        object2 = "hyper_sdk_version";
        bl2 = jSONObject.has((String)object2);
        if (!bl2) {
            object3 = this.hyperSdkVersion;
            jSONObject.put((String)object2, object3);
        }
        if (!(bl2 = jSONObject.has((String)(object2 = "godel_version")))) {
            object3 = this.godelVersion;
            jSONObject.put((String)object2, object3);
        }
        if (!(bl2 = jSONObject.has((String)(object2 = "godel_build_version")))) {
            object3 = this.godelBuildVersion;
            jSONObject.put((String)object2, object3);
        }
        object2 = this.logProperties.keys();
        while (bl2 = object2.hasNext()) {
            object3 = (String)object2.next();
            string2 = this.logProperties.optString((String)object3);
            jSONObject.put((String)object3, (Object)string2);
        }
    }

    public static void trackAndLogBootException(String string2, String string3, String string4, String string5, String string6, Throwable throwable) {
        du2_2 du2_22 = new du2_2(string2, string6, throwable, string3, string4, string5);
        ExecutorManager.runOnSdkTrackerPool(du2_22);
    }

    public static void trackBootAction(String string2, String string3, String string4, String string5, Object object) {
        zu2_2 zu2_22 = new zu2_2(string2, string3, string4, string5, object);
        ExecutorManager.runOnSdkTrackerPool(zu2_22);
    }

    public static void trackBootException(String string2, String string3, String string4, String string5, Throwable throwable) {
        bu2_2 bu2_22 = new bu2_2(string2, string3, string4, string5, throwable);
        ExecutorManager.runOnSdkTrackerPool(bu2_22);
    }

    public static void trackBootLifecycle(String string2, String string3, String string4, String string5, Object object) {
        tu2_2 tu2_22 = new tu2_2(string2, string3, string4, string5, object);
        ExecutorManager.runOnSdkTrackerPool(tu2_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void trackParsed(JSONObject object) {
        Exception exception2;
        block3: {
            Object object2;
            try {
                object2 = this.juspayServices;
                object2 = ((JuspayServices)object2).getLogManager();
                object2 = ((LogManager)object2).logConfig;
                boolean bl2 = ((LogConfig)object2).shouldPush;
                if (!bl2) {
                    object = bootLogs;
                    object.clear();
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            this.truncateLog((JSONObject)object);
            this.signLog((JSONObject)object);
            object2 = this.juspayServices;
            object2 = ((JuspayServices)object2).getLogManager();
            Object object3 = this.juspayServices;
            object3 = ((JuspayServices)object3).getSessionInfo();
            object3 = ((SessionInfo)object3).getSessionId();
            ((LogManager)object2).addLogLine((String)object3, (JSONObject)object);
            this.processBootLogs();
            return;
        }
        String string2 = "log_pusher";
        String string3 = "Exception while signing log line";
        String string4 = "action";
        String string5 = "system";
        SdkTracker sdkTracker = this;
        this.trackException(string4, string5, string2, string3, exception2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void trackPhoneState() {
        String string2;
        Object object;
        Object object2;
        JSONObject jSONObject;
        block23: {
            try {
                jSONObject = new JSONObject();
                object2 = this.juspayServices;
            }
            catch (Exception exception) {
                return;
            }
            object2 = ((JuspayServices)object2).getSessionInfo();
            object = this.juspayServices;
            object = ((JuspayServices)object).getContext();
            object = Utils.getMemoryInfo((Context)object);
            if (object == null) break block23;
            string2 = "available_memory";
            long l2 = ((ActivityManager.MemoryInfo)object).availMem;
            jSONObject.put(string2, l2);
            string2 = "threshold_memory";
            l2 = ((ActivityManager.MemoryInfo)object).threshold;
            jSONObject.put(string2, l2);
            string2 = "total_memory";
            l2 = ((ActivityManager.MemoryInfo)object).totalMem;
            jSONObject.put(string2, l2);
        }
        object = "network_info";
        string2 = ((SessionInfo)object2).getNetworkInfo();
        jSONObject.put((String)object, (Object)string2);
        object = "network_type";
        int n3 = ((SessionInfo)object2).getNetworkType();
        object2 = String.valueOf(n3);
        jSONObject.put((String)object, object2);
        object2 = "ip_address";
        object = this.juspayServices;
        object = Utils.getIPAddress((JuspayServices)object);
        jSONObject.put((String)object2, object);
        object2 = "device";
        object = "info";
        string2 = "phone_state";
        this.trackContext((String)object2, (String)object, string2, jSONObject);
    }

    private void truncateLog(JSONObject jSONObject) {
        boolean bl2;
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = jSONObject.get(string2);
            int n3 = object instanceof String;
            if (n3 != 0) {
                int n4;
                n3 = ((String)(object = (String)object)).length();
                if (n3 <= (n4 = 22528)) continue;
                n3 = 0;
                object = ((String)object).substring(0, n4);
                jSONObject.put(string2, object);
                continue;
            }
            bl2 = object instanceof JSONObject;
            if (!bl2) continue;
            object = (JSONObject)object;
            this.truncateLog((JSONObject)object);
        }
    }

    public void addLogProperties(JSONObject jSONObject) {
        block25: {
            Iterator iterator;
            Object object = this.juspayServices;
            object = ((JuspayServices)object).getLogManager();
            object = ((LogManager)object).logConfig;
            object = ((LogConfig)object).logProperties;
            try {
                iterator = object.keys();
            }
            catch (Exception exception) {}
            while (true) {
                boolean bl2 = iterator.hasNext();
                if (!bl2) break block25;
                break;
            }
            {
                Object object2 = iterator.next();
                object2 = (String)object2;
                String string2 = object.getString(object2);
                int n3 = 36;
                n3 = string2.indexOf(n3);
                int n4 = 123;
                n4 = string2.indexOf(n4);
                int n7 = 125;
                n7 = string2.lastIndexOf(n7);
                int n8 = -1;
                if (n3 == n8 || n4 == n8 || n7 == n8 || (n3 = n4 - n3) != (n8 = 1) || n4 >= n7) continue;
                ++n4;
                String string3 = string2.substring(n4, n7);
                n4 = (int)(jSONObject.has(string3) ? 1 : 0);
                if (n4 == 0) continue;
                CharSequence charSequence = new StringBuilder();
                String string4 = "${";
                charSequence.append(string4);
                charSequence.append(string3);
                string4 = "}";
                charSequence.append(string4);
                charSequence = charSequence.toString();
                string4 = this.logProperties;
                string3 = jSONObject.optString(string3);
                string2 = string2.replace(charSequence, string3);
                string4.put(object2, (Object)string2);
                continue;
            }
        }
    }

    public void addLogToPersistedQueue(JSONObject jSONObject) {
        ru2_2 ru2_22 = new ru2_2(this, jSONObject);
        ExecutorManager.runOnSdkTrackerPool(ru2_22);
    }

    public JSONObject getExceptionLog(String string2, String string3, String string4, String string5, Throwable throwable) {
        boolean bl2 = true;
        string2 = SdkTracker.createExceptionLog(string2, string3, string4, string5, throwable, bl2);
        try {
            this.signLog((JSONObject)string2);
        }
        catch (Exception exception) {
            string4 = LOG_TAG;
            string5 = "getExceptionLog failed";
            JuspayLogger.e(string4, string5, exception);
        }
        return string2;
    }

    public void resetSerialNumber() {
        AtomicInteger atomicInteger;
        this.serialNumberCounter = atomicInteger = new AtomicInteger(1);
    }

    public void setEndPointSandbox(Boolean bl2) {
        vu2_1 vu2_12 = new vu2_1(0, this, bl2);
        ExecutorManager.runOnLogSessioniserThread(vu2_12);
    }

    public void setLabelsToDrop(JSONObject jSONObject) {
        block7: {
            int n3;
            String string2 = "labelsToDrop";
            try {
                jSONObject = jSONObject.getJSONArray(string2);
                n3 = 0;
                string2 = null;
            }
            catch (Exception exception) {}
            while (true) {
                int n4 = jSONObject.length();
                if (n3 >= n4) break block7;
                break;
            }
            {
                HashSet hashSet = this.labelsToDrop;
                String string3 = jSONObject.getString(n3);
                hashSet.add(string3);
                ++n3;
                continue;
            }
        }
    }

    public void track(JSONObject jSONObject) {
        uu2_1 uu2_12 = new uu2_1(this, jSONObject);
        ExecutorManager.runOnSdkTrackerPool(uu2_12);
    }

    public void trackAction(String string2, String string3, String string4, String string5, Object object) {
        ou2_2 ou2_22 = new ou2_2(this, string4, string2, string3, string5, object);
        ExecutorManager.runOnSdkTrackerPool(ou2_22);
    }

    public void trackAndLogApiException(String string2, String string3, String string4, String string5, Long l2, Long l3, Object object, String string6, String string7, String string8, Throwable throwable, JSONArray jSONArray, JSONObject jSONObject) {
        au2_2 au2_22 = new au2_2(this, string2, string8, throwable, string5, string3, string4, l2, l3, object, string6, string7, jSONArray, jSONObject);
        ExecutorManager.runOnSdkTrackerPool(au2_22);
    }

    public void trackAndLogException(String string2, String string3, String string4, String string5, String string6, Throwable throwable) {
        su2_2 su2_22 = new su2_2(this, string5, string2, string6, throwable, string3, string4);
        ExecutorManager.runOnSdkTrackerPool(su2_22);
    }

    public void trackApiCalls(String string2, String string3, String string4, Integer n3, String string5, Long l2, Long l3, Object object, Object object2, String string6) {
        xu2_1 xu2_12 = new xu2_1(this, string4, string2, string3, n3, string5, l2, l3, object, object2, string6);
        ExecutorManager.runOnSdkTrackerPool(xu2_12);
    }

    public void trackApiCalls(String string2, String string3, String string4, Integer n3, String string5, String string6, long l2, Long l3, Object object, Object object2, String string7, JSONArray jSONArray, JSONObject jSONObject) {
        yu2_1 yu2_12 = new yu2_1(this, string2, string3, string4, n3, string5, string6, l2, l3, object, object2, string7, jSONArray, jSONObject);
        ExecutorManager.runOnSdkTrackerPool(yu2_12);
    }

    public void trackContext(String string2, String string3, String string4, Object object) {
        eu2_2 eu2_22 = new eu2_2(this, string4, string2, string3, object);
        ExecutorManager.runOnSdkTrackerPool(eu2_22);
    }

    public void trackContext(String string2, String string3, String string4, String string5, Object object) {
        pu2_2 pu2_22 = new pu2_2(this, string4, string2, string3, string5, object);
        ExecutorManager.runOnSdkTrackerPool(pu2_22);
    }

    public void trackException(String string2, String string3, String string4, String string5, Throwable throwable) {
        wu2_1 wu2_12 = new wu2_1(this, string4, string2, string3, string5, throwable);
        ExecutorManager.runOnSdkTrackerPool(wu2_12);
    }

    public void trackLifecycle(String string2, String string3, String string4, String string5, Object object) {
        nu2_2 nu2_22 = new nu2_2(this, string4, string2, string3, string5, object);
        ExecutorManager.runOnSdkTrackerPool(nu2_22);
    }

    public void trackLifecycle(String string2, String string3, String string4, JSONObject jSONObject) {
        cu2_2 cu2_22 = new cu2_2(this, string4, string2, string3, jSONObject);
        ExecutorManager.runOnSdkTrackerPool(cu2_22);
    }
}

