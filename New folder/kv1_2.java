/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ProgressBar
 */
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kv1
 */
public final class kv1_2
extends RecyclerView$B {
    public final jv1_2 a;
    public final ProgressBar b;

    public kv1_2(View view, jv1_2 jv1_22) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = jv1_22;
        int n3 = R$id.loadMore;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (ProgressBar)view;
        this.b = view;
    }
}

