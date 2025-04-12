/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils.network;

import in.juspay.hypersdk.utils.network.NetworkSummarizer$Metric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class NetworkSummarizer$Summary {
    private final String avgLatency;
    private final List metrics;
    private final String sessionId;
    private final String updateId;
    private final boolean updated;

    public NetworkSummarizer$Summary(String string2, String string3, String string4, List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "avgLatency");
        Intrinsics.checkNotNullParameter(string3, "sessionId");
        Intrinsics.checkNotNullParameter(string4, "updateId");
        Intrinsics.checkNotNullParameter(list, "metrics");
        this.avgLatency = string2;
        this.sessionId = string3;
        this.updateId = string4;
        this.metrics = list;
        this.updated = bl2;
    }

    public static /* synthetic */ NetworkSummarizer$Summary copy$default(NetworkSummarizer$Summary networkSummarizer$Summary, String string2, String object, String string3, List object2, boolean bl2, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = networkSummarizer$Summary.avgLatency;
        }
        if ((n4 = n3 & 2) != 0) {
            object = networkSummarizer$Summary.sessionId;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = networkSummarizer$Summary.updateId;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = networkSummarizer$Summary.metrics;
        }
        List list = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = networkSummarizer$Summary.updated;
        }
        object = networkSummarizer$Summary;
        string3 = string2;
        object2 = object3;
        n4 = (int)(bl2 ? 1 : 0);
        return networkSummarizer$Summary.copy(string2, (String)object3, string4, list, bl2);
    }

    public final String component1() {
        return this.avgLatency;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.updateId;
    }

    public final List component4() {
        return this.metrics;
    }

    public final boolean component5() {
        return this.updated;
    }

    public final NetworkSummarizer$Summary copy(String string2, String string3, String string4, List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "avgLatency");
        Intrinsics.checkNotNullParameter(string3, "sessionId");
        Intrinsics.checkNotNullParameter(string4, "updateId");
        Intrinsics.checkNotNullParameter(list, "metrics");
        NetworkSummarizer$Summary networkSummarizer$Summary = new NetworkSummarizer$Summary(string2, string3, string4, list, bl2);
        return networkSummarizer$Summary;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NetworkSummarizer$Summary;
        if (!bl3) {
            return false;
        }
        object = (NetworkSummarizer$Summary)object;
        Object object2 = this.avgLatency;
        Object object3 = ((NetworkSummarizer$Summary)object).avgLatency;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sessionId;
        object3 = ((NetworkSummarizer$Summary)object).sessionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.updateId;
        object3 = ((NetworkSummarizer$Summary)object).updateId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metrics;
        object3 = ((NetworkSummarizer$Summary)object).metrics;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.updated;
        boolean bl4 = ((NetworkSummarizer$Summary)object).updated;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAvgLatency() {
        return this.avgLatency;
    }

    public final List getMetrics() {
        return this.metrics;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUpdateId() {
        return this.updateId;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        String string2 = this.avgLatency;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.sessionId;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.updateId;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.metrics;
        n3 = ne_0.a(n3, n4, (List)object);
        n4 = (int)(this.updated ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        return n3 + n4;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        Iterator iterator = this.avgLatency;
        jSONObject = jSONObject.put("avg_latency", (Object)iterator);
        iterator = this.sessionId;
        jSONObject = jSONObject.put("session_id", (Object)iterator);
        iterator = this.updateId;
        jSONObject = jSONObject.put("update_id", (Object)iterator);
        iterator = this.metrics;
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            JSONObject jSONObject2 = ((NetworkSummarizer$Metric)iterator.next()).toJSON();
            arrayList.add(jSONObject2);
        }
        jSONObject = jSONObject.put("metrics", arrayList);
        boolean bl2 = this.updated;
        jSONObject = jSONObject.put("updated", bl2);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026 .put(\"updated\", updated)");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Summary(avgLatency=");
        Object object = this.avgLatency;
        stringBuilder.append((String)object);
        stringBuilder.append(", sessionId=");
        object = this.sessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", updateId=");
        object = this.updateId;
        stringBuilder.append((String)object);
        stringBuilder.append(", metrics=");
        object = this.metrics;
        stringBuilder.append(object);
        stringBuilder.append(", updated=");
        boolean bl2 = this.updated;
        return AR.a(stringBuilder, bl2, ')');
    }
}

