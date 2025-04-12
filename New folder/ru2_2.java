/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.SdkTracker;
import org.json.JSONObject;

/*
 * Renamed from rU2
 */
public final class ru2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ ru2_2(SdkTracker sdkTracker, JSONObject jSONObject) {
        this.a = sdkTracker;
        this.b = jSONObject;
    }

    public final void run() {
        SdkTracker sdkTracker = this.a;
        JSONObject jSONObject = this.b;
        SdkTracker.c(sdkTracker, jSONObject);
    }
}

