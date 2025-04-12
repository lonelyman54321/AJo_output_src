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
 * Renamed from yU2
 */
public final class yu2_1
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ String l;
    public final /* synthetic */ JSONArray m;
    public final /* synthetic */ JSONObject n;

    public /* synthetic */ yu2_1(SdkTracker sdkTracker, String string2, String string3, String string4, Integer n3, String string5, String string6, long l2, Long l3, Object object, Object object2, String string7, JSONArray jSONArray, JSONObject jSONObject) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n3;
        this.f = string5;
        this.g = string6;
        this.h = l2;
        this.i = l3;
        this.j = object;
        this.k = object2;
        this.l = string7;
        this.m = jSONArray;
        this.n = jSONObject;
    }

    public final void run() {
        JSONArray jSONArray = this.m;
        JSONObject jSONObject = this.n;
        SdkTracker sdkTracker = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        Integer n3 = this.e;
        String string5 = this.f;
        String string6 = this.g;
        long l2 = this.h;
        Long l3 = this.i;
        Object object = this.j;
        Object object2 = this.k;
        String string7 = this.l;
        SdkTracker.i(sdkTracker, string2, string3, string4, n3, string5, string6, l2, l3, object, object2, string7, jSONArray, jSONObject);
    }
}

