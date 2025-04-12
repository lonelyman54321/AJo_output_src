/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.SectionIndexer
 */
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.home.category.revamp.fastscroll.AlphabetIndexRecyclerView;
import com.ril.ajio.services.data.Home.BrandCategoryData;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.CmsNavigationData;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from gD1
 */
public final class gd1_2
extends Fragment
implements bd1_1 {
    public static final gd1$b_0 Companion;
    public vh3_2 a;
    public gd1$c_0 b;
    public hq_2 c;
    public AppCompatActivity d;
    public ConstraintLayout e;
    public AlphabetIndexRecyclerView f;
    public AjioLoaderView g;
    public BrandCategoryData h;
    public CmsNavigationData i;
    public String j = "";
    public View k;
    public View l;

    static {
        gd1$b_0 gd1$b_0;
        Companion = gd1$b_0 = new Object();
    }

    public final void G9(BrandSubCategory object) {
        LinkDetail linkDetail;
        Intrinsics.checkNotNullParameter(object, "brandSubCategory");
        String string2 = null;
        int n3 = 63;
        Object object2 = linkDetail;
        linkDetail = new LinkDetail(null, null, null, null, false, null, n3, null);
        object2 = ((BrandSubCategory)object).getUrlLink();
        linkDetail.setUrl((String)object2);
        object2 = ((BrandSubCategory)object).getPage();
        linkDetail.setPage((String)object2);
        object2 = ((BrandSubCategory)object).getQuery();
        linkDetail.setQuery((String)object2);
        object2 = ld3_2.STORE_LUXE.getStoreId();
        linkDetail.setStoreType((String)object2);
        object2 = this.b;
        if (object2 != null) {
            object = ((BrandSubCategory)object).getPage();
            string2 = "luxe";
            object2.n((String)object, linkDetail, string2);
        }
    }

    public final void Oa() {
        Object object;
        boolean bl2;
        ArrayList<Object> arrayList;
        int n3;
        int n4;
        gd1_2 gd1_22 = this;
        Object object2 = this.getActivity();
        if (object2 != null) {
            object2 = object2.getWindowManager().getDefaultDisplay();
            n3 = n4 = object2.getWidth();
        } else {
            n4 = 720;
            n3 = 720;
        }
        n4 = (int)(CMSConfigInitializer.isLuxeBrandEnabled() ? 1 : 0);
        int n7 = 1;
        int n8 = 0;
        Object object3 = null;
        if (n4 != 0) {
            object2 = gd1_22.i;
            arrayList = new ArrayList<Object>();
            if (object2 != null) {
                object3 = ((CmsNavigationData)object2).getData();
            }
            if (object3 != null) {
                object3 = ((CmsNavigationData)object2).getData();
                Intrinsics.checkNotNull(object3);
                object3 = ((NavigationDataClass)object3).getChildDetails();
                if (object3 != null) {
                    n8 = object3.size();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                if (n8 > 0) {
                    object2 = ((CmsNavigationData)object2).getData();
                    Intrinsics.checkNotNull(object2);
                    object2 = ((NavigationDataClass)object2).getChildDetails();
                    Intrinsics.checkNotNull(object2);
                    object2 = object2.iterator();
                    while ((n8 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object3 = (CMSNavigation)object2.next();
                        Object object4 = ((CMSNavigation)object3).getChildDetails();
                        if (object4 != null && !(bl2 = object4.isEmpty())) {
                            bl2 = false;
                            object4 = null;
                        } else {
                            bl2 = true;
                        }
                        if (bl2) continue;
                        object4 = ((CMSNavigation)object3).getName();
                        object = new dd1_2(object4, 0);
                        arrayList.add(object);
                        object4 = ((CMSNavigation)object3).getChildDetails();
                        if (object4 == null) continue;
                        object3 = ((CMSNavigation)object3).getChildDetails();
                        Intrinsics.checkNotNull(object3);
                        object3 = object3.iterator();
                        while (bl2 = object3.hasNext()) {
                            BrandSubCategory brandSubCategory;
                            boolean bl3;
                            object4 = (CMSNavigation)object3.next();
                            object = ((CMSNavigation)object4).getName();
                            if (object != null && !(bl3 = kotlin.text.b.k((CharSequence)object))) {
                                bl3 = false;
                                brandSubCategory = null;
                            } else {
                                bl3 = true;
                            }
                            if (bl3) continue;
                            int n10 = 127;
                            brandSubCategory = new BrandSubCategory(null, null, null, null, null, null, null, n10, null);
                            brandSubCategory.setName((String)object);
                            object = ((CMSNavigation)object4).getUrl();
                            brandSubCategory.setUrlLink((String)object);
                            object = ((CMSNavigation)object4).getPageType();
                            brandSubCategory.setPage((String)object);
                            object4 = ((CMSNavigation)object4).getActiveImageUrl();
                            brandSubCategory.setActiveImageUrl((String)object4);
                            object4 = new dd1_2(brandSubCategory, n7);
                            arrayList.add(object4);
                        }
                    }
                }
            }
        } else {
            object2 = gd1_22.h;
            arrayList = new ArrayList<Object>();
            if (object2 != null) {
                object3 = ((BrandCategoryData)object2).getSubcategories();
            }
            if (object3 != null) {
                object3 = ((BrandCategoryData)object2).getSubcategories();
                Object object5 = new Object();
                Collections.sort(object3, object5);
                object2 = ((BrandCategoryData)object2).getSubcategories();
                Intrinsics.checkNotNull(object2);
                object2 = object2.iterator();
                object3 = "";
                while (bl2 = object2.hasNext()) {
                    boolean bl4;
                    object5 = (BrandSubCategory)object2.next();
                    object = ((BrandSubCategory)object5).getName();
                    if (object == null || (bl4 = kotlin.text.b.k((CharSequence)object))) continue;
                    char c2 = Character.toUpperCase(((String)object).charAt(0));
                    bl4 = ((String)object3).equals(object = String.valueOf(c2));
                    if (!bl4) {
                        object3 = new Object(object, 0);
                        arrayList.add(object3);
                        object3 = object;
                    }
                    object = new dd1_2(object5, n7);
                    arrayList.add(object);
                }
            }
        }
        object3 = gd1_22.j;
        boolean bl5 = CMSConfigInitializer.isLuxeBrandEnabled();
        bl2 = CMSConfigInitializer.isLuxeBrandImageEnabled();
        object2 = object;
        object = new cd1_2(arrayList, this, (String)object3, bl5, bl2, n3);
        object2 = gd1_22.f;
        if (object2 != null) {
            ((AlphabetIndexRecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void onAttach(Context object) {
        block7: {
            String string2;
            boolean bl2;
            Object object2;
            block6: {
                block5: {
                    Intrinsics.checkNotNullParameter(object, "context");
                    super.onAttach((Context)object);
                    object2 = object;
                    object2 = (AppCompatActivity)object;
                    this.d = object2;
                    object2 = this.getParentFragment();
                    bl2 = object2 instanceof gd1$c_0;
                    string2 = "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.LuxBrandFragment.OnLuxBrandClickListener";
                    if (!bl2) break block5;
                    object2 = this.getParentFragment();
                    Intrinsics.checkNotNull(object2, string2);
                    object2 = (gd1$c_0)object2;
                    break block6;
                }
                object2 = this.d;
                boolean bl3 = object2 instanceof gd1$c_0;
                if (!bl3) break block7;
                Intrinsics.checkNotNull(object2, string2);
                object2 = (gd1$c_0)object2;
            }
            this.b = object2;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object = (vh3_2)object;
                this.a = object;
            } else {
                object = yn3_0.a;
                bl2 = false;
                object2 = new Object[]{};
                string2 = "must implement TabListener";
                ((yn3$a)object).d(string2, object2);
            }
            return;
        }
        object = new RuntimeException("OnLuxBrandClickListener impl is not found.");
        throw object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.d;
        Intrinsics.checkNotNull(object);
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = hq_2.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object3, e$b, (Wd0)object, (Class)object2, string2);
        object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.c = object = (hq_2)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_lux_brand;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        float f5;
        float f6;
        int n3;
        String[] stringArray;
        Object object3;
        FragmentActivity fragmentActivity;
        int n7;
        Object object4;
        int n8;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        Object object5 = "catalogType";
        if (object2 != null && (n8 = object2.containsKey((String)object5)) != 0 && (object4 = object2.getString((String)object5)) != null) {
            object2 = object2.getString((String)object5);
            Intrinsics.checkNotNull(object2);
            this.j = object2;
        }
        object2 = this.a;
        n8 = 0;
        object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n7 = 0;
            object2 = null;
        }
        int n10 = 1;
        object2.showTabLayout(n10 != 0);
        n7 = R$id.parent_lyt;
        object2 = (ConstraintLayout)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.lux_brand_rv;
        object2 = (AlphabetIndexRecyclerView)object.findViewById(n7);
        this.f = object2;
        if (object2 != null) {
            fragmentActivity = this.requireActivity();
            object3 = new LinearLayoutManager((Context)fragmentActivity);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
        object2 = this.f;
        object3 = "BRAND_PAGE";
        fragmentActivity = null;
        if (object2 != null) {
            int n4;
            int n14;
            Object object6;
            stringArray = this.j;
            boolean n42 = CMSConfigInitializer.isLuxeBrandEnabled();
            de_1 de_12 = new RecyclerView$h();
            de_12.d = -1;
            de_12.e = false;
            de_12.f = null;
            de_12.g = null;
            de_12.h = null;
            de_12.k = null;
            de_12.l = object6 = Boolean.TRUE;
            object6 = new de$a_0(de_12);
            de_12.j = n14 = ((AlphabetIndexRecyclerView)object2).c;
            float f7 = ((AlphabetIndexRecyclerView)object2).d;
            float f8 = ((AlphabetIndexRecyclerView)object2).e;
            de_12.m = n4 = Color.parseColor((String)"#00000000");
            String string2 = "#929292";
            de_12.n = n4 = Color.parseColor((String)string2);
            if (n42 && stringArray != null && (n3 = (int)(stringArray.equalsIgnoreCase((String)object3) ? 1 : 0)) != 0) {
                stringArray = "#000000";
                de_12.o = n3 = Color.parseColor((String)stringArray);
            } else {
                stringArray = "#E0E0E0";
                de_12.o = n3 = Color.parseColor((String)stringArray);
            }
            stringArray = ((AlphabetIndexRecyclerView)object2).f;
            DisplayMetrics displayMetrics = stringArray.getResources().getDisplayMetrics();
            f6 = displayMetrics.density;
            de_12.c = f5 = stringArray.getResources().getDisplayMetrics().scaledDensity;
            de_12.f = object2;
            stringArray = ((RecyclerView)object2).getAdapter();
            n4 = stringArray instanceof SectionIndexer;
            if (n4 != 0) {
                ((RecyclerView$f)stringArray).registerAdapterDataObserver(de_12);
                stringArray = (SectionIndexer)stringArray;
                de_12.g = stringArray;
                stringArray = (String[])stringArray.getSections();
                de_12.h = stringArray;
            }
            de_12.a = f7 *= f6;
            de_12.b = f8 *= f6;
            ((AlphabetIndexRecyclerView)object2).a = de_12;
        }
        n7 = R$id.lux_brand_imv_back;
        object2 = object.findViewById(n7);
        int n15 = 1;
        f6 = Float.MIN_VALUE;
        stringArray = new H8(this, n15);
        object2.setOnClickListener((View.OnClickListener)stringArray);
        n7 = R$id.ajio_loader_view;
        object2 = (AjioLoaderView)object.findViewById(n7);
        this.g = object2;
        n7 = R$id.lux_nav_page_header_view;
        object2 = object.findViewById(n7);
        this.k = object2;
        n7 = R$id.lux_brand_page_header_view;
        object2 = object.findViewById(n7);
        this.l = object2;
        if (object2 != null) {
            n3 = R$string.acc_page_header_brands;
            stringArray = hv3_0.K(n3);
            object2.setContentDescription((CharSequence)stringArray);
        }
        stringArray = Looper.getMainLooper();
        object2 = new Handler((Looper)stringArray);
        stringArray = new ed1_2(this);
        long l2 = 300L;
        object2.postDelayed((Runnable)stringArray, l2);
        n7 = R$id.brand_page_search_iv;
        object = object.findViewById(n7);
        if (object != null) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
            object2 = new mC0(this, n3);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.j;
        object2 = "NAV_PAGE";
        int n16 = Intrinsics.areEqual(object, object2);
        n7 = 8;
        if (n16 != 0) {
            object = this.k;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.l) != null) {
                object.setVisibility(n7);
            }
        } else {
            object = this.j;
            n16 = Intrinsics.areEqual(object, object3);
            if (n16 != 0) {
                n16 = CMSConfigInitializer.isLuxeBrandEnabled();
                if (n16 != 0) {
                    object = this.e;
                    if (object == null) {
                        object = "parentLyt";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object4 = object;
                    }
                    object = this.getResources();
                    n10 = R$color.white;
                    n16 = object.getColor(n10);
                    object4.setBackgroundColor(n16);
                }
                if ((object = this.k) != null) {
                    object.setVisibility(n7);
                }
                if ((object = this.l) != null) {
                    object.setVisibility(0);
                }
            }
        }
        if ((object = this.c) != null && (object = object.c) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new fd1_2(this);
            object.e((mu1_1)object2, (F62)object4);
        }
        if ((object = this.c) != null && (object = object.d) != null) {
            object2 = this.getViewLifecycleOwner();
            n10 = 1;
            object4 = new L8(this, n10);
            object3 = new hd1_2((L8)object4);
            object.e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.g) != null) {
            object.startLoader();
        }
        if ((object = this.c) != null) {
            object2 = "rilfnlProductCatalog";
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object5 = "luxebrands";
            Intrinsics.checkNotNullParameter(object5, "brand");
            object2 = object.a.getLuxBrandCategory((String)object2, (String)object5);
            n8 = 1;
            object5 = new b8_0(object, n8);
            object4 = new aq_2(0, (Function1)object5);
            n10 = 1;
            object5 = new d8_0(object, n10);
            fragmentActivity = null;
            object3 = new bq_2(0, (Function1)object5);
            object2 = ((g53_0)object2).f((o60_0)object4, (o60_0)object3);
            object = object.j;
            object.b((yr0_2)object2);
        }
    }
}

