/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JBridge;

/*
 * Renamed from Ik1
 */
public final class ik1_2
implements Runnable {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ String b;

    public /* synthetic */ ik1_2(JBridge jBridge, String string2) {
        this.a = jBridge;
        this.b = string2;
    }

    public final void run() {
        JBridge jBridge = this.a;
        String string2 = this.b;
        JBridge.s(jBridge, string2);
    }
}

