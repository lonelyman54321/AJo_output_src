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
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kH
 */
public final class kh_2
extends BaseExpandableListAdapter {
    public final kH$a a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final String d;
    public final jo_2 e;

    public kh_2(kH$a arrayList, LinkedHashMap object, String object2) {
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
        ImageView imageView;
        Object object3;
        int n7;
        TextView textView;
        View view2;
        int n8;
        LayoutInflater layoutInflater;
        Object object4;
        Intrinsics.checkNotNullParameter(object4, "parent");
        Object object5 = (NavImpl)this.getChild(n3, n4);
        boolean bl3 = false;
        Object object6 = null;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from((Context)object4.getContext());
            n8 = R$layout.row_sub_category_child;
            layoutInflater = layoutInflater.inflate(n8, object4, false);
        }
        boolean bl4 = false;
        object4 = null;
        if (layoutInflater != null) {
            n8 = R$id.sub_category_child;
            view2 = layoutInflater.findViewById(n8);
        } else {
            n8 = 0;
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
            n7 = R$id.sub_category_child_imv_selected;
            object3 = (ImageView)layoutInflater.findViewById(n7);
        } else {
            n7 = 0;
            object3 = null;
        }
        if (layoutInflater != null) {
            int n14 = R$id.sub_category_child_imv_next;
            imageView = (ImageView)layoutInflater.findViewById(n14);
        } else {
            boolean bl6 = false;
            imageView = null;
        }
        if (layoutInflater != null) {
            int n15 = R$id.sub_category_child_list;
            ajioNonScrollableListView = (AjioNonScrollableListView)layoutInflater.findViewById(n15);
        } else {
            boolean bl7 = false;
            ajioNonScrollableListView = null;
        }
        int n16 = 8;
        if (object3 != null) {
            object3.setVisibility(n16);
        }
        boolean bl8 = object5 instanceof CMSNavigation;
        Object object7 = "";
        if (bl8) {
            boolean bl9;
            Object object8 = object5;
            object8 = (CMSNavigation)object5;
            Object object9 = ((CMSNavigation)object8).getInactiveAltText();
            if (object9 != null && view2 != null) {
                object9 = ((CMSNavigation)object8).getInactiveAltText();
                view2.setContentDescription((CharSequence)object9);
            }
            object9 = ((CMSNavigation)object8).getChildDetails();
            kH$a kH$a = this.a;
            if (object9 != null && !(bl9 = object9.isEmpty())) {
                object7 = ((CMSNavigation)object8).getName();
                object2 = new ArrayList();
                object3 = ((CMSNavigation)object8).getChildDetails();
                if (object3 != null) {
                    object3 = ((CMSNavigation)object8).getChildDetails();
                    Intrinsics.checkNotNull(object3);
                    object3 = (Collection)object3;
                    ((ArrayList)object2).addAll(object3);
                }
                if ((n7 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == 0) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    if (imageView != null) {
                        int n17 = R$drawable.ic_plus_grey;
                        imageView.setImageResource(n17);
                    }
                    if (ajioNonScrollableListView != null) {
                        ajioNonScrollableListView.setVisibility(n16);
                    }
                    if (kH$a != null) {
                        object4 = kH$a.d();
                    }
                    object6 = n1.a(object4, "->", (String)object7);
                    Intrinsics.checkNotNull(layoutInflater);
                    object3 = layoutInflater.getContext();
                    String string2 = "getContext(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    n16 = R$layout.row_sub_category_sub_child;
                    Intrinsics.checkNotNullParameter(object3, "context");
                    object8 = "objects";
                    Intrinsics.checkNotNullParameter(object2, (String)object8);
                    object4 = new ArrayAdapter((Context)object3, n16, (List)object2);
                    ((mh_2)((Object)object4)).a = object6;
                    ((mh_2)((Object)object4)).b = kH$a;
                    if (ajioNonScrollableListView != null) {
                        ajioNonScrollableListView.setAdapter((ListAdapter)object4);
                    }
                    if (view2 != null) {
                        object5 = (CMSNavigation)object5;
                        object2 = new ih_2((CMSNavigation)object5, this, ajioNonScrollableListView, imageView);
                        view2.setOnClickListener((View.OnClickListener)object2);
                    }
                } else {
                    if (imageView != null) {
                        imageView.setVisibility(n16);
                    }
                    if (ajioNonScrollableListView != null) {
                        ajioNonScrollableListView.setVisibility(n16);
                    }
                }
            } else {
                boolean bl10;
                if (imageView != null) {
                    imageView.setVisibility(n16);
                }
                if (ajioNonScrollableListView != null) {
                    ajioNonScrollableListView.setVisibility(n16);
                }
                px3.b((CMSNavigation)object8);
                object5 = ((CMSNavigation)object8).getName();
                if (kH$a != null) {
                    object4 = kH$a.d();
                }
                if (bl4 = Intrinsics.areEqual(object5, object4)) {
                    if (object3 != null) {
                        object3.setVisibility(0);
                    }
                } else if (object3 != null) {
                    object3.setVisibility(n16);
                }
                if (bl10 = (object2 = (NavImpl)((ArrayList)(object6 = this.c)).get(n3)) instanceof CMSNavigation) {
                    object2 = (CMSNavigation)object2;
                    object7 = ((CMSNavigation)object2).getName();
                }
                Intrinsics.checkNotNull(view2);
                object2 = new jh_2((CMSNavigation)object8, this, (String)object7);
                view2.setOnClickListener((View.OnClickListener)object2);
                object7 = object5;
            }
        }
        if (textView != null) {
            object2 = hv3_0.u((String)object7);
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

    public final View getGroupView(int n3, boolean bl2, View view, ViewGroup object) {
        String string2;
        int n4;
        ImageView imageView;
        TextView textView;
        block43: {
            int n7;
            int n8;
            int n10;
            Object object2;
            int n14;
            View view2;
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
                view2 = view.findViewById(n15);
            } else {
                n15 = 0;
                view2 = null;
            }
            if (view != null) {
                n14 = R$id.row_category_exp_tv_title;
                object2 = (TextView)view.findViewById(n14);
            } else {
                n14 = 0;
                object2 = null;
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
                if (view2 != null) {
                    n7 = R$drawable.category_list_top_bg;
                    view2.setBackgroundResource(n7);
                }
                if (object != null) {
                    object.setVisibility(n4);
                }
            } else {
                Intrinsics.checkNotNull(object3);
                n7 = ((AbstractMap)object3).size() + -1;
                if (n3 == n7) {
                    if (view2 != null) {
                        n7 = R$drawable.category_list_bottom_bg;
                        view2.setBackgroundResource(n7);
                    }
                    if (object != null) {
                        object.setVisibility(0);
                    }
                } else {
                    if (view2 != null) {
                        n7 = hv3_0.m(R$color.white);
                        view2.setBackgroundColor(n7);
                    }
                    if (object != null) {
                        object.setVisibility(0);
                    }
                }
            }
            n16 = navImpl instanceof LinkDetail;
            string2 = "";
            if (n16 != 0) {
                navImpl = (LinkDetail)navImpl;
                px3.a((LinkDetail)navImpl);
                object = ((LinkDetail)navImpl).getLinkName();
            } else {
                n16 = navImpl instanceof CMSNavigation;
                if (n16 != 0) {
                    object = ((CMSNavigation)(navImpl = (CMSNavigation)navImpl)).getInactiveAltText();
                    if (object != null && view2 != null) {
                        object = ((CMSNavigation)navImpl).getInactiveAltText();
                        view2.setContentDescription((CharSequence)object);
                    }
                    object = ((CMSNavigation)navImpl).getName();
                } else {
                    object = string2;
                }
            }
            if (object2 != null) {
                object = hv3_0.u((String)object);
                object2.setText((CharSequence)object);
            }
            if (object3 == null) break block43;
            Intrinsics.checkNotNull(object3);
            object = this.c;
            Object object4 = ((ArrayList)object).get(n3);
            object4 = (List)object3.get(object4);
            if (object4 == null) break block43;
            object = object4;
            object = (Collection)object4;
            n16 = object.size();
            int n17 = 3;
            object2 = string2;
            n15 = 0;
            view2 = null;
            while (true) {
                block46: {
                    block44: {
                        boolean bl3;
                        String string3;
                        block45: {
                            if (n15 >= n16) break block44;
                            string3 = "ALL";
                            object3 = (NavImpl)object4.get(n15);
                            bl3 = object3 instanceof LinkDetail;
                            object3 = bl3 ? ((LinkDetail)object3).getLinkName() : ((bl3 = object3 instanceof CMSNavigation) ? ((CMSNavigation)object3).getName() : string2);
                            bl3 = string3.equalsIgnoreCase((String)object3);
                            if (!bl3) break block45;
                            ++n17;
                            break block46;
                        }
                        bl3 = TextUtils.isEmpty((CharSequence)object2);
                        if (!bl3) {
                            string3 = ", ";
                            object2 = Ft2.a((String)object2, string3);
                        }
                        object3 = hv3_0.u((String)object3);
                        object2 = Ft2.a((String)object2, (String)object3);
                        if (n15 != n17) break block46;
                    }
                    string2 = object2;
                    break;
                }
                ++n15;
            }
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText((CharSequence)string2);
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

