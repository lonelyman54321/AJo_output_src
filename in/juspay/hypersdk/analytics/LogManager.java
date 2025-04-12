/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import android.content.Context;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogManager$Companion;
import in.juspay.hypersdk.analytics.LogManager$LogMode;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.services.Workspace;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class LogManager {
    public static final LogManager$Companion Companion;
    private static final Map GLOBAL_LOG_MANAGER_MAP;
    private static final AtomicBoolean INIT_STATE;
    private final boolean classicEnabled;
    private final boolean experimentalEnabled;
    public final LogConfig logConfig;
    private final LogManager$LogMode logMode;
    private Timer logPushTimer;
    private LogPusher$LogPushTimerTask logPushTimerTask;
    public final LogPusher logPusher;
    private final LogPusherExp logPusherExp;
    private final AtomicInteger logPusherNumCounter;
    public final LogSessioniser logSessioniser;
    private final LogSessioniserExp logSessioniserExp;

    static {
        Serializable serializable = new Serializable(null);
        Companion = serializable;
        GLOBAL_LOG_MANAGER_MAP = serializable = new Serializable();
        serializable = new Serializable(false);
        INIT_STATE = serializable;
    }

    private LogManager(Workspace object, JSONObject object2) {
        boolean bl2;
        LogSessioniserExp logSessioniserExp;
        LogPusher logPusher;
        LogConfig logConfig;
        this.logConfig = logConfig = new LogConfig((JSONObject)object2);
        this.logPusher = logPusher = new LogPusher((Workspace)object, logConfig);
        Object object3 = new LogSessioniser((Workspace)object, logConfig, logPusher);
        this.logSessioniser = object3;
        this.logPusherExp = object3 = new LogPusherExp((Workspace)object, logConfig);
        this.logSessioniserExp = logSessioniserExp = new LogSessioniserExp((Workspace)object, logConfig, (LogPusherExp)object3);
        boolean bl3 = false;
        logConfig = null;
        this.logPusherNumCounter = object = new AtomicInteger(0);
        this.logPushTimerTask = object = logPusher.createPusherTask();
        object = LogManager$Companion.access$getLogMode(Companion, object2);
        this.logMode = object;
        object2 = LogManager$LogMode.JSON_ARRAY;
        if (object != object2 && object != (object2 = LogManager$LogMode.BOTH)) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        this.classicEnabled = bl2;
        object2 = LogManager$LogMode.BYTE_D_JSON;
        if (object == object2 || object == (object2 = LogManager$LogMode.BOTH)) {
            bl3 = true;
        }
        this.experimentalEnabled = bl3;
    }

    public /* synthetic */ LogManager(Workspace workspace, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(workspace, jSONObject);
    }

    public static /* synthetic */ void a(LogManager logManager) {
        LogManager.startLogPusherTimer$lambda$1(logManager);
    }

    public static final /* synthetic */ Map access$getGLOBAL_LOG_MANAGER_MAP$cp() {
        return GLOBAL_LOG_MANAGER_MAP;
    }

    public static final /* synthetic */ AtomicBoolean access$getINIT_STATE$cp() {
        return INIT_STATE;
    }

    public static /* synthetic */ void b(LogManager logManager) {
        LogManager.stopLogPusherOnTerminate$lambda$2(logManager);
    }

    public static /* synthetic */ void c(LogManager logManager, boolean bl2) {
        LogManager.startPushTasks$lambda$0(logManager, bl2);
    }

    public static final LogManager registerWorkspace(Context context, Workspace workspace, JSONObject jSONObject) {
        return Companion.registerWorkspace(context, workspace, jSONObject);
    }

    private final void startLogPusherTimer() {
        hw1_2 hw1_22 = new hw1_2(this);
        ExecutorManager.runOnLogsPool(hw1_22);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final void startLogPusherTimer$lambda$1(LogManager object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((LogManager)object).logConfig;
        boolean bl3 = ((LogConfig)object2).shouldPush;
        if (!bl3) {
            return;
        }
        try {
            object2 = ((LogManager)object).logPusher;
            bl2 = true;
        }
        catch (Exception exception) {
            return;
        }
        ((LogPusher)object2).setPushState(bl2);
        object2 = ((LogManager)object).logSessioniser;
        ((LogSessioniser)object2).startLogSessioniser();
        Timer timer = new Timer();
        ((LogManager)object).logPushTimer = timer;
        LogPusher$LogPushTimerTask logPusher$LogPushTimerTask = ((LogManager)object).logPushTimerTask;
        object = ((LogManager)object).logConfig;
        int n3 = ((LogConfig)object).logPostInterval;
        long l2 = n3;
        timer.scheduleAtFixedRate((TimerTask)logPusher$LogPushTimerTask, l2, l2);
    }

    private static final void startPushTasks$lambda$0(LogManager object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        LogSessioniserExp logSessioniserExp = ((LogManager)object).logSessioniserExp;
        logSessioniserExp.startLogSessioniser();
        if (bl2) {
            object = ((LogManager)object).logSessioniserExp;
            ((LogSessioniserExp)object).startPushing();
        }
    }

    private final void stopLogPusherOnTerminate() {
        gw1_2 gw1_22 = new gw1_2(this, 0);
        ExecutorManager.runOnLogsPool(gw1_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void stopLogPusherOnTerminate$lambda$2(LogManager object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((LogManager)object).logConfig;
        boolean bl2 = ((LogConfig)object2).shouldPush;
        if (!bl2) {
            return;
        }
        try {
            object2 = ((LogManager)object).logSessioniser;
            ((LogSessioniser)object2).stopLogSessioniserOnTerminate();
            object2 = ((LogManager)object).logPushTimer;
            if (object2 != null) {
                ((Timer)object2).cancel();
            }
            object2 = ((LogManager)object).logPusher;
            ((LogManager)object).logPushTimerTask = object2 = ((LogPusher)object2).createPusherTask();
            ((LogPusher$LogPushTimerTask)object2).run();
            object = ((LogManager)object).logPusher;
            bl2 = false;
            object2 = null;
            ((LogPusher)object).setPushState(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final boolean addChannel(String string2, String string3) {
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            return this.logPusher.addChannelFromJS(string2, string3);
        }
        return false;
    }

    public final boolean addChannelExp(String string2, String string3) {
        boolean bl2 = this.experimentalEnabled;
        if (bl2) {
            return this.logPusherExp.addChannelFromJS(string2, string3);
        }
        return false;
    }

    public final void addLogLine(String object, JSONObject jSONObject) {
        boolean bl2;
        boolean bl3 = this.classicEnabled;
        if (bl3) {
            LogSessioniser logSessioniser = this.logSessioniser;
            logSessioniser.addLogLine((String)object, jSONObject);
        }
        if (bl2 = this.experimentalEnabled) {
            object = this.logSessioniserExp;
            ((LogSessioniserExp)object).addLogLine(jSONObject);
        }
    }

    public final void addLogsToPersistedQueue(JSONObject jSONObject) {
        Object object;
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            object = this.logPusher;
            ((LogPusher)object).addLogsToPersistedQueue(jSONObject);
        }
        if (bl2 = this.experimentalEnabled) {
            object = this.logPusherExp;
            ((LogPusherExp)object).addLogsToPersistedQueue(jSONObject);
        }
    }

    public final boolean experimentalEnabled() {
        return this.experimentalEnabled;
    }

    public final void flushLogPush() {
        Object object;
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            this.logSessioniser.pushLogsToPusher();
            object = this.logPushTimerTask;
            if (object != null) {
                ((LogPusher$LogPushTimerTask)object).pushAllLogs();
            }
        }
        if (bl2 = this.experimentalEnabled) {
            object = this.logPusherExp;
            ((LogPusherExp)object).pushAllLogs();
        }
    }

    public final String[] getChannelNames() {
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            String[] stringArray = this.logPusher.getChannelNames();
            Intrinsics.checkNotNullExpressionValue(stringArray, "logPusher.channelNames");
            return stringArray;
        }
        return new String[0];
    }

    public final String[] getChannelNamesExp() {
        boolean bl2 = this.experimentalEnabled;
        String[] stringArray = null;
        if (bl2) {
            Set set = this.logPusherExp.getChannelNames();
            Intrinsics.checkNotNullExpressionValue(set, "logPusherExp.channelNames");
            stringArray = new String[]{};
            return set.toArray(stringArray);
        }
        return new String[0];
    }

    public final void setEndPointSandbox(boolean bl2) {
        Object object;
        boolean bl3 = this.classicEnabled;
        if (bl3) {
            object = this.logPusher;
            Boolean bl4 = bl2;
            ((LogPusher)object).setEndPointSandbox(bl4);
        }
        if (bl3 = this.experimentalEnabled) {
            object = this.logPusherExp;
            Boolean bl5 = bl2;
            ((LogPusherExp)object).setEndPointSandbox(bl5);
        }
    }

    public final void setHeaders(JSONObject jSONObject, String string2) {
        Object object;
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            object = this.logPusher;
            ((LogPusher)object).setHeaders(jSONObject, string2);
        }
        if (bl2 = this.experimentalEnabled) {
            object = this.logPusherExp;
            ((LogPusherExp)object).setHeaders(jSONObject, string2);
        }
    }

    public final void setLogHeaderValues(JSONObject jSONObject, String string2) {
        Object object;
        boolean bl2 = this.classicEnabled;
        if (bl2) {
            object = this.logPusher;
            ((LogPusher)object).setLogHeaderValues(jSONObject, string2);
        }
        if (bl2 = this.experimentalEnabled) {
            object = this.logPusherExp;
            ((LogPusherExp)object).setLogHeaderValues(jSONObject, string2);
        }
    }

    public final void startPushExp() {
        boolean bl2 = this.experimentalEnabled;
        if (bl2) {
            LogSessioniserExp logSessioniserExp = this.logSessioniserExp;
            logSessioniserExp.startPushing();
        }
    }

    public final void startPushTasks(boolean bl2) {
        Object object = this.logPusherNumCounter;
        int n3 = ((AtomicInteger)object).getAndIncrement();
        if (n3 == 0) {
            n3 = (int)(this.classicEnabled ? 1 : 0);
            if (n3 != 0) {
                this.startLogPusherTimer();
            }
            if ((n3 = (int)(this.experimentalEnabled ? 1 : 0)) != 0) {
                object = new iw1_2(this, bl2);
                ExecutorManager.runOnLogSessioniserThread((Runnable)object);
            }
        }
    }

    public final void stopPushTasks() {
        Object object = this.logPusherNumCounter;
        int n3 = ((AtomicInteger)object).decrementAndGet();
        if (n3 <= 0) {
            object = this.logPusherNumCounter;
            ((AtomicInteger)object).set(0);
            n3 = (int)(this.classicEnabled ? 1 : 0);
            if (n3 != 0) {
                this.stopLogPusherOnTerminate();
            }
            if ((n3 = (int)(this.experimentalEnabled ? 1 : 0)) != 0) {
                object = this.logSessioniserExp;
                ((LogSessioniserExp)object).stopLogSessioniserOnTerminate();
            }
        }
    }
}

