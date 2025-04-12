/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Payment.BaseRequest;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.CartItemRequest;
import com.ril.ajio.services.data.Payment.CartRequest;
import com.ril.ajio.services.data.Payment.CashOnDeliveryInformation;
import com.ril.ajio.services.data.Payment.ChannelInfo;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.FEResult;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.SubWallet;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import com.ril.ajio.services.data.Payment.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Oo2
 */
public final class oo2_0 {
    public static final oo2_0 a;

    static {
        oo2_0 oo2_02;
        a = oo2_02 = new Object();
    }

    public static boolean a(String string2) {
        int n3;
        String string3 = "cardNo";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n4 = string2.length();
        int n7 = 1;
        n4 -= n7;
        int n8 = 0;
        boolean bl2 = false;
        while ((n3 = -1) < n4) {
            n3 = string2.charAt(n4) + -48;
            if (bl2) {
                n3 *= 2;
            }
            int n10 = n3 / 10 + n8;
            n8 = (n3 %= 10) + n10;
            bl2 ^= true;
            n4 += -1;
        }
        if ((n8 %= 10) != 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static PaymentInstrumentInfo b(TenantResponse serializable, PaymentInstrumentInfo paymentInstrumentInfo) {
        boolean bl2 = h40_0.a.h1();
        if (bl2) {
            bl2 = false;
            if (serializable != null && (serializable = ((TenantResponse)serializable).getInternalWallets()) != null) {
                int n3 = ((ArrayList)serializable).size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    String string2;
                    boolean bl3;
                    String string3 = ((PaymentInstrumentInfo)((ArrayList)serializable).get(i3)).getCode();
                    if (string3 == null || !(bl3 = Intrinsics.areEqual(string2 = paymentInstrumentInfo != null ? paymentInstrumentInfo.getCode() : null, string3))) continue;
                    return (PaymentInstrumentInfo)((ArrayList)serializable).get(i3);
                }
            }
            return null;
        }
        return paymentInstrumentInfo;
    }

    public static PaymentInstrumentType c(String string2, PaymentInstruments iterator) {
        PaymentInstrumentType paymentInstrumentType = null;
        if (iterator != null && (iterator = ((PaymentInstruments)((Object)iterator)).getPaymentInstrumentDetails()) != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                boolean bl4;
                String string3;
                PaymentInstrumentType paymentInstrumentType2 = (PaymentInstrumentType)iterator.next();
                if (paymentInstrumentType2 != null) {
                    string3 = paymentInstrumentType2.getPaymentInstrumentCode();
                } else {
                    bl4 = false;
                    string3 = null;
                }
                if (!(bl4 = b.i(string3, string2, bl3 = true))) continue;
                paymentInstrumentType = paymentInstrumentType2;
                break;
            }
        }
        return paymentInstrumentType;
    }

