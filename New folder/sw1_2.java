/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.analytics.LogPusherExp;
import org.json.JSONObject;

/*
 * Renamed from Sw1
 */
public final class sw1_2
implements Runnable {
    public final /* synthetic */ LogPusherExp a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ sw1_2(LogPusherExp logPusherExp, JSONObject jSONObject) {
        this.a = logPusherExp;
        this.b = jSONObject;
    }

    public final void run() {
        LogPusherExp logPusherExp = this.a;
        JSONObject jSONObject = this.b;
        LogPusherExp.e(logPusherExp, jSONObject);
    }
}

