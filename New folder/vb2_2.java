/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from VB2
 */
public final class vb2_2
extends zf3_2 {
    public static final vb2$a_0[] c = new vb2$a_0[0];
    public static final vb2$a_0[] d = new vb2$a_0[0];
    public final AtomicReference a;
    public Throwable b;

    public vb2_2() {
        AtomicReference<vb2$a_0[]> atomicReference;
        vb2$a_0[] vb2$a_0Array = d;
        this.a = atomicReference = new AtomicReference<vb2$a_0[]>(vb2$a_0Array);
    }

    public final void a(yr0_2 yr0_22) {
        vb2$a_0[] vb2$a_0Array;
        Object v4 = this.a.get();
        if (v4 == (vb2$a_0Array = c)) {
            yr0_22.dispose();
        }
    }

    public final void b(Object object) {
        x03_0.b(object, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (vb2$a_0 vb2$a_0 : (vb2$a_0[])this.a.get()) {
            boolean bl2 = vb2$a_0.get();
            if (bl2) continue;
            e62_0 e62_02 = vb2$a_0.a;
            e62_02.b(object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(e62_0 e62_02) {
        Serializable serializable = new vb2$a_0(e62_02, this);
        e62_02.a((yr0_2)((Object)serializable));
        while (true) {
            Object v4;
            vb2$a_0[] vb2$a_0Array;
            AtomicReference atomicReference;
            vb2$a_0[] vb2$a_0Array2;
            if ((vb2$a_0Array2 = (vb2$a_0[])(atomicReference = this.a).get()) == (vb2$a_0Array = c)) {
                serializable = this.b;
                if (serializable != null) {
                    e62_02.onError((Throwable)serializable);
                    return;
                } else {
                    e62_02.onComplete();
                }
                return;
            }
            int n3 = vb2$a_0Array2.length;
            int n4 = n3 + 1;
            vb2$a_0[] vb2$a_0Array3 = new vb2$a_0[n4];
            System.arraycopy(vb2$a_0Array2, 0, vb2$a_0Array3, 0, n3);
            vb2$a_0Array3[n3] = serializable;
            do {
                if ((n3 = (int)(atomicReference.compareAndSet(vb2$a_0Array2, vb2$a_0Array3) ? 1 : 0)) == 0) continue;
                boolean bl2 = ((AtomicBoolean)serializable).get();
                if (!bl2) return;
                this.h((vb2$a_0)serializable);
                return;
            } while ((v4 = atomicReference.get()) == vb2$a_0Array2);
        }
    }

    public final void h(vb2$a_0 vb2$a_0) {
        vb2$a_0[] vb2$a_0Array;
        AtomicReference atomicReference;
        vb2$a_0[] vb2$a_0Array2;
        while ((vb2$a_0Array2 = (vb2$a_0[])(atomicReference = this.a).get()) != (vb2$a_0Array = c) && vb2$a_0Array2 != (vb2$a_0Array = d)) {
            Object v4;
            int n3;
            int n4;
            int n7;
            block6: {
                n7 = vb2$a_0Array2.length;
                n4 = 0;
                for (n3 = 0; n3 < n7; ++n3) {
                    vb2$a_0 vb2$a_02 = vb2$a_0Array2[n3];
                    if (vb2$a_02 != vb2$a_0) {
                        continue;
                    }
                    break block6;
                }
                n3 = -1;
            }
            if (n3 < 0) {
                return;
            }
            int n8 = 1;
            if (n7 != n8) {
                int n10 = n7 + -1;
                vb2$a_0Array = new vb2$a_0[n10];
                System.arraycopy(vb2$a_0Array2, 0, vb2$a_0Array, 0, n3);
                n4 = n3 + 1;
                n7 = n7 - n3 - n8;
                System.arraycopy(vb2$a_0Array2, n4, vb2$a_0Array, n3, n7);
            }
            do {
                if ((n7 = (int)(atomicReference.compareAndSet(vb2$a_0Array2, vb2$a_0Array) ? 1 : 0)) == 0) continue;
                return;
            } while ((v4 = atomicReference.get()) == vb2$a_0Array2);
        }
    }

    public final void onComplete() {
        vb2$a_0[] vb2$a_0Array;
        vb2$a_0[] vb2$a_0Array2 = this.a;
        Object v4 = vb2$a_0Array2.get();
        if (v4 == (vb2$a_0Array = c)) {
            return;
        }
        vb2$a_0Array2 = vb2$a_0Array2.getAndSet(vb2$a_0Array);
        int n3 = vb2$a_0Array2.length;
        vb2$a_0Array = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = vb2$a_0Array2[i3];
            boolean bl2 = ((AtomicBoolean)object).get();
            if (bl2) continue;
            object = ((vb2$a_0)object).a;
            object.onComplete();
        }
    }

    public final void onError(Throwable throwable) {
        x03_0.b(throwable, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        vb2$a_0[] vb2$a_0Array = this.a;
        Object v4 = vb2$a_0Array.get();
        vb2$a_0[] vb2$a_0Array2 = c;
        if (v4 == vb2$a_0Array2) {
            dr2_2.b(throwable);
            return;
        }
        this.b = throwable;
        vb2$a_0Array = vb2$a_0Array.getAndSet(vb2$a_0Array2);
        int n3 = vb2$a_0Array.length;
        vb2$a_0Array2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = vb2$a_0Array[i3];
            boolean bl2 = ((AtomicBoolean)object).get();
            if (bl2) {
                dr2_2.b(throwable);
                continue;
            }
            object = ((vb2$a_0)object).a;
            object.onError(throwable);
        }
    }
}

