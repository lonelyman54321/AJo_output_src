/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.services.HyperServices;
import org.json.JSONObject;

/*
 * Renamed from Vb1
 */
public final class vb1_1
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ long b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ vb1_1(HyperServices hyperServices, long l2, JSONObject jSONObject) {
        this.a = hyperServices;
        this.b = l2;
        this.c = jSONObject;
    }

    public final void run() {
        long l2 = this.b;
        JSONObject jSONObject = this.c;
        HyperServices.a(this.a, l2, jSONObject);
    }
}

