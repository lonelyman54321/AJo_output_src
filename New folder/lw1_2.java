/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.analytics.LogPusher;
import org.json.JSONObject;

/*
 * Renamed from Lw1
 */
public final class lw1_2
implements Runnable {
    public final /* synthetic */ LogPusher a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ lw1_2(LogPusher logPusher, String string2, JSONObject jSONObject) {
        this.a = logPusher;
        this.b = string2;
        this.c = jSONObject;
    }

    public final void run() {
        String string2 = this.b;
        JSONObject jSONObject = this.c;
        LogPusher.e(this.a, string2, jSONObject);
    }
}

