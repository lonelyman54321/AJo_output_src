/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.n;

/*
 * Renamed from lC3
 */
public final class lc3_2
implements Cr0 {
    public final /* synthetic */ mu1_1 a;
    public final /* synthetic */ n b;

    public lc3_2(mu1_1 mu1_12, hc3_2 hc3_22) {
        this.a = mu1_12;
        this.b = hc3_22;
    }

    public final void dispose() {
        i i3 = this.a.getLifecycle();
        n n3 = this.b;
        i3.c(n3);
    }
}

