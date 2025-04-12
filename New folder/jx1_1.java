/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import org.json.JSONObject;

/*
 * Renamed from jx1
 */
public final class jx1_1
implements Runnable {
    public final /* synthetic */ LogSessioniserExp a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ jx1_1(LogSessioniserExp logSessioniserExp, JSONObject jSONObject) {
        this.a = logSessioniserExp;
        this.b = jSONObject;
    }

    public final void run() {
        LogSessioniserExp logSessioniserExp = this.a;
        JSONObject jSONObject = this.b;
        LogSessioniserExp.d(logSessioniserExp, jSONObject);
    }
}

