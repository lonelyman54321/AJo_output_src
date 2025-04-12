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
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnChildClickListener
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.Navigation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from KD1
 */
public final class kd1_0
extends Fragment
implements FD1$a {
    public static final KD1$a Companion;
    public KD1$b a;
    public ExpandableListView b;
    public fd1_1 c;
    public String d;
    public final hh3_2 e;
    public LinkedHashMap f;
    public String g;
    public TextView h;

    static {
        KD1$a kD1$a;
        Companion = kD1$a = new Object();
    }

    public kd1_0() {
        Object object = new id1_2(this, 0);
        this.e = object = yr1_2.b((Function0)object);
    }

    public final void i(LinkDetail linkDetail) {
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.LuxSubCategoryDetailFragment.OnSubCategoryListener");
        object = (KD1$b)object;
        this.a = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            String string2;
            int n3;
            List list;
            boolean bl2;
            object = this.getArguments();
            int n4 = 33;
            boolean bl3 = true;
            String string3 = null;
            if (object != null && (bl2 = object.containsKey((String)((Object)(list = "NAVIGATION")))) == bl3) {
                boolean bl4;
                object = new LinkedHashMap();
                this.f = object;
                object = this.getArguments();
                if (object != null) {
                    n3 = Build.VERSION.SDK_INT;
                    if (n3 >= n4) {
                        object = (Parcelable)gd1_1.a((Bundle)object);
                    } else {
                        bl4 = (object = object.getParcelable((String)((Object)list))) instanceof Navigation;
                        if (!bl4) {
                            bl2 = false;
                            object = null;
                        }
                        object = (Navigation)object;
                    }
                    object = (Navigation)object;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    Object object2;
                    List list2;
                    list = ((Navigation)object).getLinkDetails();
                    object = ((Navigation)object).getChildDetails();
                    if (list != null) {
                        list = list.iterator();
                        while ((n3 = (int)(list.hasNext() ? 1 : 0)) != 0) {
                            list2 = (LinkDetail)list.next();
                            object2 = this.f;
                            if (object2 == null) continue;
                            list2 = ((AbstractMap)object2).put(list2, null);
                        }
                    }
                    if (object != null) {
                        object = object.iterator();
                        while (bl4 = object.hasNext()) {
                            list = (Navigation)object.next();
                            list2 = new List();
                            object2 = ((Navigation)((Object)list)).getLinkDetails();
                            if (object2 != null) {
                                object2 = ((Navigation)((Object)list)).getLinkDetails();
                                Intrinsics.checkNotNull(object2);
                                object2 = (Collection)object2;
                                ((ArrayList)list2).addAll(object2);
                            }
                            if ((object2 = ((Navigation)((Object)list)).getChildDetails()) != null) {
                                object2 = ((Navigation)((Object)list)).getChildDetails();
                                Intrinsics.checkNotNull(object2);
                                object2 = (Collection)object2;
                                ((ArrayList)list2).addAll(object2);
                            }
                            if ((object2 = this.f) == null) continue;
                            list = ((AbstractMap)object2).put(list, list2);
                        }
                    }
                }
            }
            if ((object = this.getArguments()) != null && (bl2 = object.containsKey((String)((Object)(list = "STORE_INFO_LIST")))) == bl3 && (object = this.getArguments()) != null) {
                n3 = Build.VERSION.SDK_INT;
                if (n3 >= n4) {
                    object = qd1_2.a((Bundle)object);
                } else {
                    n4 = (object = object.getSerializable((String)((Object)list))) instanceof ArrayList;
                    if (n4 == 0) {
                        bl2 = false;
                        object = null;
                    }
                    object = (ArrayList)object;
                }
                object = (ArrayList)object;
            }
            if ((object = this.getArguments()) != null && (bl2 = object.containsKey(string2 = "CATEGORY_NAME")) == bl3) {
                object = this.getArguments();
                if (object != null) {
                    string3 = object.getString(string2);
                }
                object = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(string3, (String)object);
                this.g = string3;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_lux_sub_category_detail;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.sub_category_expandable_list;
        object2 = (ExpandableListView)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.sub_category_child_tv;
        object2 = (TextView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.sub_category_imv_back;
        object = (ImageView)object.findViewById(n3);
        if (object != null) {
            string2 = null;
            object2 = new hd1_1(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.g) != null && !(bl2 = kotlin.text.b.k((CharSequence)object))) {
            object = this.h;
            if (object != null) {
                object2 = this.g;
                object.setText((CharSequence)object2);
            }
        } else {
            object = this.h;
            if (object != null) {
                object2 = "";
                object.setText((CharSequence)object2);
            }
        }
        object2 = this.f;
        string2 = this.g;
        object = new fd1_1(this, (LinkedHashMap)object2, string2);
        this.c = object;
        object = this.b;
        n3 = 0;
        object2 = null;
        string2 = "expandableListView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object = null;
        }
        Object object3 = this.c;
        object.setAdapter((ExpandableListAdapter)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object = null;
        }
        object3 = new jd1_0(this);
        object.setOnGroupClickListener((ExpandableListView.OnGroupClickListener)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object = new Object();
        object2.setOnChildClickListener((ExpandableListView.OnChildClickListener)object);
    }
}

