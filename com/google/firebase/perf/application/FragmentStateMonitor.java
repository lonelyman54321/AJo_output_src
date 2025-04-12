/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$l;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.FrameMetricsRecorder;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator$PerfFrameMetrics;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.WeakHashMap;

public class FragmentStateMonitor
extends FragmentManager$l {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final FrameMetricsRecorder activityFramesRecorder;
    private final AppStateMonitor appStateMonitor;
    private final Clock clock;
    private final WeakHashMap fragmentToTraceMap;
    private final TransportManager transportManager;

    public FragmentStateMonitor(Clock clock, TransportManager transportManager, AppStateMonitor appStateMonitor, FrameMetricsRecorder frameMetricsRecorder) {
        WeakHashMap weakHashMap;
        this.fragmentToTraceMap = weakHashMap = new WeakHashMap();
        this.clock = clock;
        this.transportManager = transportManager;
        this.appStateMonitor = appStateMonitor;
        this.activityFramesRecorder = frameMetricsRecorder;
    }

    public String getFragmentScreenTraceName(Fragment object) {
        object = object.getClass().getSimpleName();
        return "_st_".concat((String)object);
    }

    public WeakHashMap getFragmentToTraceMap() {
        return this.fragmentToTraceMap;
    }

    public void onFragmentPaused(FragmentManager object, Fragment object2) {
        super.onFragmentPaused((FragmentManager)object, (Fragment)object2);
        object = logger;
        Object[] objectArray = object2.getClass().getSimpleName();
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = objectArray;
        ((AndroidLogger)object).debug("FragmentMonitor %s.onFragmentPaused ", (Object[])object3);
        objectArray = this.fragmentToTraceMap;
        boolean bl2 = objectArray.containsKey(object2);
        if (!bl2) {
            object2 = object2.getClass().getSimpleName();
            objectArray = new Object[n3];
            objectArray[0] = object2;
            ((AndroidLogger)object).warn("FragmentMonitor: missed a fragment trace from %s", objectArray);
            return;
        }
        objectArray = (Trace)this.fragmentToTraceMap.get(object2);
        this.fragmentToTraceMap.remove(object2);
        object3 = this.activityFramesRecorder.stopFragment((Fragment)object2);
        boolean bl3 = ((Optional)object3).isAvailable();
        if (!bl3) {
            object2 = object2.getClass().getSimpleName();
            objectArray = new Object[n3];
            objectArray[0] = object2;
            ((AndroidLogger)object).warn("onFragmentPaused: recorder failed to trace %s", objectArray);
            return;
        }
        object = (FrameMetricsCalculator$PerfFrameMetrics)((Optional)object3).get();
        ScreenTraceUtil.addFrameCounters((Trace)objectArray, (FrameMetricsCalculator$PerfFrameMetrics)object);
        objectArray.stop();
    }

    public void onFragmentResumed(FragmentManager object, Fragment fragment) {
        super.onFragmentResumed((FragmentManager)object, fragment);
        object = logger;
        Object object2 = fragment.getClass().getSimpleName();
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        ((AndroidLogger)object).debug("FragmentMonitor %s.onFragmentResumed", object3);
        object2 = this.getFragmentScreenTraceName(fragment);
        object3 = this.transportManager;
        Clock clock = this.clock;
        AppStateMonitor appStateMonitor = this.appStateMonitor;
        object = new Trace((String)object2, (TransportManager)object3, clock, appStateMonitor);
        ((Trace)object).start();
        object2 = fragment.getParentFragment();
        object2 = object2 == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName();
        object3 = "Parent_fragment";
        ((Trace)object).putAttribute((String)object3, (String)object2);
        object2 = fragment.getActivity();
        if (object2 != null) {
            object2 = fragment.getActivity().getClass().getSimpleName();
            object3 = "Hosting_activity";
            ((Trace)object).putAttribute((String)object3, (String)object2);
        }
        this.fragmentToTraceMap.put(fragment, object);
        this.activityFramesRecorder.startFragment(fragment);
    }
}

