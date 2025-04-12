/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XD1
 */
public final class xd1_0
extends iq_0 {
    public final void Qa(View view) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "view");
        int n3 = R$id.category_facet_title_tv;
        this.j = textView = (TextView)view.findViewById(n3);
        n3 = R$id.category_filter_parent_view;
        textView = view.findViewById(n3);
        this.b = textView;
        n3 = R$id.category_cancel_view;
        textView = view.findViewById(n3);
        this.c = textView;
        n3 = R$id.category_cancel_iv;
        textView = (ImageView)view.findViewById(n3);
        this.d = textView;
        n3 = R$id.category_facet_view_all_tv;
        this.e = textView = (TextView)view.findViewById(n3);
        n3 = R$id.filter_view_cancel_tv;
        this.f = textView = (TextView)view.findViewById(n3);
        n3 = R$id.filter_view_apply_filter_tv;
        view = (TextView)view.findViewById(n3);
        this.g = view;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_category_filter_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

