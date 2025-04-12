/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.analytics.LogSessioniser$1;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.analytics.c;
import in.juspay.hypersdk.services.Workspace;
import java.util.TimerTask;
import org.json.JSONObject;

class LogSessioniser$LogSessioniserTimerTask
extends TimerTask {
    final /* synthetic */ LogSessioniser this$0;

    private LogSessioniser$LogSessioniserTimerTask(LogSessioniser logSessioniser) {
        this.this$0 = logSessioniser;
    }

    public /* synthetic */ LogSessioniser$LogSessioniserTimerTask(LogSessioniser logSessioniser, LogSessioniser$1 logSessioniser$1) {
        this(logSessioniser);
    }

    public static /* synthetic */ void a(LogSessioniser$LogSessioniserTimerTask logSessioniser$LogSessioniserTimerTask) {
        logSessioniser$LogSessioniserTimerTask.lambda$run$0();
    }

    private /* synthetic */ void lambda$run$0() {
        LogSessioniser$LogSessioniserTimerTask logSessioniser$LogSessioniserTimerTask = this;
        Object object = LogSessioniser.access$000(this.this$0);
        int n3 = ((LogConfig)object).shouldPush;
        if (n3 != 0 && (n3 = ((Boolean)(object = LogUtils.isMinMemoryAvailable(LogSessioniser.access$000(this.this$0)))).booleanValue()) != 0) {
            Object object2;
            int n4;
            Object object3;
            int n7;
            object = this.this$0;
            n3 = LogSessioniser.access$100((LogSessioniser)object);
            if (n3 == (n7 = 1)) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            Object object4 = logSessioniser$LogSessioniserTimerTask.this$0;
            Object object5 = "LOGS_READING_FILE";
            String string2 = "LOGS_WRITING_FILE";
            String string3 = "juspay-pre-logs-queue-";
            String string4 = ".dat";
            LogSessioniser.access$200((LogSessioniser)object4, (String)object5, string2, string3, string4);
            object4 = logSessioniser$LogSessioniserTimerTask.this$0;
            Object object6 = "TEMP_LOGS_READING_FILE";
            String string5 = "TEMP_LOGS_WRITING_FILE";
            Object object7 = "temp-logs-queue-";
            LogSessioniser.access$200((LogSessioniser)object4, (String)object6, string5, (String)object7, string4);
            if (n3 != 0) {
                LogSessioniser.access$300(logSessioniser$LogSessioniserTimerTask.this$0).clear();
                object4 = logSessioniser$LogSessioniserTimerTask.this$0;
                object3 = LogSessioniser.access$400((LogSessioniser)object4);
                LogSessioniser.access$500((LogSessioniser)object4, object3);
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                n4 = LogUtils.getFromSharedPreference((String)object6, (Workspace)object4);
                object3 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                int n8 = LogUtils.getFromSharedPreference(string5, (Workspace)object3);
                object2 = logSessioniser$LogSessioniserTimerTask.this$0;
                LogSessioniser.access$700((LogSessioniser)object2, (String)object7, string4, n4, n8);
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                object7 = String.valueOf(0);
                ((Workspace)object4).writeToSharedPreference((String)object6, (String)object7);
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                object6 = String.valueOf(0);
                ((Workspace)object4).writeToSharedPreference(string5, (String)object6);
            }
            if (n3 != 0) {
                object4 = logSessioniser$LogSessioniserTimerTask.this$0;
                object5 = LogSessioniser.access$800((LogSessioniser)object4);
                LogSessioniser.access$402((LogSessioniser)object4, (JSONObject)object5);
                object4 = logSessioniser$LogSessioniserTimerTask.this$0;
                object5 = new JSONObject();
                LogSessioniser.access$802((LogSessioniser)object4, (JSONObject)object5);
            } else {
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                n4 = LogUtils.getFromSharedPreference((String)object5, (Workspace)object4);
                object6 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                int n10 = LogUtils.getFromSharedPreference(string2, (Workspace)object6);
                object7 = logSessioniser$LogSessioniserTimerTask.this$0;
                LogSessioniser.access$700((LogSessioniser)object7, string3, string4, n4, n10);
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                string3 = String.valueOf(0);
                ((Workspace)object4).writeToSharedPreference((String)object5, string3);
                object4 = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                object5 = String.valueOf(0);
                ((Workspace)object4).writeToSharedPreference(string2, (String)object5);
                try {
                    object7 = logSessioniser$LogSessioniserTimerTask.this$0;
                }
                catch (Exception exception) {}
                object3 = LogSessioniser.access$800((LogSessioniser)object7);
                object2 = "juspay-pre-logs-queue-";
                String string6 = ".dat";
                String string7 = "LOGS_WRITING_FILE";
                LogSessioniser.access$900((LogSessioniser)object7, object3, (String)object2, string6, string7, 0);
            }
            if (n3 != 0) {
                int n14;
                object = LogSessioniser.access$600(logSessioniser$LogSessioniserTimerTask.this$0);
                n3 = LogUtils.getFromSharedPreference(string5, (Workspace)object);
                if (n3 == (n4 = -1)) {
                    n14 = 0;
                    string5 = null;
                } else {
                    n14 = n3;
                }
                try {
                    object5 = logSessioniser$LogSessioniserTimerTask.this$0;
                }
                catch (Exception exception) {}
                string2 = LogSessioniser.access$400((LogSessioniser)object5);
                string3 = "temp-logs-queue-";
                string4 = ".dat";
                object6 = "TEMP_LOGS_WRITING_FILE";
                LogSessioniser.access$900((LogSessioniser)object5, (JSONObject)string2, string3, string4, (String)object6, n14);
            }
            if ((n3 = (object = LogSessioniser.access$400(logSessioniser$LogSessioniserTimerTask.this$0)).length()) == 0 && (n3 = (object = LogSessioniser.access$800(logSessioniser$LogSessioniserTimerTask.this$0)).length()) == 0) {
                LogSessioniser.access$1000(logSessioniser$LogSessioniserTimerTask.this$0).cancel();
                object = logSessioniser$LogSessioniserTimerTask.this$0;
                LogSessioniser.access$1102((LogSessioniser)object, n7 != 0);
            }
            LogSessioniser.access$104(logSessioniser$LogSessioniserTimerTask.this$0);
            object = logSessioniser$LogSessioniserTimerTask.this$0;
            n7 = 5;
            LogSessioniser.access$144((LogSessioniser)object, n7);
        }
    }

    public void run() {
        c c2 = new c(this);
        ExecutorManager.runOnLogsPool(c2);
    }
}

