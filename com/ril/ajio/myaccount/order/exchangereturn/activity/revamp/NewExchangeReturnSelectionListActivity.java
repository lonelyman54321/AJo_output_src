/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomLinearLayoutManager;
import com.ril.ajio.databinding.NewActivityReturnExchangeItemsListBinding;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnControllerActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.Hilt_NewExchangeReturnSelectionListActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a$a;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.squareup.otto.Bus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

public final class NewExchangeReturnSelectionListActivity
extends Hilt_NewExchangeReturnSelectionListActivity
implements k82_0,
sk_1,
View.OnClickListener,
OnNavigationClickListener {
    public static final /* synthetic */ int w0;
    public final rq1_2 p0;
    public ReturnOrderItemDetails q0;
    public HashMap r0;
    public AjioButton s0;
    public final NewCustomEventsRevamp t0;
    public final NewEEcommerceEventsRevamp u0;
    public String v0;

    public NewExchangeReturnSelectionListActivity() {
        Object object = et1_2.NONE;
        Object object2 = new NewExchangeReturnSelectionListActivity$a(this);
        object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        this.p0 = object;
        object = AnalyticsManager.Companion;
        this.t0 = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.u0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.v0 = "";
    }

    public final void i(String string2) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        ak0_0.a(analyticsManager$Companion, gTMEvents, "returns", "drop at store");
        CustomWebViewActivity$a.b(CustomWebViewActivity.Companion, (Context)this, string2, 14);
    }

    public final void k(boolean bl2) {
        if (bl2) {
            Bus bus = AB0.a();
            String string2 = "finish";
            bus.post(string2);
        }
        this.finish();
    }

    /*
     * WARNING - void declaration
     */
    public final void k0() {
        void var2_7;
        Serializable serializable;
        AjioButton ajioButton = this.s0;
        boolean bl2 = false;
        Integer n3 = null;
        if (ajioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnProceedRequest");
            ajioButton = null;
        }
        if ((serializable = this.q0) != null && (serializable = ((ReturnOrderItemDetails)serializable).getSelectedList()) != null) {
            int n4 = ((HashMap)serializable).size();
            n3 = n4;
        }
        Intrinsics.checkNotNull(n3);
        int n7 = n3;
        if (n7 > 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            n3 = null;
        }
        ajioButton.setEnabled((boolean)var2_7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBackPressed() {
        Object object = this.q0;
        if (object != null) {
            int n3;
            if ((object = ((ReturnOrderItemDetails)object).getSelectedList()) != null) {
                n3 = ((HashMap)object).size();
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n3 = (Integer)object;
            if (n3 > 0) {
                a.Companion.getClass();
                n3 = 0;
                object = a$a.a(false, false);
                FragmentManager fragmentManager = this.getSupportFragmentManager();
                String string2 = "CancelConfirmationBottomSheet";
                ((DialogFragment)object).show(fragmentManager, string2);
                return;
            }
        }
        this.finish();
    }

    public void onClick(View object) {
        int n3;
        int n4;
        int n7 = 0;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.exchange_items_list_cancel;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            object = this.q0;
            Intrinsics.checkNotNull(object);
            object = ((ReturnOrderItemDetails)object).getSelectedList();
            n4 = ((HashMap)object).size();
            if (n4 > 0) {
                a.Companion.getClass();
                n4 = 0;
                object = a$a.a(false, false);
                object2 = this.getSupportFragmentManager();
                String string2 = "CancelConfirmationBottomSheet";
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            } else {
                this.finish();
            }
        } else {
            n8 = R$id.exchange_items_list_proceed;
            if (object != null && (n4 = ((Integer)object).intValue()) == n8 && (object = this.q0) != null) {
                object = new Intent((Context)this, ExchangeReturnControllerActivity.class);
                Object object3 = this.q0;
                object.putExtra("RETURN_ITEMS_DATA", (Serializable)object3);
                Object object4 = "GIFTS_ITEMS_DATA";
                object3 = this.r0;
                object.putExtra((String)object4, (Serializable)object3);
                n8 = (int)(h40_0.l1() ? 1 : 0);
                if (n8 != 0) {
                    object4 = this.getIntent();
                    object3 = "IS_FROM_JOUNRNEY";
                    String string3 = "";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "reverseService";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        boolean bl2 = true;
                        n8 = (int)(object4.getBoolean((String)object3, bl2) ? 1 : 0);
                        object4 = n8 != 0;
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (Serializable)object4);
                    object4 = this.getIntent();
                    object3 = "product_id";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "order_status";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "order_id";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "non_refundable_fee";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "discounts";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object4 = object4.getString((String)object3, string3);
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object.putExtra((String)object3, (String)object4);
                    object4 = this.getIntent();
                    object3 = "return_percentage";
                    if (object4 != null && (object4 = object4.getExtras()) != null) {
                        object2 = object4.getString((String)object3, string3);
                    }
                    object.putExtra((String)object3, (String)object2);
                }
                n7 = 203;
                this.startActivityForResult((Intent)object, n7);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle object) {
        Bundle bundle;
        void var1_46;
        void var1_38;
        List list;
        Consignment consignment;
        int n3;
        Bundle bundle2;
        Intent intent;
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3;
        Consignment consignment2;
        void var1_13;
        ReturnOrderItemDetails returnOrderItemDetails;
        int n4;
        int n7;
        int n8 = 0;
        float f5 = 0.0f;
        String string2 = null;
        super.onCreate((Bundle)object);
        ConstraintLayout constraintLayout = this.p2().getRoot();
        this.setContentView((View)constraintLayout);
        AB0.a().register(this);
        Bundle bundle3 = this.getIntent().getExtras();
        int n10 = 1;
        Object object4 = "IS_FROM_JOUNRNEY";
        if (bundle3 != null && (n7 = bundle3.containsKey((String)object4)) == n10) {
            String string3;
            this.v0 = string3 = this.getIntent().getStringExtra((String)object4);
        }
        Intent intent2 = this.getIntent();
        Object object5 = "RETURN_ITEMS_DATA";
        intent2.hasExtra((String)object5);
        Intent intent3 = this.getIntent();
        Object object6 = "getIntent(...)";
        Intrinsics.checkNotNullExpressionValue(intent3, (String)object6);
        int n14 = Build.VERSION.SDK_INT;
        int n15 = 33;
        Object object7 = null;
        if (n14 >= n15) {
            Serializable serializable = jn.a(intent3);
        } else {
            void var1_11;
            Serializable serializable = intent3.getSerializableExtra((String)object5);
            n4 = serializable instanceof ReturnOrderItemDetails;
            if (n4 == 0) {
                n7 = 0;
                Object var1_10 = null;
            }
            ReturnOrderItemDetails returnOrderItemDetails2 = (ReturnOrderItemDetails)var1_11;
        }
        this.q0 = returnOrderItemDetails = (ReturnOrderItemDetails)var1_13;
        if (returnOrderItemDetails != null && (consignment2 = returnOrderItemDetails.getConsignment()) != null) {
            object5 = this.q0;
            if (object5 != null && (object5 = ((ReturnOrderItemDetails)object5).getConsignment()) != null && (object5 = ((Consignment)object5).getEntries()) != null) {
                object5 = (Iterable)object5;
                object3 = new ArrayList();
                object5 = object5.iterator();
                while (bl3 = object5.hasNext()) {
                    Object t3 = object5.next();
                    object2 = t3;
                    object2 = (CartEntry)t3;
                    Boolean bl4 = ((CartEntry)object2).getOrderEntry().isGiftProduct();
                    if (bl4 != null && !(bl2 = Intrinsics.areEqual(object2 = ((CartEntry)object2).getOrderEntry().isGiftProduct(), bl4 = Boolean.FALSE))) continue;
                    ((ArrayList)object3).add(t3);
                }
            } else {
                object3 = new ArrayList();
            }
            consignment2.setEntries((List)object3);
        }
        if ((intent = this.getIntent()) != null && (bundle2 = intent.getExtras()) != null && (n7 = bundle2.containsKey((String)(object5 = "GIFTS_ITEMS_DATA"))) == n10) {
            void var1_25;
            HashMap hashMap;
            Intent intent4 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent4, (String)object6);
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n15) {
                Serializable serializable = kn.b(intent4);
            } else {
                void var1_23;
                Serializable serializable = intent4.getSerializableExtra(object5);
                n4 = serializable instanceof HashMap;
                if (n4 == 0) {
                    n7 = 0;
                    Object var1_22 = null;
                }
                HashMap hashMap2 = (HashMap)var1_23;
            }
            this.r0 = hashMap = (HashMap)var1_25;
        }
        SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout = this.p2().selectionToolbar;
        n4 = R$style.collapsed_toolbar_title;
        subtitleCollapsingToolbarLayout.setCollapsedTitleTextAppearance(n4);
        n4 = R$style.expanded_toolbar_title;
        subtitleCollapsingToolbarLayout.setExpandedTitleTextAppearance(n4);
        n4 = mz3_0.d(16);
        n3 = subtitleCollapsingToolbarLayout.getExpandedTitleMarginTop();
        n14 = subtitleCollapsingToolbarLayout.getExpandedTitleMarginEnd();
        n15 = subtitleCollapsingToolbarLayout.getExpandedTitleMarginBottom();
        subtitleCollapsingToolbarLayout.setExpandedTitleMargin(n4, n3, n14, n15);
        Toolbar toolbar = this.p2().alfToolbar;
        n4 = R$string.returnexchange_listItems_title_new;
        object5 = this.getString(n4);
        toolbar.setTitle((CharSequence)object5);
        ReturnOrderItemDetails returnOrderItemDetails3 = this.q0;
        if (returnOrderItemDetails3 != null && (consignment = returnOrderItemDetails3.getConsignment()) != null && (list = consignment.getEntries()) != null) {
            n7 = list.size();
        } else {
            n7 = 0;
            Object var1_34 = null;
        }
        object5 = this.p2().alfToolbar;
        object6 = "";
        if (n7 > n10) {
            n7 = 4;
            n14 = 2;
            String string4 = hv3_0.J(n14, n7);
        } else {
            String string5 = object6;
        }
        ((Toolbar)object5).setSubtitle((CharSequence)var1_38);
        Toolbar toolbar2 = this.p2().alfToolbar;
        n4 = R$drawable.ic_cc_close;
        toolbar2.setNavigationIcon(n4);
        Toolbar toolbar3 = this.p2().alfToolbar;
        n4 = R$string.close;
        object5 = this.getString(n4);
        toolbar3.setNavigationContentDescription((CharSequence)object5);
        Toolbar toolbar4 = this.p2().alfToolbar;
        object5 = new bz1_0(this, 0);
        toolbar4.setNavigationOnClickListener((View.OnClickListener)object5);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = object6;
        object5 = this.q0;
        if (object5 != null) {
            ref$ObjectRef.element = object5 = ((ReturnOrderItemDetails)object5).getReturnQuickInfoUrl();
        }
        if ((object5 = (CharSequence)ref$ObjectRef.element) == null || (n4 = object5.length()) == 0) {
            object5 = this.p2().alfTvReturnInfo;
            n14 = 8;
            object5.setVisibility(n14);
        }
        object5 = this.p2().alfTvReturnInfo;
        object3 = new kh1_2(this, ref$ObjectRef, n10);
        object5.setOnClickListener((View.OnClickListener)object3);
        n7 = R$id.exchange_items_list_cancel;
        AjioButton ajioButton = (AjioButton)this.findViewById(n7);
        n10 = R$id.exchange_items_list_proceed;
        Object object8 = (AjioButton)this.findViewById(n10);
        this.s0 = object8;
        object5 = "btnProceedRequest";
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object8 = null;
        }
        object8.setEnabled(false);
        ajioButton.setOnClickListener(this);
        AjioButton ajioButton2 = this.s0;
        if (ajioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            Object var1_45 = null;
        }
        var1_46.setOnClickListener((View.OnClickListener)this);
        n7 = R$id.exchange_return_items_listview;
        RecyclerView recyclerView = (RecyclerView)this.findViewById(n7);
        object8 = new AjioCustomLinearLayoutManager((Context)this);
        recyclerView.setLayoutManager((RecyclerView$o)object8);
        object8 = new ArrayList();
        object5 = this.v0;
        object3 = "return";
        n4 = (int)(b.i((String)object5, (String)object3, false) ? 1 : 0);
        Object object9 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Cart.CartEntry>";
        if (n4 != 0) {
            object8 = this.q0;
            if (object8 != null && (object8 = ((ReturnOrderItemDetails)object8).getConsignment()) != null && (object8 = ((Consignment)object8).getEntries()) != null) {
                object8 = (Iterable)object8;
                object5 = new ArrayList();
                object8 = object8.iterator();
                while (bl3 = object8.hasNext()) {
                    Object e2 = object8.next();
                    object2 = e2;
                    object2 = ((CartEntry)e2).getOrderEntry();
                    bl2 = ((CartEntry)object2).isReturnable();
                    if (!bl2) continue;
                    ((ArrayList)object5).add(e2);
                }
                object8 = object5;
            } else {
                n10 = 0;
                object8 = null;
            }
            Intrinsics.checkNotNull(object8, (String)object9);
        } else {
            object5 = this.v0;
            String string6 = "exchange";
            n4 = (int)(b.i((String)object5, string6, false) ? 1 : 0);
            if (n4 != 0) {
                object8 = this.q0;
                if (object8 != null && (object8 = ((ReturnOrderItemDetails)object8).getConsignment()) != null && (object8 = ((Consignment)object8).getEntries()) != null) {
                    object8 = (Iterable)object8;
                    object5 = new ArrayList();
                    object8 = object8.iterator();
                    while (bl3 = object8.hasNext()) {
                        Object t4 = object8.next();
                        object2 = t4;
                        object2 = ((CartEntry)t4).getOrderEntry();
                        bl2 = ((CartEntry)object2).isExchangeable();
                        if (!bl2) continue;
                        ((ArrayList)object5).add(t4);
                    }
                    object8 = object5;
                } else {
                    n10 = 0;
                    object8 = null;
                }
                Intrinsics.checkNotNull(object8, (String)object9);
            }
        }
        object5 = this.q0;
        if (object5 != null && (object5 = ((ReturnOrderItemDetails)object5).getConsignment()) != null) {
            ((Consignment)object5).setEntries((List)object8);
        }
        object5 = this.q0;
        object9 = this.r0;
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        object2 = "getSupportFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(fragmentManager, (String)object2);
        object8 = new cd0_1(this, (ReturnOrderItemDetails)object5, (HashMap)object9, fragmentManager);
        recyclerView.setAdapter((RecyclerView$f)object8);
        Intent intent5 = this.getIntent();
        if (intent5 != null && (bundle = intent5.getExtras()) != null) {
            object7 = bundle.getString((String)object4, (String)object6);
        }
        if ((n7 = (int)(b.i(object7, (String)object3, false) ? 1 : 0)) == 0) return;
        ReturnOrderItemDetails returnOrderItemDetails4 = this.q0;
        if (returnOrderItemDetails4 == null) return;
        ActionContent actionContent = returnOrderItemDetails4.getActionContent();
        if (actionContent == null) return;
        object8 = actionContent.getReturn_fee();
        if (object8 != null) {
            f5 = ((Float)object8).floatValue();
            n10 = n8 = (int)f5;
        } else {
            n10 = 0;
            object8 = null;
        }
        string2 = "stripLayout";
        if (n10 > 0) {
            object4 = h40_0.a;
            boolean bl5 = h40_0.g2();
            if (bl5) {
                object4 = hv3_0.a;
                object5 = actionContent.getReturn_fee_strip();
                object6 = actionContent.getReturn_fee_cta();
                object3 = this.p2().returnFeeStrip.tvReturnFeeInfo;
                Intrinsics.checkNotNullExpressionValue(object3, "tvReturnFeeInfo");
                n15 = R$color.option_blue;
                object7 = new cz1_1(actionContent, this);
                object4.getClass();
                object4 = object5;
                object5 = object6;
                object6 = object3;
                n14 = n15;
                object9 = object7;
                hv3_0.d0(n10, (String)object4, (String)object5, (TextView)object3, n15, (Function0)object7);
                ConstraintLayout constraintLayout2 = this.p2().returnFeeStrip.stripLayout;
                Intrinsics.checkNotNullExpressionValue((Object)constraintLayout2, string2);
                ai0_2.B((View)constraintLayout2);
                return;
            }
        }
        ConstraintLayout constraintLayout3 = this.p2().returnFeeStrip.stripLayout;
        Intrinsics.checkNotNullExpressionValue((Object)constraintLayout3, string2);
        ai0_2.i((View)constraintLayout3);
    }

    public final void onDestroy() {
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public final void onNavigationClick() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Object object = "item";
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 != n4) return super.onOptionsItemSelected(menuItem);
        object = this.q0;
        if (object != null) {
            void var3_6;
            object = ((ReturnOrderItemDetails)object).getSelectedList();
            boolean bl2 = false;
            FragmentManager fragmentManager = null;
            if (object != null) {
                int n7 = ((HashMap)object).size();
            } else {
                boolean bl3 = false;
                object = null;
            }
            if (var3_6 > 0) {
                a.Companion.getClass();
                boolean bl4 = true;
                object = a$a.a(bl4, false);
                fragmentManager = this.getSupportFragmentManager();
                String string2 = "CancelConfirmationBottomSheet";
                ((DialogFragment)object).show(fragmentManager, string2);
                return super.onOptionsItemSelected(menuItem);
            }
        }
        this.finish();
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.t0.getSTEP();
        bundle.putInt((String)object, 2);
        object = this.u0;
        String string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.t0.newPushCustomScreenView("return/exchange product selection screen", "order management screen", string2, bundle, string3);
    }

    public final void onStop() {
        super.onStop();
        this.u0.setPreviousScreenData("return/exchange product selection screen", "order management screen");
    }

    public final NewActivityReturnExchangeItemsListBinding p2() {
        return (NewActivityReturnExchangeItemsListBinding)this.p0.getValue();
    }
}

