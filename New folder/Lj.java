/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Lj {
    public final Vs3 a;
    public final Object b;
    public final il_0 c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final cs1_0 f;
    public final xa3_2 g;
    public final Ol h;
    public final Ol i;
    public final Ol j;
    public final Ol k;

    public Lj(Object object, Vs3 object2, Object object3, String object4) {
        boolean bl2;
        boolean bl3;
        this.a = object2;
        this.b = object3;
        int n3 = 60;
        this.c = object4 = new il_0((Vs3)object2, object, null, n3);
        this.d = object2 = J83.g(Boolean.FALSE);
        this.e = object = J83.g(object);
        this.f = object = new cs1_0();
        this.g = object = new xa3_2(object3, 3);
        object = ((il_0)object4).c;
        boolean bl4 = object instanceof kl_1;
        object = bl4 ? Rj.e : ((bl4 = object instanceof ll_1) ? Rj.f : ((bl3 = object instanceof ml_2) ? Rj.g : Rj.h));
        object2 = "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable";
        Intrinsics.checkNotNull(object, (String)object2);
        this.h = object;
        object3 = ((il_0)object4).c;
        boolean bl5 = object3 instanceof kl_1;
        object3 = bl5 ? Rj.a : ((bl5 = object3 instanceof ll_1) ? Rj.b : ((bl2 = object3 instanceof ml_2) ? Rj.c : Rj.d));
        Intrinsics.checkNotNull(object3, (String)object2);
        this.i = object3;
        this.j = object;
        this.k = object3;
    }

    public /* synthetic */ Lj(Object object, Ws3 ws3, Object object2, int n3) {
        if ((n3 &= 4) != 0) {
            object2 = null;
        }
        this(object, (Vs3)ws3, object2, "Animatable");
    }

    public static final Object a(Lj object, Object object2) {
        Ol ol = ((Lj)object).h;
        Ol ol2 = ((Lj)object).j;
        boolean bl2 = Intrinsics.areEqual(ol2, ol);
        Ol ol4 = ((Lj)object).k;
        if (!bl2 || !(bl2 = Intrinsics.areEqual(ol4, ol = ((Lj)object).i))) {
            object = ((Lj)object).a;
            ol = (Ol)object.a().invoke(object2);
            int n3 = ol.b();
            boolean bl3 = false;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f6;
                float f7;
                float f8 = ol.a(i3);
                float f11 = f8 - (f7 = ol2.a(i3));
                float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (f12 >= 0 && (f12 = (f6 = (f8 = ol.a(i3)) - (f7 = ol4.a(i3))) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) continue;
                f5 = ol.a(i3);
                f8 = ol2.a(i3);
                f7 = ol4.a(i3);
                f5 = kotlin.ranges.f.f(f5, f8, f7);
                ol.e(f5, i3);
                bl3 = true;
                f5 = Float.MIN_VALUE;
            }
            if (bl3) {
                object = object.b();
                object2 = object.invoke(ol);
            }
        }
        return object2;
    }

    public static final void b(Lj lj) {
        Object object = lj.c;
        ((il_0)object).c.d();
        ((il_0)object).d = Long.MIN_VALUE;
        object = Boolean.FALSE;
        lj.d.setValue(object);
    }

    public static Object c(Lj lj, Object object, Gl object2, Function1 object3, f80_0 f80_02, int n3) {
        Object object4;
        int n4 = n3 & 2;
        if (n4 != 0) {
            object2 = lj.g;
        }
        Gl gl = object2;
        object2 = lj.a.b();
        Object object5 = lj.c.c;
        object2 = object2.invoke(object5);
        if ((n3 &= 8) != 0) {
            object3 = null;
        }
        Function1 function1 = object3;
        Object object6 = lj.d();
        Object object7 = lj.a;
        Object object8 = object4 = object7.a().invoke(object2);
        object8 = (Ol)object4;
        object5 = object3;
        object3 = new ni3_0(gl, (Vs3)object7, object6, object, (Ol)object8);
        long l2 = lj.c.d;
        object7 = object;
        object6 = lj;
        object8 = object3;
        object = new jj_0(lj, object2, (ni3_0)object3, l2, function1, null);
        return cs1_0.a(lj.f, (Function1)object, f80_02);
    }

    public final Object d() {
        return this.c.b.getValue();
    }

    public final Object e(f80_0 object, Object object2) {
        kj_1 kj_12 = new kj_1(this, object2, null);
        if ((object = cs1_0.a(this.f, kj_12, (f80_0)object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object f(f80_0 object) {
        Object object2 = new lj$a_0(this, null);
        cs1_0 cs1_02 = this.f;
        if ((object = cs1_0.a(cs1_02, object2, (f80_0)object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

