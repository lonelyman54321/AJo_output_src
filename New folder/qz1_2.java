/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.OrderDetailFunctionalRepo;
import com.ril.ajio.data.repo.OrderDetailRepo;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.Question;
import com.ril.ajio.services.data.Order.QuestionResponse;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Order.SubStatus;
import com.ril.ajio.services.data.Order.UserSubRating;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from QZ1
 */
public final class qz1_2
extends Hj {
    public final ParcelableSnapshotMutableState A;
    public int A0;
    public final i23_0 B;
    public boolean B0;
    public final ee2_2 C;
    public final ParcelableSnapshotMutableState C0;
    public final i23_0 D;
    public final ParcelableSnapshotMutableState D0;
    public final ee2_2 E;
    public SelectedOrderItem F;
    public final i23_0 G;
    public final ee2_2 H;
    public final i23_0 I;
    public final ee2_2 J;
    public final zr1_1 K;
    public final zr1_1 L;
    public final NewCustomEventsRevamp M;
    public final NewEEcommerceEventsRevamp N;
    public final m80_0 O;
    public final ParcelableSnapshotMutableState P;
    public final ParcelableSnapshotMutableState Q;
    public final ParcelableSnapshotMutableState R;
    public boolean S;
    public final ParcelableSnapshotMutableState T;
    public final ArrayList U;
    public final zr1_1 X;
    public final zr1_1 Y;
    public final zr1_1 Z;
    public final Application a;
    public final OrderDetailRepo b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final zr1_1 k0;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public final hh3_2 p0;
    public final ParcelableSnapshotMutableState q;
    public final hh3_2 q0;
    public final ParcelableSnapshotMutableState r;
    public final hh3_2 r0;
    public final ParcelableSnapshotMutableState s;
    public final zr1_1 s0;
    public final ParcelableSnapshotMutableState t;
    public final zr1_1 t0;
    public final ParcelableSnapshotMutableState u;
    public final zr1_1 u0;
    public final ParcelableSnapshotMutableState v;
    public final ParcelableSnapshotMutableState v0;
    public final ParcelableSnapshotMutableState w;
    public String w0;
    public final ParcelableSnapshotMutableState x;
    public String x0;
    public final ParcelableSnapshotMutableState y;
    public String y0;
    public final ParcelableSnapshotMutableState z;
    public String z0;

    public qz1_2(Application object) {
        h23_0 h23_02;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.a = object2 = this.getApplication();
        super();
        this.b = object2;
        object2 = Boolean.FALSE;
        Object object3 = J83.g(object2);
        this.c = object3;
        Object object4 = J83.g(null);
        this.d = object4;
        object4 = J83.g(null);
        this.i = object4;
        J83.g(object2);
        object4 = new LinkedHashMap();
        this.j = object4 = J83.g(object4);
        this.k = object4 = J83.g(object2);
        this.l = object4 = J83.g(null);
        object4 = new ArrayList();
        this.m = object4 = J83.g(object4);
        J83.g(object2);
        this.n = object4 = J83.g(object2);
        this.o = object4 = J83.g(object2);
        object4 = new LinkedHashMap();
        this.p = object4 = J83.g(object4);
        this.q = object4 = J83.g(object2);
        this.r = object4 = J83.g(object2);
        this.s = object4 = J83.g(object2);
        this.t = object4 = J83.g(object2);
        this.u = object4 = J83.g(object2);
        this.v = object4 = J83.g(object2);
        object4 = new LinkedHashMap();
        this.w = object4 = J83.g(object4);
        object4 = "";
        Object object5 = J83.g(object4);
        this.x = object5;
        object5 = J83.g(object4);
        this.y = object5;
        super();
        object5 = J83.g(object5);
        this.z = object5;
        object5 = new HashMap();
        this.A = object5 = J83.g(object5);
        int n3 = 7;
        this.B = h23_02 = k23_0.b(0, 0, null, n3);
        h23_02 = ms0_1.a(h23_02);
        this.C = h23_02;
        this.D = h23_02 = k23_0.b(0, 0, null, n3);
        h23_02 = ms0_1.a(h23_02);
        this.E = h23_02;
        this.G = h23_02 = k23_0.b(0, 0, null, n3);
        h23_02 = ms0_1.a(h23_02);
        this.H = h23_02;
        this.I = object3 = k23_0.b(0, 0, null, n3);
        this.J = object3 = ms0_1.a((i23_0)object3);
        this.K = object3 = new zr1_1();
        this.L = object3;
        object3 = AnalyticsManager.Companion;
        this.M = object5 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.N = object3 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        this.O = object3 = new Object();
        this.P = object5 = J83.g(object2);
        this.Q = object5 = J83.g(Float.valueOf(0.0f));
        this.R = object5 = J83.g(object2);
        this.T = object5 = J83.g(object2);
        object5 = new ArrayList();
        this.U = object5;
        this.X = object5 = new zr1_1();
        this.Y = object5 = new zr1_1();
        this.Z = object5 = new zr1_1();
        this.k0 = object5;
        n3 = 2;
        object5 = new rm0_1(this, n3);
        this.p0 = object5 = yr1_2.b((Function0)object5);
        object5 = new i7_0(this, n3);
        this.q0 = object5 = yr1_2.b((Function0)object5);
        object5 = new J7((ContextWrapper)object, 1);
        object = yr1_2.b((Function0)object5);
        this.r0 = object;
        super();
        this.s0 = object;
        super();
        this.t0 = object;
        this.u0 = object;
        object = J83.g(object2);
        this.v0 = object;
        this.w0 = "Chat unavailable, use <b>Help</b> for support";
        this.x0 = "return";
        this.y0 = object4;
        this.z0 = object4;
        object = J83.g(object2);
        this.C0 = object;
        object = J83.g(object2);
        this.D0 = object;
        ((m80_0)object3).c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean B(Consignment object) {
        String string2 = ((Consignment)object).getStatus();
        String string3 = "getStatus(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Locale locale = Locale.ENGLISH;
        String string4 = "ENGLISH";
        String string5 = "toLowerCase(...)";
        string2 = zn0_1.a(locale, string4, string2, locale, string5);
        String string6 = "shipped";
        boolean bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "out_for_delivery";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "delivery_attempted";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "shipment_confiscated";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "shipment_damaged";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "shipment_on_hold";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "shipment_problem";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        string2 = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string5);
        string6 = "shipment_delayed";
        bl2 = Intrinsics.areEqual(string2, string6);
        if (bl2) return true;
        object = ((Consignment)object).getStatus();
        Intrinsics.checkNotNullExpressionValue(object, string3);
        Intrinsics.checkNotNullExpressionValue(locale, string4);
        object = ((String)object).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(object, string5);
        string2 = "delivery_reshceduled";
        boolean bl3 = Intrinsics.areEqual(object, string2);
        if (!bl3) return false;
        return true;
    }

    public static boolean C(SelectedOrderItem object) {
        hv3_0.a.getClass();
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        boolean n3 = ((ao0_0)object2).a("enable_carrier_info");
        boolean bl2 = false;
        if (n3) {
            int n4;
            if (object != null && (object2 = ((SelectedOrderItem)object).getConsignment()) != null) {
                object2 = ((Consignment)object2).getCarrierUrl();
            } else {
                boolean bl3 = false;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                long l2;
                long l3;
                long l4;
                Object object3;
                object2 = "yyyy-MM-dd'T'hh:mm:ss+0530";
                if (object == null || (object3 = ((SelectedOrderItem)object).getConsignment()) == null || (object3 = ((Consignment)object3).getDeliveryDate()) == null) {
                    object3 = k7.i((String)object2);
                }
                long l7 = k7.w((String)object3, (String)object2);
                long l8 = System.currentTimeMillis() - l7;
                long l12 = l8 - (l7 = 0L);
                Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object4 < 0) {
                    l8 = -1;
                } else {
                    object2 = TimeUnit.MILLISECONDS;
                    l8 = ((TimeUnit)((Object)object2)).toDays(l8);
                }
                object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
                String string2 = "carrier_info_x_days";
                int n7 = ((ao0_0)object2).g(string2);
                long l14 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                if (l14 == false || (l14 = (l4 = (l7 = 1L) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0 && (l3 = (l2 = l8 - (l7 = (long)n7)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                    boolean bl4;
                    if (object != null) {
                        object = ((SelectedOrderItem)object).getExchangeReturnRTO();
                        object2 = Boolean.FALSE;
                        bl4 = Intrinsics.areEqual(object, object2);
                    } else {
                        bl4 = false;
                        object = null;
                    }
                    if (bl4) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public static Boolean D(SelectedOrderItem object) {
        if (object != null && (object = ((SelectedOrderItem)object).getOrderStatus()) != null) {
            String string2 = "DELIVERED";
            boolean bl2 = ((String)object).equalsIgnoreCase(string2);
            object = bl2;
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }

    public static boolean E(CartOrder object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((CartOrder)object).getPaymentMode();
        boolean bl2 = false;
        if (object != null && (n3 = ((String)object).length()) > 0) {
            boolean bl3;
            boolean bl4;
            Object object2 = Locale.ROOT;
            object = ((String)object).toLowerCase((Locale)object2);
            object2 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            n3 = ((String)object).length();
            if (n3 > 0 && ((n3 = (int)(StringsKt.F((CharSequence)object, (CharSequence)(object2 = "cod"), bl4 = true) ? 1 : 0)) != 0 || (bl3 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "cash on delivery"), bl4)))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static boolean I(SelectedOrderItem object) {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        boolean bl5 = false;
        if (object != null) {
            bl4 = ((SelectedOrderItem)object).isViewExchangeAvailable();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = qz1_2.D((SelectedOrderItem)object), bl4 = Boolean.FALSE))) {
            bl5 = true;
        }
        return bl5;
    }

    public static final UserInformation b(qz1_2 qz1_22) {
        return (UserInformation)qz1_22.q0.getValue();
    }

    public static /* synthetic */ void e(qz1_2 qz1_22) {
        qz1_22.d(false, null);
    }

    public static boolean f(SelectedOrderItem object) {
        Serializable serializable;
        boolean bl2 = false;
        if (object != null && (serializable = ((SelectedOrderItem)object).getConsignment()) != null) {
            boolean bl3;
            serializable = ((SelectedOrderItem)object).isReturnableExchangeable();
            Intrinsics.checkNotNull(serializable);
            boolean bl4 = (Boolean)serializable;
            if (bl4 && (object = ((SelectedOrderItem)object).getCartEntry()) != null && (bl3 = ((CartEntry)object).isExchangeable()) == (bl4 = true)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static boolean g(SelectedOrderItem object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Serializable serializable;
        boolean bl5 = false;
        if (object != null && (serializable = ((SelectedOrderItem)object).getConsignment()) != null && (serializable = ((SelectedOrderItem)object).getCartEntry()) != null && (bl4 = ((CartEntry)serializable).isReturnable()) == (bl3 = true) && (object = ((SelectedOrderItem)object).getCartEntry()) != null && (bl2 = ((CartEntry)object).isReturnable()) == bl3) {
            bl5 = true;
        }
        return bl5;
    }

    public static String k(CartOrder object) {
        float f5;
        int n3;
        float f6;
        Intrinsics.checkNotNullParameter(object, "data");
        Price price = ((CartOrder)object).getDeliveryCost();
        if (price != null) {
            object = ((CartOrder)object).getDeliveryCost().getValue();
            f6 = mz3_0.J((String)object);
        } else {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        }
        float f7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        if (f7 > 0) {
            object = qz2_0.u(f6);
        } else {
            n3 = R$string.free;
            object = hv3_0.K(n3);
        }
        return object;
    }

    public static CartEntry l(SelectedOrderItem object) {
        object = object != null ? ((SelectedOrderItem)object).getCartEntry() : null;
        return object;
    }

    public static String m(CartDeliveryAddress object) {
        if (object != null) {
            String string2 = ((CartDeliveryAddress)object).getFirstName();
            object = ((CartDeliveryAddress)object).getLastName();
            return n1.a(string2, " ", (String)object);
        }
        return "";
    }

    public static la2_0 o() {
        Object object = h40_0.a;
        object = z40_0.Companion;
        return (la2_0)JsonUtils.fromJson(Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("order_communication_packet_no_config"), la2_0.class);
    }

    public static String p(CartEntry object) {
        float f5;
        float f6;
        Intrinsics.checkNotNullParameter(object, "cartEntry");
        String string2 = ((CartEntry)object).getVoucherPromoAmt();
        if (string2 != null) {
            object = ((CartEntry)object).getVoucherPromoAmt();
            string2 = "getVoucherPromoAmt(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            f6 = Float.parseFloat((String)object);
        } else {
            f6 = 0.0f;
            object = null;
        }
        float f7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        object = f7 > 0 ? qz2_0.q(f6) : "";
        return object;
    }

    public static String q(Product product) {
        int n3;
        String string2;
        String string3 = null;
        if (product != null) {
            string2 = product.getName();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            if (product != null) {
                string3 = product.getName();
            }
        } else {
            string3 = "";
        }
        return string3;
    }

    public static xs3_0 w(CartOrder object) {
        int n3;
        float f5;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "data");
        Object object3 = ((CartOrder)object).getTaaraBurnedAmount();
        Object object4 = null;
        if (object3 == null) {
            object3 = ax0_1.a;
            object2 = ((CartOrder)object).getRelianceOneAmount();
            object3.getClass();
            f5 = ax0_1.a((Price)object2);
            int n4 = R$string.r1_points;
            object2 = hv3_0.K(n4);
        } else {
            object3 = h40_0.a;
            object3 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.b("taaraWalletName");
            n3 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        ax0_1 ax0_12 = ax0_1.a;
        object = ((CartOrder)object).getTaaraBurnedAmount();
        ax0_12.getClass();
        float f6 = ax0_1.a((Price)object);
        f6 = ax0_1.b(f5, f6);
        float f7 = f6 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            object4 = Boolean.TRUE;
            object = qz2_0.u(f6);
            object3 = new xs3_0(object4, object2, object);
            return object3;
        }
        object3 = Boolean.FALSE;
        object4 = "";
        object = new xs3_0(object3, object4, object4);
        return object;
    }

    public static String x(CartOrder cartOrder) {
        Intrinsics.checkNotNullParameter(cartOrder, "data");
        ArrayList arrayList = cartOrder.getEntries();
        float f5 = 0.0f;
        if (arrayList != null) {
            arrayList = cartOrder.getEntries();
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                float f6;
                Object object = cartOrder.getEntries().get(i3);
                if (object == null) continue;
                object = ((CartEntry)cartOrder.getEntries().get(i3)).getMultiItemPromoAmt();
                f5 = f6 = mz3_0.J(object) + f5;
            }
        }
        return qz2_0.q(f5);
    }

    public static String y(ReturnOrderTracker serializable) {
        Intrinsics.checkNotNullParameter(serializable, "tracker");
        ArrayList arrayList = ((ReturnOrderTracker)serializable).getSubStatus();
        if (arrayList != null) {
            arrayList = ((ReturnOrderTracker)serializable).getSubStatus();
            Intrinsics.checkNotNull(arrayList);
            int n3 = arrayList.size();
            if (n3 > 0) {
                serializable = ((ReturnOrderTracker)serializable).getSubStatus();
                Intrinsics.checkNotNull(serializable);
                return ((SubStatus)((ArrayList)serializable).get(0)).getSubStatusMessage();
            }
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String z(SelectedOrderItem object) {
        Consignment consignment;
        if (object != null && (consignment = ((SelectedOrderItem)object).getConsignment()) != null) {
            object = ((SelectedOrderItem)object).getConsignment();
            Intrinsics.checkNotNull(object);
            return ((Consignment)object).getShipmentMessage();
        }
        consignment = null;
        if (object == null) return null;
        OrderDetailLineItem orderDetailLineItem = ((SelectedOrderItem)object).getOrderDetailLineItem();
        if (orderDetailLineItem == null) return null;
        if ((object = ((SelectedOrderItem)object).getOrderDetailLineItem()) == null) return null;
        boolean bl2 = ((OrderDetailLineItem)object).isPsdBreachedFlag();
        boolean bl3 = ((OrderDetailLineItem)object).isEddBreachedFlag();
        if (bl2) return ((OrderDetailLineItem)object).getShipmentMessage();
        if (!bl3) return null;
        return ((OrderDetailLineItem)object).getShipmentMessage();
    }

    public final void A(String string2, String string3) {
        aW aW2 = md3_0.c(this);
        QZ1$d qZ1$d = new QZ1$d(this, string3, string2, null);
        Ae3.d(aW2, null, null, qZ1$d, 3);
    }

    public final void F(String string2) {
        Intrinsics.checkNotNullParameter(string2, "label");
        aW aW2 = md3_0.c(this);
        QZ1$e qZ1$e = new QZ1$e(null, this, string2);
        Ae3.d(aW2, null, null, qZ1$e, 3);
    }

    public final void G(String string2) {
        qz1_2 qz1_22 = this;
        Intrinsics.checkNotNullParameter(string2, "action");
        Bundle bundle = new Bundle();
        Object object = this.g;
        bundle.putString("product_id", (String)object);
        Object object2 = (CartOrder)this.l.getValue();
        object2 = object2 != null ? ((CartOrder)object2).getCode() : null;
        bundle.putString("order_id", (String)object2);
        int n3 = qz1_22.A0;
        bundle.putInt("return_fee", n3);
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
        String string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
        String string5 = bv_0.a((AnalyticsManager$Companion)object2);
        String string6 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string2, null, string3, "order item details screen", null, string5, bundle, string6, false, null, 1572, null);
    }

    public final void H(String string2) {
        this.g = string2;
    }

    public final void c(CartOrder object, String iterator, String object2) {
        this.g = iterator;
        this.l.setValue(object);
        cp_1.Companion.getClass();
        cp$a.e().getClass();
        cp_1.P((CartAndOrder)object);
        OrderDetailFunctionalRepo orderDetailFunctionalRepo = OrderDetailFunctionalRepo.INSTANCE;
        hv3_0.a.getClass();
        Object object3 = z40_0.Companion;
        boolean bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.a("enableConfirmedOrdersDelayTrackbar");
        boolean bl3 = this.S;
        Object object4 = object3 = this.i.getValue();
        object4 = (String)object3;
        boolean bl4 = this.e;
        boolean bl5 = true;
        object = orderDetailFunctionalRepo.getSelectedItemOrderDetail(this, (CartOrder)object, (String)((Object)iterator), bl2, bl5, (String)object2, bl3, (String)object4, bl4);
        boolean bl6 = this.S;
        object2 = null;
        if (bl6) {
            this.S = false;
            this.e = false;
        }
        this.B0 = false;
        iterator = this.m;
        object2 = object.get("selected_products");
        object3 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.services.data.Order.SelectedOrderItem>";
        Intrinsics.checkNotNull(object2, (String)object3);
        object2 = TypeIntrinsics.asMutableList(object2);
        ((h83_0)((Object)iterator)).setValue(object2);
        iterator = (ArrayList)object.get("other_products");
        object2 = new p83_0();
        if (iterator != null) {
            boolean bl7;
            iterator = iterator.iterator();
            while (bl7 = iterator.hasNext()) {
                object3 = (CartEntry)iterator.next();
                ((p83_0)object2).add(object3);
            }
        }
        this.z.setValue(object2);
        object = object.get("gift_products");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.util.ArrayList<com.ril.ajio.services.data.Product.Product?>?>");
        object = (HashMap)object;
        this.A.setValue(object);
    }

    public final void d(boolean bl2, SelectedOrderItem selectedOrderItem) {
        LinkedHashMap<Boolean, SelectedOrderItem> linkedHashMap = new LinkedHashMap<Boolean, SelectedOrderItem>();
        Boolean bl3 = bl2;
        linkedHashMap.put(bl3, selectedOrderItem);
        this.p.setValue(linkedHashMap);
    }

    public final void h(CartOrder cartOrder, int n3, SelectedOrderItem selectedOrderItem) {
        aW aW2 = md3_0.c(this);
        QZ1$a qZ1$a = new QZ1$a(n3, this, selectedOrderItem, cartOrder, null);
        Ae3.d(aW2, null, null, qZ1$a, 3);
    }

    public final void i(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(string3, "shipmentCode");
        aW aW2 = md3_0.c(this);
        QZ1$b qZ1$b = new QZ1$b(this, string2, string3, null);
        Ae3.d(aW2, null, null, qZ1$b, 3);
    }

    public final String j(CartOrder object) {
        int n3 = 0;
        String[] stringArray = null;
        String string2 = object != null ? ((CartOrder)object).getBalancedPaidModeVia() : null;
        if (string2 != null) {
            object = new String[]{","};
            object = StringsKt.a0(string2, (String[])object, false, 0, 6);
            stringArray = new String[]{};
            object = object.toArray(stringArray);
            n3 = ((Object)object).length;
            string2 = "";
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = this.U;
                Object object3 = object[i3];
                String string3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                int n4 = ((ArrayList)object2).contains(string3);
                if (n4 != 0) continue;
                n4 = string2.length();
                if (n4 != 0) {
                    object2 = ", ";
                    object3 = ((String)object2).concat((String)object3);
                }
                string2 = Qj0.b(string2, (String)object3);
            }
            return string2;
        }
        if (object != null) {
            stringArray = ((CartOrder)object).getBalancedPaidModeVia();
        }
        return stringArray;
    }

    public final void n(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "orderCode");
        Object object = "0";
        Intrinsics.checkNotNullParameter(object, "entryNumber");
        Intrinsics.checkNotNullParameter(string3, "itemStatus");
        Object object2 = h40_0.a;
        boolean bl2 = h40_0.U0();
        if (!bl2) {
            return;
        }
        object2 = md3_0.c(this);
        object = new uz1_2(this, string2, string3, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object, 3);
    }

    public final float r(SelectedOrderItem object) {
        float f5;
        Rating rating = null;
        if (object != null && (object = ((SelectedOrderItem)object).getCartEntry()) != null && (object = ((CartEntry)object).getProduct()) != null) {
            object = ((Product)object).getCode();
        } else {
            object = null;
            f5 = 0.0f;
        }
        ArrayList arrayList = (CartOrder)this.l.getValue();
        arrayList = arrayList != null ? ((CartOrder)((Object)arrayList)).ratings : null;
        if (arrayList != null) {
            boolean bl2;
            arrayList = arrayList.iterator();
            while (bl2 = arrayList.hasNext()) {
                Object e2;
                Object object2 = e2 = arrayList.next();
                object2 = ((Rating)e2).skuId;
                boolean bl3 = Intrinsics.areEqual(object2, object);
                if (!bl3) continue;
                rating = e2;
                break;
            }
            rating = rating;
        }
        if (rating != null) {
            f5 = rating.rating;
        } else {
            f5 = 0.0f;
            object = null;
        }
        return f5;
    }

    public final Rating s(SelectedOrderItem object) {
        Rating rating = null;
        object = object != null && (object = ((SelectedOrderItem)object).getCartEntry()) != null && (object = ((CartEntry)object).getProduct()) != null ? ((Product)object).getCode() : null;
        ArrayList arrayList = (CartOrder)this.l.getValue();
        if ((arrayList = arrayList != null ? ((CartOrder)((Object)arrayList)).ratings : null) != null) {
            boolean bl2;
            arrayList = arrayList.iterator();
            while (bl2 = arrayList.hasNext()) {
                Object e2;
                Object object2 = e2 = arrayList.next();
                object2 = ((Rating)e2).skuId;
                boolean bl3 = Intrinsics.areEqual(object2, object);
                if (!bl3) continue;
                rating = e2;
                break;
            }
            rating = rating;
        }
        return rating;
    }

    public final ArrayList t(SelectedOrderItem iterator) {
        boolean bl2;
        Object object;
        int n3;
        int n4;
        Serializable serializable;
        ArrayList<UserSubRating> arrayList = new ArrayList<UserSubRating>();
        iterator = this.s((SelectedOrderItem)((Object)iterator));
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = iterator != null ? ((Rating)((Object)iterator)).userSubRatings : null;
        if (iterator != null && (serializable = ((Rating)((Object)iterator)).questionResponse) != null) {
            serializable = ((QuestionResponse)serializable).questions;
        } else {
            n4 = 0;
            serializable = null;
        }
        int n7 = 0;
        UserSubRating userSubRating = null;
        if (arrayList3 != null) {
            n3 = arrayList3.size();
        } else {
            n3 = 0;
            object = null;
        }
        if (serializable != null) {
            n7 = ((ArrayList)serializable).size();
        }
        if (n3 == n7) {
            if (iterator != null) {
                arrayList2 = ((Rating)((Object)iterator)).userSubRatings;
            }
            return arrayList2;
        }
        if (serializable != null && !(bl2 = serializable.isEmpty())) {
            iterator = serializable.iterator();
            while ((n4 = iterator.hasNext()) != 0) {
                UserSubRating userSubRating2;
                boolean bl3;
                serializable = (Question)iterator.next();
                n7 = ((Question)serializable).questionId;
                if (arrayList3 != null) {
                    block15: {
                        object = arrayList3.iterator();
                        while (bl3 = object.hasNext()) {
                            UserSubRating userSubRating3 = userSubRating2 = (UserSubRating)object.next();
                            userSubRating3 = userSubRating2;
                            int n8 = userSubRating3.questionId;
                            if (n8 != n7) continue;
                            break block15;
                        }
                        bl3 = false;
                        userSubRating2 = null;
                    }
                    userSubRating2 = userSubRating2;
                } else {
                    bl3 = false;
                    userSubRating2 = null;
                }
                if (userSubRating2 != null) {
                    arrayList.add(userSubRating2);
                    continue;
                }
                userSubRating = new UserSubRating();
                object = ((Question)serializable).title;
                userSubRating.setTitle((String)object);
                n4 = ((Question)serializable).questionId;
                userSubRating.setQuestionId(n4);
                arrayList.add(userSubRating);
            }
        } else if (arrayList3 != null && !(bl2 = arrayList3.isEmpty())) {
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final String u() {
        Object object = this.l;
        Object object2 = ((h83_0)object).getValue();
        if (object2 != null) {
            object = ((h83_0)object).getValue();
            Intrinsics.checkNotNull(object);
            return ((CartOrder)object).getReturnQuickInfoUrl();
        }
        return null;
    }

    public final void v(String string2, String string3, SelectedOrderItem selectedOrderItem) {
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(string3, "consignmentCode");
        aW aW2 = md3_0.c(this);
        QZ1$c qZ1$c = new QZ1$c(this, selectedOrderItem, string2, string3, null);
        Ae3.d(aW2, null, null, qZ1$c, 3);
    }
}

