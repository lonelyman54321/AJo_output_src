/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewConfiguration
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1bSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1tSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

public class AFf1eSDK
extends AFf1oSDK {
    private static final AFf1zSDK[] AFInAppEventParameterName;
    private final AFd1nSDK AFKeystoreWrapper;
    public final AFa1oSDK component3;
    private final AFf1aSDK copy;
    private final AFe1iSDK copydefault;
    protected final AFg1kSDK equals;
    private final AFd1qSDK hashCode;
    protected final AFd1rSDK toString;
    private final AFg1tSDK valueOf;

    static {
        AFf1zSDK aFf1zSDK = AFf1zSDK.component3;
        aFf1zSDK = AFf1zSDK.areAllFieldsValid;
        aFf1zSDK = AFf1zSDK.hashCode;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK, aFf1zSDK, aFf1zSDK};
        AFInAppEventParameterName = aFf1zSDKArray;
    }

    public AFf1eSDK(AFa1oSDK aFa1oSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1oSDK, aFd1kSDK, null);
    }

    public AFf1eSDK(AFa1oSDK object, AFd1kSDK object2, String object3) {
        block5: {
            AFf1zSDK aFf1zSDK = object.getCurrencyIso4217Code();
            int n3 = 2;
            AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[n3];
            AFf1zSDK aFf1zSDK2 = AFf1zSDK.getRevenue;
            aFf1zSDKArray[0] = aFf1zSDK2;
            aFf1zSDK2 = AFf1zSDK.AFAdRevenueData;
            int n4 = 1;
            aFf1zSDKArray[n4] = aFf1zSDK2;
            super(aFf1zSDK, aFf1zSDKArray, (AFd1kSDK)object2, (String)object3);
            this.component3 = object;
            object = object2.AFInAppEventType();
            this.copydefault = object;
            object = object2.getRevenue();
            this.toString = object;
            object = object2.component2();
            this.copy = object;
            object = object2.values();
            this.AFKeystoreWrapper = object;
            object = object2.getMediationNetwork();
            this.hashCode = object;
            object = object2.component1();
            this.equals = object;
            object = object2.v();
            this.valueOf = object;
            object = AFInAppEventParameterName;
            int n7 = ((AFf1zSDK[])object).length;
            for (int i3 = 0; i3 < n7; i3 += n4) {
                aFf1zSDK = this.getMonetizationNetwork;
                object3 = object[i3];
                if (aFf1zSDK != object3) {
                    continue;
                }
                break block5;
            }
            object = this.component3;
            int n8 = object.component1;
            object2 = this.getMonetizationNetwork;
            if (n8 <= 0) {
                object = AFf1zSDK.getMonetizationNetwork;
                if (object2 != object) {
                    this.getRevenue.add(object);
                    return;
                }
            } else {
                object = AFf1zSDK.getMonetizationNetwork;
                object2 = this.getCurrencyIso4217Code;
                object2.add(object);
            }
        }
    }

    public static Map component1(AFa1oSDK object) {
        HashMap hashMap = ((AFa1oSDK)object).getMonetizationNetwork();
        String string2 = "meta";
        if ((hashMap = (Map)hashMap.get(string2)) == null) {
            hashMap = new HashMap();
            object = ((AFa1oSDK)object).getMonetizationNetwork();
            object.put(string2, hashMap);
        }
        return hashMap;
    }

    public void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK);
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    public void component2(AFa1oSDK aFa1oSDK) {
        this.equals.AFAdRevenueData(aFa1oSDK);
    }

    public boolean copydefault() {
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void getCurrencyIso4217Code(AFa1oSDK var1_1) {
        block12: {
            block13: {
                var2_3 = 1;
                var3_4 /* !! */  = null;
                try {
                    this.getMonetizationNetwork((AFa1oSDK)var1_1);
                    this.getMediationNetwork((AFa1oSDK)var1_1);
                    this.AFAdRevenueData((AFa1oSDK)var1_1);
                    this.getRevenue((AFa1oSDK)var1_1);
                    this.component2((AFa1oSDK)var1_1);
                    ** GOTO lbl19
                }
                catch (Throwable var4_5) {
                    block11: {
                        var5_7 /* !! */  = var4_5;
                        try {
                            var6_8 = AFLogger.INSTANCE;
                            var7_9 /* !! */  = AFh1vSDK.component4;
                            var8_10 /* !! */  = "Error while collecting payload params";
                            var9_11 = true;
                            var10_12 = true;
                            var6_8.e((AFh1vSDK)var7_9 /* !! */ , var8_10 /* !! */ , var4_5, var10_12, var9_11, false);
lbl19:
                            // 2 sources

                            var11_13 = var1_1.areAllFieldsValid();
                            if (var11_13 == 0) break block11;
                            var4_6 = this.component1;
                            var6_8 = var1_1.getMonetizationNetwork();
                            var12_14 = 2;
                            var7_9 /* !! */  = new Object[var12_14];
                            var7_9 /* !! */ [0] = var4_6;
                            var7_9 /* !! */ [var2_3] = var6_8;
                            var11_13 = System.identityHashCode(var4_6);
                            var13_15 = 896699170;
                            var14_16 = -896699168;
                            var4_6 = AFg1wSDK.getCurrencyIso4217Code(var7_9 /* !! */ , var13_15, var14_16, var11_13);
                            var4_6 = (Map)var4_6;
                            var1_1.getRevenue((Map)var4_6);
                            var4_6 = this.component1;
                            var6_8 = var1_1.getMonetizationNetwork();
                            var4_6 = var4_6.getCurrencyIso4217Code((Map)var6_8);
                            var1_1.getRevenue((Map)var4_6);
                            var4_6 = this.hashCode;
                            var6_8 = "com.appsflyer.security.enable";
                            var11_13 = (int)var4_6.AFAdRevenueData((String)var6_8, false);
                            if (var11_13 == 0) break block11;
                            AFg1wSDK.getCurrencyIso4217Code((AFa1oSDK)var1_1);
                        }
                        catch (Throwable var1_2) {
                            var6_8 = var1_2;
                            break block12;
                        }
                    }
                    if ((var11_13 = var1_1.component2()) != 0) {
                        var4_6 = this.component1;
                        var4_6 = var4_6.getMediationNetwork();
                        var1_1.getRevenue((Map)var4_6);
                    }
                    if ((var13_15 = (var4_6 = this.getRevenue).contains(var6_8 = AFf1zSDK.equals)) == 0 && (var11_13 = (int)var4_6.contains(var6_8 = AFf1zSDK.getMonetizationNetwork)) == 0) {
                        var2_3 = 0;
                        var15_17 = null;
                    }
                    if ((var11_13 = this.component2()) != 0 && var2_3 != 0) {
                        var15_17 = this.toString;
                        var4_6 = "appsFlyerCount";
                        var2_3 = var15_17.getMediationNetwork((String)var4_6, 0);
                        var1_1.getMediationNetwork(var2_3);
                    }
                    if ((var2_3 = (int)var1_1.component3()) == 0) break block13;
                    var15_17 = AFf1eSDK.component1((AFa1oSDK)var1_1);
                    var4_6 = "host";
                    var6_8 = this.copydefault;
                    var8_10 /* !! */  = var6_8.AFAdRevenueData();
                    var6_8 = var6_8.getMediationNetwork();
                    var16_18 = AFe1iSDK.getCurrencyIso4217Code();
                    var5_7 /* !! */  = var16_18 != false ? AFe1fSDK.getCurrencyIso4217Code : AFe1fSDK.getRevenue;
                    var7_9 /* !! */  = new AFe1bSDK(var8_10 /* !! */ , (String)var6_8, (AFe1fSDK)var5_7 /* !! */ );
                    var6_8 = new JSONObject();
                    var8_10 /* !! */  = "name";
                    var5_7 /* !! */  = var7_9 /* !! */ .AFAdRevenueData;
                    var6_8.put(var8_10 /* !! */ , (Object)var5_7 /* !! */ );
                    var8_10 /* !! */  = var7_9 /* !! */ .getMediationNetwork;
                    var5_7 /* !! */  = AFe1fSDK.getCurrencyIso4217Code;
                }
                if (var8_10 /* !! */  != var5_7 /* !! */ ) {
                    var5_7 /* !! */  = "method";
                    var8_10 /* !! */  = var8_10 /* !! */ .getMonetizationNetwork;
                    var6_8.put((String)var5_7 /* !! */ , (Object)var8_10 /* !! */ );
                }
                if ((var8_10 /* !! */  = var7_9 /* !! */ .getMonetizationNetwork) != null && (var14_16 = (int)b.k(var8_10 /* !! */ )) == 0) {
                    var8_10 /* !! */  = "prefix";
                    var7_9 /* !! */  = var7_9 /* !! */ .getMonetizationNetwork;
                    var6_8.put(var8_10 /* !! */ , (Object)var7_9 /* !! */ );
                }
                var15_17.put(var4_6, var6_8);
            }
            if ((var2_3 = (int)(var15_17 = this.hashCode).AFAdRevenueData((String)(var4_6 = "AF_PREINSTALL_DISABLED"), false)) != 0) {
                var15_17 = AFf1eSDK.component1((AFa1oSDK)var1_1);
                var3_4 /* !! */  = "preinstall_disabled";
                var4_6 = Boolean.TRUE;
                var15_17.put(var3_4 /* !! */ , var4_6);
            }
            var15_17 = this.valueOf;
            var3_4 /* !! */  = var1_1.getMonetizationNetwork();
            var1_1 = var1_1.getCurrencyIso4217Code();
            var15_17.AFAdRevenueData((Map)var3_4 /* !! */ , (AFf1zSDK)var1_1);
            return;
        }
        var15_17 = AFLogger.INSTANCE;
        var3_4 /* !! */  = AFh1vSDK.component4;
        var15_17.e(var3_4 /* !! */ , "Error while preparing to send event", var1_2, true, true, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1tSDK getMediationNetwork(String var1_1) {
        block41: {
            block42: {
                block39: {
                    block38: {
                        block37: {
                            block36: {
                                block33: {
                                    block35: {
                                        block34: {
                                            block32: {
                                                var2_2 = this;
                                                var3_3 = 1;
                                                var4_4 = null;
                                                var5_5 /* !! */  = "Unexpected error";
                                                var6_6 = "JSON toString of eventParams map returns null";
                                                var7_7 = "*Non-printing character*";
                                                var8_8 = "\\p{C}";
                                                var9_9 = "";
                                                var10_10 = this.component3;
                                                this.getCurrencyIso4217Code((AFa1oSDK)var10_10);
                                                var10_10 = this.component3.getMonetizationNetwork();
                                                var11_25 = "meta";
                                                var12_26 = var10_10.containsKey(var11_25);
                                                if (var12_26) {
                                                    try {
                                                        var10_10 = this.copy;
                                                        var10_10 = var10_10.getCurrencyIso4217Code;
                                                        var10_10 = var10_10.getRevenue;
                                                        var10_10 = var10_10.getRevenue;
                                                        var10_10 = var10_10.getMonetizationNetwork;
                                                        var13_27 = var10_10.AFAdRevenueData;
                                                    }
                                                    catch (NullPointerException v0) {
                                                        var13_27 = 1.0;
                                                    }
                                                    var12_26 = AFa1oSDK.getRevenue(var13_27);
                                                    if (var12_26) {
                                                        var10_10 = var2_2.component3.getMonetizationNetwork();
                                                        var10_10.remove(var11_25);
                                                    }
                                                }
                                                var10_10 = var2_2.component3;
                                                var11_25 = var10_10.component4;
                                                var15_28 = var10_10.getMonetizationNetwork();
                                                var16_29 /* !! */  = new JSONObject(var15_28);
                                                var17_30 = var16_29 /* !! */ .toString();
                                                if (var17_30 == null) break block32;
                                                try {
                                                    var10_10 = var17_30.replaceAll(var8_8, var7_7);
                                                    break block33;
                                                }
                                                catch (Throwable var10_11) {
                                                    var19_33 = var16_29 /* !! */ ;
                                                    break block34;
                                                }
                                                catch (NullPointerException var10_12) {
                                                    break block35;
                                                }
                                            }
                                            var10_10 = new NullPointerException(var6_6);
                                            throw var10_10;
                                            catch (Throwable var10_13) {
                                                block40: {
                                                    var19_33 = var16_29 /* !! */ ;
                                                    break block40;
                                                    catch (NullPointerException var10_14) {}
                                                    ** GOTO lbl-1000
                                                    catch (Throwable var10_15) {
                                                        var20_35 = false;
                                                        var19_33 = null;
                                                    }
                                                }
                                                var17_30 = null;
                                            }
                                            catch (NullPointerException var10_16) {
                                                var16_29 /* !! */  = null;
                                            }
lbl-1000:
                                            // 2 sources

                                            {
                                                var17_30 = null;
                                                break block35;
                                            }
                                        }
                                        var18_31 /* !! */  = AFLogger.INSTANCE;
                                        var4_4 = AFh1vSDK.e;
                                        var18_31 /* !! */ .e((AFh1vSDK)var4_4, var5_5 /* !! */ , (Throwable)var10_10);
                                        var18_31 /* !! */  = var9_9;
                                        var16_29 /* !! */  = var19_33;
                                        break block41;
                                    }
                                    var21_37 = AFLogger.INSTANCE;
                                    var22_38 /* !! */  = AFh1vSDK.e;
                                    var19_34 = "JSONObject return null String object. Trying to create AFJsonObject.";
                                    var21_37.e(var22_38 /* !! */ , (String)var19_34, (Throwable)var10_10);
                                    var10_10 = new Object[var3_3];
                                    var10_10[0] = var15_28;
                                    var15_28 = AFa1vSDK.registerClient;
                                    var20_36 = '\u65bea316';
                                    var21_37 = (int)var20_36;
                                    var21_37 = var15_28.get(var21_37);
                                    if (var21_37 == null) {
                                        var23_39 = View.combineMeasuredStates((int)0, (int)0);
                                        var23_39 = 35 - var23_39;
                                        var24_40 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37;
                                        var20_36 = (char)TextUtils.getCapsMode((CharSequence)var9_9, (int)0, (int)0);
                                        var19_34 = AFa1vSDK.getRevenue(var23_39, var24_40, var20_36);
                                        var19_34 = (Class)var19_34;
                                        var21_37 = "AFAdRevenueData";
                                        var18_31 /* !! */  = new Class[var3_3];
                                        var22_38 /* !! */  = Map.class;
                                        var18_31 /* !! */ [0] = var22_38 /* !! */ ;
                                        var21_37 = var19_34.getMethod((String)var21_37, var18_31 /* !! */ );
                                        var3_3 = 1706992406;
                                        var18_31 /* !! */  = var3_3;
                                        var15_28.put(var18_31 /* !! */ , var21_37);
                                    }
                                    var21_37 = (Method)var21_37;
                                    var3_3 = 0;
                                    var18_31 /* !! */  = null;
                                    var10_10 = var21_37.invoke(null, (Object[])var10_10);
                                    var18_31 /* !! */  = var10_10;
                                    var18_31 /* !! */  = (String)var10_10;
                                    if (var18_31 /* !! */  == null) break block36;
                                    try {
                                        var10_10 = var18_31 /* !! */ .replaceAll(var8_8, var7_7);
                                        var17_30 = var18_31 /* !! */ ;
                                    }
                                    catch (Throwable var10_17) {
                                        var17_30 = var18_31 /* !! */ ;
                                        break block37;
                                    }
                                    catch (Exception var10_18) {
                                        var25_41 = var10_18;
                                        var17_30 = var18_31 /* !! */ ;
                                        break block38;
                                    }
                                    catch (NullPointerException var10_19) {
                                        var17_30 = var18_31 /* !! */ ;
                                        break block39;
                                    }
                                }
                                var18_31 /* !! */  = var10_10;
                                break block41;
                            }
                            var10_10 = new NullPointerException(var6_6);
                            throw var10_10;
                            catch (Throwable var10_20) {
                                try {
                                    var18_32 = var10_20.getCause();
                                    if (var18_32 == null) throw var10_20;
                                    throw var18_32;
                                }
                                catch (Throwable var10_21) {
                                }
                                catch (Exception var10_22) {
                                    var25_41 = var10_22;
                                    break block38;
                                }
                                catch (NullPointerException var10_23) {
                                    break block39;
                                }
                            }
                        }
                        var18_31 /* !! */  = AFLogger.INSTANCE;
                        var4_4 = AFh1vSDK.e;
                        var18_31 /* !! */ .e((AFh1vSDK)var4_4, var5_5 /* !! */ , (Throwable)var10_10);
                        break block42;
                    }
                    var21_37 = AFLogger.INSTANCE;
                    var22_38 /* !! */  = AFh1vSDK.e;
                    var26_42 = true;
                    var27_43 = "AFFinalizer: reflection init failed.";
                    var21_37.e(var22_38 /* !! */ , var27_43, var25_41, false, false, var26_42);
                    break block42;
                }
                var18_31 /* !! */  = AFLogger.INSTANCE;
                var4_4 = AFh1vSDK.e;
                var5_5 /* !! */  = "AFJsonObject return null String object.";
                var18_31 /* !! */ .e((AFh1vSDK)var4_4, var5_5 /* !! */ , (Throwable)var10_10);
            }
            var18_31 /* !! */  = var9_9;
        }
        if (var17_30 != null) {
            var9_9 = var17_30;
        }
        var12_26 = var18_31 /* !! */ .equals(var9_9);
        if (!var12_26) {
            var10_10 = AFLogger.INSTANCE;
            var4_4 = AFh1vSDK.e;
            var5_5 /* !! */  = "Payload contains non-printing characters";
            var10_10.w((AFh1vSDK)var4_4, var5_5 /* !! */ );
            try {
                var10_10 = new JSONObject((String)var18_31 /* !! */ );
                var16_29 /* !! */  = var10_10;
            }
            catch (JSONException var10_24) {
                var4_4 = AFLogger.INSTANCE;
                var5_5 /* !! */  = AFh1vSDK.e;
                var6_6 = "Couldn't parse the payload to a json object";
                var4_4.e((AFh1vSDK)var5_5 /* !! */ , var6_6, var10_24);
            }
        } else {
            var18_31 /* !! */  = var9_9;
        }
        var10_10 = new StringBuilder();
        var10_10.append(var2_2);
        var10_10.append(": preparing data: ");
        AFb1bSDK.getCurrencyIso4217Code(var10_10.toString(), var16_29 /* !! */ );
        var2_2.areAllFieldsValid.getMediationNetwork(var11_25, (String)var18_31 /* !! */ );
        var10_10 = var2_2.component2;
        var18_31 /* !! */  = var2_2.component3;
        var4_4 = var2_2.AFKeystoreWrapper;
        var5_5 /* !! */  = var1_1;
        return var10_10.AFAdRevenueData((AFa1oSDK)var18_31 /* !! */ , var1_1, (AFd1nSDK)var4_4);
    }

    public void getMediationNetwork(AFa1oSDK object) {
        AFg1kSDK aFg1kSDK = this.equals;
        object = ((AFa1oSDK)object).getMonetizationNetwork();
        aFg1kSDK.getMediationNetwork((Map)object);
    }

    public void getMonetizationNetwork(AFa1oSDK object) {
        AFg1kSDK aFg1kSDK = this.equals;
        object = ((AFa1oSDK)object).getMonetizationNetwork();
        aFg1kSDK.getMonetizationNetwork((Map)object);
    }

    public void getRevenue(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK);
    }
}

