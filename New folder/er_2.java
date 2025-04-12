/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

/*
 * Renamed from ER
 */
public final class er_2
extends ir_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    private volatile /* synthetic */ int consumed$volatile;
    public final af2_2 d;
    public final boolean e;

    static {
        f = AtomicIntegerFieldUpdater.newUpdater(er_2.class, "consumed$volatile");
    }

    public /* synthetic */ er_2(af2_2 af2_22, boolean bl2) {
        f f5 = kotlin.coroutines.f.a;
        he_2 he_22 = he_2.SUSPEND;
        this(af2_22, bl2, f5, -3, he_22);
    }

    public er_2(af2_2 af2_22, boolean bl2, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        super(coroutineContext, n3, he_22);
        this.d = af2_22;
        this.e = bl2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        int n3 = this.b;
        int n4 = -3;
        if (n3 == n4) {
            int n7;
            Object object3;
            n3 = (int)(this.e ? 1 : 0);
            if (n3 != 0 && (n4 = ((AtomicIntegerFieldUpdater)(object3 = f)).getAndSet(this, n7 = 1)) == n7) {
                object2 = "ReceiveChannel.consumeAsFlow can be collected just once".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object3 = this.d;
            if ((object = qs0_2.a((fs0_2)object, (af2_2)object3, n3 != 0, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
                return object;
            }
            return Unit.a;
        }
        if ((object = super.collect((fs0_2)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final String f() {
        StringBuilder stringBuilder = new StringBuilder("channel=");
        af2_2 af2_22 = this.d;
        stringBuilder.append(af2_22);
        return stringBuilder.toString();
    }

    public final Object g(pz2_2 object, f80_0 object2) {
        nz2_1 nz2_12 = new nz2_1((fz2_1)object);
        object = this.d;
        boolean bl2 = this.e;
        if ((object = qs0_2.a(nz2_12, (af2_2)object, bl2, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        af2_2 af2_22 = this.d;
        boolean bl2 = this.e;
        er_2 er_22 = new er_2(af2_22, bl2, coroutineContext, n3, he_22);
        return er_22;
    }

    public final es0_2 i() {
        af2_2 af2_22 = this.d;
        boolean bl2 = this.e;
        er_2 er_22 = new er_2(af2_22, bl2);
        return er_22;
    }

    public final af2_2 j(i90_0 object) {
        int n3;
        Object object2;
        int n4 = this.e;
        if (n4 != 0 && (n4 = ((AtomicIntegerFieldUpdater)(object2 = f)).getAndSet(this, n3 = 1)) == n3) {
            object2 = "ReceiveChannel.consumeAsFlow can be collected just once".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        n4 = this.b;
        n3 = -3;
        object = n4 == n3 ? this.d : super.j((i90_0)object);
        return object;
    }
}

