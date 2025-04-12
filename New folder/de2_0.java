/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.viewinterop.b;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.myaccount.ajiocash.datasource.OrderCancellationRefundConfig;
import com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment$onRatingChangedEvent$1;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CancelledRefundDetailInfo;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.Entries;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.QuestionResponse;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Order.UserSubRating;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.ReviewModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import com.ril.ajio.view.BaseActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from De2
 */
public final class de2_0 {
    public static final void A(qz1_2 qz1_22, b30_0 b30_02, int n3) {
        qz1_2 qz1_23 = qz1_22;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1448252846;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        Object object3 = LP1$a.b;
        int bl2 = 1065353216;
        float f5 = 1.0f;
        object = j.c((LP1)object3, f5);
        Object object4 = zp.a;
        Object object5 = Nc$a.k;
        int n7 = 54;
        object4 = iQ2.a((zp$e)object4, (Gx$b)object5, (b30_0)object2, n7);
        int n8 = ((j30_0)object2).P;
        Object object6 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Serializable serializable = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n10 = mp2 instanceof mp;
        if (n10 != 0) {
            ((j30_0)object2).A();
            n10 = ((j30_0)object2).O;
            if (n10 != 0) {
                ((j30_0)object2).C((Function0)((Object)serializable));
            } else {
                ((j30_0)object2).n();
            }
            serializable = N20$a.e;
            Ow3.a((b30_0)object2, object4, (Function2)((Object)serializable));
            object4 = N20$a.d;
            Ow3.a((b30_0)object2, object6, (Function2)object4);
            object4 = N20$a.f;
            n7 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object2).v(), serializable = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object2, object, (Function2)object4);
            int n14 = R$string.rate_product;
            object = nk_0.f((b30_0)object2, n14);
            long l2 = xx_1.e;
            int n15 = 16;
            long l3 = Em3.f(n15);
            tv0_0 tv0_02 = tv0_0.o;
            LP1 lP1 = j.o((LP1)object3);
            float f6 = n15;
            int n16 = 4;
            float f7 = n16;
            object4 = h.i(lP1, f6, 0.0f, f7, 0.0f, 10);
            lP1 = null;
            nV0 nV02 = new nV0(0);
            Cj3 cj3 = new Cj3(3);
            int n17 = 200112;
            long l4 = 0L;
            Object object7 = cj3;
            cj3 = null;
            long l7 = 0L;
            int n18 = 130496;
            LP1$a lP1$a = object3;
            object3 = object7;
            object7 = object2;
            Ll3.b((String)object, (LP1)object4, l2, l3, nV02, tv0_02, null, l4, null, (Cj3)object3, l7, 0, false, 0, 0, null, null, (b30_0)object2, n17, 0, n18);
            object = new qc0_1(qz1_23, 1);
            n15 = 8;
            f6 = n15;
            object5 = lP1$a;
            object4 = h.e(lP1$a, f6);
            object5 = new ls_2(1);
            n7 = 0;
            object4 = CY2.b((LP1)object4, false, (Function1)object5);
            n10 = 4;
            n8 = 0;
            object5 = null;
            serializable = null;
            object6 = object2;
            b.a((Function1)object, (LP1)object4, null, (b30_0)object2, 0, n10);
            boolean bl3 = true;
            f5 = Float.MIN_VALUE;
            ((j30_0)object2).T(bl3);
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                n15 = n3;
                ((CF2)object2).d = object = new sd2_1(qz1_23, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void B(qz1_2 qz1_22, Product product, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1839343098;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = ((j30_0)object).j((H30)object2);
        boolean bl2 = object2 instanceof Activity;
        Fragment fragment = null;
        if (bl2) {
            object2 = (Activity)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object3 = (Number)qz1_22.Q.getValue();
        float f5 = ((Number)object3).floatValue();
        boolean bl3 = false;
        Object object4 = null;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false) {
            object4 = Float.valueOf(0.0f);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = qz1_22.Q;
            parcelableSnapshotMutableState.setValue(object4);
            bl3 = object2 instanceof BaseActivity;
            if (bl3) {
                object2 = ((AjioHomeActivity)object2).T0;
                if (object2 != null) {
                    object2 = ((Fragment)object2).getChildFragmentManager();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    fragment = ((FragmentManager)object2).E("OrderSummaryFragment");
                }
                object2 = de2_0.U(qz1_22, product, f5, selectedOrderItem);
                Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                fragment = (bg2_1)fragment;
                fragment.getClass();
                Intrinsics.checkNotNullParameter(object2, "ratingsModel");
                ((bg2_1)fragment).o = object3 = ((RatingsModel)object2).getBaseProductId();
                object2 = wD2$a.b(wd2_0.Companion, (RatingsModel)object2);
                object3 = ((bg2_1)fragment).m;
                if (object3 != null) {
                    ((Timer)object3).cancel();
                }
                ((bg2_1)fragment).m = object3 = new Timer();
                object4 = new OrderSummaryFragment$onRatingChangedEvent$1((bg2_1)fragment, (wd2_0)object2);
                long l2 = 500L;
                ((Timer)object3).schedule((TimerTask)object4, l2);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ed2_1(qz1_22, product, selectedOrderItem, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void C(SelectedOrderItem selectedOrderItem, qz1_2 qz1_22, CartOrder cartOrder, b30_0 b30_02, int n3) {
        float f5;
        int n4;
        int n7;
        Object object;
        Object object2;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        qz1_2 qz1_23 = qz1_22;
        CartOrder cartOrder2 = cartOrder;
        int n8 = n3;
        int n10 = -405225466;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n10);
        int n14 = 0;
        float f6 = 0.0f;
        object3 = null;
        Object object5 = "toLowerCase(...)";
        if (selectedOrderItem != null && (object2 = selectedOrderItem.getOrderStatus()) != null) {
            object = Locale.ROOT;
            object2 = ((String)object2).toLowerCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        } else {
            n7 = 0;
            object2 = null;
        }
        object = Locale.ROOT;
        Object object6 = "CANCELLED";
        Object object7 = ((String)object6).toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
        n7 = Intrinsics.areEqual(object2, object7);
        if (n7 == 0) {
            if ((object4 = ((j30_0)object4).X()) != null) {
                ((CF2)object4).d = object3 = new vd2_1(selectedOrderItem2, qz1_23, cartOrder2, n8);
            }
            return;
        }
        object2 = selectedOrderItem.isExchangeOrder();
        n7 = Intrinsics.areEqual(object2, object7 = Boolean.TRUE);
        if (n7 != 0) {
            object2 = selectedOrderItem.getOrderStatus();
            if (object2 != null) {
                object2 = ((String)object2).toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            } else {
                n7 = 0;
                object2 = null;
            }
            object = ((String)object6).toLowerCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(object, (String)object5);
            n4 = Intrinsics.areEqual(object2, object);
            if (n4 != 0) {
                if ((object4 = ((j30_0)object4).X()) != null) {
                    ((CF2)object4).d = object3 = new wd2_1(selectedOrderItem2, qz1_23, cartOrder2, n8);
                }
                return;
            }
        }
        qz1_22.getClass();
        Intrinsics.checkNotNullParameter(cartOrder2, "data");
        object5 = cartOrder.getPaymentMode();
        Intrinsics.checkNotNullExpressionValue(object5, "getPaymentMode(...)");
        object2 = h40_0.a;
        OrderCancellationRefundConfig orderCancellationRefundConfig = h40_0.X();
        object2 = selectedOrderItem.getCancelledRefundDetails();
        if (object2 == null) {
            if ((object4 = ((j30_0)object4).X()) != null) {
                ((CF2)object4).d = object3 = new xd2_1(selectedOrderItem2, qz1_23, cartOrder2, n8);
            }
            return;
        }
        object = hv3_0.K(R$string.cod);
        boolean bl2 = true;
        n4 = kotlin.text.b.i((String)object5, (String)object, bl2);
        object6 = LP1$a.b;
        int n15 = 16;
        float f7 = 2.2E-44f;
        if (n4 == 0) {
            n14 = 1904908984;
            ((j30_0)object4).K(n14);
            f6 = n15;
            object3 = h.e((LP1)object6, f6);
            object5 = new De2$H((CancelledRefundDetailInfo)object2, qz1_23);
            object = v10.c(-565310467, (fx0_2)object5, (b30_0)object4);
            n4 = 0;
            f5 = 0.0f;
            object5 = null;
            n7 = 0;
            object2 = null;
            int n16 = 3078;
            float f8 = 4.313E-42f;
            int n17 = 6;
            object6 = object4;
            OA.a((LP1)object3, null, false, (u10)object, (b30_0)object4, n16, n17);
            ((j30_0)object4).T(false);
        } else {
            long l2;
            n4 = 1909474447;
            ((j30_0)object4).K(n4);
            f5 = n15;
            object5 = h.e((LP1)object6, f5);
            object2 = zp.c;
            object = Nc$a.m;
            object2 = oZ.a((zp$l)object2, (Gx$a)object, (b30_0)object4, 0);
            n15 = ((j30_0)object4).P;
            object7 = ((j30_0)object4).P();
            object5 = a30_0.c((b30_0)object4, (LP1)object5);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = ((j30_0)object4).a;
            boolean bl3 = mp2 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object4).A();
            n14 = (int)(((j30_0)object4).O ? 1 : 0);
            if (n14 != 0) {
                ((j30_0)object4).C(xp1$a);
            } else {
                ((j30_0)object4).n();
            }
            object3 = N20$a.e;
            Ow3.a((b30_0)object4, object2, (Function2)object3);
            object3 = N20$a.d;
            Ow3.a((b30_0)object4, object7, (Function2)object3);
            object3 = N20$a.f;
            n7 = ((j30_0)object4).O;
            if (n7 != 0 || (n7 = Intrinsics.areEqual(object2 = ((j30_0)object4).v(), object7 = Integer.valueOf(n15))) == 0) {
                rk_0.a(n15, (j30_0)object4, n15, (N20$a$a)object3);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object4, object5, (Function2)object3);
            String string2 = "";
            if (orderCancellationRefundConfig == null || (object3 = orderCancellationRefundConfig.getNoRefundCODTitle()) == null) {
                object3 = string2;
            }
            n4 = 14;
            f5 = 2.0E-44f;
            long l3 = Em3.f(n4);
            Object object8 = tv0_0.o;
            long l4 = xx_1.e;
            float f11 = 0.0f;
            n7 = 12;
            f7 = n7;
            object5 = h.h((LP1)object6, f11, f11, f11, f7);
            int n18 = 200112;
            boolean bl4 = false;
            xp1$a = null;
            bl3 = false;
            mp2 = null;
            long l7 = l2 = 0L;
            long l8 = 0L;
            int n19 = 131024;
            float f12 = f7;
            int n20 = 12;
            Object object9 = object6;
            float f14 = f11;
            long l12 = l3;
            tv0_0 tv0_02 = object8;
            object8 = object4;
            Ll3.b((String)object3, (LP1)object5, l4, l3, null, tv0_02, null, l2, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object4, n18, 0, n19);
            if (orderCancellationRefundConfig == null || (object3 = orderCancellationRefundConfig.getNoRefundCODDescription()) == null) {
                object3 = string2;
            }
            l12 = Em3.f(n20);
            tv0_02 = tv0_0.m;
            n7 = 8;
            f5 = n7;
            object = object9;
            object5 = h.h((LP1)object9, f14, f5, f14, f12);
            n18 = 200112;
            bl4 = false;
            xp1$a = null;
            bl3 = false;
            mp2 = null;
            l7 = 0L;
            l8 = 0L;
            n19 = 131024;
            object8 = object4;
            Ll3.b((String)object3, (LP1)object5, l4, l12, null, tv0_02, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object4, n18, 0, n19);
            ((j30_0)object4).T(true);
            n14 = 0;
            f6 = 0.0f;
            object3 = null;
            ((j30_0)object4).T(false);
        }
        n14 = 8;
        f6 = 1.1E-44f;
        f6 = n14;
        n4 = 6;
        f5 = 8.4E-45f;
        vb2.h(f6, (b30_0)object4, n4);
        object4 = ((j30_0)object4).X();
        if (object4 != null) {
            ((CF2)object4).d = object3 = new yd2_1(selectedOrderItem2, qz1_23, cartOrder2, n8);
        }
    }

    public static final void D(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        object = object.g(764205171);
        Object object2 = (Boolean)qz1_22.q.getValue();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            boolean bl3;
            object2 = Boolean.FALSE;
            Object object3 = qz1_22.q;
            ((h83_0)object3).setValue(object2);
            bl2 = false;
            object2 = null;
            if (selectedOrderItem != null) {
                object3 = selectedOrderItem.getConsignment();
            } else {
                bl3 = false;
                object3 = null;
            }
            Object object4 = (CartOrder)qz1_22.l.getValue();
            object4 = object4 != null ? ((CartOrder)object4).getCode() : null;
            if (object3 != null) {
                object2 = ((Consignment)object3).getCode();
            }
            object3 = qz1_22.x;
            ((h83_0)object3).setValue(object2);
            bl3 = TextUtils.isEmpty((CharSequence)object4);
            if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)object2))) {
                Intrinsics.checkNotNull(object4);
                Intrinsics.checkNotNull(object2);
                qz1_22.v((String)object4, (String)object2, selectedOrderItem);
            } else {
                if ((object = ((j30_0)object).X()) != null) {
                    ((CF2)object).d = object2 = new re2_1(qz1_22, selectedOrderItem, n3);
                }
                return;
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new se2_1(qz1_22, selectedOrderItem, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void E(qz1_2 var0, SelectedOrderItem var1_1, b30_0 var2_2, int var3_3) {
        block94: {
            block99: {
                block100: {
                    block98: {
                        block97: {
                            block96: {
                                block95: {
                                    var4_4 = var0;
                                    var5_5 = var1_1;
                                    var6_6 = "viewModel";
                                    Intrinsics.checkNotNullParameter(var0, (String)var6_6);
                                    var7_7 = 1805604308;
                                    var8_8 = 3.8524903E26f;
                                    var9_9 = var2_2;
                                    var10_10 = var2_2.g(var7_7);
                                    var9_9 = (Boolean)var0.r.getValue();
                                    var11_11 = var9_9.booleanValue();
                                    var12_12 = var0.s;
                                    var13_13 = (Boolean)var12_12.getValue();
                                    var14_14 = var13_13.booleanValue();
                                    var15_15 = AndroidCompositionLocals_androidKt.b;
                                    var15_15 = var10_10.j((H30)var15_15);
                                    var16_16 = var15_15 instanceof Activity;
                                    var15_15 = var16_16 != 0 ? (Activity)var15_15 : null;
                                    var17_17 = (CartOrder)var4_4.l.getValue();
                                    var18_18 = var5_5 != null ? var1_1.getCartEntry() : null;
                                    if (var18_18 != null) {
                                        var19_19 = var18_18.getQuantity();
                                        var18_18.setOrderTotalQuantity((Integer)var19_19);
                                    }
                                    if (var18_18 != null) {
                                        var19_19 = var18_18.getConvenienceFee();
                                    } else {
                                        var20_20 = 0.0f;
                                        var19_19 = null;
                                    }
                                    if (var18_18 != null && (var21_21 = var18_18.getOrderTotalQuantity()) != null) {
                                        var22_22 = var21_21.intValue();
                                    } else {
                                        var22_22 = 1;
                                        var23_23 = 1.4E-45f;
                                    }
                                    if (var5_5 != null && (var24_24 = var1_1.getQuantity()) != null) {
                                        var25_25 = var24_24.intValue();
                                    } else {
                                        var25_25 = 1;
                                        var26_26 = 1.4E-45f;
                                    }
                                    if (var19_19 != null && (var27_27 = var19_19.getTotal()) != null) {
                                        var28_28 = var27_27.getNetAmount();
                                        var27_27 = Float.valueOf(var28_28);
                                    } else {
                                        var29_29 = 0;
                                        var28_28 = 0.0f;
                                        var27_27 = null;
                                    }
                                    Intrinsics.checkNotNull(var27_27);
                                    var28_28 = var27_27.floatValue();
                                    var23_23 = var22_22;
                                    var28_28 /= var23_23;
                                    var26_26 = var25_25;
                                    var27_27 = String.valueOf(var28_28 *= var26_26);
                                    var30_30 = new LinkedHashMap<Object, Object>();
                                    if (var19_19 != null && (var31_31 /* !! */  = var19_19.getDelivery()) != null) {
                                        var32_32 = var31_31 /* !! */ .getNetAmount();
                                        var31_31 /* !! */  = Float.valueOf(var32_32);
                                    } else {
                                        var32_32 = 0.0f;
                                        var31_31 /* !! */  = null;
                                    }
                                    Intrinsics.checkNotNull(var31_31 /* !! */ );
                                    var33_33 = String.valueOf(var31_31 /* !! */ .floatValue() / var23_23 * var26_26);
                                    var32_32 = 0.0f;
                                    var31_31 /* !! */  = null;
                                    var34_34 = 0.0f;
                                    if (var33_33 == null || (var35_35 = var33_33.length()) == 0 || (var35_35 = (int)((cfr_temp_0 = (var36_36 = Float.parseFloat((String)var33_33)) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) <= 0) break block95;
                                    var37_37 = var19_19.getDelivery();
                                    var38_38 = var10_10;
                                    if (var37_37 != null) {
                                        var10_10 = var37_37.isFeeCharged();
                                        var37_37 = var12_12;
                                        var12_12 = Boolean.TRUE;
                                        var7_7 = (int)Intrinsics.areEqual(var10_10, var12_12);
                                    } else {
                                        var37_37 = var12_12;
                                        var7_7 = 0;
                                        var8_8 = 0.0f;
                                        var10_10 = null;
                                    }
                                    if (var7_7 == 0) break block96;
                                    var10_10 = "Delivery Fee";
                                    var30_30.put(var10_10, var33_33);
                                    break block97;
                                }
                                var38_38 = var10_10;
                                var37_37 = var12_12;
                            }
                            var39_39 = Double.parseDouble((String)var27_27);
                            var41_40 = Double.parseDouble((String)var33_33);
                            var27_27 = String.valueOf(var39_39 -= var41_40);
                        }
                        var33_33 = var19_19.getRVP();
                        if (var33_33 != null) {
                            var43_41 = var33_33.getNetAmount();
                            var33_33 = Float.valueOf(var43_41);
                        } else {
                            var44_42 = 0;
                            var43_41 = 0.0f;
                            var33_33 = null;
                        }
                        Intrinsics.checkNotNull(var33_33);
                        var43_41 = var33_33.floatValue() / var23_23 * var26_26;
                        var33_33 = String.valueOf(var43_41);
                        if (var33_33 != null && (var7_7 = var33_33.length()) != 0) {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        } else {
                            var7_7 = 1;
                            var8_8 = 1.4E-45f;
                        }
                        if (var7_7 != 0 || (var7_7 = (int)((cfr_temp_1 = (var8_8 = Float.parseFloat((String)var33_33)) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) <= 0) ** GOTO lbl-1000
                        var10_10 = var19_19.getRVP();
                        if (var10_10 != null) {
                            var10_10 = var10_10.isFeeCharged();
                            var12_12 = Boolean.TRUE;
                            var7_7 = (int)Intrinsics.areEqual(var10_10, var12_12);
                        } else {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        }
                        if (var7_7 != 0) {
                            var10_10 = "Platform Fee";
                            var30_30.put(var10_10, var33_33);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var39_39 = Double.parseDouble((String)var27_27);
                            var41_40 = Double.parseDouble((String)var33_33);
                            var27_27 = String.valueOf(var39_39 -= var41_40);
                        }
                        var33_33 = var19_19.getPriorityDelivery();
                        if (var33_33 != null) {
                            var43_41 = var33_33.getNetAmount();
                            var33_33 = Float.valueOf(var43_41);
                        } else {
                            var44_42 = 0;
                            var43_41 = 0.0f;
                            var33_33 = null;
                        }
                        if (var33_33 == null) break block98;
                        var33_33 = var19_19.getPriorityDelivery();
                        if (var33_33 != null) {
                            var43_41 = var33_33.getNetAmount();
                        } else {
                            var44_42 = 0;
                            var43_41 = 0.0f;
                            var33_33 = null;
                        }
                        var43_41 = var43_41 / var23_23 * var26_26;
                        var33_33 = String.valueOf(var43_41);
                        if (var33_33 != null && (var7_7 = var33_33.length()) != 0) {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        } else {
                            var7_7 = 1;
                            var8_8 = 1.4E-45f;
                        }
                        if (var7_7 != 0 || (var7_7 = (int)((cfr_temp_2 = (var8_8 = Float.parseFloat((String)var33_33)) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0) ** GOTO lbl-1000
                        var10_10 = var19_19.getPriorityDelivery();
                        if (var10_10 != null) {
                            var10_10 = var10_10.isFeeCharged();
                            var12_12 = Boolean.TRUE;
                            var7_7 = (int)Intrinsics.areEqual(var10_10, var12_12);
                        } else {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        }
                        if (var7_7 != 0) {
                            var10_10 = "Priority Delivery";
                            var30_30.put(var10_10, var33_33);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var39_39 = Double.parseDouble((String)var27_27);
                            var41_40 = Double.parseDouble((String)var33_33);
                            var27_27 = String.valueOf(var39_39 -= var41_40);
                        }
                    }
                    if ((var33_33 = var19_19.getCOD()) != null) {
                        var43_41 = var33_33.getNetAmount();
                        var33_33 = Float.valueOf(var43_41);
                    } else {
                        var44_42 = 0;
                        var43_41 = 0.0f;
                        var33_33 = null;
                    }
                    Intrinsics.checkNotNull(var33_33);
                    var43_41 = var33_33.floatValue() / var23_23 * var26_26;
                    var33_33 = String.valueOf(var43_41);
                    if (var33_33 != null && (var7_7 = var33_33.length()) != 0) {
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var10_10 = null;
                    } else {
                        var7_7 = 1;
                        var8_8 = 1.4E-45f;
                    }
                    if (var7_7 != 0 || (var7_7 = (int)((cfr_temp_3 = (var8_8 = Float.parseFloat((String)var33_33)) - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) <= 0) ** GOTO lbl-1000
                    var10_10 = var19_19.getCOD();
                    if (var10_10 != null) {
                        var10_10 = var10_10.isFeeCharged();
                        var12_12 = Boolean.TRUE;
                        var7_7 = (int)Intrinsics.areEqual(var10_10, var12_12);
                    } else {
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var10_10 = null;
                    }
                    if (var7_7 != 0) {
                        var10_10 = "COD Charges";
                        var30_30.put(var10_10, var33_33);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var45_43 = Double.parseDouble((String)var27_27);
                        var47_44 = Double.parseDouble((String)var33_33);
                        var27_27 = String.valueOf(var45_43 -= var47_44);
                    }
                    var33_33 = cp_1.Companion;
                    var33_33.getClass();
                    var44_42 = cp$a.w();
                    var10_10 = "";
                    if (var44_42 != 0 && (var44_42 = Intrinsics.areEqual(var33_33 = cp$a.n(), var10_10)) == 0 && (var44_42 = Intrinsics.areEqual(var33_33 = cp$a.n(), var12_12 = "(Refundable)")) != 0) {
                        var27_27 = var10_10;
                    }
                    var33_33 = var4_4.X;
                    var12_12 = new Pair(var27_27, var30_30);
                    var33_33.k(var12_12);
                    if (var5_5 != null && (var12_12 = var1_1.getQuantity()) != null) {
                        var49_45 = var12_12.intValue();
                    } else {
                        var49_45 = 0;
                        var50_46 = 0.0f;
                        var12_12 = null;
                    }
                    var30_30 = new LinkedHashMap<Object, Object>();
                    var19_19 = Float.valueOf(0.0f);
                    var21_21 = "0";
                    if (var18_18 == null || (var24_24 = var18_18.getProduct()) == null || (var24_24 = var24_24.getWasPriceData()) == null || (var24_24 = var24_24.getValue()) == null) {
                        var24_24 = var21_21;
                    }
                    var26_26 = mz3_0.J((String)var24_24);
                    if (var18_18 != null && (var27_27 = var18_18.getBasePrice()) != null && (var27_27 = var27_27.getValue()) != null) {
                        var21_21 = var27_27;
                    }
                    var23_23 = mz3_0.J((String)var21_21);
                    var26_26 -= var23_23;
                    var50_46 = var49_45;
                    cfr_temp_4 = (var26_26 *= var50_46) - 0.0f;
                    var22_22 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                    if (var22_22 > 0) {
                        var23_23 = mz3_0.J(String.valueOf(var26_26));
                        var21_21 = String.valueOf(var23_23);
                    } else {
                        var21_21 = var10_10;
                    }
                    if (var21_21 != null && (var25_25 = var21_21.length()) != 0 && (var25_25 = (int)((cfr_temp_5 = (var26_26 = Float.parseFloat((String)var21_21)) - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) > 0) {
                        var30_30.put("Discount", var21_21);
                        var20_20 = Float.parseFloat((String)var21_21) + 0.0f;
                        var19_19 = Float.valueOf(var20_20);
                    }
                    if (var18_18 != null) {
                        var21_21 = var18_18.getVoucherPromoAmt();
                    } else {
                        var22_22 = 0;
                        var23_23 = 0.0f;
                        var21_21 = null;
                    }
                    var24_24 = "getOrderTotalQuantity(...)";
                    if (var21_21 != null) {
                        var21_21 = var18_18.getVoucherPromoAmt();
                        Intrinsics.checkNotNullExpressionValue(var21_21, "getVoucherPromoAmt(...)");
                        var23_23 = Float.parseFloat((String)var21_21);
                        var27_27 = var18_18.getOrderTotalQuantity();
                        Intrinsics.checkNotNullExpressionValue(var27_27, (String)var24_24);
                        var28_28 = var27_27.floatValue();
                        var23_23 = var23_23 / var28_28 * var50_46;
                    } else {
                        var22_22 = 0;
                        var23_23 = 0.0f;
                        var21_21 = null;
                    }
                    var29_29 = (cfr_temp_6 = var23_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                    if (var29_29 > 0) {
                        var23_23 = mz3_0.J(String.valueOf(var23_23));
                        var21_21 = String.valueOf(var23_23);
                    } else {
                        var21_21 = var10_10;
                    }
                    if (var21_21 != null && (var29_29 = var21_21.length()) != 0 && (var29_29 = (int)((cfr_temp_7 = (var28_28 = Float.parseFloat((String)var21_21)) - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1))) > 0) {
                        var27_27 = "Coupon";
                        var30_30.put(var27_27, var21_21);
                        var20_20 = var19_19.floatValue();
                        var23_23 = Float.parseFloat((String)var21_21) + var20_20;
                        var19_19 = Float.valueOf(var23_23);
                    }
                    if (var17_17 != null) {
                        Intrinsics.checkNotNullParameter(var17_17, "cartOrder");
                        var21_21 = var17_17.getEntries();
                        if (var21_21 != null) {
                            var21_21 = var17_17.getEntries();
                            var22_22 = var21_21.size();
                            var29_29 = 0;
                            var28_28 = 0.0f;
                            var27_27 = null;
                            var34_34 = 0.0f;
                            while (true) {
                                var51_47 = var10_10;
                                if (var29_29 < var22_22) {
                                    var10_10 = var17_17.getEntries().get(var29_29);
                                    if (var10_10 != null) {
                                        var10_10 = ((CartEntry)var17_17.getEntries().get(var29_29)).getMultiItemPromoAmt();
                                        var8_8 = mz3_0.J((String)var10_10);
                                        var34_34 = var8_8 + var34_34;
                                    }
                                    var7_7 = 1;
                                    var8_8 = 1.4E-45f;
                                    var29_29 += var7_7;
                                    var10_10 = var51_47;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var51_47 = var10_10;
                            var34_34 = 0.0f;
                        }
                        if (var18_18 != null && (var7_7 = (int)((cfr_temp_8 = var34_34 - 0.0f) == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1))) > 0) {
                            var10_10 = var18_18.getOrderTotalQuantity();
                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var24_24);
                            var8_8 = var10_10.floatValue();
                            var34_34 = var34_34 / var8_8 * var50_46;
                        }
                        if ((var10_10 = String.valueOf(var8_8 = mz3_0.J(String.valueOf(var34_34)))) != null && (var22_22 = var10_10.length()) != 0 && (var22_22 = (int)((cfr_temp_9 = (var23_23 = Float.parseFloat((String)var10_10)) - 0.0f) == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1))) > 0) {
                            var21_21 = "Promo savings";
                            var30_30.put(var21_21, var10_10);
                            var20_20 = var19_19.floatValue();
                            var8_8 = Float.parseFloat((String)var10_10) + var20_20;
                            var19_19 = Float.valueOf(var8_8);
                        }
                        if (var18_18 != null) {
                            var10_10 = var18_18.getBankDiscountPromoAmt();
                        } else {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        }
                        if (var10_10 != null && (var10_10 = var18_18.getOrderTotalQuantity()) != null) {
                            var10_10 = var18_18.getBankDiscountPromoAmt();
                            var21_21 = var6_6;
                            var52_48 = var10_10.doubleValue();
                            var54_49 = (float)var52_48;
                            var10_10 = var18_18.getOrderTotalQuantity();
                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var24_24);
                            var8_8 = var10_10.floatValue();
                            var54_49 = var54_49 / var8_8 * var50_46;
                        } else {
                            var21_21 = var6_6;
                            var54_49 = 0.0f;
                            var6_6 = null;
                        }
                        var7_7 = (int)((cfr_temp_10 = var54_49 - 0.0f) == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1));
                        if (var7_7 > 0) {
                            var54_49 = mz3_0.J(String.valueOf(var54_49));
                            var6_6 = String.valueOf(var54_49);
                        } else {
                            var6_6 = var51_47;
                        }
                        if (var6_6 != null && (var7_7 = var6_6.length()) != 0 && (var7_7 = (int)((cfr_temp_11 = (var8_8 = Float.parseFloat((String)var6_6)) - 0.0f) == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1))) > 0) {
                            var10_10 = "Bank Offer";
                            var30_30.put(var10_10, var6_6);
                            var8_8 = var19_19.floatValue();
                            var54_49 = Float.parseFloat((String)var6_6) + var8_8;
                            var19_19 = var6_6 = Float.valueOf(var54_49);
                        }
                    } else {
                        var21_21 = var6_6;
                        var51_47 = var10_10;
                    }
                    var6_6 = var4_4.Y;
                    var12_12 = String.valueOf(var19_19);
                    var10_10 = new Pair(var12_12, var30_30);
                    var6_6.k(var10_10);
                    if (!var11_11) break block99;
                    var10_10 = Boolean.FALSE;
                    var9_9 = var4_4.r;
                    var9_9.setValue(var10_10);
                    var10_10 = "return";
                    de2_0.F(var4_4, var17_17, var5_5, (String)var10_10);
                    var11_11 = qz1_2.f(var1_1);
                    var49_45 = (int)qz1_2.g(var1_1);
                    if (var49_45 == 0 || !var11_11) break block100;
                    var9_9 = h40_0.a;
                    var9_9 = h40_0.F();
                    var11_11 = var9_9.optBoolean((String)(var12_12 = "showNudge"));
                    if (!var11_11) break block100;
                    var7_7 = var15_15 instanceof AjioHomeActivity;
                    if (var7_7 == 0) break block94;
                    if (var17_17 == null || (var10_10 = var17_17.getCode()) == null) {
                        var10_10 = var51_47;
                    }
                    var4_4.y0 = var10_10;
                    if (var5_5 == null || (var10_10 = var1_1.getOrderStatus()) == null) {
                        var10_10 = var51_47;
                    }
                    var4_4.z0 = var10_10;
                    var15_15 = (AjioHomeActivity)var15_15;
                    var10_10 = var15_15.getSupportFragmentManager().c.f().iterator();
                    while (var11_11 = var10_10.hasNext()) {
                        var9_9 = (Fragment)var10_10.next();
                        var11_11 = var9_9 instanceof ia_1;
                        if (!var11_11) continue;
                        break block94;
                    }
                    var10_10 = h40_0.a;
                    var7_7 = (int)h40_0.f2();
                    if (var7_7 == 0) ** GOTO lbl-1000
                    var7_7 = var4_4.A0;
                    var9_9 = var7_7;
                    if (var7_7 <= 0) {
                        var11_11 = false;
                        var9_9 = null;
                    }
                    if (var9_9 != null) {
                        var7_7 = var9_9.intValue();
                        var8_8 = var7_7;
                    } else {
                        if (var18_18 != null && (var10_10 = var18_18.getReturnFee()) != null) {
                            var10_10 = je3_2.e((String)var10_10);
                        } else {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        }
                        if (var10_10 != null) {
                            var8_8 = var32_32 = var10_10.floatValue();
                        } else lbl-1000:
                        // 2 sources

                        {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var10_10 = null;
                        }
                    }
                    var9_9 = ia_1.Companion;
                    var12_12 = (Pair)var33_33.d();
                    if (var12_12 != null) {
                        var12_12 = (String)var12_12.a;
                    } else {
                        var49_45 = 0;
                        var50_46 = 0.0f;
                        var12_12 = null;
                    }
                    var33_33 = (Pair)var33_33.d();
                    if (var33_33 != null) {
                        var33_33 = (LinkedHashMap)var33_33.b;
                    } else {
                        var44_42 = 0;
                        var43_41 = 0.0f;
                        var33_33 = null;
                    }
                    var13_13 = (Pair)var6_6.d();
                    if (var13_13 != null) {
                        var13_13 = (String)var13_13.a;
                    } else {
                        var14_14 = false;
                        var13_13 = null;
                    }
                    var6_6 = (Pair)var6_6.d();
                    if (var6_6 != null) {
                        var6_6 = (LinkedHashMap)var6_6.b;
                    } else {
                        var54_49 = 0.0f;
                        var6_6 = null;
                    }
                    var9_9.getClass();
                    var9_9 = var21_21;
                    Intrinsics.checkNotNullParameter(var4_4, (String)var21_21);
                    var9_9 = new ia_1();
                    var9_9.g = var4_4;
                    var9_9.h = var5_5;
                    var16_16 = 1065353216;
                    var55_50 = 1.0f;
                    if (var12_12 != null && (var56_51 = var12_12.length()) != 0 && (var56_51 = (int)((cfr_temp_12 = (var57_52 = Float.parseFloat((String)var12_12)) - var55_50) == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1))) > 0) {
                        var9_9.k = var12_12;
                    }
                    if (var13_13 != null && (var49_45 = var13_13.length()) != 0 && (var49_45 = (int)((cfr_temp_13 = (var50_46 = Float.parseFloat((String)var13_13)) - var55_50) == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1))) > 0) {
                        var9_9.l = var13_13;
                    }
                    if (var33_33 != null) {
                        var9_9.i = var33_33;
                    }
                    if (var6_6 != null) {
                        var9_9.j = var6_6;
                    }
                    var9_9.o = var44_42 = (int)var8_8;
                    var33_33 = var15_15.getSupportFragmentManager();
                    var54_49 = 0.0f;
                    var6_6 = null;
                    var9_9.show((FragmentManager)var33_33, null);
                    break block94;
                }
                var4_4.x0 = var10_10;
                de2_0.G(var0, var1_1);
                break block94;
            }
            if (var14_14) {
                var33_33 = "exchange";
                de2_0.F(var4_4, var17_17, var5_5, (String)var33_33);
                var6_6 = Boolean.FALSE;
                var10_10 = var37_37;
                var37_37.setValue(var6_6);
                var4_4.x0 = var33_33;
                de2_0.G(var0, var1_1);
            }
        }
        if ((var33_33 = var38_38.X()) != null) {
            var7_7 = var3_3;
            var33_33.d = var6_6 = new ue2_1(var4_4, var5_5, var3_3);
        }
    }

    public static final void F(qz1_2 qz1_22, CartOrder cartOrder, SelectedOrderItem selectedOrderItem, String string2) {
        Bundle bundle = new Bundle();
        Object object = qz1_22;
        object = qz1_22.g;
        Object object2 = "product_id";
        bundle.putString((String)object2, (String)object);
        object = cartOrder != null ? cartOrder.getCode() : null;
        object2 = "order_id";
        bundle.putString((String)object2, (String)object);
        if (selectedOrderItem == null || (object = selectedOrderItem.getOrderStatus()) == null) {
            object = "";
        }
        bundle.putString("order_status", (String)object);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
        String string4 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        object = object2;
        object2 = string4;
        string4 = "return/exchange click";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, string4, string2, string3, "order item details screen", null, string5, bundle, string6, false, null, 1568, null);
    }

    public static final void G(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        boolean bl2;
        Object object;
        String string2 = null;
        if (selectedOrderItem != null) {
            object = selectedOrderItem.getConsignment();
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = (CartOrder)qz1_22.l.getValue();
        object2 = object2 != null ? ((CartOrder)object2).getCode() : null;
        if (object != null) {
            string2 = ((Consignment)object).getCode();
        }
        object = qz1_22.x;
        ((h83_0)object).setValue(string2);
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNull(string2);
            qz1_22.v((String)object2, string2, selectedOrderItem);
        }
    }

    public static final void H(qz1_2 qz1_22, b30_0 object, int n3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1061970845;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        Object object3 = ((j30_0)object).j((H30)object2);
        int n7 = object3 instanceof Activity;
        Fragment fragment = null;
        if (n7 != 0) {
            object3 = (Activity)object3;
        } else {
            bl2 = false;
            object3 = null;
        }
        Boolean bl3 = (Boolean)qz1_22.v.getValue();
        n7 = bl3.booleanValue();
        if (n7 != 0) {
            bl3 = Boolean.FALSE;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = qz1_22.v;
            parcelableSnapshotMutableState.setValue(bl3);
            bl2 = object3 instanceof BaseActivity;
            if (bl2) {
                bl2 = (object2 = ((j30_0)object).j((H30)object2)) instanceof Activity;
                if (bl2) {
                    object2 = (Activity)object2;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = ((AjioHomeActivity)object2).T0;
                if (object2 != null) {
                    object2 = ((Fragment)object2).getChildFragmentManager();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object3 = "OrderSummaryFragment";
                    fragment = ((FragmentManager)object2).E((String)object3);
                }
                Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                fragment = (bg2_1)fragment;
                object2 = qz1_22.u();
                object3 = fragment.getActivity();
                if (object3 != null && (n7 = object3.isFinishing()) == 0 && object2 != null && (n7 = ((String)object2).length()) != 0) {
                    n7 = 9;
                    at2_1.k((Context)object3, n7, (String)object2);
                }
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new ae2_2(qz1_22, n3);
        }
    }

    public static final void I(OrderCancellationRefundConfig orderCancellationRefundConfig, b30_0 b30_02, int n3) {
        int n4;
        OrderCancellationRefundConfig orderCancellationRefundConfig2 = orderCancellationRefundConfig;
        int n7 = -1011698784;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = orderCancellationRefundConfig != null ? orderCancellationRefundConfig.getBusinessCancellationReason() : null;
        if (object != null) {
            ((j30_0)object2).K(2066722859);
            n4 = ((String)object).length();
            if (n4 > 0) {
                LP1 lP1 = LP1$a.b;
                long l2 = xx_1.y;
                fG2$a fG2$a = fg2_1.a;
                lP1 = a.b(lP1, l2, fG2$a);
                float f5 = 16;
                lP1 = h.e(lP1, f5);
                f5 = 1.0f;
                lP1 = j.c(lP1, f5);
                int n8 = 48;
                l2 = 0L;
                long l3 = 0L;
                long l4 = 0L;
                long l7 = 0L;
                int n10 = 131068;
                Ll3.b((String)object, lP1, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n8, 0, n10);
            }
            object = null;
            ((j30_0)object2).T(false);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n4 = n3;
            ((CF2)object2).d = object = new xd2_2(orderCancellationRefundConfig2, n3);
        }
    }

    public static final void J(ReturnRequest returnRequest, b30_0 b30_02, int n3) {
        String string2;
        float f5;
        int n4;
        Object object;
        Object object2;
        ReturnRequest returnRequest2 = returnRequest;
        int n7 = 806453748;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n7);
        int n8 = 0;
        object3 = null;
        if (returnRequest != null) {
            object2 = returnRequest.getExchangeReturnRTO();
            object = Boolean.TRUE;
            n4 = Intrinsics.areEqual(object2, object);
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        if (n4 != 0 && (string2 = returnRequest.getRefundInfoMesage()) != null) {
            Object object5 = LP1$a.b;
            n4 = 16;
            f5 = n4;
            object2 = h.e((LP1)object5, f5);
            object = zp.c;
            Gx$a gx$a = Nc$a.m;
            object = oZ.a((zp$l)object, gx$a, (b30_0)object4, 0);
            int n10 = ((j30_0)object4).P;
            Object object6 = ((j30_0)object4).P();
            object2 = a30_0.c((b30_0)object4, (LP1)object2);
            N20.W.getClass();
            Serializable serializable = N20$a.b;
            mp mp2 = ((j30_0)object4).a;
            boolean bl2 = mp2 instanceof mp;
            if (bl2) {
                long l2;
                ((j30_0)object4).A();
                bl2 = ((j30_0)object4).O;
                if (bl2) {
                    ((j30_0)object4).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object4).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object4, object, (Function2)((Object)serializable));
                object = N20$a.d;
                Ow3.a((b30_0)object4, object6, (Function2)object);
                object = N20$a.f;
                boolean bl3 = ((j30_0)object4).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = ((j30_0)object4).v(), serializable = Integer.valueOf(n10)))) {
                    rk_0.a(n10, (j30_0)object4, n10, (N20$a$a)object);
                }
                object = N20$a.c;
                Ow3.a((b30_0)object4, object2, (Function2)object);
                object = hv3_0.K(R$string.refund_details);
                n4 = 14;
                long l3 = Em3.f(n4);
                Object object7 = tv0_0.o;
                long l4 = xx_1.e;
                float f6 = 0.0f;
                float f7 = 12;
                object2 = h.h((LP1)object5, f6, f6, f6, f7);
                long l7 = l2 = 0L;
                int n14 = 12;
                object3 = object;
                float f8 = f6;
                LP1$a lP1$a = object5;
                object5 = object7;
                object7 = object4;
                Ll3.b((String)object, (LP1)object2, l4, l3, null, (tv0_0)object5, null, 0L, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object4, 200112, 0, 131024);
                l3 = Em3.f(n14);
                object5 = tv0_0.m;
                float f11 = 8;
                f6 = f7;
                f5 = f8;
                object3 = lP1$a;
                object2 = h.h(lP1$a, f8, f11, f8, f7);
                int n15 = 200112;
                bl2 = false;
                mp2 = null;
                long l8 = 0L;
                l7 = 0L;
                int n16 = 131024;
                object3 = string2;
                Ll3.b(string2, (LP1)object2, l4, l3, null, (tv0_0)object5, null, l8, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object4, n15, 0, n16);
                ((j30_0)object4).T(true);
                n8 = 6;
                f5 = f11;
                vb2.h(f11, (b30_0)object4, n8);
            } else {
                s20.a();
                throw null;
            }
        }
        if ((object4 = ((j30_0)object4).X()) != null) {
            n4 = n3;
            ((CF2)object4).d = object3 = new td2_1(returnRequest2, n3);
        }
    }

    public static final void K(ReturnRequest returnRequest, b30_0 b30_02, int n3) {
        int n4;
        ReturnRequest returnRequest2 = returnRequest;
        Intrinsics.checkNotNullParameter(returnRequest, "returnRequest");
        int n7 = -1042814603;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = returnRequest.getExchangeReturnRTO();
        Object object3 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            object = returnRequest.getRtoExchangeCanMsg();
            n4 = -2096596074;
            ((j30_0)object2).K(n4);
            if (object == null) {
                bl2 = false;
                object = null;
            } else {
                ((j30_0)object2).K(-1353555066);
                n4 = ((String)object).length();
                if (n4 > 0) {
                    n4 = 12;
                    long l2 = Em3.f(n4);
                    object3 = LP1$a.b;
                    long l3 = xx_1.y;
                    fG2$a fG2$a = fg2_1.a;
                    object3 = a.b((LP1)object3, l3, fG2$a);
                    float f5 = 16;
                    object3 = h.e((LP1)object3, f5);
                    f5 = 1.0f;
                    object3 = j.c((LP1)object3, f5);
                    int n8 = 3120;
                    l3 = 0L;
                    long l4 = 0L;
                    long l7 = 0L;
                    int n10 = 131060;
                    Ll3.b((String)object, (LP1)object3, l3, l2, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n8, 0, n10);
                }
                bl2 = false;
                object = null;
                ((j30_0)object2).T(false);
                object3 = Unit.a;
            }
            ((j30_0)object2).T(false);
        }
        if ((object2 = ((j30_0)object2).X()) != null) {
            n4 = n3;
            ((CF2)object2).d = object = new je2_1(returnRequest2, n3);
        }
    }

    public static final void L(boolean bl2, String string2, b30_0 object, int n3) {
        block14: {
            Object object2;
            block13: {
                float f5;
                int n4;
                int n7;
                int n8;
                float f6;
                block12: {
                    f6 = -2.2291646E-14f;
                    object = object.g(-1463236343);
                    n8 = n3 & 0xE;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 4;
                            f6 = 5.6E-45f;
                        } else {
                            n8 = 2;
                            f6 = 2.8E-45f;
                        }
                        n8 |= n3;
                    } else {
                        n8 = n3;
                    }
                    n7 = n3 & 0x70;
                    n4 = 16;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object).J(string2) ? 1 : 0);
                        if (n7 != 0) {
                            n7 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n7 = 16;
                            f5 = 2.2E-44f;
                        }
                        n8 |= n7;
                    }
                    n7 = 18;
                    f5 = 2.5E-44f;
                    if ((n8 &= 0x5B) != n7 || (n8 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object).D();
                    break block13;
                }
                if (!bl2 || string2 == null) break block14;
                object2 = LP1$a.b;
                f5 = n4;
                LP1 lP1 = h.e((LP1)object2, f5);
                object2 = new De2$I(string2);
                u10 u102 = v10.c(127942751, (fx0_2)object2, (b30_0)object);
                n4 = 0;
                int n10 = 3078;
                int n14 = 6;
                OA.a(lP1, null, false, u102, (b30_0)object, n10, n14);
                n8 = 8;
                f6 = n8;
                n7 = 6;
                f5 = 8.4E-45f;
                vb2.h(f6, (b30_0)object, n7);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new rd2_1(bl2, string2, n3);
            }
            return;
        }
        if ((object = ((j30_0)object).X()) != null) {
            qd2_1 qd2_12 = new qd2_1(bl2, string2, n3);
            ((CF2)object).d = qd2_12;
        }
    }

