/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.remoteconfig.R$id;
import com.ril.ajio.remoteconfig.R$layout;

/*
 * Renamed from i3
 */
public final class i3_0
extends h3_0 {
    public static final ViewDataBinding$h c;
    public static final SparseIntArray d;
    public long b;

    static {
        ViewDataBinding$h viewDataBinding$h;
        c = viewDataBinding$h = new ViewDataBinding$h();
        String[] stringArray = new String[]{"content_config_edit"};
        int[] nArray = new int[]{1};
        int n3 = R$layout.content_config_edit;
        int[] nArray2 = new int[]{n3};
        viewDataBinding$h.a[0] = stringArray;
        viewDataBinding$h.b[0] = nArray;
        viewDataBinding$h.c[0] = nArray2;
        viewDataBinding$h = new SparseIntArray();
        d = viewDataBinding$h;
        int n4 = R$id.toolbar;
        viewDataBinding$h.put(n4, 2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void executeBindings() {
        synchronized (this) {
            long l2;
            this.b = l2 = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                long l2 = this.b;
                long l3 = 0L;
                boolean bl2 = true;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 != false) {
                    return bl2;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : this
                x60_0 x60_02 = this.a;
                boolean bl3 = x60_02.hasPendingBindings();
                if (bl3) {
                    return bl2;
                }
                return false;
            }
            catch (Throwable throwable) {}
            throw throwable;
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
            this.b = l2 = (long)2;
        }
        this.a.invalidateAll();
        this.requestRebind();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onFieldChange(int n3, Object object, int n4) {
        boolean bl2 = false;
        if (n3 != 0) {
            return false;
        }
        object = (x60_0)object;
        if (n4 != 0) return bl2;
        synchronized (this) {
            long l2 = this.b;
            long l3 = 1L;
            this.b = l2 |= l3;
            return true;
        }
    }

    public final void setLifecycleOwner(mu1_1 mu1_12) {
        super.setLifecycleOwner(mu1_12);
        this.a.setLifecycleOwner(mu1_12);
    }

    public final boolean setVariable(int n3, Object object) {
        return true;
    }
}

