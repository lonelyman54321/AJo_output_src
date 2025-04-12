/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderDetailFunctionalRepo;
import com.ril.ajio.services.data.Cart.CartConsumedEntry;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xN2
 */
public final class xn2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object bundle) {
        float f5;
        int n3;
        float f6;
        Object object;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                Bundle bundle2 = bundle;
                bundle2 = (DataCallback)bundle;
                object2 = (hy3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((hy3_0)object2).s.k(bundle2);
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = bundle;
        object4 = (DataCallback)bundle;
        object2 = (yn2_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object4, "cartOrderDataCallback");
        object3 = (CartOrder)object4.getData();
        object2.getClass();
        boolean bl2 = false;
        Object object5 = null;
        if (object3 != null && (object = ((CartOrder)object3).getReturnFee()) != null) {
            double d2 = (Double)object;
            f6 = (float)d2;
        } else if (object3 != null && (object3 = ((CartOrder)object3).getConsignmentsData()) != null && (object3 = (Consignment)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((Consignment)object3).getReturnRequests()) != null && (object3 = (ReturnRequest)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((ReturnRequest)object3).getReturnEntries()) != null && (object3 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((OrderDetailLineItem)object3).getEntry()) != null && (object3 = ((CartEntry)object3).getReturnFee()) != null && (object3 = je3_2.e((String)object3)) != null) {
            f6 = ((Float)object3).floatValue();
        } else {
            n3 = 0;
            f6 = 0.0f;
            object3 = null;
        }
        object = h40_0.a;
        int n7 = h40_0.f2();
        if (n7 != 0 && (n3 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
            AJIOApplication.Companion.getClass();
            object5 = AJIOApplication$a.a();
            object3 = new jo_2((Context)object5);
            object5 = ((yn2_2)object2).Pa();
            object3 = ((jo_2)object3).f();
            object = ((yn2_2)object2).f;
            ((qz1_2)object5).A((String)object3, (String)object);
        }
        if ((n3 = (int)(nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object4) ? 1 : 0)) != 0) {
            n3 = object4.getStatus();
            int n8 = 1;
            int n10 = 8;
            if (n3 == 0) {
                ((yn2_2)object2).h = object3 = (CartOrder)object4.getData();
                if (object3 != null) {
                    Object object6;
                    Object object7;
                    Object object8;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((CartOrder)object3).getPotentialProductPromotions();
                    object4 = ((yn2_2)object2).h;
                    Intrinsics.checkNotNull(object4);
                    object4 = object4.getAppliedProductPromotions();
                    if ((object3 != null || object4 != null) && object4 != null) {
                        int n14;
                        ((yn2_2)object2).U = object3 = new HashMap();
                        object3 = object4.iterator();
                        while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                            object4 = (CartPromotion)object3.next();
                            object5 = object4.getConsumedEntires().iterator();
                            while ((n7 = object5.hasNext()) != 0) {
                                int n15;
                                object = (CartConsumedEntry)object5.next();
                                object8 = ((yn2_2)object2).U;
                                if (object8 != null && (n14 = ((HashMap)object8).containsKey(object7 = Integer.valueOf(n15 = ((CartConsumedEntry)object).getOrderEntryNumber()))) == n8) {
                                    object8 = ((yn2_2)object2).U;
                                    if (object8 != null) {
                                        n15 = ((CartConsumedEntry)object).getOrderEntryNumber();
                                        object7 = n15;
                                        object8 = (HashSet)((HashMap)object8).get(object7);
                                    } else {
                                        n14 = 0;
                                        object8 = null;
                                    }
                                } else {
                                    object8 = new HashSet();
                                }
                                Intrinsics.checkNotNull(object8);
                                ((HashSet)object8).add(object4);
                                object7 = ((yn2_2)object2).U;
                                Intrinsics.checkNotNull(object7);
                                n7 = ((CartConsumedEntry)object).getOrderEntryNumber();
                                object = n7;
                                ((HashMap)object7).put(object, object8);
                            }
                        }
                        object3 = ((yn2_2)object2).h;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CartOrder)object3).getUnconsignedEntries();
                        object4 = "iterator(...)";
                        if (object3 != null) {
                            object3 = ((yn2_2)object2).h;
                            Intrinsics.checkNotNull(object3);
                            object3 = ((CartOrder)object3).getUnconsignedEntries();
                            object5 = "getUnconsignedEntries(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                            n3 = object3.isEmpty() ^ n8;
                            if (n3 != 0) {
                                object3 = ((yn2_2)object2).h;
                                Intrinsics.checkNotNull(object3);
                                object3 = ((CartOrder)object3).getUnconsignedEntries().iterator();
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                while (bl2 = object3.hasNext()) {
                                    object5 = (CartEntry)object3.next();
                                    if (object5 == null) continue;
                                    object = ((yn2_2)object2).U;
                                    if (object != null) {
                                        object8 = ((CartEntry)object5).getEntryNumber();
                                        object = (HashSet)((HashMap)object).get(object8);
                                    } else {
                                        n7 = 0;
                                        object = null;
                                    }
                                    if (object == null || (n14 = (int)(object.isEmpty() ? 1 : 0)) != 0) continue;
                                    object8 = ((CartEntry)object5).getCartAppliedPromotionInfoList();
                                    if (object8 != null) {
                                        object8 = ((CartEntry)object5).getCartAppliedPromotionInfoList();
                                        object8.addAll(object);
                                    }
                                    if ((object8 = ((CartEntry)object5).getOrderEntry()) == null || (object8 = ((CartEntry)object5).getOrderEntry().getCartAppliedPromotionInfoList()) == null) continue;
                                    object5 = ((CartEntry)object5).getOrderEntry().getCartAppliedPromotionInfoList();
                                    object5.addAll(object);
                                }
                            }
                        }
                        object3 = ((yn2_2)object2).h;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((CartOrder)object3).getConsignmentsData();
                        if (object3 != null) {
                            object3 = ((yn2_2)object2).h;
                            Intrinsics.checkNotNull(object3);
                            object3 = ((CartOrder)object3).getConsignmentsData();
                            object5 = "getConsignmentsData(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                            n3 = object3.isEmpty() ^ n8;
                            if (n3 != 0) {
                                object3 = ((yn2_2)object2).h;
                                Intrinsics.checkNotNull(object3);
                                object3 = ((CartOrder)object3).getConsignmentsData().iterator();
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                                    object4 = (Consignment)object3.next();
                                    if (object4 == null || (object5 = object4.getEntries()) == null) continue;
                                    object4 = object4.getEntries().iterator();
                                    while (bl2 = object4.hasNext()) {
                                        object5 = (CartEntry)object4.next();
                                        object = ((yn2_2)object2).U;
                                        if (object != null) {
                                            object8 = ((CartEntry)object5).getOrderEntry().getEntryNumber();
                                            object = (HashSet)((HashMap)object).get(object8);
                                        } else {
                                            n7 = 0;
                                            object = null;
                                        }
                                        if (object == null || (n14 = (int)(object.isEmpty() ? 1 : 0)) != 0) continue;
                                        object8 = ((CartEntry)object5).getCartAppliedPromotionInfoList();
                                        object8.addAll(object);
                                        object5 = ((CartEntry)object5).getOrderEntry().getCartAppliedPromotionInfoList();
                                        object5.addAll(object);
                                    }
                                }
                            }
                        }
                    }
                    if ((object3 = ((yn2_2)object2).h) != null && (n3 = (int)(no_2.h((CartOrder)object3) ? 1 : 0)) == n8) {
                        object3 = OrderDetailFunctionalRepo.INSTANCE;
                        object4 = ((yn2_2)object2).h;
                        object5 = ((yn2_2)object2).B;
                        if ((object3 = ((OrderDetailFunctionalRepo)object3).getReturnRequestCancelledPopUpData((CartOrder)object4, (String)object5)) != null) {
                            lo2_2.Companion.getClass();
                            object4 = new lo2_2();
                            object5 = new Bundle();
                            object = "popup_data";
                            object5.putParcelable((String)object, (Parcelable)object3);
                            object4.setArguments((Bundle)object5);
                            object3 = ((Fragment)object2).requireActivity().getSupportFragmentManager();
                            object5 = "Return Request Cancelled PopUp";
                            object4.show((FragmentManager)object3, (String)object5);
                        }
                    }
                    object3 = OrderDetailFunctionalRepo.INSTANCE;
                    object4 = ((yn2_2)object2).h;
                    object5 = ((yn2_2)object2).B;
                    object4 = ((OrderDetailFunctionalRepo)object3).getReturnDetailList((CartOrder)object4, (String)object5);
                    ((yn2_2)object2).A = object4;
                    object4 = ((yn2_2)object2).h;
                    object5 = ((yn2_2)object2).B;
                    object4 = ((OrderDetailFunctionalRepo)object3).getReturnObject((CartOrder)object4, (String)object5);
                    object5 = ((yn2_2)object2).h;
                    object = ((yn2_2)object2).B;
                    String string2 = ((OrderDetailFunctionalRepo)object3).getReturnOrderRawStatus((CartOrder)object5, (String)object);
                    object8 = ((yn2_2)object2).A;
                    Object object9 = ((yn2_2)object2).l;
                    Object object10 = ((yn2_2)object2).Pa();
                    object5 = object6;
                    object = object4;
                    object7 = object2;
                    Object object11 = object2;
                    Object object12 = object2;
                    Object object13 = object2;
                    Object object14 = object6;
                    object6 = object10;
                    object5 = new tn2_1((ReturnRequest)object4, (ArrayList)object8, (HN2)object2, (hE2)object2, (wx0_0)object2, (OT2)object2, (OnFragmentInteractionListener)object9, (qz1_2)object10);
                    object5 = ((yn2_2)object2).r;
                    if (object5 != null) {
                        ((RecyclerView)object5).setAdapter((RecyclerView$f)object14);
                    }
                    if ((object5 = ((yn2_2)object2).y) != null) {
                        hv3_0.s0((ShimmerFrameLayout)((Object)object5));
                    }
                    if ((object5 = ((yn2_2)object2).z) != null) {
                        Intrinsics.checkNotNull(object5);
                        object5.setVisibility(n10);
                    }
                    object5 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                    n7 = 0;
                    object = null;
                    object8 = "order_id";
                    object7 = "order_status";
                    object11 = "";
                    if (object5 != null) {
                        object5 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                        Intrinsics.checkNotNull(object5);
                        object5 = ((ReturnRequest)object5).getReturnEntries();
                        if (object5 != null) {
                            object5 = new Bundle();
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            int n16 = ((ReturnRequest)object12).getReturnEntries().size();
                            object12 = String.valueOf(n16);
                            object5.putString("number_of_products", (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnEntries();
                            object13 = "getReturnEntries(...)";
                            Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                            object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                            if (object12 == null || (object12 = ((OrderDetailLineItem)object12).getEntry()) == null || (object12 = ((CartEntry)object12).getProduct()) == null || (object12 = ((Product)object12).getCode()) == null) {
                                object12 = object11;
                            }
                            object9 = "product_id";
                            object5.putString((String)object9, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                            object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                            if (object12 == null || (object12 = ((OrderDetailLineItem)object12).getEntry()) == null || (object12 = ((CartEntry)object12).getProduct()) == null || (object12 = ((Product)object12).getName()) == null) {
                                object12 = object11;
                            }
                            object9 = "product_name";
                            object5.putString((String)object9, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnId();
                            if (object12 == null) {
                                object12 = object11;
                            }
                            object9 = "return_id";
                            object5.putString((String)object9, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                            object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                            if (object12 == null || (object12 = ((OrderDetailLineItem)object12).getEntry()) == null || (object12 = ((CartEntry)object12).getEntryStatus()) == null) {
                                object12 = object11;
                            }
                            object5.putString((String)object7, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getBankReferenceNumber();
                            if (object12 == null) {
                                object12 = object11;
                            }
                            object9 = "reference_no";
                            object5.putString((String)object9, (String)object12);
                            object12 = ((yn2_2)object2).f;
                            object5.putString((String)object8, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                            object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                            if (object12 != null && (object12 = ((OrderDetailLineItem)object12).getEntry()) != null && (object12 = ((CartEntry)object12).getProduct()) != null) {
                                object12 = ((Product)object12).getBrickCategory();
                            } else {
                                n16 = 0;
                                object12 = null;
                            }
                            object9 = "product_brick";
                            object5.putString((String)object9, (String)object12);
                            object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object12);
                            object12 = ((ReturnRequest)object12).getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                            object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                            if (object12 != null && (object12 = ((OrderDetailLineItem)object12).getEntry()) != null && (object12 = ((CartEntry)object12).getProduct()) != null && (object12 = ((Product)object12).getFnlProductData()) != null) {
                                object12 = ((ProductfnlProductData)object12).getPlanningCategory();
                            } else {
                                n16 = 0;
                                object12 = null;
                            }
                            if (object12 != null && (n16 = ((String)object12).length()) != 0) {
                                object12 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                                Intrinsics.checkNotNull(object12);
                                object12 = ((ReturnRequest)object12).getReturnEntries();
                                Intrinsics.checkNotNullExpressionValue(object12, (String)object13);
                                object12 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object12);
                                if (object12 != null && (object12 = ((OrderDetailLineItem)object12).getEntry()) != null && (object12 = ((CartEntry)object12).getProduct()) != null && (object12 = ((Product)object12).getFnlProductData()) != null) {
                                    object12 = ((ProductfnlProductData)object12).getPlanningCategory();
                                } else {
                                    n16 = 0;
                                    object12 = null;
                                }
                            } else {
                                object12 = object11;
                            }
                            object9 = "product_category";
                            object5.putString((String)object9, (String)object12);
                            object3 = ((OrderDetailFunctionalRepo)object3).getReturnRequest();
                            Intrinsics.checkNotNull(object3);
                            object3 = ((ReturnRequest)object3).getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object13);
                            object3 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object3);
                            if (object3 != null && (object3 = ((OrderDetailLineItem)object3).getEntry()) != null) {
                                object3 = ((CartEntry)object3).getCancellable();
                                object12 = Boolean.TRUE;
                                n3 = (int)(Intrinsics.areEqual(object3, object12) ? 1 : 0);
                            } else {
                                n3 = 0;
                                f6 = 0.0f;
                                object3 = null;
                            }
                            object5.putInt("iscancelorderblocked", n3 ^= n8);
                            object3 = AnalyticsManager.Companion;
                            object12 = "consolidated order details screen";
                            vb0_0.a((AnalyticsManager$Companion)object3, (String)object12, (Bundle)object5);
                        }
                    }
                    if ((n3 = (int)(((yn2_2)object2).J ? 1 : 0)) != 0) {
                        ((yn2_2)object2).J = false;
                        object3 = ((yn2_2)object2).r;
                        if (object3 != null) {
                            object3 = ((RecyclerView)object3).getAdapter();
                        } else {
                            n3 = 0;
                            f6 = 0.0f;
                            object3 = null;
                        }
                        if (object3 != null && (n3 = ((RecyclerView$f)object3).getItemCount()) > 0 && (object5 = ((yn2_2)object2).r) != null) {
                            ((RecyclerView)object5).scrollToPosition(n3 -= n8);
                        }
                    }
                    object3 = h40_0.a;
                    bl2 = h40_0.U0();
                    if (bl2 && (object5 = ((yn2_2)object2).f) != null) {
                        object = ((yn2_2)object2).Pa();
                        if (string2 != null) {
                            object11 = string2;
                        }
                        ((qz1_2)object).n((String)object5, (String)object11);
                    }
                    if (!(bl2 = ((yn2_2)object2).K) && (n3 = (int)(((h40_0)object3).i2() ? 1 : 0)) != 0) {
                        if (object4 != null) {
                            object3 = object4.getReturnCancelCtaMessage();
                        } else {
                            n3 = 0;
                            f6 = 0.0f;
                            object3 = null;
                        }
                        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
                            ((yn2_2)object2).K = n8;
                            object3 = ((yn2_2)object2).Pa();
                            object2 = ((yn2_2)object2).h;
                            object2 = object2 != null ? ((CartOrder)object2).getCode() : null;
                            object14 = object4 != null ? object4.getReturnStatus() : null;
                            object3.getClass();
                            object4 = new Bundle();
                            object4.putString((String)object7, (String)object14);
                            object4.putString((String)object8, (String)object2);
                            object2 = AnalyticsManager.Companion;
                            object5 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                            String string3 = ((NewCustomEventsRevamp)object5).getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
                            String string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
                            object2 = ((qz1_2)object3).N;
                            String string5 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                            NewCustomEventsRevamp newCustomEventsRevamp = ((qz1_2)object3).M;
                            string2 = "return cancellation message";
                            object10 = "seen";
                            String string6 = "order item details screen";
                            int n17 = 1632;
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string2, (String)object10, string4, string6, null, null, object4, string5, false, null, n17, null);
                        }
                    }
                }
            } else {
                n3 = object4.getStatus();
                if (n3 == n8) {
                    object3 = ((yn2_2)object2).y;
                    if (object3 != null) {
                        hv3_0.s0((ShimmerFrameLayout)((Object)object3));
                    }
                    if ((object3 = ((yn2_2)object2).z) != null) {
                        Intrinsics.checkNotNull(object3);
                        object3.setVisibility(n10);
                    }
                    if ((object3 = ((Fragment)object2).getActivity()) != null && (object3 = ((yn2_2)object2).n) != null) {
                        object2 = ((Fragment)object2).requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                        object4 = "Order details for this order cannot be loaded, try again later";
                        bl2 = false;
                        object5 = null;
                        object3.showToastNotification((Context)object2, (String)object4, n8, null);
                    }
                }
            }
        }
        return Unit.a;
    }
}

