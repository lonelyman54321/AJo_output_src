/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c0
 */
public final class c0_0
extends RecyclerView$B {
    public final View a;

    public c0_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.aw_divider;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        this.a = view;
    }
}

