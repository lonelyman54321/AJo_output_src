/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
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
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YV1
 */
public final class yv1_1
extends Fragment
implements kH$a,
View.OnClickListener,
AbsListView.OnScrollListener {
    public static final YV1$a Companion;
    public YV1$b a;
    public RelativeLayout b;
    public ExpandableListView c;
    public kh_2 d;
    public String e;
    public final hh3_2 f;
    public LinkedHashMap g;
    public String h;
    public View i;
    public int j;
    public final hh3_2 k;

    static {
        YV1$a yV1$a;
        Companion = yV1$a = new Object();
    }

    public yv1_1() {
        Object object = new tv1_2(this, 0);
        this.f = object = yr1_2.b((Function0)object);
        this.j = -1;
        object = new uv1_2(this);
        this.k = object = yr1_2.b((Function0)object);
    }

    public final void P7(CMSNavigation cMSNavigation) {
        YV1$b yV1$b = this.a;
        if (yV1$b != null) {
            yV1$b.f(cMSNavigation);
        }
    }

    public final String d() {
        Object object = this.a;
        object = object != null ? object.D4() : null;
        return object;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.NewCMSSubCategoryFragment.OnSubCategoryListener");
        object = (YV1$b)object;
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
            object = this.c;
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
        block11: {
            boolean bl2;
            String string2;
            boolean bl3;
            block8: {
                boolean bl4;
                List list;
                block12: {
                    block9: {
                        block10: {
                            object2 = "CATEGORY_NAME";
                            list = "NAVIGATION";
                            super.onCreate((Bundle)object);
                            try {
                                object = this.getArguments();
                                if (object == null) return;
                                object = this.getArguments();
                                bl3 = true;
                                string2 = null;
                                if (object == null || (bl2 = object.containsKey((String)((Object)list))) != bl3) break block8;
                                this.g = object = new LinkedHashMap();
                                object = this.getArguments();
                                if (object == null) break block9;
                                int n3 = Build.VERSION.SDK_INT;
                                int n4 = 33;
                                if (n3 < n4) break block10;
                                object = pd1_2.a((Bundle)object);
                                object = (Parcelable)object;
                            }
                            catch (Exception exception2) {
                                break block11;
                            }
                        }
                        bl4 = (object = object.getParcelable((String)((Object)list))) instanceof CMSNavigation;
                        if (!bl4) {
                            bl2 = false;
                            object = null;
                        }
                        object = (CMSNavigation)object;
                        object = (CMSNavigation)object;
                        break block12;
                    }
                    bl2 = false;
                    object = null;
                }
                if (object != null && (object = ((CMSNavigation)object).getChildDetails()) != null) {
                    object = object.iterator();
                    while (bl4 = object.hasNext()) {
                        list = object.next();
                        list = (CMSNavigation)((Object)list);
                        ArrayList arrayList = new ArrayList();
                        Object object3 = ((CMSNavigation)((Object)list)).getChildDetails();
                        if (object3 != null) {
                            object3 = ((CMSNavigation)((Object)list)).getChildDetails();
                            Intrinsics.checkNotNull(object3);
                            object3 = (Collection)object3;
                            arrayList.addAll(object3);
                        }
                        if ((object3 = this.g) == null) continue;
                        list = ((AbstractMap)object3).put(list, arrayList);
                        list = list;
                    }
                }
            }
            object = this.k;
            object = ((hh3_2)object).getValue();
            object = (r81_0)object;
            object = ((r81_0)object).a;
            object = ((LiveData)object).d();
            object = (ArrayList)object;
            object = this.getArguments();
            if (object == null) return;
            bl2 = object.containsKey((String)object2);
            if (bl2 != bl3) return;
            object = this.getArguments();
            if (object != null) {
                string2 = object.getString((String)object2);
            }
            object = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(string2, (String)object);
            this.h = string2;
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
            View view = this.i;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView = view;
            }
            n3 = 0;
            view = null;
            absListView.setVisibility(0);
        } else {
            View view = this.i;
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
            absListView = this.i;
            if (absListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                absListView2 = absListView;
            }
            n7 = 8;
            absListView2.setVisibility(n7);
        } else if (n3 == 0) {
            absListView = this.i;
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
        int n3 = R$id.main_layout;
        bundle = (RelativeLayout)object.findViewById(n3);
        this.b = bundle;
        n3 = R$id.sub_category_expandable_list;
        bundle = (ExpandableListView)object.findViewById(n3);
        this.c = bundle;
        n3 = R$id.sub_category_card_scroll;
        this.i = object = object.findViewById(n3);
        n3 = 0;
        bundle = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollForMoreView");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new vv1_2(this);
        long l2 = 200L;
        object.postDelayed((Runnable)object2, l2);
        object2 = this.g;
        Object object3 = this.h;
        object = new kh_2(this, (LinkedHashMap)object2, (String)object3);
        this.d = object;
        object = this.c;
        object2 = "expandableListView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = this.d;
        object.setAdapter((ExpandableListAdapter)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new wv1_2(this);
        object.setOnGroupExpandListener((ExpandableListView.OnGroupExpandListener)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new xv1_1(this);
        object.setOnGroupClickListener((ExpandableListView.OnGroupClickListener)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = new Object();
        object.setOnChildClickListener((ExpandableListView.OnChildClickListener)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            bundle = object;
        }
        bundle.setOnScrollListener((AbsListView.OnScrollListener)this);
    }
}

