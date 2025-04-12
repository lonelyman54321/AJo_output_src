/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

public final class gr3$d
implements ib3_0 {
    public final Vs3 a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public gX2$a e;
    public ni3_0 f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableFloatState h;
    public boolean i;
    public final ParcelableSnapshotMutableState j;
    public Ol k;
    public final ParcelableSnapshotMutableLongState l;
    public boolean m;
    public final xa3_2 n;
    public final /* synthetic */ gr3 o;

    public gr3$d(gr3 object, Object object2, Ol object3, Vs3 vs3) {
        this.o = object;
        this.a = vs3;
        this.b = object = J83.g(object2);
        Object object4 = null;
        int n3 = 7;
        Object object5 = J83.g(Hl.b(0.0f, n3, null));
        this.c = object5;
        Object object6 = object5 = ((h83_0)object5).getValue();
        object6 = (un0_0)object5;
        Object object7 = ((h83_0)object).getValue();
        ni3_0 ni3_02 = new ni3_0((Gl)object6, vs3, object2, object7, (Ol)object3);
        this.d = object = J83.g(ni3_02);
        this.g = object = J83.g(Boolean.TRUE);
        float f5 = -1.0f;
        this.h = object = tp1_0.e(f5);
        this.j = object = J83.g(object2);
        this.k = object3;
        long l2 = this.d().e();
        this.l = object = new ParcelableSnapshotMutableLongState(l2);
        object = (Float)vE3.a.get(vs3);
        if (object != null) {
            f5 = ((Number)object).floatValue();
            object3 = vs3.a();
            object2 = (Ol)object3.invoke(object2);
            int n4 = ((Ol)object2).b();
            vs3 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                ((Ol)object2).e(f5, i3);
            }
            object = this.a.b();
            object4 = object.invoke(object2);
        }
        this.n = object = Hl.b(0.0f, 3, object4);
    }

    public final ni3_0 d() {
        return (ni3_0)this.d.getValue();
    }

    public final void g(long l2) {
        float f5;
        Object object = this.h;
        float f6 = ((D83)object).c();
        float f7 = f6 - (f5 = -1.0f);
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == false) {
            f6 = Float.MIN_VALUE;
            this.m = true;
            object = this.d().c;
            Object object3 = this.d().d;
            object2 = Intrinsics.areEqual(object, object3);
            if (object2 != false) {
                Object object4 = this.d().c;
                this.h(object4);
            } else {
                Ol ol;
                object = this.d().g(l2);
                this.h(object);
                object = this.d();
                this.k = ol = ((ni3_0)object).c(l2);
            }
        }
    }

    public final Object getValue() {
        return this.j.getValue();
    }

    public final void h(Object object) {
        this.j.setValue(object);
    }

    public final void i(Object object, boolean bl2) {
        Object object2;
        long l2;
        long l3;
        long l4;
        Object object3;
        int n3;
        boolean bl3;
        gr3$d gr3$d = this;
        Object object4 = this.f;
        if (object4 != null) {
            object4 = ((ni3_0)object4).c;
        } else {
            bl3 = false;
            object4 = null;
        }
        Object object5 = gr3$d.b;
        Object object6 = ((h83_0)object5).getValue();
        bl3 = Intrinsics.areEqual(object4, object6);
        object6 = gr3$d.l;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = gr3$d.d;
        Object object7 = gr3$d.n;
        if (bl3) {
            Ol ol = Pl.b(gr3$d.k);
            Vs3 vs3 = gr3$d.a;
            Object object8 = object4;
            object4 = new ni3_0((Gl)object7, vs3, object, object, ol);
            parcelableSnapshotMutableState.setValue(object4);
            gr3$d.i = true;
            long l7 = this.d().e();
            ((F83)object6).z(l7);
            return;
        }
        object4 = gr3$d.c;
        if (bl2 && (n3 = gr3$d.m) == 0) {
            object3 = (un0_0)((h83_0)object4).getValue();
            n3 = object3 instanceof xa3_2;
            if (n3 != 0) {
                object7 = object4 = ((h83_0)object4).getValue();
                object7 = (un0_0)object4;
            }
        } else {
            object7 = object4 = ((h83_0)object4).getValue();
            object7 = (un0_0)object4;
        }
        if ((n3 = (l4 = (l3 = ((gr3)(object4 = gr3$d.o)).e()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            object2 = object7;
        } else {
            l3 = ((gr3)object4).e();
            object2 = object3 = new tb3_1((un0_0)object7, l3);
        }
        Object object9 = ((h83_0)object5).getValue();
        object5 = gr3$d.k;
        Vs3 vs3 = gr3$d.a;
        object3 = new ni3_0((Gl)object2, vs3, object, object9, (Ol)object5);
        parcelableSnapshotMutableState.setValue(object3);
        long l8 = this.d().e();
        ((F83)object6).z(l8);
        object5 = null;
        gr3$d.i = false;
        object6 = Boolean.TRUE;
        parcelableSnapshotMutableState = ((gr3)object4).h;
        parcelableSnapshotMutableState.setValue(object6);
        boolean bl4 = ((gr3)object4).h();
        if (bl4) {
            object6 = ((gr3)object4).i;
            n3 = ((p83_0)object6).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                object7 = (gr3$d)((p83_0)object6).get(i3);
                ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = ((gr3$d)object7).l;
                l3 = parcelableSnapshotMutableLongState.x();
                l2 = Math.max(l2, l3);
                l3 = ((gr3)object4).l;
                ((gr3$d)object7).g(l3);
            }
            object4 = Boolean.FALSE;
            parcelableSnapshotMutableState.setValue(object4);
        }
    }

    public final void t(Object object, Object object2, un0_0 object3) {
        boolean bl2;
        this.b.setValue(object2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
        parcelableSnapshotMutableState.setValue(object3);
        object3 = this.d().d;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (bl3 && (bl2 = Intrinsics.areEqual(object3 = this.d().c, object2))) {
            return;
        }
        this.i(object, false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("current value: ");
        Object object = this.j.getValue();
        stringBuilder.append(object);
        stringBuilder.append(", target: ");
        object = this.b.getValue();
        stringBuilder.append(object);
        stringBuilder.append(", spec: ");
        object = (un0_0)this.c.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public final void u(Object object, un0_0 object2) {
        float f5;
        float f6;
        float f7;
        Object object3;
        int n3 = this.i;
        if (n3 != 0) {
            object3 = this.f;
            if (object3 != null) {
                object3 = ((ni3_0)object3).c;
            } else {
                n3 = 0;
                f7 = 0.0f;
                object3 = null;
            }
            n3 = Intrinsics.areEqual(object, object3);
            if (n3 != 0) {
                return;
            }
        }
        object3 = this.b;
        Object object4 = ((h83_0)object3).getValue();
        boolean bl2 = Intrinsics.areEqual(object4, object);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.h;
        float f8 = -1.0f;
        if (bl2 && !(bl2 = (f6 = (f5 = parcelableSnapshotMutableFloatState.c()) - f8) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) {
            return;
        }
        ((h83_0)object3).setValue(object);
        object3 = this.c;
        ((h83_0)object3).setValue(object2);
        float f11 = parcelableSnapshotMutableFloatState.c();
        n3 = -1069547520;
        f7 = -3.0f;
        Object object5 = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1);
        object2 = object5 == false ? object : this.j.getValue();
        object4 = this.g;
        boolean bl3 = (Boolean)((h83_0)object4).getValue();
        boolean bl4 = true;
        this.i(object2, bl3 ^= bl4);
        f11 = parcelableSnapshotMutableFloatState.c();
        bl3 = false;
        object5 = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1);
        if (object5 != false) {
            bl4 = false;
        }
        object2 = bl4;
        ((h83_0)object4).setValue(object2);
        f11 = parcelableSnapshotMutableFloatState.c();
        bl2 = false;
        f5 = 0.0f;
        object4 = null;
        float f12 = f11 - 0.0f;
        object5 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object5 >= 0) {
            long l2 = this.d().e();
            object3 = this.d();
            float f14 = l2;
            f11 = parcelableSnapshotMutableFloatState.c() * f14;
            l2 = (long)f11;
            object = ((ni3_0)object3).g(l2);
            this.h(object);
        } else {
            f11 = parcelableSnapshotMutableFloatState.c();
            float f15 = f11 - f7;
            object5 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (object5 == false) {
                this.h(object);
            }
        }
        this.i = false;
        parcelableSnapshotMutableFloatState.k(f8);
    }
}

