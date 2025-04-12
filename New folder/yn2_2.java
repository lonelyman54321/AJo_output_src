/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.IntentSender$SendIntentException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderDetailFunctionalRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.myaccount.order.fragment.ReturnOrderDetailsFragment$onRatingsClicked$1;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ImpsDetails;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ResultIncentivise;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnRefundAmount;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.RtoResponseData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from yN2
 */
public final class yn2_2
extends o61_0
implements OnNavigationClickListener,
HN2,
iw0_1,
hE2,
wx0_0,
OT2,
fm2_0 {
    public static final yN2$a Companion;
    public ArrayList A;
    public String B;
    public xf_1 C;
    public final NewCustomEventsRevamp D;
    public final String E;
    public final String F;
    public Timer G;
    public gE2 H;
    public String I;
    public boolean J;
    public boolean K;
    public final D L;
    public boolean M;
    public fo3 N;
    public vh3_2 O;
    public InitiateChat P;
    public boolean Q;
    public boolean R;
    public String S;
    public final lq2_1 T;
    public HashMap U;
    public String f;
    public String g;
    public CartOrder h;
    public Consignment i;
    public String j;
    public ReturnOrderItemDetails k;
    public OnFragmentInteractionListener l;
    public FragmentActivity m;
    public j3_0 n;
    public final D o;
    public final D p;
    public LinearLayoutManager q;
    public RecyclerView r;
    public CollapsingToolbarLayout s;
    public Toolbar t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public ShimmerFrameLayout y;
    public View z;

    static {
        yN2$a yN2$a;
        Companion = yN2$a = new Object();
    }

    public yn2_2() {
        Object object = "";
        this.f = object;
        this.g = object;
        this.j = object;
        Object object2 = Reflection.getOrCreateKotlinClass(db2_1.class);
        Object object3 = new yN2$d(this);
        Lambda lambda = new yN2$e(this);
        Lambda lambda2 = new yN2$f(this);
        object2 = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, lambda2);
        this.o = object2;
        object2 = Reflection.getOrCreateKotlinClass(qz1_2.class);
        super(this);
        super(this);
        super(this);
        object2 = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, lambda2);
        this.p = object2;
        this.B = object;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.D = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.E = object2;
        this.F = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = Reflection.getOrCreateKotlinClass(lq2_0.class);
        object2 = new yN2$j(this);
        super(this);
        super(this);
        this.L = object = LW0.a(this, (yn1_2)object, (Function0)object2, (Function0)object3, lambda);
        this.S = "Chat unavailable, use <b>Help</b> for support";
        lq2_1.Companion.getClass();
        object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        object3 = Iq2$b.b;
        object2 = new iq2_1[]{object3};
        ((lq2_1)object).g((iq2_1)object2);
        object2 = PermissionTrigger.RATINGS;
        ((lq2_1)object).f((PermissionTrigger)((Object)object2));
        this.T = object;
    }

    public final void D8(RtoResponseData object) {
        boolean bl2;
        Object object2 = "rtoResponseData";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = this.L;
        Object object4 = (lq2_0)((D)object3).getValue();
        Object object5 = h40_0.a;
        ((lq2_0)object4).l = object5 = h40_0.Y();
        object3 = ((lq2_0)((D)object3).getValue()).l;
        if (object3 != null) {
            object3 = ((RtoFirebaseData)object3).isRTOEnabled();
            object4 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object4);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2 && !(bl2 = this.M)) {
            this.M = bl2 = true;
            wf2_0.Companion.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new wf2_0();
            object3 = new Bundle();
            object4 = "rto_data";
            object3.putParcelable((String)object4, (Parcelable)object);
            ((Fragment)object2).setArguments((Bundle)object3);
            object = this.getChildFragmentManager();
            object3 = this.getTag();
            ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
        }
    }

    public final void E5() {
        qz1_2 qz1_22 = this.Pa();
        qz1_22.getClass();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string2 = cv_0.a(analyticsManager$Companion);
        String string3 = bv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(qz1_22.M, "", "", null, "screen_view", "return cancellation halfcard screen", null, string3, null, string2, false, null, 1700, null);
    }

    public final void F2(RatingsModel object) {
        Intrinsics.checkNotNullParameter(object, "orderItemLine");
        Object object2 = ((RatingsModel)object).getBaseProductId();
        this.I = object2;
        object = wD2$a.b(wd2_0.Companion, (RatingsModel)object);
        object2 = this.G;
        if (object2 != null) {
            ((Timer)object2).cancel();
        }
        this.G = object2 = new Timer();
        ReturnOrderDetailsFragment$onRatingsClicked$1 returnOrderDetailsFragment$onRatingsClicked$1 = new ReturnOrderDetailsFragment$onRatingsClicked$1(this, (wd2_0)object);
        ((Timer)object2).schedule((TimerTask)returnOrderDetailsFragment$onRatingsClicked$1, 500L);
    }

    public final void Ma(Consignment object, String string2, String string3, Integer object2, String object3) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "consignment");
        Object[] objectArray = "journeyType";
        Intrinsics.checkNotNullParameter(object3, (String)objectArray);
        if (string2 != null && (n3 = string2.length()) != 0 && string3 != null && (n3 = string3.length()) != 0) {
            objectArray = new Gson();
            object = objectArray.toJson(object);
            this.i = object = (Consignment)objectArray.fromJson((String)object, Consignment.class);
            int n4 = R$string.shipment_number;
            n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            this.j = object = hv3_0.L(n4, objectArray);
            object = this.Qa();
            ((db2_1)object).x = object3;
            n4 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0 && (object = this.Qa()) != null) {
                Intrinsics.checkNotNullParameter(string3, "orderId");
                Intrinsics.checkNotNullParameter(string2, "consignmentCode");
                object2 = md3_0.c((jD3)object);
                n3 = 0;
                objectArray = null;
                object3 = new eb2_2((db2_1)object, string3, string2, null);
                n4 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)object3, n4);
            }
        }
    }

    public final void N1(RatingsModel object) {
        Intrinsics.checkNotNullParameter(object, "data");
        Object object2 = ((RatingsModel)object).getBaseProductId();
        this.I = object2;
        object2 = LD2.a;
        object2 = ((RatingsModel)object).getOrderId();
        Object object3 = ((RatingsModel)object).getSkuId();
        String string2 = ((RatingsModel)object).getBrandName();
        String string3 = ((RatingsModel)object).getProductBrick();
        LD2.b((String)object2, object3, string2, string3);
        object2 = wd2_0.Companion;
        object3 = wp1_0.EDIT;
        object2.getClass();
        object = wD2$a.a((RatingsModel)object, (wp1_0)((Object)object3));
        object2 = this.getChildFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, "RatingBottomSheetFragment");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void O0(String string2, ReturnRefundLinksEnum returnRefundLinksEnum) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        yn2_2 yn2_22;
        block34: {
            int n3;
            Object object5;
            int n4;
            block35: {
                int n7;
                Object object6;
                int n8;
                block33: {
                    boolean bl2;
                    yn2_22 = this;
                    object4 = string2;
                    object3 = "<this>";
                    object2 = "modelClass";
                    if (returnRefundLinksEnum == null) {
                        n4 = -1;
                    } else {
                        object5 = yN2$b.$EnumSwitchMapping$0;
                        int n10 = returnRefundLinksEnum.ordinal();
                        n4 = object5[n10];
                    }
                    object = "";
                    n8 = 1;
                    int n14 = 0;
                    object6 = null;
                    if (n4 != n8) {
                        Exception exception2;
                        block32: {
                            int n15 = 2;
                            Object object7 = "requireActivity(...)";
                            if (n4 != n15 && n4 != (n15 = 3)) {
                                float f5;
                                Object object8;
                                int n16;
                                int n17 = 4;
                                if (n4 == n17) {
                                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    String string3 = "order details screen";
                                    n14 = 0;
                                    object6 = null;
                                    object = "Refund policy";
                                    n15 = 8;
                                    boolean bl3 = false;
                                    float f6 = 0.0f;
                                    object7 = null;
                                    GTMEvents.pushPageOrderDetailsInteractionEvent$default((GTMEvents)object2, "link click", (String)object, string3, null, n15, null);
                                    object3 = yn2_22.m;
                                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
                                    object3 = (BaseActivity)object3;
                                    object2 = BaseActivity.Companion;
                                    object2 = Boolean.FALSE;
                                    object5 = "static";
                                    ((BaseActivity)object3).A2((String)object5, (String)object4, (Boolean)object2);
                                    return;
                                }
                                n17 = 5;
                                if (n4 != n17) {
                                    object3 = AnalyticsManager.Companion;
                                    object2 = ((AnalyticsManager$Companion)object3).getInstance();
                                    GTMEvents gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
                                    if (returnRefundLinksEnum != null) {
                                        object6 = returnRefundLinksEnum.name();
                                    }
                                    String string4 = "order details screen";
                                    String string5 = "link click";
                                    int n18 = 8;
                                    Object var21_30 = null;
                                    GTMEvents.pushPageOrderDetailsInteractionEvent$default(gTMEvents, string5, (String)object6, string4, null, n18, null);
                                    object2 = this.getActivity();
                                    if (object2 == null) return;
                                    if (object4 == null) return;
                                    int n19 = string2.length();
                                    if (n19 == 0) {
                                        return;
                                    }
                                    object2 = this.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(object2, (String)object7);
                                    n4 = 9;
                                    at2_1.k((Context)object2, n4, object4);
                                    object4 = ((AnalyticsManager$Companion)object3).getInstance();
                                    object3 = ((AnalyticsManager)object4).getGtmEvents();
                                    n14 = 8;
                                    n15 = 0;
                                    Object var23_36 = null;
                                    object2 = "link click";
                                    object5 = "View refund details";
                                    object = "order details screen";
                                    n8 = 0;
                                    Object var24_40 = null;
                                    GTMEvents.pushPageOrderDetailsInteractionEvent$default((GTMEvents)object3, (String)object2, (String)object5, (String)object, null, n14, null);
                                    return;
                                }
                                object3 = new ih2_2();
                                object2 = new ReturnOrderItemDetails();
                                object5 = yn2_22.h;
                                if (object5 != null) {
                                    object5 = ((CartOrder)object5).getCode();
                                } else {
                                    n4 = 0;
                                    object5 = null;
                                }
                                ((ReturnOrderItemDetails)object2).setOrderCode((String)object5);
                                object5 = new ArrayList();
                                Object object9 = OrderDetailFunctionalRepo.INSTANCE.getReturnRequest();
                                if (object9 != null && (object9 = ((ReturnRequest)object9).getReturnEntries()) != null) {
                                    object9 = ((Iterable)object9).iterator();
                                    while ((n16 = object9.hasNext()) != 0) {
                                        object7 = (OrderDetailLineItem)object9.next();
                                        object8 = ((OrderDetailLineItem)object7).getEntry();
                                        n16 = ((OrderDetailLineItem)object7).getLineItemQty();
                                        ((CartEntry)object8).setReturnEditedQuantity(n16);
                                        ((CartEntry)object8).setOrderEntry((CartEntry)object8);
                                        Intrinsics.checkNotNull(object8);
                                        ((ArrayList)object5).add(object8);
                                    }
                                }
                                ((ReturnOrderItemDetails)object2).getSelectedControllerConfirmedList().addAll(object5);
                                object5 = OrderDetailFunctionalRepo.INSTANCE;
                                object9 = ((OrderDetailFunctionalRepo)object5).getReturnRequest();
                                if (object9 != null) {
                                    n15 = (int)(((ReturnRequest)object9).isSelfShipOrder() ? 1 : 0);
                                    object9 = n15 != 0;
                                } else {
                                    n15 = 0;
                                    object9 = null;
                                }
                                Intrinsics.checkNotNull(object9);
                                n15 = ((Boolean)object9).booleanValue();
                                ((ReturnOrderItemDetails)object2).setSelfShip(n15 != 0);
                                object9 = ((OrderDetailFunctionalRepo)object5).getReturnRequest();
                                if (object9 != null) {
                                    object9 = ((ReturnRequest)object9).getSelfshipCreditAmt();
                                } else {
                                    n15 = 0;
                                    object9 = null;
                                }
                                ((ReturnOrderItemDetails)object2).setSelfshipCreditAmt((String)object9);
                                object9 = ((OrderDetailFunctionalRepo)object5).getReturnRequest();
                                if (object9 != null && (object9 = ((ReturnRequest)object9).getRefundAmountSection()) != null) {
                                    object9 = ((ReturnRefundAmount)object9).getRefundAmount();
                                } else {
                                    n15 = 0;
                                    object9 = null;
                                }
                                ((ReturnOrderItemDetails)object2).setRefundAmount((Float)object9);
                                object9 = new Bundle();
                                object9.putSerializable("Return_Order_Details", (Serializable)object2);
                                object9.putBoolean("IS_FROM_RETURN_REFUND_ORDER_DETAILS", n8 != 0);
                                object2 = h40_0.a;
                                int n20 = h40_0.f2();
                                n16 = 0;
                                float f7 = 0.0f;
                                object7 = null;
                                if (n20 != 0 && (object2 = ((OrderDetailFunctionalRepo)object5).getReturnRequest()) != null && (object2 = ((ReturnRequest)object2).getReturnEntries()) != null && (object2 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object2)) != null) {
                                    object8 = ((OrderDetailLineItem)object2).getEntry();
                                    if (object8 != null && (object8 = ((CartEntry)object8).getReturnFee()) != null && (object8 = je3_2.e((String)object8)) != null) {
                                        f7 = ((Float)object8).floatValue();
                                    }
                                    if ((n20 = ((OrderDetailLineItem)object2).getLineItemQty()) >= n8) {
                                        n8 = n20;
                                    }
                                    f5 = n8;
                                    f7 /= f5;
                                }
                                if ((object2 = (DataCallback)this.Pa().k0.d()) != null && (object2 = (IncentiviseHighReturnData)((DataCallback)object2).getData()) != null && (object2 = ((IncentiviseHighReturnData)object2).getResult()) != null && (object2 = ((ResultIncentivise)object2).getPOST_ORDER_RETURN_FEE()) != null && (object8 = ((ProfileHealth)object2).getActionContent()) != null) {
                                    Float f8 = Float.valueOf(f7);
                                    object2 = yn2_22.h;
                                    Object object10 = object2 != null ? (object2 = ((CartOrder)object2).getCode()) : null;
                                    object2 = ((OrderDetailFunctionalRepo)object5).getReturnRequest();
                                    Object object11 = object2 != null && (object2 = ((ReturnRequest)object2).getReturnEntries()) != null && (object2 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((OrderDetailLineItem)object2).getEntry()) != null && (object2 = ((CartEntry)object2).getProduct()) != null && (object2 = ((Product)object2).getCode()) != null ? object2 : object;
                                    Object var19_26 = null;
                                    boolean bl4 = false;
                                    Object var18_24 = null;
                                    boolean bl5 = false;
                                    Object var32_54 = null;
                                    Object var21_31 = null;
                                    Object var33_56 = null;
                                    Object var34_58 = null;
                                    Object var35_60 = null;
                                    Object var36_62 = null;
                                    Object var37_64 = null;
                                    boolean bl6 = false;
                                    int n21 = 0x1FBFFFF;
                                    object2 = ActionContent.copy$default((ActionContent)object8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, f8, null, null, null, null, null, null, (String)object10, (String)object11, n21, null);
                                } else {
                                    n20 = 0;
                                    object2 = null;
                                    f5 = 0.0f;
                                }
                                object9.putSerializable("actionContent", (Serializable)object2);
                                n8 = 0;
                                object9.putBoolean("SHOULD_SHOW_YELLOW_BOTTOM_VIEW_REFUND_BREAKUP", false);
                                ((Fragment)object3).setArguments((Bundle)object9);
                                object2 = this.requireActivity().getSupportFragmentManager();
                                Object object12 = "Refund Breakup";
                                ((DialogFragment)object3).show((FragmentManager)object2, (String)object12);
                                object3 = yn2_22.h;
                                object2 = yn2_22.B;
                                object3 = ((OrderDetailFunctionalRepo)object5).getReturnObject((CartOrder)object3, (String)object2);
                                object2 = yn2_22.h;
                                object12 = object2 != null && (object2 = ((CartOrder)object2).getCode()) != null ? object2 : object;
                                if (object3 != null) {
                                    object6 = object3 = ((ReturnRequest)object3).getReturnStatus();
                                }
                                object9 = (object3 = ((OrderDetailFunctionalRepo)object5).getReturnRequest()) != null && (object3 = ((ReturnRequest)object3).getReturnEntries()) != null && (object3 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((OrderDetailLineItem)object3).getEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null && (object3 = ((Product)object3).getCode()) != null ? object3 : object;
                                n20 = 4;
                                f5 = 5.6E-45f;
                                object3 = "refund breakup";
                                object5 = object12;
                                object = string2;
                                object12 = object6;
                                object6 = object9;
                                IN2.a((String)object3, n20, (String)object5, string2, (String)object12, (String)object9);
                                return;
                            }
                            try {
                                boolean bl7 = this.isAdded();
                                if (!bl7) return;
                                object4 = this.getActivity();
                                if (object4 == null) return;
                                object4 = this.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                                object5 = "owner";
                                Intrinsics.checkNotNullParameter(object4, (String)object5);
                                object = object4.getViewModelStore();
                                Intrinsics.checkNotNullParameter(object4, (String)object5);
                                E$b e$b = object4.getDefaultViewModelProviderFactory();
                                Intrinsics.checkNotNullParameter(object4, (String)object5);
                                object4 = object4.getDefaultViewModelCreationExtras();
                                object5 = "store";
                                Intrinsics.checkNotNullParameter(object, (String)object5);
                                object5 = "factory";
                                Intrinsics.checkNotNullParameter(e$b, (String)object5);
                                object5 = "defaultCreationExtras";
                                Intrinsics.checkNotNullParameter(object4, (String)object5);
                                object5 = new pD3((rd3_0)object, e$b, (Wd0)object4);
                                object4 = qh2_0.class;
                                Intrinsics.checkNotNullParameter(object4, (String)object2);
                                Intrinsics.checkNotNullParameter(object4, (String)object3);
                                object4 = Reflection.getOrCreateKotlinClass((Class)object4);
                                Intrinsics.checkNotNullParameter(object4, (String)object2);
                                Intrinsics.checkNotNullParameter(object4, (String)object2);
                                Intrinsics.checkNotNullParameter(object4, (String)object3);
                                object3 = object4.getQualifiedName();
                                if (object3 != null) {
                                    object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                                    object3 = ((String)object2).concat((String)object3);
                                    object4 = ((pD3)object5).a((yn1_2)object4, (String)object3);
                                    object4 = (qh2_0)object4;
                                    object3 = OrderDetailFunctionalRepo.INSTANCE;
                                    ((qh2_0)object4).a = object3 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                                    object4 = new oh2_2();
                                    object3 = this.requireActivity();
                                    object3 = ((FragmentActivity)object3).getSupportFragmentManager();
                                    object2 = "Size Update Dialog";
                                    ((DialogFragment)object4).show((FragmentManager)object3, (String)object2);
                                    object4 = AnalyticsManager.Companion;
                                    object4 = ((AnalyticsManager$Companion)object4).getInstance();
                                    object3 = ((AnalyticsManager)object4).getGtmEvents();
                                    object2 = "link click";
                                    object5 = "View refund details";
                                    object = "order details screen";
                                    n15 = 0;
                                    Object var23_38 = null;
                                    n8 = 0;
                                    e$b = null;
                                    n14 = 8;
                                    GTMEvents.pushPageOrderDetailsInteractionEvent$default((GTMEvents)object3, (String)object2, (String)object5, (String)object, null, n14, null);
                                    return;
                                }
                            }
                            catch (Exception exception2) {
                                break block32;
                            }
                            object3 = "Local and anonymous classes can not be ViewModels";
                            object3 = object3.toString();
                            object4 = new IllegalArgumentException((String)object3);
                            throw object4;
                        }
                        object3 = yn3_0.a;
                        ((yn3$a)object3).e(exception2);
                        return;
                    }
                    object4 = yn2_22.h;
                    if (object4 == null) return;
                    if ((object4 = ((CartOrder)object4).getEntries()) == null) return;
                    n7 = ((ArrayList)object4).size();
                    object3 = "CART_ORDER_ID";
                    if (n7 <= n8) break block33;
                    object4 = new Bundle();
                    object2 = yn2_22.h;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartOrder)object2).getCode();
                    object4.putString((String)object3, (String)object2);
                    object3 = lw0_1.Companion;
                    AJIOApplication.Companion.getClass();
                    object2 = AJIOApplication$a.a();
                    object3 = ((Lw0$a)object3).a((ContextWrapper)object2);
                    n3 = R$string.feature_customercare;
                    object2 = hv3_0.K(n3);
                    ((lw0_1)object3).a((String)object2, yn2_22, (Bundle)object4);
                    GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string6 = "order details screen";
                    String string7 = "link click";
                    String string8 = "Raise a concern";
                    int n22 = 8;
                    GTMEvents.pushPageOrderDetailsInteractionEvent$default(gTMEvents, string7, string8, string6, null, n22, null);
                    object4 = new Bundle();
                    object3 = yn2_22.h;
                    if (object3 != null) {
                        object6 = ((CartOrder)object3).getCode();
                    }
                    object4.putString("order_id", (String)object6);
                    object3 = this.Qa();
                    object2 = yn2_22.h;
                    object3.getClass();
                    if (object2 == null || (object3 = ((CartOrder)object2).getEntries()) == null || (bl2 = object3.isEmpty())) break block34;
                    object3 = ((CartOrder)object2).getEntries().iterator();
                    object2 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    break block35;
                }
                object4 = hv3_0.l();
                if (object4 == null) return;
                object5 = yn2_22.m;
                object2 = new Intent((Context)object5, (Class)object4);
                object4 = new Bundle();
                object4.putBoolean("FROM_ORDER_DETAIL", n8 != 0);
                object5 = yn2_22.h;
                if (object5 != null) {
                    object6 = ((CartOrder)object5).getCode();
                }
                object4.putString((String)object3, (String)object6);
                object3 = "CC_FRAGMENT_TYPE";
                n4 = 108;
                object4.putInt((String)object3, n4);
                object2.putExtras((Bundle)object4);
                object2.setFlags(0x4000000);
                n7 = 24;
                yn2_22.startActivityForResult((Intent)object2, n7);
                return;
            }
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (CartEntry)object3.next();
                n4 = TextUtils.isEmpty((CharSequence)object);
                if (n4 == 0) {
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartEntry)object2).getProduct().getCode();
                    object5 = ",";
                    object2 = n1.a((String)object, (String)object5, (String)object2);
                } else {
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartEntry)object2).getProduct().getCode();
                }
                object = object2;
            }
        }
        object4.putString("product_id", (String)object);
        NewCustomEventsRevamp newCustomEventsRevamp = yn2_22.D;
        String string9 = newCustomEventsRevamp.getEC_ORDER_DETAIL_INTERACTION();
        object3 = yn2_22.E;
        object2 = yn2_22.F;
        String string10 = "need help";
        String string11 = "need help";
        String string12 = "need_help";
        String string13 = "consolidated order details screen";
        String string14 = "order management screen";
        int n24 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string9, string10, string11, string12, string13, string14, (String)object3, (Bundle)object4, (String)object2, false, null, n24, null);
    }

    public final qz1_2 Pa() {
        return (qz1_2)this.p.getValue();
    }

    public final db2_1 Qa() {
        return (db2_1)this.o.getValue();
    }

    public final void R0() {
        Object object = OrderDetailFunctionalRepo.INSTANCE;
        Object object2 = this.h;
        Object object3 = this.B;
        object = ((OrderDetailFunctionalRepo)object).getReturnObject((CartOrder)object2, (String)object3);
        object2 = this.Pa();
        object3 = this.h;
        String string2 = null;
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        if (object != null) {
            string2 = ((ReturnRequest)object).getReturnStatus();
        }
        object2.getClass();
        object = AnalyticsManager.Companion;
        String string3 = cv_0.a((AnalyticsManager$Companion)object);
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(((qz1_2)object2).M, "", "", null, "screen_view", "return cancellation halfcard screen", null, string4, null, string3, false, null, 1700, null);
        Bundle bundle = px1_2.b("order_status", string2, "order_id", (String)object3);
        String string5 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getRETURN_CANCELLATION_HALFCARD_CATEGORY();
        String string6 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getRETURN_CANCELLATION_HALFCARD_EVENT();
        String string7 = ((qz1_2)object2).N.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(((qz1_2)object2).M, string5, "confirm cancellation", null, string6, "return cancellation halfcard screen", null, null, bundle, string7, false, null, 1636, null);
    }

    public final void T5() {
        yn2_2 yn2_22 = this;
        Object object = OrderDetailFunctionalRepo.INSTANCE;
        Object object2 = this.h;
        Object object3 = this.B;
        object = ((OrderDetailFunctionalRepo)object).getReturnObject((CartOrder)object2, (String)object3);
        object2 = this.Pa();
        object3 = this.h;
        String string2 = null;
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        if (object != null) {
            string2 = ((ReturnRequest)object).getReturnStatus();
        }
        object2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("order_status", string2);
        bundle.putString("order_id", (String)object3);
        object = AnalyticsManager.Companion;
        String string3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
        String string4 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(((qz1_2)object2).M, string4, "cancel return", null, string3, "order item details screen", null, null, bundle, string5, false, null, 1636, null);
        object = jk_2.Companion;
        object2 = yn2_22.B;
        object.getClass();
        object = new jk_2();
        object3 = new Bundle();
        object3.putString("returnId", (String)object2);
        ((Fragment)object).setArguments((Bundle)object3);
        object2 = this.getChildFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, "Cancel Return");
    }

    public final void b9(String string2, String string3) {
        Object object = this.getActivity();
        di2_2 di2_22 = new zj0_0((Activity)object);
        object = string2;
        di2_22.b(string2, string3, "", null, null);
    }

    public final void da() {
        Object object = OrderDetailFunctionalRepo.INSTANCE;
        Object object2 = this.h;
        Object object3 = this.B;
        object = ((OrderDetailFunctionalRepo)object).getReturnObject((CartOrder)object2, (String)object3);
        object2 = this.Pa();
        object3 = this.h;
        String string2 = null;
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        if (object != null) {
            string2 = ((ReturnRequest)object).getReturnStatus();
        }
        object2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("order_status", string2);
        bundle.putString("order_id", (String)object3);
        object = AnalyticsManager.Companion;
        String string3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
        String string4 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
        String string5 = ((qz1_2)object2).N.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(((qz1_2)object2).M, string3, "return cancel failure", null, string4, "order item details screen", null, null, bundle, string5, false, null, 1636, null);
    }

    public final void dismissProgress() {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2) {
            fragmentActivity = (BaseSplitActivity)this.getActivity();
            Intrinsics.checkNotNull(fragmentActivity);
            ((BaseSplitActivity)fragmentActivity).dismissProgress();
        }
    }

    public final void getOrderDetails(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return;
        }
        Object object = this.z;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
        }
        if ((object = this.y) != null) {
            hv3_0.p0((ShimmerFrameLayout)((Object)object));
        }
        boolean bl3 = hv3_0.D();
        boolean bl4 = h40_0.l2();
        db2_1 db2_12 = this.Qa();
        db2_12.getClass();
        Intrinsics.checkNotNullParameter(string2, "orderId");
        object = md3_0.c(db2_12);
        cb2_2 cb2_22 = new cb2_2(db2_12, string2, bl3, bl4, null);
        Ae3.d((i90_0)object, null, null, cb2_22, 3);
    }

    public final void initProgress() {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2) {
            fragmentActivity = (BaseSplitActivity)this.getActivity();
            Intrinsics.checkNotNull(fragmentActivity);
            ((BaseSplitActivity)fragmentActivity).initProgress();
        }
    }

    public final void launchFeature(String object, Bundle object2) {
        Object object3 = "name";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = this.m;
        if (object == null) {
            this.m = object = this.getActivity();
        }
        if (object2 != null) {
            object = "SELECTED_ENTRY_NO";
            int n3 = object2.containsKey((String)object);
            int n4 = 24;
            int n7 = 0x4000000;
            int n8 = 108;
            String string2 = "CC_FRAGMENT_TYPE";
            String string3 = "CART_ORDER_ID";
            String string4 = "FROM_ORDER_DETAIL";
            int n10 = 1;
            if (n3) {
                object3 = this.m;
                Class clazz = hv3_0.l();
                object = new Intent((Context)object3, clazz);
                object2.putBoolean(string4, n10 != 0);
                object3 = this.h;
                if (object3 != null) {
                    object3 = ((CartOrder)object3).getCode();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object2.putString(string3, (String)object3);
                object2.putInt(string2, n8);
                object.putExtras((Bundle)object2);
                object.setFlags(n7);
                this.startActivityForResult((Intent)object, n4);
            } else {
                object3 = this.h;
                if (object3 != null) {
                    if ((object3 = ((CartOrder)object3).getEntries()) != null && (n3 = ((ArrayList)object3).size()) == n10) {
                        FragmentActivity fragmentActivity = this.m;
                        Object object4 = hv3_0.l();
                        object3 = new Intent((Context)fragmentActivity, (Class)object4);
                        fragmentActivity = new Bundle();
                        object4 = this.h;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((CartOrder)object4).getCode();
                        object2.putString(string3, (String)object4);
                        fragmentActivity.putInt(string2, n8);
                        object2 = this.h;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CartOrder)object2).getEntries();
                        n8 = 0;
                        object2 = ((CartEntry)((ArrayList)object2).get(0)).getEntryNumber();
                        String string5 = "getEntryNumber(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, string5);
                        int n14 = ((Number)object2).intValue();
                        fragmentActivity.putInt((String)object, n14);
                        fragmentActivity.putBoolean(string4, n10 != 0);
                        object3.putExtras((Bundle)fragmentActivity);
                        object3.setFlags(n7);
                        this.startActivityForResult((Intent)object3, n4);
                    } else {
                        object = this.h;
                        Intrinsics.checkNotNull(object);
                        object = ((CartOrder)object).getEntries();
                        int n15 = ((ArrayList)object).size();
                        if (n15 > n10) {
                            object2 = this.h;
                            object = new ar_2((CartOrder)object2);
                            object2 = this.C;
                            if (object2 != null) {
                                ((xf_1)object2).f = object;
                            }
                            bg_1.Companion.getClass();
                            object = new bg_1();
                            int n16 = 25;
                            ((Fragment)object).setTargetFragment(this, n16);
                            object2 = this.m;
                            n3 = object2 instanceof AjioHomeActivity;
                            if (n3) {
                                object3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                                Intrinsics.checkNotNull(object2, (String)object3);
                                object2 = ((AjioHomeActivity)object2).T0;
                                if (object2 != null) {
                                    object2 = ((Fragment)object2).getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
                                    object3 = "CCItemListDialogFragment";
                                    ((bg_1)object).show((FragmentManager)object2, (String)object3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void o6() {
        RecyclerView recyclerView;
        int n3;
        Object object = this.r;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = ((RecyclerView$f)object).getItemCount()) > 0 && (recyclerView = this.r) != null) {
            recyclerView.scrollToPosition(n3 += -1);
        }
    }

    public final void onActivityCreated(Bundle object) {
        int n3;
        super.onActivityCreated((Bundle)object);
        object = this.Qa().d;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        Function1 function1 = new xn2_2(this, 0);
        yN2$c yN2$c = new yN2$c(function1);
        ((LiveData)object).e(mu1_12, yN2$c);
        object = this.Qa().f;
        mu1_12 = this.getViewLifecycleOwner();
        int n4 = 1;
        function1 = new yy1_2(this, n4);
        yN2$c = new yN2$c(function1);
        ((LiveData)object).e(mu1_12, yN2$c);
        object = this.f;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = this.f;
            Intrinsics.checkNotNull(object);
            this.getOrderDetails((String)object);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        Object object;
        int n7 = -1;
        if (n4 == n7 && (object = this.m) != null && (n7 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
            n7 = 25;
            if (n3 != n7) {
                n7 = 69;
                if (n3 == n7 && (object = this.f) != null && (n7 = ((String)object).length()) != 0) {
                    object = this.f;
                    Intrinsics.checkNotNull(object);
                    this.getOrderDetails((String)object);
                }
            } else {
                Object object2;
                boolean bl2;
                if (intent != null) {
                    object = intent.getExtras();
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null && (bl2 = object.containsKey((String)(object2 = "SELECTED_ENTRY_NO")))) {
                    object2 = lw0_1.Companion;
                    AJIOApplication.Companion.getClass();
                    Object object3 = AJIOApplication$a.a();
                    object2 = ((Lw0$a)object2).a((ContextWrapper)object3);
                    int n8 = R$string.feature_customercare;
                    object3 = hv3_0.K(n8);
                    ((lw0_1)object2).a((String)object3, this, (Bundle)object);
                }
            }
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = this.getActivity();
        this.m = object2;
        try {
            this.l = object2 = (OnFragmentInteractionListener)object2;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            object2 = this.m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object2);
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            object2 = stringBuilder.toString();
            ClassCastException classCastException2 = new ClassCastException((String)object2);
            throw classCastException2;
        }
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.n = object2 = (j3_0)object;
            bl2 = object instanceof vh3_2;
            Object[] objectArray = null;
            if (bl2) {
                object2 = object;
                this.O = object2 = (vh3_2)object;
            } else {
                object2 = yn3_0.a;
                String string2 = "must implement TabListener";
                Object[] objectArray2 = new Object[]{};
                ((yn3$a)object2).d(string2, objectArray2);
            }
            bl2 = object instanceof fo3;
            if (bl2) {
                object = (fo3)object;
                this.N = object;
            } else {
                object = yn3_0.a;
                object2 = "must implement ToolbarListener";
                objectArray = new Object[]{};
                ((yn3$a)object).d((String)object2, objectArray);
            }
            return;
        }
        object = pn_2.b((Context)object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object = this.requireArguments().getString("product_code");
            this.f = object;
            object = this.requireArguments().getString("clicked_item_code");
            this.g = object;
            object = this.requireArguments();
            object2 = "return_refund_return_id";
            object = object.getString((String)object2);
            this.B = object;
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object2, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object3, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string4);
        Object object5 = gE2.class;
        String string5 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object5, string5);
        object3 = "<this>";
        object4 = sw0_0.a(object5, (String)object3, object5, string5, string5);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object5 = object4.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object5 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object5 = string7.concat((String)object5);
            this.H = object2 = (gE2)((pD3)object2).a((yn1_2)object4, (String)object5);
            object2 = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object4 = object2.getViewModelStore();
            object = cX1.a((FragmentActivity)object2, (String)object, (FragmentActivity)object2, (String)object);
            object2 = dX1.a((FragmentActivity)object2, (rd3_0)object4, string2, (E$b)object, string3);
            object = li_2.a((Wd0)object2, string4, (rd3_0)object4, (E$b)object, (Wd0)object2);
            object2 = xf_1.class;
            Intrinsics.checkNotNullParameter(object2, string5);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object2 = Reflection.getOrCreateKotlinClass(object2);
            Intrinsics.checkNotNullParameter(object2, string5);
            Intrinsics.checkNotNullParameter(object2, string5);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string7.concat((String)object3);
                this.C = object = (xf_1)((pD3)object).a((yn1_2)object2, (String)object3);
                new t30_0();
                object = this.N;
                if (object != null) {
                    object.hideToolbarLayout();
                }
                if ((object = this.O) != null) {
                    object2 = null;
                    object.showTabLayout(false);
                }
                return;
            }
            object2 = string6.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.return_order_details;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        Timer timer = this.G;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public final void onDownloadConfirmation(SplitInstallManager splitInstallManager, SplitInstallSessionState object) {
        if (splitInstallManager != null && object != null) {
            FragmentActivity fragmentActivity = this.requireActivity();
            int n3 = 37;
            try {
                splitInstallManager.startConfirmationDialogForResult((SplitInstallSessionState)object, fragmentActivity, n3);
            }
            catch (IntentSender.SendIntentException sendIntentException) {
                object = yn3_0.a;
                ((yn3$a)object).e(sendIntentException);
            }
        }
    }

    public final void onNavigationClick() {
        Object object = this.getParentFragment();
        if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        int n3;
        float f5;
        int n4 = 2;
        Object object5 = null;
        int n7 = 1;
        Object object6 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object6);
        super.onViewCreated((View)object, (Bundle)object2);
        int n8 = R$id.order_detail_view_shimmer;
        object2 = object.findViewById(n8);
        this.z = object2;
        n8 = R$id.shimmer_order_detail;
        object2 = (ShimmerFrameLayout)object.findViewById(n8);
        this.y = object2;
        n8 = R$id.return_order_rv;
        object2 = (RecyclerView)object.findViewById(n8);
        this.r = object2;
        n8 = R$id.alfCtl;
        object2 = (CollapsingToolbarLayout)object.findViewById(n8);
        this.s = object2;
        n8 = R$id.alfToolbar;
        object2 = (Toolbar)object.findViewById(n8);
        this.t = object2;
        n8 = R$id.needHelp;
        object2 = (TextView)object.findViewById(n8);
        this.u = object2;
        n8 = R$id.rodp_help;
        object2 = (TextView)object.findViewById(n8);
        this.v = object2;
        n8 = R$id.rodp_chat;
        object2 = (TextView)object.findViewById(n8);
        this.w = object2;
        n8 = R$id.chat_disabled_custom_popup_tv;
        object = (TextView)object.findViewById(n8);
        this.x = object;
        object2 = this.requireActivity();
        object = new LinearLayoutManager((Context)object2);
        this.q = object;
        object = this.r;
        Intrinsics.checkNotNull(object);
        object2 = this.q;
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        object = this.s;
        if (object != null) {
            n8 = R$style.muli_regular_12_accent_10;
            ((CollapsingToolbarLayout)((Object)object)).setCollapsedTitleTextAppearance(n8);
            n8 = R$style.muli_regular_12_accent_10;
            ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleTextAppearance(n8);
            f5 = 2.2E-44f;
            n8 = mz3_0.d(16);
            n3 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginTop();
            int n10 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginEnd();
            int n14 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginBottom();
            ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleMargin(n8, n3, n10, n14);
        }
        if ((object = this.t) != null) {
            object2 = this.B;
            object4 = "Return ID #";
            object6 = new StringBuilder((String)object4);
            ((StringBuilder)object6).append((String)object2);
            object2 = ((StringBuilder)object6).toString();
            ((Toolbar)object).setTitle((CharSequence)object2);
        }
        if ((object = this.t) != null) {
            object2 = this.getActivity();
            n3 = R$style.muli_regular_12_accent_10;
            ((Toolbar)object).setTitleTextAppearance((Context)object2, n3);
        }
        if ((object = this.t) != null) {
            n8 = R$drawable.nav_back;
            ((Toolbar)object).setNavigationIcon(n8);
        }
        if ((object = this.t) != null) {
            n8 = R$string.back_button_text;
            object2 = this.getString(n8);
            ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
        }
        if ((object = this.t) != null) {
            object2 = new oz2(this, n7);
            ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.u) != null) {
            object2 = new un2_1(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.v) != null) {
            object2 = new vn2_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.w) != null) {
            object2 = new wn2_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.H;
        object2 = "getViewLifecycleOwner(...)";
        if (object != null && (object = ((gE2)object).a) != null) {
            object5 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
            object6 = new qn2_2(this);
            object4 = new yN2$c((Function1)object6);
            ((R53)object).e((mu1_1)object5, (F62)object4);
        }
        if ((object = this.H) != null && (object = ((gE2)object).b) != null) {
            object5 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
            object2 = new c6_0(this, n4);
            object6 = new yN2$c((Function1)object2);
            ((R53)object).e((mu1_1)object5, (F62)object6);
        }
        object = h40_0.a;
        boolean bl2 = h40_0.U0();
        if (bl2) {
            object = this.Pa().s0;
            object2 = this.getViewLifecycleOwner();
            object5 = new vn2_2(this, n7);
            object6 = new yN2$c((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = this.Pa().u0;
            object2 = this.getViewLifecycleOwner();
            object5 = new oj0_2(this, n4);
            object3 = new yN2$c((Function1)object5);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        object = this.Qa().C;
        object2 = this.getViewLifecycleOwner();
        object3 = new wy1_2(this, n7);
        object5 = new yN2$c((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object5);
        bl2 = h40_0.U0();
        if (bl2) {
            v31.b();
            object = this.v;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.w) != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.u) != null) {
                ai0_2.i((View)object);
            }
            if (!(bl2 = this.R) && (object = this.w) != null) {
                n8 = 0x3F000000;
                f5 = 0.5f;
                object.setAlpha(f5);
            }
        } else {
            object = this.v;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.w) != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.u) != null) {
                ai0_2.B((View)object);
            }
        }
    }

    public final void showProgress(String string2) {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2) {
            fragmentActivity = (BaseSplitActivity)this.getActivity();
            Intrinsics.checkNotNull(fragmentActivity);
            ((BaseSplitActivity)fragmentActivity).showProgress(string2);
        }
    }

    public final void t5(ReturnRequest returnRequest, boolean bl2) {
        yn2_2 yn2_22 = this;
        Object object = returnRequest;
        Intrinsics.checkNotNullParameter(returnRequest, "returnRequest");
        Object object2 = zE2.a;
        String string2 = returnRequest.getReturnId();
        Intrinsics.checkNotNullExpressionValue(string2, "getReturnId(...)");
        object2 = this.h;
        String string3 = null;
        object2 = object2 != null ? ((CartOrder)object2).getCode() : null;
        Object object3 = returnRequest.getReturnEntries();
        String string4 = "getReturnEntries(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string4);
        object3 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object3);
        object3 = object3 != null && (object3 = ((OrderDetailLineItem)object3).getEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null ? ((Product)object3).getCode() : null;
        Object object4 = returnRequest.getReturnStatus();
        Intrinsics.checkNotNullExpressionValue(object4, "getReturnStatus(...)");
        Intrinsics.checkNotNullParameter(string2, "returnId");
        Intrinsics.checkNotNullParameter(object4, "orderStatus");
        String string5 = "order_id";
        String string6 = "product_id";
        Bundle bundle = px1_2.b(string5, (String)object2, string6, (String)object3);
        object2 = "order_status";
        bundle.putString((String)object2, (String)object4);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = av_0.a(analyticsManager$Companion);
        String string9 = bv_0.a(analyticsManager$Companion);
        String string10 = cv_0.a(analyticsManager$Companion);
        object3 = zE2.a;
        String string11 = string6;
        string6 = null;
        String string12 = string5;
        string5 = null;
        String string13 = string4;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "order details interaction", "Re-enter Bank Details", string2, "order_details_interaction", string7, string8, string9, bundle, string10, false, null, n3, null);
        object3 = analyticsManager$Companion.getInstance().getGtmEvents();
        object4 = returnRequest.getReturnId();
        string2 = "order details screen";
        String string14 = "IMPS - Clicked on Transfer to Bank";
        cP.b("IMPS_Clicked_transfer_to_bank_", (String)object4, (GTMEvents)object3, string14, string2);
        object3 = yn2_22.D;
        String string15 = ((NewCustomEventsRevamp)object3).getEC_ORDER_LIST_INTERACTION();
        object4 = yn2_22.E;
        Object object5 = yn2_22.F;
        String string16 = "return transfer to bank";
        String string17 = "";
        String string18 = "return_transfer_to_bank";
        String string19 = "order details screen";
        String string20 = "referral screen";
        int n4 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string15, string16, string17, string18, string19, string20, (String)object4, null, (String)object5, false, null, n4, null);
        object4 = yn2_22.m;
        object5 = ReturnImpsActivity.class;
        object3 = new Intent((Context)object4, (Class)object5);
        object4 = new Bundle();
        boolean bl3 = true;
        if (bl2) {
            string2 = "IS_FROM_RCS_FLOW";
            object4.putBoolean(string2, bl3);
        } else {
            string2 = "IS_FROM_RCS_CC_REFUND_FLOW";
            object4.putBoolean(string2, bl3);
        }
        object5 = returnRequest.getImpsDetails();
        if (object5 != null) {
            object5 = ((ImpsDetails)object5).getExtnTranAmount();
        } else {
            bl3 = false;
            object5 = null;
        }
        float f5 = -1.0f;
        if (object5 != null && (object5 = returnRequest.getImpsDetails()) != null && (object5 = ((ImpsDetails)object5).getExtnTranAmount()) != null) {
            f5 = Float.parseFloat((String)object5);
        }
        string14 = returnRequest.getReturnId();
        object4.putString("RETURN_ID", string14);
        object4.putFloat("IMPS_AMOUNT", f5);
        object5 = yn2_22.h;
        if (object5 != null) {
            object5 = ((CartOrder)object5).getCode();
        } else {
            bl3 = false;
            object5 = null;
        }
        string2 = "IMPS_ORDER_CODE";
        object4.putString(string2, (String)object5);
        object3.putExtras((Bundle)object4);
        int n7 = 69;
        yn2_22.startActivityForResult((Intent)object3, n7);
        object3 = yn2_22.h;
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        object4 = returnRequest.getReturnEntries();
        object5 = string13;
        Intrinsics.checkNotNullExpressionValue(object4, string13);
        object4 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object4);
        if (object4 != null && (object4 = ((OrderDetailLineItem)object4).getEntry()) != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
            string3 = ((Product)object4).getCode();
        }
        object4 = string3;
        object = returnRequest.getReturnStatus();
        string2 = string11;
        object5 = string12;
        object3 = px1_2.b(string12, (String)object3, string11, string3);
        object3.putString((String)object2, (String)object);
        analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent("bag screen - wishlist halfcut screen", (Bundle)object3);
    }

    public final void t6(ReturnRequest returnRequest, CartOrder cartOrder, boolean bl2) {
        yn2_2 yn2_22 = this;
        Object object = returnRequest;
        Intrinsics.checkNotNullParameter(returnRequest, "returnRequest");
        Object object2 = cartOrder;
        Intrinsics.checkNotNullParameter(cartOrder, "cartOrder");
        Object object3 = this.m;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            boolean bl3 = object3.isFinishing();
            if (!bl3) {
                object3 = "order details screen";
                if (bl2) {
                    object2 = AnalyticsManager.Companion;
                    GTMEvents gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    gTMEvents.setScreenName((String)object3);
                    object3 = returnRequest.getReturnId();
                    if (object3 == null) {
                        object3 = "";
                    }
                    Object object4 = object3;
                    object3 = ye3_0.a;
                    Intrinsics.checkNotNullParameter(object4, "id");
                    object3 = new Bundle();
                    object3.putString("order_id", (String)object4);
                    gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    String string2 = av_0.a((AnalyticsManager$Companion)object2);
                    AnalyticsData analyticsData = ne_0.b((Bundle)object3);
                    String string3 = ye3_0.d;
                    int n3 = 16;
                    Object var15_20 = null;
                    Object var16_22 = null;
                    GTMEvents.pushButtonTapEvent$default(gTMEvents, string3, object4, string2, analyticsData, null, n3, null);
                    object3 = new Bundle();
                    object = yn2_22.l;
                    if (object != null) {
                        object2 = "AjioCashFragmentRefresh";
                        int n4 = 929;
                        object.onFragmentInteraction((String)object2, n4, (Bundle)object3);
                    }
                } else {
                    Object object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string4 = returnRequest.getReturnId();
                    String string5 = "IMPS - Clicked on Transfer to Bank";
                    cP.b("IMPS_Clicked_transfer_to_bank_", string4, (GTMEvents)object5, string5, (String)object3);
                    NewCustomEventsRevamp newCustomEventsRevamp = this.D;
                    String string6 = newCustomEventsRevamp.getEC_ORDER_LIST_INTERACTION();
                    String string7 = this.E;
                    object3 = this.F;
                    String string8 = "return transfer to bank";
                    String string9 = "";
                    String string10 = "return_transfer_to_bank";
                    String string11 = "order details screen";
                    String string12 = "referral screen";
                    int n7 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, string8, string9, string10, string11, string12, string7, null, (String)object3, false, null, n7, null);
                    object5 = this.m;
                    object3 = new Intent((Context)object5, ReturnImpsActivity.class);
                    object5 = new Bundle();
                    String string13 = returnRequest.getReturnId();
                    object5.putString("RETURN_ID", string13);
                    string4 = "IMPS_AMOUNT";
                    float f5 = returnRequest.getImpsAmount();
                    object5.putFloat(string4, f5);
                    object = "IMPS_ORDER_CODE";
                    object2 = cartOrder.getCode();
                    object5.putString((String)object, (String)object2);
                    object3.putExtras((Bundle)object5);
                    this.startActivity((Intent)object3);
                }
            }
        }
    }

    public final void z3() {
        Bundle bundle = new Bundle();
        String string2 = this.f;
        bundle.putString("product_code", string2);
        string2 = this.g;
        bundle.putString("clicked_item_code", string2);
        string2 = this.B;
        bundle.putString("RETURN_ID", string2);
        bundle.putBoolean("IS_RETURN_ID_REDIRECTION", true);
        OnFragmentInteractionListener onFragmentInteractionListener = this.l;
        Intrinsics.checkNotNull(onFragmentInteractionListener);
        string2 = com.ril.ajio.myaccount.order.fragment.b.Z;
        onFragmentInteractionListener.onFragmentInteraction(string2, 3, bundle);
    }
}

