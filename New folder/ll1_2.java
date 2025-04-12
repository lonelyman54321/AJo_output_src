/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.core.JsInterface;
import org.json.JSONObject;

/*
 * Renamed from Ll1
 */
public final class ll1_2
implements Runnable {
    public final /* synthetic */ JsInterface a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ String c;

    public /* synthetic */ ll1_2(JsInterface jsInterface, JSONObject jSONObject, String string2) {
        this.a = jsInterface;
        this.b = jSONObject;
        this.c = string2;
    }

    public final void run() {
        JSONObject jSONObject = this.b;
        String string2 = this.c;
        JsInterface.c(this.a, jSONObject, string2);
    }
}

