/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.query.FetchWalletsRequest;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class MockResponseInterceptor
implements nj1_2 {
    private final Context context;

    public MockResponseInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isCMSPage(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "/storefront/cms/page", false);
    }

    private final boolean isCalculatePrice(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "service/calculate-price", false);
    }

    private final boolean isCmsSis(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "/storefront/cms/stores", false);
    }

    private final boolean isFetchWallet(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "reliance/wallets", false);
    }

    private final boolean isJioEngage(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "/page/preview", false);
    }

    private final boolean isPDP(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "/aggregator/pdp/", false);
    }

    private final boolean isPLPFirstPage(kj2_2 object) {
        String string2 = ((kj2_2)object).a.k().toString();
        String string3 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        String string4 = "products/category";
        boolean bl2 = false;
        boolean bl3 = StringsKt.F(string2, string4, false);
        if (bl3) {
            object = ((kj2_2)object).a.k().toString();
            Intrinsics.checkNotNullExpressionValue(object, string3);
            string2 = "currentPage=0";
            boolean bl4 = StringsKt.F((CharSequence)object, string2, false);
            if (bl4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private final boolean isPaymentInstrument(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "payment-instruments/all", false);
    }

    private final boolean isPaymentTxnHistory(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "v3/txnHistory", false);
    }

    private final boolean isProductDetails(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "recentlyViewed?productCodes", false);
    }

    private final boolean isRecentlyViewed(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "/recentlyViewed", false);
    }

    private final boolean isSimilarToPage(kj2_2 object) {
        object = ((kj2_2)object).a.k().toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return StringsKt.F((CharSequence)object, "v2/rilfnl/recommend/", false);
    }

    private final boolean isWishlistFirstPage(kj2_2 object) {
        String string2 = ((kj2_2)object).a.k().toString();
        String string3 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        String string4 = "/wishlist/v2/viewall";
        boolean bl2 = false;
        boolean bl3 = StringsKt.F(string2, string4, false);
        if (bl3) {
            object = ((kj2_2)object).a.k().toString();
            Intrinsics.checkNotNullExpressionValue(object, string3);
            string2 = "currentPage=0";
            boolean bl4 = StringsKt.F((CharSequence)object, string2, false);
            if (bl4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private final String loadJSONFromAsset(String object) {
        Object object2 = this.context;
        object2 = object2.getAssets();
        object = object2.open((String)object);
        object2 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((InputStream)object).available();
        object2 = new byte[n3];
        ((InputStream)object).read((byte[])object2);
        ((InputStream)object).close();
        object = StandardCharsets.UTF_8;
        String string2 = "UTF_8";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        try {
            string2 = new String((byte[])object2, (Charset)object);
        }
        catch (IOException iOException) {
            object2 = yn3_0.a;
            object2.e(iOException);
            string2 = null;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public cl2_2 intercept(nj1$a object) {
        Object object2;
        jl2_2 jl2_22;
        Object object3;
        Object object4;
        block22: {
            block24: {
                boolean bl2;
                boolean bl3;
                block25: {
                    boolean bl4;
                    block29: {
                        block27: {
                            boolean bl5;
                            boolean bl6;
                            block28: {
                                Exception exception2;
                                block21: {
                                    boolean bl7;
                                    block20: {
                                        block26: {
                                            block23: {
                                                object4 = "ALL";
                                                Intrinsics.checkNotNullParameter(object, "chain");
                                                object3 = object.request();
                                                bl7 = this.isPaymentInstrument((kj2_2)object3);
                                                if (!bl7 && !(bl7 = this.isPDP((kj2_2)object3))) {
                                                    return object.a((kj2_2)object3);
                                                }
                                                bl7 = this.isPaymentInstrument((kj2_2)object3);
                                                bl3 = true;
                                                jl2_22 = null;
                                                if (!bl7) break block23;
                                                object4 = object.a((kj2_2)object3).g;
                                                if (object4 != null) {
                                                    object4 = ((il2_2)object4).k();
                                                } else {
                                                    boolean bl8 = false;
                                                    object4 = null;
                                                }
                                                object3 = PaymentInstruments.class;
                                                object4 = (PaymentInstruments)JsonUtils.fromJson((String)object4, (Class)object3);
                                                if (object4 != null) {
                                                    object3 = Boolean.FALSE;
                                                    ((PaymentInstruments)object4).setDisplayAjioWalletAboveLoader((Boolean)object3);
                                                }
                                                object3 = this.loadJSONFromAsset("paymentInstrumentsInfo.json");
                                                object2 = PaymentInstrumentType.class;
                                                object3 = (PaymentInstrumentType)JsonUtils.fromJson((String)object3, object2);
                                                if (object4 == null || (object2 = ((PaymentInstruments)object4).getPaymentInstrumentDetails()) == null) break block24;
                                                object2 = ((Iterable)object2).iterator();
                                                break block25;
                                            }
                                            bl7 = this.isCmsSis((kj2_2)object3);
                                            if (!bl7) break block26;
                                            object4 = this.loadJSONFromAsset("sisCMSData.json");
                                            break block22;
                                        }
                                        bl7 = this.isFetchWallet((kj2_2)object3);
                                        if (!bl7) break block27;
                                        long l2 = 5000L;
                                        Thread.sleep(l2);
                                        try {
                                            object3 = ((kj2_2)object3).c();
                                            object3 = ((KJ2$a)object3).b();
                                            object2 = new ce_2();
                                            object3 = ((kj2_2)object3).d;
                                            if (object3 == null) break block20;
                                            ((pj2_2)object3).writeTo((re_2)object2);
                                        }
                                        catch (Exception exception2) {
                                            break block21;
                                        }
                                    }
                                    object3 = ((ce_2)object2).I();
                                    object2 = FetchWalletsRequest.class;
                                    object3 = JsonUtils.fromJson((String)object3, object2);
                                    if ((object3 = (FetchWalletsRequest)object3) == null) break block28;
                                    object2 = ((FetchWalletsRequest)object3).getInternalWallets();
                                    boolean bl9 = false;
                                    Object var10_15 = null;
                                    if (object2 != null) {
                                        bl7 = ((ArrayList)object2).size();
                                    } else {
                                        bl7 = false;
                                        object2 = null;
                                    }
                                    if (bl7 == bl3 && (object3 = ((FetchWalletsRequest)object3).getInternalWallets()) != null) {
                                        object3 = ((ArrayList)object3).get(0);
                                        if ((object3 = (String)object3) != null) {
                                            object4 = object3;
                                        }
                                    }
                                    break block28;
                                }
                                object2 = yn3_0.a;
                                ((yn3$a)object2).e(exception2);
                            }
                            object4 = (bl6 = Intrinsics.areEqual(object4, object3 = "MAHA_CASHBACK")) ? this.loadJSONFromAsset("fetchWallets_mahacashback.json") : ((bl5 = Intrinsics.areEqual(object4, object3 = "RELIANCE_ONE_WALLET")) ? this.loadJSONFromAsset("fetchWallets_r1.json") : this.loadJSONFromAsset("fetchWallets.json"));
                            break block22;
                        }
                        bl4 = this.isCalculatePrice((kj2_2)object3);
                        if (!bl4) break block29;
                        object4 = this.loadJSONFromAsset("calculatePrice.json");
                        break block22;
                    }
                    bl4 = this.isPaymentTxnHistory((kj2_2)object3);
                    if (bl4) {
                        object4 = this.loadJSONFromAsset("paymentResponsetest.json");
                        break block22;
                    } else {
                        bl4 = this.isPDP((kj2_2)object3);
                        if (bl4) {
                            object4 = this.loadJSONFromAsset("pdp.json");
                            break block22;
                        } else {
                            bl4 = false;
                            object4 = null;
                        }
                    }
                    break block22;
                }
                while (bl2 = object2.hasNext()) {
                    String string2;
                    boolean bl10;
                    Object object5;
                    PaymentInstrumentType paymentInstrumentType = (PaymentInstrumentType)object2.next();
                    if (paymentInstrumentType != null) {
                        object5 = paymentInstrumentType.getPaymentInstrumentCode();
                    } else {
                        bl10 = false;
                        object5 = null;
                    }
                    if (!(bl10 = b.i((String)object5, string2 = "INTERNAL_WALLET", bl3)) || paymentInstrumentType == null) continue;
                    if (object3 != null) {
                        object5 = ((PaymentInstrumentType)object3).getPaymentInstrumentsInfo();
                    } else {
                        bl10 = false;
                        object5 = null;
                    }
                    paymentInstrumentType.setPaymentInstrumentsInfo((ArrayList)object5);
                }
            }
            object4 = JsonUtils.toJson(object4);
        }
        object3 = "application/json";
        if (object4 != null) {
            object2 = jn1_0.d;
            object2 = JN1$a.b((String)object3);
            jl2_22 = iL2$b.a((String)object4, (jn1_0)object2);
        }
        object4 = new cl2$a_0();
        ((cl2$a_0)object4).c = 200;
        ((cl2$a_0)object4).g = jl2_22;
        String string3 = "content-type";
        Intrinsics.checkNotNullParameter(string3, "name");
        Intrinsics.checkNotNullParameter(object3, "value");
        ((cl2$a_0)object4).f.a(string3, (String)object3);
        object3 = "success";
        Intrinsics.checkNotNullParameter(object3, "message");
        ((cl2$a_0)object4).d = object3;
        object3 = ib2_2.HTTP_2;
        ((cl2$a_0)object4).d((ib2_2)((Object)object3));
        object = object.request();
        Intrinsics.checkNotNullParameter(object, "request");
        ((cl2$a_0)object4).a = object;
        return ((cl2$a_0)object4).a();
    }
}

