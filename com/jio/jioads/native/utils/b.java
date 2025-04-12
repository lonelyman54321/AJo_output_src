/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.ViewGroup
 */
package com.jio.jioads.native.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class b {
    /*
     * Enabled aggressive block sorting
     */
    public static String a(Boolean bl2, String string2, Boolean bl3, List list, String string3, String string4, String string5, String string6, String string7) {
        boolean bl4;
        Object object;
        Object object2;
        int n3;
        String string8;
        int n4;
        Object object3 = string7;
        int n7 = 6;
        String string9 = "x";
        int n8 = 1;
        String string10 = "";
        if (list == null) {
            n4 = 0;
            string8 = null;
            n3 = 0;
        } else {
            boolean bl5;
            Iterator iterator = list.iterator();
            n4 = 0;
            string8 = null;
            n3 = 0;
            while (bl5 = iterator.hasNext()) {
                object2 = (Constants$DynamicDisplaySize)((Object)iterator.next());
                object = ((Constants$DynamicDisplaySize)((Object)object2)).getDynamicSize();
                Object object4 = new String[]{string9};
                object = StringsKt.a0((CharSequence)object, (String[])object4, false, 0, n7);
                int n10 = yx_2.o((Iterable)object, 10);
                object4 = new ArrayList(n10);
                object = object.iterator();
                while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    n10 = Integer.parseInt((String)object.next());
                    Integer n14 = n10;
                    ((ArrayList)object4).add(n14);
                }
                object = (Number)((ArrayList)object4).get(0);
                int n15 = ((Number)object).intValue();
                object4 = (Number)((ArrayList)object4).get(n8);
                int n16 = ((Number)object4).intValue();
                Boolean bl6 = Boolean.TRUE;
                int n17 = Intrinsics.areEqual(bl2, bl6);
                if (n17 != 0) {
                    if (n15 < n4 || n16 < n3) continue;
                    string10 = ((Constants$DynamicDisplaySize)((Object)object2)).getDynamicSize();
                } else {
                    int n18;
                    n17 = 250;
                    if (n16 >= n17 && (string2 != null && (n18 = string2.length()) != 0 || (n10 = (int)(Intrinsics.areEqual(bl3, bl6) ? 1 : 0)) != 0)) {
                        n10 = 1;
                    } else {
                        n10 = 0;
                        Object var23_31 = null;
                    }
                    n17 = n16 < n17 && (string3 != null && (n17 = string3.length()) != 0 || string4 != null && (n17 = string4.length()) != 0 || string5 != null && (n17 = string5.length()) != 0 || string6 != null && (n17 = string6.length()) != 0) ? 1 : 0;
                    if (n10 == 0 && n17 == 0 || n15 < n4 || n16 < n3) continue;
                    string10 = ((Constants$DynamicDisplaySize)((Object)object2)).getDynamicSize();
                }
                n4 = n15;
                n3 = n16;
            }
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)string10))) {
            object2 = " with width: ";
            object = " and height: ";
            StringBuilder stringBuilder = oe3_0.a(n4, "Maximum Width and height: ", string10, (String)object2, (String)object);
            string8 = "message";
            w12_0.b(n3, string8, stringBuilder);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        if (object3 != null) {
            String[] stringArray = new String[]{string9};
            object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n7);
            StringBuilder stringBuilder = new StringBuilder();
            String string11 = (String)object3.get(0);
            stringBuilder.append(string11);
            char c2 = 'x';
            stringBuilder.append(c2);
            object3 = (String)object3.get(n8);
            stringBuilder.append((String)object3);
            return stringBuilder.toString();
        }
        boolean bl7 = TextUtils.isEmpty((CharSequence)string10);
        if (!bl7) {
            return string10;
        }
        object3 = Constants$DynamicDisplaySize.SIZE_300x50;
        return ((Constants$DynamicDisplaySize)((Object)object3)).getDynamicSize();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int[] b(String string2, ViewGroup viewGroup, com.jio.jioads.common.b b2) {
        void var14_56;
        int n3;
        block45: {
            Object object;
            block46: {
                String string3;
                int n4;
                int n7;
                int n8;
                int n10;
                int n14;
                int n15;
                int n16;
                int n17;
                float f5;
                int n18;
                String string4;
                String string5;
                int n19;
                int n20;
                Object object2;
                block44: {
                    float f6;
                    Object object3;
                    Boolean bl2;
                    void var20_69;
                    float f7;
                    float f8;
                    object = string2;
                    ViewGroup viewGroup2 = viewGroup;
                    object2 = b2;
                    Intrinsics.checkNotNullParameter(string2, "displayAdSize");
                    Intrinsics.checkNotNullParameter(viewGroup, "nativeAdViewfromPublisher");
                    Object object4 = viewGroup.getParent();
                    n20 = 1;
                    float f11 = Float.MIN_VALUE;
                    n19 = 0;
                    float f12 = 0.0f;
                    string5 = null;
                    if (object4 != null) {
                        object4 = new String[]{"x"};
                        n3 = 6;
                        f8 = 8.4E-45f;
                        object4 = StringsKt.a0(string2, (String[])object4, false, 0, n3);
                        Utility utility = Utility.INSTANCE;
                        string4 = (String)object4.get(0);
                        f7 = Float.parseFloat(string4);
                        n18 = utility.convertDpToPixel(f7);
                        object4 = (String)object4.get(n20);
                        f5 = Float.parseFloat((String)object4);
                        n17 = utility.convertDpToPixel(f5);
                    } else {
                        n17 = 0;
                        f5 = 0.0f;
                        object4 = null;
                        n18 = 0;
                        f7 = 0.0f;
                        string4 = null;
                    }
                    if (object2 != null) {
                        Boolean bl3 = b2.y();
                        Boolean bl4 = Boolean.TRUE;
                        n3 = (int)(Intrinsics.areEqual(bl3, bl4) ? 1 : 0);
                    } else {
                        n3 = 0;
                        f8 = 0.0f;
                        Object var14_24 = null;
                    }
                    if (n3 != 0) {
                        void var20_65;
                        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object2, ": getContainerSizeIntArray: Vertical Ad so considering Device width and Height");
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        object4 = Utility.INSTANCE;
                        Context context = b2.Y();
                        Object[] objectArray = ((Utility)object4).getScreenHeightAndWidth(context);
                        string4 = (String)tp_2.A(objectArray);
                        String string6 = "0";
                        if (string4 == null) {
                            string4 = string6;
                        }
                        n18 = Integer.parseInt(string4);
                        String string7 = (String)tp_2.E(n20, objectArray);
                        if (string7 != null) {
                            String string8 = string7;
                        }
                        f8 = Integer.parseInt((String)var20_65);
                        n3 = ((Utility)object4).convertDpToPixel(f8);
                        f7 = n18;
                        n17 = ((Utility)object4).convertDpToPixel(f7);
                        n18 = n3;
                    }
                    if (object2 != null) {
                        ViewGroup viewGroup3 = b2.A();
                    } else {
                        n16 = 0;
                        Object var20_68 = null;
                    }
                    String string9 = "message";
                    if (var20_69 != null && (n16 = Intrinsics.areEqual(bl2 = b2.y(), object3 = Boolean.FALSE)) != 0) {
                        object4 = b2.A();
                        if (object4 != null) {
                            n18 = n17 = object4.getWidth();
                        } else {
                            n18 = 0;
                            f7 = 0.0f;
                            string4 = null;
                        }
                        object4 = b2.A();
                        if (object4 != null) {
                            n17 = object4.getHeight();
                        } else {
                            n17 = 0;
                            f5 = 0.0f;
                            object4 = null;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        object3 = b2.P();
                        stringBuilder.append((String)object3);
                        stringBuilder.append(": AdContainer height is :getContainerSizeIntArray ");
                        stringBuilder.append(n17);
                        object3 = " Width is : ";
                        stringBuilder.append((String)object3);
                        stringBuilder.append(n18);
                        char c2 = ' ';
                        f6 = 4.5E-44f;
                        stringBuilder.append(c2);
                        Intrinsics.checkNotNullParameter(stringBuilder.toString(), string9);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                        if (n18 > 0 || n17 > 0) {
                            n17 = 0;
                            f5 = 0.0f;
                            object4 = null;
                            n18 = 0;
                            f7 = 0.0f;
                            string4 = null;
                        }
                    }
                    Utility utility = Utility.INSTANCE;
                    f6 = 970.0f;
                    n15 = utility.convertDpToPixel(f6);
                    float f14 = 728.0f;
                    n14 = utility.convertDpToPixel(f14);
                    float f15 = 600.0f;
                    n10 = utility.convertDpToPixel(f15);
                    float f16 = 320.0f;
                    n8 = utility.convertDpToPixel(f16);
                    float f17 = 300.0f;
                    n7 = utility.convertDpToPixel(f17);
                    float f18 = 250.0f;
                    n4 = utility.convertDpToPixel(f18);
                    f8 = 160.0f;
                    n3 = utility.convertDpToPixel(f8);
                    f11 = 100.0f;
                    n20 = utility.convertDpToPixel(f11);
                    f12 = 90.0f;
                    n19 = utility.convertDpToPixel(f12);
                    string3 = string9;
                    int n21 = 1112014848;
                    float f19 = 50.0f;
                    n16 = utility.convertDpToPixel(f19);
                    if (n18 <= 0 || n17 <= 0) break block44;
                    Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_970x250;
                    string9 = constants$DynamicDisplaySize.getDynamicSize();
                    n21 = (int)(Intrinsics.areEqual(object, string9) ? 1 : 0);
                    if (n21 != 0) {
                        if (n15 <= n18 && n4 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n15;
                            int n22 = 1;
                            nArray[n22] = n4;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string9 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                    n21 = (int)(Intrinsics.areEqual(object, string9) ? 1 : 0);
                    if (n21 != 0) {
                        if (n15 <= n18 && n19 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n15;
                            int n24 = 1;
                            nArray[n24] = n19;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string9 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                    n21 = (int)(Intrinsics.areEqual(object, string9) ? 1 : 0);
                    if (n21 != 0) {
                        if (n14 <= n18 && n19 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n14;
                            int n25 = 1;
                            nArray[n25] = n19;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string5 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                    n19 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                    if (n19 != 0) {
                        if (n8 <= n18 && n20 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n8;
                            int n26 = 1;
                            nArray[n26] = n20;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    String string10 = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                    n20 = (int)(Intrinsics.areEqual(object, string10) ? 1 : 0);
                    if (n20 != 0) {
                        if (n8 <= n18 && n16 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n8;
                            int n27 = 1;
                            nArray[n27] = n16;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string10 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                    n20 = (int)(Intrinsics.areEqual(object, string10) ? 1 : 0);
                    if (n20 != 0) {
                        if (n7 <= n18 && n10 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n7;
                            int n28 = 1;
                            nArray[n28] = n10;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string10 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                    n20 = (int)(Intrinsics.areEqual(object, string10) ? 1 : 0);
                    if (n20 != 0) {
                        if (n7 <= n18 && n4 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n7;
                            int n29 = 1;
                            nArray[n29] = n4;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                        int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                        return var14_56;
                    }
                    string10 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                    n20 = (int)(Intrinsics.areEqual(object, string10) ? 1 : 0);
                    if (n20 != 0) {
                        if (n7 <= n18 && n16 <= n17) {
                            int[] nArray = new int[2];
                            object = null;
                            nArray[0] = n7;
                            int n30 = 1;
                            nArray[n30] = n16;
                            return var14_56;
                        }
                        object = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                        try {
                            int[] nArray = b.b((String)object, viewGroup2, (com.jio.jioads.common.b)object2);
                            return var14_56;
                        }
                        catch (Throwable throwable) {
                            Throwable throwable2 = throwable;
                            throw throwable;
                        }
                    }
                    String string11 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                    int n32 = Intrinsics.areEqual(object, string11);
                    if (n32 == 0 || n3 > n18 || n10 > n17) break block45;
                    n32 = 2;
                    object = new int[n32];
                    Object var4_8 = null;
                    object[0] = n3;
                    int n34 = 1;
                    object[n34] = n10;
                    break block46;
                }
                Boolean bl5 = Boolean.FALSE;
                Object object5 = object2 != null ? (object = b2.a()) : null;
                Object object6 = object2 != null ? (object = b2.m0()) : null;
                object = b.a(bl5, null, bl5, (List)object5, null, null, null, null, (String)object6);
                StringBuilder stringBuilder = new StringBuilder();
                object2 = object2 != null ? b2.P() : null;
                stringBuilder.append((String)object2);
                stringBuilder.append(": selected displayDisplayAdSize is : ");
                stringBuilder.append((String)object);
                String string12 = stringBuilder.toString();
                object2 = string3;
                Intrinsics.checkNotNullParameter(string12, string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                String string13 = Constants$DynamicDisplaySize.SIZE_970x250.getDynamicSize();
                int n35 = Intrinsics.areEqual(object, string13);
                if (n35 != 0) {
                    n35 = 2;
                    int[] nArray = new int[n35];
                    object2 = null;
                    nArray[0] = n15;
                    n17 = 1;
                    f5 = Float.MIN_VALUE;
                    nArray[n17] = n4;
                    return var14_56;
                }
                n35 = 2;
                object2 = null;
                n17 = 1;
                f5 = Float.MIN_VALUE;
                string4 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                n18 = (int)(Intrinsics.areEqual(object, string4) ? 1 : 0);
                if (n18 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n15;
                    nArray[n17] = n19;
                    return var14_56;
                }
                string4 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                n18 = (int)(Intrinsics.areEqual(object, string4) ? 1 : 0);
                if (n18 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n14;
                    nArray[n17] = n19;
                    return var14_56;
                }
                string5 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                n19 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                if (n19 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n8;
                    nArray[n17] = n20;
                    return var14_56;
                }
                String string14 = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                n20 = (int)(Intrinsics.areEqual(object, string14) ? 1 : 0);
                if (n20 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n8;
                    nArray[n17] = n16;
                    return var14_56;
                }
                string14 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                n20 = (int)(Intrinsics.areEqual(object, string14) ? 1 : 0);
                if (n20 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n7;
                    nArray[n17] = n10;
                    return var14_56;
                }
                string14 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                n20 = (int)(Intrinsics.areEqual(object, string14) ? 1 : 0);
                if (n20 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n7;
                    nArray[n17] = n4;
                    return var14_56;
                }
                string14 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                n20 = (int)(Intrinsics.areEqual(object, string14) ? 1 : 0);
                if (n20 != 0) {
                    int[] nArray = new int[n35];
                    nArray[0] = n7;
                    nArray[n17] = n16;
                    return var14_56;
                }
                string14 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                boolean bl6 = Intrinsics.areEqual(object, string14);
                if (!bl6) break block45;
                object = new int[n35];
                object[0] = n3;
                object[n17] = n10;
            }
            Object object7 = object;
            return var14_56;
        }
        n3 = 0;
        return var14_56;
    }
}

