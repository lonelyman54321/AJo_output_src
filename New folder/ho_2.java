/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HO
 */
public final class ho_2
extends RecyclerView$B {
    public final j82_0 a;

    public ho_2(View view, j82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "onCartClickListener");
        super(view);
        this.a = object;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.priceDropCloseIv;
        view = view.findViewById(n3);
        object = new go_1(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

