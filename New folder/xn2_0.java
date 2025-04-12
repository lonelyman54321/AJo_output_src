/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XN2
 */
public final class xn2_0
extends RecyclerView$f {
    public final ArrayList a;
    public final ArrayList b;
    public final HN2 c;
    public final ArrayList d;

    public xn2_0(ArrayList arrayList, ArrayList arrayList2, HN2 hN2, ArrayList arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "imageUrls");
        Intrinsics.checkNotNullParameter(arrayList2, "productIds");
        Intrinsics.checkNotNullParameter(arrayList3, "storeList");
        this.a = arrayList;
        this.b = arrayList2;
        this.c = hN2;
        this.d = arrayList3;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2;
        boolean bl2;
        recyclerView$B = (zn2_1)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        String string3 = (String)this.a.get(n3);
        String string4 = (String)this.b.get(n3);
        String string5 = (String)this.d.get(n3);
        recyclerView$B.getClass();
        Object object = new da$a();
        ((da$a)object).k = bl2 = true;
        ((da$a)object).r = bl2;
        ((da$a)object).p = string2 = hv3_0.K(R$string.product_image);
        string2 = hv3_0.K(R$string.acc_banner);
        ((da$a)object).b(string2);
        ((da$a)object).n = string3;
        string3 = ((zn2_1)recyclerView$B).b;
        ((da$a)object).u = string3;
        ((da$a)object).a();
        object = new yn2_0((zn2_1)recyclerView$B, string4, string5);
        string3.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "viewGroup");
        int n4 = R$layout.item_cc_image_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        HN2 hN2 = this.c;
        object = new zn2_1((View)viewGroup, hN2);
        return object;
    }
}

