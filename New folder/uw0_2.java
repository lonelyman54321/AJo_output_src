/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.DuiInterface;

/*
 * Renamed from uw0
 */
public final class uw0_2
implements Runnable {
    public final /* synthetic */ DuiInterface a;
    public final /* synthetic */ String b;

    public /* synthetic */ uw0_2(DuiInterface duiInterface, String string2) {
        this.a = duiInterface;
        this.b = string2;
    }

    public final void run() {
        DuiInterface duiInterface = this.a;
        String string2 = this.b;
        DuiInterface.l(duiInterface, string2);
    }
}

