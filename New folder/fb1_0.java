/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.f;
import kotlinx.coroutines.d;

/*
 * Renamed from FB1
 */
public final class fb1_0
implements bb1_1 {
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final mp0 h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final mp0 m;
    public final mp0 n;
    public final gS1 o;

    public fb1_0() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Object object = Boolean.FALSE;
        Object object2 = J83.g(object);
        this.a = object2;
        object2 = 1;
        this.b = parcelableSnapshotMutableState = J83.g(object2);
        this.c = object2 = J83.g(object2);
        this.d = object2 = J83.g(object);
        this.e = parcelableSnapshotMutableState = J83.g(null);
        this.f = parcelableSnapshotMutableState = J83.g(Float.valueOf(1.0f));
        this.g = object = J83.g(object);
        object = new FB1$b(this);
        this.h = object = J83.e((Function0)object);
        this.i = object = J83.g(null);
        object = Float.valueOf(0.0f);
        this.j = object2 = J83.g(object);
        this.k = object = J83.g(object);
        this.l = object = J83.g(Long.MIN_VALUE);
        object = new FB1$a(this);
        this.m = object = J83.e((Function0)object);
        object = new FB1$c(this);
        this.n = object = J83.e((Function0)object);
        this.o = object = new gS1();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean d(fb1_0 fb1_02, int n3, long l2) {
        float f5;
        long l3;
        Object object = fb1_02.p();
        boolean bl2 = true;
        if (object == null) return bl2;
        Object object2 = fb1_02.l;
        Number number = (Number)((h83_0)object2).getValue();
        long l4 = number.longValue();
        long l7 = l4 - (l3 = Long.MIN_VALUE);
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 == false) {
            l4 = 0L;
        } else {
            number = (Number)((h83_0)object2).getValue();
            l4 = number.longValue();
            l4 = l2 - l4;
        }
        Object object4 = l2;
        ((h83_0)object2).setValue(object4);
        object4 = fb1_02.r();
        if (object4 != null) {
            f5 = ((PB1)object4).b();
        } else {
            f5 = 0.0f;
            object4 = null;
        }
        object2 = fb1_02.r();
        float f6 = object2 != null ? ((PB1)object2).a() : 1.0f;
        int n4 = 1000000;
        float f7 = 1.401298E-39f;
        l3 = n4;
        float f8 = l4 /= l3;
        float f11 = ((QB1)object).b();
        object = fb1_02.h;
        Number number2 = (Number)((mp0)object).getValue();
        float f12 = number2.floatValue() * (f8 /= f11);
        number = (Number)((mp0)object).getValue();
        f8 = number.floatValue();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = fb1_02.j;
        float f14 = f8 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (f15 < 0) {
            number = (Number)parcelableSnapshotMutableState.getValue();
            f8 = number.floatValue() + f12;
            f8 = f5 - f8;
        } else {
            number = (Number)parcelableSnapshotMutableState.getValue();
            f8 = number.floatValue() + f12 - f6;
        }
        float f16 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f16 == false) {
            fb1_02.t(f5);
            return false;
        }
        float f17 = f8 - 0.0f;
        Object object5 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (object5 < 0) {
            Number number3 = (Number)parcelableSnapshotMutableState.getValue();
            float f18 = kotlin.ranges.f.f(number3.floatValue(), f5, f6) + f12;
            fb1_02.t(f18);
            return bl2;
        } else {
            f12 = f6 - f5;
            f7 = f8 / f12;
            n4 = (int)f7;
            int n7 = n4 + 1;
            int n8 = fb1_02.m() + n7;
            if (n8 > n3) {
                f5 = fb1_02.h();
                fb1_02.t(f5);
                fb1_02.i(n3);
                return false;
            }
            n3 = fb1_02.m() + n7;
            fb1_02.i(n3);
            float f19 = (float)n4 * f12;
            f8 -= f19;
            Number number4 = (Number)((mp0)object).getValue();
            f19 = number4.floatValue();
            float f20 = f19 - 0.0f;
            n3 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
            f6 = n3 < 0 ? (f6 -= f8) : f5 + f8;
            fb1_02.t(f6);
        }
        return bl2;
    }

    public static final void g(fb1_0 ib3_02, boolean bl2) {
        ib3_02 = ((fb1_0)ib3_02).a;
        Boolean bl3 = bl2;
        ((h83_0)ib3_02).setValue(bl3);
    }

    public final boolean f() {
        return (Boolean)this.n.getValue();
    }

    public final Object getValue() {
        return Float.valueOf(this.l());
    }

    public final float h() {
        return ((Number)this.m.getValue()).floatValue();
    }

    public final void i(int n3) {
        Integer n4 = n3;
        this.b.setValue(n4);
    }

    public final float j() {
        return ((Number)this.f.getValue()).floatValue();
    }

    public final float l() {
        return ((Number)this.k.getValue()).floatValue();
    }

    public final int m() {
        return ((Number)this.b.getValue()).intValue();
    }

    public final Object n(QB1 object, float f5, int n3, boolean bl2, f80_0 f80_02) {
        FB1$d fB1$d = new FB1$d(this, (QB1)object, f5, n3, bl2, null);
        object = aS1.Default;
        Object object2 = this.o;
        object2.getClass();
        bl2 = false;
        ds1_2 ds1_22 = new ds1_2((aS1)((Object)object), (gS1)object2, fB1$d, null);
        object = kotlinx.coroutines.d.c(ds1_22, f80_02);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public final QB1 p() {
        return (QB1)this.i.getValue();
    }

    public final Object q(QB1 qB1, int n3, int n4, boolean bl2, float f5, PB1 pB1, float f6, boolean bl3, OB1 oB1, boolean bl4, f80_0 f80_02) {
        cb1_0 cb1_02;
        Object object = cb1_02;
        cb1_02 = new cb1_0(this, n3, n4, bl2, f5, pB1, qB1, f6, bl4, bl3, oB1, null);
        object = aS1.Default;
        Object object2 = this.o;
        object2.getClass();
        ds1_2 ds1_22 = new ds1_2((aS1)((Object)object), (gS1)object2, cb1_02, null);
        object = f80_02;
        object = kotlinx.coroutines.d.c(ds1_22, f80_02);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public final PB1 r() {
        return (PB1)this.e.getValue();
    }

    public final void t(float f5) {
        Object object = Float.valueOf(f5);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.j;
        parcelableSnapshotMutableState.setValue(object);
        object = (Boolean)this.g.getValue();
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.p()) != null) {
            float f6 = ((QB1)object).n;
            boolean bl3 = true;
            float f7 = (float)bl3 / f6;
            f6 = f5 % f7;
            f5 -= f6;
        }
        Float f8 = Float.valueOf(f5);
        this.k.setValue(f8);
    }
}

