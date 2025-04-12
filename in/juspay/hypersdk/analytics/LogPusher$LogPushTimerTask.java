/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogChannel;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusher$1;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.analytics.a;
import in.juspay.hypersdk.analytics.b;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class LogPusher$LogPushTimerTask
extends TimerTask {
    private static final String TAG = "LogPushTimerTask";
    private final Map channels;
    private int getLogsToPushErrorCounter;
    private boolean isExceptionTracked = false;
    private final LogConfig logConfig;
    private final AtomicInteger logPushIteration;
    private int logPushTimerTaskErrorCounter;
    final /* synthetic */ LogPusher this$0;
    private final Workspace workspace;

    private LogPusher$LogPushTimerTask(LogPusher logPusher, Workspace workspace, LogConfig logConfig, Map map2) {
        AtomicInteger atomicInteger;
        this.this$0 = logPusher;
        this.logPushIteration = atomicInteger = new AtomicInteger(1);
        this.getLogsToPushErrorCounter = 0;
        this.logPushTimerTaskErrorCounter = 0;
        this.workspace = workspace;
        this.logConfig = logConfig;
        this.channels = map2;
    }

    public /* synthetic */ LogPusher$LogPushTimerTask(LogPusher logPusher, Workspace workspace, LogConfig logConfig, Map map2, LogPusher$1 logPusher$1) {
        this(logPusher, workspace, logConfig, map2);
    }

    public static /* synthetic */ void a(LogPusher$LogPushTimerTask logPusher$LogPushTimerTask) {
        logPusher$LogPushTimerTask.lambda$run$1();
    }

    private void acknowledgeLogsPushed(int n3, LogChannel object) {
        while (n3 > 0) {
            try {
                ((LogChannel)object).pollLogsQueue();
                n3 += -1;
            }
            catch (Exception exception) {
                n3 = this.logPushTimerTaskErrorCounter = (n3 = this.logPushTimerTaskErrorCounter + 1);
                int n4 = 2;
                if (n3 <= n4) {
                    String string2 = "log_pusher";
                    String string3 = "Exception in removal of logs from persisted Queue file";
                    String string4 = TAG;
                    String string5 = "action";
                    String string6 = "system";
                    SdkTracker.trackAndLogBootException(string4, string5, string6, string2, string3, exception);
                    break;
                }
                String string7 = TAG;
                object = "Exception in removal of logs from persisted Queue file";
                JuspayLogger.e(string7, (String)object, exception);
                break;
            }
        }
    }

    public static /* synthetic */ void b(LogPusher$LogPushTimerTask logPusher$LogPushTimerTask) {
        logPusher$LogPushTimerTask.lambda$pushAllLogs$0();
    }

    private JSONArray getLogsToPush(LogChannel logChannel) {
        int n3;
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = logChannel.getLogsQueue().iterator();
        while (((l8 = (l7 = (l4 = logChannel.getBatchCount()) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false || (l8 = (l2 = (l4 = (long)(n3 = jSONArray.length())) - (l3 = logChannel.getBatchCount())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) && (n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = iterator.next();
            object = (byte[])object;
            String string2 = new String((byte[])object);
            Object object2 = new JSONObject(string2);
            try {
                jSONArray.put(object2);
            }
            catch (JSONException jSONException) {
                JSONException jSONException2 = jSONException;
                iterator.remove();
                this.getLogsToPushErrorCounter = n3 = this.getLogsToPushErrorCounter + 1;
                int n4 = 2;
                if (n3 <= n4) {
                    String string3 = "log_pusher";
                    String string4 = "Bad JSON while reading the Persisted Queue for Logs";
                    string2 = TAG;
                    object = "action";
                    String string5 = "system";
                    SdkTracker.trackAndLogBootException(string2, object, string5, string3, string4, jSONException);
                    continue;
                }
                object2 = TAG;
                string2 = "Bad JSON while reading the Persisted Queue for Logs";
                JuspayLogger.e((String)object2, string2, jSONException2);
            }
        }
        return jSONArray;
    }

    private /* synthetic */ void lambda$pushAllLogs$0() {
        boolean bl2;
        Iterator iterator = this.channels.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            LogChannel logChannel = (LogChannel)object.getValue();
            object = (String)object.getKey();
            this.pushAllLogsUtil(logChannel, (String)object);
        }
    }

    private /* synthetic */ void lambda$run$1() {
        int n3;
        Object object = this.logConfig;
        boolean bl2 = ((LogConfig)object).shouldPush;
        if (bl2 && (n3 = ((Boolean)(object = LogUtils.isMinMemoryAvailable((LogConfig)object))).booleanValue()) != 0) {
            boolean bl3;
            object = this.logPushIteration;
            n3 = ((AtomicInteger)object).getAndIncrement();
            Iterator iterator = this.channels.entrySet().iterator();
            while (bl3 = iterator.hasNext()) {
                Object object2 = iterator.next();
                LogChannel logChannel = (LogChannel)object2.getValue();
                object2 = (String)object2.getKey();
                int n4 = logChannel.getPriority();
                if ((n4 = n3 % n4) != 0) continue;
                this.pushAllLogsUtil(logChannel, (String)object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void pushAllLogsUtil(LogChannel logChannel, String string2) {
        int n3;
        String string3;
        String string4;
        int n4;
        Object object;
        Object object2;
        Object object3;
        String string5;
        String string6;
        Object object4;
        LogPusher$LogPushTimerTask logPusher$LogPushTimerTask;
        block10: {
            Exception exception3;
            int n7;
            Object object5;
            int n8;
            int n10;
            int n14;
            String string7;
            block12: {
                logPusher$LogPushTimerTask = this;
                object4 = logChannel;
                string6 = string2;
                string5 = "PERSISTENT_LOGS_READING_FILE";
                string7 = kp1_0.c(string5, string2);
                object3 = this.workspace;
                n14 = LogUtils.getFromSharedPreference(string7, (Workspace)object3);
                object3 = "PERSISTENT_LOGS_WRITING_FILE";
                object2 = kp1_0.c((String)object3, string2);
                object = this.workspace;
                n4 = LogUtils.getFromSharedPreference((String)object2, (Workspace)object);
                object = JuspayCoreLib.getApplicationContext();
                string4 = ".dat";
                string3 = "juspay-logs-queue-";
                n10 = 1;
                if (object == null) break block12;
                n8 = n4 - n14 + n10;
                object5 = this.logConfig;
                n7 = ((LogConfig)object5).maxFilesAllowed;
                if (n8 <= n7) break block12;
                while (true) {
                    block9: {
                        block13: {
                            n8 = n4 - n14 + n10;
                            object5 = logPusher$LogPushTimerTask.logConfig;
                            n7 = ((LogConfig)object5).numFilesToLeaveIfMaxFilesExceeded;
                            if (n8 <= n7) break block13;
                            object = logPusher$LogPushTimerTask.workspace;
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(string6);
                            ((StringBuilder)object5).append(n14);
                            ((StringBuilder)object5).append(string4);
                            object5 = ((StringBuilder)object5).toString();
                            object = ((Workspace)object).openInCache((String)object5);
                            if (object == null) break block9;
                            try {
                                ((File)object).delete();
                                break block9;
                            }
                            catch (Exception exception2) {}
                        }
                        object2 = logPusher$LogPushTimerTask.workspace;
                        object = kp1_0.c(string5, string6);
                        string7 = String.valueOf(n14);
                        ((Workspace)object2).writeToSharedPreference((String)object, string7);
                        break;
                    }
                    ++n14;
                }
            }
            while (true) {
                block11: {
                    n14 = 0;
                    string7 = null;
                    try {
                        int n15;
                        object2 = logChannel.getLogsQueue();
                        n4 = (int)(((ConcurrentLinkedQueue)object2).isEmpty() ? 1 : 0);
                        if (n4 != 0) break block10;
                        object2 = this.getLogsToPush(logChannel);
                        n8 = object2.length();
                        if (n8 <= 0) continue;
                        object = logPusher$LogPushTimerTask.this$0;
                        n8 = LogPusher.access$100((LogPusher)object, (JSONArray)object2, (LogChannel)object4);
                        if (n8 == (n7 = 200) || (n7 = logChannel.getRetryAttempts()) != (n15 = -1) && (n7 = logChannel.getCurrentBatchRetryAttempts()) >= (n15 = logChannel.getRetryAttempts())) break block11;
                    }
                    catch (Exception exception3) {
                        break;
                    }
                    object2 = "system";
                    object5 = "error";
                    String string8 = "log_pusher";
                    String string9 = "error_response";
                    StringBuilder stringBuilder = new StringBuilder();
                    String string10 = "";
                    stringBuilder.append(string10);
                    stringBuilder.append(n8);
                    object = stringBuilder.toString();
                    SdkTracker.trackBootAction((String)object2, (String)object5, string8, string9, object);
                    n4 = logChannel.getCurrentBatchRetryAttempts() + n10;
                    ((LogChannel)object4).setCurrentBatchRetryAttempts(n4);
                    return;
                }
                ((LogChannel)object4).setCurrentBatchRetryAttempts(0);
                n4 = object2.length();
                logPusher$LogPushTimerTask.acknowledgeLogsPushed(n4, (LogChannel)object4);
            }
            n3 = logPusher$LogPushTimerTask.isExceptionTracked;
            if (n3 == 0) {
                String string11 = "log_pusher";
                String string12 = "Error while creating the payload to post";
                object5 = TAG;
                String string13 = "action";
                String string14 = "system";
                SdkTracker.trackAndLogBootException((String)object5, string13, string14, string11, string12, exception3);
            }
            logPusher$LogPushTimerTask.isExceptionTracked = n10;
        }
        object4 = kp1_0.c(string5, string6);
        object2 = logPusher$LogPushTimerTask.workspace;
        n3 = LogUtils.getFromSharedPreference((String)object4, (Workspace)object2);
        object2 = kp1_0.c((String)object3, string6);
        object = logPusher$LogPushTimerTask.workspace;
        n4 = LogUtils.getFromSharedPreference((String)object2, (Workspace)object);
        object = JuspayCoreLib.getApplicationContext();
        if (object != null) {
            while (n3 <= n4) {
                object = logPusher$LogPushTimerTask.workspace;
                CharSequence charSequence = new StringBuilder(string3);
                charSequence.append(string6);
                charSequence.append(n3);
                charSequence.append(string4);
                charSequence = charSequence.toString();
                object = ((Workspace)object).openInCache((String)charSequence);
                ((File)object).delete();
                ++n3;
            }
        }
        object4 = logPusher$LogPushTimerTask.workspace;
        string5 = kp1_0.c(string5, string6);
        object2 = String.valueOf(0);
        ((Workspace)object4).writeToSharedPreference(string5, (String)object2);
        object4 = logPusher$LogPushTimerTask.workspace;
        string6 = kp1_0.c((String)object3, string6);
        string5 = String.valueOf(0);
        ((Workspace)object4).writeToSharedPreference(string6, string5);
    }

    public void pushAllLogs() {
        b b2 = new b(this);
        ExecutorManager.runOnLogsPool(b2);
    }

    public void run() {
        a a2 = new a(this);
        ExecutorManager.runOnLogsPool(a2);
    }
}

