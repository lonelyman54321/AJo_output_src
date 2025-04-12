/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.CheckedTextView
 *  android.widget.CursorAdapter
 */
package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$b;

public final class c
extends CursorAdapter {
    public final int a;
    public final int b;
    public final /* synthetic */ AlertController$RecycleListView c;
    public final /* synthetic */ AlertController d;
    public final /* synthetic */ AlertController$b e;

    public c(AlertController$b object, ContextThemeWrapper contextThemeWrapper, Cursor object2, AlertController$RecycleListView alertController$RecycleListView, AlertController alertController) {
        int n3;
        int n4;
        this.e = object;
        this.c = alertController$RecycleListView;
        this.d = alertController;
        super((Context)contextThemeWrapper, object2, false);
        contextThemeWrapper = this.getCursor();
        object2 = ((AlertController$b)object).K;
        this.a = n4 = contextThemeWrapper.getColumnIndexOrThrow((String)object2);
        object = ((AlertController$b)object).L;
        this.b = n3 = contextThemeWrapper.getColumnIndexOrThrow((String)object);
    }

    public final void bindView(View view, Context object, Cursor cursor) {
        view = (CheckedTextView)view.findViewById(16908308);
        int bl2 = this.a;
        object = cursor.getString(bl2);
        view.setText((CharSequence)object);
        int n3 = cursor.getPosition();
        int n4 = this.b;
        boolean bl3 = cursor.getInt(n4);
        boolean bl4 = true;
        if (bl3 != bl4) {
            bl4 = false;
            cursor = null;
        }
        this.c.setItemChecked(n3, bl4);
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        context = this.e.b;
        int n3 = this.d.L;
        return context.inflate(n3, viewGroup, false);
    }
}

