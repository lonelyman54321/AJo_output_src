/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OptedPaymentModeOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class De2$F
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ CartOrder b;
    public final /* synthetic */ Product c;

    public De2$F(qz1_2 qz1_22, CartOrder cartOrder, Product product) {
        this.a = qz1_22;
        this.b = cartOrder;
        this.c = product;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object iterator, Object object, Object iterator2) {
        Object object2;
        block104: {
            Object object3;
            block107: {
                float f5;
                String string2;
                Boolean bl2;
                long l2;
                int n3;
                String string3;
                float f6;
                int n4;
                Object object4;
                int n7;
                int n8;
                String string4;
                boolean bl3;
                Object object5;
                long l3;
                float f7;
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                int n10;
                boolean bl4;
                int n14;
                int n15;
                Object object10;
                int n16;
                int n17;
                int n18;
                Object object11;
                int n19;
                Object object12;
                Object object13;
                Object object14;
                block106: {
                    float f8;
                    float f11;
                    long l4;
                    double d2;
                    float f12;
                    long l7;
                    float f14;
                    float f15;
                    int n20;
                    float f16;
                    float f17;
                    int n21;
                    Object object15;
                    block105: {
                        float f18;
                        float f19;
                        long l8;
                        float f20;
                        float f22;
                        int n22;
                        float f23;
                        De2$F de2$F = this;
                        object14 = "data";
                        object13 = iterator;
                        object13 = (PA)((Object)iterator);
                        Object object16 = object;
                        object16 = (b30_0)object;
                        object12 = iterator2;
                        object12 = (Number)((Object)iterator2);
                        n19 = ((Number)object12).intValue();
                        object11 = "$this$BoxWithConstraints";
                        Intrinsics.checkNotNullParameter(object13, (String)object11);
                        n18 = n19 & 0x51;
                        n17 = 16;
                        if (n18 == n17 && (n18 = (int)(object16.h() ? 1 : 0)) != 0) {
                            object16.D();
                            return Unit.a;
                        }
                        object13 = LP1$a.b;
                        object12 = zp.c;
                        object11 = Nc$a.m;
                        n16 = 0;
                        object10 = null;
                        object12 = oZ.a((zp$l)object12, (Gx$a)object11, (b30_0)object16, 0);
                        n15 = object16.F();
                        object15 = object16.m();
                        Object object17 = a30_0.c((b30_0)object16, (LP1)object13);
                        N20.W.getClass();
                        Xp1$a xp1$a = N20$a.b;
                        object3 = object16.i();
                        n14 = object3 instanceof mp;
                        if (n14 == 0) {
                            s20.a();
                            throw null;
                        }
                        object16.A();
                        n14 = object16.e();
                        if (n14 != 0) {
                            object16.C(xp1$a);
                        } else {
                            object16.n();
                        }
                        object3 = N20$a.e;
                        Ow3.a((b30_0)object16, object12, (Function2)object3);
                        object12 = N20$a.d;
                        Ow3.a((b30_0)object16, object15, (Function2)object12);
                        object15 = N20$a.f;
                        bl4 = object16.e();
                        if (bl4 || (n10 = Intrinsics.areEqual(object2 = object16.v(), object9 = Integer.valueOf(n15))) == 0) {
                            re0_0.a(n15, (b30_0)object16, n15, (N20$a$a)object15);
                        }
                        object9 = N20$a.c;
                        Ow3.a((b30_0)object16, object17, (Function2)object9);
                        object2 = AndroidCompositionLocals_androidKt.b;
                        object2 = (Context)object16.j((H30)object2);
                        object17 = de2$F.a;
                        object17.getClass();
                        Intrinsics.checkNotNullParameter(object2, "context");
                        object11 = ((qz1_2)object17).i;
                        object8 = (CharSequence)((h83_0)object11).getValue();
                        bl4 = TextUtils.isEmpty((CharSequence)object8);
                        if (!bl4) {
                            n21 = R$string.download_invoice_return_unavailable_message;
                            object7 = object2.getString(n21);
                            Intrinsics.checkNotNull(object7);
                        } else {
                            n21 = R$string.download_invoice_unavailable_message;
                            object7 = object2.getString(n21);
                            Intrinsics.checkNotNull(object7);
                        }
                        object2 = zp.f;
                        float f24 = 1.0f;
                        object6 = j.c((LP1)object13, f24);
                        object10 = Nc$a.k;
                        object2 = iQ2.a((zp$e)object2, (Gx$b)object10, (b30_0)object16, 54);
                        n17 = object16.F();
                        object8 = object11;
                        object11 = object16.m();
                        object6 = a30_0.c((b30_0)object16, (LP1)object6);
                        Object object18 = object17;
                        object17 = object16.i();
                        int n24 = object17 instanceof mp;
                        if (n24 == 0) {
                            s20.a();
                            throw null;
                        }
                        object16.A();
                        n24 = object16.e();
                        if (n24 != 0) {
                            object16.C(xp1$a);
                        } else {
                            object16.n();
                        }
                        Ow3.a((b30_0)object16, object2, (Function2)object3);
                        Ow3.a((b30_0)object16, object11, (Function2)object12);
                        n14 = object16.e();
                        if (n14 != 0 || (n14 = Intrinsics.areEqual(object3 = object16.v(), object2 = Integer.valueOf(n17))) == 0) {
                            re0_0.a(n17, (b30_0)object16, n17, (N20$a$a)object15);
                        }
                        Ow3.a((b30_0)object16, object6, (Function2)object9);
                        n14 = R$string.order_payment_details;
                        object12 = nk_0.f((b30_0)object16, n14);
                        n14 = 16;
                        f7 = 2.2E-44f;
                        long l12 = Em3.f(n14);
                        object9 = tv0_0.o;
                        l3 = xx_1.e;
                        object5 = y20_0.a;
                        object11 = new Object();
                        n17 = 0;
                        Object var38_42 = null;
                        object11 = CY2.b((LP1)object13, false, (Function1)object11);
                        int n25 = 130960;
                        int n26 = 0;
                        Object var18_19 = null;
                        long l14 = 0L;
                        bl3 = false;
                        string4 = null;
                        long l15 = 0L;
                        n8 = 0;
                        n7 = 0;
                        boolean bl5 = false;
                        int n27 = 1772928;
                        object4 = object8;
                        object3 = object18;
                        Gx$b gx$b = object10;
                        long l16 = l12;
                        object2 = object16;
                        object16 = object9;
                        object8 = object5;
                        object18 = object2;
                        Ll3.b((String)object12, (LP1)object11, l3, l12, null, (tv0_0)object9, (RU0)object5, l14, null, null, l15, 0, false, 0, 0, null, null, (b30_0)object2, n27, 0, n25);
                        object9 = (CharSequence)((h83_0)object4).getValue();
                        n10 = TextUtils.isEmpty((CharSequence)object9);
                        object6 = de2$F.b;
                        if (n10 == 0) {
                            n16 = 0;
                            object10 = null;
                        } else {
                            object9 = new ArrayList();
                            if (object6 != null) {
                                object12 = ((CartOrder)object6).getConsignmentsData();
                            } else {
                                n19 = 0;
                                f17 = 0.0f;
                                object12 = null;
                            }
                            if (object12 != null) {
                                object12 = ((CartOrder)object6).getConsignmentsData().iterator();
                                object11 = "iterator(...)";
                                Intrinsics.checkNotNullExpressionValue(object12, (String)object11);
                                while ((n15 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
                                    object17 = "DELIVERED";
                                    object11 = (Consignment)object12.next();
                                    object15 = ((Consignment)object11).getShipmentStatus();
                                    n4 = ((String)object17).equalsIgnoreCase((String)object15);
                                    if (n4 == 0 || (object15 = (Collection)((Consignment)object11).getEntries()) == null || (n4 = object15.isEmpty()) != 0) continue;
                                    object11 = ((Consignment)object11).getEntries();
                                    object15 = "getEntries(...)";
                                    Intrinsics.checkNotNullExpressionValue(object11, (String)object15);
                                    object11 = (Collection)object11;
                                    ((ArrayList)object9).addAll(object11);
                                }
                            }
                            n10 = (int)(((ArrayList)object9).isEmpty() ? 1 : 0);
                            n19 = 1;
                            f17 = Float.MIN_VALUE;
                            n16 = n10 ^ 1;
                        }
                        n10 = 7;
                        f16 = 9.8E-45f;
                        int n28 = 12;
                        if (n16 != 0) {
                            f23 = 1.3428428E-34f;
                            object2.K(120749715);
                            n21 = R$string.download_invoice_txt;
                            object12 = nk_0.f((b30_0)object2, n21);
                            l16 = Em3.f(n28);
                            l3 = xx_1.h;
                            object7 = y20_0.a;
                            n15 = 2;
                            f6 = n15;
                            string3 = null;
                            n20 = 13;
                            object8 = object13;
                            object11 = h.i((LP1)object13, 0.0f, f6, 0.0f, 0.0f, n20);
                            ia_2 ia_22 = new ia_2(object3, 3);
                            object5 = object14;
                            n28 = 0;
                            object11 = d.b((LP1)object11, false, null, ia_22, n10);
                            object9 = tv0_0.o;
                            n25 = 130960;
                            n26 = 0;
                            Object var18_21 = null;
                            l14 = 0L;
                            bl3 = false;
                            string4 = null;
                            l15 = 0L;
                            n8 = 0;
                            n7 = 0;
                            bl5 = false;
                            n27 = 1772928;
                            n22 = 12;
                            n3 = 0;
                            f15 = 0.0f;
                            object14 = null;
                            object16 = object9;
                            object8 = object7;
                            object18 = object2;
                            Ll3.b((String)object12, (LP1)object11, l3, l16, null, (tv0_0)object9, (RU0)object7, l14, null, null, l15, 0, false, 0, 0, null, null, (b30_0)object2, n27, 0, n25);
                            object2.E();
                        } else {
                            Integer n29;
                            object5 = object14;
                            n22 = 12;
                            n3 = 0;
                            f15 = 0.0f;
                            object14 = null;
                            object2.K(121363918);
                            n19 = 4;
                            f17 = n19;
                            n15 = 1;
                            f6 = Float.MIN_VALUE;
                            object12 = h.g((LP1)object13, 0.0f, f17, n15);
                            object11 = new ke2_0((qz1_2)object3, (String)object7);
                            object15 = null;
                            object12 = d.b((LP1)object12, false, null, (Function0)object11, n10);
                            object11 = zp.a;
                            f14 = 6.7E-44f;
                            object17 = gx$b;
                            object11 = iQ2.a((zp$e)object11, gx$b, (b30_0)object2, 48);
                            n4 = object2.F();
                            object17 = object2.m();
                            object12 = a30_0.c((b30_0)object2, (LP1)object12);
                            N20.W.getClass();
                            Xp1$a xp1$a2 = N20$a.b;
                            object10 = object2.i();
                            n16 = object10 instanceof mp;
                            if (n16 == 0) {
                                s20.a();
                                throw null;
                            }
                            object2.A();
                            n16 = (int)(object2.e() ? 1 : 0);
                            if (n16 != 0) {
                                object2.C(xp1$a2);
                            } else {
                                object2.n();
                            }
                            N20$a$b n20$a$b = N20$a.e;
                            Ow3.a((b30_0)object2, object11, n20$a$b);
                            object11 = N20$a.d;
                            Ow3.a((b30_0)object2, object17, (Function2)object11);
                            object11 = N20$a.f;
                            n24 = object2.e();
                            if (n24 != 0 || (n24 = Intrinsics.areEqual(object17 = object2.v(), n29 = Integer.valueOf(n4))) == 0) {
                                re0_0.a(n4, (b30_0)object2, n4, (N20$a$a)object11);
                            }
                            object11 = N20$a.c;
                            Ow3.a((b30_0)object2, object12, (Function2)object11);
                            n19 = R$string.download_invoice_txt;
                            object12 = nk_0.f((b30_0)object2, n19);
                            l16 = Em3.f(n22);
                            object11 = cp_1.Companion;
                            n15 = (int)(km_1.b((cp$a)object11) ? 1 : 0);
                            l7 = n15 != 0 ? xx_1.h : xx_1.i;
                            l3 = l7;
                            object11 = new pe1_1(1, object3, object7);
                            n21 = 0;
                            f23 = 0.0f;
                            object7 = null;
                            object11 = d.b((LP1)object13, false, null, (Function0)object11, n10);
                            object16 = tv0_0.o;
                            n25 = 131024;
                            n26 = 0;
                            Object var18_22 = null;
                            bl4 = false;
                            object8 = null;
                            l14 = 0L;
                            bl3 = false;
                            string4 = null;
                            l15 = 0L;
                            n8 = 0;
                            n7 = 0;
                            bl5 = false;
                            n27 = 199680;
                            object18 = object2;
                            Ll3.b((String)object12, (LP1)object11, l7, l16, null, (tv0_0)object16, null, l14, null, null, l15, 0, false, 0, 0, null, null, (b30_0)object2, n27, 0, n25);
                            object2.p();
                            object2.E();
                        }
                        object2.p();
                        n10 = -1688438271;
                        f16 = -1.8237395E-22f;
                        object2.K(n10);
                        if (object6 == null) break block104;
                        object9 = a21.a;
                        object7 = (Map)((qz1_2)object3).A.getValue();
                        object12 = de2$F.c;
                        if (object12 != null) {
                            object12 = ((Product)object12).getCode();
                        } else {
                            n19 = 0;
                            f17 = 0.0f;
                            object12 = null;
                        }
                        object7 = (ArrayList)object7.get(object12);
                        object9.getClass();
                        n10 = (int)(a21.c((ArrayList)object7) ? 1 : 0);
                        if (n10 != 0) {
                            f16 = -0.16768351f;
                            object2.K(-1104431814);
                            n10 = R$string.incl_freebies;
                            object9 = nk_0.f((b30_0)object2, n10);
                            object2.E();
                        } else {
                            f16 = -0.16772307f;
                            object2.K(-1104429159);
                            n10 = R$string.order_amount;
                            object9 = nk_0.f((b30_0)object2, n10);
                            object2.E();
                        }
                        object12 = object9;
                        object9 = object5;
                        Intrinsics.checkNotNullParameter(object6, (String)object5);
                        f23 = ((CartOrder)object6).getTotalBag();
                        n15 = 0;
                        f6 = 0.0f;
                        object11 = null;
                        float f25 = f23 - 0.0f;
                        n21 = (int)(f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1));
                        if (n21 > 0) {
                            f23 = ((CartOrder)object6).getTotalBag();
                            object7 = qz2_0.u(f23);
                        } else {
                            object7 = qz2_0.z();
                        }
                        object11 = object7;
                        l3 = xx_1.e;
                        n7 = 4088;
                        n17 = 0;
                        Object var38_48 = null;
                        n16 = 0;
                        object10 = null;
                        l2 = 0L;
                        bl4 = false;
                        object8 = null;
                        string3 = null;
                        bl2 = null;
                        bl3 = false;
                        string4 = null;
                        n20 = 0;
                        string2 = null;
                        n8 = 384;
                        de2_0.t((String)object12, (String)object7, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        object2.K(-1688431315);
                        f23 = ((CartOrder)object6).getTotalBagSaving();
                        n19 = 0;
                        f17 = 0.0f;
                        object12 = null;
                        float f26 = f23 - 0.0f;
                        n21 = (int)(f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1));
                        if (n21 > 0) {
                            f23 = ((CartOrder)object6).getTotalBagSaving();
                            object11 = qz2_0.q(f23);
                            n21 = R$string.order_savings;
                            object12 = nk_0.f((b30_0)object2, n21);
                            l3 = xx_1.t;
                            n7 = 4088;
                            n17 = 0;
                            Object var38_49 = null;
                            n16 = 0;
                            object10 = null;
                            l2 = 0L;
                            bl4 = false;
                            object8 = null;
                            string3 = null;
                            bl2 = null;
                            bl3 = false;
                            string4 = null;
                            n20 = 0;
                            string2 = null;
                            n8 = 384;
                            de2_0.t((String)object12, (String)object11, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        }
                        object2.E();
                        n21 = -1688419721;
                        f23 = -1.8260808E-22f;
                        object2.K(n21);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object7 = ((CartOrder)object6).getVoucherAmount();
                        if (object7 != null) {
                            object7 = ((CartOrder)object6).getVoucherAmount().getValue();
                            f23 = mz3_0.J((String)object7);
                            n19 = 0;
                            f17 = 0.0f;
                            object12 = null;
                            float f27 = f23 - 0.0f;
                            n21 = (int)(f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1));
                            if (n21 != 0) {
                                n21 = R$string.coupon_savings;
                                object12 = nk_0.f((b30_0)object2, n21);
                                Intrinsics.checkNotNullParameter(object6, (String)object9);
                                object7 = ((CartOrder)object6).getVoucherAmount();
                                if (object7 != null) {
                                    object7 = ((CartOrder)object6).getVoucherAmount().getValue();
                                    f23 = mz3_0.J((String)object7);
                                    n15 = 0;
                                    f6 = 0.0f;
                                    object11 = null;
                                    f23 += 0.0f;
                                } else {
                                    n21 = 0;
                                    f23 = 0.0f;
                                    object7 = null;
                                }
                                object11 = qz2_0.q(f23);
                                l3 = xx_1.t;
                                n7 = 4088;
                                n17 = 0;
                                Object var38_51 = null;
                                n16 = 0;
                                object10 = null;
                                l2 = 0L;
                                bl4 = false;
                                object8 = null;
                                string3 = null;
                                bl2 = null;
                                bl3 = false;
                                string4 = null;
                                n20 = 0;
                                string2 = null;
                                n8 = 384;
                                de2_0.t((String)object12, (String)object11, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                            }
                        }
                        object2.E();
                        n21 = -1688409800;
                        f23 = -1.827333E-22f;
                        object2.K(n21);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object7 = ((CartOrder)object6).getEntries();
                        if (object7 != null) {
                            object7 = ((CartOrder)object6).getEntries();
                            n21 = object7.size();
                            n19 = 0;
                            f17 = 0.0f;
                            object12 = null;
                            object10 = null;
                            for (n16 = 0; n16 < n21; n16 += n15) {
                                object11 = ((CartOrder)object6).getEntries().get(n16);
                                if (object11 != null) {
                                    object11 = ((CartEntry)((CartOrder)object6).getEntries().get(n16)).getMultiItemPromoAmt();
                                    f17 = f6 = mz3_0.J((String)object11) + f17;
                                }
                                n15 = 1;
                                f6 = Float.MIN_VALUE;
                            }
                            f12 = f17;
                            n21 = 0;
                            f23 = 0.0f;
                            object7 = null;
                        } else {
                            n21 = 0;
                            f23 = 0.0f;
                            object7 = null;
                            f12 = 0.0f;
                        }
                        n19 = (int)((f22 = f12 - 0.0f) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
                        if (n19 > 0) {
                            n21 = R$string.promo_savings;
                            object12 = nk_0.f((b30_0)object2, n21);
                            object11 = qz1_2.x((CartOrder)object6);
                            l3 = xx_1.t;
                            n7 = 4088;
                            n17 = 0;
                            Object var38_53 = null;
                            n16 = 0;
                            object10 = null;
                            l2 = 0L;
                            bl4 = false;
                            object8 = null;
                            string3 = null;
                            bl2 = null;
                            bl3 = false;
                            string4 = null;
                            n20 = 0;
                            string2 = null;
                            n8 = 384;
                            de2_0.t((String)object12, (String)object11, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        }
                        object2.E();
                        object7 = ((CartOrder)object6).getConvenienceFee();
                        object5 = "";
                        if (object7 != null && (object7 = ((ConvenienceFeePriceSplitUp)object7).getTotal()) != null) {
                            f23 = ((ConvenienceFeePriceSplitUp$AmountData)object7).getNetAmount();
                            object12 = object7 = qz2_0.u(f23);
                        } else {
                            object12 = object5;
                        }
                        object7 = cp_1.Companion;
                        object7.getClass();
                        n21 = (int)(cp$a.w() ? 1 : 0);
                        if (n21 != 0 && object12 != null && (n21 = ((String)object12).length()) != 0) {
                            n21 = 123798255;
                            f23 = 1.6927981E-34f;
                            object2.K(n21);
                            object11 = ((CartOrder)object6).getConvenienceFee();
                            object7 = "getConvenienceFee(...)";
                            Intrinsics.checkNotNullExpressionValue(object11, (String)object7);
                            n17 = 1;
                            n26 = 224832;
                            n24 = 1;
                            f20 = Float.MIN_VALUE;
                            object15 = object3;
                            object10 = object2;
                            de2_0.u((String)object12, (ConvenienceFeePriceSplitUp)object11, (qz1_2)object3, n24, n17, (b30_0)object2, n26);
                            object2.E();
                        } else {
                            f23 = 1.7101001E-34f;
                            object2.K(123948977);
                            object7 = qz1_2.k((CartOrder)object6);
                            n19 = R$string.free;
                            object12 = hv3_0.K(n19);
                            n15 = 1;
                            f6 = Float.MIN_VALUE;
                            n21 = (int)(kotlin.text.b.i((String)object7, (String)object12, n15 != 0) ? 1 : 0);
                            l8 = n21 != 0 ? xx_1.t : xx_1.e;
                            l3 = l8;
                            n21 = R$string.delivery_charges;
                            object7 = nk_0.f((b30_0)object2, n21);
                            object12 = z40_0.Companion;
                            object12 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object12).a;
                            object11 = "ConvenienceFeeConfig";
                            object12 = ((ao0_0)object12).b((String)object11);
                            n15 = ((String)object12).length();
                            if (n15 == 0) {
                                n19 = 0;
                                f17 = 0.0f;
                                object12 = null;
                            } else {
                                object11 = ConvenienceFeeConfig.class;
                                object12 = (ConvenienceFeeConfig)JsonUtils.fromJson((String)object12, object11);
                            }
                            if (object12 != null) {
                                object12 = ((ConvenienceFeeConfig)object12).getMasterFlag();
                                object11 = Boolean.TRUE;
                                n16 = (int)(Intrinsics.areEqual(object12, object11) ? 1 : 0);
                                n19 = 1;
                                f17 = Float.MIN_VALUE;
                            } else {
                                n19 = 1;
                                f17 = Float.MIN_VALUE;
                                n16 = 0;
                                object10 = null;
                            }
                            if (n16 == n19) {
                                object7 = "Convenience Fee";
                            }
                            object12 = object7;
                            object11 = qz1_2.k((CartOrder)object6);
                            n7 = 4088;
                            n17 = 0;
                            Object var38_55 = null;
                            n16 = 0;
                            object10 = null;
                            l2 = 0L;
                            bl4 = false;
                            object8 = null;
                            string3 = null;
                            bl2 = null;
                            bl3 = false;
                            string4 = null;
                            n20 = 0;
                            string2 = null;
                            n8 = 0;
                            de2_0.t((String)object7, (String)object11, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, 0, 0, n7);
                            object2.E();
                        }
                        n21 = (int)(qz1_2.E((CartOrder)object6) ? 1 : 0);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object12 = ((CartOrder)object6).getBankOfferAmt();
                        if (object12 != null) {
                            f12 = mz3_0.J(((CartOrder)object6).getBankOfferAmt().getValue());
                            n19 = 0;
                            f17 = 0.0f;
                            object12 = null;
                        } else {
                            n19 = 0;
                            f17 = 0.0f;
                            object12 = null;
                            f12 = 0.0f;
                        }
                        n15 = (int)((f19 = f12 - 0.0f) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
                        bl5 = n15 > 0;
                        n19 = -1688363818;
                        f17 = -1.8331368E-22f;
                        object2.K(n19);
                        if (n21 == 0 && bl5) {
                            n19 = R$string.amount_payable_txt;
                            object12 = nk_0.f((b30_0)object2, n19);
                            Intrinsics.checkNotNullParameter(object6, (String)object9);
                            object11 = ((CartOrder)object6).getTotalPriceWithTax();
                            if (object11 != null && (object11 = ((Price)object11).getValue()) != null) {
                                f6 = Float.parseFloat((String)object11);
                            } else {
                                n15 = 0;
                                f6 = 0.0f;
                                object11 = null;
                            }
                            object11 = qz2_0.u(f6);
                            l2 = xx_1.e;
                            n7 = 4032;
                            n17 = 0;
                            Object var38_57 = null;
                            n16 = 0;
                            object10 = null;
                            bl4 = false;
                            object8 = null;
                            string3 = null;
                            bl2 = null;
                            bl3 = false;
                            string4 = null;
                            n20 = 0;
                            string2 = null;
                            n8 = 224640;
                            l3 = l2;
                            de2_0.t((String)object12, (String)object11, l2, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                            if (bl5) {
                                n19 = R$string.bank_discount;
                                object12 = nk_0.f((b30_0)object2, n19);
                                Intrinsics.checkNotNullParameter(object6, (String)object9);
                                object11 = ((CartOrder)object6).getBankOfferAmt();
                                if (object11 != null) {
                                    object11 = ((CartOrder)object6).getBankOfferAmt().getValue();
                                    f6 = mz3_0.J((String)object11);
                                } else {
                                    n15 = 0;
                                    f6 = 0.0f;
                                    object11 = null;
                                }
                                object11 = qz2_0.q(f6);
                                l3 = xx_1.t;
                                n7 = 4088;
                                n17 = 0;
                                Object var38_58 = null;
                                n16 = 0;
                                object10 = null;
                                l2 = 0L;
                                bl4 = false;
                                object8 = null;
                                string3 = null;
                                bl2 = null;
                                bl3 = false;
                                string4 = null;
                                n20 = 0;
                                string2 = null;
                                n8 = 384;
                                de2_0.t((String)object12, (String)object11, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                            }
                        }
                        object2.E();
                        n19 = R$string.order_total;
                        object12 = nk_0.f((b30_0)object2, n19);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object11 = ((CartOrder)object6).getBankOfferAmt();
                        if (object11 != null && (object11 = ((Price)object11).getValue()) != null) {
                            f12 = mz3_0.J((String)object11);
                            n15 = 0;
                            f6 = 0.0f;
                            object11 = null;
                        } else {
                            n15 = 0;
                            f6 = 0.0f;
                            object11 = null;
                            f12 = 0.0f;
                        }
                        n4 = (int)((f18 = f12 - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                        if (n4 > 0) {
                            f14 = f12 + 0.0f;
                        } else {
                            n4 = 0;
                            f14 = 0.0f;
                            object15 = null;
                        }
                        object11 = ((CartOrder)object6).getTotalPriceWithTax();
                        if (object11 != null && (object11 = ((Price)object11).getValue()) != null) {
                            f6 = mz3_0.J((String)object11);
                        } else {
                            n15 = 0;
                            f6 = 0.0f;
                            object11 = null;
                        }
                        f6 -= f14;
                        object15 = ((CartOrder)object6).getTotalPriceWithTax();
                        if (object15 != null) {
                            object15 = ((Price)object15).getValue();
                        } else {
                            n4 = 0;
                            f14 = 0.0f;
                            object15 = null;
                        }
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object15) ? 1 : 0);
                        if (n4 == 0) {
                            n4 = (int)(qz1_2.E((CartOrder)object6) ? 1 : 0);
                            if (n4 != 0) {
                                object11 = qz2_0.u(f6);
                            } else {
                                d2 = f6;
                                l16 = 0L;
                                double d5 = 0.0;
                                double d7 = d2 - d5;
                                n26 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
                                object11 = n26 > 0 ? qz2_0.u(f6) : qz2_0.z();
                            }
                        } else {
                            object11 = qz2_0.z();
                        }
                        l2 = xx_1.e;
                        bl2 = Boolean.TRUE;
                        n16 = 1;
                        bl4 = false;
                        string2 = null;
                        l3 = l2;
                        de2_0.t((String)object12, (String)object11, l2, true, n16 != 0, l2, null, null, bl2, false, null, null, (b30_0)object2, 100887936, 0, 3776);
                        l4 = xx_1.g;
                        l8 = 4602678819172646912L;
                        double d9 = 0.5;
                        f20 = (float)d9;
                        f17 = 12;
                        f6 = 16;
                        object8 = object13;
                        object12 = h.i((LP1)object13, 0.0f, f17, 0.0f, f6, 5);
                        n17 = 0;
                        Object var38_60 = null;
                        n28 = 8;
                        l7 = l4;
                        object10 = object2;
                        Rr0.a((LP1)object12, l4, f20, 0.0f, (b30_0)object2, 438, n28);
                        n19 = R$string.payment_mode;
                        object12 = nk_0.f((b30_0)object2, n19);
                        object18 = y20_0.a;
                        l16 = Em3.f(14);
                        object16 = tv0_0.o;
                        n15 = 10;
                        f6 = n15;
                        string3 = null;
                        n20 = 7;
                        bl2 = null;
                        object13 = h.i((LP1)object13, 0.0f, 0.0f, 0.0f, f6, n20);
                        n4 = 3;
                        f14 = 4.2E-45f;
                        object11 = new pa_0(object3, n4);
                        Intrinsics.checkNotNullParameter(object13, "<this>");
                        Intrinsics.checkNotNullParameter(object11, "onVisibilityChanged");
                        object15 = new zh0_2((pa_0)object11);
                        object11 = ji1.a;
                        object11 = a30_0.a((LP1)object13, (Function1)object11, (gx0_2)object15);
                        n25 = 130960;
                        n26 = 0;
                        Object var18_24 = null;
                        l14 = 0L;
                        bl3 = false;
                        string4 = null;
                        l15 = 0L;
                        n8 = 0;
                        n7 = 0;
                        bl5 = false;
                        n27 = 1772928;
                        l3 = l4;
                        object8 = object18;
                        object18 = object2;
                        Ll3.b((String)object12, (LP1)object11, l4, l16, null, (tv0_0)object16, (RU0)object8, l14, null, null, l15, 0, false, 0, 0, null, null, (b30_0)object2, n27, 0, n25);
                        object13 = h40_0.a;
                        object13 = h40_0.c0();
                        object12 = "isEnabled";
                        n18 = (int)(object13.optBoolean((String)object12) ? 1 : 0);
                        if (n18 == 0 || (n18 = (int)((object13 = h40_0.c0()).optBoolean((String)(object12 = "paymentMode")) ? 1 : 0)) == 0) break block105;
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object13 = ((CartOrder)object6).optedPaymentModeOrderList;
                        if (object13 != null && (n18 = (int)(object13.isEmpty() ? 1 : 0)) == 0) {
                            n18 = 1;
                            f5 = Float.MIN_VALUE;
                            n16 = 0;
                            object10 = null;
                        } else {
                            n18 = 1;
                            f5 = Float.MIN_VALUE;
                            n16 = 1;
                        }
                        n19 = n16 ^ 1;
                        if (n19 == 0) break block105;
                        n21 = 126573406;
                        f23 = 2.0968096E-34f;
                        object2.K(n21);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object9 = ((CartOrder)object6).optedPaymentModeOrderList;
                        Intrinsics.checkNotNullExpressionValue(object9, "optedPaymentModeOrderList");
                        object7 = new ArrayList();
                        object13 = object9.iterator();
                        break block106;
                    }
                    n3 = 128100621;
                    f15 = 2.447441E-34f;
                    object2.K(n3);
                    object14 = ((qz1_2)object3).U;
                    ((ArrayList)object14).clear();
                    n18 = -1104245315;
                    f5 = -0.17046256f;
                    object2.K(n18);
                    Intrinsics.checkNotNullParameter(object6, (String)object9);
                    object13 = ((CartOrder)object6).getCreditsUsedAmount();
                    object15 = "mode";
                    if (object13 != null) {
                        n18 = R$string.ajio_wallet;
                        object12 = nk_0.f((b30_0)object2, n18);
                        Intrinsics.checkNotNullParameter(object6, (String)object9);
                        object13 = ((CartOrder)object6).getCreditsUsedAmount();
                        if (object13 != null) {
                            object13 = ((CartOrder)object6).getCreditsUsedAmount().getValue();
                            f5 = mz3_0.J((String)object13);
                        } else {
                            n18 = 0;
                            f5 = 0.0f;
                            object13 = null;
                        }
                        object11 = qz2_0.u(f5);
                        object8 = R$drawable.ic_ajio_cash;
                        n18 = R$string.acc_icon_ajio_cash_icon;
                        string3 = nk_0.f((b30_0)object2, n18);
                        n7 = 3896;
                        n17 = 0;
                        Object var38_63 = null;
                        n16 = 0;
                        object10 = null;
                        l2 = 0L;
                        bl2 = null;
                        bl3 = false;
                        string4 = null;
                        n20 = 0;
                        string2 = null;
                        n8 = 384;
                        object13 = object15;
                        l3 = l4;
                        de2_0.t((String)object12, (String)object11, l4, false, false, l2, (Integer)object8, string3, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        n19 = R$string.ajio_wallet;
                        object12 = hv3_0.K(n19);
                        Intrinsics.checkNotNullParameter(object12, (String)object15);
                        ((ArrayList)object14).add(object12);
                    } else {
                        object13 = object15;
                    }
                    object2.E();
                    f17 = -0.170721f;
                    object2.K(-1104227972);
                    object12 = (Boolean)qz1_2.w((CartOrder)object6).a;
                    n19 = (int)(((Boolean)object12).booleanValue() ? 1 : 0);
                    if (n19 != 0) {
                        object12 = (String)qz1_2.w((CartOrder)object6).b;
                        object11 = (String)qz1_2.w((CartOrder)object6).c;
                        n7 = 4088;
                        n17 = 0;
                        Object var38_64 = null;
                        n16 = 0;
                        object10 = null;
                        l2 = 0L;
                        bl4 = false;
                        object8 = null;
                        string3 = null;
                        bl2 = null;
                        bl3 = false;
                        string4 = null;
                        n20 = 0;
                        string2 = null;
                        n8 = 384;
                        l3 = l4;
                        de2_0.t((String)object12, (String)object11, l4, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        n19 = R$string.r1_points;
                        object12 = hv3_0.K(n19);
                        Intrinsics.checkNotNullParameter(object12, (String)object13);
                        ((ArrayList)object14).add(object12);
                    }
                    object2.E();
                    object12 = ((qz1_2)object3).j((CartOrder)object6);
                    Intrinsics.checkNotNullParameter(object6, (String)object9);
                    object3 = ((CartOrder)object6).getCreditsUsedAmount();
                    if (object3 != null) {
                        f12 = mz3_0.J(((CartOrder)object6).getCreditsUsedAmount().getValue());
                        n14 = 0;
                        f7 = 0.0f;
                        object3 = null;
                    } else {
                        n14 = 0;
                        f7 = 0.0f;
                        object3 = null;
                        f12 = 0.0f;
                    }
                    n10 = (int)((f11 = f12 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n10 > 0) {
                        f16 = f12 + 0.0f;
                    } else {
                        n10 = 0;
                        f16 = 0.0f;
                        object9 = null;
                    }
                    object3 = ((CartOrder)object6).getTaaraBurnedAmount();
                    if (object3 == null) {
                        object3 = ax0_1.a;
                        object14 = ((CartOrder)object6).getRelianceOneAmount();
                        object3.getClass();
                        f7 = ax0_1.a((Price)object14);
                    } else {
                        n14 = 0;
                        f7 = 0.0f;
                        object3 = null;
                    }
                    object14 = ax0_1.a;
                    object13 = ((CartOrder)object6).getTaaraBurnedAmount();
                    object14.getClass();
                    f15 = ax0_1.a((Price)object13);
                    f7 = ax0_1.b(f7, f15) + f16;
                    ((CartOrder)object6).getRedeemedMahaCachBack();
                    double d12 = ((CartOrder)object6).getRedeemedMahaCachBack();
                    object9 = String.valueOf(d12);
                    f16 = mz3_0.J((String)object9);
                    n3 = 0;
                    f15 = 0.0f;
                    object14 = null;
                    float f28 = f16 - 0.0f;
                    n18 = (int)(f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1));
                    if (n18 > 0) {
                        f7 += f16;
                    }
                    if ((object9 = ((CartOrder)object6).getBankOfferAmt()) != null) {
                        f14 = mz3_0.J(((CartOrder)object6).getBankOfferAmt().getValue());
                        n10 = 0;
                        f16 = 0.0f;
                        object9 = null;
                    } else {
                        n10 = 0;
                        f16 = 0.0f;
                        object9 = null;
                        n4 = 0;
                        f14 = 0.0f;
                        object15 = null;
                    }
                    n10 = (int)((f8 = f14 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                    if (n10 > 0) {
                        f7 += f14;
                    }
                    object9 = ((CartOrder)object6).getTotalPriceWithTax().getValue();
                    f16 = mz3_0.J((String)object9) - f7;
                    object3 = ((CartOrder)object6).getTotalPriceWithTax();
                    if (object3 != null && (n14 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartOrder)object6).getTotalPriceWithTax().getValue())) ? 1 : 0)) == 0) {
                        n14 = (int)(qz1_2.E((CartOrder)object6) ? 1 : 0);
                        if (n14 != 0) {
                            object3 = qz2_0.u(f16);
                        } else {
                            double d13 = f16;
                            l7 = 0L;
                            double d14 = 0.0;
                            double d15 = d13 - d14;
                            n14 = (int)(d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1));
                            object3 = n14 > 0 ? qz2_0.u(f16) : qz2_0.z();
                        }
                    } else {
                        object3 = qz2_0.z();
                    }
                    object11 = object3;
                    if (n21 == 0) {
                        n14 = 129293935;
                        f7 = 2.7214125E-34f;
                        object2.K(n14);
                        if (object12 != null && (n14 = ((String)object12).length()) != 0) {
                            n7 = 4068;
                            l3 = 0L;
                            d2 = 0.0;
                            n17 = 0;
                            Object var38_65 = null;
                            n16 = 0;
                            object10 = null;
                            l2 = 0L;
                            bl4 = false;
                            object8 = null;
                            string3 = null;
                            bl2 = null;
                            bl3 = false;
                            string4 = null;
                            n20 = 0;
                            string2 = null;
                            n8 = 27648;
                            de2_0.t((String)object12, (String)object3, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        }
                        object2.E();
                    } else {
                        f7 = 2.8027555E-34f;
                        object2.K(129648234);
                        n14 = R$string.cod;
                        object12 = nk_0.f((b30_0)object2, n14);
                        n7 = 4068;
                        l3 = 0L;
                        d2 = 0.0;
                        n17 = 0;
                        Object var38_66 = null;
                        n16 = 0;
                        object10 = null;
                        l2 = 0L;
                        bl4 = false;
                        object8 = null;
                        string3 = null;
                        bl2 = null;
                        bl3 = false;
                        string4 = null;
                        n20 = 0;
                        string2 = null;
                        n8 = 27648;
                        de2_0.t((String)object12, (String)object3, l3, false, false, l2, null, null, null, false, null, null, (b30_0)object2, n8, 0, n7);
                        object2.E();
                    }
                    object2.E();
                    break block107;
                }
                while ((n19 = (int)(object13.hasNext() ? 1 : 0)) != 0) {
                    object11 = object12 = object13.next();
                    object11 = ((OptedPaymentModeOrder)object12).getSavedMop();
                    if (object11 != null && (n15 = ((String)object11).length()) != 0) {
                        n15 = 1;
                        f6 = Float.MIN_VALUE;
                        n16 = 0;
                        object10 = null;
                    } else {
                        n15 = 1;
                        f6 = Float.MIN_VALUE;
                        n16 = 1;
                    }
                    if ((n4 = n16 ^ 1) == 0) continue;
                    ((ArrayList)object7).add(object12);
                }
                object9 = object9.iterator();
                while ((n3 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                    object14 = (OptedPaymentModeOrder)object9.next();
                    object13 = ((OptedPaymentModeOrder)object14).getModeOfPaymentName();
                    object12 = object13 == null ? object5 : object13;
                    l3 = xx_1.e;
                    object13 = ((OptedPaymentModeOrder)object14).getAmount();
                    if (object13 != null) {
                        object13 = je3_2.d((String)object13);
                    } else {
                        n18 = 0;
                        f5 = 0.0f;
                        object13 = null;
                    }
                    object11 = qz2_0.w((Double)object13);
                    string4 = ((OptedPaymentModeOrder)object14).getLogo();
                    n18 = R$string.acc_icon_ajio_cash_icon;
                    string3 = nk_0.f((b30_0)object2, n18);
                    string2 = ((OptedPaymentModeOrder)object14).getMaskedDigits();
                    n7 = 376;
                    n17 = 0;
                    Object var38_62 = null;
                    n16 = 0;
                    object10 = null;
                    l2 = 0L;
                    bl4 = false;
                    object8 = null;
                    bl2 = null;
                    bl3 = true;
                    n8 = 805306752;
                    de2_0.t((String)object12, (String)object11, l3, false, false, l2, null, string3, null, bl3, string4, string2, (b30_0)object2, n8, 0, n7);
                }
                object9 = (Boolean)((qz1_2)object3).C0.getValue();
                n10 = (int)(((Boolean)object9).booleanValue() ? 1 : 0);
                if (n10 != 0 && (n3 = (int)(((Boolean)(object14 = (Boolean)((h83_0)(object9 = ((qz1_2)object3).D0)).getValue())).booleanValue() ? 1 : 0)) == 0) {
                    n3 = (int)(((ArrayList)object7).isEmpty() ? 1 : 0);
                    object14 = n3 != 0 ? "payment not saved" : "payment saved";
                    object3 = (SelectedOrderItem)CollectionsKt.firstOrNull((List)((qz1_2)object3).m.getValue());
                    if (object3 != null) {
                        object3 = ((SelectedOrderItem)object3).getOrderStatus();
                    } else {
                        n14 = 0;
                        f7 = 0.0f;
                        object3 = null;
                    }
                    object7 = ((CartOrder)object6).getCode();
                    if (object7 == null) {
                        object7 = object5;
                    }
                    object6 = (String)((h83_0)object4).getValue();
                    object13 = "payment mode section viewed";
                    IN2.b((String)object13, (String)object7, (String)object14, (String)object6, (String)object3);
                    object3 = Boolean.TRUE;
                    ((h83_0)object9).setValue(object3);
                }
                object2.E();
            }
            object3 = Unit.a;
        }
        object2.E();
        object2.p();
        return Unit.a;
    }
}

