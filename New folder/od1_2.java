/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from oD1
 */
public final class od1_2
extends BaseExpandableListAdapter {
    public final oD1$a a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final String d;
    public final jo_2 e;

    public od1_2(oD1$a arrayList, LinkedHashMap object, String object2) {
        this.a = arrayList;
        this.b = object;
        this.c = arrayList = new ArrayList();
        this.d = object2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.e = object2 = new jo_2((Context)aJIOApplication);
        if (object != null) {
            object = ((LinkedHashMap)object).keySet();
            object2 = "<get-keys>(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (Collection)object;
            arrayList.addAll(object);
        }
    }

    public final Object getChild(int n3, int n4) {
        Object object = (NavImpl)this.c.get(n3);
        LinkedHashMap linkedHashMap = this.b;
        Intrinsics.checkNotNull(linkedHashMap);
        Object v4 = linkedHashMap.get(object);
        if (v4 != null) {
            Intrinsics.checkNotNull(linkedHashMap);
            object = (List)linkedHashMap.get(object);
            Intrinsics.checkNotNull(object);
            return object.get(n4);
        }
        return null;
    }

    public final long getChildId(int n3, int n4) {
        return n4;
    }

    public final View getChildView(int n3, int n4, boolean bl2, View view, ViewGroup object) {
        Object object2;
        boolean bl3;
        TextView textView;
        View view2;
        int n7;
        LayoutInflater layoutInflater;
        Object object3;
        Intrinsics.checkNotNullParameter(object3, "parent");
        Object object4 = (NavImpl)this.getChild(n3, n4);
        boolean bl4 = false;
        NavImpl navImpl = null;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from((Context)object3.getContext());
            n7 = R$layout.row_lux_sub_category_child;
            layoutInflater = layoutInflater.inflate(n7, object3, false);
        }
        int n8 = 0;
        object3 = null;
        if (layoutInflater != null) {
            n7 = R$id.sub_category_child;
            view2 = layoutInflater.findViewById(n7);
        } else {
            n7 = 0;
            view2 = null;
        }
        if (layoutInflater != null) {
            int n10 = R$id.sub_category_child_tv;
            textView = (TextView)layoutInflater.findViewById(n10);
        } else {
            boolean bl5 = false;
            textView = null;
        }
        if (layoutInflater != null) {
            n8 = R$id.row_category_exp_divider;
            object3 = layoutInflater.findViewById(n8);
        }
        if (n3 == 0) {
            if (object3 != null) {
                int n14 = 8;
                object3.setVisibility(n14);
            }
        } else if (object3 != null) {
            object3.setVisibility(0);
        }
        if (bl3 = object4 instanceof CMSNavigation) {
            boolean bl6;
            navImpl = object4;
            navImpl = (CMSNavigation)object4;
            object3 = ((CMSNavigation)navImpl).getName();
            Object object5 = ((CMSNavigation)navImpl).getInactiveAltText();
            if (object5 != null && view2 != null) {
                object5 = ((CMSNavigation)navImpl).getInactiveAltText();
                view2.setContentDescription((CharSequence)object5);
            }
            object5 = new ArrayList();
            Object object6 = ((CMSNavigation)navImpl).getChildDetails();
            if (object6 != null) {
                object6 = ((CMSNavigation)navImpl).getChildDetails();
                Intrinsics.checkNotNull(object6);
                object6 = (Collection)object6;
                ((ArrayList)object5).addAll(object6);
            }
            if (!(bl6 = ((ArrayList)object5).isEmpty())) {
                if (view2 != null) {
                    object4 = (CMSNavigation)object4;
                    object2 = new md1_1((CMSNavigation)object4, this);
                    view2.setOnClickListener((View.OnClickListener)object2);
                }
            } else {
                object2 = this.c.get(n3);
                object4 = "null cannot be cast to non-null type com.ril.ajio.services.data.Home.CMSNavigation";
                Intrinsics.checkNotNull(object2, (String)object4);
                object2 = (CMSNavigation)object2;
                object3 = ((CMSNavigation)navImpl).getName();
                n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n4 == 0) {
                    object4 = AnalyticsManager.Companion;
                    object5 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
                    object6 = "Global Nav";
                    ak0_0.a((AnalyticsManager$Companion)object4, (GTMEvents)object5, (String)object6, (String)object3);
                }
                object2 = ((CMSNavigation)object2).getName();
                Intrinsics.checkNotNull(view2);
                object4 = new nd1_1((CMSNavigation)navImpl, this, (String)object2);
                view2.setOnClickListener((View.OnClickListener)object4);
            }
        } else {
            object3 = "";
        }
        if (textView != null) {
            object2 = hv3_0.u((String)object3);
            textView.setText((CharSequence)object2);
        }
        return layoutInflater;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getChildrenCount(int n3) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap == null) return 0;
        Intrinsics.checkNotNull(linkedHashMap);
        ArrayList arrayList = this.c;
        Object e2 = arrayList.get(n3);
        Object v4 = linkedHashMap.get(e2);
        if (v4 == null) return 0;
        Intrinsics.checkNotNull(linkedHashMap);
        Object object = arrayList.get(n3);
        object = (List)linkedHashMap.get(object);
        Intrinsics.checkNotNull(object);
        return object.size();
    }

    public final Object getGroup(int n3) {
        return this.c.get(n3);
    }

    public final int getGroupCount() {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap != null) {
            Intrinsics.checkNotNull(linkedHashMap);
            return ((AbstractMap)linkedHashMap).size();
        }
        return 0;
    }

    public final long getGroupId(int n3) {
        return n3;
    }

    public final View getGroupView(int n3, boolean n4, View view, ViewGroup object) {
        Object object2;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        ConstraintLayout constraintLayout;
        int n7;
        Intrinsics.checkNotNullParameter(object, "parent");
        NavImpl navImpl = (NavImpl)this.c.get(n3);
        if (view == null) {
            view = LayoutInflater.from((Context)object.getContext());
            n7 = R$layout.row_lux_category_exp_group;
            view = view.inflate(n7, object, false);
        }
        int n8 = 0;
        object = null;
        if (view != null) {
            n7 = R$id.main_layout;
            constraintLayout = (ConstraintLayout)view.findViewById(n7);
        } else {
            n7 = 0;
            constraintLayout = null;
        }
        if (view != null) {
            int n10 = R$id.row_category_exp_imv_plus;
            imageView2 = (ImageView)view.findViewById(n10);
        } else {
            boolean bl2 = false;
            imageView2 = null;
        }
        if (view != null) {
            int n14 = R$id.row_category_exp_tv_title;
            textView = (TextView)view.findViewById(n14);
        } else {
            boolean bl3 = false;
            textView = null;
        }
        if (view != null) {
            int n15 = R$id.row_category_exp_imv_category;
            imageView = (ImageView)view.findViewById(n15);
        } else {
            boolean bl4 = false;
            imageView = null;
        }
        if (view != null) {
            n8 = R$id.row_category_exp_divider;
            object = view.findViewById(n8);
        }
        if (n4 != 0) {
            if (imageView2 != null) {
                n4 = R$drawable.ic_lux_category_minus;
                imageView2.setImageResource(n4);
            }
        } else if (imageView2 != null) {
            n4 = R$drawable.ic_lux_category_plus;
            imageView2.setImageResource(n4);
        }
        Object object3 = this.c;
        n4 = ((ArrayList)object3).size();
        int n16 = 1;
        int n17 = 8;
        if (n3 == (n4 -= n16)) {
            if (object != null) {
                object.setVisibility(n17);
            }
        } else if (object != null) {
            object.setVisibility(0);
        }
        if ((n3 = navImpl instanceof CMSNavigation) != 0) {
            object2 = ((CMSNavigation)(navImpl = (CMSNavigation)navImpl)).getInactiveAltText();
            if (object2 != null && constraintLayout != null) {
                object2 = ((CMSNavigation)navImpl).getInactiveAltText();
                constraintLayout.setContentDescription((CharSequence)object2);
            }
            object2 = new ArrayList();
            object3 = ((CMSNavigation)navImpl).getChildDetails();
            if (object3 != null) {
                object3 = ((CMSNavigation)navImpl).getChildDetails();
                Intrinsics.checkNotNull(object3);
                object3 = (Collection)object3;
                ((ArrayList)object2).addAll(object3);
            }
            if ((n3 = ((ArrayList)object2).size()) > 0) {
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            } else if (imageView2 != null) {
                imageView2.setVisibility(n17);
            }
            object2 = ((CMSNavigation)navImpl).getName();
            object3 = ((CMSNavigation)navImpl).getActiveImageUrl();
            if (object3 != null && (n4 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0)) == 0) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                object3 = new da$a();
                ((da$a)object3).a = n8 = R$drawable.component_placeholder;
                ((da$a)object3).b = n8;
                ((da$a)object3).c = n8 = R$drawable.item_dummy_noimg;
                ((da$a)object3).s = n16;
                ((da$a)object3).r = n16;
                ((da$a)object3).k = n16;
                n8 = R$string.acc_icon_product_placeholder;
                object = hv3_0.K(n8);
                ((da$a)object3).b((String)object);
                object = ((CMSNavigation)navImpl).getActiveImageUrl();
                Intrinsics.checkNotNull(imageView);
                ((da$a)object3).n = object;
                ((da$a)object3).u = imageView;
                ((da$a)object3).i = n16;
                ((da$a)object3).a();
            } else if (imageView != null) {
                imageView.setVisibility(n17);
            }
        } else {
            object2 = "";
        }
        if (textView != null) {
            object2 = hv3_0.u((String)object2);
            textView.setText((CharSequence)object2);
        }
        return view;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isChildSelectable(int n3, int n4) {
        return true;
    }
}

