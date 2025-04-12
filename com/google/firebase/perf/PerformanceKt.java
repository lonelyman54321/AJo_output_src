/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf;

import com.google.firebase.Firebase;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PerformanceKt {
    public static final FirebasePerformance getPerformance(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebasePerformance.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final Object trace(Trace trace, Function1 object) {
        Intrinsics.checkNotNullParameter(trace, "<this>");
        String string2 = "block";
        Intrinsics.checkNotNullParameter(object, string2);
        trace.start();
        int n3 = 1;
        try {
            object = object.invoke(trace);
            return object;
        }
        finally {
            InlineMarker.finallyStart(n3);
            trace.stop();
            InlineMarker.finallyEnd(n3);
        }
    }

    public static final Object trace(String object, Function1 object2) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(object2, "block");
        object = Trace.create((String)object);
        String string2 = "create(name)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        ((Trace)object).start();
        int n3 = 1;
        try {
            object2 = object2.invoke(object);
            return object2;
        }
        finally {
            InlineMarker.finallyStart(n3);
            ((Trace)object).stop();
            InlineMarker.finallyEnd(n3);
        }
    }

    public static final void trace(HttpMetric httpMetric, Function1 function1) {
        Intrinsics.checkNotNullParameter(httpMetric, "<this>");
        String string2 = "block";
        Intrinsics.checkNotNullParameter(function1, string2);
        httpMetric.start();
        int n3 = 1;
        try {
            function1.invoke(httpMetric);
            return;
        }
        finally {
            InlineMarker.finallyStart(n3);
            httpMetric.stop();
            InlineMarker.finallyEnd(n3);
        }
    }
}

