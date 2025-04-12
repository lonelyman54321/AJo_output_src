/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SE
 */
public final class se_2
extends bg2$a_0 {
    public final byte[] a;
    public final k70_0 b;
    public final ub1_2 c;

    public se_2(byte[] byArray, k70_0 k70_02) {
        Intrinsics.checkNotNullParameter(byArray, "bytes");
        this.a = byArray;
        this.b = k70_02;
        this.c = null;
    }

    public final Long a() {
        return this.a.length;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final ub1_2 d() {
        return this.c;
    }

    public final byte[] e() {
        return this.a;
    }
}

