/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.SdkTracker;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from AU2
 */
public final class au2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Throwable d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ JSONArray m;
    public final /* synthetic */ JSONObject n;

    public /* synthetic */ au2_2(SdkTracker sdkTracker, String string2, String string3, Throwable throwable, String string4, String string5, String string6, Long l2, Long l3, Object object, String string7, String string8, JSONArray jSONArray, JSONObject jSONObject) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = throwable;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = l2;
        this.i = l3;
        this.j = object;
        this.k = string7;
        this.l = string8;
        this.m = jSONArray;
        this.n = jSONObject;
    }

    public final void run() {
        JSONArray jSONArray = this.m;
        JSONObject jSONObject = this.n;
        SdkTracker sdkTracker = this.a;
        String string2 = this.b;
        String string3 = this.c;
        Throwable throwable = this.d;
        String string4 = this.e;
        String string5 = this.f;
        String string6 = this.g;
        Long l2 = this.h;
        Long l3 = this.i;
        Object object = this.j;
        String string7 = this.k;
        String string8 = this.l;
        SdkTracker.p(sdkTracker, string2, string3, throwable, string4, string5, string6, l2, l3, object, string7, string8, jSONArray, jSONObject);
    }
}

