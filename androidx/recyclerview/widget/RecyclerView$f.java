/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  android.view.ViewGroup
 */
package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.RecyclerView$g;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.List;

public abstract class RecyclerView$f {
    private boolean mHasStableIds;
    private final RecyclerView$g mObservable;
    private RecyclerView$f$a mStateRestorationPolicy;

    public RecyclerView$f() {
        Object object;
        this.mObservable = object;
        this.mHasStableIds = false;
        object = RecyclerView$f$a.ALLOW;
        this.mStateRestorationPolicy = object;
    }

    public final void bindViewHolder(RecyclerView$B object, int n3) {
        int n4;
        boolean bl2;
        int n7 = 0;
        Object object2 = null;
        RecyclerView$f recyclerView$f = ((RecyclerView$B)object).mBindingAdapter;
        int n8 = 1;
        if (recyclerView$f == null) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$f = null;
        }
        if (bl2) {
            ((RecyclerView$B)object).mPosition = n3;
            n4 = this.hasStableIds();
            if (n4 != 0) {
                long l2;
                ((RecyclerView$B)object).mItemId = l2 = this.getItemId(n3);
            }
            ((RecyclerView$B)object).setFlags(n8, 519);
            n4 = ip3.a();
            if (n4 != 0) {
                n4 = ((RecyclerView$B)object).mItemViewType;
                Integer n10 = n4;
                Object[] objectArray = new Object[n8];
                objectArray[0] = n10;
                object2 = String.format("RV onBindViewHolder type=0x%X", objectArray);
                Trace.beginSection((String)object2);
            }
        }
        ((RecyclerView$B)object).mBindingAdapter = this;
        n7 = RecyclerView.sDebugAssertionsEnabled;
        if (n7 != 0) {
            object2 = ((RecyclerView$B)object).itemView.getParent();
            if (object2 == null && (n7 = (object2 = ((RecyclerView$B)object).itemView).isAttachedToWindow()) != (n4 = (int)(((RecyclerView$B)object).isTmpDetached() ? 1 : 0))) {
                object2 = new StringBuilder("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                bl2 = ((RecyclerView$B)object).isTmpDetached();
                ((StringBuilder)object2).append(bl2);
                ((StringBuilder)object2).append(", attached to window: ");
                bl2 = ((RecyclerView$B)object).itemView.isAttachedToWindow();
                ((StringBuilder)object2).append(bl2);
                ((StringBuilder)object2).append(", holder: ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            object2 = ((RecyclerView$B)object).itemView.getParent();
            if (object2 == null && (n7 = (int)((object2 = ((RecyclerView$B)object).itemView).isAttachedToWindow() ? 1 : 0)) != 0) {
                object2 = new StringBuilder("Attempting to bind attached holder with no parent (AKA temp detached): ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
        }
        object2 = ((RecyclerView$B)object).getUnmodifiedPayloads();
        this.onBindViewHolder((RecyclerView$B)object, n3, (List)object2);
        if (bl2) {
            ((RecyclerView$B)object).clearPayload();
            object = ((RecyclerView$B)object).itemView.getLayoutParams();
            n3 = object instanceof RecyclerView$LayoutParams;
            if (n3 != 0) {
                object = (RecyclerView$LayoutParams)((Object)object);
                ((RecyclerView$LayoutParams)((Object)object)).mInsetsDirty = n8;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        RecyclerView$f$a recyclerView$f$a = this.mStateRestorationPolicy;
        boolean bl2 = recyclerView$f$a.ordinal();
        boolean bl3 = false;
        boolean bl4 = true;
        if (bl2 != bl4) {
            boolean bl5 = 2 != 0;
            if (bl2 != bl5) {
                return bl4;
            }
            return false;
        }
        int n3 = this.getItemCount();
        if (n3 > 0) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final RecyclerView$B createViewHolder(ViewGroup object, int n3) {
        Throwable throwable2;
        block4: {
            try {
                String string2;
                boolean bl2 = ip3.a();
                if (bl2) {
                    string2 = "RV onCreateViewHolder type=0x%X";
                    Integer n4 = n3;
                    int n7 = 1;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = n4;
                    string2 = String.format(string2, objectArray);
                    Trace.beginSection((String)string2);
                }
                object = this.onCreateViewHolder((ViewGroup)object, n3);
                string2 = object.itemView;
                if ((string2 = string2.getParent()) != null) break block4;
                object.mItemViewType = n3;
            }
            catch (Throwable throwable2) {}
            Trace.endSection();
            return object;
        }
        String string3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)";
        object = new IllegalStateException(string3);
        throw object;
        Trace.endSection();
        throw throwable2;
    }

    public int findRelativeAdapterPositionIn(RecyclerView$f recyclerView$f, RecyclerView$B recyclerView$B, int n3) {
        if (recyclerView$f == this) {
            return n3;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int n3) {
        return -1;
    }

    public int getItemViewType(int n3) {
        return 0;
    }

    public final RecyclerView$f$a getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int n3) {
        this.mObservable.d(n3, 1, null);
    }

    public final void notifyItemChanged(int n3, Object object) {
        this.mObservable.d(n3, 1, object);
    }

    public final void notifyItemInserted(int n3) {
        this.mObservable.e(n3, 1);
    }

    public final void notifyItemMoved(int n3, int n4) {
        this.mObservable.c(n3, n4);
    }

    public final void notifyItemRangeChanged(int n3, int n4) {
        this.mObservable.d(n3, n4, null);
    }

    public final void notifyItemRangeChanged(int n3, int n4, Object object) {
        this.mObservable.d(n3, n4, object);
    }

    public final void notifyItemRangeInserted(int n3, int n4) {
        this.mObservable.e(n3, n4);
    }

    public final void notifyItemRangeRemoved(int n3, int n4) {
        this.mObservable.f(n3, n4);
    }

    public final void notifyItemRemoved(int n3) {
        this.mObservable.f(n3, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(RecyclerView$B var1, int var2);

    public void onBindViewHolder(RecyclerView$B recyclerView$B, int n3, List list) {
        this.onBindViewHolder(recyclerView$B, n3);
    }

    public abstract RecyclerView$B onCreateViewHolder(ViewGroup var1, int var2);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(RecyclerView$B recyclerView$B) {
        return false;
    }

    public void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
    }

    public void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
    }

    public void onViewRecycled(RecyclerView$B recyclerView$B) {
    }

    public void registerAdapterDataObserver(RecyclerView$h recyclerView$h) {
        this.mObservable.registerObserver(recyclerView$h);
    }

    public void setHasStableIds(boolean bl2) {
        boolean bl3 = this.hasObservers();
        if (!bl3) {
            this.mHasStableIds = bl2;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        throw illegalStateException;
    }

    public void setStateRestorationPolicy(RecyclerView$f$a recyclerView$f$a) {
        this.mStateRestorationPolicy = recyclerView$f$a;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(RecyclerView$h recyclerView$h) {
        this.mObservable.unregisterObserver(recyclerView$h);
    }
}

