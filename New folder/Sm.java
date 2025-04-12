/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.widget.CheckedTextView
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public final class Sm {
    public final CheckedTextView a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public Sm(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    public final void a() {
        boolean bl2;
        CheckedTextView checkedTextView = this.a;
        Drawable drawable2 = checkedTextView.getCheckMarkDrawable();
        if (drawable2 != null && ((bl2 = this.d) || (bl2 = this.e))) {
            Object object;
            drawable2 = ut0_0.h(drawable2).mutate();
            bl2 = this.d;
            if (bl2) {
                object = this.b;
                drawable2.setTintList(object);
            }
            if (bl2 = this.e) {
                object = this.c;
                drawable2.setTintMode((PorterDuff.Mode)object);
            }
            if (bl2 = drawable2.isStateful()) {
                object = checkedTextView.getDrawableState();
                drawable2.setState((int[])object);
            }
            checkedTextView.setCheckMarkDrawable(drawable2);
        }
    }
}

