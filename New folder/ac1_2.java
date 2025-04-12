/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.services.HyperServices;
import org.json.JSONObject;

/*
 * Renamed from ac1
 */
public final class ac1_2
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ long b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ HyperPaymentsCallback d;

    public /* synthetic */ ac1_2(HyperServices hyperServices, long l2, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.a = hyperServices;
        this.b = l2;
        this.c = jSONObject;
        this.d = hyperPaymentsCallback;
    }

    public final void run() {
        JSONObject jSONObject = this.c;
        HyperPaymentsCallback hyperPaymentsCallback = this.d;
        HyperServices hyperServices = this.a;
        long l2 = this.b;
        HyperServices.g(hyperServices, l2, jSONObject, hyperPaymentsCallback);
    }
}

