/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jf3
 */
public final class jf3_1
extends ArrayAdapter {
    public String a;
    public hf3$a b;

    public final View getView(int n3, View view, ViewGroup object) {
        View view2;
        int n4;
        int n7;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(object, string2);
        NavImpl navImpl = (NavImpl)this.getItem(n3);
        if (view == null) {
            view = LayoutInflater.from((Context)this.getContext());
            n7 = R$layout.row_sub_category_sub_child;
            n4 = 0;
            view2 = null;
            view = view.inflate(n7, object, false);
            Intrinsics.checkNotNull(view);
            object = new jf3$a(view);
            view.setTag(object);
        } else {
            object = view.getTag();
            string2 = "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.SubCategoryChildAdapter.CategoryChildViewHolder";
            Intrinsics.checkNotNull(object, string2);
            object = (jf3$a)object;
        }
        string2 = object.c;
        n4 = 8;
        string2.setVisibility(n4);
        n7 = navImpl instanceof LinkDetail;
        view2 = object.b;
        if (n7 != 0) {
            navImpl = (LinkDetail)navImpl;
            px3.a((LinkDetail)navImpl);
            string2 = ((LinkDetail)navImpl).getLinkName();
            if (view2 != null) {
                if3_1 if3_12 = new if3_1(this, string2, (LinkDetail)navImpl);
                view2.setOnClickListener((View.OnClickListener)if3_12);
            }
        } else if (navImpl != null && (n7 = navImpl instanceof Navigation) != 0) {
            string2 = ((Navigation)navImpl).getName();
            n3 = 0;
            navImpl = null;
            view2.setOnClickListener(null);
        } else {
            string2 = "";
        }
        object.a.setText(string2);
        return view;
    }
}

