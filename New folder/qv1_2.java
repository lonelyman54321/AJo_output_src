/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.i;
import androidx.fragment.app.k;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FragmentCategoryBinding;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from QV1
 */
public final class qv1_2
extends t51_0
implements ZG$a,
OP$a,
View.OnClickListener,
nf3$b,
YV1$b {
    public static final QV1$b Companion;
    public static final /* synthetic */ gn1_2[] s0;
    public TextView A;
    public String B;
    public Typeface C;
    public Typeface D;
    public TabLayout E;
    public ImageView F;
    public ViewPager G;
    public ImageView H;
    public ImageView I;
    public View J;
    public View K;
    public AjioLoaderView L;
    public final ArrayList M;
    public boolean N;
    public StoreInfo O;
    public qv1$a_0 P;
    public String Q;
    public ConstraintLayout R;
    public AjioImageView S;
    public AjioImageView T;
    public final zr1_1 U;
    public final NewCustomEventsRevamp X;
    public final String Y;
    public final String Z;
    public final String f;
    public hq_2 g;
    public oa1_1 h;
    public K82 i;
    public NavigationParent j;
    public NavigationParent k;
    public final hh3_2 k0;
    public NavigationParent l;
    public final ArrayList m;
    public AppCompatActivity n;
    public RecyclerView o;
    public int p;
    public final hh3_2 p0;
    public FrameLayout q;
    public final hh3_2 q0;
    public ArrayList r;
    public final cc3_2 r0;
    public String s;
    public ImageView t;
    public View u;
    public ImageView v;
    public ImageView w;
    public TextView x;
    public LinearLayout y;
    public TextView z;

    static {
        Object object = jz.a(qv1_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentCategoryBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        s0 = gn1_2Array;
        Companion = object = new Object();
    }

    public qv1_2() {
        boolean bl2;
        Object object = Ga4Events.INSTANCE;
        this.f = "SUB_CATEGORY_FRAGMENT";
        object = new ArrayList();
        this.m = object;
        this.p = -1;
        object = new ArrayList();
        this.M = object;
        this.N = bl2 = og1_1.c();
        this.U = object = new zr1_1();
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.X = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.Y = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.Z = object = newEEcommerceEventsRevamp.getPrevScreenType();
        object = new fd_1(this, 2);
        this.k0 = object = yr1_2.b((Function0)object);
        int n3 = 1;
        object = new ii_2(this, n3);
        this.p0 = object = yr1_2.b((Function0)object);
        object = new ji_2(this, n3);
        this.q0 = object = yr1_2.b((Function0)object);
        this.r0 = object = z80_0.c(QV1$c.a, this);
    }

    public static int ab(ArrayList object) {
        int n3 = 0;
        if (object != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                String string2 = ((StoreInfo)(object2 = (StoreInfo)object2)).getStoreId();
                if (string2 == null || !(bl2 = ((StoreInfo)object2).isDisplayInChevron())) continue;
                ++n3;
            }
        }
        return n3;
    }

    public static void ib(ImageView imageView) {
        int n3;
        if (imageView != null && (n3 = hv3_0.F()) != 0) {
            float f5 = 0.24f;
            float f6 = (float)n3 * f5;
            n3 = (int)f6;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            String string2 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
            Intrinsics.checkNotNull(layoutParams, string2);
            layoutParams = (RelativeLayout.LayoutParams)layoutParams;
            layoutParams.height = n3;
            try {
                imageView.setLayoutParams(layoutParams);
            }
            catch (Exception exception) {
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(exception);
            }
        }
    }

    public final String D4() {
        return this.B;
    }

    /*
     * WARNING - void declaration
     */
    public final void Oa() {
        Serializable serializable = this.r;
        if (serializable != null) {
            void var2_5;
            int bl2 = qv1_2.ab(serializable);
            zr1_1 zr1_12 = this.U;
            int n3 = 2;
            if (bl2 >= n3) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                serializable = null;
            }
            serializable = Boolean.valueOf((boolean)var2_5);
            zr1_12.i(serializable);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Pa() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.Qa();
                        Object object = this.l;
                        if (object != null) break block4;
                        object = this.Q;
                        this.cb((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void Qa() {
        boolean bl2 = false;
        Serializable serializable = null;
        int n3 = 1;
        Object object = this.r;
        if (object == null) {
            object = h40_0.a;
            boolean bl3 = h40_0.b1();
            hq_2 hq_22 = this.g;
            if (hq_22 != null) {
                object = hq_22.a.getStoreInfo(bl3);
                Function1 function1 = new M8(hq_22, n3);
                gq_2 gq_22 = new gq_2(function1, 0);
                function1 = new z8_0(hq_22, n3);
                Object object2 = new zq_2(0, function1);
                serializable = ((g53_0)object).f(gq_22, (o60_0)object2);
                object2 = hq_22.j;
                ((t30_0)object2).b((yr0_2)((Object)serializable));
            }
        } else {
            int n4 = qv1_2.ab((ArrayList)object);
            zr1_1 zr1_12 = this.U;
            int n7 = 2;
            if (n4 >= n7) {
                bl2 = true;
            }
            serializable = bl2;
            zr1_12.i(serializable);
        }
    }

    public final void Ra() {
        boolean bl2;
        Object object = this.g;
        if (object != null && !(bl2 = ((UserInformation)(object = (UserInformation)object.h.getValue())).isUserOnline())) {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoginViewModel");
                bl2 = false;
                object = null;
            }
            Object object2 = z40_0.Companion;
            Object object3 = this.requireActivity().getApplication();
            String string2 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object2.getClass();
            object2 = z40$a.a((Context)object3).a;
            object3 = "enable_Signup_popup";
            boolean bl3 = ((ao0_0)object2).a((String)object3);
            if (bl3) {
                bl3 = vl0_0.a;
                if (bl3) {
                    object = vl0_0.b;
                    if (object != null) {
                        this.gb((LoginSignupBenefitsBannerData)object);
                    }
                } else {
                    ((oa1_1)object).e();
                }
            }
        } else {
            object = this.S;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public final String Sa() {
        return this.s;
    }

    public final boolean Ta() {
        Object object;
        int n3 = og1_1.c();
        boolean bl2 = true;
        Object object2 = "getChildFragmentManager(...)";
        if (n3 != 0 && (object = this.G) != null) {
            Intrinsics.checkNotNull(object);
            n3 = ((ViewPager)((Object)object)).getCurrentItem();
            Object object3 = this.P;
            if (object3 != null) {
                ViewPager viewPager = this.G;
                Intrinsics.checkNotNull((Object)viewPager);
                object = ((i)object3).f(n3, viewPager);
            } else {
                n3 = 0;
                object = null;
            }
            boolean bl3 = object instanceof ld1_1;
            if (bl3) {
                block11: {
                    object = (ld1_1)object;
                    object.getClass();
                    try {
                        object3 = ((Fragment)object).getChildFragmentManager();
                    }
                    catch (IllegalStateException illegalStateException) {}
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    object2 = ((ld1_1)object).a;
                    object2 = ((FragmentManager)object3).E((String)object2);
                    if (object2 == null) break block11;
                    ((ld1_1)object).Qa();
                }
                bl2 = false;
                return bl2;
            }
            return false;
        }
        n3 = this.isAdded();
        if (n3 != 0) {
            object = this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = this.f;
            object = ((FragmentManager)object).E((String)object2);
            if (object != null) {
                this.eb();
                return bl2;
            }
        }
        return false;
    }

    public final zr1_1 Ua() {
        return this.U;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Va(NavigationParent var1_1, String var2_3) {
        block44: {
            block43: {
                try {
                    this.l = var1_1;
                    if (var1_1 != null) break block43;
                    var1_1 = this.j;
                    this.l = var1_1;
                }
                catch (Exception var1_2) {
                    break block44;
                }
            }
            this.Q = var2_3;
            var3_4 = false;
            var1_1 = null;
            if (var2_3 != null && (var4_5 = this.O) != null) {
                Intrinsics.checkNotNull(var4_5);
                this.jb((StoreInfo)var4_5);
            } else if (var2_3 != null && (var4_5 = this.O) == null) {
                var4_5 = this.r;
                if (var4_5 != null) {
                    Intrinsics.checkNotNull(var4_5);
                    var4_5 = var4_5.iterator();
                    var5_6 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(var4_5, (String)var5_6);
                    while ((var6_7 = var4_5.hasNext()) != 0) {
                        var5_6 = var4_5.next();
                        var7_8 = "next(...)";
                        Intrinsics.checkNotNullExpressionValue(var5_6, var7_8);
                        var5_6 = (StoreInfo)var5_6;
                        var7_8 = var5_6.storeId;
                        var8_9 = (int)var2_3.equalsIgnoreCase(var7_8);
                        if (var8_9 == 0) continue;
                        break;
                    }
                } else {
                    var6_7 = 0;
                    var5_6 = null;
                }
                this.O = var5_6;
                if (var5_6 != null) {
                    Intrinsics.checkNotNull(var5_6);
                    this.jb((StoreInfo)var5_6);
                } else {
                    this.hb();
                }
            } else {
                this.hb();
            }
            var4_5 = this.K;
            var6_7 = 0;
            var5_6 = null;
            if (var4_5 != null) {
                var4_5.setVisibility(0);
            }
            var4_5 = this.J;
            var8_9 = 8;
            if (var4_5 != null) {
                var4_5.setVisibility(var8_9);
            }
            var4_5 = this.m;
            var4_5.clear();
            var9_10 = this.G;
            if (var9_10 != null) {
                var9_10.setAdapter(null);
            }
            if ((var9_10 = this.l) != null && (var9_10 = var9_10.getData()) != null) {
                var9_10 = var9_10.getChildDetails();
            } else {
                var10_11 = 0;
                var9_10 = null;
            }
            if (var9_10 != null) {
                var9_10 = this.l;
                if (var9_10 != null && (var9_10 = var9_10.getData()) != null && (var9_10 = var9_10.getChildDetails()) != null) {
                    var9_10 = (Collection)var9_10;
                    var4_5.addAll(var9_10);
                }
            } else {
                var9_10 = this.l;
                if (var9_10 != null) {
                    var9_10 = var9_10.getChildDetails();
                } else {
                    var10_11 = 0;
                    var9_10 = null;
                }
                if (var9_10 != null && (var9_10 = this.l) != null && (var9_10 = var9_10.getChildDetails()) != null) {
                    var9_10 = (Collection)var9_10;
                    var4_5.addAll(var9_10);
                }
            }
            if ((var9_10 = this.l) != null) {
                var9_10 = var9_10.getLinkDetails();
            } else {
                var10_11 = 0;
                var9_10 = null;
            }
            if (var9_10 != null && (var9_10 = this.l) != null && (var9_10 = var9_10.getLinkDetails()) != null) {
                var9_10 = (Collection)var9_10;
                var4_5.addAll(var9_10);
            }
            if ((var9_10 = this.l) != null) {
                var9_10 = var9_10.getChildDetails();
            } else {
                var10_11 = 0;
                var9_10 = null;
            }
            if (var9_10 != null) ** GOTO lbl-1000
            var9_10 = this.l;
            if (var9_10 != null) {
                var9_10 = var9_10.getLinkDetails();
            } else {
                var10_11 = 0;
                var9_10 = null;
            }
            if (var9_10 == null) {
                var9_10 = new zg_1((ArrayList)var4_5, this);
                var4_5 = this.o;
                if (var4_5 != null) {
                    var4_5.setAdapter((RecyclerView$f)var9_10);
                }
            } else lbl-1000:
            // 2 sources

            {
                var9_10 = new op_1((ArrayList)var4_5, this);
                var4_5 = this.o;
                if (var4_5 != null) {
                    var4_5.setAdapter((RecyclerView$f)var9_10);
                }
            }
            this.eb();
            var4_5 = h40_0.a;
            var4_5 = h40_0.T();
            var10_11 = var4_5.length();
            if (var10_11 > 0) {
                var9_10 = NavigationParent.class;
                var4_5 = JsonUtils.fromJson((String)var4_5, (Class)var9_10);
                var4_5 = (NavigationParent)var4_5;
                var9_10 = this.l;
                if (var9_10 != null) {
                    var11_12 = var4_5 != null ? var4_5.getSwitchtoStoreIcon() : null;
                    var9_10.setSwitchtoStoreIcon(var11_12);
                }
                if ((var9_10 = this.l) != null) {
                    if (var4_5 != null) {
                        var1_1 = var4_5.getSwitchtoStoreId();
                    }
                    var9_10.setSwitchtoStoreId((String)var1_1);
                }
            }
            var3_4 = og1_1.f();
            var12_13 = true;
            if (!var3_4) ** GOTO lbl-1000
            var1_1 = z40_0.Companion;
            var9_10 = this.k0;
            var9_10 = var9_10.getValue();
            var9_10 = (Application)var9_10;
            var11_12 = "<get-mApplication>(...)";
            Intrinsics.checkNotNullExpressionValue(var9_10, var11_12);
            var1_1.getClass();
            var1_1 = z40$a.a((Context)var9_10);
            var1_1 = var1_1.a;
            var9_10 = "hambuger_store_switch_enable";
            var3_4 = var1_1.a((String)var9_10);
            if (var3_4 && (var1_1 = this.l) != null && (var1_1 = var1_1.getSwitchtoStoreIcon()) != null && !(var3_4 = kotlin.text.b.k((CharSequence)var1_1))) {
                var1_1 = this.H;
                if (var1_1 != null) {
                    var1_1.setVisibility(0);
                }
                var1_1 = new da$a();
                var1_1.k = var12_13;
                var1_1.a = var6_7 = R$drawable.component_placeholder;
                var1_1.b = var6_7;
                var1_1.c = var6_7;
                var1_1.s = var12_13;
                var6_7 = R$string.acc_icon_product_placeholder;
                var5_6 = hv3_0.K(var6_7);
                var1_1.b((String)var5_6);
                var5_6 = UrlHelper.Companion;
                var5_6 = var5_6.getInstance();
                var9_10 = this.l;
                Intrinsics.checkNotNull(var9_10);
                var9_10 = var9_10.getSwitchtoStoreIcon();
                var5_6 = var5_6.getImageUrl((String)var9_10);
                var9_10 = this.H;
                Intrinsics.checkNotNull(var9_10);
                var1_1.n = var5_6;
                var1_1.u = var9_10;
                var1_1.i = var12_13;
                var1_1.a();
            } else if ((var1_1 = this.H) != null) {
                var1_1.setVisibility(var8_9);
            }
            var3_4 = TextUtils.isEmpty((CharSequence)var2_3);
            if (!var3_4 && !(var3_4 = kotlin.text.b.i((String)var2_3, (String)(var1_1 = "ajio"), var12_13)) && (var1_1 = this.H) != null) {
                var1_1.setVisibility(var8_9);
            }
            if ((var1_1 = this.L) == null) return;
            var1_1.stopLoader();
            return;
        }
        var2_3 = yn3_0.a;
        var2_3.e(var1_2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Wa(NavigationParent var1_1) {
        block31: {
            block32: {
                var2_2 = 1;
                this.l = var1_1 /* !! */ ;
                if (var1_1 /* !! */  == null) {
                    var1_1 /* !! */  = this.k;
                    this.l = var1_1 /* !! */ ;
                }
                this.Q = "luxe";
                var3_3 = this.getChildFragmentManager();
                var4_4 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
                this.P = var1_1 /* !! */  = new qv1$a_0(this, (FragmentManager)var3_3);
                var3_3 = this.G;
                if (var3_3 != null) {
                    var3_3.setAdapter((Uk2)var1_1 /* !! */ );
                }
                if ((var1_1 /* !! */  = this.E) != null) {
                    var3_3 = this.G;
                    var1_1 /* !! */ .setupWithViewPager((ViewPager)var3_3);
                }
                if ((var1_1 /* !! */  = this.F) != null) {
                    var3_3 = new da$a();
                    var3_3.k = var2_2;
                    var3_3.g = var2_2;
                    var3_3.s = var2_2;
                    var3_3.b = var5_5 = R$drawable.ic_category_lux;
                    var4_4 = (jo_2)this.p0.getValue();
                    var6_6 = ld3_2.STORE_LUXE.getStoreId();
                    var3_3.n = var4_4 = var4_4.j(var6_6);
                    var3_3.u = var1_1 /* !! */ ;
                    var3_3.i = var2_2;
                    var3_3.a();
                }
                var1_1 /* !! */  = this.E;
                var7_7 = 8;
                var5_5 = 0;
                var4_4 = null;
                var6_6 = null;
                if (var1_1 /* !! */  == null) break block31;
                var1_1 /* !! */  = this.l;
                if (var1_1 /* !! */  != null) {
                    if ((var1_1 /* !! */  = var1_1 /* !! */ .getData()) != null) {
                        var1_1 /* !! */  = var1_1 /* !! */ .getChildDetails();
                    } else {
                        var8_8 = 0;
                        var1_1 /* !! */  = null;
                    }
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */  = this.M;
                        var1_1 /* !! */ .clear();
                        var9_9 = this.l;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9 = var9_9.getData();
                        Intrinsics.checkNotNull(var9_9);
                        var9_9 = var9_9.getChildDetails();
                        Intrinsics.checkNotNull(var9_9);
                        var9_9 = var9_9.iterator();
                        var10_10 = 0;
                        var11_11 = null;
                        while ((var12_12 = (int)var9_9.hasNext()) != 0) {
                            var13_13 = (CMSNavigation)var9_9.next();
                            var14_14 /* !! */  = this.E;
                            if (var14_14 /* !! */  != null) {
                                var14_14 /* !! */  = var14_14 /* !! */ .getTabAt(var10_10);
                            } else {
                                var15_15 = 0;
                                var14_14 /* !! */  = null;
                            }
                            var16_16 = var13_13.getName();
                            if (var16_16 != null) {
                                var16_16 = var16_16.toUpperCase();
                                var17_17 = "toUpperCase(...)";
                                Intrinsics.checkNotNullExpressionValue(var16_16, (String)var17_17);
                            } else {
                                var18_18 = 0;
                                var16_16 = null;
                            }
                            var1_1 /* !! */ .add(var16_16);
                            if (var14_14 /* !! */  == null) continue;
                            var16_16 = LayoutInflater.from((Context)this.n);
                            var19_19 = R$layout.tab_lux_category;
                            var16_16 = var16_16.inflate(var19_19, null, false);
                            var19_19 = R$id.tab_lbl_slash;
                            var17_17 = (AjioTextView)var16_16.findViewById(var19_19);
                            var20_20 = R$id.tab_tv_text;
                            var21_21 = (AjioTextView)var16_16.findViewById(var20_20);
                            var13_13 = var13_13.getName();
                            var21_21.setText((CharSequence)var13_13);
                            if (var10_10 == 0) {
                                var21_21.underlineText();
                                var17_17.setVisibility(var7_7);
                                var13_13 = this.C;
                                var21_21.setTypeface((Typeface)var13_13);
                            } else {
                                var21_21.removeUnderlineText();
                                var13_13 = this.D;
                                var21_21.setTypeface((Typeface)var13_13);
                                var17_17.setVisibility(0);
                            }
                            Intrinsics.checkNotNull(var16_16);
                            var14_14 /* !! */ .setCustomView((View)var16_16);
                            var10_10 += var2_2;
                        }
                        var1_1 /* !! */  = this.E;
                        if (var1_1 /* !! */  != null) {
                            var9_9 = new rv1_2(this);
                            var1_1 /* !! */ .addOnTabSelectedListener((TabLayout$OnTabSelectedListener)var9_9);
                        }
                    }
                }
                var1_1 /* !! */  = this.E;
                Intrinsics.checkNotNull(var1_1 /* !! */ );
                var8_8 = var1_1 /* !! */ .getWidth();
                var9_9 = this.R;
                Intrinsics.checkNotNull(var9_9);
                var10_10 = R$id.vlcLuxeTabContainer;
                var9_9.setId(var10_10);
                var11_11 = this.E;
                Intrinsics.checkNotNull(var11_11);
                var12_12 = R$id.category_tabLayout;
                var11_11.setId(var12_12);
                var13_13 = yn3_0.a;
                var14_14 /* !! */  = Gj0.b(var8_8, "AjioHome: LuxeTabWidth: ", " :: marginSide: 10");
                var16_16 = new Object[]{};
                var13_13.a(var14_14 /* !! */ , var16_16);
                var13_13 = var11_11.getLayoutParams();
                var14_14 /* !! */  = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                Intrinsics.checkNotNull(var13_13, var14_14 /* !! */ );
                var13_13 = (ConstraintLayout$LayoutParams)var13_13;
                var15_15 = 10;
                if (var8_8 <= 0) break block32;
                AJIOApplication.Companion.getClass();
                var16_16 = AJIOApplication$a.a();
                var18_18 = el3.b((Context)var16_16) + -20;
                if (var8_8 < var18_18) ** GOTO lbl-1000
            }
            if ((var8_8 = var11_11.getTabCount()) <= (var18_18 = 4)) lbl-1000:
            // 2 sources

            {
                var13_13.t = var8_8 = var9_9.getId();
                var13_13.v = var8_8 = var9_9.getId();
                var13_13.setMarginStart(var15_15);
                var13_13.setMarginEnd(var15_15);
                var11_11.setLayoutParams((ViewGroup.LayoutParams)var13_13);
                var11_11.requestLayout();
                var8_8 = 2;
                var11_11.setTabGravity(var8_8);
                var11_11.setTabMode(var2_2);
            } else {
                var13_13.t = var8_8 = var9_9.getId();
                var13_13.setMarginStart(var15_15);
                var13_13.setMarginEnd(var15_15);
                var11_11.setLayoutParams((ViewGroup.LayoutParams)var13_13);
                var11_11.requestLayout();
                var11_11.setTabGravity(var2_2);
                var11_11.setTabMode(0);
            }
        }
        if ((var1_1 /* !! */  = this.J) != null) {
            var1_1 /* !! */ .setVisibility(0);
        }
        if ((var1_1 /* !! */  = this.K) != null) {
            var1_1 /* !! */ .setVisibility(var7_7);
        }
        this.eb();
        var1_1 /* !! */  = h40_0.a;
        var1_1 /* !! */  = h40_0.U();
        var22_22 = var1_1 /* !! */ .length();
        if (var22_22 > 0) {
            var1_1 /* !! */  = (NavigationParent)JsonUtils.fromJson((String)var1_1 /* !! */ , NavigationParent.class);
            var9_9 = this.l;
            if (var9_9 != null) {
                if (var1_1 /* !! */  != null) {
                    var11_11 = var1_1 /* !! */ .getSwitchtoStoreIcon();
                } else {
                    var10_10 = 0;
                    var11_11 = null;
                }
                var9_9.setSwitchtoStoreIcon((String)var11_11);
            }
            if ((var9_9 = this.l) != null) {
                if (var1_1 /* !! */  != null) {
                    var4_4 = var1_1 /* !! */ .getSwitchtoStoreId();
                }
                var9_9.setSwitchtoStoreId((String)var4_4);
            }
        }
        var1_1 /* !! */  = z40_0.Companion;
        var4_4 = (Application)this.k0.getValue();
        var9_9 = "<get-mApplication>(...)";
        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var9_9);
        var1_1 /* !! */ .getClass();
        var1_1 /* !! */  = z40$a.a((Context)var4_4).a;
        var4_4 = "hambuger_store_switch_enable";
        var8_8 = (int)var1_1 /* !! */ .a((String)var4_4);
        if (var8_8 != 0 && (var1_1 /* !! */  = this.l) != null && (var1_1 /* !! */  = var1_1 /* !! */ .getSwitchtoStoreIcon()) != null && (var8_8 = (int)kotlin.text.b.k((CharSequence)var1_1 /* !! */ )) == 0) {
            var1_1 /* !! */  = this.H;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */ .setVisibility(0);
            }
            var1_1 /* !! */  = new da$a();
            var1_1 /* !! */ .k = var2_2;
            var1_1 /* !! */ .a = var7_7 = R$drawable.component_placeholder;
            var1_1 /* !! */ .b = var7_7;
            var1_1 /* !! */ .c = var7_7;
            var1_1 /* !! */ .s = var2_2;
            var7_7 = R$string.acc_icon_product_placeholder;
            var3_3 = hv3_0.K(var7_7);
            var1_1 /* !! */ .b((String)var3_3);
            var3_3 = UrlHelper.Companion.getInstance();
            var4_4 = this.l;
            Intrinsics.checkNotNull(var4_4);
            var4_4 = var4_4.getSwitchtoStoreIcon();
            var3_3 = var3_3.getImageUrl((String)var4_4);
            var4_4 = this.H;
            Intrinsics.checkNotNull(var4_4);
            var1_1 /* !! */ .n = var3_3;
            var1_1 /* !! */ .u = var4_4;
            var1_1 /* !! */ .i = var2_2;
            var1_1 /* !! */ .a();
        } else {
            var1_1 /* !! */  = this.H;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */ .setVisibility(var7_7);
            }
        }
        this.fb();
        var1_1 /* !! */  = this.L;
        if (var1_1 /* !! */  != null) {
            var1_1 /* !! */ .stopLoader();
        }
    }

    public final void Xa(StoreInfo object) {
        boolean bl2;
        this.O = object;
        object = this.l;
        if (object == null) {
            return;
        }
        boolean bl3 = og1_1.c();
        if (bl3 != (bl2 = this.N)) {
            this.N = bl3 = og1_1.c();
            object = this.Q;
            this.cb((String)object);
            return;
        }
        bl3 = og1_1.c();
        if (bl3) {
            this.fb();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Za(Fragment fragment) {
        IllegalStateException illegalStateException2;
        Object object;
        block8: {
            Object object2;
            Object object3;
            boolean bl2;
            int n3;
            int n4;
            block7: {
                object = this.q;
                if (object == null) {
                    return;
                }
                this.p = n4 = -1;
                object = this.getActivity();
                if (object == null) return;
                object = this.getActivity();
                n3 = 1;
                if (object != null && (n4 = (int)(object.isFinishing() ? 1 : 0)) == n3) {
                    return;
                }
                object = this.T;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("category_imv_back");
                    n4 = 0;
                    object = null;
                }
                bl2 = false;
                object.setVisibility(0);
                object = this.getChildFragmentManager();
                object3 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                try {
                    object3 = this.q;
                    if (object3 == null) break block7;
                    object3.bringToFront();
                }
                catch (IllegalStateException illegalStateException2) {
                    break block8;
                }
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(object3 = this.B)))) {
                object3 = this.B;
                this.B = object3 = hv3_0.u((String)object3);
                object2 = this.z;
                if (object2 != null) {
                    object2.setText((CharSequence)object3);
                }
            }
            object.getClass();
            object3 = new a((FragmentManager)object);
            n4 = R$id.sub_category_frame;
            object2 = this.f;
            ((k)object3).j(n4, fragment, (String)object2);
            ((a)object3).o(n3 != 0, n3 != 0);
            fragment = this.H;
            if (fragment == null) return;
            n4 = 8;
            fragment.setVisibility(n4);
            return;
        }
        object = yn3_0.a;
        object.e(illegalStateException2);
    }

    public final FragmentCategoryBinding bb() {
        Object object = s0[0];
        object = this.r0.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentCategoryBinding)object;
    }

    public final void cb(String object) {
        boolean bl2 = og1_1.c();
        if (bl2) {
            object = this.L;
            if (object != null) {
                ((AjioLoaderView)((Object)object)).startLoader();
            }
            if ((object = this.k) != null) {
                this.Wa(null);
                return;
            }
            object = this.g;
            if (object != null) {
                String string2 = "LUXE";
                ((hq_2)object).b(string2);
            }
        } else {
            Object object2 = this.j;
            if (object2 == null && (object2 = this.l) == null) {
                object2 = this.L;
                if (object2 != null) {
                    ((AjioLoaderView)((Object)object2)).startLoader();
                }
                if (object != null) {
                    object2 = this.g;
                    if (object2 != null) {
                        ((hq_2)object2).b((String)object);
                    }
                } else {
                    object = this.g;
                    if (object != null) {
                        object2 = "Ajio";
                        ((hq_2)object).b((String)object2);
                    }
                }
            }
        }
    }

    public final String d() {
        return this.B;
    }

    public final void db(NavImpl object, int n3) {
        int n4 = this.p;
        if (n4 != n3) {
            n4 = object instanceof CMSNavigation;
            Object object2 = this.q0;
            Object object3 = "selected_category";
            String string2 = "page_name";
            Object object4 = "NAVIGATION";
            Object object5 = "CATEGORY_NAME";
            Object object6 = "globalNav_";
            Object object7 = null;
            String string3 = "Global Nav";
            if (n4 != 0) {
                boolean bl2;
                object = (CMSNavigation)object;
                String string4 = ((CMSNavigation)object).getName();
                FirebaseEvents firebaseEvents = FirebaseEvents.Companion.getInstance();
                object6 = kp1_0.c((String)object6, string4);
                Bundle bundle = new Bundle();
                firebaseEvents.sendEvent((String)object6, bundle);
                object6 = ((CMSNavigation)object).getChildDetails();
                if (object6 != null && !(bl2 = object6.isEmpty())) {
                    object6 = this.l;
                    if (object6 != null) {
                        if ((object6 = ((NavigationParent)object6).getData()) != null) {
                            object7 = ((NavigationDataClass)object6).getChildDetails();
                        }
                        Intrinsics.checkNotNull(object7);
                        object7 = object6 = object7.get(n3);
                        object7 = (CMSNavigation)object6;
                        this.B = object6 = ((CMSNavigation)object7).getName();
                    }
                    object2 = ((r81_0)((hh3_2)object2).getValue()).a;
                    object6 = this.r;
                    ((LiveData)object2).k(object6);
                    yv1_1.Companion.getClass();
                    object2 = new yv1_1();
                    object6 = new Bundle();
                    if (string4 != null) {
                        object6.putString((String)object5, string4);
                    }
                    if (object7 != null) {
                        object6.putParcelable((String)object4, (Parcelable)object7);
                    }
                    ((Fragment)object2).setArguments((Bundle)object6);
                    object4 = AnalyticsManager.Companion;
                    object5 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
                    ak0_0.a((AnalyticsManager$Companion)object4, (GTMEvents)object5, string3, string4);
                    this.Za((Fragment)object2);
                    string4 = new Bundle();
                    object = ((CMSNavigation)object).getName();
                    string4.putString(string2, (String)object);
                    string4.putInt((String)object3, n3);
                } else {
                    object2 = AnalyticsManager.Companion;
                    object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, string3, string4);
                    this.f((CMSNavigation)object);
                }
                this.p = n3;
            } else {
                n4 = object instanceof Navigation;
                if (n4 != 0) {
                    int n7;
                    int n8;
                    object = (Navigation)object;
                    String string5 = ((Navigation)object).getName();
                    FirebaseEvents firebaseEvents = FirebaseEvents.Companion.getInstance();
                    object6 = kp1_0.c((String)object6, string5);
                    Bundle bundle = new Bundle();
                    firebaseEvents.sendEvent((String)object6, bundle);
                    object6 = ((Navigation)object).getChildDetails();
                    if ((object6 == null || (n8 = object6.isEmpty()) != 0) && (object6 = ((Navigation)object).getLinkDetails()) != null && (object6 = ((Navigation)object).getLinkDetails()) != null && (n8 = object6.size()) == (n7 = 1)) {
                        if ((object = ((Navigation)object).getLinkDetails()) != null) {
                            object2 = null;
                            object7 = object = object.get(0);
                            object7 = (LinkDetail)object;
                        }
                        object = AnalyticsManager.Companion;
                        object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                        ((GTMEvents)object2).pushButtonTapEvent(string3, string5, (String)object);
                        Intrinsics.checkNotNull(object7);
                        this.i((LinkDetail)object7);
                    } else {
                        object6 = this.l;
                        if (object6 != null) {
                            object6 = ((NavigationParent)object6).getChildDetails();
                            Intrinsics.checkNotNull(object6);
                            object7 = object6 = object6.get(n3);
                            object7 = (Navigation)object6;
                            this.B = object6 = ((Navigation)object7).getName();
                        }
                        object2 = ((r81_0)((hh3_2)object2).getValue()).a;
                        object6 = this.r;
                        ((LiveData)object2).k(object6);
                        nf3_2.Companion.getClass();
                        object2 = new nf3_2();
                        object6 = new Bundle();
                        if (object7 != null) {
                            object6.putParcelable((String)object4, (Parcelable)object7);
                        }
                        if (string5 != null) {
                            object6.putString((String)object5, string5);
                        }
                        ((Fragment)object2).setArguments((Bundle)object6);
                        object4 = AnalyticsManager.Companion;
                        object5 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
                        ak0_0.a((AnalyticsManager$Companion)object4, (GTMEvents)object5, string3, string5);
                        this.Za((Fragment)object2);
                        string5 = new Bundle();
                        object = ((Navigation)object).getName();
                        string5.putString(string2, (String)object);
                        string5.putInt((String)object3, n3);
                    }
                    this.p = n3;
                }
            }
        } else {
            int n10;
            this.p = n10 = -1;
        }
    }

    public final void e(int n3) {
        Object object = this.m;
        int n4 = ((ArrayList)object).size();
        if (n4 > n3) {
            object = ((ArrayList)object).get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (NavImpl)object;
            this.db((NavImpl)object, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void eb() {
        IllegalStateException illegalStateException2;
        block9: {
            Object object;
            block8: {
                Object object2;
                int n3;
                boolean bl2;
                object = this.getActivity();
                if (object == null) return;
                object = this.getActivity();
                boolean bl3 = true;
                if (object != null && (bl2 = (boolean)object.isFinishing()) == bl3) {
                    return;
                }
                bl2 = -1 != 0;
                this.p = bl2;
                object = this.T;
                if (object != null) {
                    n3 = 8;
                    object.setVisibility(n3);
                }
                if ((object = this.Q) != null && (object = this.O) != null) {
                    object = this.z;
                    if (object != null) {
                        n3 = R$string.shop_by_category;
                        object2 = hv3_0.K(n3);
                        object.setText((CharSequence)object2);
                    }
                } else {
                    object = this.z;
                    if (object != null) {
                        n3 = R$string.shop_by;
                        object2 = hv3_0.K(n3);
                        object.setText((CharSequence)object2);
                    }
                }
                try {
                    object = this.getChildFragmentManager();
                    object2 = "getChildFragmentManager(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object.getClass();
                    object2 = new a((FragmentManager)object);
                    String string2 = "beginTransaction(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    string2 = this.f;
                    object = ((FragmentManager)object).E(string2);
                    if (object == null) break block8;
                    ((a)object2).i((Fragment)object);
                    ((a)object2).o(bl3, bl3);
                }
                catch (IllegalStateException illegalStateException2) {
                    break block9;
                }
            }
            if ((object = this.o) == null) return;
            object.bringToFront();
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(illegalStateException2);
    }

    public final void f(CMSNavigation cMSNavigation) {
        if (cMSNavigation == null) {
            return;
        }
        K82 k82 = this.i;
        if (k82 != null) {
            cMSNavigation.getPageType();
            k82.a1(cMSNavigation);
        }
    }

    public final void fa(int n3) {
        Object object = this.m;
        int n4 = ((ArrayList)object).size();
        if (n4 > n3) {
            object = ((ArrayList)object).get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (NavImpl)object;
            this.db((NavImpl)object, n3);
        }
    }

    public final void fb() {
        Object object;
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3 = (jo_2)this.p0.getValue();
        if (object3 != null) {
            String string2 = "LUX_SELECTED_PAGE";
            object2 = "";
            object3 = ((sw_0)object3).getPreference(string2, (String)object2);
        } else {
            bl3 = false;
            object3 = null;
        }
        boolean bl4 = true;
        int n3 = 0;
        object2 = null;
        if (object3 != null && !(bl2 = kotlin.text.b.k((CharSequence)object3))) {
            int n4;
            block12: {
                object3 = ((String)object3).toUpperCase();
                Intrinsics.checkNotNullExpressionValue(object3, "toUpperCase(...)");
                object = this.M;
                int n7 = ((ArrayList)object).size();
                for (n4 = 0; n4 < n7; ++n4) {
                    String string2 = (String)((ArrayList)object).get(n4);
                    boolean bl5 = kotlin.text.b.i((String)object3, string2, bl4);
                    if (!bl5) {
                        String string3 = "\"";
                        StringBuilder stringBuilder = new StringBuilder(string3);
                        stringBuilder.append(string2);
                        stringBuilder.append(string3);
                        string2 = stringBuilder.toString();
                        boolean bl6 = kotlin.text.b.i((String)object3, string2, bl4);
                        if (!bl6) {
                            continue;
                        }
                    }
                    break block12;
                }
                n4 = 0;
            }
            if ((object3 = this.E) != null) {
                bl2 = false;
                object = null;
                ((TabLayout)((Object)object3)).setScrollPosition(n4, 0.0f, bl4);
            }
            if ((object3 = this.G) != null) {
                ((ViewPager)((Object)object3)).setCurrentItem(n4);
            }
        }
        if ((object3 = this.l) != null && (object3 = ((NavigationParent)object3).getSwitchtoStoreIcon()) != null && !(bl3 = kotlin.text.b.k((CharSequence)object3))) {
            object3 = this.I;
            if (object3 != null) {
                object3.setVisibility(0);
            }
            object3 = new da$a();
            ((da$a)object3).k = bl4;
            ((da$a)object3).a = n3 = R$drawable.component_placeholder;
            ((da$a)object3).b = n3;
            ((da$a)object3).c = n3;
            ((da$a)object3).s = bl4;
            n3 = R$string.acc_icon_product_placeholder;
            object2 = hv3_0.K(n3);
            ((da$a)object3).b((String)object2);
            object2 = UrlHelper.Companion.getInstance();
            object = this.l;
            Intrinsics.checkNotNull(object);
            object = ((NavigationParent)object).getSwitchtoStoreIcon();
            object2 = ((UrlHelper)object2).getImageUrl((String)object);
            object = this.I;
            Intrinsics.checkNotNull(object);
            ((da$a)object3).n = object2;
            ((da$a)object3).u = object;
            ((da$a)object3).i = bl4;
            ((da$a)object3).a();
        } else {
            object3 = this.I;
            if (object3 != null) {
                int n8 = 8;
                object3.setVisibility(n8);
            }
        }
    }

    public final void gb(LoginSignupBenefitsBannerData object) {
        Object object2 = ((LoginSignupBenefitsBannerData)object).getAppLoginBannerUrl();
        if (object2 != null) {
            da$a da$a;
            object2 = this.S;
            if (object2 != null) {
                da$a = null;
                object2.setVisibility(0);
            }
            if ((object2 = this.S) != null) {
                boolean bl2;
                da$a = new da$a();
                da$a.k = bl2 = true;
                da$a.g = bl2;
                da$a.n = object = ((LoginSignupBenefitsBannerData)object).getAppLoginBannerUrl();
                da$a.u = object2;
                da$a.a();
            }
        }
    }

    public final void hb() {
        String string2;
        int n3;
        Object object = this.z;
        if (object != null) {
            n3 = R$string.shop_by;
            string2 = hv3_0.K(n3);
            object.setText((CharSequence)string2);
        }
        object = this.A;
        n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        object = this.bb().viewCategory.categoryImvClose;
        int n4 = hv3_0.m(R$color.accent_color_10);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        object.setColorFilter(n4, mode);
        object = this.bb().viewCategory.categoryImvLogo;
        n4 = R$drawable.ic_cat_ajio_logo;
        ((AppCompatImageView)((Object)object)).setImageResource(n4);
        object = this.bb().viewCategory.categoryImvSearch;
        n4 = hv3_0.m(R$color.accent_color_10);
        object.setColorFilter(n4, mode);
        object = this.x;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.w) != null) {
            n3 = 0;
            string2 = null;
            object.setVisibility(0);
        }
        if ((object = this.u) != null) {
            n3 = hv3_0.m(R$color.accent_color_11);
            object.setBackgroundColor(n3);
        }
    }

    public final void i(LinkDetail linkDetail) {
        if (linkDetail == null) {
            return;
        }
        K82 k82 = this.i;
        if (k82 != null) {
            String string2 = linkDetail.getPage();
            String string3 = this.Q;
            k82.n(string2, linkDetail, string3);
        }
    }

    public final void jb(StoreInfo storeInfo) {
        Object object;
        int n3;
        int n4 = 1;
        int n7 = 0;
        Object object2 = null;
        Object object3 = this.z;
        if (object3 != null) {
            n3 = R$string.shop_by_category;
            object = hv3_0.K(n3);
            object3.setText((CharSequence)object);
        }
        if ((object3 = this.A) != null) {
            object3.setVisibility(0);
        }
        if ((object3 = this.A) != null) {
            n3 = R$string.shop_by_subtitle;
            String string2 = hv3_0.u(storeInfo.storeTitle);
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            object2 = hv3_0.L(n3, objectArray);
            object3.setText((CharSequence)object2);
        }
        object2 = this.w;
        int n8 = 8;
        if (object2 != null) {
            object2.setVisibility(n8);
        }
        if ((object2 = this.x) != null) {
            object2.setVisibility(n8);
        }
        if ((object2 = this.u) != null) {
            object3 = storeInfo.getColorTheme();
            n8 = Color.parseColor((String)object3);
            object2.setBackgroundColor(n8);
        }
        object2 = new da$a();
        ((da$a)object2).k = n4;
        ((da$a)object2).a = n8 = 17170445;
        ((da$a)object2).b = n8;
        ((da$a)object2).c = n8;
        ((da$a)object2).s = n4;
        object3 = hv3_0.K(R$string.acc_icon_product_placeholder);
        ((da$a)object2).b((String)object3);
        ((da$a)object2).g = n4;
        object3 = storeInfo.getSmallerLogo();
        object = this.bb().viewCategory.categoryImvLogo;
        ((da$a)object2).n = object3;
        ((da$a)object2).u = object;
        ((da$a)object2).i = n4;
        ((da$a)object2).a();
        AjioImageView ajioImageView = this.bb().viewCategory.categoryImvClose;
        n7 = Color.parseColor((String)storeInfo.getHeaderIconColor());
        object3 = PorterDuff.Mode.SRC_IN;
        ajioImageView.setColorFilter(n7, (PorterDuff.Mode)object3);
        ajioImageView = this.bb().viewCategory.categoryImvSearch;
        int n10 = Color.parseColor((String)storeInfo.getHeaderIconColor());
        ajioImageView.setColorFilter(n10, (PorterDuff.Mode)object3);
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (AppCompatActivity)object;
        this.n = object;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.OnNavigationClickListener");
        object = (K82)object;
        this.i = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        int n3;
        int n4;
        Object object;
        int n7;
        qv1_2 qv1_22 = this;
        if (view != null) {
            n7 = view.getId();
            object = n7;
        } else {
            n7 = 0;
            object = null;
        }
        int n8 = R$id.category_imv_home;
        if (object != null && (n4 = ((Integer)object).intValue()) == n8) {
            object = qv1_22.l;
            if (object == null) return;
            object = qv1_22.i;
            if (object != null) {
                object.v();
            }
            object = AnalyticsManager.Companion;
            GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            String string2 = "Header Click";
            String string3 = "Home";
            ak0_0.a((AnalyticsManager$Companion)object, gTMEvents, string2, string3);
            NewCustomEventsRevamp newCustomEventsRevamp = qv1_22.X;
            String string4 = newCustomEventsRevamp.getEC_USER_INTERACTION();
            String string5 = newCustomEventsRevamp.getEA_NAV_CLICK_HEADER();
            String string6 = newCustomEventsRevamp.getEN_NAV_CLICK();
            String string7 = av_0.a((AnalyticsManager$Companion)object);
            String string8 = av_0.a((AnalyticsManager$Companion)object);
            String string9 = "home";
            String string10 = qv1_22.Y;
            String string11 = qv1_22.Z;
            int n10 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string5, string9, string6, string7, string8, string10, null, string11, false, null, n10, null);
            return;
        }
        n8 = R$id.category_imv_ajio_lux;
        n4 = 1;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            object = qv1_22.l;
            if (object == null) return;
            if ((object = ((NavigationParent)object).getSwitchtoStoreId()) == null) return;
            String string12 = ld3_2.STORE_LUXE.getStoreId();
            n7 = (int)(((String)object).equalsIgnoreCase(string12) ? 1 : 0);
            if (n7 != 0) {
                object = qv1_22.i;
                if (object == null) return;
                object.c(n4 != 0);
                return;
            }
            object = qv1_22.i;
            if (object == null) return;
            object.f(n4 != 0);
            return;
        }
        n8 = R$id.category_imv_revamp;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            object = qv1_22.l;
            if (object == null) return;
            if ((object = ((NavigationParent)object).getSwitchtoStoreId()) == null) return;
            String string13 = ld3_2.STORE_LUXE.getStoreId();
            n7 = (int)(((String)object).equalsIgnoreCase(string13) ? 1 : 0);
            if (n7 != 0) {
                object = qv1_22.i;
                if (object == null) return;
                object.c(n4 != 0);
                return;
            }
            object = qv1_22.i;
            if (object == null) return;
            object.f(n4 != 0);
            return;
        }
        n8 = R$id.category_imv_close;
        if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
            n8 = R$id.category_lux_imv_close;
            if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
                n8 = R$id.category_imv_search;
                if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
                    n8 = R$id.category_tv_search;
                    if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
                        n8 = R$id.category_search_layout;
                        if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
                            n8 = R$id.category_lux_imv_search;
                            if (object == null || (n4 = ((Integer)object).intValue()) != n8) {
                                n8 = R$id.category_imv_back;
                                if (object == null) {
                                    return;
                                }
                                n7 = (Integer)object;
                                if (n7 != n8) return;
                                this.eb();
                                return;
                            }
                        }
                    }
                }
                if ((object = qv1_22.i) == null) return;
                String string14 = qv1_22.Q;
                object.D1(string14);
                return;
            }
        }
        if ((object = qv1_22.i) == null) return;
        object.P();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.n;
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
            this.g = object = (hq_2)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_category;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object2 = hv3_0.o(10, (Context)object2);
        this.C = object2;
        object2 = AJIOApplication$a.a();
        int n3 = 9;
        object2 = hv3_0.o(n3, (Context)object2);
        this.D = object2;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        Object object5 = oa1_1.class;
        Object object6 = "modelClass";
        object2 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object2, object5, (String)object6);
        object3 = "<this>";
        object4 = sw0_0.a(object5, (String)object3, object5, (String)object6, (String)object6);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = object4.getQualifiedName();
        if (object3 != null) {
            Object object7;
            boolean bl2;
            object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object5).concat((String)object3);
            this.h = object2 = (oa1_1)((pD3)object2).a((yn1_2)object4, (String)object3);
            int n4 = R$id.category_tv_header;
            object2 = (TextView)object.findViewById(n4);
            this.x = object2;
            n4 = R$id.category_imv_home;
            object2 = (ImageView)object.findViewById(n4);
            this.w = object2;
            n4 = R$id.category_imv_logo;
            object2 = (ImageView)object.findViewById(n4);
            this.v = object2;
            n4 = R$id.view_category;
            object2 = object.findViewById(n4);
            this.K = object2;
            n4 = R$id.view_lux_category;
            object2 = object.findViewById(n4);
            this.J = object2;
            n4 = R$id.category_imv_revamp;
            object2 = (ImageView)object.findViewById(n4);
            this.I = object2;
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            n4 = R$id.category_imv_ajio_lux;
            object2 = (ImageView)object.findViewById(n4);
            this.H = object2;
            n4 = R$id.category_viewpager;
            object2 = (ViewPager)object.findViewById(n4);
            this.G = object2;
            n4 = R$id.category_tabLayout;
            object2 = (TabLayout)object.findViewById(n4);
            this.E = object2;
            n4 = R$id.luxe_ic_side_nav;
            object2 = (ImageView)object.findViewById(n4);
            this.F = object2;
            n4 = R$id.vlcLuxeTabContainer;
            object2 = (ConstraintLayout)object.findViewById(n4);
            this.R = object2;
            n4 = R$id.sub_category_frame;
            object2 = (FrameLayout)object.findViewById(n4);
            this.q = object2;
            n4 = R$id.category_rv;
            object2 = (RecyclerView)object.findViewById(n4);
            this.o = object2;
            n4 = R$id.category_lux_imv_close;
            object2 = (ImageView)object.findViewById(n4);
            this.t = object2;
            n4 = R$id.category_progress_view;
            object2 = (AjioLoaderView)object.findViewById(n4);
            this.L = object2;
            n4 = R$id.iv_signup_benefit;
            object2 = (AjioImageView)object.findViewById(n4);
            this.S = object2;
            n4 = R$id.category_imv_back;
            object2 = (AjioImageView)object.findViewById(n4);
            this.T = object2;
            n4 = R$id.category_tv_search;
            object2 = object.findViewById(n4);
            n3 = R$id.category_imv_search;
            object3 = object.findViewById(n3);
            int n7 = R$id.category_lux_imv_search;
            object4 = object.findViewById(n7);
            int n8 = R$id.category_layout_search;
            object5 = object.findViewById(n8);
            this.u = object5;
            n8 = R$id.category_tv_title;
            object5 = (TextView)object.findViewById(n8);
            this.z = object5;
            n8 = R$id.category_subtitle_tv;
            object5 = (TextView)object.findViewById(n8);
            this.A = object5;
            n8 = R$id.category_search_layout;
            object = (LinearLayout)object.findViewById(n8);
            this.y = object;
            object = this.o;
            if (object != null) {
                object.bringToFront();
            }
            object5 = this.requireActivity();
            object = new LinearLayoutManager((Context)object5);
            object5 = this.o;
            if (object5 != null) {
                ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object);
            }
            qv1_2.ib(this.I);
            object = this.J;
            n8 = 8;
            if (object != null) {
                object.setVisibility(n8);
            }
            if ((object = this.t) != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            if ((object = this.w) != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            this.bb().viewCategory.categoryImvClose.setOnClickListener(this);
            object = this.y;
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            if (object2 != null) {
                object2.setOnClickListener((View.OnClickListener)this);
            }
            if (object3 != null) {
                object3.setOnClickListener((View.OnClickListener)this);
            }
            if (object4 != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            object = this.T;
            object2 = "category_imv_back";
            n3 = 0;
            object3 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.T;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            n4 = Color.parseColor((String)"#000000");
            object4 = PorterDuff.Mode.SRC_IN;
            object.setColorFilter(n4, (PorterDuff.Mode)object4);
            object = z40_0.Companion;
            object2 = (Application)this.k0.getValue();
            object6 = "<get-mApplication>(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
            object.getClass();
            object = z40$a.a((Context)object2).a;
            bl2 = ((ao0_0)object).a("hambuger_store_switch_enable");
            n4 = 0;
            object2 = null;
            if (bl2) {
                object = this.H;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.H) != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                object = this.H;
                qv1_2.ib((ImageView)object);
            } else {
                object = this.H;
                if (object != null) {
                    object.setVisibility(n8);
                }
            }
            object = this.g;
            if (object != null && (object = ((hq_2)object).g) != null) {
                object6 = this.getViewLifecycleOwner();
                object7 = new lv1_1(this);
                ((LiveData)object).e((mu1_1)object6, (F62)object7);
            }
            if ((object = this.g) != null && (object = ((hq_2)object).e) != null) {
                object6 = this.getViewLifecycleOwner();
                object7 = new mv1_2(this);
                ((LiveData)object).e((mu1_1)object6, (F62)object7);
            }
            if ((object = this.g) != null && (object = ((hq_2)object).f) != null) {
                object6 = this.getViewLifecycleOwner();
                object7 = new nv1_2(this);
                ((LiveData)object).e((mu1_1)object6, (F62)object7);
            }
            if ((object = this.g) != null && (object = ((hq_2)object).b) != null) {
                object6 = this.getViewLifecycleOwner();
                object7 = new ov1_2(this);
                ((LiveData)object).e((mu1_1)object6, (F62)object7);
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoginViewModel");
                bl2 = false;
                object = null;
            }
            object = ((oa1_1)object).q;
            object6 = this.getViewLifecycleOwner();
            object7 = new pv1_2(this);
            QV1$d qV1$d = new QV1$d((pv1_2)object7);
            ((LiveData)object).e((mu1_1)object6, qV1$d);
            this.bb().viewCategory.categoryImvClose.setVisibility(0);
            object = this.O;
            boolean bl3 = true;
            if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((StoreInfo)object).colorTheme)))) {
                object = this.u;
                if (object != null) {
                    int n10;
                    object7 = this.O;
                    if (object7 != null) {
                        object7 = ((StoreInfo)object7).colorTheme;
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    n10 = Color.parseColor((String)object7);
                    object.setBackgroundColor(n10);
                }
                if ((object = this.x) != null) {
                    object.setVisibility(n8);
                }
                if ((object = this.v) != null) {
                    object.setVisibility(n8);
                }
                if ((object = this.O) != null) {
                    object = ((StoreInfo)object).storeTitle;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null && !(bl2 = kotlin.text.b.k((CharSequence)object))) {
                    object = this.x;
                    if (object != null) {
                        object5 = this.O;
                        if (object5 != null) {
                            object3 = ((StoreInfo)object5).storeTitle;
                        }
                        object.setText((CharSequence)object3);
                    }
                    if ((object = this.x) != null) {
                        object.setVisibility(0);
                    }
                } else {
                    object = this.O;
                    if (object != null) {
                        object = ((StoreInfo)object).biggerLogo;
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) {
                        object = this.v;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        object = new da$a();
                        ((da$a)object).l = bl3;
                        ((da$a)object).g = bl3;
                        ((da$a)object).a = n4 = 17170445;
                        ((da$a)object).b = n4;
                        ((da$a)object).c = n4;
                        ((da$a)object).s = bl3;
                        n4 = R$string.acc_icon_product_placeholder;
                        object2 = hv3_0.K(n4);
                        ((da$a)object).b((String)object2);
                        object2 = this.O;
                        if (object2 != null) {
                            object3 = ((StoreInfo)object2).biggerLogo;
                        }
                        object2 = this.w;
                        Intrinsics.checkNotNull(object2);
                        ((da$a)object).n = object3;
                        ((da$a)object).u = object2;
                        ((da$a)object).i = bl3;
                        ((da$a)object).a();
                    }
                }
                object = this.bb().viewCategory.categoryImvClose;
                n4 = hv3_0.m(R$color.white);
                object.setColorFilter(n4, (PorterDuff.Mode)object4);
            } else {
                object = this.bb().viewCategory.categoryImvClose;
                n3 = hv3_0.m(R$color.accent_color_10);
                object.setColorFilter(n3, (PorterDuff.Mode)object4);
                object = this.u;
                if (object != null) {
                    n3 = hv3_0.m(R$color.white);
                    object.setBackgroundColor(n3);
                }
                if ((object = this.x) != null) {
                    object.setVisibility(n8);
                }
                if ((object = this.v) != null) {
                    object.setVisibility(0);
                }
                if ((object = this.v) != null) {
                    object2 = new da$a();
                    ((da$a)object2).k = bl3;
                    ((da$a)object2).g = bl3;
                    ((da$a)object2).s = bl3;
                    ((da$a)object2).b = n3 = R$drawable.ic_cat_ajio_logo;
                    object3 = (jo_2)this.p0.getValue();
                    object4 = ld3_2.STORE_AJIO.getStoreId();
                    ((da$a)object2).n = object3 = ((jo_2)object3).j((String)object4);
                    ((da$a)object2).u = object;
                    ((da$a)object2).i = bl3;
                    ((da$a)object2).a();
                }
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

