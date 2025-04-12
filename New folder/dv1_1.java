/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.remoteconfig.R$id;
import com.ril.ajio.remoteconfig.devsettings.Data;

/*
 * Renamed from dv1
 */
public final class dv1_1
extends cv1_1
implements n82$a {
    public static final SparseIntArray g;
    public final LinearLayout d;
    public final n82 e;
    public long f;

    static {
        SparseIntArray sparseIntArray;
        g = sparseIntArray = new SparseIntArray();
        int n3 = R$id.key;
        sparseIntArray.put(n3, 1);
        n3 = R$id.value;
        sparseIntArray.put(n3, 2);
    }

    public dv1_1(ai0_0 object, View view) {
        Object[] objectArray = g;
        objectArray = ViewDataBinding.mapBindings((ai0_0)object, view, 3, null, (SparseIntArray)objectArray);
        TextView cfr_ignored_0 = (TextView)objectArray[1];
        TextView cfr_ignored_1 = (TextView)objectArray[2];
        super(object, view, 0);
        this.f = -1;
        object = (LinearLayout)objectArray[0];
        this.d = object;
        object.setTag(null);
        this.setRootTag(view);
        this.e = object = new n82(this);
        this.invalidateAll();
    }

    public final void a() {
        int n3 = this.b;
        sk1_0 sk1_02 = this.c;
        Data data = this.a;
        if (sk1_02 != null) {
            sk1_02.Y(data, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Data data) {
        this.a = data;
        synchronized (this) {
            long l2 = this.f;
            long l3 = 4;
            this.f = l2 |= l3;
        }
        this.notifyPropertyChanged(1);
        super.requestRebind();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(sk1_0 sk1_02) {
        this.c = sk1_02;
        synchronized (this) {
            long l2 = this.f;
            long l3 = 2;
            this.f = l2 |= l3;
        }
        this.notifyPropertyChanged(2);
        super.requestRebind();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void executeBindings() {
        long l2;
        synchronized (this) {
            long l3 = this.f;
            this.f = l2 = 0L;
        }
        long l4 = 8;
        long l7 = (l3 &= l4) - l2;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 != false) {
            LinearLayout linearLayout = this.d;
            n82 n822 = this.e;
            linearLayout.setOnClickListener((View.OnClickListener)n822);
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
                    long l2 = this.f;
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
            this.f = l2 = (long)8;
        }
        this.requestRebind();
    }

    public final boolean onFieldChange(int n3, Object object, int n4) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean setVariable(int n3, Object object) {
        boolean bl2 = true;
        int n4 = 3;
        if (n4 == n3) {
            object = (Integer)object;
            this.b = n3 = ((Integer)object).intValue();
            synchronized (this) {
                long l2 = this.f;
                long l3 = 1L;
                this.f = l2 |= l3;
            }
            this.notifyPropertyChanged(n4);
            super.requestRebind();
            return bl2;
        }
        n4 = 2;
        if (n4 == n3) {
            object = (sk1_0)object;
            this.c((sk1_0)object);
            return bl2;
        }
        if (bl2 != n3) return false;
        object = (Data)object;
        this.b((Data)object);
        return bl2;
    }
}

