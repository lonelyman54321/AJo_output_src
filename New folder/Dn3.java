/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Dn3 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public Dn3() {
        int n3 = 10;
        long[] lArray = new long[n3];
        this.a = lArray;
        Object[] objectArray = new Object[n3];
        this.b = objectArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2, Object object) {
        synchronized (this) {
            int n3;
            int n4 = this.d;
            if (n4 > 0) {
                n3 = this.c + n4 + -1;
                Object[] objectArray = this.b;
                n4 = objectArray.length;
                objectArray = this.a;
                Object object2 = objectArray[n3 %= n4];
                long l3 = l2 - object2;
                if ((n4 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1))) <= 0) {
                    this.b();
                }
            }
            this.c();
            n4 = this.c;
            n3 = this.d;
            n4 += n3;
            Object[] objectArray = this.b;
            int n7 = objectArray.length;
            long[] lArray = this.a;
            lArray[n4 %= n7] = l2;
            objectArray[n4] = object;
            this.d = ++n3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Object[] objectArray = null;
            this.c = 0;
            this.d = 0;
            objectArray = this.b;
            Arrays.fill(objectArray, null);
            return;
        }
    }

    public final void c() {
        int n3 = this.d;
        Object[] objectArray = this.b;
        int n4 = objectArray.length;
        if (n3 < n4) {
            return;
        }
        n3 = n4 * 2;
        long[] lArray = new long[n3];
        Object[] objectArray2 = new Object[n3];
        int n7 = this.c;
        long[] lArray2 = this.a;
        System.arraycopy(lArray2, n7, lArray, 0, n4 -= n7);
        Object[] objectArray3 = this.b;
        int n8 = this.c;
        System.arraycopy(objectArray3, n8, objectArray2, 0, n4);
        n7 = this.c;
        if (n7 > 0) {
            lArray2 = this.a;
            System.arraycopy(lArray2, 0, lArray, n4, n7);
            objectArray3 = this.b;
            n8 = this.c;
            System.arraycopy(objectArray3, 0, objectArray2, n4, n8);
        }
        this.a = lArray;
        this.b = objectArray2;
        this.c = 0;
    }

    public final Object d(long l2, boolean bl2) {
        long l3;
        long l4;
        int n3;
        long[] lArray;
        long l7;
        long l8;
        long l12;
        long l14;
        int n4;
        Object object = null;
        long l15 = Long.MAX_VALUE;
        while ((n4 = this.d) > 0 && ((l14 = (l12 = (l8 = l2 - (l7 = (lArray = this.a)[n3 = this.c])) - (l4 = 0L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) >= 0 || !bl2 && (l14 = (l3 = (l4 = -l8) - l15) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0)) {
            object = this.g();
            l15 = l8;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e() {
        synchronized (this) {
            int n3 = this.d;
            if (n3 != 0) return this.g();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f(long l2) {
        synchronized (this) {
            boolean bl2 = true;
            return this.d(l2, bl2);
        }
    }

    public final Object g() {
        Object[] objectArray;
        int n3 = this.d;
        int n4 = 1;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray = null;
        }
        ct3.f(n3 != 0);
        objectArray = this.b;
        int n7 = this.c;
        Object object = objectArray[n7];
        objectArray[n7] = null;
        n7 += n4;
        n3 = objectArray.length;
        this.c = n7 %= n3;
        this.d = n3 = this.d - n4;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int h() {
        synchronized (this) {
            return this.d;
        }
    }
}

