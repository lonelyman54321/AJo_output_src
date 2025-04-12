/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ST2
 */
public final class st2_2
implements dU2 {
    public static final ds2_0 i;
    public final ParcelableSnapshotMutableIntState a;
    public final ParcelableSnapshotMutableIntState b;
    public final xr1_1 c;
    public final ParcelableSnapshotMutableIntState d;
    public float e;
    public final xm0_0 f;
    public final mp0 g;
    public final mp0 h;

    static {
        ds2_0 ds2_02 = CS2.a;
        ST2$a sT2$a = ST2$a.c;
        ST2$b sT2$b = ST2$b.c;
        i = ds2_02 = new ds2_0(sT2$a, sT2$b);
    }

    public st2_2(int n3) {
        xm0_0 xm0_02;
        Object object = Pv2.b(n3);
        this.a = object;
        object = Pv2.b(0);
        this.b = object;
        this.c = object = new xr1_1();
        this.d = object = Pv2.b(-1 >>> 1);
        object = new ST2$e(this);
        this.f = xm0_02 = new xm0_0((Function1)object);
        object = new ST2$d(this);
        this.g = object = J83.e((Function0)object);
        object = new ST2$c(this);
        this.h = object = J83.e((Function0)object);
    }

    public final Object a(aS1 object, Function2 object2, f80_0 f80_02) {
        xm0_0 xm0_02 = this.f;
        if ((object = xm0_02.a((aS1)((Object)object), (Function2)object2, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final boolean b() {
        return this.f.b();
    }

    public final boolean c() {
        return (Boolean)this.h.getValue();
    }

    public final boolean d() {
        return (Boolean)this.g.getValue();
    }

    public final float e(float f5) {
        return this.f.e(f5);
    }
}

