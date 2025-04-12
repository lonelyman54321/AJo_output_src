/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ox1
 */
public final class ox1_2
extends bg2$d_0 {
    public final uf_1 a;
    public final k70_0 b;
    public final Long c;
    public final ub1_2 d;
    public final l41_0 e;

    public ox1_2(bg2_2 object, uf_1 object2) {
        Intrinsics.checkNotNullParameter(object, "originalContent");
        Intrinsics.checkNotNullParameter(object2, "channel");
        this.a = object2;
        this.b = object2 = ((bg2_2)object).b();
        this.c = object2 = ((bg2_2)object).a();
        this.d = object2 = ((bg2_2)object).d();
        this.e = object = ((bg2_2)object).c();
    }

    public final Long a() {
        return this.c;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final l41_0 c() {
        return this.e;
    }

    public final ub1_2 d() {
        return this.d;
    }

    public final uf_1 e() {
        return this.a;
    }
}

