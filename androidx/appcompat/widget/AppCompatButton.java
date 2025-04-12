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
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Button
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.b;

public class AppCompatButton
extends Button
implements Vn3 {
    private sn mAppCompatEmojiTextHelper;
    private final Qm mBackgroundTintHelper;
    private final b mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.buttonStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatButton(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        super((View)this);
        this.mBackgroundTintHelper = object;
        ((Qm)object).d(attributeSet, n3);
        this.mTextHelper = object = new b((TextView)this);
        ((b)object).f(attributeSet, n3);
        ((b)object).b();
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

    public int getAutoSizeMaxTextSize() {
        boolean bl2 = dE3.c;
        if (bl2) {
            return super.getAutoSizeMaxTextSize();
        }
        b b2 = this.mTextHelper;
        if (b2 != null) {
            return Math.round(b2.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        boolean bl2 = dE3.c;
        if (bl2) {
            return super.getAutoSizeMinTextSize();
        }
        b b2 = this.mTextHelper;
        if (b2 != null) {
            return Math.round(b2.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        boolean bl2 = dE3.c;
        if (bl2) {
            return super.getAutoSizeStepGranularity();
        }
        b b2 = this.mTextHelper;
        if (b2 != null) {
            return Math.round(b2.i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        boolean bl2 = dE3.c;
        if (bl2) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b b2 = this.mTextHelper;
        if (b2 != null) {
            return b2.i.f;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        int n3 = dE3.c;
        int n4 = 0;
        if (n3 != 0) {
            int n7;
            n3 = super.getAutoSizeTextType();
            if (n3 == (n7 = 1)) {
                n4 = 1;
            }
            return n4;
        }
        b b2 = this.mTextHelper;
        if (b2 != null) {
            return b2.i.a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Hm3.g(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        String string2 = Button.class.getName();
        accessibilityEvent.setClassName((CharSequence)string2);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string2 = Button.class.getName();
        accessibilityNodeInfo.setClassName((CharSequence)string2);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        Object object = this.mTextHelper;
        if (object != null && (n3 = (int)(dE3.c ? 1 : 0)) == 0) {
            object = ((b)object).i;
            ((Cn)object).a();
        }
    }

    public void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        boolean bl2;
        super.onTextChanged((CharSequence)object, n3, n4, n7);
        object = this.mTextHelper;
        if (object != null && (n3 = (int)(dE3.c ? 1 : 0)) == 0 && (bl2 = ((Cn)(object = ((b)object).i)).f())) {
            object = this.mTextHelper.i;
            ((Cn)object).a();
        }
    }

    public void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.getEmojiTextViewHelper().d(bl2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int n3, int n4, int n7, int n8) {
        boolean bl2 = dE3.c;
        if (bl2) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n3, n4, n7, n8);
        } else {
            b b2 = this.mTextHelper;
            if (b2 != null) {
                b2.h(n3, n4, n7, n8);
            }
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] nArray, int n3) {
        boolean bl2 = dE3.c;
        if (bl2) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n3);
        } else {
            b b2 = this.mTextHelper;
            if (b2 != null) {
                b2.i(nArray, n3);
            }
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n3) {
        boolean bl2 = dE3.c;
        if (bl2) {
            super.setAutoSizeTextTypeWithDefaults(n3);
        } else {
            b b2 = this.mTextHelper;
            if (b2 != null) {
                b2.j(n3);
            }
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback2) {
        callback2 = Hm3.h(callback2, (TextView)this);
        super.setCustomSelectionActionModeCallback(callback2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.getEmojiTextViewHelper().e(bl2);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        inputFilterArray = this.getEmojiTextViewHelper().a(inputFilterArray);
        super.setFilters(inputFilterArray);
    }

    public void setSupportAllCaps(boolean bl2) {
        b b2 = this.mTextHelper;
        if (b2 != null) {
            b2 = b2.a;
            b2.setAllCaps(bl2);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    public void setTextAppearance(Context context, int n3) {
        super.setTextAppearance(context, n3);
        b b2 = this.mTextHelper;
        if (b2 != null) {
            b2.g(n3, context);
        }
    }

    public void setTextSize(int n3, float f5) {
        boolean bl2 = dE3.c;
        if (bl2) {
            super.setTextSize(n3, f5);
        } else {
            Cn cn2;
            boolean bl3;
            b b2 = this.mTextHelper;
            if (b2 != null && !bl2 && !(bl3 = (cn2 = b2.i).f())) {
                cn2.g(f5, n3);
            }
        }
    }
}

