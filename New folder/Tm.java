/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CompoundButton
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;

public final class Tm {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public Tm(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        boolean bl2;
        CompoundButton compoundButton = this.a;
        Drawable drawable2 = R30.a(compoundButton);
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
                object = compoundButton.getDrawableState();
                drawable2.setState((int[])object);
            }
            compoundButton.setButtonDrawable(drawable2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(AttributeSet attributeSet, int n3) {
        Throwable throwable22;
        Object object;
        block10: {
            Context context;
            int n4;
            Object object2;
            CompoundButton compoundButton;
            block9: {
                compoundButton = this.a;
                object = compoundButton.getContext();
                object2 = R$styleable.CompoundButton;
                object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
                object2 = ((Tn3)object).b;
                CompoundButton compoundButton2 = this.a;
                Context context2 = compoundButton2.getContext();
                int[] nArray = R$styleable.CompoundButton;
                TypedArray typedArray = ((Tn3)object).b;
                ViewCompat.r((View)compoundButton2, context2, nArray, attributeSet, typedArray, n3, 0);
                try {
                    n4 = R$styleable.CompoundButton_buttonCompat;
                    n4 = object2.hasValue(n4) ? 1 : 0;
                    if (n4 != 0) {
                        n4 = R$styleable.CompoundButton_buttonCompat;
                        if ((n4 = object2.getResourceId(n4, 0)) != 0) {
                            try {
                                context = compoundButton.getContext();
                                attributeSet = xn.a(context, n4);
                                compoundButton.setButtonDrawable((Drawable)attributeSet);
                                break block9;
                            }
                            catch (Resources.NotFoundException notFoundException) {}
                        }
                    }
                    n4 = R$styleable.CompoundButton_android_button;
                    if ((n4 = (int)(object2.hasValue(n4) ? 1 : 0)) == 0) break block9;
                    n4 = R$styleable.CompoundButton_android_button;
                    if ((n4 = object2.getResourceId(n4, 0)) == 0) break block9;
                    context = compoundButton.getContext();
                    attributeSet = xn.a(context, n4);
                    compoundButton.setButtonDrawable((Drawable)attributeSet);
                }
                catch (Throwable throwable22) {
                    break block10;
                }
            }
            n4 = R$styleable.CompoundButton_buttonTint;
            n4 = object2.hasValue(n4) ? 1 : 0;
            if (n4 != 0) {
                n4 = R$styleable.CompoundButton_buttonTint;
                attributeSet = ((Tn3)object).a(n4);
                compoundButton.setButtonTintList((ColorStateList)attributeSet);
            }
            n4 = R$styleable.CompoundButton_buttonTintMode;
            if ((n4 = (int)(object2.hasValue(n4) ? 1 : 0)) != 0) {
                n4 = R$styleable.CompoundButton_buttonTintMode;
                n3 = -1;
                n4 = object2.getInt(n4, n3);
                n3 = 0;
                context = null;
                attributeSet = uu0_0.c(n4, null);
                compoundButton.setButtonTintMode((PorterDuff.Mode)attributeSet);
            }
            ((Tn3)object).g();
            return;
        }
        ((Tn3)object).g();
        throw throwable22;
    }
}

