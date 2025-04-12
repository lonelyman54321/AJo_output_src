/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sW
 */
public final class sw_2
extends RecyclerView$B
implements View.OnClickListener {
    public final p82_0 a;
    public final TextView b;
    public final TextView c;
    public final RecyclerView d;

    public sw_2(View object, p82_0 p82_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(p82_02, "onClosetListProductClickListener");
        super((View)object);
        this.a = p82_02;
        int n3 = R$id.tv_merge_oos_label;
        p82_02 = (TextView)object.findViewById(n3);
        this.b = p82_02;
        n3 = R$id.tv_merge_oos_message;
        p82_02 = (TextView)object.findViewById(n3);
        this.c = p82_02;
        n3 = R$id.merge_oos_product_list;
        object = (RecyclerView)object.findViewById(n3);
        this.d = object;
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.iv_close;
        if (n3 == n4) {
            object = this.a;
            object.G7();
        }
    }

    public final void w(ArrayList object) {
        Object object2 = "listImages";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = og1_1.d();
        RecyclerView recyclerView = this.d;
        if (n3 != 0) {
            object2 = new gf1_1((ArrayList)object);
            Context context = this.itemView.getContext();
            object = new LinearLayoutManager(context, 0, false);
            recyclerView.setLayoutManager((RecyclerView$o)object);
            recyclerView.setAdapter((RecyclerView$f)object2);
        } else {
            object2 = hv3_0.K(R$string.pricedrop_closet);
            this.b.setText((CharSequence)object2);
            n3 = R$string.pricedrop_closet_message;
            object2 = hv3_0.K(n3);
            this.c.setText((CharSequence)object2);
            object2 = new zy2_1((ArrayList)object);
            Context context = this.itemView.getContext();
            object = new LinearLayoutManager(context, 0, false);
            recyclerView.setLayoutManager((RecyclerView$o)object);
            boolean bl2 = true;
            recyclerView.setHasFixedSize(bl2);
            recyclerView.setAdapter((RecyclerView$f)object2);
        }
    }
}

