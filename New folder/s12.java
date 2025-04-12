/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public class s12
extends sm3_0
implements GI0,
zm0_0,
xM0 {
    public static final s12$a Companion;
    public static s12 v;
    public j3_0 b;
    public jv2_0 c;
    public ConstraintLayout d;
    public Toolbar e;
    public TextView f;
    public TextView g;
    public RecyclerView h;
    public SharedPreferences i;
    public FrameLayout j;
    public TextView k;
    public TextView l;
    public boolean m;
    public boolean n;
    public final ArrayList o;
    public final ArrayList p;
    public final NewCustomEventsRevamp q;
    public final String r;
    public final String s;
    public String t;
    public final hh3_2 u;

    static {
        s12$a s12$a;
        Companion = s12$a = new Object();
    }

    public s12() {
        Object object = new ArrayList();
        this.o = object;
        object = new ArrayList();
        this.p = object;
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.q = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.r = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.s = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.t = object = ld3_2.STORE_AJIO.getStoreId();
        object = new p12(this, 0);
        this.u = object = yr1_2.b((Function0)object);
    }

    public final void B4(String object, boolean bl2) {
        block26: {
            String string2;
            boolean bl3;
            int n3;
            ArrayList arrayList;
            Object object2;
            block25: {
                block24: {
                    if (object == null) {
                        return;
                    }
                    object2 = this.o;
                    arrayList = this.p;
                    n3 = 1;
                    if (bl2 != n3) break block24;
                    bl3 = arrayList.contains(object);
                    if (bl3) {
                        arrayList.remove(object);
                    } else {
                        ((ArrayList)object2).add(object);
                    }
                    break block25;
                }
                if (bl2) break block26;
                bl3 = ((ArrayList)object2).contains(object);
                if (bl3) {
                    ((ArrayList)object2).remove(object);
                } else {
                    arrayList.add(object);
                }
            }
            int n4 = ((ArrayList)object2).size();
            bl3 = false;
            if (n4 == 0 && (n4 = arrayList.size()) == 0) {
                n4 = 0;
                object2 = null;
            } else {
                n4 = 1;
            }
            arrayList = this.getContext();
            if (arrayList != null && (arrayList = arrayList.getSharedPreferences(string2 = "PREFERENCE_NAME", 0)) != null && (arrayList = arrayList.edit()) != null && (object2 = arrayList.putBoolean(string2 = "isFilterSelected", n4 != 0)) != null) {
                object2.apply();
            }
            n4 = 0;
            object2 = null;
            if (bl2) {
                Object object3 = this.Ta();
                if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                    object2 = object3 = ((HashMap)object3).get(object);
                    object2 = (Integer)object3;
                }
                if (object2 != null) {
                    object3 = this.Ta();
                    if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                        n4 = (Integer)object2 + n3;
                        object2 = n4;
                        object = (Integer)((HashMap)object3).put(object, object2);
                    }
                } else {
                    object3 = this.Ta();
                    if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                        object2 = n3;
                        object = (Integer)((HashMap)object3).put(object, object2);
                    }
                }
            } else {
                Object object4 = this.Ta();
                if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                    object2 = object4 = ((HashMap)object4).get(object);
                    object2 = (Integer)object4;
                }
                if (object2 != null) {
                    object4 = this.Ta();
                    if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                        n4 = (Integer)object2 - n3;
                        object2 = n4;
                        object = (Integer)((HashMap)object4).put(object, object2);
                    }
                } else {
                    object4 = this.Ta();
                    if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                        object2 = 0;
                        object = (Integer)((HashMap)object4).put(object, object2);
                    }
                }
            }
            if ((object = this.h) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            this.cb();
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void P9() {
        this.Pa();
        NewCustomEventsRevamp newCustomEventsRevamp = this.q;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_LIST_INTERACTIONS();
        Object object = this.q;
        String string3 = ((NewCustomEventsRevamp)object).getEA_NAV_FILTER_APPLY();
        String string4 = ((NewCustomEventsRevamp)object).getEVENT_PLP_FILTER_APPLY();
        object = AnalyticsManager.Companion;
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        String string7 = this.r;
        String string8 = this.s;
        object = string3;
        string3 = "";
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, (String)object, string3, string4, string5, string6, string7, null, string8, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Pa() {
        Object object = "IsFacetNameClicked";
        try {
            boolean bl2;
            boolean bl3;
            Context context = this.getContext();
            if (context != null) {
                String string2 = "PREFERENCE_NAME";
                context = context.getSharedPreferences(string2, 0);
            } else {
                context = null;
            }
            if (context != null && (bl3 = context.getBoolean((String)object, false)) == (bl2 = true)) {
                if ((context = context.edit()) != null) {
                    context.putBoolean((String)object, false);
                }
                if (context != null) {
                    context.apply();
                }
            }
            if ((object = this.c) != null) {
                object.z2();
            }
            this.bb();
            this.Xa();
            object = this.getParentFragment();
            if (object == null) return;
            if ((object = ((Fragment)object).getChildFragmentManager()) == null) return;
            ((FragmentManager)object).W();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final String Q9() {
        Object object = this.Ta();
        object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getCode() : null;
        return object;
    }

    public final void Qa() {
        boolean bl2;
        boolean bl3;
        Object object = this.Ta();
        if (object != null && (bl3 = ((F12)object).g) == (bl2 = true)) {
            F12 f12 = this.Ta();
            if (f12 != null) {
                object = this.Ta();
                if (object != null && (object = ((F12)object).d) != null) {
                    object = ((bv2_0)object).N;
                } else {
                    bl3 = false;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                Boolean bl4 = Boolean.FALSE;
                Boolean bl5 = Boolean.TRUE;
                boolean bl6 = true;
                int n3 = 8;
                F12.j(f12, (ProductsList)object, bl6, bl4, null, bl5, n3);
            }
            if ((object = this.Ta()) != null) {
                ((F12)object).o();
            }
            if ((object = this.Ta()) != null) {
                bl2 = false;
                ((F12)object).g = false;
            }
        }
    }

    public final void Ra() {
        String string2;
        ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.clear();
        arrayList = this.getContext();
        if (arrayList != null && (arrayList = arrayList.getSharedPreferences(string2 = "PREFERENCE_NAME", 0)) != null && (arrayList = arrayList.edit()) != null && (arrayList = arrayList.putBoolean(string2 = "isFilterSelected", false)) != null) {
            arrayList.apply();
        }
    }

    public final List Sa() {
        Object object = this.Ta();
        object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null ? ((ProductsList)object).getFacets() : null;
        if (object != null) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            int n3 = (int)(this.n ? 1 : 0);
            if (n3 != 0) {
                boolean bl2;
                object = ((Iterable)object).iterator();
                n3 = 0;
                String string2 = null;
                while (bl2 = object.hasNext()) {
                    Object object2 = object.next();
                    int n4 = n3 + 1;
                    if (n3 >= 0) {
                        boolean bl3;
                        String string3;
                        string2 = ((Facet)(object2 = (Facet)object2)).getName();
                        n3 = (int)(kotlin.text.b.i(string2, string3 = "Category", bl3 = true) ? 1 : 0);
                        if (n3 == 0) {
                            arrayList.add(object2);
                        }
                        n3 = n4;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                object = arrayList;
            }
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T() {
        Object object = this.q;
        try {
            NewCustomEventsRevamp newCustomEventsRevamp = this.q;
            String string2 = newCustomEventsRevamp.getEC_PRODUCT_LIST_INTERACTIONS();
            String string3 = ((NewCustomEventsRevamp)object).getEA_NAV_FILTER_DISCARD();
            String string4 = "";
            String string5 = ((NewCustomEventsRevamp)object).getEVENT_PLP_FILTER_APPLY();
            object = AnalyticsManager.Companion;
            Object object2 = ((AnalyticsManager$Companion)object).getInstance();
            object2 = ((AnalyticsManager)object2).getGtmEvents();
            object2 = ((GTMEvents)object2).getScreenName();
            object = ((AnalyticsManager$Companion)object).getInstance();
            object = ((AnalyticsManager)object).getGtmEvents();
            String string6 = ((GTMEvents)object).getScreenName();
            String string7 = this.r;
            String string8 = this.s;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, (String)object2, string6, string7, null, string8, false, null, n3, null);
            this.Xa();
            this.Qa();
            object = this.getParentFragment();
            if (object == null) return;
            if ((object = ((Fragment)object).getChildFragmentManager()) == null) return;
            ((FragmentManager)object).W();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final F12 Ta() {
        return (F12)this.u.getValue();
    }

    public void Ua(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.filter_parent_lyt;
        Object object2 = (ConstraintLayout)object.findViewById(n3);
        this.d = object2;
        Object object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        int n4 = 2;
        object3 = new k9(this, n4);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        n3 = R$id.filter_toolbar;
        object2 = (Toolbar)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.filter_view_heading_tv;
        object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.filter_view_reset_filters_tv;
        object2 = (TextView)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.filter_view_facet_title_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.filter_view_facet_value_frag_container;
        object2 = (FrameLayout)object.findViewById(n3);
        this.j = object2;
        n3 = R$id.filter_view_cancel_tv;
        object2 = (TextView)object.findViewById(n3);
        this.k = object2;
        n3 = R$id.filter_view_apply_filter_tv;
        object2 = (TextView)object.findViewById(n3);
        this.l = object2;
        n3 = R$id.viewLeft;
        object = object.findViewById(n3);
        n3 = (int)(this.a ? 1 : 0);
        if (n3 != 0 && object != null) {
            ai0_2.B(object);
        }
        object2 = this.requireActivity();
        int n7 = 1;
        n4 = 0;
        FI0 fI0 = null;
        object = new LinearLayoutManager((Context)object2, n7, false);
        object2 = this.h;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.getContext();
        n3 = 0;
        object2 = null;
        if (object != null) {
            object3 = "PREFERENCE_NAME";
            object = object.getSharedPreferences((String)object3, 0);
        } else {
            object = null;
        }
        this.i = object;
        if (object != null) {
            object3 = "IS_IMAGE_SEARCH";
            n4 = (int)(object.getBoolean((String)object3, false) ? 1 : 0);
        }
        this.n = n4;
        object = this.Sa();
        if (object != null && (object3 = this.h) != null) {
            object = ImmutableList.copyOf((Collection)this.Va((List)object));
            Intrinsics.checkNotNullExpressionValue(object, "copyOf(...)");
            Object object4 = this.Ta();
            if (object4 != null && (object4 = ((F12)object4).d) != null) {
                object2 = ((bv2_0)object4).i0;
            }
            fI0 = new FI0((ImmutableList)object, (HashMap)object2, this);
            ((RecyclerView)object3).setAdapter(fI0);
        }
    }

    public final ArrayList Va(List list) {
        String string2;
        Object object;
        boolean bl2;
        Object object2 = list;
        Intrinsics.checkNotNullParameter(list, "facets");
        ArrayList<Object> arrayList = z40_0.Companion;
        Object object3 = this.requireActivity().getApplication();
        ArrayList<Facet> arrayList2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)((Object)arrayList2));
        arrayList.getClass();
        arrayList = z40$a.a((Context)object3).a;
        object3 = "filter_new_ux";
        boolean bl3 = ((ao0_0)((Object)arrayList)).a((String)object3);
        if (!bl3) {
            object2 = list;
            arrayList = new ArrayList<Object>((Collection<Object>)object2);
            return arrayList;
        }
        arrayList = new ArrayList<Object>();
        object3 = new ArrayList();
        arrayList2 = new ArrayList<Facet>();
        object2 = ((Iterable)list).iterator();
        while (true) {
            boolean bl4 = object2.hasNext();
            bl2 = true;
            if (!bl4) break;
            Facet facet = (Facet)object2.next();
            boolean bl5 = this.n;
            if (bl5 && (bl2 = kotlin.text.b.i((String)(object = facet.getName()), string2 = "Category", bl2))) continue;
            bl2 = facet.getCommonFilter();
            if (bl2) {
                ((ArrayList)object3).add(facet);
                continue;
            }
            arrayList2.add(facet);
        }
        arrayList.addAll((Collection<Object>)object3);
        boolean bl6 = arrayList2.isEmpty() ^ bl2;
        if (bl6) {
            int n3 = R$string.more_filter;
            String string3 = hv3_0.K(n3);
            string2 = null;
            int n4 = 895;
            object = object2;
            object2 = new Facet(false, false, null, null, null, null, null, string3, null, null, n4, null);
            arrayList.add(object2);
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final void Wa(sm3_0 sm3_02, String string2) {
        FragmentManager fragmentManager = this.getChildFragmentManager();
        fragmentManager.getClass();
        a a2 = new a(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(a2, "beginTransaction(...)");
        int n3 = R$anim.slide_in_left;
        int n4 = R$anim.slide_out_right;
        a2.k(n3, n4, 0, 0);
        n3 = R$id.filter_view_facet_value_frag_container;
        a2.j(n3, sm3_02, string2);
        boolean bl2 = true;
        a2.o(bl2, bl2);
    }

    public final void Xa() {
        String string2;
        Context context = this.getContext();
        if (context != null && (context = context.getSharedPreferences(string2 = "PREFERENCE_NAME", 0)) != null && (context = context.edit()) != null && (context = context.putBoolean(string2 = "isFilterSelected", false)) != null) {
            context.apply();
        }
    }

    public void Ya() {
        Toolbar toolbar = this.e;
        if (toolbar != null) {
            int n3 = 1;
            hd1_1 hd1_12 = new hd1_1(this, n3);
            toolbar.setNavigationOnClickListener(hd1_12);
        }
    }

    public final boolean Za() {
        boolean bl2;
        boolean bl3;
        Object object = this.Ta();
        Boolean bl4 = null;
        if (object != null && (object = ((F12)object).d) != null) {
            object = ((bv2_0)object).N;
        } else {
            bl3 = false;
            object = null;
        }
        Object object2 = this.Ta();
        if (object2 != null && (object2 = ((F12)object2).d) != null) {
            object2 = ((bv2_0)object2).M;
        } else {
            bl2 = false;
            object2 = null;
        }
        bl3 = Intrinsics.areEqual(object, object2);
        bl2 = true;
        if (bl3 && ((object = this.Ta()) == null || (object = ((F12)object).d) == null || (object = ((bv2_0)object).R) == null || (bl3 = object.isEmpty() ^ bl2) != bl2)) {
            object = this.Ta();
            if (object != null) {
                object = ((F12)object).d;
            } else {
                bl3 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            object = ((bv2_0)object).S;
            bl3 = object.isEmpty() ^ bl2;
            if (!bl3) {
                object = this.Ta();
                if (object != null && (object = ((F12)object).d) != null) {
                    object = ((bv2_0)object).I;
                } else {
                    bl3 = false;
                    object = null;
                }
                Object object3 = this.Ta();
                if (object3 != null && (object3 = ((F12)object3).d) != null) {
                    bl4 = ((bv2_0)object3).J;
                }
                if (bl3 = Intrinsics.areEqual(object, bl4)) {
                    bl2 = false;
                    object2 = null;
                }
            }
        }
        return bl2;
    }

    public final void ab(Facet object) {
        String string2;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3 = this.getArguments();
        Object object4 = "PLP_TYPE";
        int n8 = 100;
        n7 = object3 != null && (n7 = (int)((object3 = this.requireArguments()).containsKey((String)object4) ? 1 : 0)) != 0 && (object3 = this.getArguments()) != null ? object3.getInt((String)object4) : 100;
        if ((n7 != (n4 = 101) || (n3 = (int)(Intrinsics.areEqual(object2 = this.t, string2 = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) == 0) && n7 == (n3 = 103)) {
            object2 = this.t;
            string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
            n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        }
        if ((n3 = (int)((string2 = "category").equalsIgnoreCase((String)(object2 = ((Facet)object).getName())) ? 1 : 0)) == 0 && (n3 = (int)((string2 = "l1l3nestedcategory").equalsIgnoreCase((String)(object2 = ((Facet)object).getCode())) ? 1 : 0)) == 0) {
            string2 = "brand";
            object2 = ((Facet)object).getName();
            n3 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)((string2 = "brands").equalsIgnoreCase((String)(object2 = ((Facet)object).getName())) ? 1 : 0)) == 0) {
                string2 = "pricerange";
                object2 = ((Facet)object).getCode();
                n3 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
                if (n3 != 0) {
                    object2 = mz2_0.Companion;
                    object2.getClass();
                    mz2_0 mz2_02 = n7 != n8 ? (n7 != n4 ? new mz2_0() : new sf1_0()) : new mz2_0();
                    Bundle bundle = new Bundle();
                    bundle.putInt((String)object4, n7);
                    mz2_02.setArguments(bundle);
                    object = ((Facet)object).getCode();
                    Intrinsics.checkNotNull(object);
                    this.Wa(mz2_02, (String)object);
                } else {
                    String string3 = "brickprimarycolor";
                    object4 = ((Facet)object).getCode();
                    int n10 = string3.equalsIgnoreCase((String)object4);
                    if (n10 == 0 && (n10 = (int)((string3 = "bricksecondarycolor").equalsIgnoreCase((String)(object4 = ((Facet)object).getCode())) ? 1 : 0)) == 0 && (n10 = (int)((string3 = "verticalcolorfamily").equalsIgnoreCase((String)(object4 = ((Facet)object).getCode())) ? 1 : 0)) == 0 && (n10 = (int)((string3 = "colors").equalsIgnoreCase((String)(object4 = ((Facet)object).getName())) ? 1 : 0)) == 0) {
                        string3 = "rating";
                        object4 = ((Facet)object).getName();
                        n10 = (int)(string3.equalsIgnoreCase((String)object4) ? 1 : 0);
                        if (n10 == 0 && (n10 = (int)(string3.equalsIgnoreCase((String)(object4 = ((Facet)object).getCode())) ? 1 : 0)) == 0) {
                            string3 = "delivery";
                            object4 = ((Facet)object).getName();
                            n10 = (int)(string3.equalsIgnoreCase((String)object4) ? 1 : 0);
                            if (n10 == 0 && (n10 = (int)((string3 = "sla").equalsIgnoreCase((String)(object4 = ((Facet)object).getCode())) ? 1 : 0)) == 0) {
                                object4 = vy0_0.Companion;
                                object4.getClass();
                                n10 = 2;
                                object3 = VY0$a.a(n10, n7);
                                object = ((Facet)object).getCode();
                                Intrinsics.checkNotNull(object);
                                this.Wa((sm3_0)object3, (String)object);
                            } else {
                                object4 = vy0_0.Companion;
                                object4.getClass();
                                n10 = 5;
                                object3 = VY0$a.a(n10, n7);
                                object = ((Facet)object).getCode();
                                Intrinsics.checkNotNull(object);
                                this.Wa((sm3_0)object3, (String)object);
                            }
                        } else {
                            object4 = vy0_0.Companion;
                            object4.getClass();
                            n10 = 4;
                            object3 = VY0$a.a(n10, n7);
                            object = ((Facet)object).getCode();
                            Intrinsics.checkNotNull(object);
                            this.Wa((sm3_0)object3, (String)object);
                        }
                    } else {
                        object4 = vy0_0.Companion;
                        object4.getClass();
                        n10 = 3;
                        object3 = VY0$a.a(n10, n7);
                        object = ((Facet)object).getCode();
                        Intrinsics.checkNotNull(object);
                        this.Wa((sm3_0)object3, (String)object);
                    }
                }
            } else {
                object2 = fB.Companion;
                object2.getClass();
                fB fB2 = n7 != n8 ? (n7 != n4 ? new fB() : new pd1_1()) : new fB();
                Bundle bundle = new Bundle();
                bundle.putInt((String)object4, n7);
                fB2.setArguments(bundle);
                object = ((Facet)object).getCode();
                Intrinsics.checkNotNull(object);
                this.Wa(fB2, (String)object);
            }
        } else {
            zp_0.Companion.getClass();
            boolean bl2 = false;
            object4 = null;
            object3 = ZP$a.a(n7, false);
            object = ((Facet)object).getCode();
            Intrinsics.checkNotNull(object);
            this.Wa((sm3_0)object3, (String)object);
        }
        object = this.Ta();
        if (object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).R) != null) {
            ((HashMap)object).values();
        }
    }

    public final void bb() {
        int n3;
        int n4;
        Object object;
        Object object2 = this.Ta();
        if (object2 != null && (object2 = ((F12)object2).d) != null) {
            object2 = ((bv2_0)object2).E1;
            object2.clear();
        }
        object2 = this.Ta();
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null && (object2 = ((F12)object2).d) != null) {
            object = this.Ta();
            if (object != null && (object = ((F12)object).d) != null) {
                n4 = ((bv2_0)object).b0;
                object = n4;
            } else {
                n4 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            ((bv2_0)object2).d0 = n4 = ((Integer)object).intValue();
        }
        if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null) {
            int n7;
            object = this.Ta();
            if (object != null && (object = ((F12)object).d) != null) {
                int n8 = ((bv2_0)object).c0;
                object3 = n8;
            }
            Intrinsics.checkNotNull(object3);
            ((bv2_0)object2).e0 = n7 = ((Integer)object3).intValue();
        }
        if ((n3 = this.Za()) != 0) {
            object3 = this.Ta();
            if (object3 != null) {
                object2 = this.Ta();
                Intrinsics.checkNotNull(object2);
                object2 = ((F12)object2).d;
                object = ((bv2_0)object2).N;
                Intrinsics.checkNotNull(object);
                Boolean bl3 = Boolean.TRUE;
                boolean bl4 = true;
                int n10 = 24;
                F12.j((F12)object3, (ProductsList)object, bl4, bl3, null, null, n10);
            }
            if ((object2 = this.Ta()) != null) {
                ((F12)object2).o();
            }
        }
        n3 = this.m;
        boolean bl5 = false;
        object3 = null;
        if (n3 == 0 && (object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null) {
            ((bv2_0)object2).O = false;
        }
        if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null && (n3 = ((bv2_0)object2).e1) == (n4 = 1) && (n3 = (int)(this.Za() ? 1 : 0)) != 0) {
            object2 = this.Ta();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                ((bv2_0)object2).e1 = false;
            }
            if ((object2 = this.c) != null) {
                object2.P2();
            }
            if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null) {
                boolean bl6;
                object = this.Ta();
                if (object != null && (object = ((F12)object).d) != null) {
                    object3 = ((bv2_0)object).I;
                    object = Boolean.TRUE;
                    bl6 = Intrinsics.areEqual(object3, object);
                }
                ((bv2_0)object2).J = object3 = Boolean.valueOf(bl6);
            }
        }
    }

    public final void cb() {
        boolean bl2;
        Object object;
        Object object2 = this.Ta();
        if (object2 != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).i0) != null && (object = this.h) != null && (object = ((RecyclerView)object).getAdapter()) != null && (object = (bl2 = object instanceof FI0) ? (FI0)object : null) != null) {
            String string2 = "userSelectedFacetValueMap";
            Intrinsics.checkNotNullParameter(object2, string2);
            ((FI0)object).b = object2;
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void j4(Facet object, ym0_0 object2) {
        String string2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "facet");
        Object object3 = this.i;
        Object object4 = null;
        if (object3 != null) {
            object3 = object3.edit();
        } else {
            bl2 = false;
            object3 = null;
        }
        boolean bl3 = true;
        if (object3 != null) {
            string2 = "IsFacetNameClicked";
            object3.putBoolean(string2, bl3);
        }
        if (object3 != null) {
            object3.apply();
        }
        if ((object3 = this.Ta()) != null && (object3 = ((F12)object3).d) != null) {
            object3 = ((bv2_0)object3).Y;
        } else {
            bl2 = false;
            object3 = null;
        }
        string2 = ((Facet)object).getCode();
        bl2 = Intrinsics.areEqual(object3, string2);
        if (!bl2) {
            object3 = this.Ta();
            if (object3 != null && (object3 = ((F12)object3).d) != null) {
                ((bv2_0)object3).Y = string2 = ((Facet)object).getCode();
            }
            if ((object3 = this.Ta()) != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).R) != null && (bl2 = ((HashMap)object3).isEmpty() ^ bl3) == bl3 || (object3 = this.Ta()) != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).S) != null && (bl2 = ((HashMap)object3).isEmpty() ^ bl3) == bl3) {
                object = this.b;
                if (object != null) {
                    object.startLoader();
                }
                if ((object3 = this.Ta()) != null) {
                    object = this.Ta();
                    Intrinsics.checkNotNull(object);
                    object = ((F12)object).d;
                    object4 = ((bv2_0)object).N;
                    Intrinsics.checkNotNull(object4);
                    string2 = null;
                    bl3 = true;
                    int n3 = 20;
                    F12.j((F12)object3, (ProductsList)object4, bl3, null, (ym0_0)object2, null, n3);
                }
            } else {
                object2 = this.Ta();
                if (object2 != null && (object2 = ((F12)object2).d) != null) {
                    ((bv2_0)object2).X = object;
                }
                if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
                    object4 = ((bv2_0)object).X;
                }
                Intrinsics.checkNotNull(object4);
                this.ab((Facet)object4);
                object = this.h;
                if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                    ((RecyclerView$f)object).notifyDataSetChanged();
                }
            }
        } else {
            object = this.Ta();
            if (object != null && (object = ((F12)object).d) != null && (object4 = ((bv2_0)object).N) != null && (object3 = this.Ta()) != null) {
                string2 = null;
                bl3 = true;
                int n4 = 20;
                F12.j((F12)object3, (ProductsList)object4, bl3, null, (ym0_0)object2, null, n4);
            }
        }
    }

    public final boolean l9(String object) {
        Object object2 = "facetCode";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = this.Ta();
        boolean bl2 = false;
        if (object3 != null) {
            object3 = this.Ta();
            Intrinsics.checkNotNull(object3);
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = ((F12)object3).d;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = ((bv2_0)object3).i0;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                boolean bl3 = ((HashMap)object2).containsKey(object);
                if (bl3) {
                    object2 = ((bv2_0)object3).i0;
                    Intrinsics.checkNotNull(object2);
                    object = ((HashMap)object2).get(object);
                    Intrinsics.checkNotNull(object);
                    object = (Number)object;
                    int n3 = ((Number)object).intValue();
                    if (n3 > 0) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.b = object;
        }
    }

    public final void onCreate(Bundle object) {
        int n3;
        Object object2;
        int n4;
        super.onCreate((Bundle)object);
        v = this;
        object = this.Ta();
        if (object != null && (object = object.d) != null) {
            object.O = n4 = 1;
        }
        object = this.Ta();
        n4 = 0;
        Object object3 = null;
        if (object != null && (object = object.d) != null) {
            object2 = this.Ta();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                object2 = ((bv2_0)object2).M;
            } else {
                n3 = 0;
                object2 = null;
            }
            object.N = object2;
        }
        if ((object = this.Ta()) != null && (object = object.d) != null) {
            object2 = this.Ta();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                n3 = ((bv2_0)object2).d0;
                object2 = n3;
            } else {
                n3 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            object.b0 = n3 = ((Integer)object2).intValue();
        }
        if ((object = this.Ta()) != null && (object = object.d) != null) {
            object2 = this.Ta();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                n4 = ((bv2_0)object2).e0;
                object3 = n4;
            }
            Intrinsics.checkNotNull(object3);
            object.c0 = n4 = ((Integer)object3).intValue();
        }
        object = this.Ta();
        Intrinsics.checkNotNull(object);
        object = object.d;
        int n7 = object.y0;
        if (n7 == 0) {
            object = this.Ta();
            Intrinsics.checkNotNull(object);
            object = object.d.W;
            if (object == null) {
                object = this.Ta();
                Intrinsics.checkNotNull(object);
                object = object.d;
                object3 = new HashMap();
                object.i0 = object3;
            } else {
                object = this.Ta();
                Intrinsics.checkNotNull(object);
                object = object.d;
                object2 = this.Ta();
                Intrinsics.checkNotNull(object2);
                object2 = ((F12)object2).d.W;
                Intrinsics.checkNotNull(object2);
                object3 = new HashMap(object2);
                object.i0 = object3;
            }
        }
        if ((n7 = (object = this.getParentFragment()) instanceof jv2_0) != 0) {
            object = this.getParentFragment();
            object3 = "null cannot be cast to non-null type com.ril.ajio.plp.PlpFilterSortListener";
            Intrinsics.checkNotNull(object, (String)object3);
            object = (jv2_0)object;
            this.c = object;
        }
        if ((object = this.getArguments()) != null && (n7 = (object = this.requireArguments()).containsKey((String)(object3 = "PLP_TYPE"))) != 0) {
            String string2;
            object = this.getArguments();
            if (object == null || (object = object.getString(string2 = "FILTER_STORE_THEME", (String)(object2 = ld3_2.STORE_AJIO.getStoreId()))) == null) {
                object = ld3_2.STORE_AJIO.getStoreId();
            }
            this.t = object;
            object = this.getArguments();
            n7 = object != null ? object.getInt(object3) : 100;
            n4 = 101;
            if (n7 == n4 && (n4 = (int)(Intrinsics.areEqual(object3 = this.t, string2 = ((ld3_2)((Object)(object2 = ld3_2.STORE_LUXE))).getStoreId()) ? 1 : 0)) != 0) {
                object = ((ld3_2)((Object)object2)).getStoreId();
                this.Oa((String)object);
            } else {
                n4 = 103;
                if (n7 == n4 && (n7 = (int)(Intrinsics.areEqual(object = this.t, object2 = ((ld3_2)((Object)(object3 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) != 0) {
                    object = ((ld3_2)((Object)object3)).getStoreId();
                    this.Oa((String)object);
                } else {
                    object = ld3_2.STORE_AJIO.getStoreId();
                    this.Oa((String)object);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.plp_filter_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        Object object = this.Ta();
        if (object != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).O = false;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.b;
        if (object != null) {
            object.stopLoader();
        }
        if ((object = this.h) != null) {
            ((RecyclerView)object).setAdapter(null);
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).X = null;
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).Y = null;
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).R) != null) {
            ((HashMap)object).clear();
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).S) != null) {
            ((HashMap)object).clear();
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).Z = null;
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).a0 = null;
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).y0 = false;
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        Object object3;
        Object object4;
        int n7;
        Object object5 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.Ta();
        if (object2 != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).f) != null) {
            object5 = this.getViewLifecycleOwner();
            n7 = 2;
            object4 = new us_1(this, n7);
            object3 = new s12$b((Function1)object4);
            ((LiveData)object2).e((mu1_1)object5, (F62)object3);
        }
        if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).i) != null) {
            object5 = this.getViewLifecycleOwner();
            object4 = new r12(this);
            ((LiveData)object2).e((mu1_1)object5, (F62)object4);
        }
        if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).m) != null) {
            object5 = this.getViewLifecycleOwner();
            n7 = 2;
            object4 = new ws_1(this, n7);
            object3 = new s12$b((Function1)object4);
            ((LiveData)object2).e((mu1_1)object5, (F62)object3);
        }
        if ((object2 = this.Ta()) != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).q) != null) {
            object5 = this.getViewLifecycleOwner();
            n7 = 1;
            object4 = new pm0_1(this, n7);
            object3 = new s12$b((Function1)object4);
            ((LiveData)object2).e((mu1_1)object5, (F62)object3);
        }
        this.Ua((View)object);
        this.Ya();
        this.updateTitle();
        object = this.k;
        if (object != null) {
            n4 = 1;
            object2 = new yd1_0(this, n4);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.f) != null) {
            n4 = 3;
            object2 = new m9(this, n4);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.l) != null) {
            n4 = 2;
            object2 = new n9(this, n4);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = z40_0.Companion;
        object2 = this.requireActivity().getApplication();
        object5 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        object.getClass();
        object = z40$a.a((Context)object2).a;
        boolean bl2 = ((ao0_0)object).a("filter_new_ux");
        object2 = null;
        if (bl2) {
            object = this.f;
            if (object != null) {
                n4 = 8;
                object.setVisibility(n4);
            }
            if ((object = this.f) != null) {
                object.setOnClickListener(null);
            }
            if ((object = this.k) != null) {
                n4 = R$string.reset;
                object.setText(n4);
            }
            if ((object = this.k) != null) {
                n3 = 1;
                object5 = new ZC0(this, n3);
                object.setOnClickListener((View.OnClickListener)object5);
            }
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            object = ((bv2_0)object).X;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            object = this.Ta();
            if (object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null) {
                object = ((ProductsList)object).getFacets();
            } else {
                bl2 = false;
                object = null;
            }
            object = (Collection)object;
            if (object != null && !(bl2 = object.isEmpty())) {
                object = this.Sa();
                object5 = this.Ta();
                n3 = 0;
                object4 = null;
                if (object5 != null && (object5 = ((F12)object5).d) != null) {
                    if (object != null && (object3 = (Facet)object.get(0)) != null) {
                        object3 = ((Facet)object3).getCode();
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    ((bv2_0)object5).Y = object3;
                }
                if ((object5 = this.Ta()) != null && (object5 = ((F12)object5).d) != null) {
                    if (object != null) {
                        object = (Facet)object.get(0);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    ((bv2_0)object5).X = object;
                }
            }
        }
        if ((object = this.Ta()) != null && (object = ((F12)object).d) != null) {
            object2 = ((bv2_0)object).X;
        }
        if (object2 != null) {
            object = this.Ta();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            Intrinsics.checkNotNull(object);
            this.ab((Facet)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void q5() {
        boolean bl2;
        String string2;
        boolean bl3;
        String string3 = "l1l3nestedcategory";
        Iterator iterator = "facetCode";
        Intrinsics.checkNotNullParameter(string3, (String)((Object)iterator));
        Object object = this.Ta();
        if (object == null) return;
        Intrinsics.checkNotNullParameter(string3, (String)((Object)iterator));
        object = ((F12)object).d;
        object.getClass();
        Intrinsics.checkNotNullParameter(string3, (String)((Object)iterator));
        iterator = ((bv2_0)object).N;
        if (iterator == null) return;
        object = ((ProductsList)((Object)iterator)).getFacets();
        if (object == null) return;
        iterator = ((ProductsList)((Object)iterator)).getFacets();
        Intrinsics.checkNotNull(iterator);
        iterator = ((Iterable)((Object)iterator)).iterator();
        do {
            boolean bl4;
            if (!(bl4 = iterator.hasNext())) return;
        } while (!(bl3 = kotlin.text.b.i(string2 = ((Facet)(object = (Facet)iterator.next())).getCode(), string3, bl2 = true)));
        if (object == null) return;
        this.j4((Facet)object, null);
    }

    public void updateTitle() {
        int n3;
        int n4;
        int n7;
        Object object = this.Ta();
        int n8 = 0;
        Object object2 = null;
        if (object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null && (object = ((ProductsList)object).getPagination()) != null) {
            n7 = ((Pagination)object).getTotalResults();
            object = n7;
        } else {
            n7 = 0;
            object = null;
        }
        String string2 = " (";
        if (object != null && (n4 = ((Integer)object).intValue()) > (n3 = 1)) {
            n7 = R$string.filters;
            object = hv3_0.K(n7);
            Object object3 = this.Ta();
            if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).N) != null && (object3 = ((ProductsList)object3).getPagination()) != null) {
                n8 = ((Pagination)object3).getTotalResults();
                object2 = n8;
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(" products)");
            object = ((StringBuilder)object3).toString();
        } else if (object != null) {
            n7 = R$string.filters;
            object = hv3_0.K(n7);
            Object object4 = this.Ta();
            if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).N) != null && (object4 = ((ProductsList)object4).getPagination()) != null) {
                n8 = ((Pagination)object4).getTotalResults();
                object2 = n8;
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append(object2);
            ((StringBuilder)object4).append(" product)");
            object = ((StringBuilder)object4).toString();
        } else {
            n7 = R$string.filters;
            object = hv3_0.K(n7);
        }
        object2 = this.g;
        if (object2 != null) {
            object2.setText((CharSequence)object);
        }
    }
}

