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
 *  android.widget.ArrayAdapter
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hf3
 */
public final class hf3_1
extends BaseExpandableListAdapter {
    public final hf3$a a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final String d;
    public final jo_2 e;

    public hf3_1(hf3$a arrayList, LinkedHashMap object, String object2) {
        this.a = arrayList;
        this.b = object;
        this.c = arrayList = new ArrayList();
        this.d = object2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.e = object2 = new jo_2((Context)aJIOApplication);
        if (object != null) {
            object = ((LinkedHashMap)object).keySet();
            Intrinsics.checkNotNull(object);
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
        AjioNonScrollableListView ajioNonScrollableListView;
        Object object3;
        Object object4;
        TextView textView;
        View view2;
        int n7;
        Intrinsics.checkNotNullParameter(object, "parent");
        NavImpl navImpl = (NavImpl)this.getChild(n3, n4);
        bl2 = false;
        Object object5 = null;
        if (view == null) {
            view = LayoutInflater.from((Context)object.getContext());
            n7 = R$layout.row_sub_category_child;
            view = view.inflate(n7, object, false);
        }
        boolean bl3 = false;
        object = null;
        if (view != null) {
            n7 = R$id.sub_category_child;
            view2 = view.findViewById(n7);
        } else {
            n7 = 0;
            view2 = null;
        }
        if (view != null) {
            int n8 = R$id.sub_category_child_tv;
            textView = (TextView)view.findViewById(n8);
        } else {
            boolean bl4 = false;
            textView = null;
        }
        if (view != null) {
            int n10 = R$id.sub_category_child_imv_selected;
            object4 = (ImageView)view.findViewById(n10);
        } else {
            boolean bl5 = false;
            object4 = null;
        }
        if (view != null) {
            int n14 = R$id.sub_category_child_imv_next;
            object3 = (ImageView)view.findViewById(n14);
        } else {
            boolean bl6 = false;
            object3 = null;
        }
        if (view != null) {
            int n15 = R$id.sub_category_child_list;
            ajioNonScrollableListView = (AjioNonScrollableListView)view.findViewById(n15);
        } else {
            boolean bl7 = false;
            ajioNonScrollableListView = null;
        }
        int n16 = 8;
        if (object4 != null) {
            object4.setVisibility(n16);
        }
        boolean bl8 = navImpl instanceof Navigation;
        hf3$a hf3$a = this.a;
        if (bl8) {
            object2 = navImpl;
            object2 = (Navigation)navImpl;
            object4 = ((Navigation)object2).getName();
            ArrayList arrayList = new ArrayList();
            Object object6 = ((Navigation)object2).getChildDetails();
            if (object6 != null) {
                object6 = ((Navigation)object2).getChildDetails();
                Intrinsics.checkNotNull(object6);
                object6 = (Collection)object6;
                arrayList.addAll(object6);
            }
            if ((object6 = ((Navigation)object2).getLinkDetails()) != null) {
                object2 = ((Navigation)object2).getLinkDetails();
                Intrinsics.checkNotNull(object2);
                object2 = (Collection)object2;
                arrayList.addAll(object2);
            }
            if ((n3 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0) {
                if (object3 != null) {
                    object3.setVisibility(0);
                }
                if (object3 != null) {
                    n3 = R$drawable.ic_plus_grey;
                    object3.setImageResource(n3);
                }
                if (ajioNonScrollableListView != null) {
                    ajioNonScrollableListView.setVisibility(n16);
                }
                if (hf3$a != null) {
                    object = hf3$a.d();
                }
                object2 = n1.a((String)object, "->", (String)object4);
                Intrinsics.checkNotNull(view);
                object = view.getContext();
                String string2 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                n16 = R$layout.row_sub_category_sub_child;
                Intrinsics.checkNotNullParameter(object, "context");
                object6 = "objects";
                Intrinsics.checkNotNullParameter(arrayList, (String)object6);
                object5 = new ArrayAdapter((Context)object, n16, arrayList);
                ((jf3_1)((Object)object5)).a = object2;
                ((jf3_1)((Object)object5)).b = hf3$a;
                if (ajioNonScrollableListView != null) {
                    ajioNonScrollableListView.setAdapter((ListAdapter)object5);
                }
                if (view2 != null) {
                    navImpl = (Navigation)navImpl;
                    object2 = new ff3_0((Navigation)navImpl, this, ajioNonScrollableListView, (ImageView)object3);
                    view2.setOnClickListener((View.OnClickListener)object2);
                }
            } else {
                if (object3 != null) {
                    object3.setVisibility(n16);
                }
                if (ajioNonScrollableListView != null) {
                    ajioNonScrollableListView.setVisibility(n16);
                }
            }
        } else {
            bl8 = navImpl instanceof LinkDetail;
            String string3 = "";
            if (bl8) {
                if (object3 != null) {
                    object3.setVisibility(n16);
                }
                if (ajioNonScrollableListView != null) {
                    ajioNonScrollableListView.setVisibility(n16);
                }
                navImpl = (LinkDetail)navImpl;
                px3.a((LinkDetail)navImpl);
                object3 = ((LinkDetail)navImpl).getLinkName();
                if (hf3$a != null) {
                    object = hf3$a.d();
                }
                if (bl3 = Intrinsics.areEqual(object3, object)) {
                    if (object4 != null) {
                        object4.setVisibility(0);
                    }
                } else if (object4 != null) {
                    object4.setVisibility(n16);
                }
                if (bl2 = (object2 = (NavImpl)(object5 = this.c).get(n3)) instanceof Navigation) {
                    object2 = (Navigation)object2;
                    string3 = ((Navigation)object2).getName();
                }
                Intrinsics.checkNotNull(view2);
                object2 = new gf3_0((LinkDetail)navImpl, this, string3);
                view2.setOnClickListener((View.OnClickListener)object2);
                object4 = object3;
            } else {
                object4 = string3;
            }
        }
        if (textView != null) {
            object2 = hv3_0.u((String)object4);
            textView.setText((CharSequence)object2);
        }
        return view;
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

    public final View getGroupView(int n3, boolean bl2, View view, ViewGroup object) {
        int n4;
        ImageView imageView;
        TextView textView;
        Object object2;
        block42: {
            int n7;
            int n8;
            int n10;
            TextView textView2;
            int n14;
            int n15;
            Intrinsics.checkNotNullParameter(object, "parent");
            NavImpl navImpl = (NavImpl)this.c.get(n3);
            if (view == null) {
                view = LayoutInflater.from((Context)object.getContext());
                n15 = R$layout.row_category_exp_group;
                view = view.inflate(n15, (ViewGroup)object, false);
            }
            int n16 = 0;
            object = null;
            if (view != null) {
                n15 = R$id.row_category_exp_group;
                object2 = view.findViewById(n15);
            } else {
                n15 = 0;
                object2 = null;
            }
            if (view != null) {
                n14 = R$id.row_category_exp_tv_title;
                textView2 = (TextView)view.findViewById(n14);
            } else {
                n14 = 0;
                textView2 = null;
            }
            if (view != null) {
                n10 = R$id.row_category_exp_tv_subtitle;
                textView = (TextView)view.findViewById(n10);
            } else {
                n10 = 0;
                textView = null;
            }
            if (view != null) {
                n8 = R$id.row_category_exp_imv_indicator;
                imageView = (ImageView)view.findViewById(n8);
            } else {
                n8 = 0;
                imageView = null;
            }
            if (view != null) {
                n16 = R$id.row_category_exp_divider;
                object = view.findViewById(n16);
            }
            Object object3 = this.b;
            n4 = 8;
            if (n3 == 0) {
                if (object2 != null) {
                    n7 = R$drawable.category_list_top_bg;
                    object2.setBackgroundResource(n7);
                }
                if (object != null) {
                    object.setVisibility(n4);
                }
            } else {
                Intrinsics.checkNotNull(object3);
                n7 = ((AbstractMap)object3).size() + -1;
                if (n3 == n7) {
                    if (object2 != null) {
                        n7 = R$drawable.category_list_bottom_bg;
                        object2.setBackgroundResource(n7);
                    }
                    if (object != null) {
                        object.setVisibility(0);
                    }
                } else {
                    if (object2 != null) {
                        n7 = hv3_0.m(R$color.white);
                        object2.setBackgroundColor(n7);
                    }
                    if (object != null) {
                        object.setVisibility(0);
                    }
                }
            }
            n16 = navImpl instanceof LinkDetail;
            object2 = "";
            if (n16 != 0) {
                navImpl = (LinkDetail)navImpl;
                px3.a((LinkDetail)navImpl);
                object = ((LinkDetail)navImpl).getLinkName();
            } else {
                n16 = navImpl instanceof Navigation;
                if (n16 != 0) {
                    navImpl = (Navigation)navImpl;
                    object = ((Navigation)navImpl).getName();
                } else {
                    object = object2;
                }
            }
            if (textView2 != null) {
                object = hv3_0.u((String)object);
                textView2.setText((CharSequence)object);
            }
            if (object3 == null) break block42;
            Intrinsics.checkNotNull(object3);
            object = this.c;
            Object object4 = ((ArrayList)object).get(n3);
            object4 = (List)object3.get(object4);
            if (object4 == null) break block42;
            object = object4;
            object = (Collection)object4;
            n16 = object.size();
            int n17 = 3;
            object3 = object2;
            n14 = 0;
            textView2 = null;
            while (true) {
                block45: {
                    block43: {
                        boolean bl3;
                        Object object5;
                        String string2;
                        block44: {
                            if (n14 >= n16) break block43;
                            string2 = "ALL";
                            object5 = (NavImpl)object4.get(n14);
                            bl3 = object5 instanceof LinkDetail;
                            object5 = bl3 ? ((LinkDetail)object5).getLinkName() : ((bl3 = object5 instanceof Navigation) ? ((Navigation)object5).getName() : object2);
                            bl3 = string2.equalsIgnoreCase((String)object5);
                            if (!bl3) break block44;
                            ++n17;
                            break block45;
                        }
                        bl3 = TextUtils.isEmpty((CharSequence)object3);
                        if (!bl3) {
                            string2 = ", ";
                            object3 = Ft2.a((String)object3, string2);
                        }
                        object5 = hv3_0.u((String)object5);
                        object3 = Ft2.a((String)object3, (String)object5);
                        if (n14 != n17) break block45;
                    }
                    object2 = object3;
                    break;
                }
                ++n14;
            }
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText((CharSequence)object2);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (bl2) {
                if (imageView != null) {
                    n3 = R$drawable.ic_subtract_grey;
                    imageView.setImageResource(n3);
                }
            } else if (imageView != null) {
                n3 = R$drawable.ic_plus_grey;
                imageView.setImageResource(n3);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(n4);
            }
            if (textView != null) {
                textView.setVisibility(n4);
            }
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

