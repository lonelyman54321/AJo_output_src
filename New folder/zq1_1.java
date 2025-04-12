/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from zq1
 */
public final class zq1_1
implements Er1 {
    public final qr1_0 a;

    public zq1_1(qr1_0 qr1_02) {
        this.a = qr1_02;
    }

    public final void a() {
        hi2_0 hi2_02 = this.a.h;
        if (hi2_02 != null) {
            hi2_02.f();
        }
    }

    public final boolean b() {
        return ((Collection)this.a.g().i()).isEmpty() ^ true;
    }

    public final int c() {
        return this.a.b.a.o();
    }

    public final int d() {
        return ((jq1_0)CollectionsKt.S(this.a.g().i())).getIndex();
    }

    public final int getItemCount() {
        return this.a.g().g();
    }
}

