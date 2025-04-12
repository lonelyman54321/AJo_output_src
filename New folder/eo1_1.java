/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/*
 * Renamed from eO1
 */
public abstract class eo1_1
implements q43,
h,
AdapterView.OnItemClickListener {
    public Rect a;

    public static int c(ListAdapter listAdapter, Context context, int n3) {
        int n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n7 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n8 = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int n10 = 0;
        int n14 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            int n15 = listAdapter.getItemViewType(i3);
            if (n15 != n14) {
                view = null;
                n14 = n15;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, (ViewGroup)frameLayout);
            view.measure(n4, n7);
            n15 = view.getMeasuredWidth();
            if (n15 >= n3) {
                return n3;
            }
            if (n15 <= n10) continue;
            n10 = n15;
        }
        return n10;
    }

    public abstract void b(d var1);

    public final boolean collapseItemActionView(d d2, f f5) {
        return false;
    }

    public abstract void d(View var1);

    public abstract void e(boolean var1);

    public final boolean expandItemActionView(d d2, f f5) {
        return false;
    }

    public abstract void f(int var1);

    public abstract void g(int var1);

    public final int getId() {
        return 0;
    }

    public abstract void h(PopupWindow.OnDismissListener var1);

    public abstract void i(boolean var1);

    public final void initForMenu(Context context, d d2) {
    }

    public abstract void j(int var1);

    public final void onItemClick(AdapterView adapterView, View object, int n3, long l2) {
        boolean bl2 = (adapterView = (ListAdapter)adapterView.getAdapter()) instanceof HeaderViewListAdapter;
        if (bl2) {
            object = adapterView;
            object = (c)((HeaderViewListAdapter)adapterView).getWrappedAdapter();
        } else {
            object = adapterView;
            object = (c)adapterView;
        }
        object = ((c)((Object)object)).a;
        adapterView = (MenuItem)((Adapter)adapterView).getItem(n3);
        n3 = this instanceof CascadingMenuPopup ^ 1;
        n3 = n3 != 0 ? 0 : 4;
        ((d)object).performItemAction((MenuItem)adapterView, this, n3);
    }
}

