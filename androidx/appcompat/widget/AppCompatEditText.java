/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.method.KeyListener
 *  android.text.method.NumberKeyListener
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.DragEvent
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.EditText
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatEditText$a;
import androidx.appcompat.widget.b;
import androidx.core.view.ViewCompat;

public class AppCompatEditText
extends EditText
implements W82,
Vn3 {
    private final rn mAppCompatEmojiEditTextHelper;
    private final Qm mBackgroundTintHelper;
    private final nm3_0 mDefaultOnReceiveContentListener;
    private AppCompatEditText$a mSuperCaller;
    private final Bn mTextClassifierHelper;
    private final b mTextHelper;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.editTextStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatEditText(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        super((View)this);
        this.mBackgroundTintHelper = object;
        ((Qm)object).d(attributeSet, n3);
        this.mTextHelper = object = new b((TextView)this);
        ((b)object).f(attributeSet, n3);
        ((b)object).b();
        object = new Object();
        ((Bn)object).a = this;
        this.mTextClassifierHelper = object;
        this.mDefaultOnReceiveContentListener = object = new Object();
        this.mAppCompatEmojiEditTextHelper = object = new rn(this);
        ((rn)object).b(attributeSet, n3);
        this.initEmojiKeyListener((rn)object);
    }

    private AppCompatEditText$a getSuperCaller() {
        AppCompatEditText$a appCompatEditText$a = this.mSuperCaller;
        if (appCompatEditText$a == null) {
            this.mSuperCaller = appCompatEditText$a = new AppCompatEditText$a(this);
        }
        return this.mSuperCaller;
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

    public Editable getText() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        Bn bn2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 < n4 && (bn2 = this.mTextClassifierHelper) != null) {
            TextClassifier textClassifier = bn2.b;
            if (textClassifier == null) {
                bn2 = bn2.a;
                textClassifier = Bn$a.a((TextView)bn2);
            }
            return textClassifier;
        }
        return AppCompatEditText.super.getTextClassifier();
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        void var3_7;
        void var2_4;
        block10: {
            String[] stringArray;
            String[] stringArray2;
            int n3;
            InputConnection inputConnection;
            block12: {
                void var3_9;
                block13: {
                    void var3_13;
                    String string2;
                    CharSequence charSequence;
                    block11: {
                        int n4;
                        block9: {
                            inputConnection = super.onCreateInputConnection(editorInfo);
                            b b2 = this.mTextHelper;
                            b2.getClass();
                            n3 = Build.VERSION.SDK_INT;
                            int n7 = 30;
                            if (n3 < n7 && inputConnection != null) {
                                charSequence = this.getText();
                                ky0_0.a(editorInfo, charSequence);
                            }
                            tn.a(inputConnection, editorInfo, (View)this);
                            if (inputConnection == null) return this.mAppCompatEmojiEditTextHelper.c((InputConnection)var2_4, editorInfo);
                            if (n3 > n7) return this.mAppCompatEmojiEditTextHelper.c((InputConnection)var2_4, editorInfo);
                            stringArray2 = ViewCompat.h((View)this);
                            if (stringArray2 == null) return this.mAppCompatEmojiEditTextHelper.c((InputConnection)var2_4, editorInfo);
                            charSequence = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
                            string2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
                            n4 = 25;
                            if (n3 >= n4) {
                                iy0_0.a(editorInfo, stringArray2);
                            } else {
                                stringArray = editorInfo.extras;
                                if (stringArray == null) {
                                    stringArray = new Bundle();
                                    editorInfo.extras = stringArray;
                                }
                                editorInfo.extras.putStringArray(string2, stringArray2);
                                stringArray = editorInfo.extras;
                                stringArray.putStringArray((String)charSequence, stringArray2);
                            }
                            stringArray2 = new ih1_0(this);
                            if (n3 < n4) break block9;
                            Jh1 jh1 = new Jh1(inputConnection, (ih1_0)stringArray2);
                            break block10;
                        }
                        stringArray = ky0_0.a;
                        if (n3 < n4) break block11;
                        String[] stringArray3 = jy0.a(editorInfo);
                        if (stringArray3 == null) break block12;
                        break block13;
                    }
                    Bundle bundle = editorInfo.extras;
                    if (bundle == null) break block12;
                    String[] stringArray4 = bundle.getStringArray(string2);
                    if (stringArray4 == null) {
                        String[] stringArray5 = editorInfo.extras.getStringArray((String)charSequence);
                    }
                    if (var3_13 == null) break block12;
                }
                stringArray = var3_9;
            }
            if ((n3 = stringArray.length) == 0) {
                return this.mAppCompatEmojiEditTextHelper.c((InputConnection)var2_4, editorInfo);
            }
            Kh1 kh1 = new Kh1(inputConnection, (ih1_0)stringArray2);
        }
        void var2_3 = var3_7;
        return this.mAppCompatEmojiEditTextHelper.c((InputConnection)var2_4, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4 && n3 < (n4 = 33)) {
            Context context = this.getContext();
            String string2 = "input_method";
            context = (InputMethodManager)context.getSystemService(string2);
            context.isActive((View)this);
        }
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Context context;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        int n7 = 1;
        boolean bl2 = false;
        if (n3 < n4 && n3 >= (n4 = 24) && (context = dragEvent.getLocalState()) == null && (context = ViewCompat.h((View)this)) != null) {
            block7: {
                context = this.getContext();
                while ((n4 = context instanceof ContextWrapper) != 0) {
                    n4 = context instanceof Activity;
                    if (n4 != 0) {
                        context = (Activity)context;
                        break block7;
                    }
                    context = ((ContextWrapper)context).getBaseContext();
                }
                n3 = 0;
                context = null;
            }
            if (context == null) {
                this.toString();
            } else {
                int n8;
                n4 = dragEvent.getAction();
                if (n4 != n7 && (n4 = dragEvent.getAction()) == (n8 = 3)) {
                    bl2 = wn.a(dragEvent, (TextView)this, (Activity)context);
                }
            }
        }
        if (bl2) {
            return n7 != 0;
        }
        return super.onDragEvent(dragEvent);
    }

    public M60 onReceiveContent(M60 m60) {
        return this.mDefaultOnReceiveContentListener.a((View)this, m60);
    }

    public boolean onTextContextMenuItem(int n3) {
        int n4;
        int n7;
        String[] stringArray;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 31;
        if (n8 < n10 && (stringArray = ViewCompat.h((View)this)) != null && (n3 == (n7 = 0x1020022) || n3 == (n4 = 16908337))) {
            int n14;
            Context context = this.getContext();
            String string2 = "clipboard";
            if ((context = (ClipboardManager)context.getSystemService(string2)) == null) {
                n4 = 0;
                context = null;
            } else {
                context = context.getPrimaryClip();
            }
            int n15 = 1;
            if (context != null && (n14 = context.getItemCount()) > 0) {
                M60 m60;
                M60$b m60$b;
                if (n8 >= n10) {
                    m60$b = new M60$a((ClipData)context, n15);
                } else {
                    m60$b = new Object();
                    ((M60$c)m60$b).a = context;
                    ((M60$c)m60$b).b = n15;
                }
                if (n3 == n7) {
                    n3 = 0;
                    m60 = null;
                } else {
                    n3 = 1;
                }
                m60$b.setFlags(n3);
                m60 = m60$b.build();
                ViewCompat.o((View)this, m60);
            }
            return n15 != 0;
        }
        return super.onTextContextMenuItem(n3);
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

    public void setTextClassifier(TextClassifier textClassifier) {
        Bn bn2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 < n4 && (bn2 = this.mTextClassifierHelper) != null) {
            bn2.b = textClassifier;
            return;
        }
        AppCompatEditText.super.setTextClassifier(textClassifier);
    }
}

