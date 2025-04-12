/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.a$b_0;
import androidx.recyclerview.widget.a_0;
import java.util.ArrayList;

public final class RecyclerView$w
extends RecyclerView$h {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$w(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.a;
        boolean bl2 = recyclerView.mHasFixedSize;
        if (bl2 && (bl2 = recyclerView.mIsAttached)) {
            Runnable runnable2 = recyclerView.mUpdateChildViewsRunnable;
            recyclerView.postOnAnimation(runnable2);
        } else {
            recyclerView.mAdapterUpdateDuringMeasure = bl2 = true;
            recyclerView.requestLayout();
        }
    }

    public final void onChanged() {
        boolean bl2;
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        Object object = recyclerView.mState;
        ((RecyclerView$y)object).f = bl2 = true;
        recyclerView.processDataSetCompletelyChanged(bl2);
        object = recyclerView.mAdapterHelper;
        boolean bl3 = ((a_0)object).g();
        if (!bl3) {
            recyclerView.requestLayout();
        }
    }

    public final void onItemRangeChanged(int n3, int n4, Object object) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a_0 a_02 = recyclerView.mAdapterHelper;
        int n7 = 1;
        if (n4 < n7) {
            a_02.getClass();
        } else {
            ArrayList arrayList = a_02.b;
            int n8 = 4;
            a$b_0 a$b_0 = a_02.h(n8, object, n3, n4);
            arrayList.add(a$b_0);
            a_02.f = n3 = a_02.f | n8;
            n3 = arrayList.size();
            if (n3 == n7) {
                this.a();
            }
        }
    }

    public final void onItemRangeInserted(int n3, int n4) {
        Object object = this.a;
        ((RecyclerView)object).assertNotInLayoutOrScroll(null);
        object = ((RecyclerView)object).mAdapterHelper;
        int n7 = 1;
        if (n4 < n7) {
            object.getClass();
        } else {
            ArrayList arrayList = ((a_0)object).b;
            a$b_0 a$b_0 = ((a_0)object).h(n7, null, n3, n4);
            arrayList.add(a$b_0);
            ((a_0)object).f = n3 = ((a_0)object).f | n7;
            n3 = arrayList.size();
            if (n3 == n7) {
                this.a();
            }
        }
    }

    public final void onItemRangeMoved(int n3, int n4, int n7) {
        block5: {
            block4: {
                Object object = this.a;
                ((RecyclerView)object).assertNotInLayoutOrScroll(null);
                object = ((RecyclerView)object).mAdapterHelper;
                object.getClass();
                if (n3 == n4) break block4;
                int n8 = 1;
                if (n7 != n8) break block5;
                ArrayList arrayList = ((a_0)object).b;
                int n10 = 8;
                a$b_0 a$b_0 = ((a_0)object).h(n10, null, n3, n4);
                arrayList.add(a$b_0);
                ((a_0)object).f = n3 = ((a_0)object).f | n10;
                n3 = arrayList.size();
                if (n3 == n8) {
                    this.a();
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Moving more than 1 item is not supported yet");
        throw illegalArgumentException;
    }

    public final void onItemRangeRemoved(int n3, int n4) {
        Object object = this.a;
        ((RecyclerView)object).assertNotInLayoutOrScroll(null);
        object = ((RecyclerView)object).mAdapterHelper;
        int n7 = 1;
        if (n4 < n7) {
            object.getClass();
        } else {
            ArrayList arrayList = ((a_0)object).b;
            int n8 = 2;
            a$b_0 a$b_0 = ((a_0)object).h(n8, null, n3, n4);
            arrayList.add(a$b_0);
            ((a_0)object).f = n3 = ((a_0)object).f | n8;
            n3 = arrayList.size();
            if (n3 == n7) {
                this.a();
            }
        }
    }

    public final void onStateRestorationPolicyChanged() {
        boolean bl2;
        RecyclerView recyclerView = this.a;
        Object object = recyclerView.mPendingSavedState;
        if (object == null) {
            return;
        }
        object = recyclerView.mAdapter;
        if (object != null && (bl2 = ((RecyclerView$f)object).canRestoreState())) {
            recyclerView.requestLayout();
        }
    }
}

