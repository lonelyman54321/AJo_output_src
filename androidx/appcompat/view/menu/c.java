/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 */
package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;
import java.util.ArrayList;

public final class c
extends BaseAdapter {
    public final d a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public c(d d2, LayoutInflater layoutInflater, boolean bl2, int n3) {
        this.d = bl2;
        this.e = layoutInflater;
        this.a = d2;
        this.f = n3;
        this.b();
    }

    public final void b() {
        Object object = this.a;
        f f5 = ((d)object).getExpandedItem();
        if (f5 != null) {
            object = ((d)object).getNonActionItems();
            int n3 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                f f6 = (f)((ArrayList)object).get(i3);
                if (f6 != f5) continue;
                this.b = i3;
                return;
            }
        }
        this.b = -1;
    }

    public final f c(int n3) {
        boolean bl2 = this.d;
        d d2 = this.a;
        ArrayList arrayList = bl2 ? d2.getNonActionItems() : d2.getVisibleItems();
        int n4 = this.b;
        if (n4 >= 0 && n3 >= n4) {
            ++n3;
        }
        return (f)arrayList.get(n3);
    }

    public final int getCount() {
        boolean bl2 = this.d;
        d d2 = this.a;
        ArrayList arrayList = bl2 ? d2.getNonActionItems() : d2.getVisibleItems();
        int n3 = this.b;
        if (n3 < 0) {
            return arrayList.size();
        }
        return arrayList.size() + -1;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final View getView(int n3, View view, ViewGroup object) {
        int n4;
        if (view == null) {
            view = this.e;
            n4 = this.f;
            view = view.inflate(n4, (ViewGroup)object, false);
        }
        object = this.c(n3);
        int n7 = ((f)object).b;
        n4 = n3 + -1;
        if (n4 >= 0) {
            f f5 = this.c(n4);
            n4 = f5.b;
        } else {
            n4 = n7;
        }
        Object object2 = view;
        object2 = (ListMenuItemView)view;
        d d2 = this.a;
        boolean bl2 = d2.isGroupDividerEnabled();
        boolean bl3 = true;
        if (bl2 && n7 != n4) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        ((ListMenuItemView)object2).setGroupDividerEnabled(n7 != 0);
        object = view;
        object = (i$a)view;
        n4 = (int)(this.c ? 1 : 0);
        if (n4 != 0) {
            ((ListMenuItemView)object2).setForceShowIcon(bl3);
        }
        f f6 = this.c(n3);
        object.initialize(f6, 0);
        return view;
    }

    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}

