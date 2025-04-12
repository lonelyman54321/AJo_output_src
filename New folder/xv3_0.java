/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.n;

/*
 * Renamed from xv3
 */
public final class xv3_0
implements Cr0 {
    public final /* synthetic */ mu1_1 a;
    public final /* synthetic */ n b;

    public xv3_0(mu1_1 mu1_12, Iu3 iu3) {
        this.a = mu1_12;
        this.b = iu3;
    }

    public final void dispose() {
        i i3 = this.a.getLifecycle();
        n n3 = this.b;
        i3.c(n3);
    }
}

