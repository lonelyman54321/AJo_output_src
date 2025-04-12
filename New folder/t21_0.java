/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from t21
 */
public final class t21_0
extends BottomSheetDialogFragment
implements nw_0,
View.OnClickListener,
s82_0,
J43,
hy0_0 {
    public static final t21$a Companion;
    public final hh3_2 A;
    public final hh3_2 B;
    public int C;
    public int D;
    public WrapperLinearLayoutManager E;
    public String F;
    public String G;
    public final int a;
    public final hh3_2 b;
    public j3_0 c;
    public lz1_1 d;
    public ea2_1 e;
    public A71 f;
    public nm_1 g;
    public ky1_0 h;
    public AjioLoaderView i;
    public np_2 j;
    public View k;
    public TextView l;
    public TextView m;
    public RecyclerView n;
    public ImageView o;
    public om_1 p;
    public t21$b q;
    public View r;
    public final NewCustomEventsRevamp s;
    public final NewEEcommerceEventsRevamp t;
    public ArrayList u;
    public final ArrayList v;
    public boolean w;
    public String x;
    public Product y;
    public n32_0 z;

    static {
        t21$a t21$a;
        Companion = t21$a = new Object();
    }

    public t21_0() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        this.a = 1;
        Object object = new m21_0(this);
        this.b = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.s = newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.t = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = new ArrayList();
        this.u = object;
        object = new ArrayList();
        this.v = object;
        object = new n21_0(this, 0);
        this.A = object = yr1_2.b((Function0)object);
        object = new o21_0(this, 0);
        this.B = object = yr1_2.b((Function0)object);
        this.C = -1;
    }

    public final void D1() {
    }

    public final void F(Product product, int n3, String string2) {
        t21_0 t21_02 = this;
        Product product2 = product;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "listType");
        tj2_0.e(AnalyticsManager.Companion, "Show PDP", "closet List", "closet screen");
        Object object2 = object = this.t;
        object = ((NewEEcommerceEventsRevamp)object).getEE_SELECT_ITEM();
        Object object3 = this.t;
        String string3 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        String string4 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        object3 = "Closet List";
        String string5 = "closet screen";
        String string6 = "closet screen";
        long l2 = 0L;
        int n4 = 4192848;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, (String)object, (String)object3, null, string5, false, string3, string6, null, string4, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
        object2 = null;
        String string7 = product != null ? product.getSourceStoreId() : null;
        object = t21_02.e;
        if (object == null) {
            object = "pdpListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        eA2$a.a((ea2_1)object2, product2, string7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void F3(Integer object, String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "action");
        String string3 = "Add to Bag";
        Intrinsics.checkNotNullParameter(string3, "screenName");
        String string4 = "closet screen";
        object = object != null && (n3 = ((Integer)object).intValue()) == 0 ? AnalyticsManager.Companion : AnalyticsManager.Companion;
        tj2_0.e((AnalyticsManager$Companion)object, string2, string3, string4);
    }

    public final void G2(Product object) {
        if (object != null) {
            zz_2.a((Product)object);
            Object object2 = h40_0.a;
            object2 = h40_0.r();
            zz_2.b((Product)object, (String)object2);
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            cp_12.getClass();
            object = cp_1.i((Product)object);
            object = analyticsData$Builder.eventMap((HashMap)object).build();
            ((CleverTapEvents)object2).pushNotifyMeEvent((AnalyticsData)object);
            object = h40_0.r();
            object2 = null;
            analyticsData$Builder = null;
            hv3_0.o0(0, (String)object, null);
        }
    }

    public final void J0(int n3) {
        int n4 = this.C;
        int n7 = -1;
        if (n4 > n7) {
            np_2 np_22 = this.j;
            Object object = null;
            String string2 = "closetListAdaptor";
            if (np_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                np_22 = null;
            }
            if (n4 < (n7 = np_22.getItemCount()) && (n4 = this.C) != n3) {
                Object object2 = (Product)this.u.get(n4);
                n7 = 0;
                np_22 = null;
                ((Product)object2).setShowSizeLayout(false);
                object2 = this.j;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object = object2;
                }
                n4 = this.C;
                ((RecyclerView$f)object).notifyItemChanged(n4);
            }
        }
        this.C = n3;
    }

    public final void K7(Product product, String string2) {
        t21_0 t21_02 = this;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(string2, "gaName");
        Object object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string3 = "Show PDP";
        String string4 = "closet List";
        ((GTMEvents)object).pushButtonTapEvent(string3, string4, "closet screen");
        String string5 = product.getSourceStoreId();
        object = "luxe";
        boolean bl2 = ((String)object).equalsIgnoreCase(string5);
        int n3 = 0;
        if (bl2) {
            bl2 = true;
            og1_1.g(bl2, false);
        } else {
            og1_1.g(false, false);
        }
        n3 = product.getPosition();
        object = t21_02.t;
        string3 = ((NewEEcommerceEventsRevamp)object).getEE_SELECT_ITEM();
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = t21_02.t;
        string4 = null;
        String string8 = "bag screen";
        String string9 = "bag screen";
        String string10 = string5;
        string5 = null;
        long l2 = 0L;
        int n4 = 4192848;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object, product, n3, string3, string2, null, string8, false, string6, string9, null, string7, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
        object = t21_02.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpListener");
            bl2 = false;
            object = null;
        }
        eA2$a.a((ea2_1)object, product, string10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Oa() {
        var1_1 /* !! */  = tr2_2.a;
        var2_2 = og1_1.b();
        var3_3 = 0;
        var4_4 = tr2_2.y(false);
        if (!var4_4 || !(var4_4 = tr2_2.i())) ** GOTO lbl-1000
        if (!var2_2) ** GOTO lbl-1000
        var1_1 /* !! */  = tr2_2.d();
        var2_2 = var1_1 /* !! */ .b;
        if (var2_2) lbl-1000:
        // 2 sources

        {
            var2_2 = true;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var1_1 /* !! */  = null;
        }
        if (!var2_2 && !(var2_2 = tr2_2.l((ScreenType)(var1_1 /* !! */  = ScreenType.SCREEN_WISHLIST)))) {
            var1_1 /* !! */  = this.r;
            if (var1_1 /* !! */  != null) {
                var3_3 = 8;
                var1_1 /* !! */ .setVisibility(var3_3);
            }
        } else {
            var1_1 /* !! */  = this.r;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */ .setVisibility(0);
            }
            var1_1 /* !! */  = this.r;
            var3_3 = og1_1.b();
            ur2_2.a((View)var1_1 /* !! */ , (boolean)var3_3);
        }
    }

    public final void Pa() {
        boolean bl2 = this.isRemoving();
        if (!bl2) {
            AjioLoaderView ajioLoaderView = this.i;
            if (ajioLoaderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
                bl2 = false;
                ajioLoaderView = null;
            }
            ajioLoaderView.stopLoader();
        }
    }

    public final K43 Qa() {
        return (K43)this.B.getValue();
    }

    public final void Ra(String string2, String string3) {
        Object object = this.getContext();
        if (object != null) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                object = null;
            }
            Context context = this.requireContext();
            String string4 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string4);
            int n3 = 1;
            object.showToastNotification(context, string2, n3, string3);
        }
    }

    public final void Sa() {
        ArrayList arrayList = this.u;
        int n3 = arrayList.size();
        int n4 = 2;
        ArrayList arrayList2 = null;
        String string2 = "closetViewAll";
        if (n3 > n4) {
            arrayList = this.l;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                arrayList2 = arrayList;
            }
            n3 = 0;
            arrayList = null;
            arrayList2.setVisibility(0);
        } else {
            arrayList = this.l;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                arrayList2 = arrayList;
            }
            n3 = 4;
            arrayList2.setVisibility(n3);
        }
    }

    public final void Ta(String string2, String string3) {
        Object object = this.getContext();
        if (object != null) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                object = null;
            }
            Context context = this.requireContext();
            String string4 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string4);
            int n3 = 1;
            object.showToastNotification(context, string2, n3, string3);
        }
    }

    public final void V8(Product product, int n3, String string2, HomeRowData homeRowData, int n4) {
    }

    public final void Y0(Product object, String string2, boolean bl2) {
        if (string2 != null && (bl2 = string2.length())) {
            Object object2 = this.c;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                bl2 = false;
                object2 = null;
            }
            object2.startLoader();
            object2 = this.h;
            String string3 = "closetViewModel";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            object2 = ((ky1_0)object2).i;
            ((BH3)object2).c = object;
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            ((ky1_0)object3).l(string2);
        }
    }

    public final void a0(Product product) {
        Object object = this.h;
        String string2 = "closetViewModel";
        String string3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object.getClass();
        Object object2 = "bag screen - wishlist halfcard screen";
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string4 = "wishlist half card - out of stock click";
        String string5 = "show similar";
        String string6 = "wishlist_half_card_interactions";
        String string7 = "bag interactions";
        ((GTMEvents)object3).pushShowSimilarEvent((String)object2, string6, string7, string4, string5);
        this.y = product;
        object3 = object = this.A.getValue();
        object3 = (r43_0)object;
        object2 = product != null ? (object = product.getCode()) : null;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ((ky1_0)object).i();
        object = h40_0.a;
        boolean bl2 = h40_0.c2();
        if ((product == null || (object = product.getCatalogName()) == null) && product != null) {
            product.getCatalog();
        }
        if (product != null) {
            string3 = product.getSourceStoreId();
        }
        r43_0.b((r43_0)object3, (String)object2, bl2, null, null, null, string3, false, 368);
    }

    public final void b1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "linkText");
    }

    public final void g0() {
        this.z = null;
        this.Qa().b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i5(Product iterator) {
        int n3;
        String string2;
        boolean bl2;
        Object object;
        Product product;
        boolean bl3;
        String string3;
        int n4;
        String string4;
        Iterator iterator2;
        Object object2;
        block25: {
            block24: {
                boolean bl4;
                if (iterator == null) return;
                object2 = this.h;
                iterator2 = null;
                string4 = "closetViewModel";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object2 = null;
                }
                object2.getClass();
                string3 = "<set-?>";
                Intrinsics.checkNotNullParameter(iterator, string3);
                ((ky1_0)object2).r = iterator;
                iterator = ((Product)((Object)iterator)).clone();
                Y63.i((Product)((Object)iterator));
                object2 = this.u;
                bl3 = true;
                if (object2 != null && (n4 = ((ArrayList)object2).isEmpty()) == 0) {
                    object2 = this.u.iterator();
                    while (bl4 = object2.hasNext()) {
                        product = (Product)object2.next();
                        object = product.getCode();
                        if (object == null || (bl2 = (boolean)((String)object).equalsIgnoreCase(string2 = ((Product)((Object)iterator)).getCode())) != bl3) continue;
                        object2 = ((Product)((Object)iterator)).getProductOptionVariants();
                        product.setProductOptionVariants((List)object2);
                        object2 = ((Product)((Object)iterator)).getProductOptionVariants();
                        n4 = object2.size();
                        if (n4 != bl3) break block24;
                        object2 = (ProductOptionVariant)((Product)((Object)iterator)).getProductOptionVariants().get(0);
                        n4 = (int)(((ProductOptionVariant)object2).isStockAvailable() ? 1 : 0);
                        break block25;
                    }
                }
                bl4 = false;
                product = null;
            }
            n4 = 0;
            object2 = null;
        }
        object = ((Product)((Object)iterator)).getBaseOptions();
        if (object != null && !(bl2 = object.isEmpty())) {
            object = ((Product)((Object)iterator)).getBaseOptions();
            if (object != null && (object = (ProductOption)object.get(0)) != null) {
                object = ((ProductOption)object).getOptions();
            } else {
                bl2 = false;
                object = null;
            }
            object = (Collection)object;
            if (object != null && !(bl2 = (boolean)object.isEmpty())) {
                if ((iterator = ((Product)((Object)iterator)).getBaseOptions()) != null && (iterator = (ProductOption)iterator.get(0)) != null && (iterator = ((ProductOption)((Object)iterator)).getOptions()) != null) {
                    iterator = (ProductOptionItem)iterator.get(0);
                } else {
                    n3 = 0;
                    iterator = null;
                }
                if (iterator != null) {
                    object = ((ProductOptionItem)((Object)iterator)).getAttributes();
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    iterator = ((ProductOptionItem)((Object)iterator)).getAttributes();
                    Intrinsics.checkNotNull(iterator);
                    iterator = iterator.iterator();
                    while (bl2 = (boolean)iterator.hasNext()) {
                        object = (ProductOptionVariant)iterator.next();
                        string2 = ((ProductOptionVariant)object).getAttributeName();
                        int n7 = "selection1".equalsIgnoreCase(string2);
                        String string5 = "null";
                        if (n7 != 0 && (string2 = ((ProductOptionVariant)object).getAttributeValue()) != null && (n7 = string2.length()) != 0 && (n7 = (int)(kotlin.text.b.i(string2 = ((ProductOptionVariant)object).getAttributeValue(), string5, bl3) ? 1 : 0)) == 0) {
                            this.F = object = ((ProductOptionVariant)object).getAttributeValue();
                            continue;
                        }
                        String string6 = "selection2";
                        string2 = ((ProductOptionVariant)object).getAttributeName();
                        n7 = (int)(string6.equalsIgnoreCase(string2) ? 1 : 0);
                        if (n7 == 0 || (string2 = ((ProductOptionVariant)object).getAttributeValue()) == null || (n7 = string2.length()) == 0 || (n7 = (int)(kotlin.text.b.i(string2 = ((ProductOptionVariant)object).getAttributeValue(), string5, bl3) ? 1 : 0)) != 0) continue;
                        this.G = object = ((ProductOptionVariant)object).getAttributeValue();
                    }
                }
            }
        }
        if (product != null) {
            iterator = product.getVariantOptions();
        } else {
            n3 = 0;
            iterator = null;
        }
        if (product != null && iterator != null && (bl2 = iterator.size()) == bl3 && ((string3 = this.G) != null && !(bl3 = (boolean)kotlin.text.b.k(string3)) || (string3 = this.F) != null && !(bl3 = (boolean)kotlin.text.b.k(string3)))) {
            string3 = this.G;
            if (string3 != null && !(bl3 = (boolean)kotlin.text.b.k(string3))) {
                object2 = this.F;
                if (object2 != null) {
                    n4 = (int)(kotlin.text.b.k((CharSequence)object2) ? 1 : 0);
                }
            } else {
                if (n4 != 0) {
                    iterator = (ProductOptionItem)iterator.get(0);
                    this.t4(product, (ProductOptionItem)((Object)iterator));
                    return;
                }
                n3 = R$string.selected_product_out_of_stock;
                iterator = hv3_0.K(n3);
                hv3_0.o0(0, (String)((Object)iterator), null);
                return;
            }
        }
        if ((object2 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n4 = 0;
            object2 = null;
        }
        object2 = ((ky1_0)object2).r;
        ((Product)object2).setVariantOptions((List)((Object)iterator));
        iterator = this.j;
        if (iterator == null) {
            iterator = "closetListAdaptor";
            Intrinsics.throwUninitializedPropertyAccessException((String)((Object)iterator));
        } else {
            iterator2 = iterator;
        }
        ((RecyclerView$f)((Object)iterator2)).notifyDataSetChanged();
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.c = object2 = (j3_0)object;
            bl2 = object instanceof A71;
            if (bl2) {
                object2 = object;
                this.f = object2 = (A71)object;
                bl2 = object instanceof nm_1;
                String string2 = " must implement CartClosetListener";
                if (bl2) {
                    Object object3 = object;
                    object3 = (nm_1)object;
                    this.g = object3;
                    if (bl2) {
                        this.g = object3;
                        bl2 = object instanceof lz1_1;
                        if (bl2) {
                            object2 = object;
                            this.d = object2 = (lz1_1)object;
                            bl2 = object instanceof ea2_1;
                            if (bl2) {
                                object = (ea2_1)object;
                                this.e = object;
                                return;
                            }
                            object = pn_2.b(object, " Must implement ProductDetailListener");
                            object2 = new ClassCastException((String)object);
                            throw object2;
                        }
                        object = pn_2.b(object, " Must implement LoginListener");
                        object2 = new ClassCastException((String)object);
                        throw object2;
                    }
                    object = pn_2.b(object, string2);
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, string2);
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement HomeListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " Must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.viewAll;
        Object object3 = this.t;
        Object object4 = null;
        Object object5 = "Closet Button";
        String string2 = "halfcard screen";
        String string3 = "closet screen";
        if (n3 == n4) {
            tj2_0.e(AnalyticsManager.Companion, (String)object5, "View All", string3);
            ((NewEEcommerceEventsRevamp)object3).setPreviousScreenData(string3, string2);
            this.dismiss();
            oy1_1.Companion.getClass();
            object = new oy1_1();
            object2 = new Bundle();
            boolean bl2 = true;
            object2.putBoolean("FROM_CART", bl2);
            object.setArguments((Bundle)object2);
            object2 = this.c;
            Object object6 = "activityFragmentListener";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object2 = null;
            }
            if ((object5 = this.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            } else {
                object4 = object5;
            }
            object6 = object4.y();
            object4 = "";
            j3$a.a((j3_0)object2, (Fragment)object6, (Fragment)object, bl2, (String)object4);
        } else {
            n4 = R$id.gotoBag;
            if (n3 == n4) {
                int n7;
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                Object object7 = "Go to Bag";
                ((GTMEvents)object2).pushButtonTapEvent((String)object5, object7, string3);
                object = object.getTag();
                n3 = this.a;
                if (object == null) {
                    object = n3;
                }
                if ((n7 = (object = (Integer)object).intValue()) == 0) {
                    n7 = (int)(this.isAdded() ? 1 : 0);
                    if (n7 != 0) {
                        object = this.i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressView");
                            n7 = 0;
                            object = null;
                        }
                        object.startLoader();
                    }
                    if ((object = this.h) == null) {
                        object = "closetViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object4 = object;
                    }
                    object4.getClass();
                    object = cp_1.Companion;
                    object.getClass();
                    n7 = (int)(cp$a.y() ? 1 : 0);
                    if (n7 != 0) {
                        int n8 = 4;
                        object5 = ((ky1_0)object4).c;
                        string2 = null;
                        int n10 = 10;
                        object = WishListRepo.getWishList$default((WishListRepo)object5, 0, n10, false, n8, null);
                        n4 = 0;
                        object2 = new jy1_0((Hj)object4, 0);
                        object7 = new sy1_1(0, (Function1)object2);
                        int n14 = 1;
                        object2 = new ln_2(object4, n14);
                        object5 = null;
                        object3 = new ty1_1(0, (Function1)object2);
                        object = object.f((o60_0)object7, (o60_0)object3);
                        object2 = ((ky1_0)object4).G;
                        ((t30_0)object2).b((yr0_2)object);
                    }
                } else if (n7 == n3) {
                    ((NewEEcommerceEventsRevamp)object3).setPreviousScreenData(string3, string2);
                    this.dismiss();
                }
            } else {
                int n15 = R$id.cancelBtn;
                if (n3 == n15) {
                    ((NewEEcommerceEventsRevamp)object3).setPreviousScreenData(string3, string2);
                    this.dismiss();
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        String string2;
        block23: {
            block24: {
                int n3;
                Object object2;
                Object object3;
                Object object4;
                boolean bl2;
                block25: {
                    boolean bl3;
                    bl2 = true;
                    super.onCreate((Bundle)object);
                    object = "owner";
                    Intrinsics.checkNotNullParameter(this, (String)object);
                    object4 = this.getViewModelStore();
                    Intrinsics.checkNotNullParameter(this, (String)object);
                    object3 = this.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(this, (String)object);
                    Object object5 = this.getDefaultViewModelCreationExtras();
                    object2 = "store";
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    Object object6 = "factory";
                    Intrinsics.checkNotNullParameter(object3, (String)object6);
                    String string3 = "defaultCreationExtras";
                    Intrinsics.checkNotNullParameter(object5, string3);
                    Object object7 = ky1_0.class;
                    String string4 = "modelClass";
                    object4 = rl3_0.b((rd3_0)object4, (E$b)object3, (Wd0)object5, object7, string4);
                    object3 = "<this>";
                    object5 = sw0_0.a(object7, (String)object3, object7, string4, string4);
                    Intrinsics.checkNotNullParameter(object5, (String)object3);
                    object7 = object5.getQualifiedName();
                    string2 = "Local and anonymous classes can not be ViewModels";
                    if (object7 == null) break block23;
                    String string5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    object7 = string5.concat((String)object7);
                    this.h = object4 = (ky1_0)((pD3)object4).a((yn1_2)object5, (String)object7);
                    object4 = this.getParentFragment();
                    if (object4 != null) {
                        Intrinsics.checkNotNullParameter(object4, (String)object);
                        object5 = object4.getViewModelStore();
                        Intrinsics.checkNotNullParameter(object4, (String)object);
                        object7 = object4.getDefaultViewModelProviderFactory();
                        object = oh2_0.a((Fragment)object4, (String)object, (rd3_0)object5, (String)object2);
                        Intrinsics.checkNotNullParameter(object7, (String)object6);
                        Intrinsics.checkNotNullParameter(object, string3);
                        object4 = om_1.class;
                        object = rl3_0.b((rd3_0)object5, (E$b)object7, (Wd0)object, object4, string4);
                        object4 = sw0_0.a(object4, (String)object3, object4, string4, string4);
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        object3 = object4.getQualifiedName();
                        if (object3 != null) {
                            object3 = string5.concat((String)object3);
                            this.p = object = (om_1)((pD3)object).a((yn1_2)object4, (String)object3);
                        } else {
                            String string6 = string2.toString();
                            object = new IllegalArgumentException(string6);
                            throw object;
                        }
                    }
                    if ((object = this.getArguments()) != null && (n3 = (object = this.requireArguments()).containsKey((String)(object4 = "empty_cart"))) != 0) {
                        object = this.requireArguments();
                        object.getBoolean((String)object4);
                    }
                    object = this.getFragmentManager();
                    object4 = null;
                    if (object != null) {
                        object3 = "cart_list";
                        object = ((FragmentManager)object).E((String)object3);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object3 = new ArrayList();
                    this.u = object3;
                    if (object == null) break block24;
                    object = this.p;
                    object3 = "cartClosetSVM";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object = null;
                    }
                    object = ((om_1)object).a;
                    boolean bl4 = false;
                    object5 = null;
                    if (object != null && (object = ((ProductsList)object).getProducts()) != null) {
                        n3 = object.size();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (n3 <= 0) break block24;
                    object = this.p;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object = null;
                    }
                    if ((object = ((om_1)object).a) != null) {
                        object = ((ProductsList)object).getProducts();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    object2 = this.u;
                    object = (Collection)object;
                    ((ArrayList)object2).addAll(object);
                    object = this.u.iterator();
                    int n4 = 0;
                    object2 = null;
                    while (bl3 = object.hasNext()) {
                        object6 = object.next();
                        int n7 = n4 + 1;
                        if (n4 >= 0) {
                            object6 = (Product)object6;
                            object2 = n00.a;
                            object2 = n00.b((Product)object6);
                            object6 = this.v;
                            ((ArrayList)object6).add(object2);
                            n4 = n7;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    object = this.h;
                    object2 = "closetViewModel";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object = null;
                    }
                    if ((object = ((ky1_0)object).x) == null) break block25;
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object = null;
                    }
                    if ((object = ((ky1_0)object).x) != null && (object = ((ProductsList)object).getPagination()) != null && (n3 = ((Pagination)object).getCurrentPage()) == 0) {
                        bl4 = true;
                    }
                    if (!bl4) break block24;
                }
                if ((object = this.p) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object = null;
                }
                object = ((om_1)object).a;
                object3 = this.h;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object4 = object3;
                }
                ((ky1_0)object4).p((ProductsList)object, bl2);
            }
            return;
        }
        String string7 = string2.toString();
        object = new IllegalArgumentException(string7);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        k21 k212 = new k21((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)k212);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_closet_bottom_list_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_closet_bottom_list_refresh;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        AjioLoaderView ajioLoaderView = this.i;
        if (ajioLoaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
            ajioLoaderView = null;
        }
        ajioLoaderView.stopLoader();
    }

    public final void onDismiss(DialogInterface object) {
        String string2 = "dialog";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onDismiss((DialogInterface)object);
        int n3 = this.isAdded();
        if (n3 != 0) {
            object = this.getParentFragment();
            string2 = "cart_list";
            boolean bl2 = false;
            Object object2 = null;
            if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                object = ((FragmentManager)object).E(string2);
            } else {
                n3 = 0;
                object = null;
            }
            n3 = object instanceof ex1_0;
            if (n3 != 0) {
                object = this.getParentFragment();
                if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                    object2 = ((FragmentManager)object).E(string2);
                }
                object = "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.fragment.NewCartListFragment";
                Intrinsics.checkNotNull(object2, (String)object);
                object2 = (ex1_0)object2;
                n3 = this.w;
                string2 = null;
                if (n3 != 0) {
                    ((ex1_0)object2).sb(false);
                    n3 = 1;
                    ((ex1_0)object2).u0 = n3;
                    kx3_0.a = n3;
                }
                this.C = n3 = -1;
                object = this.u.iterator();
                while (bl2 = object.hasNext()) {
                    object2 = (Product)object.next();
                    ((Product)object2).setShowSizeLayout(false);
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.s.getSV_SOURCE_SCREEN();
        bundle.putString((String)object, "bag");
        object = this.t;
        String string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.s.newPushCustomScreenView("bag screen - wishlist halfcard screen", "halfcard screen", string2, bundle, string3);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        Object object3;
        int n7 = 1;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n8 = 0;
        object2 = null;
        this.w = false;
        int n10 = og1_1.b();
        if (n10 != 0) {
            n10 = R$id.parent_layout;
            object4 = (LinearLayout)object.findViewById(n10);
        } else {
            n10 = R$id.parent_layout;
            object4 = (ConstraintLayout)object.findViewById(n10);
        }
        n10 = R$id.closetRv;
        object4 = (RecyclerView)object.findViewById(n10);
        this.n = object4;
        n10 = R$id.halfClosetProgress;
        object4 = (AjioLoaderView)object.findViewById(n10);
        this.i = object4;
        n10 = R$id.emptyWishlistContainer;
        object4 = object.findViewById(n10);
        this.k = object4;
        n10 = R$id.viewAll;
        object4 = (TextView)object.findViewById(n10);
        this.l = object4;
        n10 = R$id.gotoBag;
        object4 = (TextView)object.findViewById(n10);
        this.m = object4;
        n10 = R$id.cancelBtn;
        object4 = (ImageView)object.findViewById(n10);
        this.o = object4;
        Object object5 = "cancelBtn";
        Integer n14 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object4 = null;
        }
        int n15 = R$string.close_txt;
        String string2 = hv3_0.K(n15);
        object4.setContentDescription((CharSequence)string2);
        n10 = R$id.saleHeader;
        object4 = object.findViewById(n10);
        this.r = object4;
        object4 = new t21$b(this);
        this.q = object4;
        n10 = (int)(og1_1.b() ? 1 : 0);
        string2 = "closetViewAll";
        if (n10 != 0) {
            object4 = this.l;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n10 = 0;
                object4 = null;
            }
            if ((object3 = this.l) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object3 = null;
            }
            n4 = object3.getPaintFlags() | 8;
            object4.setPaintFlags(n4);
        }
        if ((object4 = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n10 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        object4 = this.o;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        object4 = this.m;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyClosetBtn");
            n10 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        object5 = this.getContext();
        object4 = new WrapperLinearLayoutManager((Context)object5, 0);
        this.E = object4;
        object4 = this.n;
        object5 = "closetList";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object4 = null;
        }
        object3 = this.E;
        ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object3);
        ArrayList arrayList = this.u;
        ArrayList arrayList2 = this.v;
        t21$b t21$b = this.q;
        Intrinsics.checkNotNull(t21$b);
        Object object6 = object4;
        this.j = object4 = new np_2(this, arrayList, arrayList2, false, t21$b, this);
        object4 = this.n;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object4 = null;
        }
        if ((object3 = this.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetListAdaptor");
            n4 = 0;
            object3 = null;
        }
        ((RecyclerView)object4).setAdapter((RecyclerView$f)object3);
        object4 = this.n;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n10 = 0;
            object4 = null;
        }
        object5 = new t21$c(this);
        ((RecyclerView)object4).addOnScrollListener((RecyclerView$s)object5);
        n10 = R$id.acc_page_name_lyt;
        object = object.findViewById(n10);
        if (object != null) {
            object4 = StringCompanionObject.INSTANCE;
            n10 = R$string.acc_alert_popup;
            object4 = hv3_0.K(n10);
            int n16 = R$string.wish_list;
            object5 = hv3_0.K(n16);
            object3 = new Object[n7];
            object3[0] = object5;
            object5 = Arrays.copyOf(object3, n7);
            object4 = String.format((String)object4, object5);
            object5 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object.setContentDescription((CharSequence)object4);
        }
        object5 = Looper.getMainLooper();
        object4 = new Handler((Looper)object5);
        object5 = new eo_1((View)object, n7);
        long l2 = 100;
        object4.postDelayed((Runnable)object5, l2);
        this.Sa();
        object = ((r43_0)this.A.getValue()).d;
        object4 = this.getViewLifecycleOwner();
        object5 = new p21_0(this);
        object3 = new t21$d((Function1)object5);
        ((LiveData)object).e((mu1_1)object4, (F62)object3);
        object = this.h;
        object4 = "closetViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object = ((ky1_0)object).i.e;
        object5 = this.getViewLifecycleOwner();
        object3 = new q21_0(this, 0);
        object6 = new t21$d((Function1)object3);
        ((LiveData)object).e((mu1_1)object5, (F62)object6);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object = ((ky1_0)object).i.g;
        object5 = this.getViewLifecycleOwner();
        object3 = new r21_0(this);
        object6 = new t21$d((Function1)object3);
        ((LiveData)object).e((mu1_1)object5, (F62)object6);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object = ((ky1_0)object).m;
        object5 = this.getViewLifecycleOwner();
        object3 = new s21_0(this, 0);
        ((LiveData)object).e((mu1_1)object5, (F62)object3);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object = ((ky1_0)object).j;
        object5 = new ey0_2(this, n7);
        object3 = new t21$d((Function1)object5);
        ((LiveData)object).e(this, (F62)object3);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object = ((ky1_0)object).l;
        object5 = new l21_0(this, 0);
        object3 = new t21$d((Function1)object5);
        ((LiveData)object).e(this, (F62)object3);
        object = this.u;
        n3 = ((ArrayList)object).isEmpty() ^ n7;
        n7 = 4;
        object5 = "emptyClosetLayout";
        if (n3 != 0) {
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n7);
            this.Sa();
            this.Oa();
        } else {
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n7);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            ((ky1_0)object).o(0);
        }
        object = E1.a("source_screen", "Bag");
        object2 = this.h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n8 = 0;
            object2 = null;
        }
        if ((object2 = ((ky1_0)object2).x) != null && (object2 = ((ProductsList)object2).getProducts()) != null) {
            n8 = object2.size();
            n14 = n8;
        }
        object2 = String.valueOf(n14);
        object.putString("no_of_products", (String)object2);
        vb0_0.a(AnalyticsManager.Companion, "bag screen - wishlist halfcut screen", (Bundle)object);
    }

    public final void t4(Product object, ProductOptionItem object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "product");
        Intrinsics.checkNotNullParameter(object2, "variant");
        Object object3 = this.h;
        String string2 = "closetViewModel";
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object3 = null;
        }
        if ((n3 = ((ky1_0)object3).j()) != 0) {
            object3 = (jo_2)this.b.getValue();
            n3 = ((jo_2)object3).d();
            Object object5 = yn3_0.a;
            Object object6 = n3;
            int n4 = 1;
            Object object7 = new Object[n4];
            object7[0] = object6;
            ((yn3$a)object5).a("Bag Count%s", object7);
            object5 = "closet screen";
            object6 = "Added to Bag";
            if (n3 == 0) {
                object3 = AnalyticsManager.Companion;
                object7 = "Closet Button/Empty Cart";
                tj2_0.e((AnalyticsManager$Companion)object3, (String)object7, (String)object6, (String)object5);
            } else {
                object3 = AnalyticsManager.Companion;
                object7 = "Closet Button";
                tj2_0.e((AnalyticsManager$Companion)object3, (String)object7, (String)object6, (String)object5);
            }
            n3 = (int)(this.isAdded() ? 1 : 0);
            if (n3 != 0) {
                object3 = this.i;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    n3 = 0;
                    object3 = null;
                }
                ((AjioLoaderView)((Object)object3)).startLoader();
            }
            object3 = ((ProductOptionItem)object2).getCode();
            this.x = object3;
            object3 = ((ProductOptionItem)object2).getCommercialType();
            object5 = this.h;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object5 = null;
            }
            object5.getClass();
            object6 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object6);
            ((ky1_0)object5).r = object;
            hv3_0.a.getClass();
            object = hv3_0.d((ProductOptionItem)object2);
            object5 = this.h;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object5;
            }
            object2 = ((ProductOptionItem)object2).getCode();
            ((ky1_0)object4).e((String)object2, (String)object, (String)object3);
        } else {
            object = this.d;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            object = "source - cart";
            int n7 = 6;
            object4.z0(n7, (String)object);
        }
    }

    public final void x4(Product object, String string2, boolean bl2) {
        Object object2 = this.getActivity();
        if (object2 != null && !(bl2 = (object2 = this.requireActivity()).isFinishing()) && object != null && string2 != null && (bl2 = string2.length())) {
            object2 = this.c;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                bl2 = false;
                object2 = null;
            }
            object2.startLoader();
            object2 = this.h;
            String string3 = "closetViewModel";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            object2 = ((ky1_0)object2).i;
            ((BH3)object2).b = object;
            if ((object = ((Product)object).getSourceStoreId()) == null) {
                object = ld3_2.STORE_AJIO.getStoreId();
            }
            if ((object2 = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object2;
            }
            object2 = "similar products widget";
            ((ky1_0)object3).f(string2, (String)object, (String)object2);
        }
    }

    public final void y1(int n3) {
        np_2 np_22 = this.j;
        if (np_22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetListAdaptor");
            np_22 = null;
        }
        np_22.notifyItemChanged(n3);
    }
}

