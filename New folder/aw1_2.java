/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/*
 * Renamed from Aw1
 */
public class aw1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(aw1_2.class, Object.class, "_cur$volatile");
    }

    public aw1_2() {
        bw1_2 bw1_22 = new bw1_2(8, false);
        this._cur$volatile = bw1_22;
    }

    public final boolean a(Object object) {
        int n3;
        while (true) {
            Object v4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            bw1_2 bw1_22 = (bw1_2)atomicReferenceFieldUpdater.get(this);
            int n4 = bw1_22.a(object);
            n3 = 1;
            if (n4 == 0) break;
            if (n4 != n3) {
                int n7 = 2;
                if (n4 != n7) continue;
                return false;
            }
            bw1_2 bw1_23 = bw1_22.c();
            while ((n3 = (int)(atomicReferenceFieldUpdater.compareAndSet(this, bw1_22, bw1_23) ? 1 : 0)) == 0 && (v4 = atomicReferenceFieldUpdater.get(this)) == bw1_22) {
            }
        }
        return n3 != 0;
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bw1_2 bw1_22;
        boolean bl2;
        while (!(bl2 = (bw1_22 = (bw1_2)(atomicReferenceFieldUpdater = a).get(this)).b())) {
            Object v4;
            boolean bl3;
            bw1_2 bw1_23 = bw1_22.c();
            while (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(this, bw1_22, bw1_23)) && (v4 = atomicReferenceFieldUpdater.get(this)) == bw1_22) {
            }
        }
        return;
    }

    public final int c() {
        bw1_2 bw1_22 = (bw1_2)a.get(this);
        bw1_22.getClass();
        long l2 = bw1_2.f.get(bw1_22);
        int n3 = (int)(0x3FFFFFFFL & l2);
        int n4 = (int)((l2 & 0xFFFFFFFC0000000L) >> 30) - n3;
        return -1 >>> 2 & n4;
    }

    public final Object d() {
        gh3_2 gh3_22;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bw1_2 bw1_22;
        Object object;
        while ((object = (bw1_22 = (bw1_2)(atomicReferenceFieldUpdater = a).get(this)).d()) == (gh3_22 = bw1_2.g)) {
            boolean bl2;
            object = bw1_22.c();
            while (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, bw1_22, object)) && (gh3_22 = atomicReferenceFieldUpdater.get(this)) == bw1_22) {
            }
        }
        return object;
    }
}

