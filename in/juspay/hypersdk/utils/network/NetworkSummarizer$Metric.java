/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils.network;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class NetworkSummarizer$Metric {
    private final String latency;
    private final int status;
    private final URL url;
    private final String xCache;

    public NetworkSummarizer$Metric(URL uRL, int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(uRL, "url");
        Intrinsics.checkNotNullParameter(string2, "latency");
        this.url = uRL;
        this.status = n3;
        this.latency = string2;
        this.xCache = string3;
    }

    public static /* synthetic */ NetworkSummarizer$Metric copy$default(NetworkSummarizer$Metric networkSummarizer$Metric, URL uRL, int n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            uRL = networkSummarizer$Metric.url;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = networkSummarizer$Metric.status;
        }
        if ((n7 = n4 & 4) != 0) {
            string2 = networkSummarizer$Metric.latency;
        }
        if ((n4 &= 8) != 0) {
            string3 = networkSummarizer$Metric.xCache;
        }
        return networkSummarizer$Metric.copy(uRL, n3, string2, string3);
    }

    public final URL component1() {
        return this.url;
    }

    public final int component2() {
        return this.status;
    }

    public final String component3() {
        return this.latency;
    }

    public final String component4() {
        return this.xCache;
    }

    public final NetworkSummarizer$Metric copy(URL uRL, int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(uRL, "url");
        Intrinsics.checkNotNullParameter(string2, "latency");
        NetworkSummarizer$Metric networkSummarizer$Metric = new NetworkSummarizer$Metric(uRL, n3, string2, string3);
        return networkSummarizer$Metric;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof NetworkSummarizer$Metric;
        if (n3 == 0) {
            return false;
        }
        object = (NetworkSummarizer$Metric)object;
        Object object2 = this.url;
        Object object3 = ((NetworkSummarizer$Metric)object).url;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.status;
        int n4 = ((NetworkSummarizer$Metric)object).status;
        if (n3 != n4) {
            return false;
        }
        object2 = this.latency;
        object3 = ((NetworkSummarizer$Metric)object).latency;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.xCache;
        object = ((NetworkSummarizer$Metric)object).xCache;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getLatency() {
        return this.latency;
    }

    public final int getStatus() {
        return this.status;
    }

    public final URL getUrl() {
        return this.url;
    }

    public final String getXCache() {
        return this.xCache;
    }

    public int hashCode() {
        URL uRL = this.url;
        int n3 = uRL.hashCode();
        int n4 = 31;
        n3 *= 31;
        int n7 = this.status;
        n3 = (n3 + n7) * 31;
        String string2 = this.latency;
        n3 = zy_2.b(n3, n4, string2);
        String string3 = this.xCache;
        if (string3 == null) {
            n4 = 0;
            string3 = null;
        } else {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.url.toString();
        jSONObject = jSONObject.put("url", (Object)string2);
        int n3 = this.status;
        jSONObject = jSONObject.put("status", n3);
        string2 = this.latency;
        String string3 = "latency";
        jSONObject = jSONObject.put(string3, (Object)string2);
        string2 = this.xCache;
        if (string2 == null) {
            string2 = "NA";
        }
        jSONObject = jSONObject.put("x_cache", (Object)string2);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026x_cache\", xCache ?: \"NA\")");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metric(url=");
        Object object = this.url;
        stringBuilder.append(object);
        stringBuilder.append(", status=");
        int n3 = this.status;
        stringBuilder.append(n3);
        stringBuilder.append(", latency=");
        object = this.latency;
        stringBuilder.append((String)object);
        stringBuilder.append(", xCache=");
        object = this.xCache;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

