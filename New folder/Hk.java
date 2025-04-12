/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

public final class Hk
implements gk_0 {
    public final gr3 a;
    public Nc b;
    public final ParcelableSnapshotMutableState c;
    public final nr1_1 d;
    public ib3_0 e;

    public Hk(gr3 object, Nc nc) {
        this.a = object;
        this.b = nc;
        object = new bj1(0L);
        this.c = object = J83.g(object);
        this.d = object = et2_1.d();
    }

    public final Object a() {
        return this.a.f().a();
    }

    public final Object b() {
        return this.a.f().b();
    }

    public final boolean c(Object object, Object object2) {
        Object object3 = this.b();
        boolean bl2 = Intrinsics.areEqual(object, object3);
        if (bl2 && (bl2 = Intrinsics.areEqual(object2, object = this.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

