/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
package androidx.appcompat.app;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$b;

public final class b
extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ AlertController$b b;

    public b(AlertController$b alertController$b, ContextThemeWrapper contextThemeWrapper, int n3, CharSequence[] charSequenceArray, AlertController$RecycleListView alertController$RecycleListView) {
        this.b = alertController$b;
        this.a = alertController$RecycleListView;
        super((Context)contextThemeWrapper, n3, 16908308, (Object[])charSequenceArray);
    }

    public final View getView(int n3, View view, ViewGroup object) {
        ViewGroup viewGroup;
        view = super.getView(n3, view, object);
        object = this.b.E;
        if (object != null && (viewGroup = object[n3]) != false) {
            object = this.a;
            boolean bl2 = true;
            object.setItemChecked(n3, bl2);
        }
        return view;
    }
}

