/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;

public final class yn
extends vn {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f = null;
    public PorterDuff.Mode g = null;
    public boolean h = false;
    public boolean i = false;

    public yn(SeekBar seekBar) {
        super((ProgressBar)seekBar);
        this.d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int n3) {
        int n4;
        super.a(attributeSet, n3);
        SeekBar seekBar = this.d;
        Object object = seekBar.getContext();
        Object object2 = R$styleable.AppCompatSeekBar;
        object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
        object2 = this.d;
        Context context = object2.getContext();
        int[] nArray = R$styleable.AppCompatSeekBar;
        TypedArray typedArray = ((Tn3)object).b;
        ViewCompat.r((View)object2, context, nArray, attributeSet, typedArray, n3, 0);
        int n7 = R$styleable.AppCompatSeekBar_android_thumb;
        attributeSet = ((Tn3)object).c(n7);
        if (attributeSet != null) {
            seekBar.setThumb((Drawable)attributeSet);
        }
        n7 = R$styleable.AppCompatSeekBar_tickMark;
        attributeSet = ((Tn3)object).b(n7);
        Object object3 = this.e;
        if (object3 != null) {
            n4 = 0;
            object2 = null;
            object3.setCallback(null);
        }
        this.e = attributeSet;
        if (attributeSet != null) {
            attributeSet.setCallback((Drawable.Callback)seekBar);
            n3 = seekBar.getLayoutDirection();
            ut0_0.c((Drawable)attributeSet, n3);
            n3 = (int)(attributeSet.isStateful() ? 1 : 0);
            if (n3 != 0) {
                object3 = seekBar.getDrawableState();
                attributeSet.setState((int[])object3);
            }
            this.c();
        }
        seekBar.invalidate();
        n7 = R$styleable.AppCompatSeekBar_tickMarkTintMode;
        object3 = ((Tn3)object).b;
        n7 = (int)(object3.hasValue(n7) ? 1 : 0);
        boolean bl2 = true;
        if (n7 != 0) {
            n7 = R$styleable.AppCompatSeekBar_tickMarkTintMode;
            n4 = -1;
            n7 = object3.getInt(n7, n4);
            object2 = this.g;
            attributeSet = uu0_0.c(n7, (PorterDuff.Mode)object2);
            this.g = attributeSet;
            this.i = bl2;
        }
        n7 = R$styleable.AppCompatSeekBar_tickMarkTint;
        if ((n7 = (int)(object3.hasValue(n7) ? 1 : 0)) != 0) {
            n7 = R$styleable.AppCompatSeekBar_tickMarkTint;
            attributeSet = ((Tn3)object).a(n7);
            this.f = attributeSet;
            this.h = bl2;
        }
        ((Tn3)object).g();
        this.c();
    }

    public final void c() {
        boolean bl2;
        Drawable drawable2 = this.e;
        if (drawable2 != null && ((bl2 = this.h) || (bl2 = this.i))) {
            boolean bl3;
            Object object;
            this.e = drawable2 = ut0_0.h(drawable2.mutate());
            bl2 = this.h;
            if (bl2) {
                object = this.f;
                drawable2.setTintList(object);
            }
            if (bl3 = this.i) {
                drawable2 = this.e;
                object = this.g;
                drawable2.setTintMode((PorterDuff.Mode)object);
            }
            if (bl3 = (drawable2 = this.e).isStateful()) {
                drawable2 = this.e;
                object = this.d.getDrawableState();
                drawable2.setState((int[])object);
            }
        }
    }

    public final void d(Canvas canvas) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2 = this.d;
            int n3 = drawable2.getMax();
            int n4 = 1;
            float f5 = Float.MIN_VALUE;
            if (n3 > n4) {
                float f6;
                Drawable drawable3 = this.e;
                int n7 = drawable3.getIntrinsicWidth();
                Drawable drawable4 = this.e;
                int n8 = drawable4.getIntrinsicHeight();
                if (n7 >= 0) {
                    n7 /= 2;
                } else {
                    n7 = 1;
                    f6 = Float.MIN_VALUE;
                }
                if (n8 >= 0) {
                    n4 = n8 / 2;
                }
                drawable4 = this.e;
                int n10 = -n7;
                int n14 = -n4;
                drawable4.setBounds(n10, n14, n7, n4);
                n4 = drawable2.getWidth();
                n7 = drawable2.getPaddingLeft();
                n4 -= n7;
                n7 = drawable2.getPaddingRight();
                f5 = n4 -= n7;
                f6 = n3;
                f5 /= f6;
                n7 = canvas.save();
                n8 = drawable2.getPaddingLeft();
                float f7 = n8;
                float f8 = drawable2.getHeight() / 2;
                canvas.translate(f7, f8);
                f8 = 0.0f;
                drawable2 = null;
                for (int i3 = 0; i3 <= n3; ++i3) {
                    this.e.draw(canvas);
                    n8 = 0;
                    f7 = 0.0f;
                    drawable4 = null;
                    canvas.translate(f5, 0.0f);
                }
                canvas.restoreToCount(n7);
            }
        }
    }
}

