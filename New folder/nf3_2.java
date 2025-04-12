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
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnChildClickListener
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.ExpandableListView$OnGroupExpandListener
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.Navigation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nf3
 */
public final class nf3_2
extends Fragment
implements hf3$a,
View.OnClickListener,
AbsListView.OnScrollListener {
    public static final nf3$a_0 Companion;
    public nf3$b a;
    public ExpandableListView b;
    public hf3_1 c;
    public String d;
    public final hh3_2 e;
    public LinkedHashMap f;
    public String g;
    public View h;
    public int i;
    public final NewCustomEventsRevamp j;
    public final String k;
    public final String l;
    public final hh3_2 m;

    static {
        nf3$a_0 nf3$a_0;
        Companion = nf3$a_0 = new Object();
    }

    public nf3_2() {
        Object object = new ij_0(this, 2);
        this.e = object = yr1_2.b((Function0)object);
        this.i = -1;
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.j = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.k = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.l = object = newEEcommerceEventsRevamp.getPrevScreenType();
        object = new mf3_2(this);
        this.m = object = yr1_2.b((Function0)object);
    }

    public final String d() {
        Object object = this.a;
        object = object != null ? object.d() : null;
        return object;
    }

    public final void i(LinkDetail linkDetail) {
        nf3$b nf3$b = this.a;
        if (nf3$b != null) {
            nf3$b.i(linkDetail);
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.SubCategoryFragment.OnSubCategoryListener");
        object = (nf3$b)object;
        this.a = object;
    }

    public final void onClick(View object) {
        int n3;
        Object object2 = null;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.sub_category_card_scroll;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            object = this.b;
            if (object == null) {
                object = "expandableListView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            n3 = 1000;
            object2.smoothScrollToPosition(n3);
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            String string2 = "Menu Option";
            String string3 = "Scroll for more";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        Exception exception2;
        Object object2;
        block16: {
            boolean bl2;
            String string2;
            boolean bl3;
            block13: {
                boolean bl4;
                int n3;
                Object object3;
                block17: {
                    block14: {
                        block15: {
                            object2 = "CATEGORY_NAME";
                            object3 = "NAVIGATION";
                            super.onCreate((Bundle)object);
                            try {
                                object = this.getArguments();
                                if (object == null) return;
                                object = this.getArguments();
                                bl3 = true;
                                string2 = null;
                                if (object == null || (bl2 = object.containsKey((String)object3)) != bl3) break block13;
                                this.f = object = new LinkedHashMap();
                                object = this.getArguments();
                                if (object == null) break block14;
                                n3 = Build.VERSION.SDK_INT;
                                int n4 = 33;
                                if (n3 < n4) break block15;
                                object = gd1_1.a((Bundle)object);
                                object = (Parcelable)object;
                            }
                            catch (Exception exception2) {
                                break block16;
                            }
                        }
                        bl4 = (object = object.getParcelable((String)object3)) instanceof Navigation;
                        if (!bl4) {
                            bl2 = false;
                            object = null;
                        }
                        object = (Navigation)object;
                        object = (Navigation)object;
                        break block17;
                    }
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    Object object4;
                    Object object5;
                    object3 = ((Navigation)object).getLinkDetails();
                    object = ((Navigation)object).getChildDetails();
                    if (object3 != null) {
                        object3 = object3.iterator();
                        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                            object5 = object3.next();
                            object5 = (LinkDetail)object5;
                            object4 = this.f;
                            if (object4 == null) continue;
                            object5 = ((AbstractMap)object4).put(object5, null);
                            object5 = (List)object5;
                        }
                    }
                    if (object != null) {
                        object = object.iterator();
                        while (bl4 = object.hasNext()) {
                            object3 = object.next();
                            object3 = (Navigation)object3;
                            object5 = new ArrayList();
                            object4 = ((Navigation)object3).getLinkDetails();
                            if (object4 != null) {
                                object4 = ((Navigation)object3).getLinkDetails();
                                Intrinsics.checkNotNull(object4);
                                object4 = (Collection)object4;
                                ((ArrayList)object5).addAll(object4);
                            }
                            if ((object4 = ((Navigation)object3).getChildDetails()) != null) {
                                object4 = ((Navigation)object3).getChildDetails();
                                Intrinsics.checkNotNull(object4);
                                object4 = (Collection)object4;
                                ((ArrayList)object5).addAll(object4);
                            }
                            if ((object4 = this.f) == null) continue;
                            object3 = ((AbstractMap)object4).put(object3, object5);
                            object3 = (List)object3;
                        }
                    }
                }
            }
            object = this.m;
            object = ((hh3_2)object).getValue();
            object = (r81_0)object;
            object = ((r81_0)object).a;
            object = ((LiveData)object).d();
            if ((object = (ArrayList)object) != null) {
                String.valueOf(object);
            }
            if ((object = this.getArguments()) == null) return;
            bl2 = object.containsKey((String)object2);
            if (bl2 != bl3) return;
            object = this.getArguments();
            if (object != null) {
                string2 = object.getString((String)object2);
            }
            object = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(string2, (String)object);
            this.g = string2;
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.view_sub_category;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onScroll(AbsListView absListView, int n3, int n4, int n7) {
        absListView = null;
        String string2 = "scrollForMoreView";
        if ((n3 += n4) < n7) {
            View view = this.h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView = view;
            }
            n3 = 0;
            view = null;
            absListView.setVisibility(0);
        } else {
            View view = this.h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView = view;
            }
            n3 = 8;
            absListView.setVisibility(n3);
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int n3) {
        int n4;
        int n7;
        AbsListView absListView2 = null;
        String string2 = "scrollForMoreView";
        if (absListView != null && (n7 = absListView.canScrollList(n4 = 2)) == 0 && n3 == 0) {
            absListView = this.h;
            if (absListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView2 = absListView;
            }
            n7 = 8;
            absListView2.setVisibility(n7);
        } else if (n3 == 0) {
            absListView = this.h;
            if (absListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView2 = absListView;
            }
            n7 = 0;
            absListView = null;
            absListView2.setVisibility(0);
        }
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.sub_category_expandable_list;
        bundle = (ExpandableListView)object.findViewById(n3);
        this.b = bundle;
        n3 = R$id.sub_category_card_scroll;
        this.h = object = object.findViewById(n3);
        n3 = 0;
        bundle = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollForMoreView");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object2 = this.f;
        Object object3 = this.g;
        object = new hf3_1(this, (LinkedHashMap)object2, (String)object3);
        this.c = object;
        object = this.b;
        object2 = "expandableListView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = this.c;
        object.setAdapter((ExpandableListAdapter)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new kf3_1(this);
        object.setOnGroupExpandListener((ExpandableListView.OnGroupExpandListener)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new lf3_2(this);
        object.setOnGroupClickListener((ExpandableListView.OnGroupClickListener)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new Object();
        object.setOnChildClickListener((ExpandableListView.OnChildClickListener)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            bundle = object;
        }
        bundle.setOnScrollListener((AbsListView.OnScrollListener)this);
    }
}

