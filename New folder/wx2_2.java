/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from wX2
 */
public abstract class wx2_2
extends d40_0
implements p42_0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    static {
        d = AtomicIntegerFieldUpdater.newUpdater(wx2_2.class, "cleanedAndPointers$volatile");
    }

    public wx2_2(long l2, wx2_2 wx2_22, int n3) {
        super(wx2_22);
        int n4;
        this.c = l2;
        this.cleanedAndPointers$volatile = n4 = n3 << 16;
    }

    public final boolean d() {
        int n3;
        Object object = d;
        int n4 = ((AtomicIntegerFieldUpdater)object).get(this);
        if (n4 == (n3 = this.g()) && (object = this.c()) != null) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final boolean f() {
        d40_0 d40_02;
        int n3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        int n4 = atomicIntegerFieldUpdater.addAndGet(this, -65536);
        if (n4 == (n3 = this.g()) && (d40_02 = this.c()) != null) {
            n4 = 1;
        } else {
            n4 = 0;
            d40_02 = null;
        }
        return n4 != 0;
    }

    public abstract int g();

    public abstract void h(int var1, CoroutineContext var2);

    public final void i() {
        int n3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        int n4 = atomicIntegerFieldUpdater.incrementAndGet(this);
        if (n4 == (n3 = this.g())) {
            this.e();
        }
    }

    public final boolean j() {
        boolean bl2;
        block1: {
            int n3;
            int n4;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            do {
                d40_0 d40_02;
                if ((n4 = (atomicIntegerFieldUpdater = d).get(this)) != (n3 = this.g()) || (d40_02 = this.c()) == null) continue;
                bl2 = false;
                atomicIntegerFieldUpdater = null;
                break block1;
            } while (!(bl2 = atomicIntegerFieldUpdater.compareAndSet(this, n4, n3 = 65536 + n4)));
            bl2 = true;
        }
        return bl2;
    }
}

