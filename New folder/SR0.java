/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.Transformer;
import com.google.firebase.perf.v1.PerfMetric;

public final class SR0
implements Transformer {
    public final Object apply(Object object) {
        return ((PerfMetric)object).toByteArray();
    }
}

