/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.util.SparseIntArray
 */
package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.FrameMetricsCalculator$PerfFrameMetrics;
import com.google.firebase.perf.util.Optional;
import java.util.HashMap;
import java.util.Map;

public class FrameMetricsRecorder {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Activity activity;
    private final Map fragmentSnapshotMap;
    private final RW0 frameMetricsAggregator;
    private boolean isRecording;

    public FrameMetricsRecorder(Activity activity) {
        RW0 rW0 = new RW0();
        HashMap hashMap = new HashMap();
        this(activity, rW0, hashMap);
    }

    public FrameMetricsRecorder(Activity activity, RW0 rW0, Map map2) {
        this.isRecording = false;
        this.activity = activity;
        this.frameMetricsAggregator = rW0;
        this.fragmentSnapshotMap = map2;
    }

    public static boolean isFrameMetricsRecordingSupported() {
        return true;
    }

    private Optional snapshot() {
        boolean bl2 = this.isRecording;
        if (!bl2) {
            logger.debug("No recording has been started.");
            return Optional.absent();
        }
        SparseIntArray[] sparseIntArrayArray = this.frameMetricsAggregator.a.b();
        if (sparseIntArrayArray == null) {
            logger.debug("FrameMetricsAggregator.mMetrics is uninitialized.");
            return Optional.absent();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArray[0];
        if (sparseIntArray == null) {
            logger.debug("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return Optional.absent();
        }
        return Optional.of(FrameMetricsCalculator.calculateFrameMetrics(sparseIntArrayArray));
    }

    public void start() {
        int n3 = 1;
        boolean bl2 = this.isRecording;
        if (bl2) {
            AndroidLogger androidLogger = logger;
            String string2 = this.activity.getClass().getSimpleName();
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            androidLogger.debug("FrameMetricsAggregator is already recording %s", objectArray);
            return;
        }
        RW0 rW0 = this.frameMetricsAggregator;
        Activity activity = this.activity;
        rW0.a.a(activity);
        this.isRecording = n3;
    }

    public void startFragment(Fragment object) {
        Map map2 = null;
        int n3 = 1;
        boolean bl2 = this.isRecording;
        if (!bl2) {
            logger.debug("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Object object2 = this.fragmentSnapshotMap;
        bl2 = object2.containsKey(object);
        if (bl2) {
            object2 = logger;
            object = object.getClass().getSimpleName();
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).debug("Cannot start sub-recording because one is already ongoing with the key %s", objectArray);
            return;
        }
        object2 = this.snapshot();
        boolean bl3 = ((Optional)object2).isAvailable();
        if (!bl3) {
            object2 = logger;
            object = object.getClass().getSimpleName();
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).debug("startFragment(%s): snapshot() failed", objectArray);
            return;
        }
        map2 = this.fragmentSnapshotMap;
        FrameMetricsCalculator$PerfFrameMetrics frameMetricsCalculator$PerfFrameMetrics = (FrameMetricsCalculator$PerfFrameMetrics)((Optional)object2).get();
        map2.put(object, frameMetricsCalculator$PerfFrameMetrics);
    }

    public Optional stop() {
        Object object;
        block9: {
            int n3;
            Object object2;
            boolean bl2 = this.isRecording;
            if (!bl2) {
                logger.debug("Cannot stop because no recording was started");
                return Optional.absent();
            }
            object = this.fragmentSnapshotMap;
            bl2 = object.isEmpty();
            if (!bl2) {
                object = logger;
                object2 = "Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.";
                ((AndroidLogger)object).debug((String)object2);
                object = this.fragmentSnapshotMap;
                object.clear();
            }
            object = this.snapshot();
            object2 = this.frameMetricsAggregator;
            Object[] objectArray = this.activity;
            object2 = ((RW0)object2).a;
            try {
                ((RW0$b)object2).c((Activity)objectArray);
                break block9;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
            int n4 = object instanceof NullPointerException;
            if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) > (n3 = 28)) {
                throw (Throwable)object;
            }
            object2 = logger;
            object = object.toString();
            n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).warn("View not hardware accelerated. Unable to collect FrameMetrics. %s", objectArray);
            object = Optional.absent();
        }
        this.frameMetricsAggregator.a.d();
        this.isRecording = false;
        return object;
    }

    public Optional stopFragment(Fragment object) {
        int n3 = 1;
        boolean bl2 = this.isRecording;
        if (!bl2) {
            logger.debug("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.absent();
        }
        Object object2 = this.fragmentSnapshotMap;
        bl2 = object2.containsKey(object);
        if (!bl2) {
            object2 = logger;
            object = object.getClass().getSimpleName();
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).debug("Sub-recording associated with key %s was not started or does not exist", objectArray);
            return Optional.absent();
        }
        object2 = (FrameMetricsCalculator$PerfFrameMetrics)this.fragmentSnapshotMap.remove(object);
        Optional optional = this.snapshot();
        boolean bl3 = optional.isAvailable();
        if (!bl3) {
            object2 = logger;
            object = object.getClass().getSimpleName();
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).debug("stopFragment(%s): snapshot() failed", objectArray);
            return Optional.absent();
        }
        return Optional.of(((FrameMetricsCalculator$PerfFrameMetrics)optional.get()).deltaFrameMetricsFromSnapshot((FrameMetricsCalculator$PerfFrameMetrics)object2));
    }
}

