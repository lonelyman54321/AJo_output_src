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
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from FD1
 */
public final class fd1_1
extends BaseExpandableListAdapter {
    public final FD1$a a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final String d;
    public final jo_2 e;

    public fd1_1(FD1$a arrayList, LinkedHashMap object, String object2) {
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
        NavImpl navImpl = (NavImpl)this.getChild(n3, n4);
        boolean bl4 = false;
        String string2 = null;
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
        if (bl3 = navImpl instanceof Navigation) {
            object2 = navImpl;
            object2 = (Navigation)navImpl;
            string2 = ((Navigation)object2).getName();
            object3 = new ArrayList();
            Collection collection = ((Navigation)object2).getChildDetails();
            if (collection != null) {
                collection = ((Navigation)object2).getChildDetails();
                Intrinsics.checkNotNull(collection);
                collection = collection;
                ((ArrayList)object3).addAll(collection);
            }
            if ((collection = ((Navigation)object2).getLinkDetails()) != null) {
                object2 = ((Navigation)object2).getLinkDetails();
                Intrinsics.checkNotNull(object2);
                object2 = (Collection)object2;
                ((ArrayList)object3).addAll(object2);
            }
            if ((n3 = (int)(((ArrayList)object3).isEmpty() ? 1 : 0)) == 0 && view2 != null) {
                navImpl = (Navigation)navImpl;
                object2 = new dd1_1((Navigation)navImpl, this);
                view2.setOnClickListener((View.OnClickListener)object2);
            }
        } else {
            boolean bl6 = navImpl instanceof LinkDetail;
            if (bl6) {
                object2 = this.c.get(n3);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.Home.Navigation");
                object2 = (Navigation)object2;
                navImpl = (LinkDetail)navImpl;
                px3.a((LinkDetail)navImpl);
                string2 = ((LinkDetail)navImpl).getLinkName();
                n8 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                if (n8 == 0) {
                    object3 = AnalyticsManager.Companion;
                    GTMEvents gTMEvents = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                    String string3 = "Global Nav";
                    ak0_0.a((AnalyticsManager$Companion)object3, gTMEvents, string3, string2);
                }
                object2 = ((Navigation)object2).getName();
                Intrinsics.checkNotNull(view2);
                object3 = new ed1_1((LinkDetail)navImpl, this, (String)object2);
                view2.setOnClickListener((View.OnClickListener)object3);
            } else {
                string2 = "";
            }
        }
        if (textView != null) {
            object2 = hv3_0.u(string2);
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
            n7 = R$id.row_category_exp_imv_plus;
            imageView2 = (ImageView)view.findViewById(n7);
        } else {
            n7 = 0;
            imageView2 = null;
        }
        if (view != null) {
            int n10 = R$id.row_category_exp_tv_title;
            textView = (TextView)view.findViewById(n10);
        } else {
            boolean bl2 = false;
            textView = null;
        }
        if (view != null) {
            int n14 = R$id.row_category_exp_imv_category;
            imageView = (ImageView)view.findViewById(n14);
        } else {
            boolean bl3 = false;
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
        int n15 = 1;
        int n16 = 8;
        if (n3 == (n4 -= n15)) {
            if (object != null) {
                object.setVisibility(n16);
            }
        } else if (object != null) {
            object.setVisibility(0);
        }
        if ((n3 = navImpl instanceof LinkDetail) != 0) {
            navImpl = (LinkDetail)navImpl;
            px3.a((LinkDetail)navImpl);
            object2 = ((LinkDetail)navImpl).getLinkName();
            if (imageView != null) {
                imageView.setVisibility(n16);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(n16);
            }
        } else {
            n3 = navImpl instanceof Navigation;
            if (n3 != 0) {
                object2 = new ArrayList();
                object3 = ((Navigation)(navImpl = (Navigation)navImpl)).getChildDetails();
                if (object3 != null) {
                    object3 = ((Navigation)navImpl).getChildDetails();
                    Intrinsics.checkNotNull(object3);
                    object3 = (Collection)object3;
                    ((ArrayList)object2).addAll(object3);
                }
                if ((object3 = ((Navigation)navImpl).getLinkDetails()) != null) {
                    object3 = ((Navigation)navImpl).getLinkDetails();
                    Intrinsics.checkNotNull(object3);
                    object3 = (Collection)object3;
                    ((ArrayList)object2).addAll(object3);
                }
                if ((n3 = ((ArrayList)object2).size()) > 0) {
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                } else if (imageView2 != null) {
                    imageView2.setVisibility(n16);
                }
                object2 = ((Navigation)navImpl).getName();
                object3 = ((Navigation)navImpl).getPicture();
                if (object3 != null && (n4 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0)) == 0) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    object3 = new da$a();
                    ((da$a)object3).k = n15;
                    ((da$a)object3).r = n15;
                    n8 = R$string.acc_banner;
                    object = hv3_0.K(n8);
                    ((da$a)object3).b((String)object);
                    object = ((Navigation)navImpl).getPicture();
                    Intrinsics.checkNotNull(imageView);
                    ((da$a)object3).n = object;
                    ((da$a)object3).u = imageView;
                    ((da$a)object3).a();
                } else if (imageView != null) {
                    imageView.setVisibility(n16);
                }
            } else {
                object2 = "";
            }
        }
        if (textView != null) {
            object2 = hv3_0.u(object2);
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

