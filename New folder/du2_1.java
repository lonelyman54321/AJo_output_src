/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Du2
 */
public final class du2_1
extends RecyclerView$B {
    public final yv2_1 a;
    public final ImageView b;
    public final TextView c;

    public du2_1(View view, yv2_1 yv2_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(yv2_12, "filterClickListener");
        super(view);
        this.a = yv2_12;
        int n3 = R$id.filter_icon_iv;
        yv2_12 = (ImageView)view.findViewById(n3);
        this.b = yv2_12;
        n3 = R$id.filter_name_tv;
        view = (TextView)view.findViewById(n3);
        this.c = view;
    }
}

