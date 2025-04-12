/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
import android.text.TextUtils;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.gson.JsonObject;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.payment.fragment.d$a;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.PaymentInformation;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.data.Product.CrossSellProducts;
import com.ril.ajio.services.data.Product.Data;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from ya
 */
public final class ya_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ya_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        Object object3 = "this$0";
        Fragment fragment = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                DataCallback dataCallback = (DataCallback)object;
                fragment = (h)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                Intrinsics.checkNotNullParameter(dataCallback, "cartDataCallback");
                object3 = ((h)fragment).e;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    n7 = 0;
                    object3 = null;
                }
                ((PEProgressView)((Object)object3)).dismiss();
                n7 = dataCallback.getStatus();
                if (n7 == 0) {
                    Object object4;
                    Object object5;
                    String string2 = JsonUtils.toJson((JsonObject)dataCallback.getData());
                    object3 = (PayNowResponse)JsonUtils.fromJson(string2, PayNowResponse.class);
                    if (object3 != null && (object5 = ((PayNowResponse)object3).getTransactionInformation()) != null) {
                        if ((object5 = ((TransactionInformation)object5).getPaymentInformation()) != null) {
                            object5 = ((PaymentInformation)object5).getPaymentInstrument();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        String string3 = "UPI";
                        n3 = (int)(kotlin.text.b.i((String)object5, string3, n3 != 0) ? 1 : 0);
                        if (n3 != 0) return Unit.a;
                    }
                    ((h)fragment).E = object3;
                    if (object3 != null) {
                        object4 = ((PayNowResponse)object3).getTransactionId();
                    } else {
                        n3 = 0;
                        object4 = null;
                    }
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                    object3 = "Placeorder_Loyaltyrewadz";
                    if (n3 == 0) {
                        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                        object2 = analyticsManager$Companion.getInstance().getGtmEvents();
                        object4 = "NewCard_EntirelythroughLR";
                        ak0_0.a(analyticsManager$Companion, (GTMEvents)object2, (String)object3, (String)object4);
                        PayNowResponse payNowResponse = ((h)fragment).E;
                        if (payNowResponse == null) return Unit.a;
                        object2 = d.Companion;
                        String string4 = ((h)fragment).C;
                        String string5 = payNowResponse.getTransactionId();
                        object2.getClass();
                        int n8 = 2;
                        String string6 = "";
                        boolean bl2 = true;
                        object5 = fragment;
                        d d2 = d$a.a((vp1_2)((Object)fragment), n8, string4, string5, string6, bl2, null);
                        object2 = fragment.getChildFragmentManager();
                        object4 = "MobileOtpBottomSheetFragment";
                        d2.show((FragmentManager)object2, (String)object4);
                        return Unit.a;
                    } else {
                        object4 = ((h)fragment).F;
                        if (object4 != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null && (object4 = ((h)fragment).F) != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null) {
                            object2 = ((PriceSplitUp)object4).getLoyalty();
                        }
                        if (object2 != null) {
                            object2 = AnalyticsManager.Companion;
                            object4 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                            object5 = "NewCard_SplitPayment";
                            ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object4, (String)object3, (String)object5);
                        }
                        ((h)fragment).Oa(string2);
                    }
                    return Unit.a;
                } else {
                    int n10 = dataCallback.getStatus();
                    if (n10 != n3) return Unit.a;
                    ((h)fragment).Oa(null);
                }
                return Unit.a;
            }
            case 1: {
                DataCallback dataCallback = (DataCallback)object;
                fragment = (NewProductDetailsFragment)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                Intrinsics.checkNotNullParameter(dataCallback, "crossCellProductsDataCallback");
                object3 = cp_1.Companion;
                int n14 = nn_2.b((cp$a)object3, dataCallback);
                if (n14 == 0) return Unit.a;
                n14 = dataCallback.getStatus();
                if (n14 == 0) {
                    void var1_13;
                    int n15;
                    Data data;
                    Serializable serializable;
                    CrossSellProducts crossSellProducts = (CrossSellProducts)dataCallback.getData();
                    object3 = tr2_2.a;
                    n14 = (int)(tr2_2.u(((NewProductDetailsFragment)fragment).f1) ? 1 : 0);
                    if (n14 != 0) {
                        if (crossSellProducts != null && (object3 = crossSellProducts.getData()) != null) {
                            object3 = ((Data)object3).getPriceRevealMetaInfo();
                        } else {
                            n14 = 0;
                            object3 = null;
                        }
                        if (object3 != null) {
                            serializable = ((PriceRevealMetaInfo)object3).getSaleStartTime();
                        } else {
                            n4 = 0;
                            serializable = null;
                        }
                        if (object3 != null) {
                            object3 = ((PriceRevealMetaInfo)object3).getSaleEndTime();
                        } else {
                            n14 = 0;
                            object3 = null;
                        }
                        tr2_2.B((Long)serializable, (Long)object3);
                    }
                    if (crossSellProducts != null && (data = crossSellProducts.getData()) != null) {
                        List list = data.getProducts();
                    } else {
                        n15 = 0;
                        Object var1_12 = null;
                    }
                    ArrayList arrayList = (ArrayList)var1_13;
                    if (arrayList == null || (n14 = arrayList.isEmpty() ^ n3) != n3) return Unit.a;
                    ((NewProductDetailsFragment)fragment).Q0 = arrayList;
                    object3 = ((NewProductDetailsFragment)fragment).L;
                    if (object3 != null) {
                        object3 = ((RecyclerView)object3).getAdapter();
                    } else {
                        n14 = 0;
                        object3 = null;
                    }
                    n4 = object3 instanceof yh2_1;
                    if (n4 != 0) {
                        object3 = (yh2_1)object3;
                    } else {
                        n14 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        n4 = 30;
                        object3 = ((yh2_1)object3).g(n4);
                    } else {
                        n14 = 0;
                        object3 = null;
                    }
                    serializable = ((NewProductDetailsFragment)fragment).R0;
                    if (serializable != null) {
                        ((ArrayList)serializable).clear();
                    }
                    Iterator iterator = arrayList.iterator();
                    boolean bl3 = false;
                    Object object6 = null;
                    int n16 = 0;
                    Object var12_35 = null;
                    while (bl3 = iterator.hasNext()) {
                        object6 = iterator.next();
                        int n17 = n16 + 1;
                        if (n16 >= 0) {
                            Product product = object6;
                            product = (Product)object6;
                            Object var14_39 = null;
                            int n18 = 12;
                            String string7 = "";
                            object6 = n00.c(product, n16, null, string7, false, n18);
                            if (serializable != null) {
                                ((ArrayList)serializable).add(object6);
                            }
                            n16 = n17;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    if (object3 == null) return Unit.a;
                    n15 = ((Number)object3).intValue();
                    object2 = ((NewProductDetailsFragment)fragment).L;
                    if (object2 == null || (object2 = ((RecyclerView)object2).getAdapter()) == null) return Unit.a;
                    ((RecyclerView$f)object2).notifyItemChanged(n15);
                    return Unit.a;
                } else {
                    int n19 = dataCallback.getStatus();
                    if (n19 != n3) return Unit.a;
                    fragment.getClass();
                }
                return Unit.a;
            }
            case 0: 
        }
        Boolean bl4 = (Boolean)object;
        fragment = (ia_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object3);
        boolean bl5 = bl4;
        if (bl5) {
            CardView cardView;
            F12 f12 = ((q22_0)fragment).cb();
            bl5 = f12.b();
            if (bl5 || (cardView = ((ia_0)fragment).H1) == null) return Unit.a;
            ai0_2.B((View)cardView);
            return Unit.a;
        } else {
            CardView cardView = ((ia_0)fragment).H1;
            if (cardView == null) return Unit.a;
            ai0_2.i((View)cardView);
        }
        return Unit.a;
    }
}

