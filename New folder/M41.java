/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.viewpager2.widget.ViewPager2;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.pdprefresh.holders.a;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class M41
extends RecyclerView$B
implements View.OnClickListener,
th2_1 {
    public final hh3_2 A;
    public h02_0 B;
    public m02 C;
    public final WrapperLinearLayoutManager D;
    public final int E;
    public int F;
    public l02_0 G;
    public final ao0_0 H;
    public final NewEEcommerceEventsRevamp I;
    public final NewCustomEventsRevamp J;
    public final String K;
    public int L;
    public final String M;
    public final String N;
    public boolean O;
    public final ImageView P;
    public final ImageView Q;
    public final TextView R;
    public boolean S;
    public int T;
    public int U;
    public D02 X;
    public final View a;
    public final sj2_0 b;
    public final yi2_1 c;
    public final zi2_1 d;
    public final ViewPager2 e;
    public final LinearLayout f;
    public final DynamicCirclePageIndicator g;
    public final RelativeLayout h;
    public final RecyclerView i;
    public final View j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final RelativeLayout m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final LinearLayout p;
    public final AjioTextView q;
    public final View r;
    public final AjioTextView s;
    public final AppCompatImageView t;
    public final TextView u;
    public final ImageView v;
    public final View w;
    public final View x;
    public final AjioTextView y;
    public final AppCompatImageView z;

    public M41(View object, sj2_0 object2, yi2_1 yi2_12, zi2_1 object3) {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpuiDelegateListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object3, "pdpInfoSetter");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = yi2_12;
        this.d = object3;
        object2 = new Object();
        this.A = object2 = yr1_2.b((Function0)object2);
        int n3 = -1;
        float f5 = 0.0f / 0.0f;
        this.F = n3;
        object3 = z40_0.Companion;
        this.H = object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
        object3 = AnalyticsManager.Companion;
        this.I = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        this.J = object3 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.K = object3 = newEEcommerceEventsRevamp.getPrevScreenType();
        this.M = "ic_product_quality_icon";
        this.N = object3 = "ic_heart_icon";
        int n4 = 1;
        this.S = n4;
        this.T = n3;
        object2 = "itemView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.j = object;
        if (object != null) {
            object.getContext();
        }
        n3 = R$id.rr_main_view;
        object2 = (RelativeLayout)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.pdp_top_image_rv;
        this.i = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.luxe_oos_view;
        object2 = (LinearLayout)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.pdp_Sale_tv;
        this.s = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.pdp_header_sale_img;
        object2 = (AppCompatImageView)object.findViewById(n3);
        this.t = object2;
        n3 = R$id.pdp_Sale_tv_luxe;
        object2 = (AjioTextView)object.findViewById(n3);
        this.y = object2;
        n3 = R$id.pdp_header_sale_img_luxe;
        object2 = (AppCompatImageView)object.findViewById(n3);
        this.z = object2;
        n3 = R$id.pdp_sale_layout;
        object2 = object.findViewById(n3);
        this.r = object2;
        newEEcommerceEventsRevamp = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpSaleLayout");
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.pdp_sale_layout_luxe;
        object2 = object.findViewById(n3);
        this.x = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpSaleLayoutLuxe");
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        View view = this.j;
        if (view != null) {
            newEEcommerceEventsRevamp = view.getContext();
        }
        view = null;
        object2 = new WrapperLinearLayoutManager((Context)newEEcommerceEventsRevamp, 0);
        this.D = object2;
        n3 = R$id.row_pdp_viewpager;
        object2 = (ViewPager2)object.findViewById(n3);
        this.e = object2;
        if (object2 != null) {
            ((ViewPager2)((Object)object2)).setOffscreenPageLimit(n4);
        }
        n3 = R$id.view_pager_indicator;
        object2 = (DynamicCirclePageIndicator)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.row_pdp_tv_size;
        object2 = (LinearLayout)object.findViewById(n3);
        this.k = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        n3 = R$id.row_pdp_tv_size_chart;
        object2 = (LinearLayout)object.findViewById(n3);
        this.l = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        n3 = R$id.row_pdp_tv_gradient;
        object2 = (ImageView)object.findViewById(n3);
        n3 = R$id.row_pdp_tv_uep;
        object2 = (TextView)object.findViewById(n3);
        this.u = object2;
        n3 = R$id.ic_tag_image;
        object2 = (ImageView)object.findViewById(n3);
        this.v = object2;
        n3 = R$id.row_pdp_layout_uep;
        object2 = object.findViewById(n3);
        this.w = object2;
        n3 = R$id.row_pdp_tv_exclusive;
        object2 = (AjioTextView)object.findViewById(n3);
        this.q = object2;
        n3 = R$id.similar_to_holder;
        object2 = (LinearLayout)object.findViewById(n3);
        this.n = object2;
        n3 = R$id.watch_video_to_holder;
        object2 = (LinearLayout)object.findViewById(n3);
        this.o = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        n3 = R$id.similar_to_holder_anim;
        object2 = (RelativeLayout)object.findViewById(n3);
        this.m = object2;
        n3 = R$id.style_to_holder;
        object2 = (LinearLayout)object.findViewById(n3);
        this.p = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        n3 = R$id.iv_similar_collapsed_view;
        object2 = (ImageView)object.findViewById(n3);
        this.P = object2;
        n3 = R$id.iv_similar_expand_view;
        object2 = (ImageView)object.findViewById(n3);
        this.Q = object2;
        n3 = R$id.tv_similar_text_view;
        object = (TextView)object.findViewById(n3);
        this.R = object;
        int n7 = el3.b((Context)AJIOApplication$a.a());
        object2 = hv3_0.a;
        n3 = 1067531750;
        float f6 = n7;
        f5 = 1.2597015f * f6;
        this.E = n7 = (int)f5;
        object = this.i;
        if (object != null) {
            n4 = hv3_0.q(R$dimen.margin_8);
            object2 = new M41$a(n4);
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
        }
        if ((n7 = (int)(Intrinsics.areEqual(object = yi2_12.o5(), object2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) != 0 && (object = yi2_12.N6()) != null && (object = ((PostsResponse)object).getComponents()) != null && (n7 = (int)((object = (Collection)object).isEmpty() ? 1 : 0)) == 0 && (object = this.p) != null) {
            ai0_2.B((View)object);
        }
    }

    public final void A(boolean bl2) {
        if (bl2) {
            LinearLayout linearLayout = this.o;
            if (linearLayout != null) {
                boolean bl3 = false;
                linearLayout.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout = this.o;
            if (linearLayout != null) {
                int n3 = 8;
                linearLayout.setVisibility(n3);
            }
        }
    }

    public final void onClick(View view) {
        M41 m41 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.row_pdp_tv_size;
        Object object3 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment";
        Object object4 = "product_brand";
        Object object5 = "product_name";
        Object object6 = "product_id";
        Object object7 = this.J;
        Object object8 = this.I;
        String string2 = null;
        Object object9 = this.c;
        if (n3 == n4) {
            AnalyticsData analyticsData;
            object9.o1();
            object = new Bundle();
            object2 = object9;
            object2 = (NewProductDetailsFragment)object9;
            String string3 = ((NewProductDetailsFragment)object2).l6();
            object.putString((String)object6, string3);
            object6 = ((NewProductDetailsFragment)object2).cb().q;
            object6 = object6 != null ? ((Product)object6).getName() : null;
            object.putString((String)object5, (String)object6);
            object5 = ((NewProductDetailsFragment)object2).cb().q;
            if (object5 != null) {
                string2 = ((Product)object5).getBrandName();
            }
            object.putString((String)object4, string2);
            object4 = ((NewCustomEventsRevamp)object7).getPRODUCT_SIZE();
            object5 = ((NewProductDetailsFragment)object2).cb().Q;
            object.putString((String)object4, (String)object5);
            Object object10 = analyticsData;
            long l2 = 0L;
            int n7 = 65023;
            analyticsData = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)object, null, null, null, null, null, null, n7, null);
            GTMEvents.pushButtonTapEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "size guide", "size widget", "pdp screen", analyticsData, null, 16, null);
            object = ((NewCustomEventsRevamp)object7).getEC_PRODUCT_DETAILS_INTERACTIONS();
            String string4 = ((NewEEcommerceEventsRevamp)object8).getPrevScreen();
            object10 = ((NewEEcommerceEventsRevamp)object8).getPrevScreenType();
            int n8 = 1536;
            object8 = object;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object, "image button click", "size guide click", "pdp_image_button_click", "pdp screen", "pdp screen", string4, null, (String)object10, false, null, n8, null);
            object = GAUtils.Companion;
            object4 = ((NewProductDetailsFragment)object2).cb().q;
            analyticsData = ((GAUtils$Companion)object).getPDPBundleData((Product)object4);
            string4 = m41.K;
            object9 = null;
            boolean bl2 = false;
            object10 = null;
            object5 = m41.J;
            object6 = "product details interactions";
            object7 = "floating_icon_clicks";
            object8 = "size";
            string2 = "product_details_interactions";
            string3 = "pdp screen";
            String string5 = "pdp screen";
            Object var25_44 = null;
            int n10 = 1600;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, (String)object7, (String)object8, string2, string3, string5, null, (Bundle)analyticsData, string4, false, null, n10, null);
            Intrinsics.checkNotNull(object2, (String)object3);
            ((NewProductDetailsFragment)object2).a7();
        } else {
            n4 = R$id.row_pdp_tv_size_chart;
            if (n3 == n4) {
                object9.o1();
                object = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                object4 = object9;
                object4 = (NewProductDetailsFragment)object9;
                object5 = ((NewProductDetailsFragment)object4).cb().q;
                if (object5 != null) {
                    string2 = ((Product)object5).getCode();
                }
                object5 = m41.A.getValue();
                Intrinsics.checkNotNullExpressionValue(object5, "getValue(...)");
                object5 = ((UserInformation)object5).getCustomerUUID();
                object5 = UX.c("Pdp_view_full_size_chart_button_clicked_in_image_area_", string2, "_", (String)object5);
                object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                object6 = "PDP \u2013 View full size chart button clicked in image area";
                ((GTMEvents)object2).pushButtonTapEvent((String)object6, object5, (String)object);
                object = ((NewCustomEventsRevamp)object7).getEC_PRODUCT_DETAILS_INTERACTIONS();
                String string6 = ((NewEEcommerceEventsRevamp)object8).getPrevScreen();
                String string7 = ((NewEEcommerceEventsRevamp)object8).getPrevScreenType();
                boolean bl3 = false;
                string2 = "image button click";
                String string8 = "size guide click";
                String string9 = "pdp_image_button_click";
                String string10 = "pdp screen";
                String string11 = "pdp screen";
                object9 = null;
                int n14 = 1536;
                object8 = object;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object, string2, string8, string9, string10, string11, string6, null, string7, false, null, n14, null);
                Intrinsics.checkNotNull(object4, (String)object3);
                ((NewProductDetailsFragment)object4).a7();
            } else {
                n4 = R$id.pdp_sale_layout;
                if (n3 != n4 && n3 != (n4 = R$id.pdp_sale_layout_luxe)) {
                    n4 = R$id.style_to_holder;
                    if (n3 == n4) {
                        object = new Bundle();
                        if (object9 != null && (object2 = object9.x5()) != null) {
                            object2 = ((Product)object2).getCode();
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        object.putString((String)object6, (String)object2);
                        if (object9 != null && (object2 = object9.x5()) != null) {
                            object2 = ((Product)object2).getName();
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        object.putString((String)object5, (String)object2);
                        if (object9 != null && (object2 = object9.x5()) != null) {
                            object2 = ((Product)object2).getBrandName();
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        object.putString((String)object4, (String)object2);
                        if (object9 != null && (object2 = object9.x5()) != null) {
                            string2 = ((Product)object2).getBrickCategory();
                        }
                        object2 = "product_brick";
                        object.putString((String)object2, string2);
                        if (object7 != null) {
                            object8 = ((NewCustomEventsRevamp)object7).getEC_PRODUCT_DETAILS_INTERACTIONS();
                            string2 = ((NewCustomEventsRevamp)object7).getSV_EP_PDP_STYLES_CLICKED();
                            object2 = AnalyticsManager.Companion;
                            String string12 = bv_0.a((AnalyticsManager$Companion)object2);
                            String string13 = cv_0.a((AnalyticsManager$Companion)object2);
                            boolean bl4 = false;
                            String string14 = "";
                            String string15 = "product_details_interactions";
                            String string16 = "pdp screen";
                            String string17 = "pdp screen";
                            int n15 = 1536;
                            object9 = object;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object8, string2, string14, string15, string16, string17, string12, (Bundle)object, string13, false, null, n15, null);
                        }
                        object = m41.b;
                        object.O7();
                    } else {
                        n4 = R$id.similar_to_holder;
                        if (n3 != n4 && n3 != (n4 = R$id.similar_to_holder_anim)) {
                            n4 = R$id.watch_video_to_holder;
                            if (n3 == n4) {
                                n3 = this.T;
                                n4 = 0;
                                object2 = null;
                                if (n3 >= 0) {
                                    int n16;
                                    object3 = this.G;
                                    if (object3 != null) {
                                        n16 = ((l02_0)object3).getItemCount();
                                    } else {
                                        n16 = 0;
                                        object3 = null;
                                    }
                                    if (n3 < n16 && (object3 = m41.i) != null) {
                                        ((RecyclerView)object3).smoothScrollToPosition(n3);
                                    }
                                }
                                n3 = m41.T;
                                object3 = m41.e;
                                if (object3 != null) {
                                    boolean bl5 = true;
                                    ((ViewPager2)((Object)object3)).setCurrentItem(n3, bl5);
                                }
                                m41.U = n3;
                                m41.A(false);
                            }
                        } else {
                            object = ((NewCustomEventsRevamp)object7).getEC_PRODUCT_DETAILS_INTERACTIONS();
                            String string18 = ((NewEEcommerceEventsRevamp)object8).getPrevScreen();
                            String string19 = ((NewEEcommerceEventsRevamp)object8).getPrevScreenType();
                            n4 = 0;
                            int n17 = 1536;
                            object8 = object;
                            object = object9;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object8, "image button click", "similar widget click", "pdp_image_button_click", "pdp screen", "pdp screen", string18, null, string19, false, null, n17, null);
                            object2 = GAUtils.Companion;
                            object3 = object9.x5();
                            Bundle bundle = ((GAUtils$Companion)object2).getPDPBundleData((Product)object3);
                            String string20 = m41.K;
                            string18 = null;
                            object9 = null;
                            object4 = m41.J;
                            object5 = "product details interactions";
                            object6 = "floating_icon_clicks";
                            object7 = "similarTo";
                            object8 = "product_details_interactions";
                            string2 = "pdp screen";
                            String string21 = "pdp screen";
                            Object var24_42 = null;
                            int n18 = 1600;
                            boolean bl6 = false;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, (String)object6, (String)object7, (String)object8, string2, string21, null, bundle, string20, false, null, n18, null);
                            object = object.Aa();
                            ((NewProductDetailsFragment)object).Vb();
                        }
                    }
                } else {
                    object = object9;
                    object2 = AnalyticsManager.Companion.getInstance();
                    object3 = ((AnalyticsManager)object2).getGtmEvents();
                    object8 = "pdp screen";
                    string2 = null;
                    object4 = "pdp widget";
                    object5 = "pdp_widget_interaction";
                    object6 = "price reveal widget";
                    object7 = "banner click";
                    int n19 = 32;
                    Object var24_43 = null;
                    GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, null, n19, null);
                    object = object9.Aa();
                    ((NewProductDetailsFragment)object).Ab();
                }
            }
        }
    }

    public final void w(int n3) {
        boolean bl2;
        Object object;
        Object object2 = this.B;
        if (object2 != null) {
            object2 = ((h02_0)object2).o;
            object = n3;
            object2 = (Fragment)((LinkedHashMap)object2).get(object);
        } else {
            object2 = null;
        }
        object = this.X;
        if (object != null) {
            ((D02)object).Oa();
        }
        if ((object = this.X) != null) {
            bl2 = true;
            this.A(bl2);
        }
        if ((bl2 = object2 instanceof D02) && (bl2 = ((Fragment)(object2 = (D02)object2)).isAdded())) {
            ((D02)object2).Pa();
            this.X = object2;
            object2 = null;
            this.A(false);
            this.U = n3;
        } else {
            this.X = null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x() {
        block5: {
            block6: {
                block4: {
                    var1_1 = this.q;
                    var2_2 = this.c;
                    var3_3 = var2_2.h0();
                    if (var3_3 != null || (var4_4 = (var3_3 = (Boolean)var2_2.B1().a).booleanValue())) break block4;
                    if (var1_1 != null) {
                        var5_5 = 8;
                        var1_1.setVisibility(var5_5);
                    }
                    break block5;
                }
                var4_4 = false;
                var3_3 = null;
                var6_7 /* !! */  = var1_1 != null ? var1_1.getParent() : null;
                var7_8 = "null cannot be cast to non-null type android.view.View";
                Intrinsics.checkNotNull(var6_7 /* !! */ , var7_8);
                var6_7 /* !! */  = (View)var6_7 /* !! */ ;
                var6_7 /* !! */ .setBackground(null);
                if (var1_1 == null) break block6;
                var3_3 = h40_0.a;
                var4_4 = h40_0.W0();
                if (!var4_4) ** GOTO lbl-1000
                var3_3 = hv3_0.a;
                var6_7 /* !! */  = var2_2.x5();
                var3_3.getClass();
                var4_4 = hv3_0.V((Product)var6_7 /* !! */ );
                if (var4_4) {
                    var2_2 = var2_2.h0();
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = (var4_4 = (var3_3 = (Boolean)var2_2.B1().a).booleanValue()) != false ? (String)var2_2.B1().b : var2_2.h0();
                }
                var1_1.setText((CharSequence)var2_2);
            }
            if (var1_1 != null) {
                var5_6 = false;
                var2_2 = null;
                var1_1.setVisibility(0);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void y(SpotLight var1_1, ArrayList var2_2) {
        block94: {
            block92: {
                block93: {
                    var3_3 = this;
                    var4_4 = var2_2;
                    var5_5 = 1;
                    var6_6 = this.e;
                    var7_7 = this.m;
                    var8_8 = this.t;
                    var9_9 = this.r;
                    var10_10 = this.i;
                    var11_11 = this.k;
                    var12_12 = this.n;
                    var13_13 = this.R;
                    var14_14 = 0;
                    var15_15 = null;
                    if (var2_2 == null) {
                        if (var6_6 != null) {
                            var6_6.setAdapter(null);
                        }
                        var3_3.B = null;
                        return;
                    }
                    var16_16 = tr2_2.a;
                    var17_17 = this.c;
                    var18_18 = var17_17.c9();
                    var19_19 = 0;
                    var20_20 = null;
                    if (var18_18 == 0 && (var18_18 = tr2_2.m()) == 0) {
                        var18_18 = 0;
                        var16_16 = null;
                    } else {
                        var18_18 = 1;
                    }
                    var18_18 = tr2_2.t((boolean)var18_18);
                    var21_21 = "pdpSaleLayout";
                    if (var18_18 != 0 && (var18_18 = var17_17.S5()) != 0) {
                        var18_18 = tr2_2.m();
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                            var14_14 = 0;
                            var15_15 = null;
                        } else {
                            var15_15 = var9_9;
                        }
                        var15_15.setVisibility(0);
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                            var22_22 = 0;
                            var9_9 = null;
                        }
                        var9_9 = var9_9.getBackground();
                        var14_14 = tr2_2.m();
                        var15_15 = var14_14 != 0 ? tr2_2.a() : tr2_2.d().i;
                        var21_21 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable";
                        Intrinsics.checkNotNull(var9_9, (String)var21_21);
                        var9_9 = (GradientDrawable)var9_9;
                        var14_14 = Color.parseColor((String)var15_15);
                        var9_9.setColor(var14_14);
                        var9_9 = var3_3.s;
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pdpSaleTv");
                            var22_22 = 0;
                            var9_9 = null;
                        }
                        if (var18_18 != 0) {
                            var15_15 = tr2_2.b();
                            if (var15_15 != null) {
                                var15_15 = var15_15.getSalePdpHeaderTag();
                            } else {
                                var14_14 = 0;
                                var15_15 = null;
                            }
                            var15_15 = String.valueOf(var15_15);
                        } else {
                            var15_15 = tr2_2.d().o;
                        }
                        var9_9.setText((CharSequence)var15_15);
                        var9_9 = var18_18 != 0 ? tr2_2.c() : tr2_2.d().q;
                        var16_16 = "pdpSaleImage";
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                            var14_14 = 0;
                            var15_15 = null;
                        } else {
                            var15_15 = var8_8;
                        }
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                            var23_23 = 0;
                            var21_21 = null;
                        } else {
                            var21_21 = var8_8;
                        }
                        var21_21 = var21_21.getContext();
                        var19_19 = R$string.acc_pdp_sales_banner;
                        var20_20 = var21_21.getString(var19_19);
                        var15_15.setContentDescription((CharSequence)var20_20);
                        var15_15 = new da$a();
                        var15_15.k = var5_5;
                        var15_15.b = var19_19 = R$drawable.ic_sale_default;
                        var15_15.c = var19_19;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                            var24_24 = 0;
                            var8_8 = null;
                        }
                        var15_15.n = var9_9;
                        var15_15.u = var8_8;
                        var15_15.a();
                    } else {
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var21_21);
                            var24_24 = 8;
                            var22_22 = 0;
                            var9_9 = null;
                        } else {
                            var24_24 = 8;
                        }
                        var9_9.setVisibility(var24_24);
                    }
                    this.z();
                    var8_8 = var17_17.A5();
                    var9_9 = var3_3.J;
                    var16_16 = "product_id";
                    var15_15 = var3_3.I;
                    if (var8_8 == null || (var24_24 = var8_8.isEmpty() ^ var5_5) != var5_5 || (var24_24 = (int)var17_17.a9()) == 0) break block92;
                    var24_24 = (int)var3_3.S;
                    if (var24_24 == 0) break block93;
                    var24_24 = 0;
                    var3_3.S = false;
                    var8_8 = h40_0.a;
                    var8_8 = z40_0.Companion;
                    var8_8 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8).a;
                    var20_20 = "pdp_to_bag_conversation_json";
                    var25_25 = (var8_8 = var8_8.d((String)var20_20)).has((String)(var21_21 = "pdp_similar_animation"));
                    if (var25_25) {
                        var24_24 = (int)var8_8.getBoolean((String)var21_21);
                    } else {
                        var24_24 = 0;
                        var8_8 = null;
                    }
                    if (var24_24 == 0) ** GOTO lbl-1000
                    var8_8 = tj2_2.Companion;
                    var8_8.getClass();
                    var24_24 = (int)tj2_2.c;
                    if (var24_24 != 0) {
                        var8_8 = var3_3.P;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivSimilarCollapsedView");
                            var24_24 = 0;
                            var8_8 = null;
                        }
                        var23_23 = 8;
                        var8_8.setVisibility(var23_23);
                        var8_8 = var3_3.Q;
                        if (var8_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivSimilarExpandView");
                            var24_24 = 0;
                            var8_8 = null;
                        }
                        var23_23 = 0;
                        var21_21 = null;
                        var8_8.setVisibility(0);
                        var8_8 = "tvSimilarTextView";
                        if (var13_13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var23_23 = 0;
                            var21_21 = null;
                        } else {
                            var21_21 = var13_13;
                        }
                        var26_26 = AJIOApplication$a.a();
                        var27_27 = z40$a.a((Context)var26_26).a.d((String)var20_20);
                        var20_20 = "pdp_animation_text";
                        var25_25 = var27_27.has((String)var20_20);
                        if (var25_25 && (var25_25 = var27_27.has((String)var20_20))) {
                            var27_27 = var27_27.getString((String)var20_20);
                            var20_20 = "getString(...)";
                            Intrinsics.checkNotNullExpressionValue(var27_27, (String)var20_20);
                        } else {
                            var5_5 = R$string.see_similar_products_text;
                            var27_27 = hv3_0.K(var5_5);
                        }
                        var21_21.setText((CharSequence)var27_27);
                        if (var13_13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var5_5 = 0;
                            var27_27 = null;
                            var19_19 = 0;
                            var20_20 = null;
                        } else {
                            var20_20 = var13_13;
                            var5_5 = 0;
                            var27_27 = null;
                        }
                        var20_20.measure(0, 0);
                        if (var13_13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var5_5 = 0;
                            var27_27 = null;
                        } else {
                            var27_27 = var13_13;
                        }
                        var5_5 = var27_27.getMeasuredWidth() + 50;
                        if (var5_5 <= 0) {
                            var5_5 = 280;
                        }
                        if (var13_13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var28_28 = 0;
                            var13_13 = null;
                        }
                        var27_27 = new int[]{var5_5};
                        var8_8 = ObjectAnimator.ofInt((Object)var13_13, (String)"width", (int[])var27_27);
                        var8_8.start();
                        Intrinsics.checkNotNull(var8_8);
                        var13_13 = new a(var3_3);
                        var8_8.addListener((Animator.AnimatorListener)var13_13);
                        var24_24 = 0;
                        var8_8 = null;
                        tj2_2.c = false;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var24_24 = 0;
                        var8_8 = null;
                        if (var12_12 != null) {
                            var12_12.setVisibility(0);
                        }
                    }
                }
                var8_8 = new Bundle();
                var13_13 = var17_17.l6();
                var8_8.putString((String)var16_16, (String)var13_13);
                var29_29 = var9_9.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var30_30 = var15_15.getPrevScreen();
                var31_31 = var15_15.getPrevScreenType();
                var32_32 = 0;
                var26_26 = var9_9;
                var33_33 = var8_8;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var9_9, (String)var29_29, "similar widget view", "", "similar_widget_interaction", "pdp screen", "pdp screen", var30_30, (Bundle)var8_8, (String)var31_31, false, null, 1536, null);
                var8_8 = GAUtils.Companion;
                var13_13 = var17_17.x5();
                var33_33 = var8_8.getPDPBundleData((Product)var13_13);
                var8_8 = var3_3.K;
                var13_13 = var3_3.J;
                var29_29 = "product details interactions";
                var34_34 = "floating_icon_impression";
                var35_35 = "similarTo";
                var36_36 = "product_details_interactions";
                var37_37 = "pdp screen";
                var38_38 = "pdp screen";
                var30_30 = null;
                var39_39 = 1600;
                var26_26 = var13_13;
                var31_31 = var8_8;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var13_13, (String)var29_29, var34_34, var35_35, var36_36, var37_37, var38_38, null, (Bundle)var33_33, (String)var8_8, false, null, var39_39, null);
                if (var7_7 != null) {
                    var7_7.setOnClickListener((View.OnClickListener)var3_3);
                }
                if (var12_12 != null) {
                    var12_12.setOnClickListener((View.OnClickListener)var3_3);
                }
                var8_8 = cp_1.Companion;
                var8_8.getClass();
                cp$a.h();
                var24_24 = (int)cp$a.h();
                if (var24_24 == 0 && (var24_24 = (int)var17_17.d0()) != 0) {
                    var26_26 = var17_17.q();
                    var8_8 = var3_3.n;
                    var40_40 = R$color.color_2c4152;
                    var41_41 = R$string.similar_to_product;
                    var42_42 = R$string.pdp_revamp_coachmark_similarto_desc;
                    var13_13 = FontsManager.getInstance();
                    AJIOApplication.Companion.getClass();
                    var27_27 = AJIOApplication$a.a();
                    var38_38 = var13_13.getTypefaceWithFont((Context)var27_27, 10);
                    var13_13 = FontsManager.getInstance();
                    var27_27 = AJIOApplication$a.a();
                    var19_19 = 9;
                    var30_30 = var13_13.getTypefaceWithFont((Context)var27_27, var19_19);
                    var13_13 = new R41(var3_3);
                    var43_43 = 30;
                    var29_29 = var8_8;
                    var33_33 = var13_13;
                    iw_2.a((FragmentActivity)var26_26, (View)var8_8, var40_40, var41_41, var42_42, var43_43, (Typeface)var38_38, (Typeface)var30_30, (TapTargetView$Listener)var13_13);
                }
                break block94;
            }
            var24_24 = 8;
            if (var7_7 != null) {
                var7_7.setVisibility(var24_24);
            }
            if (var12_12 != null) {
                var12_12.setVisibility(var24_24);
            }
        }
        if ((var8_8 = var17_17.E2()) != null && (var24_24 = var8_8.size()) == 0) {
            var24_24 = 1;
        } else {
            var24_24 = 0;
            var8_8 = null;
        }
        if (var24_24 == 0) {
            var8_8 = var17_17.E2();
            var28_28 = -1;
            if (var8_8 != null) {
                block91: {
                    var8_8 = var8_8.iterator();
                    var5_5 = 0;
                    var27_27 = null;
                    while ((var19_19 = var8_8.hasNext()) != 0) {
                        var20_20 = ((ProductImage)var8_8.next()).getFlagForImageAndVideo();
                        var19_19 = Intrinsics.areEqual(var20_20, var21_21 = Boolean.TRUE);
                        if (var19_19 != 0) {
                            var19_19 = 1;
                            break block91;
                        }
                        var19_19 = 1;
                        var5_5 += var19_19;
                    }
                    var19_19 = 1;
                    var5_5 = -1;
                }
                var8_8 = var5_5;
            } else {
                var19_19 = 1;
                var24_24 = 0;
                var8_8 = null;
            }
            if (var8_8 != null && (var5_5 = var8_8.intValue()) != var28_28) {
                var3_3.T = var24_24 = var8_8.intValue();
                var3_3.A((boolean)var19_19);
            } else {
                var24_24 = 0;
                var8_8 = null;
                var3_3.A(false);
            }
        }
        if (var11_11 != null) {
            var11_11.setOnClickListener((View.OnClickListener)var3_3);
        }
        if ((var8_8 = var3_3.l) != null) {
            var8_8.setOnClickListener((View.OnClickListener)var3_3);
        }
        var8_8 = var3_3.b;
        var8_8.C0();
        var28_28 = (int)var8_8.l8();
        if (var28_28 != 0) {
            var13_13 = new Bundle();
            var27_27 = var17_17.x5();
            var20_20 = "";
            if (var27_27 == null || (var21_21 = var27_27.getCode()) == null) {
                var21_21 = var20_20;
            }
            var13_13.putString((String)var16_16, (String)var21_21);
            if (var27_27 == null || (var16_16 = var27_27.getBrandName()) == null) {
                var16_16 = var20_20;
            }
            var21_21 = "product_brand";
            var13_13.putString((String)var21_21, (String)var16_16);
            if (var27_27 == null || (var16_16 = var27_27.getName()) == null) {
                var16_16 = var20_20;
            }
            var21_21 = "product_name";
            var13_13.putString((String)var21_21, (String)var16_16);
            if (var27_27 != null && (var16_16 = var27_27.getSelectedSize()) != null) {
                var20_20 = var16_16;
            }
            var16_16 = "product_size";
            var13_13.putString((String)var16_16, (String)var20_20);
            var5_5 = 0;
            var27_27 = null;
            if (var11_11 != null) {
                var11_11.setVisibility(0);
            }
            var29_29 = var9_9.getEC_PRODUCT_DETAILS_INTERACTIONS();
            var30_30 = var15_15.getPrevScreen();
            var31_31 = var15_15.getPrevScreenType();
            var26_26 = var9_9;
            var33_33 = var13_13;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var9_9, (String)var29_29, "size widget view", "", "event_size_guide_interactions", "pdp screen", "pdp screen", var30_30, (Bundle)var13_13, (String)var31_31, false, null, 1536, null);
            var9_9 = GAUtils.Companion;
            var13_13 = var17_17.x5();
            var30_30 = var9_9.getPDPBundleData((Product)var13_13);
            var9_9 = var3_3.K;
            var31_31 = null;
            var13_13 = var3_3.J;
            var26_26 = "product details interactions";
            var29_29 = "floating_icon_impression";
            var34_34 = "size";
            var35_35 = "product_details_interactions";
            var36_36 = "pdp screen";
            var37_37 = "pdp screen";
            var38_38 = null;
            var32_32 = 1600;
            var39_39 = 0;
            var33_33 = var9_9;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var13_13, (String)var26_26, (String)var29_29, var34_34, var35_35, var36_36, var37_37, null, (Bundle)var30_30, (String)var9_9, false, null, var32_32, null);
        } else {
            var5_5 = 0;
            var27_27 = null;
            if (var11_11 != null) {
                var22_22 = 8;
                var11_11.setVisibility(var22_22);
            }
        }
        var9_9 = z40_0.Companion;
        var9_9 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var9_9).a.b("pdp_size_chart_imageinteraction_bricks");
        var13_13 = "pdp_size_chart_position";
        var16_16 = var3_3.H;
        var28_28 = var16_16.g((String)var13_13);
        var15_15 = "pdp_image_size_chart_enable";
        var14_14 = (int)var16_16.a((String)var15_15);
        if (var14_14 == 0 && ((var18_18 = var16_16.a((String)(var15_15 = "pdp_size_chart_visiblity_enable"))) == 0 || (var22_22 = (int)r32.a((Product)(var16_16 = var17_17.x5()), (String)var9_9)) == 0)) {
            var22_22 = 0;
            var9_9 = null;
        } else {
            var22_22 = 1;
        }
        if (var22_22 == 0 || var28_28 < 0) ** GOTO lbl404
        var9_9 = var17_17.q3();
        if (var9_9 != null) {
            var22_22 = var9_9.size();
lbl381:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var22_22 = 0;
        var9_9 = null;
        ** while (true)
        var18_18 = 1;
        if (var22_22 <= var18_18 || (var24_24 = (int)var8_8.l8()) == 0) ** GOTO lbl404
        var8_8 = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(var8_8, "context");
        var8_8 = vV1.d((ContextWrapper)var8_8);
        var9_9 = "WIFI";
        var22_22 = (int)var8_8.equalsIgnoreCase((String)var9_9);
        var18_18 = 1001;
        var24_24 = var22_22 == 0 && (var24_24 = (int)var8_8.equalsIgnoreCase((String)(var9_9 = "4G"))) == 0 ? 1002 : 1001;
        if (var24_24 != var18_18) ** GOTO lbl404
        var24_24 = var2_2.size();
        if (var28_28 > var24_24) {
            var22_22 = var24_24 = var2_2.size();
lbl399:
            // 2 sources

            while (true) {
                var18_18 = 1;
                break;
            }
        } else {
            var22_22 = var28_28;
            ** continue;
lbl404:
            // 3 sources

            var22_22 = var28_28;
            var18_18 = 0;
            var16_16 = null;
        }
        this.x();
        if (var6_6 != null) {
            var24_24 = 8;
            var6_6.setVisibility(var24_24);
        }
        if ((var6_6 = var3_3.G) == null) {
            var13_13 = var3_3.c;
            var6_6 = var15_15;
            var8_8 = var1_1;
            var4_4 = var2_2;
            var3_3.G = var15_15 = new l02_0(var1_1, var2_2, var22_22, (yi2_1)var13_13, (boolean)var18_18);
            if (var10_10 != null) {
                var6_6 = var3_3.D;
                if (var6_6 == null) {
                    var6_6 = "layoutManager";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var14_14 = 0;
                    var15_15 = null;
                } else {
                    var15_15 = var6_6;
                }
                var10_10.setLayoutManager((RecyclerView$o)var15_15);
            }
            if (var10_10 != null) {
                var6_6 = var3_3.G;
                var10_10.setAdapter((RecyclerView$f)var6_6);
            }
            if ((var44_44 = var17_17.Q2()) != 0 && (var44_44 = var17_17.Q2()) >= 0) {
                var8_8 = var3_3.G;
                if (var8_8 != null) {
                    var24_24 = var8_8.getItemCount();
                } else {
                    var24_24 = 0;
                    var8_8 = null;
                }
                if (var44_44 < var24_24 && var10_10 != null) {
                    var10_10.smoothScrollToPosition(var44_44);
                }
            }
        } else {
            var6_6 = new ArrayList();
            var6_6.addAll(var4_4);
            var8_8 = var3_3.G;
            if (var8_8 != null && (var8_8 = var8_8.b) != null) {
                var8_8.clear();
            }
            if ((var8_8 = var3_3.G) != null && (var8_8 = var8_8.b) != null) {
                var8_8.addAll(var6_6);
            }
            if ((var6_6 = var3_3.G) != null) {
                var6_6.notifyDataSetChanged();
            }
        }
        if ((var6_6 = var3_3.h) != null && (var6_6 = var6_6.getViewTreeObserver()) != null) {
            var8_8 = new I41(var3_3);
            var6_6.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)var8_8);
        }
        if (var10_10 != null) {
            var6_6 = new o41_0(var3_3);
            var10_10.addOnScrollListener((RecyclerView$s)var6_6);
        }
        if ((var44_44 = (int)var17_17.u7()) != 0 && var11_11 != null) {
            var44_44 = 8;
            var11_11.setVisibility(var44_44);
        }
        var6_6 = h40_0.a;
        var44_44 = (int)h40_0.W0();
        if (var44_44 != 0) {
            var6_6 = var17_17.x5();
            if (var6_6 != null && (var44_44 = (int)var6_6.isComingSoonProduct()) == (var24_24 = 1)) {
                var5_5 = 1;
            }
            if (var5_5 != 0) {
                if (var12_12 != null) {
                    ai0_2.i((View)var12_12);
                }
                if (var7_7 != null) {
                    ai0_2.i((View)var7_7);
                }
            }
        }
    }

    public final void z() {
        View view = this.w;
        ImageView imageView = this.v;
        Object object = h40_0.a;
        boolean bl2 = h40_0.D1();
        int n3 = 8;
        String string2 = "uepTVContainer";
        if (bl2) {
            int n4;
            object = this.c;
            int n7 = object.Z9();
            String string3 = "social_proofing_icons";
            String string4 = "";
            boolean bl3 = true;
            String string5 = "icTagImage";
            if (n7 != 0) {
                Object object2;
                object = object.C3();
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n7 = 0;
                    object2 = null;
                } else {
                    object2 = imageView;
                }
                int n8 = hv3_0.q(R$dimen.dimen_12);
                object2.setMinimumHeight(n8);
                object2 = z40_0.Companion;
                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                object2 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object2).a.d(string3);
                string3 = this.M;
                object2 = object2.getString(string3);
                if (object2 != null) {
                    string4 = object2;
                }
                n7 = TextUtils.isEmpty((CharSequence)string4);
                if (n7 == 0) {
                    object2 = new da$a();
                    ((da$a)object2).k = bl3;
                    ((da$a)object2).g = bl3;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n4 = 0;
                        imageView = null;
                    }
                    ((da$a)object2).n = string4;
                    ((da$a)object2).u = imageView;
                    ((da$a)object2).a();
                } else {
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n4 = 0;
                        imageView = null;
                    }
                    n7 = R$drawable.ic_product_quality_tag;
                    imageView.setBackgroundResource(n7);
                }
            } else {
                Object object3;
                object = object.C3();
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n7 = 0;
                    object3 = null;
                } else {
                    object3 = imageView;
                }
                int n10 = hv3_0.q(R$dimen.dimen_16);
                object3.setMinimumHeight(n10);
                object3 = z40_0.Companion;
                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                object3 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object3).a.d(string3);
                string3 = this.N;
                object3 = object3.getString(string3);
                if (object3 != null) {
                    string4 = object3;
                }
                n7 = TextUtils.isEmpty((CharSequence)string4);
                if (n7 == 0) {
                    object3 = new da$a();
                    ((da$a)object3).k = bl3;
                    ((da$a)object3).g = bl3;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n4 = 0;
                        imageView = null;
                    }
                    ((da$a)object3).n = string4;
                    ((da$a)object3).u = imageView;
                    ((da$a)object3).a();
                } else {
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n4 = 0;
                        imageView = null;
                    }
                    n7 = R$drawable.ic_wishlist_added;
                    imageView.setBackgroundResource(n7);
                }
            }
            n4 = ((String)object).length();
            if (n4 > 0) {
                imageView = this.u;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("uepTV");
                    n4 = 0;
                    imageView = null;
                }
                imageView.setText((CharSequence)object);
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    view = null;
                }
                n4 = 0;
                imageView = null;
                view.setVisibility(0);
            } else {
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    view = null;
                }
                view.setVisibility(n3);
            }
        } else {
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                view = null;
            }
            view.setVisibility(n3);
        }
    }
}

