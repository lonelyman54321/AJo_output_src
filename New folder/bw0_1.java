/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
import android.util.SparseIntArray;
import com.ril.ajio.remoteconfig.R$id;

/*
 * Renamed from bW0
 */
public final class bw0_1
extends aW0 {
    public static final SparseIntArray b;
    public long a;

    static {
        SparseIntArray sparseIntArray;
        b = sparseIntArray = new SparseIntArray();
        int n3 = R$id.key;
        sparseIntArray.put(n3, 1);
        n3 = R$id.value_card;
        sparseIntArray.put(n3, 2);
        n3 = R$id.value;
        sparseIntArray.put(n3, 3);
        n3 = R$id.edit_card;
        sparseIntArray.put(n3, 4);
        n3 = R$id.edit;
        sparseIntArray.put(n3, 5);
        n3 = R$id.space;
        sparseIntArray.put(n3, 6);
        n3 = R$id.cancel_tv;
        sparseIntArray.put(n3, 7);
        n3 = R$id.save;
        sparseIntArray.put(n3, 8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void executeBindings() {
        synchronized (this) {
            long l2;
            this.a = l2 = 0L;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean hasPendingBindings() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    long l2 = this.a;
                    long l3 = 0L;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 != false) {
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void invalidateAll() {
        synchronized (this) {
            long l2;
            this.a = l2 = 1L;
        }
        this.requestRebind();
    }

    public final boolean onFieldChange(int n3, Object object, int n4) {
        return false;
    }

    public final boolean setVariable(int n3, Object object) {
        return true;
    }
}

