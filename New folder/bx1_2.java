/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.analytics.LogSessioniser;
import org.json.JSONObject;

/*
 * Renamed from bx1
 */
public final class bx1_2
implements Runnable {
    public final /* synthetic */ LogSessioniser a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ bx1_2(LogSessioniser logSessioniser, JSONObject jSONObject) {
        this.a = logSessioniser;
        this.b = jSONObject;
    }

    public final void run() {
        LogSessioniser logSessioniser = this.a;
        JSONObject jSONObject = this.b;
        LogSessioniser.a(logSessioniser, jSONObject);
    }
}

