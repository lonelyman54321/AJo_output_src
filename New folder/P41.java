/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

public final class P41
extends RecyclerView$s {
    public final /* synthetic */ M41 a;

    public P41(M41 m41) {
        this.a = m41;
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        boolean bl2;
        int n7;
        int n8;
        Object object2;
        int n10;
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        object = ((RecyclerView)object).getLayoutManager();
        n3 = object instanceof LinearLayoutManager;
        n4 = 0;
        Object object3 = null;
        if (n3 != 0) {
            object = (LinearLayoutManager)object;
        } else {
            n10 = 0;
            object = null;
        }
        if (object != null) {
            n3 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n8 = ((Number)object2).intValue();
            object = ((LinearLayoutManager)object).findViewByPosition(n8);
        } else {
            n10 = 0;
            object = null;
        }
        n8 = 0;
        string2 = null;
        if (object != null) {
            n7 = -object.getTop();
            n3 = (Integer)object2;
            n10 = object.getHeight() * n3 + n7;
        } else {
            n10 = 0;
            object = null;
        }
        object2 = this.a;
        Object object4 = ((M41)object2).e;
        if (object4 != null) {
            n7 = ((ViewPager2)((Object)object4)).getCurrentItem();
            object4 = n7;
        } else {
            n7 = 0;
            object4 = null;
        }
        String string3 = "null cannot be cast to non-null type kotlin.Int";
        Intrinsics.checkNotNull(object4, string3);
        ((Integer)object4).intValue();
        int n14 = 300;
        if (n10 > n14 && !(bl2 = ((M41)object2).O)) {
            object = ((M41)object2).B;
            if (object != null) {
                object3 = object = ((h02_0)object).o.get(object4);
                object3 = (Fragment)object;
            }
            if ((n10 = object3 instanceof D02) != 0 && (n10 = (int)(((Fragment)(object3 = (D02)object3)).isAdded() ? 1 : 0)) != 0) {
                ((D02)object3).Oa();
            }
            n10 = 1;
            ((M41)object2).O = n10;
        } else if (n10 <= n14 && (n10 = (int)(((M41)object2).O ? 1 : 0)) != 0) {
            object = ((M41)object2).B;
            if (object != null) {
                object3 = object = ((h02_0)object).o.get(object4);
                object3 = (Fragment)object;
            }
            if ((n10 = object3 instanceof D02) != 0 && (n10 = (int)(((Fragment)(object3 = (D02)object3)).isAdded() ? 1 : 0)) != 0) {
                ((D02)object3).Pa();
            }
            ((M41)object2).O = false;
            ((M41)object2).A(false);
        }
    }
}

