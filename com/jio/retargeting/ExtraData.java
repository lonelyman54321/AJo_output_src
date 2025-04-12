/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.ExtraData$ExtraDataType;
import com.jio.retargeting.a;
import java.util.Arrays;
import java.util.GregorianCalendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class ExtraData {
    public final ExtraData$ExtraDataType a;
    public final float b;
    public final int c;
    public final GregorianCalendar d;
    public final String e;

    public ExtraData(float f5) {
        ExtraData$ExtraDataType extraData$ExtraDataType;
        this.a = extraData$ExtraDataType = ExtraData$ExtraDataType.Float;
        this.b = f5;
    }

    public ExtraData(int n3) {
        ExtraData$ExtraDataType extraData$ExtraDataType;
        this.a = extraData$ExtraDataType = ExtraData$ExtraDataType.Int;
        this.c = n3;
    }

    public ExtraData(String string2) {
        ExtraData$ExtraDataType extraData$ExtraDataType;
        this.a = extraData$ExtraDataType = ExtraData$ExtraDataType.String;
        this.e = string2;
    }

    public ExtraData(GregorianCalendar gregorianCalendar) {
        ExtraData$ExtraDataType extraData$ExtraDataType;
        this.a = extraData$ExtraDataType = ExtraData$ExtraDataType.Date;
        this.d = gregorianCalendar;
    }

    public final GregorianCalendar getDateValue() {
        int n3 = 1;
        ExtraData$ExtraDataType extraData$ExtraDataType = this.a;
        Object object = ExtraData$ExtraDataType.Date;
        if (extraData$ExtraDataType != object) {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = extraData$ExtraDataType;
            Object object2 = Arrays.copyOf(object, n3);
            object2 = String.format("Attempt to retrieve Date value from %s ExtraData instance", object2);
            Intrinsics.checkNotNullExpressionValue(object2, "format(format, *args)");
            Intrinsics.checkNotNullParameter(object2, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return null;
        }
        return this.d;
    }

    public final float getFloatValue() {
        int n3 = 1;
        ExtraData$ExtraDataType extraData$ExtraDataType = this.a;
        Object object = ExtraData$ExtraDataType.Float;
        if (extraData$ExtraDataType != object) {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = extraData$ExtraDataType;
            Object object2 = Arrays.copyOf(object, n3);
            object2 = String.format("Attempt to retrieve float value from %s ExtraData instance", object2);
            Intrinsics.checkNotNullExpressionValue(object2, "format(format, *args)");
            Intrinsics.checkNotNullParameter(object2, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return 0.0f;
        }
        return this.b;
    }

    public final int getIntValue() {
        int n3 = 1;
        ExtraData$ExtraDataType extraData$ExtraDataType = this.a;
        Object object = ExtraData$ExtraDataType.Int;
        if (extraData$ExtraDataType != object) {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = extraData$ExtraDataType;
            Object object2 = Arrays.copyOf(object, n3);
            object2 = String.format("Attempt to retrieve int value from %s ExtraData instance", object2);
            Intrinsics.checkNotNullExpressionValue(object2, "format(format, *args)");
            Intrinsics.checkNotNullParameter(object2, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return 0;
        }
        return this.c;
    }

    public final String getStringValue() {
        int n3 = 1;
        ExtraData$ExtraDataType extraData$ExtraDataType = this.a;
        Object object = ExtraData$ExtraDataType.String;
        if (extraData$ExtraDataType != object) {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = extraData$ExtraDataType;
            Object object2 = Arrays.copyOf(object, n3);
            object2 = String.format("Attempt to retrieve String value from %s ExtraData instance", object2);
            Intrinsics.checkNotNullExpressionValue(object2, "format(format, *args)");
            Intrinsics.checkNotNullParameter(object2, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return null;
        }
        return this.e;
    }

    public final Object getValue() {
        float f5;
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = -1;
            f5 = 0.0f / 0.0f;
        } else {
            int[] nArray = com.jio.retargeting.a.$EnumSwitchMapping$0;
            n3 = object.ordinal();
            n3 = nArray[n3];
        }
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n3 = 0;
                        f5 = 0.0f;
                        object = null;
                    } else {
                        object = this.getStringValue();
                    }
                } else {
                    object = this.getDateValue();
                }
            } else {
                n3 = this.getIntValue();
                object = n3;
            }
        } else {
            f5 = this.getFloatValue();
            object = Float.valueOf(f5);
        }
        return object;
    }
}

