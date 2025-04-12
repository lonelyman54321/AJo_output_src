/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.collections.CollectionsKt;

public final class Vk2
implements Er1 {
    public final Cl2 a;
    public final int b;

    public Vk2(hm0_0 hm0_02, int n3) {
        this.a = hm0_02;
        this.b = n3;
    }

    public final void a() {
        hi2_0 hi2_02 = (hi2_0)this.a.w.getValue();
        if (hi2_02 != null) {
            hi2_02.f();
        }
    }

    public final boolean b() {
        return ((Collection)this.a.l().h()).isEmpty() ^ true;
    }

    public final int c() {
        int n3 = this.a.d;
        int n4 = this.b;
        return Math.max(0, n3 -= n4);
    }

    public final int d() {
        Cl2 cl2 = this.a;
        int n3 = cl2.m() + -1;
        int n4 = ((Mk2)CollectionsKt.S(cl2.l().h())).getIndex();
        int n7 = this.b;
        return Math.min(n3, n4 += n7);
    }

    public final int getItemCount() {
        return this.a.m();
    }
}

