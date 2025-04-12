/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogPusher$IterableJSONArray$1;
import java.util.Iterator;
import org.json.JSONArray;

class LogPusher$IterableJSONArray
implements Iterable {
    JSONArray original;

    public LogPusher$IterableJSONArray(JSONArray jSONArray) {
        this.original = jSONArray;
    }

    public Iterator iterator() {
        LogPusher$IterableJSONArray$1 logPusher$IterableJSONArray$1 = new LogPusher$IterableJSONArray$1(this);
        return logPusher$IterableJSONArray$1;
    }
}

