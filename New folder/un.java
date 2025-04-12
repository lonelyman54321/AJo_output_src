/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;

public final class un {
    public final ImageView a;
    public Rn3 b;
    public Rn3 c;
    public int d = 0;

    public un(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        Object object = this.a;
        Drawable drawable2 = object.getDrawable();
        if (drawable2 != null) {
            uu0_0.a(drawable2);
        }
        if (drawable2 != null) {
            Rn3 rn3;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 21;
            if (n3 <= n4 && n3 == n4) {
                rn3 = this.c;
                if (rn3 == null) {
                    this.c = rn3 = new Object();
                }
                rn3 = this.c;
                n4 = 0;
                rn3.a = null;
                rn3.d = false;
                rn3.b = null;
                rn3.c = false;
                ColorStateList colorStateList = object.getImageTintList();
                boolean bl2 = true;
                if (colorStateList != null) {
                    rn3.d = bl2;
                    rn3.a = colorStateList;
                }
                if ((colorStateList = object.getImageTintMode()) != null) {
                    rn3.c = bl2;
                    rn3.b = colorStateList;
                }
                if ((n4 = (int)(rn3.d ? 1 : 0)) != 0 || (n4 = (int)(rn3.c ? 1 : 0)) != 0) {
                    object = object.getDrawableState();
                    qn.e(drawable2, rn3, (int[])object);
                    return;
                }
            }
            if ((rn3 = this.b) != null) {
                object = object.getDrawableState();
                qn.e(drawable2, rn3, (int[])object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(AttributeSet attributeSet, int n3) {
        Throwable throwable2;
        Object object;
        block11: {
            ImageView imageView = this.a;
            object = imageView.getContext();
            Object object2 = R$styleable.AppCompatImageView;
            int n4 = 0;
            object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
            object2 = this.a;
            Context context = object2.getContext();
            int[] nArray = R$styleable.AppCompatImageView;
            TypedArray typedArray = ((Tn3)object).b;
            ViewCompat.r((View)object2, context, nArray, attributeSet, typedArray, n3, 0);
            try {
                attributeSet = imageView.getDrawable();
                n3 = -1;
            }
            catch (Throwable throwable2) {
                break block11;
            }
            object2 = ((Tn3)object).b;
            if (attributeSet == null) {
                n4 = R$styleable.AppCompatImageView_srcCompat;
                if ((n4 = object2.getResourceId(n4, n3)) != n3) {
                    attributeSet = imageView.getContext();
                    if ((attributeSet = xn.a((Context)attributeSet, n4)) != null) {
                        imageView.setImageDrawable((Drawable)attributeSet);
                    }
                }
            }
            if (attributeSet != null) {
                uu0_0.a((Drawable)attributeSet);
            }
            int n7 = R$styleable.AppCompatImageView_tint;
            if ((n7 = (int)(object2.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.AppCompatImageView_tint;
                attributeSet = ((Tn3)object).a(n7);
                Me1.a(imageView, (ColorStateList)attributeSet);
            }
            n7 = R$styleable.AppCompatImageView_tintMode;
            if ((n7 = (int)(object2.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.AppCompatImageView_tintMode;
                n7 = object2.getInt(n7, n3);
                n3 = 0;
                Object object3 = null;
                attributeSet = uu0_0.c(n7, null);
                n3 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode((PorterDuff.Mode)attributeSet);
                n7 = 21;
                if (n3 == n7 && (attributeSet = imageView.getDrawable()) != null && (object3 = imageView.getImageTintList()) != null) {
                    n3 = (int)(attributeSet.isStateful() ? 1 : 0);
                    if (n3 != 0) {
                        object3 = imageView.getDrawableState();
                        attributeSet.setState((int[])object3);
                    }
                    imageView.setImageDrawable((Drawable)attributeSet);
                }
            }
            ((Tn3)object).g();
            return;
        }
        ((Tn3)object).g();
        throw throwable2;
    }

    public final void c(int n3) {
        ImageView imageView = this.a;
        if (n3 != 0) {
            Context context = imageView.getContext();
            Drawable drawable2 = xn.a(context, n3);
            if (drawable2 != null) {
                uu0_0.a(drawable2);
            }
            imageView.setImageDrawable(drawable2);
        } else {
            n3 = 0;
            Object var4_5 = null;
            imageView.setImageDrawable(null);
        }
        this.a();
    }
}

