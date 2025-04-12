/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ca2
 */
public final class ca2_1
extends ArrayAdapter {
    public ca2_1(Context context, int n3, List list, ms1_2 ms1_22) {
        Intrinsics.checkNotNullParameter(list, "objList");
        Intrinsics.checkNotNullParameter(ms1_22, "myAccountAdapterClickListener");
        Intrinsics.checkNotNull(context);
        super(context, n3, list);
    }

    public final View getView(int n3, View object, ViewGroup viewGroup) {
        Object object2;
        int n4;
        Object object3 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object3);
        Object object4 = (NavImpl)this.getItem(n3);
        boolean bl2 = object4 instanceof LinkDetail;
        AjioTextView ajioTextView = null;
        if (!bl2 && (n4 = object4 instanceof v92_0) == 0) {
            viewGroup = object;
            object = null;
        } else {
            object = new Object();
            object2 = LayoutInflater.from((Context)this.getContext());
            int n7 = R$layout.row_myaccount_list_refresh;
            viewGroup = object2.inflate(n7, viewGroup, false);
            n4 = R$id.feature_name;
            object2 = (AjioTextView)viewGroup.findViewById(n4);
            object.a = object2;
            n4 = R$id.tv_new_tag;
            object2 = (AjioTextView)viewGroup.findViewById(n4);
            object.b = object2;
            n4 = R$id.feature_info;
            object2 = (AjioTextView)viewGroup.findViewById(n4);
            object.c = object2;
        }
        if (bl2) {
            if (object != null && (object = object.a) != null) {
                object4 = ((LinkDetail)object4).getLinkName();
                object.setText((CharSequence)object4);
            }
        } else {
            bl2 = object4 instanceof v92_0;
            if (bl2) {
                if (object != null && (object3 = object.a) != null) {
                    object2 = object4;
                    object2 = ((v92_0)object4).b;
                    object3.setText((CharSequence)object2);
                }
                object4 = (v92_0)object4;
                bl2 = ((v92_0)object4).c;
                n4 = 8;
                if (bl2) {
                    if (object != null && (object3 = object.b) != null) {
                        object3.setVisibility(0);
                    }
                } else if (object != null && (object3 = object.b) != null) {
                    object3.setVisibility(n4);
                }
                if (object != null) {
                    ajioTextView = object.c;
                }
                if (ajioTextView != null) {
                    object4 = ((v92_0)object4).d;
                    bl2 = TextUtils.isEmpty((CharSequence)object4);
                    if (!bl2) {
                        object3 = object.c;
                        if (object3 != null) {
                            object3.setText((CharSequence)object4);
                        }
                        if ((object4 = object.c) != null) {
                            object4.setVisibility(0);
                        }
                    } else {
                        object4 = object.c;
                        if (object4 != null) {
                            object4.setVisibility(n4);
                        }
                    }
                }
            }
        }
        Intrinsics.checkNotNull(viewGroup);
        return viewGroup;
    }
}

