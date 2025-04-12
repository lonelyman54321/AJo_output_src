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
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.CheckedTextView
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.b;
import androidx.core.view.ViewCompat;

public class AppCompatCheckedTextView
extends CheckedTextView
implements Vn3 {
    public final Sm a;
    public final Qm b;
    public final b c;
    public sn d;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.checkedTextViewStyle;
        this(context, attributeSet, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AppCompatCheckedTextView(Context object, AttributeSet attributeSet, int n3) {
        Throwable throwable22;
        block10: {
            int n4;
            ColorStateList colorStateList;
            int n7;
            Object object2;
            block9: {
                Qn3.a((Context)object);
                super((Context)object, attributeSet, n3);
                Um3.a(this.getContext(), (View)this);
                this.c = object = new b((TextView)this);
                ((b)object).f(attributeSet, n3);
                ((b)object).b();
                this.b = object = new Qm((View)this);
                ((Qm)object).d(attributeSet, n3);
                this.a = object = new Sm(this);
                object = this.getContext();
                object2 = R$styleable.CheckedTextView;
                n7 = 0;
                colorStateList = null;
                object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
                object2 = ((Tn3)object).b;
                Context context = this.getContext();
                int[] nArray = R$styleable.CheckedTextView;
                TypedArray typedArray = ((Tn3)object).b;
                AppCompatCheckedTextView appCompatCheckedTextView = this;
                ViewCompat.r((View)this, context, nArray, attributeSet, typedArray, n3, 0);
                try {
                    n4 = R$styleable.CheckedTextView_checkMarkCompat;
                    n4 = (int)(object2.hasValue(n4) ? 1 : 0);
                    if (n4 != 0) {
                        n4 = R$styleable.CheckedTextView_checkMarkCompat;
                        if ((n4 = object2.getResourceId(n4, 0)) != 0) {
                            try {
                                context = this.getContext();
                                appCompatCheckedTextView = xn.a(context, n4);
                                this.setCheckMarkDrawable((Drawable)appCompatCheckedTextView);
                                break block9;
                            }
                            catch (Resources.NotFoundException notFoundException) {}
                        }
                    }
                    n4 = R$styleable.CheckedTextView_android_checkMark;
                    if ((n4 = (int)(object2.hasValue(n4) ? 1 : 0)) == 0 || (n7 = object2.getResourceId(n4 = R$styleable.CheckedTextView_android_checkMark, 0)) == 0) break block9;
                    appCompatCheckedTextView = this.getContext();
                    colorStateList = xn.a((Context)appCompatCheckedTextView, n7);
                    this.setCheckMarkDrawable((Drawable)colorStateList);
                }
                catch (Throwable throwable22) {
                    break block10;
                }
            }
            n7 = R$styleable.CheckedTextView_checkMarkTint;
            n7 = (int)(object2.hasValue(n7) ? 1 : 0);
            if (n7 != 0) {
                n7 = R$styleable.CheckedTextView_checkMarkTint;
                colorStateList = ((Tn3)object).a(n7);
                this.setCheckMarkTintList(colorStateList);
            }
            n7 = R$styleable.CheckedTextView_checkMarkTintMode;
            if ((n7 = (int)(object2.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.CheckedTextView_checkMarkTintMode;
                n4 = -1;
                int n8 = object2.getInt(n7, n4);
                n7 = 0;
                colorStateList = null;
                object2 = uu0_0.c(n8, null);
                this.setCheckMarkTintMode((PorterDuff.Mode)object2);
            }
            ((Tn3)object).g();
            this.getEmojiTextViewHelper().c(attributeSet, n3);
            return;
        }
        ((Tn3)object).g();
        throw throwable22;
    }

    private sn getEmojiTextViewHelper() {
        sn sn4 = this.d;
        if (sn4 == null) {
            this.d = sn4 = new sn((TextView)this);
        }
        return this.d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.c;
        if (object != null) {
            ((b)object).b();
        }
        if ((object = this.b) != null) {
            ((Qm)object).a();
        }
        if ((object = this.a) != null) {
            ((Sm)object).a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Hm3.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        Qm qm = this.b;
        qm = qm != null ? qm.b() : null;
        return qm;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Qm qm = this.b;
        qm = qm != null ? qm.c() : null;
        return qm;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        Sm sm = this.a;
        sm = sm != null ? sm.b : null;
        return sm;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        Sm sm = this.a;
        sm = sm != null ? sm.c : null;
        return sm;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        tn.a(inputConnection, editorInfo, (View)this);
        return inputConnection;
    }

    public void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.getEmojiTextViewHelper().d(bl2);
    }

    public void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.b;
        if (object != null) {
            ((Qm)object).e();
        }
    }

    public void setBackgroundResource(int n3) {
        super.setBackgroundResource(n3);
        Qm qm = this.b;
        if (qm != null) {
            qm.f(n3);
        }
    }

    public void setCheckMarkDrawable(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setCheckMarkDrawable(drawable2);
    }

    public void setCheckMarkDrawable(Drawable object) {
        super.setCheckMarkDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            boolean bl2 = ((Sm)object).f;
            if (bl2) {
                bl2 = false;
                ((Sm)object).f = false;
            } else {
                ((Sm)object).f = bl2 = true;
                ((Sm)object).a();
            }
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables((Drawable)object, drawable2, drawable3, drawable4);
        object = this.c;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable2, drawable3, drawable4);
        object = this.c;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback2) {
        callback2 = Hm3.h(callback2, (TextView)this);
        super.setCustomSelectionActionModeCallback(callback2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.getEmojiTextViewHelper().e(bl2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Qm qm = this.b;
        if (qm != null) {
            qm.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Qm qm = this.b;
        if (qm != null) {
            qm.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        Sm sm = this.a;
        if (sm != null) {
            boolean bl2;
            sm.b = colorStateList;
            sm.d = bl2 = true;
            sm.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        Sm sm = this.a;
        if (sm != null) {
            boolean bl2;
            sm.c = mode;
            sm.e = bl2 = true;
            sm.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b b2 = this.c;
        b2.k(colorStateList);
        b2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b b2 = this.c;
        b2.l(mode);
        b2.b();
    }

    public void setTextAppearance(Context context, int n3) {
        super.setTextAppearance(context, n3);
        b b2 = this.c;
        if (b2 != null) {
            b2.g(n3, context);
        }
    }
}

