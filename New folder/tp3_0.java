/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import org.json.JSONObject;

/*
 * Renamed from Tp3
 */
public final class tp3_0
implements Runnable {
    public final /* synthetic */ TrackerFallback a;
    public final /* synthetic */ JuspayServices b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ LogType d;

    public /* synthetic */ tp3_0(TrackerFallback trackerFallback, JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        this.a = trackerFallback;
        this.b = juspayServices;
        this.c = jSONObject;
        this.d = logType;
    }

    public final void run() {
        JSONObject jSONObject = this.c;
        LogType logType = this.d;
        TrackerFallback trackerFallback = this.a;
        JuspayServices juspayServices = this.b;
        TrackerFallback.a(trackerFallback, juspayServices, jSONObject, logType);
    }
}

