/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.SdkTracker;
import org.json.JSONObject;

/*
 * Renamed from uU2
 */
public final class uu2_1
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ uu2_1(SdkTracker sdkTracker, JSONObject jSONObject) {
        this.a = sdkTracker;
        this.b = jSONObject;
    }

    public final void run() {
        SdkTracker sdkTracker = this.a;
        JSONObject jSONObject = this.b;
        SdkTracker.m(sdkTracker, jSONObject);
    }
}

