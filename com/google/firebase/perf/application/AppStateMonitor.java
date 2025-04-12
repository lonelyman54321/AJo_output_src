/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$l;
import androidx.fragment.app.f;
import androidx.fragment.app.f$a;
import com.google.firebase.perf.application.AppStateMonitor$AppColdStartCallback;
import com.google.firebase.perf.application.AppStateMonitor$AppStateCallback;
import com.google.firebase.perf.application.FragmentStateMonitor;
import com.google.firebase.perf.application.FrameMetricsRecorder;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator$PerfFrameMetrics;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TraceMetric$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

public class AppStateMonitor
implements Application.ActivityLifecycleCallbacks {
    private static volatile AppStateMonitor instance;
    private static final AndroidLogger logger;
    private final WeakHashMap activityToFragmentStateMonitorMap;
    private final WeakHashMap activityToRecorderMap;
    private final WeakHashMap activityToResumedMap;
    private final WeakHashMap activityToScreenTraceMap;
    private Set appColdStartSubscribers;
    private final Set appStateSubscribers;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private ApplicationProcessState currentAppState;
    private boolean isColdStart;
    private boolean isRegisteredForLifecycleCallbacks;
    private final Map metricToCountMap;
    private Timer resumeTime;
    private final boolean screenPerformanceRecordingSupported;
    private Timer stopTime;
    private final TransportManager transportManager;
    private final AtomicInteger tsnsCount;

    static {
        logger = AndroidLogger.getInstance();
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        ConfigResolver configResolver = ConfigResolver.getInstance();
        boolean bl2 = AppStateMonitor.isScreenPerformanceRecordingSupported();
        this(transportManager, clock, configResolver, bl2);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock, ConfigResolver configResolver, boolean bl2) {
        Object object = new WeakHashMap();
        this.activityToResumedMap = object;
        object = new WeakHashMap();
        this.activityToRecorderMap = object;
        object = new WeakHashMap();
        this.activityToFragmentStateMonitorMap = object;
        object = new WeakHashMap();
        this.activityToScreenTraceMap = object;
        this.metricToCountMap = object;
        object = new HashSet();
        this.appStateSubscribers = object;
        object = new HashSet();
        this.appColdStartSubscribers = object;
        super(0);
        this.tsnsCount = object;
        this.currentAppState = object = ApplicationProcessState.BACKGROUND;
        this.isRegisteredForLifecycleCallbacks = false;
        this.isColdStart = true;
        this.transportManager = transportManager;
        this.clock = clock;
        this.configResolver = configResolver;
        this.screenPerformanceRecordingSupported = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppStateMonitor getInstance() {
        Object object = instance;
        if (object != null) return instance;
        object = AppStateMonitor.class;
        synchronized (object) {
            try {
                AppStateMonitor appStateMonitor = instance;
                if (appStateMonitor != null) return instance;
                TransportManager transportManager = TransportManager.getInstance();
                Clock clock = new Clock();
                instance = appStateMonitor = new AppStateMonitor(transportManager, clock);
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static String getScreenTraceName(Activity object) {
        object = object.getClass().getSimpleName();
        return "_st_".concat((String)object);
    }

    private static boolean isScreenPerformanceRecordingSupported() {
        return FrameMetricsRecorder.isFrameMetricsRecordingSupported();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendAppColdStartUpdate() {
        Set set = this.appColdStartSubscribers;
        synchronized (set) {
            try {
                Object object = this.appColdStartSubscribers;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        return;
                    }
                    Object object2 = object.next();
                    if ((object2 = (AppStateMonitor$AppColdStartCallback)object2) == null) continue;
                    object2.onAppColdStart();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void sendScreenTrace(Activity object) {
        Object object2 = (Trace)this.activityToScreenTraceMap.get(object);
        if (object2 == null) {
            return;
        }
        this.activityToScreenTraceMap.remove(object);
        Object[] objectArray = ((FrameMetricsRecorder)this.activityToRecorderMap.get(object)).stop();
        boolean bl2 = objectArray.isAvailable();
        if (!bl2) {
            object2 = logger;
            object = object.getClass().getSimpleName();
            objectArray = new Object[]{object};
            ((AndroidLogger)object2).warn("Failed to record frame data for %s.", objectArray);
            return;
        }
        object = (FrameMetricsCalculator$PerfFrameMetrics)objectArray.get();
        ScreenTraceUtil.addFrameCounters((Trace)object2, (FrameMetricsCalculator$PerfFrameMetrics)object);
        ((Trace)object2).stop();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void sendSessionLog(String object, Timer object2, Timer object3) {
        Object object4 = this.configResolver;
        boolean bl2 = ((ConfigResolver)object4).isPerformanceMonitoringEnabled();
        if (!bl2) {
            return;
        }
        object4 = TraceMetric.newBuilder();
        object = ((TraceMetric$Builder)object4).setName((String)object);
        long l2 = ((Timer)object2).getMicros();
        object = ((TraceMetric$Builder)object).setClientStartTimeUs(l2);
        long l3 = ((Timer)object2).getDurationMicros((Timer)object3);
        object = ((TraceMetric$Builder)object).setDurationUs(l3);
        object2 = SessionManager.getInstance().perfSession().build();
        object = ((TraceMetric$Builder)object).addPerfSessions((PerfSession)object2);
        object2 = this.tsnsCount;
        int n3 = ((AtomicInteger)object2).getAndSet(0);
        object3 = this.metricToCountMap;
        // MONITORENTER : object3
        object4 = this.metricToCountMap;
        ((TraceMetric$Builder)object).putAllCounters((Map)object4);
        if (n3 != 0) {
            object4 = Constants$CounterNames.TRACE_STARTED_NOT_STOPPED;
            object4 = ((Constants$CounterNames)((Object)object4)).toString();
            long l4 = n3;
            ((TraceMetric$Builder)object).putCounters((String)object4, l4);
        }
        object2 = this.metricToCountMap;
        object2.clear();
        // MONITOREXIT : object3
        object2 = this.transportManager;
        object = (TraceMetric)((GeneratedMessageLite$Builder)object).build();
        object3 = ApplicationProcessState.FOREGROUND_BACKGROUND;
        ((TransportManager)object2).log((TraceMetric)object, (ApplicationProcessState)object3);
    }

    private void startFrameMonitoring(Activity object) {
        Object object2;
        boolean bl2 = this.isScreenTraceSupported();
        if (bl2 && (bl2 = ((ConfigResolver)(object2 = this.configResolver)).isPerformanceMonitoringEnabled())) {
            object2 = new FrameMetricsRecorder((Activity)object);
            Object object3 = this.activityToRecorderMap;
            ((WeakHashMap)object3).put(object, object2);
            boolean bl3 = object instanceof FragmentActivity;
            if (bl3) {
                Clock clock = this.clock;
                TransportManager transportManager = this.transportManager;
                object3 = new FragmentStateMonitor(clock, transportManager, this, (FrameMetricsRecorder)object2);
                this.activityToFragmentStateMonitorMap.put(object, object3);
                object = ((FragmentActivity)object).getSupportFragmentManager().p;
                object.getClass();
                Intrinsics.checkNotNullParameter(object3, "cb");
                object = ((f)object).b;
                boolean bl4 = true;
                object2 = new f$a((FragmentManager$l)object3, bl4);
                ((CopyOnWriteArrayList)object).add(object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateAppState(ApplicationProcessState object) {
        this.currentAppState = object;
        object = this.appStateSubscribers;
        synchronized (object) {
            Object object2;
            try {
                object2 = this.appStateSubscribers;
                object2 = object2.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            boolean bl2;
            while (bl2 = object2.hasNext()) {
                Object object3 = object2.next();
                object3 = (WeakReference)object3;
                object3 = ((Reference)object3).get();
                if ((object3 = (AppStateMonitor$AppStateCallback)object3) != null) {
                    ApplicationProcessState applicationProcessState = this.currentAppState;
                    object3.onUpdateAppState(applicationProcessState);
                    continue;
                }
                object2.remove();
            }
            return;
        }
    }

    public WeakHashMap getActivity2ScreenTrace() {
        return this.activityToScreenTraceMap;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public Timer getPauseTime() {
        return this.stopTime;
    }

    public Timer getResumeTime() {
        return this.resumeTime;
    }

    public WeakHashMap getResumed() {
        return this.activityToResumedMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void incrementCount(String string2, long l2) {
        Map map2 = this.metricToCountMap;
        synchronized (map2) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    block3: {
                        try {
                            object = this.metricToCountMap;
                            object = object.get(string2);
                            object = (Long)object;
                            if (object != null) break block3;
                            object = this.metricToCountMap;
                            Long l3 = l2;
                            object.put(string2, l3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    Map map3 = this.metricToCountMap;
                    long l4 = (Long)object + l2;
                    Long l7 = l4;
                    map3.put(string2, l7);
                }
                return;
            }
            throw throwable2;
        }
    }

    public void incrementTsnsCount(int n3) {
        this.tsnsCount.addAndGet(n3);
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public boolean isForeground() {
        boolean bl2;
        ApplicationProcessState applicationProcessState = this.currentAppState;
        ApplicationProcessState applicationProcessState2 = ApplicationProcessState.FOREGROUND;
        if (applicationProcessState == applicationProcessState2) {
            bl2 = true;
        } else {
            bl2 = false;
            applicationProcessState = null;
        }
        return bl2;
    }

    public boolean isScreenTraceSupported() {
        return this.screenPerformanceRecordingSupported;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.startFrameMonitoring(activity);
    }

    public void onActivityDestroyed(Activity object) {
        this.activityToRecorderMap.remove(object);
        Object object2 = this.activityToFragmentStateMonitorMap;
        boolean bl2 = ((WeakHashMap)object2).containsKey(object);
        if (bl2) {
            object2 = object;
            object2 = ((FragmentActivity)object).getSupportFragmentManager();
            WeakHashMap weakHashMap = this.activityToFragmentStateMonitorMap;
            object = (FragmentManager$l)weakHashMap.remove(object);
            ((FragmentManager)object2).m0((FragmentManager$l)object);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityResumed(Activity object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object2;
                    block3: {
                        Object object3;
                        block4: {
                            try {
                                object2 = this.activityToResumedMap;
                                boolean bl2 = ((WeakHashMap)object2).isEmpty();
                                if (!bl2) break block3;
                                object2 = this.clock;
                                this.resumeTime = object2 = ((Clock)object2).getTime();
                                object2 = this.activityToResumedMap;
                                object3 = Boolean.TRUE;
                                ((WeakHashMap)object2).put(object, object3);
                                boolean bl3 = this.isColdStart;
                                if (!bl3) break block4;
                                object = ApplicationProcessState.FOREGROUND;
                                this.updateAppState((ApplicationProcessState)object);
                                this.sendAppColdStartUpdate();
                                bl3 = false;
                                object = null;
                                this.isColdStart = false;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        object = Constants$TraceNames.BACKGROUND_TRACE_NAME;
                        object = ((Constants$TraceNames)((Object)object)).toString();
                        object2 = this.stopTime;
                        object3 = this.resumeTime;
                        this.sendSessionLog((String)object, (Timer)object2, (Timer)object3);
                        object = ApplicationProcessState.FOREGROUND;
                        this.updateAppState((ApplicationProcessState)object);
                        break block5;
                    }
                    object2 = this.activityToResumedMap;
                    Boolean bl4 = Boolean.TRUE;
                    ((WeakHashMap)object2).put(object, bl4);
                }
                return;
            }
            throw throwable2;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    Object object;
                    block4: {
                        try {
                            boolean bl2 = this.isScreenTraceSupported();
                            if (!bl2 || !(bl2 = ((ConfigResolver)(object = this.configResolver)).isPerformanceMonitoringEnabled())) break block3;
                            object = this.activityToRecorderMap;
                            bl2 = ((WeakHashMap)object).containsKey(activity);
                            if (bl2) break block4;
                            this.startFrameMonitoring(activity);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = this.activityToRecorderMap;
                    object = ((WeakHashMap)object).get(activity);
                    object = (FrameMetricsRecorder)object;
                    ((FrameMetricsRecorder)object).start();
                    Object object2 = AppStateMonitor.getScreenTraceName(activity);
                    TransportManager transportManager = this.transportManager;
                    Clock clock = this.clock;
                    object = new Trace((String)object2, transportManager, clock, this);
                    ((Trace)object).start();
                    object2 = this.activityToScreenTraceMap;
                    ((WeakHashMap)object2).put(activity, object);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityStopped(Activity object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                boolean bl2;
                block5: {
                    try {
                        bl2 = this.isScreenTraceSupported();
                        if (!bl2) break block5;
                        this.sendScreenTrace((Activity)object);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (bl2 = ((WeakHashMap)(object2 = this.activityToResumedMap)).containsKey(object)) {
                    object2 = this.activityToResumedMap;
                    ((WeakHashMap)object2).remove(object);
                    object = this.activityToResumedMap;
                    boolean bl3 = ((WeakHashMap)object).isEmpty();
                    if (bl3) {
                        object = this.clock;
                        this.stopTime = object = ((Clock)object).getTime();
                        object = Constants$TraceNames.FOREGROUND_TRACE_NAME;
                        object = ((Constants$TraceNames)((Object)object)).toString();
                        object2 = this.resumeTime;
                        Timer timer = this.stopTime;
                        this.sendSessionLog((String)object, (Timer)object2, timer);
                        object = ApplicationProcessState.BACKGROUND;
                        this.updateAppState((ApplicationProcessState)object);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerActivityLifecycleCallbacks(Context context) {
        synchronized (this) {
            Throwable throwable2;
            boolean bl2;
            block7: {
                try {
                    bl2 = this.isRegisteredForLifecycleCallbacks;
                    if (!bl2) break block7;
                }
                catch (Throwable throwable2) {}
                return;
            }
            context = context.getApplicationContext();
            bl2 = context instanceof Application;
            if (bl2) {
                boolean bl3;
                context = (Application)context;
                context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                this.isRegisteredForLifecycleCallbacks = bl3 = true;
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerForAppColdStart(AppStateMonitor$AppColdStartCallback appStateMonitor$AppColdStartCallback) {
        Set set = this.appColdStartSubscribers;
        synchronized (set) {
            Set set2 = this.appColdStartSubscribers;
            set2.add(appStateMonitor$AppColdStartCallback);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerForAppState(WeakReference weakReference) {
        Set set = this.appStateSubscribers;
        synchronized (set) {
            Set set2 = this.appStateSubscribers;
            set2.add(weakReference);
            return;
        }
    }

    public void setIsColdStart(boolean bl2) {
        this.isColdStart = bl2;
    }

    public void setStopTime(Timer timer) {
        this.stopTime = timer;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterActivityLifecycleCallbacks(Context context) {
        synchronized (this) {
            Throwable throwable2;
            boolean bl2;
            block7: {
                try {
                    bl2 = this.isRegisteredForLifecycleCallbacks;
                    if (bl2) break block7;
                }
                catch (Throwable throwable2) {}
                return;
            }
            context = context.getApplicationContext();
            bl2 = context instanceof Application;
            if (bl2) {
                context = (Application)context;
                context.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                context = null;
                this.isRegisteredForLifecycleCallbacks = false;
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterForAppState(WeakReference weakReference) {
        Set set = this.appStateSubscribers;
        synchronized (set) {
            Set set2 = this.appStateSubscribers;
            set2.remove(weakReference);
            return;
        }
    }
}

