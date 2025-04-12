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
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.EditText
 *  android.widget.MultiAutoCompleteTextView
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
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.b;

public class AppCompatMultiAutoCompleteTextView
extends MultiAutoCompleteTextView
implements Vn3 {
    public static final int[] d = new int[]{16843126};
    public final Qm a;
    public final b b;
    public final rn c;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.autoCompleteTextViewStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatMultiAutoCompleteTextView(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        object = this.getContext();
        Object object2 = d;
        boolean bl2 = false;
        object = Tn3.f((Context)object, attributeSet, object2, n3, 0);
        object2 = ((Tn3)object).b;
        boolean bl3 = object2.hasValue(0);
        if (bl3) {
            object2 = ((Tn3)object).b(0);
            this.setDropDownBackgroundDrawable((Drawable)object2);
        }
        ((Tn3)object).g();
        this.a = object = new Qm((View)this);
        ((Qm)object).d(attributeSet, n3);
        this.b = object = new b((TextView)this);
        ((b)object).f(attributeSet, n3);
        ((b)object).b();
        this.c = object = new rn((EditText)this);
        ((rn)object).b(attributeSet, n3);
        attributeSet = this.getKeyListener();
        n3 = attributeSet instanceof NumberKeyListener ^ 1;
        if (n3 != 0) {
            n3 = (int)(super.isFocusable() ? 1 : 0);
            bl3 = super.isClickable();
            bl2 = super.isLongClickable();
            int n4 = super.getInputType();
            if ((object = ((rn)object).a((KeyListener)attributeSet)) != attributeSet) {
                super.setKeyListener((KeyListener)object);
                super.setRawInputType(n4);
                super.setFocusable(n3 != 0);
                super.setClickable(bl3);
                super.setLongClickable(bl2);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((Qm)object).a();
        }
        if ((object = this.b) != null) {
            ((b)object).b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Qm qm = this.a;
        qm = qm != null ? qm.b() : null;
        return qm;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Qm qm = this.a;
        qm = qm != null ? qm.c() : null;
        return qm;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        tn.a(inputConnection, editorInfo, (View)this);
        return this.c.c(inputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((Qm)object).e();
        }
    }

    public void setBackgroundResource(int n3) {
        super.setBackgroundResource(n3);
        Qm qm = this.a;
        if (qm != null) {
            qm.f(n3);
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables((Drawable)object, drawable2, drawable3, drawable4);
        object = this.b;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable2, drawable3, drawable4);
        object = this.b;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setDropDownBackgroundResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setDropDownBackgroundDrawable(drawable2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.c.d(bl2);
    }

    public void setKeyListener(KeyListener keyListener) {
        keyListener = this.c.a(keyListener);
        super.setKeyListener(keyListener);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Qm qm = this.a;
        if (qm != null) {
            qm.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Qm qm = this.a;
        if (qm != null) {
            qm.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        b b2 = this.b;
        b2.k(colorStateList);
        b2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        b b2 = this.b;
        b2.l(mode);
        b2.b();
    }

    public void setTextAppearance(Context context, int n3) {
        super.setTextAppearance(context, n3);
        b b2 = this.b;
        if (b2 != null) {
            b2.g(n3, context);
        }
    }
}

