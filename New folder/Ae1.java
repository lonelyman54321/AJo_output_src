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
import kotlin.jvm.internal.Intrinsics;

public final class Ae1
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;

    public Ae1(View view) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.tv_title_plp_header_is;
        this.a = textView = (TextView)view.findViewById(n3);
        n3 = R$id.tv_count_plp_header_is;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }
}

