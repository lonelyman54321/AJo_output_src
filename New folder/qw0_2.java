/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.DuiInterface;

/*
 * Renamed from qw0
 */
public final class qw0_2
implements Runnable {
    public final /* synthetic */ DuiInterface a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ qw0_2(DuiInterface duiInterface, int n3, String string2) {
        this.a = duiInterface;
        this.b = n3;
        this.c = string2;
    }

    public final void run() {
        int n3 = this.b;
        String string2 = this.c;
        DuiInterface.d(this.a, n3, string2);
    }
}

