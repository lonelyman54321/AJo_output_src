/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class AA3$g
extends Drawable.ConstantState {
    public int a;
    public AA3$f b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public int getChangingConfigurations() {
        return this.a;
    }

    public final Drawable newDrawable() {
        aa3_1 aa3_12 = new aa3_1(this);
        return aa3_12;
    }

    public final Drawable newDrawable(Resources object) {
        object = new aa3_1(this);
        return object;
    }
}

