/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.utils.network;

import in.juspay.hypersdk.utils.network.NetworkSummarizer$Metric;
import in.juspay.hypersdk.utils.network.NetworkSummarizer$Summary;
import java.net.URL;
import java.util.List;
import java.util.Vector;
import kotlin.jvm.internal.Intrinsics;

public final class NetworkSummarizer {
    private List metrics;
    private long totalLatency;

    public NetworkSummarizer() {
        Vector vector;
        this.metrics = vector = new Vector();
    }

    public final void addMetric(cl2_2 object, long l2) {
        long l3;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "response");
        URL uRL = ((cl2_2)object).a.a.k();
        this.totalLatency = l3 = this.totalLatency + l2;
        Intrinsics.checkNotNullExpressionValue(uRL, "url");
        cl2_2 cl2_22 = ((cl2_2)object).h;
        int n4 = cl2_22 != null ? cl2_22.d : ((cl2_2)object).d;
        Object object2 = l2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object2 = xh2_0.a(objectArray, n3, "%dms", "format(this, *args)");
        object = ((cl2_2)object).b("x-cache");
        NetworkSummarizer$Metric networkSummarizer$Metric = new NetworkSummarizer$Metric(uRL, n4, (String)object2, (String)object);
        this.metrics.add(networkSummarizer$Metric);
    }

    public final NetworkSummarizer$Summary publishSummary(String vector, String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(vector, "sessionId");
        Intrinsics.checkNotNullParameter(string2, "updateId");
        long l2 = this.totalLatency;
        long l3 = this.metrics.size();
        int n3 = (int)(l2 / l3);
        int n4 = 1;
        Object object = Math.max(n4, n3);
        Object object2 = new Object[n4];
        object2[0] = object;
        object = xh2_0.a(object2, n4, "%dms", "format(this, *args)");
        List list = this.metrics;
        object2 = vector;
        NetworkSummarizer$Summary networkSummarizer$Summary = new NetworkSummarizer$Summary((String)object, (String)((Object)vector), string2, list, bl2);
        this.metrics = vector = new Vector();
        this.totalLatency = 0L;
        return networkSummarizer$Summary;
    }
}

