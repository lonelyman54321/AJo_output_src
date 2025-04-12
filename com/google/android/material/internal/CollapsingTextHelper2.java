/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
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
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CollapsingTextHelper2$1;
import com.google.android.material.internal.CollapsingTextHelper2$2;
import com.google.android.material.internal.CollapsingTextHelper2$3;
import com.google.android.material.internal.CollapsingTextHelper2$4;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.CancelableFontCallback$ApplyFont;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class CollapsingTextHelper2 {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT;
    private static final String ELLIPSIS_NORMAL = "\u2026";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper2";
    private static final boolean USE_SCALING_TEXTURE;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawX2;
    private float collapsedDrawY;
    private float collapsedDrawY2;
    private CancelableFontCallback collapsedFontCallback;
    private CancelableFontCallback collapsedFontCallback2;
    private float collapsedLetterSpacing;
    private float collapsedLetterSpacing2;
    private ColorStateList collapsedShadowColor;
    private ColorStateList collapsedShadowColor2;
    private float collapsedShadowDx;
    private float collapsedShadowDx2;
    private float collapsedShadowDy;
    private float collapsedShadowDy2;
    private float collapsedShadowRadius;
    private float collapsedShadowRadius2;
    private float collapsedTextBlend;
    private float collapsedTextBlend2;
    private ColorStateList collapsedTextColor;
    private ColorStateList collapsedTextColor2;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private float collapsedTextSize2;
    private float collapsedTextWidth;
    private float collapsedTextWidth2;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypeface2;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawX2;
    private float currentDrawY;
    private float currentDrawY2;
    private int currentOffsetY;
    private float currentTextSize;
    private float currentTextSize2;
    private Typeface currentTypeface;
    private Typeface currentTypeface2;
    private boolean drawTitle;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawX2;
    private float expandedDrawY;
    private float expandedDrawY2;
    private float expandedFirstLineDrawX;
    private float expandedFirstLineDrawX2;
    private CancelableFontCallback expandedFontCallback;
    private CancelableFontCallback expandedFontCallback2;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private float expandedLetterSpacing2;
    private int expandedLineCount;
    private int expandedLineCount2;
    private ColorStateList expandedShadowColor;
    private ColorStateList expandedShadowColor2;
    private float expandedShadowDx;
    private float expandedShadowDx2;
    private float expandedShadowDy;
    private float expandedShadowDy2;
    private float expandedShadowRadius;
    private float expandedShadowRadius2;
    private float expandedTextBlend;
    private float expandedTextBlend2;
    private ColorStateList expandedTextColor;
    private ColorStateList expandedTextColor2;
    private int expandedTextGravity;
    private float expandedTextSize;
    private float expandedTextSize2;
    private Bitmap expandedTitleTexture;
    private Bitmap expandedTitleTexture2;
    private Typeface expandedTypeface;
    private Typeface expandedTypeface2;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private int hyphenationFrequency;
    private int hyphenationFrequency2;
    private boolean isRtl;
    private boolean isRtlTextDirectionHeuristicsEnabled;
    private float lineSpacingAdd;
    private float lineSpacingAdd2;
    private float lineSpacingMultiplier;
    private float lineSpacingMultiplier2;
    private int maxLines;
    private int maxLines2;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private float scale2;
    private int[] state;
    private CharSequence text;
    private CharSequence text2;
    private StaticLayout textLayout;
    private StaticLayout textLayout2;
    private final TextPaint textPaint;
    private final TextPaint textPaint2;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private CharSequence textToDraw2;
    private CharSequence textToDrawCollapsed;
    private CharSequence textToDrawCollapsed2;
    private Paint texturePaint;
    private Paint texturePaint2;
    private final TextPaint tmpPaint;
    private final TextPaint tmpPaint2;
    private boolean useTexture;
    private final View view;

    static {
        USE_SCALING_TEXTURE = false;
        DEBUG_DRAW_PAINT = null;
    }

    public CollapsingTextHelper2(View view) {
        float f5;
        TextPaint textPaint;
        TextPaint textPaint2;
        float f6;
        int n3;
        this.expandedTextGravity = n3 = 16;
        this.collapsedTextGravity = n3;
        this.expandedTextSize = f6 = 15.0f;
        this.expandedTextSize2 = f6;
        this.collapsedTextSize = f6;
        this.collapsedTextSize2 = f6;
        n3 = 1;
        this.isRtlTextDirectionHeuristicsEnabled = n3;
        this.maxLines = n3;
        this.maxLines2 = n3;
        this.lineSpacingAdd = 0.0f;
        this.lineSpacingAdd2 = 0.0f;
        this.lineSpacingMultiplier = f6 = 1.0f;
        this.lineSpacingMultiplier2 = f6;
        this.hyphenationFrequency = n3 = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;
        this.hyphenationFrequency2 = n3;
        this.view = view;
        n3 = 129;
        super(n3);
        this.textPaint = view;
        this.textPaint2 = textPaint2 = new TextPaint(n3);
        this.tmpPaint = textPaint = new TextPaint((Paint)view);
        super((Paint)textPaint2);
        this.tmpPaint2 = view;
        super();
        this.collapsedBounds = view;
        super();
        this.expandedBounds = view;
        super();
        this.currentBounds = view;
        this.fadeModeThresholdFraction = f5 = this.calculateFadeModeThresholdFraction();
    }

    private static int blendColors(int n3, int n4, float f5) {
        float f6 = 1.0f - f5;
        float f7 = (float)Color.alpha((int)n3) * f6;
        float f8 = (float)Color.alpha((int)n4) * f5 + f7;
        f7 = (float)Color.red((int)n3) * f6;
        float f11 = (float)Color.red((int)n4) * f5 + f7;
        f7 = (float)Color.green((int)n3) * f6;
        float f12 = (float)Color.green((int)n4) * f5 + f7;
        float f14 = (float)Color.blue((int)n3) * f6;
        float f15 = (float)Color.blue((int)n4) * f5 + f14;
        n3 = (int)f8;
        int n7 = (int)f11;
        int n8 = (int)f12;
        n4 = (int)f15;
        return Color.argb((int)n3, (int)n7, (int)n8, (int)n4);
    }

    private void calculateBaseOffsets(boolean n3) {
        float f5;
        int n4;
        TextPaint textPaint;
        int n7;
        float f6;
        float f7;
        Object object;
        float f8;
        int n8;
        int n10;
        int n14;
        float f11;
        Object object2;
        float f12;
        int n15;
        TextPaint textPaint2;
        StaticLayout staticLayout;
        CollapsingTextHelper2 collapsingTextHelper2 = this;
        int n16 = n3;
        float f14 = this.currentTextSize;
        float f15 = this.currentTextSize2;
        CharSequence charSequence = this.text2;
        int n17 = TextUtils.isEmpty((CharSequence)charSequence);
        float f16 = this.collapsedTextSize;
        this.calculateUsingTextSize(f16, n3 != 0);
        f16 = this.collapsedTextSize2;
        this.calculateUsingTextSize2(f16, n3 != 0);
        CharSequence charSequence2 = this.textToDraw;
        if (charSequence2 != null && (staticLayout = this.textLayout) != null) {
            textPaint2 = this.textPaint;
            n15 = staticLayout.getWidth();
            f12 = n15;
            object2 = TextUtils.TruncateAt.END;
            this.textToDrawCollapsed = charSequence2 = TextUtils.ellipsize((CharSequence)charSequence2, (TextPaint)textPaint2, (float)f12, (TextUtils.TruncateAt)object2);
        }
        if ((charSequence2 = collapsingTextHelper2.textToDraw2) != null && (staticLayout = collapsingTextHelper2.textLayout2) != null) {
            textPaint2 = collapsingTextHelper2.textPaint2;
            n15 = staticLayout.getWidth();
            f12 = n15;
            object2 = TextUtils.TruncateAt.END;
            collapsingTextHelper2.textToDrawCollapsed2 = charSequence2 = TextUtils.ellipsize((CharSequence)charSequence2, (TextPaint)textPaint2, (float)f12, (TextUtils.TruncateAt)object2);
        }
        charSequence2 = collapsingTextHelper2.textToDrawCollapsed;
        n15 = 0;
        f12 = 0.0f;
        staticLayout = null;
        int n18 = 0;
        float f17 = 0.0f;
        textPaint2 = null;
        if (charSequence2 != null) {
            object2 = collapsingTextHelper2.textPaint;
            charSequence2 = new TextPaint((Paint)object2);
            f11 = collapsingTextHelper2.collapsedLetterSpacing;
            charSequence2.setLetterSpacing(f11);
            object2 = collapsingTextHelper2.textToDrawCollapsed;
            n14 = object2.length();
            collapsingTextHelper2.collapsedTextWidth = f16 = charSequence2.measureText((CharSequence)object2, 0, n14);
        } else {
            collapsingTextHelper2.collapsedTextWidth = 0.0f;
        }
        charSequence2 = collapsingTextHelper2.textToDrawCollapsed2;
        if (charSequence2 != null) {
            object2 = collapsingTextHelper2.textPaint2;
            charSequence2 = new TextPaint((Paint)object2);
            f11 = collapsingTextHelper2.collapsedLetterSpacing2;
            charSequence2.setLetterSpacing(f11);
            object2 = collapsingTextHelper2.textToDrawCollapsed2;
            n14 = object2.length();
            collapsingTextHelper2.collapsedTextWidth2 = f16 = charSequence2.measureText((CharSequence)object2, 0, n14);
        } else {
            collapsingTextHelper2.collapsedTextWidth2 = 0.0f;
        }
        int n19 = collapsingTextHelper2.collapsedTextGravity;
        int n20 = collapsingTextHelper2.isRtl;
        n19 = Gravity.getAbsoluteGravity((int)n19, (int)n20);
        object2 = collapsingTextHelper2.textPaint;
        f11 = object2.descent();
        TextPaint textPaint3 = collapsingTextHelper2.textPaint;
        float f18 = textPaint3.ascent();
        f11 -= f18;
        n14 = 0x40000000;
        f18 = 2.0f;
        f11 /= f18;
        TextPaint textPaint4 = collapsingTextHelper2.textPaint2;
        float f19 = textPaint4.descent();
        TextPaint textPaint5 = collapsingTextHelper2.textPaint2;
        float f20 = textPaint5.ascent();
        f19 = (f19 - f20) / f18;
        int n21 = 80;
        f20 = 1.12E-43f;
        int n22 = 48;
        if (n17 != 0) {
            n10 = n19 & 0x70;
            if (n10 != n22) {
                if (n10 != n21) {
                    textPaint4 = collapsingTextHelper2.collapsedBounds;
                    n10 = textPaint4.centerY();
                    collapsingTextHelper2.collapsedDrawY = f19 = (float)n10 - f11;
                } else {
                    object2 = collapsingTextHelper2.collapsedBounds;
                    int n24 = ((Rect)object2).bottom;
                    f11 = n24;
                    textPaint4 = collapsingTextHelper2.textPaint;
                    collapsingTextHelper2.collapsedDrawY = f19 = textPaint4.ascent() + f11;
                }
            } else {
                object2 = collapsingTextHelper2.collapsedBounds;
                int n25 = ((Rect)object2).top;
                collapsingTextHelper2.collapsedDrawY = f11 = (float)n25;
            }
        } else {
            n8 = n19 & 0x70;
            if (n8 != n22) {
                if (n8 != n21) {
                    Rect rect = collapsingTextHelper2.collapsedBounds;
                    n8 = rect.centerY();
                    collapsingTextHelper2.collapsedDrawY = f8 = (float)n8 - f11 - f19;
                    object2 = collapsingTextHelper2.collapsedBounds;
                    int n26 = object2.centerY();
                    f11 = n26;
                    collapsingTextHelper2.collapsedDrawY2 = f19 = f19 / f18 + f11;
                } else {
                    Rect rect = collapsingTextHelper2.collapsedBounds;
                    n8 = rect.bottom;
                    f8 = n8;
                    object = collapsingTextHelper2.textPaint2;
                    f7 = object.ascent() + f8 - f11 - f19;
                    collapsingTextHelper2.collapsedDrawY = f7 -= (f19 /= f18);
                    object2 = collapsingTextHelper2.collapsedBounds;
                    int n27 = ((Rect)object2).bottom;
                    f11 = n27;
                    textPaint4 = collapsingTextHelper2.textPaint2;
                    collapsingTextHelper2.collapsedDrawY2 = f19 = textPaint4.ascent() + f11;
                }
            } else {
                Rect rect = collapsingTextHelper2.collapsedBounds;
                n8 = rect.top;
                collapsingTextHelper2.collapsedDrawY = f7 = (float)n8;
                f8 = (float)n8 + f11 + f19;
                collapsingTextHelper2.collapsedDrawY2 = f19 = f19 / f18 + f8;
            }
        }
        int n28 = 0x800007;
        f11 = 1.1754953E-38f;
        n10 = 5;
        f19 = 7.0E-45f;
        n8 = 1;
        f8 = Float.MIN_VALUE;
        if ((n19 &= n28) != n8) {
            if (n19 != n10) {
                charSequence2 = collapsingTextHelper2.collapsedBounds;
                n19 = ((Rect)charSequence2).left;
                collapsingTextHelper2.collapsedDrawX = f7 = (float)n19;
                collapsingTextHelper2.collapsedDrawX2 = f16 = (float)n19;
            } else {
                charSequence2 = collapsingTextHelper2.collapsedBounds;
                n19 = ((Rect)charSequence2).right;
                f7 = n19;
                float f22 = collapsingTextHelper2.collapsedTextWidth;
                collapsingTextHelper2.collapsedDrawX = f7 -= f22;
                f16 = n19;
                f7 = collapsingTextHelper2.collapsedTextWidth2;
                collapsingTextHelper2.collapsedDrawX2 = f16 -= f7;
            }
        } else {
            f16 = collapsingTextHelper2.collapsedBounds.centerX();
            f7 = collapsingTextHelper2.collapsedTextWidth / f18;
            collapsingTextHelper2.collapsedDrawX = f16 -= f7;
            charSequence2 = collapsingTextHelper2.collapsedBounds;
            n19 = charSequence2.centerX();
            f16 = n19;
            f7 = collapsingTextHelper2.collapsedTextWidth2 / f18;
            collapsingTextHelper2.collapsedDrawX2 = f16 -= f7;
        }
        f16 = collapsingTextHelper2.expandedTextSize;
        collapsingTextHelper2.calculateUsingTextSize(f16, n16 != 0);
        f16 = collapsingTextHelper2.expandedTextSize2;
        collapsingTextHelper2.calculateUsingTextSize2(f16, n16 != 0);
        StaticLayout staticLayout2 = collapsingTextHelper2.textLayout;
        if (staticLayout2 != null) {
            n16 = staticLayout2.getHeight();
            f6 = n16;
        } else {
            n16 = 0;
            f6 = 0.0f;
            staticLayout2 = null;
        }
        charSequence2 = collapsingTextHelper2.textLayout2;
        if (charSequence2 != null) {
            n19 = charSequence2.getHeight();
            f16 = n19;
        } else {
            n19 = 0;
            f16 = 0.0f;
            charSequence2 = null;
        }
        object = collapsingTextHelper2.textLayout;
        if (object != null) {
            n7 = object.getLineCount();
        } else {
            n7 = 0;
            f7 = 0.0f;
            object = null;
        }
        collapsingTextHelper2.expandedLineCount = n7;
        object = collapsingTextHelper2.textLayout2;
        if (object != null) {
            n7 = object.getLineCount();
        } else {
            n7 = 0;
            f7 = 0.0f;
            object = null;
        }
        collapsingTextHelper2.expandedLineCount2 = n7;
        object = collapsingTextHelper2.textToDraw;
        if (object != null) {
            textPaint = collapsingTextHelper2.textPaint;
            n15 = object.length();
            f12 = textPaint.measureText((CharSequence)object, 0, n15);
        } else {
            n15 = 0;
            f12 = 0.0f;
            staticLayout = null;
        }
        object = collapsingTextHelper2.textToDraw2;
        if (object != null) {
            textPaint = collapsingTextHelper2.textPaint2;
            n10 = object.length();
            f19 = textPaint.measureText((CharSequence)object, 0, n10);
        } else {
            n10 = 0;
            f19 = 0.0f;
            textPaint4 = null;
        }
        object = collapsingTextHelper2.textLayout;
        if (object != null && (n4 = collapsingTextHelper2.maxLines) > n8) {
            n15 = object.getWidth();
            f12 = n15;
        }
        if ((object = collapsingTextHelper2.textLayout2) != null && (n4 = collapsingTextHelper2.maxLines2) > n8) {
            n10 = object.getWidth();
            f19 = n10;
        }
        if ((object = collapsingTextHelper2.textLayout) != null) {
            n4 = collapsingTextHelper2.maxLines;
            if (n4 > n8) {
                n7 = object.getLineStart(0);
                f7 = n7;
            } else {
                f7 = object.getLineLeft(0);
            }
        } else {
            n7 = 0;
            f7 = 0.0f;
            object = null;
        }
        collapsingTextHelper2.expandedFirstLineDrawX = f7;
        object = collapsingTextHelper2.textLayout2;
        if (object != null) {
            n4 = collapsingTextHelper2.maxLines2;
            if (n4 > n8) {
                n18 = object.getLineStart(0);
                f17 = n18;
            } else {
                f17 = object.getLineLeft(0);
            }
        } else {
            n18 = 0;
            f17 = 0.0f;
            textPaint2 = null;
        }
        collapsingTextHelper2.expandedFirstLineDrawX2 = f17;
        n18 = collapsingTextHelper2.expandedTextGravity;
        n7 = (int)(collapsingTextHelper2.isRtl ? 1 : 0);
        n18 = Gravity.getAbsoluteGravity((int)n18, (int)n7);
        f7 = f6 / f18;
        if (n17 != 0) {
            n17 = n18 & 0x70;
            if (n17 != n22) {
                if (n17 != n21) {
                    staticLayout2 = collapsingTextHelper2.expandedBounds;
                    n16 = staticLayout2.centerY();
                    collapsingTextHelper2.expandedDrawY = f6 = (float)n16 - f7;
                } else {
                    charSequence = collapsingTextHelper2.expandedBounds;
                    n17 = ((Rect)charSequence).bottom;
                    f5 = (float)n17 - f6;
                    staticLayout2 = collapsingTextHelper2.textPaint;
                    collapsingTextHelper2.expandedDrawY = f6 = staticLayout2.descent() + f5;
                }
            } else {
                staticLayout2 = collapsingTextHelper2.expandedBounds;
                n16 = staticLayout2.top;
                collapsingTextHelper2.expandedDrawY = f6 = (float)n16;
            }
        } else {
            n17 = n18 & 0x70;
            if (n17 != n22) {
                if (n17 != n21) {
                    charSequence = collapsingTextHelper2.expandedBounds;
                    n17 = charSequence.centerY();
                    f5 = (float)n17 - f6;
                    f6 = collapsingTextHelper2.textPaint2.descent();
                    collapsingTextHelper2.expandedDrawY = f5 -= f6;
                    staticLayout2 = collapsingTextHelper2.expandedBounds;
                    n16 = staticLayout2.centerY();
                    collapsingTextHelper2.expandedDrawY2 = f6 = (float)n16;
                } else {
                    n17 = collapsingTextHelper2.expandedBounds.bottom;
                    collapsingTextHelper2.expandedDrawY = f20 = (float)n17 - f6 - f16;
                    f6 = (float)n17 - f16;
                    charSequence = collapsingTextHelper2.textPaint2;
                    collapsingTextHelper2.expandedDrawY2 = f5 = charSequence.descent() + f6;
                }
            } else {
                charSequence = collapsingTextHelper2.expandedBounds;
                n17 = ((Rect)charSequence).top;
                collapsingTextHelper2.expandedDrawY = f16 = (float)n17;
                f5 = (float)n17 + f6;
                staticLayout2 = collapsingTextHelper2.textPaint2;
                collapsingTextHelper2.expandedDrawY2 = f6 = staticLayout2.descent() + f5;
            }
        }
        n16 = n18 & n28;
        if (n16 != n8) {
            n17 = 5;
            f5 = 7.0E-45f;
            if (n16 != n17) {
                staticLayout2 = collapsingTextHelper2.expandedBounds;
                n16 = staticLayout2.left;
                collapsingTextHelper2.expandedDrawX = f5 = (float)n16;
                collapsingTextHelper2.expandedDrawX2 = f6 = (float)n16;
            } else {
                staticLayout2 = collapsingTextHelper2.expandedBounds;
                n16 = staticLayout2.right;
                collapsingTextHelper2.expandedDrawX = f5 = (float)n16 - f12;
                collapsingTextHelper2.expandedDrawX2 = f6 = (float)n16 - f19;
            }
        } else {
            f6 = collapsingTextHelper2.expandedBounds.centerX();
            collapsingTextHelper2.expandedDrawX = f6 -= (f12 /= f18);
            staticLayout2 = collapsingTextHelper2.expandedBounds;
            n16 = staticLayout2.centerX();
            f6 = n16;
            collapsingTextHelper2.expandedDrawX2 = f6 -= (f19 /= f18);
        }
        this.clearTexture();
        collapsingTextHelper2.setInterpolatedTextSize(f14);
        collapsingTextHelper2.setInterpolatedTextSize2(f15);
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
        float f6;
        TimeInterpolator timeInterpolator;
        float f7;
        int n3;
        int n4;
        Object object;
        float f8;
        this.interpolateBounds(f5);
        Object object2 = this.fadeModeEnabled;
        int n7 = 0;
        float f11 = 0.0f;
        ColorStateList colorStateList = null;
        int n8 = 1065353216;
        float f12 = 1.0f;
        if (object2 != 0) {
            f8 = this.fadeModeThresholdFraction;
            float f14 = f5 - f8;
            object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                this.currentDrawX = f8 = this.expandedDrawX;
                this.currentDrawX2 = f8 = this.expandedDrawX2;
                this.currentDrawY = f8 = this.expandedDrawY;
                this.currentDrawY2 = f8 = this.expandedDrawY2;
                f8 = this.expandedTextSize;
                this.setInterpolatedTextSize(f8);
                f8 = this.expandedTextSize2;
                this.setInterpolatedTextSize2(f8);
                object2 = 0;
                f8 = 0.0f;
                object = null;
            } else {
                this.currentDrawX = f8 = this.collapsedDrawX;
                this.currentDrawX2 = f8 = this.collapsedDrawX2;
                f8 = this.collapsedDrawY;
                n4 = this.currentOffsetY;
                n3 = 0;
                f7 = 0.0f;
                timeInterpolator = null;
                f6 = Math.max(0, n4);
                this.currentDrawY = f8 -= f6;
                f8 = this.collapsedDrawY2;
                n4 = this.currentOffsetY;
                n4 = Math.max(0, n4);
                f6 = n4;
                this.currentDrawY2 = f8 -= f6;
                f8 = this.collapsedTextSize;
                this.setInterpolatedTextSize(f8);
                f8 = this.collapsedTextSize2;
                this.setInterpolatedTextSize2(f8);
                object2 = 1065353216;
                f8 = 1.0f;
            }
        } else {
            f8 = this.expandedDrawX;
            f6 = this.collapsedDrawX;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawX = f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            f8 = this.expandedDrawX2;
            f6 = this.collapsedDrawX2;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawX2 = f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            f8 = this.expandedDrawY;
            f6 = this.collapsedDrawY;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawY = f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            f8 = this.expandedDrawY2;
            f6 = this.collapsedDrawY2;
            timeInterpolator = this.positionInterpolator;
            this.currentDrawY2 = f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            f8 = this.expandedTextSize;
            f6 = this.collapsedTextSize;
            timeInterpolator = this.textSizeInterpolator;
            f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            this.setInterpolatedTextSize(f8);
            f8 = this.expandedTextSize2;
            f6 = this.collapsedTextSize2;
            timeInterpolator = this.textSizeInterpolator;
            f8 = CollapsingTextHelper2.lerp(f8, f6, f5, timeInterpolator);
            this.setInterpolatedTextSize2(f8);
            f8 = f5;
        }
        f6 = f12 - f5;
        timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        float f15 = CollapsingTextHelper2.lerp(0.0f, f12, f6, timeInterpolator);
        f15 = f12 - f15;
        this.setCollapsedTextBlend(f15);
        f6 = CollapsingTextHelper2.lerp(0.0f, f12, f6, timeInterpolator);
        f6 = f12 - f6;
        this.setCollapsedTextBlend2(f6);
        f6 = CollapsingTextHelper2.lerp(f12, 0.0f, f5, timeInterpolator);
        this.setExpandedTextBlend(f6);
        f11 = CollapsingTextHelper2.lerp(f12, 0.0f, f5, timeInterpolator);
        this.setExpandedTextBlend2(f11);
        colorStateList = this.collapsedTextColor;
        ColorStateList colorStateList2 = this.expandedTextColor;
        if (colorStateList != colorStateList2) {
            colorStateList = this.textPaint;
            n8 = this.getCurrentExpandedTextColor();
            n4 = this.getCurrentCollapsedTextColor();
            n8 = CollapsingTextHelper2.blendColors(n8, n4, f8);
            colorStateList.setColor(n8);
        } else {
            colorStateList = this.textPaint;
            n8 = this.getCurrentCollapsedTextColor();
            colorStateList.setColor(n8);
        }
        colorStateList = this.collapsedTextColor2;
        colorStateList2 = this.expandedTextColor2;
        if (colorStateList != colorStateList2) {
            colorStateList = this.textPaint2;
            n8 = this.getCurrentExpandedTextColor2();
            n4 = this.getCurrentCollapsedTextColor2();
            object2 = CollapsingTextHelper2.blendColors(n8, n4, f8);
            colorStateList.setColor(object2);
        } else {
            object = this.textPaint2;
            n7 = this.getCurrentCollapsedTextColor2();
            object.setColor(n7);
        }
        f8 = this.collapsedLetterSpacing;
        f11 = this.expandedLetterSpacing;
        n8 = (int)(f8 == f11 ? 0 : (f8 > f11 ? 1 : -1));
        if (n8 != 0) {
            colorStateList2 = this.textPaint;
            f8 = CollapsingTextHelper2.lerp(f11, f8, f5, timeInterpolator);
            colorStateList2.setLetterSpacing(f8);
        } else {
            colorStateList = this.textPaint;
            colorStateList.setLetterSpacing(f8);
        }
        f8 = this.collapsedLetterSpacing2;
        f11 = this.expandedLetterSpacing2;
        n8 = (int)(f8 == f11 ? 0 : (f8 > f11 ? 1 : -1));
        if (n8 != 0) {
            colorStateList2 = this.textPaint2;
            f8 = CollapsingTextHelper2.lerp(f11, f8, f5, timeInterpolator);
            colorStateList2.setLetterSpacing(f8);
        } else {
            colorStateList = this.textPaint2;
            colorStateList.setLetterSpacing(f8);
        }
        object = this.textPaint;
        f11 = this.expandedShadowRadius;
        f12 = this.collapsedShadowRadius;
        n4 = 0;
        f11 = CollapsingTextHelper2.lerp(f11, f12, f5, null);
        f12 = this.expandedShadowDx;
        f7 = this.collapsedShadowDx;
        f12 = CollapsingTextHelper2.lerp(f12, f7, f5, null);
        f7 = this.expandedShadowDy;
        f15 = this.collapsedShadowDy;
        f7 = CollapsingTextHelper2.lerp(f7, f15, f5, null);
        ColorStateList colorStateList3 = this.expandedShadowColor;
        int n10 = this.getCurrentColor(colorStateList3);
        ColorStateList colorStateList4 = this.collapsedShadowColor;
        int n14 = this.getCurrentColor(colorStateList4);
        n10 = CollapsingTextHelper2.blendColors(n10, n14, f5);
        object.setShadowLayer(f11, f12, f7, n10);
        object = this.textPaint2;
        f11 = this.expandedShadowRadius2;
        f12 = this.collapsedShadowRadius2;
        f11 = CollapsingTextHelper2.lerp(f11, f12, f5, null);
        f12 = this.expandedShadowDx2;
        f7 = this.collapsedShadowDx2;
        f12 = CollapsingTextHelper2.lerp(f12, f7, f5, null);
        f7 = this.expandedShadowDy2;
        f15 = this.collapsedShadowDy2;
        f6 = CollapsingTextHelper2.lerp(f7, f15, f5, null);
        timeInterpolator = this.expandedShadowColor2;
        n3 = this.getCurrentColor((ColorStateList)timeInterpolator);
        colorStateList3 = this.collapsedShadowColor2;
        n10 = this.getCurrentColor(colorStateList3);
        n3 = CollapsingTextHelper2.blendColors(n3, n10, f5);
        object.setShadowLayer(f11, f12, f6, n3);
        object2 = this.fadeModeEnabled;
        if (object2 != 0) {
            object2 = this.textPaint.getAlpha();
            n7 = this.textPaint2.getAlpha();
            f12 = this.calculateFadeModeTextAlpha(f5);
            f8 = object2;
            object2 = (int)(f12 *= f8);
            f5 = this.calculateFadeModeTextAlpha(f5);
            f11 = n7;
            int n15 = (int)(f5 *= f11);
            colorStateList = this.textPaint;
            colorStateList.setAlpha(object2);
            object = this.textPaint2;
            object.setAlpha(n15);
        }
        View view = this.view;
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
        Typeface typeface;
        CharSequence charSequence2 = this.text;
        if (charSequence2 == null) {
            return;
        }
        charSequence2 = this.collapsedBounds;
        int n4 = charSequence2.width();
        float f7 = n4;
        Rect rect = this.expandedBounds;
        int n7 = rect.width();
        float f8 = n7;
        float f11 = this.collapsedTextSize;
        boolean bl2 = CollapsingTextHelper2.isClose(f5, f11);
        float f12 = 1.0f;
        boolean bl3 = false;
        int n8 = 1;
        if (bl2) {
            f5 = this.collapsedTextSize;
            this.scale = f12;
            typeface = this.currentTypeface;
            rect = this.collapsedTypeface;
            if (typeface != rect) {
                this.currentTypeface = rect;
                n3 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f6 = 0.0f;
                typeface = null;
            }
        } else {
            float f14;
            float f15;
            int n10;
            f11 = this.expandedTextSize;
            Typeface typeface2 = this.currentTypeface;
            Typeface typeface3 = this.expandedTypeface;
            if (typeface2 != typeface3) {
                this.currentTypeface = typeface3;
                n10 = 1;
                f15 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f15 = 0.0f;
                typeface2 = null;
            }
            boolean bl4 = CollapsingTextHelper2.isClose(f5, f11);
            if (bl4) {
                this.scale = f12;
            } else {
                f14 = this.expandedTextSize;
                this.scale = f5 /= f14;
            }
            f5 = this.collapsedTextSize;
            f14 = this.expandedTextSize;
            f5 /= f14;
            f14 = f8 * f5;
            f7 = n3 == 0 && (n3 = (int)(f14 == f7 ? 0 : (f14 > f7 ? 1 : -1))) > 0 ? (f5 = Math.min(f7 / f5, f8)) : f8;
            f5 = f11;
            n3 = n10;
            f6 = f15;
        }
        f8 = 0.0f;
        rect = null;
        float f16 = f7 - 0.0f;
        n7 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
        if (n7 > 0) {
            f8 = this.currentTextSize;
            float f17 = f8 - f5;
            n7 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
            if (n7 == 0 && (n7 = (int)(this.boundsChanged ? 1 : 0)) == 0 && n3 == 0) {
                n3 = 0;
                f6 = 0.0f;
                typeface = null;
            } else {
                n3 = 1;
                f6 = Float.MIN_VALUE;
            }
            this.currentTextSize = f5;
            this.boundsChanged = false;
        }
        if ((charSequence = this.textToDraw) == null || n3 != 0) {
            boolean bl5;
            charSequence = this.textPaint;
            f6 = this.currentTextSize;
            charSequence.setTextSize(f6);
            charSequence = this.textPaint;
            typeface = this.currentTypeface;
            charSequence.setTypeface(typeface);
            charSequence = this.textPaint;
            f6 = this.scale;
            n3 = (int)(f6 == f12 ? 0 : (f6 > f12 ? 1 : -1));
            if (n3 != 0) {
                bl3 = true;
            }
            charSequence.setLinearText(bl3);
            charSequence = this.text;
            this.isRtl = bl5 = this.calculateIsRtl(charSequence);
            bl5 = this.shouldDrawMultiline();
            if (bl5) {
                n8 = this.maxLines;
            }
            bl5 = this.isRtl;
            charSequence = this.createStaticLayout(n8, f7, bl5);
            this.textLayout = charSequence;
            this.textToDraw = charSequence = charSequence.getText();
        }
    }

    private void calculateUsingTextSize2(float f5) {
        this.calculateUsingTextSize2(f5, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void calculateUsingTextSize2(float f5, boolean n3) {
        CharSequence charSequence;
        float f6;
        Typeface typeface;
        CharSequence charSequence2 = this.text2;
        if (charSequence2 == null) {
            return;
        }
        charSequence2 = this.collapsedBounds;
        int n4 = charSequence2.width();
        float f7 = n4;
        Rect rect = this.expandedBounds;
        int n7 = rect.width();
        float f8 = n7;
        float f11 = this.collapsedTextSize2;
        boolean bl2 = CollapsingTextHelper2.isClose(f5, f11);
        float f12 = 1.0f;
        boolean bl3 = false;
        int n8 = 1;
        if (bl2) {
            f5 = this.collapsedTextSize2;
            this.scale2 = f12;
            typeface = this.currentTypeface2;
            rect = this.collapsedTypeface2;
            if (typeface != rect) {
                this.currentTypeface2 = rect;
                n3 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f6 = 0.0f;
                typeface = null;
            }
        } else {
            float f14;
            float f15;
            int n10;
            f11 = this.expandedTextSize2;
            Typeface typeface2 = this.currentTypeface2;
            Typeface typeface3 = this.expandedTypeface2;
            if (typeface2 != typeface3) {
                this.currentTypeface2 = typeface3;
                n10 = 1;
                f15 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f15 = 0.0f;
                typeface2 = null;
            }
            boolean bl4 = CollapsingTextHelper2.isClose(f5, f11);
            if (bl4) {
                this.scale2 = f12;
            } else {
                f14 = this.expandedTextSize2;
                this.scale2 = f5 /= f14;
            }
            f5 = this.collapsedTextSize2;
            f14 = this.expandedTextSize2;
            f5 /= f14;
            f14 = f8 * f5;
            f7 = n3 == 0 && (n3 = (int)(f14 == f7 ? 0 : (f14 > f7 ? 1 : -1))) > 0 ? (f5 = Math.min(f7 / f5, f8)) : f8;
            f5 = f11;
            n3 = n10;
            f6 = f15;
        }
        f8 = 0.0f;
        rect = null;
        float f16 = f7 - 0.0f;
        n7 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
        if (n7 > 0) {
            f8 = this.currentTextSize2;
            float f17 = f8 - f5;
            n7 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
            if (n7 == 0 && (n7 = (int)(this.boundsChanged ? 1 : 0)) == 0 && n3 == 0) {
                n3 = 0;
                f6 = 0.0f;
                typeface = null;
            } else {
                n3 = 1;
                f6 = Float.MIN_VALUE;
            }
            this.currentTextSize2 = f5;
            this.boundsChanged = false;
        }
        if ((charSequence = this.textToDraw2) == null || n3 != 0) {
            boolean bl5;
            charSequence = this.textPaint2;
            f6 = this.currentTextSize2;
            charSequence.setTextSize(f6);
            charSequence = this.textPaint2;
            typeface = this.currentTypeface2;
            charSequence.setTypeface(typeface);
            charSequence = this.textPaint2;
            f6 = this.scale2;
            n3 = (int)(f6 == f12 ? 0 : (f6 > f12 ? 1 : -1));
            if (n3 != 0) {
                bl3 = true;
            }
            charSequence.setLinearText(bl3);
            charSequence = this.text2;
            this.isRtl = bl5 = this.calculateIsRtl(charSequence);
            bl5 = this.shouldDrawMultiline2();
            if (bl5) {
                n8 = this.maxLines2;
            }
            bl5 = this.isRtl;
            charSequence = this.createStaticLayout2(n8, f7, bl5);
            this.textLayout2 = charSequence;
            this.textToDraw2 = charSequence = charSequence.getText();
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
        if ((bitmap = this.expandedTitleTexture2) != null) {
            bitmap.recycle();
            this.expandedTitleTexture2 = null;
        }
    }

    private StaticLayout createStaticLayout(int n3, float f5, boolean bl2) {
        CharSequence charSequence = this.text;
        TextPaint textPaint = this.textPaint;
        int n4 = (int)f5;
        StaticLayoutBuilderCompat staticLayoutBuilderCompat = StaticLayoutBuilderCompat.obtain(charSequence, textPaint, n4);
        charSequence = TextUtils.TruncateAt.END;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setEllipsize((TextUtils.TruncateAt)charSequence);
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setIsRtl(bl2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setAlignment(alignment);
        bl2 = false;
        float f6 = 0.0f;
        alignment = null;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setIncludePad(false);
        Object object = staticLayoutBuilderCompat.setMaxLines(n3);
        f5 = this.lineSpacingAdd;
        f6 = this.lineSpacingMultiplier;
        object = ((StaticLayoutBuilderCompat)object).setLineSpacing(f5, f6);
        n4 = this.hyphenationFrequency;
        object = ((StaticLayoutBuilderCompat)object).setHyphenationFrequency(n4);
        try {
            object = ((StaticLayoutBuilderCompat)object).build();
        }
        catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException) {
            staticLayoutBuilderCompat$StaticLayoutBuilderCompatException.getCause().getMessage();
            n3 = 0;
            object = null;
        }
        object.getClass();
        return object;
    }

    private StaticLayout createStaticLayout2(int n3, float f5, boolean bl2) {
        CharSequence charSequence = this.text2;
        TextPaint textPaint = this.textPaint2;
        int n4 = (int)f5;
        StaticLayoutBuilderCompat staticLayoutBuilderCompat = StaticLayoutBuilderCompat.obtain(charSequence, textPaint, n4);
        charSequence = TextUtils.TruncateAt.END;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setEllipsize((TextUtils.TruncateAt)charSequence);
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setIsRtl(bl2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setAlignment(alignment);
        bl2 = false;
        float f6 = 0.0f;
        alignment = null;
        staticLayoutBuilderCompat = staticLayoutBuilderCompat.setIncludePad(false);
        Object object = staticLayoutBuilderCompat.setMaxLines(n3);
        f5 = this.lineSpacingAdd2;
        f6 = this.lineSpacingMultiplier2;
        object = ((StaticLayoutBuilderCompat)object).setLineSpacing(f5, f6);
        n4 = this.hyphenationFrequency2;
        object = ((StaticLayoutBuilderCompat)object).setHyphenationFrequency(n4);
        try {
            object = ((StaticLayoutBuilderCompat)object).build();
        }
        catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException) {
            staticLayoutBuilderCompat$StaticLayoutBuilderCompatException.getCause().getMessage();
            n3 = 0;
            object = null;
        }
        object.getClass();
        return object;
    }

    private void drawMultilineTransition(Canvas canvas, float f5, float f6) {
        TextPaint textPaint = this.textPaint;
        int n3 = textPaint.getAlpha();
        canvas.translate(f5, f6);
        Object object = this.textPaint;
        f6 = this.expandedTextBlend;
        float f7 = n3;
        int n4 = (int)(f6 * f7);
        object.setAlpha(n4);
        this.textLayout.draw(canvas);
        object = this.textPaint;
        n4 = (int)(this.collapsedTextBlend * f7);
        object.setAlpha(n4);
        object = this.textLayout;
        n4 = 0;
        f6 = 0.0f;
        int n7 = object.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed;
        int n8 = charSequence.length();
        float f8 = n7;
        TextPaint textPaint2 = this.textPaint;
        Object object2 = canvas;
        canvas.drawText(charSequence, 0, n8, 0.0f, f8, (Paint)textPaint2);
        n7 = (int)(this.fadeModeEnabled ? 1 : 0);
        if (n7 == 0) {
            object = this.textToDrawCollapsed.toString().trim();
            boolean n10 = ((String)object).endsWith((String)(object2 = ELLIPSIS_NORMAL));
            if (n10) {
                int n14 = ((String)object).length() + -1;
                object = ((String)object).substring(0, n14);
            }
            Object object3 = object;
            this.textPaint.setAlpha(n3);
            object = this.textLayout;
            n7 = object.getLineEnd(0);
            n4 = ((String)object3).length();
            int n15 = Math.min(n7, n4);
            TextPaint textPaint3 = this.textPaint;
            textPaint2 = null;
            canvas.drawText((String)object3, 0, n15, 0.0f, f8, (Paint)textPaint3);
        }
    }

    private void drawMultilineTransition2(Canvas canvas, float f5, float f6) {
        TextPaint textPaint = this.textPaint2;
        int n3 = textPaint.getAlpha();
        canvas.translate(f5, f6);
        Object object = this.textPaint2;
        f6 = this.expandedTextBlend2;
        float f7 = n3;
        int n4 = (int)(f6 * f7);
        object.setAlpha(n4);
        this.textLayout2.draw(canvas);
        object = this.textPaint2;
        n4 = (int)(this.collapsedTextBlend2 * f7);
        object.setAlpha(n4);
        object = this.textLayout2;
        n4 = 0;
        f6 = 0.0f;
        int n7 = object.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed2;
        int n8 = charSequence.length();
        float f8 = n7;
        TextPaint textPaint2 = this.textPaint2;
        Object object2 = canvas;
        canvas.drawText(charSequence, 0, n8, 0.0f, f8, (Paint)textPaint2);
        n7 = (int)(this.fadeModeEnabled ? 1 : 0);
        if (n7 == 0) {
            object = this.textToDrawCollapsed2.toString().trim();
            boolean n10 = ((String)object).endsWith((String)(object2 = ELLIPSIS_NORMAL));
            if (n10) {
                int n14 = ((String)object).length() + -1;
                object = ((String)object).substring(0, n14);
            }
            Object object3 = object;
            this.textPaint2.setAlpha(n3);
            object = this.textLayout2;
            n7 = object.getLineEnd(0);
            n4 = ((String)object3).length();
            int n15 = Math.min(n7, n4);
            TextPaint textPaint3 = this.textPaint2;
            textPaint2 = null;
            canvas.drawText((String)object3, 0, n15, 0.0f, f8, (Paint)textPaint3);
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

    private void ensureExpandedTexture2() {
        int n3;
        Object object = this.expandedTitleTexture2;
        if (object == null && (n3 = (object = this.expandedBounds).isEmpty()) == 0 && (n3 = TextUtils.isEmpty((CharSequence)(object = this.textToDraw2))) == 0) {
            this.calculateOffsets(0.0f);
            object = this.textLayout2;
            n3 = object.getWidth();
            StaticLayout staticLayout = this.textLayout2;
            int n4 = staticLayout.getHeight();
            if (n3 > 0 && n4 > 0) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                this.expandedTitleTexture2 = object = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
                staticLayout = this.expandedTitleTexture2;
                object = new Canvas((Bitmap)staticLayout);
                staticLayout = this.textLayout2;
                staticLayout.draw((Canvas)object);
                object = this.texturePaint2;
                if (object == null) {
                    n4 = 3;
                    object = new Paint(n4);
                    this.texturePaint2 = object;
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

    private float getCollapsedTextLeftBound2(int n3, int n4) {
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
                        float f7 = this.collapsedTextWidth2;
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
                float f8 = this.collapsedTextWidth2;
                f6 -= f8;
            }
            return f6;
        }
        float f11 = n3;
        float f12 = 2.0f;
        f5 = this.collapsedTextWidth2 / f12;
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

    private float getCollapsedTextRightBound2(RectF rectF, int n3, int n4) {
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
                        f6 = this.collapsedTextWidth2;
                        f7 += f6;
                    }
                    return f7;
                }
            }
            if ((n3 = (int)(this.isRtl ? 1 : 0)) != 0) {
                f5 = rectF.left;
                f6 = this.collapsedTextWidth2;
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
        return this.collapsedTextWidth2 / f11 + (f8 /= f11);
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

    private int getCurrentExpandedTextColor2() {
        ColorStateList colorStateList = this.expandedTextColor2;
        return this.getCurrentColor(colorStateList);
    }

    private void getTextPaintCollapsed(TextPaint textPaint) {
        float f5 = this.collapsedTextSize;
        textPaint.setTextSize(f5);
        Typeface typeface = this.collapsedTypeface;
        textPaint.setTypeface(typeface);
        f5 = this.collapsedLetterSpacing;
        textPaint.setLetterSpacing(f5);
    }

    private void getTextPaintCollapsed2(TextPaint textPaint) {
        float f5 = this.collapsedTextSize2;
        textPaint.setTextSize(f5);
        Typeface typeface = this.collapsedTypeface2;
        textPaint.setTypeface(typeface);
        f5 = this.collapsedLetterSpacing2;
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

    private void getTextPaintExpanded2(TextPaint textPaint) {
        float f5 = this.expandedTextSize2;
        textPaint.setTextSize(f5);
        Typeface typeface = this.expandedTypeface2;
        textPaint.setTypeface(typeface);
        f5 = this.expandedLetterSpacing2;
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
            rectF.left = f8 = CollapsingTextHelper2.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            f8 = this.expandedDrawY;
            f11 = this.collapsedDrawY;
            timeInterpolator = this.positionInterpolator;
            rectF.top = f8 = CollapsingTextHelper2.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            f8 = this.expandedBounds.right;
            f11 = this.collapsedBounds.right;
            timeInterpolator = this.positionInterpolator;
            rectF.right = f8 = CollapsingTextHelper2.lerp(f8, f11, f5, timeInterpolator);
            rectF = this.currentBounds;
            Rect rect = this.expandedBounds;
            int n3 = rect.bottom;
            f8 = n3;
            Rect rect2 = this.collapsedBounds;
            int n4 = rect2.bottom;
            f11 = n4;
            timeInterpolator = this.positionInterpolator;
            rectF.bottom = f5 = CollapsingTextHelper2.lerp(f8, f11, f5, timeInterpolator);
        }
    }

    private static boolean isClose(float f5, float f6) {
        float f7 = (f5 = Math.abs(f5 - f6)) - (f6 = 0.001f);
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

    private void setCollapsedTextBlend2(float f5) {
        this.collapsedTextBlend2 = f5;
        View view = this.view;
        view.postInvalidateOnAnimation();
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.collapsedTypeface) != typeface) {
            this.collapsedTypeface = typeface;
            return true;
        }
        return false;
    }

    private boolean setCollapsedTypefaceInternal2(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback2;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.collapsedTypeface2) != typeface) {
            this.collapsedTypeface2 = typeface;
            return true;
        }
        return false;
    }

    private void setExpandedTextBlend(float f5) {
        this.expandedTextBlend = f5;
        View view = this.view;
        view.postInvalidateOnAnimation();
    }

    private void setExpandedTextBlend2(float f5) {
        this.expandedTextBlend2 = f5;
        View view = this.view;
        view.postInvalidateOnAnimation();
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.expandedTypeface) != typeface) {
            this.expandedTypeface = typeface;
            return true;
        }
        return false;
    }

    private boolean setExpandedTypefaceInternal2(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback2;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if ((cancelableFontCallback = this.expandedTypeface2) != typeface) {
            this.expandedTypeface2 = typeface;
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

    private void setInterpolatedTextSize2(float f5) {
        View view;
        float f6;
        float f7;
        this.calculateUsingTextSize2(f5);
        boolean bl2 = USE_SCALING_TEXTURE;
        if (bl2 && (bl2 = (f7 = (f5 = this.scale2) - (f6 = 1.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            view = null;
        }
        this.useTexture = bl2;
        if (bl2) {
            this.ensureExpandedTexture2();
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

    private boolean shouldDrawMultiline2() {
        int n3 = this.maxLines2;
        int n4 = 1;
        if (n3 <= n4 || (n3 = (int)(this.isRtl ? 1 : 0)) && !(n3 = this.fadeModeEnabled) || (n3 = this.useTexture)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public float calculateCollapsedTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        charSequence = this.tmpPaint;
        this.getTextPaintCollapsed((TextPaint)charSequence);
        charSequence = this.tmpPaint;
        CharSequence charSequence2 = this.text;
        int n3 = charSequence2.length();
        return charSequence.measureText(charSequence2, 0, n3);
    }

    public float calculateCollapsedTextWidth2() {
        CharSequence charSequence = this.text2;
        if (charSequence == null) {
            return 0.0f;
        }
        charSequence = this.tmpPaint2;
        this.getTextPaintCollapsed2((TextPaint)charSequence);
        charSequence = this.tmpPaint2;
        CharSequence charSequence2 = this.text2;
        int n3 = charSequence2.length();
        return charSequence.measureText(charSequence2, 0, n3);
    }

    public void draw(Canvas canvas) {
        int n3;
        int n4 = canvas.save();
        CharSequence charSequence = this.textToDraw;
        if (charSequence != null && (n3 = this.drawTitle) != 0) {
            float f5;
            Bitmap bitmap;
            Bitmap bitmap2;
            float f6;
            n3 = this.maxLines;
            int n7 = 1;
            float f7 = Float.MIN_VALUE;
            float f8 = 0.0f;
            Paint paint = null;
            if (n3 > n7) {
                charSequence = this.textLayout;
                n3 = charSequence.getLineStart(0);
                f6 = n3;
            } else {
                charSequence = this.textLayout;
                f6 = charSequence.getLineLeft(0);
            }
            float f11 = this.currentDrawX + f6;
            f6 = this.expandedFirstLineDrawX * 2.0f;
            f11 -= f6;
            charSequence = this.textPaint;
            float f12 = this.currentTextSize;
            charSequence.setTextSize(f12);
            f6 = this.currentDrawX;
            f12 = this.currentDrawY;
            boolean bl2 = this.useTexture;
            if (!bl2 || (bitmap2 = this.expandedTitleTexture) == null) {
                n7 = 0;
                f7 = 0.0f;
                bitmap = null;
            }
            f8 = this.scale;
            float f14 = 1.0f;
            bl2 = f8 == f14 ? 0 : (f8 > f14 ? 1 : -1);
            if (bl2 && !(bl2 = this.fadeModeEnabled)) {
                canvas.scale(f8, f8, f6, f12);
            }
            if (n7 != 0) {
                bitmap = this.expandedTitleTexture;
                paint = this.texturePaint;
                canvas.drawBitmap(bitmap, f6, f12, paint);
                canvas.restoreToCount(n4);
                return;
            }
            n7 = (int)(this.shouldDrawMultiline() ? 1 : 0);
            if (n7 != 0 && ((n7 = (int)(this.fadeModeEnabled ? 1 : 0)) == 0 || (n7 = (int)((f5 = (f7 = this.expandedFraction) - (f8 = this.fadeModeThresholdFraction)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0)) {
                this.drawMultilineTransition(canvas, f11, f12);
            } else {
                canvas.translate(f6, f12);
                charSequence = this.textLayout;
                charSequence.draw(canvas);
            }
            canvas.restoreToCount(n4);
        }
    }

    public void draw2(Canvas canvas) {
        int n3;
        int n4 = canvas.save();
        CharSequence charSequence = this.textToDraw2;
        if (charSequence != null && (n3 = this.drawTitle) != 0) {
            float f5;
            Bitmap bitmap;
            Bitmap bitmap2;
            float f6;
            n3 = this.maxLines2;
            int n7 = 1;
            float f7 = Float.MIN_VALUE;
            float f8 = 0.0f;
            Paint paint = null;
            if (n3 > n7) {
                charSequence = this.textLayout2;
                n3 = charSequence.getLineStart(0);
                f6 = n3;
            } else {
                charSequence = this.textLayout2;
                f6 = charSequence.getLineLeft(0);
            }
            float f11 = this.currentDrawX2 + f6;
            f6 = this.expandedFirstLineDrawX2 * 2.0f;
            f11 -= f6;
            charSequence = this.textPaint2;
            float f12 = this.currentTextSize2;
            charSequence.setTextSize(f12);
            f6 = this.currentDrawX2;
            f12 = this.currentDrawY2;
            boolean bl2 = this.useTexture;
            if (!bl2 || (bitmap2 = this.expandedTitleTexture2) == null) {
                n7 = 0;
                f7 = 0.0f;
                bitmap = null;
            }
            f8 = this.scale2;
            float f14 = 1.0f;
            bl2 = f8 == f14 ? 0 : (f8 > f14 ? 1 : -1);
            if (bl2 && !(bl2 = this.fadeModeEnabled)) {
                canvas.scale(f8, f8, f6, f12);
            }
            if (n7 != 0) {
                bitmap = this.expandedTitleTexture2;
                paint = this.texturePaint2;
                canvas.drawBitmap(bitmap, f6, f12, paint);
                canvas.restoreToCount(n4);
                return;
            }
            n7 = (int)(this.shouldDrawMultiline2() ? 1 : 0);
            if (n7 != 0 && ((n7 = (int)(this.fadeModeEnabled ? 1 : 0)) == 0 || (n7 = (int)((f5 = (f7 = this.expandedFraction) - (f8 = this.fadeModeThresholdFraction)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0)) {
                this.drawMultilineTransition2(canvas, f11, f12);
            } else {
                canvas.translate(f6, f12);
                charSequence = this.textLayout2;
                charSequence.draw(canvas);
            }
            canvas.restoreToCount(n4);
        }
    }

    public void getCollapsedTextActualBounds(RectF rectF, int n3, int n4) {
        float f5;
        float f6;
        float f7;
        boolean bl2;
        CharSequence charSequence = this.text;
        this.isRtl = bl2 = this.calculateIsRtl(charSequence);
        rectF.left = f7 = this.getCollapsedTextLeftBound(n3, n4);
        rectF.top = f7 = (float)this.collapsedBounds.top;
        rectF.right = f6 = this.getCollapsedTextRightBound(rectF, n3, n4);
        f6 = this.collapsedBounds.top;
        rectF.bottom = f5 = this.getCollapsedTextHeight() + f6;
    }

    public void getCollapsedTextActualBounds2(RectF rectF, int n3, int n4) {
        float f5;
        float f6;
        float f7;
        boolean bl2;
        CharSequence charSequence = this.text2;
        this.isRtl = bl2 = this.calculateIsRtl(charSequence);
        rectF.left = f7 = this.getCollapsedTextLeftBound2(n3, n4);
        rectF.top = f7 = (float)this.collapsedBounds.top;
        rectF.right = f6 = this.getCollapsedTextRightBound2(rectF, n3, n4);
        f6 = this.collapsedBounds.top;
        rectF.bottom = f5 = this.getCollapsedTextHeight2() + f6;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public ColorStateList getCollapsedTextColor2() {
        return this.collapsedTextColor2;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintCollapsed(textPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextHeight2() {
        TextPaint textPaint = this.tmpPaint2;
        this.getTextPaintCollapsed2(textPaint);
        return -this.tmpPaint2.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public float getCollapsedTextSize2() {
        return this.collapsedTextSize2;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    public Typeface getCollapsedTypeface2() {
        Typeface typeface = this.collapsedTypeface2;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getCurrentCollapsedTextColor() {
        ColorStateList colorStateList = this.collapsedTextColor;
        return this.getCurrentColor(colorStateList);
    }

    public int getCurrentCollapsedTextColor2() {
        ColorStateList colorStateList = this.collapsedTextColor2;
        return this.getCurrentColor(colorStateList);
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public int getExpandedLineCount2() {
        return this.expandedLineCount2;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public ColorStateList getExpandedTextColor2() {
        return this.expandedTextColor2;
    }

    public float getExpandedTextFullHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintExpanded(textPaint);
        float f5 = -this.tmpPaint.ascent();
        return this.tmpPaint.descent() + f5;
    }

    public float getExpandedTextFullHeight2() {
        TextPaint textPaint = this.tmpPaint2;
        this.getTextPaintExpanded2(textPaint);
        float f5 = -this.tmpPaint2.ascent();
        return this.tmpPaint2.descent() + f5;
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        TextPaint textPaint = this.tmpPaint;
        this.getTextPaintExpanded(textPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextHeight2() {
        TextPaint textPaint = this.tmpPaint2;
        this.getTextPaintExpanded2(textPaint);
        return -this.tmpPaint2.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public float getExpandedTextSize2() {
        return this.expandedTextSize2;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    public Typeface getExpandedTypeface2() {
        Typeface typeface = this.expandedTypeface2;
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

    public int getHyphenationFrequency2() {
        return this.hyphenationFrequency2;
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

    public int getLineCount2() {
        int n3;
        StaticLayout staticLayout = this.textLayout2;
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

    public float getLineSpacingAdd2() {
        return this.textLayout2.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public float getLineSpacingMultiplier2() {
        return this.textLayout2.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public int getMaxLines2() {
        return this.maxLines2;
    }

    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public CharSequence getText() {
        return this.text;
    }

    public CharSequence getText2() {
        return this.text2;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final boolean isStateful() {
        boolean bl2;
        ColorStateList colorStateList = this.collapsedTextColor;
        if (colorStateList != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.collapsedTextColor2) != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.expandedTextColor) != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.expandedTextColor2) != null && (bl2 = colorStateList.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    public void onBoundsChanged() {
        Rect rect = this.collapsedBounds;
        int n3 = rect.width();
        if (n3 > 0 && (n3 = (rect = this.collapsedBounds).height()) > 0 && (n3 = (rect = this.expandedBounds).width()) > 0 && (n3 = (rect = this.expandedBounds).height()) > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            rect = null;
        }
        this.drawTitle = n3;
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

    public void setCollapsedBounds(int n3, int n4, int n7, int n8) {
        Rect rect = this.collapsedBounds;
        boolean bl2 = CollapsingTextHelper2.rectEquals(rect, n3, n4, n7, n8);
        if (!bl2) {
            rect = this.collapsedBounds;
            rect.set(n3, n4, n7, n8);
            n3 = 1;
            this.boundsChanged = n3;
            this.onBoundsChanged();
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
        object = new CollapsingTextHelper2$1(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.collapsedFontCallback = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.collapsedFontCallback;
        textAppearance.getFontAsync((Context)object2, (TextAppearanceFontCallback)object);
        this.recalculate();
    }

    public void setCollapsedTextAppearance2(int n3) {
        Object object = this.view.getContext();
        TextAppearance textAppearance = new TextAppearance((Context)object, n3);
        Object object2 = textAppearance.getTextColor();
        if (object2 != null) {
            object2 = textAppearance.getTextColor();
            this.collapsedTextColor2 = object2;
        }
        float f5 = textAppearance.getTextSize();
        object = null;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 != 0) {
            this.collapsedTextSize2 = f5 = textAppearance.getTextSize();
        }
        if ((object2 = textAppearance.shadowColor) != null) {
            this.collapsedShadowColor2 = object2;
        }
        this.collapsedShadowDx2 = f5 = textAppearance.shadowDx;
        this.collapsedShadowDy2 = f5 = textAppearance.shadowDy;
        this.collapsedShadowRadius2 = f5 = textAppearance.shadowRadius;
        this.collapsedLetterSpacing2 = f5 = textAppearance.letterSpacing;
        object2 = this.collapsedFontCallback2;
        if (object2 != null) {
            ((CancelableFontCallback)object2).cancel();
        }
        object = new CollapsingTextHelper2$2(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.collapsedFontCallback2 = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.collapsedFontCallback2;
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

    public void setCollapsedTextColor2(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.collapsedTextColor2;
        if (colorStateList2 != colorStateList) {
            this.collapsedTextColor2 = colorStateList;
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

    public void setCollapsedTextSize2(float f5) {
        float f6 = this.collapsedTextSize2;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.collapsedTextSize2 = f5;
            this.recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal(typeface);
        if (bl2) {
            this.recalculate();
        }
    }

    public void setCollapsedTypeface2(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal2(typeface);
        if (bl2) {
            this.recalculate();
        }
    }

    public void setCurrentOffsetY(int n3) {
        this.currentOffsetY = n3;
    }

    public void setExpandedBounds(int n3, int n4, int n7, int n8) {
        Rect rect = this.expandedBounds;
        boolean bl2 = CollapsingTextHelper2.rectEquals(rect, n3, n4, n7, n8);
        if (!bl2) {
            rect = this.expandedBounds;
            rect.set(n3, n4, n7, n8);
            n3 = 1;
            this.boundsChanged = n3;
            this.onBoundsChanged();
        }
    }

    public void setExpandedBounds(Rect rect) {
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        this.setExpandedBounds(n3, n4, n7, n8);
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
        object = new CollapsingTextHelper2$3(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.expandedFontCallback = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.expandedFontCallback;
        textAppearance.getFontAsync((Context)object2, (TextAppearanceFontCallback)object);
        this.recalculate();
    }

    public void setExpandedTextAppearance2(int n3) {
        Object object = this.view.getContext();
        TextAppearance textAppearance = new TextAppearance((Context)object, n3);
        Object object2 = textAppearance.getTextColor();
        if (object2 != null) {
            object2 = textAppearance.getTextColor();
            this.expandedTextColor2 = object2;
        }
        float f5 = textAppearance.getTextSize();
        object = null;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 != 0) {
            this.expandedTextSize2 = f5 = textAppearance.getTextSize();
        }
        if ((object2 = textAppearance.shadowColor) != null) {
            this.expandedShadowColor2 = object2;
        }
        this.expandedShadowDx2 = f5 = textAppearance.shadowDx;
        this.expandedShadowDy2 = f5 = textAppearance.shadowDy;
        this.expandedShadowRadius2 = f5 = textAppearance.shadowRadius;
        this.expandedLetterSpacing2 = f5 = textAppearance.letterSpacing;
        object2 = this.expandedFontCallback2;
        if (object2 != null) {
            ((CancelableFontCallback)object2).cancel();
        }
        object = new CollapsingTextHelper2$4(this);
        Typeface typeface = textAppearance.getFallbackFont();
        this.expandedFontCallback2 = object2 = new CancelableFontCallback((CancelableFontCallback$ApplyFont)object, typeface);
        object2 = this.view.getContext();
        object = this.expandedFontCallback2;
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

    public void setExpandedTextColor2(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.expandedTextColor2;
        if (colorStateList2 != colorStateList) {
            this.expandedTextColor2 = colorStateList;
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

    public void setExpandedTextSize2(float f5) {
        float f6 = this.expandedTextSize2;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.expandedTextSize2 = f5;
            this.recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        boolean bl2 = this.setExpandedTypefaceInternal(typeface);
        if (bl2) {
            this.recalculate();
        }
    }

    public void setExpandedTypeface2(Typeface typeface) {
        boolean bl2 = this.setExpandedTypefaceInternal2(typeface);
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

    public void setHyphenationFrequency2(int n3) {
        this.hyphenationFrequency2 = n3;
    }

    public void setLineSpacingAdd(float f5) {
        this.lineSpacingAdd = f5;
    }

    public void setLineSpacingAdd2(float f5) {
        this.lineSpacingAdd2 = f5;
    }

    public void setLineSpacingMultiplier(float f5) {
        this.lineSpacingMultiplier = f5;
    }

    public void setLineSpacingMultiplier2(float f5) {
        this.lineSpacingMultiplier2 = f5;
    }

    public void setMaxLines(int n3) {
        int n4 = this.maxLines;
        if (n3 != n4) {
            this.maxLines = n3;
            this.clearTexture();
            this.recalculate();
        }
    }

    public void setMaxLines2(int n3) {
        int n4 = this.maxLines2;
        if (n3 != n4) {
            this.maxLines2 = n3;
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

    public void setText2(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean bl2;
        if (charSequence == null || !(bl2 = TextUtils.equals((CharSequence)(charSequence2 = this.text2), (CharSequence)charSequence))) {
            this.text2 = charSequence;
            charSequence = null;
            this.textToDraw2 = null;
            this.clearTexture();
            this.recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        this.recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal(typeface);
        boolean bl3 = this.setExpandedTypefaceInternal(typeface);
        if (bl2 || bl3) {
            this.recalculate();
        }
    }

    public void setTypefaces2(Typeface typeface) {
        boolean bl2 = this.setCollapsedTypefaceInternal2(typeface);
        boolean bl3 = this.setExpandedTypefaceInternal2(typeface);
        if (bl2 || bl3) {
            this.recalculate();
        }
    }
}

