/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  org.json.JSONObject
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import org.json.JSONObject;

/*
 * Renamed from n32
 */
public final class n32_0
extends rm3_0
implements M82 {
    public LinearLayoutCompat b;
    public LinearLayout c;
    public RecyclerView d;
    public LinearLayoutManager e;
    public View f;
    public final int g;
    public ArrayList h;
    public final ArrayList i;
    public ArrayList j;
    public int k;
    public K43 l;
    public j3_0 m;
    public s82_0 n;
    public J43 o;
    public final NewEEcommerceEventsRevamp p;
    public final NewCustomEventsRevamp q;
    public final String r;
    public final String s;
    public final n32$b t;
    public final n32$a u;

    public n32_0() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        this.g = -1;
        Object object = new ArrayList();
        this.i = object;
        object = AnalyticsManager.Companion;
        this.p = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.q = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.r = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.s = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.t = object = new Object();
        this.u = object = new n32$a(this);
    }

    public final void C(Product product, String string2) {
        s82_0 s82_02 = this.n;
        if (s82_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onProductClickListener");
            s82_02 = null;
        }
        s82_02.Y0(product, string2, true);
    }

    public final void Oa(int n3) {
        int n4 = -1;
        if (n3 > n4) {
            Object object = this.d;
            boolean bl2 = false;
            Object object2 = null;
            if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                n4 = ((RecyclerView$f)object).getItemCount();
            } else {
                n4 = 0;
                object = null;
            }
            if (n3 < n4) {
                object = this.j;
                if (object != null && (object = (PlpProductUIModel)((ArrayList)object).get(n3)) != null) {
                    Object object3 = this.j;
                    if (object3 != null && (object3 = (PlpProductUIModel)((ArrayList)object3).get(n3)) != null) {
                        bl2 = ((PlpProductUIModel)object3).isProductWishlisted();
                    }
                    ((PlpProductUIModel)object).setProductWishlisted(bl2 ^= true);
                }
                if ((object = this.d) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                    ((RecyclerView$f)object).notifyItemChanged(n3);
                }
                object2 = Looper.getMainLooper();
                object = new Handler(object2);
                object2 = new m32_0(this, n3);
                long l2 = 1000L;
                object.postDelayed((Runnable)object2, l2);
            }
        }
    }

    public final void Pa() {
        Object object = this.c;
        Intrinsics.checkNotNull(object);
        int n3 = object.getVisibility();
        if (n3 == 0) {
            int n4;
            object = this.e;
            boolean bl2 = false;
            Object object2 = null;
            if (object != null) {
                n3 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
            } else {
                n3 = 0;
                object = null;
            }
            Object object3 = this.h;
            if (object3 != null && n3 > (n4 = this.k)) {
                Object object4;
                int n7;
                Object object5;
                ArrayList<ArrayList> arrayList = new ArrayList<ArrayList>();
                n4 = this.k;
                if (n4 <= n3) {
                    while (true) {
                        object5 = this.h;
                        Intrinsics.checkNotNull(object5);
                        n7 = ((ArrayList)object5).size();
                        if (n4 < n7) {
                            object5 = this.h;
                            Intrinsics.checkNotNull(object5);
                            ((Product)((ArrayList)object5).get(n4)).setPosition(n4);
                            object5 = this.h;
                            Intrinsics.checkNotNull(object5);
                            object5 = ((ArrayList)object5).get(n4);
                            object4 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                            arrayList.add((ArrayList)object5);
                        }
                        if (n4 == n3) break;
                        ++n4;
                    }
                }
                object3 = new Message();
                ((Message)object3).what = n7 = 1001;
                object5 = new JSONObject();
                object5.put("productImpression", arrayList);
                object4 = this.l;
                Object object6 = null;
                String string2 = "similarSharedVM";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object4 = null;
                }
                object4 = ((K43)object4).g;
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object4);
                object4 = "- similar to half card";
                ((StringBuilder)charSequence).append((String)object4);
                charSequence = ((StringBuilder)charSequence).toString();
                object5.put("listName", (Object)charSequence);
                String string3 = "NA";
                object5.put("sizeText", (Object)string3);
                charSequence = "isPLP";
                object5.put((String)charSequence, false);
                object2 = this.l;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object2 = null;
                }
                object2 = ((K43)object2).g;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append((String)object4);
                object2 = ((StringBuilder)charSequence).toString();
                object4 = "screenName";
                object5.put((String)object4, object2);
                object2 = this.l;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object2 = null;
                }
                if ((object2 = ((K43)object2).g) == null) {
                    object2 = "pdp screen";
                }
                object4 = "screenType";
                object5.put((String)object4, object2);
                ((Message)object3).obj = object5;
                object2 = AnalyticsGAEventHandler.Companion.getInstance();
                object2.sendMessage((Message)object3);
                bl2 = arrayList.isEmpty() ^ true;
                if (bl2) {
                    object5 = GAEcommerceEvents.INSTANCE;
                    object2 = this.l;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object6 = object2;
                    }
                    object2 = ((K43)object6).g;
                    object3 = " - halfcard - similar products widget";
                    object4 = Ft2.a((String)object2, (String)object3);
                    int n8 = 8;
                    string3 = null;
                    object6 = null;
                    string2 = null;
                    GAEcommerceEvents.pushProductListImpressionData$default((GAEcommerceEvents)object5, arrayList, (String)object4, false, null, n8, null);
                }
                this.k = ++n3;
            }
        }
    }

    public final void R4(Product product, String string2) {
        s82_0 s82_02 = this.n;
        if (s82_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onProductClickListener");
            s82_02 = null;
        }
        s82_02.x4(product, string2, true);
    }

    public final void S6(String object, int n3, Product product, String string2, SaleGAData saleGAData, String string3) {
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onProductClickListener");
            object = null;
        }
        object.F(product, n3, "Similar Products");
    }

    public final void h9(Product product, String string2) {
    }

    public final void n0() {
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = this.getParentFragment();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.pdp.callbacks.OnProductClickListener");
        this.n = object2 = (s82_0)object2;
        object2 = this.getParentFragment();
        String string2 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.SimilarPopListener";
        Intrinsics.checkNotNull(object2, string2);
        this.o = object2 = (J43)object2;
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.m = object;
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        if (object != null) {
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            object = oh2_0.a((Fragment)object, (String)object2, (rd3_0)object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
            object2 = K43.class;
            String string2 = "modelClass";
            object = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object, (Class)object2, string2);
            object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.l = object = (K43)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
        if ((object = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("similarSharedVM");
            object = null;
        }
        object = ((K43)object).g;
        String string3 = kp1_0.c("similar to half card-", (String)object);
        GTMEvents.gtmEventsToGaWithCategory$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "suggestion widget", "suggestion_widget_view", "suggestions viewed", "halfcard - similar products widget", string3, null, 32, null);
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        k32_0 k32_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)k32_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.stl_popup_fragment_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        J43 j43 = this.o;
        if (j43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("similarPopListener");
            j43 = null;
        }
        j43.g0();
    }

    public final void onResume() {
        super.onResume();
        Object object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("similarSharedVM");
            object = null;
        }
        object = ((K43)object).g;
        String string2 = kp1_0.c("similar to half card-", (String)object);
        String string3 = this.s;
        NewCustomEventsRevamp newCustomEventsRevamp = this.q;
        String string4 = this.r;
        newCustomEventsRevamp.newPushCustomScreenView(string2, "halfcard screen", string4, null, string3);
    }

    public final void onStop() {
        super.onStop();
        Object object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("similarSharedVM");
            object = null;
        }
        object = ((K43)object).g;
        object = kp1_0.c("similar to half card-", (String)object);
        this.p.setPreviousScreenData((String)object, "halfcard screen");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block84: {
            block85: {
                block82: {
                    var3_3 = this;
                    var4_4 = var1_1;
                    var5_5 = 0;
                    var6_6 = null;
                    Intrinsics.checkNotNullParameter(var1_1, "view");
                    super.onViewCreated(var1_1, var2_2);
                    var7_7 = R$id.similar_products_layout;
                    var8_8 /* !! */  = (LinearLayout)var1_1.findViewById(var7_7);
                    this.c = var8_8 /* !! */ ;
                    var7_7 = R$id.return_divider;
                    var8_8 /* !! */  = var1_1.findViewById(var7_7);
                    this.f = var8_8 /* !! */ ;
                    var9_9 = 8;
                    if (var8_8 /* !! */  != null) {
                        var8_8 /* !! */ .setVisibility(var9_9);
                    }
                    var7_7 = R$id.similar_to_compose;
                    var8_8 /* !! */  = (ComposeView)var4_4.findViewById(var7_7);
                    var7_7 = R$id.similar_products_list_item;
                    var8_8 /* !! */  = (RecyclerView)var4_4.findViewById(var7_7);
                    var3_3.d = var8_8 /* !! */ ;
                    var7_7 = R$id.close_stl;
                    var8_8 /* !! */  = (AjioAspectRatioImageView)var4_4.findViewById(var7_7);
                    if (var8_8 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("closeButton");
                        var7_7 = 0;
                        var8_8 /* !! */  = null;
                    }
                    var11_11 = 2;
                    var10_10 = new wh1_2(var3_3, var11_11);
                    var8_8 /* !! */ .setOnClickListener((View.OnClickListener)var10_10);
                    var7_7 = R$id.parent_layout;
                    var8_8 /* !! */  = (LinearLayoutCompat)var4_4.findViewById(var7_7);
                    var3_3.b = var8_8 /* !! */ ;
                    var10_10 = Looper.getMainLooper();
                    var8_8 /* !! */  = new Handler((Looper)var10_10);
                    var10_10 = new j32(var3_3);
                    var12_12 = 300L;
                    var8_8 /* !! */ .postDelayed((Runnable)var10_10, var12_12);
                    var8_8 /* !! */  = var3_3.l;
                    var10_10 = "similarSharedVM";
                    if (var8_8 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                        var7_7 = 0;
                        var8_8 /* !! */  = null;
                    }
                    var8_8 /* !! */  = var8_8 /* !! */ .c;
                    var14_13 = var3_3.l;
                    if (var14_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                        var11_11 = 0;
                        var14_13 = null;
                    }
                    var14_13 = var14_13.d;
                    var8_8 /* !! */  = n1.a((String)var8_8 /* !! */ , ": ", (String)var14_13);
                    var11_11 = R$id.sim_prod_name;
                    var14_13 = var4_4.findViewById(var11_11);
                    var15_14 = "findViewById(...)";
                    Intrinsics.checkNotNullExpressionValue(var14_13, (String)var15_14);
                    ((AjioTextView)var14_13).setText((CharSequence)var8_8 /* !! */ );
                    var7_7 = R$id.productImg;
                    var8_8 /* !! */  = var4_4.findViewById(var7_7);
                    Intrinsics.checkNotNullExpressionValue(var8_8 /* !! */ , (String)var15_14);
                    var8_8 /* !! */  = (ImageView)var8_8 /* !! */ ;
                    var14_13 = var3_3.l;
                    if (var14_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                        var11_11 = 0;
                        var14_13 = null;
                    }
                    if ((var14_13 = var14_13.e) != null) {
                        var8_8 /* !! */ .setVisibility(0);
                        var14_13 = var14_13.getImages();
                        if (var14_13 != null) {
                            var14_13 = var14_13.iterator();
                            while ((var16_15 = var14_13.hasNext()) != 0) {
                                var15_14 = (ProductImage)var14_13.next();
                                var17_16 = var15_14.getFormat();
                                var18_17 = TextUtils.isEmpty((CharSequence)var17_16);
                                if (var18_17 != 0 || (var18_17 = Intrinsics.areEqual(var17_16 = var15_14.getFormat(), var19_18 = "product")) == 0) continue;
                                var14_13 = new da$a();
                                var14_13.a = var18_17 = R$drawable.component_placeholder;
                                var14_13.b = var18_17;
                                var17_16 = UrlHelper.Companion.getInstance();
                                var15_14 = var15_14.getUrl();
                                var14_13.n = var15_14 = var17_16.getImageUrl((String)var15_14);
                                var14_13.u = var8_8 /* !! */ ;
                                var14_13.a();
                                break block82;
                            }
                            var11_11 = R$drawable.product_cell_placeholder;
                            var8_8 /* !! */ .setImageResource(var11_11);
                            var11_11 = R$string.acc_icon_product_placeholder;
                            var14_13 = hv3_0.K(var11_11);
                            var8_8 /* !! */ .setContentDescription((CharSequence)var14_13);
                        }
                    }
                }
                var4_4 = var1_1.getContext();
                Intrinsics.checkNotNull(var4_4);
                var8_8 /* !! */  = new LinearLayoutManager((Context)var4_4, 0, false);
                var3_3.e = var8_8 /* !! */ ;
                var4_4 = var3_3.d;
                if (var4_4 != null) {
                    var4_4.setNestedScrollingEnabled(false);
                }
                if ((var4_4 = var3_3.d) != null) {
                    var8_8 /* !! */  = var3_3.e;
                    var4_4.setLayoutManager((RecyclerView$o)var8_8 /* !! */ );
                }
                if ((var4_4 = var3_3.d) != null) {
                    var4_4.clearOnScrollListeners();
                }
                if ((var4_4 = var3_3.d) != null) {
                    var8_8 /* !! */  = var3_3.u;
                    var4_4.addOnScrollListener((RecyclerView$s)var8_8 /* !! */ );
                }
                if ((var4_4 = var3_3.l) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var20_19 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.a) == null || (var7_7 = var4_4.size()) <= 0) break block84;
                var7_7 = xx_2.h((List)var4_4);
                var11_11 = 240;
                if (var7_7 < 0) break block85;
                var16_15 = 0;
                var15_14 = null;
                var18_17 = 0;
                var17_16 = null;
                var21_20 = false;
                var19_18 = null;
                var22_21 = false;
                var23_22 = false;
                var24_23 = false;
                var25_24 = false;
                var26_25 = false;
                var27_26 = false;
                while (true) {
                    block83: {
                        block86: {
                            block87: {
                                var28_27 = var4_4.get(var16_15);
                                var6_6 = "get(...)";
                                Intrinsics.checkNotNullExpressionValue(var28_27, (String)var6_6);
                                var28_27 = (Product)var28_27;
                                if (var18_17 == 0 && (var5_5 = (int)h40_0.Q1()) != 0) {
                                    var6_6 = h40_0.a.g0();
                                    if (var6_6 != null) {
                                        var29_28 = var28_27.getFnlColorVariantData();
                                        if (var29_28 != null) {
                                            var30_29 = var29_28 = var29_28.getDeliverySlaTag();
                                        } else {
                                            var31_30 = 0;
                                            var30_29 = null;
                                        }
                                        var6_6 = (String)var6_6.get(var30_29);
                                    } else {
                                        var5_5 = 0;
                                        var6_6 = null;
                                    }
                                    if (var6_6 != null && (var5_5 = var6_6.length()) != 0) {
                                        var11_11 += 20;
                                        var18_17 = 1;
                                    }
                                }
                                if (!var21_20 && (var6_6 = var28_27.getPrice()) != null) {
                                    var11_11 += 20;
                                    var21_20 = true;
                                }
                                if (var22_21) break block83;
                                var5_5 = (int)var28_27.isDODEnabled();
                                if (var5_5 == 0) break block86;
                                var32_31 = var28_27.getDodEndTime();
                                var6_6 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                                var34_32 = var6_6.getTimeInMillis();
                                cfr_temp_0 = var34_32 - var32_31;
                                var5_5 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var5_5 >= 0) break block87;
                                var11_11 += 18;
                                var22_21 = true;
                                var25_24 = true;
                                break block83;
                            }
                            var6_6 = tr2_2.a;
                            var5_5 = (int)tr2_2.t(og1_1.c());
                            if (var5_5 != 0 || (var6_6 = var28_27.getOfferPrice()) == null) ** GOTO lbl191
                            var6_6 = h40_0.a;
                            var5_5 = (int)h40_0.L1();
                            if (var5_5 == 0) ** GOTO lbl191
                            var6_6 = var28_27.getOfferPrice();
                            if (var6_6 != null) {
                                var6_6 = var6_6.getFormattedValue();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            var6_6 = qz2_0.n(var6_6);
                            var30_29 = var28_27.getPrice();
                            if (var30_29 != null) {
                                var30_29 = var30_29.getFormattedValue();
                            } else {
                                var31_30 = 0;
                                var30_29 = null;
                            }
                            var30_29 = qz2_0.n((String)var30_29);
                            var5_5 = (int)Intrinsics.areEqual(var6_6, var30_29);
                            if (var5_5 != 0) ** GOTO lbl191
lbl188:
                            // 2 sources

                            while (true) {
                                var11_11 += 18;
                                var22_21 = true;
lbl191:
                                // 7 sources

                                while (true) {
                                    var25_24 = false;
                                    break block83;
                                    break;
                                }
                                break;
                            }
                        }
                        var6_6 = tr2_2.a;
                        var5_5 = (int)tr2_2.t(og1_1.c());
                        if (var5_5 != 0 || (var6_6 = var28_27.getOfferPrice()) == null) ** GOTO lbl191
                        var6_6 = h40_0.a;
                        var5_5 = (int)h40_0.L1();
                        if (var5_5 == 0) ** GOTO lbl191
                        var6_6 = var28_27.getOfferPrice();
                        if (var6_6 != null) {
                            var6_6 = var6_6.getFormattedValue();
                        } else {
                            var5_5 = 0;
                            var6_6 = null;
                        }
                        var6_6 = qz2_0.n((String)var6_6);
                        var30_29 = var28_27.getPrice();
                        if (var30_29 != null) {
                            var30_29 = var30_29.getFormattedValue();
                        } else {
                            var31_30 = 0;
                            var30_29 = null;
                        }
                        if ((var5_5 = (int)Intrinsics.areEqual(var6_6, var30_29 = qz2_0.n((String)var30_29))) == 0) ** break;
                        ** continue;
                        ** continue;
                    }
                    if (!var23_22) {
                        var6_6 = z40_0.Companion;
                        var6_6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var6_6).a;
                        var30_29 = "plp_sizes_enable";
                        var5_5 = (int)var6_6.a((String)var30_29);
                        if (var5_5 != 0 && (var6_6 = var28_27.getProductSizeData()) != null) {
                            var6_6 = var28_27.getProductSizeData();
                            Intrinsics.checkNotNull(var6_6);
                            var6_6 = var6_6.getSizeVariants();
                            if (var6_6 != null) {
                                var6_6 = var28_27.getProductSizeData();
                                Intrinsics.checkNotNull(var6_6);
                                var6_6 = var6_6.getSizeVariants();
                                Intrinsics.checkNotNull(var6_6);
                                var5_5 = var6_6.size();
                                if (var5_5 > 0) {
                                    var11_11 += 23;
                                    var23_22 = true;
                                }
                            }
                        }
                    }
                    if (var24_23 || var25_24) ** GOTO lbl-1000
                    var6_6 = tr2_2.a;
                    var5_5 = (int)tr2_2.t(og1_1.c());
                    if (var5_5 != 0) {
                        var6_6 = var28_27.getPrice();
                        if (var6_6 != null) {
                            var6_6 = var6_6.getValue();
                        } else {
                            var5_5 = 0;
                            var6_6 = null;
                        }
                        var30_29 = var28_27.getOfferPrice();
                        if (var30_29 != null && (var30_29 = var30_29.getPriceReveal()) != null) {
                            var30_29 = var30_29.getBestPrice();
                        } else {
                            var31_30 = 0;
                            var30_29 = null;
                        }
                        var36_33 = var28_27.getOfferPrice();
                        if (var36_33 != null) {
                            var36_33 = var36_33.getValue();
                            var37_34 = var4_4;
                            var38_35 /* !! */  = var36_33;
                        } else {
                            var37_34 = var4_4;
                            var39_36 = 0;
                            var38_35 /* !! */  = null;
                        }
                        var4_4 = ScreenType.SCREEN_HOME;
                        var4_4 = tr2_2.f(var6_6, (Float)var30_29, (String)var38_35 /* !! */ , (ScreenType)var4_4);
                        if (var4_4 != null) {
                            var11_11 += 46;
                            var24_23 = true;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var37_34 = var4_4;
                    }
                    if (!var26_25) {
                        var4_4 = var3_3.l;
                        if (var4_4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                            var20_19 = 0;
                            var4_4 = null;
                        }
                        if ((var20_19 = (int)Intrinsics.areEqual(var4_4 = var4_4.f, var6_6 = Boolean.TRUE)) != 0) {
                            var11_11 += 21;
                            var26_25 = true;
                        }
                    }
                    if (!var27_26) {
                        var4_4 = var28_27.getOfferPrice();
                        if (var4_4 != null) {
                            var4_4 = var4_4.getGiftAvailable();
                            var6_6 = Boolean.TRUE;
                            var20_19 = (int)Intrinsics.areEqual(var4_4, var6_6);
                        } else {
                            var20_19 = 0;
                            var4_4 = null;
                        }
                        if (var20_19 != 0 && (var20_19 = (int)mz3_0.z()) != 0) {
                            var11_11 += 22;
                            var27_26 = true;
                        }
                    }
                    if (var16_15 == var7_7) break;
                    var20_19 = 1;
                    var16_15 += var20_19;
                    var4_4 = var37_34;
                    var5_5 = 0;
                    var6_6 = null;
                }
            }
            if ((var4_4 = var3_3.d) != null && (var4_4 = var4_4.getLayoutParams()) != null) {
                var6_6 = hv3_0.a;
                var38_35 /* !! */  = this.requireContext();
                var8_8 /* !! */  = "requireContext(...)";
                Intrinsics.checkNotNullExpressionValue(var38_35 /* !! */ , (String)var8_8 /* !! */ );
                var6_6.getClass();
                var4_4.height = var5_5 = hv3_0.O(var11_11, var38_35 /* !! */ );
            }
        }
        if ((var4_4 = var3_3.i) != null) {
            var4_4.clear();
        }
        if ((var6_6 = var3_3.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var5_5 = 0;
            var6_6 = null;
        }
        if ((var6_6 = var6_6.a) != null) {
            var6_6 = var6_6.iterator();
            var16_15 = 0;
            var15_14 = null;
            while ((var39_36 = var6_6.hasNext()) != 0) {
                var38_35 /* !! */  = var6_6.next();
                var7_7 = 1;
                var9_9 = var16_15 + 1;
                if (var16_15 >= 0) {
                    var14_13 = var38_35 /* !! */ ;
                    var14_13 = (Product)var38_35 /* !! */ ;
                    var21_20 = false;
                    var19_18 = null;
                    var22_21 = false;
                    var18_17 = 0;
                    var17_16 = null;
                    var23_22 = 60 != 0;
                    var38_35 /* !! */  = n00.c((Product)var14_13, var16_15, null, null, false, (int)var23_22);
                    if (var4_4 != null) {
                        var4_4.add(var38_35 /* !! */ );
                    }
                    var16_15 = var9_9;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        if ((var6_6 = var3_3.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var5_5 = 0;
            var6_6 = null;
        }
        var6_6.b = var4_4;
        var4_4 = var3_3.l;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var20_19 = 0;
            var4_4 = null;
        }
        var4_4 = var4_4.a;
        var6_6 = var3_3.l;
        if (var6_6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var5_5 = 0;
            var6_6 = null;
        }
        var6_6 = var6_6.b;
        var39_36 = 15;
        var7_7 = 4;
        if (var6_6 != null && var4_4 != null && (var9_9 = var6_6.size()) > var7_7) {
            var9_9 = var6_6.size();
            if (var9_9 > var39_36) {
                var9_9 = var6_6.size();
                var6_6.subList(var39_36, var9_9).clear();
                var9_9 = var4_4.size();
                var28_27 = var4_4.subList(var39_36, var9_9);
                var28_27.clear();
            }
            if ((var9_9 = (int)og1_1.c()) != 0 && (var28_27 = var3_3.c) != null) {
                var31_30 = hv3_0.m(R$color.luxe_color_121212);
                var28_27.setBackgroundColor(var31_30);
            }
            var3_3.h = var4_4;
            var3_3.j = var6_6;
            var6_6 = var3_3.c;
            Intrinsics.checkNotNull(var6_6);
            var9_9 = 0;
            var6_6.setVisibility(0);
            var28_27 = var3_3.n;
            if (var28_27 == null) {
                var28_27 = "onProductClickListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)var28_27);
                var16_15 = 0;
                var15_14 = null;
            } else {
                var15_14 = var28_27;
            }
            var17_16 = var3_3.h;
            var19_18 = var3_3.j;
            var22_21 = og1_1.c();
            var28_27 = var3_3.l;
            if (var28_27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                var9_9 = 0;
                var28_27 = null;
            }
            var28_27 = var28_27.f;
            var28_27 = var3_3.l;
            if (var28_27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                var9_9 = 0;
                var28_27 = null;
            }
            var28_27 = var28_27.g;
            var23_22 = true;
            var14_13 = var6_6;
            var6_6 = new q32_0((s82_0)var15_14, (List)var17_16, (List)var19_18, var22_21, var23_22);
            cp_1.Companion.getClass();
            cp$a.e().getClass();
            var28_27 = z40_0.Companion;
            var28_27 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var28_27).a;
            var30_29 = "links_similar_scroll_enable";
            var9_9 = (int)var28_27.a((String)var30_29);
            if (var9_9 != 0 && (var9_9 = (var28_27 = this.getParentFragment()) instanceof NewProductDetailsFragment) != 0 && (var9_9 = (int)og1_1.c()) == 0) {
                var28_27 = var3_3.l;
                if (var28_27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var9_9 = 0;
                    var28_27 = null;
                }
                var6_6.g = var28_27 = var28_27.e;
                var28_27 = var3_3.o;
                if (var28_27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("similarPopListener");
                    var9_9 = 0;
                    var28_27 = null;
                }
                var6_6.h = var28_27;
            }
            var28_27 = var3_3.d;
            Intrinsics.checkNotNull(var28_27);
            var28_27.setAdapter((RecyclerView$f)var6_6);
            var5_5 = var3_3.g;
            if (var5_5 == 0) {
                var28_27 = Looper.getMainLooper();
                var6_6 = new Handler((Looper)var28_27);
                var31_30 = 0;
                var30_29 = null;
                var28_27 = new l32(var3_3, 0);
                var12_12 = 500L;
                var6_6.postDelayed((Runnable)var28_27, var12_12);
            }
            var9_9 = 0;
            var28_27 = null;
        } else {
            var6_6 = var3_3.d;
            Intrinsics.checkNotNull(var6_6);
            var9_9 = 0;
            var28_27 = null;
            var6_6.setAdapter(null);
            var6_6 = var3_3.c;
            Intrinsics.checkNotNull(var6_6);
            var31_30 = 8;
            var6_6.setVisibility(var31_30);
            var3_3.h = null;
        }
        if (var4_4 != null) {
            var6_6 = kotlinx.coroutines.d.a(ir0_2.a);
            var30_29 = new o32_0((ArrayList)var4_4, null);
            var20_19 = 3;
            Ae3.d((i90_0)var6_6, null, null, (Function2)var30_29, var20_19);
        }
        if ((var4_4 = var3_3.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var20_19 = 0;
            var4_4 = null;
        }
        if ((var4_4 = var4_4.a) != null && (var5_5 = var4_4.size()) > var7_7) {
            var5_5 = var4_4.size();
            if (var5_5 > var39_36) {
                var5_5 = var4_4.size();
                var6_6 = var4_4.subList(var39_36, var5_5);
                var6_6.clear();
            }
            var5_5 = var4_4.size();
            var38_35 /* !! */  = null;
            for (var39_36 = 0; var39_36 < var5_5; var39_36 += var7_7) {
                var8_8 /* !! */  = (Product)var4_4.get(var39_36);
                var8_8 /* !! */ .setPosition(var39_36);
                var7_7 = 1;
            }
        }
        var6_6 = new Message();
        var6_6.what = var39_36 = 1001;
        var38_35 /* !! */  = new JSONObject();
        if (var4_4 == null) {
            var4_4 = new ArrayList();
        }
        var8_8 /* !! */  = "productImpression";
        var38_35 /* !! */ .put((String)var8_8 /* !! */ , var4_4);
        var4_4 = var3_3.l;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var20_19 = 0;
            var4_4 = null;
        }
        var4_4 = var4_4.g;
        var8_8 /* !! */  = new StringBuilder();
        var8_8 /* !! */ .append((String)var4_4);
        var4_4 = "- similar to half card";
        var8_8 /* !! */ .append((String)var4_4);
        var8_8 /* !! */  = var8_8 /* !! */ .toString();
        var38_35 /* !! */ .put("listName", (Object)var8_8 /* !! */ );
        var38_35 /* !! */ .put("sizeText", (Object)"NA");
        var31_30 = 0;
        var30_29 = null;
        var38_35 /* !! */ .put("isPLP", false);
        var8_8 /* !! */  = var3_3.l;
        if (var8_8 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
            var31_30 = 0;
            var30_29 = null;
        } else {
            var30_29 = var8_8 /* !! */ ;
        }
        var8_8 /* !! */  = var30_29.g;
        var28_27 = new StringBuilder();
        var28_27.append((String)var8_8 /* !! */ );
        var28_27.append((String)var4_4);
        var4_4 = var28_27.toString();
        var38_35 /* !! */ .put("screenName", var4_4);
        var38_35 /* !! */ .put("screenType", (Object)"halfcard screen");
        var6_6.obj = var38_35 /* !! */ ;
        var4_4 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)var6_6);
        var6_6 = var3_3.t;
        var4_4.setOnGAEventHandlerListener((OnGAEventHandlerListener)var6_6);
    }
}

