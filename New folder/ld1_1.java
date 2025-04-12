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
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from LD1
 */
public final class ld1_1
extends Fragment
implements CD1$a,
KD1$b,
gd1$c_0 {
    public static final LD1$a Companion;
    public final String a;
    public NavigationParent b;
    public AppCompatActivity c;
    public ArrayList d;
    public FrameLayout e;
    public RecyclerView f;
    public int g;

    static {
        LD1$a lD1$a;
        Companion = lD1$a = new Object();
    }

    public ld1_1() {
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

    public final gd1_2 Pa(int n3) {
        Iterator iterator;
        int n4;
        Bundle bundle = new LinkedHashMap();
        Object object = this.b;
        if (object != null && (object = (Collection)((NavigationParent)object).getChildDetails()) != null && (n4 = object.isEmpty()) == 0) {
            object = this.b;
            ArrayList arrayList = null;
            if (object != null) {
                object = ((NavigationParent)object).getChildDetails();
            } else {
                n4 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n4 = object.size();
            if (n3 < n4) {
                Object object2;
                object = this.b;
                if (object != null) {
                    object = ((NavigationParent)object).getChildDetails();
                } else {
                    n4 = 0;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                iterator = (Navigation)object.get(n3);
                object = ((Navigation)((Object)iterator)).getLinkDetails();
                iterator = ((Navigation)((Object)iterator)).getChildDetails();
                if (object != null) {
                    boolean bl2;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = (LinkDetail)object.next();
                        bundle.put(object2, null);
                    }
                }
                if (iterator != null) {
                    iterator = iterator.iterator();
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object = (Navigation)iterator.next();
                        arrayList = new ArrayList();
                        object2 = ((Navigation)object).getLinkDetails();
                        if (object2 != null) {
                            object2 = ((Navigation)object).getLinkDetails();
                            Intrinsics.checkNotNull(object2);
                            object2 = (Collection)object2;
                            arrayList.addAll(object2);
                        }
                        if ((object2 = ((Navigation)object).getChildDetails()) != null) {
                            object2 = ((Navigation)object).getChildDetails();
                            Intrinsics.checkNotNull(object2);
                            object2 = (Collection)object2;
                            arrayList.addAll(object2);
                        }
                        bundle.put(object, arrayList);
                    }
                }
            }
        }
        gd1_2.Companion.getClass();
        iterator = new Iterator();
        bundle = new Bundle();
        bundle.putString("catalogType", "NAV_PAGE");
        ((Fragment)((Object)iterator)).setArguments(bundle);
        return iterator;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Qa() {
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e(int var1_1) {
        block7: {
            block8: {
                block9: {
                    block11: {
                        block10: {
                            var2_2 = this.d;
                            var3_3 = var2_2.size();
                            if (var3_3 <= var1_1) break block7;
                            var2_2 = this.d.get(var1_1);
                            var4_4 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(var2_2, (String)var4_4);
                            var2_2 = (NavImpl)var2_2;
                            var5_5 = this.g;
                            if (var5_5 == var1_1) break block8;
                            var5_5 = var2_2 instanceof Navigation;
                            var6_6 = 0;
                            var7_7 = null;
                            var8_8 = "globalNav_";
                            var9_9 = "brand";
                            var10_10 = "Global Nav";
                            var11_11 = 1;
                            if (var5_5 == 0) break block9;
                            var2_2 = (Navigation)var2_2;
                            var4_4 = var2_2.getName();
                            var12_12 = FirebaseEvents.Companion.getInstance();
                            var8_8 = kp1_0.c((String)var8_8, (String)var4_4);
                            var13_13 /* !! */  = new Bundle();
                            var12_12.sendEvent((String)var8_8, var13_13 /* !! */ );
                            var8_8 = var2_2.getChildDetails();
                            var12_12 = "toLowerCase(...)";
                            if (var8_8 != null && (var14_14 = var8_8.isEmpty()) == 0 || (var8_8 = var2_2.getLinkDetails()) == null || (var8_8 = var2_2.getLinkDetails()) == null || (var14_14 = var8_8.size()) != var11_11) break block10;
                            if ((var2_2 = var2_2.getLinkDetails()) != null) {
                                var2_2 = (LinkDetail)var2_2.get(0);
                            }
                            var2_2 = AnalyticsManager.Companion;
                            var8_8 = var2_2.getInstance().getGtmEvents();
                            var13_13 /* !! */  = var2_2.getInstance().getGtmEvents().getScreenName();
                            var8_8.pushButtonTapEvent(var10_10, var4_4, (String)var13_13 /* !! */ );
                            var14_14 = (int)og1_1.c();
                            if (var14_14 != 0 && var4_4 != null) {
                                var8_8 = var4_4.toLowerCase();
                                Intrinsics.checkNotNullExpressionValue(var8_8, (String)var12_12);
                                if (var8_8 != null && (var6_6 = (int)StringsKt.F((CharSequence)var8_8, var9_9, false)) == var11_11) {
                                    var7_7 = this.Pa(var1_1);
                                    this.Oa((Fragment)var7_7);
                                }
                            }
                            var7_7 = var2_2.getInstance().getGtmEvents();
                            ak0_0.a((AnalyticsManager$Companion)var2_2, (GTMEvents)var7_7, var10_10, (String)var4_4);
                            break block11;
                        }
                        var14_14 = og1_1.c();
                        if (var14_14 == 0 || var4_4 == null) ** GOTO lbl-1000
                        var8_8 = var4_4.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(var8_8, (String)var12_12);
                        if (var8_8 != null && (var6_6 = StringsKt.F((CharSequence)var8_8, var9_9, false)) == var11_11) {
                            var2_2 = this.Pa(var1_1);
                            this.Oa((Fragment)var2_2);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var7_7 = kd1_0.Companion;
                            var7_7.getClass();
                            var2_2 = KD1$a.a((String)var4_4, (Navigation)var2_2);
                            this.Oa((Fragment)var2_2);
                        }
                        var2_2 = AnalyticsManager.Companion;
                        var7_7 = var2_2.getInstance().getGtmEvents();
                        ak0_0.a((AnalyticsManager$Companion)var2_2, (GTMEvents)var7_7, var10_10, (String)var4_4);
                    }
                    this.g = var1_1;
                    break block7;
                }
                var5_5 = var2_2 instanceof LinkDetail;
                if (var5_5 != 0) {
                    var2_2 = ((LinkDetail)var2_2).getLinkName();
                    var5_5 = (int)og1_1.c();
                    if (var5_5 != 0 && var2_2 != null && (var5_5 = (int)StringsKt.F((CharSequence)var2_2, var9_9, false)) == var11_11) {
                        var4_4 = this.Pa(var1_1);
                        this.Oa((Fragment)var4_4);
                    }
                    var4_4 = FirebaseEvents.Companion.getInstance();
                    var7_7 = kp1_0.c((String)var8_8, (String)var2_2);
                    var8_8 = new Bundle();
                    var4_4.sendEvent((String)var7_7, (Bundle)var8_8);
                    var4_4 = AnalyticsManager.Companion;
                    var7_7 = var4_4.getInstance().getGtmEvents();
                    ak0_0.a((AnalyticsManager$Companion)var4_4, (GTMEvents)var7_7, var10_10, (String)var2_2);
                    this.g = var1_1;
                }
                break block7;
            }
            this.g = var1_1 = -1;
        }
    }

    public final void l() {
        this.Qa();
    }

    public final void n(String string2, LinkDetail linkDetail, String string3) {
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
            if (object != null) {
                this.b = object;
            }
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
        object = new cd1_1((ArrayList)object2, this);
        object2 = this.f;
        if (object2 != null) {
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void p5() {
    }
}

