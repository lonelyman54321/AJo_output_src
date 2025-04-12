/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fq2
 */
public final class fq2_1 {
    public static final Trace a;
    public static Trace b;
    public static Trace c;
    public static Trace d;
    public static final Trace e;
    public static Trace f;
    public static final Trace g;
    public static final Trace h;
    public static Trace i;
    public static Trace j;
    public static Trace k;

    static {
        Trace trace = FirebasePerformance.getInstance().newTrace("page_load_app_start");
        String string2 = "newTrace(...)";
        Intrinsics.checkNotNullExpressionValue(trace, string2);
        a = trace;
        trace = FirebasePerformance.getInstance().newTrace("page_load_plp");
        Intrinsics.checkNotNullExpressionValue(trace, string2);
        e = trace;
        trace = FirebasePerformance.getInstance().newTrace("page_load_customer_type");
        Intrinsics.checkNotNullExpressionValue(trace, string2);
        g = trace;
        trace = FirebasePerformance.getInstance().newTrace("application_start_time");
        Intrinsics.checkNotNullExpressionValue(trace, string2);
        h = trace;
    }

    public static void a() {
        Trace trace = i;
        if (trace != null) {
            trace.stop();
        }
        i = null;
    }
}

