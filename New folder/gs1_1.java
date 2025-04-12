/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from Gs1
 */
public final class gs1_1
implements Er1 {
    public final ft1_2 a;
    public final int b;

    public gs1_1(ft1_2 ft1_22, int n3) {
        this.a = ft1_22;
        this.b = n3;
    }

    public final void a() {
        hi2_0 hi2_02 = this.a.k;
        if (hi2_02 != null) {
            hi2_02.f();
        }
    }

    public final boolean b() {
        return ((Collection)this.a.j().i()).isEmpty() ^ true;
    }

    public final int c() {
        int n3 = this.a.h();
        int n4 = this.b;
        return Math.max(0, n3 -= n4);
    }

    public final int d() {
        int n3 = this.getItemCount() + -1;
        int n4 = ((Js1)CollectionsKt.S(this.a.j().i())).getIndex();
        int n7 = this.b;
        return Math.min(n3, n4 += n7);
    }

    public final int getItemCount() {
        return this.a.j().g();
    }
}

