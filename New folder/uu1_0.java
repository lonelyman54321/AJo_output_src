/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

/*
 * Renamed from uu1
 */
public final class uu1_0
implements L31 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(B63 object) {
        int n3;
        wq0 wq02 = ((B63)object).a;
        int n4 = wq02 instanceof wq0$a;
        int n7 = -1 >>> 1;
        if (n4 != 0) {
            wq02 = (wq0$a)wq02;
            n3 = ((wq0$a)wq02).a;
        } else {
            n3 = -1 >>> 1;
        }
        n4 = 100;
        if (n3 <= n4) return false;
        object = ((B63)object).b;
        n3 = object instanceof wq0$a;
        if (n3 != 0) {
            object = (wq0$a)object;
            n7 = ((wq0$a)object).a;
        }
        if (n7 <= n4) return false;
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b() {
        mL0 mL02 = mL0.a;
        synchronized (mL02) {
            Throwable throwable2;
            block7: {
                int n3;
                String[] stringArray;
                int n4;
                int n7;
                block6: {
                    try {
                        long l2;
                        n7 = mL0.c;
                        mL0.c = n4 = n7 + 1;
                        n4 = 30;
                        if (n7 < n4) {
                            long l3 = SystemClock.uptimeMillis();
                            long l4 = mL0.d;
                            long l7 = 30000;
                            long l8 = l3 - (l4 += l7);
                            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                            if (object <= 0) return (int)(mL0.e ? 1 : 0) != 0;
                        }
                        n7 = 0;
                        Object var11_8 = null;
                        mL0.c = 0;
                        mL0.d = l2 = SystemClock.uptimeMillis();
                        stringArray = mL0.b;
                        if ((stringArray = stringArray.list()) != null) break block6;
                        stringArray = new String[]{};
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if ((n4 = stringArray.length) < (n3 = 800)) {
                    n7 = 1;
                }
                mL0.e = n7;
                return (int)(mL0.e ? 1 : 0) != 0;
            }
            throw throwable2;
        }
    }
}

