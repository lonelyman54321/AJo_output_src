/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Rk3
implements Sj3 {
    public final /* synthetic */ Sk3 a;
    public final /* synthetic */ boolean b;

    public Rk3(Sk3 sk3, boolean bl2) {
        this.a = sk3;
        this.b = bl2;
    }

    public final void a() {
        int n3 = this.b;
        Object object = n3 != 0 ? v21_0.SelectionStart : v21_0.SelectionEnd;
        Sk3 sk3 = this.a;
        Sk3.b(sk3, object);
        long l2 = sk3.k(n3 != 0);
        float f5 = hY2.a;
        f5 = e72.d(l2);
        float f6 = e72.e(l2);
        float f7 = 1.0f;
        l2 = h72.a(f5, f6 -= f7);
        Object object2 = sk3.d;
        if (object2 != null && (object2 = ((Vt1)object2).d()) != null) {
            sk3.m = l2 = ((Ul3)object2).e(l2);
            object2 = new e72(l2);
            sk3.q.setValue(object2);
            sk3.o = l2 = 0L;
            n3 = -1;
            f6 = 0.0f / 0.0f;
            sk3.r = n3;
            Object object3 = sk3.d;
            if (object3 != null) {
                object = Boolean.TRUE;
                object3 = ((Vt1)object3).q;
                ((h83_0)object3).setValue(object);
            }
            n3 = 0;
            f6 = 0.0f;
            object3 = null;
            sk3.t(false);
        }
    }

    public final void b(long l2) {
    }

    public final void c() {
        Sk3 sk3 = this.a;
        Sk3.b(sk3, null);
        Sk3.a(sk3, null);
        sk3.t(true);
    }

    public final void d(long l2) {
        Sk3 sk3 = this.a;
        sk3.o = l2 = e72.i(sk3.o, l2);
        l2 = e72.i(sk3.m, l2);
        Object object = new e72(l2);
        sk3.q.setValue(object);
        ql3_0 ql3_02 = sk3.l();
        e72 e722 = sk3.i();
        Intrinsics.checkNotNull(e722);
        long l3 = e722.a;
        tv1_0 tv1_02 = PX2$a.d;
        boolean bl2 = this.b;
        object = sk3;
        Sk3.c(sk3, ql3_02, l3, false, bl2, tv1_02, true);
        sk3.t(false);
    }

    public final void onCancel() {
    }

    public final void onStop() {
        Sk3 sk3 = this.a;
        Sk3.b(sk3, null);
        Sk3.a(sk3, null);
        sk3.t(true);
    }
}

