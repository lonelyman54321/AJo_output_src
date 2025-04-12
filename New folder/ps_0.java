/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.EarnPoint;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Product.EddResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PS
 */
public final class ps_0
extends Hj {
    public final r33 a;
    public final zr1_1 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public EarnPoint i;
    public Cart j;
    public Cart k;
    public EddResult l;
    public final ArrayList m;
    public final ArrayList n;
    public CartDeliveryAddress o;
    public final HashMap p;
    public final HashMap q;
    public final t30_0 r;
    public final zr1_1 s;
    public final zr1_1 t;

    public ps_0(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        object = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        Object object2 = new r33((Context)object);
        this.a = object2;
        super();
        this.b = object;
        super();
        this.c = object;
        super();
        this.d = object;
        super();
        this.e = object;
        this.f = object2 = new zr1_1();
        Object object3 = new zr1_1();
        this.g = object3;
        this.h = object3;
        object3 = new ArrayList();
        this.m = object3;
        object3 = new ArrayList();
        this.n = object3;
        super();
        this.p = object3;
        super();
        this.q = object3;
        this.r = object3 = new t30_0();
        this.s = object;
        this.t = object2;
    }

    /*
     * Unable to fully structure code
     */
    public static void b(PaymentInstruments var0, HashSet var1_1) {
        var2_2 = var1_1;
        var3_3 = go2_0.a;
        oo2_0.a.getClass();
        var4_4 = var0;
        var3_3 = oo2_0.c("INTERNAL_WALLET", var0);
        if (var3_3 != null && (var3_3 = var3_3.getPaymentInstrumentsInfo()) != null) {
            var3_3 = var3_3.iterator();
            while (var5_5 = var3_3.hasNext()) {
                var4_4 = (PaymentInstrumentInfo)var3_3.next();
                var6_6 = new Bundle();
                var7_7 = false;
                var8_8 = null;
                if (var4_4 != null) {
                    var9_9 = var4_4.getType();
                } else {
                    var10_10 = false;
                    var9_9 = null;
                }
                var11_11 = "AJIO_CASH_WALLET";
                var10_10 = Intrinsics.areEqual(var11_11, var9_9);
                var12_12 = "disable";
                var13_13 = true;
                var14_14 = "enable";
                if (var10_10) {
                    if (var2_2 != null && (var5_5 = var2_2.contains(var11_11)) == var13_13) {
                        var12_12 = var14_14;
                    }
                    var6_6.putString("ajio_wallet", var12_12);
                    var4_4 = "ajio wallet";
lbl29:
                    // 2 sources

                    while (true) {
                        var15_15 = var4_4;
                        var16_16 = var12_12;
                        break;
                    }
                } else {
                    if (var4_4 != null) {
                        var8_8 = var4_4.getType();
                    }
                    if (var7_7 = Intrinsics.areEqual(var4_4 = "RELIANCE_ONE_WALLET", var8_8)) {
                        if (var2_2 != null && (var5_5 = var2_2.contains(var4_4)) == var13_13) {
                            var12_12 = var14_14;
                        }
                        var6_6.putString("rone", var12_12);
                        var4_4 = "rone wallet";
                        ** continue;
                    }
                    var15_15 = var4_4 = "";
                    var16_16 = var14_14;
                }
                var4_4 = AnalyticsManager.Companion.getInstance();
                var17_17 = var4_4.getGtmEvents();
                var18_18 = ne_0.b(var6_6);
                var19_19 = 16;
                var20_20 = "single page checkout";
                GTMEvents.pushButtonTapEvent$default(var17_17, (String)var15_15, var16_16, var20_20, var18_18, null, var19_19, null);
            }
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.r.d();
    }
}

