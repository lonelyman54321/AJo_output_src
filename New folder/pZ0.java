/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.transition.R$id;
import java.util.ArrayList;

public final class pZ0
extends FrameLayout {
    public static final /* synthetic */ int c;
    public ViewGroup a;
    public boolean b;

    public static void a(View view, ArrayList arrayList) {
        ViewParent viewParent = view.getParent();
        boolean bl2 = viewParent instanceof ViewGroup;
        if (bl2) {
            viewParent = (View)viewParent;
            pZ0.a((View)viewParent, arrayList);
        }
        arrayList.add(view);
    }

    public final void onViewAdded(View object) {
        boolean bl2 = this.b;
        if (bl2) {
            super.onViewAdded(object);
            return;
        }
        object = new IllegalStateException("This GhostViewHolder is detached!");
        throw object;
    }

    public final void onViewRemoved(View view) {
        int n3;
        View view2;
        super.onViewRemoved(view);
        int n4 = this.getChildCount();
        int n7 = 1;
        if (n4 == n7 && (view2 = this.getChildAt(0)) == view || (n3 = this.getChildCount()) == 0) {
            n3 = R$id.ghost_view_holder;
            n4 = 0;
            view2 = null;
            ViewGroup viewGroup = this.a;
            viewGroup.setTag(n3, null);
            view = viewGroup.getOverlay();
            view.remove((View)this);
            this.b = false;
        }
    }
}

