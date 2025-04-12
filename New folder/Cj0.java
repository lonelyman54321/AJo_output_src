/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Cj0 {
    public final boolean a;
    public final int b;
    public int c;
    public int d;
    public int e = 0;
    public ae_0[] f;

    public Cj0() {
        this.a = true;
        this.b = 65536;
        ae_0[] ae_0Array = new ae_0[100];
        this.f = ae_0Array;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n4 = this.c;
                        n4 = n3 < n4 ? 1 : 0;
                        this.c = n3;
                        if (n4 == 0) break block4;
                        this.b();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            int n3 = this.c;
            int n4 = this.b;
            n3 = gz3.e(n3, n4);
            n4 = this.d;
            n3 -= n4;
            n4 = 0;
            n3 = Math.max(0, n3);
            n4 = this.e;
            if (n3 >= n4) {
                return;
            }
            Object[] objectArray = this.f;
            Arrays.fill(objectArray, n3, n4, null);
            this.e = n3;
            return;
        }
    }
}

