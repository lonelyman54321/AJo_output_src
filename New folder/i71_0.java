/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.y;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.LinePagerIndicatorDecoration;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Home.HomePageRatingResponse;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I71
 */
public final class i71_0
extends sm3_0 {
    public static final I71$a Companion;
    public TextView b;
    public RecyclerView c;
    public ArrayList d;
    public gE2 e;
    public o71_0 f;
    public int g;
    public ShimmerFrameLayout h;
    public N71 i;
    public boolean j;
    public Timer k;
    public String l;
    public LinearLayout m;
    public ShimmerFrameLayout n;
    public int o;
    public final lq2_1 p;
    public int q;

    static {
        I71$a i71$a;
        Companion = i71$a = new Object();
    }

    public i71_0() {
        int n3;
        ArrayList arrayList;
        this.d = arrayList = new ArrayList();
        this.g = n3 = -1;
        this.l = "LP";
        this.o = n3;
        lq2_1.Companion.getClass();
        lq2_1 lq2_12 = lq2$a_0.a(this);
        lq2_12.e();
        Object object = new iq2_1[1];
        Iq2$b iq2$b = Iq2$b.b;
        object[0] = iq2$b;
        lq2_12.g((iq2_1)object);
        object = PermissionTrigger.RATINGS;
        lq2_12.f((PermissionTrigger)((Object)object));
        this.p = lq2_12;
        this.q = n3;
    }

    public final void Pa(int n3) {
        int n4;
        Object object = this.getContext();
        if (object != null && (n4 = ((UserInformation)(object = UserInformation.getInstance(this.getContext()))).isUserOnline()) == 0) {
            return;
        }
        this.o = n3;
        Object object2 = this.c;
        n4 = 8;
        if (object2 != null) {
            object2.setVisibility(n4);
        }
        if ((object2 = this.b) != null) {
            object2.setVisibility(n4);
        }
        if ((n3 = (int)(Intrinsics.areEqual(object2 = this.l, object = "LP") ? 1 : 0)) != 0) {
            object2 = this.h;
            hv3_0.p0((ShimmerFrameLayout)((Object)object2));
        } else {
            object2 = this.n;
            hv3_0.p0((ShimmerFrameLayout)((Object)object2));
        }
        object2 = this.i;
        if (object2 != null && (object2 = ((N71)object2).a) != null) {
            ((t30_0)object2).d();
        }
        object2 = this.l;
        int n7 = ((String)object2).hashCode();
        int n8 = -490776197;
        Object object3 = "15";
        if (n7 != n8) {
            n8 = 2436;
            if (n7 != n8) {
                n4 = 79316;
                if (n7 == n4 && (n3 = (int)(((String)object2).equals(object = "PLP") ? 1 : 0)) != 0) {
                    cp_1.Companion.getClass();
                    object2 = cp$a.e();
                    object2.getClass();
                    object3 = cp_1.p((String)object, (String)object3);
                }
            } else {
                n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n3 != 0) {
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    object2 = "HomePage";
                    object3 = cp_1.p((String)object2, (String)object3);
                }
            }
        } else {
            object = "WIHSLIST";
            n3 = (int)(((String)object2).equals(object) ? 1 : 0);
            if (n3 != 0) {
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                object2 = "Wishlist";
                object3 = cp_1.p((String)object2, (String)object3);
            }
        }
        if ((object2 = this.i) != null) {
            Intrinsics.checkNotNullParameter(object3, "lastXDaysOrder");
            object = sE2.a((String)object3);
            n8 = 1;
            Function1 function1 = new s9_0((jD3)object2, n8);
            int n10 = 1;
            T9 t9 = new T9(n10, function1);
            function1 = new sp0_1(object2, n10);
            int n14 = 1;
            object3 = new V9(n14, function1);
            object = ((g53_0)object).f(t9, (o60_0)object3);
            object2 = ((N71)object2).a;
            ((t30_0)object2).b((yr0_2)object);
        }
    }

    public final void Qa(HomePageRatingResponse object) {
        Object object2;
        Object object3;
        int n3;
        Object object4 = this.c;
        if (object4 != null) {
            object4 = ((RecyclerView)object4).getOnFlingListener();
        } else {
            n3 = 0;
            object4 = null;
        }
        if (object4 == null) {
            object4 = new y();
            object3 = this.c;
            ((y)object4).attachToRecyclerView((RecyclerView)object3);
        }
        while (true) {
            object4 = this.c;
            object3 = null;
            if (object4 != null) {
                n3 = ((RecyclerView)object4).getItemDecorationCount();
            } else {
                n3 = 0;
                object4 = null;
            }
            if (n3 <= 0) break;
            object4 = this.c;
            if (object4 == null) continue;
            ((RecyclerView)object4).removeItemDecorationAt(0);
        }
        object4 = this.d;
        if (object4 != null) {
            n3 = ((ArrayList)object4).size();
        } else {
            n3 = 0;
            object4 = null;
        }
        int n4 = 1;
        if (n3 > n4 && (object4 = this.c) != null) {
            object2 = new LinePagerIndicatorDecoration();
            ((RecyclerView)object4).addItemDecoration((RecyclerView$n)object2);
        }
        object2 = this.requireActivity();
        object4 = new LinearLayoutManager((Context)object2, 0, false);
        object3 = this.c;
        if (object3 != null) {
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object4);
        }
        object3 = this.d;
        object2 = this.l;
        if ((object = ((HomePageRatingResponse)object).getRatingTitle()) == null) {
            int n7 = R$string.rate_experience;
            object = this.getString(n7);
            String string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
        this.f = object4 = new o71_0((String)object2, (String)object, (ArrayList)object3);
        object = this.c;
        if (object != null) {
            ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
        }
        object4 = Looper.getMainLooper();
        object = new Handler((Looper)object4);
        object4 = new F71(this);
        long l2 = 500L;
        object.postDelayed((Runnable)object4, l2);
        object = this.f;
        if (object != null) {
            ((o71_0)object).d = object4 = new k71_0(this);
        }
        if (object != null) {
            ((o71_0)object).e = object4 = new l71_0(this);
        }
        if ((object = this.c) != null) {
            object4 = new j71_0(this);
            ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object4);
        }
    }

    public final void Ra() {
        int n3;
        Object object = this.d;
        if (object != null) {
            n3 = this.g;
            object = (UserUnratedItem)CollectionsKt.N(n3, (List)object);
        } else {
            object = null;
        }
        if (object != null) {
            Serializable serializable = Boolean.FALSE;
            ((UserUnratedItem)object).setItemRated((Boolean)serializable);
            n3 = 0;
            serializable = Float.valueOf(0.0f);
            ((UserUnratedItem)object).setProductRating((Float)serializable);
            serializable = this.d;
            if (serializable != null) {
                int n4 = this.g;
                object = (UserUnratedItem)((ArrayList)serializable).set(n4, object);
            }
            if ((object = this.f) != null) {
                n3 = this.g;
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
    }

    public final void Sa(int n3) {
        i71_0 i71_02 = this;
        int n4 = n3;
        Object object = this.l;
        Object object2 = "LP";
        int n7 = Intrinsics.areEqual(object, object2);
        if (n7 == 0) {
            return;
        }
        object = this.f;
        if (object != null && n3 > (n7 = this.q)) {
            this.q = n3;
            object = this.d;
            if (object != null) {
                n7 = (int)(object.isEmpty() ? 1 : 0);
                int n8 = 1;
                if ((n7 ^= n8) == n8) {
                    object = this.d;
                    if (object != null) {
                        object = (UserUnratedItem)((ArrayList)object).get(n3);
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object2 = AnalyticsManager.Companion;
                        Object object3 = ((AnalyticsManager$Companion)object2).getInstance();
                        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager)object3).getNewCustomEventsRevamp();
                        object3 = ((AnalyticsManager$Companion)object2).getInstance();
                        object3 = ((AnalyticsManager)object3).getNewEEcommerceEventsRevamp();
                        Bundle bundle = new Bundle();
                        String string2 = "order_id";
                        String string3 = ((UserUnratedItem)object).getOrderId();
                        bundle.putString(string2, string3);
                        string2 = "product_id";
                        string3 = ((UserUnratedItem)object).getProductCode();
                        bundle.putString(string2, string3);
                        string2 = "product_name";
                        string3 = ((UserUnratedItem)object).getBrandTitle();
                        bundle.putString(string2, string3);
                        string2 = "product_brick";
                        object = ((UserUnratedItem)object).getBrickCode();
                        bundle.putString(string2, (String)object);
                        n7 = i71_02.o;
                        int n10 = -1;
                        if (n7 == n10) {
                            n7 = 0;
                            object = null;
                        }
                        string2 = "componentPosition";
                        bundle.putInt(string2, n7);
                        object = "bannerPosition";
                        bundle.putInt((String)object, n4);
                        string2 = newCustomEventsRevamp.getEVENT_REVIEWS_RATING_INTERACTIONS();
                        string3 = newCustomEventsRevamp.getEVENT_ACTION_RATING_WIDGETS();
                        String string4 = newCustomEventsRevamp.getEVENT_LABEL_RATING_WIDGETS();
                        String string5 = newCustomEventsRevamp.getEVENT_REVIEWS_RATING_INTERACTIONS();
                        Object object4 = ((AnalyticsManager$Companion)object2).getInstance();
                        object4 = ((AnalyticsManager)object4).getGtmEvents();
                        String string6 = ((GTMEvents)object4).getScreenName();
                        object4 = ((AnalyticsManager$Companion)object2).getInstance();
                        object4 = ((AnalyticsManager)object4).getGtmEvents();
                        String string7 = ((GTMEvents)object4).getScreenName();
                        String string8 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
                        String string9 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
                        int n14 = 1536;
                        try {
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, bundle, string9, false, null, n14, null);
                        }
                        catch (Exception exception) {
                            object = yn3_0.a;
                            ((yn3$a)object).e(exception);
                        }
                    }
                }
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
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object6 = gE2.class;
        String string4 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object6, string4);
        object3 = "<this>";
        object4 = ef0_0.a(object6, string4, string4, (String)object3);
        object6 = object4.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.e = object2 = (gE2)((pD3)object2).a((yn1_2)object4, (String)object6);
            Intrinsics.checkNotNullParameter(this, (String)object);
            object2 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object4 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            object5 = N71.class;
            object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object5, string4);
            object2 = ef0_0.a((Class)object5, string4, string4, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                this.i = object = (N71)((pD3)object).a((yn1_2)object2, (String)object3);
                object = this.getArguments();
                if (object != null && (object = object.getString((String)(object2 = "RATING_SOURCE_PAGE"))) != null) {
                    this.l = object;
                }
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.homepage_rating_fragment;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        Timer timer = this.k;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        I71$b i71$b;
        Object object3;
        int n3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.homepage_rate_purchase_tv;
        object2 = (TextView)object.findViewById(n4);
        this.b = object2;
        n4 = R$id.homepage_rating_list;
        object2 = (RecyclerView)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.frame_shimmer_homepage;
        object2 = (ShimmerFrameLayout)object.findViewById(n4);
        this.h = object2;
        n4 = R$id.frame_shimmer_wishlist;
        object2 = (ShimmerFrameLayout)object.findViewById(n4);
        this.n = object2;
        object2 = this.h;
        if (object2 != null) {
            n3 = R$string.loading_shimmer;
            object4 = hv3_0.K(n3);
            object2.setContentDescription((CharSequence)object4);
        }
        if ((object2 = this.n) != null) {
            n3 = R$string.loading_shimmer;
            object4 = hv3_0.K(n3);
            object2.setContentDescription((CharSequence)object4);
        }
        n4 = R$id.rating_root_view;
        object = (LinearLayout)object.findViewById(n4);
        this.m = object;
        object = this.e;
        object2 = "getViewLifecycleOwner(...)";
        if (object != null && (object = ((gE2)object).a) != null) {
            object4 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            object3 = new c71_0(this, 0);
            i71$b = new I71$b((Function1)object3);
            ((R53)object).e((mu1_1)object4, i71$b);
        }
        if ((object = this.i) != null && (object = ((N71)object).b) != null) {
            object4 = this.getViewLifecycleOwner();
            object3 = new d71_0(this, 0);
            i71$b = new I71$b((Function1)object3);
            ((LiveData)object).e((mu1_1)object4, i71$b);
        }
        if ((object = this.e) != null && (object = ((gE2)object).b) != null) {
            object4 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            int n7 = 1;
            object2 = new k9_0(this, n7);
            object3 = new I71$b((Function1)object2);
            ((R53)object).e((mu1_1)object4, (F62)object3);
        }
        this.j = false;
        int n8 = this.o;
        this.Pa(n8);
    }
}

