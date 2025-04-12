/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.util.TypedValue
 */
package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance$1;
import com.google.android.material.resources.TextAppearance$2;
import com.google.android.material.resources.TextAppearanceConfig;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.resources.TypefaceUtils;

public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    public final String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    private ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(Context context, int n3) {
        float f5;
        float f6;
        Object object;
        int n4;
        Object object2 = R$styleable.TextAppearance;
        object2 = context.obtainStyledAttributes(n3, object2);
        int n7 = R$styleable.TextAppearance_android_textSize;
        float f7 = object2.getDimension(n7, 0.0f);
        this.setTextSize(f7);
        n7 = R$styleable.TextAppearance_android_textColor;
        Object object3 = MaterialResources.getColorStateList(context, (TypedArray)object2, n7);
        this.setTextColor((ColorStateList)object3);
        n7 = R$styleable.TextAppearance_android_textColorHint;
        this.textColorHint = object3 = MaterialResources.getColorStateList(context, (TypedArray)object2, n7);
        n7 = R$styleable.TextAppearance_android_textColorLink;
        this.textColorLink = object3 = MaterialResources.getColorStateList(context, (TypedArray)object2, n7);
        n7 = R$styleable.TextAppearance_android_textStyle;
        this.textStyle = n7 = object2.getInt(n7, 0);
        n7 = R$styleable.TextAppearance_android_typeface;
        this.typeface = n7 = object2.getInt(n7, 1);
        n7 = R$styleable.TextAppearance_fontFamily;
        int n8 = R$styleable.TextAppearance_android_fontFamily;
        n7 = MaterialResources.getIndexWithValue((TypedArray)object2, n7, n8);
        this.fontFamilyResourceId = n8 = object2.getResourceId(n7, 0);
        object3 = object2.getString(n7);
        this.fontFamily = object3;
        n7 = R$styleable.TextAppearance_textAllCaps;
        this.textAllCaps = n4 = object2.getBoolean(n7, false);
        n4 = R$styleable.TextAppearance_android_shadowColor;
        this.shadowColor = object = MaterialResources.getColorStateList(context, (TypedArray)object2, n4);
        n4 = R$styleable.TextAppearance_android_shadowDx;
        this.shadowDx = f6 = object2.getFloat(n4, 0.0f);
        n4 = R$styleable.TextAppearance_android_shadowDy;
        this.shadowDy = f6 = object2.getFloat(n4, 0.0f);
        n4 = R$styleable.TextAppearance_android_shadowRadius;
        this.shadowRadius = f6 = object2.getFloat(n4, 0.0f);
        object2.recycle();
        object = R$styleable.MaterialTextAppearance;
        context = context.obtainStyledAttributes(n3, (int[])object);
        n3 = R$styleable.MaterialTextAppearance_android_letterSpacing;
        n3 = (int)(context.hasValue(n3) ? 1 : 0);
        this.hasLetterSpacing = n3;
        n3 = R$styleable.MaterialTextAppearance_android_letterSpacing;
        this.letterSpacing = f5 = context.getFloat(n3, 0.0f);
        context.recycle();
    }

    public static /* synthetic */ Typeface access$000(TextAppearance textAppearance) {
        return textAppearance.font;
    }

    public static /* synthetic */ Typeface access$002(TextAppearance textAppearance, Typeface typeface) {
        textAppearance.font = typeface;
        return typeface;
    }

    public static /* synthetic */ boolean access$102(TextAppearance textAppearance, boolean bl2) {
        textAppearance.fontResolved = bl2;
        return bl2;
    }

    private void createFallbackFont() {
        int n3;
        Object object = this.font;
        if (object == null && (object = this.fontFamily) != null) {
            n3 = this.textStyle;
            this.font = object = Typeface.create((String)object, (int)n3);
        }
        if ((object = this.font) == null) {
            int n4 = this.typeface;
            n3 = 1;
            this.font = n4 != n3 ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (object = Typeface.DEFAULT) : (object = Typeface.MONOSPACE)) : (object = Typeface.SERIF)) : (object = Typeface.SANS_SERIF);
            object = this.font;
            n3 = this.textStyle;
            this.font = object = Typeface.create((Typeface)object, (int)n3);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        boolean bl2 = TextAppearanceConfig.shouldLoadFontSynchronously();
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        int n3 = this.fontFamilyResourceId;
        bl2 = false;
        Typeface typeface = null;
        if (n3 != 0) {
            boolean bl4 = context.isRestricted();
            if (!bl4) {
                TypedValue typedValue = new TypedValue();
                boolean bl5 = true;
                typeface = WK2.d(context, n3, typedValue, 0, null, false, bl5);
            }
        }
        if (typeface == null) {
            bl3 = false;
        }
        return bl3;
    }

    public Typeface getFallbackFont() {
        this.createFallbackFont();
        return this.font;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface getFont(Context context) {
        int n3 = this.fontResolved;
        if (n3 != 0) {
            return this.font;
        }
        n3 = context.isRestricted();
        if (n3 == 0) {
            try {
                n3 = this.fontFamilyResourceId;
                context = WK2.c(n3, context);
                this.font = context;
                if (context != null) {
                    n3 = this.textStyle;
                    context = Typeface.create((Typeface)context, (int)n3);
                    this.font = context;
                }
            }
            catch (Resources.NotFoundException | Exception | UnsupportedOperationException throwable) {}
        }
        this.createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    public void getFontAsync(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        Object object = this.getFallbackFont();
        this.updateTextPaintMeasureState(context, textPaint, (Typeface)object);
        object = new TextAppearance$2(this, context, textPaint, textAppearanceFontCallback);
        this.getFontAsync(context, (TextAppearanceFontCallback)object);
    }

    public void getFontAsync(Context context, TextAppearanceFontCallback textAppearanceFontCallback) {
        int n3;
        TextAppearance$1 textAppearance$1;
        int n4;
        int n7;
        block12: {
            boolean bl2;
            n7 = (int)(this.shouldLoadFontSynchronously(context) ? 1 : 0);
            if (n7 != 0) {
                this.getFont(context);
            } else {
                this.createFallbackFont();
            }
            n4 = this.fontFamilyResourceId;
            n7 = 1;
            if (n4 == 0) {
                this.fontResolved = n7;
            }
            if (bl2 = this.fontResolved) {
                context = this.font;
                textAppearanceFontCallback.onFontRetrieved((Typeface)context, n7 != 0);
                return;
            }
            textAppearance$1 = new TextAppearance$1(this, textAppearanceFontCallback);
            bl2 = context.isRestricted();
            if (!bl2) break block12;
            n3 = -4;
            bl2 = false;
            textAppearance$1.callbackFailAsync(n3, null);
        }
        TypedValue typedValue = new TypedValue();
        try {
            WK2.d(context, n4, typedValue, 0, textAppearance$1, false, false);
        }
        catch (Exception exception) {
            this.fontResolved = n7;
            n3 = -3;
            textAppearanceFontCallback.onFontRetrievalFailed(n3);
        }
        catch (Resources.NotFoundException notFoundException) {
            this.fontResolved = n7;
            textAppearanceFontCallback.onFontRetrievalFailed(n7);
        }
    }

    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f5) {
        this.textSize = f5;
    }

    public void updateDrawState(Context context, TextPaint textPaint, TextAppearanceFontCallback object) {
        int n3;
        float f5;
        int n4;
        this.updateMeasureState(context, textPaint, (TextAppearanceFontCallback)object);
        context = this.textColor;
        if (context != null) {
            object = textPaint.drawableState;
            int n7 = context.getDefaultColor();
            n4 = context.getColorForState((int[])object, n7);
        } else {
            n4 = -16777216;
            f5 = -1.7014118E38f;
        }
        textPaint.setColor(n4);
        f5 = this.shadowRadius;
        float f6 = this.shadowDx;
        float f7 = this.shadowDy;
        ColorStateList colorStateList = this.shadowColor;
        if (colorStateList != null) {
            int[] nArray = textPaint.drawableState;
            int n8 = colorStateList.getDefaultColor();
            n3 = colorStateList.getColorForState(nArray, n8);
        } else {
            n3 = 0;
            colorStateList = null;
        }
        textPaint.setShadowLayer(f5, f6, f7, n3);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        boolean bl2 = this.shouldLoadFontSynchronously(context);
        if (bl2) {
            textAppearanceFontCallback = this.getFont(context);
            this.updateTextPaintMeasureState(context, textPaint, (Typeface)textAppearanceFontCallback);
        } else {
            this.getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) {
        float f5;
        if ((context = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface)) != null) {
            typeface = context;
        }
        textPaint.setTypeface(typeface);
        int n3 = this.textStyle;
        int n4 = ~typeface.getStyle();
        n3 &= n4;
        n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            typeface = null;
        }
        textPaint.setFakeBoldText(n4 != 0);
        if ((n3 &= 2) != 0) {
            n3 = -1098907648;
            f5 = -0.25f;
        } else {
            n3 = 0;
            f5 = 0.0f;
            context = null;
        }
        textPaint.setTextSkewX(f5);
        f5 = this.textSize;
        textPaint.setTextSize(f5);
        n3 = (int)(this.hasLetterSpacing ? 1 : 0);
        if (n3 != 0) {
            f5 = this.letterSpacing;
            textPaint.setLetterSpacing(f5);
        }
    }
}

