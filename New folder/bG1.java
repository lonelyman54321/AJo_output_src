/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.NewUserBanner;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;

public final class bG1
extends q22_0
implements mf1_0,
mg1_2,
ChangeLocationListener,
zm_2 {
    public static final /* synthetic */ int o1;
    public View i1;
    public final String j1;
    public CartAddressListBottomSheet k1;
    public fo_1 l1;
    public ff0_2 m1;
    public VF1 n1;

    public bG1() {
        this.j1 = "IS_TOGGLE_VISIBLE";
    }

    public final void Bb(CartDeliveryAddress cartDeliveryAddress) {
        Object object;
        boolean bl2;
        Object object2;
        boolean bl3;
        boolean bl4;
        Object object3;
        Object object4;
        Object object5;
        int n3;
        Object object6;
        ArrayList arrayList;
        Object object7;
        Object object8 = this;
        Object object9 = null;
        Object object10 = this.cb().d.M;
        Object object11 = this.cb().d;
        boolean bl5 = ((bv2_0)object11).u0;
        if (bl5) {
            object11 = this.cb().d.v0;
            object7 = this.cb().d.w0;
            arrayList = object11;
            object6 = object7;
        } else {
            arrayList = null;
            object6 = null;
        }
        if (object10 != null) {
            object11 = ((ProductsList)object10).getFreeTextSearch();
        } else {
            n3 = 0;
            object11 = null;
        }
        object7 = "";
        boolean bl6 = true;
        if (object11 != null) {
            object11 = ((ProductsList)object10).getFreeTextSearch();
            Intrinsics.checkNotNull(object11);
            object5 = ((ProductsList)object10).getPagination();
            if (object5 != null) {
                object7 = ((ProductsList)object10).getPagination();
                Intrinsics.checkNotNull(object7);
                ((Pagination)object7).getCurrentPage();
                object7 = ((ProductsList)object10).getPagination();
                Intrinsics.checkNotNull(object7);
                boolean bl42 = ((Pagination)object7).getTotalResults();
                if (bl42 == bl6) {
                    object5 = " Product";
                    object7 = UX.a((int)(bl42 ? 1 : 0), (String)object5);
                } else {
                    object5 = " Products";
                    object7 = UX.a((int)(bl42 ? 1 : 0), (String)object5);
                }
            }
            object4 = object11;
            object3 = object7;
        } else {
            object4 = object7;
            object3 = object7;
        }
        if (object10 != null) {
            object11 = ((ProductsList)object10).getFreeTextSearch();
        } else {
            n3 = 0;
            object11 = null;
        }
        if (object10 != null) {
            object7 = ((ProductsList)object10).getProducts();
        } else {
            boolean bl7 = false;
            object7 = null;
        }
        object7 = (Collection)object7;
        if (object7 != null && !(bl4 = object7.isEmpty())) {
            int n4;
            boolean bl8;
            if (object10 != null && (object7 = ((ProductsList)object10).getProducts()) != null && (object7 = (Product)object7.get(0)) != null) {
                object7 = ((Product)object7).getImages();
            } else {
                boolean bl9 = false;
                object7 = null;
            }
            object7 = (Collection)object7;
            if (object7 != null && !(bl8 = object7.isEmpty()) && object11 != null && (n4 = ((String)object11).length()) != 0) {
                block37: {
                    if (object10 != null && (object7 = ((ProductsList)object10).getProducts()) != null && (object7 = (Product)object7.get(0)) != null) {
                        object7 = ((Product)object7).getImages();
                    } else {
                        boolean bl10 = false;
                        object7 = null;
                    }
                    Intrinsics.checkNotNull(object7);
                    object7 = object7.iterator();
                    while (bl3 = object7.hasNext()) {
                        object5 = (ProductImage)object7.next();
                        object2 = ((ProductImage)object5).getFormat();
                        if (object2 == null || (bl2 = ((String)object2).equalsIgnoreCase((String)(object = "mobileProductListingImage"))) != bl6) continue;
                        object7 = ((ProductImage)object5).getUrl();
                        break block37;
                    }
                    boolean bl11 = false;
                    object7 = null;
                }
                if (object7 != null) {
                    object5 = this.cb();
                    Intrinsics.checkNotNull(object11);
                    ((F12)object5).m((String)object7, (String)object11);
                } else {
                    if (object10 != null && (object7 = ((ProductsList)object10).getProducts()) != null && (object7 = (Product)object7.get(0)) != null && (object7 = ((Product)object7).getImages()) != null && (object7 = (ProductImage)CollectionsKt.S((List)object7)) != null) {
                        object7 = ((ProductImage)object7).getUrl();
                    } else {
                        boolean bl12 = false;
                        object7 = null;
                    }
                    if (object7 != null) {
                        object5 = this.cb();
                        Intrinsics.checkNotNull(object11);
                        ((F12)object5).m((String)object7, (String)object11);
                    }
                }
            }
        }
        object11 = z40_0.Companion;
        object7 = this.requireActivity().getApplication();
        object5 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
        object11.getClass();
        object11 = z40$a.a((Context)object7).a;
        object7 = "brand_description_enable";
        boolean bl13 = ((ao0_0)object11).a((String)object7);
        Object object12 = bl13 && object10 != null ? (object10 = ((ProductsList)object10).getDescriptionV2()) : null;
        object10 = this.cb().d;
        object11 = this.cb().e();
        object7 = this.cb().d.M;
        if (object7 != null && (object7 = ((ProductsList)object7).getPagination()) != null) {
            int n7 = ((Pagination)object7).getCurrentPage();
            object7 = n7;
        } else {
            boolean bl14 = false;
            object7 = null;
        }
        ((bv2_0)object10).F((ArrayList)object11, (Integer)object7);
        object7 = this.cb();
        object10 = ImmutableList.copyOf((Collection)this.cb().d.K);
        Intrinsics.checkNotNullExpressionValue(object10, "copyOf(...)");
        object11 = this.cb().d.M;
        if (object11 != null) {
            object5 = object11 = ((ProductsList)object11).getPlpExtendedBanner();
        } else {
            bl3 = false;
            object5 = null;
        }
        object11 = tr2_2.a;
        bl2 = tr2_2.v(bl6);
        object = this.cb().d.r0;
        Object object13 = this.Xa().c;
        object11 = this.Wa().getBannerAdList();
        if (object11 == null) {
            object11 = new ArrayList();
        }
        Object object14 = object11;
        object10 = ((F12)object7).c((ImmutableList)object10, (PlpExtendedBanner)object5, bl2, (String)object, bl13, bl5, false, (List)object13, (List)object11);
        Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.plp.model.ProductWrapper>");
        object10 = TypeIntrinsics.asMutableList(object10);
        object14 = "<set-?>";
        Intrinsics.checkNotNullParameter(object10, (String)object14);
        ((q22_0)object8).P0 = object10;
        object10 = this.cb().d;
        ((bv2_0)object10).J1 = n3 = this.cb().d.K.size();
        object10 = ((q22_0)object8).P0;
        object11 = this.cb().d.M;
        if (object11 != null) {
            object11 = ((ProductsList)object11).getPlpExtendedBanner();
        } else {
            n3 = 0;
            object11 = null;
        }
        object = ((q22_0)object8).P;
        Intrinsics.checkNotNull(object);
        Object object15 = object7;
        object7 = new yf1_0((q22_0)object8, 0);
        object9 = object13;
        object7 = object4;
        object5 = this;
        object2 = this;
        Object object16 = object13;
        object13 = this;
        Object object17 = object14;
        object14 = object12;
        object8 = object6;
        object6 = this;
        object4 = cartDeliveryAddress;
        ((VF1)object9)((List)object10, (PlpExtendedBanner)object11, (String)object7, (String)object3, this, this, (RecyclerViewScrollListener)object, this, this, this, this, (String)object12, bl5, (String)((Object)arrayList), (String)object8, (yf1_0)object15, this, cartDeliveryAddress);
        object9 = this;
        object10 = object16;
        this.n1 = object16;
        object11 = this.G0;
        if (object11 == null) {
            object11 = Yj2.GRID;
        }
        object7 = object17;
        Intrinsics.checkNotNullParameter(object11, (String)object17);
        ((q22)object10).e = object11;
        object10 = this.cb().d;
        boolean bl15 = ((bv2_0)object10).i();
        object11 = "adapter";
        if (bl15) {
            object10 = ((bG1)object9).n1;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                bl15 = false;
                object10 = null;
            }
            object7 = this.cb().e();
            ((q22)object10).i((ArrayList)object7);
        }
        if ((object10 = ((q22_0)object9).B) != null) {
            object7 = ((bG1)object9).n1;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                boolean bl16 = false;
                object7 = null;
            }
            ((RecyclerView)object10).setAdapter((RecyclerView$f)object7);
        }
    }

    public final void Cb() {
    }

    public final void Db(String string2) {
    }

    public final void E9() {
        View view = this.i1;
        if (view != null) {
            int n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void Eb(String object, String object2) {
        int n3;
        int n4 = 1;
        if (object != null && (n3 = object.length()) != 0) {
            Toolbar toolbar = this.I;
            if (toolbar != null) {
                Object object3 = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_page_header_plp_title;
                object3 = hv3_0.K(n7);
                Object[] objectArray = new Object[n4];
                objectArray[0] = object;
                object = Arrays.copyOf(objectArray, n4);
                object = String.format((String)object3, object);
                object2 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                toolbar.setContentDescription((CharSequence)object);
            }
        } else {
            object = this.I;
            if (object != null) {
                n4 = R$string.acc_page_header_plp;
                object2 = hv3_0.K(n4);
                object.setContentDescription((CharSequence)object2);
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new ZF1(this);
        object.postDelayed((Runnable)object2, 300L);
    }

    public final void I5() {
        int n3;
        CardView cardView = this.S0;
        if (cardView != null && (n3 = cardView.getVisibility()) == 0 && (cardView = this.S0) != null) {
            ai0_2.k((View)cardView);
        }
    }

    public final void Ib() {
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        Object object3;
        bG1 bG12 = this;
        Object object4 = this.cb().d.M;
        int n4 = 0;
        Object object5 = null;
        String string2 = object4 != null ? ((ProductsList)object4).getFreeTextSearch() : null;
        boolean bl3 = true;
        Object object6 = "";
        if (string2 != null) {
            string2 = ((ProductsList)object4).getFreeTextSearch();
            Intrinsics.checkNotNull(string2);
            object3 = ((ProductsList)object4).getPagination();
            if (object3 != null) {
                object6 = ((ProductsList)object4).getPagination();
                Intrinsics.checkNotNull(object6);
                boolean bl4 = ((Pagination)object6).getTotalResults();
                object3 = ((ProductsList)object4).getPagination();
                Intrinsics.checkNotNull(object3);
                n3 = ((Pagination)object3).getCurrentPage();
                if (bl4 == bl3) {
                    object2 = " Product";
                    object6 = UX.a((int)(bl4 ? 1 : 0), (String)object2);
                } else {
                    object2 = " Products";
                    object6 = UX.a((int)(bl4 ? 1 : 0), (String)object2);
                }
                if (n3 == 0 && (n3 = (int)((object3 = bG12.P0).isEmpty() ? 1 : 0)) != 0 && (object3 = bG12.B) != null) {
                    object2 = null;
                    ((RecyclerView)object3).scrollToPosition(0);
                }
            }
            String string3 = object6;
            object6 = string2;
            string2 = string3;
        } else {
            string2 = object6;
        }
        object3 = bG12.B;
        if (object3 != null) {
            object3 = ((RecyclerView)object3).getAdapter();
        } else {
            n3 = 0;
            object3 = null;
        }
        object3 = (VF1)object3;
        object2 = this.cb().d;
        boolean bl5 = ((bv2_0)object2).u0;
        if (bl5) {
            object2 = this.cb().d.v0;
            object = this.cb().d.w0;
        } else {
            object2 = null;
            object = null;
        }
        Object object7 = z40_0.Companion;
        Object object8 = this.requireActivity().getApplication();
        String string4 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object8, string4);
        object7.getClass();
        object7 = z40$a.a((Context)object8).a;
        object8 = "brand_description_enable";
        boolean bl6 = ((ao0_0)object7).a((String)object8);
        if (bl6 && object4 != null) {
            object4 = ((ProductsList)object4).getDescriptionV2();
        } else {
            bl2 = false;
            object4 = null;
        }
        if (object3 != null) {
            ((VF1)object3).q = object4;
        }
        if (object3 != null) {
            ((VF1)object3).r = bl5;
            ((VF1)object3).s = object2;
            ((VF1)object3).t = object;
        }
        if ((bl2 = ((bv2_0)(object4 = this.cb().d)).i()) && object3 != null) {
            object4 = this.cb().e();
            ((q22)object3).i((ArrayList)object4);
        }
        object = this.cb();
        object7 = ImmutableList.copyOf((Collection)this.cb().d.K);
        Intrinsics.checkNotNullExpressionValue(object7, "copyOf(...)");
        object4 = this.cb().d.M;
        if (object4 != null) {
            object5 = ((ProductsList)object4).getPlpExtendedBanner();
        }
        object8 = object5;
        object4 = tr2_2.a;
        boolean bl7 = tr2_2.v(bl3);
        String string5 = this.cb().d.r0;
        object4 = this.Xa().c;
        object5 = this.Wa().getBannerAdList();
        if (object5 == null) {
            object5 = new ArrayList();
        }
        object4 = ((F12)object).c((ImmutableList)object7, (PlpExtendedBanner)object8, bl7, string5, bl6, bl5, false, (List)object4, (List)object5);
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.plp.model.ProductWrapper>");
        object4 = TypeIntrinsics.asMutableList(object4);
        Intrinsics.checkNotNullParameter(object4, "<set-?>");
        bG12.P0 = object4;
        object4 = this.cb().d;
        object5 = this.cb().d.K;
        ((bv2_0)object4).J1 = n4 = ((ArrayList)object5).size();
        if (object3 != null) {
            object4 = bG12.P0;
            Intrinsics.checkNotNullParameter(object4, "productList");
            Intrinsics.checkNotNullParameter(object6, "title");
            object5 = "subtitle";
            Intrinsics.checkNotNullParameter(string2, (String)object5);
            ((VF1)object3).f = object4;
            ((VF1)object3).h = object6;
            ((VF1)object3).i = string2;
            ((RecyclerView$f)object3).notifyDataSetChanged();
        }
    }

    public final void Ja() {
        View view = this.i1;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void L5() {
        Object object = this.cb();
        boolean bl2 = ((F12)object).g();
        if (bl2) {
            object = tr2_2.a;
            tr2_2.h(this.v0);
            Object object2 = tr2_2.b;
            int n3 = 1;
            ((sw_0)object2).putPreference("SALE_BTN_CLICKED", n3 != 0);
            object = this.i1;
            object2 = hv3_0.a;
            if (object != null) {
                int n4 = 2;
                object.performHapticFeedback(n3, n4);
            }
            if ((object = this.B) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            object = AnalyticsManager.Companion.getInstance();
            object2 = ((AnalyticsManager)object).getGtmEvents();
            String string2 = o72_0.a;
            String string3 = "show bbs price";
            String string4 = "bbs widget";
            int n7 = 8;
            GTMEvents.pushWidgetInteractionEvent$default((GTMEvents)object2, string4, string3, string2, null, n7, null);
        } else {
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginListener");
                bl2 = false;
                object = null;
            }
            String string5 = "plp - bbs widget";
            int n8 = 58;
            object.z0(n8, string5);
        }
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.k1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }

    public final void N7() {
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.Va().l();
        object = object != null ? object.getAddressType() : null;
        Object object2 = AddressType.Pincode;
        if (object == object2) {
            object = this.Va().m();
            if (object == null) {
                object = "";
            }
            object2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final void O3() {
    }

    public final void T2() {
        boolean bl2;
        Object object = new fo_1();
        this.l1 = object;
        ((fo_1)object).h = bl2 = true;
        Object object2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((fo_1)object).i = this;
        object = this.l1;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.l1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void Ta(ProductsList productsList) {
    }

    public final int Ya() {
        return R$id.luxe_plp_filter_frag_container;
    }

    public final void Z5() {
    }

    public final void a1() {
        Object object = this.getContext();
        if (object != null) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object2 = o72_0.a;
            Object object3 = "about_brand_plp";
            ((GTMEvents)object).pushButtonTapEvent("about_brand", object3, (String)object2);
            object2 = this.requireContext();
            object = new BottomSheetDialog((Context)object2);
            object.requestWindowFeature(1);
            int n3 = R$layout.luxe_brand_desc_bottom_sheet;
            ((BottomSheetDialog)object).setContentView(n3);
            n3 = R$id.brand_desc_cancel_layout;
            object2 = ((on)object).findViewById(n3);
            int n4 = R$id.brand_desc_cancel_iv;
            View view = ((on)object).findViewById(n4);
            if (object2 != null) {
                int n7 = 2;
                object3 = new eV(object, n7);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
            if (view != null) {
                object2 = new WF1((BottomSheetDialog)object);
                view.setOnClickListener((View.OnClickListener)object2);
            }
            n3 = R$id.brand_desc_bottom_sheet_title_tv;
            object2 = (TextView)((on)object).findViewById(n3);
            n4 = R$id.brand_desc_bottom_sheet_desc_tv;
            view = (TextView)((on)object).findViewById(n4);
            object3 = this.cb().d.M;
            if (object3 != null) {
                String string2 = ((ProductsList)object3).getFreeTextSearch();
                object3 = ((ProductsList)object3).getDescriptionV2();
                if (object2 != null) {
                    object2.setText((CharSequence)string2);
                }
                if (view != null) {
                    view.setText((CharSequence)object3);
                }
            }
            object2 = new XF1((BottomSheetDialog)object);
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
            object.show();
        }
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.m1 = ff0_22 = new ff0_2();
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.j = this;
        ff0_22 = this.m1;
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.m1) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final void eb(ProductsList productsList) {
    }

    public final void fb() {
        int n3;
        this.B0 = n3 = this.l;
    }

    public final void g7(String string2) {
        Intrinsics.checkNotNullParameter(string2, "link");
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        kj0_12.p(fragmentActivity, string2);
    }

    public final void gb() {
        int n3;
        this.B0 = n3 = this.m;
        PR2$a pR2$a = pr2_2.Companion;
        View view = this.i1;
        pR2$a.getClass();
        PR2$a.a(view);
    }

    public final void hb(View view) {
        int n3;
        Object object;
        Object object2;
        int n4;
        int n7;
        Toolbar toolbar;
        Intrinsics.checkNotNullParameter(view, "view");
        int n8 = R$id.luxe_plp_toolbar;
        Object object3 = (Toolbar)view.findViewById(n8);
        this.I = object3;
        object3 = this.getActivity();
        n8 = object3 instanceof AppCompatActivity;
        if (n8 != 0) {
            object3 = this.getActivity();
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object3 = (AppCompatActivity)object3;
            toolbar = this.I;
            ((AppCompatActivity)object3).setSupportActionBar(toolbar);
        }
        object3 = this.I;
        int n10 = 0;
        toolbar = null;
        if (object3 != null) {
            n7 = R$id.luxe_toolbar_navigation_iv;
            object3 = (ImageView)object3.findViewById(n7);
        } else {
            n8 = 0;
            object3 = null;
        }
        if (object3 != null) {
            n7 = R$drawable.nav_back;
            object3.setImageResource(n7);
        }
        if (object3 != null) {
            n4 = 1;
            object2 = new rb_2(this, n4);
            object3.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object3 = this.I) != null && (object3 = object3.findViewById(n7 = R$id.luxe_toolbar_cart_view)) != null) {
            n4 = 1;
            object2 = new sb_2(this, n4);
            object3.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object3 = this.I) != null) {
            n7 = R$id.menu_cart_count_tv;
            object3 = (TextView)object3.findViewById(n7);
        } else {
            n8 = 0;
            object3 = null;
        }
        n7 = 8;
        n4 = 0;
        if (object3 != null) {
            object = this.Va();
            n3 = ((jo_2)object).d();
            if (n3 == 0) {
                Object object4 = z40_0.Companion;
                object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                String string2 = "enable_highlight_empty_cart";
                boolean n14 = ((ao0_0)object4).a(string2);
                if (n14) {
                    object3.setVisibility(0);
                    object = String.valueOf(n3);
                    object3.setText((CharSequence)object);
                    object = this.getContext();
                    if (object != null) {
                        int n15 = R$drawable.circle_shape_black_cart_menu;
                        object = xn.a((Context)object, n15);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object3.setBackground((Drawable)object);
                } else {
                    object3.setVisibility(n7);
                }
            } else {
                Context context = this.getContext();
                if (context != null) {
                    int n14 = R$drawable.circle_shape_black_cart_menu;
                    context = xn.a(context, n14);
                } else {
                    boolean bl2 = false;
                    context = null;
                }
                object3.setBackground((Drawable)context);
                object3.setVisibility(0);
                int n15 = 9;
                if (n3 <= n15) {
                    object = String.valueOf(n3);
                    object3.setText((CharSequence)object);
                } else {
                    object = hv3_0.f("9<sup>+</sup>");
                    object3.setText((CharSequence)object);
                }
            }
        }
        if ((object3 = this.I) != null && (object3 = object3.findViewById(n3 = R$id.luxe_toolbar_search_iv)) != null) {
            object = new aG1(this);
            object3.setOnClickListener((View.OnClickListener)object);
        }
        if ((object3 = this.p) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            n8 = 0;
            object3 = null;
        }
        object3.hideToolbarLayout();
        object3 = this.q;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n8 = 0;
            object3 = null;
        }
        object3.showTabLayout(false);
        n8 = R$id.luxe_plp_zero_product_layout;
        object3 = view.findViewById(n8);
        this.Y = object3;
        n8 = R$id.toggleListViewLuxe;
        object3 = (CardView)view.findViewById(n8);
        this.S0 = object3;
        object3 = this.Y;
        if (object3 != null) {
            object3.setVisibility(n7);
        }
        if ((object3 = this.Y) != null) {
            n4 = R$id.continue_shopping_pd_btn;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n8 = 0;
            object3 = null;
        }
        this.Z = object3;
        object3 = this.Y;
        if (object3 != null) {
            n4 = R$id.empty_layout_title;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n8 = 0;
            object3 = null;
        }
        this.k0 = object3;
        object3 = this.Y;
        if (object3 != null) {
            n4 = R$id.empty_layout_subtitle;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n8 = 0;
            object3 = null;
        }
        this.p0 = object3;
        object3 = this.Y;
        if (object3 != null) {
            n10 = R$id.address_bar_ui_luxe_empty;
            toolbar = object3.findViewById(n10);
        }
        this.q0 = toolbar;
        object3 = this.Z;
        if (object3 != null) {
            object3.setVisibility(n7);
        }
        if ((object3 = this.q0) != null) {
            object3.setVisibility(n7);
        }
        n8 = R$id.luxe_plp_shimmer_view;
        object3 = (ShimmerFrameLayout)view.findViewById(n8);
        this.N = object3;
        n8 = R$id.luxe_plp_sort_filter_view;
        object3 = view.findViewById(n8);
        this.E = object3;
        if (object3 != null) {
            object3.setVisibility(n7);
        }
        n8 = R$id.luxe_plp_sort_filter_divider;
        object3 = view.findViewById(n8);
        this.G = object3;
        if (object3 != null) {
            object3.setVisibility(n7);
        }
        n8 = R$id.luxe_plp_sort_by_view;
        object3 = view.findViewById(n8);
        this.H = object3;
        n8 = R$id.luxe_plp_sort_subheading_tv;
        object3 = (TextView)view.findViewById(n8);
        this.U = object3;
        n8 = R$id.luxe_plp_filter_view;
        object3 = view.findViewById(n8);
        this.J = object3;
        n8 = R$id.luxe_plp_filter_selected_icon_view;
        object3 = view.findViewById(n8);
        this.R = object3;
        n8 = R$id.luxe_plp_filter_subheading_tv;
        object3 = (TextView)view.findViewById(n8);
        this.S = object3;
        n8 = R$id.luxe_plp_category_view;
        object3 = view.findViewById(n8);
        this.K = object3;
        n8 = R$id.plp_category_heading_tv;
        object3 = (TextView)view.findViewById(n8);
        this.L = object3;
        n8 = R$id.luxe_plp_filter_background;
        object3 = view.findViewById(n8);
        this.T = object3;
        n8 = R$id.luxe_plp_product_rv;
        object3 = (RecyclerView)view.findViewById(n8);
        this.B = object3;
        n8 = R$id.collapsedHeaderContainer;
        object3 = view.findViewById(n8);
        this.i1 = object3;
        n8 = R$id.imgToggleView;
        view = (ImageView)view.findViewById(n8);
        this.T0 = view;
        this.sb();
        this.Ab();
    }

    public final void loadCartBasedOnSelectedAddress(String string2, String object) {
        object = this.requireContext();
        Object object2 = "Success";
        Toast.makeText((Context)object, (CharSequence)object2, (int)0).show();
        object = this.k1;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.m1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.l1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        object = new CartDeliveryAddress();
        object2 = AddressType.Pincode;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        ((CartDeliveryAddress)object).setPostalCode(string2);
        this.Va().F((CartDeliveryAddress)object);
        this.Va().G(string2);
        this.cb().h();
    }

    public final void mb() {
    }

    public final void nb(NewUserBanner newUserBanner, String string2) {
        Intrinsics.checkNotNullParameter(newUserBanner, "newUserBanner");
    }

    public final void o0() {
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.k1 = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        Object object = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, (String)object);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.k1;
        if (cartAddressListBottomSheet != null) {
            object = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        String string2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        og1_1.g(this.s0, false);
        object = this.cb().d;
        object.Z0 = string2 = ld3_2.STORE_LUXE.getStoreId();
        int n3 = R$layout.luxe_plp_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            String string2 = this.cb().d.l();
            tm3_0.e(fragmentActivity, string2);
        }
    }

    public final void onStop() {
        super.onStop();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int n3;
            Object object = this.S0;
            boolean bl2 = false;
            if (object != null && (n3 = object.getVisibility()) == 0) {
                bl2 = true;
            }
            object = this.j1;
            bundle.putBoolean((String)object, bl2);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.S0;
        if (object != null) {
            int n3 = 1;
            object2 = new dV(this, n3);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        boolean bl2;
        String string2;
        boolean bl3;
        super.onViewStateRestored(bundle);
        bundle = this.getArguments();
        if (bundle != null && (bl3 = bundle.getBoolean(string2 = this.j1, false)) == (bl2 = true)) {
            this.z0();
        }
    }

    public final void p0() {
    }

    public final void q4(String object) {
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.l1 = object2;
        ((fo_1)object2).Ra((String)object);
        object = this.l1;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.l1) != null) {
            boolean bl2;
            ((fo_1)object).h = bl2 = true;
        }
        if (object != null) {
            object2 = "changeLocationListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            ((fo_1)object).i = this;
        }
        if ((object = this.l1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void tb() {
        String string2;
        boolean bl2;
        Object object = this.cb().d.M;
        Object var2_2 = null;
        if (object != null) {
            object = ((ProductsList)object).getProducts();
        } else {
            bl2 = false;
            object = null;
        }
        object = (Collection)object;
        if ((object == null || (bl2 = object.isEmpty())) && (object = this.i1) != null) {
            ai0_2.i((View)object);
        }
        if ((bl2 = Intrinsics.areEqual(object = od3_2.a(), string2 = ld3_2.STORE_LUXE.getStoreId())) && (bl2 = h40_0.Q1())) {
            object = this.q0;
            if (object != null) {
                string2 = null;
                object.setVisibility(0);
            }
            if ((object = this.q0) != null) {
                void var2_4;
                object = this.Va().l();
                string2 = object != null ? ((CartDeliveryAddress)object).getCompleteAddress() : null;
                if (object != null) {
                    String string3 = ((CartDeliveryAddress)object).getDistrict();
                }
                String string4 = ", ";
                String string5 = n1.a(string2, string4, (String)var2_4);
                Context context = this.getContext();
                if (context != null) {
                    void var11_23;
                    void var10_20;
                    void var2_7;
                    AddressType addressType;
                    string2 = this.getView();
                    AddressWidgetView addressWidgetView = new AddressWidgetView(context, (View)string2, this);
                    if (object == null || (addressType = ((CartDeliveryAddress)object).getAddressType()) == null) {
                        AddressType addressType2 = AddressType.None;
                    }
                    void var8_16 = var2_7;
                    String string6 = od3_2.a();
                    String string7 = "";
                    if (object != null && (string2 = ((CartDeliveryAddress)object).getFirstName()) != null) {
                        String string8 = string2;
                    } else {
                        String string9 = string7;
                    }
                    if (object != null && (object = ((CartDeliveryAddress)object).getPostalCode()) != null) {
                        Object object2 = object;
                    } else {
                        String string10 = string7;
                    }
                    String string11 = "plp screen";
                    int n3 = 64;
                    AddressWidgetView.setData$default(addressWidgetView, (AddressType)var8_16, string5, string6, (String)var10_20, (String)var11_23, string11, null, n3, null);
                }
            }
        }
    }

    public final void ya() {
    }

    public final void yb() {
        boolean bl2 = og1_1.c();
        if (bl2) {
            Object object = this.B;
            if (object != null) {
                object = ((RecyclerView)object).getAdapter();
            } else {
                bl2 = false;
                object = null;
            }
            if (object == null) {
                object = this.Va().l();
                this.Bb((CartDeliveryAddress)object);
            } else {
                this.Ib();
            }
        }
    }

    public final void z0() {
        CardView cardView = this.S0;
        if (cardView != null) {
            ai0_2.B((View)cardView);
        }
        cardView = this.S0;
        int n3 = R$color.color_202020;
        this.Fb(n3, (View)cardView);
        this.Ab();
    }

    public final void z8(CartDeliveryAddress object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "address");
        Object object2 = this.l1;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.k1) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        ((CartDeliveryAddress)object).getPostalCode().toString();
        object2 = AddressType.Address;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        object2 = ((CartDeliveryAddress)object).getFormattedAddress();
        if (object2 == null || (n3 = object2.length()) == 0) {
            object2 = ai0_2.g((CartDeliveryAddress)object);
            ((CartDeliveryAddress)object).setFormattedAddress((String)object2);
        }
        this.Va().F((CartDeliveryAddress)object);
        object2 = this.Va();
        object = ((CartDeliveryAddress)object).getPostalCode();
        ((jo_2)object2).G((String)object);
        this.cb().h();
    }
}

