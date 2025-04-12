/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import android.content.Context;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogSessioniser$LogSessioniserTimerTask;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LogSessioniser {
    private final ArrayList activeRequestIDs;
    private final LogConfig logConfig;
    private final LogPusher logPusher;
    private JSONObject logs;
    private TimerTask moveToPusher;
    private Timer moveToPusherTimer;
    private JSONObject rawLogs;
    private boolean stopPushingLogs;
    private int timerModulus;
    private boolean timerStopped;
    private final Workspace workspace;

    public LogSessioniser(Workspace object, LogConfig logConfig, LogPusher logPusher) {
        Timer timer;
        Object object2;
        this.logs = object2 = new JSONObject();
        this.rawLogs = object2 = new JSONObject();
        this.activeRequestIDs = object2;
        this.timerModulus = 0;
        this.moveToPusherTimer = timer = new Timer();
        this.stopPushingLogs = false;
        this.timerStopped = false;
        this.workspace = object;
        this.logConfig = logConfig;
        this.logPusher = logPusher;
        object = new dx1_2(this);
        ExecutorManager.runOnLogsPool((Runnable)object);
    }

    public static /* synthetic */ void a(LogSessioniser logSessioniser, JSONObject jSONObject) {
        logSessioniser.lambda$sessioniseLogs$5(jSONObject);
    }

    public static /* synthetic */ LogConfig access$000(LogSessioniser logSessioniser) {
        return logSessioniser.logConfig;
    }

    public static /* synthetic */ int access$100(LogSessioniser logSessioniser) {
        return logSessioniser.timerModulus;
    }

    public static /* synthetic */ Timer access$1000(LogSessioniser logSessioniser) {
        return logSessioniser.moveToPusherTimer;
    }

    public static /* synthetic */ int access$104(LogSessioniser logSessioniser) {
        int n3;
        logSessioniser.timerModulus = n3 = logSessioniser.timerModulus + 1;
        return n3;
    }

    public static /* synthetic */ boolean access$1102(LogSessioniser logSessioniser, boolean bl2) {
        logSessioniser.timerStopped = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$144(LogSessioniser logSessioniser, int n3) {
        int n4;
        logSessioniser.timerModulus = n4 = logSessioniser.timerModulus % n3;
        return n4;
    }

    public static /* synthetic */ void access$200(LogSessioniser logSessioniser, String string2, String string3, String string4, String string5) {
        logSessioniser.deleteOldFileIfNecessary(string2, string3, string4, string5);
    }

    public static /* synthetic */ ArrayList access$300(LogSessioniser logSessioniser) {
        return logSessioniser.activeRequestIDs;
    }

    public static /* synthetic */ JSONObject access$400(LogSessioniser logSessioniser) {
        return logSessioniser.logs;
    }

    public static /* synthetic */ JSONObject access$402(LogSessioniser logSessioniser, JSONObject jSONObject) {
        logSessioniser.logs = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean access$500(LogSessioniser logSessioniser, JSONObject jSONObject) {
        return logSessioniser.pushLogsFromJsonToPusher(jSONObject);
    }

    public static /* synthetic */ Workspace access$600(LogSessioniser logSessioniser) {
        return logSessioniser.workspace;
    }

    public static /* synthetic */ void access$700(LogSessioniser logSessioniser, String string2, String string3, int n3, int n4) {
        logSessioniser.clearAllLogFiles(string2, string3, n3, n4);
    }

    public static /* synthetic */ JSONObject access$800(LogSessioniser logSessioniser) {
        return logSessioniser.rawLogs;
    }

    public static /* synthetic */ JSONObject access$802(LogSessioniser logSessioniser, JSONObject jSONObject) {
        logSessioniser.rawLogs = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void access$900(LogSessioniser logSessioniser, JSONObject jSONObject, String string2, String string3, String string4, int n3) {
        logSessioniser.pushJsonToFile(jSONObject, string2, string3, string4, n3);
    }

    public static /* synthetic */ void b(LogSessioniser logSessioniser) {
        logSessioniser.clearBacklog();
    }

    public static /* synthetic */ void c(LogSessioniser logSessioniser) {
        logSessioniser.lambda$startLogSessioniserOnLogCount$1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void clearAllLogFiles(String string2, String string3, int n3, int n4) {
        while (n3 <= n4) {
            try {
                Object object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(string3);
                object = ((StringBuilder)object).toString();
                Workspace workspace = this.workspace;
                object = workspace.openInCache((String)object);
                if (object != null) {
                    ((File)object).delete();
                }
            }
            catch (Exception exception) {}
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void clearBacklog() {
        Object object;
        String string2;
        Object object2;
        LogSessioniser logSessioniser = this;
        Object object3 = this.logConfig;
        int n3 = ((LogConfig)object3).shouldPush;
        if (n3 == 0) {
            return;
        }
        long l2 = Thread.currentThread().getId();
        ExecutorManager.setLogsThreadId(l2);
        object3 = this.workspace;
        String string3 = "LOGS_WRITING_FILE";
        n3 = LogUtils.getFromSharedPreference(string3, (Workspace)object3);
        Object object4 = this.workspace;
        String string4 = "LOGS_READING_FILE";
        int n4 = LogUtils.getFromSharedPreference(string4, (Workspace)object4);
        int n7 = -1;
        Object object5 = 0;
        Object object6 = null;
        if (n3 == n7) {
            object3 = this.workspace;
            object2 = String.valueOf(0);
            ((Workspace)object3).writeToSharedPreference(string3, (String)object2);
            n3 = 0;
            object3 = null;
        }
        if (n4 == n7) {
            object4 = logSessioniser.workspace;
            object2 = String.valueOf(0);
            ((Workspace)object4).writeToSharedPreference(string4, (String)object2);
            n4 = 0;
            object4 = null;
        }
        object2 = logSessioniser.workspace;
        Object object7 = "TEMP_LOGS_WRITING_FILE";
        int n8 = LogUtils.getFromSharedPreference((String)object7, (Workspace)object2);
        Object object8 = logSessioniser.workspace;
        String string5 = "TEMP_LOGS_READING_FILE";
        int n10 = LogUtils.getFromSharedPreference(string5, (Workspace)object8);
        if (n8 == n7) {
            object2 = logSessioniser.workspace;
            string2 = String.valueOf(0);
            ((Workspace)object2).writeToSharedPreference((String)object7, string2);
            n8 = 0;
            object2 = null;
        }
        if (n10 == n7) {
            object = logSessioniser.workspace;
            object8 = String.valueOf(0);
            ((Workspace)object).writeToSharedPreference(string5, (String)object8);
            n10 = 0;
            object8 = null;
        }
        object = "juspay-pre-logs-queue-";
        string2 = ".dat";
        logSessioniser.deleteOldFileIfNecessary(string4, string3, (String)object, string2);
        String string6 = "temp-logs-queue-";
        logSessioniser.deleteOldFileIfNecessary(string5, (String)object7, string6, string2);
        while (true) {
            int n14;
            block17: {
                long l3;
                Object object9;
                Object object10;
                if (n10 > n8) break;
                try {
                    object10 = new StringBuilder();
                    ((StringBuilder)object10).append(string6);
                    ((StringBuilder)object10).append(n10);
                    ((StringBuilder)object10).append(string2);
                    object10 = ((StringBuilder)object10).toString();
                    object9 = JuspayCoreLib.getApplicationContext();
                    if (object9 == null) break block17;
                    Context context = JuspayCoreLib.getApplicationContext();
                    File file = context.getCacheDir();
                    object9 = new File(file, (String)object10);
                    l3 = ((File)object9).length();
                    object10 = logSessioniser.logConfig;
                    n14 = n8;
                }
                catch (Exception exception) {}
                try {
                    long l4 = ((LogConfig)object10).maxLogFileSize;
                    long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                    if (l7 <= 0 && (object5 = ((File)object9).exists()) != 0 && (object5 = LogUtils.isFileEligibleToPush((File)object9, (LogConfig)(object6 = logSessioniser.logConfig))) != 0) {
                        object6 = LogUtils.getLogsFromFile((File)object9);
                        object2 = logSessioniser.logPusher;
                        ((LogPusher)object2).addLogsFromSessioniser((Queue)object6);
                    }
                    ((File)object9).delete();
                }
                catch (Exception exception) {}
            }
            n14 = n8;
            ++n10;
            n8 = n14;
            object5 = 0;
            object6 = null;
        }
        object6 = logSessioniser.workspace;
        n8 = 0;
        object2 = null;
        object8 = String.valueOf(0);
        ((Workspace)object6).writeToSharedPreference(string5, (String)object8);
        object6 = logSessioniser.workspace;
        object8 = String.valueOf(0);
        ((Workspace)object6).writeToSharedPreference((String)object7, (String)object8);
        while (true) {
            if (n4 > n3) {
                object3 = logSessioniser.workspace;
                object = String.valueOf(0);
                ((Workspace)object3).writeToSharedPreference(string4, (String)object);
                object3 = logSessioniser.workspace;
                object4 = String.valueOf(0);
                ((Workspace)object3).writeToSharedPreference(string3, (String)object4);
                return;
            }
            try {
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object);
                ((StringBuilder)object6).append(n4);
                ((StringBuilder)object6).append(string2);
                object6 = ((StringBuilder)object6).toString();
                object2 = JuspayCoreLib.getApplicationContext();
                if (object2 != null) {
                    object7 = JuspayCoreLib.getApplicationContext();
                    object7 = object7.getCacheDir();
                    object2 = new File((File)object7, (String)object6);
                    long l8 = ((File)object2).length();
                    object6 = logSessioniser.logConfig;
                    long l12 = ((LogConfig)object6).maxLogFileSize;
                    long l14 = l8 - l12;
                    object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object5 <= 0 && (object5 = (Object)((File)object2).exists()) != 0 && (object5 = (Object)LogUtils.isFileEligibleToPush((File)object2, (LogConfig)(object6 = logSessioniser.logConfig))) != 0) {
                        object6 = LogUtils.getLogsFromFile((File)object2);
                        object7 = logSessioniser.logPusher;
                        ((LogPusher)object7).addLogsFromSessioniser((Queue)object6);
                    }
                    ((File)object2).delete();
                }
            }
            catch (Exception exception) {}
            ++n4;
        }
    }

    private static String constructErrorMessage(String string2, String string3) {
        return uc0_0.a("{\"requestId\":\"", string3, "\",\"error\":true,\"logs\":{},\"errorMessage\":\"", string2, "\"}");
    }

    public static /* synthetic */ void d(LogSessioniser logSessioniser) {
        logSessioniser.lambda$stopLogSessioniserOnTerminate$3();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void deleteOldFileIfNecessary(String string2, String object, String string3, String string4) {
        Workspace workspace = this.workspace;
        int n3 = LogUtils.getFromSharedPreference(string2, workspace);
        Object object2 = this.workspace;
        int n4 = LogUtils.getFromSharedPreference((String)object, (Workspace)object2);
        object2 = JuspayCoreLib.getApplicationContext();
        if (object2 == null) return;
        int n7 = n4 - n3 + 1;
        Object object3 = this.logConfig;
        int n8 = ((LogConfig)object3).maxFilesAllowed;
        if (n7 <= n8) return;
        while (true) {
            block3: {
                block4: {
                    n7 = n4 - n3 + 1;
                    object3 = this.logConfig;
                    n8 = ((LogConfig)object3).numFilesToLeaveIfMaxFilesExceeded;
                    if (n7 <= n8) break block4;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string3);
                    ((StringBuilder)object2).append(n3);
                    ((StringBuilder)object2).append(string4);
                    object2 = ((StringBuilder)object2).toString();
                    object3 = this.workspace;
                    object2 = ((Workspace)object3).openInCache((String)object2);
                    if (object2 == null) break block3;
                    try {
                        ((File)object2).delete();
                        break block3;
                    }
                    catch (Exception exception) {}
                }
                object = this.workspace;
                string3 = String.valueOf(n3);
                ((Workspace)object).writeToSharedPreference(string2, string3);
                return;
            }
            ++n3;
        }
    }

    public static /* synthetic */ void e(LogSessioniser logSessioniser, JSONObject jSONObject, String string2) {
        logSessioniser.lambda$addLogLine$4(jSONObject, string2);
    }

    public static /* synthetic */ void f(LogSessioniser logSessioniser) {
        logSessioniser.lambda$startLogSessioniser$0();
    }

    public static /* synthetic */ void g(LogSessioniser logSessioniser) {
        logSessioniser.lambda$pushLogsToPusher$2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addLogLine$4(JSONObject jSONObject, String string2) {
        String string3 = "value";
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(string3);
            String string4 = jSONObject2.toString();
            byte[] byArray = string4.getBytes();
            int n3 = byArray.length;
            long l2 = n3;
            LogConfig logConfig = this.logConfig;
            long l3 = logConfig.maxLogValueSize;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 > 0) {
                String string5 = "Filtered";
                jSONObject.put(string3, (Object)string5);
                string3 = "LogSessioniser";
                String string6 = "Filtering the value of log as the size of value is greater than 32 KB";
                JuspayLogger.i(string3, string6);
            }
            this.startLogSessioniserOnLogCount();
            string3 = this.rawLogs;
            boolean bl2 = string3.has(string2);
            if (!bl2) {
                string3 = new JSONArray();
                string3.put((Object)jSONObject);
                jSONObject = this.rawLogs;
                jSONObject.put(string2, (Object)string3);
                return;
            }
            string3 = this.rawLogs;
            string3.accumulate(string2, (Object)jSONObject);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$pushLogsToPusher$2() {
        String string2 = "LOGS_WRITING_FILE";
        Object object = "LOGS_READING_FILE";
        Object object2 = "TEMP_LOGS_WRITING_FILE";
        Object object3 = "TEMP_LOGS_READING_FILE";
        try {
            int n3;
            Object object4 = this.logs;
            int n4 = this.pushLogsFromJsonToPusher((JSONObject)object4);
            String string3 = ".dat";
            if (n4 != 0) {
                object4 = new JSONObject();
                this.logs = object4;
                object4 = this.workspace;
                n4 = LogUtils.getFromSharedPreference((String)object3, (Workspace)object4);
                Object object5 = this.workspace;
                int n7 = LogUtils.getFromSharedPreference((String)object2, (Workspace)object5);
                String string4 = "temp-logs-queue-";
                this.clearAllLogFiles(string4, string3, n4, n7);
                object4 = this.workspace;
                object5 = String.valueOf(0);
                ((Workspace)object4).writeToSharedPreference((String)object3, (String)object5);
                object3 = this.workspace;
                object4 = String.valueOf(0);
                ((Workspace)object3).writeToSharedPreference((String)object2, (String)object4);
            }
            if ((n3 = this.pushLogsFromJsonToPusher((JSONObject)(object2 = this.rawLogs))) == 0) return;
            object2 = new JSONObject();
            this.rawLogs = object2;
            object2 = this.workspace;
            n3 = LogUtils.getFromSharedPreference((String)object, (Workspace)object2);
            object3 = this.workspace;
            int n8 = LogUtils.getFromSharedPreference(string2, (Workspace)object3);
            object4 = "juspay-pre-logs-queue-";
            this.clearAllLogFiles((String)object4, string3, n3, n8);
            object2 = this.workspace;
            object3 = String.valueOf(0);
            ((Workspace)object2).writeToSharedPreference((String)object, (String)object3);
            object = this.workspace;
            object2 = String.valueOf(0);
            ((Workspace)object).writeToSharedPreference(string2, (String)object2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$sessioniseLogs$5(JSONObject jSONObject) {
        String string2 = "sessionId";
        try {
            string2 = jSONObject.getString(string2);
            Object object = "requestId";
            object = jSONObject.getString((String)object);
            Object object2 = "logs";
            jSONObject = jSONObject.getJSONArray((String)object2);
            object2 = this.activeRequestIDs;
            int n3 = ((ArrayList)object2).contains(object);
            if (n3 == 0) return;
            object = jSONObject.toString();
            object = ((String)object).getBytes();
            n3 = ((Object)object).length;
            long l2 = n3;
            LogConfig logConfig = this.logConfig;
            long l3 = logConfig.maxLogLineSize;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 > 0) return;
            this.startLogSessioniserOnLogCount();
            object = this.logs;
            object.put(string2, (Object)jSONObject);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$startLogSessioniser$0() {
        try {
            this.stopPushingLogs = false;
        }
        catch (Exception exception) {
            return;
        }
        Object object = new Timer();
        this.moveToPusherTimer = object;
        int n3 = 0;
        object = null;
        LogSessioniser$LogSessioniserTimerTask logSessioniser$LogSessioniserTimerTask = new LogSessioniser$LogSessioniserTimerTask(this, null);
        this.moveToPusher = logSessioniser$LogSessioniserTimerTask;
        Timer timer = this.moveToPusherTimer;
        object = this.logConfig;
        n3 = ((LogConfig)object).logSessioniseInterval;
        long l2 = n3;
        long l3 = 0L;
        timer.scheduleAtFixedRate((TimerTask)logSessioniser$LogSessioniserTimerTask, l3, l2);
        this.timerStopped = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$startLogSessioniserOnLogCount$1() {
        try {
            int n3 = this.timerStopped;
            if (n3 == 0) return;
            Object object = new Timer();
            this.moveToPusherTimer = object;
            n3 = 0;
            object = null;
            LogSessioniser$LogSessioniserTimerTask logSessioniser$LogSessioniserTimerTask = new LogSessioniser$LogSessioniserTimerTask(this, null);
            this.moveToPusher = logSessioniser$LogSessioniserTimerTask;
            Timer timer = this.moveToPusherTimer;
            object = this.logConfig;
            n3 = ((LogConfig)object).logSessioniseInterval;
            long l2 = n3;
            long l3 = 0L;
            timer.scheduleAtFixedRate((TimerTask)logSessioniser$LogSessioniserTimerTask, l3, l2);
            n3 = 0;
            object = null;
            this.timerStopped = false;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$stopLogSessioniserOnTerminate$3() {
        Timer timer;
        try {
            timer = this.moveToPusherTimer;
        }
        catch (Exception exception) {
            return;
        }
        timer.cancel();
        this.pushLogsToPusher();
        boolean bl2 = true;
        this.timerStopped = bl2;
        this.stopPushingLogs = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void pushJsonToFile(JSONObject var1_1, String var2_2, String var3_3, String var4_4, int var5_5) {
        var6_6 = this;
        var7_7 = var2_2;
        var8_8 = var3_3;
        var9_9 = var1_1.keys();
        var10_10 = this.workspace;
        var11_11 = new StringBuilder();
        var11_11.append(var2_2);
        var12_12 = var5_5;
        var11_11.append(var5_5);
        var11_11.append(var3_3);
        var11_11 = var11_11.toString();
        var10_10 = var10_10.openInCache((String)var11_11);
        var13_13 = true;
        var11_11 = new FileOutputStream((File)var10_10, var13_13);
        while (var14_14 = var9_9.hasNext()) {
            var10_10 = (String)var9_9.next();
            var10_10 = var1_1.getJSONArray((String)var10_10);
            for (var15_15 = 0; var15_15 < (var16_16 = var10_10.length()); ++var15_15) {
                var17_17 /* !! */  = var10_10.getJSONObject(var15_15);
                var18_18 /* !! */  = new StringBuilder();
                var17_17 /* !! */  = var17_17 /* !! */ .toString();
                var18_18 /* !! */ .append((String)var17_17 /* !! */ );
                var18_18 /* !! */ .append("LOG_DELIMITER");
                var17_17 /* !! */  = var18_18 /* !! */ .toString();
                var18_18 /* !! */  = StandardCharsets.UTF_8;
                var17_17 /* !! */  = (JSONObject)var17_17 /* !! */ .getBytes((Charset)var18_18 /* !! */ );
                var19_19 = ((JSONObject)var17_17 /* !! */ ).length;
                var20_20 = (long)var19_19;
                var22_21 = var6_6.workspace;
                var23_22 /* !! */  = new StringBuilder();
                var23_22 /* !! */ .append(var7_7);
                var23_22 /* !! */ .append(var12_12);
                var23_22 /* !! */ .append(var8_8);
                var23_22 /* !! */  = var23_22 /* !! */ .toString();
                var22_21 = var22_21.openInCache((String)var23_22 /* !! */ );
                var24_23 = var22_21.length() + var20_20;
                var26_24 = var6_6.logConfig;
                var27_25 = var26_24.maxLogFileSize;
                var29_26 = var24_23 == var27_25 ? 0 : (var24_23 < var27_25 ? -1 : 1);
                if (var29_26 <= 0) {
                    var11_11.write((byte[])var17_17 /* !! */ );
                    while (true) {
                        var19_19 = true;
                        break;
                    }
                } else {
                    if ((var30_27 = (cfr_temp_0 = var20_20 - (var27_25 = var26_24.maxLogLineSize)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) > 0) ** continue;
                    var11_11 = var6_6.workspace;
                    var31_28 = String.valueOf(++var12_12);
                    var11_11.writeToSharedPreference(var4_4, (String)var31_28);
                    var11_11 = var6_6.workspace;
                    var31_28 = new StringBuilder();
                    var31_28.append(var7_7);
                    var31_28.append(var12_12);
                    var31_28.append(var8_8);
                    var31_28 = var31_28.toString();
                    var11_11 = var11_11.openInCache((String)var31_28);
                    var19_19 = true;
                    var31_28 = new FileOutputStream((File)var11_11, var19_19);
                    var31_28.write((byte[])var17_17 /* !! */ );
                    var11_11 = var31_28;
                }
                var13_13 = true;
            }
        }
        var11_11.close();
    }

    private boolean pushLogsFromJsonToPusher(JSONObject jSONObject) {
        Iterator iterator;
        try {
            iterator = jSONObject.keys();
        }
        catch (Exception exception) {
            return false;
        }
        while (true) {
            boolean bl2 = iterator.hasNext();
            if (!bl2) break;
            Object object = iterator.next();
            object = (String)object;
            LogPusher logPusher = this.logPusher;
            object = jSONObject.getJSONArray(object);
            logPusher.addLogLines((JSONArray)object);
            continue;
            break;
        }
        return true;
    }

    private void startLogSessioniserOnLogCount() {
        cx1_2 cx1_22 = new cx1_2(this, 0);
        ExecutorManager.runOnLogsPool(cx1_22);
    }

    public void addLogLine(String string2, JSONObject jSONObject) {
        boolean bl2 = this.stopPushingLogs;
        if (!bl2) {
            Object object = this.logConfig;
            bl2 = ((LogConfig)object).shouldPush;
            if (bl2) {
                object = new ax1_2(this, jSONObject, string2);
                ExecutorManager.runOnLogsPool((Runnable)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getLogsFromSessionId(JSONObject object) {
        String string3;
        String string2;
        block8: {
            Object object2;
            String string4 = "requestId";
            string2 = "";
            if (object == null) return LogSessioniser.constructErrorMessage("Request Invalid", string2);
            try {
                string3 = object.getString(string4);
                object2 = "sessionId";
            }
            catch (JSONException jSONException) {
                object = string2;
                string3 = string2;
                break block8;
            }
            try {
                object = object.getString((String)object2);
            }
            catch (JSONException jSONException) {
                object = string2;
                break block8;
            }
            try {
                object2 = this.activeRequestIDs;
                ((ArrayList)object2).add(string3);
                object2 = this.logs;
                object2 = object2.optJSONArray((String)object);
                if (object2 == null) return LogSessioniser.constructErrorMessage("No logs saved to file", string3);
                Object object3 = new JSONObject();
                string4 = object3.put(string4, (Object)string3);
                object3 = "error";
                string4 = string4.put((String)object3, false);
                object3 = "logs";
                string4 = string4.put((String)object3, object2);
                return string4.toString();
            }
            catch (JSONException jSONException) {}
        }
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            object = "RequestId not sent";
            return LogSessioniser.constructErrorMessage((String)object, string3);
        }
        boolean bl2 = ((String)object).equals(string2);
        if (bl2) {
            object = "SessionId not sent";
            return LogSessioniser.constructErrorMessage((String)object, string3);
        }
        object = "Request invalid";
        return LogSessioniser.constructErrorMessage((String)object, string3);
    }

    public void pushLogsToPusher() {
        PX0 pX0 = new PX0(this, 1);
        ExecutorManager.runOnLogsPool(pX0);
    }

    public void sessioniseLogs(JSONObject jSONObject) {
        boolean bl2 = this.stopPushingLogs;
        if (!bl2) {
            Object object = this.logConfig;
            bl2 = ((LogConfig)object).shouldPush;
            if (bl2) {
                object = new bx1_2(this, jSONObject);
                ExecutorManager.runOnLogsPool((Runnable)object);
            }
        }
    }

    public void startLogSessioniser() {
        ex1_1 ex1_12 = new ex1_1(this, 0);
        ExecutorManager.runOnLogsPool(ex1_12);
    }

    public void stopLogSessioniserOnTerminate() {
        zw1_1 zw1_12 = new zw1_1(this);
        ExecutorManager.runOnLogsPool(zw1_12);
    }
}

