/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.analytics.LogSessioniser;
import org.json.JSONObject;

/*
 * Renamed from ax1
 */
public final class ax1_2
implements Runnable {
    public final /* synthetic */ LogSessioniser a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ String c;

    public /* synthetic */ ax1_2(LogSessioniser logSessioniser, JSONObject jSONObject, String string2) {
        this.a = logSessioniser;
        this.b = jSONObject;
        this.c = string2;
    }

    public final void run() {
        JSONObject jSONObject = this.b;
        String string2 = this.c;
        LogSessioniser.e(this.a, jSONObject, string2);
    }
}

