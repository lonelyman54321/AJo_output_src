/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.f$a;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.b$a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;

public final class b
implements h,
AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public d c;
    public ExpandedMenuView d;
    public final int e;
    public h$a f;
    public b$a g;

    public b(Context context, int n3) {
        this.e = n3;
        this.a = context;
        context = LayoutInflater.from((Context)context);
        this.b = context;
    }

    public final boolean collapseItemActionView(d d2, f f5) {
        return false;
    }

    public final boolean expandItemActionView(d d2, f f5) {
        return false;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return 0;
    }

    public final void initForMenu(Context object, d d2) {
        Context context = this.a;
        if (context != null) {
            this.a = object;
            context = this.b;
            if (context == null) {
                object = LayoutInflater.from((Context)object);
                this.b = object;
            }
        }
        this.c = d2;
        object = this.g;
        if (object != null) {
            object.notifyDataSetChanged();
        }
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        h$a h$a = this.f;
        if (h$a != null) {
            h$a.onCloseMenu(d2, bl2);
        }
    }

    public final void onItemClick(AdapterView object, View object2, int n3, long l2) {
        object = this.c;
        object2 = this.g.c(n3);
        ((d)object).performItemAction((MenuItem)object2, this, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable = (Bundle)parcelable;
        Object object = "android:menu:list";
        if ((parcelable = parcelable.getSparseParcelableArray((String)object)) != null) {
            object = this.d;
            object.restoreHierarchyState((SparseArray)parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView == null) {
            return null;
        }
        expandedMenuView = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView2 = this.d;
        if (expandedMenuView2 != null) {
            expandedMenuView2.saveHierarchyState(sparseArray);
        }
        expandedMenuView.putSparseParcelableArray("android:menu:list", sparseArray);
        return expandedMenuView;
    }

    public final boolean onSubMenuSelected(j j3) {
        boolean bl2 = j3.hasVisibleItems();
        if (!bl2) {
            return false;
        }
        h$a h$a = new Object();
        ((e)h$a).a = j3;
        Object object = j3.getContext();
        Object object2 = new f$a((Context)object);
        Object object3 = ((f$a)object2).getContext();
        int n3 = R$layout.abc_list_menu_item_layout;
        object = new b((Context)object3, n3);
        ((e)h$a).c = object;
        ((b)object).f = h$a;
        j3.addMenuPresenter((h)object);
        object = ((e)h$a).c;
        object3 = ((b)object).g;
        if (object3 == null) {
            object3 = new b$a((b)object);
            ((b)object).g = object3;
        }
        object = ((b)object).g;
        ((f$a)object2).setAdapter((ListAdapter)object, (DialogInterface.OnClickListener)h$a);
        object = j3.getHeaderView();
        if (object != null) {
            ((f$a)object2).setCustomTitle((View)object);
        } else {
            object = j3.getHeaderIcon();
            object = ((f$a)object2).setIcon((Drawable)object);
            object3 = j3.getHeaderTitle();
            ((f$a)object).setTitle((CharSequence)object3);
        }
        ((f$a)object2).setOnKeyListener((DialogInterface.OnKeyListener)h$a);
        ((e)h$a).b = object2 = ((f$a)object2).create();
        object2.setOnDismissListener((DialogInterface.OnDismissListener)h$a);
        object2 = ((e)h$a).b.getWindow().getAttributes();
        ((WindowManager.LayoutParams)object2).type = 1003;
        int n4 = ((WindowManager.LayoutParams)object2).flags;
        int n7 = 131072;
        ((WindowManager.LayoutParams)object2).flags = n4 |= n7;
        ((e)h$a).b.show();
        h$a = this.f;
        if (h$a != null) {
            h$a.a(j3);
        }
        return true;
    }

    public final void setCallback(h$a h$a) {
        this.f = h$a;
    }

    public final void updateMenuView(boolean bl2) {
        b$a b$a = this.g;
        if (b$a != null) {
            b$a.notifyDataSetChanged();
        }
    }
}

