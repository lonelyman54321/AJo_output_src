/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFj1qSDK$AFa1uSDK;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1vSDK$AFa1ySDK;
import com.appsflyer.internal.AFj1xSDK;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AFj1vSDK
extends AFi1cSDK {
    private final AFj1xSDK areAllFieldsValid;
    private final Runnable component4;
    private String copy;
    private final AFd1qSDK getCurrencyIso4217Code;
    private final ExecutorService getRevenue;

    /*
     * Enabled aggressive block sorting
     */
    public AFj1vSDK(AFd1qSDK object, ExecutorService executorService, AFj1xSDK aFj1xSDK, Runnable runnable2, Runnable runnable3) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(executorService, (String)object2);
        Intrinsics.checkNotNullParameter((Object)aFj1xSDK, (String)object2);
        Intrinsics.checkNotNullParameter(runnable2, (String)object2);
        Intrinsics.checkNotNullParameter(runnable3, (String)object2);
        object2 = AFj1qSDK$AFa1uSDK.getMonetizationNetwork;
        int n3 = aFj1xSDK.ordinal();
        Object object3 = object2[n3];
        n3 = 1;
        if (object3 != n3) {
            n3 = 2;
            if (object3 != n3) {
                n3 = 3;
                if (object3 != n3) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object2 = "facebook_lite";
            } else {
                object2 = "instagram";
            }
        } else {
            object2 = "facebook";
        }
        super("app", (String)object2, (AFd1qSDK)object, runnable2);
        this.getCurrencyIso4217Code = object;
        this.getRevenue = executorService;
        this.areAllFieldsValid = aFj1xSDK;
        this.component4 = runnable3;
    }

    private final boolean AFAdRevenueData(Context object) {
        AFj1xSDK aFj1xSDK = this.areAllFieldsValid;
        int[] nArray = AFj1vSDK$AFa1ySDK.getMediationNetwork;
        int n3 = aFj1xSDK.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    return AFj1vSDK.component4(object);
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            return AFj1vSDK.getCurrencyIso4217Code(object);
        }
        return AFj1vSDK.getRevenue(object);
    }

    public static /* synthetic */ void a(AFj1vSDK aFj1vSDK, Context context) {
        AFj1vSDK.getRevenue(aFj1vSDK, context);
    }

    private static boolean component4(Context context) {
        context = context.getPackageManager();
        String string2 = "com.facebook.lite.provider.InstallReferrerProvider";
        return (context = context.resolveContentProvider(string2, 0)) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        context = context.getPackageManager();
        String string2 = "com.instagram.contentprovider.InstallReferrerProvider";
        return (context = context.resolveContentProvider(string2, 0)) != null;
    }

    private final boolean getMonetizationNetwork(Context context) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block16: {
            Object object5;
            block15: {
                int n3;
                int n4;
                int n7;
                String string2;
                Object object6;
                int n8;
                boolean bl2 = this.getMonetizationNetwork();
                if (!bl2) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK = AFh1vSDK.toString;
                    AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Referrer collection disallowed by counter.", false, 4, null);
                    return false;
                }
                object5 = this.getCurrencyIso4217Code.getRevenue("com.facebook.sdk.ApplicationId");
                object4 = "fb";
                object3 = null;
                if (object5 != null) {
                    object5 = StringsKt.U((String)object5, (String)object4);
                } else {
                    bl2 = false;
                    object5 = null;
                }
                if (object5 == null || (n8 = ((String)object5).length()) == 0) {
                    object2 = AFLogger.INSTANCE;
                    object6 = AFh1vSDK.toString;
                    string2 = "Facebook app id Manifest metadata is not found.";
                    n7 = 0;
                    n4 = 4;
                    AFh1uSDK.d$default(object2, object6, string2, false, n4, null);
                    bl2 = false;
                    object5 = null;
                }
                if (object5 != null) break block15;
                object5 = this.getCurrencyIso4217Code;
                object = "facebook_application_id";
                if ((object5 = ((AFd1qSDK)object5).AFAdRevenueData((String)object)) != null) {
                    object5 = StringsKt.U((String)object5, (String)object4);
                } else {
                    bl2 = false;
                    object5 = null;
                }
                if (object5 == null || (n8 = ((String)object5).length()) == 0) {
                    object2 = AFLogger.INSTANCE;
                    object6 = AFh1vSDK.toString;
                    string2 = "Facebook app id string resource is not found.";
                    n7 = 0;
                    n4 = 4;
                    AFh1uSDK.d$default(object2, object6, string2, false, n4, null);
                    bl2 = false;
                    object5 = null;
                }
                if (object5 != null) break block15;
                object5 = this.getCurrencyIso4217Code;
                object = "com.appsflyer.FacebookApplicationId";
                if ((object5 = ((AFd1qSDK)object5).getRevenue((String)object)) != null) {
                    object5 = StringsKt.U((String)object5, (String)object4);
                } else {
                    bl2 = false;
                    object5 = null;
                }
                if (object5 == null || (n3 = ((String)object5).length()) == 0) {
                    object = AFLogger.INSTANCE;
                    object2 = AFh1vSDK.toString;
                    object6 = "AF Facebook app id Manifest metadata is not found.";
                    string2 = null;
                    n7 = 4;
                    n4 = 0;
                    AFh1uSDK.d$default((AFh1uSDK)object, (AFh1vSDK)((Object)object2), (String)object6, false, n7, null);
                    bl2 = false;
                    object5 = null;
                }
                if (object5 == null) break block16;
            }
            object3 = object5;
        }
        this.copy = object3;
        if (object3 == null) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.toString;
            AFh1uSDK.d$default((AFh1uSDK)object, (AFh1vSDK)((Object)object2), "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        boolean bl3 = this.AFAdRevenueData(context);
        if (!bl3) {
            object4 = AFLogger.INSTANCE;
            object3 = AFh1vSDK.toString;
            AFh1uSDK.d$default((AFh1uSDK)object4, (AFh1vSDK)((Object)object3), "Referrer collection disallowed by missing content providers.", false, 4, null);
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void getRevenue(AFj1vSDK var0, Context var1_1) {
        block48: {
            block47: {
                block52: {
                    block51: {
                        block40: {
                            block53: {
                                block46: {
                                    block50: {
                                        block44: {
                                            block43: {
                                                block42: {
                                                    block41: {
                                                        block39: {
                                                            block35: {
                                                                block49: {
                                                                    block36: {
                                                                        block37: {
                                                                            block38: {
                                                                                var2_2 = var0;
                                                                                var3_3 /* !! */  = var1_1;
                                                                                var4_10 = 1;
                                                                                var5_11 = " provider";
                                                                                var6_12 = "actual_timestamp";
                                                                                var7_13 = "install_referrer";
                                                                                var8_14 = "is_ct";
                                                                                var9_15 = "Error while collecting Meta Install Referrer for ";
                                                                                var10_16 = "Collected ";
                                                                                var11_17 /* !! */  = "No such column, ";
                                                                                var12_18 = "content://com.facebook.katana.provider.InstallReferrerProvider/";
                                                                                var13_19 = "content://com.instagram.contentprovider.InstallReferrerProvider/";
                                                                                var14_20 = "content://com.facebook.lite.provider.InstallReferrerProvider/";
                                                                                var15_21 = "";
                                                                                Intrinsics.checkNotNullParameter(var0, var15_21);
                                                                                Intrinsics.checkNotNullParameter(var1_1, var15_21);
                                                                                var0.component1 = var16_22 = System.currentTimeMillis();
                                                                                var18_23 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
                                                                                var0.component2 = var18_23;
                                                                                var18_23 = new AFj1sSDK$1(var0);
                                                                                var0.addObserver((Observer)var18_23);
                                                                                var18_23 = var0.copy;
                                                                                Intrinsics.checkNotNull(var18_23);
                                                                                var19_24 = null;
                                                                                try {
                                                                                    var20_25 = var0.areAllFieldsValid;
                                                                                    var21_26 /* !! */  = AFj1vSDK$AFa1ySDK.getMediationNetwork;
                                                                                    var22_27 = var20_25.ordinal();
                                                                                    var22_27 = var21_26 /* !! */ [var22_27];
                                                                                    var23_28 /* !! */  = var9_15;
                                                                                    var24_29 = 2;
                                                                                    if (var22_27 == var4_10) break block35;
                                                                                    if (var22_27 == var24_29) break block36;
                                                                                    var25_30 = 3;
                                                                                    if (var22_27 != var25_30) break block37;
                                                                                }
                                                                                catch (Throwable var3_8) {
                                                                                    var23_28 /* !! */  = var9_15;
                                                                                    ** continue;
                                                                                }
                                                                                try {
                                                                                    var25_30 = (int)AFj1vSDK.component4(var1_1);
                                                                                    if (var25_30 == 0) break block38;
                                                                                    var26_31 = AFLogger.INSTANCE;
                                                                                    var27_32 = AFh1vSDK.toString;
                                                                                    var28_33 = "Found Facebook Lite content provider";
                                                                                    var29_34 = 0;
                                                                                    var30_35 = 4;
                                                                                    AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                                                                    var12_18 = new StringBuilder(var14_20);
                                                                                    var12_18.append((String)var18_23);
                                                                                    var12_18 = var12_18.toString();
                                                                                    var12_18 = Uri.parse((String)var12_18);
                                                                                    break block39;
                                                                                }
                                                                                catch (Throwable var3_4) lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    while (true) {
                                                                                        var26_31 = var3_5;
                                                                                        var31_36 = false;
                                                                                        var13_19 = null;
                                                                                        break block40;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            var26_31 = AFLogger.INSTANCE;
                                                                            var27_32 = AFh1vSDK.toString;
                                                                            var28_33 = "Facebook Lite content provider not found";
                                                                            var29_34 = 0;
                                                                            var30_35 = 4;
                                                                            AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
lbl67:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                var25_30 = 0;
                                                                                var12_18 = null;
                                                                                break block39;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var3_3 /* !! */  = new NoWhenBranchMatchedException();
                                                                        throw var3_3 /* !! */ ;
                                                                    }
                                                                    var25_30 = (int)AFj1vSDK.getCurrencyIso4217Code(var1_1);
                                                                    if (var25_30 == 0) break block49;
                                                                    var26_31 = AFLogger.INSTANCE;
                                                                    var27_32 = AFh1vSDK.toString;
                                                                    var28_33 = "Found Instagram content provider";
                                                                    var29_34 = 0;
                                                                    var30_35 = 4;
                                                                    AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                                                    var12_18 = new StringBuilder((String)var13_19);
                                                                    var12_18.append((String)var18_23);
                                                                    var12_18 = var12_18.toString();
                                                                    var12_18 = Uri.parse((String)var12_18);
                                                                    break block39;
                                                                }
                                                                var26_31 = AFLogger.INSTANCE;
                                                                var27_32 = AFh1vSDK.toString;
                                                                var28_33 = "Instagram content provider not found";
                                                                var29_34 = 0;
                                                                var30_35 = 4;
                                                                AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                                                ** GOTO lbl67
                                                            }
                                                            var31_37 = AFj1vSDK.getRevenue(var1_1);
                                                            if (var31_37) {
                                                                var26_31 = AFLogger.INSTANCE;
                                                                var27_32 = AFh1vSDK.toString;
                                                                var28_33 = "Found Facebook content provider";
                                                                var29_34 = 0;
                                                                var30_35 = 4;
                                                                AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                                                var13_19 = new StringBuilder((String)var12_18);
                                                                var13_19.append((String)var18_23);
                                                                var12_18 = var13_19.toString();
                                                                var12_18 = Uri.parse((String)var12_18);
                                                            } else {
                                                                var26_31 = AFLogger.INSTANCE;
                                                                var27_32 = AFh1vSDK.toString;
                                                                var28_33 = "Facebook content provider not found";
                                                                var29_34 = 0;
                                                                var30_35 = 4;
                                                                AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                                                ** continue;
                                                            }
                                                        }
                                                        if (var12_18 == null) break block48;
                                                        var13_19 = var1_1.getContentResolver();
                                                        var13_19 = var13_19.acquireUnstableContentProviderClient((Uri)var12_18);
                                                        try {
                                                            var32_38 = new String[]{var7_13, var8_14, var6_12};
                                                            if (var13_19 == null) break block41;
                                                            var12_18 = var13_19.query((Uri)var12_18, var32_38, null, null, null);
                                                            break block42;
                                                        }
                                                        catch (Throwable var3_6) {
                                                            var26_31 = var3_6;
                                                            break block40;
                                                        }
                                                    }
                                                    var25_30 = 0;
                                                    var12_18 = null;
                                                }
                                                if (var12_18 == null) ** GOTO lbl-1000
                                                try {
                                                    var33_39 = var12_18.moveToFirst();
                                                    if (var33_39 != 0) {
                                                        var34_40 = var12_18.getColumnIndex((String)var7_13);
                                                        if (var34_40 == (var33_39 = -1)) break block43;
                                                        var7_13 = var12_18.getString(var34_40);
                                                        break block44;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                catch (Throwable var3_7) {
                                                    var26_31 = var3_7;
                                                    var19_24 = var12_18;
                                                    break block40;
                                                }
                                            }
                                            var26_31 = AFLogger.INSTANCE;
                                            var27_32 = AFh1vSDK.toString;
                                            var7_13 = var2_2.areAllFieldsValid;
                                            var18_23 = new StringBuilder(var11_17 /* !! */ );
                                            var18_23.append(var7_13);
                                            var18_23.append(var5_11);
                                            var28_33 = var18_23.toString();
                                            var29_34 = 0;
                                            var30_35 = 4;
                                            AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                            var34_40 = 0;
                                            var7_13 = null;
                                        }
                                        if (var7_13 != null) {
                                            var26_31 = AFLogger.INSTANCE;
                                            var27_32 = AFh1vSDK.toString;
                                            var11_17 /* !! */  = var2_2.areAllFieldsValid;
                                            var18_23 = new StringBuilder((String)var10_16);
                                            var18_23.append((Object)var11_17 /* !! */ );
                                            var10_16 = " attribution data.";
                                            var18_23.append((String)var10_16);
                                            var28_33 = var18_23.toString();
                                            var29_34 = 0;
                                            var30_35 = 4;
                                            AFh1uSDK.d$default((AFh1uSDK)var26_31, var27_32, var28_33, false, var30_35, null);
                                            var10_16 = var2_2.getMediationNetwork;
                                            Intrinsics.checkNotNullExpressionValue(var10_16, var15_21);
                                            var11_17 /* !! */  = "response";
                                            var18_23 = "OK";
                                            var10_16.put(var11_17 /* !! */ , var18_23);
                                            var10_16 = var2_2.getMediationNetwork;
                                            Intrinsics.checkNotNullExpressionValue(var10_16, var15_21);
                                            var11_17 /* !! */  = "referrer";
                                            var10_16.put(var11_17 /* !! */ , var7_13);
                                            var35_41 = var12_18.getColumnIndex((String)var6_12);
                                            if (var35_41 != var33_39) {
                                                var36_42 = var12_18.getLong(var35_41);
                                                var6_12 = var36_42;
                                            } else {
                                                var35_41 = 0;
                                                var6_12 = null;
                                            }
                                            if (var6_12 != null) {
                                                var36_42 = var6_12.longValue();
                                                var10_16 = var2_2.getMediationNetwork;
                                                var11_17 /* !! */  = "click_ts";
                                                var6_12 = var36_42;
                                                var10_16.put(var11_17 /* !! */ , var6_12);
                                            }
                                            if ((var35_41 = var12_18.getColumnIndex((String)var8_14)) != var33_39) {
                                                var35_41 = var12_18.getInt(var35_41);
                                                var19_24 = var35_41;
                                            }
                                            if (var19_24 != null) {
                                                var35_41 = var19_24.intValue();
                                                var6_12 = var35_41;
                                                var7_13 = new Pair(var8_14, var6_12);
                                                var6_12 = new Pair[var4_10];
                                                var8_14 = null;
                                                var6_12[0] = var7_13;
                                                var6_12 = fh1_2.j((Pair[])var6_12);
                                                var7_13 = var2_2.getMediationNetwork;
                                                var8_14 = "meta_custom";
                                                var7_13.put(var8_14, var6_12);
                                            }
                                            var6_12 = var2_2.areAllFieldsValid;
                                            var35_41 = var6_12.ordinal();
                                            if ((var35_41 = var21_26 /* !! */ [var35_41]) != var4_10) {
                                                if (var35_41 != var24_29) {
                                                    var4_10 = 3;
                                                    if (var35_41 != var4_10) {
                                                        var3_3 /* !! */  = new NoWhenBranchMatchedException();
                                                        throw var3_3 /* !! */ ;
                                                    }
                                                    var38_43 = "com.facebook.lite";
                                                } else {
                                                    var38_43 = "com.instagram.android";
                                                }
                                            } else {
                                                var38_43 = "com.facebook.katana";
                                            }
                                            var6_12 = var2_2.getMediationNetwork;
                                            Intrinsics.checkNotNullExpressionValue(var6_12, var15_21);
                                            var7_13 = "api_ver";
                                            var39_45 = AFb1qSDK.AFAdRevenueData(var3_3 /* !! */ , var38_43);
                                            var8_14 = var39_45;
                                            var6_12.put(var7_13, var8_14);
                                            var6_12 = var2_2.getMediationNetwork;
                                            Intrinsics.checkNotNullExpressionValue(var6_12, var15_21);
                                            var7_13 = "api_ver_name";
                                            var3_3 /* !! */  = AFb1qSDK.getMediationNetwork(var3_3 /* !! */ , var38_43);
                                            var6_12.put(var7_13, var3_3 /* !! */ );
                                        }
                                        var12_18.close();
                                        var41_46 = Build.VERSION.SDK_INT;
                                        var4_10 = 24;
                                        if (var41_46 < var4_10) break block50;
                                        if (var13_19 == null) break block48;
                                        break block51;
                                    }
                                    if (var13_19 == null) break block48;
                                    break block52;
lbl-1000:
                                    // 2 sources

                                    {
                                        var6_12 = AFLogger.INSTANCE;
                                        var7_13 = AFh1vSDK.toString;
                                        var8_14 = "Content provider returned no data";
                                        var11_17 /* !! */  = null;
                                        var24_29 = 0;
                                        var9_15 = null;
                                        var42_49 = 4;
                                        AFh1uSDK.d$default((AFh1uSDK)var6_12, (AFh1vSDK)var7_13, (String)var8_14, false, var42_49, null);
                                        if (var12_18 == null) break block46;
                                    }
                                    var12_18.close();
                                }
                                if ((var41_47 = Build.VERSION.SDK_INT) < (var4_10 = 24)) break block53;
                                if (var13_19 == null) break block48;
                                break block51;
                            }
                            if (var13_19 == null) break block48;
                            break block52;
                        }
                        try {
                            var21_26 /* !! */  = (int[])AFLogger.INSTANCE;
                            var3_5 = AFh1vSDK.toString;
                            var38_44 /* !! */  = var2_2.areAllFieldsValid;
                            var38_44 /* !! */  = var38_44 /* !! */ .name();
                            var7_13 = var23_28 /* !! */ ;
                            var6_12 = new StringBuilder(var23_28 /* !! */ );
                            var6_12.append((String)var38_44 /* !! */ );
                            var6_12.append(var5_11);
                            var43_50 = var6_12.toString();
                            var30_35 = 0;
                            var29_34 = 120;
                            var27_32 = null;
                            var28_33 = null;
                            var23_28 /* !! */  = var3_5;
                            AFh1uSDK.e$default((AFh1uSDK)var21_26 /* !! */ , var3_5, var43_50, (Throwable)var26_31, false, false, false, false, var29_34, null);
                            if (var19_24 != null) {
                            }
                            break block47;
                        }
                        catch (Throwable var3_9) {
                            if (var19_24 != null) {
                                var19_24.close();
                            }
                            if ((var44_51 = Build.VERSION.SDK_INT) >= (var4_10 = 24)) {
                                if (var13_19 == null) throw var3_9;
                                var13_19.release();
                                throw var3_9;
                            }
                            if (var13_19 == null) throw var3_9;
                            var13_19.release();
                            throw var3_9;
                        }
                    }
lbl306:
                    // 2 sources

                    while (true) {
                        var13_19.release();
                        break block48;
                        break;
                    }
                }
                while (true) {
                    var13_19.release();
                    break block48;
                    break;
                }
                var19_24.close();
            }
            if ((var41_48 = Build.VERSION.SDK_INT) >= (var4_10 = 24)) {
                if (var13_19 != null) {
                    ** continue;
                }
            } else if (var13_19 != null) ** continue;
        }
        var0.getRevenue();
        var2_2.component4.run();
    }

    private static boolean getRevenue(Context context) {
        context = context.getPackageManager();
        String string2 = "com.facebook.katana.provider.InstallReferrerProvider";
        return (context = context.resolveContentProvider(string2, 0)) != null;
    }

    public final void getMediationNetwork(Context context) {
        Object object = "";
        Intrinsics.checkNotNullParameter(context, (String)object);
        boolean bl2 = this.getMonetizationNetwork(context);
        if (!bl2) {
            this.component4.run();
            return;
        }
        object = this.getRevenue;
        tw0_2 tw0_22 = new tw0_2(2, this, context);
        object.execute(tw0_22);
    }
}

