/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult$Error;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFc1kSDK$4;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1kSDK;
import com.appsflyer.internal.AFf1lSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1iSDK;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFc1kSDK {
    public List AFAdRevenueData;
    public final AFd1kSDK areAllFieldsValid;
    public String[] component1;
    public long component3;
    public final List component4;
    public Map getCurrencyIso4217Code;
    public String getMediationNetwork;
    public DeepLinkListener getMonetizationNetwork;
    public Intent getRevenue;

    public AFc1kSDK(AFd1kSDK aFd1kSDK) {
        ArrayList arrayList;
        this.AFAdRevenueData = arrayList = new ArrayList();
        this.component4 = arrayList = new ArrayList();
        this.areAllFieldsValid = aFd1kSDK;
    }

    private static void getMediationNetwork(String string2) {
        Object object = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (object != null) {
            String string3 = "Calling onAppOpenAttributionFailure with: ";
            String string4 = String.valueOf(string2);
            string3 = string3.concat(string4);
            AFLogger.afDebugLog(string3);
            try {
                object.onAttributionFailure(string2);
                return;
            }
            catch (Throwable throwable) {
                object = throwable.getLocalizedMessage();
                AFLogger.afErrorLog((String)object, throwable);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean p_(Intent var1_1, AFc1oSDK var2_2) {
        block16: {
            block15: {
                var3_3 = "android.intent.action.VIEW";
                var4_4 = false;
                var5_5 = null;
                if (var1_1 != null && (var7_7 = var3_3.equals(var6_6 = var1_1.getAction()))) {
                    var6_6 = var1_1.getData();
                } else {
                    var7_7 = false;
                    var6_6 = null;
                }
                var8_8 /* !! */  = this.getRevenue;
                if (var8_8 /* !! */  != null && (var10_10 = var3_3.equals(var9_9 = var8_8 /* !! */ .getAction()))) {
                    var3_3 = var8_8 /* !! */ .getData();
                } else {
                    var10_10 = false;
                    var3_3 = null;
                }
                if (var1_1 != null) break block15;
                var8_8 /* !! */  = "Could not extract deeplink from null intent";
                AFLogger.afDebugLog((String)var8_8 /* !! */ );
                break block16;
            }
            var8_8 /* !! */  = var1_1.getExtras();
            var9_9 = this.AFAdRevenueData;
            var11_11 = var9_9.isEmpty();
            if (var11_11 || var8_8 /* !! */  == null) break block16;
            var9_9 = this.AFAdRevenueData.iterator();
            while (var12_12 = var9_9.hasNext()) {
                block14: {
                    var13_13 = (List)var9_9.next();
                    if (var13_13 == null) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var14_14 = null;
                            break block14;
                            break;
                        }
                    }
                    var14_14 = var13_13.iterator();
                    var15_15 = var14_14.hasNext();
                    if (!var15_15) ** GOTO lbl-1000
                    var16_16 = (String)var14_14.next();
                    if ((var16_16 = var8_8 /* !! */ .getString(var16_16)) != null) ** break;
                    ** continue;
                    var14_14 = this.q_(var16_16, var14_14);
                }
                if (var14_14 == null) continue;
                var5_5 = new StringBuilder("Found deeplink in push payload at ");
                var8_8 /* !! */  = var13_13.toString();
                var5_5.append((String)var8_8 /* !! */ );
                AFLogger.afDebugLog(var5_5.toString());
                var5_5 = this.AFAdRevenueData;
                var8_8 /* !! */  = "payloadKey";
                var9_9 = "";
                Intrinsics.checkNotNullParameter(var8_8 /* !! */ , (String)var9_9);
                var13_13 = AFb1rSDK.getCurrencyIso4217Code(var2_2.getCurrencyIso4217Code);
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var9_9);
                var13_13.put(var8_8 /* !! */ , var5_5);
                var5_5 = var2_2.getMonetizationNetwork;
                if (var5_5 != null) {
                    var8_8 /* !! */  = var2_2.getCurrencyIso4217Code;
                    var5_5.AFAdRevenueData((Map)var8_8 /* !! */ );
                }
                var5_5 = var14_14;
                break;
            }
        }
        var8_8 /* !! */  = " w/af_consumed";
        var11_11 = true;
        var12_12 = false;
        var13_13 = null;
        var14_14 = "af_consumed";
        if (var6_6 != null) {
            var3_3 = new AFj1iSDK((Intent)var1_1);
            var17_17 = var3_3.getMediationNetwork((String)var14_14);
            if (!var17_17) {
                var18_19 = System.currentTimeMillis();
                var3_3.K_((String)var14_14, var18_19);
                this.o_((AFc1oSDK)var2_2, (Uri)var6_6);
                return var11_11;
            }
            var1_1 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            var2_2 = var6_6.toString();
            var1_1.append((String)var2_2);
            var1_1.append((String)var8_8 /* !! */ );
            AFLogger.afInfoLog(var1_1.toString());
            return false;
        }
        if (var3_3 != null) {
            var5_5 = this.getRevenue;
            var1_1 = new AFj1iSDK((Intent)var5_5);
            var4_4 = var1_1.getMediationNetwork((String)var14_14);
            if (!var4_4) {
                var20_20 = System.currentTimeMillis();
                var1_1.K_((String)var14_14, var20_20);
                this.o_((AFc1oSDK)var2_2, (Uri)var3_3);
                return var11_11;
            }
            var1_1 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            var2_2 = var3_3.toString();
            var1_1.append((String)var2_2);
            var1_1.append((String)var8_8 /* !! */ );
            AFLogger.afInfoLog(var1_1.toString());
            return false;
        }
        if (var5_5 != null) {
            var3_3 = new AFj1iSDK((Intent)var1_1);
            var17_18 = var3_3.getMediationNetwork((String)var14_14);
            if (!var17_18) {
                var22_21 = System.currentTimeMillis();
                var3_3.K_((String)var14_14, var22_21);
                this.o_((AFc1oSDK)var2_2, (Uri)var5_5);
                return var11_11;
            }
            var1_1 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            var2_2 = var5_5.toString();
            var1_1.append((String)var2_2);
            var1_1.append((String)var8_8 /* !! */ );
            AFLogger.afInfoLog(var1_1.toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Uri q_(Object object, Iterator object2) {
        Object object3;
        while (object != (object3 = JSONObject.NULL)) {
            boolean bl2 = object2.hasNext();
            if (!bl2) {
                if ((object = Uri.parse((String)object.toString())) != null && (object2 = object.getScheme()) != null && (object2 = object.getHost()) != null) {
                    return object;
                }
                return null;
            }
            try {
                object = object.toString();
                object3 = new JSONObject((String)object);
                object = object2.next();
                object = (String)object;
                object = object3.get((String)object);
            }
            catch (JSONException jSONException) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", jSONException);
                return null;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void AFAdRevenueData(Map var1_1) {
        var2_6 = this.getMonetizationNetwork;
        if (var2_6 != null) {
            var2_6 = null;
            var1_1 = DeepLink.getMonetizationNetwork((Map)var1_1);
            var3_7 = var1_1.getMediationNetwork;
            var4_10 = "is_deferred";
            var5_13 = null;
            var3_7.put(var4_10, false);
            var3_7 = new DeepLinkResult((DeepLink)var1_1, null);
            this.getMonetizationNetwork((DeepLinkResult)var3_7);
            return;
            {
                catch (JSONException var1_3) {}
                {
                    var3_7 = AFLogger.INSTANCE;
                    var4_11 = AFh1vSDK.copy;
                    var5_14 = "Error occurred";
                    var6_15 = true;
                    var3_7.e(var4_11, var5_14, var1_3, var6_15);
                    var1_4 = DeepLinkResult$Error.UNEXPECTED;
                    var3_7 = new DeepLinkResult(null, var1_4);
                }
            }
            ** finally { 
lbl23:
            // 1 sources

            var3_8 = new DeepLinkResult(null, null);
            this.getMonetizationNetwork(var3_8);
            throw var1_2;
        }
        var2_6 = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (var2_6 != null) {
            try {
                var4_12 = "Calling onAppOpenAttribution with:\n";
                var3_9 /* !! */  = new StringBuilder(var4_12);
                var4_12 = var1_1.toString();
                var3_9 /* !! */ .append(var4_12);
                var3_9 /* !! */  = var3_9 /* !! */ .toString();
                AFLogger.afDebugLog((String)var3_9 /* !! */ );
                var2_6.onAppOpenAttribution((Map)var1_1);
                return;
            }
            catch (Throwable var1_5) {
                var2_6 = var1_5.getLocalizedMessage();
                AFLogger.afErrorLog((String)var2_6, var1_5);
            }
        }
    }

    public final void getMonetizationNetwork(DeepLinkResult object) {
        Object object2 = this.getMonetizationNetwork;
        if (object2 != null) {
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copy;
            CharSequence charSequence = new StringBuilder("Calling onDeepLinking with:\n");
            String string2 = ((DeepLinkResult)object).toString();
            charSequence.append(string2);
            charSequence = ((Object)charSequence).toString();
            ((AFh1uSDK)object2).d(aFh1vSDK, (String)charSequence);
            try {
                object2 = this.getMonetizationNetwork;
            }
            catch (Throwable throwable) {
                AFLogger.afErrorLog(throwable.getLocalizedMessage(), throwable);
                return;
            }
            object2.onDeepLinking((DeepLinkResult)object);
            return;
        }
        object = AFLogger.INSTANCE;
        object2 = AFh1vSDK.copy;
        ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), "skipping, no callback registered");
    }

    public final void getMonetizationNetwork(String object, DeepLinkResult$Error deepLinkResult$Error) {
        Object object2 = this.getMonetizationNetwork;
        if (object2 != null) {
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copy;
            object = String.valueOf(object);
            object = "Error occurred: ".concat((String)object);
            ((AFh1uSDK)object2).d(aFh1vSDK, (String)object);
            object = new DeepLinkResult(null, deepLinkResult$Error);
            this.getMonetizationNetwork((DeepLinkResult)object);
            return;
        }
        AFc1kSDK.getMediationNetwork((String)object);
    }

    public final void n_(AFc1oSDK object, Intent object2, Context object3) {
        Object object4 = (AFd1oSDK)this.areAllFieldsValid;
        if (object3 != null) {
            object4 = ((AFd1oSDK)object4).getCurrencyIso4217Code;
            ((AFd1nSDK)object4).AFAdRevenueData = object3 = object3.getApplicationContext();
        }
        int n3 = this.p_((Intent)object2, (AFc1oSDK)object);
        object2 = "ddl_sent";
        if (n3 == 0 && (object = this.getMonetizationNetwork) != null) {
            object = this.areAllFieldsValid.getMediationNetwork().getRevenue;
            object3 = "appsFlyerCount";
            object4 = null;
            n3 = object.getMediationNetwork((String)object3, 0);
            if (n3 == 0 && (n3 = (int)((object = this.areAllFieldsValid.getRevenue()).getMediationNetwork((String)object2) ? 1 : 0)) == 0) {
                object = new AFc1qSDK();
                object3 = this.areAllFieldsValid.copy();
                Object object5 = this.areAllFieldsValid;
                object4 = new AFf1iSDK((AFc1qSDK)object, (AFd1kSDK)object5);
                object = object3.AFAdRevenueData;
                object5 = new AFe1aSDK$2((AFe1aSDK)object3, (AFe1eSDK)object4);
                object.execute((Runnable)object5);
            }
        }
        this.areAllFieldsValid.getRevenue().getRevenue((String)object2, true);
    }

    public final void o_(AFc1oSDK object, Uri object2) {
        Object object3 = this.component4;
        AFf1kSDK aFf1kSDK = new AFf1kSDK(this, (AFc1oSDK)object, (Uri)object2, (List)object3);
        object = this.areAllFieldsValid.copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        object3 = new AFe1aSDK$2((AFe1aSDK)object, aFf1kSDK);
        object2.execute((Runnable)object3);
        this.getRevenue = null;
    }

    public final void r_(AFc1oSDK object, Uri object2, Uri object3) {
        boolean bl2;
        Object object4;
        Object object5;
        Object object6 = "af_deeplink";
        boolean bl3 = ((AFc1oSDK)object).getMonetizationNetwork((String)object6);
        Object object7 = "";
        if (!bl3) {
            Object object8;
            String string2;
            Object object9;
            Object object10;
            int n3;
            boolean bl4;
            object5 = object2.toString();
            if (object5 == null) {
                bl3 = false;
                object5 = null;
            } else {
                int n4;
                object4 = "fb\\d*?://authorize.*";
                bl4 = ((String)object5).matches((String)object4);
                if (bl4 && (n4 = ((String)object5).contains((CharSequence)(object4 = "access_token"))) != 0 && (n3 = ((String)(object10 = (n4 = ((String)object5).indexOf(63)) == (n3 = -1) ? object7 : ((String)object5).substring(n4))).length()) != 0) {
                    boolean bl5;
                    object9 = new ArrayList();
                    string2 = "&";
                    boolean bl6 = ((String)object10).contains(string2);
                    if (bl6) {
                        object8 = Arrays.asList(((String)object10).split(string2));
                        object9 = new ArrayList(object8);
                    } else {
                        ((AbstractCollection)object9).add(object10);
                    }
                    object8 = new StringBuilder();
                    object9 = ((ArrayList)object9).iterator();
                    while (bl5 = object9.hasNext()) {
                        String string3 = (String)object9.next();
                        int n7 = string3.contains((CharSequence)object4);
                        if (n7 != 0) {
                            object9.remove();
                            continue;
                        }
                        n7 = ((StringBuilder)object8).length();
                        if (n7 != 0) {
                            ((StringBuilder)object8).append(string2);
                        } else {
                            String string4 = "?";
                            boolean bl7 = string3.startsWith(string4);
                            if (!bl7) {
                                ((StringBuilder)object8).append(string4);
                            }
                        }
                        ((StringBuilder)object8).append(string3);
                    }
                    object4 = object8.toString();
                    object5 = ((String)object5).replace((CharSequence)object10, (CharSequence)object4);
                }
            }
            object4 = this.getMediationNetwork;
            if (object4 != null && (object10 = this.getCurrencyIso4217Code) != null && (bl4 = ((String)object5).contains((CharSequence)object4))) {
                object5 = Uri.parse((String)object5).buildUpon();
                object4 = Uri.EMPTY.buildUpon();
                object10 = this.getCurrencyIso4217Code.entrySet().iterator();
                while ((n3 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                    object9 = object10.next();
                    string2 = (String)object9.getKey();
                    object8 = (String)object9.getValue();
                    object5.appendQueryParameter(string2, (String)object8);
                    string2 = (String)object9.getKey();
                    object9 = (String)object9.getValue();
                    object4.appendQueryParameter(string2, (String)object9);
                }
                object5 = object5.build().toString();
                object4 = object4.build().getEncodedQuery();
                object10 = "appended_query_params";
                Intrinsics.checkNotNullParameter(object10, (String)object7);
                object9 = ((AFc1oSDK)object).getCurrencyIso4217Code;
                object9.put(object10, object4);
                object4 = ((AFc1oSDK)object).getMonetizationNetwork;
                if (object4 != null) {
                    object10 = ((AFc1oSDK)object).getCurrencyIso4217Code;
                    object4.AFAdRevenueData((Map)object10);
                }
            }
            Intrinsics.checkNotNullParameter(object6, (String)object7);
            object4 = ((AFc1oSDK)object).getCurrencyIso4217Code;
            object4.put(object6, object5);
            object6 = ((AFc1oSDK)object).getMonetizationNetwork;
            if (object6 != null) {
                object5 = ((AFc1oSDK)object).getCurrencyIso4217Code;
                object6.AFAdRevenueData((Map)object5);
            }
        }
        object6 = new HashMap();
        object5 = object2.toString();
        object4 = "link";
        ((HashMap)object6).put(object4, object5);
        if (object3 != null) {
            object5 = "original_link";
            object3 = object3.toString();
            ((HashMap)object6).put(object5, object3);
        }
        AFb1qSDK.d_(this.areAllFieldsValid.values().AFAdRevenueData, object6, (Uri)object2);
        object5 = this.areAllFieldsValid;
        object4 = UUID.randomUUID();
        object3 = new AFf1lSDK((AFd1kSDK)object5, (UUID)object4, (Uri)object2);
        boolean bl8 = ((AFf1lSDK)object3).copy();
        if (bl8) {
            object2 = Boolean.TRUE;
            object5 = "isBrandedDomain";
            Intrinsics.checkNotNullParameter(object5, (String)object7);
            object7 = ((AFc1oSDK)object).getCurrencyIso4217Code;
            object7.put(object5, object2);
            object2 = ((AFc1oSDK)object).getMonetizationNetwork;
            if (object2 != null) {
                object = ((AFc1oSDK)object).getCurrencyIso4217Code;
                object2.AFAdRevenueData((Map)object);
            }
        }
        if (bl2 = ((AFf1lSDK)object3).equals()) {
            ((AFf1lSDK)object3).component3 = object = new AFc1kSDK$4(this, (Map)object6);
            object = this.areAllFieldsValid.copy();
            object2 = ((AFe1aSDK)object).AFAdRevenueData;
            object6 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object3);
            object2.execute((Runnable)object6);
            return;
        }
        this.areAllFieldsValid.d().AFAdRevenueData((Map)object6);
    }
}

