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
import com.ril.ajio.services.data.Facet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PD1
 */
public final class pd1_1
extends fB {
    public final void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.brand_facet_value_no_result_tv;
        Object object2 = (TextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.brand_facet_value_row_search_et;
        object2 = (EditText)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.brand_facet_value_row_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        object2 = this.requireActivity();
        int n4 = 1;
        Object object3 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Pa();
        n3 = 0;
        object2 = null;
        if ((object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getValues() : null) != null) {
            object = this.Pa();
            object = object != null ? ((F12)object).d : null;
            Intrinsics.checkNotNull(object);
            object = ((bv2_0)object).X;
            if (object != null) {
                object2 = ((Facet)object).getValues();
            }
            this.f = object2;
            Intrinsics.checkNotNull(object2);
            this.f = object = fB.Ra((ArrayList)object2);
            object2 = this.c;
            if (object2 != null) {
                object = ImmutableList.copyOf((Collection)object);
                Intrinsics.checkNotNullExpressionValue(object, "copyOf(...)");
                object3 = this.Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.R;
                Object object4 = this.Pa();
                Intrinsics.checkNotNull(object4);
                object4 = ((F12)object4).d.S;
                Intrinsics.checkNotNullParameter(object, "facetValueList");
                Intrinsics.checkNotNullParameter(object3, "userSelectedFacetValues");
                Intrinsics.checkNotNullParameter(object4, "userDeselectedFacetValues");
                String string2 = "facetValueClickListener";
                Intrinsics.checkNotNullParameter(this, string2);
                od1_1 od1_12 = new za_0((ImmutableList)object, (HashMap)object3, (HashMap)object4, this);
                ((RecyclerView)object2).setAdapter(od1_12);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_brand_facet_value_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

