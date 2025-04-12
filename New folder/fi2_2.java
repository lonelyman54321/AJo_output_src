/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fi2
 */
public final class fi2_2
extends RecyclerView$B {
    public final View a;
    public final mf1_0 b;
    public final RecyclerView c;

    public fi2_2(View object, mf1_0 mf1_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(mf1_02, "luxeFooterClickListener");
        super((View)object);
        this.a = object;
        this.b = mf1_02;
        Intrinsics.checkNotNullParameter(object, "itemView");
        int n3 = R$id.pdp_footer_links_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
    }
}

