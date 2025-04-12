/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TD1
 */
public final class td1_0
extends vp_1 {
    public final void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.category_facet_subtitle_no_result_tv;
        Object object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.category_facet_subtitle_row_title_layout;
        object2 = object.findViewById(n3);
        this.b = object2;
        n3 = R$id.category_facet_subtitle_row_search_et;
        object2 = (EditText)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.category_facet_subtitle_row_search_layout;
        object2 = object.findViewById(n3);
        this.d = object2;
        n3 = R$id.category_facet_subtitle_row_clear_tv;
        object2 = (TextView)object.findViewById(n3);
        n3 = R$id.category_facet_subtitle_row_title_tv;
        object2 = (TextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.category_facet_subtitle_row_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.f = object;
        object2 = this.requireActivity();
        int n4 = 1;
        Object object3 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.f;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Pa();
        n3 = 0;
        object2 = null;
        object = object != null && (object = ((F12)object).d) != null ? ((bv2_0)object).Z : null;
        if (object != null && (object = this.f) != null) {
            object3 = this.Pa();
            if (object3 != null) {
                object2 = ((F12)object3).d;
            }
            Intrinsics.checkNotNull(object2);
            object2 = ((bv2_0)object2).Z;
            Intrinsics.checkNotNull(object2);
            object2 = ImmutableList.copyOf((Collection)this.Ra((ArrayList)object2));
            Intrinsics.checkNotNullExpressionValue(object2, "copyOf(...)");
            object3 = this.Pa();
            Intrinsics.checkNotNull(object3);
            object3 = ((F12)object3).d.R;
            Object object4 = this.Pa();
            Intrinsics.checkNotNull(object4);
            object4 = ((F12)object4).d.S;
            Intrinsics.checkNotNullParameter(object2, "facetValueList");
            Intrinsics.checkNotNullParameter(object3, "userSelectedFacetValues");
            Intrinsics.checkNotNullParameter(object4, "userDeselectedFacetValues");
            String string2 = "facetValueClickListener";
            Intrinsics.checkNotNullParameter(this, string2);
            qd1_0 qd1_02 = new wp_1((ImmutableList)object2, (HashMap)object3, (HashMap)object4, this);
            ((RecyclerView)object).setAdapter(qd1_02);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_category_facet_subtitle_row_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

