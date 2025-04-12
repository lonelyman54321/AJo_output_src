/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class AlertController$b {
    public int A;
    public int B;
    public int C;
    public boolean D = false;
    public boolean[] E;
    public boolean F;
    public boolean G;
    public int H = -1;
    public DialogInterface.OnMultiChoiceClickListener I;
    public Cursor J;
    public String K;
    public String L;
    public AdapterView.OnItemSelectedListener M;
    public final Context a;
    public final LayoutInflater b;
    public int c = 0;
    public Drawable d;
    public CharSequence e;
    public View f;
    public CharSequence g;
    public CharSequence h;
    public Drawable i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public Drawable l;
    public DialogInterface.OnClickListener m;
    public CharSequence n;
    public Drawable o;
    public DialogInterface.OnClickListener p;
    public boolean q;
    public DialogInterface.OnCancelListener r;
    public DialogInterface.OnDismissListener s;
    public DialogInterface.OnKeyListener t;
    public CharSequence[] u;
    public ListAdapter v;
    public DialogInterface.OnClickListener w;
    public int x;
    public View y;
    public int z;

    public AlertController$b(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.q = true;
        contextThemeWrapper = (LayoutInflater)contextThemeWrapper.getSystemService("layout_inflater");
        this.b = contextThemeWrapper;
    }
}