    public static LpStoredCardBalance d(String string2, ArrayList arrayList) {
        if (arrayList != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3;
                LpStoredCardBalance lpStoredCardBalance = (LpStoredCardBalance)arrayList.get(i3);
                boolean bl2 = oo2_0.j(lpStoredCardBalance);
                if (!bl2) continue;
                if (lpStoredCardBalance != null) {
                    string3 = lpStoredCardBalance.getPayId();
                } else {
                    bl2 = false;
                    string3 = null;
                }
                boolean bl3 = true;
                bl2 = b.i(string3, string2, bl3);
                if (!bl2) continue;
                return lpStoredCardBalance;
            }
        }
        return null;
    }

    public static HashMap e(PriceValidation object) {
        float f5;
        Object object2;
        object = (object = ((PriceValidation)object).getPriceSplitup()) != null ? ((PriceSplitUp)object).getOfferDetails() : null;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        float f6 = 0.0f;
        Object object3 = null;
        if (object != null && (object2 = ((OfferDetails)object).getAmountConsideredForOffer()) != null) {
            f5 = ((Float)object2).floatValue();
        } else {
            f5 = 0.0f;
            object2 = null;
        }
        object2 = String.valueOf(f5);
        String string2 = "offerDetails.amountConsideredForOffer";
        hashMap.put(string2, object2);
        if (object != null && (object2 = ((OfferDetails)object).getOfferAmountApplied()) != null) {
            f5 = ((Float)object2).floatValue();
        } else {
            f5 = 0.0f;
            object2 = null;
        }
        object2 = String.valueOf(f5);
        string2 = "offerDetails.offerAmountApplied";
        hashMap.put(string2, object2);
        if (object != null && (object2 = ((OfferDetails)object).getMaximumOfferAmount()) != null) {
            f5 = ((Float)object2).floatValue();
        } else {
            f5 = 0.0f;
            object2 = null;
        }
        object2 = String.valueOf(f5);
        string2 = "offerDetails.maximumOfferAmount";
        hashMap.put(string2, object2);
        if (object != null && (object2 = ((OfferDetails)object).getOfferInPercentageApplied()) != null) {
            f6 = ((Float)object2).floatValue();
        }
        object3 = String.valueOf(f6);
        object2 = "offerDetails.offerInPercentageApplied";
        hashMap.put(object2, object3);
        object3 = "";
        if (object == null || (object2 = ((OfferDetails)object).getCardToken()) == null) {
            object2 = object3;
        }
        string2 = "offerDetails.cardToken";
        hashMap.put(string2, object2);
        if (object == null || (object2 = ((OfferDetails)object).getBankOfferPk()) == null) {
            object2 = object3;
        }
        string2 = "offerDetails.bankOfferPk";
        hashMap.put(string2, object2);
        if (object != null && (object = ((OfferDetails)object).getOfferDescription()) != null) {
            object3 = object;
        }
        hashMap.put("offerDetails.offerDescription", object3);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static UpiAppInfo f(PaymentInstruments paymentInstruments, Context context, PriceValidation priceValidation) {
        PriceValidation priceValidation2 = priceValidation;
        try {
            boolean bl2;
            Object object = AJIOApplication.Companion;
            object.getClass();
            object = AJIOApplication$a.a();
            Object object2 = new jo_2((Context)object);
            object = "PREFERRED_PAYMENT";
            Object object3 = "";
            object2 = ((sw_0)object2).getPreference((String)object, (String)object3);
            if (object2 == null) return null;
            int n3 = ((String)object2).length();
            if (n3 == 0) {
                return null;
            }
            if (paymentInstruments == null) return null;
            object = paymentInstruments.getPaymentInstrumentDetails();
            if (object == null) return null;
            object = (Iterable)object;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                Iterator iterator;
                object3 = object.next();
                if ((object3 = (PaymentInstrumentType)object3) != null) {
                    iterator = ((PaymentInstrumentType)object3).getPaymentInstrumentCode();
                } else {
                    bl3 = false;
                    iterator = null;
                }
                Object object4 = "SAVED_UPI";
                boolean bl4 = true;
                bl3 = b.i((String)((Object)iterator), (String)object4, bl4);
                if (bl3 && object3 != null && (iterator = ((PaymentInstrumentType)object3).getPaymentInstrumentsInfo()) != null) {
                    boolean bl5;
                    iterator = iterator.iterator();
                    while (bl5 = iterator.hasNext()) {
                        boolean bl6;
                        String string2;
                        object4 = iterator.next();
                        if ((object4 = (PaymentInstrumentInfo)object4) != null) {
                            string2 = ((PaymentInstrumentInfo)object4).getPaymentInstrumentId();
                        } else {
                            bl6 = false;
                            string2 = null;
                        }
                        if (!(bl6 = Intrinsics.areEqual(object2, string2))) continue;
                        int n4 = 255;
                        object2 = new UpiAppInfo(null, null, null, null, null, null, null, null, n4, null);
                        object = ((PaymentInstrumentInfo)object4).getMaskedUPIInfo();
                        ((UpiAppInfo)object2).setName((String)object);
                        object = ((PaymentInstrumentInfo)object4).getDisplayUPIInfo();
                        ((UpiAppInfo)object2).setDisplayUPIInfo((String)object);
                        object = ((PaymentInstrumentInfo)object4).getPaymentInstrumentId();
                        ((UpiAppInfo)object2).setPaymentInstrumentId((String)object);
                        ((UpiAppInfo)object2).setPriceValidation(priceValidation2);
                        return object2;
                    }
                }
                if (object3 != null) {
                    object3 = ((PaymentInstrumentType)object3).getPaymentInstrumentCode();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                iterator = "UPI";
                bl2 = b.i((String)object3, iterator, bl4);
                if (bl2) {
                    object3 = context;
                    return oo2_0.h(context, (String)object2, priceValidation2);
                }
                object3 = context;
            }
            return null;
        }
        catch (Exception exception) {}
        return null;
    }

    public static ArrayList g(PaymentInstrumentType object, HashSet hashSet, TenantResponse tenantResponse) {
        ArrayList<PaymentInstrumentInfo> arrayList = new ArrayList<PaymentInstrumentInfo>();
        if (hashSet != null && object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object2;
                boolean bl3;
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo == null || !(bl3 = CollectionsKt.F(hashSet, object2 = paymentInstrumentInfo.getCode()))) continue;
                object2 = a;
                object2.getClass();
                if ((paymentInstrumentInfo = oo2_0.b(tenantResponse, paymentInstrumentInfo)) == null) continue;
                arrayList.add(paymentInstrumentInfo);
            }
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static UpiAppInfo h(Context var0, String var1_1, PriceValidation var2_2) {
        block21: {
            var3_3 = null;
            if (var0 == null) break block21;
            var4_4 = var0.getPackageManager();
            var5_5 = new Intent("android.intent.action.MAIN", null);
            var5_5.addCategory("android.intent.category.DEFAULT");
            var5_5.addCategory("android.intent.category.BROWSABLE");
            var5_5.setAction("android.intent.action.VIEW");
            var6_6 = new Uri.Builder();
            var6_6 = var6_6.scheme("upi").authority("pay").build();
            var5_5.setData((Uri)var6_6);
            var6_6 = null;
            var5_5 = var4_4.queryIntentActivities((Intent)var5_5, 0);
            Intrinsics.checkNotNullExpressionValue(var5_5, "queryIntentActivities(...)");
            var7_7 = var5_5;
            var7_7 = (Collection)var5_5;
            var8_8 = var7_7.size();
            for (var9_9 = 0; var9_9 < var8_8; ++var9_9) {
                block22: {
                    block20: {
                        var10_10 /* !! */  = var5_5.get(var9_9);
                        var10_10 /* !! */  = (ResolveInfo)var10_10 /* !! */ ;
                        var11_11 = var10_10 /* !! */ .activityInfo;
                        var11_11 = var11_11.packageName;
                        try {
                            var12_12 = Intrinsics.areEqual(var1_1, var11_11);
                            if (!var12_12) break block20;
                        }
                        catch (Exception v0) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var10_10 /* !! */  = var2_2;
                                break;
                            }
                        }
                        var11_11 = var10_10 /* !! */ .loadLabel(var4_4);
                        var13_13 = "loadLabel(...)";
                        Intrinsics.checkNotNullExpressionValue(var11_11, (String)var13_13);
                        var13_13 = var10_10 /* !! */ .loadIcon(var4_4);
                        var15_15 = 255;
                        var16_16 = var14_14;
                        var3_3 = var14_14;
                        var14_14 = null;
                        var16_16(null, null, null, null, null, null, null, null, var15_15, null);
                        var11_11 = var11_11.toString();
                        var16_16.setName((String)var11_11);
                        var16_16.setAppDrawabe((Drawable)var13_13);
                        var10_10 /* !! */  = var10_10 /* !! */ .activityInfo;
                        var10_10 /* !! */  = var10_10 /* !! */ .packageName;
                        var16_16.setPackageName((String)var10_10 /* !! */ );
                        var10_10 /* !! */  = var2_2;
                        try {
                            var16_16.setPriceValidation(var2_2);
                            return var16_16;
                        }
                        catch (Exception v2) {}
                    }
                    var10_10 /* !! */  = var2_2;
                    break block22;
                    catch (Exception v1) {
                        ** continue;
                    }
                    var3_3 = yn3_0.a;
                    var11_11 = "UPI exception in intent flow";
                    var13_13 = new Object[]{};
                    var3_3.a((String)var11_11, var13_13);
                }
                var3_3 = null;
            }
        }
        return null;
    }

    public static HashMap i(PaymentInstruments object, TenantResponse tenantResponse, HashSet object2) {
        int n3;
        Object object3;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        int n4 = 0;
        String string2 = null;
        if (object != null && (object3 = ((PaymentInstruments)object).getPaymentInstrumentDetails()) != null) {
            n3 = object3.size();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (n3 > 0) {
            int n7;
            int n8;
            object3 = "INTERNAL_WALLET";
            if ((object = oo2_0.c((String)object3, (PaymentInstruments)object)) != null && (object3 = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
                n3 = ((ArrayList)object3).size();
            } else {
                n3 = 0;
                object3 = null;
            }
            if (n3 > 0 && (n8 = (n7 = ((ArrayList)(object = oo2_0.g((PaymentInstrumentType)object, (HashSet)object2, tenantResponse))).isEmpty()) ^ (n3 = 1)) != 0) {
                Object object4;
                Object object5;
                Object object6;
                int n10 = ((ArrayList)object).size();
                int n14 = 0;
                String string3 = null;
                while (true) {
                    float f5 = 0.0f;
                    String string4 = null;
                    object6 = "";
                    if (n14 >= n10) break;
                    object5 = (PaymentInstrumentInfo)((ArrayList)object).get(n14);
                    object4 = Gj0.b(n14, "internalWallets[", "].");
                    Object object7 = Ft2.a((String)object4, "code");
                    Object object8 = ((PaymentInstrumentInfo)object5).getCode();
                    if (object8 == null) {
                        object8 = object6;
                    }
                    hashMap.put(object7, object8);
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append("amount");
                    object7 = ((StringBuilder)object7).toString();
                    object8 = String.valueOf(((PaymentInstrumentInfo)object5).getAmount());
                    hashMap.put(object7, object8);
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append("leftPostUsage");
                    object7 = ((StringBuilder)object7).toString();
                    object8 = String.valueOf(((PaymentInstrumentInfo)object5).getLeftPostUsage());
                    hashMap.put(object7, object8);
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append("multipleWalletEnabledAmount");
                    object7 = ((StringBuilder)object7).toString();
                    object8 = String.valueOf(((PaymentInstrumentInfo)object5).getMultipleWalletEnabledAmount());
                    hashMap.put(object7, object8);
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append("multipleWalletEnabledLeftPostUsageAmount");
                    object7 = ((StringBuilder)object7).toString();
                    object8 = String.valueOf(((PaymentInstrumentInfo)object5).getMultipleWalletEnabledLeftPostUsageAmount());
                    hashMap.put(object7, object8);
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append("minimumEarnThreshold");
                    object7 = ((StringBuilder)object7).toString();
                    float f6 = ((PaymentInstrumentInfo)object5).getMinimumEarnThreshold();
                    object8 = String.valueOf(f6);
                    hashMap.put(object7, object8);
                    object7 = "AJIO_CASH_WALLET";
                    object8 = ((PaymentInstrumentInfo)object5).getType();
                    boolean bl2 = Intrinsics.areEqual(object7, object8);
                    if (bl2) {
                        float f7;
                        object7 = Ft2.a((String)object4, "subWallets[0].code");
                        object8 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object8 == null || (object8 = (SubWallet)object8.get(0)) == null || (object8 = ((SubWallet)object8).getCode()) == null) {
                            object8 = object6;
                        }
                        hashMap.put(object7, object8);
                        object7 = new StringBuilder();
                        ((StringBuilder)object7).append((String)object4);
                        ((StringBuilder)object7).append("subWallets[0].amount");
                        object7 = ((StringBuilder)object7).toString();
                        object8 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object8 != null && (object8 = (SubWallet)object8.get(0)) != null && (object8 = ((SubWallet)object8).getAmount()) != null) {
                            f6 = ((Float)object8).floatValue();
                        } else {
                            f6 = 0.0f;
                            object8 = null;
                        }
                        object8 = String.valueOf(f6);
                        hashMap.put(object7, object8);
                        object7 = new StringBuilder();
                        ((StringBuilder)object7).append((String)object4);
                        ((StringBuilder)object7).append("subWallets[1].code");
                        object7 = ((StringBuilder)object7).toString();
                        object8 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object8 != null && (object8 = (SubWallet)object8.get(n3)) != null && (object8 = ((SubWallet)object8).getCode()) != null) {
                            object6 = object8;
                        }
                        hashMap.put(object7, object6);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[1].amount");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(n3)) != null && (object7 = ((SubWallet)object7).getAmount()) != null) {
                            f7 = ((Float)object7).floatValue();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[0].points");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 == null || (object7 = (SubWallet)object7.get(0)) == null || (object7 = ((SubWallet)object7).getPoints()) == null) {
                            object7 = Float.valueOf(0.0f);
                        }
                        object7 = object7.toString();
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[1].points");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 == null || (object7 = (SubWallet)object7.get(n3)) == null || (object7 = ((SubWallet)object7).getPoints()) == null) {
                            object7 = Float.valueOf(0.0f);
                        }
                        object7 = object7.toString();
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[0].leftPostUsage");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(0)) != null) {
                            f7 = ((SubWallet)object7).getLeftPostUsage();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[1].leftPostUsage");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(n3)) != null) {
                            f7 = ((SubWallet)object7).getLeftPostUsage();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[0].multipleWalletEnabledAmount");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(0)) != null && (object7 = ((SubWallet)object7).getMultipleWalletEnabledAmount()) != null) {
                            f7 = ((Float)object7).floatValue();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[1].multipleWalletEnabledAmount");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(n3)) != null && (object7 = ((SubWallet)object7).getMultipleWalletEnabledAmount()) != null) {
                            f7 = ((Float)object7).floatValue();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        ((StringBuilder)object6).append("subWallets[0].multipleWalletEnabledLeftPostUsageAmount");
                        object6 = ((StringBuilder)object6).toString();
                        object7 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object7 != null && (object7 = (SubWallet)object7.get(0)) != null && (object7 = ((SubWallet)object7).getMultipleWalletEnabledLeftPostUsageAmount()) != null) {
                            f7 = ((Float)object7).floatValue();
                        } else {
                            bl2 = false;
                            f7 = 0.0f;
                            object7 = null;
                        }
                        object7 = String.valueOf(f7);
                        hashMap.put(object6, object7);
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append((String)object4);
                        object4 = "subWallets[1].multipleWalletEnabledLeftPostUsageAmount";
                        ((StringBuilder)object6).append((String)object4);
                        object6 = ((StringBuilder)object6).toString();
                        object5 = ((PaymentInstrumentInfo)object5).getSubWallets();
                        if (object5 != null && (object5 = (SubWallet)object5.get(n3)) != null && (object5 = ((SubWallet)object5).getMultipleWalletEnabledLeftPostUsageAmount()) != null) {
                            f5 = ((Float)object5).floatValue();
                        }
                        string4 = String.valueOf(f5);
                        hashMap.put(object6, string4);
                    }
                    ++n14;
                }
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getChannelInfo()) == null || (object = ((ChannelInfo)object).getAppType()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.channelInfo.appType";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getChannelInfo()) == null || (object = ((ChannelInfo)object).getChannelType()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.channelInfo.channelType";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getChannelInfo()) == null || (object = ((ChannelInfo)object).getNthOrderOnChannel()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.channelInfo.nthOrderOnChannel";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getChannelInfo()) == null || (object = ((ChannelInfo)object).getOsType()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.channelInfo.osType";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getTenantId()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.tenantId";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getConsumerType()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.consumerType";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getUserInfo()) == null || (object = ((UserInfo)object).getEmail()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.userInfo.email";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getUserInfo()) == null || (object = ((UserInfo)object).getPhoneNumber()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.userInfo.phoneNumber";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getUserInfo()) == null || (object = ((UserInfo)object).getProfileName()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.userInfo.profileName";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getBaseRequest()) == null || (object = ((BaseRequest)object).getUserInfo()) == null || (object = ((UserInfo)object).getUserId()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.baseRequest.userInfo.userId";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                if (object == null || (object = ((CartRequest)object).getOrderType()) == null) {
                    object = object6;
                }
                object2 = "cartRequest.orderType";
                hashMap.put(object2, object);
                object = tenantResponse.getCartRequest();
                tenantResponse = null;
                object = object != null ? ((CartRequest)object).getCartItemRequests() : null;
                if (object != null) {
                    boolean bl3;
                    object = ((Iterable)object).iterator();
                    while (bl3 = object.hasNext()) {
                        object2 = object.next();
                        n3 = n4 + 1;
                        if (n4 >= 0) {
                            float f8;
                            object2 = (CartItemRequest)object2;
                            string3 = "cartRequest.cartItemRequests[";
                            object5 = Gj0.b(n4, string3, "].brand");
                            object4 = ((CartItemRequest)object2).getBrand();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].brick");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getBrick();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].catalogId");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getCatalogId();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].category");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getCategory();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].name");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getName();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].price");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getPrice();
                            if (object4 != null) {
                                f8 = ((Float)object4).floatValue();
                            } else {
                                f8 = 0.0f;
                                object4 = null;
                            }
                            object4 = String.valueOf(f8);
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].quantity");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getQuantity();
                            if (object4 == null) {
                                object4 = Float.valueOf(0.0f);
                            }
                            object4 = object4.toString();
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].season");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getSeason();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].skuId");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getSkuId();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].subCategory");
                            object5 = ((StringBuilder)object5).toString();
                            object4 = ((CartItemRequest)object2).getSubCategory();
                            if (object4 == null) {
                                object4 = object6;
                            }
                            hashMap.put(object5, object4);
                            object5 = new StringBuilder(string3);
                            ((StringBuilder)object5).append(n4);
                            ((StringBuilder)object5).append("].thumbnailImgUrl");
                            string2 = ((StringBuilder)object5).toString();
                            object2 = ((CartItemRequest)object2).getThumbnailImgUrl();
                            if (object2 == null) {
                                object2 = object6;
                            }
                            hashMap.put(string2, object2);
                            n4 = n3;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean j(LpStoredCardBalance lpStoredCardBalance) {
        Object object;
        boolean bl2;
        Object object2;
        String string2 = null;
        if (lpStoredCardBalance != null) {
            object2 = lpStoredCardBalance.getStatus();
        } else {
            bl2 = false;
            object2 = null;
        }
        String string3 = "SUCCESS";
        bl2 = string3.equalsIgnoreCase((String)object2);
        boolean bl3 = false;
        if (!bl2 && lpStoredCardBalance != null && (object = lpStoredCardBalance.getError()) != null) {
            boolean bl4;
            String string4 = ((Error)object).getCode();
            object = ((Error)object).getDescription();
            String string5 = "ERR.LOY.704";
            boolean bl5 = string5.equalsIgnoreCase(string4);
            if (bl5 || object != null && (bl4 = StringsKt.F((CharSequence)object, string4 = "mobile number is not registered", false))) {
                lpStoredCardBalance.setStatus(string3);
                object2 = Boolean.FALSE;
                lpStoredCardBalance.setMobileNumberRegistered((Boolean)object2);
                object2 = "";
                lpStoredCardBalance.setMobile((String)object2);
                bl2 = true;
            }
        }
        if (bl2) {
            boolean bl6;
            if (lpStoredCardBalance != null) {
                string2 = lpStoredCardBalance.isLRManaged();
            }
            if (bl6 = oo2_0.k(string2)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static boolean k(String string2) {
        boolean bl2;
        String string3 = "YES";
        boolean bl3 = string3.equalsIgnoreCase(string2);
        if (!bl3 && !(bl2 = (string3 = "NA").equalsIgnoreCase(string2))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean l(int n3, TenantResponse serializable, float f5, HashSet object) {
        int n4;
        int n7;
        boolean bl2 = false;
        if (object != null) {
            n7 = ((HashSet)object).size();
        } else {
            n7 = 0;
            object = null;
        }
        if (n7 > 0) {
            n7 = 0;
            object = null;
            float f6 = f5 - 0.0f;
            n4 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
            if (n4 == 0) {
                return true;
            }
        }
        n4 = 13;
        f5 = 1.8E-44f;
        if (n3 == n4) {
            if (serializable == null) return true;
            Object object2 = ((TenantResponse)serializable).getCashOnDeliveryInformation();
            if (object2 == null) return true;
            object2 = ((CashOnDeliveryInformation)object2).isEligible();
            Object object3 = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) return true;
            object2 = ((TenantResponse)serializable).getFraudEngineResponseDetails();
            n4 = 0;
            f5 = 0.0f;
            object3 = null;
            if (object2 != null && (object2 = ((FraudEngineResponse)object2).getResult()) != null && (object2 = ((FEResult)object2).getOutcomeWithoutPayment()) != null) {
                object2 = ((FEPayment)object2).getAction();
            } else {
                n3 = 0;
                object2 = null;
            }
            if ((n3 = (int)(((String)(object = "COD_BLOCK")).equalsIgnoreCase((String)object2) ? 1 : 0)) != 0) return true;
            object2 = ((TenantResponse)serializable).getFraudEngineResponseDetails();
            if (object2 != null && (object2 = ((FraudEngineResponse)object2).getResult()) != null && (object2 = ((FEResult)object2).getCOD()) != null) {
                object3 = ((FEPayment)object2).getAction();
            }
            if ((n3 = (int)(((String)object).equalsIgnoreCase((String)object3) ? 1 : 0)) == 0) return bl2;
            return true;
        }
        n4 = 36;
        f5 = 5.0E-44f;
        if (n3 != n4) return bl2;
        if (serializable == null) return true;
        Boolean bl3 = ((TenantResponse)serializable).isEmiAvailable();
        serializable = Boolean.TRUE;
        n3 = (int)(Intrinsics.areEqual(bl3, serializable) ? 1 : 0);
        if (n3 != 0) return bl2;
        return true;
    }

    public static PayNowRequest m(TenantResponse tenantResponse, PriceSplitUp priceSplitUp, boolean bl2) {
        PayNowRequest payNowRequest;
        Serializable serializable = tenantResponse;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        Object object = payNowRequest;
        Object object2 = null;
        Float f5 = null;
        int n3 = 0x3FFFFF;
        payNowRequest = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n3, null);
        object = tenantResponse.getCustomer();
        payNowRequest.setCustomer((Customer)object);
        object = tenantResponse.getOrder();
        payNowRequest.setOrder((Order)object);
        object = null;
        if (bl2) {
            object2 = priceSplitUp != null ? priceSplitUp.getTotalAmount() : null;
            if (object2 != null && (object2 = payNowRequest.getOrder()) != null) {
                f5 = priceSplitUp != null ? priceSplitUp.getTotalAmount() : null;
                ((Order)object2).setAmount(f5);
            }
        }
        object2 = priceSplitUp != null ? priceSplitUp.getOnepTotalPrice() : null;
        payNowRequest.setOnepTotalPrice((String)object2);
        if (priceSplitUp != null) {
            object = priceSplitUp.getThreepTotalPrice();
        }
        payNowRequest.setThreepTotalPrice((String)object);
        serializable = tenantResponse.getTenant();
        payNowRequest.setTenant((Tenant)serializable);
        payNowRequest.setPaymentInstrument("COD");
        return payNowRequest;
    }

    public static PayNowRequest n(Card card, PriceValidation priceValidation, TenantResponse tenantResponse, float f5) {
        PayNowRequest payNowRequest;
        Serializable serializable = tenantResponse;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        Object object = payNowRequest;
        Object object2 = null;
        int n3 = 0x3FFFFF;
        payNowRequest = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n3, null);
        object = tenantResponse.getCustomer();
        payNowRequest.setCustomer((Customer)object);
        object = tenantResponse.getOrder();
        payNowRequest.setOrder((Order)object);
        object = card;
        payNowRequest.setCard(card);
        serializable = tenantResponse.getTenant();
        payNowRequest.setTenant((Tenant)serializable);
        payNowRequest.setPaymentInstrument("CARD");
        int n4 = 0;
        float f6 = 0.0f;
        serializable = null;
        object = priceValidation != null ? priceValidation.getPriceSplitup() : null;
        if (object != null) {
            object = priceValidation.getPriceSplitup();
            object2 = object != null ? ((PriceSplitUp)object).getNetPayableAmount() : null;
            payNowRequest.setNetPayableAmount((Float)object2);
            object2 = object != null ? ((PriceSplitUp)object).getOnepTotalPrice() : null;
            payNowRequest.setOnepTotalPrice((String)object2);
            object2 = object != null ? ((PriceSplitUp)object).getThreepTotalPrice() : null;
            payNowRequest.setThreepTotalPrice((String)object2);
            if (object != null) {
                serializable = ((PriceSplitUp)object).getOfferDetails();
            }
            if (serializable != null) {
                float f7;
                serializable = ((PriceSplitUp)object).getOfferDetails();
                object = null;
                if (serializable != null && (serializable = ((OfferDetails)serializable).getOfferAmountApplied()) != null) {
                    f6 = ((Float)serializable).floatValue();
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    serializable = null;
                }
                n4 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n4 > 0) {
                    serializable = oo2_0.e(priceValidation);
                    payNowRequest.setOfferDetails((Map)((Object)serializable));
                }
            }
        } else {
            serializable = Float.valueOf(f5);
            payNowRequest.setNetPayableAmount((Float)serializable);
        }
        return payNowRequest;
    }

    public static PayNowRequest o(EMI eMI, TenantResponse tenantResponse, PriceValidation priceValidation, Float f5) {
        PayNowRequest payNowRequest;
        Object object = tenantResponse;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        Object object2 = payNowRequest;
        Object object3 = null;
        int n3 = 0x3FFFFF;
        payNowRequest = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n3, null);
        object2 = tenantResponse.getCustomer();
        payNowRequest.setCustomer((Customer)object2);
        object2 = tenantResponse.getOrder();
        payNowRequest.setOrder((Order)object2);
        object = tenantResponse.getTenant();
        payNowRequest.setTenant((Tenant)object);
        object = eMI;
        payNowRequest.setEmi(eMI);
        payNowRequest.setPaymentInstrument("EMI");
        int n4 = 0;
        float f6 = 0.0f;
        object = null;
        object2 = priceValidation != null ? priceValidation.getPriceSplitup() : null;
        if (object2 != null) {
            object2 = priceValidation.getPriceSplitup();
            object3 = object2 != null ? ((PriceSplitUp)object2).getNetPayableAmount() : null;
            payNowRequest.setNetPayableAmount((Float)object3);
            object3 = object2 != null ? ((PriceSplitUp)object2).getOnepTotalPrice() : null;
            payNowRequest.setOnepTotalPrice((String)object3);
            object3 = object2 != null ? ((PriceSplitUp)object2).getThreepTotalPrice() : null;
            payNowRequest.setThreepTotalPrice((String)object3);
            if (object2 != null) {
                object = ((PriceSplitUp)object2).getOfferDetails();
            }
            if (object != null) {
                float f7;
                object = ((PriceSplitUp)object2).getOfferDetails();
                object2 = null;
                if (object != null && (object = ((OfferDetails)object).getOfferAmountApplied()) != null) {
                    f6 = ((Float)object).floatValue();
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    object = null;
                }
                n4 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n4 > 0) {
                    object = oo2_0.e(priceValidation);
                    payNowRequest.setOfferDetails((Map)object);
                }
            }
        } else {
            object = f5;
            payNowRequest.setNetPayableAmount(f5);
        }
        return payNowRequest;
    }

    public static PayNowRequest p(NetBanking netBanking, TenantResponse tenantResponse, PriceValidation priceValidation, Float f5) {
        PayNowRequest payNowRequest;
        Object object = tenantResponse;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        Object object2 = payNowRequest;
        Object object3 = null;
        int n3 = 0x3FFFFF;
        payNowRequest = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n3, null);
        object2 = tenantResponse.getCustomer();
        payNowRequest.setCustomer((Customer)object2);
        object2 = tenantResponse.getOrder();
        payNowRequest.setOrder((Order)object2);
        object = tenantResponse.getTenant();
        payNowRequest.setTenant((Tenant)object);
        object = netBanking;
        payNowRequest.setNetBanking(netBanking);
        payNowRequest.setPaymentInstrument("NET_BANKING");
        int n4 = 0;
        float f6 = 0.0f;
        object = null;
        object2 = priceValidation != null ? priceValidation.getPriceSplitup() : null;
        if (object2 != null) {
            object2 = priceValidation.getPriceSplitup();
            object3 = object2 != null ? ((PriceSplitUp)object2).getNetPayableAmount() : null;
            payNowRequest.setNetPayableAmount((Float)object3);
            object3 = object2 != null ? ((PriceSplitUp)object2).getOnepTotalPrice() : null;
            payNowRequest.setOnepTotalPrice((String)object3);
            object3 = object2 != null ? ((PriceSplitUp)object2).getThreepTotalPrice() : null;
            payNowRequest.setThreepTotalPrice((String)object3);
            if (object2 != null) {
                object = ((PriceSplitUp)object2).getOfferDetails();
            }
            if (object != null) {
                float f7;
                object = ((PriceSplitUp)object2).getOfferDetails();
                object2 = null;
                if (object != null && (object = ((OfferDetails)object).getOfferAmountApplied()) != null) {
                    f6 = ((Float)object).floatValue();
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    object = null;
                }
                n4 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n4 > 0) {
                    object = oo2_0.e(priceValidation);
                    payNowRequest.setOfferDetails((Map)object);
                }
            }
        } else {
            object = f5;
            payNowRequest.setNetPayableAmount(f5);
        }
        return payNowRequest;
    }

    public static PayNowRequest q(UPI uPI, TenantResponse tenantResponse, Float f5) {
        PayNowRequest payNowRequest;
        Object object = uPI;
        Object object2 = tenantResponse;
        Intrinsics.checkNotNullParameter(tenantResponse, "tenantResponse");
        Object object3 = payNowRequest;
        Object object4 = null;
        int n3 = 0x3FFFFF;
        payNowRequest = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n3, null);
        object3 = tenantResponse.getCustomer();
        payNowRequest.setCustomer((Customer)object3);
        object3 = tenantResponse.getOrder();
        payNowRequest.setOrder((Order)object3);
        object2 = tenantResponse.getTenant();
        payNowRequest.setTenant((Tenant)object2);
        payNowRequest.setUpi(uPI);
        payNowRequest.setPaymentInstrument("UPI");
        int n4 = 0;
        float f6 = 0.0f;
        object2 = null;
        object3 = uPI != null && (object3 = uPI.getPriceValidation()) != null ? ((PriceValidation)object3).getPriceSplitup() : null;
        if (object3 != null) {
            object3 = uPI.getPriceValidation();
            object3 = object3 != null ? ((PriceValidation)object3).getPriceSplitup() : null;
            object4 = object3 != null ? ((PriceSplitUp)object3).getNetPayableAmount() : null;
            payNowRequest.setNetPayableAmount((Float)object4);
            object4 = object3 != null ? ((PriceSplitUp)object3).getOnepTotalPrice() : null;
            payNowRequest.setOnepTotalPrice((String)object4);
            object4 = object3 != null ? ((PriceSplitUp)object3).getThreepTotalPrice() : null;
            payNowRequest.setThreepTotalPrice((String)object4);
            if (object3 != null) {
                object2 = ((PriceSplitUp)object3).getOfferDetails();
            }
            if (object2 != null) {
                float f7;
                object2 = ((PriceSplitUp)object3).getOfferDetails();
                object3 = null;
                if (object2 != null && (object2 = ((OfferDetails)object2).getOfferAmountApplied()) != null) {
                    f6 = ((Float)object2).floatValue();
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
                n4 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n4 > 0 && (object = uPI.getPriceValidation()) != null) {
                    object2 = a;
                    object2.getClass();
                    object = oo2_0.e((PriceValidation)object);
                    payNowRequest.setOfferDetails((Map)object);
                }
            }
        } else {
            object = f5;
            payNowRequest.setNetPayableAmount(f5);
        }
        return payNowRequest;
    }

    public static void r(String string2, boolean bl2, ArrayList arrayList) {
        if (arrayList != null && string2 != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                boolean bl3;
                LpStoredCardBalance lpStoredCardBalance = (LpStoredCardBalance)arrayList.get(i3);
                if (lpStoredCardBalance == null) continue;
                if (bl2 && (bl3 = string2.equalsIgnoreCase((String)(object = lpStoredCardBalance.getPayId())))) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object = null;
                }
                object = bl3;
                lpStoredCardBalance.setSelected((Boolean)object);
            }
        }
    }

    public static TransactionStatusRequest s(TenantResponse object) {
        TransactionStatusRequest transactionStatusRequest;
        Intrinsics.checkNotNullParameter(object, "tenantResponse");
        Object object2 = transactionStatusRequest;
        transactionStatusRequest = new TransactionStatusRequest(null, null, null, null, 15, null);
        object2 = ((TenantResponse)object).getTenant();
        transactionStatusRequest.setTenant((Tenant)object2);
        object = ((TenantResponse)object).getTenantTransactionId();
        transactionStatusRequest.setTenantTransactionId((String)object);
        return transactionStatusRequest;
    }
}

