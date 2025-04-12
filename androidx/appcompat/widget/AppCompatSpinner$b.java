/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.drawable.Drawable
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.f;
import androidx.appcompat.app.f$a;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatSpinner$d;

public final class AppCompatSpinner$b
implements AppCompatSpinner$d,
DialogInterface.OnClickListener {
    public f a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ AppCompatSpinner d;

    public AppCompatSpinner$b(AppCompatSpinner appCompatSpinner) {
        this.d = appCompatSpinner;
    }

    public final boolean a() {
        boolean bl2;
        f f5 = this.a;
        if (f5 != null) {
            bl2 = f5.isShowing();
        } else {
            bl2 = false;
            f5 = null;
        }
        return bl2;
    }

    public final int b() {
        return 0;
    }

    public final void d(int n3) {
    }

    public final void dismiss() {
        f f5 = this.a;
        if (f5 != null) {
            f5.dismiss();
            f5 = null;
            this.a = null;
        }
    }

    public final CharSequence e() {
        return this.c;
    }

    public final Drawable f() {
        return null;
    }

    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void h(int n3) {
    }

    public final void i(int n3) {
    }

    public final void j(int n3, int n4) {
        Object object = this.b;
        if (object == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.d;
        Object object2 = appCompatSpinner.getPopupContext();
        object = new f$a((Context)object2);
        object2 = this.c;
        if (object2 != null) {
            object.setTitle((CharSequence)object2);
        }
        object2 = this.b;
        int n7 = appCompatSpinner.getSelectedItemPosition();
        object = object.setSingleChoiceItems((ListAdapter)object2, n7, (DialogInterface.OnClickListener)this).create();
        this.a = object;
        object = object.a.g;
        object.setTextDirection(n3);
        object.setTextAlignment(n4);
        this.a.show();
    }

    public final int k() {
        return 0;
    }

    public final void m(ListAdapter listAdapter) {
        this.b = listAdapter;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.d;
        object.setSelection(n3);
        AdapterView.OnItemClickListener onItemClickListener = object.getOnItemClickListener();
        if (onItemClickListener != null) {
            onItemClickListener = this.b;
            long l2 = onItemClickListener.getItemId(n3);
            object.performItemClick(null, n3, l2);
        }
        this.dismiss();
    }

    public final void setBackgroundDrawable(Drawable drawable2) {
    }
}

