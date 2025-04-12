/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.GapWorker$c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

public final class GapWorker$a
implements Comparator {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compare(Object object, Object object2) {
        int n3;
        object = (GapWorker$c)object;
        object2 = (GapWorker$c)object2;
        RecyclerView recyclerView = ((GapWorker$c)object).d;
        int n4 = 0;
        int n7 = 1;
        int n8 = recyclerView == null ? 1 : 0;
        RecyclerView recyclerView2 = ((GapWorker$c)object2).d;
        if (recyclerView2 == null) {
            n3 = 1;
        } else {
            n3 = 0;
            recyclerView2 = null;
        }
        if (n8 != n3) {
            if (recyclerView != null) return -1;
            return 1;
        }
        int n10 = ((GapWorker$c)object).a;
        n8 = ((GapWorker$c)object2).a;
        if (n10 != n8) {
            if (n10 == 0) return 1;
            return -1;
        }
        n10 = ((GapWorker$c)object2).b;
        n7 = ((GapWorker$c)object).b;
        if ((n10 -= n7) != 0) {
            return n10;
        }
        int n14 = ((GapWorker$c)object).c;
        int n15 = ((GapWorker$c)object2).c;
        if ((n14 -= n15) == 0) return n4;
        return n14;
    }
}

