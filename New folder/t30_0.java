/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/*
 * Renamed from t30
 */
public final class t30_0
implements yr0_2,
ar0_2 {
    public G92 a;
    public volatile boolean b;

    public static void e(G92 object) {
        if (object == null) {
            return;
        }
        object = object.d;
        int n3 = ((Object[])object).length;
        ArrayList<Throwable> arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            boolean bl2 = object2 instanceof yr0_2;
            if (!bl2) continue;
            object2 = (yr0_2)object2;
            try {
                object2.dispose();
                continue;
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                if (arrayList == null) {
                    arrayList = new ArrayList<Throwable>();
                }
                arrayList.add(throwable);
            }
        }
        if (arrayList != null) {
            int n4 = arrayList.size();
            if (n4 == (n3 = 1)) {
                throw uc0_2.a((Throwable)arrayList.get(0));
            }
            object = new CompositeException(arrayList);
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(yr0_2 yr0_22) {
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        Object[] objectArray;
        Object object2;
        block10: {
            block9: {
                object2 = "disposables is null";
                x03_0.b(yr0_22, (String)object2);
                boolean bl2 = this.b;
                if (bl2) {
                    return false;
                }
                // MONITORENTER : this
                bl2 = this.b;
                if (bl2) {
                    // MONITOREXIT : this
                    return false;
                }
                object2 = this.a;
                if (object2 == null) break block9;
                objectArray = ((G92)object2).d;
                n8 = ((G92)object2).a;
                n7 = yr0_22.hashCode() * -1640531527;
                n4 = n7 >>> 16;
                object = objectArray[n7 = (n7 ^ n4) & n8];
                if (object == null) {
                    return false;
                }
                n4 = (int)(object.equals(yr0_22) ? 1 : 0);
                n3 = 1;
                if (n4 != 0) {
                    ((G92)object2).b(objectArray, n7, n8);
                    return n3 != 0;
                }
                break block10;
            }
            // MONITOREXIT : this
            return false;
        }
        do {
            if ((object = objectArray[n7 = n7 + n3 & n8]) != null) continue;
            return false;
        } while ((n4 = (int)(object.equals(yr0_22) ? 1 : 0)) == 0);
        ((G92)object2).b(objectArray, n7, n8);
        // MONITOREXIT : this
        return n3 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(yr0_2 yr0_22) {
        block9: {
            Object object = "disposable is null";
            x03_0.b(yr0_22, (String)object);
            boolean bl2 = this.b;
            if (!bl2) {
                synchronized (this) {
                    Throwable throwable2;
                    block8: {
                        block6: {
                            block7: {
                                int n3;
                                float f5;
                                int n4;
                                try {
                                    bl2 = this.b;
                                    if (bl2) break block6;
                                    object = this.a;
                                    if (object != null) break block7;
                                    object = new Object();
                                    n4 = 15;
                                    n4 = Integer.numberOfLeadingZeros(n4);
                                    n4 = 32 - n4;
                                    f5 = Float.MIN_VALUE;
                                    n4 = 1 << n4;
                                    n3 = n4 + -1;
                                }
                                catch (Throwable throwable2) {
                                    break block8;
                                }
                                {
                                    ((G92)object).a = n3;
                                }
                                f5 = n4;
                                float f6 = 0.75f * f5;
                                n3 = (int)f6;
                                ((G92)object).c = n3;
                                Object[] objectArray = new Object[n4];
                                ((G92)object).d = objectArray;
                                this.a = object;
                            }
                            ((G92)object).a(yr0_22);
                            return true;
                        }
                        break block9;
                    }
                    throw throwable2;
                }
            }
        }
        yr0_22.dispose();
        return false;
    }

    public final boolean c(yr0_2 yr0_22) {
        boolean bl2 = this.a(yr0_22);
        if (bl2) {
            yr0_22.dispose();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        // MONITORENTER : this
        bl2 = this.b;
        if (bl2) {
            // MONITOREXIT : this
            return;
        }
        G92 g92 = this.a;
        this.a = null;
        // MONITOREXIT : this
        t30_0.e(g92);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void dispose() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        // MONITORENTER : this
        bl2 = this.b;
        if (bl2) {
            // MONITOREXIT : this
            return;
        }
        this.b = bl2 = true;
        G92 g92 = this.a;
        this.a = null;
        // MONITOREXIT : this
        t30_0.e(g92);
    }

    public final boolean isDisposed() {
        return this.b;
    }
}

