/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.FirebasePerfApplicationInfoValidator;
import com.google.firebase.perf.metrics.validator.FirebasePerfGaugeMetricValidator;
import com.google.firebase.perf.metrics.validator.FirebasePerfNetworkValidator;
import com.google.firebase.perf.metrics.validator.FirebasePerfTraceValidator;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class PerfMetricValidator {
    private static List getValidators(PerfMetric generatedMessageLite, Context object) {
        boolean bl2;
        Object object2;
        GeneratedMessageLite generatedMessageLite2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl3 = generatedMessageLite.hasTraceMetric();
        if (bl3) {
            generatedMessageLite2 = generatedMessageLite.getTraceMetric();
            object2 = new FirebasePerfTraceValidator((TraceMetric)generatedMessageLite2);
            arrayList.add(object2);
        }
        if (bl3 = generatedMessageLite.hasNetworkRequestMetric()) {
            generatedMessageLite2 = generatedMessageLite.getNetworkRequestMetric();
            object2 = new FirebasePerfNetworkValidator((NetworkRequestMetric)generatedMessageLite2, (Context)object);
            arrayList.add(object2);
        }
        if (bl2 = generatedMessageLite.hasApplicationInfo()) {
            object2 = generatedMessageLite.getApplicationInfo();
            object = new FirebasePerfApplicationInfoValidator((ApplicationInfo)object2);
            arrayList.add(object);
        }
        if (bl2 = generatedMessageLite.hasGaugeMetric()) {
            generatedMessageLite = generatedMessageLite.getGaugeMetric();
            object = new FirebasePerfGaugeMetricValidator((GaugeMetric)generatedMessageLite);
            arrayList.add(object);
        }
        return arrayList;
    }

    public static boolean isValid(PerfMetric iterator, Context object) {
        boolean bl2 = (iterator = PerfMetricValidator.getValidators((PerfMetric)((Object)iterator), (Context)object)).isEmpty();
        if (bl2) {
            AndroidLogger.getInstance().debug("No validators found for PerfMetric.");
            return false;
        }
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            object = (PerfMetricValidator)iterator.next();
            bl2 = ((PerfMetricValidator)object).isValidPerfMetric();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public static void validateAttribute(String object, String object2) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                int n4;
                n3 = ((String)object).length();
                if (n3 <= (n4 = 40)) {
                    int n7 = ((String)object2).length();
                    if (n7 <= (n3 = 100)) {
                        object2 = "^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*";
                        boolean bl2 = ((String)object).matches((String)object2);
                        if (bl2) {
                            return;
                        }
                        object = new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                        throw object;
                    }
                    object2 = Locale.US;
                    object = new IllegalArgumentException("Attribute value length must not exceed 100 characters");
                    throw object;
                }
                object2 = Locale.US;
                object = new IllegalArgumentException("Attribute key length must not exceed 40 characters");
                throw object;
            }
            object = new IllegalArgumentException("Attribute value must not be null or empty");
            throw object;
        }
        object = new IllegalArgumentException("Attribute key must not be null or empty");
        throw object;
    }

    public static String validateMetricName(String object) {
        int n3;
        if (object == null) {
            return "Metric name must not be null";
        }
        int n4 = ((String)object).length();
        if (n4 > (n3 = 100)) {
            object = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        Constants$CounterNames[] constants$CounterNamesArray = "_";
        n4 = (int)(((String)object).startsWith((String)constants$CounterNamesArray) ? 1 : 0);
        n3 = 0;
        if (n4 != 0) {
            constants$CounterNamesArray = Constants$CounterNames.values();
            int n7 = constants$CounterNamesArray.length;
            for (int i3 = 0; i3 < n7; ++i3) {
                String string2 = constants$CounterNamesArray[i3].toString();
                boolean bl2 = string2.equals(object);
                if (!bl2) continue;
                return null;
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public static String validateTraceName(String object) {
        int n3;
        if (object == null) {
            return "Trace name must not be null";
        }
        int n4 = ((String)object).length();
        if (n4 > (n3 = 100)) {
            object = Locale.US;
            return "Trace name must not exceed 100 characters";
        }
        Object object2 = "_";
        n4 = (int)(((String)object).startsWith((String)object2) ? 1 : 0);
        n3 = 0;
        if (n4 != 0) {
            object2 = Constants$TraceNames.values();
            int n7 = ((Constants$TraceNames[])object2).length;
            for (int i3 = 0; i3 < n7; ++i3) {
                String string2 = object2[i3].toString();
                boolean bl2 = string2.equals(object);
                if (!bl2) continue;
                return null;
            }
            object2 = "_st_";
            boolean bl3 = ((String)object).startsWith((String)object2);
            if (bl3) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
        return null;
    }

    public abstract boolean isValidPerfMetric();
}

