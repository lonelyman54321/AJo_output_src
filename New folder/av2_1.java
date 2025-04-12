/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Av2
 */
public final class av2_1
extends RecyclerView$B {
    public final yv2_1 a;
    public final RelativeLayout b;

    public av2_1(View view, yv2_1 yv2_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(yv2_12, "filterClickListener");
        super(view);
        this.a = yv2_12;
        int n3 = R$id.root_rl;
        view = (RelativeLayout)view.findViewById(n3);
        this.b = view;
    }
}

