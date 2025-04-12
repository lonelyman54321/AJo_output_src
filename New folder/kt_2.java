/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from kT
 */
public final class kt_2
extends Fragment
implements View.OnClickListener,
l82_0 {
    public static final kT$a Companion;
    public ot_2 a;
    public du_1 b;
    public CartDeliveryAddress c;
    public StoreNode d;
    public AppCompatActivity e;
    public TabLayout f;
    public ViewPager g;
    public AjioTextView h;
    public AjioTextView i;
    public int j;
    public Typeface k;
    public Typeface l;
    public AjioLoaderView m;
    public View n;
    public ShimmerFrameLayout o;
    public final NewEEcommerceEventsRevamp p;
    public final NewCustomEventsRevamp q;
    public final String r;
    public final String s;
    public TextView t;
    public CollapsingToolbarLayout u;

    static {
        kT$a kT$a;
        Companion = kT$a = new Object();
    }

    public kt_2() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.p = object2;
        this.q = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.r = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.s = object = bv_0.a((AnalyticsManager$Companion)object);
    }

    public final Serializable Oa() {
        int n3;
        int n4;
        ViewPager viewPager = this.g;
        if (viewPager != null && (n4 = viewPager.getCurrentItem()) == 0) {
            return this.c;
        }
        viewPager = this.g;
        if (viewPager != null && (n4 = viewPager.getCurrentItem()) == (n3 = 1)) {
            return this.d;
        }
        return this.c;
    }

    public final void P0() {
        hv3_0.s0(this.o);
        Object object = this.n;
        if (object != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
        if ((object = this.m) != null) {
            ((AjioLoaderView)((Object)object)).stopLoader();
        }
    }

    public final View Pa(int n3) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.e);
        int n4 = R$layout.tab_pick_drop_revamp;
        layoutInflater = layoutInflater.inflate(n4, null, false);
        n4 = R$id.tab_tv_text;
        AjioTextView ajioTextView = (AjioTextView)layoutInflater.findViewById(n4);
        boolean bl2 = og1_1.b();
        if (bl2) {
            bl2 = true;
            ajioTextView.setAllCaps(bl2);
        }
        if (n3 == 0) {
            String string2 = hv3_0.K(R$string.home_delivery);
            ajioTextView.setText(string2);
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                string2 = this.k;
                ajioTextView.setTypeface((Typeface)string2);
                n3 = hv3_0.m(R$color.luxe_color_E0E0E0);
                ajioTextView.setTextColor(n3);
                n3 = R$drawable.lux_right_tab_selected_pickup_bg;
                ajioTextView.setBackgroundResource(n3);
            } else {
                n3 = hv3_0.m(R$color.white);
                ajioTextView.setTextColor(n3);
                string2 = this.k;
                ajioTextView.setTypeface((Typeface)string2);
                n3 = R$drawable.revamp_right_tab_selected_pickup_bg;
                ajioTextView.setBackgroundResource(n3);
            }
        } else {
            Object object;
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                if (ajioTextView != null) {
                    object = this.l;
                    ajioTextView.setTypeface((Typeface)object);
                }
                n3 = hv3_0.m(R$color.luxe_color_121212);
                ajioTextView.setTextColor(n3);
                n3 = R$drawable.lux_left_tab_unselected_pickup_bg;
                ajioTextView.setBackgroundResource(n3);
            } else {
                if (ajioTextView != null) {
                    object = this.l;
                    ajioTextView.setTypeface((Typeface)object);
                }
                if (ajioTextView != null) {
                    n3 = hv3_0.m(R$color.accent_color_18);
                    ajioTextView.setTextColor(n3);
                }
                n3 = R$drawable.revamp_left_tab_unselected_pickup_bg;
                ajioTextView.setBackgroundResource(n3);
            }
            n3 = R$string.store_pickup;
            object = hv3_0.K(n3);
            ajioTextView.setText((CharSequence)object);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Qa() {
        block20: {
            block17: {
                block19: {
                    block18: {
                        var1_1 = this;
                        var2_2 /* !! */  = this.g;
                        var3_3 = this.p;
                        if (var2_2 /* !! */  == null || (var4_4 = var2_2 /* !! */ .getCurrentItem()) != 0) break block17;
                        var2_2 /* !! */  = this.c;
                        var5_5 /* !! */  = "";
                        var6_6 = null;
                        if (var2_2 /* !! */  == null) break block18;
                        if ((var2_2 /* !! */  = var2_2 /* !! */ .getEstimateDeliveryDate()) == null) ** GOTO lbl-1000
                        var2_2 /* !! */  = this.c;
                        if (var2_2 /* !! */  != null) {
                            var2_2 /* !! */  = var2_2 /* !! */ .getEstimateDeliveryDate();
                        } else {
                            var4_4 = 0;
                            var2_2 /* !! */  = null;
                        }
                        var2_2 /* !! */  = String.valueOf((Object)var2_2 /* !! */ );
                        var7_7 = false;
                        var8_8 = null;
                        var9_9 = "-";
                        var4_4 = (int)StringsKt.F((CharSequence)var2_2 /* !! */ , (CharSequence)var9_9, false);
                        if (var4_4 != 0) {
                            var2_2 /* !! */  = "range";
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 /* !! */  = "single";
                        }
                        break block19;
                    }
                    var2_2 /* !! */  = var5_5 /* !! */ ;
                }
                var10_10 = new Bundle();
                var8_8 = var1_1.c;
                var8_8 = var8_8 != null && (var7_7 = var8_8.isDefaultAddress()) == (var11_11 = true) ? "DefaultAddressAvailable" : "DefaultAddressNotAvailable";
                var9_9 = var1_1.q;
                var12_12 = var9_9.getSV_EP_CTA_DISABLE();
                var10_10.putString((String)var12_12, (String)var8_8);
                var8_8 = var1_1.c;
                if (var8_8 != null) {
                    var7_7 = var8_8.isDefaultAddress();
                    var12_12 = var9_9.getSV_EP_DEF_ADD();
                    var8_8 = String.valueOf(var7_7);
                    var10_10.putString((String)var12_12, (String)var8_8);
                }
                var8_8 = var9_9.getSV_EP_DEF_ADD_PIN();
                var12_12 = var1_1.c;
                var12_12 = var12_12 != null ? var12_12.getPostalCode() : null;
                var10_10.putString((String)var8_8, (String)var12_12);
                var8_8 = var1_1.c;
                if (var8_8 != null) {
                    var8_8 = var8_8.getEstimateDeliveryDateYYYYMMDD();
                } else {
                    var7_7 = false;
                    var8_8 = null;
                }
                var7_7 = TextUtils.isEmpty((CharSequence)var8_8);
                if (!var7_7) {
                    var8_8 = var1_1.c;
                    if (var8_8 != null) {
                        var8_8 = var8_8.getEstimateDeliveryDateYYYYMMDD();
                    } else {
                        var7_7 = false;
                        var8_8 = null;
                    }
                } else {
                    var8_8 = var5_5 /* !! */ ;
                }
                var12_12 = var9_9.getSV_ESTIMATE_DELIVERY_DATE();
                var10_10.putString((String)var12_12, (String)var8_8);
                var8_8 = var9_9.getSV_EP_EDD_TYPE();
                var10_10.putString((String)var8_8, (String)var2_2 /* !! */ );
                var2_2 /* !! */  = var1_1.c;
                if (var2_2 /* !! */  != null) {
                    var13_13 = var2_2 /* !! */ .getEddTimeDiff();
                    var2_2 /* !! */  = Long.valueOf(var13_13).toString();
                } else {
                    var4_4 = 0;
                    var2_2 /* !! */  = null;
                }
                var4_4 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                if (var4_4 == 0) {
                    var2_2 /* !! */  = var1_1.c;
                    if (var2_2 /* !! */  != null) {
                        var13_13 = var2_2 /* !! */ .getEddTimeDiff();
                        var2_2 /* !! */  = TimeUnit.DAYS;
                        var5_5 /* !! */  = TimeUnit.MILLISECONDS;
                        var13_13 = var2_2 /* !! */ .convert(var13_13, (TimeUnit)var5_5 /* !! */ );
                        var5_5 /* !! */  = Long.valueOf(var13_13);
                    } else {
                        var5_5 /* !! */  = null;
                    }
                }
                var2_2 /* !! */  = var9_9.getSV_EP_EDD_MAX();
                var5_5 /* !! */  = String.valueOf(var5_5 /* !! */ );
                var10_10.putString((String)var2_2 /* !! */ , var5_5 /* !! */ );
                var2_2 /* !! */  = var9_9.getSV_EP_EDD_MODE();
                var5_5 /* !! */  = var1_1.c;
                if (var5_5 /* !! */  != null) {
                    var6_6 = var5_5 /* !! */ .getDeliveryModeValue();
                }
                var10_10.putString((String)var2_2 /* !! */ , var6_6);
                var15_14 = var3_3.getPrevScreen();
                var16_15 = var3_3.getPrevScreenType();
                var9_9 = "shipping screen";
                var12_12 = "shipping screen";
                var8_8 = var1_1.q;
                var8_8.newPushCustomScreenView((String)var9_9, (String)var12_12, var15_14, var10_10, var16_15);
                break block20;
            }
            var17_16 = var3_3.getPrevScreen();
            var18_17 = var3_3.getPrevScreenType();
            var19_18 = "store pickup";
            var20_19 = "shipping screen";
            var21_20 = var1_1.q;
            var21_20.newPushCustomScreenView(var19_18, var20_19, var17_16, null, var18_17);
        }
    }

    public final void Ra(String string2) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.u;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(string2);
        }
        if ((collapsingToolbarLayout = this.t) != null) {
            collapsingToolbarLayout.setText(string2);
        }
    }

    public final void Sa(int n3) {
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            AjioTextView ajioTextView;
            if (n3 == n4 && (ajioTextView = this.h) != null) {
                StoreNode storeNode = this.d;
                if (storeNode != null) {
                    bl2 = true;
                }
                ajioTextView.setEnabled(bl2);
            }
        } else {
            AjioTextView ajioTextView = this.h;
            if (ajioTextView != null) {
                CartDeliveryAddress cartDeliveryAddress = this.c;
                if (cartDeliveryAddress != null) {
                    bl2 = true;
                }
                ajioTextView.setEnabled(bl2);
            }
        }
    }

    public final void X9(boolean bl2) {
        Object object;
        if (bl2) {
            object = this.n;
            if (object != null) {
                object.setVisibility(0);
            }
            object = this.o;
            hv3_0.p0((ShimmerFrameLayout)((Object)object));
        }
        if ((object = this.m) != null) {
            object.startLoader();
        }
    }

    public final void k6(CartDeliveryAddress cartDeliveryAddress, boolean bl2) {
        this.c = cartDeliveryAddress;
        this.Sa(0);
        if (bl2 && cartDeliveryAddress != null) {
            this.setResultAndFinish();
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (AppCompatActivity)object;
        this.e = object;
    }

    public final void onClick(View view) {
        Object object = "view";
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.checkout_address_lbl_addaddress;
        if (n3 == n4) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.q;
            String string2 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
            int n7 = 1536;
            String string3 = "add address";
            String string4 = "";
            String string5 = "add_address";
            String string6 = "shipping screen";
            String string7 = "shipping screen";
            String string8 = this.r;
            String string9 = this.s;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n7, null);
            object = this.a;
            if (object != null) {
                n4 = 0;
                ((ot_2)object).Qa(null);
            }
        } else {
            n4 = R$id.checkout_address_tv_done;
            if (n3 == n4) {
                this.setResultAndFinish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getArguments();
        if (bundle != null) {
            Object object = "SELECTED_ADDRESS";
            bundle.containsKey((String)object);
            int n3 = Build.VERSION.SDK_INT;
            Object object2 = null;
            int n4 = 33;
            if (n3 >= n4) {
                object = at_0.b(bundle);
            } else {
                boolean bl2 = (object = bundle.getSerializable((String)object)) instanceof CartDeliveryAddress;
                if (!bl2) {
                    object = null;
                }
                object = (CartDeliveryAddress)object;
            }
            this.c = object = (CartDeliveryAddress)object;
            object = "SELECTED_STORE_ADDRESS";
            bundle.containsKey((String)object);
            if (n3 >= n4) {
                object = hT.a(bundle);
            } else {
                n3 = (object = bundle.getSerializable((String)object)) instanceof StoreNode;
                if (n3 != 0) {
                    object2 = object;
                }
                object = object2;
                object = (StoreNode)object2;
            }
            this.d = object = (StoreNode)object;
            object = "SELECTED_ADDRESS_TAB";
            n3 = (int)(bundle.containsKey((String)object) ? 1 : 0);
            if (n3 != 0) {
                int n7;
                this.j = n7 = bundle.getInt((String)object);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_checkout_address_tab_lux;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_checkout_address_tab_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.setResultAndFinish();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Fragment fragment = this.a;
        String string2 = "checkoutAddressClickListener";
        if (fragment != null) {
            Intrinsics.checkNotNullParameter(this, string2);
            fragment.g = this;
        }
        if ((fragment = this.b) != null) {
            Intrinsics.checkNotNullParameter(this, string2);
            ((du_1)fragment).h = this;
        }
        hv3_0.S(this.e);
        this.Qa();
    }

    public final void onStop() {
        int n3;
        super.onStop();
        Object object = this.g;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.p;
        String string2 = "shipping screen";
        if (object != null && (n3 = object.getCurrentItem()) == 0) {
            newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
        } else {
            object = "store pickup";
            newEEcommerceEventsRevamp.setPreviousScreenData((String)object, string2);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        int n4;
        int n7;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n8 = og1_1.b();
        if (n8 != 0) {
            n8 = R$id.checkout_address_toolbar_luxe;
            object2 = (Toolbar)object.findViewById(n8);
            n7 = R$id.checkout_address_toolbar_title;
            object4 = (TextView)object.findViewById(n7);
            this.t = object4;
            if (object2 != null) {
                n7 = R$drawable.ic_luxe_back_arrow;
                ((Toolbar)object2).setNavigationIcon(n7);
            }
            if (object2 != null) {
                n7 = R$string.back_button_text;
                ((Toolbar)object2).setNavigationContentDescription(n7);
            }
            n7 = R$id.checkout_address_lbl_addaddress;
            this.i = object4 = (AjioTextView)object.findViewById(n7);
            if (object4 != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.i) != null) {
                ((AjioTextView)object4).underlineText();
            }
            if ((object4 = this.e) != null) {
                ((AppCompatActivity)object4).setSupportActionBar((Toolbar)object2);
            }
            n4 = 0;
            object3 = null;
            object4 = new iT(this, 0);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object4);
            n8 = R$string.title_delivery_address;
            object2 = hv3_0.K(n8);
            this.Ra((String)object2);
        } else {
            n8 = R$id.checkout_address_collapse_toolbar;
            object2 = (CollapsingToolbarLayout)object.findViewById(n8);
            this.u = object2;
            if (object2 != null) {
                n7 = R$style.header_plp;
                ((CollapsingToolbarLayout)((Object)object2)).setCollapsedTitleTextAppearance(n7);
            }
            if ((object2 = this.u) != null) {
                n7 = R$style.expanded_toolbar_title;
                ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleTextAppearance(n7);
            }
            if ((object2 = this.u) != null) {
                n7 = mz3_0.d(16);
                object3 = this.u;
                Intrinsics.checkNotNull(object3);
                n4 = object3.getExpandedTitleMarginTop();
                CollapsingToolbarLayout collapsingToolbarLayout = this.u;
                Intrinsics.checkNotNull((Object)collapsingToolbarLayout);
                int n10 = collapsingToolbarLayout.getExpandedTitleMarginEnd();
                CollapsingToolbarLayout collapsingToolbarLayout2 = this.u;
                Intrinsics.checkNotNull((Object)collapsingToolbarLayout2);
                int n14 = collapsingToolbarLayout2.getExpandedTitleMarginBottom();
                ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleMargin(n7, n4, n10, n14);
            }
            n8 = R$id.checkout_address_toolbar;
            object2 = object.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
            object2 = (Toolbar)object2;
            n7 = R$drawable.nav_back;
            ((Toolbar)object2).setNavigationIcon(n7);
            n7 = R$string.back_button_text;
            ((Toolbar)object2).setNavigationContentDescription(n7);
            object4 = hv3_0.K(R$string.title_delivery_address);
            this.Ra((String)object4);
            n7 = R$id.checkout_address_lbl_addaddress;
            this.i = object4 = (AjioTextView)object.findViewById(n7);
            if (object4 != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            n4 = 0;
            object3 = null;
            object4 = new jT(this, 0);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object4);
        }
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object2 = hv3_0.o(10, (Context)object2);
        this.k = object2;
        object2 = AJIOApplication$a.a();
        n7 = 9;
        object2 = hv3_0.o(n7, (Context)object2);
        this.l = object2;
        n8 = R$id.checkout_address_viewpager;
        object2 = (ViewPager)object.findViewById(n8);
        this.g = object2;
        n8 = R$id.checkout_address_tab;
        object2 = (TabLayout)object.findViewById(n8);
        this.f = object2;
        n8 = R$id.checkout_address_tv_done;
        object2 = (AjioTextView)object.findViewById(n8);
        this.h = object2;
        n8 = R$id.checkout_address_loader;
        object2 = (AjioLoaderView)object.findViewById(n8);
        this.m = object2;
        n8 = R$id.checkout_address_shimmer;
        object2 = object.findViewById(n8);
        this.n = object2;
        n8 = R$id.shipping_shimmer_view;
        object = (ShimmerFrameLayout)object.findViewById(n8);
        this.o = object;
        object = this.h;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        object = this.h;
        n8 = 0;
        object2 = null;
        if (object != null) {
            object.setEnabled(false);
        }
        object4 = this.getChildFragmentManager();
        object3 = "getChildFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object = new kT$b(this, (FragmentManager)object4);
        object4 = this.g;
        if (object4 != null) {
            ((ViewPager)((Object)object4)).setAdapter((Uk2)object);
        }
        if ((object = this.f) != null) {
            object4 = this.g;
            object.setupWithViewPager((ViewPager)((Object)object4));
        }
        while (n8 < (n3 = 2)) {
            object = this.f;
            if (object != null) {
                object = object.getTabAt(n8);
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                if (n8 == 0) {
                    object4 = this.Pa(n8);
                    object.setCustomView((View)object4);
                } else {
                    object4 = this.Pa(n8);
                    object.setCustomView((View)object4);
                }
            }
            ++n8;
        }
        object = this.f;
        if (object != null) {
            object2 = new lt_1(this);
            object.addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
        }
        if ((object = this.d) != null) {
            this.j = n3 = 1;
        }
        if ((object = this.g) != null) {
            n8 = this.j;
            object.setCurrentItem(n8);
        }
        if ((object = this.d) != null) {
            Intrinsics.checkNotNull(object);
            object = object.getStoreAddress();
            if (object != null) {
                object = this.d;
                Intrinsics.checkNotNull(object);
                object = object.getStoreAddress().getPostalCode();
                if (object != null && (n3 = (int)(kotlin.text.b.k((CharSequence)object) ? 1 : 0)) == 0 && (object = this.b) != null) {
                    object2 = this.d;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((StoreNode)object2).getStoreAddress().getPostalCode();
                    Intrinsics.checkNotNullExpressionValue(object2, "getPostalCode(...)");
                    object4 = "pinCode";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    object.g = object2;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setResultAndFinish() {
        Object object = this.e;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = object.isFinishing();
            if (!bl2 && (object = this.Oa()) != null) {
                object = new Intent();
                Object object2 = this.Oa();
                boolean bl3 = object2 instanceof Serializable;
                if (bl3) {
                    object2 = this.Oa();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.io.Serializable");
                    object2 = (Serializable)object2;
                    String string2 = "BUNDLE_CART_ADDRESS";
                    object.putExtra(string2, (Serializable)object2);
                }
                if ((object2 = this.e) != null) {
                    int n3 = -1;
                    object2.setResult(n3, (Intent)object);
                }
                if ((object = this.e) == null) return;
                object.finish();
                return;
            }
        }
        if ((object = this.e) == null) return;
        object.finish();
    }

    public final void v5(StoreNode storeNode) {
        this.d = storeNode;
        int n3 = 1;
        this.Sa(n3);
        if (storeNode != null) {
            this.setResultAndFinish();
        }
    }
}

