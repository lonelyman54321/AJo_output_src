/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.selectorder;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
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
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderAdapter;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment$Companion;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment$special$$inlined$activityViewModels$default$1;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment$special$$inlined$activityViewModels$default$2;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment$special$$inlined$activityViewModels$default$3;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.CartOrders;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCSelectOrderFragment
extends CCBaseFragment
implements View.OnClickListener,
i82_0,
OnNavigationClickListener {
    public static final CCSelectOrderFragment$Companion Companion;
    public static final String TAG = "CCSelectOrderFragment";
    private final int PAGE_SIZE;
    private xf_1 cCBundleViewModel;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private int mCurrentPage = -1;
    private TextView mInfoTv;
    private int mListEndItemPosition;
    private int mListStartItemPosition;
    private View mNextLayout;
    private final ArrayList mOrderList;
    private View mPrevLayout;
    private RecyclerView mRecyclerView;
    private int mTotalItemCount;
    private int mTotalPages;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final rq1_2 orderDetailViewModel$delegate;
    private tf2_2 orderListViewModel;
    private final String previousScreen;
    private final String previousScreenType;
    private boolean refreshOrders;

    static {
        CCSelectOrderFragment$Companion cCSelectOrderFragment$Companion;
        Companion = cCSelectOrderFragment$Companion = new CCSelectOrderFragment$Companion(null);
    }

    public CCSelectOrderFragment() {
        this.PAGE_SIZE = 10;
        Object object = new ArrayList();
        this.mOrderList = object;
        object = Reflection.getOrCreateKotlinClass(db2_1.class);
        Object object2 = new CCSelectOrderFragment$special$$inlined$activityViewModels$default$1(this);
        CCSelectOrderFragment$special$$inlined$activityViewModels$default$2 cCSelectOrderFragment$special$$inlined$activityViewModels$default$2 = new CCSelectOrderFragment$special$$inlined$activityViewModels$default$2(null, this);
        CCSelectOrderFragment$special$$inlined$activityViewModels$default$3 cCSelectOrderFragment$special$$inlined$activityViewModels$default$3 = new CCSelectOrderFragment$special$$inlined$activityViewModels$default$3(this);
        this.orderDetailViewModel$delegate = object = LW0.a(this, (yn1_2)object, (Function0)object2, cCSelectOrderFragment$special$$inlined$activityViewModels$default$2, cCSelectOrderFragment$special$$inlined$activityViewModels$default$3);
        object = AnalyticsManager.Companion;
        this.newCustomEventsRevamp = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.previousScreen = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
        this.previousScreenType = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getPrevScreenType();
    }

    public static /* synthetic */ Unit Oa(CCSelectOrderFragment cCSelectOrderFragment, DataCallback dataCallback) {
        return CCSelectOrderFragment.initObservables$lambda$2(cCSelectOrderFragment, dataCallback);
    }

    public static /* synthetic */ Unit Pa(CCSelectOrderFragment cCSelectOrderFragment, DataCallback dataCallback) {
        return CCSelectOrderFragment.initObservables$lambda$1(cCSelectOrderFragment, dataCallback);
    }

    public static /* synthetic */ Unit Qa(CCSelectOrderFragment cCSelectOrderFragment, DataCallback dataCallback) {
        return CCSelectOrderFragment.initObservables$lambda$3(cCSelectOrderFragment, dataCallback);
    }

    private final db2_1 getOrderDetailViewModel() {
        return (db2_1)this.orderDetailViewModel$delegate.getValue();
    }

    private final void getOrders() {
        int n3;
        int n4 = this.mCurrentPage;
        this.mCurrentPage = n3 = n4 + 1;
        int n7 = this.mTotalPages;
        if (n3 > n7) {
            this.mCurrentPage = n4;
            return;
        }
        this.showProgress();
        tf2_2 tf2_22 = this.orderListViewModel;
        if (tf2_22 != null) {
            n3 = this.mCurrentPage;
            aW aW2 = md3_0.c(tf2_22);
            pf2_2 pf2_22 = new pf2_2(tf2_22, n3, null);
            n4 = 3;
            Ae3.d(aW2, null, null, pf2_22, n4);
        }
    }

    private final void hideProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    private final void initObservables() {
        CCSelectOrderFragment$sam$androidx_lifecycle_Observer$0 cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0;
        Function1 function1;
        mu1_1 mu1_12;
        Object object = this.orderListViewModel;
        if (object != null && (object = ((tf2_2)object).i) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new jg_2(this);
            cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0 = new CCSelectOrderFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.orderListViewModel) != null && (object = ((tf2_2)object).g) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new kg_2(this);
            cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0 = new CCSelectOrderFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.getOrderDetailViewModel()) != null && (object = ((db2_1)object).d) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new lg_2(this);
            cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0 = new CCSelectOrderFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, cCSelectOrderFragment$sam$androidx_lifecycle_Observer$0);
        }
    }

    private static final Unit initObservables$lambda$1(CCSelectOrderFragment cCSelectOrderFragment, DataCallback object) {
        boolean bl2 = false;
        Object object2 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCSelectOrderFragment, "this$0");
        Intrinsics.checkNotNullParameter(object, "cartOrdersDataCallback");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object);
        if (n4 != 0) {
            cCSelectOrderFragment.hideProgress();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                object2 = cCSelectOrderFragment.getMActivity();
                if (object2 != null) {
                    object2 = cCSelectOrderFragment.getMActivity();
                    Intrinsics.checkNotNull(object2);
                    bl2 = object2.isFinishing();
                    if (!bl2) {
                        object = (CartOrders)((DataCallback)object).getData();
                        cCSelectOrderFragment.updateResponse((CartOrders)object);
                    }
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
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
                            cCSelectOrderFragment.showNotification((String)object, (String)object2);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$2(CCSelectOrderFragment cCSelectOrderFragment, DataCallback object) {
        boolean bl2 = false;
        Object object2 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(cCSelectOrderFragment, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object);
        if (n4 != 0) {
            cCSelectOrderFragment.hideProgress();
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                object2 = cCSelectOrderFragment.getMActivity();
                if (object2 != null) {
                    object2 = cCSelectOrderFragment.getMActivity();
                    Intrinsics.checkNotNull(object2);
                    bl2 = object2.isFinishing();
                    if (!bl2) {
                        object = (CartOrders)((DataCallback)object).getData();
                        cCSelectOrderFragment.parseResponse((CartOrders)object);
                    }
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
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
                            cCSelectOrderFragment.showNotification((String)object, (String)object2);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$3(CCSelectOrderFragment object, DataCallback object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Iterator iterator = cp$a.e();
        iterator.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0) {
                if ((object2 = (CartOrder)((DataCallback)object2).getData()) != null) {
                    Object object3;
                    Serializable serializable;
                    Object object4 = new ArrayList();
                    iterator = ((CartOrder)object2).getConsignments();
                    Object object5 = "iterator(...)";
                    if (iterator != null) {
                        boolean bl2;
                        iterator = ((CartOrder)object2).getConsignments().iterator();
                        Intrinsics.checkNotNullExpressionValue(iterator, (String)object5);
                        while (bl2 = iterator.hasNext()) {
                            boolean bl3;
                            serializable = (Consignment)iterator.next();
                            if (serializable == null || (object3 = ((Consignment)serializable).getEntries()) == null) continue;
                            object3 = ((Consignment)serializable).getEntries().iterator();
                            while (bl3 = object3.hasNext()) {
                                CartEntry cartEntry;
                                CartEntry cartEntry2 = (CartEntry)object3.next();
                                if (cartEntry2 == null || (cartEntry = cartEntry2.getOrderEntry()) == null) continue;
                                cartEntry = cartEntry2.getOrderEntry();
                                String string2 = ((Consignment)serializable).getCode();
                                cartEntry.setCode(string2);
                                cartEntry2 = cartEntry2.getOrderEntry();
                                ((ArrayList)object4).add(cartEntry2);
                            }
                        }
                    }
                    if ((iterator = ((CartOrder)object2).getUnconsignedEntries()) != null) {
                        boolean bl4;
                        iterator = ((ArrayList)((Object)iterator)).iterator();
                        Intrinsics.checkNotNullExpressionValue(iterator, (String)object5);
                        while (bl4 = iterator.hasNext()) {
                            object5 = (CartEntry)iterator.next();
                            if (object5 == null) continue;
                            serializable = ((CartEntry)object5).getOrderEntry();
                            if (serializable != null) {
                                serializable = ((CartEntry)object5).getOrderEntry();
                                object3 = ((CartEntry)object5).getCode();
                                ((CartEntry)serializable).setCode((String)object3);
                            }
                            ((ArrayList)object4).add(object5);
                        }
                    }
                    ((CartOrder)object2).setEntries((ArrayList)object4);
                    ((CCSelectOrderFragment)object).hideProgress();
                    object4 = new ar_2((CartOrder)object2);
                    object2 = ((CCSelectOrderFragment)object).cCBundleViewModel;
                    if (object2 != null) {
                        ((xf_1)object2).f = object4;
                    }
                    bg_1.Companion.getClass();
                    object2 = new bg_1();
                    object = ((CCBaseFragment)object).getMActivity();
                    Intrinsics.checkNotNull(object);
                    object = ((FragmentActivity)object).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
                    object4 = "CCItemListDialogFragment";
                    ((bg_1)object2).show((FragmentManager)object, (String)object4);
                }
            } else {
                int n7 = ((DataCallback)object2).getStatus();
                if (n7 == n3) {
                    ((CCSelectOrderFragment)object).hideProgress();
                    object2 = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_error_message;
                    object2 = hv3_0.K(n7);
                    iterator = "Order details for this order cannot be loaded, try again later";
                    Object[] objectArray = new Object[n3];
                    boolean bl5 = false;
                    Object var8_12 = null;
                    objectArray[0] = iterator;
                    Object object6 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object2, object6);
                    object6 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                    ((CCSelectOrderFragment)object).showNotification((String)((Object)iterator), (String)object2);
                }
            }
        }
        return Unit.a;
    }

    private final void parseResponse(CartOrders object) {
        Collection collection;
        if (object != null && (collection = ((CartOrders)object).getOrders()) != null) {
            int n3;
            int n4;
            collection = ((CartOrders)object).getOrders();
            if ((object = ((CartOrders)object).getPagination()) != null) {
                this.mCurrentPage = n4 = ((Pagination)object).getCurrentPage();
                this.mTotalPages = n4 = ((Pagination)object).getTotalPages();
                this.mTotalItemCount = n3 = ((Pagination)object).getTotalResults();
            }
            object = collection.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                boolean bl2;
                Object object2;
                Object object3 = (CartOrder)object.next();
                if (object3 == null || (object2 = ((CartOrder)object3).getEntries()) == null) continue;
                object3 = ((CartOrder)object3).getEntries().iterator();
                object2 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                while (bl2 = object3.hasNext()) {
                    Product product;
                    object2 = (CartEntry)object3.next();
                    if (object2 == null || (product = ((CartEntry)object2).getProduct()) == null) continue;
                    object2 = ((CartEntry)object2).getProduct();
                    ((Product)object2).populate();
                }
            }
            object = this.mOrderList;
            collection = collection;
            ((ArrayList)object).addAll(collection);
            n3 = this.mCurrentPage;
            int n7 = this.PAGE_SIZE;
            this.mListStartItemPosition = n3 *= n7;
            this.mListEndItemPosition = n3 += n7;
            n7 = this.mTotalItemCount;
            if (n3 > n7) {
                this.mListEndItemPosition = n7;
            }
            this.refreshUi();
        }
    }

    private final void refreshUi() {
        Object object;
        Serializable serializable;
        int n3;
        int n4;
        int n7 = 3;
        int n8 = 0;
        String string2 = null;
        int n10 = 1;
        Object object2 = this.getMUiItemsList();
        ((ArrayList)object2).clear();
        int n14 = this.mListEndItemPosition;
        for (n4 = this.mListStartItemPosition; n4 < n14 && n4 < (n3 = (serializable = this.mOrderList).size()); n4 += n10) {
            n3 = this.mListStartItemPosition;
            if (n4 != n3) {
                serializable = this.getMUiItemsList();
                object = new UiCCComponent(n10, n10);
                serializable.add(object);
            }
            serializable = this.getMUiItemsList();
            object = this.mOrderList.get(n4);
            serializable.add(object);
        }
        Object object3 = this.getMUiItemsList();
        object2 = new CCSelectOrderAdapter((List)object3, this);
        object3 = this.mRecyclerView;
        if (object3 != null) {
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
        }
        n4 = this.mListEndItemPosition;
        n14 = this.mTotalItemCount;
        n3 = 0;
        serializable = null;
        int n15 = 4;
        if (n4 >= n14) {
            object2 = this.mNextLayout;
            if (object2 != null) {
                object2.setVisibility(n15);
            }
            if ((object2 = this.mNextLayout) != null) {
                object2.setOnClickListener(null);
            }
        } else {
            object2 = this.mNextLayout;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            if ((object2 = this.mNextLayout) != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
        }
        if ((n4 = this.mListStartItemPosition) <= n10) {
            object2 = this.mPrevLayout;
            if (object2 != null) {
                object2.setVisibility(n15);
            }
            if ((object2 = this.mPrevLayout) != null) {
                object2.setOnClickListener(null);
            }
        } else {
            object2 = this.mPrevLayout;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            if ((object2 = this.mPrevLayout) != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
        }
        if ((object2 = this.mInfoTv) != null) {
            object3 = StringCompanionObject.INSTANCE;
            n14 = this.mListStartItemPosition + n10;
            object3 = n14;
            n3 = this.mListEndItemPosition;
            serializable = Integer.valueOf(n3);
            n15 = this.mTotalItemCount;
            object = n15;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object3;
            objectArray[n10] = serializable;
            n8 = 2;
            objectArray[n8] = object;
            Object object4 = Arrays.copyOf(objectArray, n7);
            object4 = String.format("Showing %1$s-%2$s of %3$s", object4);
            string2 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            object2.setText((CharSequence)object4);
        }
    }

    private final void setToolbarUI() {
        Object object = this.customToolbarViewMerger;
        int n3 = 0;
        Object object2 = null;
        if ((object = object != null ? ((CustomToolbarViewMerger)object).getToolbar() : null) != null) {
            object = this.customToolbarViewMerger;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                object.invalidate();
            }
            if ((object = this.getMActivity()) != null) {
                CustomToolbarViewMerger customToolbarViewMerger = this.customToolbarViewMerger;
                if (customToolbarViewMerger != null) {
                    object2 = customToolbarViewMerger.getToolbar();
                }
                ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
            }
        }
        if ((object = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object).setNavigationClick();
        }
        if ((object = this.customToolbarViewMerger) != null) {
            n3 = 8;
            ((CustomToolbarViewMerger)object).setSubTitleVisibility(n3);
        }
        if ((object = this.customToolbarViewMerger) != null) {
            object2 = "Select Order";
            ((CustomToolbarViewMerger)object).setTitleText((String)object2);
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

    private final void updateResponse(CartOrders iterator) {
        List list;
        int n3 = 0;
        Object[] objectArray = null;
        if (iterator != null && (list = ((CartOrders)((Object)iterator)).getOrders()) != null) {
            Product product;
            int n4;
            Object object;
            int n7;
            int n8;
            list = ((CartOrders)((Object)iterator)).getOrders();
            if ((iterator = ((CartOrders)((Object)iterator)).getPagination()) != null) {
                this.mCurrentPage = n8 = ((Pagination)((Object)iterator)).getCurrentPage();
                this.mTotalPages = n8 = ((Pagination)((Object)iterator)).getTotalPages();
                this.mTotalItemCount = n7 = ((Pagination)((Object)iterator)).getTotalResults();
            }
            iterator = list.iterator();
            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Object object2 = (CartOrder)iterator.next();
                if (object2 == null || (object = ((CartOrder)object2).getEntries()) == null) continue;
                object2 = ((CartOrder)object2).getEntries().iterator();
                object = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                while ((n4 = object2.hasNext()) != 0) {
                    object = (CartEntry)object2.next();
                    if (object == null || (product = ((CartEntry)object).getProduct()) == null) continue;
                    object = ((CartEntry)object).getProduct();
                    ((Product)object).populate();
                }
            }
            n7 = this.mCurrentPage;
            n8 = this.PAGE_SIZE;
            this.mListStartItemPosition = n7 *= n8;
            this.mListEndItemPosition = n8 += n7;
            n4 = this.mTotalItemCount;
            if (n8 > n4) {
                this.mListEndItemPosition = n4;
            }
            n8 = this.mListEndItemPosition;
            while (n7 < n8 && n7 < (n4 = ((ArrayList)(object = this.mOrderList)).size()) && n3 < (n4 = list.size())) {
                this.mOrderList.remove(n7);
                object = this.mOrderList;
                product = list.get(n3);
                ((ArrayList)object).add(n7, product);
                ++n3;
                ++n7;
            }
            this.refreshUi();
            return;
        }
        iterator = yn3_0.a;
        objectArray = new Object[]{};
        ((yn3$a)((Object)iterator)).a("cartOrders = null or cartOrders.getOrders() = null", objectArray);
    }

    public final void getMessage(String string2) {
        this.refreshOrders = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.cc_selectorder_layout_next;
        if (n3 == n4) {
            int n7;
            n3 = this.mListEndItemPosition;
            object2 = this.mOrderList;
            n4 = ((ArrayList)object2).size();
            if (n3 >= n4) {
                this.getOrders();
                return;
            }
            n3 = this.mListStartItemPosition;
            n4 = this.PAGE_SIZE;
            this.mListStartItemPosition = n3 += n4;
            this.mListEndItemPosition = n7 = this.mListEndItemPosition + n4;
            if (n3 < 0) {
                this.mListStartItemPosition = 0;
            }
            if (n7 > (n3 = ((ArrayList)(object = this.mOrderList)).size())) {
                this.mListEndItemPosition = n3 = this.mTotalItemCount;
            }
            this.refreshUi();
            return;
        }
        n4 = R$id.cc_selectorder_layout_prev;
        if (n3 != n4) return;
        n3 = this.mListStartItemPosition;
        if (n3 > 0) {
            n4 = this.PAGE_SIZE;
            this.mListStartItemPosition = n3 -= n4;
        }
        n4 = (n3 = this.mListEndItemPosition) == (n4 = this.mTotalItemCount) ? (n4 %= 10) : this.PAGE_SIZE;
        this.mListEndItemPosition = n3 -= n4;
        n4 = this.mListStartItemPosition;
        if (n4 < 0) {
            this.mListStartItemPosition = 0;
        }
        if (n3 < 0) {
            this.mListEndItemPosition = 0;
            return;
        }
        this.refreshUi();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.customToolbarViewMerger = object = new CustomToolbarViewMerger(this);
        object = this.getMActivity();
        if (object != null) {
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object5 = object.getDefaultViewModelCreationExtras();
            String string2 = "store";
            Intrinsics.checkNotNullParameter(object3, string2);
            String string3 = "factory";
            Intrinsics.checkNotNullParameter(object4, string3);
            String string4 = "defaultCreationExtras";
            Intrinsics.checkNotNullParameter(object5, string4);
            Object object6 = new pD3((rd3_0)object3, (E$b)object4, (Wd0)object5);
            object3 = xf_1.class;
            object4 = "modelClass";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object3 = rn1_2.c((Class)object3);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object5 = "<this>";
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            String string5 = object3.getQualifiedName();
            String string6 = "Local and anonymous classes can not be ViewModels";
            if (string5 == null) {
                object2 = string6.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            string5 = string7.concat(string5);
            this.cCBundleViewModel = object3 = (xf_1)((pD3)object6).a((yn1_2)object3, string5);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object6 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object6, string3);
            Intrinsics.checkNotNullParameter(object, string4);
            object2 = new pD3((rd3_0)object3, (E$b)object6, (Wd0)object);
            object = tf2_2.class;
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object = rn1_2.c((Class)object);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            Intrinsics.checkNotNullParameter(object, (String)object5);
            object3 = object.getQualifiedName();
            if (object3 == null) {
                object2 = string6.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object3 = string7.concat((String)object3);
            this.orderListViewModel = object = (tf2_2)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        AB0.a().register(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_ccselect_order_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onDestroy() {
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public void onNavigationClick() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity.onBackPressed();
        }
    }

    public void onResume() {
        super.onResume();
        int n3 = this.refreshOrders;
        if (n3 != 0) {
            this.showProgress();
            tf2_2 tf2_22 = this.orderListViewModel;
            if (tf2_22 != null) {
                int n4 = this.mCurrentPage;
                aW aW2 = md3_0.c(tf2_22);
                sf2_2 sf2_22 = new sf2_2(tf2_22, n4, null);
                n3 = 3;
                Ae3.d(aW2, null, null, sf2_22, n3);
            }
        }
        this.refreshOrders = false;
    }

    public void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.initObservables();
        this.setToolbarUI();
        int n4 = R$id.cc_selectorder_rv;
        object2 = (RecyclerView)object.findViewById(n4);
        this.mRecyclerView = object2;
        n4 = R$id.cc_selectorder_layout_next;
        object2 = object.findViewById(n4);
        this.mNextLayout = object2;
        n4 = R$id.cc_selectorder_layout_prev;
        object2 = object.findViewById(n4);
        this.mPrevLayout = object2;
        n4 = R$id.cc_selectorder_layout_tv_info;
        object = (TextView)object.findViewById(n4);
        this.mInfoTv = object;
        object = this.mRecyclerView;
        if (object != null) {
            object3 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object = this.mRecyclerView) != null) {
            n4 = 1;
            ((RecyclerView)object).setHasFixedSize(n4 != 0);
        }
        if ((object = this.mPrevLayout) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.mNextLayout) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((n3 = this.mCurrentPage) == (n4 = -1)) {
            this.getOrders();
        } else {
            this.refreshUi();
        }
    }

    public void onViewItemClick(Object object, int n3) {
        CCSelectOrderFragment cCSelectOrderFragment = this;
        Object object2 = object;
        Object object3 = this.getMActivity();
        if (object3 != null) {
            object3 = this.getMActivity();
            Intrinsics.checkNotNull(object3);
            int n4 = object3.isFinishing();
            if (n4 == 0) {
                Object object4;
                n4 = 5;
                int n7 = n3;
                if (n3 == n4 && (n4 = object instanceof Integer) != 0 && (n4 = ((Number)(object2 = (Number)object)).intValue()) < (n7 = ((ArrayList)(object4 = this.getMUiItemsList())).size())) {
                    object3 = this.getMUiItemsList();
                    n7 = ((Number)object2).intValue();
                    n4 = (object3 = ((ArrayList)object3).get(n7)) instanceof CartOrder;
                    if (n4 != 0) {
                        CharSequence charSequence;
                        Object object5;
                        object3 = this.getMUiItemsList();
                        int n8 = ((Number)object2).intValue();
                        object2 = ((ArrayList)object3).get(n8);
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.CartOrder");
                        object2 = (CartOrder)object2;
                        object3 = ((CartOrder)object2).getCode();
                        object4 = ((CartOrder)object2).getEntries();
                        String string2 = "";
                        if (object4 != null && (n7 = ((ArrayList)(object4 = ((CartOrder)object2).getEntries())).size()) > 0) {
                            boolean bl2;
                            object4 = ((CartOrder)object2).getEntries().iterator();
                            object5 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                            while (bl2 = object4.hasNext()) {
                                object5 = (CartEntry)object4.next();
                                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                                if (!bl3) {
                                    object5 = ((CartEntry)object5).getProduct().getCode();
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append((Object)string2);
                                    ((StringBuilder)charSequence).append(",");
                                    ((StringBuilder)charSequence).append((String)object5);
                                    string2 = ((StringBuilder)charSequence).toString();
                                    continue;
                                }
                                string2 = String.valueOf(((CartEntry)object5).getProduct().getCode());
                            }
                        }
                        Bundle bundle = new Bundle();
                        object4 = no_2.c((CartOrder)object2);
                        bundle.putString("order_status", (String)object4);
                        object5 = ((CartOrder)object2).getCode();
                        bundle.putString("order_id", (String)object5);
                        bundle.putString("product_id", string2);
                        object5 = cCSelectOrderFragment.newCustomEventsRevamp;
                        charSequence = ((NewCustomEventsRevamp)object5).getEC_CC_ORDER_INTERACTION();
                        String string3 = cCSelectOrderFragment.previousScreen;
                        String string4 = cCSelectOrderFragment.previousScreenType;
                        int n10 = 1536;
                        String string5 = "order select";
                        String string6 = "";
                        String string7 = "order_select";
                        String string8 = "customer care - select order screen";
                        String string9 = "customer care screen";
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)charSequence, string5, string6, string7, string8, string9, string3, bundle, string4, false, null, n10, null);
                        object4 = ((CartOrder)object2).getEntries();
                        if (object4 != null) {
                            int n14;
                            object4 = ((CartOrder)object2).getEntries();
                            n7 = ((ArrayList)object4).size();
                            if (n7 == (n14 = 1)) {
                                object2 = ((CartOrder)object2).getEntries();
                                n7 = 0;
                                object4 = null;
                                object2 = ((CartEntry)((ArrayList)object2).get(0)).getEntryNumber();
                                Intrinsics.checkNotNull(object2);
                                n8 = (Integer)object2;
                                object5 = new yq_0((String)object3, n8, false);
                                object2 = cCSelectOrderFragment.cCBundleViewModel;
                                if (object2 != null) {
                                    ((xf_1)object2).e = object5;
                                }
                                if ((object2 = this.getCcActivityListener()) != null) {
                                    n4 = 108;
                                    n7 = 0;
                                    object4 = null;
                                    object2.addFragment(n4, null, n14 != 0);
                                }
                            } else {
                                n8 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                if (n8 == 0) {
                                    this.showProgress();
                                    object2 = this.getOrderDetailViewModel();
                                    if (object2 != null) {
                                        Intrinsics.checkNotNull(object3);
                                        ((db2_1)object2).b((String)object3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

