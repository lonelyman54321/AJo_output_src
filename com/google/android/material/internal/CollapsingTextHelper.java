/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.view.Gravity
 *  android.view.View
 */
package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CollapsingTextHelper$1;
import com.google.android.material.internal.CollapsingTextHelper$2;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.CancelableFontCallback$ApplyFont;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.resources.TypefaceUtils;

public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT;
    private static final String ELLIPSIS_NORMAL = "\u2026";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private int hyphenationFrequency;
    private boolean isRtl;
    private boolean isRtlTextDirectionHeuristicsEnabled;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private CharSequence text;
    private StaticLayout textLayout;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;
    private TextUtils.TruncateAt titleTextEllipsize;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    static {
        USE_SCALING_TEXTURE = false;
        DEBUG_DRAW_PAINT = null;
    }

    public CollapsingTextHelper(View view) {
        TextPaint textPaint;
        TextUtils.TruncateAt truncateAt;
        float f5;
        int n3;
        this.expandedTextGravity = n3 = 16;
        this.collapsedTextGravity = n3;
        this.expandedTextSize = f5 = 15.0f;
        this.collapsedTextSize = f5;
        this.titleTextEllipsize = truncateAt = TextUtils.TruncateAt.END;
        n3 = 1;
        this.isRtlTextDirectionHeuristicsEnabled = n3;
        this.maxLines = n3;
        this.lineSpacingAdd = 0.0f;
        this.lineSpacingMultiplier = 1.0f;
        this.hyphenationFrequency = n3 = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;
        this.view = view;
        super(129);
        this.textPaint = truncateAt;
        this.tmpPaint = textPaint = new TextPaint((Paint)truncateAt);
        super();
        this.collapsedBounds = truncateAt;
        super();
        this.expandedBounds = truncateAt;
        super();
        this.currentBounds = truncateAt;
        this.fadeModeThresholdFraction = f5 = this.calculateFadeModeThresholdFraction();
        view = view.getContext().getResources().getConfiguration();
        this.maybeUpdateFontWeightAdjustment((Configuration)view);
    }

    private static int blendARGB(int n3, int n4, float f5) {
        float f6 = 1.0f - f5;
        float f7 = (float)Color.alpha((int)n3) * f6;
        float f8 = (float)Color.alpha((int)n4) * f5 + f7;
        f7 = (float)Color.red((int)n3) * f6;
        float f11 = (float)Color.red((int)n4) * f5 + f7;
        f7 = (float)Color.green((int)n3) * f6;
        float f12 = (float)Color.green((int)n4) * f5 + f7;
        float f14 = (float)Color.blue((int)n3) * f6;
        float f15 = (float)Color.blue((int)n4) * f5 + f14;
        n3 = Math.round(f8);
        int n7 = Math.round(f11);
        int n8 = Math.round(f12);
        n4 = Math.round(f15);
        return Color.argb((int)n3, (int)n7, (int)n8, (int)n4);
    }

    private void calculateBaseOffsets(boolean n3) {
        int n4;
        float f5;
        int n7;
        float f6;
        float f7;
        TextUtils.TruncateAt truncateAt;
        float f8;
        int n8;
        TextPaint textPaint;
        StaticLayout staticLayout;
        int n10 = 1065353216;
        float f11 = 1.0f;
        this.calculateUsingTextSize(f11, n3 != 0);
        CharSequence charSequence = this.textToDraw;
        if (charSequence != null && (staticLayout = this.textLayout) != null) {
            textPaint = this.textPaint;
            n8 = staticLayout.getWidth();
            f8 = n8;
            truncateAt = this.titleTextEllipsize;
            this.textToDrawCollapsed = charSequence = TextUtils.ellipsize((CharSequence)charSequence, (TextPaint)textPaint, (float)f8, (TextUtils.TruncateAt)truncateAt);
        }
        charSequence = this.textToDrawCollapsed;
        n8 = 0;
        f8 = 0.0f;
        staticLayout = null;
        if (charSequence != null) {
            textPaint = this.textPaint;
            this.collapsedTextWidth = f11 = this.measureTextWidth(textPaint, charSequence);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        n10 = this.collapsedTextGravity;
        int n14 = this.isRtl;
        n10 = Gravity.getAbsoluteGravity((int)n10, (int)n14);
        int n15 = n10 & 0x70;
        int n16 = 80;
        float f12 = 1.12E-43f;
        int n17 = 48;
        float f14 = 2.0f;
        if (n15 != n17) {
            if (n15 != n16) {
                textPaint = this.textPaint;
                f7 = textPaint.descent();
                f6 = this.textPaint.ascent();
                f7 = (f7 - f6) / f14;
                Rect rect = this.collapsedBounds;
                n7 = rect.centerY();
                this.collapsedDrawY = f6 = (float)n7 - f7;
            } else {
                textPaint = this.collapsedBounds;
                int n18 = textPaint.bottom;
                f7 = n18;
                TextPaint textPaint2 = this.textPaint;
                this.collapsedDrawY = f6 = textPaint2.ascent() + f7;
            }
        } else {
            textPaint = this.collapsedBounds;
            int n19 = textPaint.top;
            this.collapsedDrawY = f7 = (float)n19;
        }
        int n20 = 0x800007;
        f7 = 1.1754953E-38f;
        n7 = 5;
        f6 = 7.0E-45f;
        int n21 = 1;
        if ((n10 &= n20) != n21) {
            if (n10 != n7) {
                charSequence = this.collapsedBounds;
                n10 = ((Rect)charSequence).left;
                this.collapsedDrawX = f11 = (float)n10;
            } else {
                charSequence = this.collapsedBounds;
                n10 = ((Rect)charSequence).right;
                f11 = n10;
                float f15 = this.collapsedTextWidth;
                this.collapsedDrawX = f11 -= f15;
            }
        } else {
            charSequence = this.collapsedBounds;
            n10 = charSequence.centerX();
            f11 = n10;
            float f16 = this.collapsedTextWidth / f14;
            this.collapsedDrawX = f11 -= f16;
        }
        this.calculateUsingTextSize(0.0f, n3 != 0);
        StaticLayout staticLayout2 = this.textLayout;
        if (staticLayout2 != null) {
            n3 = staticLayout2.getHeight();
            f5 = n3;
        } else {
            n3 = 0;
            f5 = 0.0f;
            staticLayout2 = null;
        }
        charSequence = this.textLayout;
        if (charSequence != null && (n4 = this.maxLines) > n21) {
            n10 = charSequence.getWidth();
            f8 = n10;
        } else {
            charSequence = this.textToDraw;
            if (charSequence != null) {
                staticLayout = this.textPaint;
                f8 = this.measureTextWidth((TextPaint)staticLayout, charSequence);
            }
        }
        charSequence = this.textLayout;
        if (charSequence != null) {
            n10 = charSequence.getLineCount();
        } else {
            n10 = 0;
            f11 = 0.0f;
            charSequence = null;
        }
        this.expandedLineCount = n10;
        n10 = this.expandedTextGravity;
        n4 = (int)(this.isRtl ? 1 : 0);
        n10 = Gravity.getAbsoluteGravity((int)n10, (int)n4);
        n4 = n10 & 0x70;
        if (n4 != n17) {
            if (n4 != n16) {
                truncateAt = this.expandedBounds;
                n16 = truncateAt.centerY();
                this.expandedDrawY = f12 = (float)n16 - (f5 /= f14);
            } else {
                truncateAt = this.expandedBounds;
                n16 = truncateAt.bottom;
                f12 = (float)n16 - f5;
                staticLayout2 = this.textPaint;
                this.expandedDrawY = f5 = staticLayout2.descent() + f12;
            }
        } else {
            staticLayout2 = this.expandedBounds;
            n3 = staticLayout2.top;
            this.expandedDrawY = f5 = (float)n3;
        }
        n3 = n10 & n20;
        if (n3 != n21) {
            if (n3 != n7) {
                staticLayout2 = this.expandedBounds;
                n3 = staticLayout2.left;
                this.expandedDrawX = f5 = (float)n3;
            } else {
                staticLayout2 = this.expandedBounds;
                n3 = staticLayout2.right;
                this.expandedDrawX = f5 = (float)n3 - f8;
            }
        } else {
            staticLayout2 = this.expandedBounds;
            n3 = staticLayout2.centerX();
            f5 = n3;
            this.expandedDrawX = f5 -= (f8 /= f14);
        }
        this.clearTexture();
        f5 = this.expandedFraction;
        this.setInterpolatedTextSize(f5);
    }

    private void calculateCurrentOffsets() {
        float f5 = this.expandedFraction;
        this.calculateOffsets(f5);
    }

    private float calculateFadeModeTextAlpha(float f5) {
        float f6 = this.fadeModeThresholdFraction;
        float f7 = 1.0f;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object <= 0) {
            float f8 = this.fadeModeStartFraction;
            return AnimationUtils.lerp(f7, 0.0f, f8, f6, f5);
        }
        return AnimationUtils.lerp(0.0f, f7, f6, f7, f5);
    }

    private float calculateFadeModeThresholdFraction() {
        float f5 = this.fadeModeStartFraction;
        return xu0_1.a(1.0f, f5, 0.5f, f5);
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        boolean bl2 = this.isDefaultIsRtl();
        boolean bl3 = this.isRtlTextDirectionHeuristicsEnabled;
        if (bl3) {
            bl2 = this.isTextDirectionHeuristicsIsRtl(charSequence, bl2);
        }
        return bl2;
    }

    private void calculateOffsets(float f5) {
        View view;
        TimeInterpolator timeInterpolator;
        float f6;
        int n3;
        int n4;
        TextPaint textPaint;
        Object object;
        float f7;
        this.interpolateBounds(f5);
        Object object2 = this.fadeModeEnabled;
        int n7 = 0;
        float f8 = 0.0f;
        ColorStateList colorStateList = null;
        int n8 = 1065353216;
        float f11 = 1.0f;
        if (object2 != 0) {
            f7 = this.fadeModeThresholdFraction;
            float f12 = f5 - f7;
            object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                this.currentDrawX = f7 = this.expandedDrawX;
                this.currentDrawY = f7 = this.expandedDrawY;
                this.setInterpolatedTextSize(0.0f);
                object2 = 0;
                f7 = 0.0f;
                object = null;
            } else {
                this.currentDrawX = f7 = this.collapsedDrawX;
                f7 = this.collapsedDrawY;
                textPaint = null;
                n4 = this.currentOffsetY;
                n3 = Math.max(0, n4);
                f6 = n3;
                this.currentDrawY = f7 -= f6;
                this.setInterpolatedTextSize(f11);
                object2 = 1065353216;
                f7 = 1.0f;
            }
        } else {
            f7 = this.expandedDrawX;
            f6 = this.collapsedDrawX;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawX = f7 = CollapsingTextHelper.lerp(f7, f6, f5, timeInterpolator);
            f7 = this.expandedDrawY;
            f6 = this.collapsedDrawY;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawY = f7 = CollapsingTextHelper.lerp(f7, f6, f5, timeInterpolator);
            this.setInterpolatedTextSize(f5);
            f7 = f5;
        }
        f6 = f11 - f5;
        timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        f6 = CollapsingTextHelper.lerp(0.0f, f11, f6, timeInterpolator);
        f6 = f11 - f6;
        this.setCollapsedTextBlend(f6);
        f8 = CollapsingTextHelper.lerp(f11, 0.0f, f5, timeInterpolator);
        this.setExpandedTextBlend(f8);
        colorStateList = this.collapsedTextColor;
        ColorStateList colorStateList2 = this.expandedTextColor;
        if (colorStateList != colorStateList2) {
            colorStateList = this.textPaint;
            n8 = this.getCurrentExpandedTextColor();
            n3 = this.getCurrentCollapsedTextColor();
            object2 = CollapsingTextHelper.blendARGB(n8, n3, f7);
            colorStateList.setColor(object2);
        } else {
            object = this.textPaint;
            n7 = this.getCurrentCollapsedTextColor();
            object.setColor(n7);
        }
        object2 = Build.VERSION.SDK_INT;
        f8 = this.collapsedLetterSpacing;
        f11 = this.expandedLetterSpacing;
        n3 = (int)(f8 == f11 ? 0 : (f8 > f11 ? 1 : -1));
        if (n3 != 0) {
            textPaint = this.textPaint;
            f8 = CollapsingTextHelper.lerp(f11, f8, f5, timeInterpolator);
            textPaint.setLetterSpacing(f8);
        } else {
            colorStateList2 = this.textPaint;
            colorStateList2.setLetterSpacing(f8);
        }
        f8 = this.expandedShadowRadius;
        f11 = this.collapsedShadowRadius;
        n3 = 0;
        textPaint = null;
        this.currentShadowRadius = f8 = CollapsingTextHelper.lerp(f8, f11, f5, null);
        f8 = this.expandedShadowDx;
        f11 = this.collapsedShadowDx;
        this.currentShadowDx = f8 = CollapsingTextHelper.lerp(f8, f11, f5, null);
        f8 = this.expandedShadowDy;
        f11 = this.collapsedShadowDy;
        this.currentShadowDy = f8 = CollapsingTextHelper.lerp(f8, f11, f5, null);
        colorStateList = this.expandedShadowColor;
        n7 = this.getCurrentColor(colorStateList);
        colorStateList2 = this.collapsedShadowColor;
        n8 = this.getCurrentColor(colorStateList2);
        this.currentShadowColor = n7 = CollapsingTextHelper.blendARGB(n7, n8, f5);
        colorStateList2 = this.textPaint;
        f6 = this.currentShadowRadius;
        float f14 = this.currentShadowDx;
        float f15 = this.currentShadowDy;
        colorStateList2.setShadowLayer(f6, f14, f15, n7);
        n7 = (int)(this.fadeModeEnabled ? 1 : 0);
        if (n7 != 0) {
            n7 = this.textPaint.getAlpha();
            f5 = this.calculateFadeModeTextAlpha(f5);
            f8 = n7;
            int n10 = (int)(f5 * f8);
            colorStateList = this.textPaint;
            colorStateList.setAlpha(n10);
            n10 = 31;
            f5 = 4.3E-44f;
            if (object2 >= n10) {
                view = this.textPaint;
                f7 = this.currentShadowRadius;
                f8 = this.currentShadowDx;
                f11 = this.currentShadowDy;
                n3 = this.currentShadowColor;
                n4 = view.getAlpha();
                n3 = MaterialColors.compositeARGBWithAlpha(n3, n4);
                view.setShadowLayer(f7, f8, f11, n3);
            }
        }
        view = this.view;
        object = ViewCompat.a;
        view.postInvalidateOnAnimation();
    }

    private void calculateUsingTextSize(float f5) {
        this.calculateUsingTextSize(f5, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void calculateUsingTextSize(float f5, boolean n3) {
        CharSequence charSequence;
        float f6;
        float f7;
        boolean bl2;
        Typeface typeface;
        float f8;
        float f11;
        float f12;
        CharSequence charSequence2 = this.text;
        if (charSequence2 == null) {
            return;
        }
        charSequence2 = this.collapsedBounds;
        int n4 = charSequence2.width();
        float f14 = n4;
        Rect rect = this.expandedBounds;
        int n7 = rect.width();
        float f15 = n7;
        float f16 = 1.0f;
        int n8 = CollapsingTextHelper.isClose(f5, f16);
        int n10 = 0;
        float f17 = 0.0f;
        if (n8 != 0) {
            f5 = this.collapsedTextSize;
            f12 = this.collapsedLetterSpacing;
            this.scale = f16;
            rect = this.collapsedTypeface;
        } else {
            f11 = this.expandedTextSize;
            f8 = this.expandedLetterSpacing;
            typeface = this.expandedTypeface;
            bl2 = CollapsingTextHelper.isClose(f5, 0.0f);
            if (bl2) {
                this.scale = f16;
            } else {
                f7 = this.expandedTextSize;
                f6 = this.collapsedTextSize;
                TimeInterpolator timeInterpolator = this.textSizeInterpolator;
                f5 = CollapsingTextHelper.lerp(f7, f6, f5, timeInterpolator);
                f7 = this.expandedTextSize;
                this.scale = f5 /= f7;
            }
            f5 = this.collapsedTextSize;
            f7 = this.expandedTextSize;
            f5 /= f7;
            f7 = f15 * f5;
            f14 = n3 == 0 && (n3 = (int)(this.fadeModeEnabled ? 1 : 0)) == 0 && (n3 = (int)(f7 == f14 ? 0 : (f7 > f14 ? 1 : -1))) > 0 ? (f5 = Math.min(f14 / f5, f15)) : f15;
            f5 = f11;
            f12 = f8;
            rect = typeface;
        }
        n8 = 1;
        f11 = Float.MIN_VALUE;
        int n14 = 0;
        f8 = 0.0f;
        float f18 = f14 - 0.0f;
        n10 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (n10 > 0) {
            float f19;
            boolean bl3;
            f17 = this.currentTextSize;
            float f20 = f17 - f5;
            n10 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
            if (n10 != 0) {
                n10 = 1;
                f17 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f17 = 0.0f;
            }
            float f22 = this.currentLetterSpacing;
            float f23 = f22 == f12 ? 0 : (f22 > f12 ? 1 : -1);
            if (f23 != false) {
                f23 = 1.0f;
                f22 = Float.MIN_VALUE;
            } else {
                f23 = 0.0f;
                f22 = 0.0f;
                typeface = null;
            }
            Typeface typeface2 = this.currentTypeface;
            if (typeface2 != rect) {
                bl2 = true;
                f7 = Float.MIN_VALUE;
            } else {
                bl2 = false;
                f7 = 0.0f;
                typeface2 = null;
            }
            StaticLayout staticLayout = this.textLayout;
            if (staticLayout != null && (bl3 = (f19 = f14 - (f6 = (float)staticLayout.getWidth())) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1))) {
                bl3 = true;
                f6 = Float.MIN_VALUE;
            } else {
                bl3 = false;
                f6 = 0.0f;
                staticLayout = null;
            }
            if (n10 == 0 && f23 == false && !bl3 && !bl2 && (n10 = (int)(this.boundsChanged ? 1 : 0)) == 0) {
                n10 = 0;
                f17 = 0.0f;
            } else {
                n10 = 1;
                f17 = Float.MIN_VALUE;
            }
            this.currentTextSize = f5;
            this.currentLetterSpacing = f12;
            this.currentTypeface = rect;
            this.boundsChanged = false;
            charSequence = this.textPaint;
            f12 = this.scale;
            n3 = (int)(f12 == f16 ? 0 : (f12 > f16 ? 1 : -1));
            if (n3 != 0) {
                n14 = 1;
                f8 = Float.MIN_VALUE;
            }
            charSequence.setLinearText(n14 != 0);
            n14 = n10;
            f8 = f17;
        }
        if ((charSequence = this.textToDraw) == null || n14 != 0) {
            boolean bl4;
            charSequence = this.textPaint;
            f12 = this.currentTextSize;
            charSequence.setTextSize(f12);
            charSequence = this.textPaint;
            Typeface typeface3 = this.currentTypeface;
            charSequence.setTypeface(typeface3);
            charSequence = this.textPaint;
            f12 = this.currentLetterSpacing;
            charSequence.setLetterSpacing(f12);
            charSequence = this.text;
            this.isRtl = bl4 = this.calculateIsRtl(charSequence);
            bl4 = this.shouldDrawMultiline();
            if (bl4) {
                n8 = this.maxLines;
            }
            bl4 = this.isRtl;
            charSequence = this.createStaticLayout(n8, f14, bl4);
            this.textLayout = charSequence;
            this.textToDraw = charSequence = charSequence.getText();
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            bitmap = null;
            this.expandedTitleTexture = null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private StaticLayout createStaticLayout(int n3, float f5, boolean bl2) {
        Object object;
        block6: {
            StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException2;
            block5: {
                Layout.Alignment alignment;
                block4: {
                    int n4 = 1;
                    if (n3 == n4) {
                        try {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break block4;
                        }
                        catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException2) {
                            break block5;
                        }
                    }
                    alignment = this.getMultilineTextLayoutAlignment();
                }
                CharSequence charSequence = this.text;
                TextPaint textPaint = this.textPaint;
                int n7 = (int)f5;
                {
                    Object object2 = StaticLayoutBuilderCompat.obtain(charSequence, textPaint, n7);
                    charSequence = this.titleTextEllipsize;
                    object2 = ((StaticLayoutBuilderCompat)object2).setEllipsize((TextUtils.TruncateAt)charSequence);
                    object2 = ((StaticLayoutBuilderCompat)object2).setIsRtl(bl2);
                    object2 = ((StaticLayoutBuilderCompat)object2).setAlignment(alignment);
                    bl2 = false;
                    float f6 = 0.0f;
                    object2 = ((StaticLayoutBuilderCompat)object2).setIncludePad(false);
                    object = ((StaticLayoutBuilderCompat)object2).setMaxLines(n3);
                    f5 = this.lineSpacingAdd;
                    f6 = this.lineSpacingMultiplier;
                    object = ((StaticLayoutBuilderCompat)object).setLineSpacing(f5, f6);
                    n7 = this.hyphenationFrequency;
                    object = ((StaticLayoutBuilderCompat)object).setHyphenationFrequency(n7);
                    object2 = this.staticLayoutBuilderConfigurer;
                    object = ((StaticLayoutBuilderCompat)object).setStaticLayoutBuilderConfigurer((StaticLayoutBuilderConfigurer)object2);
                    object = ((StaticLayoutBuilderCompat)object).build();
                    break block6;
                }
            }
            staticLayoutBuilderCompat$StaticLayoutBuilderCompatException2.getCause().getMessage();
            n3 = 0;
            object = null;
        }
        object.getClass();
        return object;
    }

    private void drawMultilineTransition(Canvas canvas, float f5, float f6) {
        TextPaint textPaint;
        int n3;
        int n4;
        float f7;
        int n7;
        float f8;
        float f11;
        Object object;
        CollapsingTextHelper collapsingTextHelper = this;
        TextPaint textPaint2 = this.textPaint;
        int n8 = textPaint2.getAlpha();
        canvas.translate(f5, f6);
        int n10 = this.fadeModeEnabled;
        int n14 = 31;
        float f12 = 4.3E-44f;
        if (n10 == 0) {
            object = this.textPaint;
            f11 = this.expandedTextBlend;
            f8 = n8;
            n7 = (int)(f11 *= f8);
            object.setAlpha(n7);
            n10 = Build.VERSION.SDK_INT;
            if (n10 >= n14) {
                object = this.textPaint;
                f11 = this.currentShadowRadius;
                f8 = this.currentShadowDx;
                f7 = this.currentShadowDy;
                n4 = this.currentShadowColor;
                n3 = object.getAlpha();
                n4 = MaterialColors.compositeARGBWithAlpha(n4, n3);
                object.setShadowLayer(f11, f8, f7, n4);
            }
            object = collapsingTextHelper.textLayout;
            object.draw(canvas);
        }
        if ((n10 = collapsingTextHelper.fadeModeEnabled) == 0) {
            object = collapsingTextHelper.textPaint;
            f11 = collapsingTextHelper.collapsedTextBlend;
            f8 = n8;
            n7 = (int)(f11 *= f8);
            object.setAlpha(n7);
        }
        if ((n10 = Build.VERSION.SDK_INT) >= n14) {
            textPaint = collapsingTextHelper.textPaint;
            f8 = collapsingTextHelper.currentShadowRadius;
            f7 = collapsingTextHelper.currentShadowDx;
            float f14 = collapsingTextHelper.currentShadowDy;
            n3 = collapsingTextHelper.currentShadowColor;
            int n15 = textPaint.getAlpha();
            n3 = MaterialColors.compositeARGBWithAlpha(n3, n15);
            textPaint.setShadowLayer(f8, f7, f14, n3);
        }
        n7 = collapsingTextHelper.textLayout.getLineBaseline(0);
        Object object2 = collapsingTextHelper.textToDrawCollapsed;
        n4 = object2.length();
        float f15 = n7;
        TextPaint textPaint3 = collapsingTextHelper.textPaint;
        int n16 = 0;
        f7 = 0.0f;
        n3 = 0;
        textPaint = canvas;
        canvas.drawText((CharSequence)object2, 0, n4, 0.0f, f15, (Paint)textPaint3);
        if (n10 >= n14) {
            object = collapsingTextHelper.textPaint;
            f12 = collapsingTextHelper.currentShadowRadius;
            f11 = collapsingTextHelper.currentShadowDx;
            f8 = collapsingTextHelper.currentShadowDy;
            n16 = collapsingTextHelper.currentShadowColor;
            object.setShadowLayer(f12, f11, f8, n16);
        }
        if ((n10 = (int)(collapsingTextHelper.fadeModeEnabled ? 1 : 0)) == 0) {
            String string2;
            object = collapsingTextHelper.textToDrawCollapsed.toString().trim();
            n14 = (int)(((String)object).endsWith(string2 = ELLIPSIS_NORMAL) ? 1 : 0);
            if (n14 != 0) {
                n14 = ((String)object).length() + -1;
                object = ((String)object).substring(0, n14);
            }
            object2 = object;
            object = collapsingTextHelper.textPaint;
            object.setAlpha(n8);
            textPaint2 = collapsingTextHelper.textLayout;
            n8 = textPaint2.getLineEnd(0);
            n10 = ((String)object2).length();
            n4 = Math.min(n8, n10);
            n3 = 0;
            textPaint3 = collapsingTextHelper.textPaint;
            n16 = 0;
            f7 = 0.0f;
            textPaint = canvas;
            canvas.drawText((String)object2, 0, n4, 0.0f, f15, (Paint)textPaint3);
        }
    }

    private void ensureExpandedTexture() {
        int n3;
        Object object = this.expandedTitleTexture;
        if (object == null && (n3 = (object = this.expandedBounds).isEmpty()) == 0 && (n3 = TextUtils.isEmpty((CharSequence)(object = this.textToDraw))) == 0) {
            this.calculateOffsets(0.0f);
            object = this.textLayout;
            n3 = object.getWidth();
            StaticLayout staticLayout = this.textLayout;
            int n4 = staticLayout.getHeight();
            if (n3 > 0 && n4 > 0) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                this.expandedTitleTexture = object = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
                staticLayout = this.expandedTitleTexture;
                object = new Canvas((Bitmap)staticLayout);
                staticLayout = this.textLayout;
                staticLayout.draw((Canvas)object);
                object = this.texturePaint;
                if (object == null) {
                    n4 = 3;
                    object = new Paint(n4);
                    this.texturePaint = object;
                }
            }
        }
    }

    private float getCollapsedTextLeftBound(int n3, int n4) {
        int n7;
        int n8 = 17;
        float f5 = 2.4E-44f;
        if (n4 != n8 && (n8 = n4 & 7) != (n7 = 1)) {
            n3 = 0x800005;
            float f6 = 1.175495E-38f;
            n8 = n4 & n3;
            if (n8 != n3) {
                n3 = 5;
                f6 = 7.0E-45f;
                if ((n4 &= n3) != n3) {
                    n3 = (int)(this.isRtl ? 1 : 0);
                    if (n3 != 0) {
                        Rect rect = this.collapsedBounds;
                        n3 = rect.right;
                        f6 = n3;
                        float f7 = this.collapsedTextWidth;
                        f6 -= f7;
                    } else {
                        Rect rect = this.collapsedBounds;
                        n3 = rect.left;
                        f6 = n3;
                    }
                    return f6;
                }
            }
            if ((n3 = (int)(this.isRtl ? 1 : 0)) != 0) {
                Rect rect = this.collapsedBounds;
                n3 = rect.left;
                f6 = n3;
            } else {
                Rect rect = this.collapsedBounds;
                n3 = rect.right;
                f6 = n3;
                float f8 = this.collapsedTextWidth;
                f6 -= f8;
            }
            return f6;
        }
        float f11 = n3;
        float f12 = 2.0f;
        f5 = this.collapsedTextWidth / f12;
        return (f11 /= f12) - f5;
    }

    private float getCollapsedTextRightBound(RectF rectF, int n3, int n4) {
        int n7;
        int n8 = 17;
        if (n4 != n8 && (n8 = n4 & 7) != (n7 = 1)) {
            float f5;
            n3 = 0x800005;
            float f6 = 1.175495E-38f;
            n8 = n4 & n3;
            if (n8 != n3) {
                n3 = 5;
                f6 = 7.0E-45f;
                if ((n4 &= n3) != n3) {
                    float f7;
                    n3 = (int)(this.isRtl ? 1 : 0);
                    if (n3 != 0) {
                        rectF = this.collapsedBounds;
                        int n10 = rectF.right;
                        f7 = n10;
                    } else {
                        f7 = rectF.left;
                        f6 = this.collapsedTextWidth;
                        f7 += f6;
                    }
                    return f7;
                }
            }
            if ((n3 = (int)(this.isRtl ? 1 : 0)) != 0) {
                f5 = rectF.left;
                f6 = this.collapsedTextWidth;
                f5 += f6;
            } else {
                rectF = this.collapsedBounds;
                int n14 = rectF.right;
                f5 = n14;
            }
            return f5;
        }
        float f8 = n3;
        float f11 = 2.0f;
        return this.collapsedTextWidth / f11 + (f8 /= f11);
    }

    private int getCurrentColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] nArray = this.state;
        if (nArray != null) {
            return colorStateList.getColorForState(nArray, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int getCurrentExpandedTextColor() {
        ColorStateList colorStateList = this.expandedTextColor;
        return this.getCurrentColor(colorStateList);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        int n3;
        int n32 = this.expandedTextGravity;
        int n4 = (int)(this.isRtl ? 1 : 0);
        if ((n32 = Gravity.getAbsoluteGravity((int)n32, (int)n4) & 7) != (n3 = 1)) {
            int n7 = 5;
            if (n32 != n7) {
                n32 = (int)(this.isRtl ? 1 : 0);
                Layout.Alignment alignment = n32 != 0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                return alignment;
            }
            n32 = (int)(this.isRtl ? 1 : 0);
            Layout.Alignment alignment = n32 != 0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            return alignment;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void getTextPaintCollapsed(TextPaint textPaint) {
        float f5 = this.collapsedTextSize;
        textPaint.setTextSize(f5);
        Typeface typeface = this.collapsedTypeface;
        textPaint.setTypeface(typeface);
        f5 = this.collapsedLetterSpacing;
        textPaint.setLetterSpacing(f5);
    }

    private void getTextPaintExpanded(TextPaint textPaint) {
        float f5 = this.expandedTextSize;
        textPaint.setTextSize(f5);
        Typeface typeface = this.expandedTypeface;
        textPaint.setTypeface(typeface);
        f5 = this.expandedLetterSpacing;
        textPaint.setLetterSpacing(f5);
    }

    private void interpolateBounds(float f5) {
        boolean bl2 = this.fadeModeEnabled;
        if (bl2) {
            RectF rectF = this.currentBounds;
            float f6 = this.fadeModeThresholdFraction;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            Rect rect = object < 0 ? this.expandedBounds : this.collapsedBounds;
            rectF.set(rect);
        } else {
            RectF rectF = this.currentBounds;
            float f8 = this.expandedBounds.left;
            float f11 = this.collapsedBounds.left;
            TimeInterpolator timeInterpolator = this.positionInterpolator;
            rectF.left = f8 = CollapsingTextHelper.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            f8 = this.expandedDrawY;
            f11 = this.collapsedDrawY;
            timeInterpolator = this.positionInterpolator;
            rectF.top = f8 = CollapsingTextHelper.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            f8 = this.expandedBounds.right;
            f11 = this.collapsedBounds.right;
            timeInterpolator = this.positionInterpolator;
            rectF.right = f8 = CollapsingTextHelper.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            Rect rect = this.expandedBounds;
            int n3 = rect.bottom;
            f8 = n3;
            Rect rect2 = this.collapsedBounds;
            int n4 = rect2.bottom;
            f11 = n4;
            timeInterpolator = this.positionInterpolator;
            rectF.bottom = f5 = CollapsingTextHelper.lerp(f8, f11, f5, timeInterpolator);
        }
    }

    private static boolean isClose(float f5, float f6) {
        float f7 = (f5 = Math.abs(f5 - f6)) - (f6 = 1.0E-5f);
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    private boolean isDefaultIsRtl() {
        int n3;
        View view = this.view;
        int n4 = view.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    private boolean isTextDirectionHeuristicsIsRtl(CharSequence charSequence, boolean bl2) {
        Rj3$d rj3$d = bl2 ? Rj3.d : Rj3.c;
        int n3 = charSequence.length();
        return rj3$d.b(n3, charSequence);
    }

    private static float lerp(float f5, float f6, float f7, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f7 = timeInterpolator.getInterpolation(f7);
        }
        return AnimationUtils.lerp(f5, f6, f7);
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        int n3 = charSequence.length();
        return textPaint.measureText(charSequence, 0, n3);
    }

    private static boolean rectEquals(Rect rect, int n3, int n4, int n7, int n8) {
        int n10;
        int n14 = rect.left;
        if (n14 == n3 && (n3 = rect.top) == n4 && (n3 = rect.right) == n7 && (n10 = rect.bottom) == n8) {
            n10 = 1;
        } else {
            n10 = 0;
            rect = null;
        }
        return n10 != 0;
    }

    private void setCollapsedTextBlend(float f5) {
        this.collapsedTextBlend = f5;
        View view = this.view;
        view.postInvalidateOnAnimation();
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.collapsedTypefaceDefault) != typeface) {
            this.collapsedTypefaceDefault = typeface;
            cancelableFontCallback = this.view.getContext().getResources().getConfiguration();
            this.collapsedTypefaceBold = typeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment((Configuration)cancelableFontCallback, typeface);
            if (typeface == null) {
                typeface = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface;
            return true;
        }
        return false;
    }

    private void setExpandedTextBlend(float f5) {
        this.expandedTextBlend = f5;
        View view = this.view;
        view.postInvalidateOnAnimation();
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.expandedTypefaceDefault) != typeface) {
            this.expandedTypefaceDefault = typeface;
            cancelableFontCallback = this.view.getContext().getResources().getConfiguration();
            this.expandedTypefaceBold = typeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment((Configuration)cancelableFontCallback, typeface);
            if (typeface == null) {
                typeface = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface;
            return true;
        }
        return false;
    }

    private void setInterpolatedTextSize(float f5) {
        View view;
        float f6;
        float f7;
        this.calculateUsingTextSize(f5);
        boolean bl2 = USE_SCALING_TEXTURE;
        if (bl2 && (bl2 = (f7 = (f5 = this.scale) - (f6 = 1.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            view = null;
        }
        this.useTexture = bl2;
        if (bl2) {
            this.ensureExpandedTexture();
        }
        view = this.view;
        view.postInvalidateOnAnimation();
    }

    private boolean shouldDrawMultiline() {
        int n3 = this.maxLines;
        int n4 = 1;
        if (n3 <= n4 || (n3 = (int)(this.isRtl ? 1 : 0)) && !(n3 = this.fadeModeEnabled) || (n3 = this.useTexture)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void draw(Canvas canvas) {
        int n3 = canvas.save();
        CharSequence charSequence = this.textToDraw;
        if (charSequence != null) {
            float f5;
            charSequence = this.currentBounds;
            float f6 = charSequence.width();
            float f7 = 0.0f;
            float f8 = f6 - 0.0f;
            Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object > 0 && (object = (f5 = (f6 = (charSequence = this.currentBounds).height()) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
                float f11;
                float f12;
                Bitmap bitmap;
                charSequence = this.textPaint;
                f7 = this.currentTextSize;
                charSequence.setTextSize(f7);
                f6 = this.currentDrawX;
                f7 = this.currentDrawY;
                int n4 = this.useTexture;
                Paint paint = null;
                if (n4 != 0 && (bitmap = this.expandedTitleTexture) != null) {
                    n4 = 1;
                    f12 = Float.MIN_VALUE;
                } else {
                    n4 = 0;
                    f12 = 0.0f;
                    bitmap = null;
                }
                float f14 = this.scale;
                float f15 = 1.0f;
                float f16 = f14 == f15 ? 0 : (f14 > f15 ? 1 : -1);
                if (f16 != false && (f16 = (float)this.fadeModeEnabled) == false) {
                    canvas.scale(f14, f14, f6, f7);
                }
                if (n4 != 0) {
                    bitmap = this.expandedTitleTexture;
                    paint = this.texturePaint;
                    canvas.drawBitmap(bitmap, f6, f7, paint);
                    canvas.restoreToCount(n3);
                    return;
                }
                n4 = this.shouldDrawMultiline();
                if (n4 != 0 && ((n4 = this.fadeModeEnabled) == 0 || (n4 = (f11 = (f12 = this.expandedFraction) - (f14 = this.fadeModeThresholdFraction)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) > 0)) {
                    f6 = this.currentDrawX;
                    bitmap = this.textLayout;
                    n4 = bitmap.getLineStart(0);
                    f12 = n4;
                    this.drawMultilineTransition(canvas, f6 -= f12, f7);
                } else {
                    canvas.translate(f6, f7);
                    charSequence = this.textLayout;
                    charSequence.draw(canvas);
                }
                canvas.restoreToCount(n3);
            }
        }
    }

    public void getCollapsedTextActualBounds(RectF rectF, int n3, int n4) {
        boolean bl2;
        CharSequence charSequence = this.text;
        this.isRtl = bl2 = this.calculateIsRtl(charSequence);
        float f5 = this.getCollapsedTextLeftBound(n3, n4);
        float f6 = this.collapsedBounds.left;
        rectF.left = f5 = Math.max(f5, f6);
        rectF.top = f5 = (float)this.collapsedBounds.top;
        float f7 = this.getCollapsedTextRightBound(rectF, n3, n4);
        float f8 = this.collapsedBounds.right;
        rectF.right = f7 = Math.min(f7, f8);
        f7 = this.collapsedBounds.top;
        rectF.bottom = f8 = this.getCollapsedTextHeight() + f7;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintCollapsed(textPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getCurrentCollapsedTextColor() {
        ColorStateList colorStateList = this.collapsedTextColor;
        return this.getCurrentColor(colorStateList);
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public float getExpandedTextFullHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintExpanded(textPaint);
        float f5 = -this.tmpPaint.ascent();
        return this.tmpPaint.descent() + f5;
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintExpanded(textPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public int getLineCount() {
        int n3;
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            n3 = staticLayout.getLineCount();
        } else {
            n3 = 0;
            staticLayout = null;
        }
        return n3;
    }

    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final boolean isStateful() {
        boolean bl2;
        ColorStateList colorStateList = this.collapsedTextColor;
        if (colorStateList != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.expandedTextColor) != null && (bl2 = colorStateList.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    public void maybeUpdateFontWeightAdjustment(Configuration configuration) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = typeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            if ((typeface = this.expandedTypefaceDefault) != null) {
                configuration = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
                this.expandedTypefaceBold = configuration;
            }
            if ((configuration = this.collapsedTypefaceBold) == null) {
                configuration = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = configuration;
            configuration = this.expandedTypefaceBold;
            if (configuration == null) {
                configuration = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = configuration;
            boolean bl2 = true;
            this.recalculate(bl2);
        }
    }

    public void recalculate() {
        this.recalculate(false);
    }

    public void recalculate(boolean bl2) {
        View view = this.view;
        int n3 = view.getHeight();
        if (n3 > 0 && (n3 = (view = this.view).getWidth()) > 0 || bl2) {
            this.calculateBaseOffsets(bl2);
            this.calculateCurrentOffsets();
        }
    }

    public void setCollapsedAndExpandedTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.collapsedTextColor;
        if (colorStateList2 != colorStateList || (colorStateList2 = this.expandedTextColor) != colorStateList) {
            this.collapsedTextColor = colorStateList;
            this.expandedTextColor = colorStateList;
            this.recalculate();
        }
    }

    public void setCollapsedBounds(int n3, int n4, int n7, int n8) {
        Rect rect = this.collapsedBounds;
        boolean bl2 = CollapsingTextHelper.rectEquals(rect, n3, n4, n7, n8);
        if (!bl2) {
            rect = this.collapsedBounds;
            rect.set(n3, n4, n7, n8);
            n3 = 1;
            this.boundsChanged = n3;
        }
    }

    public void setCollapsedBounds(Rect rect) {
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        this.setCollapsedBounds(n3, n4, n7, n8);
    }

    public void setCollapsedTextAppearance(int n3) {
        Object object = this.view.getContext();
        TextAppearance textAppearance = new TextAppearance((Context)object, n3);
        Object object2 = textAppearance.getTextColor();
        if (object2 != null) {
            object2 = textAppearance.getTextColor();
            this.collapsedTextColor = object2;
        }
        float f5 = textAppearance.getTextSize();
        object = null;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 != 0) {
            this.collapsedTextSize = f5 = textAppearance.getTextSize();
        }
        if ((object2 = textAppearance.shadowColor) != null) {
            this.collapsedShadowColor = object2;
        }
        this.collapsedShadowDx = f5 = textAppearance.shadowDx;
        this.collapsedShadowDy = f5 = textAppearance.shadowDy;
        this.collapsedShadowRadius = f5 = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = f5 = textAppearance.letterSpacing;
        object2 = this.collapsedFontCallback;
        if (object2 != null) {
            ((CancelableFontCallback)object2).cancel();
        }
        object = new CollapsingTextHelper$1(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.collapsedFontCallback = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.collapsedFontCallback;
        textAppearance.getFontAsync((Context)object2, (TextAppearanceFontCallback)object);
        this.recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.collapsedTextColor;
        if (colorStateList2 != colorStateList) {
            this.collapsedTextColor = colorStateList;
            this.recalculate();
        }
    }

    public void setCollapsedTextGravity(int n3) {
        int n4 = this.collapsedTextGravity;
        if (n4 != n3) {
            this.collapsedTextGravity = n3;
            this.recalculate();
        }
    }

    public void setCollapsedTextSize(float f5) {
        float f6 = this.collapsedTextSize;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.collapsedTextSize = f5;
            this.recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal(typeface);
        if (bl2) {
            this.recalculate();
        }
    }

    public void setCurrentOffsetY(int n3) {
        this.currentOffsetY = n3;
    }

    public void setExpandedBounds(int n3, int n4, int n7, int n8) {
        Rect rect = this.expandedBounds;
        boolean bl2 = CollapsingTextHelper.rectEquals(rect, n3, n4, n7, n8);
        if (!bl2) {
            rect = this.expandedBounds;
            rect.set(n3, n4, n7, n8);
            n3 = 1;
            this.boundsChanged = n3;
        }
    }

    public void setExpandedBounds(Rect rect) {
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        this.setExpandedBounds(n3, n4, n7, n8);
    }

    public void setExpandedLetterSpacing(float f5) {
        float f6 = this.expandedLetterSpacing;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.expandedLetterSpacing = f5;
            this.recalculate();
        }
    }

    public void setExpandedTextAppearance(int n3) {
        Object object = this.view.getContext();
        TextAppearance textAppearance = new TextAppearance((Context)object, n3);
        Object object2 = textAppearance.getTextColor();
        if (object2 != null) {
            object2 = textAppearance.getTextColor();
            this.expandedTextColor = object2;
        }
        float f5 = textAppearance.getTextSize();
        object = null;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 != 0) {
            this.expandedTextSize = f5 = textAppearance.getTextSize();
        }
        if ((object2 = textAppearance.shadowColor) != null) {
            this.expandedShadowColor = object2;
        }
        this.expandedShadowDx = f5 = textAppearance.shadowDx;
        this.expandedShadowDy = f5 = textAppearance.shadowDy;
        this.expandedShadowRadius = f5 = textAppearance.shadowRadius;
        this.expandedLetterSpacing = f5 = textAppearance.letterSpacing;
        object2 = this.expandedFontCallback;
        if (object2 != null) {
            ((CancelableFontCallback)object2).cancel();
        }
        object = new CollapsingTextHelper$2(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.expandedFontCallback = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.expandedFontCallback;
        textAppearance.getFontAsync((Context)object2, (TextAppearanceFontCallback)object);
        this.recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.expandedTextColor;
        if (colorStateList2 != colorStateList) {
            this.expandedTextColor = colorStateList;
            this.recalculate();
        }
    }

    public void setExpandedTextGravity(int n3) {
        int n4 = this.expandedTextGravity;
        if (n4 != n3) {
            this.expandedTextGravity = n3;
            this.recalculate();
        }
    }

    public void setExpandedTextSize(float f5) {
        float f6 = this.expandedTextSize;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.expandedTextSize = f5;
            this.recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        boolean bl2 = this.setExpandedTypefaceInternal(typeface);
        if (bl2) {
            this.recalculate();
        }
    }

    public void setExpansionFraction(float f5) {
        float f6;
        float f7 = 1.0f;
        float f8 = (f5 = PK1.a(f5, 0.0f, f7)) - (f6 = this.expandedFraction);
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object != false) {
            this.expandedFraction = f5;
            this.calculateCurrentOffsets();
        }
    }

    public void setFadeModeEnabled(boolean bl2) {
        this.fadeModeEnabled = bl2;
    }

    public void setFadeModeStartFraction(float f5) {
        this.fadeModeStartFraction = f5;
        this.fadeModeThresholdFraction = f5 = this.calculateFadeModeThresholdFraction();
    }

    public void setHyphenationFrequency(int n3) {
        this.hyphenationFrequency = n3;
    }

    public void setLineSpacingAdd(float f5) {
        this.lineSpacingAdd = f5;
    }

    public void setLineSpacingMultiplier(float f5) {
        this.lineSpacingMultiplier = f5;
    }

    public void setMaxLines(int n3) {
        int n4 = this.maxLines;
        if (n3 != n4) {
            this.maxLines = n3;
            this.clearTexture();
            this.recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        this.recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean bl2) {
        this.isRtlTextDirectionHeuristicsEnabled = bl2;
    }

    public final boolean setState(int[] nArray) {
        this.state = nArray;
        boolean bl2 = this.isStateful();
        if (bl2) {
            this.recalculate();
            return true;
        }
        return false;
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer2 = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer2 != staticLayoutBuilderConfigurer) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
            boolean bl2 = true;
            this.recalculate(bl2);
        }
    }

    public void setText(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean bl2;
        if (charSequence == null || !(bl2 = TextUtils.equals((CharSequence)(charSequence2 = this.text), (CharSequence)charSequence))) {
            this.text = charSequence;
            charSequence = null;
            this.textToDraw = null;
            this.clearTexture();
            this.recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        this.recalculate();
    }

    public void setTitleTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.titleTextEllipsize = truncateAt;
        this.recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal(typeface);
        boolean bl3 = this.setExpandedTypefaceInternal(typeface);
        if (bl2 || bl3) {
            this.recalculate();
        }
    }
}

