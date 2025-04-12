/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class AppCompatImageView
extends ImageView {
    private final Qm mBackgroundTintHelper;
    private boolean mHasLevel;
    private final un mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        this.mHasLevel = false;
        Um3.a(this.getContext(), (View)this);
        super((View)this);
        this.mBackgroundTintHelper = object;
        ((Qm)object).d(attributeSet, n3);
        this.mImageHelper = object = new un(this);
        ((un)object).b(attributeSet, n3);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.mBackgroundTintHelper;
        if (object != null) {
            ((Qm)object).a();
        }
        if ((object = this.mImageHelper) != null) {
            ((un)object).a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Qm qm = this.mBackgroundTintHelper;
        qm = qm != null ? qm.b() : null;
        return qm;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Qm qm = this.mBackgroundTintHelper;
        qm = qm != null ? qm.c() : null;
        return qm;
    }

    public ColorStateList getSupportImageTintList() {
        Object object = this.mImageHelper;
        ColorStateList colorStateList = null;
        if (object != null && (object = ((un)object).b) != null) {
            colorStateList = ((Rn3)object).a;
        }
        return colorStateList;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Object object = this.mImageHelper;
        PorterDuff.Mode mode = null;
        if (object != null && (object = ((un)object).b) != null) {
            mode = ((Rn3)object).b;
        }
        return mode;
    }

    public boolean hasOverlappingRendering() {
        Drawable drawable2 = this.mImageHelper.a.getBackground();
        boolean bl2 = drawable2 instanceof RippleDrawable;
        boolean bl3 = true;
        if (!(bl2 ^= bl3) || !(bl2 = super.hasOverlappingRendering())) {
            bl3 = false;
        }
        return bl3;
    }

    public void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.mBackgroundTintHelper;
        if (object != null) {
            ((Qm)object).e();
        }
    }

    public void setBackgroundResource(int n3) {
        super.setBackgroundResource(n3);
        Qm qm = this.mBackgroundTintHelper;
        if (qm != null) {
            qm.f(n3);
        }
    }

    public void setImageBitmap(Bitmap object) {
        super.setImageBitmap((Bitmap)object);
        object = this.mImageHelper;
        if (object != null) {
            ((un)object).a();
        }
    }

    public void setImageDrawable(Drawable object) {
        int n3;
        un un3 = this.mImageHelper;
        if (un3 != null && object != null && (n3 = this.mHasLevel) == 0) {
            un3.d = n3 = object.getLevel();
        }
        super.setImageDrawable((Drawable)object);
        object = this.mImageHelper;
        if (object != null) {
            ((un)object).a();
            int n4 = this.mHasLevel;
            if (n4 == 0) {
                object = this.mImageHelper;
                un3 = ((un)object).a;
                Drawable drawable2 = un3.getDrawable();
                if (drawable2 != null) {
                    un3 = un3.getDrawable();
                    n4 = ((un)object).d;
                    un3.setLevel(n4);
                }
            }
        }
    }

    public void setImageLevel(int n3) {
        super.setImageLevel(n3);
        this.mHasLevel = true;
    }

    public void setImageResource(int n3) {
        un un3 = this.mImageHelper;
        if (un3 != null) {
            un3.c(n3);
        }
    }

    public void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.mImageHelper;
        if (object != null) {
            ((un)object).a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Qm qm = this.mBackgroundTintHelper;
        if (qm != null) {
            qm.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Qm qm = this.mBackgroundTintHelper;
        if (qm != null) {
            qm.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        un un3 = this.mImageHelper;
        if (un3 != null) {
            boolean bl2;
            Rn3 rn3 = un3.b;
            if (rn3 == null) {
                un3.b = rn3 = new Object();
            }
            rn3 = un3.b;
            rn3.a = colorStateList;
            rn3.d = bl2 = true;
            un3.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        un un3 = this.mImageHelper;
        if (un3 != null) {
            boolean bl2;
            Rn3 rn3 = un3.b;
            if (rn3 == null) {
                un3.b = rn3 = new Object();
            }
            rn3 = un3.b;
            rn3.b = mode;
            rn3.c = bl2 = true;
            un3.a();
        }
    }
}

