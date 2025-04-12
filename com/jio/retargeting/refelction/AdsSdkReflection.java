/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.retargeting.refelction;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import com.jio.retargeting.network.RetargetNetworkCall;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class AdsSdkReflection {
    public final Context a;

    public AdsSdkReflection(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static /* synthetic */ void callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(AdsSdkReflection adsSdkReflection, List list, String string2, String string3, boolean bl2, String string4, String string5, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 4;
        String string6 = n4 != 0 ? null : string3;
        n4 = n3 & 8;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n4 = n3 & 0x20;
        String string7 = n4 != 0 ? null : string5;
        adsSdkReflection.callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(list, string2, string6, bl3, string4, string7);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void callFireUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(List list, String string2, String string3, boolean bl2, String string4, String string5) {
        Class<Boolean> clazz;
        Class<String> clazz2;
        void var16_21;
        List list2 = list;
        String string6 = string4;
        int n3 = 5;
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        int n10 = 6;
        Intrinsics.checkNotNullParameter(list, "impresssionUrls");
        String string7 = "urlName";
        Intrinsics.checkNotNullParameter(string4, string7);
        int n14 = 1;
        Class[] classArray = new Class[n14];
        classArray[0] = Context.class;
        Object object = RetargetNetworkCall.class;
        Constructor constructor = ((Class)object).getConstructor(classArray);
        if (constructor != null) {
            Context context = this.a;
            Object[] objectArray = new Object[n14];
            objectArray[0] = context;
            Object t3 = constructor.newInstance(objectArray);
        } else {
            Object var16_20 = null;
        }
        if (var16_21 == null) {
            string6 = "message";
            Intrinsics.checkNotNullParameter("RetargetNetworkCall Class not found", string6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        Class[] classArray2 = new Class[n10];
        classArray2[0] = List.class;
        classArray2[n14] = clazz2 = String.class;
        classArray2[n8] = clazz2;
        classArray2[n7] = clazz = Boolean.TYPE;
        classArray2[n4] = clazz2;
        classArray2[n3] = clazz2;
        String string8 = "fireUrl";
        try {
            Class[] classArray3;
            Class[] classArray4 = classArray3 = Arrays.copyOf(classArray2, n10);
            object = ((Class)object).getDeclaredMethod(string8, classArray4);
            String string9 = "getDeclaredMethod(...)";
            Intrinsics.checkNotNullExpressionValue(object, string9);
            ((AccessibleObject)object).setAccessible(n14 != 0);
            Boolean bl3 = bl2;
            Object[] objectArray = new Object[n10];
            objectArray[0] = list2;
            objectArray[n14] = string2;
            objectArray[n8] = string3;
            objectArray[n7] = bl3;
            objectArray[n4] = string6;
            objectArray[n3] = string5;
            ((Method)object).invoke((Object)var16_21, objectArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getCCBValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        void var5_10;
        Object var1_1 = null;
        Object object = Utility.class;
        Field field = ((Class)object).getDeclaredField("INSTANCE");
        int n3 = 1;
        if (field != null) {
            ((AccessibleObject)field).setAccessible(n3 != 0);
        }
        field = null;
        Constructor constructor = ((Class)object).getDeclaredConstructor(null);
        if (constructor != null) {
            ((AccessibleObject)constructor).setAccessible(n3 != 0);
        }
        if (constructor != null) {
            Object t3 = constructor.newInstance(null);
        } else {
            Object var5_9 = null;
        }
        if (var5_10 == null) {
            object = "message";
            Intrinsics.checkNotNullParameter("Utility Class not found", (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return null;
        }
        Class[] classArray = new Class[n3];
        Object object2 = String.class;
        classArray[0] = object2;
        try {
            Class[] classArray2;
            object2 = UUID.randomUUID();
            object2 = ((UUID)object2).toString();
            String string2 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            string2 = "getCcbValue";
            Class[] classArray3 = classArray2 = Arrays.copyOf(classArray, n3);
            object = ((Class)object).getDeclaredMethod(string2, classArray3);
            String string3 = "getDeclaredMethod(...)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            Object object3 = ((Method)object).invoke((Object)var5_10, objectArray);
            return (String)object3;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final Context getContext() {
        return this.a;
    }
}

