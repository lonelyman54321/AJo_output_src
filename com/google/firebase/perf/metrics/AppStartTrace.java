/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.PowerManager
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.AppStartTrace$DrawCounter;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TraceMetric$Builder;
import com.google.firebase.perf.v1.TraceMetricOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace
implements Application.ActivityLifecycleCallbacks,
lu1 {
    private static final int CORE_POOL_SIZE = 0;
    private static final long MAX_LATENCY_BEFORE_UI_INIT = 0L;
    private static final int MAX_POOL_SIZE = 1;
    private static final Timer PERF_CLASS_LOAD_TIME;
    private static ExecutorService executorService;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference appStartActivity;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private final TraceMetric$Builder experimentTtid;
    private final Timer firebaseClassLoadTime;
    private Timer firstBackgroundTime;
    private Timer firstForegroundTime;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isStartedFromBackground;
    private boolean isTooLateToInitUI = false;
    private WeakReference launchActivity;
    private Timer onCreateTime;
    private int onDrawCount;
    private final AppStartTrace$DrawCounter onDrawCounterListener;
    private Timer onDrawPostAtFrontOfQueueTime;
    private Timer onResumeTime;
    private Timer onStartTime;
    private Timer preDrawPostAtFrontOfQueueTime;
    private Timer preDrawPostTime;
    private final Timer processStartTime;
    private PerfSession startSession;
    private boolean systemForegroundCheck;
    private final TransportManager transportManager;

    static {
        Clock clock = new Clock();
        PERF_CLASS_LOAD_TIME = clock.getTime();
        MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1L);
    }

    public AppStartTrace(TransportManager object, Clock clazz, ConfigResolver configResolver, ExecutorService executorService) {
        long l2;
        AppStartTrace$DrawCounter appStartTrace$DrawCounter;
        Timer timer = null;
        this.onCreateTime = null;
        this.onStartTime = null;
        this.onResumeTime = null;
        this.firstForegroundTime = null;
        this.firstBackgroundTime = null;
        this.preDrawPostTime = null;
        this.preDrawPostAtFrontOfQueueTime = null;
        this.onDrawPostAtFrontOfQueueTime = null;
        this.isStartedFromBackground = false;
        this.onDrawCount = 0;
        this.onDrawCounterListener = appStartTrace$DrawCounter = new AppStartTrace$DrawCounter(this, null);
        this.systemForegroundCheck = false;
        this.transportManager = object;
        this.clock = clazz;
        this.configResolver = configResolver;
        AppStartTrace.executorService = executorService;
        object = TraceMetric.newBuilder();
        clazz = "_experiment_app_start_ttid";
        this.experimentTtid = object = ((TraceMetric$Builder)object).setName((String)((Object)clazz));
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            l2 = ro_0.a();
            object = Timer.ofElapsedRealtime(l2);
        } else {
            n3 = 0;
            object = null;
        }
        this.processStartTime = object;
        object = FirebaseApp.getInstance();
        clazz = StartupTime.class;
        object = (StartupTime)((FirebaseApp)object).get(clazz);
        if (object != null) {
            l2 = ((StartupTime)object).getElapsedRealtime();
            timer = Timer.ofElapsedRealtime(l2);
        }
        this.firebaseClassLoadTime = timer;
    }

    public static /* synthetic */ Timer access$100(AppStartTrace appStartTrace) {
        return appStartTrace.onCreateTime;
    }

    public static /* synthetic */ boolean access$202(AppStartTrace appStartTrace, boolean bl2) {
        appStartTrace.isStartedFromBackground = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$308(AppStartTrace appStartTrace) {
        int n3;
        int n4 = appStartTrace.onDrawCount;
        appStartTrace.onDrawCount = n3 = n4 + 1;
        return n4;
    }

    public static /* synthetic */ void b(AppStartTrace appStartTrace, TraceMetric$Builder traceMetric$Builder) {
        appStartTrace.lambda$logExperimentTrace$0(traceMetric$Builder);
    }

    public static /* synthetic */ void c(AppStartTrace appStartTrace) {
        appStartTrace.logAppStartTrace();
    }

    public static /* synthetic */ void d(AppStartTrace appStartTrace) {
        appStartTrace.recordPreDraw();
    }

    public static /* synthetic */ void e(AppStartTrace appStartTrace) {
        appStartTrace.recordPreDrawFrontOfQueue();
    }

    public static /* synthetic */ void f(AppStartTrace appStartTrace) {
        appStartTrace.recordOnDrawFrontOfQueue();
    }

    private Timer getClassLoadTimeCompat() {
        Timer timer = this.firebaseClassLoadTime;
        if (timer != null) {
            return timer;
        }
        return PERF_CLASS_LOAD_TIME;
    }

    public static AppStartTrace getInstance() {
        Object object = instance;
        if (object != null) {
            object = instance;
        } else {
            object = TransportManager.getInstance();
            Clock clock = new Clock();
            object = AppStartTrace.getInstance((TransportManager)object, clock);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppStartTrace getInstance(TransportManager transportManager, Clock clock) {
        Object object = instance;
        if (object != null) return instance;
        object = AppStartTrace.class;
        synchronized (object) {
            try {
                AppStartTrace appStartTrace = instance;
                if (appStartTrace != null) return instance;
                ConfigResolver configResolver = ConfigResolver.getInstance();
                long l2 = MAX_LATENCY_BEFORE_UI_INIT;
                long l3 = 10;
                long l4 = l2 + l3;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
                int n3 = 1;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, n3, l4, timeUnit, linkedBlockingQueue);
                instance = appStartTrace = new AppStartTrace(transportManager, clock, configResolver, threadPoolExecutor);
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private Timer getStartTimerCompat() {
        Timer timer = this.processStartTime;
        if (timer != null) {
            return timer;
        }
        return this.getClassLoadTimeCompat();
    }

    public static boolean isAnyAppProcessInForeground(Context context) {
        Object object = (ActivityManager)context.getSystemService("activity");
        boolean bl2 = true;
        if (object == null) {
            return bl2;
        }
        if ((object = object.getRunningAppProcesses()) != null) {
            int n3;
            String string2 = context.getPackageName();
            String string3 = Ft2.a(string2, ":");
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                String string4;
                Object object2 = (ActivityManager.RunningAppProcessInfo)object.next();
                int n4 = ((ActivityManager.RunningAppProcessInfo)object2).importance;
                int n7 = 100;
                if (n4 != n7 || (n4 = (int)((string4 = ((ActivityManager.RunningAppProcessInfo)object2).processName).equals(string2) ? 1 : 0)) == 0 && (n3 = (int)(((String)(object2 = ((ActivityManager.RunningAppProcessInfo)object2).processName)).startsWith(string3) ? 1 : 0)) == 0 || (n3 = (n3 = Build.VERSION.SDK_INT) < (n4 = 23) ? (int)(AppStartTrace.isScreenOn(context) ? 1 : 0) : 1) == 0) continue;
                return bl2;
            }
        }
        return false;
    }

    public static boolean isScreenOn(Context context) {
        String string2 = "power";
        if ((context = (PowerManager)context.getSystemService(string2)) == null) {
            return true;
        }
        return context.isInteractive();
    }

    private /* synthetic */ void lambda$logExperimentTrace$0(TraceMetric$Builder traceMetricOrBuilder) {
        TransportManager transportManager = this.transportManager;
        traceMetricOrBuilder = (TraceMetric)traceMetricOrBuilder.build();
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        transportManager.log((TraceMetric)traceMetricOrBuilder, applicationProcessState);
    }

    private void logAppStartTrace() {
        TraceMetricOrBuilder traceMetricOrBuilder = TraceMetric.newBuilder();
        Object object = Constants$TraceNames.APP_START_TRACE_NAME.toString();
        traceMetricOrBuilder = traceMetricOrBuilder.setName((String)object);
        long l2 = this.getClassLoadTimeCompat().getMicros();
        traceMetricOrBuilder = traceMetricOrBuilder.setClientStartTimeUs(l2);
        object = this.getClassLoadTimeCompat();
        Object object2 = this.onResumeTime;
        l2 = ((Timer)object).getDurationMicros((Timer)object2);
        traceMetricOrBuilder = traceMetricOrBuilder.setDurationUs(l2);
        int n3 = 3;
        object = new ArrayList(n3);
        object2 = TraceMetric.newBuilder();
        Object object3 = Constants$TraceNames.ON_CREATE_TRACE_NAME.toString();
        object2 = ((TraceMetric$Builder)object2).setName((String)object3);
        long l3 = this.getClassLoadTimeCompat().getMicros();
        object2 = ((TraceMetric$Builder)object2).setClientStartTimeUs(l3);
        object3 = this.getClassLoadTimeCompat();
        Timer timer = this.onCreateTime;
        l3 = ((Timer)object3).getDurationMicros(timer);
        object2 = (TraceMetric)((TraceMetric$Builder)object2).setDurationUs(l3).build();
        ((ArrayList)object).add(object2);
        object2 = this.onStartTime;
        if (object2 != null) {
            object2 = TraceMetric.newBuilder();
            object3 = Constants$TraceNames.ON_START_TRACE_NAME.toString();
            object3 = ((TraceMetric$Builder)object2).setName((String)object3);
            long l4 = this.onCreateTime.getMicros();
            object3 = ((TraceMetric$Builder)object3).setClientStartTimeUs(l4);
            timer = this.onCreateTime;
            Timer timer2 = this.onStartTime;
            l4 = timer.getDurationMicros(timer2);
            ((TraceMetric$Builder)object3).setDurationUs(l4);
            object2 = (TraceMetric)((GeneratedMessageLite$Builder)object2).build();
            ((ArrayList)object).add(object2);
            object2 = TraceMetric.newBuilder();
            object3 = Constants$TraceNames.ON_RESUME_TRACE_NAME.toString();
            object3 = ((TraceMetric$Builder)object2).setName((String)object3);
            l4 = this.onStartTime.getMicros();
            object3 = ((TraceMetric$Builder)object3).setClientStartTimeUs(l4);
            timer = this.onStartTime;
            timer2 = this.onResumeTime;
            l4 = timer.getDurationMicros(timer2);
            ((TraceMetric$Builder)object3).setDurationUs(l4);
            object2 = (TraceMetric)((GeneratedMessageLite$Builder)object2).build();
            ((ArrayList)object).add(object2);
        }
        object = traceMetricOrBuilder.addAllSubtraces((Iterable)object);
        object2 = this.startSession.build();
        ((TraceMetric$Builder)object).addPerfSessions((com.google.firebase.perf.v1.PerfSession)object2);
        object = this.transportManager;
        traceMetricOrBuilder = (TraceMetric)traceMetricOrBuilder.build();
        object2 = ApplicationProcessState.FOREGROUND_BACKGROUND;
        ((TransportManager)object).log((TraceMetric)traceMetricOrBuilder, (ApplicationProcessState)object2);
    }

    private void logExperimentTrace(TraceMetric$Builder traceMetric$Builder) {
        Object object = this.preDrawPostTime;
        if (object != null && (object = this.preDrawPostAtFrontOfQueueTime) != null && (object = this.onDrawPostAtFrontOfQueueTime) != null) {
            object = executorService;
            Vo vo = new Vo(0, this, traceMetric$Builder);
            object.execute(vo);
            this.unregisterActivityLifecycleCallbacks();
        }
    }

    private void recordOnDrawFrontOfQueue() {
        Object object = this.onDrawPostAtFrontOfQueueTime;
        if (object != null) {
            return;
        }
        object = this.clock.getTime();
        this.onDrawPostAtFrontOfQueueTime = object;
        object = this.experimentTtid;
        Object object2 = TraceMetric.newBuilder().setName("_experiment_onDrawFoQ");
        long l2 = this.getStartTimerCompat().getMicros();
        object2 = ((TraceMetric$Builder)object2).setClientStartTimeUs(l2);
        Timer timer = this.getStartTimerCompat();
        Timer timer2 = this.onDrawPostAtFrontOfQueueTime;
        l2 = timer.getDurationMicros(timer2);
        object2 = (TraceMetric)((TraceMetric$Builder)object2).setDurationUs(l2).build();
        ((TraceMetric$Builder)object).addSubtraces((TraceMetric)object2);
        object = this.processStartTime;
        if (object != null) {
            object = this.experimentTtid;
            object2 = TraceMetric.newBuilder().setName("_experiment_procStart_to_classLoad");
            l2 = this.getStartTimerCompat().getMicros();
            object2 = ((TraceMetric$Builder)object2).setClientStartTimeUs(l2);
            timer = this.getStartTimerCompat();
            timer2 = this.getClassLoadTimeCompat();
            l2 = timer.getDurationMicros(timer2);
            object2 = (TraceMetric)((TraceMetric$Builder)object2).setDurationUs(l2).build();
            ((TraceMetric$Builder)object).addSubtraces((TraceMetric)object2);
        }
        object = this.experimentTtid;
        boolean bl2 = this.systemForegroundCheck;
        object2 = bl2 ? "true" : "false";
        ((TraceMetric$Builder)object).putCustomAttributes("systemDeterminedForeground", (String)object2);
        object = this.experimentTtid;
        long l3 = this.onDrawCount;
        ((TraceMetric$Builder)object).putCounters("onDrawCount", l3);
        object = this.experimentTtid;
        object2 = this.startSession.build();
        ((TraceMetric$Builder)object).addPerfSessions((com.google.firebase.perf.v1.PerfSession)object2);
        object = this.experimentTtid;
        this.logExperimentTrace((TraceMetric$Builder)object);
    }

    private void recordPreDraw() {
        Object object = this.preDrawPostTime;
        if (object != null) {
            return;
        }
        object = this.clock.getTime();
        this.preDrawPostTime = object;
        object = this.experimentTtid;
        long l2 = this.getStartTimerCompat().getMicros();
        object = ((TraceMetric$Builder)object).setClientStartTimeUs(l2);
        Timer timer = this.getStartTimerCompat();
        Timer timer2 = this.preDrawPostTime;
        l2 = timer.getDurationMicros(timer2);
        ((TraceMetric$Builder)object).setDurationUs(l2);
        object = this.experimentTtid;
        this.logExperimentTrace((TraceMetric$Builder)object);
    }

    private void recordPreDrawFrontOfQueue() {
        Object object = this.preDrawPostAtFrontOfQueueTime;
        if (object != null) {
            return;
        }
        object = this.clock.getTime();
        this.preDrawPostAtFrontOfQueueTime = object;
        object = this.experimentTtid;
        TraceMetricOrBuilder traceMetricOrBuilder = TraceMetric.newBuilder().setName("_experiment_preDrawFoQ");
        long l2 = this.getStartTimerCompat().getMicros();
        traceMetricOrBuilder = traceMetricOrBuilder.setClientStartTimeUs(l2);
        Timer timer = this.getStartTimerCompat();
        Timer timer2 = this.preDrawPostAtFrontOfQueueTime;
        l2 = timer.getDurationMicros(timer2);
        traceMetricOrBuilder = (TraceMetric)traceMetricOrBuilder.setDurationUs(l2).build();
        ((TraceMetric$Builder)object).addSubtraces((TraceMetric)traceMetricOrBuilder);
        object = this.experimentTtid;
        this.logExperimentTrace((TraceMetric$Builder)object);
    }

    public static void setLauncherActivityOnCreateTime(String string2) {
    }

    public static void setLauncherActivityOnResumeTime(String string2) {
    }

    public static void setLauncherActivityOnStartTime(String string2) {
    }

    public Activity getAppStartActivity() {
        return (Activity)this.appStartActivity.get();
    }

    public Activity getLaunchActivity() {
        return (Activity)this.launchActivity.get();
    }

    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityCreated(Activity object, Bundle object2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block4: {
                    boolean bl2;
                    boolean bl3;
                    block6: {
                        block5: {
                            try {
                                bl3 = this.isStartedFromBackground;
                                if (bl3 || (object2 = this.onCreateTime) != null) break block4;
                                bl3 = this.systemForegroundCheck;
                                bl2 = true;
                                if (bl3 || (bl3 = AppStartTrace.isAnyAppProcessInForeground((Context)(object2 = this.appContext)))) break block5;
                                bl3 = false;
                                object2 = null;
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        bl3 = true;
                    }
                    this.systemForegroundCheck = bl3;
                    object2 = new WeakReference(object);
                    this.launchActivity = object2;
                    object = this.clock;
                    this.onCreateTime = object = ((Clock)object).getTime();
                    object = this.getStartTimerCompat();
                    object2 = this.onCreateTime;
                    long l2 = ((Timer)object).getDurationMicros((Timer)object2);
                    long l3 = MAX_LATENCY_BEFORE_UI_INIT;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 > 0) {
                        this.isTooLateToInitUI = bl2;
                    }
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        Object object;
        int n3 = this.isStartedFromBackground;
        if (n3 == 0 && (n3 = this.isTooLateToInitUI) == 0 && (n3 = ((ConfigResolver)(object = this.configResolver)).getIsExperimentTTIDEnabled()) != 0 && (activity = activity.findViewById(n3 = 0x1020002)) != null) {
            activity = activity.getViewTreeObserver();
            object = this.onDrawCounterListener;
            activity.removeOnDrawListener((ViewTreeObserver.OnDrawListener)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityResumed(Activity object) {
        Object object2 = "onResume(): ";
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    Object object3;
                    int n3;
                    Object object4;
                    boolean bl2;
                    block7: {
                        try {
                            bl2 = this.isStartedFromBackground;
                            if (bl2 || (bl2 = this.isTooLateToInitUI)) break block6;
                            ConfigResolver configResolver = this.configResolver;
                            bl2 = configResolver.getIsExperimentTTIDEnabled();
                            if (bl2 && (object4 = object.findViewById(n3 = 0x1020002)) != null) {
                                object3 = object4.getViewTreeObserver();
                                Object object5 = this.onDrawCounterListener;
                                object3.addOnDrawListener((ViewTreeObserver.OnDrawListener)object5);
                                int n4 = 0;
                                object5 = null;
                                object3 = new so_0(this, 0);
                                FirstDrawDoneListener.registerForNextDraw((View)object4, (Runnable)object3);
                                n4 = 1;
                                object3 = new Ga(this, n4);
                                object5 = new to_0(this, 0);
                                PreDrawListener.registerForNextDraw((View)object4, (Runnable)object3, (Runnable)object5);
                            }
                            if ((object4 = this.onResumeTime) == null) break block7;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    object4 = new WeakReference(object);
                    this.appStartActivity = object4;
                    object4 = this.clock;
                    this.onResumeTime = object4 = ((Clock)object4).getTime();
                    object4 = SessionManager.getInstance();
                    this.startSession = object4 = ((SessionManager)object4).perfSession();
                    object4 = AndroidLogger.getInstance();
                    object3 = new StringBuilder((String)object2);
                    object = object.getClass();
                    object = ((Class)object).getName();
                    ((StringBuilder)object3).append((String)object);
                    object = ": ";
                    ((StringBuilder)object3).append((String)object);
                    object = this.getClassLoadTimeCompat();
                    object2 = this.onResumeTime;
                    long l2 = ((Timer)object).getDurationMicros((Timer)object2);
                    ((StringBuilder)object3).append(l2);
                    object = " microseconds";
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    ((AndroidLogger)object4).debug((String)object);
                    object = executorService;
                    n3 = 0;
                    object4 = null;
                    object2 = new Uo(this, 0);
                    object.execute((Runnable)object2);
                    if (!bl2) {
                        this.unregisterActivityLifecycleCallbacks();
                    }
                    return;
                    break block8;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityStarted(Activity object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.isStartedFromBackground;
                    if (!bl2 && (object = this.onStartTime) == null && !(bl2 = this.isTooLateToInitUI)) {
                        object = this.clock;
                        this.onStartTime = object = ((Clock)object).getTime();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAppEnteredBackground() {
        Object object;
        boolean bl2 = this.isStartedFromBackground;
        if (!bl2 && !(bl2 = this.isTooLateToInitUI) && (object = this.firstBackgroundTime) == null) {
            object = this.clock.getTime();
            this.firstBackgroundTime = object;
            object = this.experimentTtid;
            TraceMetricOrBuilder traceMetricOrBuilder = TraceMetric.newBuilder().setName("_experiment_firstBackgrounding");
            long l2 = this.getStartTimerCompat().getMicros();
            traceMetricOrBuilder = traceMetricOrBuilder.setClientStartTimeUs(l2);
            Timer timer = this.getStartTimerCompat();
            Timer timer2 = this.firstBackgroundTime;
            l2 = timer.getDurationMicros(timer2);
            traceMetricOrBuilder = (TraceMetric)traceMetricOrBuilder.setDurationUs(l2).build();
            ((TraceMetric$Builder)object).addSubtraces((TraceMetric)traceMetricOrBuilder);
        }
    }

    public void onAppEnteredForeground() {
        Object object;
        boolean bl2 = this.isStartedFromBackground;
        if (!bl2 && !(bl2 = this.isTooLateToInitUI) && (object = this.firstForegroundTime) == null) {
            object = this.clock.getTime();
            this.firstForegroundTime = object;
            object = this.experimentTtid;
            TraceMetricOrBuilder traceMetricOrBuilder = TraceMetric.newBuilder().setName("_experiment_firstForegrounding");
            long l2 = this.getStartTimerCompat().getMicros();
            traceMetricOrBuilder = traceMetricOrBuilder.setClientStartTimeUs(l2);
            Timer timer = this.getStartTimerCompat();
            Timer timer2 = this.firstForegroundTime;
            l2 = timer.getDurationMicros(timer2);
            traceMetricOrBuilder = (TraceMetric)traceMetricOrBuilder.setDurationUs(l2).build();
            ((TraceMetric$Builder)object).addSubtraces((TraceMetric)traceMetricOrBuilder);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerActivityLifecycleCallbacks(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    boolean bl2;
                    boolean bl3;
                    block7: {
                        block6: {
                            block5: {
                                try {
                                    bl3 = this.isRegisteredForLifecycleCallbacks;
                                    if (!bl3) break block5;
                                }
                                catch (Throwable throwable2) {}
                                return;
                            }
                            Object object = r.i;
                            object = ((r)object).f;
                            ((o)object).a(this);
                            context = context.getApplicationContext();
                            bl3 = context instanceof Application;
                            if (!bl3) break block8;
                            object = context;
                            object = (Application)context;
                            object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                            bl3 = this.systemForegroundCheck;
                            bl2 = true;
                            if (bl3 || (bl3 = AppStartTrace.isAnyAppProcessInForeground(context))) break block6;
                            bl3 = false;
                            object = null;
                            break block7;
                            break block9;
                        }
                        bl3 = true;
                    }
                    this.systemForegroundCheck = bl3;
                    this.isRegisteredForLifecycleCallbacks = bl2;
                    this.appContext = context;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterActivityLifecycleCallbacks() {
        synchronized (this) {
            boolean bl2 = this.isRegisteredForLifecycleCallbacks;
            if (!bl2) {
                return;
            }
            Object object = r.i;
            object = ((r)object).f;
            ((o)object).c(this);
            object = this.appContext;
            object = (Application)object;
            object.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
            bl2 = false;
            object = null;
            this.isRegisteredForLifecycleCallbacks = false;
            return;
        }
    }
}

