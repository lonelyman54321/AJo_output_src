/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.b;

public class AppCompatRadioButton
extends RadioButton
implements Un3,
Vn3 {
    private sn mAppCompatEmojiTextHelper;
    private final Qm mBackgroundTintHelper;
    private final Tm mCompoundButtonHelper;
    private final b mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.radioButtonStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatRadioButton(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        super((CompoundButton)this);
        this.mCompoundButtonHelper = object;
        ((Tm)object).b(attributeSet, n3);
        this.mBackgroundTintHelper = object = new Qm((View)this);
        ((Qm)object).d(attributeSet, n3);
        this.mTextHelper = object = new b((TextView)this);
        ((b)object).f(attributeSet, n3);
        this.getEmojiTextViewHelper().c(attributeSet, n3);
    }

    private sn getEmojiTextViewHelper() {
        sn sn4 = this.mAppCompatEmojiTextHelper;
        if (sn4 == null) {
            this.mAppCompatEmojiTextHelper = sn4 = new sn((TextView)this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.mBackgroundTintHelper;
        if (object != null) {
            ((Qm)object).a();
        }
        if ((object = this.mTextHelper) != null) {
            ((b)object).b();
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

    public ColorStateList getSupportButtonTintList() {
        Tm tm = this.mCompoundButtonHelper;
        tm = tm != null ? tm.b : null;
        return tm;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        Tm tm = this.mCompoundButtonHelper;
        tm = tm != null ? tm.c : null;
        return tm;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b();
    }

    public void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.getEmojiTextViewHelper().d(bl2);
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

    public void setButtonDrawable(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setButtonDrawable(drawable2);
    }

    public void setButtonDrawable(Drawable object) {
        super.setButtonDrawable((Drawable)object);
        object = this.mCompoundButtonHelper;
        if (object != null) {
            boolean bl2 = ((Tm)object).f;
            if (bl2) {
                bl2 = false;
                ((Tm)object).f = false;
            } else {
                ((Tm)object).f = bl2 = true;
                ((Tm)object).a();
            }
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables((Drawable)object, drawable2, drawable3, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable2, drawable3, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.getEmojiTextViewHelper().e(bl2);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        inputFilterArray = this.getEmojiTextViewHelper().a(inputFilterArray);
        super.setFilters(inputFilterArray);
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        Tm tm = this.mCompoundButtonHelper;
        if (tm != null) {
            boolean bl2;
            tm.b = colorStateList;
            tm.d = bl2 = true;
            tm.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        Tm tm = this.mCompoundButtonHelper;
        if (tm != null) {
            boolean bl2;
            tm.c = mode;
            tm.e = bl2 = true;
            tm.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }
}

