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

/*
 * Renamed from xe1
 */
public final class xe1_0
extends RecyclerView$B {
    public final TextView a;

    public xe1_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.tv_title;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.a = view;
    }
}

