/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.payment.utils;

import android.os.Bundle;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class InternalWalletUtil {
    public static final InternalWalletUtil a;
    public static double b;
    public static final hh3_2 c;
    public static final hh3_2 d;
    public static final hh3_2 e;

    static {
        Object object = new Object();
        a = object;
        object = new Object();
        c = yr1_2.b((Function0)object);
        object = new Object();
        d = yr1_2.b((Function0)object);
        object = new ob0_2(1);
        e = yr1_2.b((Function0)object);
    }

    public static HashSet a() {
        return (HashSet)e.getValue();
    }

    public static float b(PaymentInstrumentInfo serializable, HashSet hashSet) {
        float f5 = 0.0f;
        if (serializable != null) {
            int n3;
            String string2;
            int n4;
            if (hashSet != null) {
                n4 = hashSet.size();
            } else {
                n4 = 0;
                string2 = null;
            }
            int n7 = 1;
            if (n4 > n7 && hashSet != null && (n3 = CollectionsKt.F(hashSet, string2 = ((PaymentInstrumentInfo)serializable).getCode())) == n7) {
                if ((serializable = ((PaymentInstrumentInfo)serializable).getMultipleWalletEnabledAmount()) != null) {
                    f5 = ((Float)serializable).floatValue();
                }
            } else if ((serializable = ((PaymentInstrumentInfo)serializable).getAmount()) != null) {
                f5 = ((Float)serializable).floatValue();
            }
        }
        return f5;
    }

    public static String c(String string2) {
        block6: {
            String string3 = "walletCode";
            Intrinsics.checkNotNullParameter(string2, string3);
            int n3 = string2.hashCode();
            switch (n3) {
                default: {
                    break;
                }
                case 1924568853: {
                    string3 = "TAARA_WALLET";
                    boolean bl2 = string2.equals(string3);
                    if (!bl2) break;
                    string2 = "tara";
                    break block6;
                }
                case 1276218386: {
                    string3 = "RELIANCE_ONE_WALLET";
                    boolean bl3 = string2.equals(string3);
                    if (!bl3) break;
                    string2 = "rone";
                    break block6;
                }
                case -839073524: {
                    string3 = "MAHA_CASHBACK";
                    boolean bl4 = string2.equals(string3);
                    if (!bl4) break;
                    string2 = "mahacashback";
                    break block6;
                }
                case -1632481963: {
                    string3 = "AJIO_CASH_WALLET";
                    boolean bl5 = string2.equals(string3);
                    if (!bl5) break;
                    string2 = "ajio_wallet";
                    break block6;
                }
            }
            string2 = "";
        }
        return string2;
    }

    public static String d(String string2) {
        block6: {
            String string3 = "walletCode";
            Intrinsics.checkNotNullParameter(string2, string3);
            int n3 = string2.hashCode();
            switch (n3) {
                default: {
                    break;
                }
                case 1924568853: {
                    string3 = "TAARA_WALLET";
                    boolean bl2 = string2.equals(string3);
                    if (!bl2) break;
                    string2 = "tara_wallet";
                    break block6;
                }
                case 1276218386: {
                    string3 = "RELIANCE_ONE_WALLET";
                    boolean bl3 = string2.equals(string3);
                    if (!bl3) break;
                    string2 = "rone_wallet";
                    break block6;
                }
                case -839073524: {
                    string3 = "MAHA_CASHBACK";
                    boolean bl4 = string2.equals(string3);
                    if (!bl4) break;
                    string2 = "maha_cashback_wallet";
                    break block6;
                }
                case -1632481963: {
                    string3 = "AJIO_CASH_WALLET";
                    boolean bl5 = string2.equals(string3);
                    if (!bl5) break;
                    string2 = "ajio_wallet";
                    break block6;
                }
            }
            string2 = "";
        }
        return string2;
    }

    public static HashSet e() {
        return (HashSet)d.getValue();
    }

    public static String f(String string2) {
        block6: {
            String string3 = "walletCode";
            Intrinsics.checkNotNullParameter(string2, string3);
            int n3 = string2.hashCode();
            switch (n3) {
                default: {
                    break;
                }
                case 1924568853: {
                    string3 = "TAARA_WALLET";
                    boolean bl2 = string2.equals(string3);
                    if (!bl2) break;
                    string2 = "tara wallet";
                    break block6;
                }
                case 1276218386: {
                    string3 = "RELIANCE_ONE_WALLET";
                    boolean bl3 = string2.equals(string3);
                    if (!bl3) break;
                    string2 = "rone wallet";
                    break block6;
                }
                case -839073524: {
                    string3 = "MAHA_CASHBACK";
                    boolean bl4 = string2.equals(string3);
                    if (!bl4) break;
                    string2 = "maha cashback";
                    break block6;
                }
                case -1632481963: {
                    string3 = "AJIO_CASH_WALLET";
                    boolean bl5 = string2.equals(string3);
                    if (!bl5) break;
                    string2 = "ajio wallet";
                    break block6;
                }
            }
            string2 = "";
        }
        return string2;
    }

    public static Bundle g(PaymentInstruments iterator, HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
        Bundle bundle = new Bundle();
        if (iterator != null && (iterator = ((PaymentInstruments)((Object)iterator)).getPaymentInstrumentDetails()) != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                String string2;
                boolean bl4;
                String string3;
                Object object = (PaymentInstrumentType)iterator.next();
                if (object != null) {
                    string3 = ((PaymentInstrumentType)object).getPaymentInstrumentCode();
                } else {
                    bl4 = false;
                    string3 = null;
                }
                if (!(bl4 = kotlin.text.b.i(string3, string2 = "INTERNAL_WALLET", bl3 = true))) continue;
                if (object == null || (iterator = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) == null) break;
                iterator = iterator.iterator();
                while (bl2 = iterator.hasNext()) {
                    int n3;
                    object = (PaymentInstrumentInfo)iterator.next();
                    if (object == null || (string3 = ((PaymentInstrumentInfo)object).getCode()) == null || (n3 = string3.length()) <= 0) continue;
                    string2 = InternalWalletUtil.c(string3);
                    bl4 = hashSet.contains(string3);
                    if (bl4) {
                        bundle.putString(string2, "used");
                        string3 = string2.concat("_cm");
                        float f5 = InternalWalletUtil.b((PaymentInstrumentInfo)object, hashSet);
                        bundle.putFloat(string3, f5);
                        continue;
                    }
                    object = "not used";
                    bundle.putString(string2, (String)object);
                }
                break block0;
            }
        }
        return bundle;
    }
}

