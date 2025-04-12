/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Message
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.media3.exoplayer.e;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.ViewPager2$i;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from vd3
 */
public final class vd3_2
extends Fragment
implements yv0_1 {
    public static final vd3$a_0 Companion;
    public tk2_2 a;
    public int b;
    public int c;
    public String d = "";
    public ir2 e;
    public ViewPager2 f;
    public j3_0 g;
    public final D h;
    public dr0_0 i;
    public ArrayList j;
    public int k;

    static {
        vd3$a_0 vd3$a_0;
        Companion = vd3$a_0 = new Object();
        Intrinsics.checkNotNullExpressionValue(vd3_2.class.getName(), "getName(...)");
    }

    public vd3_2() {
        ArrayList arrayList = Reflection.getOrCreateKotlinClass(f23_0.class);
        vd3$e vd3$e = new vd3$e(this);
        vd3$f vd3$f = new vd3$f(this);
        vd3$g vd3$g = new vd3$g(this);
        arrayList = LW0.a(this, (yn1_2)((Object)arrayList), vd3$e, vd3$f, vd3$g);
        this.h = arrayList;
        this.j = arrayList = new ArrayList();
    }

    public final void Oa(boolean bl2) {
        int n3;
        ViewPager2 viewPager2;
        int n4 = this.k;
        if (n4 == 0 && (viewPager2 = this.f) != null && (n4 = (int)(viewPager2.a() ? 1 : 0)) == (n3 = 1)) {
            viewPager2 = this.f;
            n3 = 0;
            Object object = null;
            if (viewPager2 != null) {
                n4 = viewPager2.getWidth();
            } else {
                n4 = 0;
                viewPager2 = null;
            }
            viewPager2 = ValueAnimator.ofInt((int[])new int[]{0, n4});
            long l2 = 400L;
            viewPager2.setDuration(l2);
            object = new xi0_0();
            viewPager2.setInterpolator((TimeInterpolator)object);
            object = new vd3$b_0((ValueAnimator)viewPager2, this);
            viewPager2.addListener((Animator.AnimatorListener)object);
            object = new td3_2(this, bl2);
            viewPager2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
            viewPager2.start();
        }
    }

    public final f23_0 Pa() {
        return (f23_0)this.h.getValue();
    }

    public final void Qa() {
        Object object;
        Object object2;
        Object object3 = this.getActivity();
        boolean bl2 = object3 instanceof AjioHomeActivity;
        if (bl2) {
            object3 = this.getActivity();
            object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = ((AjioHomeActivity)object3).T0;
            object = null;
            if (object3 != null) {
                object3 = ((Fragment)object3).getChildFragmentManager();
            } else {
                bl2 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            Object object4 = this.getActivity();
            Intrinsics.checkNotNull(object4, (String)object2);
            object2 = ((AjioHomeActivity)object4).getLifecycle();
            object4 = this.d;
            Object object5 = new tk2_2((FragmentManager)object3, (i)object2, (String)object4);
            this.a = object5;
            object3 = this.e;
            object3 = object3 != null ? CollectionsKt.m0((Collection)object3) : new ArrayList();
            this.j = object3;
            object3 = this.a;
            object2 = "pagerAdapter";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
            }
            object5 = this.j;
            ((tk2_2)object3).n((List)object5);
            object3 = this.f;
            if (object3 != null) {
                object5 = this.a;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object = object5;
                }
                ((ViewPager2)((Object)object3)).setAdapter((RecyclerView$f)object);
            }
        }
        if ((object3 = this.f) != null) {
            int n3 = this.b;
            object = null;
            ((ViewPager2)((Object)object3)).setCurrentItem(n3, false);
        }
        if ((object3 = this.f) != null) {
            object2 = new me0_2();
            ((ViewPager2)((Object)object3)).setPageTransformer((ViewPager2$i)object2);
        }
        if ((object3 = this.f) != null) {
            object2 = new vd3$d(this);
            ((ViewPager2)((Object)object3)).f((ViewPager2$g)object2);
        }
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 53;
        if (n3 == n7 && n4 == (n3 = -1)) {
            n3 = this.c;
            Object object = this.a;
            n7 = 0;
            Object object2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
                n4 = 0;
                object = null;
            }
            object = ((tk2_2)object).m;
            Object object3 = n3;
            if ((object3 = (ld3_1)((HashMap)object).get(object3)) != null) {
                int n8;
                Object object4;
                object = ((Fragment)object3).getArguments();
                if (object != null && (n4 = (int)((object = ((Fragment)object3).requireArguments()).containsKey((String)(object4 = "PLP_TYPE")) ? 1 : 0)) != 0) {
                    object = ((Fragment)object3).requireArguments();
                    n8 = 100;
                    n4 = object.getInt((String)object4, n8);
                } else {
                    n4 = 103;
                }
                object4 = ((ld3_1)object3).Qa().h.b;
                if (object4 != null && (object4 = ((Product)object4).getFnlColorVariantData()) != null && (object4 = ((ProductFnlColorVariantData)object4).getColorGroup()) != null && (n8 = ((String)object4).length()) > 0) {
                    Object object5 = ((ld3_1)object3).h;
                    if (object5 == null) {
                        object5 = "activityFragmentListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object2 = object5;
                    }
                    object2.startLoader();
                    object2 = ((ld3_1)object3).Qa();
                    ((e43_0)object2).c(n4, (String)object4);
                }
                n7 = 1;
                object = new ph_2((Fragment)object3, n7);
                gp0_1.b((Function0)object, (Fragment)object3);
            }
            return true;
        }
        return false;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.g = object;
            return;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = dr0_0.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.i = object = (dr0_0)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.story_details_activity;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        boolean bl2;
        super.onDestroyView();
        Object object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            object = null;
        }
        object = ((tk2_2)object).m.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object object3 = object2.getValue();
            boolean bl3 = object3 instanceof ld3_1;
            if (!bl3) continue;
            object2 = object2.getValue();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.fleek.stories.screen.main.StoryItemPagerFragment");
            object2 = (ld3_1)object2;
            object2.getClass();
            object3 = new Message();
            ((Message)object3).what = 1002;
            AnalyticsGAEventHandler analyticsGAEventHandler = AnalyticsGAEventHandler.Companion.getInstance();
            analyticsGAEventHandler.sendMessage((Message)object3);
            object3 = ld3_1.S;
            int n3 = ((ld3_1)object2).Oa();
            object3.put(n3, 0);
            object3 = ((ld3_1)object2).z;
            if (object3 != null) {
                ((StoriesProgressView)((Object)object3)).b();
            }
            if ((object3 = ((ld3_1)object2).m) != null) {
                ((e)object3).stop();
            }
            if ((object2 = ((ld3_1)object2).m) == null) continue;
            ((e)object2).release();
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = (Boolean)this.Pa().e.getValue();
        boolean n3 = (Boolean)object;
        if (n3) {
            Object object2;
            object = this.getArguments();
            if (object != null) {
                int n4;
                this.b = n4 = this.c;
                object = this.getArguments();
                if (object == null || (object = object.getString((String)(object2 = "KEY_PAGE"))) == null) {
                    object = "";
                }
                this.d = object;
                this.Qa();
            }
            object = this.Pa();
            object2 = Boolean.FALSE;
            object = ((f23_0)object).e;
            object.getClass();
            ((kb3_2)object).k(null, object2);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        vd3$c vd3$c;
        int n3;
        Object object3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = R$id.viewPager;
        object = (ViewPager2)object.findViewById(n7);
        this.f = object;
        object = this.Pa().a;
        object2 = this.getArguments();
        Object object4 = "";
        Object object5 = "KEY_PAGE";
        if (object2 == null || (object2 = object2.getString((String)object5)) == null) {
            object2 = object4;
        }
        object = (p83_0)object.get(object2);
        n7 = 0;
        object2 = null;
        if (object != null) {
            object = ((p83_0)object).a().c;
        } else {
            n4 = 0;
            object = null;
        }
        this.e = object;
        object = this.getArguments();
        if (object != null) {
            object3 = "page_pos";
            n3 = 0;
            vd3$c = null;
            this.b = n4 = object.getInt((String)object3, 0);
            object = this.getArguments();
            if (object != null && (object = object.getString((String)object5)) != null) {
                object4 = object;
            }
            this.d = object4;
            this.Qa();
        }
        object = this.i;
        object4 = "fleekViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            object = null;
        }
        object = ((dr0_0)object).t;
        object5 = this.getViewLifecycleOwner();
        n3 = 1;
        object3 = new bd0_2(this, n3);
        vd3$c = new vd3$c((Function1)object3);
        ((LiveData)object).e((mu1_1)object5, vd3$c);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object2 = object;
        }
        object = object2.u;
        object2 = this.getViewLifecycleOwner();
        object4 = new ud3_2(this);
        object5 = new vd3$c((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object5);
    }
}

