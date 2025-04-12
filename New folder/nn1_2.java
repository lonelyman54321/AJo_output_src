/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from nn1
 */
public final class nn1_2
implements Runnable {
    public final /* synthetic */ JuspayServices a;
    public final /* synthetic */ String b;

    public /* synthetic */ nn1_2(JuspayServices juspayServices, String string2) {
        this.a = juspayServices;
        this.b = string2;
    }

    public final void run() {
        JuspayServices juspayServices = this.a;
        String string2 = this.b;
        JuspayServices.b(juspayServices, string2);
    }
}

