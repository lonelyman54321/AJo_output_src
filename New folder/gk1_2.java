/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JBridge;

/*
 * Renamed from Gk1
 */
public final class gk1_2
implements Runnable {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ gk1_2(JBridge jBridge, String string2, String string3, int n3, String string4, String string5, boolean bl2) {
        this.a = jBridge;
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = string4;
        this.f = string5;
        this.g = bl2;
    }

    public final void run() {
        String string2 = this.f;
        boolean bl2 = this.g;
        JBridge jBridge = this.a;
        String string3 = this.b;
        String string4 = this.c;
        int n3 = this.d;
        String string5 = this.e;
        JBridge.o(jBridge, string3, string4, n3, string5, string2, bl2);
    }
}

