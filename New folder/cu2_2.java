/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.SdkTracker;
import org.json.JSONObject;

/*
 * Renamed from CU2
 */
public final class cu2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ JSONObject e;

    public /* synthetic */ cu2_2(SdkTracker sdkTracker, String string2, String string3, String string4, JSONObject jSONObject) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = jSONObject;
    }

    public final void run() {
        String string2 = this.d;
        JSONObject jSONObject = this.e;
        SdkTracker sdkTracker = this.a;
        String string3 = this.b;
        String string4 = this.c;
        SdkTracker.k(sdkTracker, string3, string4, string2, jSONObject);
    }
}

