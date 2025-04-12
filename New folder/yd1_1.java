/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yD1
 */
public final class yd1_1
extends Fragment
implements ld1$a_0,
vD1$b,
gd1$c_0 {
    public static final yD1$a Companion;
    public final String a;
    public K82 b;
    public AppCompatActivity c;
    public ArrayList d;
    public FrameLayout e;
    public RecyclerView f;
    public int g;

    static {
        yD1$a yD1$a;
        Companion = yD1$a = new Object();
    }

    public yd1_1() {
        ArrayList arrayList;
        this.a = "LUX_SUB_CATEGORY_FRAGMENT";
        this.d = arrayList = new ArrayList();
        this.g = -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Oa(Fragment fragment) {
        IllegalStateException illegalStateException2;
        Object object;
        block5: {
            Object object2;
            int n3;
            int n4;
            block4: {
                object = this.e;
                if (object == null) {
                    return;
                }
                object = this.c;
                if (object == null) return;
                n4 = object.isFinishing();
                if (n4 == (n3 = 1)) {
                    return;
                }
                object = this.getChildFragmentManager();
                object2 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                try {
                    object2 = this.e;
                    if (object2 == null) break block4;
                    object2.bringToFront();
                }
                catch (IllegalStateException illegalStateException2) {
                    break block5;
                }
            }
            object.getClass();
            object2 = new a((FragmentManager)object);
            n4 = R$id.sub_category_frame;
            String string2 = this.a;
            ((k)object2).j(n4, fragment, string2);
            ((a)object2).o(n3 != 0, n3 != 0);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(illegalStateException2);
    }

    public final void e(int n3) {
        Object object = this.d;
        int n4 = ((ArrayList)object).size();
        if (n4 > n3) {
            object = this.d.get(n3);
            Object object2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (NavImpl)object;
            int n7 = this.g;
            if (n7 != n3) {
                n7 = object instanceof CMSNavigation;
                Object object3 = "globalNav_";
                String string2 = "Global Nav";
                if (n7 != 0) {
                    boolean bl2;
                    object = (CMSNavigation)object;
                    object2 = ((CMSNavigation)object).getName();
                    Object object4 = FirebaseEvents.Companion.getInstance();
                    object3 = kp1_0.c((String)object3, (String)object2);
                    Object object5 = new Bundle();
                    ((FirebaseEvents)object4).sendEvent((String)object3, (Bundle)object5);
                    object3 = ((CMSNavigation)object).getChildDetails();
                    if (object3 != null && !(bl2 = object3.isEmpty())) {
                        vd1_1.Companion.getClass();
                        object3 = new vd1_1();
                        object4 = new Bundle();
                        if (object2 != null) {
                            object5 = "CATEGORY_NAME";
                            object4.putString((String)object5, (String)object2);
                        }
                        object5 = "NAVIGATION";
                        object4.putParcelable((String)object5, (Parcelable)object);
                        ((Fragment)object3).setArguments((Bundle)object4);
                        this.Oa((Fragment)object3);
                        object = AnalyticsManager.Companion;
                        object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                        ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object3, string2, (String)object2);
                    } else {
                        object3 = AnalyticsManager.Companion;
                        object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                        ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object4, string2, (String)object2);
                        this.f((CMSNavigation)object);
                    }
                    this.g = n3;
                } else {
                    n7 = object instanceof Navigation;
                    if (n7 != 0) {
                        int n8;
                        int n10;
                        object = (Navigation)object;
                        object2 = ((Navigation)object).getName();
                        Object object6 = FirebaseEvents.Companion.getInstance();
                        object3 = kp1_0.c((String)object3, (String)object2);
                        Bundle bundle = new Bundle();
                        ((FirebaseEvents)object6).sendEvent((String)object3, bundle);
                        object3 = ((Navigation)object).getChildDetails();
                        if ((object3 == null || (n10 = object3.isEmpty()) != 0) && (object3 = ((Navigation)object).getLinkDetails()) != null && (object3 = ((Navigation)object).getLinkDetails()) != null && (n10 = object3.size()) == (n8 = 1)) {
                            if ((object = ((Navigation)object).getLinkDetails()) != null) {
                                n10 = 0;
                                object3 = null;
                                object = (LinkDetail)object.get(0);
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            object3 = AnalyticsManager.Companion;
                            object6 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                            ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object6, string2, (String)object2);
                            if (object != null && (object2 = this.b) != null) {
                                object3 = ((LinkDetail)object).getPage();
                                string2 = "luxe";
                                object2.n((String)object3, (LinkDetail)object, string2);
                            }
                        } else {
                            kd1_0.Companion.getClass();
                            object = KD1$a.a((String)object2, (Navigation)object);
                            this.Oa((Fragment)object);
                            object = AnalyticsManager.Companion;
                            object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object3, string2, (String)object2);
                        }
                        this.g = n3;
                    }
                }
            } else {
                this.g = n3 = -1;
            }
        }
    }

    public final void f(CMSNavigation cMSNavigation) {
        K82 k82 = this.b;
        if (k82 != null) {
            if (cMSNavigation != null) {
                cMSNavigation.getPageType();
            }
            k82.a1(cMSNavigation);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        IllegalStateException illegalStateException2;
        block5: {
            Object object;
            block4: {
                boolean bl2;
                object = this.c;
                if (object == null) return;
                boolean bl3 = object.isFinishing();
                if (bl3 == (bl2 = true)) {
                    return;
                }
                object = this.f;
                if (object != null) {
                    object.bringToFront();
                }
                try {
                    object = this.getChildFragmentManager();
                    Object object2 = "getChildFragmentManager(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object.getClass();
                    object2 = new a((FragmentManager)object);
                    String string2 = "beginTransaction(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    string2 = this.a;
                    object = ((FragmentManager)object).E(string2);
                    if (object == null) break block4;
                    ((a)object2).i((Fragment)object);
                    ((a)object2).o(bl2, bl2);
                }
                catch (IllegalStateException illegalStateException2) {
                    break block5;
                }
            }
            if ((object = this.f) == null) return;
            object.bringToFront();
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(illegalStateException2);
    }

    public final void n(String string2, LinkDetail linkDetail, String object) {
        object = this.b;
        if (object != null) {
            String string3 = "luxe";
            object.n(string2, linkDetail, string3);
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (AppCompatActivity)object;
        this.c = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            Object object2 = "navigationList";
            object.containsKey((String)object2);
            int n3 = Build.VERSION.SDK_INT;
            Object object3 = null;
            int n4 = 33;
            if (n3 >= n4) {
                object2 = wd1_1.a(object);
            } else {
                boolean bl3 = (object2 = object.getSerializable((String)object2)) instanceof ArrayList;
                if (!bl3) {
                    bl2 = false;
                    object2 = null;
                }
                object2 = (ArrayList)object2;
            }
            object2 = (ArrayList)object2;
            if (object2 != null) {
                this.d = object2;
            }
            object2 = "NAVIGATION_PARENT";
            object.containsKey((String)object2);
            if (n3 >= n4) {
                object = (Parcelable)xd1_1.a(object);
            } else {
                bl2 = (object = object.getParcelable((String)object2)) instanceof NavigationParent;
                if (bl2) {
                    object3 = object;
                }
                object = object3;
                object = (NavigationParent)object3;
            }
            object = (NavigationParent)object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_lux_sub_category;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.sub_category_frame;
        object2 = (FrameLayout)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.fragment_lux_sub_cat_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.f = object;
        if (object != null) {
            object3 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        object2 = this.d;
        object = new ld1_0((ArrayList)object2, this);
        object2 = this.f;
        if (object2 != null) {
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void p5() {
        K82 k82 = this.b;
        if (k82 != null) {
            String string2 = "luxe";
            k82.D1(string2);
        }
    }
}

