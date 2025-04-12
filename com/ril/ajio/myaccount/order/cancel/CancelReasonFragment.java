/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.Spinner
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.cancel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment$2;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment$a;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment$b;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public class CancelReasonFragment
extends g51_0
implements FragmentTitlesInterface,
View.OnClickListener,
OnNavigationClickListener {
    public static final /* synthetic */ int E;
    public Button A;
    public EditText B;
    public View C;
    public os1_2 D;
    public String g = null;
    public CartEntry h;
    public CartOrder i;
    public HashMap j;
    public FragmentActivity k;
    public OnFragmentInteractionListener l;
    public fo3 m;
    public Spinner n = null;
    public AjioProgressView o;
    public AppCompatTextView p;
    public boolean q = false;
    public ImageView r;
    public AjioTextView s;
    public ImageView t;
    public int u;
    public int v;
    public ps1_2 w;
    public db2_1 x;
    public CustomToolbarViewMerger y;
    public final NewEEcommerceEventsRevamp z;

    public CancelReasonFragment() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        this.z = newEEcommerceEventsRevamp = AnalyticsManager.getInstance().getNewEEcommerceEventsRevamp();
        AnalyticsManager.getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
        AnalyticsManager.getInstance().getNewEEcommerceEventsRevamp().getPrevScreenType();
    }

    public static CancelReasonFragment$b Pa(View view) {
        Object object;
        CancelReasonFragment$b cancelReasonFragment$b = new Object();
        int n3 = R$id.cancel_reason_imv_product;
        cancelReasonFragment$b.a = object = (ImageView)view.findViewById(n3);
        n3 = R$id.cancel_reason_tv_price;
        object = (TextView)view.findViewById(n3);
        cancelReasonFragment$b.b = object;
        n3 = R$id.cancel_reason_tv_brand;
        object = (TextView)view.findViewById(n3);
        cancelReasonFragment$b.c = object;
        n3 = R$id.cancel_reason_tv_desc;
        object = (TextView)view.findViewById(n3);
        cancelReasonFragment$b.d = object;
        n3 = R$id.cancel_reason_tv_size;
        object = (TextView)view.findViewById(n3);
        cancelReasonFragment$b.e = object;
        n3 = R$id.composeGiftsView;
        object = (ComposeView)view.findViewById(n3);
        cancelReasonFragment$b.f = object;
        n3 = R$id.item_original_price;
        object = (TextView)view.findViewById(n3);
        cancelReasonFragment$b.g = object;
        n3 = R$id.tv_refund_breakup;
        view = (TextView)view.findViewById(n3);
        return cancelReasonFragment$b;
    }

    /*
     * WARNING - void declaration
     */
    public static void Ra(ImageView imageView, ImageView imageView2, boolean bl2, boolean bl3) {
        void var3_5;
        imageView.setEnabled(bl2);
        imageView.setClickable(bl2);
        if (bl2) {
            int n3 = R$drawable.ic_qty_subtract;
            imageView.setImageResource(n3);
        } else {
            int n4 = R$drawable.ic_qty_subtract_disable;
            imageView.setImageResource(n4);
        }
        imageView2.setEnabled((boolean)var3_5);
        imageView2.setClickable((boolean)var3_5);
        if (var3_5 != false) {
            int n7 = R$drawable.ic_qty_add;
            imageView2.setImageResource(n7);
        } else {
            int n8 = R$drawable.ic_qty_add_disable;
            imageView2.setImageResource(n8);
        }
    }

    public final void Qa(CancelReasonFragment$b cancelReasonFragment$b, CartEntry object) {
        float f5;
        Object object2 = ((CartEntry)object).getBasePrice();
        object2 = object2 != null ? ((Price)object2).getFormattedValue() : qz2_0.z();
        mz3_0.H((String)object2);
        object2 = ((CartEntry)object).getTotalPrice();
        if (object2 != null) {
            object2 = ((Price)object2).getValue();
            Float.parseFloat((String)object2);
        }
        double d2 = 0.0;
        object2 = d2;
        Object object3 = ((CartEntry)object).getTotalPrice();
        object3 = object3 != null ? ((Price)object3).getValue() : "0.0";
        float f6 = Float.parseFloat((String)object3);
        float f7 = ((CartEntry)object).getOrderTotalQuantity().intValue();
        f6 /= f7;
        f7 = 0.0f;
        Float f8 = Float.valueOf(0.0f);
        CharSequence charSequence = new StringBuilder();
        int n3 = this.h.getReturnEditedQuantity();
        float f11 = n3;
        charSequence.append(f6 *= f11);
        object3 = "";
        charSequence.append((String)object3);
        charSequence = charSequence.toString();
        Object object4 = this.h.getOrderTotalQuantity();
        if (object4 != null) {
            int n4;
            object4 = ((CartEntry)object).getBankDiscountPromoAmt();
            if (object4 != null) {
                double d5 = ((CartEntry)object).getBankDiscountPromoAmt();
                double d7 = this.h.getOrderTotalQuantity().intValue();
                d5 /= d7;
                object = this.h;
                n4 = ((CartEntry)object).getReturnEditedQuantity();
                d7 = n4;
                object2 = d5 *= d7;
            }
            object = this.h;
            object4 = cp_1.Companion;
            object4.getClass();
            n4 = cp$a.k((CartEntry)object);
            if (n4 != 0) {
                object = this.h.getConvenienceFee();
                if (object != null && (object = this.h.getConvenienceFee().getRVP()) != null && (object = this.h.getConvenienceFee().getRVP().isFeeCharged()) != null && (n4 = (int)(((Boolean)(object = Boolean.TRUE)).equals(object4 = this.h.getConvenienceFee().getRVP().isFeeCharged()) ? 1 : 0)) != 0) {
                    this.h.getConvenienceFee().getRVP().getNetAmount();
                    this.h.getOrderTotalQuantity().getClass();
                    object = this.h;
                    ((CartEntry)object).getReturnEditedQuantity();
                }
                if ((object = this.h.getConvenienceFee()) != null && (object = this.h.getConvenienceFee().getCOD()) != null && (n4 = (int)(((Boolean)(object = Boolean.TRUE)).equals(object4 = this.h.getConvenienceFee().getCOD().isFeeCharged()) ? 1 : 0)) != 0) {
                    this.h.getConvenienceFee().getCOD().getNetAmount();
                    this.h.getOrderTotalQuantity().getClass();
                    object = this.h;
                    ((CartEntry)object).getReturnEditedQuantity();
                }
                if ((object = this.h.getConvenienceFee()) != null && (object = this.h.getConvenienceFee().getDelivery()) != null && (n4 = (int)(((Boolean)(object = Boolean.TRUE)).equals(object4 = this.h.getConvenienceFee().getDelivery().isFeeCharged()) ? 1 : 0)) != 0) {
                    this.h.getConvenienceFee().getDelivery().getNetAmount();
                    this.h.getOrderTotalQuantity().getClass();
                    object = this.h;
                    ((CartEntry)object).getReturnEditedQuantity();
                }
                if ((n4 = (int)(h40_0.P1() ? 1 : 0)) != 0 && (object = this.h.getConvenienceFee()) != null && (object = this.h.getConvenienceFee().getPriorityDelivery()) != null && (n4 = (int)(((Boolean)(object = Boolean.TRUE)).equals(object4 = this.h.getConvenienceFee().getPriorityDelivery().isFeeCharged()) ? 1 : 0)) != 0) {
                    this.h.getConvenienceFee().getPriorityDelivery().getNetAmount();
                    this.h.getOrderTotalQuantity().getClass();
                    object = this.h;
                    ((CartEntry)object).getReturnEditedQuantity();
                }
            } else {
                object = this.h.getConvenienceFee();
                if (object != null && (object = this.h.getConvenienceFee().getTotal()) != null) {
                    this.h.getConvenienceFee().getTotal().getNetAmount();
                    this.h.getOrderTotalQuantity().getClass();
                    object = this.h;
                    ((CartEntry)object).getReturnEditedQuantity();
                }
            }
            if ((object = this.h.getConvenienceFee()) != null && (object = this.h.getConvenienceFee().getTotal()) != null) {
                object = this.h.getConvenienceFee().getTotal();
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                float f12 = this.h.getOrderTotalQuantity().intValue();
                f5 /= f12;
                int n7 = this.h.getReturnEditedQuantity();
                f12 = n7;
                f5 = f5 * f12 + 0.0f;
                f8 = Float.valueOf(f5);
            }
        }
        if (charSequence != null) {
            double d9 = Float.parseFloat((String)charSequence);
            double d12 = (Double)object2;
            d9 -= d12;
            cancelReasonFragment$b.g.setVisibility(0);
            f5 = f8.floatValue();
            double d13 = f5;
            d9 += d13;
            cancelReasonFragment$b = cancelReasonFragment$b.g;
            object = new StringBuilder();
            int n8 = R$string.total_refund_amount_detail;
            object2 = this.getString(n8);
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" ");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(d9);
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            object3 = cp_1.Companion;
            object3.getClass();
            object2 = cp$a.f((String)object2);
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            cancelReasonFragment$b.setText((CharSequence)object);
        }
    }

    public final String getAjioTitle() {
        return "Cancel Item";
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return "Cancel Item";
    }

    public final Boolean hasBackButton() {
        return null;
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.x.l;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        F62 f62 = new wk_2(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.x.n;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new xk_2(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.x.j;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new yk_2(this);
        ((LiveData)object).e(mu1_12, f62);
    }

    public final void onAttach(Context object) {
        super.onAttach((Context)object);
        Object[] objectArray = this.getActivity();
        this.k = objectArray;
        objectArray = (OnFragmentInteractionListener)objectArray;
        this.l = objectArray;
        boolean bl2 = object instanceof ps1_2;
        if (bl2) {
            objectArray = object;
            this.w = objectArray = (ps1_2)object;
        } else {
            objectArray = new Object[]{};
            yn3$a yn3$a = yn3_0.a;
            String string2 = "Must Implement ActivityFragmentListener";
            yn3$a.d(string2, objectArray);
        }
        bl2 = object instanceof fo3;
        if (bl2) {
            object = (fo3)object;
            this.m = object;
        }
        this.w.showTabLayout(false);
    }

    public final void onClick(View object) {
        int n3 = object.getId();
        int n4 = R$id.decrement_product_button;
        int n7 = 1;
        if (n3 == n4) {
            int n8;
            this.v = n8 = this.v - n7;
            Object object2 = this.s;
            object = String.valueOf(n8);
            object2.setText((CharSequence)object);
            n8 = this.v;
            if (n8 == n7) {
                object = this.r;
                object2 = this.t;
                CancelReasonFragment.Ra((ImageView)object, (ImageView)object2, false, n7 != 0);
            } else {
                object = this.r;
                object2 = this.t;
                CancelReasonFragment.Ra((ImageView)object, (ImageView)object2, n7 != 0, n7 != 0);
            }
            object = this.h;
            n3 = this.v;
            ((CartEntry)object).setReturnEditedQuantity(n3);
            object = CancelReasonFragment.Pa(this.C);
            object2 = this.h;
            this.Qa((CancelReasonFragment$b)object, (CartEntry)object2);
            object = a21.a;
            object2 = this.p;
            Cloneable cloneable = this.j;
            String string2 = this.h.getProduct().getCode();
            cloneable = (ArrayList)cloneable.get(string2);
            object.getClass();
            a21.j((AppCompatTextView)object2, (ArrayList)cloneable, false, false);
        } else {
            int n10 = object.getId();
            if (n10 == (n3 = R$id.increment_product_button)) {
                this.v = n10 = this.v + n7;
                Object object3 = this.s;
                object = String.valueOf(n10);
                object3.setText((CharSequence)object);
                n10 = this.v;
                n3 = this.u;
                if (n10 == n3) {
                    object = a21.a;
                    object3 = this.p;
                    Cloneable cloneable = this.j;
                    String string3 = this.h.getProduct().getCode();
                    cloneable = (ArrayList)cloneable.get(string3);
                    object.getClass();
                    a21.j((AppCompatTextView)object3, (ArrayList)cloneable, n7 != 0, false);
                    object = this.r;
                    object3 = this.t;
                    CancelReasonFragment.Ra((ImageView)object, (ImageView)object3, n7 != 0, false);
                } else {
                    object = this.r;
                    object3 = this.t;
                    CancelReasonFragment.Ra((ImageView)object, (ImageView)object3, n7 != 0, n7 != 0);
                }
                object = this.h;
                n3 = this.v;
                ((CartEntry)object).setReturnEditedQuantity(n3);
                object = CancelReasonFragment.Pa(this.C);
                object3 = this.h;
                this.Qa((CancelReasonFragment$b)object, (CartEntry)object3);
                object = this.h;
                n3 = this.v;
                ((CartEntry)object).setReturnEditedQuantity(n3);
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
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
        Object object5 = db2_1.class;
        String string5 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object5, string5);
        object3 = "<this>";
        object4 = ef0_0.a(object5, string5, string5, (String)object3);
        object5 = object4.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object5 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object5 = string7.concat((String)object5);
            this.x = object2 = (db2_1)((pD3)object2).a((yn1_2)object4, (String)object5);
            object2 = this.requireActivity();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object4 = object2.getViewModelStore();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object5 = object2.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = object2.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object5, string3);
            Intrinsics.checkNotNullParameter(object, string4);
            object2 = os1_2.class;
            object = rl3_0.b((rd3_0)object4, (E$b)object5, (Wd0)object, object2, string5);
            object2 = ef0_0.a(object2, string5, string5, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string7.concat((String)object3);
                this.D = object = (os1_2)((pD3)object).a((yn1_2)object2, (String)object3);
                object = ((os1_2)object).b.d();
                if (object != null) {
                    this.i = object = (CartOrder)this.D.b.d();
                    this.j = object = (HashMap)this.D.c.d();
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        int n3 = R$layout.cancel_reason_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this);
        this.y = object;
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.w.showTabLayout(true);
    }

    public final void onNavigationClick() {
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            fragmentActivity = this.getActivity();
            fragmentActivity.onBackPressed();
        }
    }

    public final void onResume() {
        super.onResume();
        AnalyticsManager.getInstance().getGtmEvents().pushOpenScreenEvent("Orders Cancellation Screen");
        Object object = AnalyticsManager.getInstance().getNewCustomEventsRevamp();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.z;
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = newEEcommerceEventsRevamp.getPrevScreenType();
        String string4 = "order cancellation screen";
        String string5 = "order management screen";
        ((NewCustomEventsRevamp)object).newPushCustomScreenView(string4, string5, string2, null, string3);
        boolean bl2 = this.q;
        if (bl2) {
            newEEcommerceEventsRevamp = new Handler();
            object = new CancelReasonFragment$2(this);
            long l2 = 500L;
            newEEcommerceEventsRevamp.postAtTime((Runnable)object, l2);
        }
    }

    public final void onStop() {
        super.onStop();
        AnalyticsManager.getInstance().getNewEEcommerceEventsRevamp().setPreviousScreenData("order cancellation screen", "order management screen");
    }

    public final void onViewCreated(View view, Bundle object) {
        Object object2;
        float f5;
        float f6;
        int n3;
        boolean bl2;
        Object object3;
        Object object4;
        int n4;
        Object object5;
        boolean bl3 = true;
        super.onViewCreated(view, (Bundle)object);
        object = this.m;
        if (object != null) {
            object.P0();
        }
        if ((object = this.getActivity()) != null) {
            object = (AppCompatActivity)this.getActivity();
            object5 = this.y.getToolbar();
            ((AppCompatActivity)object).setSupportActionBar((Toolbar)object5);
        }
        this.y.setNavigationClick();
        object = this.y.getToolbar();
        if (object != null) {
            object = this.y.getToolbar();
            object.invalidate();
        }
        object = this.y;
        int n7 = 8;
        ((CustomToolbarViewMerger)object).setSubTitleVisibility(n7);
        object = this.y.getToolbar();
        Object object6 = "Cancel Item";
        object.setContentDescription((CharSequence)object6);
        Object object7 = Looper.getMainLooper();
        object = new Handler((Looper)object7);
        object7 = new uk_2(this, 0);
        long l2 = 300L;
        object.postDelayed((Runnable)object7, l2);
        this.y.setTitleText((String)object6);
        this.w.showTabLayout(false);
        int bl4 = R$id.cancelreason_progress_bar;
        object = (AjioProgressView)view.findViewById(bl4);
        this.o = object;
        int n8 = R$id.freeBiesView;
        object = (AppCompatTextView)view.findViewById(n8);
        this.p = object;
        object = this.getArguments();
        if (object != null) {
            object6 = object.getString("cart_string");
            object7 = "order_no";
            this.g = object = object.getString((String)object7);
            this.h = object = (CartEntry)JsonUtils.fromJson((String)object6, CartEntry.class);
        }
        this.o.show();
        object = this.x;
        object.getClass();
        object6 = md3_0.c((jD3)object);
        boolean bl5 = false;
        Object object8 = null;
        object7 = new bb2_2((db2_1)object, null);
        Ae3.d((i90_0)object6, null, null, (Function2)object7, 3);
        int n10 = R$id.cancel_order;
        object = (Button)view.findViewById(n10);
        this.A = object;
        int n14 = R$id.cancel_box;
        object = (EditText)view.findViewById(n14);
        this.B = object;
        int n15 = R$id.cancel_reasons_drop_down;
        object = (Spinner)view.findViewById(n15);
        this.n = object;
        object = cp_1.Companion;
        boolean bl6 = km_1.b((cp$a)object);
        if (bl6) {
            object = this.A;
            object.setEnabled(bl3);
        } else {
            object = this.A;
            object.setEnabled(false);
        }
        object = this.n;
        object6 = new CancelReasonFragment$a(this);
        object.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object6);
        object = this.A;
        object6 = new vk_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object6);
        int n16 = R$id.product;
        object = view.findViewById(n16);
        this.C = object;
        object = CancelReasonFragment.Pa((View)object);
        object6 = this.h;
        if (object6 != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
            object6 = this.h.getProduct().getImages();
            if (object6 != null) {
                object6 = this.h.getProduct().getImages().iterator();
                while ((n4 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                    object4 = "cartIcon";
                    object7 = (ProductImage)object6.next();
                    object3 = ((ProductImage)object7).getFormat();
                    bl2 = ((String)object4).equalsIgnoreCase((String)object3);
                    if (!bl2 || !(bl2 = (object3 = "PRIMARY").equalsIgnoreCase((String)(object4 = ((ProductImage)object7).getImageType())))) continue;
                    object3 = new da$a();
                    object3.k = bl3;
                    object3.r = bl3;
                    n3 = R$string.acc_banner;
                    object4 = hv3_0.K(n3);
                    object3.b((String)object4);
                    object4 = UrlHelper.getInstance();
                    object7 = ((ProductImage)object7).getUrl();
                    object7 = ((UrlHelper)object4).getImageUrl((String)object7);
                    object4 = ((CancelReasonFragment$b)object).a;
                    object3.n = object7;
                    object3.u = object4;
                    object3.a();
                }
            }
        } else {
            object6 = ((CancelReasonFragment$b)object).a;
            n4 = R$drawable.item_dummy_noimg;
            object6.setImageResource(n4);
        }
        this.h.setReturnEditedQuantity((int)(bl3 ? 1 : 0));
        object6 = String.valueOf(this.h.getQuantity());
        int n17 = TextUtils.isEmpty(object6);
        if (n17 == 0) {
            object6 = this.h.getQuantity();
            n17 = (Integer)object6;
        } else {
            n17 = 1;
            f6 = Float.MIN_VALUE;
        }
        object7 = this.h.getTotalPrice();
        bl2 = false;
        float f7 = 0.0f;
        object3 = null;
        if (object7 != null) {
            object7 = ((Price)object7).getValue();
            f5 = Float.parseFloat((String)object7);
        } else {
            n4 = 0;
            f5 = 0.0f;
            object7 = null;
        }
        n3 = this.h.getOrderTotalQuantity();
        float f8 = n3;
        f5 /= f8;
        f6 = n17;
        f5 *= f6;
        object4 = this.h.getOrderTotalQuantity();
        if (object4 != null && (object4 = this.h.getConvenienceFee()) != null && (object4 = this.h.getConvenienceFee().getTotal()) != null) {
            object4 = this.h.getConvenienceFee().getTotal();
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object4).getNetAmount();
            object2 = this.h.getOrderTotalQuantity();
            int n18 = (Integer)object2;
            float f11 = n18;
            f8 = f8 / f11 * f6;
            f7 = 0.0f + f8;
        }
        object6 = ((CancelReasonFragment$b)object).b;
        object7 = Float.toString(f5 += f7);
        cp_1.Companion.getClass();
        object7 = cp$a.f((String)object7);
        object6.setText((CharSequence)object7);
        object6 = this.h;
        this.Qa((CancelReasonFragment$b)object, (CartEntry)object6);
        object6 = this.h.getProduct();
        object7 = String.valueOf(this.h.getQuantity());
        n4 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
        object3 = "";
        object7 = n4 == 0 ? String.valueOf(this.h.getQuantity()) : object3;
        object4 = ((Product)object6).getBrandName();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
        object4 = n3 == 0 ? ((Product)object6).getBrandName() : object3;
        object2 = ((CancelReasonFragment$b)object).c;
        object2.setText((CharSequence)object4);
        object4 = ((Product)object6).getName();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
        if (n3 == 0) {
            object3 = ((Product)object6).getName();
        }
        ((CancelReasonFragment$b)object).d.setText((CharSequence)object3);
        object4 = ((Product)object6).getCode();
        if (object4 != null && (object4 = this.j) != null && (n3 = (int)(((HashMap)object4).containsKey(object2 = ((Product)object6).getCode()) ? 1 : 0)) != 0) {
            object4 = a21.a;
            object2 = a21$a.CANCEL_INIT;
            ComposeView composeView = ((CancelReasonFragment$b)object).f;
            HashMap hashMap = this.j;
            object6 = ((Product)object6).getCode();
            object6 = (ArrayList)hashMap.get(object6);
            object4.getClass();
            a21.h((a21$a)((Object)object2), (View)composeView, (ArrayList)object6, null);
        }
        object6 = Y63.a(this.h);
        object8 = Y63.d(this.h);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
        object2 = "null";
        if (n3 != 0 && (n3 = (int)(((String)object2).equalsIgnoreCase((String)object8) ? 1 : 0)) != 0) {
            ((CancelReasonFragment$b)object).d.setText((CharSequence)object3);
            object6 = hv3_0.i(this.h);
            boolean bl7 = TextUtils.isEmpty((CharSequence)object6);
            if (!bl7) {
                int n19 = R$string.od_size_format;
                object3 = new Object[bl3];
                object3[0] = object6;
                object6 = hv3_0.L(n19, object3);
                object8 = "  ";
                object6 = nn_2.a((String)object6, (String)object8);
                int n20 = R$string.od_quantity_format;
                object3 = new Object[bl3];
                object3[0] = object7;
                object7 = hv3_0.L(n20, object3);
                ((StringBuilder)object6).append((String)object7);
                object6 = ((StringBuilder)object6).toString();
                object = ((CancelReasonFragment$b)object).e;
                object.setText((CharSequence)object6);
            } else {
                n17 = R$string.od_quantity_format;
                object8 = new Object[bl3];
                object8[0] = object7;
                object6 = hv3_0.L(n17, object8);
                object = ((CancelReasonFragment$b)object).e;
                object.setText((CharSequence)object6);
            }
        } else {
            boolean bl8 = ((String)object2).equalsIgnoreCase((String)object8);
            if (bl8) {
                object6 = ((CancelReasonFragment$b)object).d;
                object6.setText((CharSequence)object3);
            } else {
                object8 = ((CancelReasonFragment$b)object).d;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object3);
                object3 = " | ";
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object6);
                object6 = ((StringBuilder)object4).toString();
                object8.setText((CharSequence)object6);
            }
            n17 = R$string.od_quantity_format;
            object8 = new Object[bl3];
            object8[0] = object7;
            object6 = hv3_0.L(n17, object8);
            object = ((CancelReasonFragment$b)object).e;
            object.setText((CharSequence)object6);
        }
        object = this.h.getQuantity();
        boolean bl9 = ((Integer)object).intValue();
        if (bl9 == bl3) {
            object = this.p;
            object.setVisibility(n7);
            int n21 = R$id.layoutQuantity;
            view = view.findViewById(n21);
            view.setVisibility(n7);
        } else {
            int n22;
            int n24 = R$id.layoutQuantity;
            view.findViewById(n24).setVisibility(0);
            int n25 = R$id.decrement_product_button;
            object = (ImageView)view.findViewById(n25);
            this.r = object;
            object.setOnClickListener((View.OnClickListener)this);
            int n26 = R$id.tvNewQuantity;
            this.s = object = (AjioTextView)view.findViewById(n26);
            object5 = "1";
            object.setText((CharSequence)object5);
            int n27 = R$id.increment_product_button;
            view = (ImageView)view.findViewById(n27);
            this.t = view;
            view.setOnClickListener((View.OnClickListener)this);
            this.u = n22 = this.h.getQuantity().intValue();
            view = this.r;
            object = this.t;
            CancelReasonFragment.Ra((ImageView)view, (ImageView)object, false, bl3);
        }
        this.v = bl3;
    }
}

