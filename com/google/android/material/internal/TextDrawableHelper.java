/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextPaint
 */
package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

public class TextDrawableHelper {
    private WeakReference delegate;
    private final TextAppearanceFontCallback fontCallback;
    private TextAppearance textAppearance;
    private float textHeight;
    private final TextPaint textPaint;
    private boolean textSizeDirty;
    private float textWidth;

    public TextDrawableHelper(TextDrawableHelper$TextDrawableDelegate textDrawableHelper$TextDrawableDelegate) {
        Object object;
        int n3 = 1;
        this.textPaint = object = new TextPaint(n3);
        super(this);
        this.fontCallback = object;
        this.textSizeDirty = n3;
        super(null);
        this.delegate = object;
        this.setDelegate(textDrawableHelper$TextDrawableDelegate);
    }

    public static /* synthetic */ boolean access$002(TextDrawableHelper textDrawableHelper, boolean bl2) {
        textDrawableHelper.textSizeDirty = bl2;
        return bl2;
    }

    public static /* synthetic */ WeakReference access$100(TextDrawableHelper textDrawableHelper) {
        return textDrawableHelper.delegate;
    }

    private float calculateTextHeight(String string2) {
        if (string2 == null) {
            return 0.0f;
        }
        return Math.abs(this.textPaint.getFontMetrics().ascent);
    }

    private float calculateTextWidth(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.textPaint;
        int n3 = charSequence.length();
        return textPaint.measureText(charSequence, 0, n3);
    }

    private void refreshTextDimens(String string2) {
        float f5;
        float f6;
        this.textWidth = f6 = this.calculateTextWidth(string2);
        this.textHeight = f5 = this.calculateTextHeight(string2);
        this.textSizeDirty = false;
    }

    public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public float getTextHeight(String string2) {
        boolean bl2 = this.textSizeDirty;
        if (!bl2) {
            return this.textHeight;
        }
        this.refreshTextDimens(string2);
        return this.textHeight;
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public float getTextWidth(String string2) {
        boolean bl2 = this.textSizeDirty;
        if (!bl2) {
            return this.textWidth;
        }
        this.refreshTextDimens(string2);
        return this.textWidth;
    }

    public boolean isTextWidthDirty() {
        return this.textSizeDirty;
    }

    public void setDelegate(TextDrawableHelper$TextDrawableDelegate textDrawableHelper$TextDrawableDelegate) {
        WeakReference<TextDrawableHelper$TextDrawableDelegate> weakReference;
        this.delegate = weakReference = new WeakReference<TextDrawableHelper$TextDrawableDelegate>(textDrawableHelper$TextDrawableDelegate);
    }

    public void setTextAppearance(TextAppearance object, Context object2) {
        Object object3 = this.textAppearance;
        if (object3 != object) {
            this.textAppearance = object;
            if (object != null) {
                boolean bl2;
                object3 = this.textPaint;
                TextAppearanceFontCallback textAppearanceFontCallback = this.fontCallback;
                ((TextAppearance)object).updateMeasureState((Context)object2, (TextPaint)object3, textAppearanceFontCallback);
                object3 = (TextDrawableHelper$TextDrawableDelegate)this.delegate.get();
                if (object3 != null) {
                    textAppearanceFontCallback = this.textPaint;
                    object3 = object3.getState();
                    ((TextPaint)textAppearanceFontCallback).drawableState = (int[])object3;
                }
                object3 = this.textPaint;
                textAppearanceFontCallback = this.fontCallback;
                ((TextAppearance)object).updateDrawState((Context)object2, (TextPaint)object3, textAppearanceFontCallback);
                this.textSizeDirty = bl2 = true;
            }
            if ((object = (TextDrawableHelper$TextDrawableDelegate)this.delegate.get()) != null) {
                object.onTextSizeChange();
                object2 = object.getState();
                object.onStateChange((int[])object2);
            }
        }
    }

    public void setTextSizeDirty(boolean bl2) {
        this.textSizeDirty = bl2;
    }

    public void setTextWidthDirty(boolean bl2) {
        this.textSizeDirty = bl2;
    }

    public void updateTextPaintDrawState(Context context) {
        TextAppearance textAppearance = this.textAppearance;
        TextPaint textPaint = this.textPaint;
        TextAppearanceFontCallback textAppearanceFontCallback = this.fontCallback;
        textAppearance.updateDrawState(context, textPaint, textAppearanceFontCallback);
    }
}

