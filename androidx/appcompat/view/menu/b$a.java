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
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;
import java.util.ArrayList;

public final class b$a
extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ b b;

    public b$a(b b2) {
        this.b = b2;
        this.b();
    }

    public final void b() {
        Object object = this.b;
        f f5 = ((b)object).c.getExpandedItem();
        if (f5 != null) {
            object = ((b)object).c.getNonActionItems();
            int n3 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                f f6 = (f)((ArrayList)object).get(i3);
                if (f6 != f5) continue;
                this.a = i3;
                return;
            }
        }
        this.a = -1;
    }

    public final f c(int n3) {
        b b2 = this.b;
        ArrayList arrayList = b2.c.getNonActionItems();
        b2.getClass();
        int n4 = this.a;
        if (n4 >= 0 && n3 >= n4) {
            ++n3;
        }
        return (f)arrayList.get(n3);
    }

    public final int getCount() {
        b b2 = this.b;
        ArrayList arrayList = b2.c.getNonActionItems();
        int n3 = arrayList.size();
        b2.getClass();
        int n4 = this.a;
        if (n4 < 0) {
            return n3;
        }
        return n3 + -1;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final View getView(int n3, View object, ViewGroup object2) {
        if (object == null) {
            object = this.b;
            LayoutInflater layoutInflater = object.b;
            int n4 = object.e;
            object = layoutInflater.inflate(n4, (ViewGroup)object2, false);
        }
        object2 = object;
        object2 = (i$a)object;
        f f5 = this.c(n3);
        object2.initialize(f5, 0);
        return object;
    }

    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}

