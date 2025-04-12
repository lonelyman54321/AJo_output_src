/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable$1;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

public class BadgeDrawable
extends Drawable
implements TextDrawableHelper$TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = 254;
    static final int BADGE_RADIUS_NOT_SPECIFIED = 255;
    public static final int BOTTOM_END = 0x800055;
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "\u2026";
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 0x800033;
    private WeakReference anchorViewRef;
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final WeakReference contextRef;
    private float cornerRadius;
    private WeakReference customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final MaterialShapeDrawable shapeDrawable;
    private final BadgeState state;
    private final TextDrawableHelper textDrawableHelper;

    static {
        DEFAULT_STYLE = R$style.Widget_MaterialComponents_Badge;
        DEFAULT_THEME_ATTR = R$attr.badgeStyle;
    }

    private BadgeDrawable(Context object, int n3, int n4, int n7, BadgeState$State badgeState$State) {
        MaterialShapeDrawable materialShapeDrawable;
        Object object2 = new WeakReference(object);
        this.contextRef = object2;
        ThemeEnforcement.checkMaterialTheme(object);
        object2 = new Rect();
        this.badgeBounds = object2;
        super(this);
        this.textDrawableHelper = object2;
        object2 = ((TextDrawableHelper)object2).getTextPaint();
        Paint.Align align = Paint.Align.CENTER;
        object2.setTextAlign(align);
        this.state = object2 = new BadgeState((Context)object, n3, n4, n7, badgeState$State);
        n4 = (int)(this.hasBadgeContent() ? 1 : 0);
        n4 = n4 != 0 ? ((BadgeState)object2).getBadgeWithTextShapeAppearanceResId() : ((BadgeState)object2).getBadgeShapeAppearanceResId();
        n7 = (int)(this.hasBadgeContent() ? 1 : 0);
        n7 = n7 != 0 ? ((BadgeState)object2).getBadgeWithTextShapeAppearanceOverlayResId() : ((BadgeState)object2).getBadgeShapeAppearanceOverlayResId();
        object = ShapeAppearanceModel.builder(object, n4, n7).build();
        this.shapeDrawable = materialShapeDrawable = new MaterialShapeDrawable((ShapeAppearanceModel)object);
        this.restoreState();
    }

    private void autoAdjustWithinGrandparentBounds(View view) {
        float f5;
        float f6;
        float f7;
        int n3;
        int n4;
        float f8;
        float f11;
        float f12;
        FrameLayout frameLayout = this.getCustomBadgeParent();
        if (frameLayout == null) {
            frameLayout = view.getParent();
            boolean bl2 = frameLayout instanceof View;
            if (!bl2) {
                return;
            }
            f12 = view.getY();
            f11 = view.getX();
            view = (View)view.getParent();
            frameLayout = view;
            f8 = f12;
        } else {
            n4 = this.isAnchorViewWrappedInCompatParent();
            if (n4 != 0) {
                view = frameLayout.getParent();
                n4 = view instanceof View;
                if (n4 == 0) {
                    return;
                }
                f8 = frameLayout.getY();
                f11 = frameLayout.getX();
                frameLayout = (View)frameLayout.getParent();
            } else {
                n4 = 0;
                f8 = 0.0f;
                view = null;
                n3 = 0;
                f11 = 0.0f;
            }
        }
        float f14 = this.getTopCutOff((View)frameLayout, f8);
        float f15 = this.getLeftCutOff((View)frameLayout, f11);
        f8 = this.getBottomCutOff((View)frameLayout, f8);
        f12 = this.getRightCutoff((View)frameLayout, f11);
        float f16 = f14 - 0.0f;
        n3 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (n3 < 0) {
            f11 = this.badgeCenterY;
            this.badgeCenterY = f14 = Math.abs(f14) + f11;
        }
        if ((n3 = (int)((f7 = f15 - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0) {
            f11 = this.badgeCenterX;
            this.badgeCenterX = f14 = Math.abs(f15) + f11;
        }
        if ((n3 = (int)((f6 = f8 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
            f11 = this.badgeCenterY;
            f8 = Math.abs(f8);
            this.badgeCenterY = f11 -= f8;
        }
        if ((n4 = (f5 = f12 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
            f8 = this.badgeCenterX;
            f12 = Math.abs(f12);
            this.badgeCenterX = f8 -= f12;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void calculateCenterAndBounds(Rect var1_1, View var2_2) {
        var3_3 = this.hasBadgeContent();
        if (var3_3 != 0) {
            var4_4 = this.state;
            var5_5 = var4_4.badgeWithTextRadius;
        } else {
            var4_4 = this.state;
            var5_5 = var4_4.badgeRadius;
        }
        this.cornerRadius = var5_5;
        var6_6 = -1.0f;
        var7_7 = 0x40000000;
        var8_8 = 2.0f;
        var9_9 = var5_5 == var6_6 ? 0 : (var5_5 > var6_6 ? 1 : -1);
        if (var9_9 != false) {
            this.halfBadgeWidth = var5_5;
            this.halfBadgeHeight = var5_5;
        } else {
            var3_3 = this.hasBadgeContent();
            if (var3_3 != 0) {
                var4_4 = this.state;
                var5_5 = var4_4.badgeWithTextWidth;
lbl21:
                // 2 sources

                while (true) {
                    var5_5 /= var8_8;
                    break;
                }
            } else {
                var4_4 = this.state;
                var5_5 = var4_4.badgeWidth;
                ** continue;
            }
            this.halfBadgeWidth = var5_5 = (float)Math.round(var5_5);
            var3_3 = (int)this.hasBadgeContent();
            if (var3_3 != 0) {
                var4_4 = this.state;
                var5_5 = var4_4.badgeWithTextHeight;
lbl32:
                // 2 sources

                while (true) {
                    break;
                }
            } else {
                var4_4 = this.state;
                var5_5 = var4_4.badgeHeight;
                ** continue;
            }
            var3_3 = Math.round(var5_5 /= var8_8);
            this.halfBadgeHeight = var5_5 = (float)var3_3;
        }
        var3_3 = this.hasBadgeContent();
        if (var3_3 != 0) {
            var4_4 = this.getBadgeContent();
            var6_6 = this.halfBadgeWidth;
            var10_10 = this.textDrawableHelper.getTextWidth((String)var4_4) / var8_8;
            var11_11 = this.state;
            var12_12 = var11_11.getBadgeHorizontalPadding();
            var13_13 = var12_12;
            this.halfBadgeWidth = var6_6 = Math.max(var6_6, var10_10 += var13_13);
            var6_6 = this.halfBadgeHeight;
            var14_14 = this.textDrawableHelper;
            var5_5 = var14_14.getTextHeight((String)var4_4) / var8_8;
            var15_15 = this.state;
            var7_7 = var15_15.getBadgeVerticalPadding();
            var8_8 = var7_7;
            var5_5 += var8_8;
            this.halfBadgeHeight = var5_5 = Math.max(var6_6, var5_5);
            var6_6 = this.halfBadgeWidth;
            this.halfBadgeWidth = var5_5 = Math.max(var6_6, var5_5);
        }
        var3_3 = this.getTotalVerticalOffsetForState();
        var16_16 = this.state;
        var9_9 = var16_16.getBadgeGravity();
        var7_7 = 8388691;
        var8_8 = 1.175506E-38f;
        if (var9_9 == var7_7) ** GOTO lbl-1000
        var17_17 = 0x800055;
        var10_10 = 1.1755063E-38f;
        if (var9_9 != var17_17) {
            var9_9 = var1_1.top + var3_3;
            this.badgeCenterY = var5_5 = (float)var9_9;
        } else lbl-1000:
        // 2 sources

        {
            var9_9 = var1_1.bottom - var3_3;
            this.badgeCenterY = var5_5 = (float)var9_9;
        }
        var3_3 = this.getTotalHorizontalOffsetForState();
        var16_16 = this.state;
        var9_9 = var16_16.getBadgeGravity();
        var17_17 = 0x800033;
        var10_10 = 1.1755015E-38f;
        if (var9_9 != var17_17 && var9_9 != var7_7) {
            var16_16 = ViewCompat.a;
            var9_9 = var2_2.getLayoutDirection();
            if (var9_9 == false) {
                var18_18 = var1_1.right;
                var19_19 = var18_18;
                var6_6 = this.halfBadgeWidth;
                var19_19 += var6_6;
                var5_5 = var3_3;
                var19_19 -= var5_5;
            } else {
                var18_18 = var1_1.left;
                var19_19 = var18_18;
                var6_6 = this.halfBadgeWidth;
                var19_19 -= var6_6;
                var5_5 = var3_3;
                var19_19 += var5_5;
            }
            this.badgeCenterX = var19_19;
        } else {
            var16_16 = ViewCompat.a;
            var9_9 = var2_2.getLayoutDirection();
            if (var9_9 == false) {
                var18_18 = var1_1.left;
                var19_20 = var18_18;
                var6_6 = this.halfBadgeWidth;
                var19_20 -= var6_6;
                var5_5 = var3_3;
                var19_20 += var5_5;
            } else {
                var18_18 = var1_1.right;
                var19_20 = var18_18;
                var6_6 = this.halfBadgeWidth;
                var19_20 += var6_6;
                var5_5 = var3_3;
                var19_20 -= var5_5;
            }
            this.badgeCenterX = var19_20;
        }
        var1_1 = this.state;
        var18_18 = (int)var1_1.isAutoAdjustedToGrandparentBounds();
        if (var18_18 != 0) {
            this.autoAdjustWithinGrandparentBounds(var2_2);
        }
    }

    public static BadgeDrawable create(Context context) {
        int n3 = DEFAULT_THEME_ATTR;
        int n4 = DEFAULT_STYLE;
        BadgeDrawable badgeDrawable = new BadgeDrawable(context, 0, n3, n4, null);
        return badgeDrawable;
    }

    public static BadgeDrawable createFromResource(Context context, int n3) {
        int n4 = DEFAULT_THEME_ATTR;
        int n7 = DEFAULT_STYLE;
        BadgeDrawable badgeDrawable = new BadgeDrawable(context, n3, n4, n7, null);
        return badgeDrawable;
    }

    public static BadgeDrawable createFromSavedState(Context context, BadgeState$State badgeState$State) {
        int n3 = DEFAULT_THEME_ATTR;
        int n4 = DEFAULT_STYLE;
        BadgeDrawable badgeDrawable = new BadgeDrawable(context, 0, n3, n4, badgeState$State);
        return badgeDrawable;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void drawBadgeContent(Canvas canvas) {
        String string2 = this.getBadgeContent();
        if (string2 != null) {
            Rect rect = new Rect();
            TextPaint textPaint = this.textDrawableHelper.getTextPaint();
            int n3 = string2.length();
            textPaint.getTextBounds(string2, 0, n3, rect);
            float f5 = this.badgeCenterY;
            float f6 = rect.exactCenterY();
            f5 -= f6;
            f6 = this.badgeCenterX;
            int n4 = rect.bottom;
            n4 = n4 <= 0 ? (int)f5 : Math.round(f5);
            float f7 = n4;
            textPaint = this.textDrawableHelper.getTextPaint();
            canvas.drawText(string2, f6, f7, (Paint)textPaint);
        }
    }

    private String getBadgeContent() {
        boolean bl2 = this.hasText();
        if (bl2) {
            return this.getTextBadgeText();
        }
        bl2 = this.hasNumber();
        if (bl2) {
            return this.getNumberBadgeText();
        }
        return null;
    }

    private float getBottomCutOff(View view, float f5) {
        float f6;
        ViewParent viewParent = view.getParent();
        int n3 = viewParent instanceof View;
        if (n3 != 0) {
            viewParent = (View)view.getParent();
            f6 = this.badgeCenterY;
            float f7 = this.halfBadgeHeight;
            f6 += f7;
            n3 = viewParent.getHeight();
            float f8 = n3;
            float f11 = view.getY();
            f6 = f6 - (f8 -= f11) + f5;
        } else {
            f6 = 0.0f;
        }
        return f6;
    }

    private CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    private float getLeftCutOff(View view, float f5) {
        float f6 = this.badgeCenterX;
        float f7 = this.halfBadgeWidth;
        return view.getX() + (f6 -= f7) + f5;
    }

    private String getNumberBadgeText() {
        int n3 = this.maxBadgeNumber;
        int n4 = -2;
        if (n3 != n4 && (n3 = this.getNumber()) > (n4 = this.maxBadgeNumber)) {
            Object object = (Context)this.contextRef.get();
            if (object == null) {
                return "";
            }
            Locale locale = this.state.getNumberLocale();
            int n7 = R$string.mtrl_exceed_max_badge_number_suffix;
            object = object.getString(n7);
            Integer n8 = this.maxBadgeNumber;
            Object[] objectArray = new Object[]{n8, DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX};
            return String.format(locale, (String)object, objectArray);
        }
        NumberFormat numberFormat = NumberFormat.getInstance(this.state.getNumberLocale());
        long l2 = this.getNumber();
        return numberFormat.format(l2);
    }

    private String getNumberContentDescription() {
        int n3 = 1;
        BadgeState badgeState = this.state;
        int n4 = badgeState.getContentDescriptionQuantityStrings();
        int n7 = 0;
        if (n4 != 0) {
            badgeState = (Context)this.contextRef.get();
            if (badgeState == null) {
                return null;
            }
            n7 = this.maxBadgeNumber;
            int n8 = -2;
            if (n7 != n8 && (n7 = this.getNumber()) > (n8 = this.maxBadgeNumber)) {
                n7 = this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource();
                Integer n10 = this.maxBadgeNumber;
                Object[] objectArray = new Object[n3];
                objectArray[0] = n10;
                return badgeState.getString(n7, objectArray);
            }
            badgeState = badgeState.getResources();
            n7 = this.state.getContentDescriptionQuantityStrings();
            n8 = this.getNumber();
            Integer n14 = this.getNumber();
            Object[] objectArray = new Object[n3];
            objectArray[0] = n14;
            return badgeState.getQuantityString(n7, n8, objectArray);
        }
        return null;
    }

    private float getRightCutoff(View view, float f5) {
        float f6;
        ViewParent viewParent = view.getParent();
        int n3 = viewParent instanceof View;
        if (n3 != 0) {
            viewParent = (View)view.getParent();
            f6 = this.badgeCenterX;
            float f7 = this.halfBadgeWidth;
            f6 += f7;
            n3 = viewParent.getWidth();
            float f8 = n3;
            float f11 = view.getX();
            f6 = f6 - (f8 -= f11) + f5;
        } else {
            f6 = 0.0f;
        }
        return f6;
    }

    private String getTextBadgeText() {
        int n3;
        int n4 = 1;
        String string2 = this.getText();
        int n7 = this.getMaxCharacterCount();
        if (n7 == (n3 = -2)) {
            return string2;
        }
        if (string2 != null && (n3 = string2.length()) > n7) {
            Object[] objectArray = (Object[])this.contextRef.get();
            if (objectArray == null) {
                return "";
            }
            string2 = string2.substring(0, n7 -= n4);
            n7 = R$string.m3_exceed_max_badge_text_suffix;
            String string3 = objectArray.getString(n7);
            objectArray = new Object[2];
            objectArray[0] = string2;
            objectArray[n4] = DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX;
            return String.format(string3, objectArray);
        }
        return string2;
    }

    private CharSequence getTextContentDescription() {
        CharSequence charSequence = this.state.getContentDescriptionForText();
        if (charSequence != null) {
            return charSequence;
        }
        return this.getText();
    }

    private float getTopCutOff(View view, float f5) {
        float f6 = this.badgeCenterY;
        float f7 = this.halfBadgeHeight;
        return view.getY() + (f6 -= f7) + f5;
    }

    private int getTotalHorizontalOffsetForState() {
        int n3 = this.hasBadgeContent();
        if (n3 != 0) {
            BadgeState badgeState = this.state;
            n3 = badgeState.getHorizontalOffsetWithText();
        } else {
            BadgeState badgeState = this.state;
            n3 = badgeState.getHorizontalOffsetWithoutText();
        }
        BadgeState badgeState = this.state;
        int n4 = badgeState.offsetAlignmentMode;
        int n7 = 1;
        if (n4 == n7) {
            n4 = (int)(this.hasBadgeContent() ? 1 : 0);
            if (n4 != 0) {
                badgeState = this.state;
                n4 = badgeState.horizontalInsetWithText;
            } else {
                badgeState = this.state;
                n4 = badgeState.horizontalInset;
            }
            n3 += n4;
        }
        return this.state.getAdditionalHorizontalOffset() + n3;
    }

    private int getTotalVerticalOffsetForState() {
        float f5;
        BadgeState badgeState;
        BadgeState badgeState2 = this.state;
        int n3 = badgeState2.getVerticalOffsetWithoutText();
        int n4 = this.hasBadgeContent();
        if (n4 != 0) {
            badgeState2 = this.state;
            n3 = badgeState2.getVerticalOffsetWithText();
            badgeState = (Context)this.contextRef.get();
            if (badgeState != null) {
                f5 = MaterialResources.getFontScale((Context)badgeState);
                float f6 = 1.0f;
                f5 -= f6;
                float f7 = 0.3f;
                f5 = AnimationUtils.lerp(0.0f, f6, f7, f6, f5);
                BadgeState badgeState3 = this.state;
                int n7 = badgeState3.getLargeFontVerticalOffsetAdjustment();
                n7 = n3 - n7;
                n3 = AnimationUtils.lerp(n3, n7, f5);
            }
        }
        badgeState = this.state;
        n4 = badgeState.offsetAlignmentMode;
        if (n4 == 0) {
            f5 = this.halfBadgeHeight;
            n4 = Math.round(f5);
            n3 -= n4;
        }
        return this.state.getAdditionalVerticalOffset() + n3;
    }

    private boolean hasBadgeContent() {
        boolean bl2 = this.hasText();
        bl2 = bl2 || (bl2 = this.hasNumber());
        return bl2;
    }

    private boolean isAnchorViewWrappedInCompatParent() {
        int n3;
        int n4;
        FrameLayout frameLayout = this.getCustomBadgeParent();
        if (frameLayout != null && (n4 = frameLayout.getId()) == (n3 = R$id.mtrl_anchor_parent)) {
            n4 = 1;
        } else {
            n4 = 0;
            frameLayout = null;
        }
        return n4 != 0;
    }

    private void onAlphaUpdated() {
        TextPaint textPaint = this.textDrawableHelper.getTextPaint();
        int n3 = this.getAlpha();
        textPaint.setAlpha(n3);
        this.invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        int n3 = this.state.getBackgroundColor();
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        Object object = this.shapeDrawable.getFillColor();
        if (object != colorStateList) {
            object = this.shapeDrawable;
            ((MaterialShapeDrawable)object).setFillColor(colorStateList);
            this.invalidateSelf();
        }
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        this.onBadgeShapeAppearanceUpdated();
        this.updateCenterAndBounds();
        this.invalidateSelf();
    }

    private void onBadgeGravityUpdated() {
        WeakReference weakReference = this.anchorViewRef;
        if (weakReference != null && (weakReference = weakReference.get()) != null) {
            weakReference = (View)this.anchorViewRef.get();
            WeakReference weakReference2 = this.customBadgeParentRef;
            weakReference2 = weakReference2 != null ? (FrameLayout)weakReference2.get() : null;
            this.updateBadgeCoordinates((View)weakReference, (FrameLayout)weakReference2);
        }
    }

    private void onBadgeShapeAppearanceUpdated() {
        Object object = (Context)this.contextRef.get();
        if (object == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        int n3 = this.hasBadgeContent();
        if (n3 != 0) {
            BadgeState badgeState = this.state;
            n3 = badgeState.getBadgeWithTextShapeAppearanceResId();
        } else {
            BadgeState badgeState = this.state;
            n3 = badgeState.getBadgeShapeAppearanceResId();
        }
        int n4 = this.hasBadgeContent();
        if (n4 != 0) {
            BadgeState badgeState = this.state;
            n4 = badgeState.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            BadgeState badgeState = this.state;
            n4 = badgeState.getBadgeShapeAppearanceOverlayResId();
        }
        object = ShapeAppearanceModel.builder(object, n3, n4).build();
        materialShapeDrawable.setShapeAppearanceModel((ShapeAppearanceModel)object);
        this.invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        Context context = (Context)this.contextRef.get();
        if (context == null) {
            return;
        }
        int n3 = this.state.getTextAppearanceResId();
        TextAppearance textAppearance = new TextAppearance(context, n3);
        TextAppearance textAppearance2 = this.textDrawableHelper.getTextAppearance();
        if (textAppearance2 == textAppearance) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        this.onBadgeTextColorUpdated();
        this.updateCenterAndBounds();
        this.invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        TextPaint textPaint = this.textDrawableHelper.getTextPaint();
        int n3 = this.state.getBadgeTextColor();
        textPaint.setColor(n3);
        this.invalidateSelf();
    }

    private void onMaxBadgeLengthUpdated() {
        this.updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        this.updateCenterAndBounds();
        this.invalidateSelf();
    }

    private void onNumberUpdated() {
        boolean bl2 = this.hasText();
        if (!bl2) {
            this.onBadgeContentUpdated();
        }
    }

    private void onTextUpdated() {
        this.onBadgeContentUpdated();
    }

    private void onVisibilityUpdated() {
        BadgeState badgeState = this.state;
        boolean bl2 = badgeState.isVisible();
        FrameLayout frameLayout = null;
        this.setVisible(bl2, false);
        boolean bl3 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl3 && (frameLayout = this.getCustomBadgeParent()) != null && !bl2) {
            badgeState = (ViewGroup)this.getCustomBadgeParent().getParent();
            badgeState.invalidate();
        }
    }

    private void restoreState() {
        this.onBadgeShapeAppearanceUpdated();
        this.onBadgeTextAppearanceUpdated();
        this.onMaxBadgeLengthUpdated();
        this.onBadgeContentUpdated();
        this.onAlphaUpdated();
        this.onBackgroundColorUpdated();
        this.onBadgeTextColorUpdated();
        this.onBadgeGravityUpdated();
        this.updateCenterAndBounds();
        this.onVisibilityUpdated();
    }

    private void tryWrapAnchorInCompatParent(View view) {
        WeakReference weakReference;
        int n3;
        int n4;
        Object object = (ViewGroup)view.getParent();
        if (object != null && (n4 = object.getId()) == (n3 = R$id.mtrl_anchor_parent) || (weakReference = this.customBadgeParentRef) != null && (weakReference = weakReference.get()) == object) {
            return;
        }
        BadgeDrawable.updateAnchorParentToNotClip(view);
        Context context = view.getContext();
        weakReference = new FrameLayout(context);
        n3 = R$id.mtrl_anchor_parent;
        weakReference.setId(n3);
        weakReference.setClipChildren(false);
        weakReference.setClipToPadding(false);
        context = view.getLayoutParams();
        weakReference.setLayoutParams((ViewGroup.LayoutParams)context);
        n3 = view.getWidth();
        weakReference.setMinimumWidth(n3);
        n3 = view.getHeight();
        weakReference.setMinimumHeight(n3);
        n3 = object.indexOfChild(view);
        object.removeViewAt(n3);
        int n7 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n7, n7);
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        weakReference.addView(view);
        object.addView((View)weakReference, n3);
        object = new WeakReference(weakReference);
        this.customBadgeParentRef = object;
        object = new BadgeDrawable$1(this, view, (FrameLayout)weakReference);
        weakReference.post((Runnable)object);
    }

    private static void updateAnchorParentToNotClip(View view) {
        view = (ViewGroup)view.getParent();
        view.setClipChildren(false);
        view.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        float f5;
        Object object = (Context)this.contextRef.get();
        WeakReference weakReference = this.anchorViewRef;
        boolean bl2 = false;
        float f6 = 0.0f;
        Object object2 = null;
        if (weakReference != null) {
            weakReference = (View)weakReference.get();
        } else {
            weakReference = null;
            f5 = 0.0f;
        }
        if (object != null && weakReference != null) {
            boolean bl3;
            boolean bl4;
            object = new Rect();
            Rect rect = this.badgeBounds;
            object.set(rect);
            rect = new Rect();
            weakReference.getDrawingRect(rect);
            WeakReference weakReference2 = this.customBadgeParentRef;
            if (weakReference2 != null) {
                object2 = (ViewGroup)weakReference2.get();
            }
            if (object2 != null || (bl4 = BadgeUtils.USE_COMPAT_PARENT)) {
                if (object2 == null) {
                    object2 = (ViewGroup)weakReference.getParent();
                }
                object2.offsetDescendantRectToMyCoords((View)weakReference, rect);
            }
            this.calculateCenterAndBounds(rect, (View)weakReference);
            weakReference = this.badgeBounds;
            f6 = this.badgeCenterX;
            float f7 = this.badgeCenterY;
            float f8 = this.halfBadgeWidth;
            float f11 = this.halfBadgeHeight;
            BadgeUtils.updateBadgeBounds((Rect)weakReference, f6, f7, f8, f11);
            f5 = this.cornerRadius;
            f6 = -1.0f;
            bl2 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (bl2) {
                object2 = this.shapeDrawable;
                ((MaterialShapeDrawable)object2).setCornerSize(f5);
            }
            if (!(bl3 = object.equals((Object)(weakReference = this.badgeBounds)))) {
                object = this.shapeDrawable;
                weakReference = this.badgeBounds;
                object.setBounds((Rect)weakReference);
            }
        }
    }

    private void updateMaxBadgeNumber() {
        int n3;
        int n4 = this.getMaxCharacterCount();
        if (n4 != (n3 = -2)) {
            double d2 = (double)this.getMaxCharacterCount() - 1.0;
            double d5 = 10.0;
            d2 = Math.pow(d5, d2);
            this.maxBadgeNumber = n4 = (int)d2 + -1;
        } else {
            this.maxBadgeNumber = n4 = this.getMaxNumber();
        }
    }

    public void clearNumber() {
        BadgeState badgeState = this.state;
        boolean bl2 = badgeState.hasNumber();
        if (bl2) {
            badgeState = this.state;
            badgeState.clearNumber();
            this.onNumberUpdated();
        }
    }

    public void clearText() {
        BadgeState badgeState = this.state;
        boolean bl2 = badgeState.hasText();
        if (bl2) {
            badgeState = this.state;
            badgeState.clearText();
            this.onTextUpdated();
        }
    }

    public void draw(Canvas canvas) {
        Object object = this.getBounds();
        int n3 = object.isEmpty();
        if (n3 == 0 && (n3 = this.getAlpha()) != 0 && (n3 = (int)(this.isVisible() ? 1 : 0)) != 0) {
            object = this.shapeDrawable;
            ((MaterialShapeDrawable)object).draw(canvas);
            n3 = (int)(this.hasBadgeContent() ? 1 : 0);
            if (n3 != 0) {
                this.drawBadgeContent(canvas);
            }
        }
    }

    public int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    public int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    public int getAlpha() {
        return this.state.getAlpha();
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public CharSequence getContentDescription() {
        boolean bl2 = this.isVisible();
        if (!bl2) {
            return null;
        }
        bl2 = this.hasText();
        if (bl2) {
            return this.getTextContentDescription();
        }
        bl2 = this.hasNumber();
        if (bl2) {
            return this.getNumberContentDescription();
        }
        return this.getEmptyContentDescription();
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.customBadgeParentRef;
        weakReference = weakReference != null ? (FrameLayout)weakReference.get() : null;
        return weakReference;
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public int getNumber() {
        BadgeState badgeState = this.state;
        int n3 = badgeState.hasNumber();
        if (n3 != 0) {
            badgeState = this.state;
            n3 = badgeState.getNumber();
        } else {
            n3 = 0;
            badgeState = null;
        }
        return n3;
    }

    public int getOpacity() {
        return -3;
    }

    public BadgeState$State getSavedState() {
        return this.state.getOverridingState();
    }

    public String getText() {
        return this.state.getText();
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public boolean hasNumber() {
        BadgeState badgeState = this.state;
        boolean bl2 = badgeState.hasText();
        if (!bl2 && (bl2 = (badgeState = this.state).hasNumber())) {
            bl2 = true;
        } else {
            bl2 = false;
            badgeState = null;
        }
        return bl2;
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] nArray) {
        return super.onStateChange(nArray);
    }

    public void onTextSizeChange() {
        this.invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int n3) {
        this.state.setAdditionalHorizontalOffset(n3);
        this.updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(int n3) {
        this.state.setAdditionalVerticalOffset(n3);
        this.updateCenterAndBounds();
    }

    public void setAlpha(int n3) {
        this.state.setAlpha(n3);
        this.onAlphaUpdated();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean bl2) {
        BadgeState badgeState = this.state;
        boolean bl3 = badgeState.isAutoAdjustedToGrandparentBounds();
        if (bl3 == bl2) {
            return;
        }
        badgeState = this.state;
        badgeState.setAutoAdjustToGrandparentBounds(bl2);
        WeakReference weakReference = this.anchorViewRef;
        if (weakReference != null && (weakReference = weakReference.get()) != null) {
            weakReference = (View)this.anchorViewRef.get();
            this.autoAdjustWithinGrandparentBounds((View)weakReference);
        }
    }

    public void setBackgroundColor(int n3) {
        this.state.setBackgroundColor(n3);
        this.onBackgroundColorUpdated();
    }

    public void setBadgeGravity(int n3) {
        BadgeState badgeState;
        int n4 = 8388691;
        if (n3 != n4) {
            n4 = 0x800055;
        }
        if ((n4 = (badgeState = this.state).getBadgeGravity()) != n3) {
            badgeState = this.state;
            badgeState.setBadgeGravity(n3);
            this.onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(Locale locale) {
        Object object = this.state.getNumberLocale();
        boolean bl2 = locale.equals(object);
        if (!bl2) {
            object = this.state;
            ((BadgeState)object).setNumberLocale(locale);
            this.invalidateSelf();
        }
    }

    public void setBadgeTextColor(int n3) {
        Object object = this.textDrawableHelper.getTextPaint();
        int n4 = object.getColor();
        if (n4 != n3) {
            object = this.state;
            ((BadgeState)object).setBadgeTextColor(n3);
            this.onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(int n3) {
        this.state.setBadgeWithTextShapeAppearanceResId(n3);
        this.onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int n3) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(n3);
        this.onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(int n3) {
        this.state.setBadgeShapeAppearanceResId(n3);
        this.onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int n3) {
        this.state.setBadgeShapeAppearanceOverlayResId(n3);
        this.onBadgeShapeAppearanceUpdated();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int n3) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(n3);
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int n3) {
        this.state.setContentDescriptionQuantityStringsResource(n3);
    }

    public void setHorizontalOffset(int n3) {
        this.setHorizontalOffsetWithoutText(n3);
        this.setHorizontalOffsetWithText(n3);
    }

    public void setHorizontalOffsetWithText(int n3) {
        this.state.setHorizontalOffsetWithText(n3);
        this.updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(int n3) {
        this.state.setHorizontalOffsetWithoutText(n3);
        this.updateCenterAndBounds();
    }

    public void setHorizontalPadding(int n3) {
        BadgeState badgeState = this.state;
        int n4 = badgeState.getBadgeHorizontalPadding();
        if (n3 != n4) {
            badgeState = this.state;
            badgeState.setBadgeHorizontalPadding(n3);
            this.updateCenterAndBounds();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(int n3) {
        this.state.setLargeFontVerticalOffsetAdjustment(n3);
        this.updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int n3) {
        BadgeState badgeState = this.state;
        int n4 = badgeState.getMaxCharacterCount();
        if (n4 != n3) {
            badgeState = this.state;
            badgeState.setMaxCharacterCount(n3);
            this.onMaxBadgeLengthUpdated();
        }
    }

    public void setMaxNumber(int n3) {
        BadgeState badgeState = this.state;
        int n4 = badgeState.getMaxNumber();
        if (n4 != n3) {
            badgeState = this.state;
            badgeState.setMaxNumber(n3);
            this.onMaxBadgeLengthUpdated();
        }
    }

    public void setNumber(int n3) {
        n3 = Math.max(0, n3);
        BadgeState badgeState = this.state;
        int n4 = badgeState.getNumber();
        if (n4 != n3) {
            badgeState = this.state;
            badgeState.setNumber(n3);
            this.onNumberUpdated();
        }
    }

    public void setText(String string2) {
        Object object = this.state.getText();
        boolean bl2 = TextUtils.equals((CharSequence)object, (CharSequence)string2);
        if (!bl2) {
            object = this.state;
            ((BadgeState)object).setText(string2);
            this.onTextUpdated();
        }
    }

    public void setTextAppearance(int n3) {
        this.state.setTextAppearanceResId(n3);
        this.onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int n3) {
        this.setVerticalOffsetWithoutText(n3);
        this.setVerticalOffsetWithText(n3);
    }

    public void setVerticalOffsetWithText(int n3) {
        this.state.setVerticalOffsetWithText(n3);
        this.updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(int n3) {
        this.state.setVerticalOffsetWithoutText(n3);
        this.updateCenterAndBounds();
    }

    public void setVerticalPadding(int n3) {
        BadgeState badgeState = this.state;
        int n4 = badgeState.getBadgeVerticalPadding();
        if (n3 != n4) {
            badgeState = this.state;
            badgeState.setBadgeVerticalPadding(n3);
            this.updateCenterAndBounds();
        }
    }

    public void setVisible(boolean bl2) {
        this.state.setVisible(bl2);
        this.onVisibilityUpdated();
    }

    public void updateBadgeCoordinates(View view) {
        this.updateBadgeCoordinates(view, (FrameLayout)null);
    }

    public void updateBadgeCoordinates(View object, ViewGroup viewGroup) {
        boolean bl2 = viewGroup instanceof FrameLayout;
        if (bl2) {
            viewGroup = (FrameLayout)viewGroup;
            this.updateBadgeCoordinates((View)object, (FrameLayout)viewGroup);
            return;
        }
        object = new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        throw object;
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
        WeakReference<View> weakReference;
        this.anchorViewRef = weakReference = new WeakReference<View>(view);
        boolean bl2 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl2 && frameLayout == null) {
            this.tryWrapAnchorInCompatParent(view);
        } else {
            WeakReference<FrameLayout> weakReference2;
            this.customBadgeParentRef = weakReference2 = new WeakReference<FrameLayout>(frameLayout);
        }
        if (!bl2) {
            BadgeDrawable.updateAnchorParentToNotClip(view);
        }
        this.updateCenterAndBounds();
        this.invalidateSelf();
    }
}

