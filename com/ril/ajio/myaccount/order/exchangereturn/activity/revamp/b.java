/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnControllerActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a$a;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class b
extends v51_0
implements View.OnClickListener,
r72_0,
OnNavigationClickListener,
Tx0 {
    public CartEntry A;
    public AjioTextView B;
    public ConstraintLayout C;
    public String D;
    public CustomToolbarViewMerger f;
    public AjioButton g;
    public AjioButton h;
    public LinearLayout i;
    public ExchangeReturnControllerActivity j;
    public AjioTextView k;
    public AjioTextView l;
    public LinearLayout m;
    public pd0_1 n;
    public qd0_1 o;
    public ArrayList p;
    public final ArrayList q;
    public ReturnOrderItemDetails r;
    public RecyclerView s;
    public int t;
    public HashMap u;
    public int v;
    public boolean w;
    public View x;
    public CartEntry y;
    public int z;

    public b() {
        ArrayList arrayList;
        this.p = arrayList = new ArrayList();
        this.q = arrayList = new ArrayList();
        this.z = -1;
        this.D = "";
    }

    public final Bundle Pa() {
        Bundle bundle = new Bundle();
        Object object = this.getArguments();
        String string2 = null;
        String string3 = "product_id";
        object = object != null ? object.getString(string3) : null;
        bundle.putString(string3, (String)object);
        object = this.getArguments();
        string3 = "order_status";
        object = object != null ? object.getString(string3) : null;
        bundle.putString(string3, (String)object);
        object = this.getArguments();
        string3 = "order_id";
        if (object != null) {
            string2 = object.getString(string3);
        }
        bundle.putString(string3, string2);
        return bundle;
    }

    public final void Qa(boolean bl2) {
        Object object;
        Object object2;
        block5: {
            block6: {
                object2 = this.r;
                if (object2 == null) {
                    return;
                }
                if (!bl2) break block5;
                object = this.p;
                if (object == null) break block6;
                Intrinsics.checkNotNull(object);
                int n3 = ((ArrayList)object).size();
                if (n3 == 0) break block5;
            }
            return;
        }
        object2 = this.j;
        object = new Intent((Context)object2, ExchangeReturnVerifyActivity.class);
        Object object3 = this.r;
        object.putExtra("RETURN_ITEMS_DATA", (Serializable)object3);
        int n4 = this.z;
        object.putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE", n4);
        object2 = this.A;
        n4 = 0;
        object3 = null;
        object2 = object2 != null ? no_2.b((CartEntry)object2) : null;
        object.putExtra("return_display_status", (String)object2);
        Object object4 = this.u;
        object.putExtra("GIFTS_ITEMS_DATA", (Serializable)object4);
        object2 = this.getArguments();
        object4 = "product_id";
        object2 = object2 != null ? object2.getString((String)object4) : null;
        object.putExtra((String)object4, (String)object2);
        object2 = this.getArguments();
        object4 = "order_status";
        object2 = object2 != null ? object2.getString((String)object4) : null;
        object.putExtra((String)object4, (String)object2);
        object2 = this.getArguments();
        object4 = "order_id";
        if (object2 != null) {
            object3 = object2.getString((String)object4);
        }
        object.putExtra((String)object4, (String)object3);
        object3 = this.D;
        object.putExtra("IS_FROM_JOUNRNEY", (String)object3);
        object2 = this.j;
        Intrinsics.checkNotNull(object2);
        ((ComponentActivity)object2).startActivityForResult((Intent)object, 203);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ra() {
        Object object = this.r;
        Intrinsics.checkNotNull(object);
        Object object2 = this.p;
        ((ReturnOrderItemDetails)object).setSelectedControllerList((ArrayList)object2);
        object = this.r;
        Intrinsics.checkNotNull(object);
        object2 = this.q;
        ((ReturnOrderItemDetails)object).setSelectedControllerConfirmedList((ArrayList)object2);
        int n3 = ((ArrayList)object2).size();
        int n4 = 8;
        if (n3 > 0) {
            object = this.k;
            Intrinsics.checkNotNull(object);
            int n7 = R$string.returnexchange_list_saved;
            object2 = ((ArrayList)object2).size();
            int n8 = this.t;
            Integer n10 = n8;
            int n14 = 2;
            Object[] objectArray = new Object[n14];
            objectArray[0] = object2;
            int n15 = 1;
            objectArray[n15] = n10;
            object2 = hv3_0.L(n7, objectArray);
            object.setText((CharSequence)object2);
            object = this.m;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
        } else {
            object = this.m;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n4);
        }
        object = this.p;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            n3 = ((ArrayList)object).size();
            if (n3 == 0) {
                object = this.g;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n4);
                object = this.h;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
                object = this.i;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
                return;
            }
        }
        object = this.g;
        Intrinsics.checkNotNull(object);
        object.setVisibility(0);
        object = this.h;
        Intrinsics.checkNotNull(object);
        object.setVisibility(n4);
        object = this.i;
        Intrinsics.checkNotNull(object);
        object.setVisibility(n4);
    }

    public final void S4(CartEntry object) {
        sa2_2 sa2_22 = new sa2_2();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PRODUCT_DETAIL_BREAKUP", (Serializable)object);
        sa2_22.setArguments(bundle);
        object = this.requireActivity().getSupportFragmentManager();
        sa2_22.show((FragmentManager)object, "Product View Breakup Fragment");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Sa() {
        Object object = this.q;
        int n3 = ((ArrayList)object).size();
        int n4 = 8;
        if (n3 > 0) {
            object = this.x;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n4);
            object = this.s;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
            return;
        }
        n3 = (int)(this.w ? 1 : 0);
        if (n3 != 0) {
            object = this.r;
            Intrinsics.checkNotNull(object);
            object = ((ReturnOrderItemDetails)object).getDeliveryAddress();
            n3 = (int)(((CartDeliveryAddress)object).isDropAtStoreService() ? 1 : 0);
            if (n3 != 0) {
                object = this.x;
                Intrinsics.checkNotNull(object);
                int n7 = R$id.frecl_layout_das;
                object.findViewById(n7).setVisibility(0);
                object = this.s;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n4);
                return;
            }
        }
        object = this.x;
        Intrinsics.checkNotNull(object);
        int n8 = R$id.frecl_layout_das;
        object.findViewById(n8).setVisibility(n4);
        object = this.s;
        Intrinsics.checkNotNull(object);
        object.setVisibility(0);
    }

    public final void e5(CartEntry object) {
        Intrinsics.checkNotNullParameter(object, "cartEntry");
        this.y = object;
        com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a.Companion.getClass();
        object = a$a.a(false, false);
        FragmentManager fragmentManager = this.getChildFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "CancelConfirmationBottomSheet");
    }

    public final void f5(CartEntry object) {
        Intrinsics.checkNotNullParameter(object, "cartEntry");
        this.y = object;
        com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a.Companion.getClass();
        object = a$a.a(false, true);
        FragmentManager fragmentManager = this.getChildFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "CancelConfirmationBottomSheet");
    }

    public final void h1(CartEntry cartEntry, int n3) {
        Object object;
        Object object2;
        Object object3;
        b b2 = this;
        Object object4 = cartEntry;
        Object object5 = "cartEntry";
        Intrinsics.checkNotNullParameter(cartEntry, (String)object5);
        boolean n4 = h40_0.l1();
        if (n4) {
            object5 = this.D;
            object3 = "return";
            boolean bl2 = ((String)object5).equals(object3);
            if (bl2) {
                object5 = AnalyticsManager.Companion.getInstance();
                object3 = ((AnalyticsManager)object5).getNewCustomEventsRevamp();
                Bundle bundle = this.Pa();
                object2 = "buttonTap";
                object = "return mode selection interaction";
                String string2 = "return reasons";
                String string3 = "buttonTap";
                String string4 = "return mode confirmation screen";
                String string5 = "";
                int n7 = 1632;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, (String)object, string2, string3, string4, null, null, bundle, string5, false, null, n7, null);
            } else {
                object5 = AnalyticsManager.Companion.getInstance();
                object3 = ((AnalyticsManager)object5).getNewCustomEventsRevamp();
                Bundle bundle = this.Pa();
                object2 = "buttonTap";
                object = "exchange mode selection interaction";
                String string6 = "exchange reasons";
                String string7 = "buttonTap";
                String string8 = "exchange mode confirmation screen";
                String string9 = "";
                int n8 = 1632;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, (String)object, string6, string7, string8, null, null, bundle, string9, false, null, n8, null);
            }
        }
        if ((object5 = cartEntry.getOrderEntry()) != null) {
            boolean bl3;
            object5 = cartEntry.getOrderEntry();
            if (object5 != null && (object5 = b2.r) != null) {
                object5 = cartEntry.getOrderEntry();
                object3 = b2.r;
                Intrinsics.checkNotNull(object3);
                object3 = ((ReturnOrderItemDetails)object3).getOrderCode();
                ((CartEntry)object5).setOrderId((String)object3);
            }
            object5 = new Bundle();
            object3 = b2.r;
            object2 = null;
            object3 = object3 != null ? ((ReturnOrderItemDetails)object3).getActionContent() : null;
            object5.putSerializable("actionContent", (Serializable)object3);
            object = cartEntry.getOrderEntry();
            object5.putSerializable("RETURN_ITEMS_CONSIGNMENT_ENTRY", (Serializable)object);
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object3 = ((ReturnOrderItemDetails)object3).getReturnReasons();
            object5.putStringArrayList("RETURN_ITEMS_REASONS", (ArrayList)object3);
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object3 = ((ReturnOrderItemDetails)object3).getReturnSubReasons();
            object = "RETURN_ITEMS_SUBREASONS";
            object5.putSerializable((String)object, (Serializable)object3);
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object3 = ((ReturnOrderItemDetails)object3).getDeliveryAddress();
            if (object3 != null) {
                object3 = b2.r;
                Intrinsics.checkNotNull(object3);
                object3 = ((ReturnOrderItemDetails)object3).getDeliveryAddress().getPostalCode();
                object = "RETURN_EXCHANGE_PINCODE";
                object5.putString((String)object, (String)object3);
            }
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object3 = ((ReturnOrderItemDetails)object3).getExchangeReasons();
            object5.putStringArrayList("EXCHANGE_ITEMS_REASONS", (ArrayList)object3);
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object3 = ((ReturnOrderItemDetails)object3).getExchangeSubReasons();
            object = "EXCHANGE_ITEMS_SUBREASONS";
            object5.putSerializable((String)object, (Serializable)object3);
            object3 = b2.r;
            Intrinsics.checkNotNull(object3);
            object4 = (Serializable)((ReturnOrderItemDetails)object3).getSelectedList().get(object4);
            object5.putSerializable("RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION", (Serializable)object4);
            object5.putInt("RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE", n3);
            object3 = b2.u;
            object5.putSerializable("GIFTS_ITEMS_DATA", (Serializable)object3);
            object4 = this.getArguments();
            object3 = "product_id";
            if (object4 != null) {
                object4 = object4.getString((String)object3);
            } else {
                bl3 = false;
                object4 = null;
            }
            object5.putString((String)object3, (String)object4);
            object4 = this.getArguments();
            object3 = "order_status";
            if (object4 != null) {
                object4 = object4.getString((String)object3);
            } else {
                bl3 = false;
                object4 = null;
            }
            object5.putString((String)object3, (String)object4);
            object4 = this.getArguments();
            object3 = "order_id";
            if (object4 != null) {
                object2 = object4.getString((String)object3);
            }
            object5.putString((String)object3, (String)object2);
            object3 = b2.D;
            object5.putString("IS_FROM_JOUNRNEY", (String)object3);
            object4 = this.getArguments();
            object3 = "reverseService";
            bl3 = object4 != null ? object4.getBoolean((String)object3) : true;
            object5.putBoolean((String)object3, bl3);
            object4 = ExchangeReturnTabActivity.Companion;
            object3 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(object3, "requireContext(...)");
            object4.getClass();
            Intrinsics.checkNotNullParameter(object3, "context");
            Intrinsics.checkNotNullParameter(b2, "fragment");
            Intrinsics.checkNotNullParameter(object5, "bundle");
            object2 = ExchangeReturnTabActivity.class;
            object4 = new Intent((Context)object3, (Class)object2);
            object4.putExtras((Bundle)object5);
            int n10 = 23;
            b2.startActivityForResult((Intent)object4, n10);
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = (ExchangeReturnControllerActivity)this.getActivity();
        this.j = object;
        object = this.getActivity();
        if (object != null) {
            int n3;
            object = (AppCompatActivity)object;
            Object object2 = this.f;
            Intrinsics.checkNotNull(object2);
            object2 = ((CustomToolbarViewMerger)object2).getToolbar();
            ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
            int n4 = h40_0.l1();
            if (n4 != 0 && (n4 = ((String)(object = this.D)).length()) > 0) {
                object = this.D;
                object2 = "return";
                n4 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                if (n4 != 0) {
                    n4 = R$string.specify_only_return_details;
                    object = hv3_0.K(n4);
                } else {
                    n4 = R$string.specify_only_exchange_details;
                    object = hv3_0.K(n4);
                }
            } else {
                n4 = R$string.returnexchange_details_title_new_refresh;
                object = hv3_0.K(n4);
            }
            object2 = this.f;
            if (object2 != null) {
                ((CustomToolbarViewMerger)object2).setTitleText((String)object);
            }
            if ((object2 = this.r) != null && (object2 = ((ReturnOrderItemDetails)object2).getConsignment()) != null && (object2 = ((Consignment)object2).getEntries()) != null) {
                n3 = object2.size();
            } else {
                n3 = 0;
                object2 = null;
            }
            int n7 = 1;
            int n8 = 3;
            if (n3 > n7) {
                n3 = 4;
                object2 = hv3_0.J(n8, n3);
            } else {
                n3 = 2;
                object2 = hv3_0.J(n3, n8);
            }
            Object object3 = this.f;
            if (object3 != null) {
                ((CustomToolbarViewMerger)object3).setSubTitleText((String)object2);
            }
            if ((object3 = this.f) != null && (object3 = ((CustomToolbarViewMerger)object3).getToolbar()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append((String)object2);
                object = stringBuilder.toString();
                object3.setContentDescription((CharSequence)object);
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        int n7 = 23;
        if (n3 == n7 && n4 == (n3 = -1) && object != null) {
            Serializable serializable;
            Object object2 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION";
            n4 = 0;
            Object object3 = null;
            n3 = object.getIntExtra((String)object2, 0);
            n7 = Build.VERSION.SDK_INT;
            int n8 = 33;
            if (n7 >= n8) {
                serializable = id0_1.a((Intent)object);
            } else {
                serializable = object.getSerializableExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY");
                n8 = serializable instanceof CartEntry;
                if (n8 == 0) {
                    n7 = 0;
                    serializable = null;
                }
                serializable = (CartEntry)serializable;
            }
            serializable = (CartEntry)serializable;
            this.A = serializable;
            String string2 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE";
            this.z = n4 = object.getIntExtra(string2, 0);
            ((CartEntry)ho_0.a(this.r, n3)).setOrderEntry((CartEntry)serializable);
            object3 = this.p;
            Intrinsics.checkNotNull(object3);
            object = this.r;
            Intrinsics.checkNotNull(object);
            object = ((ReturnOrderItemDetails)object).getConsignment().getEntries().get(n3);
            ((ArrayList)object3).remove(object);
            object3 = this.n;
            Intrinsics.checkNotNull(object3);
            ((RecyclerView$f)object3).notifyDataSetChanged();
            object3 = this.q;
            object = this.r;
            Intrinsics.checkNotNull(object);
            object = ((ReturnOrderItemDetails)object).getConsignment().getEntries().get(n3);
            ((ArrayList)object3).remove(object);
            object = this.r;
            Intrinsics.checkNotNull(object);
            object = ((ReturnOrderItemDetails)object).getConsignment().getEntries();
            object2 = object.get(n3);
            ((ArrayList)object3).add(object2);
            object2 = this.o;
            Intrinsics.checkNotNull(object2);
            ((RecyclerView$f)object2).notifyDataSetChanged();
            this.Sa();
            this.Ra();
            n3 = 1;
            this.Qa(n3 != 0);
        }
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.fragment_return_btn_proceed;
        if (n3 == n4) {
            object = null;
            this.Qa(false);
        } else {
            n4 = R$id.fragment_return_btn_back;
            if (n3 == n4) {
                object = this.j;
                Intrinsics.checkNotNull(object);
                ((ExchangeReturnControllerActivity)object).onBackPressed();
            } else {
                n4 = R$id.frecl_tv_ras_know_more;
                if (n3 == n4) {
                    object2 = AnalyticsManager.Companion;
                    Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    String string2 = "drop at store";
                    ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, "returns", string2);
                    object2 = CustomWebViewActivity.Companion;
                    object3 = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(object3, "requireActivity(...)");
                    object = object.getTag();
                    String string3 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(object, string3);
                    object = (String)object;
                    int n7 = 14;
                    CustomWebViewActivity$a.b((CustomWebViewActivity$a)object2, (Context)object3, (String)object, n7);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int n3;
        int n4;
        super.onCreate(bundle);
        boolean bl2 = true;
        this.setHasOptionsMenu(bl2);
        Object object = new CustomToolbarViewMerger(this);
        this.f = object;
        object = this.requireArguments();
        Object object2 = "requireArguments(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n7 = Build.VERSION.SDK_INT;
        Object object3 = null;
        String string2 = "RETURN_ITEMS_DATA";
        int n8 = 33;
        if (n7 >= n8) {
            object = D7.a((Bundle)object);
        } else {
            boolean bl3 = (object = object.getSerializable(string2)) instanceof ReturnOrderItemDetails;
            if (!bl3) {
                n4 = 0;
                object = null;
            }
            object = (ReturnOrderItemDetails)object;
        }
        this.r = object = (ReturnOrderItemDetails)object;
        object = this.requireArguments();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        if (n7 >= n8) {
            object = E7.a((Bundle)object);
        } else {
            object2 = "GIFTS_ITEMS_DATA";
            n3 = (object = object.getSerializable((String)object2)) instanceof HashMap;
            if (n3 != 0) {
                object3 = object;
            }
            object = object3;
            object = (HashMap)object3;
        }
        this.u = object = (HashMap)object;
        this.z = n4 = this.requireArguments().getInt(string2, -1);
        object = this.r;
        Intrinsics.checkNotNull(object);
        this.t = n4 = ((ReturnOrderItemDetails)object).getSelectedList().size();
        object = this.requireArguments();
        n7 = 0;
        this.v = n4 = object.getInt("DROP_AT_STORE_ITEM_COUNT", 0);
        object = this.requireArguments();
        object3 = "";
        this.D = object = object.getString("IS_FROM_JOUNRNEY", (String)object3);
        n4 = this.v;
        object2 = this.r;
        Intrinsics.checkNotNull(object2);
        object2 = ((ReturnOrderItemDetails)object2).getSelectedList().keySet();
        n3 = object2.size();
        if (n4 != n3) {
            bl2 = false;
            bundle = null;
        }
        this.w = bl2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        CustomToolbarViewMerger customToolbarViewMerger = this.f;
        Intrinsics.checkNotNull(customToolbarViewMerger);
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int n3 = R$layout.new_exchange_controller_layout;
        int n4 = R$layout.fragment_return_exchange_controller_list;
        Intrinsics.checkNotNull(viewGroup);
        return customToolbarViewMerger.inflateView(context, n3, n4, layoutInflater, viewGroup);
    }

    public final void onNavigationClick() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f5;
        int n3;
        Object object;
        int n4;
        String string2;
        int n7;
        b b2 = this;
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n8 = R$id.fragment_exchange_rv;
        Object object3 = view.findViewById(n8);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = (RecyclerView)object3;
        int n10 = R$id.fragment_exchange_bottom_rv;
        Object object5 = (RecyclerView)view.findViewById(n10);
        this.s = object5;
        FragmentActivity fragmentActivity = this.requireActivity();
        object5 = new LinearLayoutManager((Context)fragmentActivity);
        int n14 = 0;
        fragmentActivity = null;
        ((LinearLayoutManager)object5).setOrientation(0);
        Object object6 = this.r;
        Intrinsics.checkNotNull(object6);
        object6 = ((ReturnOrderItemDetails)object6).getSelectedList().keySet();
        Object object7 = new ArrayList(object6);
        this.p = object7;
        int n15 = this.w;
        int n16 = this.v;
        Object object8 = this.r;
        if (object8 != null) {
            object8 = ((ReturnOrderItemDetails)object8).getOrderCode();
        } else {
            n7 = 0;
            object8 = null;
        }
        HashMap hashMap = b2.u;
        String string3 = b2.D;
        object6 = new RecyclerView$f();
        ((pd0_1)object6).g = false;
        ((pd0_1)object6).h = string2 = "";
        Object object9 = new NewCustomEventsRevamp();
        ((pd0_1)object6).i = object9;
        object9 = new NewEEcommerceEventsRevamp();
        Object object10 = ((NewEEcommerceEventsRevamp)object9).getPREVIOUS_SCREEN();
        ((pd0_1)object6).j = object10;
        object10 = ((NewEEcommerceEventsRevamp)object9).getSCREEN_TYPE();
        ((pd0_1)object6).k = object10;
        ((pd0_1)object6).a = b2;
        ((pd0_1)object6).f = object7;
        ((pd0_1)object6).b = n15;
        ((pd0_1)object6).c = n16;
        ((pd0_1)object6).d = object8;
        ((pd0_1)object6).e = hashMap;
        ((pd0_1)object6).h = string3;
        b2.n = object6;
        object7 = b2.r;
        Intrinsics.checkNotNull(object7);
        ((pd0_1)object6).g = n4 = ((ReturnOrderItemDetails)object7).getDeliveryAddress().isDropAtStoreService();
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object5);
        object5 = b2.n;
        ((RecyclerView)object3).setAdapter((RecyclerView$f)object5);
        object5 = this.requireActivity();
        object3 = new LinearLayoutManager((Context)object5);
        n10 = 1;
        ((LinearLayoutManager)object3).setOrientation(n10);
        object6 = b2.q;
        Object object11 = b2.u;
        b2.o = object7 = new qd0_1(b2, (ArrayList)object6, (HashMap)object11);
        object7 = b2.s;
        if (object7 != null) {
            ((RecyclerView)object7).setLayoutManager((RecyclerView$o)object3);
        }
        if ((object3 = b2.s) != null) {
            object7 = b2.o;
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object7);
        }
        n8 = R$id.frecl_layout_das;
        object3 = object2.findViewById(n8);
        b2.x = object3;
        n8 = R$id.frecl_tv_ras_info;
        object3 = object2.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = (AjioTextView)object3;
        int n17 = R$id.frecl_tv_ras_know_more;
        object4 = object2.findViewById(n17);
        object7 = b2.r;
        Intrinsics.checkNotNull(object7);
        object7 = ((ReturnOrderItemDetails)object7).getSelectedList().keySet().iterator();
        while (true) {
            boolean bl2 = object7.hasNext();
            n15 = 8;
            if (!bl2) break;
            object6 = (CartEntry)object7.next();
            if (object6 != null && (object = ((CartEntry)object6).getDropAtStore()) != null && (n16 = (int)(TextUtils.isEmpty((CharSequence)(object = ((CartEntry)object6).getDropAtStore().getKnowMoreURL())) ? 1 : 0)) == 0) {
                object7 = ((CartEntry)object6).getDropAtStore().getMessage();
                object3.setText((CharSequence)object7);
                object3 = ((CartEntry)object6).getDropAtStore().getKnowMoreURL();
                object4.setTag(object3);
                object4.setOnClickListener((View.OnClickListener)b2);
                object4.setVisibility(0);
                break;
            }
            object4.setVisibility(n15);
        }
        this.Sa();
        n8 = R$id.fragment_return_btn_back;
        b2.g = object3 = (AjioButton)object2.findViewById(n8);
        if (object3 != null) {
            object3.setOnClickListener((View.OnClickListener)b2);
        }
        n8 = R$id.fragment_return_btn_proceed;
        b2.h = object3 = (AjioButton)object2.findViewById(n8);
        n8 = R$id.fragment_return_btn_proceed_layout;
        object3 = (LinearLayout)object2.findViewById(n8);
        b2.i = object3;
        object3 = b2.h;
        if (object3 != null) {
            object3.setOnClickListener((View.OnClickListener)b2);
        }
        n8 = R$id.saved_request_ll;
        object3 = (LinearLayout)object2.findViewById(n8);
        b2.m = object3;
        n8 = R$id.item_list_name;
        b2.l = object3 = (AjioTextView)object2.findViewById(n8);
        n8 = R$id.saved_request_tv;
        b2.k = object3 = (AjioTextView)object2.findViewById(n8);
        object3 = b2.m;
        if (object3 != null) {
            object3.setVisibility(n15);
        }
        n8 = R$id.tv_return_fee_info;
        b2.B = object3 = (AjioTextView)object2.findViewById(n8);
        n8 = R$id.return_fee_strip;
        object2 = (ConstraintLayout)object2.findViewById(n8);
        b2.C = object2;
        if (object2 != null) {
            ai0_2.i(object2);
        }
        if ((object2 = b2.r) != null && (n3 = object2.isSelfShip()) == n10) {
            object2 = b2.r;
            if (object2 != null && (object2 = object2.getConsignment()) != null && (object2 = object2.getEntries()) != null) {
                n3 = object2.size();
            } else {
                n3 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            if (n3 == n10 && (object2 = b2.l) != null) {
                object2.setVisibility(0);
            }
        }
        this.Ra();
        object2 = h40_0.a;
        n3 = (int)(h40_0.f2() ? 1 : 0);
        object3 = "return";
        if ((n3 != 0 || (n3 = (int)(h40_0.l1() ? 1 : 0)) != 0) && (n3 = (object2 = b2.D).length()) > 0) {
            object2 = b2.D;
            n3 = (int)(object2.equals(object3) ? 1 : 0);
            if (n3 != 0) {
                object9 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                object2 = this.Pa();
                object4 = b2.r;
                if (object4 != null && (object4 = ((ReturnOrderItemDetails)object4).getActionContent()) != null && (object4 = ((ActionContent)object4).getReturn_fee()) != null) {
                    float f6 = ((Float)object4).floatValue();
                    n17 = (int)f6;
                } else {
                    n17 = 0;
                    float f7 = 0.0f;
                    object4 = null;
                }
                object5 = "return_fee";
                object2.putInt((String)object5, n17);
                int n18 = 1632;
                String string4 = "";
                String string5 = "";
                String string6 = "";
                String string7 = "screen_view";
                String string8 = "return mode confirmation screen";
                String string9 = "";
                View view2 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object9, string4, string5, string6, string7, string8, null, null, (Bundle)object2, string9, false, null, n18, null);
            } else {
                object2 = AnalyticsManager.Companion.getInstance();
                object9 = object2.getNewCustomEventsRevamp();
                Bundle bundle2 = this.Pa();
                int n19 = 1632;
                String string10 = "";
                String string11 = "";
                String string12 = "";
                String string13 = "screen_view";
                String string14 = "exchange mode confirmation screen";
                String string15 = "";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object9, string10, string11, string12, string13, string14, null, null, bundle2, string15, false, null, n19, null);
            }
        }
        if ((object2 = b2.r) != null && (object2 = object2.getActionContent()) != null && (object2 = object2.getReturn_fee()) != null) {
            f5 = object2.floatValue();
            n4 = n14 = (int)f5;
        } else {
            n4 = 0;
            object7 = null;
        }
        object2 = b2.D;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(h40_0.g2() ? 1 : 0)) != 0 && n4 > 0) {
            object2 = b2.r;
            if (object2 != null) {
                object2 = object2.getActionContent();
            } else {
                n3 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            if (object2 != null && (object = b2.B) != null) {
                object2 = b2.C;
                if (object2 != null) {
                    ai0_2.B(object2);
                }
                object2 = hv3_0.a;
                object3 = b2.r;
                if (object3 != null && (object3 = ((ReturnOrderItemDetails)object3).getActionContent()) != null) {
                    object3 = ((ActionContent)object3).getReturn_fee_strip();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                object6 = object3 == null ? string2 : object3;
                object3 = b2.r;
                if (object3 != null && (object3 = ((ReturnOrderItemDetails)object3).getActionContent()) != null) {
                    object11 = object10 = ((ActionContent)object3).getReturn_fee_cta();
                } else {
                    n15 = 0;
                    object11 = null;
                }
                n7 = R$color.option_blue;
                object10 = new zy1_2(b2, n4);
                object2.getClass();
                hv3_0.d0(n4, (String)object6, (String)object11, (TextView)object, n7, (Function0)object10);
            }
        }
    }

    public final void p6() {
        Object object = this.y;
        if (object != null) {
            int n3;
            object = this.p;
            Intrinsics.checkNotNull(object);
            CartEntry cartEntry = this.y;
            TypeIntrinsics.asMutableCollection(object).remove(cartEntry);
            this.t = n3 = this.t + -1;
            object = this.p;
            Intrinsics.checkNotNull(object);
            n3 = ((ArrayList)object).size();
            if (n3 == 0 && (n3 = ((ArrayList)(object = this.q)).size()) == 0) {
                object = this.j;
                Intrinsics.checkNotNull(object);
                object.finish();
            } else {
                object = this.n;
                Intrinsics.checkNotNull(object);
                ((RecyclerView$f)object).notifyDataSetChanged();
                object = this.o;
                Intrinsics.checkNotNull(object);
                ((RecyclerView$f)object).notifyDataSetChanged();
                this.Ra();
                this.Sa();
            }
        }
    }

    public final void reset() {
        Object object = this.y;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).getOrderEntry().setIsExchangeItem(false);
            object = this.y;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).getOrderEntry().setIsReturnItem(false);
            object = this.y;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).getOrderEntry().reset();
            object = this.p;
            Intrinsics.checkNotNull(object);
            CartEntry cartEntry = this.y;
            Intrinsics.checkNotNull(cartEntry);
            ((ArrayList)object).add(cartEntry);
            object = this.q;
            cartEntry = this.y;
            Intrinsics.checkNotNull(cartEntry);
            ((ArrayList)object).remove(cartEntry);
            object = this.n;
            Intrinsics.checkNotNull(object);
            ((RecyclerView$f)object).notifyDataSetChanged();
            object = this.o;
            Intrinsics.checkNotNull(object);
            ((RecyclerView$f)object).notifyDataSetChanged();
            this.Ra();
            this.Sa();
        }
    }
}

