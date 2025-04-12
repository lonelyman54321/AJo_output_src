/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.services.HyperServices;
import org.json.JSONObject;

/*
 * Renamed from Xb1
 */
public final class xb1_1
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ xb1_1(HyperServices hyperServices, JSONObject jSONObject) {
        this.a = hyperServices;
        this.b = jSONObject;
    }

    public final void run() {
        HyperServices hyperServices = this.a;
        JSONObject jSONObject = this.b;
        HyperServices.i(hyperServices, jSONObject);
    }
}

