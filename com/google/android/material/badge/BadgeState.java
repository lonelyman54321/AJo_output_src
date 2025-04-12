/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 */
package com.google.android.material.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.R$dimen;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final BadgeState$State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final BadgeState$State overridingState;

    public BadgeState(Context object, int n3, int n4, int n7, BadgeState$State badgeState$State) {
        int n8;
        boolean bl2;
        int n10;
        float f5;
        BadgeState$State badgeState$State2;
        this.currentState = badgeState$State2 = new BadgeState$State();
        if (badgeState$State == null) {
            badgeState$State = new BadgeState$State();
        }
        if (n3 != 0) {
            BadgeState$State.access$002(badgeState$State, n3);
        }
        n3 = BadgeState$State.access$000(badgeState$State);
        TypedArray typedArray = this.generateTypedArray((Context)object, n3, n4, n7);
        Object object2 = object.getResources();
        n7 = R$styleable.Badge_badgeRadius;
        int n14 = -1;
        this.badgeRadius = f5 = (float)typedArray.getDimensionPixelSize(n7, n14);
        Object object3 = object.getResources();
        int bl22 = R$dimen.mtrl_badge_horizontal_edge_offset;
        this.horizontalInset = n7 = object3.getDimensionPixelSize(bl22);
        object3 = object.getResources();
        int n15 = R$dimen.mtrl_badge_text_horizontal_edge_offset;
        this.horizontalInsetWithText = n7 = object3.getDimensionPixelSize(n15);
        n7 = R$styleable.Badge_badgeWithTextRadius;
        this.badgeWithTextRadius = f5 = (float)typedArray.getDimensionPixelSize(n7, n14);
        n7 = R$styleable.Badge_badgeWidth;
        int n16 = R$dimen.m3_badge_size;
        float f6 = object2.getDimension(n16);
        this.badgeWidth = f5 = typedArray.getDimension(n7, f6);
        n7 = R$styleable.Badge_badgeWithTextWidth;
        int n17 = R$dimen.m3_badge_with_text_size;
        f6 = object2.getDimension(n17);
        this.badgeWithTextWidth = f5 = typedArray.getDimension(n7, f6);
        n7 = R$styleable.Badge_badgeHeight;
        int n18 = R$dimen.m3_badge_size;
        f6 = object2.getDimension(n18);
        this.badgeHeight = f5 = typedArray.getDimension(n7, f6);
        n7 = R$styleable.Badge_badgeWithTextHeight;
        int n19 = R$dimen.m3_badge_with_text_size;
        f6 = object2.getDimension(n19);
        this.badgeWithTextHeight = f5 = typedArray.getDimension(n7, f6);
        n7 = R$styleable.Badge_offsetAlignmentMode;
        int n20 = 1;
        f6 = Float.MIN_VALUE;
        this.offsetAlignmentMode = n7 = typedArray.getInt(n7, n20);
        n7 = BadgeState$State.access$100(badgeState$State);
        if (n7 == (n10 = -2)) {
            n7 = 255;
            f5 = 3.57E-43f;
        } else {
            n7 = BadgeState$State.access$100(badgeState$State);
        }
        BadgeState$State.access$102(badgeState$State2, n7);
        n7 = BadgeState$State.access$200(badgeState$State);
        if (n7 != n10) {
            n7 = BadgeState$State.access$200(badgeState$State);
            BadgeState$State.access$202(badgeState$State2, n7);
        } else {
            n7 = R$styleable.Badge_number;
            if ((n7 = (int)(typedArray.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.Badge_number;
                n7 = typedArray.getInt(n7, 0);
                BadgeState$State.access$202(badgeState$State2, n7);
            } else {
                BadgeState$State.access$202(badgeState$State2, n14);
            }
        }
        object3 = BadgeState$State.access$300(badgeState$State);
        if (object3 != null) {
            object3 = BadgeState$State.access$300(badgeState$State);
            BadgeState$State.access$302(badgeState$State2, (String)object3);
        } else {
            n7 = R$styleable.Badge_badgeText;
            if ((n7 = (int)(typedArray.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.Badge_badgeText;
                object3 = typedArray.getString(n7);
                BadgeState$State.access$302(badgeState$State2, (String)object3);
            }
        }
        object3 = BadgeState$State.access$400(badgeState$State);
        BadgeState$State.access$402(badgeState$State2, (CharSequence)object3);
        object3 = BadgeState$State.access$500(badgeState$State);
        if (object3 == null) {
            n7 = R$string.mtrl_badge_numberless_content_description;
            object3 = object.getString(n7);
        } else {
            object3 = BadgeState$State.access$500(badgeState$State);
        }
        BadgeState$State.access$502(badgeState$State2, (CharSequence)object3);
        n7 = BadgeState$State.access$600(badgeState$State);
        n7 = n7 == 0 ? R$plurals.mtrl_badge_content_description : BadgeState$State.access$600(badgeState$State);
        BadgeState$State.access$602(badgeState$State2, n7);
        n7 = BadgeState$State.access$700(badgeState$State);
        n7 = n7 == 0 ? R$string.mtrl_exceed_max_badge_number_content_description : BadgeState$State.access$700(badgeState$State);
        BadgeState$State.access$702(badgeState$State2, n7);
        object3 = BadgeState$State.access$800(badgeState$State);
        if (object3 != null && (n7 = (int)(((Boolean)(object3 = BadgeState$State.access$800(badgeState$State))).booleanValue() ? 1 : 0)) == 0) {
            bl2 = false;
            f6 = 0.0f;
        }
        object3 = bl2;
        BadgeState$State.access$802(badgeState$State2, (Boolean)object3);
        n7 = BadgeState$State.access$900(badgeState$State);
        if (n7 == n10) {
            n7 = R$styleable.Badge_maxCharacterCount;
            n7 = typedArray.getInt(n7, n10);
        } else {
            n7 = BadgeState$State.access$900(badgeState$State);
        }
        BadgeState$State.access$902(badgeState$State2, n7);
        n7 = BadgeState$State.access$1000(badgeState$State);
        if (n7 == n10) {
            n7 = R$styleable.Badge_maxNumber;
            n7 = typedArray.getInt(n7, n10);
        } else {
            n7 = BadgeState$State.access$1000(badgeState$State);
        }
        BadgeState$State.access$1002(badgeState$State2, n7);
        object3 = BadgeState$State.access$1100(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_badgeShapeAppearance;
            n14 = R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full;
            n7 = typedArray.getResourceId(n7, n14);
        } else {
            object3 = BadgeState$State.access$1100(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1102(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1200(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_badgeShapeAppearanceOverlay;
            n7 = typedArray.getResourceId(n7, 0);
        } else {
            object3 = BadgeState$State.access$1200(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1202(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1300(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_badgeWithTextShapeAppearance;
            n14 = R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full;
            n7 = typedArray.getResourceId(n7, n14);
        } else {
            object3 = BadgeState$State.access$1300(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1302(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1400(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_badgeWithTextShapeAppearanceOverlay;
            n7 = typedArray.getResourceId(n7, 0);
        } else {
            object3 = BadgeState$State.access$1400(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1402(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1500(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_backgroundColor;
            n7 = BadgeState.readColorFromAttributes((Context)object, typedArray, n7);
        } else {
            object3 = BadgeState$State.access$1500(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1502(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1600(badgeState$State);
        if (object3 == null) {
            n7 = R$styleable.Badge_badgeTextAppearance;
            n14 = R$style.TextAppearance_MaterialComponents_Badge;
            n7 = typedArray.getResourceId(n7, n14);
        } else {
            object3 = BadgeState$State.access$1600(badgeState$State);
            n7 = (Integer)object3;
        }
        object3 = n7;
        BadgeState$State.access$1602(badgeState$State2, (Integer)object3);
        object3 = BadgeState$State.access$1700(badgeState$State);
        if (object3 != null) {
            object = BadgeState$State.access$1700(badgeState$State);
            BadgeState$State.access$1702(badgeState$State2, (Integer)object);
        } else {
            n7 = R$styleable.Badge_badgeTextColor;
            if ((n7 = (int)(typedArray.hasValue(n7) ? 1 : 0)) != 0) {
                n7 = R$styleable.Badge_badgeTextColor;
                n8 = BadgeState.readColorFromAttributes((Context)object, typedArray, n7);
                object = n8;
                BadgeState$State.access$1702(badgeState$State2, (Integer)object);
            } else {
                Integer n21 = BadgeState$State.access$1600(badgeState$State2);
                n14 = n21;
                object3 = new TextAppearance((Context)object, n14);
                n8 = ((TextAppearance)object3).getTextColor().getDefaultColor();
                object = n8;
                BadgeState$State.access$1702(badgeState$State2, (Integer)object);
            }
        }
        object = BadgeState$State.access$1800(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_badgeGravity;
            n7 = 8388661;
            f5 = 1.1755018E-38f;
            n8 = typedArray.getInt(n8, n7);
        } else {
            object = BadgeState$State.access$1800(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$1802(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$1900(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_badgeWidePadding;
            n7 = R$dimen.mtrl_badge_long_text_horizontal_padding;
            n7 = object2.getDimensionPixelSize(n7);
            n8 = typedArray.getDimensionPixelSize(n8, n7);
        } else {
            object = BadgeState$State.access$1900(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$1902(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2000(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_badgeVerticalPadding;
            n7 = R$dimen.m3_badge_with_text_vertical_padding;
            n4 = object2.getDimensionPixelSize(n7);
            n8 = typedArray.getDimensionPixelSize(n8, n4);
        } else {
            object = BadgeState$State.access$2000(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2002(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2100(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_horizontalOffset;
            n8 = typedArray.getDimensionPixelOffset(n8, 0);
        } else {
            object = BadgeState$State.access$2100(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2102(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2200(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_verticalOffset;
            n8 = typedArray.getDimensionPixelOffset(n8, 0);
        } else {
            object = BadgeState$State.access$2200(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2202(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2300(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_horizontalOffsetWithText;
            object2 = BadgeState$State.access$2100(badgeState$State2);
            n4 = (Integer)object2;
            n8 = typedArray.getDimensionPixelOffset(n8, n4);
        } else {
            object = BadgeState$State.access$2300(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2302(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2400(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_verticalOffsetWithText;
            object2 = BadgeState$State.access$2200(badgeState$State2);
            n4 = (Integer)object2;
            n8 = typedArray.getDimensionPixelOffset(n8, n4);
        } else {
            object = BadgeState$State.access$2400(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2402(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2500(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_largeFontVerticalOffsetAdjustment;
            n8 = typedArray.getDimensionPixelOffset(n8, 0);
        } else {
            object = BadgeState$State.access$2500(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2502(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2600(badgeState$State);
        if (object == null) {
            n8 = 0;
            object = null;
        } else {
            object = BadgeState$State.access$2600(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2602(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2700(badgeState$State);
        if (object == null) {
            n8 = 0;
            object = null;
        } else {
            object = BadgeState$State.access$2700(badgeState$State);
            n8 = (Integer)object;
        }
        object = n8;
        BadgeState$State.access$2702(badgeState$State2, (Integer)object);
        object = BadgeState$State.access$2800(badgeState$State);
        if (object == null) {
            n8 = R$styleable.Badge_autoAdjustToWithinGrandparentBounds;
            n8 = (int)(typedArray.getBoolean(n8, false) ? 1 : 0);
        } else {
            object = BadgeState$State.access$2800(badgeState$State);
            n8 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        }
        object = n8 != 0;
        BadgeState$State.access$2802(badgeState$State2, (Boolean)object);
        typedArray.recycle();
        object = BadgeState$State.access$2900(badgeState$State);
        if (object == null) {
            n8 = Build.VERSION.SDK_INT;
            n3 = 24;
            object = n8 >= n3 ? Sy3.a(lu_2.a()) : Locale.getDefault();
            BadgeState$State.access$2902(badgeState$State2, (Locale)object);
        } else {
            object = BadgeState$State.access$2900(badgeState$State);
            BadgeState$State.access$2902(badgeState$State2, (Locale)object);
        }
        this.overridingState = badgeState$State;
    }

    private TypedArray generateTypedArray(Context context, int n3, int n4, int n7) {
        AttributeSet attributeSet;
        int n8;
        String string2;
        if (n3 != 0) {
            string2 = BADGE_RESOURCE_TAG;
            AttributeSet attributeSet2 = DrawableUtils.parseDrawableXml(context, n3, string2);
            n8 = attributeSet2.getStyleAttribute();
            attributeSet = attributeSet2;
        } else {
            n3 = 0;
            Object var6_7 = null;
            attributeSet = null;
            n8 = 0;
            string2 = null;
        }
        int n10 = n8 == 0 ? n7 : n8;
        int[] nArray = R$styleable.Badge;
        int[] nArray2 = new int[]{};
        string2 = context;
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n4, n10, nArray2);
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int n3) {
        return MaterialResources.getColorStateList(context, typedArray, n3).getDefaultColor();
    }

    public void clearNumber() {
        this.setNumber(-1);
    }

    public void clearText() {
        this.setText(null);
    }

    public int getAdditionalHorizontalOffset() {
        return BadgeState$State.access$2600(this.currentState);
    }

    public int getAdditionalVerticalOffset() {
        return BadgeState$State.access$2700(this.currentState);
    }

    public int getAlpha() {
        return BadgeState$State.access$100(this.currentState);
    }

    public int getBackgroundColor() {
        return BadgeState$State.access$1500(this.currentState);
    }

    public int getBadgeGravity() {
        return BadgeState$State.access$1800(this.currentState);
    }

    public int getBadgeHorizontalPadding() {
        return BadgeState$State.access$1900(this.currentState);
    }

    public int getBadgeShapeAppearanceOverlayResId() {
        return BadgeState$State.access$1200(this.currentState);
    }

    public int getBadgeShapeAppearanceResId() {
        return BadgeState$State.access$1100(this.currentState);
    }

    public int getBadgeTextColor() {
        return BadgeState$State.access$1700(this.currentState);
    }

    public int getBadgeVerticalPadding() {
        return BadgeState$State.access$2000(this.currentState);
    }

    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return BadgeState$State.access$1400(this.currentState);
    }

    public int getBadgeWithTextShapeAppearanceResId() {
        return BadgeState$State.access$1300(this.currentState);
    }

    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return BadgeState$State.access$700(this.currentState);
    }

    public CharSequence getContentDescriptionForText() {
        return BadgeState$State.access$400(this.currentState);
    }

    public CharSequence getContentDescriptionNumberless() {
        return BadgeState$State.access$500(this.currentState);
    }

    public int getContentDescriptionQuantityStrings() {
        return BadgeState$State.access$600(this.currentState);
    }

    public int getHorizontalOffsetWithText() {
        return BadgeState$State.access$2300(this.currentState);
    }

    public int getHorizontalOffsetWithoutText() {
        return BadgeState$State.access$2100(this.currentState);
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return BadgeState$State.access$2500(this.currentState);
    }

    public int getMaxCharacterCount() {
        return BadgeState$State.access$900(this.currentState);
    }

    public int getMaxNumber() {
        return BadgeState$State.access$1000(this.currentState);
    }

    public int getNumber() {
        return BadgeState$State.access$200(this.currentState);
    }

    public Locale getNumberLocale() {
        return BadgeState$State.access$2900(this.currentState);
    }

    public BadgeState$State getOverridingState() {
        return this.overridingState;
    }

    public String getText() {
        return BadgeState$State.access$300(this.currentState);
    }

    public int getTextAppearanceResId() {
        return BadgeState$State.access$1600(this.currentState);
    }

    public int getVerticalOffsetWithText() {
        return BadgeState$State.access$2400(this.currentState);
    }

    public int getVerticalOffsetWithoutText() {
        return BadgeState$State.access$2200(this.currentState);
    }

    public boolean hasNumber() {
        int n3;
        BadgeState$State badgeState$State = this.currentState;
        int n4 = BadgeState$State.access$200(badgeState$State);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            badgeState$State = null;
        }
        return n4 != 0;
    }

    public boolean hasText() {
        boolean bl2;
        String string2 = BadgeState$State.access$300(this.currentState);
        if (string2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public boolean isAutoAdjustedToGrandparentBounds() {
        return BadgeState$State.access$2800(this.currentState);
    }

    public boolean isVisible() {
        return BadgeState$State.access$800(this.currentState);
    }

    public void setAdditionalHorizontalOffset(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2602(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2602(badgeState$State, n7);
    }

    public void setAdditionalVerticalOffset(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2702(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2702(badgeState$State, n7);
    }

    public void setAlpha(int n3) {
        BadgeState$State.access$102(this.overridingState, n3);
        BadgeState$State.access$102(this.currentState, n3);
    }

    public void setAutoAdjustToGrandparentBounds(boolean bl2) {
        BadgeState$State badgeState$State = this.overridingState;
        Boolean bl3 = bl2;
        BadgeState$State.access$2802(badgeState$State, bl3);
        badgeState$State = this.currentState;
        Boolean bl4 = bl2;
        BadgeState$State.access$2802(badgeState$State, bl4);
    }

    public void setBackgroundColor(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1502(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1502(badgeState$State, n7);
    }

    public void setBadgeGravity(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1802(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1802(badgeState$State, n7);
    }

    public void setBadgeHorizontalPadding(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1902(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1902(badgeState$State, n7);
    }

    public void setBadgeShapeAppearanceOverlayResId(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1202(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1202(badgeState$State, n7);
    }

    public void setBadgeShapeAppearanceResId(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1102(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1102(badgeState$State, n7);
    }

    public void setBadgeTextColor(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1702(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1702(badgeState$State, n7);
    }

    public void setBadgeVerticalPadding(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2002(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2002(badgeState$State, n7);
    }

    public void setBadgeWithTextShapeAppearanceOverlayResId(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1402(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1402(badgeState$State, n7);
    }

    public void setBadgeWithTextShapeAppearanceResId(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1302(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1302(badgeState$State, n7);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int n3) {
        BadgeState$State.access$702(this.overridingState, n3);
        BadgeState$State.access$702(this.currentState, n3);
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        BadgeState$State.access$402(this.overridingState, charSequence);
        BadgeState$State.access$402(this.currentState, charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        BadgeState$State.access$502(this.overridingState, charSequence);
        BadgeState$State.access$502(this.currentState, charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int n3) {
        BadgeState$State.access$602(this.overridingState, n3);
        BadgeState$State.access$602(this.currentState, n3);
    }

    public void setHorizontalOffsetWithText(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2302(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2302(badgeState$State, n7);
    }

    public void setHorizontalOffsetWithoutText(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2102(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2102(badgeState$State, n7);
    }

    public void setLargeFontVerticalOffsetAdjustment(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2502(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2502(badgeState$State, n7);
    }

    public void setMaxCharacterCount(int n3) {
        BadgeState$State.access$902(this.overridingState, n3);
        BadgeState$State.access$902(this.currentState, n3);
    }

    public void setMaxNumber(int n3) {
        BadgeState$State.access$1002(this.overridingState, n3);
        BadgeState$State.access$1002(this.currentState, n3);
    }

    public void setNumber(int n3) {
        BadgeState$State.access$202(this.overridingState, n3);
        BadgeState$State.access$202(this.currentState, n3);
    }

    public void setNumberLocale(Locale locale) {
        BadgeState$State.access$2902(this.overridingState, locale);
        BadgeState$State.access$2902(this.currentState, locale);
    }

    public void setText(String string2) {
        BadgeState$State.access$302(this.overridingState, string2);
        BadgeState$State.access$302(this.currentState, string2);
    }

    public void setTextAppearanceResId(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$1602(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$1602(badgeState$State, n7);
    }

    public void setVerticalOffsetWithText(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2402(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2402(badgeState$State, n7);
    }

    public void setVerticalOffsetWithoutText(int n3) {
        BadgeState$State badgeState$State = this.overridingState;
        Integer n4 = n3;
        BadgeState$State.access$2202(badgeState$State, n4);
        badgeState$State = this.currentState;
        Integer n7 = n3;
        BadgeState$State.access$2202(badgeState$State, n7);
    }

    public void setVisible(boolean bl2) {
        BadgeState$State badgeState$State = this.overridingState;
        Boolean bl3 = bl2;
        BadgeState$State.access$802(badgeState$State, bl3);
        badgeState$State = this.currentState;
        Boolean bl4 = bl2;
        BadgeState$State.access$802(badgeState$State, bl4);
    }
}

