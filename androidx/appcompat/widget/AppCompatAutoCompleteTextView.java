/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.text.method.KeyListener
 *  android.text.method.NumberKeyListener
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.AutoCompleteTextView
 *  android.widget.EditText
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.b;

public class AppCompatAutoCompleteTextView
extends AutoCompleteTextView
implements Vn3 {
    private static final int[] TINT_ATTRS = new int[]{16843126};
    private final rn mAppCompatEmojiEditTextHelper;
    private final Qm mBackgroundTintHelper;
    private final b mTextHelper;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.autoCompleteTextViewStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatAutoCompleteTextView(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        object = this.getContext();
        Object object2 = TINT_ATTRS;
        object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
        object2 = ((Tn3)object).b;
        boolean bl2 = object2.hasValue(0);
        if (bl2) {
            object2 = ((Tn3)object).b(0);
            this.setDropDownBackgroundDrawable((Drawable)object2);
        }
        ((Tn3)object).g();
        this.mBackgroundTintHelper = object = new Qm((View)this);
        ((Qm)object).d(attributeSet, n3);
        this.mTextHelper = object = new b((TextView)this);
        ((b)object).f(attributeSet, n3);
        ((b)object).b();
        this.mAppCompatEmojiEditTextHelper = object = new rn((EditText)this);
        ((rn)object).b(attributeSet, n3);
        this.initEmojiKeyListener((rn)object);
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

    public void initEmojiKeyListener(rn rn3) {
        KeyListener keyListener = this.getKeyListener();
        rn3.getClass();
        boolean bl2 = keyListener instanceof NumberKeyListener ^ true;
        if (bl2) {
            bl2 = super.isFocusable();
            boolean bl3 = super.isClickable();
            boolean bl4 = super.isLongClickable();
            int n3 = super.getInputType();
            if ((rn3 = rn3.a(keyListener)) == keyListener) {
                return;
            }
            super.setKeyListener((KeyListener)rn3);
            super.setRawInputType(n3);
            super.setFocusable(bl2);
            super.setClickable(bl3);
            super.setLongClickable(bl4);
        }
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.b.a.b.d;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        tn.a(inputConnection, editorInfo, (View)this);
        return this.mAppCompatEmojiEditTextHelper.c(inputConnection, editorInfo);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback2) {
        callback2 = Hm3.h(callback2, (TextView)this);
        super.setCustomSelectionActionModeCallback(callback2);
    }

    public void setDropDownBackgroundResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setDropDownBackgroundDrawable(drawable2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.mAppCompatEmojiEditTextHelper.d(bl2);
    }

    public void setKeyListener(KeyListener keyListener) {
        keyListener = this.mAppCompatEmojiEditTextHelper.a(keyListener);
        super.setKeyListener(keyListener);
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
}

