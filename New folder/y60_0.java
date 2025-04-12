/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.remoteconfig.R$id;

/*
 * Renamed from y60
 */
public final class y60_0
extends x60_0
implements n82$a {
    public static final SparseIntArray g;
    public final n82 e;
    public long f;

    static {
        SparseIntArray sparseIntArray;
        g = sparseIntArray = new SparseIntArray();
        int n3 = R$id.search_text;
        sparseIntArray.put(n3, 3);
        n3 = R$id.toggle_edit;
        sparseIntArray.put(n3, 4);
        n3 = R$id.list;
        sparseIntArray.put(n3, 5);
    }

    public y60_0(ai0_0 object, View view) {
        Object[] objectArray = g;
        objectArray = ViewDataBinding.mapBindings((ai0_0)object, view, 6, null, (SparseIntArray)objectArray);
        ImageView imageView = (ImageView)objectArray[1];
        RecyclerView recyclerView = (RecyclerView)objectArray[5];
        recyclerView = (ProgressBar)objectArray[2];
        EditText cfr_ignored_0 = (EditText)objectArray[3];
        ImageView cfr_ignored_1 = (ImageView)objectArray[4];
        super(object, view, imageView, (ProgressBar)recyclerView);
        this.f = -1;
        this.a.setTag(null);
        ((CardView)((Object)objectArray[0])).setTag(null);
        this.b.setTag(null);
        this.setRootTag(view);
        this.e = object = new n82(this);
        this.invalidateAll();
    }

    public final void a() {
        yv2_0 yv2_02 = this.c;
        if (yv2_02 != null) {
            yv2_02 = yv2_02.a;
            yv2_02.onBackPressed();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(yv2_0 yv2_02) {
        this.c = yv2_02;
        synchronized (this) {
            long l2 = this.f;
            long l3 = 2;
            this.f = l2 |= l3;
        }
        this.notifyPropertyChanged(5);
        super.requestRebind();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void executeBindings() {
        long l2;
        long l3;
        long l4;
        long l7;
        synchronized (this) {
            l7 = this.f;
            this.f = l4 = 0L;
        }
        boolean bl2 = this.d;
        long l8 = 5;
        long l12 = l7 & l8;
        int n3 = 0;
        long l14 = l12 == l4 ? 0 : (l12 < l4 ? -1 : 1);
        if (l14 != false) {
            if (l14 != false) {
                l12 = bl2 ? (long)16 : (long)8;
                l7 |= l12;
            }
            if (!bl2) {
                n3 = 8;
            }
        }
        if (bl2 = (l3 = (l12 = (long)4 & l7) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1)) {
            ImageView imageView = this.a;
            n82 n822 = this.e;
            imageView.setOnClickListener((View.OnClickListener)n822);
        }
        if (bl2 = (l2 = (l7 &= l8) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) {
            ProgressBar progressBar = this.b;
            progressBar.setVisibility(n3);
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
            this.f = l2 = (long)4;
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
        int n4 = 4;
        if (n4 == n3) {
            object = (Boolean)object;
            n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
            this.d = n3;
            synchronized (this) {
                long l2 = this.f;
                long l3 = 1L;
                this.f = l2 |= l3;
            }
            this.notifyPropertyChanged(n4);
            super.requestRebind();
            return 1 != 0;
        } else {
            n4 = 5;
            if (n4 != n3) {
                return 0 != 0;
            }
            object = (yv2_0)object;
            this.b((yv2_0)object);
        }
        return 1 != 0;
    }
}

