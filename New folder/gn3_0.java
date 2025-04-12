/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.EventLoopImplBase$DelayedTask;
import kotlinx.coroutines.EventLoopImplBase$a;

/*
 * Renamed from gn3
 */
public class gn3_0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    private volatile /* synthetic */ int _size$volatile;
    public hn3_0[] a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(gn3_0.class, "_size$volatile");
    }

    public final void a(EventLoopImplBase$DelayedTask eventLoopImplBase$DelayedTask) {
        int n3;
        int n4;
        hn3_0[] hn3_0Array = this;
        hn3_0Array = (EventLoopImplBase$a)this;
        eventLoopImplBase$DelayedTask.c((EventLoopImplBase$a)hn3_0Array);
        hn3_0Array = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (hn3_0Array == null) {
            int n7 = 4;
            this.a = hn3_0Array = new hn3_0[n7];
        } else {
            n4 = atomicIntegerFieldUpdater.get(this);
            if (n4 >= (n3 = hn3_0Array.length)) {
                n4 = atomicIntegerFieldUpdater.get(this) * 2;
                hn3_0Array = Arrays.copyOf(hn3_0Array, n4);
                String string2 = "copyOf(...)";
                Intrinsics.checkNotNullExpressionValue(hn3_0Array, string2);
                this.a = hn3_0Array;
            }
        }
        n4 = atomicIntegerFieldUpdater.get(this);
        n3 = n4 + 1;
        atomicIntegerFieldUpdater.set(this, n3);
        hn3_0Array[n4] = eventLoopImplBase$DelayedTask;
        eventLoopImplBase$DelayedTask.b = n4;
        this.d(n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(hn3_0 hn3_02) {
        synchronized (this) {
            gn3_0 gn3_02 = hn3_02.b();
            if (gn3_02 != null) {
                int n3 = hn3_02.getIndex();
                this.c(n3);
            }
            return;
        }
    }

    public final hn3_0 c(int n3) {
        int n4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        hn3_0[] hn3_0Array;
        block5: {
            int n7;
            int n8;
            Object object;
            Object object2;
            int n10;
            block6: {
                hn3_0Array = this.a;
                Intrinsics.checkNotNull(hn3_0Array);
                atomicIntegerFieldUpdater = b;
                n10 = atomicIntegerFieldUpdater.get(this);
                n4 = -1;
                atomicIntegerFieldUpdater.set(this, n10 += n4);
                n10 = atomicIntegerFieldUpdater.get(this);
                if (n3 >= n10) break block5;
                n10 = atomicIntegerFieldUpdater.get(this);
                this.e(n3, n10);
                n10 = (n3 + -1) / 2;
                if (n3 <= 0) break block6;
                object2 = hn3_0Array[n3];
                Intrinsics.checkNotNull(object2);
                object2 = (Comparable)object2;
                object = hn3_0Array[n10];
                Intrinsics.checkNotNull(object);
                n8 = object2.compareTo(object);
                if (n8 >= 0) break block6;
                this.e(n3, n10);
                this.d(n10);
                break block5;
            }
            while ((n8 = (n10 = n3 * 2) + 1) < (n7 = atomicIntegerFieldUpdater.get(this))) {
                block8: {
                    block7: {
                        object = this.a;
                        Intrinsics.checkNotNull(object);
                        int n14 = atomicIntegerFieldUpdater.get(this);
                        if ((n10 += 2) >= n14) break block7;
                        Object object3 = object[n10];
                        Intrinsics.checkNotNull(object3);
                        object3 = (Comparable)object3;
                        hn3_0 hn3_02 = object[n8];
                        Intrinsics.checkNotNull(hn3_02);
                        n14 = object3.compareTo(hn3_02);
                        if (n14 < 0) break block8;
                    }
                    n10 = n8;
                }
                object2 = object[n3];
                Intrinsics.checkNotNull(object2);
                object2 = (Comparable)object2;
                object = object[n10];
                Intrinsics.checkNotNull(object);
                n8 = object2.compareTo(object);
                if (n8 <= 0) break;
                this.e(n3, n10);
                n3 = n10;
            }
        }
        n3 = atomicIntegerFieldUpdater.get(this);
        hn3_0 hn3_03 = hn3_0Array[n3];
        Intrinsics.checkNotNull(hn3_03);
        hn3_03.c(null);
        hn3_03.setIndex(n4);
        int n15 = atomicIntegerFieldUpdater.get(this);
        hn3_0Array[n15] = null;
        return hn3_03;
    }

    public final void d(int n3) {
        while (n3 > 0) {
            Object object = this.a;
            Intrinsics.checkNotNull(object);
            int n4 = (n3 + -1) / 2;
            Object object2 = object[n4];
            Intrinsics.checkNotNull(object2);
            object2 = (Comparable)object2;
            object = object[n3];
            Intrinsics.checkNotNull(object);
            int n7 = object2.compareTo(object);
            if (n7 <= 0) {
                return;
            }
            this.e(n3, n4);
            n3 = n4;
        }
        return;
    }

    public final void e(int n3, int n4) {
        hn3_0[] hn3_0Array = this.a;
        Intrinsics.checkNotNull(hn3_0Array);
        hn3_0 hn3_02 = hn3_0Array[n4];
        Intrinsics.checkNotNull(hn3_02);
        hn3_0 hn3_03 = hn3_0Array[n3];
        Intrinsics.checkNotNull(hn3_03);
        hn3_0Array[n3] = hn3_02;
        hn3_0Array[n4] = hn3_03;
        hn3_02.setIndex(n3);
        hn3_03.setIndex(n4);
    }
}

