/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;

final class FirebasePerfTraceValidator
extends PerfMetricValidator {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final TraceMetric traceMetric;

    public FirebasePerfTraceValidator(TraceMetric traceMetric) {
        this.traceMetric = traceMetric;
    }

    private boolean areAllAttributesValid(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2;
            Object object3 = (Map.Entry)object.next();
            try {
                object2 = object3.getKey();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object3 = logger;
                String string2 = illegalArgumentException.getLocalizedMessage();
                ((AndroidLogger)object3).warn(string2);
                return false;
            }
            object2 = (String)object2;
            object3 = object3.getValue();
            object3 = (String)object3;
            PerfMetricValidator.validateAttribute(object2, (String)object3);
        }
        return true;
    }

    private boolean areCountersValid(TraceMetric traceMetric) {
        return this.areCountersValid(traceMetric, 0);
    }

    private boolean areCountersValid(TraceMetric object, int n3) {
        boolean bl2;
        int n4;
        if (object == null) {
            return false;
        }
        int n7 = 1;
        if (n3 > n7) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        Object object2 = ((TraceMetric)object).getCountersMap().entrySet().iterator();
        while ((n4 = object2.hasNext()) != 0) {
            Map.Entry entry = object2.next();
            Object object3 = (String)entry.getKey();
            boolean bl3 = this.isValidCounterId((String)object3);
            if (!bl3) {
                object = logger;
                CharSequence charSequence = new StringBuilder("invalid CounterId:");
                String string2 = (String)entry.getKey();
                charSequence.append(string2);
                charSequence = charSequence.toString();
                ((AndroidLogger)object).warn((String)charSequence);
                return false;
            }
            object3 = (Long)entry.getValue();
            bl3 = this.isValidCounterValue((Long)object3);
            if (bl3) continue;
            object = logger;
            CharSequence charSequence = new StringBuilder("invalid CounterValue:");
            Object v4 = entry.getValue();
            charSequence.append(v4);
            charSequence = charSequence.toString();
            ((AndroidLogger)object).warn((String)charSequence);
            return false;
        }
        object = ((TraceMetric)object).getSubtracesList().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (TraceMetric)object.next();
            bl2 = this.areCountersValid((TraceMetric)object2, n4 = n3 + 1);
            if (bl2) continue;
            return false;
        }
        return n7;
    }

    private boolean hasCounters(TraceMetric object) {
        int n3 = ((TraceMetric)object).getCountersCount();
        boolean bl2 = true;
        if (n3 > 0) {
            return bl2;
        }
        object = ((TraceMetric)object).getSubtracesList().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            TraceMetric traceMetric = (TraceMetric)object.next();
            n3 = traceMetric.getCountersCount();
            if (n3 <= 0) continue;
            return bl2;
        }
        return false;
    }

    private boolean isScreenTrace(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith("_st_");
    }

    private boolean isValidCounterId(String string2) {
        if (string2 == null) {
            return false;
        }
        int n3 = (string2 = string2.trim()).isEmpty();
        if (n3 != 0) {
            logger.warn("counterId is empty");
            return false;
        }
        int n4 = string2.length();
        if (n4 > (n3 = 100)) {
            logger.warn("counterId exceeded max length 100");
            return false;
        }
        return true;
    }

    private boolean isValidCounterValue(Long l2) {
        boolean bl2;
        if (l2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            l2 = null;
        }
        return bl2;
    }

    private boolean isValidScreenTrace(TraceMetric object) {
        long l2;
        int n3;
        object = ((TraceMetric)object).getCountersMap();
        Object object2 = Constants$CounterNames.FRAMES_TOTAL.toString();
        if ((object = (Long)object.get(object2)) != null && (n3 = ((Long)object).compareTo((Long)(object2 = Long.valueOf(l2 = 0L)))) > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    private boolean isValidTrace(TraceMetric object, int n3) {
        boolean bl2;
        if (object == null) {
            logger.warn("TraceMetric is null");
            return false;
        }
        int n4 = 1;
        if (n3 > n4) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        Object object2 = ((TraceMetric)object).getName();
        boolean bl3 = this.isValidTraceId((String)object2);
        if (!bl3) {
            AndroidLogger androidLogger = logger;
            StringBuilder stringBuilder = new StringBuilder("invalid TraceId:");
            object = ((TraceMetric)object).getName();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            androidLogger.warn((String)object);
            return false;
        }
        bl3 = this.isValidTraceDuration((TraceMetric)object);
        if (!bl3) {
            AndroidLogger androidLogger = logger;
            StringBuilder stringBuilder = new StringBuilder("invalid TraceDuration:");
            long l2 = ((TraceMetric)object).getDurationUs();
            stringBuilder.append(l2);
            object = stringBuilder.toString();
            androidLogger.warn((String)object);
            return false;
        }
        bl3 = ((TraceMetric)object).hasClientStartTimeUs();
        if (!bl3) {
            logger.warn("clientStartTimeUs is null.");
            return false;
        }
        bl3 = this.isScreenTrace((TraceMetric)object);
        if (bl3 && !(bl3 = this.isValidScreenTrace((TraceMetric)object))) {
            AndroidLogger androidLogger = logger;
            StringBuilder stringBuilder = new StringBuilder("non-positive totalFrames in screen trace ");
            object = ((TraceMetric)object).getName();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            androidLogger.warn((String)object);
            return false;
        }
        object2 = ((TraceMetric)object).getSubtracesList().iterator();
        while (bl2 = object2.hasNext()) {
            int n7;
            TraceMetric traceMetric = (TraceMetric)object2.next();
            bl2 = this.isValidTrace(traceMetric, n7 = n3 + 1);
            if (bl2) continue;
            return false;
        }
        boolean bl4 = this.areAllAttributesValid((Map)(object = ((TraceMetric)object).getCustomAttributesMap()));
        if (!bl4) {
            return false;
        }
        return n4;
    }

    private boolean isValidTraceDuration(TraceMetric traceMetric) {
        long l2;
        long l3;
        long l4;
        int n3;
        if (traceMetric != null && (n3 = (l4 = (l3 = traceMetric.getDurationUs()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            traceMetric = null;
        }
        return n3 != 0;
    }

    private boolean isValidTraceId(String string2) {
        int n3;
        boolean bl2 = false;
        if (string2 == null) {
            return false;
        }
        int n4 = (string2 = string2.trim()).isEmpty();
        if (n4 == 0 && (n3 = string2.length()) <= (n4 = 100)) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isValidPerfMetric() {
        Object object = this.traceMetric;
        boolean bl2 = this.isValidTrace((TraceMetric)object, 0);
        if (!bl2) {
            object = logger;
            CharSequence charSequence = new StringBuilder("Invalid Trace:");
            String string2 = this.traceMetric.getName();
            charSequence.append(string2);
            charSequence = charSequence.toString();
            ((AndroidLogger)object).warn((String)charSequence);
            return false;
        }
        object = this.traceMetric;
        bl2 = this.hasCounters((TraceMetric)object);
        if (bl2 && !(bl2 = this.areCountersValid((TraceMetric)(object = this.traceMetric)))) {
            object = logger;
            CharSequence charSequence = new StringBuilder("Invalid Counters for Trace:");
            String string3 = this.traceMetric.getName();
            charSequence.append(string3);
            charSequence = charSequence.toString();
            ((AndroidLogger)object).warn((String)charSequence);
            return false;
        }
        return true;
    }
}