    public static final void M(OrderCancellationRefundConfig orderCancellationRefundConfig, b30_0 b30_02, int n3) {
        Object object;
        int n4 = 1512486561;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        object2 = orderCancellationRefundConfig.getWaitingForRefundInfo();
        if (object2 != null) {
            object = LP1$a.b;
            long l2 = xx_1.x;
            fG2$a fG2$a = fg2_1.a;
            object = a.b((LP1)object, l2, fG2$a);
            float f5 = 16;
            object = h.e((LP1)object, f5);
            f5 = 1.0f;
            object = j.c((LP1)object, f5);
            int n7 = 48;
            l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n8 = 131068;
            Ll3.b((String)object2, (LP1)object, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n7, 0, n8);
        }
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            object = orderCancellationRefundConfig;
            ((CF2)object3).d = object2 = new pd2_1(orderCancellationRefundConfig, n3);
        }
    }

    public static final void N(String string2, Activity activity, CartEntry cartEntry, b30_0 b30_02, int n3) {
        int n4;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        Object object5;
        int n8;
        int n10;
        Object object6;
        Object object7 = string2;
        Object object8 = activity;
        Object object9 = cartEntry;
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(cartEntry, "cartEntry");
        int n14 = -1659934797;
        Object object10 = b30_02;
        Object object11 = b30_02.g(n14);
        object10 = "refund of";
        int n15 = 0;
        Object object12 = null;
        int n16 = StringsKt.F(string2, (CharSequence)object10, false);
        int n17 = 1;
        float f5 = Float.MIN_VALUE;
        int n18 = 12;
        float f6 = 1.7E-44f;
        if (n16 != 0) {
            object10 = cartEntry.getConvenienceFee();
            if (object10 != null && (object10 = ((ConvenienceFeePriceSplitUp)object10).getPriorityDelivery()) != null) {
                float f7 = ((ConvenienceFeePriceSplitUp$AmountData)object10).getNetAmount();
                double d2 = f7;
                object10 = d2;
            } else {
                n16 = 0;
                float f8 = 0.0f;
                object10 = null;
            }
            object6 = new StringBuilder("refund of \u20b9");
            ((StringBuilder)object6).append(object10);
            object10 = ((StringBuilder)object6).toString();
            n10 = StringsKt.O((CharSequence)object7, "refund", 0, false, 6);
            n8 = StringsKt.K((CharSequence)object10) + n10;
            object6 = ((String)object7).substring(0, n10);
            object5 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
            n7 = string2.length();
            object4 = ((String)object7).substring(n8 += n17, n7);
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object5 = new Sl$a();
            long l2 = Em3.f(n18);
            object3 = y20_0.a;
            object2 = tv0_0.m;
            long l3 = xx_1.e;
            long l4 = 0L;
            long l7 = 0L;
            char c2 = (char)-40;
            long l8 = l3;
            Object object13 = object2;
            object = new S93(l3, l2, (tv0_0)object2, null, null, (RU0)object3, null, l4, null, null, null, l7, null, null, c2);
            n4 = ((Sl$a)object5).g((S93)object);
            object6 = kk2_2.b((String)object6);
            ((Sl$a)object5).b((Sl)object6);
            object6 = Unit.a;
            long l12 = Em3.f(n18);
            Object object14 = tv0_0.o;
            object13 = object;
            l7 = 0L;
            c2 = '\u0000';
            long l14 = 0L;
            char c3 = (char)-40;
            long l15 = l3;
            object = new S93(l3, l12, (tv0_0)object14, null, null, (RU0)object3, null, l7, null, null, null, l14, null, null, c3);
            n4 = ((Sl$a)object5).g((S93)object);
            try {
                ((Sl$a)object5).c((String)object10);
                ((Sl$a)object5).e(n4);
            }
            catch (Throwable throwable) {
                object8 = throwable;
                ((Sl$a)object5).e(n4);
                throw throwable;
            }
            l12 = Em3.f(n18);
            object13 = object10;
            l7 = 0L;
            c2 = '\u0000';
            l14 = 0L;
            c3 = (char)-40;
            object14 = object2;
            object10 = new S93(l3, l12, (tv0_0)object2, null, null, (RU0)object3, null, l7, null, null, null, l14, null, null, c3);
            n16 = ((Sl$a)object5).g((S93)object10);
            try {
                ((Sl$a)object5).c((String)object4);
                ((Sl$a)object5).e(n16);
                object10 = ((Sl$a)object5).h();
            }
            catch (Throwable throwable) {
                object8 = throwable;
                ((Sl$a)object5).e(n16);
                throw throwable;
            }
            finally {
                ((Sl$a)object5).e(n4);
            }
        }
        object10 = new Sl$a();
        long l16 = Em3.f(n18);
        object = y20_0.a;
        Object object15 = tv0_0.m;
        long l17 = xx_1.e;
        long l18 = 0L;
        long l19 = 0L;
        char c5 = (char)-40;
        object6 = new S93(l17, l16, (tv0_0)object15, null, null, (RU0)object, null, l18, null, null, null, l19, null, null, c5);
        n10 = ((Sl$a)object10).g((S93)object6);
        object4 = kk2_2.b(string2);
        object5 = new StringBuilder();
        ((StringBuilder)object5).append(object4);
        object4 = " ";
        ((StringBuilder)object5).append((String)object4);
        object4 = ((StringBuilder)object5).toString();
        ((Sl$a)object10).c((String)object4);
        object4 = Unit.a;
        object6 = "Go to Ajio Cash";
        ((Sl$a)object10).f((String)object6, (String)object6);
        object6 = cartEntry.getPriorityDeliveryFeeStatus();
        if (object6 != null && (n10 = (int)(Intrinsics.areEqual(object6 = cartEntry.getPriorityDeliveryFeeStatus(), object4 = "REFUNDED") ? 1 : 0)) != 0) {
            long l20 = Em3.f(n18);
            tv0_0 tv0_02 = tv0_0.o;
            long l21 = xx_1.d0;
            object15 = object6;
            l19 = 0L;
            c5 = '\u0000';
            long l22 = 0L;
            char c6 = (char)-40;
            object6 = new S93(l21, l20, tv0_02, null, null, (RU0)object, null, l19, null, null, null, l22, null, null, c6);
            n4 = ((Sl$a)object10).g((S93)object6);
            try {
                n10 = R$string.go_to_ajio_cash;
                object6 = hv3_0.K(n10);
                ((Sl$a)object10).c((String)object6);
            }
            finally {
                ((Sl$a)object10).e(n4);
            }
        }
        ((Sl$a)object10).d();
        object10 = ((Sl$a)object10).h();
        object = LP1$a.b;
        f6 = n18;
        n10 = 0;
        object6 = null;
        n8 = 2;
        Object object16 = h.g((LP1)object, f6, 0.0f, n8);
        object4 = Nc$a.a;
        object5 = HA.e((Nc)object4, false);
        n7 = ((j30_0)object11).P;
        object2 = ((j30_0)object11).P();
        object16 = a30_0.c((b30_0)object11, (LP1)object16);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object11).a;
        n15 = mp2 instanceof mp;
        if (n15 != 0) {
            Integer n19;
            ((j30_0)object11).A();
            n15 = ((j30_0)object11).O;
            if (n15 != 0) {
                ((j30_0)object11).C(xp1$a);
            } else {
                ((j30_0)object11).n();
            }
            object12 = N20$a.e;
            Ow3.a((b30_0)object11, object5, (Function2)object12);
            object5 = N20$a.d;
            Ow3.a((b30_0)object11, object2, (Function2)object5);
            object2 = N20$a.f;
            n10 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object11).v(), n19 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                rk_0.a(n7, (j30_0)object11, n7, (N20$a$a)object2);
            }
            object6 = N20$a.c;
            Ow3.a((b30_0)object11, object16, (Function2)object6);
            n18 = 30;
            f6 = -((float)n18);
            n7 = 1;
            n19 = null;
            object16 = g.d((LP1)object, 0.0f, f6, n7);
            n17 = 1065353216;
            object16 = j.c((LP1)object16, 1.0f);
            f5 = n7;
            long l23 = xx_1.O;
            object7 = oz_0.a(l23, f5);
            object8 = SP2.a(4);
            object3 = ((nz)object7).b;
            float f11 = ((nz)object7).a;
            object7 = gz.b((LP1)object16, f11, (ZD)object3, (i13)object8);
            long l24 = xx_1.N;
            object16 = fg2_1.a;
            object7 = a.b((LP1)object7, l24, (i13)object16);
            boolean bl2 = false;
            float f12 = 0.0f;
            object8 = HA.e((Nc)object4, false);
            int n20 = ((j30_0)object11).P;
            object16 = ((j30_0)object11).P();
            object7 = a30_0.c((b30_0)object11, (LP1)object7);
            n8 = mp2 instanceof mp;
            if (n8 != 0) {
                ((j30_0)object11).A();
                n8 = (int)(((j30_0)object11).O ? 1 : 0);
                if (n8 != 0) {
                    ((j30_0)object11).C(xp1$a);
                } else {
                    ((j30_0)object11).n();
                }
                Ow3.a((b30_0)object11, object8, (Function2)object12);
                Ow3.a((b30_0)object11, object16, (Function2)object5);
                bl2 = ((j30_0)object11).O;
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = ((j30_0)object11).v(), object12 = Integer.valueOf(n20)))) {
                    rk_0.a(n20, (j30_0)object11, n20, (N20$a$a)object2);
                }
                Ow3.a((b30_0)object11, object7, (Function2)object6);
                int n21 = 8;
                f11 = n21;
                f12 = 10;
                object12 = h.h((LP1)object, f11, f12, f11, f11);
                object7 = activity;
                object3 = new xe2_0((Sl)object10, activity);
                n8 = 0;
                object4 = null;
                object5 = null;
                n4 = 0;
                object = null;
                n18 = 0;
                f6 = 0.0f;
                object16 = null;
                n10 = 0;
                object6 = null;
                xp1$a = null;
                int n22 = 124;
                object2 = object11;
                IV.a((Sl)object10, (LP1)object12, null, false, 0, 0, null, (Function1)object3, (b30_0)object11, 0, n22);
                bl2 = true;
                f12 = Float.MIN_VALUE;
                object8 = fn0_2.a((j30_0)object11, bl2, bl2);
                if (object8 != null) {
                    object11 = string2;
                    object10 = cartEntry;
                    n15 = n3;
                    object8.d = object9 = new ye2_1(string2, activity, cartEntry, n3);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
        finally {
            ((Sl$a)object10).e(n10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void O(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        int n4;
        qz1_2 qz1_23 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = 809898852;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = (Boolean)qz1_22.t.getValue();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = Boolean.FALSE;
            Object object3 = qz1_22.t;
            ((h83_0)object3).setValue(object);
            object = AndroidCompositionLocals_androidKt.b;
            object = ((j30_0)object2).j((H30)object);
            n4 = object instanceof Activity;
            String string2 = null;
            if (n4 != 0) {
                object = (Activity)object;
            } else {
                bl2 = false;
                object = null;
            }
            if (selectedOrderItem2 != null) {
                object3 = selectedOrderItem.getCartEntry();
            } else {
                n4 = 0;
                object3 = null;
            }
            Object object4 = object3 != null ? ((CartEntry)object3).getProduct() : null;
            if (object4 != null) {
                int n8;
                Object object5 = ((Product)object4).getBaseProduct();
                String string3 = "";
                object4 = object5 != null && (n8 = ((String)object5).length()) != 0 ? ((Product)object4).getBaseProduct() : ((object5 = ((Product)object4).getCode()) != null && (n8 = ((String)object5).length()) != 0 ? ((Product)object4).getCode() : string3);
                object5 = ((CartEntry)object3).getOrderId();
                if (object5 != null && (n8 = ((String)object5).length()) != 0) {
                    object5 = ((CartEntry)object3).getOrderId();
                    Intrinsics.checkNotNull(object5);
                } else {
                    object5 = string3;
                }
                object3 = no_2.b((CartEntry)object3);
                boolean bl3 = object instanceof BaseActivity;
                if (bl3) {
                    Object object6;
                    object = ((AjioHomeActivity)object).T0;
                    if (object != null) {
                        object = ((Fragment)object).getChildFragmentManager();
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) {
                        object6 = "OrderSummaryFragment";
                        object = ((FragmentManager)object).E((String)object6);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    object6 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment";
                    Intrinsics.checkNotNull(object, (String)object6);
                    object = (bg2_1)object;
                    if (selectedOrderItem2 != null && (object6 = selectedOrderItem.getConsignment()) != null) {
                        object6 = ((Consignment)object6).getCarrierUrl();
                    } else {
                        bl3 = false;
                        object6 = null;
                    }
                    object.getClass();
                    Bundle bundle = new Bundle();
                    Object object7 = "order_id";
                    bundle.putString((String)object7, (String)object5);
                    object5 = "product_id";
                    bundle.putString((String)object5, (String)object4);
                    object4 = "order_status";
                    bundle.putString((String)object4, (String)object3);
                    object3 = AnalyticsManager.Companion.getInstance();
                    object4 = object3 != null && (object4 = ((AnalyticsManager)object3).getNewEEcommerceEventsRevamp()) != null ? ((NewEEcommerceEventsRevamp)object4).getPrevScreen() : null;
                    if (object3 != null && (object5 = ((AnalyticsManager)object3).getNewEEcommerceEventsRevamp()) != null) {
                        string2 = ((NewEEcommerceEventsRevamp)object5).getPrevScreenType();
                    }
                    if (object3 != null && (object7 = ((AnalyticsManager)object3).getNewCustomEventsRevamp()) != null) {
                        if ((object3 = ((AnalyticsManager)object3).getNewCustomEventsRevamp()) == null || (object3 = ((NewCustomEventsRevamp)object3).getEC_ORDER_DETAIL_INTERACTION()) == null) {
                            object3 = "orders detail interactions";
                        }
                        Object object8 = object3;
                        Object object9 = object4 == null ? string3 : object4;
                        String string4 = string2 == null ? string3 : string2;
                        int n10 = 1536;
                        String string5 = "track";
                        String string6 = "";
                        String string7 = "orders_detail_interaction";
                        object3 = "consolidated order details screen";
                        String string8 = "order management screen";
                        string2 = bundle;
                        Object object10 = object3;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object8, string5, string6, string7, (String)object3, string8, (String)object9, (Bundle)string2, string4, false, null, n10, null);
                    }
                    if ((object = ((Fragment)object).getActivity()) != null && (n4 = (int)(object.isFinishing() ? 1 : 0)) == 0 && object6 != null) {
                        n4 = 18;
                        at2_1.k((Context)object, n4, (String)object6);
                    }
                }
            }
        }
        if ((object2 = ((j30_0)object2).X()) != null) {
            n4 = n3;
            ((CF2)object2).d = object = new zd2_1(qz1_23, selectedOrderItem2, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void P(qz1_2 var0, yT1 var1_1, SelectedOrderItem var2_2, b30_0 var3_3, int var4_4) {
        block46: {
            block43: {
                block42: {
                    block45: {
                        block44: {
                            var5_5 = var0;
                            var6_6 = var1_1;
                            var7_7 = var2_2;
                            Intrinsics.checkNotNullParameter(var0, "viewModel");
                            Intrinsics.checkNotNullParameter(var1_1, "navController");
                            var8_8 = var3_3;
                            var9_9 = var3_3.g(-1402914341);
                            var10_10 = (CharSequence)var0.i.getValue();
                            var11_11 = TextUtils.isEmpty((CharSequence)var10_10);
                            var12_12 = var0.f;
                            var9_9.K(246440609);
                            var13_13 = qz1_2.C(var2_2);
                            var14_14 = 0;
                            var15_15 = null;
                            if (var13_13 != 0) {
                                if (var2_2 != null && (var16_16 = var2_2.getConsignment()) != null) {
                                    var16_16 = var16_16.getCarrier();
                                } else {
                                    var13_13 = 0;
                                    var16_16 = null;
                                }
                                if (var7_7 != null && (var17_17 = var2_2.getConsignment()) != null) {
                                    var17_17 = var17_17.getTrackingID();
                                } else {
                                    var18_18 = false;
                                    var17_17 = null;
                                }
                                np3.a((String)var16_16, (String)var17_17, var9_9, 0);
                            }
                            var9_9.T(false);
                            var9_9.K(246446044);
                            var13_13 = qz1_2.C(var2_2);
                            var19_19 = 72;
                            if (var13_13 != 0 && (var11_11 != 0 || var12_12 != 0)) {
                                Lp3.a(var5_5, var7_7, var9_9, var19_19);
                            }
                            var9_9.T(false);
                            var16_16 = (CartOrder)var5_5.l.getValue();
                            if (var7_7 != null) {
                                var17_17 = var2_2.getConsignment();
                            } else {
                                var18_18 = false;
                                var17_17 = null;
                            }
                            var20_20 = "toLowerCase(...)";
                            var21_21 = "ENGLISH";
                            var22_22 = "getShipmentStatus(...)";
                            var23_23 = 1;
                            var24_24 = "CANCELLATION REQUESTED";
                            var25_25 = "CANCELLATION_REQUESTED";
                            var26_26 = "CANCELLED";
                            if (var17_17 == null && (var7_7 != null && (var27_27 = var2_2.getCartEntry()) != null && (var14_14 = (var15_15 = no_2.b(var27_27)).equalsIgnoreCase(var26_26)) == var23_23 || var7_7 != null && (var15_15 = var2_2.getCartEntry()) != null && (var14_14 = (var15_15 = no_2.b((CartEntry)var15_15)).equalsIgnoreCase((String)var25_25)) == var23_23 || var7_7 != null && (var15_15 = var2_2.getCartEntry()) != null && (var14_14 = (var15_15 = no_2.b((CartEntry)var15_15)).equalsIgnoreCase((String)var24_24)) == var23_23)) lbl-1000:
                            // 6 sources

                            {
                                while (true) {
                                    var13_13 = 0;
                                    var16_16 = null;
                                    break block42;
                                    break;
                                }
                            }
                            if (var17_17 != null || !(var7_7 != null && (var15_15 = var2_2.getCartEntry()) != null && (var14_14 = (var15_15 = no_2.b((CartEntry)var15_15)).equalsIgnoreCase(var26_26)) == 0 || var7_7 != null && (var15_15 = var2_2.getCartEntry()) != null && (var14_14 = (var15_15 = no_2.b((CartEntry)var15_15)).equalsIgnoreCase((String)var25_25)) == 0) && (var7_7 == null || (var15_15 = var2_2.getCartEntry()) == null || (var28_28 = (var15_15 = no_2.b((CartEntry)var15_15)).equalsIgnoreCase((String)var24_24)))) break block44;
                            if (var16_16 == null || !(var18_18 = (boolean)var16_16.isCancelable()) || (var13_13 = (int)var16_16.isExchangeOrder()) != 0) ** GOTO lbl-1000
lbl54:
                            // 2 sources

                            while (true) {
                                var13_13 = 1;
                                break block42;
                                break;
                            }
                        }
                        if (var17_17 == null) ** GOTO lbl-1000
                        var17_17 = var17_17.getShipmentStatus();
                        Intrinsics.checkNotNullExpressionValue(var17_17, var22_22);
                        var24_24 = Locale.ENGLISH;
                        var28_28 = kotlin.text.b.k((CharSequence)(var17_17 = zn0_1.a((Locale)var24_24, var21_21, (String)var17_17, (Locale)var24_24, var20_20))) ^ var23_23;
                        if (!var28_28) ** GOTO lbl-1000
                        var24_24 = "packed";
                        var28_28 = Intrinsics.areEqual(var17_17, var24_24);
                        if (var28_28 || (var28_28 = Intrinsics.areEqual(var17_17, var24_24 = "shipped")) || (var28_28 = Intrinsics.areEqual(var17_17, var24_24 = "out for delivery")) || (var28_28 = Intrinsics.areEqual(var17_17, var24_24 = "delivery delayed"))) break block45;
                        var24_24 = "arriving";
                        var14_14 = 0;
                        var15_15 = null;
                        var28_28 = kotlin.text.b.s((String)var17_17, (String)var24_24, false);
                        if (!var28_28 && !(var18_18 = (boolean)Intrinsics.areEqual(var17_17, var24_24 = "delivery attempted"))) ** GOTO lbl-1000
                    }
                    if (var16_16 != null && (var13_13 = (int)var16_16.isExchangeOrder()) == 0) ** break;
                    ** while (true)
                    ** while (true)
                }
                var18_18 = 246453178 != 0;
                var9_9.K((int)var18_18);
                if (var13_13 == 0 || var11_11 == 0 && var12_12 == 0) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_13 = 72;
                sp3_0.a(var5_5, var7_7, var9_9, var13_13);
                ** while (true)
                var13_13 = 0;
                var16_16 = null;
                var9_9.T(false);
                var15_15 = "delivered";
                if (var7_7 != null && (var16_16 = var2_2.getConsignment()) != null) {
                    var17_17 = var2_2.isReturnableExchangeable();
                    Intrinsics.checkNotNull(var17_17);
                    var18_18 = var17_17.booleanValue();
                    if (var18_18) {
                        var17_17 = var2_2.isReturnableExchangeable();
                        Intrinsics.checkNotNull(var17_17);
                        var18_18 = var17_17.booleanValue();
                        if (var18_18) {
                            var16_16 = var2_2.getCartEntry();
                            if (var16_16 != null && (var13_13 = (int)var16_16.isReturnable()) == var23_23 || (var16_16 = var2_2.getCartEntry()) != null && (var13_13 = (int)var16_16.isExchangeable()) == var23_23) {
                                while (true) {
                                    var13_13 = 1;
                                    break block43;
                                    break;
                                }
                            }
                        } else {
                            if (var18_18 = (boolean)Intrinsics.areEqual(var17_17 = qz1_2.D(var2_2), var24_24 = Boolean.TRUE)) ** continue;
                            var18_18 = qz1_2.B((Consignment)var16_16);
                            if (!var18_18) {
                                var16_16 = var16_16.getShipmentStatus();
                                Intrinsics.checkNotNullExpressionValue(var16_16, var22_22);
                                var17_17 = Locale.ENGLISH;
                                var16_16 = zn0_1.a((Locale)var17_17, var21_21, (String)var16_16, (Locale)var17_17, var20_20);
                                Intrinsics.areEqual(var16_16, var15_15);
                            }
                        }
                    }
                }
                var13_13 = 0;
                var16_16 = null;
            }
            var18_18 = qz1_2.f(var2_2);
            var28_28 = qz1_2.g(var2_2);
            var9_9.K(246466301);
            var25_25 = h40_0.a;
            var29_29 = var25_25.j2();
            if (var29_29 != 0) break block46;
            var29_29 = h40_0.l1();
            if (var29_29 != 0 && var13_13 != 0 && (var11_11 != 0 || var12_12 != 0)) {
                var9_9.K(-949326584);
                var13_13 = (int)h40_0.l1();
                if (var13_13 != 0 && var18_18 && !var28_28 && (var11_11 != 0 || var12_12 != 0)) {
                    var9_9.K(-949191672);
                    var29_29 = 3528;
                    var13_13 = 0;
                    var16_16 = null;
                    var18_18 = true;
                    var10_10 = var0;
                    var8_8 = var2_2;
                    var24_24 = var9_9;
                    var19_19 = 1;
                    var23_23 = var29_29;
                    ap3_0.a(var0, var2_2, false, var18_18, var9_9, var29_29);
                    var11_11 = 0;
                    var10_10 = null;
                    var9_9.T(false);
lbl141:
                    // 2 sources

                    while (true) {
                        var11_11 = 0;
                        var10_10 = null;
                        break;
                    }
                } else {
                    var19_19 = 1;
                    var13_13 = (int)h40_0.l1();
                    if (var13_13 != 0 && var28_28 && !var18_18 && (var11_11 != 0 || var12_12 != 0)) {
                        var9_9.K(-948918872);
                        var23_23 = 3528;
                        var13_13 = 1;
                        var18_18 = false;
                        var17_17 = null;
                        var10_10 = var0;
                        var8_8 = var2_2;
                        var24_24 = var9_9;
                        ap3_0.a(var0, var2_2, (boolean)var13_13, false, var9_9, var23_23);
                        var11_11 = 0;
                        var10_10 = null;
                        var9_9.T(false);
                        ** continue;
                    }
                    var9_9.K(-948785851);
                    var23_23 = 3528;
                    var13_13 = 1;
                    var18_18 = true;
                    var10_10 = var0;
                    var8_8 = var2_2;
                    var24_24 = var9_9;
                    ap3_0.a(var0, var2_2, (boolean)var13_13, var18_18, var9_9, var23_23);
                    var11_11 = 0;
                    var10_10 = null;
                    var9_9.T(false);
                }
                var9_9.T(false);
            } else {
                var19_19 = 1;
                var18_18 = h40_0.l1();
                if (var18_18 && (var18_18 = (boolean)qz1_2.I(var2_2)) && var11_11 != 0) {
                    var9_9.K(-948441379);
                    Zp3.a(var5_5, var7_7, var9_9, 72);
                    var11_11 = 0;
                    var10_10 = null;
                    var9_9.T(false);
                } else {
                    var9_9.K(-948325005);
                    var18_18 = 246503798 != 0;
                    var9_9.K((int)var18_18);
                    if (var13_13 == 0 || var11_11 == 0 && var12_12 == 0) {
                        var12_12 = 72;
lbl188:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var12_12 = 72;
                    ap3_0.b(var5_5, var7_7, var9_9, var12_12);
                    ** continue;
                    var13_13 = 0;
                    var16_16 = null;
                    var9_9.T(false);
                    var18_18 = qz1_2.I(var2_2);
                    if (var18_18 && var11_11 != 0) {
                        Zp3.a(var5_5, var7_7, var9_9, var12_12);
                    }
                    var9_9.T(false);
                }
            }
            if (var7_7 != null) {
                var10_10 = var2_2.getConsignment();
            } else {
                var11_11 = 0;
                var10_10 = null;
            }
            if (var10_10 == null || (var10_10 = var2_2.getParentConsignmentEntry()) == null) break block46;
            var10_10 = var2_2.getCartEntry();
            if (var10_10 != null) {
                var10_10 = var10_10.getCtaMessage();
            } else {
                var11_11 = 0;
                var10_10 = null;
            }
            if (var10_10 == null || (var11_11 = var10_10.length()) == 0 || ((var10_10 = var2_2.getCartEntry()) == null || (var11_11 = (int)var10_10.isReturnable()) != var19_19) && ((var10_10 = var2_2.getCartEntry()) == null || (var11_11 = (int)var10_10.isExchangeable()) != var19_19)) break block46;
            var10_10 = var0.u();
            var8_8 = var2_2.getConsignment();
            if (var8_8 == null) ** GOTO lbl-1000
            var8_8 = var8_8.getShipmentStatus();
            Intrinsics.checkNotNullExpressionValue(var8_8, var22_22);
            var16_16 = Locale.ENGLISH;
            var8_8 = zn0_1.a((Locale)var16_16, var21_21, (String)var8_8, (Locale)var16_16, var20_20);
            var12_12 = (int)Intrinsics.areEqual(var8_8, var15_15);
            if (var12_12 == 0) ** GOTO lbl-1000
            var8_8 = var2_2.getCartEntry();
            if (var8_8 != null) {
                var8_8 = var8_8.getCtaMessage();
            } else {
                var12_12 = 0;
                var8_8 = null;
            }
            if (var8_8 != null && (var12_12 = var8_8.length()) != 0) {
                var8_8 = var2_2.getCartEntry();
                if (var8_8 != null) {
                    var25_25 = var8_8.getCtaMessage();
                } else {
                    var29_29 = 0;
                    var25_25 = null;
                }
                var16_16 = var25_25;
            } else lbl-1000:
            // 3 sources

            {
                var13_13 = 0;
                var16_16 = null;
            }
            var23_23 = 4160;
            var8_8 = var0;
            var17_17 = var2_2;
            var24_24 = var9_9;
            ro2_0.a((String)var10_10, var0, (String)var16_16, var2_2, var9_9, var23_23);
        }
        var9_9.T(false);
        var11_11 = 72;
        de2_0.D(var5_5, var7_7, var9_9, var11_11);
        de2_0.E(var5_5, var7_7, var9_9, var11_11);
        de2_0.O(var5_5, var7_7, var9_9, var11_11);
        de2_0.R(var5_5, var6_6, var7_7, var9_9, 584);
        var11_11 = 8;
        de2_0.H(var5_5, var9_9, var11_11);
        var10_10 = var9_9.X();
        if (var10_10 != null) {
            var13_13 = var4_4;
            var10_10.d = var8_8 = new qd2_2(var5_5, var6_6, var7_7, var4_4);
        }
    }

    public static final void Q(UserSubRating userSubRating, b30_0 b30_02, int n3) {
        UserSubRating userSubRating2 = userSubRating;
        Intrinsics.checkNotNullParameter(userSubRating, "userSubRating");
        int n4 = -2034588765;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        Object object3 = Nc$a.j;
        LP1$a lP1$a = LP1$a.b;
        Object object4 = j.c(lP1$a, 1.0f);
        float f5 = 8;
        int bl2 = 16;
        float f6 = bl2;
        int n7 = 8;
        object = h.i((LP1)object4, f6, f5, f6, 0.0f, n7);
        Object object5 = iQ2.a(zp.a, (Gx$b)object3, (b30_0)object2, 48);
        int n8 = ((j30_0)object2).P;
        Object object6 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Object object7 = N20$a.b;
        Object object8 = ((j30_0)object2).a;
        boolean bl3 = object8 instanceof mp;
        if (bl3) {
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C((Function0)object7);
            } else {
                ((j30_0)object2).n();
            }
            object7 = N20$a.e;
            Ow3.a((b30_0)object2, object5, (Function2)object7);
            object5 = N20$a.d;
            Ow3.a((b30_0)object2, object6, (Function2)object5);
            object5 = N20$a.f;
            boolean bl4 = ((j30_0)object2).O;
            if (bl4 || !(bl4 = Intrinsics.areEqual(object6 = ((j30_0)object2).v(), object7 = Integer.valueOf(n8)))) {
                rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object5);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object2, object, (Function2)object5);
            object7 = mq2_0.a;
            cp_1.Companion.getClass();
            object = cp$a.e();
            object5 = userSubRating2.title;
            String string2 = "title";
            Intrinsics.checkNotNullExpressionValue(object5, string2);
            object.getClass();
            object = cp_1.C((String)object5);
            Object object9 = tv0_0.m;
            int n10 = 12;
            long l2 = Em3.f(n10);
            long l3 = xx_1.H;
            int n14 = 1058642330;
            float f7 = 0.6f;
            boolean bl5 = true;
            object5 = ((mq2_0)object7).a(lP1$a, f7, bl5);
            object5 = ((mq2_0)object7).b((LP1)object5, (Gx$b)object3);
            int n15 = 200064;
            bl3 = false;
            object8 = null;
            object4 = null;
            long l4 = 0L;
            f6 = 0.0f;
            long l7 = 0L;
            int n16 = 131024;
            LP1$a lP1$a2 = lP1$a;
            Object object10 = object7;
            long l8 = l2;
            Gx$b gx$b = object3;
            object3 = object9;
            object9 = object2;
            Ll3.b((String)object, (LP1)object5, l3, l2, null, (tv0_0)object3, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n15, 0, n16);
            object = userSubRating2.subQuestionText;
            if (object == null) {
                object = "-";
            }
            object3 = tv0_0.o;
            l8 = Em3.f(n10);
            l3 = xx_1.e;
            object8 = lP1$a2;
            object4 = object10;
            boolean bl6 = true;
            object5 = ((mq2_0)object10).a(lP1$a2, 0.4f, bl6);
            object8 = gx$b;
            LP1 lP1 = ((mq2_0)object10).b((LP1)object5, gx$b);
            n14 = 4;
            f7 = n14;
            object5 = h.i(lP1, f7, 0.0f, 0.0f, 0.0f, 14);
            n15 = 200064;
            bl3 = false;
            object8 = null;
            object4 = null;
            l4 = 0L;
            f6 = 0.0f;
            l7 = 0L;
            n16 = 131024;
            object9 = object2;
            Ll3.b((String)object, (LP1)object5, l3, l8, null, (tv0_0)object3, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n15, 0, n16);
            boolean bl7 = true;
            ((j30_0)object2).T(bl7);
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                n14 = n3;
                ((CF2)object2).d = object = new ze2_1(userSubRating2, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void R(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n4 = -1385558729;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = ((j30_0)object).j((H30)object2);
        boolean bl2 = object2 instanceof Activity;
        if (bl2) {
            object2 = (Activity)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object3 = (Boolean)qz1_22.u.getValue();
        bl2 = (Boolean)object3;
        if (bl2) {
            qz1_22.S = bl2 = true;
            object3 = Boolean.FALSE;
            qz1_22.u.setValue(object3);
            object3 = qz1_22.d;
            Object object4 = (String)qz1_22.y.getValue();
            ((h83_0)object3).setValue(object4);
            if (selectedOrderItem != null && (object3 = selectedOrderItem.getCartEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null) {
                object3 = ((Product)object3).getCode();
            } else {
                bl2 = false;
                object3 = null;
            }
            qz1_22.g = object3;
            bl2 = object2 instanceof BaseActivity;
            if (bl2) {
                object2 = ((AjioHomeActivity)object2).T0;
                if (object2 != null) {
                    object2 = ((Fragment)object2).getChildFragmentManager();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object3 = "OrderSummaryFragment";
                    object2 = ((FragmentManager)object2).E((String)object3);
                } else {
                    n4 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                object2 = (bg2_1)object2;
                object2.getClass();
                object3 = nu1_0.a((mu1_1)object2);
                object4 = new cg2_2((bg2_1)object2, null);
                n4 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object4, n4);
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new oe2_1(qz1_22, yT12, selectedOrderItem, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void S(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        float f5;
        int n4;
        qz1_2 qz1_23 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = -664680279;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        int n8 = object instanceof Activity;
        if (n8 != 0) {
            object = (Activity)object;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        Object object3 = object;
        object = LP1$a.b;
        float f6 = 16;
        object = j.c(h.e((LP1)object, f6), 1.0f);
        n8 = 48;
        f6 = n8;
        LP1 lP1 = j.d((LP1)object, f6);
        object = GE.a;
        n4 = R$color.accent_color_10;
        long l2 = oy_0.a((b30_0)object2, n4);
        long l3 = 0L;
        Object object4 = GE.a(l2, l3, (b30_0)object2, 0, 14);
        n4 = 10;
        f5 = n4;
        rp2_0 rp2_02 = SP2.a(f5);
        object = new hd2_1((Activity)object3, qz1_23, selectedOrderItem2);
        Object object5 = a20_0.b;
        int n10 = 348;
        LP1 lP12 = lP1;
        object3 = object4;
        lP1 = null;
        object4 = object5;
        object5 = object2;
        int n14 = 0x30000030;
        ME.a((Function0)object, lP12, false, null, null, rp2_02, null, (ol0)object3, null, (u10)object4, (b30_0)object2, n14, n10);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n8 = n3;
            ((CF2)object2).d = object = new id2_1(qz1_23, selectedOrderItem2, n3);
        }
    }

    public static final void T(qz1_2 qz1_22, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -339502095;
        object = object.g(n4);
        Object object2 = (Map)qz1_22.w.getValue();
        Object object3 = Boolean.TRUE;
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            object3 = bl2;
            Object object4 = object2 = object2.get(object3);
            object4 = (SelectedOrderItem)object2;
            object3 = new md2_2(qz1_22);
            n4 = 1;
            nb_1 nb_12 = new nb_1(qz1_22, n4);
            int n7 = 4608;
            jd2_1.g((md2_2)object3, nb_12, qz1_22, (SelectedOrderItem)object4, (b30_0)object, n7);
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new nd2_2(qz1_22, n3);
        }
    }

    public static final RatingsModel U(qz1_2 qz1_22, Product product, float f5, SelectedOrderItem selectedOrderItem) {
        RatingsModel ratingsModel;
        Object object;
        Object object2 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Parcelable parcelable = null;
        String string2 = product != null ? product.getBrandName() : null;
        String string3 = product != null ? product.getName() : null;
        String string4 = mz3_0.p(product);
        Float f6 = Float.valueOf(f5);
        String string5 = product != null ? product.getCode() : null;
        ArrayList arrayList = ((qz1_2)object2).t(selectedOrderItem2);
        Object object3 = object = ((qz1_2)object2).d.getValue();
        object3 = (String)object;
        Object object4 = product != null ? (object = product.getBrickCategory()) : null;
        object = ((qz1_2)object2).s(selectedOrderItem2);
        Object object5 = object != null ? (object = ((Rating)object).baseProductId) : null;
        object = ((qz1_2)object2).s(selectedOrderItem2);
        Object object6 = object != null && (object = ((Rating)object).questionResponse) != null ? (object = ((QuestionResponse)object).questions) : null;
        object2 = ((qz1_2)object2).s(selectedOrderItem2);
        if (object2 != null) {
            parcelable = ((Rating)object2).review;
        }
        ReviewModel reviewModel = tE2.a(parcelable);
        parcelable = ratingsModel;
        ratingsModel = new RatingsModel(string2, string3, string4, f6, string5, "ORDER_DETAILS", arrayList, (String)object3, (String)object4, (String)object5, (ArrayList)object6, null, reviewModel, null, 10240, null);
        return ratingsModel;
    }

    public static final void V(Activity object) {
        boolean bl2 = object instanceof BaseActivity;
        if (bl2) {
            String string2;
            object = ((AjioHomeActivity)object).T0;
            bl2 = false;
            if ((object = object != null ? ((Fragment)object).getChildFragmentManager() : null) != null) {
                string2 = "OrderSummaryFragment";
                object = ((FragmentManager)object).E(string2);
            } else {
                object = null;
            }
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
            object = ((bg2_1)object).j;
            Intrinsics.checkNotNull(object);
            string2 = bz1_2.class.getName();
            int n3 = 12;
            object.onFragmentInteraction(string2, n3, null);
        }
    }

    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        int n4;
        fx0_2 fx0_22 = null;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = 804989212;
        object = object.g(n7);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = ((j30_0)object).j((H30)object2);
        int n8 = object2 instanceof Activity;
        Object object3 = null;
        Object object4 = n8 != 0 ? (object2 = (Activity)object2) : null;
        Object object5 = object2 = qz1_22.l.getValue();
        object5 = (CartOrder)object2;
        Object object6 = selectedOrderItem != null ? (object2 = selectedOrderItem.getCartEntry()) : null;
        if (object6 != null) {
            object2 = ((CartEntry)object6).getQuantity();
            ((CartEntry)object6).setOrderTotalQuantity((Integer)object2);
        }
        ((j30_0)object).K(-2078120243);
        object2 = h40_0.a;
        object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        Object object7 = "enable_block_for_cancellation";
        n7 = (int)(((ao0_0)object2).a((String)object7) ? 1 : 0);
        if (n7 != 0) {
            if (object6 != null) {
                object2 = ((CartEntry)object6).getCancellable();
            } else {
                n7 = 0;
                object2 = null;
            }
            if (object2 != null) {
                if (object6 != null) {
                    object2 = ((CartEntry)object6).getCancellable();
                    object7 = Boolean.FALSE;
                    n7 = (int)(Intrinsics.areEqual(object2, object7) ? 1 : 0);
                } else {
                    n7 = 0;
                    object2 = null;
                }
                if (n7 != 0) {
                    n7 = 1;
                    n8 = 56;
                    de2_0.b(qz1_22, n7 != 0, (b30_0)object, n8, 0);
                    ((j30_0)object).T(false);
                    object = ((j30_0)object).X();
                    if (object != null) {
                        fx0_22 = new jd2_2(qz1_22, selectedOrderItem, n3);
                        ((CF2)object).d = fx0_22;
                    }
                    return;
                }
            }
        }
        ((j30_0)object).T(false);
        if (selectedOrderItem != null) {
            object2 = selectedOrderItem.getOrderDetailLineItem();
        } else {
            n7 = 0;
            object2 = null;
        }
        if (object2 != null) {
            if (selectedOrderItem != null) {
                object2 = selectedOrderItem.getOrderDetailLineItem();
            } else {
                n7 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            n4 = n7 = ((OrderDetailLineItem)object2).getLineItemQty();
        } else {
            n4 = 0;
        }
        object2 = (Map)qz1_22.A.getValue();
        if (object6 != null && (object7 = ((CartEntry)object6).getProduct()) != null) {
            object3 = ((Product)object7).getCode();
        }
        object7 = object2 = object2.get(object3);
        object7 = (ArrayList)object2;
        object3 = new kd2_1(qz1_22);
        object2 = new ld2_1(qz1_22, 0);
        fx0_22 = new md2_1((Activity)object4, (CartEntry)object6, n4, (CartOrder)object5, qz1_22);
        n4 = 8;
        object4 = fx0_22;
        object6 = object;
        jd2_1.a((ArrayList)object7, (kd2_1)object3, (ld2_1)object2, (md2_1)fx0_22, (b30_0)object, n4);
        object = ((j30_0)object).X();
        if (object != null) {
            fx0_22 = new nd2_1(qz1_22, selectedOrderItem, n3);
            ((CF2)object).d = fx0_22;
        }
    }

    public static final void b(qz1_2 qz1_22, boolean bl2, b30_0 object, int n3, int n4) {
        Object object2 = "viewModel";
        Intrinsics.checkNotNullParameter(qz1_22, (String)object2);
        object = object.g(-580341796);
        int n7 = n4 & 2;
        if (n7 != 0) {
            bl2 = false;
        }
        object2 = new sd2_2(qz1_22, 0);
        yb_1 yb_12 = new yb_1(qz1_22, 2);
        int n8 = n3 << 3 & 0x380;
        jd2_1.b((sd2_2)object2, yb_12, bl2, (b30_0)object, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new td2_2(qz1_22, bl2, n3, n4);
        }
    }

    public static final void c(qz1_2 qz1_22, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -402468077;
        object = object.g(n4);
        Object object2 = (Map)qz1_22.p.getValue();
        Serializable serializable = Boolean.TRUE;
        int n7 = object2.containsKey(serializable);
        if (n7 != 0) {
            serializable = n7 != 0;
            if ((object2 = (SelectedOrderItem)object2.get(serializable)) != null) {
                serializable = ((SelectedOrderItem)object2).getConsignment();
            } else {
                n7 = 0;
                serializable = null;
            }
            if (serializable != null) {
                ((j30_0)object).K(547873352);
                n4 = 8;
                n7 = 2;
                de2_0.b(qz1_22, false, (b30_0)object, n4, n7);
                ((j30_0)object).T(false);
            } else {
                ((j30_0)object).K(547938359);
                n7 = 72;
                de2_0.a(qz1_22, (SelectedOrderItem)object2, (b30_0)object, n7);
                ((j30_0)object).T(false);
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new od2_2(qz1_22, n3);
        }
    }

    public static final void d(String string2, String string3, String string4, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Object object2;
        String string5;
        String string6;
        int n4;
        String string7;
        Intrinsics.checkNotNullParameter(string3, "address");
        Intrinsics.checkNotNullParameter(string4, "phone");
        Object object3 = "viewModel";
        Intrinsics.checkNotNullParameter(qz1_22, (String)object3);
        object = object.g(-2020423073);
        qz1_22.getClass();
        int n7 = qz1_2.I(selectedOrderItem);
        bd2_1 bd2_12 = null;
        if (n7 == 0) {
            ((j30_0)object).K(669018611);
            n7 = R$string.delivery_address_new;
            string7 = nk_0.f((b30_0)object, n7);
            n7 = n3 << 3;
            n4 = n7 & 0x1FF0;
            string6 = string2;
            string5 = string3;
            object2 = string4;
            de2_0.h(string7, string2, string3, string4, (b30_0)object, n4);
            ((j30_0)object).T(false);
        } else {
            n7 = 669219646;
            ((j30_0)object).K(n7);
            if (selectedOrderItem != null) {
                object3 = selectedOrderItem.getCartDeliveryAddress();
            } else {
                n7 = 0;
                object3 = null;
            }
            string5 = V4.a((CartDeliveryAddress)object3);
            string6 = object3 != null && (string7 = ((CartDeliveryAddress)object3).getFirstName()) != null ? string7 : string2;
            object2 = object3 != null && (object3 = ((CartDeliveryAddress)object3).getPhone()) != null ? object3 : string4;
            n7 = R$string.pickupaddress;
            string7 = nk_0.f((b30_0)object, n7);
            n4 = 0;
            de2_0.h(string7, string6, string5, (String)object2, (b30_0)object, 0);
            n7 = n3 & 0x3FE;
            de2_0.f(string2, string3, string4, (b30_0)object, n7);
            ((j30_0)object).T(false);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            object3 = bd2_12;
            string7 = string2;
            string6 = string3;
            string5 = string4;
            object2 = qz1_22;
            n4 = n3;
            bd2_12 = new bd2_1(string2, string3, string4, qz1_22, selectedOrderItem, n3);
            ((CF2)object).d = bd2_12;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void e(String string2, String string3, String string4, b30_0 object, int n3) {
        int n4;
        Object object2;
        Object object3;
        float f5;
        Object object4 = string2;
        Object object5 = string3;
        Object object6 = string4;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(string3, "address");
        Intrinsics.checkNotNullParameter(string4, "phone");
        int n8 = -29016013;
        Object object7 = object;
        Object object8 = object.g(n8);
        int n10 = n3 & 0xE;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object8).J(string2) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x70;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object8).J(object5) ? 1 : 0);
            if (n14 != 0) {
                n14 = 32;
                f5 = 4.5E-44f;
            } else {
                n14 = 16;
                f5 = 2.2E-44f;
            }
            n10 |= n14;
        }
        if ((n14 = n7 & 0x380) == 0) {
            n14 = (int)(((j30_0)object8).J(object6) ? 1 : 0);
            if (n14 != 0) {
                n14 = 256;
                f5 = 3.59E-43f;
            } else {
                n14 = 128;
                f5 = 1.8E-43f;
            }
            n10 |= n14;
        }
        int n15 = n10;
        n14 = 146;
        f5 = 2.05E-43f;
        if ((n10 &= 0x2DB) == n14 && (n10 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
        } else {
            void var38_44;
            Object object9;
            int n16;
            long l2;
            long l3;
            long l4;
            int n17;
            long l7;
            tv0_0 tv0_02;
            long l8;
            LP1$a lP1$a;
            int n18;
            Xp1$a xp1$a;
            mp mp2;
            Object object10;
            Object object11;
            Object object12;
            Integer n19;
            LP1$a lP1$a2 = LP1$a.b;
            object7 = zp.c;
            Object object13 = Nc$a.m;
            int n20 = 0;
            float f6 = 0.0f;
            Object object14 = null;
            object7 = oZ.a((zp$l)object7, (Gx$a)object13, (b30_0)object8, 0);
            n14 = ((j30_0)object8).P;
            Object object15 = ((j30_0)object8).P();
            LP1 lP1 = a30_0.c((b30_0)object8, lP1$a2);
            N20.W.getClass();
            Object object16 = N20$a.b;
            mp mp3 = ((j30_0)object8).a;
            int n21 = mp3 instanceof mp;
            if (n21 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object8).A();
            n21 = ((j30_0)object8).O;
            if (n21 != 0) {
                ((j30_0)object8).C((Function0)object16);
            } else {
                ((j30_0)object8).n();
            }
            object3 = N20$a.e;
            Ow3.a((b30_0)object8, object7, (Function2)object3);
            object7 = N20$a.d;
            Ow3.a((b30_0)object8, object15, (Function2)object7);
            object15 = N20$a.f;
            n20 = ((j30_0)object8).O;
            if (n20 != 0 || (n20 = Intrinsics.areEqual(object14 = ((j30_0)object8).v(), n19 = Integer.valueOf(n14))) == 0) {
                rk_0.a(n14, (j30_0)object8, n14, (N20$a$a)object15);
            }
            N20$a$c n20$a$c = N20$a.c;
            Ow3.a((b30_0)object8, lP1, n20$a$c);
            n14 = -175797438;
            f5 = -3.385742E32f;
            ((j30_0)object8).K(n14);
            n20 = 1065353216;
            f6 = 1.0f;
            int n22 = 200112;
            int n24 = 8;
            int n25 = 13;
            if (object4 == null) {
                object4 = object8;
                object12 = object7;
                object11 = object3;
                object10 = object15;
                mp2 = mp3;
                xp1$a = object16;
                n18 = n15;
                lP1$a = lP1$a2;
                N20$a$c n20$a$c2 = n20$a$c;
            } else {
                l8 = Em3.f(n25);
                tv0_02 = tv0_0.o;
                l7 = xx_1.e;
                LP1 lP12 = j.c(lP1$a2, f6);
                f5 = n24;
                int n26 = 13;
                object13 = h.i(lP12, 0.0f, f5, 0.0f, 0.0f, n26);
                object12 = object7;
                object7 = object13;
                n17 = n15 & 0xE | n22;
                n14 = 0;
                f5 = 0.0f;
                object13 = null;
                object10 = object15;
                object15 = null;
                mp2 = mp3;
                l4 = 0L;
                xp1$a = object16;
                object16 = null;
                n20 = 0;
                object14 = null;
                f6 = 0.0f;
                l3 = 0L;
                n18 = n15;
                lP1$a = lP1$a2;
                l2 = l3;
                N20$a$c n20$a$c3 = n20$a$c;
                Object var27_29 = null;
                n16 = 131024;
                object = object8;
                object8 = string2;
                object11 = object3;
                object4 = tv0_02;
                object9 = object;
                Ll3.b(string2, (LP1)object7, l7, l8, null, tv0_02, null, l4, null, null, l3, 0, false, 0, 0, null, null, (b30_0)object, n17, 0, n16);
                object8 = Unit.a;
                object4 = object;
            }
            int n27 = 0;
            object5 = null;
            ((j30_0)object4).T(false);
            l8 = Em3.f(n25);
            tv0_02 = tv0_0.m;
            l7 = xx_1.g;
            object6 = lP1$a;
            object15 = j.c(lP1$a, 1.0f);
            float f7 = 8;
            lP1 = null;
            n15 = 13;
            object7 = h.i((LP1)object15, 0.0f, f7, 0.0f, 0.0f, n15);
            n21 = n18;
            n8 = n18 >> 3 & 0xE;
            n17 = n8 | n22;
            n14 = 0;
            object13 = null;
            l4 = 0L;
            n20 = 0;
            f6 = 0.0f;
            object14 = null;
            l2 = 0L;
            Object var27_30 = null;
            n16 = 131024;
            object8 = string3;
            int n28 = n18;
            object = object4;
            object4 = tv0_02;
            object9 = object;
            Ll3.b(string3, (LP1)object7, l7, l8, null, tv0_02, null, l4, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object, n17, 0, n16);
            object4 = null;
            object15 = null;
            n24 = 13;
            object5 = lP1$a;
            f5 = f7;
            object8 = h.i(lP1$a, 0.0f, f7, 0.0f, 0.0f, n24);
            object7 = zp.a;
            object2 = Nc$a.j;
            object3 = object;
            object16 = null;
            object7 = iQ2.a((zp$e)object7, (Gx$b)object2, (b30_0)object, 0);
            n7 = ((j30_0)object).P;
            object5 = ((j30_0)object).P();
            object8 = a30_0.c((b30_0)object, (LP1)object8);
            object6 = mp2;
            n4 = mp2 instanceof mp;
            if (n4 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object).A();
            n4 = (int)(((j30_0)object).O ? 1 : 0);
            if (n4 != 0) {
                object6 = xp1$a;
                ((j30_0)object).C(xp1$a);
            } else {
                ((j30_0)object).n();
            }
            object6 = object11;
            Ow3.a((b30_0)object3, object7, (Function2)object11);
            object7 = object12;
            Ow3.a((b30_0)object3, object5, (Function2)object12);
            n10 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object3).v(), object5 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                object7 = object10;
                rk_0.a(n7, (j30_0)object3, n7, (N20$a$a)object10);
            }
            object7 = var38_44;
            Ow3.a((b30_0)object3, object8, (Function2)var38_44);
            n8 = R$string.phone_str;
            object8 = nk_0.f((b30_0)object3, n8);
            object7 = " ";
            object5 = Ft2.a((String)object8, (String)object7);
            long l12 = Em3.f(n25);
            n16 = 0;
            n22 = 200064;
            n4 = 0;
            object6 = null;
            mp3 = null;
            n20 = 0;
            f6 = 0.0f;
            object14 = null;
            l2 = 0L;
            Object var27_31 = null;
            l3 = 0L;
            object9 = null;
            n17 = 0;
            int n29 = 131026;
            n8 = 0;
            object8 = null;
            object16 = tv0_02;
            Ll3.b((String)object5, null, l7, l12, null, tv0_02, null, l2, null, null, l3, 0, false, 0, 0, null, null, (b30_0)object3, n22, 0, n29);
            ((j30_0)object3).K(-2003106761);
            n10 = n28;
            n7 = n28 & 0x380;
            n27 = 256;
            if (n7 == n27) {
                n7 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                f7 = 0.0f;
                object2 = null;
            }
            object5 = ((j30_0)object3).v();
            if (n7 == 0 && object5 != (object2 = b30$a.a)) {
                object4 = string4;
                n4 = 1;
            } else {
                object4 = string4;
                n4 = 1;
                object5 = new wp0_1(string4, n4);
                ((j30_0)object3).o(object5);
            }
            object5 = (Function1)object5;
            ((j30_0)object3).T(false);
            object2 = lP1$a;
            object2 = CY2.b(lP1$a, false, (Function1)object5);
            long l14 = Em3.f(n25);
            object9 = tv0_0.o;
            n8 = n10 >> 6 & 0xE;
            n17 = n8 | 0x30D80;
            n14 = 0;
            f5 = 0.0f;
            object13 = null;
            object15 = null;
            l4 = 0L;
            object16 = null;
            n20 = 0;
            f6 = 0.0f;
            object14 = null;
            l2 = 0L;
            Object var27_32 = null;
            n16 = 131024;
            object8 = string4;
            object7 = object2;
            object5 = object3;
            object = object3;
            object4 = object9;
            object9 = object3;
            Ll3.b(string4, (LP1)object2, l7, l14, null, (tv0_0)object4, null, l4, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object3, n17, 0, n16);
            object8 = object3;
            n10 = 1;
            ((j30_0)object3).T(n10 != 0);
            ((j30_0)object3).T(n10 != 0);
        }
        object8 = ((j30_0)object8).X();
        if (object8 != null) {
            object2 = string2;
            object3 = string3;
            object5 = string4;
            n4 = n3;
            ((CF2)object8).d = object7 = new be2_0(string2, string3, string4, n3);
        }
    }

    public static final void f(String string2, String string3, String string4, b30_0 object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(string3, "address");
        Object object3 = "phone";
        Intrinsics.checkNotNullParameter(string4, (String)object3);
        object = object.g(337505501);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x380) == 0) {
            n7 = (int)(((j30_0)object).J(string4) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        if ((n4 &= 0x2DB) == (n7 = 146) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object3 = a20_0.a;
            object2 = new de2$a_0(string2, string3, string4);
            object2 = v10.c(-131197435, (fx0_2)object2, (b30_0)object);
            int n8 = 54;
            vb2.f((u10)object3, (u10)object2, (b30_0)object, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            xe1_2 xe1_22;
            int n10 = 1;
            object3 = xe1_22;
            object2 = string2;
            xe1_22 = new xe1_2(string2, string3, string4, n3, n10);
            ((CF2)object).d = xe1_22;
        }
    }

    public static final void g(String string2, String string3, String string4, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(string3, "address");
        Object object2 = "phone";
        Intrinsics.checkNotNullParameter(string4, (String)object2);
        object = object.g(1566324983);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x70;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).J(string3) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n3 & 0x380) == 0) {
            n8 = (int)(((j30_0)object).J(string4) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x2DB) == (n4 = 146) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n8 = R$string.delivery_address_new;
            String string5 = nk_0.f((b30_0)object, n8);
            int n10 = (n7 <<= 3) & 0x1FF0;
            de2_0.h(string5, string2, string3, string4, (b30_0)object, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new zd2_2(string2, string3, string4, n3);
        }
    }

    public static final void h(String string2, String string3, String string4, String string5, b30_0 object, int n3) {
        Object object2;
        float f5;
        Intrinsics.checkNotNullParameter(string2, "addressTitle");
        Intrinsics.checkNotNullParameter(string4, "address");
        Object object3 = "phone";
        Intrinsics.checkNotNullParameter(string5, (String)object3);
        object = object.g(-505947957);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        int n8 = 16;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string3) ? 1 : 0);
            if (n7 != 0) {
                n7 = 32;
                f5 = 4.5E-44f;
            } else {
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n4 |= n7;
        }
        if ((n7 = n3 & 0x380) == 0) {
            n7 = (int)(((j30_0)object).J(string4) ? 1 : 0);
            if (n7 != 0) {
                n7 = 256;
                f5 = 3.59E-43f;
            } else {
                n7 = 128;
                f5 = 1.8E-43f;
            }
            n4 |= n7;
        }
        if ((n7 = n3 & 0x1C00) == 0) {
            n7 = (int)(((j30_0)object).J(string5) ? 1 : 0);
            if (n7 != 0) {
                n7 = 2048;
                f5 = 2.87E-42f;
            } else {
                n7 = 1024;
                f5 = 1.435E-42f;
            }
            n4 |= n7;
        }
        n7 = 1170;
        f5 = 1.64E-42f;
        if ((n4 &= 0x16DB) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object3 = LP1$a.b;
            f5 = n8;
            LP1 lP1 = h.e((LP1)object3, f5);
            object3 = new de2$b_0(string2, string3, string4, string5);
            object2 = v10.c(-995079903, (fx0_2)object3, (b30_0)object);
            n8 = 0;
            int n10 = 3078;
            int n14 = 6;
            OA.a(lP1, null, false, (u10)object2, (b30_0)object, n10, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            me2_1 me2_12;
            object3 = me2_12;
            n7 = n3;
            object2 = string4;
            me2_12 = new me2_1(n3, string2, string3, string4, string5);
            ((CF2)object).d = me2_12;
        }
    }

    public static final void i(CartEntry cartEntry, qz1_2 qz1_22, b30_0 object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1424759239;
        object = object.g(n4);
        Object object3 = AndroidCompositionLocals_androidKt.b;
        object3 = ((j30_0)object).j((H30)object3);
        boolean bl2 = object3 instanceof Activity;
        if (bl2) {
            object3 = (Activity)object3;
        } else {
            n4 = 0;
            object3 = null;
        }
        bl2 = h40_0.P1();
        if (!bl2) {
            if ((object = ((j30_0)object).X()) != null) {
                ((CF2)object).d = object3 = new be2_1(cartEntry, qz1_22, n3);
            }
            return;
        }
        if (cartEntry != null) {
            object2 = cartEntry.getPriorityDeliveryBreached();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            Serializable serializable;
            if (cartEntry != null) {
                object2 = cartEntry.getPriorityDeliveryBreached();
                serializable = Boolean.FALSE;
                bl2 = Intrinsics.areEqual(object2, serializable);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (!bl2) {
                int n7;
                float f5;
                if (cartEntry != null) {
                    object2 = cartEntry.getPriorityDeliveryFeeStatus();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (cartEntry != null && (serializable = cartEntry.getConvenienceFee()) != null && (serializable = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery()) != null) {
                    f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
                    double d2 = f5;
                    serializable = Double.valueOf(d2);
                } else {
                    n7 = 0;
                    serializable = null;
                    f5 = 0.0f;
                }
                object2 = iq1_1.a((String)object2, (Double)serializable);
                n7 = TextUtils.isEmpty((CharSequence)object2);
                if (n7 != 0) {
                    if ((object = ((j30_0)object).X()) != null) {
                        ((CF2)object).d = object3 = new de2_1(cartEntry, qz1_22, n3);
                    }
                    return;
                }
                n7 = 576;
                f5 = 8.07E-43f;
                de2_0.N((String)object2, (Activity)object3, cartEntry, (b30_0)object, n7);
                object3 = cartEntry.getPriorityDeliveryFeeStatus();
                if (object3 == null) {
                    object3 = "";
                }
                qz1_22.getClass();
                Intrinsics.checkNotNullParameter(object3, "type");
                object2 = md3_0.c(qz1_22);
                serializable = new e02_0(null, qz1_22, (String)object3);
                n4 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)((Object)serializable), n4);
                object = ((j30_0)object).X();
                if (object != null) {
                    ((CF2)object).d = object3 = new ee2_1(cartEntry, qz1_22, n3);
                }
                return;
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object3 = new ce2_1(cartEntry, qz1_22, n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void j(qz1_2 var0, yT1 var1_1, SelectedOrderItem var2_2, boolean var3_3, b30_0 var4_4, int var5_5) {
        block85: {
            block76: {
                block77: {
                    block80: {
                        block81: {
                            block82: {
                                block84: {
                                    block83: {
                                        block79: {
                                            block78: {
                                                var6_6 = var0;
                                                var7_7 = var1_1;
                                                var8_8 = var2_2;
                                                Intrinsics.checkNotNullParameter(var0, "viewModel");
                                                var9_9 = "navController";
                                                Intrinsics.checkNotNullParameter(var1_1, (String)var9_9);
                                                var10_10 = 839746373;
                                                var11_11 = var4_4;
                                                var12_12 = var4_4.g(var10_10);
                                                var0.getClass();
                                                if (var2_2 != null) {
                                                    var9_9 = var2_2.getForwardOrderRevampOrderTrackerSection();
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                var13_13 = false;
                                                var14_14 = null;
                                                if (var9_9 != null) {
                                                    var10_10 = var9_9.size();
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                if (var10_10 <= 0 || (var15_15 = var8_8 != null ? (var9_9 = var2_2.getForwardOrderRevampOrderTrackerSection()) : null) == null) break block76;
                                                var9_9 = h40_0.a;
                                                var16_16 = h40_0.X();
                                                var10_10 = 245281303;
                                                var12_12.K(var10_10);
                                                if (var8_8 != null && (var9_9 = var2_2.getCancelledRefundDetails()) != null) {
                                                    var9_9 = var9_9.getCancellationType();
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                var17_17 = "BUSINESS_CANCELLATION";
                                                var10_10 = (int)Intrinsics.areEqual(var9_9, var17_17);
                                                var18_18 = 8;
                                                if (var10_10 != 0) {
                                                    if (var16_16 != null) {
                                                        var9_9 = var16_16.getEnable();
                                                        var11_11 = Boolean.TRUE;
                                                        var10_10 = (int)Intrinsics.areEqual(var9_9, var11_11);
                                                    } else {
                                                        var10_10 = 0;
                                                        var9_9 = null;
                                                    }
                                                    if (var10_10 != 0 && var3_3 == 0) {
                                                        de2_0.I((OrderCancellationRefundConfig)var16_16, (b30_0)var12_12, var18_18);
                                                    }
                                                }
                                                var12_12.T(false);
                                                if (var8_8 != null && (var9_9 = var2_2.getConsignment()) != null && (var9_9 = var9_9.getReturnRequests()) != null) {
                                                    var9_9 = (ReturnRequest)CollectionsKt.firstOrNull((List)var9_9);
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                var19_19 = 245290431;
                                                var12_12.K(var19_19);
                                                if (var9_9 != null) {
                                                    de2_0.K((ReturnRequest)var9_9, (b30_0)var12_12, var18_18);
                                                    var9_9 = Unit.a;
                                                }
                                                var12_12.T(false);
                                                var20_20 = LP1$a.b;
                                                var9_9 = zp.c;
                                                var21_22 = Nc$a.m;
                                                var9_9 = oZ.a((zp$l)var9_9, (Gx$a)var21_22, (b30_0)var12_12, 0);
                                                var19_19 = var12_12.P;
                                                var22_23 = var12_12.P();
                                                var23_24 = a30_0.c((b30_0)var12_12, (LP1)var20_20);
                                                var24_25 = N20.W;
                                                var24_25.getClass();
                                                var25_26 = N20$a.b;
                                                var7_7 = var12_12.a;
                                                var26_28 = var7_7 instanceof mp;
                                                if (var26_28 == 0) break block77;
                                                var12_12.A();
                                                var26_28 = var12_12.O;
                                                if (var26_28 != 0) {
                                                    var12_12.C((Function0)var25_26);
                                                } else {
                                                    var12_12.n();
                                                }
                                                var25_26 = N20$a.e;
                                                Ow3.a((b30_0)var12_12, var9_9, (Function2)var25_26);
                                                var9_9 = N20$a.d;
                                                Ow3.a((b30_0)var12_12, var22_23, (Function2)var9_9);
                                                var9_9 = N20$a.f;
                                                var27_29 = var12_12.O;
                                                if (var27_29 != 0 || (var27_29 = Intrinsics.areEqual(var22_23 = var12_12.v(), var25_26 = Integer.valueOf(var19_19))) == 0) {
                                                    rk_0.a(var19_19, (j30_0)var12_12, var19_19, (N20$a$a)var9_9);
                                                }
                                                var9_9 = N20$a.c;
                                                Ow3.a((b30_0)var12_12, var23_24, (Function2)var9_9);
                                                var10_10 = 1509066434;
                                                var12_12.K(var10_10);
                                                var9_9 = qz1_2.z(var2_2);
                                                if (var9_9 != null && (var10_10 = var9_9.length()) != 0) {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                } else {
                                                    var10_10 = 1;
                                                }
                                                if (var10_10 == 0) {
                                                    var9_9 = qz1_2.z(var2_2);
                                                    Ko3.a((String)var9_9, (b30_0)var12_12, 0);
                                                }
                                                var12_12.T(false);
                                                var9_9 = (CartOrder)var6_6.l.getValue();
                                                if (var9_9 == null || (var9_9 = var9_9.getCode()) == null || (var10_10 = (int)kotlin.text.b.s((String)var9_9, (String)(var11_11 = "EX"), false)) != (var19_19 = 1)) ** GOTO lbl-1000
                                                if (var8_8 != null && (var9_9 = var2_2.getConsignment()) != null && (var9_9 = var9_9.getReturnRequests()) != null && (var9_9 = (ReturnRequest)var9_9.get(0)) != null) {
                                                    var9_9 = var9_9.getReturnStatus();
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                var11_11 = "RETURN REQUESTED";
                                                var27_29 = 1;
                                                var10_10 = (int)kotlin.text.b.i((String)var9_9, (String)var11_11, (boolean)var27_29);
                                                if (var10_10 != 0) {
                                                    var10_10 = 1;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                var26_28 = 72;
                                                var28_30 = 1.01E-43f;
                                                if (var10_10 == 0) break block78;
                                                var10_10 = -463299754;
                                                var12_12.K(var10_10);
                                                if (var8_8 != null && (var9_9 = var2_2.getConsignment()) != null && (var9_9 = var9_9.getReturnRequests()) != null && (var9_9 = (ReturnRequest)var9_9.get(0)) != null) {
                                                    var9_9 = var9_9.getReturnRevampTopicName();
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                wp3_0.a((qz1_2)var6_6, var8_8, (String)var9_9, (b30_0)var12_12, var26_28);
                                                if (var8_8 != null && (var9_9 = var2_2.getConsignment()) != null && (var9_9 = var9_9.getReturnRequests()) != null) {
                                                    var9_9 = (ReturnRequest)var9_9.get(0);
                                                } else {
                                                    var10_10 = 0;
                                                    var9_9 = null;
                                                }
                                                Intrinsics.checkNotNull(var9_9);
                                                op3_0.a((qz1_2)var6_6, (ReturnRequest)var9_9, (b30_0)var12_12, var26_28);
                                                var12_12.T(false);
                                                var25_26 = var1_1;
                                                var29_31 = var17_17;
                                                var30_32 = var16_16;
                                                var11_11 = var12_12;
                                                var23_24 = var8_8;
                                                var20_20 = var6_6;
                                                var10_10 = 1;
                                                var27_29 = 0;
                                                var22_23 = null;
                                                break block79;
                                            }
                                            var12_12.K(-462799631);
                                            var9_9 = "trackers";
                                            Intrinsics.checkNotNullParameter(var15_15, (String)var9_9);
                                            var10_10 = var15_15.size();
                                            var31_33 = "";
                                            var22_23 = var31_33;
                                            var19_19 = 0;
                                            var11_11 = null;
                                            while (true) {
                                                var25_26 = "get(...)";
                                                if (var19_19 >= var10_10) break;
                                                var23_24 = var15_15.get(var19_19);
                                                Intrinsics.checkNotNullExpressionValue(var23_24, (String)var25_26);
                                                var23_24 = (ReturnOrderTracker)var23_24;
                                                var25_26 = var23_24.getDescription();
                                                if (var25_26 != null && (var18_18 = var25_26.length()) != 0 && (var22_23 = var23_24.getDescription()) == null) {
                                                    var22_23 = var31_33;
                                                }
                                                var32_34 = 1;
                                                var19_19 += var32_34;
                                            }
                                            wp3_0.a((qz1_2)var6_6, var8_8, (String)var22_23, (b30_0)var12_12, var26_28);
                                            tr0_0.a((qz1_2)var6_6, var8_8, (b30_0)var12_12, var26_28);
                                            vr0_0.a((qz1_2)var6_6, var8_8, (b30_0)var12_12, var26_28);
                                            var10_10 = 1509107905;
                                            var12_12.K(var10_10);
                                            var32_34 = var15_15.size();
                                            var9_9 = HA.e(Nc$a.a, false);
                                            var19_19 = var12_12.P;
                                            var22_23 = var12_12.P();
                                            var33_35 = a30_0.c((b30_0)var12_12, (LP1)var20_20);
                                            var24_25 = N20.W;
                                            var24_25.getClass();
                                            var14_14 = N20$a.b;
                                            var34_36 = var17_17;
                                            var35_37 = var7_7 instanceof mp;
                                            if (var35_37 == 0) break block80;
                                            var12_12.A();
                                            var35_37 = var12_12.O;
                                            if (var35_37 != 0) {
                                                var12_12.C((Function0)var14_14);
                                            } else {
                                                var12_12.n();
                                            }
                                            var17_17 = N20$a.e;
                                            Ow3.a((b30_0)var12_12, var9_9, (Function2)var17_17);
                                            var9_9 = N20$a.d;
                                            Ow3.a((b30_0)var12_12, var22_23, (Function2)var9_9);
                                            var22_23 = N20$a.f;
                                            var36_38 = var16_16;
                                            var37_39 = var12_12.O;
                                            if (var37_39 != 0 || (var37_39 = Intrinsics.areEqual(var16_16 = var12_12.v(), var6_6 = Integer.valueOf(var19_19))) == 0) {
                                                rk_0.a(var19_19, (j30_0)var12_12, var19_19, (N20$a$a)var22_23);
                                            }
                                            var11_11 = N20$a.c;
                                            Ow3.a((b30_0)var12_12, var33_35, (Function2)var11_11);
                                            var38_40 = 10;
                                            var28_30 = 20;
                                            var37_39 = 16;
                                            var39_41 = var37_39;
                                            var40_42 = 4;
                                            var24_25 = var20_20;
                                            var41_43 = var38_40;
                                            var42_44 = var28_30;
                                            var43_45 = var39_41;
                                            var24_25 = h.i((LP1)var20_20, var38_40, var28_30, 0.0f, var39_41, var40_42);
                                            var44_46 = var20_20;
                                            var20_20 = j.o((LP1)var24_25);
                                            var45_47 = var39_41;
                                            var16_16 = zp.c;
                                            var28_30 = 0.0f;
                                            var33_35 = null;
                                            var16_16 = oZ.a((zp$l)var16_16, (Gx$a)var21_22, (b30_0)var12_12, 0);
                                            var26_28 = var12_12.P;
                                            var46_48 = var21_22;
                                            var21_22 = var12_12.P();
                                            var20_20 = a30_0.c((b30_0)var12_12, (LP1)var20_20);
                                            var43_45 = var38_40;
                                            var47_49 = var7_7 instanceof mp;
                                            if (var47_49 == 0) break block81;
                                            var12_12.A();
                                            var47_49 = var12_12.O;
                                            if (var47_49 != 0) {
                                                var12_12.C((Function0)var14_14);
                                            } else {
                                                var12_12.n();
                                            }
                                            Ow3.a((b30_0)var12_12, var16_16, (Function2)var17_17);
                                            Ow3.a((b30_0)var12_12, var21_22, (Function2)var9_9);
                                            var10_10 = (int)var12_12.O;
                                            if (var10_10 != 0 || (var10_10 = (int)Intrinsics.areEqual(var9_9 = var12_12.v(), var21_22 = Integer.valueOf(var26_28))) == 0) {
                                                rk_0.a(var26_28, (j30_0)var12_12, var26_28, (N20$a$a)var22_23);
                                            }
                                            Ow3.a((b30_0)var12_12, var20_20, (Function2)var11_11);
                                            var10_10 = -1684843036;
                                            var12_12.K(var10_10);
                                            var47_49 = 0;
                                            var38_40 = 0.0f;
                                            var6_6 = null;
                                            while (var47_49 < var32_34) {
                                                var9_9 = var15_15.get(var47_49);
                                                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var25_26);
                                                var14_14 = var9_9;
                                                var14_14 = (ReturnOrderTracker)var9_9;
                                                var21_22 = qz1_2.y((ReturnOrderTracker)var14_14);
                                                var20_20 = var14_14.getAttemptList();
                                                var26_28 = 1;
                                                var28_30 = 1.4E-45f;
                                                var10_10 = var32_34 + -1;
                                                if (var47_49 == var10_10) {
                                                    var35_37 = 1;
                                                } else {
                                                    var35_37 = 0;
                                                    var17_17 = null;
                                                }
                                                var48_50 = Boolean.TRUE;
                                                if (var8_8 != null) {
                                                    var49_51 = var9_9 = var2_2.getCartEntry();
                                                } else {
                                                    var50_52 = 0;
                                                    var49_51 = null;
                                                }
                                                var37_39 = 0;
                                                var39_41 = 0.0f;
                                                var16_16 = null;
                                                var51_53 = 805568520;
                                                var19_19 = 0;
                                                var11_11 = null;
                                                var27_29 = 0;
                                                var22_23 = null;
                                                var52_54 = 72;
                                                var53_55 = 398;
                                                var54_56 = 5.58E-43f;
                                                var9_9 = var0;
                                                var55_57 = var32_34;
                                                var23_24 = null;
                                                var56_58 = var46_48;
                                                var57_59 = var25_26;
                                                var18_18 = var35_37;
                                                var29_31 = var34_36;
                                                var35_37 = 0;
                                                var17_17 = null;
                                                var30_32 = var36_38;
                                                var58_60 = var15_15;
                                                var15_15 = var48_50;
                                                var4_4 = var12_12;
                                                var12_12 = var49_51;
                                                var33_35 = var4_4;
                                                var59_61 = var7_7;
                                                var60_62 = var47_49;
                                                var47_49 = var53_55;
                                                var38_40 = var54_56;
                                                ut0_1.a(var0, null, null, null, (String)var21_22, (ArrayList)var20_20, (boolean)var18_18, null, null, var48_50, (ReturnOrderTracker)var14_14, (CartEntry)var49_51, var4_4, var51_53, var52_54, var53_55);
                                                var38_40 = 1.4E-45f;
                                                var10_10 = var60_62 + 1;
                                                var8_8 = var2_2;
                                                var12_12 = var4_4;
                                                var47_49 = var10_10;
                                                var15_15 = var58_60;
                                            }
                                            var55_57 = var32_34;
                                            var57_59 = var25_26;
                                            var58_60 = var15_15;
                                            var59_61 = var7_7;
                                            var56_58 = var46_48;
                                            var29_31 = var34_36;
                                            var30_32 = var36_38;
                                            var8_8 = null;
                                            var47_49 = 1;
                                            var38_40 = 1.4E-45f;
                                            var7_7 = var12_12;
                                            var12_12.T(false);
                                            var12_12.T((boolean)var47_49);
                                            var40_42 = 4;
                                            var10_10 = 0;
                                            var24_25 = var44_46;
                                            var41_43 = var43_45;
                                            var46_48 = null;
                                            var43_45 = var45_47;
                                            var9_9 = j.o(h.i((LP1)var44_46, var41_43, var42_44, 0.0f, var45_47, var40_42));
                                            var11_11 = zp.c;
                                            var22_23 = var56_58;
                                            var11_11 = oZ.a((zp$l)var11_11, (Gx$a)var56_58, (b30_0)var12_12, 0);
                                            var27_29 = var12_12.P;
                                            var23_24 = var12_12.P();
                                            var9_9 = a30_0.c((b30_0)var12_12, (LP1)var9_9);
                                            N20.W.getClass();
                                            var21_22 = N20$a.b;
                                            var20_20 = var59_61;
                                            var61_63 = var59_61 instanceof mp;
                                            if (var61_63 == 0) break block82;
                                            var12_12.A();
                                            var61_63 = (int)var12_12.O;
                                            if (var61_63 != 0) {
                                                var12_12.C((Function0)var21_22);
                                            } else {
                                                var12_12.n();
                                            }
                                            var21_22 = N20$a.e;
                                            Ow3.a((b30_0)var7_7, var11_11, (Function2)var21_22);
                                            var11_11 = N20$a.d;
                                            Ow3.a((b30_0)var7_7, var23_24, (Function2)var11_11);
                                            var11_11 = N20$a.f;
                                            var32_34 = (int)var7_7.O;
                                            if (var32_34 != 0 || (var32_34 = (int)Intrinsics.areEqual(var23_24 = var7_7.v(), var21_22 = Integer.valueOf(var27_29))) == 0) {
                                                rk_0.a(var27_29, (j30_0)var7_7, var27_29, (N20$a$a)var11_11);
                                            }
                                            var11_11 = N20$a.c;
                                            Ow3.a((b30_0)var7_7, var9_9, (Function2)var11_11);
                                            var10_10 = -1684809469;
                                            var7_7.K(var10_10);
                                            var62_64 = var55_57;
                                            var28_30 = 0.0f;
                                            var33_35 = null;
                                            for (var26_28 = 0; var26_28 < var62_64; ++var26_28) {
                                                var14_14 = var58_60;
                                                var9_9 = var58_60.get(var26_28);
                                                var15_15 = var57_59;
                                                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var57_59);
                                                var16_16 = var9_9;
                                                var16_16 = (ReturnOrderTracker)var9_9;
                                                Intrinsics.checkNotNullParameter(var16_16, "tracker");
                                                var9_9 = var16_16.isActive();
                                                var11_11 = Boolean.TRUE;
                                                var10_10 = Intrinsics.areEqual(var9_9, var11_11);
                                                if (var10_10 != 0) {
                                                    var9_9 = var16_16.getActiveBar();
                                                    var11_11 = "green";
                                                    if (var9_9 != null && (var10_10 = var9_9.length()) != 0) {
                                                        var9_9 = var16_16.getActiveBar();
                                                        var10_10 = kotlin.text.b.i((String)var9_9, (String)(var22_23 = "RED"), (boolean)var47_49);
                                                        if (var10_10 != 0) {
                                                            var11_11 = "red";
                                                        } else {
                                                            var9_9 = var16_16.getActiveBar();
                                                            var10_10 = kotlin.text.b.i((String)var9_9, (String)(var22_23 = "ORANGE"), (boolean)var47_49);
                                                            if (var10_10 != 0) {
                                                                var11_11 = "orange";
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    var11_11 = var31_33;
                                                }
                                                if (var26_28 < (var32_34 = var62_64 + -1)) {
                                                    var10_10 = var26_28 + 1;
                                                    var17_17 = var9_9 = (ReturnOrderTracker)var14_14.get(var10_10);
                                                } else {
                                                    var35_37 = 0;
                                                    var17_17 = null;
                                                }
                                                var21_22 = qz1_2.y((ReturnOrderTracker)var16_16);
                                                var22_23 = var16_16.getMainStatusName();
                                                var20_20 = var16_16.getTimeStamp();
                                                var25_26 = var16_16.getAttemptList();
                                                if (var26_28 == var32_34) {
                                                    var63_65 = 1;
                                                    var45_47 = 1.4E-45f;
                                                } else {
                                                    var63_65 = 0;
                                                    var45_47 = 0.0f;
                                                    var24_25 = null;
                                                }
                                                var44_46 = var16_16.isDeliveryDelayed();
                                                var64_66 = Boolean.FALSE;
                                                var23_24 = var2_2;
                                                var46_48 = var2_2 != null ? (var9_9 = var2_2.getCartEntry()) : null;
                                                var43_45 = 0.0f;
                                                var40_42 = 822345736;
                                                var50_52 = 72;
                                                var9_9 = var0;
                                                var23_24 = var20_20;
                                                var20_20 = var25_26;
                                                var18_18 = var63_65;
                                                var24_25 = var16_16;
                                                var16_16 = var44_46;
                                                var44_46 = var15_15;
                                                var15_15 = var64_66;
                                                var64_66 = var14_14;
                                                var14_14 = var24_25;
                                                var63_65 = var62_64;
                                                var12_12 = var46_48;
                                                var33_35 = var7_7;
                                                var6_6 = null;
                                                ut0_1.a(var0, (String)var11_11, (String)var22_23, (String)var23_24, (String)var21_22, (ArrayList)var25_26, (boolean)var18_18, (ReturnOrderTracker)var17_17, (Boolean)var16_16, (Boolean)var15_15, (ReturnOrderTracker)var24_25, (CartEntry)var46_48, (b30_0)var7_7, var40_42, var50_52, 0);
                                                var10_10 = 1;
                                                var57_59 = var44_46;
                                                var58_60 = var64_66;
                                                var8_8 = null;
                                                var47_49 = 1;
                                                var38_40 = 1.4E-45f;
                                            }
                                            var11_11 = var7_7;
                                            var10_10 = 1;
                                            var27_29 = 0;
                                            var22_23 = null;
                                            var7_7.T(false);
                                            var7_7.T((boolean)var10_10);
                                            var7_7.T((boolean)var10_10);
                                            var23_24 = Unit.a;
                                            var7_7.T(false);
                                            var23_24 = var2_2;
                                            if (var2_2 != null) {
                                                var21_22 = var2_2.getCartEntry();
                                                var18_18 = 72;
                                                var20_20 = var0;
                                            } else {
                                                var18_18 = 72;
                                                var20_20 = var0;
                                                var65_67 = 0;
                                                var21_22 = null;
                                            }
                                            de2_0.i((CartEntry)var21_22, (qz1_2)var20_20, (b30_0)var11_11, var18_18);
                                            var65_67 = 584;
                                            var25_26 = var1_1;
                                            de2_0.P((qz1_2)var20_20, var1_1, (SelectedOrderItem)var23_24, (b30_0)var11_11, var65_67);
                                            var11_11.T(false);
                                        }
                                        var11_11.T((boolean)var10_10);
                                        var65_67 = 245430214;
                                        var11_11.K(var65_67);
                                        if (var23_24 != null && (var21_22 = var2_2.getCancelledRefundDetails()) != null) {
                                            var21_22 = var21_22.getCancellationType();
                                        } else {
                                            var65_67 = 0;
                                            var21_22 = null;
                                        }
                                        var17_17 = "USER_CANCELLATION";
                                        var65_67 = (int)Intrinsics.areEqual(var21_22, var17_17);
                                        if (var65_67 != 0) break block83;
                                        if (var23_24 != null && (var21_22 = var2_2.getCancelledRefundDetails()) != null) {
                                            var21_22 = var21_22.getCancellationType();
lbl463:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var65_67 = 0;
                                        var21_22 = null;
                                        ** while (true)
                                        var17_17 = var29_31;
                                        var65_67 = (int)Intrinsics.areEqual(var21_22, var29_31);
                                        if (var65_67 == 0) break block84;
                                    }
                                    var21_22 = var30_32;
                                    if (var30_32 != null) {
                                        var17_17 = var30_32.getEnable();
                                        var16_16 = Boolean.TRUE;
                                        var13_13 = Intrinsics.areEqual(var17_17, var16_16);
                                    } else {
                                        var13_13 = false;
                                        var14_14 = null;
                                    }
                                    if (var13_13) {
                                        var17_17 = var2_2.getCancelledRefundDetails();
                                        if (var17_17 != null) {
                                            var17_17 = var17_17.getRefundDetailsObj();
                                        } else {
                                            var35_37 = 0;
                                            var17_17 = null;
                                        }
                                        if (var17_17 == null) {
                                            var26_28 = 1;
                                            var28_30 = 1.4E-45f;
                                        } else {
                                            var26_28 = 0;
                                            var28_30 = 0.0f;
                                            var33_35 = null;
                                        }
                                        if (var26_28 != 0 && var3_3 == 0) {
                                            var9_9 = var2_2.getOrderStatus();
                                            var17_17 = "toLowerCase(...)";
                                            if (var9_9 != null) {
                                                var16_16 = Locale.ROOT;
                                                var9_9 = var9_9.toLowerCase((Locale)var16_16);
                                                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var17_17);
                                            } else {
                                                var10_10 = 0;
                                                var9_9 = null;
                                            }
                                            var15_15 = Locale.ROOT;
                                            var16_16 = "CANCELLED".toLowerCase((Locale)var15_15);
                                            Intrinsics.checkNotNullExpressionValue(var16_16, (String)var17_17);
                                            var10_10 = Intrinsics.areEqual(var9_9, var16_16);
                                            if (var10_10 != 0) {
                                                var10_10 = 8;
                                                de2_0.M((OrderCancellationRefundConfig)var21_22, (b30_0)var11_11, var10_10);
                                            }
                                        }
                                    }
                                }
                                var11_11.T(false);
                                var9_9 = Unit.a;
                                break block85;
                            }
                            s20.a();
                            throw null;
                        }
                        s20.a();
                        throw null;
                    }
                    s20.a();
                    throw null;
                }
                s20.a();
                throw null;
            }
            var11_11 = var12_12;
            var23_24 = var8_8;
            var25_27 = var7_7;
            var20_21 = var6_6;
        }
        var17_17 = var11_11.X();
        if (var17_17 != null) {
            var9_9 = var16_16;
            var11_11 = var0;
            var22_23 = var1_1;
            var23_24 = var2_2;
            var65_67 = var3_3;
            var61_63 = var5_5;
            var17_17.d = var16_16 = new gd2_0(var0, var1_1, var2_2, (boolean)var3_3, var5_5);
        }
    }

    public static final void k(qz1_2 qz1_22, Product product, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1250151798;
        float f5 = -9.395086E-7f;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = ((j30_0)object).j((H30)object2);
        boolean bl2 = object2 instanceof Activity;
        Object object3 = null;
        if (bl2) {
            object2 = (Activity)object2;
        } else {
            n4 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        Object object4 = (Boolean)qz1_22.P.getValue();
        bl2 = (Boolean)object4;
        if (bl2) {
            object4 = Boolean.FALSE;
            Object object5 = qz1_22.P;
            ((h83_0)object5).setValue(object4);
            bl2 = object2 instanceof BaseActivity;
            if (bl2) {
                object2 = ((AjioHomeActivity)object2).T0;
                if (object2 != null) {
                    object2 = ((Fragment)object2).getChildFragmentManager();
                } else {
                    n4 = 0;
                    object2 = null;
                    f5 = 0.0f;
                }
                if (object2 != null) {
                    object4 = "OrderSummaryFragment";
                    object3 = ((FragmentManager)object2).E((String)object4);
                }
                f5 = qz1_22.r(selectedOrderItem);
                object2 = de2_0.U(qz1_22, product, f5, selectedOrderItem);
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                object3 = (bg2_1)object3;
                object3.getClass();
                Intrinsics.checkNotNullParameter(object2, "ratingsModel");
                ((bg2_1)object3).o = object4 = ((RatingsModel)object2).getBaseProductId();
                object4 = LD2.a;
                object4 = ((RatingsModel)object2).getOrderId();
                object5 = ((RatingsModel)object2).getSkuId();
                String string2 = ((RatingsModel)object2).getBrandName();
                String string3 = ((RatingsModel)object2).getProductBrick();
                LD2.b((String)object4, (String)object5, string2, string3);
                object4 = wd2_0.Companion;
                object5 = wp1_0.EDIT;
                object4.getClass();
                object2 = wD2$a.a((RatingsModel)object2, (wp1_0)((Object)object5));
                object4 = ((Fragment)object3).getChildFragmentManager();
                object3 = "RatingBottomSheetFragment";
                ((DialogFragment)object2).show((FragmentManager)object4, (String)object3);
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new ae2_1(qz1_22, product, selectedOrderItem, n3);
        }
    }

    public static final void l(qz1_2 qz1_22, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        object = object.g(1240839700);
        Object object2 = (Boolean)qz1_22.k.getValue();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = new u8_0(qz1_22, 2);
            jd2_1.j((u8_0)object2, (b30_0)object, 0);
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new pd2_2(qz1_22, n3);
        }
    }

    public static final void m(qz1_2 qz1_22, b30_0 object, int n3) {
        Object object2;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = -1648412283;
        object = object.g(n7);
        Object object3 = (Map)qz1_22.j.getValue();
        Object object4 = Boolean.TRUE;
        boolean n8 = object3.containsKey(object4);
        if (n8) {
            object4 = n8;
            object3 = (SelectedOrderItem)object3.get(object4);
            object4 = hv3_0.a;
            object4 = z40_0.Companion;
            object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
            boolean bl2 = ((ao0_0)object4).a("enable_mark_as_delivered");
            if (bl2) {
                int n10 = 799039826;
                ((j30_0)object).K(n10);
                object4 = new yp0_2(qz1_22, n4);
                je1_0 je1_02 = new je1_0(n4, qz1_22, object3);
                n4 = 512;
                jd2_1.h((yp0_2)object4, je1_02, qz1_22, (b30_0)object, n4);
                ((j30_0)object).T(false);
            } else {
                n7 = 799997819;
                ((j30_0)object).K(n7);
                int n14 = 2;
                object3 = new n8_0(qz1_22, n14);
                object4 = new o8_0(qz1_22, n4);
                object2 = qz1_22.u();
                jd2_1.i((n8_0)object3, (o8_0)object4, (String)object2, (b30_0)object, 0);
                ((j30_0)object).T(false);
            }
        }
        if ((object = ((j30_0)object).X()) != null) {
            object2 = new ld2_2(qz1_22, n3);
            ((CF2)object).d = object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void n(String string2, int n3, boolean bl2, String string3, boolean n4, b30_0 b30_02, int n7, int n8) {
        Object object;
        Object object2;
        int n10;
        int n14;
        float f5;
        float f6;
        int n15;
        int n16;
        int n17;
        Object object3;
        Object object4;
        int n18;
        Object object5;
        boolean bl3;
        int n19;
        Object object6;
        block30: {
            object6 = string2;
            n19 = n3;
            bl3 = bl2;
            object5 = string3;
            n18 = n7;
            int n20 = 276319390;
            object4 = b30_02;
            object3 = b30_02.g(n20);
            n17 = n7 & 0xE;
            if (!n17) {
                n17 = (int)(((j30_0)object3).J(string2) ? 1 : 0);
                n17 = n17 != 0 ? 4 : 2;
                n17 |= n18;
            } else {
                n17 = n7;
            }
            n16 = n18 & 0x70;
            n15 = 16;
            if (n16 == 0) {
                n16 = (int)(((j30_0)object3).c(n19) ? 1 : 0);
                if (n16 != 0) {
                    n16 = 32;
                    f6 = 4.5E-44f;
                } else {
                    n16 = 16;
                    f6 = 2.2E-44f;
                }
                n17 |= n16;
            }
            if ((n16 = n18 & 0x380) == 0) {
                n16 = (int)(((j30_0)object3).a(bl3) ? 1 : 0);
                if (n16 != 0) {
                    n16 = 256;
                    f6 = 3.59E-43f;
                } else {
                    n16 = 128;
                    f6 = 1.8E-43f;
                }
                n17 |= n16;
            }
            if ((n16 = n18 & 0x1C00) == 0) {
                n16 = (int)(((j30_0)object3).J(object5) ? 1 : 0);
                if (n16 != 0) {
                    n16 = 2048;
                    f6 = 2.87E-42f;
                } else {
                    n16 = 1024;
                    f6 = 1.435E-42f;
                }
                n17 |= n16;
            }
            if ((n16 = n8 & 0x10) != 0) {
                n17 |= 0x6000;
            } else {
                f5 = 8.0356E-41f;
                n14 = 0xE000 & n18;
                if (n14 == 0) {
                    n14 = n4;
                    n10 = (int)(((j30_0)object3).a(n4 != 0) ? 1 : 0);
                    n10 = n10 != 0 ? 16384 : 8192;
                }
            }
            n14 = n4;
            break block30;
            n17 |= n10;
        }
        n10 = 9362;
        if ((n17 &= 0xB6DB) == n10 && (n17 = (int)(((j30_0)object3).h() ? 1 : 0))) {
            ((j30_0)object3).D();
            object4 = object5;
        } else {
            boolean bl4;
            Object object7;
            Object object8;
            n17 = 0;
            object4 = null;
            int n21 = n16 != 0 ? 0 : n14;
            Object object9 = LP1$a.b;
            int n22 = 1065353216;
            float f7 = 1.0f;
            Object object10 = j.c((LP1)object9, f7);
            long l2 = OX.f;
            Object object11 = fg2_1.a;
            object10 = a.b((LP1)object10, l2, (i13)object11);
            f5 = n15;
            object10 = h.e((LP1)object10, f5);
            Object object12 = zp.c;
            object2 = Nc$a.m;
            object12 = oZ.a((zp$l)object12, (Gx$a)object2, (b30_0)object3, 0);
            n10 = ((j30_0)object3).P;
            object11 = ((j30_0)object3).P();
            object10 = a30_0.c((b30_0)object3, (LP1)object10);
            Object object13 = N20.W;
            object13.getClass();
            object4 = N20$a.b;
            object = ((j30_0)object3).a;
            boolean bl5 = object instanceof mp;
            if (!bl5) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            bl5 = ((j30_0)object3).O;
            if (bl5) {
                ((j30_0)object3).C((Function0)object4);
            } else {
                ((j30_0)object3).n();
            }
            Object object14 = N20$a.e;
            Ow3.a((b30_0)object3, object12, (Function2)object14);
            object12 = N20$a.d;
            Ow3.a((b30_0)object3, object11, (Function2)object12);
            object11 = N20$a.f;
            int n24 = ((j30_0)object3).O;
            if (n24 != 0 || (n22 = (int)(Intrinsics.areEqual(object8 = ((j30_0)object3).v(), object7 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                rk_0.a(n10, (j30_0)object3, n10, (N20$a$a)object11);
            }
            object8 = N20$a.c;
            Ow3.a((b30_0)object3, object10, (Function2)object8);
            object10 = object6 == null ? "" : object6;
            n22 = 1065353216;
            f7 = 1.0f;
            object2 = j.c((LP1)object9, f7);
            n22 = 8;
            f7 = n22;
            int n25 = 0;
            float f8 = 0.0f;
            Object object15 = object11;
            object6 = h.g((LP1)object2, 0.0f, f7, 1);
            long l3 = Em3.f(16);
            tv0_0 tv0_02 = tv0_0.o;
            av0_0 av0_02 = y20_0.a;
            long l4 = xx_1.e;
            int n26 = 1772976;
            Object object16 = object11;
            int n27 = 1;
            long l7 = 0L;
            Object object17 = null;
            long l8 = 0L;
            int n28 = 0;
            int n29 = 130960;
            object2 = object;
            object = object6;
            object5 = object12;
            object6 = object2;
            l2 = l4;
            float f11 = f7;
            long l12 = l3;
            Object object18 = object14;
            object14 = tv0_02;
            Object object19 = object8;
            object8 = av0_02;
            Ll3.b((String)object10, (LP1)object, l4, l3, null, tv0_02, av0_02, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object3, n26, 0, n29);
            object8 = object9;
            float f12 = 1.0f;
            object10 = j.c((LP1)object9, f12);
            object = zp.f;
            object7 = Nc$a.k;
            n14 = 54;
            f5 = 7.6E-44f;
            object = iQ2.a((zp$e)object, (Gx$b)object7, (b30_0)object3, n14);
            n10 = ((j30_0)object3).P;
            object11 = ((j30_0)object3).P();
            object10 = a30_0.c((b30_0)object3, (LP1)object10);
            bl5 = object2 instanceof mp;
            if (!bl5) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            bl5 = ((j30_0)object3).O;
            if (bl5) {
                ((j30_0)object3).C((Function0)object4);
            } else {
                ((j30_0)object3).n();
            }
            object14 = object18;
            Ow3.a((b30_0)object3, object, (Function2)object18);
            Ow3.a((b30_0)object3, object11, (Function2)object5);
            boolean bl6 = ((j30_0)object3).O;
            if (bl6 || !(bl4 = Intrinsics.areEqual(object = ((j30_0)object3).v(), object11 = Integer.valueOf(n10)))) {
                rk_0.a(n10, (j30_0)object3, n10, (N20$a$a)object16);
            }
            object2 = object19;
            Ow3.a((b30_0)object3, object10, (Function2)object19);
            object = mq2_0.a;
            object10 = hj0_0.a(n19, "Quantity: ");
            object12 = h.i(j.c(((mq2_0)object).a((LP1)object8, f12, true), f12), 0.0f, 0.0f, 0.0f, f11, 7);
            long l14 = Em3.f(12);
            object18 = object14;
            object14 = new Cj3(5);
            n26 = 1576320;
            f12 = 0.0f;
            int n30 = 12;
            object11 = null;
            object17 = object14;
            Object object20 = object18;
            bl5 = false;
            object14 = null;
            l7 = 0L;
            l8 = 0L;
            n29 = 130480;
            object9 = object;
            object = object12;
            Object object21 = object19;
            l2 = l4;
            l12 = l14;
            Object object22 = object8;
            object8 = av0_02;
            Ll3.b((String)object10, (LP1)object12, l4, l14, null, null, av0_02, l7, null, (Cj3)object17, l8, 0, false, 0, 0, null, null, (b30_0)object3, n26, 0, n29);
            object12 = object9;
            object8 = object22;
            n16 = 1065353216;
            f6 = 1.0f;
            boolean bl7 = true;
            object15 = j.c(((mq2_0)object9).a((LP1)object22, f6, bl7), f6);
            object17 = null;
            n28 = 7;
            object10 = h.i((LP1)object15, 0.0f, 0.0f, 0.0f, f11, n28);
            object = zp.b;
            object12 = object7;
            n10 = 54;
            object = iQ2.a((zp$e)object, (Gx$b)object7, (b30_0)object3, n10);
            n14 = ((j30_0)object3).P;
            object2 = ((j30_0)object3).P();
            object10 = a30_0.c((b30_0)object3, (LP1)object10);
            n25 = object6 instanceof mp;
            if (n25 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            n25 = ((j30_0)object3).O;
            if (n25 != 0) {
                ((j30_0)object3).C((Function0)object4);
            } else {
                ((j30_0)object3).n();
            }
            object6 = object20;
            Ow3.a((b30_0)object3, object, (Function2)object20);
            Ow3.a((b30_0)object3, object2, (Function2)object5);
            n25 = ((j30_0)object3).O;
            if (n25 != 0 || (n25 = Intrinsics.areEqual(object6 = ((j30_0)object3).v(), object5 = Integer.valueOf(n14))) == 0) {
                rk_0.a(n14, (j30_0)object3, n14, (N20$a$a)object16);
            }
            object6 = object21;
            Ow3.a((b30_0)object3, object10, (Function2)object21);
            object6 = n21 != 0 ? "Hide order status" : "See tracking details";
            object10 = object6;
            l12 = Em3.f(n30);
            l2 = xx_1.h;
            n25 = 4;
            f8 = n25;
            object15 = null;
            int n32 = 11;
            object13 = object8;
            object = h.i((LP1)object8, 0.0f, 0.0f, f8, 0.0f, n32);
            n27 = 6;
            object6 = new Cj3(n27);
            n26 = 1772976;
            object11 = null;
            l7 = 0L;
            l8 = 0L;
            n28 = 0;
            n29 = 130448;
            object14 = tv0_02;
            object4 = object8;
            object8 = av0_02;
            object17 = object6;
            Ll3.b((String)object10, (LP1)object, l2, l12, null, tv0_02, av0_02, l7, null, (Cj3)object6, l8, 0, false, 0, 0, null, null, (b30_0)object3, n26, 0, n29);
            n25 = n21 != 0 ? R$drawable.arrow_up : R$drawable.arrow_down;
            n18 = n21 != 0 ? R$string.acc_up_arrow_icon : R$string.acc_down_arrow_icon;
            object = hv3_0.K(n18);
            n18 = 0;
            float f14 = 0.0f;
            object16 = null;
            object10 = km2.a(n25, (b30_0)object3, 0);
            n25 = 12;
            f8 = 1.7E-44f;
            f14 = n25;
            object12 = j.i((LP1)object4, f14, f14);
            n22 = 0;
            f7 = 0.0f;
            object7 = null;
            object11 = null;
            n10 = 0;
            object2 = null;
            f12 = 0.0f;
            object9 = null;
            n24 = 392;
            int n34 = 120;
            object14 = object3;
            Pd1.a((im2)object10, (String)object, (LP1)object12, null, null, 0.0f, null, (b30_0)object3, n24, n34);
            n17 = 1;
            ((j30_0)object3).T(n17 != 0);
            ((j30_0)object3).T(n17 != 0);
            ((j30_0)object3).K(1814117212);
            object4 = string3;
            n18 = 1;
            f14 = Float.MIN_VALUE;
            if (bl3 && string3 != null) {
                object10 = "Return ID: ".concat(string3);
                l12 = Em3.f(n25);
                object14 = tv0_0.m;
                n26 = 200064;
                boolean bl8 = false;
                object = null;
                object11 = null;
                n24 = 0;
                object8 = null;
                l7 = 0L;
                object17 = null;
                l8 = 0L;
                n28 = 0;
                n29 = 131026;
                l2 = l4;
                Ll3.b((String)object10, null, l4, l12, null, (tv0_0)object14, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object3, n26, 0, n29);
            }
            object6 = null;
            ((j30_0)object3).T(false);
            n25 = 2;
            f8 = n25;
            vb2.h(f8, (b30_0)object3, n27);
            ((j30_0)object3).T(n18 != 0);
            n14 = n21;
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = object2;
            object6 = string2;
            n19 = n3;
            bl3 = bl2;
            object5 = string3;
            n17 = n14;
            n18 = n7;
            n16 = n8;
            ((CF2)object).d = object2 = new od2_1(string2, n3, bl2, string3, n14 != 0, n7, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void o(String string2, String string3, boolean bl2, b30_0 b30_02, int n3) {
        String string4 = string2;
        String string5 = string3;
        int n4 = n3;
        int n7 = 1162237849;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        int n8 = n3 & 0xE;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object2).J(string2) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n3;
        }
        int n10 = n4 & 0x70;
        int n14 = 16;
        float f5 = 2.2E-44f;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object2).J(string5) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n8 &= 0x5B) == (n10 = 18) && (n8 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            Object object3;
            boolean bl3 = false;
            Object object4 = null;
            boolean bl4 = true;
            if (string4 != null && (n8 = string2.length()) != 0 && (n8 = (int)(kotlin.text.b.s(string4, (String)(object = "EX"), bl4) ? 1 : 0)) != 0) {
                n8 = 1;
            } else {
                n8 = 0;
                object = null;
            }
            Object object5 = zp.f;
            Object object6 = Nc$a.k;
            LP1$a lP1$a = LP1$a.b;
            f5 = n14;
            float f6 = 8;
            Object object7 = j.c(h.f(lP1$a, f5, f6), 1.0f);
            int n15 = 54;
            f6 = 7.6E-44f;
            object5 = iQ2.a((zp$e)object5, (Gx$b)object6, (b30_0)object2, n15);
            int n16 = ((j30_0)object2).P;
            Object object8 = ((j30_0)object2).P();
            object7 = a30_0.c((b30_0)object2, (LP1)object7);
            Object object9 = N20.W;
            object9.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = ((j30_0)object2).a;
            boolean bl5 = mp2 instanceof mp;
            if (!bl5) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl5 = ((j30_0)object2).O;
            if (bl5) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object2, object5, n20$a$b);
            object9 = N20$a.d;
            Ow3.a((b30_0)object2, object8, (Function2)object9);
            object8 = N20$a.f;
            n10 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object2).v(), object3 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object8);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object2, object7, (Function2)object3);
            object7 = zp.a;
            object6 = Nc$a.j;
            object5 = iQ2.a((zp$e)object7, (Gx$b)object6, (b30_0)object2, 0);
            int n17 = ((j30_0)object2).P;
            Object object10 = object7;
            object7 = ((j30_0)object2).P();
            Object object11 = object6;
            object6 = a30_0.c((b30_0)object2, lP1$a);
            LP1$a lP1$a2 = lP1$a;
            boolean bl6 = mp2 instanceof mp;
            if (!bl6) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl6 = ((j30_0)object2).O;
            if (bl6) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            Ow3.a((b30_0)object2, object5, n20$a$b);
            Ow3.a((b30_0)object2, object7, (Function2)object9);
            n10 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object2).v(), object7 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                rk_0.a(n17, (j30_0)object2, n17, (N20$a$a)object8);
            }
            Ow3.a((b30_0)object2, object6, (Function2)object3);
            object4 = " ";
            if (n8 != 0) {
                ((j30_0)object2).K(-279967154);
                n8 = R$string.exchange_id_txt;
                object = nk_0.f((b30_0)object2, n8);
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object);
                ((StringBuilder)object5).append((String)object4);
                object = ((StringBuilder)object5).toString();
                n10 = 0;
                object5 = null;
                ((j30_0)object2).T(false);
                bl6 = false;
                lP1$a = null;
            } else {
                ((j30_0)object2).K(-279965397);
                n8 = R$string.order_id_txt;
                object = nk_0.f((b30_0)object2, n8);
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object);
                ((StringBuilder)object5).append((String)object4);
                object = ((StringBuilder)object5).toString();
                bl6 = false;
                lP1$a = null;
                ((j30_0)object2).T(false);
            }
            int n18 = 12;
            long l2 = Em3.f(n18);
            tv0_0 tv0_02 = tv0_0.m;
            long l3 = xx_1.w;
            int n19 = 200064;
            n10 = 0;
            object5 = null;
            n14 = 0;
            f5 = 0.0f;
            object6 = object8;
            n15 = 0;
            object8 = null;
            f6 = 0.0f;
            Object object12 = object9;
            bl5 = false;
            object9 = null;
            long l4 = 0L;
            object7 = mp2;
            N20$a$b n20$a$b2 = n20$a$b;
            long l7 = l4;
            Xp1$a xp1$a2 = xp1$a;
            xp1$a = null;
            long l8 = 0L;
            int n20 = 131026;
            mp mp3 = mp2;
            Object object13 = object6;
            Object object14 = object10;
            Gx$b gx$b = object11;
            Serializable serializable = object3;
            LP1$a lP1$a3 = lP1$a2;
            long l12 = l2;
            String string6 = object4;
            object4 = tv0_02;
            Ll3.b((String)object, null, l3, l2, null, tv0_02, null, l4, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            object10 = "";
            object = string4 == null ? object10 : string4;
            l12 = Em3.f(n18);
            object11 = tv0_0.o;
            n19 = 200064;
            n15 = 0;
            f6 = 0.0f;
            object8 = null;
            bl5 = false;
            object9 = null;
            l7 = 0L;
            xp1$a = null;
            l8 = 0L;
            n20 = 131026;
            object4 = object11;
            Ll3.b((String)object, null, l3, l12, null, (tv0_0)object11, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            boolean bl7 = true;
            ((j30_0)object2).T(bl7);
            object5 = object14;
            object7 = gx$b;
            n8 = 0;
            object = iQ2.a((zp$e)object14, gx$b, (b30_0)object2, 0);
            n10 = ((j30_0)object2).P;
            object7 = ((j30_0)object2).P();
            object6 = lP1$a3;
            object6 = a30_0.c((b30_0)object2, lP1$a3);
            object3 = mp3;
            bl4 = mp3 instanceof mp;
            if (!bl4) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl4 = ((j30_0)object2).O;
            if (bl4) {
                object3 = xp1$a2;
                ((j30_0)object2).C(xp1$a2);
            } else {
                ((j30_0)object2).n();
            }
            object3 = n20$a$b2;
            Ow3.a((b30_0)object2, object, n20$a$b2);
            object = object12;
            Ow3.a((b30_0)object2, object7, (Function2)object12);
            n8 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object = ((j30_0)object2).v(), object7 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                object = object13;
                rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object13);
            }
            object = serializable;
            Ow3.a((b30_0)object2, object6, (Function2)((Object)serializable));
            n8 = R$string.placed_on_txt;
            object = nk_0.f((b30_0)object2, n8);
            object5 = string6;
            object = Ft2.a((String)object, string6);
            l12 = Em3.f(n18);
            n19 = 200064;
            n10 = 0;
            object5 = null;
            n15 = 0;
            f6 = 0.0f;
            object8 = null;
            bl5 = false;
            object9 = null;
            l7 = 0L;
            xp1$a = null;
            l8 = 0L;
            n20 = 131026;
            object4 = tv0_02;
            Ll3.b((String)object, null, l3, l12, null, tv0_02, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            object = string5 == null ? object10 : string5;
            l12 = Em3.f(n18);
            n19 = 200064;
            n10 = 0;
            object5 = null;
            n15 = 0;
            f6 = 0.0f;
            object8 = null;
            bl5 = false;
            object9 = null;
            l7 = 0L;
            xp1$a = null;
            l8 = 0L;
            n20 = 131026;
            object4 = object11;
            Ll3.b((String)object, null, l3, l12, null, (tv0_0)object11, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            n8 = 1;
            ((j30_0)object2).T(n8 != 0);
            ((j30_0)object2).T(n8 != 0);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n10 = (int)(bl2 ? 1 : 0);
            ((CF2)object2).d = object = new dd2_0(n4, string4, string5, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void p(qz1_2 qz1_22, yT1 yT12, b30_0 arrayList, int n3) {
        int n4;
        float f5;
        int n7;
        Iterator iterator;
        int n8;
        Object object;
        boolean bl2;
        int n10;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl3;
        boolean bl4;
        Object object6;
        int n14;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        int n15;
        boolean bl5;
        qz1_2 qz1_23;
        block37: {
            Ref$ObjectRef ref$ObjectRef;
            block36: {
                block35: {
                    kd2_2 kd2_22;
                    qz1_23 = qz1_22;
                    bl5 = false;
                    int n16 = 1;
                    Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
                    Intrinsics.checkNotNullParameter(yT12, "navController");
                    n15 = -251361167;
                    object10 = arrayList;
                    object9 = arrayList.g(n15);
                    ft1_2 ft1_22 = jt1.a((b30_0)object9);
                    object7 = object8 = qz1_22.l.getValue();
                    object7 = (CartOrder)object8;
                    Object object11 = object8 = qz1_22.m.getValue();
                    object11 = (List)object8;
                    boolean bl6 = (Boolean)qz1_22.n.getValue();
                    Object object12 = object8 = qz1_22.z.getValue();
                    object12 = (p83_0)object8;
                    object8 = (CartOrder)qz1_22.l.getValue();
                    n14 = 0;
                    object6 = null;
                    Object object13 = object8 != null ? (object8 = ((CartOrder)object8).getDeliveryAddress()) : null;
                    bl4 = (Boolean)qz1_23.o.getValue();
                    bl3 = (Boolean)qz1_23.T.getValue();
                    object8 = qz1_23.k0;
                    object10 = ((LiveData)object8).d();
                    object5 = dw1.a;
                    object5 = (mu1_1)((j30_0)object9).j((H30)object5);
                    object4 = ((j30_0)object9).v();
                    object3 = b30$a.a;
                    if (object4 == object3) {
                        object4 = ((LiveData)object8).e;
                        object2 = LiveData.k;
                        if (object4 != object2) {
                            object10 = ((LiveData)object8).d();
                        }
                        object4 = J83.g(object10);
                        ((j30_0)object9).o(object4);
                    }
                    object4 = (tr1_0)object4;
                    n10 = ((j30_0)object9).x(object8);
                    int n17 = ((j30_0)object9).x(object5);
                    object2 = ((j30_0)object9).v();
                    if ((n10 |= n17) != 0 || object2 == object3) {
                        object2 = new zv1((LiveData)object8, (mu1_1)object5, (tr1_0)object4);
                        ((j30_0)object9).o(object2);
                    }
                    object2 = (Function1)object2;
                    ly0_0.a(object8, object5, (Function1)object2, (b30_0)object9);
                    Object object14 = object8 = object4.getValue();
                    object14 = (DataCallback)object8;
                    object8 = object11;
                    object8 = (Collection)object11;
                    n15 = object8.isEmpty() ^ n16;
                    bl2 = n15 != 0 && (n15 = object11.size()) > n16;
                    object = new Ref$ObjectRef();
                    ((Ref$ObjectRef)object).element = object8 = CollectionsKt.firstOrNull((List)object11);
                    object2 = new Ref$ObjectRef();
                    ((Ref$ObjectRef)object2).element = object8 = qz1_2.l((SelectedOrderItem)((Ref$ObjectRef)object).element);
                    object3 = new Object();
                    object8 = (CartEntry)((Ref$ObjectRef)object2).element;
                    if (object8 != null) {
                        object8 = ((CartEntry)object8).getProduct();
                    } else {
                        n15 = 0;
                        object8 = null;
                    }
                    ((Ref$ObjectRef)object3).element = object8;
                    n8 = qz1_23.f;
                    object8 = (CharSequence)qz1_23.i.getValue();
                    int n18 = TextUtils.isEmpty((CharSequence)object8);
                    n15 = -1054215659;
                    ((j30_0)object9).K(n15);
                    if (!bl2 && (object8 = CollectionsKt.firstOrNull((List)object11)) != null) {
                        object8 = Unit.a;
                        object10 = new de2$c_0(qz1_23, (CartOrder)object7, (List)object11, null);
                        ly0_0.d((b30_0)object9, object8, (Function2)object10);
                    }
                    ((j30_0)object9).T(false);
                    object5 = ((Ref$ObjectRef)object).element;
                    object8 = object10;
                    object6 = object10;
                    object10 = qz1_22;
                    iterator = object5;
                    n7 = n18;
                    Iterator iterator2 = object3;
                    object3 = object;
                    Object object15 = object2;
                    object2 = object7;
                    ref$ObjectRef = object;
                    object = null;
                    ((de2$d_0)object8)(qz1_22, n18 != 0, n8 != 0, (Ref$ObjectRef)object3, (CartOrder)object7, null);
                    ly0_0.d((b30_0)object9, object5, (Function2)object8);
                    object8 = LP1$a.b;
                    n10 = 1065353216;
                    f5 = 1.0f;
                    object8 = j.c((LP1)object8, f5);
                    long l2 = OX.f;
                    object4 = fg2_1.a;
                    LP1 lP1 = a.b((LP1)object8, l2, (i13)object4);
                    object8 = kd2_22;
                    object10 = object11;
                    object5 = object3;
                    object4 = object15;
                    object3 = qz1_22;
                    object2 = iterator2;
                    n4 = n18;
                    n16 = 0;
                    n14 = n8;
                    arrayList = object7;
                    object7 = object14;
                    j30_0 j30_02 = object9;
                    object9 = arrayList;
                    iterator = object12;
                    kd2_22 = new kd2_2((List)object11, ref$ObjectRef, (Ref$ObjectRef)object15, qz1_22, (Ref$ObjectRef)((Object)iterator2), bl2, n18 != 0, n8 != 0, (DataCallback)object14, (CartOrder)((Object)arrayList), (p83_0)object12, yT12, (CartDeliveryAddress)object13, ft1_22);
                    object13 = null;
                    object14 = null;
                    boolean bl7 = false;
                    object8 = null;
                    int n19 = 6;
                    int n20 = 252;
                    object12 = lP1;
                    lP1 = null;
                    xq1_0.a((LP1)object12, ft1_22, null, false, null, null, null, false, kd2_22, j30_02, n19, n20);
                    n15 = -1053723752;
                    object7 = j30_02;
                    j30_02.K(n15);
                    if (bl2 || !bl6) break block35;
                    if (arrayList == null) break block36;
                    object8 = object15;
                    object8 = ((Ref$ObjectRef)object15).element;
                    if (object8 == null) break block36;
                    object10 = iterator2;
                    object5 = ((Ref$ObjectRef)((Object)iterator2)).element;
                    if (object5 == null) break block36;
                    Intrinsics.checkNotNull(object8);
                    object5 = object8;
                    object5 = (CartEntry)object8;
                    object8 = ((Ref$ObjectRef)((Object)iterator2)).element;
                    Intrinsics.checkNotNull(object8);
                    object4 = object8;
                    object4 = (Product)object8;
                    iterator = ref$ObjectRef;
                    object8 = ref$ObjectRef.element;
                    object3 = object8;
                    object3 = (SelectedOrderItem)object8;
                    bl5 = false;
                    object2 = new rd2_2(qz1_23, 0);
                    object = new ad2_1(qz1_23, 0);
                    n14 = 12620360;
                    object8 = arrayList;
                    object10 = qz1_22;
                    object11 = j30_02;
                    jd2_1.f((CartOrder)((Object)arrayList), qz1_22, (CartEntry)object5, (Product)object4, (SelectedOrderItem)object3, (rd2_2)object2, (ad2_1)object, j30_02, n14);
                    break block37;
                }
                object9 = arrayList;
            }
            iterator = ref$ObjectRef;
            bl5 = false;
        }
        ((j30_0)object7).T(false);
        ((j30_0)object7).K(-1053705647);
        n15 = 8;
        if (bl4 && object9 != null) {
            n4 = 1;
            object10 = new rd1_1(qz1_23, n4);
            jd2_1.c((CartOrder)object9, (rd1_1)object10, (b30_0)object7, n15);
        } else {
            n4 = 1;
        }
        ((j30_0)object7).T(false);
        de2_0.c(qz1_23, (b30_0)object7, n15);
        de2_0.m(qz1_23, (b30_0)object7, n15);
        de2_0.T(qz1_23, (b30_0)object7, n15);
        de2_0.l(qz1_23, (b30_0)object7, n15);
        n15 = -1053695085;
        ((j30_0)object7).K(n15);
        if (!bl3 || (object10 = qz1_2.o()) == null) {
            n8 = 0;
            object4 = null;
        } else {
            object5 = new id1_2(qz1_23, n4);
            n15 = 2;
            object4 = new p9_0(qz1_23, n15);
            object3 = new Object(qz1_23);
            object = null;
            object2 = object7;
            sn0_1.a((la2_0)object10, (id1_2)object5, (p9_0)object4, (ne2_2)object3, (b30_0)object7, 0);
            object10 = md3_0.c(qz1_22);
            n8 = 0;
            object4 = null;
            object5 = new qg3_2(n15, null);
            n15 = 3;
            Ae3.d((i90_0)object10, null, null, (Function2)object5, n15);
        }
        ((j30_0)object7).T(false);
        if (!bl2) {
            object8 = (SelectedOrderItem)((Ref$ObjectRef)((Object)iterator)).element;
            if (object8 != null) {
                object8 = ((SelectedOrderItem)object8).isExchangeOrder();
                object10 = Boolean.TRUE;
                n15 = (int)(Intrinsics.areEqual(object8, object10) ? 1 : 0);
            } else {
                n15 = 0;
                object8 = null;
            }
            if (n15 != 0 && (n15 = (int)(Intrinsics.areEqual(object8 = qz1_2.D((SelectedOrderItem)((Ref$ObjectRef)((Object)iterator)).element), object10 = Boolean.FALSE) ? 1 : 0)) != 0) {
                object8 = (SelectedOrderItem)((Ref$ObjectRef)((Object)iterator)).element;
                if (object8 != null && (object8 = ((SelectedOrderItem)object8).getConsignment()) != null && (object8 = ((Consignment)object8).getReturnRequests()) != null) {
                    object6 = object8 = CollectionsKt.firstOrNull((List)object8);
                    object6 = (ReturnRequest)object8;
                } else {
                    n14 = 0;
                    object6 = null;
                }
                if (object6 != null) {
                    boolean bl8;
                    object8 = (SelectedOrderItem)((Ref$ObjectRef)((Object)iterator)).element;
                    if (object8 != null && (object8 = ((SelectedOrderItem)object8).getCartEntry()) != null && (object8 = ((CartEntry)object8).getProduct()) != null) {
                        object8 = ((Product)object8).getCode();
                    } else {
                        n15 = 0;
                        object8 = null;
                    }
                    Intrinsics.checkNotNullParameter(object6, "returnRequest");
                    object10 = new ArrayList();
                    object5 = ((ReturnRequest)object6).getReturnEntries().iterator();
                    while (bl8 = object5.hasNext()) {
                        object3 = (OrderDetailLineItem)object5.next();
                        object2 = ((OrderDetailLineItem)object3).getEntry().getProduct().getCode();
                        boolean bl9 = Intrinsics.areEqual(object2, object8);
                        if (!bl9 || (object3 = ((OrderDetailLineItem)object3).getEntry().getProduct().getImages()) == null) continue;
                        object3 = object3.iterator();
                        while (bl9 = object3.hasNext()) {
                            object2 = (ProductImage)object3.next();
                            object2 = ((ProductImage)object2).getUrl();
                            object = new Entries(null, (String)object2, n4, null);
                            ((ArrayList)object10).add(object);
                        }
                    }
                } else {
                    n10 = 0;
                    object10 = null;
                    f5 = 0.0f;
                }
                if (object6 != null) {
                    if (object10 != null && (n15 = (int)(object10.isEmpty() ? 1 : 0)) == 0) {
                        n15 = 0;
                        object8 = null;
                    } else {
                        n15 = 1;
                    }
                    if (n15 == 0 && (n15 = (int)(((ReturnRequest)object6).isShowReasonPopup() ? 1 : 0)) != 0) {
                        object5 = ((ReturnRequest)object6).getReturnId();
                        object3 = ((ReturnRequest)object6).getCreated();
                        object2 = new RtoData((String)object5, (String)object3, (ArrayList)object10);
                        object8 = new RtoResponseData((RtoData)object2);
                        object10 = AndroidCompositionLocals_androidKt.b;
                        n7 = (object10 = ((j30_0)object7).j((H30)object10)) instanceof Activity;
                        if (n7 != 0) {
                            object6 = object10;
                            object6 = (Activity)object10;
                        } else {
                            n14 = 0;
                            object6 = null;
                        }
                        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
                        object6 = (AjioHomeActivity)object6;
                        object10 = ((AjioHomeActivity)object6).T0;
                        if (object10 != null) {
                            object6 = ((Fragment)object10).getChildFragmentManager();
                        } else {
                            n14 = 0;
                            object6 = null;
                        }
                        if (object6 != null) {
                            object10 = "OrderSummaryFragment";
                            object6 = ((FragmentManager)object6).E((String)object10);
                        } else {
                            n14 = 0;
                            object6 = null;
                        }
                        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                        object6 = (bg2_1)object6;
                        object6.getClass();
                        object10 = "rtoResponseData";
                        Intrinsics.checkNotNullParameter(object8, (String)object10);
                        object5 = (lq2_0)((bg2_1)object6).t.getValue();
                        object4 = h40_0.a;
                        ((lq2_0)object5).l = object4 = h40_0.Y();
                        object5 = ((lq2_0)((bg2_1)object6).t.getValue()).l;
                        if (object5 != null) {
                            object5 = ((RtoFirebaseData)object5).isRTOEnabled();
                            object4 = Boolean.TRUE;
                            bl5 = Intrinsics.areEqual(object5, object4);
                        }
                        if (bl5 && (n7 = (int)(((bg2_1)object6).u ? 1 : 0)) == 0) {
                            ((bg2_1)object6).u = n4;
                            wf2_0.Companion.getClass();
                            Intrinsics.checkNotNullParameter(object8, (String)object10);
                            object10 = new wf2_0();
                            object5 = new Bundle();
                            object4 = "rto_data";
                            object5.putParcelable((String)object4, (Parcelable)object8);
                            ((Fragment)object10).setArguments((Bundle)object5);
                            object8 = ((Fragment)object6).getChildFragmentManager();
                            object5 = ((Fragment)object6).getTag();
                            ((DialogFragment)object10).show((FragmentManager)object8, (String)object5);
                        }
                    }
                }
            }
        }
        if ((object8 = ((j30_0)object7).X()) != null) {
            object5 = yT12;
            n8 = n3;
            ((CF2)object8).d = object10 = new ze1_2(qz1_23, n3, n4, yT12);
        }
    }

    public static final void q(CartOrder cartOrder, qz1_2 qz1_22, Product product, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = 196009503;
        object = object.g(n4);
        Object object2 = LP1$a.b;
        int n7 = 16;
        float f5 = n7;
        LP1 lP1 = h.e((LP1)object2, f5);
        object2 = new De2$F(qz1_22, cartOrder, product);
        u10 u102 = v10.c(-1243023607, (fx0_2)object2, (b30_0)object);
        int n8 = 3078;
        int n10 = 6;
        OA.a(lP1, null, false, u102, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new cd2_0(cartOrder, qz1_22, product, n3);
        }
    }

    public static final void r(int n3, b30_0 b30_02, qz1_2 qz1_22, String string2, boolean bl2) {
        Object object;
        qz1_2 qz1_23 = qz1_22;
        String string3 = string2;
        boolean bl3 = bl2;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = 1097640666;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        qz1_22.getClass();
        object2 = "CANCELLED";
        boolean bl4 = string2.equalsIgnoreCase((String)object2);
        object2 = (bl4 || (bl4 = string2.equalsIgnoreCase((String)(object2 = "CANCELLATION_REQUESTED")))) && bl3 ? "Exchange Cancelled" : string3;
        Intrinsics.checkNotNull(object2);
        float f5 = -1.0999926E36f;
        ((j30_0)object3).K(-78390829);
        boolean n7 = ((j30_0)object3).J(object2);
        Object object4 = ((j30_0)object3).v();
        if (n7 || object4 == (object = b30$a.a)) {
            int n8 = 1;
            f5 = Float.MIN_VALUE;
            object4 = new F8(object2, n8);
            ((j30_0)object3).o(object4);
        }
        object4 = (Function1)object4;
        ((j30_0)object3).T(false);
        AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((Function1)object4, false);
        int n10 = 16;
        f5 = n10;
        float f6 = 8;
        object = j.c(h.f(appendedSemanticsElement, f5, f6), 1.0f);
        int n14 = 20;
        f6 = 2.8E-44f;
        long l2 = Em3.f(n14);
        tv0_0 tv0_02 = tv0_0.o;
        av0_0 av0_02 = y20_0.a;
        int n15 = 1772544;
        long l3 = 0L;
        long l4 = 0L;
        long l7 = 0L;
        int n16 = 130964;
        Ll3.b((String)object2, (LP1)object, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n15, 0, n16);
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            int n17 = n3;
            ((CF2)object3).d = object2 = new yd2_2(n3, qz1_23, string3, bl3);
        }
    }

    public static final void s(CartOrder cartOrder, p83_0 p83_02, qz1_2 qz1_22, ft1_2 ft1_22, b30_0 object, int n3) {
        De2$G de2$G;
        Intrinsics.checkNotNullParameter(p83_02, "orderEntries");
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Intrinsics.checkNotNullParameter(ft1_22, "parentLazyListState");
        int n4 = -1535646527;
        object = object.g(n4);
        Object object2 = ((j30_0)object).v();
        Object object3 = b30$a.a;
        if (object2 == object3) {
            object2 = Qx2.a(ly0_0.f(f.a, (b30_0)object), (j30_0)object);
        }
        object2 = ((Q30)object2).a;
        Object object4 = jt1.a((b30_0)object);
        object3 = LP1$a.b;
        float f5 = 8;
        int n7 = 1;
        LP1 lP1 = h.g((LP1)object3, 0.0f, f5, n7);
        Object object5 = object2;
        object5 = (c80)object2;
        object3 = de2$G;
        Object object6 = cartOrder;
        de2$G = new De2$G((ft1_2)object4, p83_02, (c80)object5, qz1_22, cartOrder, ft1_22);
        n4 = -18476501;
        object5 = v10.c(n4, de2$G, (b30_0)object);
        object4 = null;
        f5 = 0.0f;
        int n8 = 3078;
        int n10 = 6;
        object3 = lP1;
        OA.a(lP1, null, false, (u10)object5, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            object2 = object6;
            object3 = cartOrder;
            object4 = p83_02;
            object5 = ft1_22;
            n7 = n3;
            ((CF2)object).d = object6 = new ud2_1(cartOrder, p83_02, qz1_22, ft1_22, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void t(String string2, String string3, long l2, boolean n3, boolean n4, long l3, Integer object, String object2, Boolean bl2, boolean n7, String string4, String string5, b30_0 b30_02, int n8, int n10, int n14) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        long l4;
        Object object7;
        long l7;
        Object object8;
        int n15;
        Object object9;
        Object object10;
        int n16;
        int n17;
        Object object11;
        int n18;
        int n19;
        int n20;
        block62: {
            Object object12;
            long l8;
            LP1 lP1;
            int n21;
            Object object13;
            Object object14;
            Object object15;
            Object object16;
            String string6;
            String string7;
            int n22;
            Object object17;
            Object object18;
            Object object19;
            long l12;
            int n24;
            int n25;
            long l14;
            int n26;
            int n27;
            float f5;
            int n28;
            int n29;
            Object object20;
            int n30;
            int n32;
            int n34;
            long l15;
            int n35;
            int n36;
            int n37;
            int n38;
            int n39;
            int n41;
            String string8;
            float f6;
            int n42;
            float f7;
            int n43;
            Object object21;
            Object object22;
            block64: {
                block65: {
                    block63: {
                        int n44;
                        block61: {
                            int n45;
                            block60: {
                                object22 = string2;
                                object21 = string3;
                                n43 = n8;
                                n20 = n14;
                                n19 = 128;
                                f7 = 1.8E-43f;
                                n18 = 32;
                                n42 = 16;
                                f6 = 2.2E-44f;
                                Intrinsics.checkNotNullParameter(string2, "title");
                                string8 = "payment";
                                Intrinsics.checkNotNullParameter(string3, string8);
                                object11 = b30_02;
                                object11 = b30_02.g(1277644409);
                                n17 = n8 & 0xE;
                                if (n17 == 0) {
                                    n17 = (int)(((j30_0)object11).J(string2) ? 1 : 0);
                                    n17 = n17 != 0 ? 4 : 2;
                                    n17 |= n43;
                                } else {
                                    n17 = n8;
                                }
                                n16 = n43 & 0x70;
                                if (n16 == 0) {
                                    n16 = (int)(((j30_0)object11).J(object21) ? 1 : 0);
                                    n16 = n16 != 0 ? 32 : 16;
                                    n17 |= n16;
                                }
                                if ((n16 = n20 & 4) != 0) {
                                    n17 |= 0x180;
                                } else {
                                    n41 = n43 & 0x380;
                                    if (n41 == 0) {
                                        n39 = (int)(((j30_0)object11).d(l2) ? 1 : 0);
                                        n39 = n39 != 0 ? 256 : 128;
                                        n17 |= n39;
                                    }
                                }
                                n39 = n20 & 8;
                                if (n39 != 0) {
                                    n17 |= 0xC00;
                                } else {
                                    n41 = n43 & 0x1C00;
                                    if (n41 == 0) {
                                        n41 = n3;
                                        n38 = (int)(((j30_0)object11).a(n3 != 0) ? 1 : 0);
                                        n38 = n38 != 0 ? 2048 : 1024;
                                    }
                                }
                                n41 = n3;
                                break block60;
                                n17 |= n38;
                            }
                            n38 = n20 & 0x10;
                            if (n38 != 0) {
                                n17 |= 0x6000;
                                n42 = n4;
                            } else {
                                n37 = n43 & 0xE000;
                                n42 = n4;
                                if (n37 == 0) {
                                    n36 = (int)(((j30_0)object11).a(n4 != 0) ? 1 : 0);
                                    n36 = n36 != 0 ? 16384 : 8192;
                                    n17 |= n36;
                                }
                            }
                            n36 = n20 & 0x20;
                            if (n36 != 0) {
                                n35 = 196608;
                                n17 |= n35;
                                l15 = l3;
                            } else {
                                n35 = n43 & 0x70000;
                                l15 = l3;
                                if (n35 == 0) {
                                    n44 = ((j30_0)object11).d(l3);
                                    n44 = n44 != 0 ? 131072 : 65536;
                                    n17 |= n44;
                                }
                            }
                            n44 = n20 & 0x40;
                            if (n44 != 0) {
                                int n46 = 0x180000;
                                n17 |= n46;
                                object10 = object;
                            } else {
                                int n47 = n43 & 0x380000;
                                object10 = object;
                                if (n47 == 0) {
                                    n34 = ((j30_0)object11).J(object);
                                    n34 = n34 != 0 ? 0x100000 : 524288;
                                    n17 |= n34;
                                }
                            }
                            if ((n19 &= n20) != 0) {
                                n34 = 0xC00000;
                                n17 |= n34;
                                object9 = object2;
                            } else {
                                n34 = n43 & 0x1C00000;
                                object9 = object2;
                                if (n34 == 0) {
                                    n32 = ((j30_0)object11).J(object2);
                                    n32 = n32 != 0 ? 0x800000 : 0x400000;
                                    n17 |= n32;
                                }
                            }
                            n30 = 256;
                            if ((n30 &= n20) != 0) {
                                n32 = 0x6000000;
                                n17 |= n32;
                                object20 = bl2;
                            } else {
                                n32 = n43 & 0xE000000;
                                object20 = bl2;
                                if (n32 == 0) {
                                    n45 = ((j30_0)object11).J(bl2);
                                    n45 = n45 != 0 ? 0x4000000 : 0x2000000;
                                    n17 |= n45;
                                }
                            }
                            n29 = n20 & 0x200;
                            if (n29 != 0) {
                                n28 = 0x30000000;
                                f5 = 4.656613E-10f;
                                n17 |= n28;
                            } else {
                                f5 = 1.5845633E29f;
                                n28 = 0x70000000 & n43;
                                if (n28 == 0) {
                                    n28 = n7;
                                    n45 = (int)(((j30_0)object11).a(n7 != 0) ? 1 : 0);
                                    n45 = n45 != 0 ? 0x20000000 : 0x10000000;
                                    n17 |= n45;
                                } else {
                                    n28 = n7;
                                }
                            }
                            n28 = 1024;
                            f5 = 1.435E-42f;
                            if ((n28 &= n20) != 0) {
                                n15 = 6;
                                n27 = n10 | 6;
                            } else {
                                n15 = n10 & 0xE;
                                object8 = string4;
                                if (n15 == 0) {
                                    n27 = (int)(((j30_0)object11).J(string4) ? 1 : 0);
                                    n27 = n27 != 0 ? 4 : 2;
                                    n27 = n10 | n27;
                                } else {
                                    n27 = n10;
                                }
                            }
                            n41 = 2048;
                            if ((n41 &= n20) != 0) {
                                n27 |= 0x30;
                                object20 = string5;
                            } else {
                                n32 = n10 & 0x70;
                                object20 = string5;
                                if (n32 == 0) {
                                    n32 = (int)(((j30_0)object11).J(string5) ? 1 : 0);
                                    n32 = n32 != 0 ? 32 : 16;
                                    n27 |= n32;
                                }
                            }
                            n32 = n27;
                            n27 = 1533916891;
                            n26 = n17 & n27;
                            n43 = 306783378;
                            if (n26 != n43 || (n26 = n32 & 0x5B) != (n43 = 18) || (n26 = (int)(((j30_0)object11).h() ? 1 : 0)) == 0) break block61;
                            ((j30_0)object11).D();
                            l7 = l2;
                            n20 = n3;
                            n19 = n4;
                            object7 = bl2;
                            n17 = n7;
                            l4 = l15;
                            object6 = object9;
                            object5 = object11;
                            object4 = object10;
                            object9 = string4;
                            object11 = string5;
                            break block62;
                        }
                        l14 = n16 != 0 ? (l7 = xx_1.e) : l2;
                        n25 = n39 != 0 ? 0 : n3;
                        n24 = n38 != 0 ? 0 : n4;
                        l12 = n36 != 0 ? (l7 = xx_1.e) : l15;
                        object19 = n44 != 0 ? null : object10;
                        object17 = n19 != 0 ? (object18 = "") : object9;
                        object18 = n30 != 0 ? Boolean.FALSE : bl2;
                        n22 = n29 != 0 ? 0 : n7;
                        string7 = n28 != 0 ? null : string4;
                        string6 = n41 != 0 ? null : string5;
                        object5 = zp.f;
                        object3 = Nc$a.j;
                        object8 = LP1$a.b;
                        n19 = 1065353216;
                        f7 = 1.0f;
                        object4 = j.c((LP1)object8, f7);
                        f6 = 6;
                        n30 = 0;
                        object4 = h.g((LP1)object4, 0.0f, f6, 1);
                        f6 = 7.6E-44f;
                        object5 = iQ2.a((zp$e)object5, (Gx$b)object3, (b30_0)object11, 54);
                        n42 = ((j30_0)object11).P;
                        object9 = ((j30_0)object11).P();
                        object4 = a30_0.c((b30_0)object11, (LP1)object4);
                        object16 = N20.W;
                        object16.getClass();
                        object20 = N20$a.b;
                        object7 = ((j30_0)object11).a;
                        n18 = object7 instanceof mp;
                        if (n18 == 0) {
                            s20.a();
                            throw null;
                        }
                        ((j30_0)object11).A();
                        n18 = (int)(((j30_0)object11).O ? 1 : 0);
                        if (n18 != 0) {
                            ((j30_0)object11).C((Function0)object20);
                        } else {
                            ((j30_0)object11).n();
                        }
                        object10 = N20$a.e;
                        Ow3.a((b30_0)object11, object5, (Function2)object10);
                        object5 = N20$a.d;
                        Ow3.a((b30_0)object11, object9, (Function2)object5);
                        object9 = N20$a.f;
                        n19 = ((j30_0)object11).O;
                        if (n19 != 0) break block63;
                        object15 = ((j30_0)object11).v();
                        object14 = object18;
                        object18 = n42;
                        n43 = Intrinsics.areEqual(object15, object18);
                        if (n43 != 0) break block64;
                        break block65;
                    }
                    object14 = object18;
                }
                rk_0.a(n42, (j30_0)object11, n42, (N20$a$a)object9);
            }
            object18 = N20$a.c;
            Ow3.a((b30_0)object11, object4, (Function2)object18);
            object15 = n25 != 0 ? tv0_0.o : tv0_0.m;
            Object object23 = object15;
            object15 = n24 != 0 ? tv0_0.o : tv0_0.m;
            Object object24 = object15;
            n19 = 1065353216;
            f7 = 1.0f;
            double d2 = f7;
            double d5 = 0.0;
            n27 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
            if (n27 <= 0) {
                object5 = g9_0.a(1.0f, "invalid weight ", "; must be greater than zero");
                object5 = object5.toString();
                object3 = new IllegalArgumentException((String)object5);
                throw object3;
            }
            f7 = kotlin.ranges.f.c(f7, Float.MAX_VALUE);
            object4 = new LayoutWeightElement(f7, true);
            object15 = zp.a;
            n42 = 0;
            f6 = 0.0f;
            object3 = iQ2.a((zp$e)object15, (Gx$b)object3, (b30_0)object11, 0);
            n19 = ((j30_0)object11).P;
            object6 = ((j30_0)object11).P();
            object4 = a30_0.c((b30_0)object11, (LP1)object4);
            n20 = object7 instanceof mp;
            if (n20 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object11).A();
            n20 = ((j30_0)object11).O;
            if (n20 != 0) {
                ((j30_0)object11).C((Function0)object20);
            } else {
                ((j30_0)object11).n();
            }
            Ow3.a((b30_0)object11, object3, (Function2)object10);
            Ow3.a((b30_0)object11, object6, (Function2)object5);
            n28 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n28 != 0 || (n28 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object11).v(), object13 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                rk_0.a(n19, (j30_0)object11, n19, (N20$a$a)object9);
            }
            Ow3.a((b30_0)object11, object4, (Function2)object18);
            if (n22 != 0) {
                boolean bl3;
                float f8;
                n28 = -1239518643;
                f5 = -2.3610366E-6f;
                ((j30_0)object11).K(n28);
                if (string7 != null) {
                    f8 = 4;
                    n28 = 0;
                    f5 = 0.0f;
                    n42 = 11;
                    f6 = 1.5E-44f;
                    n3 = 0;
                    n21 = n42;
                    object3 = h.i((LP1)object8, 0.0f, 0.0f, f8, 0.0f, n42);
                    f8 = 16;
                    object3 = j.h((LP1)object3, f8);
                    f8 = 2;
                    object15 = null;
                    object3 = g.d((LP1)object3, 0.0f, f8, 1);
                    f8 = 2.5E-44f;
                    n20 = n17 >> 18 & 0x70 | 0x180;
                    n19 = 4088;
                    f7 = 5.729E-42f;
                    bl3 = false;
                    object4 = null;
                    n4 = 0;
                    n21 = n20;
                    t63.b(string7, (String)object17, (LP1)object3, null, (b30_0)object11, n20, n19);
                    object3 = Unit.a;
                }
                n28 = 0;
                f5 = 0.0f;
                object3 = null;
                ((j30_0)object11).T(false);
                n20 = 0;
                f8 = 0.0f;
                object13 = null;
                bl3 = true;
            } else {
                n28 = 0;
                f5 = 0.0f;
                object3 = null;
                n20 = -1239117379;
                float f11 = -2.4522735E-6f;
                ((j30_0)object11).K(n20);
                if (object19 == null) {
                    n20 = 0;
                    f11 = 0.0f;
                    object13 = null;
                    boolean bl4 = true;
                } else {
                    object13 = km2.a(((Number)object19).intValue(), (b30_0)object11, 0);
                    f5 = 4;
                    object15 = null;
                    n3 = 0;
                    n21 = 11;
                    object3 = h.i((LP1)object8, 0.0f, 0.0f, f5, 0.0f, n21);
                    f7 = 16;
                    object3 = j.h((LP1)object3, f7);
                    f7 = 2;
                    int n48 = 1;
                    object3 = g.d((LP1)object3, 0.0f, f7, n48);
                    f7 = 2.5E-44f;
                    n19 = n17 >> 18 & 0x70 | 0x188;
                    n42 = 0;
                    f6 = 0.0f;
                    object6 = null;
                    n15 = 0;
                    lP1 = null;
                    n39 = 0;
                    n27 = 0;
                    n38 = 120;
                    n4 = 0;
                    n21 = 0;
                    object = null;
                    object2 = object11;
                    n7 = n38;
                    Pd1.a((im2)object13, (String)object17, (LP1)object3, null, null, 0.0f, null, (b30_0)object11, n19, n38);
                    object3 = Unit.a;
                    n20 = 0;
                    f11 = 0.0f;
                    object13 = null;
                }
                ((j30_0)object11).T(false);
            }
            object3 = zp.c;
            object15 = Nc$a.m;
            object3 = oZ.a((zp$l)object3, (Gx$a)object15, (b30_0)object11, 0);
            n19 = ((j30_0)object11).P;
            object6 = ((j30_0)object11).P();
            object13 = a30_0.c((b30_0)object11, (LP1)object8);
            n30 = object7 instanceof mp;
            if (n30 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object11).A();
            n30 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n30 != 0) {
                ((j30_0)object11).C((Function0)object20);
            } else {
                ((j30_0)object11).n();
            }
            Ow3.a((b30_0)object11, object3, (Function2)object10);
            Ow3.a((b30_0)object11, object6, (Function2)object5);
            n29 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n29 != 0 || (n29 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object11).v(), object3 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                rk_0.a(n19, (j30_0)object11, n19, (N20$a$a)object9);
            }
            Ow3.a((b30_0)object11, object13, (Function2)object18);
            int n49 = 12;
            long l16 = Em3.f(n49);
            av0_0 av0_02 = y20_0.a;
            n29 = n17 & 0xE;
            int n50 = 1575936;
            n28 = n17 >> 9 & 0x380;
            n37 = (n29 |= n50) | n28;
            n27 = 0;
            n38 = 0;
            n28 = 0;
            f5 = 0.0f;
            object3 = null;
            n19 = 0;
            f7 = 0.0f;
            object15 = null;
            long l17 = 0L;
            double d7 = 0.0;
            n26 = 4;
            l15 = l17;
            d2 = d7;
            n30 = 0;
            object7 = null;
            object9 = null;
            n18 = n17;
            n17 = 0;
            string8 = null;
            long l18 = 0L;
            object20 = object11;
            long l19 = l18;
            n16 = 0;
            object16 = null;
            n29 = n18;
            n18 = 0;
            object10 = null;
            n15 = 0;
            lP1 = null;
            n39 = 0;
            n36 = 0;
            tv0_0 tv0_02 = null;
            n35 = 130962;
            int n51 = n29;
            object5 = string2;
            object2 = object8;
            object = object11;
            Object object25 = object14;
            object21 = object23;
            object22 = av0_02;
            Ll3.b(string2, null, l12, l16, null, (tv0_0)object23, av0_02, l17, null, null, l18, 0, false, 0, 0, null, null, (b30_0)object11, n37, 0, n35);
            n29 = 2031706517;
            float f12 = 4.977504E34f;
            object22 = object11;
            ((j30_0)object11).K(n29);
            if (string6 != null && (n29 = string6.length()) != 0) {
                long l20 = Em3.f(10);
                tv0_02 = tv0_0.m;
                long l21 = xx_1.c;
                f12 = 4;
                object3 = null;
                n41 = 0;
                object8 = null;
                n26 = 0;
                object20 = null;
                n43 = 13;
                n4 = 0;
                n21 = n43;
                lP1 = h.i((LP1)object2, 0.0f, f12, 0.0f, 0.0f, n43);
                n29 = n32 >> 3 & 0xE;
                n28 = 1772976;
                f5 = 2.484469E-39f;
                int n52 = n29 | n28;
                n37 = 0;
                l8 = 0L;
                n34 = 0;
                object12 = null;
                n32 = 0;
                long l22 = 0L;
                int n54 = 130960;
                object16 = string6;
                Ll3.b(string6, lP1, l21, l20, null, tv0_02, av0_02, l8, null, null, l22, 0, false, 0, 0, null, null, (b30_0)object11, n52, 0, n54);
            }
            object21 = null;
            ((j30_0)object22).T(false);
            n43 = 1;
            ((j30_0)object22).T(n43 != 0);
            ((j30_0)object22).T(n43 != 0);
            object5 = Boolean.TRUE;
            object13 = object25;
            n29 = (int)(Intrinsics.areEqual(object25, object5) ? 1 : 0);
            if (n29 != 0) {
                ((j30_0)object22).K(-1785885733);
                f12 = 4.5945744E-31f;
                ((j30_0)object22).K(219486779);
                n17 = n51;
                n29 = n51 & 0x70;
                n28 = 32;
                f5 = 4.5E-44f;
                if (n29 == n28) {
                    n41 = 1;
                } else {
                    n41 = 0;
                    object8 = null;
                }
                object5 = ((j30_0)object22).v();
                if (n41 == 0 && object5 != (object3 = b30$a.a)) {
                    object8 = string3;
                } else {
                    object8 = string3;
                    object5 = new ve2_1(string3, 0);
                    ((j30_0)object22).o(object5);
                }
                object5 = (Function1)object5;
                ((j30_0)object22).T(false);
                object3 = object2;
                object3 = CY2.b((LP1)object2, false, (Function1)object5);
                l8 = Em3.f(n49);
                n29 = n17 >> 3 & 0xE | n50;
                n26 = n17 & 0x380;
                n37 = n29 | n26;
                n27 = 0;
                n38 = 0;
                n19 = 0;
                f7 = 0.0f;
                object15 = null;
                l15 = 0L;
                d2 = 0.0;
                n30 = 0;
                object7 = null;
                n17 = 0;
                string8 = null;
                l19 = 0L;
                n18 = 0;
                object10 = null;
                n16 = 0;
                object16 = null;
                n15 = 0;
                lP1 = null;
                n39 = 0;
                n36 = 0;
                tv0_02 = null;
                n35 = 130960;
                object5 = string3;
                object12 = object13;
                l16 = l8;
                object21 = object24;
                object = object22;
                object22 = av0_02;
                Ll3.b(string3, (LP1)object3, l14, l8, null, (tv0_0)object24, av0_02, l15, null, null, l19, 0, false, 0, 0, null, null, (b30_0)object, n37, 0, n35);
                object22 = object;
                object21 = null;
                ((j30_0)object).T(false);
                object5 = object;
            } else {
                object12 = object25;
                n17 = n51;
                f12 = -5.894555E-26f;
                ((j30_0)object22).K(-1785597650);
                l16 = Em3.f(n49);
                n29 = n51 >> 3 & 0xE | n50;
                n28 = n51 & 0x380;
                n37 = n29 | n28;
                n27 = 0;
                n38 = 0;
                n19 = 0;
                f7 = 0.0f;
                object15 = null;
                l15 = 0L;
                d2 = 0.0;
                n30 = 0;
                object7 = null;
                n17 = 0;
                string8 = null;
                l19 = 0L;
                n18 = 0;
                object10 = null;
                n16 = 0;
                object16 = null;
                n15 = 0;
                lP1 = null;
                n39 = 0;
                n36 = 0;
                tv0_02 = null;
                n35 = 130962;
                object5 = string3;
                object21 = object24;
                object = object22;
                object22 = av0_02;
                Ll3.b(string3, null, l14, l16, null, (tv0_0)object24, av0_02, l15, null, null, l19, 0, false, 0, 0, null, null, (b30_0)object, n37, 0, n35);
                object5 = object;
                n28 = 0;
                f5 = 0.0f;
                object3 = null;
                ((j30_0)object).T(false);
            }
            n28 = 1;
            f5 = Float.MIN_VALUE;
            ((j30_0)object5).T(n28 != 0);
            object7 = object12;
            l7 = l14;
            n20 = n25;
            n19 = n24;
            l4 = l12;
            object4 = object19;
            object6 = object17;
            n17 = n22;
            object9 = string7;
            object11 = string6;
        }
        object10 = ((j30_0)object5).X();
        if (object10 != null) {
            object5 = object8;
            object3 = string2;
            Object object26 = object8;
            object8 = string3;
            n18 = n8;
            n16 = n10;
            n15 = n14;
            object3 = object5 = new we2_1(string2, string3, l7, n20 != 0, n19 != 0, l4, (Integer)object4, (String)object6, (Boolean)object7, n17 != 0, (String)object9, (String)object11, n8, n10, n14);
            object5 = object10;
            ((CF2)object10).d = object26;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void u(String var0, ConvenienceFeePriceSplitUp var1_1, qz1_2 var2_2, int var3_3, int var4_4, b30_0 var5_5, int var6_6) {
        block21: {
            block22: {
                block23: {
                    var7_7 = var0;
                    Intrinsics.checkNotNullParameter(var0, "conTotalAmount");
                    var8_8 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "convenienceFee");
                    var9_9 = var2_2;
                    Intrinsics.checkNotNullParameter(var2_2, "viewModel");
                    var10_10 = -2080189518;
                    var11_11 = var5_5;
                    var12_12 = var5_5.g(var10_10);
                    var11_11 = AndroidCompositionLocals_androidKt.b;
                    var11_11 = var12_12.j((H30)var11_11);
                    var13_13 = var11_11 instanceof Activity;
                    if (var13_13 != 0) {
                        var14_14 = var11_11 = (Activity)var11_11;
                    } else {
                        var15_15 = 0;
                        var16_16 = 0.0f;
                        var14_14 = null;
                    }
                    var11_11 = var12_12.v();
                    var17_17 = b30$a.a;
                    if (var11_11 == var17_17) {
                        var11_11 = Qx2.a(ly0_0.f(f.a, (b30_0)var12_12), (j30_0)var12_12);
                    }
                    var11_11 = ((Q30)var11_11).a;
                    var17_17 = LP1$a.b;
                    var18_18 = null;
                    var19_19 = (float)false;
                    var20_20 = 4;
                    var21_21 = var20_20;
                    var22_22 = j.o(h.h((LP1)var17_17, var19_19, var19_19, var19_19, var21_21));
                    var23_23 = zp.c;
                    var24_24 = Nc$a.m;
                    var23_23 = oZ.a((zp$l)var23_23, (Gx$a)var24_24, (b30_0)var12_12, 0);
                    var25_25 = var12_12.P;
                    var26_26 = var12_12.P();
                    var22_22 = a30_0.c((b30_0)var12_12, (LP1)var22_22);
                    N20.W.getClass();
                    var27_27 = N20$a.b;
                    var28_28 = var12_12.a;
                    var29_29 = var28_28 instanceof mp;
                    if (var29_29 == 0) break block21;
                    var12_12.A();
                    var29_29 = var12_12.O;
                    if (var29_29 != 0) {
                        var12_12.C(var27_27);
                    } else {
                        var12_12.n();
                    }
                    var18_18 = N20$a.e;
                    Ow3.a((b30_0)var12_12, var23_23, (Function2)var18_18);
                    var23_23 = N20$a.d;
                    Ow3.a((b30_0)var12_12, var26_26, (Function2)var23_23);
                    var26_26 = N20$a.f;
                    var30_30 = var12_12.O;
                    if (var30_30 != 0 || (var30_30 = Intrinsics.areEqual(var7_7 = var12_12.v(), var8_8 = Integer.valueOf(var25_25))) == 0) {
                        rk_0.a(var25_25, (j30_0)var12_12, var25_25, (N20$a$a)var26_26);
                    }
                    var7_7 = N20$a.c;
                    Ow3.a((b30_0)var12_12, var22_22, (Function2)var7_7);
                    var22_22 = zp.f;
                    var8_8 = Nc$a.k;
                    var25_25 = 1065353216;
                    var31_31 = 1.0f;
                    var24_24 = j.c((LP1)var17_17, var31_31);
                    var9_9 = null;
                    var32_32 = var14_14;
                    var24_24 = h.g((LP1)var24_24, 0.0f, var21_21, 1);
                    var15_15 = 54;
                    var16_16 = 7.6E-44f;
                    var14_14 = iQ2.a((zp$e)var22_22, (Gx$b)var8_8, (b30_0)var12_12, var15_15);
                    var33_33 = var12_12.P;
                    var8_8 = var12_12.P();
                    var24_24 = a30_0.c((b30_0)var12_12, (LP1)var24_24);
                    var34_34 = var28_28 instanceof mp;
                    if (var34_34 == 0) break block22;
                    var12_12.A();
                    var34_34 = var12_12.O;
                    if (var34_34 != 0) {
                        var12_12.C(var27_27);
                    } else {
                        var12_12.n();
                    }
                    Ow3.a((b30_0)var12_12, var14_14, (Function2)var18_18);
                    Ow3.a((b30_0)var12_12, var8_8, (Function2)var23_23);
                    var15_15 = (int)var12_12.O;
                    if (var15_15 != 0 || (var15_15 = (int)Intrinsics.areEqual(var14_14 = var12_12.v(), var8_8 = Integer.valueOf(var33_33))) == 0) {
                        rk_0.a(var33_33, (j30_0)var12_12, var33_33, (N20$a$a)var26_26);
                    }
                    Ow3.a((b30_0)var12_12, var24_24, (Function2)var7_7);
                    var14_14 = var1_1.getTotal();
                    if (var14_14 != null) {
                        var16_16 = var14_14.getNetAmount();
                        var22_22 = Unit.a;
                    } else {
                        var15_15 = 0;
                        var16_16 = 0.0f;
                        var14_14 = null;
                    }
                    var35_35 = xx_1.t;
                    var33_33 = 0;
                    var22_22 = null;
                    cfr_temp_0 = var16_16 - 0.0f;
                    var15_15 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var15_15 > 0) {
                        var37_36 = var35_35 = xx_1.e;
                        var8_8 = var0;
                    } else {
                        var22_22 = "Free";
                        var37_36 = var35_35;
                        var8_8 = var22_22;
                    }
                    var22_22 = zp.a;
                    var9_9 = Nc$a.j;
                    var25_25 = 0;
                    var31_31 = 0.0f;
                    var22_22 = iQ2.a((zp$e)var22_22, (Gx$b)var9_9, (b30_0)var12_12, 0);
                    var34_34 = var12_12.P;
                    var24_24 = var12_12.P();
                    var39_37 = var8_8;
                    var8_8 = a30_0.c((b30_0)var12_12, (LP1)var17_17);
                    var40_38 = var28_28 instanceof mp;
                    if (var40_38 == 0) break block23;
                    var12_12.A();
                    var40_38 = var12_12.O;
                    if (var40_38 != 0) {
                        var12_12.C(var27_27);
                    } else {
                        var12_12.n();
                    }
                    Ow3.a((b30_0)var12_12, var22_22, (Function2)var18_18);
                    Ow3.a((b30_0)var12_12, var24_24, (Function2)var23_23);
                    var33_33 = (int)var12_12.O;
                    if (var33_33 != 0 || (var33_33 = (int)Intrinsics.areEqual(var22_22 = var12_12.v(), var18_18 = Integer.valueOf(var34_34))) == 0) {
                        rk_0.a(var34_34, (j30_0)var12_12, var34_34, (N20$a$a)var26_26);
                    }
                    Ow3.a((b30_0)var12_12, var8_8, (Function2)var7_7);
                    var30_30 = R$string.convenience_fee_title;
                    var23_23 = nk_0.f((b30_0)var12_12, var30_30);
                    var30_30 = 12;
                    var41_39 = Em3.f(var30_30);
                    var8_8 = tv0_0.m;
                    var43_40 = xx_1.e;
                    var45_41 = 200064;
                    var25_25 = 0;
                    var31_31 = 0.0f;
                    var24_24 = null;
                    var29_29 = 0;
                    var18_18 = null;
                    var46_42 = 0L;
                    var48_43 = 0L;
                    var50_44 = 131026;
                    var51_45 = var8_8;
                    Ll3.b((String)var23_23, null, var43_40, var41_39, null, (tv0_0)var8_8, null, var46_42, null, null, var48_43, 0, false, 0, 0, null, null, (b30_0)var12_12, var45_41, 0, var50_44);
                    var33_33 = -1982102619;
                    var12_12.K(var33_33);
                    if (var15_15 <= 0) ** GOTO lbl-1000
                    var14_14 = cp_1.Companion;
                    var14_14.getClass();
                    var15_15 = (int)cp$a.w();
                    if (var15_15 != 0) {
                        var9_9 = h.h((LP1)var17_17, var21_21, var19_19, var19_19, var19_19);
                        var52_46 = var11_11;
                        var52_46 = (c80)var11_11;
                        var17_17 = var23_23;
                        var53_47 = true;
                        var14_14 = var32_32;
                        var22_22 = var1_1;
                        var26_26 = null;
                        var29_29 = var3_3;
                        var25_25 = 0;
                        var31_31 = 0.0f;
                        var40_38 = var4_4;
                        var23_23 = new ke2_1((c80)var52_46, (Activity)var32_32, var2_2, var1_1, var3_3, var4_4);
                        var24_24 = d.b((LP1)var9_9, false, null, (Function0)var23_23, 7);
                        var13_13 = R$string.whats_this_text;
                        var23_23 = nk_0.f((b30_0)var12_12, var13_13);
                        var41_39 = Em3.f(var30_30);
                        var51_45 = tv0_0.o;
                        var54_48 = xx_1.G;
                        var45_41 = 200064;
                        var46_42 = 0L;
                        var48_43 = 0L;
                        var50_44 = 131024;
                        var15_15 = 0;
                        var16_16 = 0.0f;
                        var14_14 = null;
                        Ll3.b((String)var23_23, (LP1)var24_24, var54_48, var41_39, null, (tv0_0)var51_45, null, var46_42, null, null, var48_43, 0, false, 0, 0, null, null, (b30_0)var12_12, var45_41, 0, var50_44);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var53_47 = true;
                        var15_15 = 0;
                        var16_16 = 0.0f;
                        var14_14 = null;
                    }
                    var12_12.T(false);
                    var12_12.T(var53_47);
                    var41_39 = Em3.f(var30_30);
                    var45_41 = 199680;
                    var25_25 = 0;
                    var31_31 = 0.0f;
                    var24_24 = null;
                    var46_42 = 0L;
                    var48_43 = 0L;
                    var50_44 = 131026;
                    var23_23 = var39_37;
                    var51_45 = var8_8;
                    Ll3.b((String)var39_37, null, var37_36, var41_39, null, (tv0_0)var8_8, null, var46_42, null, null, var48_43, 0, false, 0, 0, null, null, (b30_0)var12_12, var45_41, 0, var50_44);
                    var12_12.T(var53_47);
                    var12_12.K(-751473674);
                    var17_17 = cp_1.Companion;
                    var17_17.getClass();
                    var13_13 = (int)cp$a.w();
                    if (var13_13 != 0 && (var13_13 = (int)Intrinsics.areEqual(var17_17 = cp$a.n(), var52_46 = "")) == 0) {
                        var17_17 = Locale.ROOT;
                        var22_22 = var39_37;
                        var17_17 = var39_37.toLowerCase((Locale)var17_17);
                        Intrinsics.checkNotNullExpressionValue(var17_17, "toLowerCase(...)");
                        var52_46 = "free";
                        var13_13 = (int)Intrinsics.areEqual(var17_17, var52_46);
                        if (var13_13 == 0) {
                            var23_23 = cp$a.n();
                            var41_39 = Em3.f(var30_30);
                            var45_41 = 200064;
                            var25_25 = 0;
                            var31_31 = 0.0f;
                            var24_24 = null;
                            var46_42 = 0L;
                            var48_43 = 0L;
                            var50_44 = 131026;
                            Ll3.b((String)var23_23, null, var43_40, var41_39, null, (tv0_0)var8_8, null, var46_42, null, null, var48_43, 0, false, 0, 0, null, null, (b30_0)var12_12, var45_41, 0, var50_44);
                        }
                    }
                    if ((var12_12 = fn0_2.a((j30_0)var12_12, false, var53_47)) != null) {
                        var11_11 = var18_18;
                        var7_7 = var0;
                        var17_17 = var1_1;
                        var52_46 = var2_2;
                        var15_15 = var3_3;
                        var20_20 = var4_4;
                        var33_33 = var6_6;
                        var12_12.d = var18_18 = new le2_1(var0, var1_1, var2_2, var3_3, var4_4, var6_6);
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void v(String string2, String string3, String string4, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        String string5;
        Intrinsics.checkNotNullParameter(string3, "address");
        Intrinsics.checkNotNullParameter(string4, "phone");
        int n4 = 1476224667;
        object = object.g(n4);
        Object object2 = selectedOrderItem.getCartDeliveryAddress();
        String string6 = V4.a((CartDeliveryAddress)object2);
        String string7 = object2 != null && (string5 = ((CartDeliveryAddress)object2).getFirstName()) != null ? string5 : string2;
        Object object3 = object2 != null && (object2 = ((CartDeliveryAddress)object2).getPhone()) != null ? object2 : string4;
        n4 = R$string.pickupaddress;
        string5 = nk_0.f((b30_0)object, n4);
        fd2_1 fd2_12 = null;
        de2_0.h(string5, string7, string6, (String)object3, (b30_0)object, 0);
        object = ((j30_0)object).X();
        if (object != null) {
            object2 = fd2_12;
            string5 = string2;
            string7 = string3;
            string6 = string4;
            object3 = selectedOrderItem;
            fd2_12 = new fd2_1(string2, string3, string4, selectedOrderItem, n3);
            ((CF2)object).d = fd2_12;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void w(String string2, String string3, String string4, String string5, String string6, float f5, boolean bl2, boolean bl3, qz1_2 qz1_22, Product product, CartEntry cartEntry, CartOrder cartOrder, SelectedOrderItem selectedOrderItem, boolean bl4, b30_0 b30_02, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string6, "price");
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = -1108884977;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        Object object3 = new Ref$IntRef();
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        boolean bl5 = object instanceof Activity;
        int n8 = 0;
        float f6 = 0.0f;
        Object object4 = null;
        Object object5 = bl5 ? (object = (Activity)object) : null;
        object = ((j30_0)object2).v();
        Object object6 = b30$a.a;
        if (object == object6) {
            object = Qx2.a(ly0_0.f(f.a, (b30_0)object2), (j30_0)object2);
        }
        object = ((Q30)object).a;
        qz1_22.getClass();
        if (cartOrder != null && (object6 = cartOrder.getConvenienceFee()) != null && (object6 = ((ConvenienceFeePriceSplitUp)object6).getTotal()) != null) {
            float f7 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
            object6 = qz2_0.u(f7);
        } else {
            object6 = "";
        }
        Object object7 = object6;
        object6 = LP1$a.b;
        long l2 = xx_1.m;
        Object object8 = fg2_1.a;
        object8 = a.b((LP1)object6, l2, (i13)object8);
        float f8 = 1.0f;
        object8 = j.c((LP1)object8, f8);
        Object object9 = HA.e(Nc$a.a, false);
        int n10 = ((j30_0)object2).P;
        Object object10 = ((j30_0)object2).P();
        object8 = a30_0.c((b30_0)object2, (LP1)object8);
        N20.W.getClass();
        Object object11 = N20$a.b;
        Object object12 = ((j30_0)object2).a;
        boolean bl6 = object12 instanceof mp;
        if (!bl6) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n8 = ((j30_0)object2).O;
        if (n8 != 0) {
            ((j30_0)object2).C((Function0)object11);
        } else {
            ((j30_0)object2).n();
        }
        object4 = N20$a.e;
        Ow3.a((b30_0)object2, object9, (Function2)object4);
        object4 = N20$a.d;
        Ow3.a((b30_0)object2, object10, (Function2)object4);
        object4 = N20$a.f;
        boolean bl7 = ((j30_0)object2).O;
        if (bl7 || !(bl7 = Intrinsics.areEqual(object9 = ((j30_0)object2).v(), object10 = Integer.valueOf(n10)))) {
            rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object4);
        }
        object4 = N20$a.c;
        Ow3.a((b30_0)object2, object8, (Function2)object4);
        n8 = 16;
        f6 = n8;
        object6 = h.e((LP1)object6, f6);
        long l3 = OX.f;
        object9 = SP2.a(10);
        object6 = j.c(a.b((LP1)object6, l3, (i13)object9), f8);
        Object object13 = object;
        object13 = (c80)object;
        n10 = (int)(bl4 ? 1 : 0);
        object10 = cartEntry;
        object11 = selectedOrderItem;
        object12 = qz1_22;
        Object object14 = product;
        object4 = new ze2_0(f5, (String)object7, (Ref$IntRef)object3, bl4, cartEntry, selectedOrderItem, qz1_22, product, bl2, bl3, (Activity)object5, (c80)object13, string2, string3, string4, string5);
        object3 = v10.c(-1042246677, (fx0_2)object4, (b30_0)object2);
        bl7 = false;
        object9 = null;
        object7 = null;
        int n14 = 3072;
        int n15 = 6;
        OA.a((LP1)object6, null, false, (u10)object3, (b30_0)object2, n14, n15);
        boolean bl8 = true;
        ((j30_0)object2).T(bl8);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            object = object14;
            object6 = string2;
            object4 = string3;
            object8 = string4;
            f8 = f5;
            bl7 = bl2;
            object3 = qz1_22;
            object11 = cartOrder;
            object12 = selectedOrderItem;
            ((CF2)object2).d = object14 = new ud2_2(string2, string3, string4, string5, string6, f5, bl2, bl3, qz1_22, product, cartEntry, cartOrder, selectedOrderItem, bl4, n3, n4);
        }
    }

    public static final void x(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        qz1_2 qz1_23 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = 577765300;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = zp.f;
        Object object3 = Nc$a.k;
        Object object4 = LP1$a.b;
        float f5 = 1.0f;
        Object object5 = j.c((LP1)object4, f5);
        int n7 = 16;
        float f6 = n7;
        object5 = h.e((LP1)object5, f6);
        int n8 = 54;
        f6 = 7.6E-44f;
        Object object6 = iQ2.a((zp$e)object, (Gx$b)object3, (b30_0)object2, n8);
        int n10 = ((j30_0)object2).P;
        Object object7 = ((j30_0)object2).P();
        object5 = a30_0.c((b30_0)object2, (LP1)object5);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        boolean bl2 = mp2 instanceof mp;
        if (bl2) {
            Object object8;
            Object object9;
            ((j30_0)object2).A();
            bl2 = ((j30_0)object2).O;
            if (bl2) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object2, object6, n20$a$b);
            object6 = N20$a.d;
            Ow3.a((b30_0)object2, object7, (Function2)object6);
            object7 = N20$a.f;
            boolean bl3 = ((j30_0)object2).O;
            if (bl3 || (n7 = (int)(Intrinsics.areEqual(object9 = ((j30_0)object2).v(), object8 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object7);
            }
            object8 = N20$a.c;
            Ow3.a((b30_0)object2, object5, (Function2)object8);
            object5 = j.o((LP1)object4);
            object = iQ2.a((zp$e)object, (Gx$b)object3, (b30_0)object2, n8);
            int n14 = ((j30_0)object2).P;
            Object object10 = ((j30_0)object2).P();
            object5 = a30_0.c((b30_0)object2, (LP1)object5);
            n10 = mp2 instanceof mp;
            if (n10 != 0) {
                ((j30_0)object2).A();
                n10 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n10 != 0) {
                    ((j30_0)object2).C(xp1$a);
                } else {
                    ((j30_0)object2).n();
                }
                Ow3.a((b30_0)object2, object, n20$a$b);
                Ow3.a((b30_0)object2, object10, (Function2)object6);
                int n15 = ((j30_0)object2).O;
                if (n15 != 0 || (n15 = Intrinsics.areEqual(object = ((j30_0)object2).v(), object10 = Integer.valueOf(n14))) == 0) {
                    rk_0.a(n14, (j30_0)object2, n14, (N20$a$a)object7);
                }
                Ow3.a((b30_0)object2, object5, (Function2)object8);
                n15 = R$string.rated_text;
                object = nk_0.f((b30_0)object2, n15);
                Object object11 = tv0_0.o;
                long l2 = Em3.f(16);
                long l3 = xx_1.e;
                int n16 = 200064;
                object7 = null;
                long l4 = 0L;
                bl2 = false;
                n20$a$b = null;
                bl3 = false;
                object9 = null;
                long l7 = 0L;
                int n17 = 131026;
                LP1$a lP1$a = object4;
                object4 = object11;
                object11 = object2;
                Ll3.b((String)object, null, l3, l2, null, (tv0_0)object4, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n16, 0, n17);
                object = new pe2_2(qz1_23, selectedOrderItem2);
                float f7 = 8;
                object5 = lP1$a;
                object3 = h.e(lP1$a, f7);
                object5 = new ha0_1(1, qz1_23, selectedOrderItem2);
                object8 = object2;
                b.a((Function1)object, (LP1)object3, (Function1)object5, (b30_0)object2, 48, 0);
                boolean bl4 = true;
                ((j30_0)object2).T(bl4);
                n15 = R$drawable.down_arrow;
                f7 = 0.0f;
                object = km2.a(n15, (b30_0)object2, 0);
                n14 = R$string.acc_icon_down_arrow_icon;
                object3 = nk_0.f((b30_0)object2, n14);
                object6 = null;
                n10 = 0;
                f5 = 0.0f;
                object5 = null;
                n7 = 0;
                object8 = null;
                n8 = 0;
                f6 = 0.0f;
                object10 = null;
                int n18 = 8;
                int n19 = 124;
                object4 = object2;
                Pd1.a((im2)object, (String)object3, null, null, null, 0.0f, null, (b30_0)object2, n18, n19);
                ((j30_0)object2).T(bl4);
                object2 = ((j30_0)object2).X();
                if (object2 != null) {
                    n14 = n3;
                    ((CF2)object2).d = object = new qe2_2(qz1_23, selectedOrderItem2, n3);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void y(qz1_2 qz1_22, Product product, SelectedOrderItem selectedOrderItem, b30_0 arrayList, int n3) {
        float f5;
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2;
        boolean bl4;
        qz1_2 qz1_23 = qz1_22;
        Product product2 = product;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Object object3 = "viewModel";
        Intrinsics.checkNotNullParameter(qz1_22, (String)object3);
        int n4 = -61441739;
        Object object4 = arrayList;
        j30_0 j30_02 = arrayList.g(n4);
        Object object5 = LP1$a.b;
        int n7 = 1065353216;
        float f6 = 1.0f;
        object4 = j.c((LP1)object5, f6);
        Object object6 = zp.c;
        Object object7 = Nc$a.m;
        Object object8 = null;
        object6 = oZ.a((zp$l)object6, (Gx$a)object7, j30_02, 0);
        int n8 = j30_02.P;
        Object object9 = j30_02.P();
        object4 = a30_0.c(j30_02, (LP1)object4);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = j30_02.a;
        int n10 = object11 instanceof mp;
        if (n10 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n10 = j30_02.O;
        if (n10 != 0) {
            j30_02.C((Function0)object10);
        } else {
            j30_02.n();
        }
        object8 = N20$a.e;
        Ow3.a(j30_02, object6, (Function2)object8);
        object6 = N20$a.d;
        Ow3.a(j30_02, object9, (Function2)object6);
        object9 = N20$a.f;
        boolean bl5 = j30_02.O;
        if (bl5 || !(bl4 = Intrinsics.areEqual(object2 = j30_02.v(), object = Integer.valueOf(n8)))) {
            rk_0.a(n8, j30_02, n8, (N20$a$a)object9);
        }
        object2 = N20$a.c;
        Ow3.a(j30_02, object4, (Function2)object2);
        object = zp.f;
        Object object12 = Nc$a.k;
        int n14 = 1065353216;
        Object object13 = j.c((LP1)object5, 1.0f);
        Object object14 = object3;
        float f7 = 12;
        float f8 = 16;
        int n15 = 8;
        Object object15 = null;
        object4 = h.i((LP1)object13, f8, f7, f8, 0.0f, n15);
        Gx$a gx$a = object7;
        object7 = iQ2.a((zp$e)object, (Gx$b)object12, j30_02, 54);
        int n16 = j30_02.P;
        Gx$b gx$b = object12;
        object12 = j30_02.P();
        object4 = a30_0.c(j30_02, (LP1)object4);
        Object object16 = object;
        n7 = object11 instanceof mp;
        if (n7 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n7 = (int)(j30_02.O ? 1 : 0);
        if (n7 != 0) {
            j30_02.C((Function0)object10);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object7, (Function2)object8);
        Ow3.a(j30_02, object12, (Function2)object6);
        n8 = (int)(j30_02.O ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object12 = j30_02.v(), object = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
            rk_0.a(n16, j30_02, n16, (N20$a$a)object9);
        }
        Ow3.a(j30_02, object4, (Function2)object2);
        int n17 = R$string.rating_title;
        object4 = nk_0.f(j30_02, n17);
        object3 = tv0_0.o;
        long l2 = Em3.f(16);
        long l3 = xx_1.e;
        int n18 = 200064;
        Iterator iterator = object6;
        Object object17 = object9;
        mp mp2 = object11;
        long l4 = 0L;
        object12 = object10;
        long l7 = l4;
        Object object18 = null;
        Object object19 = null;
        long l8 = 0L;
        n15 = 0;
        Object object20 = null;
        int n19 = 131026;
        N20$a$b n20$a$b = object8;
        Xp1$a xp1$a = object10;
        long l12 = l3;
        Gx$a gx$a2 = gx$a;
        Object object21 = object5;
        object5 = object3;
        Object object22 = j30_02;
        Ll3.b((String)object4, null, l3, l2, null, (tv0_0)object3, null, l4, null, null, l8, 0, false, 0, 0, null, null, j30_02, n18, 0, n19);
        object4 = km2.a(R$drawable.arrow_up, j30_02, 0);
        int n20 = R$string.acc_up_arrow_icon;
        object6 = hv3_0.K(n20);
        object7 = null;
        float f11 = 0.0f;
        n10 = 0;
        object12 = null;
        object = null;
        int n21 = 8;
        int n22 = 124;
        object5 = j30_02;
        arrayList = object3;
        boolean bl6 = false;
        object3 = null;
        Pd1.a((im2)object4, (String)object6, null, null, null, 0.0f, null, j30_02, n21, n22);
        boolean bl7 = true;
        f7 = Float.MIN_VALUE;
        j30_02.T(bl7);
        object5 = object21;
        f6 = 1.0f;
        object4 = j.c((LP1)object21, f6);
        int n24 = 10;
        float f12 = n24;
        object4 = h.h((LP1)object4, f8, f12, f8, f8);
        object8 = gx$b;
        object6 = object16;
        float f14 = 7.6E-44f;
        object9 = iQ2.a((zp$e)object16, gx$b, j30_02, 54);
        n8 = j30_02.P;
        object11 = j30_02.P();
        object4 = a30_0.c(j30_02, (LP1)object4);
        object10 = mp2;
        n7 = mp2 instanceof mp;
        if (n7 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n7 = (int)(j30_02.O ? 1 : 0);
        if (n7 != 0) {
            object = xp1$a;
            j30_02.C(xp1$a);
        } else {
            object = xp1$a;
            j30_02.n();
        }
        object7 = n20$a$b;
        Ow3.a(j30_02, object9, n20$a$b);
        object9 = iterator;
        Ow3.a(j30_02, object11, (Function2)((Object)iterator));
        n21 = (int)(j30_02.O ? 1 : 0);
        if (n21 != 0 || !(bl3 = Intrinsics.areEqual(object11 = j30_02.v(), object3 = Integer.valueOf(n8)))) {
            object3 = object17;
            rk_0.a(n8, j30_02, n8, (N20$a$a)object17);
        } else {
            object3 = object17;
        }
        Ow3.a(j30_02, object4, (Function2)object2);
        object4 = j.o((LP1)object5);
        n8 = 54;
        f14 = 7.6E-44f;
        object6 = iQ2.a((zp$e)object6, (Gx$b)object8, j30_02, n8);
        n10 = j30_02.P;
        object12 = j30_02.P();
        object4 = a30_0.c(j30_02, (LP1)object4);
        n21 = object10 instanceof mp;
        if (n21 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n21 = (int)(j30_02.O ? 1 : 0);
        if (n21 != 0) {
            j30_02.C((Function0)object);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object6, (Function2)object7);
        Ow3.a(j30_02, object12, (Function2)object9);
        n20 = (int)(j30_02.O ? 1 : 0);
        if (n20 != 0 || (n20 = (int)(Intrinsics.areEqual(object6 = j30_02.v(), object12 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
            rk_0.a(n10, j30_02, n10, (N20$a$a)object3);
        }
        Ow3.a(j30_02, object4, (Function2)object2);
        int n25 = R$string.rated_text;
        object4 = nk_0.f(j30_02, n25);
        object2 = tv0_0.m;
        int n26 = 14;
        l2 = Em3.f(n26);
        l12 = xx_1.H;
        object3 = object10;
        l7 = 0L;
        object21 = object5;
        object5 = object2;
        object22 = j30_02;
        Ll3.b((String)object4, null, l12, l2, null, (tv0_0)object2, null, l7, null, null, 0L, 0, false, 0, 0, null, null, j30_02, 200064, 0, 131026);
        object2 = new fe2_2(qz1_23, selectedOrderItem2);
        f11 = 8;
        n8 = 0;
        f14 = 0.0f;
        object = null;
        n10 = 0;
        object4 = object21;
        f12 = f11;
        object6 = h.i((LP1)object21, f11, 0.0f, 0.0f, 0.0f, 14);
        object8 = new ge2_0(qz1_23, selectedOrderItem2);
        n7 = 48;
        f6 = 6.7E-44f;
        n24 = 0;
        object7 = null;
        object4 = object2;
        object12 = j30_02;
        b.a((Function1)object2, (LP1)object6, (Function1)object8, j30_02, n7, 0);
        j30_02.T(true);
        int n27 = R$string.rating_edit_feedback;
        object4 = nk_0.f(j30_02, n27);
        int n28 = 12;
        float f15 = 1.7E-44f;
        l2 = Em3.f(n28);
        l12 = xx_1.h;
        object2 = new he2_1(qz1_23);
        n20 = 7;
        f12 = 9.8E-45f;
        object10 = object21;
        object6 = d.b((LP1)object21, false, null, (Function0)object2, n20);
        object2 = new nV0(0);
        n18 = 200064;
        n21 = 0;
        object11 = null;
        l4 = 0L;
        object5 = object21;
        l7 = l4;
        object18 = null;
        object19 = null;
        l8 = 0L;
        n15 = 0;
        object20 = null;
        n19 = 131008;
        float f16 = f11;
        object9 = object2;
        object2 = object21;
        object5 = arrayList;
        Ll3.b((String)object4, (LP1)object6, l12, l2, (nV0)object9, (tv0_0)((Object)arrayList), null, l4, null, null, l8, 0, false, 0, 0, null, null, j30_02, n18, 0, n19);
        float f17 = f8;
        product2 = product;
        de2_0.k(qz1_23, product, selectedOrderItem2, j30_02, 584);
        j30_02.T(true);
        int n29 = 203697199;
        f7 = 1.2647396E-31f;
        j30_02.K(n29);
        object4 = qz1_23.t(selectedOrderItem2);
        if (object4 == null || (bl2 = object4.isEmpty()) || (object10 = qz1_23.t(selectedOrderItem2)) == null) {
            f5 = f17;
            n20 = 0;
            f12 = 0.0f;
            object6 = null;
            n10 = 8;
        } else {
            qz1_23.r(selectedOrderItem2);
            Intrinsics.checkNotNullParameter(object10, "ratingsList");
            object4 = object14;
            Intrinsics.checkNotNullParameter(qz1_23, (String)object14);
            object4 = AnalyticsManager.Companion;
            object6 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
            object8 = "order details screen";
            ((GTMEvents)object6).setScreenName((String)object8);
            ((AnalyticsManager$Companion)object4).getInstance().getNewEEcommerceEventsRevamp().setPrevScreen("order listing screen");
            f12 = 1.4E-44f;
            n20 = yx_2.o((Iterable)object10, 10);
            object4 = new ArrayList(n20);
            object6 = object10.iterator();
            while ((n10 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                object8 = ((UserSubRating)object6.next()).title;
                ((ArrayList)object4).add(object8);
            }
            object4 = ((ArrayList)object4).iterator();
            n10 = 0;
            object8 = null;
            while ((n20 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object6 = object4.next();
                n8 = 1;
                f14 = Float.MIN_VALUE;
                n7 = n10 + 1;
                if (n10 < 0) {
                    xx_2.n();
                    throw null;
                }
                object13 = object6;
                object13 = (String)object6;
                object6 = LD2.a;
                Intrinsics.checkNotNull(object13);
                object6 = (UserSubRating)CollectionsKt.N(n10, (List)object10);
                if (object6 == null || (object6 = ((UserSubRating)object6).subQuestionText) == null) {
                    object6 = "";
                }
                object18 = object6;
                object6 = (CartOrder)qz1_23.l.getValue();
                object19 = object6 != null ? (object6 = ((CartOrder)object6).getCode()) : null;
                object6 = qz1_2.l(selectedOrderItem);
                Object object23 = object6 != null && (object6 = ((CartEntry)object6).getProduct()) != null ? (object6 = ((Product)object6).getProductTD()) : null;
                object6 = qz1_2.l(selectedOrderItem);
                if (object6 != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
                    object20 = object6 = ((Product)object6).getBrickCategory();
                } else {
                    n15 = 0;
                    object20 = null;
                }
                object6 = qz1_2.l(selectedOrderItem);
                object15 = object6 != null && (object6 = ((CartEntry)object6).getProduct()) != null ? (object6 = ((Product)object6).getBrandName()) : null;
                LD2.f((String)object13, (String)object18, (String)object19, (String)object23, object15, (String)object20);
                n10 = n7;
            }
            int n30 = R$string.rating_customer_impression;
            object22 = nk_0.f(j30_02, n30);
            object14 = tv0_0.o;
            int n32 = 12;
            f7 = 1.7E-44f;
            long l14 = Em3.f(n32);
            long l15 = xx_1.e;
            n7 = 0;
            object4 = object2;
            f12 = f17;
            f14 = f17;
            object6 = h.i((LP1)object2, f17, 0.0f, f17, 0.0f, 10);
            n18 = 200112;
            f11 = 0.0f;
            object9 = null;
            n21 = 0;
            object11 = null;
            Object object24 = object10;
            l7 = 0L;
            object18 = null;
            object19 = null;
            l8 = 0L;
            n15 = 0;
            object20 = null;
            n19 = 131024;
            object4 = object22;
            l12 = l15;
            l2 = l14;
            f5 = f17;
            object5 = object14;
            object22 = j30_02;
            Ll3.b((String)object4, (LP1)object6, l15, l14, null, (tv0_0)object14, null, l7, null, null, l8, 0, false, 0, 0, null, null, j30_02, n18, 0, n19);
            object4 = object2;
            f6 = f16;
            object4 = h.i((LP1)object2, 0.0f, 0.0f, 0.0f, f16, 7);
            n20 = 1065353216;
            f12 = 1.0f;
            object4 = j.c((LP1)object4, f12);
            object6 = zp.c;
            object8 = gx$a2;
            n8 = 0;
            f14 = 0.0f;
            object6 = oZ.a((zp$l)object6, gx$a2, j30_02, 0);
            n10 = j30_02.P;
            object12 = j30_02.P();
            object4 = a30_0.c(j30_02, (LP1)object4);
            N20.W.getClass();
            object = N20$a.b;
            n24 = object3 instanceof mp;
            if (n24 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n24 = (int)(j30_02.O ? 1 : 0);
            if (n24 != 0) {
                j30_02.C((Function0)object);
            } else {
                j30_02.n();
            }
            object = N20$a.e;
            Ow3.a(j30_02, object6, (Function2)object);
            object6 = N20$a.d;
            Ow3.a(j30_02, object12, (Function2)object6);
            object6 = N20$a.f;
            n8 = (int)(j30_02.O ? 1 : 0);
            if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object12 = j30_02.v(), object = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                rk_0.a(n10, j30_02, n10, (N20$a$a)object6);
            }
            object6 = N20$a.c;
            Ow3.a(j30_02, object4, (Function2)object6);
            int n34 = 609222344;
            f7 = 4.5101778E-17f;
            j30_02.K(n34);
            object4 = object24.iterator();
            while ((n20 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object6 = (UserSubRating)object4.next();
                n10 = 8;
                de2_0.Q((UserSubRating)object6, j30_02, n10);
            }
            n20 = 0;
            f12 = 0.0f;
            object6 = null;
            n10 = 8;
            j30_02.T(false);
            boolean bl8 = true;
            f7 = Float.MIN_VALUE;
            j30_02.T(bl8);
            object4 = Unit.a;
        }
        j30_02.T(false);
        f7 = 1.268257E-31f;
        j30_02.K(203727121);
        boolean bl9 = h40_0.l2();
        if (bl9) {
            if (selectedOrderItem2 != null && (object4 = selectedOrderItem.getCartEntry()) != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
                object4 = ((Product)object4).getCode();
            } else {
                boolean bl10 = false;
                f7 = 0.0f;
                object4 = null;
            }
            object6 = (CartOrder)qz1_23.l.getValue();
            if (object6 != null) {
                object6 = ((CartOrder)object6).ratings;
            } else {
                n20 = 0;
                f12 = 0.0f;
                object6 = null;
            }
            if (object6 != null) {
                block49: {
                    object6 = object6.iterator();
                    while ((n8 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                        object = object12 = object6.next();
                        object = ((Rating)object12).skuId;
                        n7 = (int)(Intrinsics.areEqual(object, object4) ? 1 : 0);
                        if (n7 == 0) continue;
                        break block49;
                    }
                    n8 = 0;
                    f14 = 0.0f;
                    object12 = null;
                }
                object4 = object12;
                object4 = (Rating)object12;
            } else {
                boolean bl11 = false;
                f7 = 0.0f;
                object4 = null;
            }
            if (object4 != null) {
                object6 = ((Rating)object4).review;
            } else {
                n20 = 0;
                f12 = 0.0f;
                object6 = null;
            }
            if (object6 != null) {
                f14 = qz1_23.r(selectedOrderItem2);
                object12 = Float.valueOf(f14);
                ((UserReviewModel)object6).setRating((Float)object12);
            }
            if (object4 != null) {
                object4 = ((Rating)object4).review;
            } else {
                boolean bl12 = false;
                f7 = 0.0f;
                object4 = null;
            }
            if (object4 != null) {
                f12 = f5;
                object2 = h.h((LP1)object2, f5, f5, f5, f5);
                object6 = Nc$a.a;
                f14 = 0.0f;
                object12 = null;
                object6 = HA.e((Nc)object6, false);
                n8 = j30_02.P;
                object = j30_02.P();
                object2 = a30_0.c(j30_02, (LP1)object2);
                N20.W.getClass();
                object7 = N20$a.b;
                boolean bl13 = object3 instanceof mp;
                if (!bl13) {
                    s20.a();
                    throw null;
                }
                j30_02.A();
                boolean bl14 = j30_02.O;
                if (bl14) {
                    j30_02.C((Function0)object7);
                } else {
                    j30_02.n();
                }
                object3 = N20$a.e;
                Ow3.a(j30_02, object6, (Function2)object3);
                object3 = N20$a.d;
                Ow3.a(j30_02, object, (Function2)object3);
                object3 = N20$a.f;
                n20 = (int)(j30_02.O ? 1 : 0);
                if (n20 != 0 || (n20 = (int)(Intrinsics.areEqual(object6 = j30_02.v(), object = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    rk_0.a(n8, j30_02, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a(j30_02, object2, (Function2)object3);
                ba2_1.a((UserReviewModel)object4, j30_02, n10);
                boolean bl15 = true;
                j30_02.T(bl15);
                f15 = qz1_23.r(selectedOrderItem2);
                object2 = de2_0.U(qz1_23, product2, f15, selectedOrderItem2);
                object3 = LD2.a;
                object3 = ((RatingsModel)object2).getOrderId();
                object4 = ((RatingsModel)object2).getSkuId();
                object6 = ((RatingsModel)object2).getBrandName();
                object2 = ((RatingsModel)object2).getProductBrick();
                LD2.e((String)object3, (String)object4, (String)object6, (String)object2);
                object2 = Unit.a;
            }
        }
        boolean bl16 = false;
        f15 = 0.0f;
        object2 = null;
        boolean bl17 = true;
        object2 = fn0_2.a(j30_02, false, bl17);
        if (object2 != null) {
            n4 = n3;
            ((CF2)object2).d = object3 = new ie2_0(qz1_23, product2, selectedOrderItem2, n3);
        }
    }

    public static final void z(qz1_2 qz1_22, Product product, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        object = object.g(-1288683084);
        Object object2 = (Boolean)qz1_22.R.getValue();
        boolean bl2 = (Boolean)object2;
        LP1 lP1 = LP1$a.b;
        Object object3 = new vd2_2(qz1_22, bl2);
        boolean bl3 = false;
        Object object4 = null;
        lP1 = d.b(lP1, false, null, (Function0)object3, 7);
        object3 = zp.c;
        Gx$a gx$a = Nc$a.m;
        object3 = oZ.a((zp$l)object3, gx$a, (b30_0)object, 0);
        int n4 = ((j30_0)object).P;
        Object object5 = ((j30_0)object).P();
        lP1 = a30_0.c((b30_0)object, lP1);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object).a;
        boolean bl4 = mp2 instanceof mp;
        if (bl4) {
            ((j30_0)object).A();
            bl3 = ((j30_0)object).O;
            if (bl3) {
                ((j30_0)object).C(xp1$a);
            } else {
                ((j30_0)object).n();
            }
            object4 = N20$a.e;
            Ow3.a((b30_0)object, object3, (Function2)object4);
            object3 = N20$a.d;
            Ow3.a((b30_0)object, object5, (Function2)object3);
            object3 = N20$a.f;
            bl3 = ((j30_0)object).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), object5 = Integer.valueOf(n4)))) {
                rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object3);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object, lP1, (Function2)object3);
            if (!bl2) {
                ((j30_0)object).K(320004853);
                int n7 = 72;
                de2_0.x(qz1_22, selectedOrderItem, (b30_0)object, n7);
                ((j30_0)object).T(false);
            } else {
                ((j30_0)object).K(320093389);
                int n8 = 584;
                de2_0.y(qz1_22, product, selectedOrderItem, (b30_0)object, n8);
                ((j30_0)object).T(false);
            }
            boolean bl5 = true;
            ((j30_0)object).T(bl5);
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new wd2_2(qz1_22, product, selectedOrderItem, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

