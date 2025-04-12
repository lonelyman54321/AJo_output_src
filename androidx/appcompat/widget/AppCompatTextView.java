/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.InputFilter
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView$a;
import androidx.appcompat.widget.AppCompatTextView$b;
import androidx.appcompat.widget.AppCompatTextView$c;
import androidx.appcompat.widget.AppCompatTextView$d;
import androidx.appcompat.widget.b;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat$a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView
extends TextView
implements Vn3 {
    private final Qm mBackgroundTintHelper;
    private sn mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future mPrecomputedTextFuture;
    private AppCompatTextView$a mSuperCaller;
    private final Bn mTextClassifierHelper;
    private final b mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context object, AttributeSet attributeSet, int n3) {
        Qn3.a((Context)object);
        super((Context)object, attributeSet, n3);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        Um3.a(this.getContext(), (View)this);
        super((View)this);
        this.mBackgroundTintHelper = object;
        ((Qm)object).d(attributeSet, n3);
        this.mTextHelper = object = new b(this);
        ((b)object).f(attributeSet, n3);
        ((b)object).b();
        object = new Object();
        ((Bn)object).a = this;
        this.mTextClassifierHelper = object;
        this.getEmojiTextViewHelper().c(attributeSet, n3);
    }

    public static /* synthetic */ void access$1001(AppCompatTextView appCompatTextView, int n3) {
        super.setFirstBaselineToTopHeight(n3);
    }

    public static /* synthetic */ void access$1101(AppCompatTextView appCompatTextView, int n3) {
        super.setLastBaselineToBottomHeight(n3);
    }

    public static /* synthetic */ void access$1201(AppCompatTextView appCompatTextView, int n3, float f5) {
        super.setLineHeight(n3, f5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void consumeTextFutureAndSetBlocking() {
        Object object = this.mPrecomputedTextFuture;
        if (object == null) return;
        try {
            this.mPrecomputedTextFuture = null;
            object = object.get();
            object = (PrecomputedTextCompat)object;
            Hm3.e(this, (PrecomputedTextCompat)object);
            return;
        }
        catch (InterruptedException | ExecutionException exception) {
            return;
        }
    }

    private sn getEmojiTextViewHelper() {
        sn sn4 = this.mEmojiTextViewHelper;
        if (sn4 == null) {
            this.mEmojiTextViewHelper = sn4 = new sn(this);
        }
        return this.mEmojiTextViewHelper;
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
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
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
            return AppCompatTextView.super.getAutoSizeMinTextSize();
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
            return AppCompatTextView.super.getAutoSizeStepGranularity();
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
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
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
            AppCompatTextView appCompatTextView = ((AppCompatTextView$b)this.getSuperCaller()).a;
            n3 = AppCompatTextView.super.getAutoSizeTextType();
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

    public int getFirstBaselineToTopHeight() {
        int n3 = this.getPaddingTop();
        int n4 = this.getPaint().getFontMetricsInt().top;
        return n3 - n4;
    }

    public int getLastBaselineToBottomHeight() {
        int n3 = this.getPaddingBottom();
        int n4 = this.getPaint().getFontMetricsInt().bottom;
        return n3 + n4;
    }

    public AppCompatTextView$a getSuperCaller() {
        AppCompatTextView$a appCompatTextView$a = this.mSuperCaller;
        if (appCompatTextView$a == null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 34;
            if (n3 >= n4) {
                this.mSuperCaller = appCompatTextView$a = new AppCompatTextView$d(this);
            } else {
                n4 = 28;
                if (n3 >= n4) {
                    this.mSuperCaller = appCompatTextView$a = new AppCompatTextView$c(this);
                } else {
                    n4 = 26;
                    if (n3 >= n4) {
                        this.mSuperCaller = appCompatTextView$a = new AppCompatTextView$b(this);
                    }
                }
            }
        }
        return this.mSuperCaller;
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

    public CharSequence getText() {
        this.consumeTextFutureAndSetBlocking();
        return super.getText();
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
        return AppCompatTextView.super.getTextClassifier();
    }

    public PrecomputedTextCompat$a getTextMetricsParamsCompat() {
        return Hm3.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        Object object = this.mTextHelper;
        object.getClass();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 < n4 && inputConnection != null) {
            object = this.getText();
            ky0_0.a(editorInfo, (CharSequence)object);
        }
        tn.a(inputConnection, editorInfo, (View)this);
        return inputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4 && n3 < (n4 = 33) && (n3 = (int)(this.onCheckIsTextEditor() ? 1 : 0)) != 0) {
            Context context = this.getContext();
            String string2 = "input_method";
            context = (InputMethodManager)context.getSystemService(string2);
            context.isActive((View)this);
        }
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        Object object = this.mTextHelper;
        if (object != null && (n3 = (int)(dE3.c ? 1 : 0)) == 0) {
            object = ((b)object).i;
            ((Cn)object).a();
        }
    }

    public void onMeasure(int n3, int n4) {
        this.consumeTextFutureAndSetBlocking();
        super.onMeasure(n3, n4);
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
            AppCompatTextView appCompatTextView = ((AppCompatTextView$b)this.getSuperCaller()).a;
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(n3, n4, n7, n8);
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
            AppCompatTextView appCompatTextView = ((AppCompatTextView$b)this.getSuperCaller()).a;
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n3);
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
            AppCompatTextView appCompatTextView = ((AppCompatTextView$b)this.getSuperCaller()).a;
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(n3);
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

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n3, int n4, int n7, int n8) {
        Drawable drawable2;
        Drawable drawable3;
        Object object;
        Context context = this.getContext();
        Drawable drawable4 = null;
        if (n3 != 0) {
            object = xn.a(context, n3);
        } else {
            n3 = 0;
            object = null;
        }
        if (n4 != 0) {
            drawable3 = xn.a(context, n4);
        } else {
            n4 = 0;
            drawable3 = null;
        }
        if (n7 != 0) {
            drawable2 = xn.a(context, n7);
        } else {
            n7 = 0;
            drawable2 = null;
        }
        if (n8 != 0) {
            drawable4 = xn.a(context, n8);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable3, drawable2, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n3, int n4, int n7, int n8) {
        Drawable drawable2;
        Drawable drawable3;
        Object object;
        Context context = this.getContext();
        Drawable drawable4 = null;
        if (n3 != 0) {
            object = xn.a(context, n3);
        } else {
            n3 = 0;
            object = null;
        }
        if (n4 != 0) {
            drawable3 = xn.a(context, n4);
        } else {
            n4 = 0;
            drawable3 = null;
        }
        if (n7 != 0) {
            drawable2 = xn.a(context, n7);
        } else {
            n7 = 0;
            drawable2 = null;
        }
        if (n8 != 0) {
            drawable4 = xn.a(context, n8);
        }
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable3, drawable2, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable4);
        object = this.mTextHelper;
        if (object != null) {
            ((b)object).b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback2) {
        callback2 = Hm3.h(callback2, this);
        super.setCustomSelectionActionModeCallback(callback2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.getEmojiTextViewHelper().e(bl2);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        inputFilterArray = this.getEmojiTextViewHelper().a(inputFilterArray);
        super.setFilters(inputFilterArray);
    }

    public void setFirstBaselineToTopHeight(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            AppCompatTextView$a appCompatTextView$a = this.getSuperCaller();
            appCompatTextView$a.c(n3);
        } else {
            Hm3.b(this, n3);
        }
    }

    public void setLastBaselineToBottomHeight(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            AppCompatTextView$a appCompatTextView$a = this.getSuperCaller();
            appCompatTextView$a.a(n3);
        } else {
            Hm3.c(this, n3);
        }
    }

    public void setLineHeight(int n3) {
        Hm3.d(this, n3);
    }

    public void setLineHeight(int n3, float f5) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 34;
        if (n4 >= n7) {
            AppCompatTextView$a appCompatTextView$a = this.getSuperCaller();
            appCompatTextView$a.b(n3, f5);
        } else if (n4 >= n7) {
            Hm3$d.a(this, n3, f5);
        } else {
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            float f6 = TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)displayMetrics);
            n3 = Math.round(f6);
            Hm3.d(this, n3);
        }
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        Hm3.e(this, precomputedTextCompat);
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
        AppCompatTextView.super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat$a precomputedTextCompat$a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = precomputedTextCompat$a.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int n3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.ANYRTL_LTR;
            if (textDirectionHeuristic2 == textDirectionHeuristic4) {
                n3 = 2;
            } else {
                textDirectionHeuristic4 = TextDirectionHeuristics.LTR;
                if (textDirectionHeuristic2 == textDirectionHeuristic4) {
                    n3 = 3;
                } else {
                    textDirectionHeuristic4 = TextDirectionHeuristics.RTL;
                    if (textDirectionHeuristic2 == textDirectionHeuristic4) {
                        n3 = 4;
                    } else {
                        textDirectionHeuristic4 = TextDirectionHeuristics.LOCALE;
                        if (textDirectionHeuristic2 == textDirectionHeuristic4) {
                            n3 = 5;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                            n3 = 6;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                            n3 = 7;
                        }
                    }
                }
            }
        }
        this.setTextDirection(n3);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        float f5 = 3.2E-44f;
        TextPaint textPaint = precomputedTextCompat$a.a;
        if (n4 < n7) {
            float f6 = textPaint.getTextScaleX();
            textDirectionHeuristic2 = this.getPaint();
            textDirectionHeuristic2.set(textPaint);
            float f7 = this.getTextScaleX();
            n4 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
            if (n4 == 0) {
                n4 = 0x40000000;
                f7 = f6 / 2.0f;
                n7 = 1065353216;
                f5 = 1.0f;
                this.setTextScaleX(f7 += f5);
            }
            this.setTextScaleX(f6);
        } else {
            textDirectionHeuristic2 = this.getPaint();
            textDirectionHeuristic2.set(textPaint);
            n4 = precomputedTextCompat$a.c;
            Hm3$a.c(this, n4);
            int n8 = precomputedTextCompat$a.d;
            Hm3$a.f(this, n8);
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setTypeface(Typeface object, int n3) {
        boolean bl2;
        Context context;
        void var2_6;
        boolean bl3 = this.mIsSetTypefaceProcessing;
        if (bl3) {
            return;
        }
        if (object != null && var2_6 > 0) {
            context = this.getContext();
            if (context == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Context cannot be null");
                throw illegalArgumentException;
            }
            context = Typeface.create((Typeface)object, (int)var2_6);
        } else {
            bl3 = false;
            context = null;
        }
        this.mIsSetTypefaceProcessing = bl2 = true;
        if (context != null) {
            Context context2 = context;
        }
        bl3 = false;
        context = null;
        try {
            void var1_4;
            super.setTypeface((Typeface)var1_4, (int)var2_6);
            return;
        }
        finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }
}

