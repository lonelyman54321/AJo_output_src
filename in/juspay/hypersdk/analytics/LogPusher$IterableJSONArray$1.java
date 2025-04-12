/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogPusher$IterableJSONArray;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

class LogPusher$IterableJSONArray$1
implements Iterator {
    int curr = 0;
    final /* synthetic */ LogPusher$IterableJSONArray this$0;

    public LogPusher$IterableJSONArray$1(LogPusher$IterableJSONArray iterableJSONArray) {
        this.this$0 = iterableJSONArray;
    }

    public boolean hasNext() {
        int n3 = this.curr;
        JSONArray jSONArray = this.this$0.original;
        int n4 = jSONArray.length();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public JSONObject next() {
        LogPusher$IterableJSONArray logPusher$IterableJSONArray;
        try {
            logPusher$IterableJSONArray = this.this$0;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return null;
        }
        logPusher$IterableJSONArray = logPusher$IterableJSONArray.original;
        int n3 = this.curr;
        int n4 = n3 + 1;
        this.curr = n4;
        return logPusher$IterableJSONArray.optJSONObject(n3);
    }

    public void remove() {
    }
}

