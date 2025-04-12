/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Kj2
 */
public final class kj2_1
extends Hj {
    public final hh3_2 A;
    public final zr1_1 B;
    public final zr1_1 C;
    public String D;
    public TenantResponse E;
    public final zr1_1 a;
    public final zr1_1 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final m80_0 e;
    public PriceValidation f;
    public LuxeDetails g;
    public final ArrayList h;
    public ArrayList i;
    public float j;
    public String k;
    public int l;
    public ArrayList m;
    public ArrayList n;
    public float o;
    public HashMap p;
    public au3 q;
    public String r;
    public PaymentInstruments s;
    public Cart t;
    public final HashSet u;
    public boolean v;
    public HashSet w;
    public String x;
    public String y;
    public InstantDiscountInfo z;

    public kj2_1(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        super();
        this.a = object;
        this.b = object;
        super();
        this.c = object;
        this.d = object;
        super();
        this.e = object;
        super();
        this.h = object;
        super();
        this.u = object;
        super();
        this.w = object;
        super(this, 0);
        object = yr1_2.b((Function0)object);
        this.A = object;
        super();
        this.B = object;
        this.C = object;
    }

    public static HashSet b(ArrayList object) {
        HashSet<Object> hashSet = new HashSet<Object>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                String string2;
                Object object2 = (PaymentInstrumentInfo)object.next();
                int n3 = ((PaymentInstrumentInfo)object2).isSelected();
                if (n3 == 0 || (string2 = ((PaymentInstrumentInfo)object2).getCode()) == null || (n3 = string2.length()) == 0) continue;
                object2 = ((PaymentInstrumentInfo)object2).getCode();
                Intrinsics.checkNotNull(object2);
                hashSet.add(object2);
            }
        }
        return hashSet;
    }

    public static /* synthetic */ void e(kj2_1 kj2_12, String string2, int n3, String string3, int n4) {
        if ((n4 &= 2) != 0) {
            n3 = 3;
        }
        kj2_12.d(n3, string2, "Payment screen", string3);
    }

    public final void c(hj2_0 object) {
        Intrinsics.checkNotNullParameter(object, "fragmentData");
        zr1_1 zr1_12 = this.c;
        object = DataCallback.Companion.onSuccess(object);
        zr1_12.k(object);
    }

    /*
     * Unable to fully structure code
     */
    public final void d(int var1_1, String var2_2, String var3_3, String var4_4) {
        var5_5 = this;
        var6_6 = var3_3;
        var7_7 = var4_4;
        Intrinsics.checkNotNullParameter(var2_2, "mode");
        var8_8 = "screenName";
        Intrinsics.checkNotNullParameter(var3_3, (String)var8_8);
        var9_9 = this.y;
        if (var9_9 == null || (var10_10 = var9_9.length()) == 0) ** GOTO lbl-1000
        var9_9 = null;
        var11_11 = "Internal Wallet";
        var10_10 = (int)kotlin.text.b.i(var4_4, (String)var11_11, false);
        if (var10_10 == 0) {
            var9_9 = this.y;
            var11_11 = ",";
            var7_7 = n1.a(var4_4, (String)var11_11, (String)var9_9);
            this.x = var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5.x = var7_7;
        }
        var12_12 = var5_5.x;
        var7_7 = "paymentMode";
        Intrinsics.checkNotNullParameter(var2_2, (String)var7_7);
        Intrinsics.checkNotNullParameter(var6_6, (String)var8_8);
        var13_13 = og1_1.b();
        if (!var13_13) {
            var7_7 = h40_0.a;
            var13_13 = h40_0.Y1();
            if (var13_13 && (var13_13 = h40_0.T0()) && (var7_7 = var5_5.t) != null) {
                var7_7 = var7_7.getEntries().iterator();
                var8_8 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(var7_7, (String)var8_8);
                while ((var14_14 = var7_7.hasNext()) != 0) {
                    var8_8 = (CartEntry)var7_7.next();
                    var9_9 = var8_8.getAverageRating();
                    var11_11 = var8_8.getNumUserRatings();
                    var16_16 = 1;
                    var15_15 = new ry0_1(var8_8, var16_16);
                    ai0_2.r((Function2)var15_15, var9_9, var11_11);
                }
            }
        }
        if ((var7_7 = var5_5.t) != null && (var11_11 = var7_7.getEntries()) != null) {
            var7_7 = GAEcommerceEvents.INSTANCE;
            var9_9 = n1.a(uy2_1.b, " | ", var2_2);
            var17_17 = var5_5.s;
            var18_18 = var5_5.w;
            var8_8 = var5_5.t;
            if (var8_8 != null) {
                var8_8 = var8_8.getAppliedVouchers();
            } else {
                var14_14 = 0;
                var8_8 = null;
            }
            var15_15 = "checkout_progress";
            var14_14 = var1_1;
            var6_6 = var3_3;
            var7_7.sendCheckoutOptions(var1_1, (String)var9_9, (ArrayList)var11_11, var3_3, (String)var15_15, var17_17, var18_18, var2_2, (List)var8_8, var12_12);
        }
        var5_5.a.k(var2_2);
    }
}

