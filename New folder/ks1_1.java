/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from kS1
 */
public final class ks1_1
extends yy2_2
implements hs1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    private volatile /* synthetic */ Object owner$volatile;

    static {
        h = AtomicReferenceFieldUpdater.newUpdater(ks1_1.class, Object.class, "owner$volatile");
    }

    public ks1_1(boolean bl2) {
        gh3_2 gh3_22;
        int n3 = 1;
        super(n3, (int)(bl2 ? 1 : 0));
        if (bl2) {
            bl2 = false;
            gh3_22 = null;
        } else {
            gh3_22 = ls1_2.a;
        }
        this.owner$volatile = gh3_22;
    }

    public final boolean a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yy2_2.g;
        int n3 = atomicIntegerFieldUpdater.get(this);
        boolean bl2 = false;
        if ((n3 = Math.max(n3, 0)) == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void b(Object object) {
        Object object2;
        boolean bl2;
        while (bl2 = this.a()) {
            Object v4;
            gh3_2 gh3_22;
            object2 = h;
            Object v5 = ((AtomicReferenceFieldUpdater)object2).get(this);
            if (v5 == (gh3_22 = ls1_2.a)) continue;
            if (v5 != object && object != null) {
                object2 = new StringBuilder("This mutex is locked by ");
                ((StringBuilder)object2).append(v5);
                ((StringBuilder)object2).append(", but ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" is expected");
                object = ((StringBuilder)object2).toString();
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            do {
                boolean bl3;
                if (!(bl3 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, v5, gh3_22))) continue;
                this.release();
                return;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object2).get(this)) == v5);
        }
        object2 = "This mutex is not locked".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object d(f80_0 object, Object object2) {
        Object object3;
        boolean bl2 = this.f(object2);
        if (bl2) {
            return Unit.a;
        }
        Object object4 = dl_2.a(zj1_2.b((f80_0)object));
        try {
            object3 = new kS1$a(this, (CancellableContinuationImpl)object4, object2);
            while (true) {
                object2 = yy2_2.g;
                break;
            }
        }
        catch (Throwable throwable) {
            object4.A();
            throw throwable;
        }
        {
            int n3;
            block13: {
                n3 = ((AtomicIntegerFieldUpdater)object2).getAndDecrement(this);
                int n4 = this.a;
                if (n3 > n4) continue;
                if (n3 <= 0) break block13;
                object2 = Unit.a;
                xy2_2 xy2_22 = this.b;
                ((kS1$a)object3).F(object2, xy2_22);
                break;
            }
            object2 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter";
            Intrinsics.checkNotNull(object3, (String)object2);
            n3 = (int)(this.e((me3_2)object3) ? 1 : 0);
            if (n3 != 0) break;
            continue;
        }
        object2 = object4.q();
        object4 = j90_0.COROUTINE_SUSPENDED;
        if (object2 == object4) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(object, (String)object3);
        }
        object = object2 == object4 ? object2 : Unit.a;
        if (object != object4) return Unit.a;
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean f(Object var1_1) {
        block11: {
            while (true) {
                if ((var3_3 = (var2_2 = yy2_2.g).get(this)) > (var4_4 = this.a)) {
                    while ((var3_3 = var2_2.get(this)) > var4_4 && (var3_3 = (int)var2_2.compareAndSet(this, var3_3, var4_4)) == 0) {
                    }
                    continue;
                }
                var4_4 = 1;
                var5_5 = 2;
                var6_6 = ks1_1.h;
                if (var3_3 <= 0) {
                    block12: {
                        if (var1_1 == null) {
                            while (true) {
                                var7_7 = 1;
                                break block11;
                                break;
                            }
                        }
                        do {
                            if ((var7_7 = this.a()) != 0) continue;
                            var7_7 = 0;
                            var2_2 = null;
                            break block12;
                        } while ((var2_2 = var6_6.get(this)) == (var8_8 = ls1_2.a));
                        var7_7 = var2_2 == var1_1 ? 1 : 2;
                    }
                    if (var7_7 != var4_4) {
                        if (var7_7 == var5_5) ** continue;
                        continue;
                    }
                    var7_7 = 2;
                    break block11;
                }
                var9_9 = var3_3 + -1;
                var7_7 = var2_2.compareAndSet(this, var3_3, var9_9);
                if (var7_7 != 0) break;
            }
            var6_6.set(this, var1_1);
            var7_7 = 0;
            var2_2 = null;
        }
        if (var7_7 != 0) {
            if (var7_7 != var4_4) {
                if (var7_7 != var5_5) {
                    var2_2 = "unexpected".toString();
                    var1_1 = new IllegalStateException((String)var2_2);
                    throw var1_1;
                }
                var8_8 = new StringBuilder("This mutex is already locked by the specified owner: ");
                var8_8.append(var1_1);
                var1_1 = var8_8.toString().toString();
                var2_2 = new IllegalStateException((String)var1_1);
                throw var2_2;
            }
            var4_4 = 0;
        }
        return (boolean)var4_4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Mutex@");
        String string2 = si0_2.d(this);
        stringBuilder.append(string2);
        stringBuilder.append("[isLocked=");
        boolean bl2 = this.a();
        stringBuilder.append(bl2);
        stringBuilder.append(",owner=");
        string2 = h.get(this);
        stringBuilder.append((Object)string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

