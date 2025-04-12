/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;

public final class JI0
extends RecyclerView$B {
    public final TextView a;

    public JI0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.brand_facet_value_title_row_tv;
        view = (TextView)view.findViewById(n3);
        this.a = view;
    }

    public final void w(Facet object) {
        Intrinsics.checkNotNullParameter(object, "facet");
        TextView textView = this.a;
        object = ((Facet)object).getName();
        textView.setText((CharSequence)object);
    }
}

