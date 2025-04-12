/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o$c;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.a_0;
import java.util.Arrays;

public final class GapWorker$b
implements RecyclerView$o$c {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int n3, int n4) {
        if (n3 >= 0) {
            if (n4 >= 0) {
                int[] nArray;
                int n7 = this.d;
                int n8 = n7 * 2;
                int[] nArray2 = this.c;
                int n10 = 4;
                if (nArray2 == null) {
                    nArray = new int[n10];
                    this.c = nArray;
                    int n14 = -1;
                    Arrays.fill(nArray, n14);
                } else {
                    int n15 = nArray2.length;
                    if (n8 >= n15) {
                        nArray = new int[n7 *= 4];
                        this.c = nArray;
                        n10 = nArray2.length;
                        n15 = 0;
                        System.arraycopy(nArray2, 0, nArray, 0, n10);
                    }
                }
                nArray = this.c;
                nArray[n8] = n3;
                nArray[++n8] = n4;
                this.d = n3 = this.d + 1;
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Pixel distance must be non-negative");
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Layout positions must be non-negative");
        throw illegalArgumentException;
    }

    public final void b(RecyclerView object, boolean bl2) {
        int n3;
        this.d = 0;
        Object object2 = this.c;
        if (object2 != null) {
            n3 = -1;
            Arrays.fill(object2, n3);
        }
        object2 = ((RecyclerView)object).mLayout;
        Object object3 = ((RecyclerView)object).mAdapter;
        if (object3 != null && object2 != null && (n3 = (int)(object2.isItemPrefetchEnabled() ? 1 : 0)) != 0) {
            int n4;
            if (bl2) {
                object3 = ((RecyclerView)object).mAdapterHelper;
                n3 = (int)(((a_0)object3).g() ? 1 : 0);
                if (n3 == 0) {
                    object3 = ((RecyclerView)object).mAdapter;
                    n3 = ((RecyclerView$f)object3).getItemCount();
                    object2.collectInitialPrefetchPositions(n3, this);
                }
            } else {
                n3 = (int)(((RecyclerView)object).hasPendingAdapterUpdates() ? 1 : 0);
                if (n3 == 0) {
                    n3 = this.a;
                    n4 = this.b;
                    RecyclerView$y recyclerView$y = ((RecyclerView)object).mState;
                    object2.collectAdjacentPrefetchPositions(n3, n4, recyclerView$y, this);
                }
            }
            if ((n3 = this.d) > (n4 = object2.mPrefetchMaxCountObserved)) {
                object2.mPrefetchMaxCountObserved = n3;
                object2.mPrefetchMaxObservedInInitialPrefetch = bl2;
                object = ((RecyclerView)object).mRecycler;
                ((RecyclerView$u)object).o();
            }
        }
    }
}

