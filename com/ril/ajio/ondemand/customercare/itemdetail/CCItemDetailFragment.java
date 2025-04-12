/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.itemdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailAdapter;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment$Companion;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment$special$$inlined$activityViewModels$default$1;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment$special$$inlined$activityViewModels$default$2;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment$special$$inlined$activityViewModels$default$3;
import com.ril.ajio.ondemand.customercare.view.activity.CCCancelOrderActivity;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import com.ril.ajio.services.data.CustomerCare.itemstatus.CCCartEntryStatus;
import com.ril.ajio.services.data.CustomerCare.itemstatus.ItemStatusMap;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ErrorMessage;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ReturnedQtyMap;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.c;
import kotlin.text.b;

public final class CCItemDetailFragment
extends CCBaseFragment
implements i82_0,
OnNavigationClickListener {
    public static final CCItemDetailFragment$Companion Companion;
    public static final String TAG = "CCItemDetailFragment";
    private HashMap bundledatalist;
    private xf_1 cCBundleViewModel;
    private final wq_0 ccCustomEvent;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private boolean isLuxeOrder;
    private CCViewModel mCCViewModel;
    private CCCartEntryStatus mCartEntryStatus;
    private CartOrder mCartOrder;
    private boolean mFromOrderDetail;
    private OnFragmentInteractionListener mListener;
    private String mOrderId;
    private CartEntry mSelectedCartEntry;
    private int mSelectedEntryNumber;
    private boolean mSetResult;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private final rq1_2 orderDetailViewModel$delegate;
    private final String previousScreen;
    private final String previousScreenType;
    private RecyclerView recyclerView;

    static {
        CCItemDetailFragment$Companion cCItemDetailFragment$Companion;
        Companion = cCItemDetailFragment$Companion = new CCItemDetailFragment$Companion(null);
    }

    public CCItemDetailFragment() {
        Object object = Reflection.getOrCreateKotlinClass(db2_1.class);
        Object object2 = new CCItemDetailFragment$special$$inlined$activityViewModels$default$1(this);
        CCItemDetailFragment$special$$inlined$activityViewModels$default$2 cCItemDetailFragment$special$$inlined$activityViewModels$default$2 = new CCItemDetailFragment$special$$inlined$activityViewModels$default$2(null, this);
        CCItemDetailFragment$special$$inlined$activityViewModels$default$3 cCItemDetailFragment$special$$inlined$activityViewModels$default$3 = new CCItemDetailFragment$special$$inlined$activityViewModels$default$3(this);
        this.orderDetailViewModel$delegate = object = LW0.a(this, (yn1_2)object, (Function0)object2, cCItemDetailFragment$special$$inlined$activityViewModels$default$2, cCItemDetailFragment$special$$inlined$activityViewModels$default$3);
        object = AnalyticsManager.Companion;
        this.newEEcommerceEventsRevamp = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.newCustomEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.previousScreen = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.previousScreenType = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = new HashMap();
        this.bundledatalist = object;
        this.ccCustomEvent = object = new wq_0();
    }

    public static /* synthetic */ Unit Oa(CCItemDetailFragment cCItemDetailFragment, DataCallback dataCallback) {
        return CCItemDetailFragment.initObservables$lambda$3(cCItemDetailFragment, dataCallback);
    }

    public static /* synthetic */ void Pa(CCItemDetailFragment cCItemDetailFragment) {
        CCItemDetailFragment.setToolbarUI$lambda$0(cCItemDetailFragment);
    }

    public static /* synthetic */ Unit Qa(CCItemDetailFragment cCItemDetailFragment, DataCallback dataCallback) {
        return CCItemDetailFragment.initObservables$lambda$4(cCItemDetailFragment, dataCallback);
    }

    public static /* synthetic */ Unit Ra(CCItemDetailFragment cCItemDetailFragment, DataCallback dataCallback) {
        return CCItemDetailFragment.initObservables$lambda$1(cCItemDetailFragment, dataCallback);
    }

    public static /* synthetic */ Unit Sa(CCItemDetailFragment cCItemDetailFragment, DataCallback dataCallback) {
        return CCItemDetailFragment.initObservables$lambda$2(cCItemDetailFragment, dataCallback);
    }

    private final void addDataBundle() {
        HashMap hashMap = this.bundledatalist;
        Object object = this.mCartOrder;
        Intrinsics.checkNotNull(object);
        object = no_2.c((CartOrder)object);
        hashMap.put("status", object);
        hashMap = this.bundledatalist;
        object = this.mCartOrder;
        Intrinsics.checkNotNull(object);
        object = ((CartOrder)object).getCode();
        hashMap.put("order_id", object);
        hashMap = this.bundledatalist;
        object = this.mSelectedCartEntry;
        String string2 = null;
        object = object != null && (object = ((CartEntry)object).getProduct()) != null ? ((Product)object).getCode() : null;
        if (object != null) {
            object = this.mSelectedCartEntry;
            if (object != null && (object = ((CartEntry)object).getProduct()) != null) {
                string2 = ((Product)object).getCode();
            }
            object = String.valueOf(string2);
        } else {
            object = "";
        }
        hashMap.put("product_id", object);
    }

    private final void checkExchangeAtOrderLeve(ReturnOrderItemDetails object, CartEntry cartEntry) {
        object = ((ReturnOrderItemDetails)object).getOrderCode();
        Intrinsics.checkNotNullExpressionValue(object, "getOrderCode(...)");
        String string2 = "EX";
        boolean bl2 = b.s((String)object, string2, false);
        if (bl2) {
            cartEntry.setExchangeEligibleAtProdLevel(false);
        }
    }

    private final void checkExchangeAtStockLevel(CartEntry cartEntry, List object) {
        int n3;
        Intrinsics.checkNotNull(object);
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Serializable serializable = ((ProductOptionItem)object.next()).getStock();
            Intrinsics.checkNotNull(serializable);
            if ((serializable = ((Stock)serializable).getStockLevel()) != null && (n3 = ((Integer)serializable).intValue()) == 0) continue;
            return;
        }
        cartEntry.setExchangeEligibleAtProdLevel(false);
    }

    private final db2_1 getOrderDetailViewModel() {
        return (db2_1)this.orderDetailViewModel$delegate.getValue();
    }

    private final void getOrderDetails(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            this.showProgress();
            db2_1 db2_12 = this.getOrderDetailViewModel();
            if (db2_12 != null) {
                Intrinsics.checkNotNull(string2);
                db2_12.b(string2);
            }
        }
    }

    private final void getQALinks() {
        Object object = this.mCartEntryStatus;
        if (object != null) {
            boolean bl2;
            if (object != null) {
                object = ((CCCartEntryStatus)object).getItemStatusMap();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null && !(bl2 = object.isEmpty())) {
                object = this.mCartEntryStatus;
                Intrinsics.checkNotNull(object);
                object = ((CCCartEntryStatus)object).getItemStatusMap();
                CCViewModel cCViewModel = null;
                object = ((ItemStatusMap)((ArrayList)object).get(0)).getKey();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                if (bl3) {
                    return;
                }
                this.showProgress();
                cCViewModel = this.mCCViewModel;
                if (cCViewModel != null) {
                    Object object2 = this.mCartOrder;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartOrder)object2).getCode();
                    Intrinsics.checkNotNullExpressionValue(object2, "getCode(...)");
                    int n3 = this.mSelectedEntryNumber;
                    String string2 = String.valueOf(n3);
                    Intrinsics.checkNotNull(object);
                    cCViewModel.getQALinks((String)object2, string2, (String)object);
                }
            }
        }
    }

    private final void getSelectedEntryStatus() {
        this.showProgress();
        CCViewModel cCViewModel = this.mCCViewModel;
        if (cCViewModel != null) {
            Object object = this.mCartOrder;
            Intrinsics.checkNotNull(object);
            object = ((CartOrder)object).getCode();
            Intrinsics.checkNotNullExpressionValue(object, "getCode(...)");
            int n3 = this.mSelectedEntryNumber;
            String string2 = String.valueOf(n3);
            cCViewModel.getSelectedEntryStatus((String)object, string2);
        }
    }

    private final void handleBackButtonPress() {
        boolean bl2 = this.mSetResult;
        if (bl2) {
            bl2 = this.mFromOrderDetail;
            if (bl2) {
                this.setResultAndFinish();
            } else {
                pf_1 pf_12 = this.getCcActivityListener();
                if (pf_12 != null) {
                    pf_12.resetView();
                }
            }
        } else {
            pf_1 pf_13 = this.getCcActivityListener();
            if (pf_13 != null) {
                pf_13.popBackStack();
            }
        }
    }

    private final void handleReturnOrderDetailsResponse(ReturnOrderItemDetails clazz) {
        Object object;
        int n3;
        int n4 = 1;
        if (clazz == null) {
            return;
        }
        Object object2 = ((ReturnOrderItemDetails)((Object)clazz)).getMessages();
        String string2 = "format(...)";
        if (object2 != null && (n3 = ((ArrayList)(object2 = ((ReturnOrderItemDetails)((Object)clazz)).getMessages())).size()) > 0 && (n3 = (int)(b.i((String)(object2 = ((ReturnOrderItemDetails$ErrorMessage)((ReturnOrderItemDetails)((Object)clazz)).getMessages().get(0)).getKey()), (String)(object = "error"), n4 != 0) ? 1 : 0)) != 0) {
            clazz = ((ReturnOrderItemDetails$ErrorMessage)((ReturnOrderItemDetails)((Object)clazz)).getMessages().get(0)).getValue();
            object2 = StringCompanionObject.INSTANCE;
            n3 = R$string.acc_alert_message;
            object2 = hv3_0.K(n3);
            object = new Object[n4];
            object[0] = clazz;
            Object object3 = Arrays.copyOf(object, n4);
            object3 = String.format((String)object2, object3);
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            Intrinsics.checkNotNull(clazz);
            mq0_2.b((String)((Object)clazz), (String)object3);
        } else {
            Object object4;
            boolean bl2;
            object2 = this.mCartOrder;
            Intrinsics.checkNotNull(object2);
            object2 = ((CartOrder)object2).getConsignments().iterator();
            Intrinsics.checkNotNullExpressionValue(object2, "iterator(...)");
            object = null;
            while (bl2 = object2.hasNext()) {
                Object object5;
                object4 = (Consignment)object2.next();
                if (object4 != null && (object5 = ((Consignment)object4).getEntries()) != null) {
                    object5 = ((Consignment)object4).getEntries();
                    Object object6 = "getEntries(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
                    object5 = (Collection)object5;
                    int n7 = object5.isEmpty() ^ n4;
                    if (n7 != 0) {
                        int n8;
                        object5 = ((Consignment)object4).getEntries().iterator();
                        while ((n8 = object5.hasNext()) != 0) {
                            CartEntry cartEntry;
                            object6 = (CartEntry)object5.next();
                            if (object6 == null || (cartEntry = ((CartEntry)object6).getOrderEntry()) == null) continue;
                            object6 = ((CartEntry)object6).getOrderEntry().getEntryNumber();
                            int n10 = this.mSelectedEntryNumber;
                            if (object6 == null || (n8 = ((Integer)object6).intValue()) != n10) continue;
                            object = object4;
                            break;
                        }
                    }
                }
                if (object == null) continue;
            }
            ((ReturnOrderItemDetails)((Object)clazz)).setConsignment((Consignment)object);
            this.updateReturnableProductQuantity((ReturnOrderItemDetails)((Object)clazz));
            object2 = ((ReturnOrderItemDetails)((Object)clazz)).getConsignment();
            if (object2 != null && (n3 = (object2 = ((ReturnOrderItemDetails)((Object)clazz)).getConsignment().getEntries()).size()) != 0) {
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string2 = "returnorderbuttonclick";
                object = "selfCare item page";
                object4 = "Return order";
                ((GTMEvents)object2).pushButtonTapEvent((String)object4, string2, (String)object);
                object2 = ((ReturnOrderItemDetails)((Object)clazz)).getDeliveryAddress();
                if (object2 != null) {
                    object2 = ((ReturnOrderItemDetails)((Object)clazz)).getDeliveryAddress();
                    ((CartDeliveryAddress)object2).setDefaultAddress(n4 != 0);
                }
                Bundle bundle = new Bundle();
                object2 = "RETURN_ITEMS_DATA";
                bundle.putSerializable((String)object2, (Serializable)((Object)clazz));
                clazz = ExReturnAddressActivity.class;
                this.startActivityForResult(bundle, clazz, 0);
            } else {
                clazz = StringCompanionObject.INSTANCE;
                int n14 = R$string.acc_alert_message;
                clazz = hv3_0.K(n14);
                n3 = R$string.no_return_item;
                object2 = hv3_0.K(n3);
                object = new Object[n4];
                object[0] = object2;
                Object[] objectArray = Arrays.copyOf(object, n4);
                clazz = String.format((String)((Object)clazz), objectArray);
                Intrinsics.checkNotNullExpressionValue(clazz, string2);
                n4 = R$string.no_return_item;
                mq0_2.a(n4, (String)((Object)clazz));
            }
        }
    }

    private final void hideProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    private final void initObservables() {
        CCItemDetailFragment$sam$androidx_lifecycle_Observer$0 cCItemDetailFragment$sam$androidx_lifecycle_Observer$0;
        Function1 function1;
        mu1_1 mu1_12;
        Object object = this.getOrderDetailViewModel();
        if (object != null && (object = ((db2_1)object).d) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new mg_2(this);
            cCItemDetailFragment$sam$androidx_lifecycle_Observer$0 = new CCItemDetailFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCItemDetailFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.mCCViewModel) != null && (object = ((CCViewModel)object).getCcCartEntryStatusObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new ng_2(this);
            cCItemDetailFragment$sam$androidx_lifecycle_Observer$0 = new CCItemDetailFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCItemDetailFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.mCCViewModel) != null && (object = ((CCViewModel)object).getCcItemDetailsQAObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new og_2(this);
            cCItemDetailFragment$sam$androidx_lifecycle_Observer$0 = new CCItemDetailFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCItemDetailFragment$sam$androidx_lifecycle_Observer$0);
        }
        object = this.getOrderDetailViewModel();
        Intrinsics.checkNotNull(object);
        object = ((db2_1)object).f;
        mu1_12 = this.getViewLifecycleOwner();
        function1 = new pg_2(this);
        cCItemDetailFragment$sam$androidx_lifecycle_Observer$0 = new CCItemDetailFragment$sam$androidx_lifecycle_Observer$0(function1);
        ((LiveData)object).e(mu1_12, cCItemDetailFragment$sam$androidx_lifecycle_Observer$0);
    }

    private static final Unit initObservables$lambda$1(CCItemDetailFragment cCItemDetailFragment, DataCallback object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCItemDetailFragment, "this$0");
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        object2.getClass();
        int n4 = cp_1.J((DataCallback)object);
        if (n4 != 0) {
            int n7;
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (CartOrder)((DataCallback)object).getData()) != null) {
                    Object object3;
                    cCItemDetailFragment.mCartOrder = object;
                    ArrayList<Object> arrayList = new ArrayList<Object>();
                    object2 = ((CartOrder)object).getConsignments();
                    Object object4 = "iterator(...)";
                    if (object2 != null) {
                        boolean bl2;
                        object2 = ((CartOrder)object).getConsignments().iterator();
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                        while (bl2 = object2.hasNext()) {
                            boolean bl3;
                            Object object5;
                            object3 = (Consignment)object2.next();
                            if (object3 == null || (object5 = ((Consignment)object3).getEntries()) == null) continue;
                            object5 = ((Consignment)object3).getEntries().iterator();
                            while (bl3 = object5.hasNext()) {
                                CartEntry cartEntry;
                                CartEntry cartEntry2 = (CartEntry)object5.next();
                                if (cartEntry2 == null || (cartEntry = cartEntry2.getOrderEntry()) == null) continue;
                                cartEntry = cartEntry2.getOrderEntry();
                                String string2 = ((Consignment)object3).getCode();
                                cartEntry.setCode(string2);
                                cartEntry2 = cartEntry2.getOrderEntry();
                                arrayList.add(cartEntry2);
                            }
                        }
                    }
                    if ((object = ((CartOrder)object).getUnconsignedEntries()) != null) {
                        object = ((ArrayList)object).iterator();
                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object2 = (CartEntry)object.next();
                            if (object2 == null) continue;
                            object4 = ((CartEntry)object2).getOrderEntry();
                            if (object4 != null) {
                                object4 = ((CartEntry)object2).getOrderEntry();
                                object3 = ((CartEntry)object2).getCode();
                                ((CartEntry)object4).setCode((String)object3);
                            }
                            arrayList.add(object2);
                        }
                    }
                    if ((object = cCItemDetailFragment.mCartOrder) != null) {
                        ((CartOrder)object).setEntries(arrayList);
                    }
                    cCItemDetailFragment.getSelectedEntryStatus();
                }
            } else if (object != null && (n7 = ((DataCallback)object).getStatus()) == n3) {
                cCItemDetailFragment.hideProgress();
                object = StringCompanionObject.INSTANCE;
                n7 = R$string.acc_error_message;
                object = hv3_0.K(n7);
                object2 = "Order details for this order cannot be loaded, try again later";
                Object[] objectArray = new Object[n3];
                boolean bl4 = false;
                Object var8_12 = null;
                objectArray[0] = object2;
                Object object6 = Arrays.copyOf(objectArray, n3);
                object = String.format((String)object, object6);
                object6 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object6);
                cCItemDetailFragment.showNotification((String)object2, (String)object);
            }
            cCItemDetailFragment.pushScreenView();
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$2(CCItemDetailFragment cCItemDetailFragment, DataCallback object) {
        Object object2 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCItemDetailFragment, "this$0");
        Intrinsics.checkNotNullParameter(object, "ccCartEntryStatusDataCallback");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object);
        if (n4 != 0) {
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                cCItemDetailFragment.mCartEntryStatus = object = (CCCartEntryStatus)((DataCallback)object).getData();
                cCItemDetailFragment.getQALinks();
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    cCItemDetailFragment.hideProgress();
                    object = ((DataCallback)object).getError();
                    if (object != null) {
                        object3 = ((DataError)object).getErrors();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        object3 = ((DataError)object).getErrors();
                        Object[] objectArray = "getErrors(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                        object3 = (Collection)object3;
                        n4 = object3.isEmpty() ^ n3;
                        if (n4 != 0) {
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            object3 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object3 = hv3_0.K(n4);
                            objectArray = new Object[n3];
                            objectArray[0] = object;
                            object2 = Arrays.copyOf(objectArray, n3);
                            object2 = String.format((String)object3, object2);
                            String string2 = "format(...)";
                            Intrinsics.checkNotNullExpressionValue(object2, string2);
                            Intrinsics.checkNotNull(object);
                            cCItemDetailFragment.showNotification((String)object, (String)object2);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$3(CCItemDetailFragment cCItemDetailFragment, DataCallback object) {
        boolean bl2 = false;
        Object object2 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCItemDetailFragment, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object);
        if (n4 != 0) {
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (CCItemDetailsQAModel)((DataCallback)object).getData()) != null) {
                    cCItemDetailFragment.isLuxeOrder = bl2 = ((CCItemDetailsQAModel)object).isLuxuryOrder();
                    object = ((CCItemDetailsQAModel)object).getQuickLinksList();
                    cCItemDetailFragment.refreshUi((List)object);
                    cCItemDetailFragment.addDataBundle();
                }
            } else if (object != null && (n4 = ((DataCallback)object).getStatus()) == n3) {
                cCItemDetailFragment.hideProgress();
                object = ((DataCallback)object).getError();
                if (object != null) {
                    object3 = ((DataError)object).getErrors();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    object3 = ((DataError)object).getErrors();
                    Object[] objectArray = "getErrors(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                    object3 = (Collection)object3;
                    n4 = object3.isEmpty() ^ n3;
                    if (n4 != 0) {
                        object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                        object3 = StringCompanionObject.INSTANCE;
                        n4 = R$string.acc_error_message;
                        object3 = hv3_0.K(n4);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        object2 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object3, object2);
                        String string2 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        Intrinsics.checkNotNull(object);
                        cCItemDetailFragment.showNotification((String)object, (String)object2);
                    }
                }
            }
        }
        cCItemDetailFragment.hideProgress();
        return Unit.a;
    }

    private static final Unit initObservables$lambda$4(CCItemDetailFragment object, DataCallback object2) {
        Object object3 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object[] objectArray = cp$a.e();
        objectArray.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            ((CCItemDetailFragment)object).hideProgress();
            n4 = ((DataCallback)object2).getStatus();
            if (n4 == 0) {
                object2 = (ReturnOrderItemDetails)((DataCallback)object2).getData();
                ((CCItemDetailFragment)object).handleReturnOrderDetailsResponse((ReturnOrderItemDetails)object2);
            } else {
                int n7 = ((DataCallback)object2).getStatus();
                if (n7 == n3 && (object = ((DataCallback)object2).getError()) != null) {
                    object = ((DataCallback)object2).getError();
                    if (object != null) {
                        object = ((DataError)object).errors;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    object = (Collection)object;
                    if (object != null && (n7 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                        object = ((DataCallback)object2).getError();
                        Intrinsics.checkNotNull(object);
                        object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                        object2 = StringCompanionObject.INSTANCE;
                        int n8 = R$string.acc_error_message;
                        object2 = hv3_0.K(n8);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        object3 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object2, object3);
                        object3 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        Intrinsics.checkNotNull(object);
                        mq0_2.b((String)object, (String)object2);
                    }
                }
            }
        }
        return Unit.a;
    }

    private final void processBundle() {
        boolean bl2;
        Object object = this.cCBundleViewModel;
        if (object != null) {
            object = ((xf_1)object).e;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            int n3;
            this.mSelectedEntryNumber = n3 = ((yq_0)object).b;
            n3 = (int)(((yq_0)object).c ? 1 : 0);
            this.mFromOrderDetail = n3;
            this.mOrderId = object = ((yq_0)object).a;
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)(object = this.mOrderId))) {
            object = this.getMActivity();
            if (object != null) {
                object.finish();
            }
        } else {
            object = this.mOrderId;
            this.getOrderDetails((String)object);
        }
    }

    private final void pushScreenView() {
        Object object;
        Object object2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        Object object5;
        block23: {
            int n7;
            object5 = this.mCartOrder;
            object4 = null;
            if (object5 != null && (object5 = ((CartOrder)object5).getEntries()) != null) {
                object5 = xx_2.g((Collection)object5);
                n7 = ((c)object5).b;
                if (n7 >= 0) {
                    n4 = 0;
                    object3 = null;
                    while (true) {
                        int n8;
                        n3 = this.mSelectedEntryNumber;
                        object2 = this.mCartOrder;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((CartEntry)((CartOrder)object2).getEntries().get(n4)).getEntryNumber();
                        if (object2 != null && n3 == (n8 = ((Integer)object2).intValue())) {
                            object5 = this.mCartOrder;
                            Intrinsics.checkNotNull(object5);
                            object5 = ((CartOrder)object5).getEntries().get(n4);
                            break block23;
                        }
                        if (n4 == n7) break;
                        ++n4;
                    }
                }
            }
            n7 = 0;
            object5 = null;
        }
        Bundle bundle = new Bundle();
        object3 = this.newCustomEventsRevamp.getPRODUCT_ID();
        object5 = (CartEntry)object5;
        if (object5 != null) {
            object = ((CartEntry)object5).getProduct();
        } else {
            n3 = 0;
            object = null;
        }
        object2 = "";
        if (object != null) {
            if (object5 != null && (object = ((CartEntry)object5).getProduct()) != null) {
                object = ((Product)object).getCode();
            } else {
                n3 = 0;
                object = null;
            }
        } else {
            object = object2;
        }
        bundle.putString((String)object3, (String)object);
        object3 = this.newCustomEventsRevamp.getPRODUCT_NAME();
        if (object5 != null) {
            object = ((CartEntry)object5).getProduct();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            if (object5 != null && (object = ((CartEntry)object5).getProduct()) != null) {
                object = ((Product)object).getName();
            } else {
                n3 = 0;
                object = null;
            }
        } else {
            object = object2;
        }
        bundle.putString((String)object3, (String)object);
        object3 = this.newCustomEventsRevamp.getORDER_ID();
        object = this.mCartOrder;
        if (object != null) {
            object = ((CartOrder)object).getCode();
        } else {
            n3 = 0;
            object = null;
        }
        bundle.putString((String)object3, (String)object);
        if (object5 != null) {
            object3 = no_2.b((CartEntry)object5);
        } else {
            n4 = 0;
            object3 = null;
        }
        if (object3 != null) {
            if (object5 != null) {
                object4 = no_2.b((CartEntry)object5);
            }
        } else {
            object4 = object2;
        }
        bundle.putString("entry_status", (String)object4);
        object3 = this.newCustomEventsRevamp;
        String string2 = this.newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = this.newEEcommerceEventsRevamp.getPrevScreenType();
        ((NewCustomEventsRevamp)object3).newPushCustomScreenView("customer care - item details screen", "customer care screen", string2, bundle, string3);
    }

    private final void refreshUi(List object) {
        Object object2 = this.mCartOrder;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            object2 = ((CartOrder)object2).getEntries();
            if (object2 != null) {
                int n3;
                Serializable serializable;
                int n4;
                object2 = this.mCartOrder;
                Intrinsics.checkNotNull(object2);
                object2 = ((CartOrder)object2).getEntries();
                int n7 = object2.size();
                int n8 = 0;
                CCCartEntryStatus cCCartEntryStatus = null;
                int n10 = 0;
                Object object3 = null;
                while (true) {
                    n4 = 0;
                    if (n10 >= n7) break;
                    int n14 = this.mSelectedEntryNumber;
                    serializable = this.mCartOrder;
                    Intrinsics.checkNotNull(serializable);
                    serializable = ((CartEntry)((CartOrder)serializable).getEntries().get(n10)).getEntryNumber();
                    if (serializable != null && n14 == (n3 = ((Integer)serializable).intValue())) {
                        object2 = this.mCartOrder;
                        Intrinsics.checkNotNull(object2);
                        object2 = (CartEntry)((CartOrder)object2).getEntries().get(n10);
                        this.mSelectedCartEntry = object2;
                        if (object2 != null) {
                            object2 = ((CartEntry)object2).getProduct();
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        Y63.g((Product)object2);
                        break;
                    }
                    ++n10;
                }
                if ((object2 = this.mSelectedCartEntry) == null) {
                    return;
                }
                this.getMUiItemsList().clear();
                object2 = this.mSelectedCartEntry;
                if (object2 != null) {
                    object3 = this.mCartOrder;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((CartOrder)object3).getCode();
                    ((CartEntry)object2).setOrderId((String)object3);
                }
                object2 = this.mSelectedCartEntry;
                Intrinsics.checkNotNull(object2);
                object3 = this.mCartOrder;
                Intrinsics.checkNotNull(object3);
                n10 = ((CartOrder)object3).getEntries().size();
                ((CartEntry)object2).setTotalEntryCount(n10);
                object2 = this.getMUiItemsList();
                object3 = this.mSelectedCartEntry;
                Intrinsics.checkNotNull(object3);
                ((ArrayList)object2).add(object3);
                object2 = this.mSelectedCartEntry;
                Intrinsics.checkNotNull(object2);
                object3 = this.mCartOrder;
                Intrinsics.checkNotNull(object3);
                object3 = ((CartOrder)object3).getOrderCreatedDate();
                ((CartEntry)object2).setOrderCreatedDate((String)object3);
                object2 = this.mSelectedCartEntry;
                if (object2 != null) {
                    object2 = ((CartEntry)object2).getProduct();
                } else {
                    n7 = 0;
                    object2 = null;
                }
                object3 = "";
                if (object2 != null) {
                    object2 = this.mSelectedCartEntry;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartEntry)object2).getProduct().getName();
                } else {
                    object2 = object3;
                }
                if (object != null) {
                    Object object4;
                    String string2;
                    Object object5 = object;
                    object5 = (Collection)object;
                    n3 = object5.isEmpty() ^ 1;
                    if (n3 != 0) {
                        serializable = this.getMUiItemsList();
                        int n15 = 7;
                        string2 = "Select Issue";
                        object4 = new UiCCComponent(n15, string2, null);
                        ((ArrayList)serializable).add(object4);
                    }
                    n4 = object5.size();
                    object5 = object3;
                    while (n8 < n4) {
                        serializable = (CCItemDetailsQAModel$CCItemQALists)object.get(n8);
                        ((CCItemDetailsQAModel$CCItemQALists)serializable).setProductName((String)object2);
                        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
                        if (bl2) {
                            object3 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getCategory();
                        } else {
                            object4 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getCategory();
                            bl2 = TextUtils.isEmpty((CharSequence)object4);
                            if (bl2) {
                                ((CCItemDetailsQAModel$CCItemQALists)serializable).setCategory((String)object3);
                            }
                        }
                        bl2 = TextUtils.isEmpty((CharSequence)object5);
                        if (bl2) {
                            object5 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getSubcategory();
                        } else {
                            object4 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getSubcategory();
                            bl2 = TextUtils.isEmpty((CharSequence)object4);
                            if (bl2) {
                                ((CCItemDetailsQAModel$CCItemQALists)serializable).setSubcategory((String)object5);
                            }
                        }
                        object4 = this.getMUiItemsList();
                        string2 = ((CCItemDetailsQAModel$CCItemQALists)object.get(n8)).getQuestion();
                        int n16 = 2;
                        UiCCComponent uiCCComponent = new UiCCComponent(n16, string2, (CCHelpInterface)serializable);
                        ((ArrayList)object4).add(uiCCComponent);
                        ++n8;
                    }
                }
                object2 = this.getMUiItemsList();
                cCCartEntryStatus = this.mCartEntryStatus;
                Intrinsics.checkNotNull(cCCartEntryStatus);
                object = new CCItemDetailAdapter((List)object2, (i82_0)this, cCCartEntryStatus);
                object2 = this.recyclerView;
                if (object2 != null) {
                    ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
                }
            }
        }
    }

    private final void setResultAndFinish() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                appCompatActivity = this.getMActivity();
                Intrinsics.checkNotNull(appCompatActivity);
                appCompatActivity = appCompatActivity.getIntent();
                if (appCompatActivity != null) {
                    AppCompatActivity appCompatActivity2 = this.getMActivity();
                    if (appCompatActivity2 != null) {
                        int n3 = -1;
                        appCompatActivity2.setResult(n3, (Intent)appCompatActivity);
                    }
                    if ((appCompatActivity = this.getMActivity()) != null) {
                        appCompatActivity.finish();
                    }
                }
            }
        }
    }

    private final void setToolbarUI() {
        StringBuilder stringBuilder;
        String string2;
        int n3;
        int n4;
        Object object;
        Object object2 = this.customToolbarViewMerger;
        int n7 = 0;
        Object object3 = null;
        if ((object2 = object2 != null ? ((CustomToolbarViewMerger)object2).getToolbar() : null) != null) {
            object2 = this.customToolbarViewMerger;
            object2 = object2 != null ? ((CustomToolbarViewMerger)object2).getToolbar() : null;
            Intrinsics.checkNotNull(object2);
            object2.invalidate();
            object2 = this.getMActivity();
            if (object2 != null) {
                object = this.customToolbarViewMerger;
                if (object != null) {
                    object3 = ((CustomToolbarViewMerger)object).getToolbar();
                }
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object3);
            }
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object2).setNavigationClick();
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n7 = 8;
            ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n7);
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n7 = R$string.cc_selected_item_tool_title;
            object3 = this.getString(n7);
            object = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            ((CustomToolbarViewMerger)object2).setTitleText((String)object3);
        }
        if ((object2 = this.customToolbarViewMerger) != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
            n7 = R$string.cc_selected_item_tool_title;
            object3 = this.getString(n7);
            object2.setContentDescription((CharSequence)object3);
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new lg_1(this);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        object2 = this.customToolbarViewMerger;
        object3 = " ";
        if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getHeaderTitleTv()) != null) {
            n4 = R$string.header_text;
            object = hv3_0.K(n4);
            n3 = R$string.cc_selected_item_tool_title;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object = stringBuilder.toString();
            object2.setContentDescription((CharSequence)object);
        }
        if ((object2 = this.customToolbarViewMerger) != null && (object2 = ((CustomToolbarViewMerger)object2).getFloatTitleTv()) != null) {
            n4 = R$string.title_text;
            object = hv3_0.K(n4);
            n3 = R$string.cc_selected_item_tool_title;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object3 = stringBuilder.toString();
            object2.setContentDescription((CharSequence)object3);
        }
    }

    private static final void setToolbarUI$lambda$0(CCItemDetailFragment object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((CCItemDetailFragment)object).customToolbarViewMerger;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }

    private final void showNotification(String string2, String string3) {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            int n3 = 1;
            pf_12.showToastNotification((Context)aJIOApplication, string2, n3, string3);
        }
    }

    private final void showProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.startLoader();
        }
    }

    private final void startActivityForResult(Bundle bundle, Class clazz, int n3) {
        AppCompatActivity appCompatActivity = this.getMActivity();
        Intent intent = new Intent((Context)appCompatActivity, clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        this.startActivityForResult(intent, n3);
    }

    private final void updateReturnableProductQuantity(ReturnOrderItemDetails returnOrderItemDetails) {
        int n3;
        Object object;
        int n4;
        Object object2;
        String string2;
        int n7;
        Object object3;
        int n8;
        Object object4;
        Serializable serializable;
        int n10;
        Object object5;
        int n14;
        Object object6;
        Collection collection;
        int n15;
        CCItemDetailFragment cCItemDetailFragment = this;
        Object object7 = returnOrderItemDetails.getConsignment();
        Object[] objectArray = null;
        if (object7 == null) {
            object7 = yn3_0.a;
            objectArray = new Object[]{};
            ((yn3$a)object7).d("Consignment is null", objectArray);
            return;
        }
        object7 = new HashMap();
        Object object8 = new Object();
        Object object9 = returnOrderItemDetails.getValidReturnableProducts();
        boolean bl2 = true;
        if (object9 != null && (n15 = ((ArrayList)object9).size()) > 0) {
            collection = returnOrderItemDetails.getConsignment().getEntries();
            object6 = collection;
            object6 = collection;
            n14 = object6.size();
            object5 = null;
            for (n10 = 0; n10 < n14; ++n10) {
                serializable = (CartEntry)collection.get(n10);
                object4 = ((CartEntry)serializable).getOrderEntry();
                n8 = object9.size();
                object3 = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    string2 = ((CartEntry)object4).getProduct().getCode();
                    n4 = (int)(b.i(string2, (String)(object2 = (String)((ArrayList)object9).get(n7)), bl2) ? 1 : 0);
                    if (n4 == 0) continue;
                    ((CartEntry)object4).setReturnEligibleAtprodLevel(bl2);
                    string2 = ((ArrayList)object9).get(n7);
                    object8.put(string2, serializable);
                }
            }
        }
        if ((collection = returnOrderItemDetails.getValidExchangableProducts()) != null && (n14 = ((ArrayList)collection).size()) > 0) {
            object5 = object6 = returnOrderItemDetails.getConsignment().getEntries();
            object5 = object6;
            n10 = object5.size();
            serializable = null;
            for (int i3 = 0; i3 < n10; ++i3) {
                object4 = (CartEntry)object6.get(i3);
                object = ((CartEntry)object4).getOrderEntry();
                n7 = collection.size();
                string2 = null;
                for (n4 = 0; n4 < n7; ++n4) {
                    String string3;
                    object2 = ((CartEntry)object).getProduct().getCode();
                    boolean bl3 = b.i((String)object2, string3 = (String)((ArrayList)collection).get(n4), bl2);
                    if (!bl3) continue;
                    object2 = ((ArrayList)collection).get(n4);
                    bl3 = ((HashMap)object8).containsKey(object2);
                    if (bl3) {
                        object2 = ((ArrayList)collection).get(n4);
                        object2 = (CartEntry)((HashMap)object8).get(object2);
                        Intrinsics.checkNotNull(object2);
                        ((CartEntry)object2).getOrderEntry().setExchangeEligibleAtProdLevel(bl2);
                        string3 = ((ArrayList)collection).get(n4);
                        object8.put(string3, object2);
                        continue;
                    }
                    ((CartEntry)object).setExchangeEligibleAtProdLevel(bl2);
                    object2 = ((ArrayList)collection).get(n4);
                    object8.put(object2, object4);
                }
            }
        }
        collection = new Collection();
        object8 = ((HashMap)object8).entrySet().iterator();
        while ((n14 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
            object6 = (Map.Entry)object8.next();
            if (object6 == null) continue;
            object6 = object6.getValue();
            object5 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry";
            Intrinsics.checkNotNull(object6, (String)object5);
            object6 = (CartEntry)object6;
            ((ArrayList)collection).add((Object)object6);
        }
        object8 = returnOrderItemDetails.getConsignment();
        ((Consignment)object8).setEntries((List)collection);
        if (object9 != null && (n3 = ((ArrayList)object9).size()) > 0) {
            n3 = object9.size();
            collection = null;
            for (n15 = 0; n15 < n3; ++n15) {
                object6 = returnOrderItemDetails.getReturnedQtyMap();
                n14 = object6.size();
                object5 = null;
                for (n10 = 0; n10 < n14; ++n10) {
                    serializable = (ReturnOrderItemDetails$ReturnedQtyMap)returnOrderItemDetails.getReturnedQtyMap().get(n10);
                    object4 = ((ReturnOrderItemDetails$ReturnedQtyMap)serializable).getKey().getValue();
                    boolean bl4 = b.i((String)object4, (String)(object = (String)((ArrayList)object9).get(n15)), bl2);
                    if (!bl4) continue;
                    object4 = ((ArrayList)object9).get(n15);
                    serializable = Integer.valueOf(((ReturnOrderItemDetails$ReturnedQtyMap)serializable).getValue().getValue());
                    object7.put(object4, serializable);
                }
            }
            object7 = ((HashMap)object7).entrySet().iterator();
            while ((n3 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                object8 = (Map.Entry)object7.next();
                if (object8 == null) continue;
                object9 = returnOrderItemDetails.getConsignment().getEntries();
                collection = object9;
                collection = object9;
                n14 = collection.size();
                object5 = null;
                for (n10 = 0; n10 < n14; ++n10) {
                    serializable = (CartEntry)object9.get(n10);
                    object4 = ((CartEntry)serializable).getOrderEntry();
                    object = ((CartEntry)object4).getProduct().getCode();
                    n8 = (int)(b.i((String)object, (String)(object3 = String.valueOf(object8.getKey())), bl2) ? 1 : 0);
                    if (n8 == 0) continue;
                    object = ((CartEntry)object4).getQuantity();
                    ((CartEntry)object4).setOrderTotalQuantity((Integer)object);
                    object = ((CartEntry)serializable).getQuantity();
                    n8 = (Integer)object;
                    if (n8 > 0) {
                        serializable = ((CartEntry)serializable).getQuantity();
                        ((CartEntry)object4).setQuantity((Integer)serializable);
                        continue;
                    }
                    serializable = Integer.valueOf(0);
                    ((CartEntry)object4).setQuantity((Integer)serializable);
                }
                object8 = new Object();
                n15 = collection.size();
                object6 = null;
                for (n14 = 0; n14 < n15; ++n14) {
                    object5 = ((CartEntry)object9.get(n14)).getOrderEntry().getQuantity();
                    n10 = (Integer)object5;
                    if (n10 <= 0) continue;
                    object5 = object9.get(n14);
                    ((ArrayList)object8).add(object5);
                }
                object9 = returnOrderItemDetails.getConsignment();
                ((Consignment)object9).setEntries((List)object8);
            }
        } else {
            object7 = returnOrderItemDetails.getConsignment();
            object8 = new Object();
            ((Consignment)object7).setEntries((List)object8);
        }
        if ((object7 = returnOrderItemDetails.getProducts()) != null) {
            object8 = returnOrderItemDetails.getConsignment().getEntries();
            object9 = object8;
            object9 = (Collection)object8;
            int n16 = object9.size();
            collection = null;
            for (n15 = 0; n15 < n16; ++n15) {
                n14 = object7.size();
                object5 = null;
                for (n10 = 0; n10 < n14; ++n10) {
                    serializable = ((CartEntry)object8.get(n15)).getOrderEntry();
                    object4 = ((CartEntry)serializable).getProduct();
                    object = (Product)((ArrayList)object7).get(n10);
                    object3 = ((Product)object4).getBaseProduct();
                    n7 = (int)(b.i((String)object3, string2 = ((Product)object).getCode(), bl2) ? 1 : 0);
                    if (n7 == 0 && (n7 = (int)(b.i((String)(object3 = ((Product)object4).getCode()), string2 = ((Product)object).getCode(), bl2) ? 1 : 0)) == 0) {
                        object4 = returnOrderItemDetails;
                        continue;
                    }
                    object3 = ((Product)object).getVariantOptions();
                    ((Product)object4).setVariantOptions((List)object3);
                    object = ((Product)object).getFnlColorVariantData();
                    ((Product)object4).setFnlColorVariantData((ProductFnlColorVariantData)object);
                    Intrinsics.checkNotNull(serializable);
                    object4 = ((Product)object4).getVariantOptions();
                    cCItemDetailFragment.checkExchangeAtStockLevel((CartEntry)serializable, (List)object4);
                    object4 = returnOrderItemDetails;
                    cCItemDetailFragment.checkExchangeAtOrderLeve(returnOrderItemDetails, (CartEntry)serializable);
                }
                object4 = returnOrderItemDetails;
            }
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        Object object;
        super.onActivityResult(n3, n4, intent);
        int n7 = -1;
        if (n4 == n7 && (object = this.getMActivity()) != null) {
            object = this.getMActivity();
            Intrinsics.checkNotNull(object);
            n4 = (int)(object.isFinishing() ? 1 : 0);
            if (n4 == 0) {
                n4 = 25;
                if (n3 != n4) {
                    n4 = 28;
                    if (n3 == n4) {
                        n3 = 1;
                        this.mSetResult = n3;
                        this.processBundle();
                    }
                } else {
                    String string2;
                    if (intent != null && (n4 = (int)(intent.hasExtra(string2 = "SELECTED_ENTRY_NO") ? 1 : 0)) != 0) {
                        n4 = this.mSelectedEntryNumber;
                        n3 = intent.getIntExtra(string2, n4);
                        object = this.cCBundleViewModel;
                        if (object != null) {
                            Intrinsics.checkNotNull(object);
                            object = ((xf_1)object).e;
                            if (object != null) {
                                object = this.cCBundleViewModel;
                                Intrinsics.checkNotNull(object);
                                object = ((xf_1)object).e;
                                Intrinsics.checkNotNull(object);
                                ((yq_0)object).b = n3;
                            }
                        }
                    }
                    this.processBundle();
                }
            }
        }
    }

    public void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnFragmentInteractionListener;
        if (bl2) {
            object = (OnFragmentInteractionListener)object;
            this.mListener = object;
        }
    }

    public final void onBackPressed() {
        this.handleBackButtonPress();
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new CustomToolbarViewMerger(this);
        this.customToolbarViewMerger = object;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
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
        Object object5 = new pD3((rd3_0)object2, (E$b)object3, (Wd0)object4);
        object2 = CCViewModel.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = rn1_2.c((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Object object6 = object2.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.mCCViewModel = object2 = (CCViewModel)((pD3)object5).a((yn1_2)object2, (String)object6);
            object2 = this.getMActivity();
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object5 = object2.getViewModelStore();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object6 = object2.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = object2.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object5, string2);
            Intrinsics.checkNotNullParameter(object6, string3);
            Intrinsics.checkNotNullParameter(object, string4);
            object2 = new pD3((rd3_0)object5, (E$b)object6, (Wd0)object);
            object = xf_1.class;
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = rn1_2.c((Class)object);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object3 = object.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                this.cCBundleViewModel = object = (xf_1)((pD3)object2).a((yn1_2)object, (String)object3);
                AB0.a().register(this);
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_itemdetail_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onDestroy() {
        xf_1 xf_12 = this.cCBundleViewModel;
        if (xf_12 != null) {
            xf_12.e = null;
        }
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public void onNavigationClick() {
        this.handleBackButtonPress();
    }

    public void onResume() {
        super.onResume();
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("customer care - item details screen");
    }

    public void onStop() {
        this.newEEcommerceEventsRevamp.setPreviousScreenData("customer care - item details screen", "customer care screen");
        super.onStop();
    }

    public void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.initObservables();
        this.setToolbarUI();
        int n3 = R$id.ccitemdetail_cc_list;
        object = (RecyclerView)object.findViewById(n3);
        this.recyclerView = object;
        if (object != null) {
            object3 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        this.processBundle();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onViewItemClick(Object var1_1, int var2_2) {
        block49: {
            block55: {
                block54: {
                    block50: {
                        block51: {
                            block52: {
                                block53: {
                                    var3_3 = this;
                                    var4_4 = var1_1;
                                    var5_5 = var2_2;
                                    var6_6 = this.getMActivity();
                                    if (var6_6 == null) break block49;
                                    var6_6 = this.getMActivity();
                                    Intrinsics.checkNotNull(var6_6);
                                    var7_7 = var6_6.isFinishing();
                                    if (var7_7 != 0) break block49;
                                    var7_7 = 0;
                                    var6_6 = null;
                                    var8_8 = 1;
                                    var9_9 = 2;
                                    var10_10 = 0;
                                    var11_11 = null;
                                    var12_12 = "";
                                    var13_13 = "selfCare item page";
                                    if (var2_2 == var9_9) break block50;
                                    var9_9 = 27;
                                    if (var2_2 == var9_9) break block51;
                                    var14_14 = 6;
                                    var15_16 = " - ";
                                    if (var2_2 == var14_14) ** GOTO lbl229
                                    var14_14 = 7;
                                    if (var2_2 == var14_14) ** GOTO lbl154
                                    var14_14 = 12;
                                    if (var2_2 == var14_14) break block52;
                                    var14_14 = 13;
                                    if (var2_2 != var14_14) break block49;
                                    var4_4 = this.mCartOrder;
                                    if (var4_4 == null) break block53;
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4 = var4_4.getEntries();
                                    if (var4_4 == null || (var4_4 = this.getMActivity()) == null) break block53;
                                    var4_4 = this.mCartOrder;
                                    Intrinsics.checkNotNull(var4_4);
                                    var4_4 = var4_4.getEntries();
                                    var14_14 = var4_4.size();
                                    if (var14_14 > var8_8) {
                                        var16_19 = this.mCartOrder;
                                        var4_4 = new ar_2((CartOrder)var16_19);
                                        var16_19 = this.cCBundleViewModel;
                                        Intrinsics.checkNotNull(var16_19);
                                        var16_19.f = var4_4;
                                        bg_1.Companion.getClass();
                                        var4_4 = new bg_1();
                                        var5_5 = 25;
                                        var4_4.setTargetFragment(this, var5_5);
                                        var16_19 = this.getMActivity();
                                        Intrinsics.checkNotNull(var16_19);
                                        var16_19 = var16_19.getSupportFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(var16_19, "getSupportFragmentManager(...)");
                                        var6_6 = "CCItemListDialogFragment";
                                        var4_4.show((FragmentManager)var16_19, (String)var6_6);
                                    }
                                    break block49;
                                }
                                return;
                            }
                            var4_4 = this.mCartOrder;
                            if (var4_4 == null) break block49;
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = var4_4.getEntries();
                            if (var4_4 == null) break block49;
                            var4_4 = this.mSelectedCartEntry;
                            if (var4_4 == null) ** GOTO lbl-1000
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = var4_4.getCode();
                            var14_14 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                            if (var14_14 == 0) {
                                var4_4 = this.cCBundleViewModel;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.e;
                                } else {
                                    var14_14 = 0;
                                    var4_4 = null;
                                }
                                Intrinsics.checkNotNull(var4_4);
                                var14_14 = (int)var4_4.c;
                                if (var14_14 == 0) {
                                    var17_25 = var3_3.ccCustomEvent;
                                    var18_29 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                    var4_4 = var3_3.newCustomEventsRevamp;
                                    var19_33 = var4_4.getEA_TRACK_ORDER();
                                    var20_37 = var3_3.bundledatalist;
                                    var21_41 = "";
                                    var22_45 = "customer care - item details screen";
                                    var17_25.a(var18_29, var19_33, var21_41, var22_45, (HashMap)var20_37);
                                }
                                var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                var16_20 = var3_3.mCartOrder;
                                Intrinsics.checkNotNull(var16_20);
                                var16_20 = var16_20.getCode();
                                var12_12 = "Hotlink_Clicked_Track_";
                                var11_11 = new StringBuilder((String)var12_12);
                                var11_11.append((String)var16_20);
                                var16_20 = var11_11.toString();
                                var4_4.pushButtonTapEvent(var16_20, (String)var13_13);
                                var4_4 = var3_3.mCartOrder;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getCode();
                                } else {
                                    var14_14 = 0;
                                    var4_4 = null;
                                }
                                var16_20 = var3_3.mCartOrder;
                                if (var16_20 != null) {
                                    var16_20 = no_2.c((CartOrder)var16_20);
                                } else {
                                    var5_5 = 0;
                                    var16_20 = null;
                                }
                                var11_11 = new StringBuilder();
                                var11_11.append((String)var4_4);
                                var11_11.append((String)var15_16);
                                var11_11.append((String)var16_20);
                                var18_29 = var11_11.toString();
                                var12_12 = var3_3.newCustomEventsRevamp;
                                var13_13 = var12_12.getEC_CC_ORDER_INTERACTION();
                                var20_37 = var3_3.previousScreen;
                                var4_4 = var3_3.previousScreenType;
                                var23_49 = null;
                                var24_53 = false;
                                var25_56 = null;
                                var17_25 = "track click";
                                var19_33 = "track_click";
                                var21_41 = "order details screen";
                                var22_45 = "order management screen";
                                var26_59 = null;
                                var27_63 = 1536;
                                var28_67 = null;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var13_13, (String)var17_25, var18_29, var19_33, var21_41, var22_45, (String)var20_37, null, (String)var4_4, false, null, var27_63, null);
                                var16_20 = var3_3.mCartOrder;
                                Intrinsics.checkNotNull(var16_20);
                                var16_20 = var16_20.getOrderTracking();
                                var15_16 = var3_3.mCartOrder;
                                Intrinsics.checkNotNull(var15_16);
                                var15_16 = var15_16.getReturnTrackingMap();
                                var11_11 = var3_3.mSelectedCartEntry;
                                Intrinsics.checkNotNull(var11_11);
                                var11_11 = var11_11.getCode();
                                var4_4 = new Object();
                                var4_4.a = var16_20;
                                var4_4.b = var15_16;
                                var4_4.c = var11_11;
                                var16_20 = var3_3.cCBundleViewModel;
                                if (var16_20 != null) {
                                    var16_20.g = var4_4;
                                }
                                if ((var4_4 = this.getCcActivityListener()) != null) {
                                    var5_5 = 109;
                                    var4_4.addFragment(var5_5, null, (boolean)var8_8);
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                return;
lbl154:
                                // 1 sources

                                var4_4 = this.mCartOrder;
                                if (var4_4 != null && (var4_4 = this.mSelectedCartEntry) != null) {
                                    var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var16_21 = this.mCartOrder;
                                    Intrinsics.checkNotNull(var16_21);
                                    var16_21 = var16_21.getCode();
                                    var11_11 = "Hotlink_Clicked_Cancel_";
                                    var29_70 /* !! */  = new StringBuilder((String)var11_11);
                                    var29_70 /* !! */ .append((String)var16_21);
                                    var16_21 = var29_70 /* !! */ .toString();
                                    var4_4.pushButtonTapEvent(var16_21, (String)var13_13);
                                    var4_4 = this.cCBundleViewModel;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.e;
                                    } else {
                                        var14_14 = 0;
                                        var4_4 = null;
                                    }
                                    Intrinsics.checkNotNull(var4_4);
                                    var14_14 = var4_4.c;
                                    if (var14_14 == 0) {
                                        var11_11 = var3_3.ccCustomEvent;
                                        var12_12 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                        var4_4 = var3_3.newCustomEventsRevamp;
                                        var13_13 = var4_4.getEA_CANCEL_OREDER();
                                        var19_34 = var3_3.bundledatalist;
                                        var17_26 = "";
                                        var18_30 = "customer care - item details screen";
                                        var11_11.a((String)var12_12, (String)var13_13, var17_26, var18_30, (HashMap)var19_34);
                                    }
                                    if ((var4_4 = var3_3.mCartOrder) != null) {
                                        var4_4 = var4_4.getCode();
                                    } else {
                                        var14_14 = 0;
                                        var4_4 = null;
                                    }
                                    var16_21 = var3_3.mCartOrder;
                                    if (var16_21 != null) {
                                        var6_6 = no_2.c((CartOrder)var16_21);
                                    }
                                    var16_21 = new StringBuilder();
                                    var16_21.append((String)var4_4);
                                    var16_21.append((String)var15_16);
                                    var16_21.append((String)var6_6);
                                    var17_26 = var16_21.toString();
                                    var11_11 = var3_3.newCustomEventsRevamp;
                                    var12_12 = var11_11.getEC_CC_ORDER_INTERACTION();
                                    var22_46 = var3_3.previousScreen;
                                    var26_60 = var3_3.previousScreenType;
                                    var23_50 = null;
                                    var13_13 = "cancel click";
                                    var18_30 = "cancel_click";
                                    var19_34 = "order details screen";
                                    var21_42 = "order management screen";
                                    var30_72 = false;
                                    var20_38 = null;
                                    var24_54 = 1536;
                                    var27_64 = false;
                                    var31_74 = null;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var11_11, (String)var12_12, (String)var13_13, var17_26, var18_30, (String)var19_34, var21_42, var22_46, null, var26_60, false, null, var24_54, null);
                                    var4_4 = JsonUtils.toJson(var3_3.mSelectedCartEntry);
                                    var16_21 = new Bundle();
                                    var6_6 = var3_3.mCartOrder;
                                    Intrinsics.checkNotNull(var6_6);
                                    var6_6 = var6_6.getCode();
                                    var16_21.putString("CART_ID", (String)var6_6);
                                    var29_70 /* !! */  = var3_3.mCartOrder;
                                    var16_21.putSerializable("cart order", (Serializable)var29_70 /* !! */ );
                                    var6_6 = "CART_ENTRY_JSON";
                                    var16_21.putString((String)var6_6, (String)var4_4);
                                    var4_4 = CCCancelOrderActivity.class;
                                    var7_7 = 28;
                                    var3_3.startActivityForResult((Bundle)var16_21, (Class)var4_4, var7_7);
                                } else {
                                    return;
lbl229:
                                    // 1 sources

                                    var4_4 = this.mCartOrder;
                                    if (var4_4 != null) {
                                        block48: {
                                            var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                            var16_22 = this.mCartOrder;
                                            Intrinsics.checkNotNull(var16_22);
                                            var16_22 = var16_22.getCode();
                                            var12_12 = "Hotlink_Clicked_Return_";
                                            var29_71 = new StringBuilder((String)var12_12);
                                            var29_71.append((String)var16_22);
                                            var16_22 = var29_71.toString();
                                            var4_4.pushButtonTapEvent(var16_22, (String)var13_13);
                                            var4_4 = this.cCBundleViewModel;
                                            if (var4_4 != null) {
                                                var4_4 = var4_4.e;
                                            } else {
                                                var14_14 = 0;
                                                var4_4 = null;
                                            }
                                            Intrinsics.checkNotNull(var4_4);
                                            var14_14 = (int)var4_4.c;
                                            if (var14_14 == 0) {
                                                var12_12 = var3_3.ccCustomEvent;
                                                var13_13 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                                var4_4 = var3_3.newCustomEventsRevamp;
                                                var17_27 = var4_4.getEA_RETRUN_ORDER();
                                                var21_43 = var3_3.bundledatalist;
                                                var18_31 = "";
                                                var19_35 = "customer care - item details screen";
                                                var12_12.a((String)var13_13, var17_27, var18_31, var19_35, (HashMap)var21_43);
                                            }
                                            if ((var4_4 = var3_3.mCartOrder) != null) {
                                                var4_4 = var4_4.getCode();
                                            } else {
                                                var14_14 = 0;
                                                var4_4 = null;
                                            }
                                            var16_22 = var3_3.mCartOrder;
                                            if (var16_22 != null) {
                                                var16_22 = no_2.c((CartOrder)var16_22);
                                            } else {
                                                var5_5 = 0;
                                                var16_22 = null;
                                            }
                                            var29_71 = new StringBuilder();
                                            var29_71.append((String)var4_4);
                                            var29_71.append((String)var15_16);
                                            var29_71.append((String)var16_22);
                                            var18_31 = var29_71.toString();
                                            var12_12 = var3_3.newCustomEventsRevamp;
                                            var13_13 = var12_12.getEC_CC_ORDER_INTERACTION();
                                            var20_39 = var3_3.previousScreen;
                                            var4_4 = var3_3.previousScreenType;
                                            var23_51 = null;
                                            var24_55 = false;
                                            var25_57 = null;
                                            var17_27 = "return click";
                                            var19_35 = "return_click";
                                            var21_43 = "order details screen";
                                            var22_47 = "order management screen";
                                            var26_61 = null;
                                            var27_65 = 1536;
                                            var28_68 = null;
                                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, (String)var13_13, var17_27, var18_31, var19_35, (String)var21_43, var22_47, var20_39, null, (String)var4_4, false, null, var27_65, null);
                                            var4_4 = var3_3.mCartOrder;
                                            if (var4_4 != null) {
                                                Intrinsics.checkNotNull(var4_4);
                                                var4_4 = var4_4.getEntries();
                                                if (var4_4 != null) {
                                                    while (true) {
                                                        var4_4 = var3_3.mCartOrder;
                                                        Intrinsics.checkNotNull(var4_4);
                                                        var4_4 = var4_4.getEntries();
                                                        var14_14 = var4_4.size();
                                                        if (var10_10 >= var14_14) break;
                                                        var14_14 = var3_3.mSelectedEntryNumber;
                                                        var16_22 = var3_3.mCartOrder;
                                                        Intrinsics.checkNotNull(var16_22);
                                                        var16_22 = ((CartEntry)var16_22.getEntries().get(var10_10)).getEntryNumber();
                                                        if (var16_22 != null && var14_14 == (var5_5 = var16_22.intValue())) {
                                                            var4_4 = var3_3.mCartOrder;
                                                            Intrinsics.checkNotNull(var4_4);
                                                            var4_4 = ((CartEntry)var4_4.getEntries().get(var10_10)).getCode();
                                                            break block48;
                                                        }
                                                        var10_10 += 1;
                                                    }
                                                }
                                            }
                                            var14_14 = 0;
                                            var4_4 = null;
                                        }
                                        var16_22 = var3_3.mCartOrder;
                                        Intrinsics.checkNotNull(var16_22);
                                        var16_22 = var16_22.getCode();
                                        var5_5 = (int)TextUtils.isEmpty((CharSequence)var16_22);
                                        if (var5_5 == 0 && (var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4)) == 0) {
                                            var16_22 = this.getOrderDetailViewModel();
                                            Intrinsics.checkNotNull(var16_22);
                                            var29_71 = var3_3.mCartOrder;
                                            Intrinsics.checkNotNull(var29_71);
                                            var29_71 = var29_71.getCode();
                                            Intrinsics.checkNotNullExpressionValue(var29_71, "getCode(...)");
                                            Intrinsics.checkNotNull(var4_4);
                                            var16_22.getClass();
                                            Intrinsics.checkNotNullParameter(var29_71, "orderId");
                                            Intrinsics.checkNotNullParameter(var4_4, "consignmentCode");
                                            var15_16 = md3_0.c((jD3)var16_22);
                                            var11_11 = new eb2_2((db2_1)var16_22, (String)var29_71, (String)var4_4, null);
                                            var14_14 = 3;
                                            Ae3.d((i90_0)var15_16, null, null, (Function2)var11_11, var14_14);
                                            this.showProgress();
                                        }
                                    }
                                }
                            }
                            break block49;
                        }
                        var16_23 = this.mCartOrder;
                        if (var16_23 != null) {
                            var16_23 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            var6_6 = "View Order";
                            var16_23.pushButtonTapEvent(var6_6, (String)var13_13);
                            var16_23 = this.mCartOrder;
                            Intrinsics.checkNotNull(var16_23);
                            var16_23 = var16_23.getCode();
                            var5_5 = (int)TextUtils.isEmpty((CharSequence)var16_23);
                            if (var5_5 == 0) {
                                var16_23 = new Bundle();
                                Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.Product");
                                var4_4 = (Product)var1_1;
                                var6_6 = this.mCartOrder;
                                Intrinsics.checkNotNull(var6_6);
                                var6_6 = var6_6.getCode();
                                var15_17 = "product_code";
                                var16_23.putString(var15_17, (String)var6_6);
                                var6_6 = "clicked_item_code";
                                var4_4 = var4_4.getCode();
                                var16_23.putString((String)var6_6, (String)var4_4);
                                var16_23.putBoolean("is_from_customer_care_page", (boolean)var8_8);
                                var4_4 = this.mListener;
                                if (var4_4 != null) {
                                    var7_7 = 35;
                                    var4_4.onFragmentInteraction((String)var12_12, var7_7, (Bundle)var16_23);
                                }
                            }
                        }
                        break block49;
                    }
                    var5_5 = var1_1 instanceof Integer;
                    if (var5_5 == 0) break block49;
                    var4_4 = (Number)var1_1;
                    var5_5 = var4_4.intValue();
                    if (var5_5 >= (var9_9 = (var15_18 = this.getMUiItemsList()).size())) {
                        return;
                    }
                    var16_24 = this.getMUiItemsList();
                    var14_15 = var4_4.intValue();
                    var4_4 = var16_24.get((int)var14_15);
                    Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.common.UiCCComponent");
                    var4_4 = (UiCCComponent)var4_4;
                    var16_24 = this.mCartOrder;
                    if (var16_24 != null) {
                        var16_24 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var15_18 = this.mCartOrder;
                        Intrinsics.checkNotNull(var15_18);
                        var15_18 = var15_18.getCode();
                        var17_28 = var4_4.getName();
                        var19_36 = "FAQ_L1_Clicked_";
                        var18_32 = new StringBuilder((String)var19_36);
                        var18_32.append((String)var15_18);
                        var18_32.append("_");
                        var18_32.append((String)var17_28);
                        var15_18 = var18_32.toString();
                        var16_24.pushButtonTapEvent(var15_18, (String)var13_13);
                        var16_24 = new Bundle();
                        var15_18 = this.mCartOrder;
                        Intrinsics.checkNotNull(var15_18);
                        var15_18 = no_2.c((CartOrder)var15_18);
                        var16_24.putString("order_status", (String)var15_18);
                        var15_18 = this.mCartOrder;
                        Intrinsics.checkNotNull(var15_18);
                        var15_18 = var15_18.getCode();
                        var13_13 = "order_id";
                        var16_24.putString((String)var13_13, (String)var15_18);
                        var15_18 = this.mSelectedCartEntry;
                        Intrinsics.checkNotNull(var15_18);
                        var15_18 = var15_18.getProduct();
                        if (var15_18 != null) {
                            var15_18 = this.mSelectedCartEntry;
                            Intrinsics.checkNotNull(var15_18);
                            var15_18 = var15_18.getProduct().getCode();
                        } else {
                            var15_18 = var12_12;
                        }
                        var16_24.putString("product_id", (String)var15_18);
                        var17_28 = var3_3.newCustomEventsRevamp;
                        var18_32 = var17_28.getEC_FAQ_INTERACTION();
                        var21_44 = var4_4.getName();
                        var15_18 = "getName(...)";
                        Intrinsics.checkNotNullExpressionValue(var21_44, (String)var15_18);
                        var13_13 = var3_3.previousScreen;
                        var26_62 = var3_3.previousScreenType;
                        var27_66 = false;
                        var31_75 = null;
                        var28_69 = null;
                        var19_36 = "item issue faq";
                        var22_48 = "item_issue_faq";
                        var20_40 = "order details screen";
                        var32_76 = 1536;
                        var25_58 = var26_62;
                        var26_62 = "order management screen";
                        var23_52 = var16_24;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var17_28, (String)var18_32, (String)var19_36, (String)var21_44, var22_48, var20_40, var26_62, (String)var13_13, (Bundle)var16_24, var25_58, false, null, var32_76, null);
                        var16_24 = var3_3.ccCustomEvent;
                        var33_77 = var3_3.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                        var13_13 = var4_4.getName();
                        Intrinsics.checkNotNullExpressionValue(var13_13, (String)var15_18);
                        var15_18 = var3_3.bundledatalist;
                        var34_78 = "";
                        var35_79 = "customer care - item details screen";
                        var16_24.a(var33_77, (String)var13_13, var34_78, var35_79, (HashMap)var15_18);
                    }
                    if ((var16_24 = var4_4.getQAItem()) == null) {
                        return;
                    }
                    var16_24 = var3_3.mSelectedCartEntry;
                    if (var16_24 == null) break block54;
                    var16_24 = var3_3.mCartEntryStatus;
                    if (var16_24 == null) ** GOTO lbl-1000
                    Intrinsics.checkNotNull(var16_24);
                    var16_24 = var16_24.getItemStatusMap();
                    if (var16_24 == null) ** GOTO lbl-1000
                    var16_24 = var3_3.mCartEntryStatus;
                    Intrinsics.checkNotNull(var16_24);
                    var16_24 = var16_24.getItemStatusMap();
                    var5_5 = var16_24.size();
                    if (var5_5 > 0) {
                        var16_24 = var3_3.mCartEntryStatus;
                        Intrinsics.checkNotNull(var16_24);
                        var18_32 = var16_24 = ((ItemStatusMap)var16_24.getItemStatusMap().get(0)).getKey();
                    } else lbl-1000:
                    // 3 sources

                    {
                        var18_32 = var12_12;
                    }
                    var16_24 = var3_3.mSelectedCartEntry;
                    Intrinsics.checkNotNull(var16_24);
                    var16_24 = var16_24.getProduct();
                    if (var16_24 != null) {
                        var16_24 = var3_3.mSelectedCartEntry;
                        Intrinsics.checkNotNull(var16_24);
                        var19_36 = var16_24 = var16_24.getProduct().getCode();
                    } else {
                        var19_36 = var12_12;
                    }
                    var16_24 = var3_3.mCartOrder;
                    if (var16_24 != null) {
                        Intrinsics.checkNotNull(var16_24);
                        var12_12 = var16_24.getCode();
                    }
                    var21_44 = var12_12;
                    var17_28 = var4_4.getQAItem();
                    var30_73 = var3_3.isLuxeOrder;
                    var26_62 = null;
                    var22_48 = "";
                    var13_13 = var16_24;
                    var16_24 = new zq_1((CCHelpInterface)var17_28, (String)var18_32, (String)var19_36, (String)var12_12, var22_48, var30_73, false);
                    break block55;
                }
                var23_52 = var4_4.getQAItem();
                var14_15 = var3_3.isLuxeOrder;
                var28_69 = "";
                var36_80 = "";
                var25_58 = "";
                var31_75 = "";
                var16_24 = new zq_1((CCHelpInterface)var23_52, var25_58, var31_75, var28_69, var36_80, var14_15, false);
            }
            var4_4 = var3_3.cCBundleViewModel;
            if (var4_4 != null) {
                var4_4.c = var16_24;
            }
            if ((var4_4 = this.getCcActivityListener()) != null) {
                var5_5 = 103;
                var4_4.addFragment(var5_5, null, (boolean)var8_8);
            }
        }
    }
}

