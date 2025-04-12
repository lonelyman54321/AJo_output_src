/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeState$State$1;
import java.io.Serializable;
import java.util.Locale;

public final class BadgeState$State
implements Parcelable {
    private static final int BADGE_NUMBER_NONE = 255;
    public static final Parcelable.Creator CREATOR;
    private static final int NOT_SET = 254;
    private Integer additionalHorizontalOffset;
    private Integer additionalVerticalOffset;
    private int alpha = 255;
    private Boolean autoAdjustToWithinGrandparentBounds;
    private Integer backgroundColor;
    private Integer badgeGravity;
    private Integer badgeHorizontalPadding;
    private int badgeResId;
    private Integer badgeShapeAppearanceOverlayResId;
    private Integer badgeShapeAppearanceResId;
    private Integer badgeTextAppearanceResId;
    private Integer badgeTextColor;
    private Integer badgeVerticalPadding;
    private Integer badgeWithTextShapeAppearanceOverlayResId;
    private Integer badgeWithTextShapeAppearanceResId;
    private int contentDescriptionExceedsMaxBadgeNumberRes;
    private CharSequence contentDescriptionForText;
    private CharSequence contentDescriptionNumberless;
    private int contentDescriptionQuantityStrings;
    private Integer horizontalOffsetWithText;
    private Integer horizontalOffsetWithoutText;
    private Boolean isVisible;
    private Integer largeFontVerticalOffsetAdjustment;
    private int maxCharacterCount;
    private int maxNumber;
    private int number;
    private Locale numberLocale;
    private String text;
    private Integer verticalOffsetWithText;
    private Integer verticalOffsetWithoutText;

    static {
        BadgeState$State$1 badgeState$State$1 = new BadgeState$State$1();
        CREATOR = badgeState$State$1;
    }

    public BadgeState$State() {
        Boolean bl2;
        int n3;
        this.number = n3 = -2;
        this.maxCharacterCount = n3;
        this.maxNumber = n3;
        this.isVisible = bl2 = Boolean.TRUE;
    }

    public BadgeState$State(Parcel object) {
        int n3;
        this.number = n3 = -2;
        this.maxCharacterCount = n3;
        this.maxNumber = n3;
        Object object2 = Boolean.TRUE;
        this.isVisible = object2;
        this.badgeResId = n3 = object.readInt();
        object2 = (Integer)object.readSerializable();
        this.backgroundColor = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeTextColor = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeTextAppearanceResId = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeShapeAppearanceResId = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeShapeAppearanceOverlayResId = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeWithTextShapeAppearanceResId = object2;
        object2 = (Integer)object.readSerializable();
        this.badgeWithTextShapeAppearanceOverlayResId = object2;
        this.alpha = n3 = object.readInt();
        this.text = object2 = object.readString();
        this.number = n3 = object.readInt();
        this.maxCharacterCount = n3 = object.readInt();
        this.maxNumber = n3 = object.readInt();
        this.contentDescriptionForText = object2 = object.readString();
        this.contentDescriptionNumberless = object2 = object.readString();
        this.contentDescriptionQuantityStrings = n3 = object.readInt();
        this.badgeGravity = object2 = (Integer)object.readSerializable();
        this.badgeHorizontalPadding = object2 = (Integer)object.readSerializable();
        this.badgeVerticalPadding = object2 = (Integer)object.readSerializable();
        this.horizontalOffsetWithoutText = object2 = (Integer)object.readSerializable();
        this.verticalOffsetWithoutText = object2 = (Integer)object.readSerializable();
        this.horizontalOffsetWithText = object2 = (Integer)object.readSerializable();
        this.verticalOffsetWithText = object2 = (Integer)object.readSerializable();
        this.largeFontVerticalOffsetAdjustment = object2 = (Integer)object.readSerializable();
        this.additionalHorizontalOffset = object2 = (Integer)object.readSerializable();
        this.additionalVerticalOffset = object2 = (Integer)object.readSerializable();
        this.isVisible = object2 = (Boolean)object.readSerializable();
        this.numberLocale = object2 = (Locale)object.readSerializable();
        object = (Boolean)object.readSerializable();
        this.autoAdjustToWithinGrandparentBounds = object;
    }

    public static /* synthetic */ int access$000(BadgeState$State badgeState$State) {
        return badgeState$State.badgeResId;
    }

    public static /* synthetic */ int access$002(BadgeState$State badgeState$State, int n3) {
        badgeState$State.badgeResId = n3;
        return n3;
    }

    public static /* synthetic */ int access$100(BadgeState$State badgeState$State) {
        return badgeState$State.alpha;
    }

    public static /* synthetic */ int access$1000(BadgeState$State badgeState$State) {
        return badgeState$State.maxNumber;
    }

    public static /* synthetic */ int access$1002(BadgeState$State badgeState$State, int n3) {
        badgeState$State.maxNumber = n3;
        return n3;
    }

    public static /* synthetic */ int access$102(BadgeState$State badgeState$State, int n3) {
        badgeState$State.alpha = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1100(BadgeState$State badgeState$State) {
        return badgeState$State.badgeShapeAppearanceResId;
    }

    public static /* synthetic */ Integer access$1102(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeShapeAppearanceResId = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1200(BadgeState$State badgeState$State) {
        return badgeState$State.badgeShapeAppearanceOverlayResId;
    }

    public static /* synthetic */ Integer access$1202(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeShapeAppearanceOverlayResId = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1300(BadgeState$State badgeState$State) {
        return badgeState$State.badgeWithTextShapeAppearanceResId;
    }

    public static /* synthetic */ Integer access$1302(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeWithTextShapeAppearanceResId = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1400(BadgeState$State badgeState$State) {
        return badgeState$State.badgeWithTextShapeAppearanceOverlayResId;
    }

    public static /* synthetic */ Integer access$1402(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeWithTextShapeAppearanceOverlayResId = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1500(BadgeState$State badgeState$State) {
        return badgeState$State.backgroundColor;
    }

    public static /* synthetic */ Integer access$1502(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.backgroundColor = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1600(BadgeState$State badgeState$State) {
        return badgeState$State.badgeTextAppearanceResId;
    }

    public static /* synthetic */ Integer access$1602(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeTextAppearanceResId = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1700(BadgeState$State badgeState$State) {
        return badgeState$State.badgeTextColor;
    }

    public static /* synthetic */ Integer access$1702(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeTextColor = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1800(BadgeState$State badgeState$State) {
        return badgeState$State.badgeGravity;
    }

    public static /* synthetic */ Integer access$1802(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeGravity = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$1900(BadgeState$State badgeState$State) {
        return badgeState$State.badgeHorizontalPadding;
    }

    public static /* synthetic */ Integer access$1902(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeHorizontalPadding = n3;
        return n3;
    }

    public static /* synthetic */ int access$200(BadgeState$State badgeState$State) {
        return badgeState$State.number;
    }

    public static /* synthetic */ Integer access$2000(BadgeState$State badgeState$State) {
        return badgeState$State.badgeVerticalPadding;
    }

    public static /* synthetic */ Integer access$2002(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.badgeVerticalPadding = n3;
        return n3;
    }

    public static /* synthetic */ int access$202(BadgeState$State badgeState$State, int n3) {
        badgeState$State.number = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2100(BadgeState$State badgeState$State) {
        return badgeState$State.horizontalOffsetWithoutText;
    }

    public static /* synthetic */ Integer access$2102(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.horizontalOffsetWithoutText = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2200(BadgeState$State badgeState$State) {
        return badgeState$State.verticalOffsetWithoutText;
    }

    public static /* synthetic */ Integer access$2202(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.verticalOffsetWithoutText = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2300(BadgeState$State badgeState$State) {
        return badgeState$State.horizontalOffsetWithText;
    }

    public static /* synthetic */ Integer access$2302(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.horizontalOffsetWithText = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2400(BadgeState$State badgeState$State) {
        return badgeState$State.verticalOffsetWithText;
    }

    public static /* synthetic */ Integer access$2402(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.verticalOffsetWithText = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2500(BadgeState$State badgeState$State) {
        return badgeState$State.largeFontVerticalOffsetAdjustment;
    }

    public static /* synthetic */ Integer access$2502(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.largeFontVerticalOffsetAdjustment = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2600(BadgeState$State badgeState$State) {
        return badgeState$State.additionalHorizontalOffset;
    }

    public static /* synthetic */ Integer access$2602(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.additionalHorizontalOffset = n3;
        return n3;
    }

    public static /* synthetic */ Integer access$2700(BadgeState$State badgeState$State) {
        return badgeState$State.additionalVerticalOffset;
    }

    public static /* synthetic */ Integer access$2702(BadgeState$State badgeState$State, Integer n3) {
        badgeState$State.additionalVerticalOffset = n3;
        return n3;
    }

    public static /* synthetic */ Boolean access$2800(BadgeState$State badgeState$State) {
        return badgeState$State.autoAdjustToWithinGrandparentBounds;
    }

    public static /* synthetic */ Boolean access$2802(BadgeState$State badgeState$State, Boolean bl2) {
        badgeState$State.autoAdjustToWithinGrandparentBounds = bl2;
        return bl2;
    }

    public static /* synthetic */ Locale access$2900(BadgeState$State badgeState$State) {
        return badgeState$State.numberLocale;
    }

    public static /* synthetic */ Locale access$2902(BadgeState$State badgeState$State, Locale locale) {
        badgeState$State.numberLocale = locale;
        return locale;
    }

    public static /* synthetic */ String access$300(BadgeState$State badgeState$State) {
        return badgeState$State.text;
    }

    public static /* synthetic */ String access$302(BadgeState$State badgeState$State, String string2) {
        badgeState$State.text = string2;
        return string2;
    }

    public static /* synthetic */ CharSequence access$400(BadgeState$State badgeState$State) {
        return badgeState$State.contentDescriptionForText;
    }

    public static /* synthetic */ CharSequence access$402(BadgeState$State badgeState$State, CharSequence charSequence) {
        badgeState$State.contentDescriptionForText = charSequence;
        return charSequence;
    }

    public static /* synthetic */ CharSequence access$500(BadgeState$State badgeState$State) {
        return badgeState$State.contentDescriptionNumberless;
    }

    public static /* synthetic */ CharSequence access$502(BadgeState$State badgeState$State, CharSequence charSequence) {
        badgeState$State.contentDescriptionNumberless = charSequence;
        return charSequence;
    }

    public static /* synthetic */ int access$600(BadgeState$State badgeState$State) {
        return badgeState$State.contentDescriptionQuantityStrings;
    }

    public static /* synthetic */ int access$602(BadgeState$State badgeState$State, int n3) {
        badgeState$State.contentDescriptionQuantityStrings = n3;
        return n3;
    }

    public static /* synthetic */ int access$700(BadgeState$State badgeState$State) {
        return badgeState$State.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    public static /* synthetic */ int access$702(BadgeState$State badgeState$State, int n3) {
        badgeState$State.contentDescriptionExceedsMaxBadgeNumberRes = n3;
        return n3;
    }

    public static /* synthetic */ Boolean access$800(BadgeState$State badgeState$State) {
        return badgeState$State.isVisible;
    }

    public static /* synthetic */ Boolean access$802(BadgeState$State badgeState$State, Boolean bl2) {
        badgeState$State.isVisible = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$900(BadgeState$State badgeState$State) {
        return badgeState$State.maxCharacterCount;
    }

    public static /* synthetic */ int access$902(BadgeState$State badgeState$State, int n3) {
        badgeState$State.maxCharacterCount = n3;
        return n3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.badgeResId;
        parcel.writeInt(n3);
        Object object = this.backgroundColor;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeTextColor;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeTextAppearanceResId;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeShapeAppearanceResId;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeShapeAppearanceOverlayResId;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeWithTextShapeAppearanceResId;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeWithTextShapeAppearanceOverlayResId;
        parcel.writeSerializable((Serializable)object);
        n3 = this.alpha;
        parcel.writeInt(n3);
        object = this.text;
        parcel.writeString((String)object);
        n3 = this.number;
        parcel.writeInt(n3);
        n3 = this.maxCharacterCount;
        parcel.writeInt(n3);
        n3 = this.maxNumber;
        parcel.writeInt(n3);
        object = this.contentDescriptionForText;
        String string2 = null;
        if (object != null) {
            object = object.toString();
        } else {
            n3 = 0;
            object = null;
        }
        parcel.writeString((String)object);
        object = this.contentDescriptionNumberless;
        if (object != null) {
            string2 = object.toString();
        }
        parcel.writeString(string2);
        n3 = this.contentDescriptionQuantityStrings;
        parcel.writeInt(n3);
        object = this.badgeGravity;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeHorizontalPadding;
        parcel.writeSerializable((Serializable)object);
        object = this.badgeVerticalPadding;
        parcel.writeSerializable((Serializable)object);
        object = this.horizontalOffsetWithoutText;
        parcel.writeSerializable((Serializable)object);
        object = this.verticalOffsetWithoutText;
        parcel.writeSerializable((Serializable)object);
        object = this.horizontalOffsetWithText;
        parcel.writeSerializable((Serializable)object);
        object = this.verticalOffsetWithText;
        parcel.writeSerializable((Serializable)object);
        object = this.largeFontVerticalOffsetAdjustment;
        parcel.writeSerializable((Serializable)object);
        object = this.additionalHorizontalOffset;
        parcel.writeSerializable((Serializable)object);
        object = this.additionalVerticalOffset;
        parcel.writeSerializable((Serializable)object);
        object = this.isVisible;
        parcel.writeSerializable((Serializable)object);
        object = this.numberLocale;
        parcel.writeSerializable((Serializable)object);
        object = this.autoAdjustToWithinGrandparentBounds;
        parcel.writeSerializable((Serializable)object);
    }
}

