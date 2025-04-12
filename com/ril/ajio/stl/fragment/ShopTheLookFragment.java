/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
package com.ril.ajio.stl.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.y;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.stl.fragment.ShopTheLookFragment$a;
import com.ril.ajio.stl.fragment.ShopTheLookFragment$b;
import com.ril.ajio.stl.fragment.ShopTheLookFragment$c;
import com.ril.ajio.stl.fragment.ShopTheLookFragment$onCreate$1$bannerListType$1;
import com.ril.ajio.stl.fragment.a;
import com.ril.ajio.stl.fragment.b;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ShopTheLookFragment
extends Fragment
implements sz2_1 {
    public static final ShopTheLookFragment$a Companion;
    public RecyclerView a;
    public ImageView b;
    public ProgressBar c;
    public BannerData d;
    public List e;
    public w33 f;
    public vh3_2 g;
    public ea2_1 h;
    public boolean i;
    public lz1_1 j;
    public j3_0 k;
    public final jo_2 l;
    public ma_2 m;
    public int n;
    public final u o;
    public final hh3_2 p;
    public final ShopTheLookFragment$b q;

    static {
        ShopTheLookFragment$a shopTheLookFragment$a;
        Companion = shopTheLookFragment$a = new Object();
    }

    public ShopTheLookFragment() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.l = object;
        this.n = -1;
        this.o = object = new y();
        object = new c33_0(this);
        this.p = object = yr1_2.b((Function0)object);
        this.q = object = new ShopTheLookFragment$b(this);
    }

    public static final void Oa(ShopTheLookFragment object, int n3) {
        ((ShopTheLookFragment)object).n = n3;
        ProgressBar progressBar = ((ShopTheLookFragment)object).c;
        Object object2 = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        e43_0 e43_02 = ((ShopTheLookFragment)object).Ra();
        ++n3;
        object = ((ShopTheLookFragment)object).e;
        if (object == null) {
            object = "bannersList";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        int n4 = object2.size();
        e43_02.getClass();
        if (n4 == 0) {
            n4 = 0;
            float f5 = 0.0f;
            object = null;
        } else {
            float f6 = n3 *= 100;
            float f7 = n4;
            n4 = (int)(f6 /= f7);
        }
        progressBar.setProgress(n4);
    }

    public static int Pa(RecyclerView object) {
        object = object != null ? ((RecyclerView)object).getLayoutManager() : null;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager)object).findFirstVisibleItemPosition();
    }

    public final void A6(BannerData object, Product object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "bannerData");
        Object object3 = this.Ra().a.getValue();
        Intrinsics.checkNotNullExpressionValue(object3, "getValue(...)");
        object3 = (UserInformation)object3;
        boolean n3 = ((UserInformation)object3).isUserOnline();
        Object object4 = null;
        if (!n3) {
            this.Ra().h.b = object2;
            object = this.j;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            object = "source - add to closet";
            int n4 = 53;
            object4.z0(n4, (String)object);
        } else {
            boolean bl2;
            String string3;
            boolean bl3;
            object3 = this.getArguments();
            int n7 = 100;
            if (object3 != null && (bl3 = (object3 = this.requireArguments()).containsKey(string3 = "PLP_TYPE"))) {
                object3 = this.requireArguments();
                n7 = object3.getInt(string3, n7);
            }
            if ((object3 = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                boolean bl4 = false;
                object3 = null;
            }
            object3.startLoader();
            object3 = this.Ra().h;
            ((BH3)object3).b = object2;
            object2 = this.Ra();
            Intrinsics.checkNotNull(string2);
            ((e43_0)object2).c(n7, string2);
            object2 = eb_2.a;
            object2 = ((BannerData)object).getDynamicPageMetadata();
            if (object2 != null) {
                object2 = ((DynamicPageMetadata)object2).getMediaType();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = eb_2.e((String)object2);
            int n8 = 3;
            Object object5 = "productCode";
            string3 = "bannerName";
            Object object6 = "";
            if (bl2) {
                e43_0 e43_02 = this.Ra();
                Object object7 = (object = ((BannerData)object).getBannerUrl()) == null ? object6 : object;
                object = eb_2.f;
                if (object == null) {
                    object = new Bundle();
                }
                Object object8 = object;
                e43_02.getClass();
                Intrinsics.checkNotNullParameter(object7, string3);
                Intrinsics.checkNotNullParameter(string2, (String)object5);
                Intrinsics.checkNotNullParameter(object, "bundle");
                object = md3_0.c(e43_02);
                object2 = new d43_0((Bundle)object8, string2, e43_02, (String)object7, null);
                Ae3.d((i90_0)object, null, null, (Function2)object2, n8);
            } else {
                object2 = this.Ra();
                if ((object = ((BannerData)object).getBannerUrl()) != null) {
                    object6 = object;
                }
                object2.getClass();
                Intrinsics.checkNotNullParameter(object6, string3);
                Intrinsics.checkNotNullParameter(string2, (String)object5);
                object = md3_0.c((jD3)object2);
                object5 = new c43_0(string2, (e43_0)object2, (String)object6, null);
                Ae3.d((i90_0)object, null, null, (Function2)object5, n8);
            }
        }
    }

    public final void C(Product object, String object2) {
        int n3;
        object2 = ((Product)object).getFnlColorVariantData();
        if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null && (n3 = ((String)object2).length()) > 0) {
            Object object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object3 = null;
            }
            object3.startLoader();
            object3 = this.Ra().h;
            ((BH3)object3).c = object;
            object = this.Ra();
            ((e43_0)object).i((String)object2);
        }
    }

    public final b33_0 Qa() {
        int n3;
        RecyclerView recyclerView;
        boolean bl2;
        Object object = this.a;
        String string2 = "stlHomeRv";
        RecyclerView recyclerView2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object = null;
        }
        if ((recyclerView = this.a) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            recyclerView = null;
        }
        if (bl2 = (object = ((RecyclerView)object).findViewHolderForAdapterPosition(n3 = ShopTheLookFragment.Pa(recyclerView))) instanceof b33_0) {
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            if ((recyclerView = this.a) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                recyclerView2 = recyclerView;
            }
            int n4 = ShopTheLookFragment.Pa(recyclerView2);
            object = ((RecyclerView)object).findViewHolderForAdapterPosition(n4);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.stl.viewHolder.ShopTheLookBannerDetailsViewHolder");
            return (b33_0)object;
        }
        return null;
    }

    public final e43_0 Ra() {
        return (e43_0)this.p.getValue();
    }

    public final void Y(int n3, Product product, String string2, int n4, String string3, String string4) {
        Object object;
        int n7;
        ShopTheLookFragment shopTheLookFragment = this;
        Product product2 = product;
        Object object2 = this.h;
        if (object2 == null) {
            object2 = "productDetailListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        } else {
            object = object2;
        }
        e43_0 e43_02 = null;
        int n8 = n4;
        Object object3 = string2;
        Object object4 = string3;
        Object object5 = string4;
        object.S0(n4, string2, string3, string4, null);
        if (product2 != null) {
            boolean bl2;
            object2 = eb_2.a;
            object2 = shopTheLookFragment.e;
            object = "bannersList";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object2 = null;
            }
            Object object6 = shopTheLookFragment.a;
            object3 = "stlHomeRv";
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n8 = 0;
                object6 = null;
            }
            if ((object2 = ((BannerData)object2.get(n8 = ShopTheLookFragment.Pa((RecyclerView)object6))).getDynamicPageMetadata()) != null) {
                object2 = ((DynamicPageMetadata)object2).getDuration();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = eb_2.d((Long)object2);
            int n10 = 3;
            object6 = "imageUrl";
            object4 = "product";
            object5 = "";
            if (bl2) {
                y33_0 y33_02;
                e43_02 = this.Ra();
                object2 = product.getCode();
                if (object2 != null) {
                    object5 = object2;
                }
                object2 = shopTheLookFragment.e;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    bl2 = false;
                    object2 = null;
                }
                if ((object = shopTheLookFragment.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    object = null;
                }
                n7 = ShopTheLookFragment.Pa((RecyclerView)object);
                object = object2 = object2.get(n7);
                object = (BannerData)object2;
                object2 = this.Qa();
                long l2 = object2 != null ? ((b33_0)object2).J : 0L;
                e43_02.getClass();
                Intrinsics.checkNotNullParameter(product2, (String)object4);
                Intrinsics.checkNotNullParameter(object5, (String)object6);
                aW aW2 = md3_0.c(e43_02);
                object2 = y33_02;
                product2 = product;
                n8 = n3;
                object3 = e43_02;
                object4 = object5;
                y33_02 = new y33_0(product, (BannerData)object, n3, e43_02, (String)object5, l2, null);
                Ae3.d(aW2, null, null, y33_02, n10);
            } else {
                y33_0 y33_03;
                object3 = this.Ra();
                object2 = product.getCode();
                if (object2 != null) {
                    object5 = object2;
                }
                object3.getClass();
                Intrinsics.checkNotNullParameter(product2, (String)object4);
                Intrinsics.checkNotNullParameter(object5, (String)object6);
                aW aW3 = md3_0.c((jD3)object3);
                n7 = 0;
                object = null;
                long l3 = 0L;
                object2 = y33_03;
                product2 = product;
                n8 = n3;
                object4 = object5;
                y33_03 = new y33_0(product, null, n3, (e43_0)object3, (String)object5, l3, null);
                Ae3.d(aW3, null, null, y33_03, n10);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof vh3_2;
        if (bl2) {
            object2 = object;
            this.g = object2 = (vh3_2)object;
            bl2 = object instanceof ea2_1;
            if (bl2) {
                object2 = object;
                this.h = object2 = (ea2_1)object;
                bl2 = object instanceof lz1_1;
                if (bl2) {
                    object2 = object;
                    this.j = object2 = (lz1_1)object;
                    bl2 = object instanceof j3_0;
                    if (bl2) {
                        object = (j3_0)object;
                        this.k = object;
                        return;
                    }
                    object = pn_2.b(object, " must implement ActivityFragmentListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement LoginListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement PDPListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement TabListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3;
            int n4;
            Object object3;
            Object object4;
            object2 = "clickedBannerData";
            boolean bl2 = object.containsKey((String)object2);
            if (bl2) {
                object4 = new Gson();
                object2 = object.getString((String)object2);
                object3 = BannerData.class;
                this.d = object2 = (BannerData)((Gson)object4).fromJson((String)object2, (Class)object3);
            }
            if (bl2 = object.containsKey((String)(object2 = "bannersList"))) {
                object4 = new ShopTheLookFragment$onCreate$1$bannerListType$1();
                object4 = ((TypeToken)object4).getType();
                object3 = new Gson();
                object = object.getString((String)object2);
                this.e = object = (List)((Gson)object3).fromJson((String)object, (Type)object4);
            }
            if ((object = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((n4 = object.size()) > (n3 = 1)) {
                this.i = n3;
            }
        }
        object2 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
        object = new ma_2((Context)object2);
        this.m = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n3 = 0;
            object = null;
        }
        object.showTabLayout(false);
        n3 = R$layout.shop_the_look_home_fragment;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        eb_2.b = null;
        eb_2.f = null;
    }

    public final void onPause() {
        super.onPause();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 <= n4) {
            ma_2 ma_22 = this.m;
            if (ma_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                n3 = 0;
                ma_22 = null;
            }
            ma_22.l();
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = this.g;
        mu1_1 mu1_12 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            object = null;
        }
        object.t();
        object = nu1_0.a(this);
        fx0_2 fx0_22 = new d33_0(this, null);
        ((iu1_0)object).c((Function2)fx0_22);
        object = nu1_0.a(this);
        fx0_22 = new a(this, null);
        ((iu1_0)object).c((Function2)fx0_22);
        object = nu1_0.a(this);
        fx0_22 = new b(this, null);
        ((iu1_0)object).c((Function2)fx0_22);
        object = this.Ra().g;
        mu1_12 = this.getViewLifecycleOwner();
        fx0_22 = new n5_0(this, 3);
        ShopTheLookFragment$c shopTheLookFragment$c = new ShopTheLookFragment$c((Function1)fx0_22);
        ((LiveData)object).e(mu1_12, shopTheLookFragment$c);
    }

    public final void onStart() {
        super.onStart();
        int bl2 = gz3.a;
        int n3 = 23;
        if (bl2 > n3) {
            ma_2 ma_22 = this.m;
            if (ma_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                boolean bl3 = false;
                ma_22 = null;
            }
            boolean bl4 = true;
            ma_22.j((int)(bl4 ? 1 : 0), bl4);
        }
    }

    public final void onStop() {
        super.onStop();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            ma_2 ma_22 = this.m;
            if (ma_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                n3 = 0;
                ma_22 = null;
            }
            ma_22.l();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onViewCreated(View object, Bundle object2) {
        w33 w332;
        Object object3;
        int n3;
        String string2;
        int n4;
        boolean bl2;
        String string3;
        boolean bl3;
        Object object4;
        int n7;
        Object object5;
        Object object6;
        int n8;
        Object object7;
        int n10;
        Object object8;
        block35: {
            block34: {
                Intrinsics.checkNotNullParameter(object, "view");
                super.onViewCreated((View)object, (Bundle)object2);
                int n14 = R$id.stlHomeRv;
                object2 = (RecyclerView)object.findViewById(n14);
                this.a = object2;
                n14 = R$id.stlCloseIv;
                object2 = (ImageView)object.findViewById(n14);
                this.b = object2;
                n14 = R$id.progress_bar;
                object = (ProgressBar)object.findViewById(n14);
                this.c = object;
                object = this.d;
                n14 = 0;
                object2 = null;
                object8 = "selectedBanner";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    n10 = 0;
                    object = null;
                }
                if ((object = ((BannerData)object).getUuid()) != null) {
                    object = this.Ra();
                    object7 = this.d;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        n8 = 0;
                        object7 = null;
                    }
                    if ((object7 = ((BannerData)object7).getUuid()) == null) {
                        object7 = "";
                    }
                    object6 = object = ((e43_0)object).f((String)object7);
                } else {
                    object6 = null;
                }
                object = "bannersList";
                if (object6 == null) {
                    object7 = this.Ra();
                    object5 = this.d;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        n7 = 0;
                        object5 = null;
                    }
                    if ((object4 = this.e) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        bl3 = false;
                        object4 = null;
                    }
                    ((e43_0)object7).g((BannerData)object5, (List)object4);
                }
                object7 = this.o;
                object5 = this.a;
                string3 = "stlHomeRv";
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n7 = 0;
                    object5 = null;
                }
                ((y)object7).attachToRecyclerView((RecyclerView)object5);
                object7 = this.a;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n8 = 0;
                    object7 = null;
                }
                object4 = this.getContext();
                object5 = new WrapperLinearLayoutManager((Context)object4);
                ((RecyclerView)object7).setLayoutManager((RecyclerView$o)object5);
                object7 = this.a;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n8 = 0;
                    object7 = null;
                }
                n7 = 1;
                ((RecyclerView)object7).setHasFixedSize(n7 != 0);
                n8 = 0;
                object7 = null;
                try {
                    object4 = this.a;
                    if (object4 != null) break block34;
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl3 = false;
                    object4 = null;
                }
                catch (Exception exception) {}
            }
            if (!(bl2 = (object4 = ((RecyclerView)object4).getItemAnimator()) instanceof x)) break block35;
            object4 = (x)object4;
            ((x)object4).g = false;
        }
        if ((object4 = this.f) != null) {
            this.i = bl3 = ((w33)object4).g;
        }
        if ((n4 = ((sw_0)(object4 = this.l)).getPreference(string2 = "SHOP_THE_LOOK_COACH_MARK_COUNT", 0)) >= (n3 = 2)) {
            this.i = false;
        } else {
            n8 = this.i;
            if (n8 != 0) {
                ((sw_0)object4).putPreference(string2, n4 += n7);
            }
        }
        object7 = this.e;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n7 = 0;
            object5 = null;
        } else {
            object5 = object7;
        }
        bl2 = this.i;
        object7 = this.m;
        if (object7 == null) {
            object7 = "ajioVideoPlayer";
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n4 = 0;
            object3 = null;
        } else {
            object3 = object7;
        }
        e43_0 e43_02 = this.Ra();
        object7 = w332;
        object4 = this;
        this.f = w332 = new w33((List)object5, (List)object6, this, bl2, (ma_2)object3, e43_02);
        object7 = this.a;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object7 = null;
        }
        if ((object5 = this.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shopTheLookBannerDetailsAdapter");
            n7 = 0;
            object5 = null;
        }
        ((RecyclerView)object7).setAdapter((RecyclerView$f)object5);
        object7 = this.e;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n8 = 0;
            object7 = null;
        }
        if ((object5 = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object5 = null;
        }
        if ((n8 = object7.indexOf(object5)) != (n7 = -1)) {
            object7 = this.a;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n8 = 0;
                object7 = null;
            }
            if ((object5 = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n7 = 0;
                object5 = null;
            }
            if ((object = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n10 = 0;
                object = null;
            }
            n10 = object5.indexOf(object);
            ((RecyclerView)object7).scrollToPosition(n10);
        }
        if ((object = this.a) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n10 = 0;
            object = null;
        }
        object8 = this.q;
        ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object8);
        object = this.b;
        if (object == null) {
            object = "stlCloseIv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object = new na2_0(this, 1);
        object2.setOnClickListener((View.OnClickListener)object);
    }
}

