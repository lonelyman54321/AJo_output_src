/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GF1
 */
public final class gf1_1
extends RecyclerView$f {
    public final ArrayList a;

    public gf1_1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "entryList");
        this.a = arrayList;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof hf1_0;
        if (bl2) {
            int n4;
            recyclerView$B = (hf1_0)recyclerView$B;
            Object object2 = this.a.get(n3);
            Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
            object2 = (String)object2;
            recyclerView$B.getClass();
            Intrinsics.checkNotNullParameter(object2, "url");
            bl2 = false;
            recyclerView$B = ((hf1_0)recyclerView$B).a;
            recyclerView$B.setVisibility(0);
            object = new da$a();
            ((da$a)object).k = n4 = 1;
            ((da$a)object).r = n4;
            n4 = R$string.acc_banner;
            Object object3 = hv3_0.K(n4);
            ((da$a)object).b((String)object3);
            object3 = UrlHelper.Companion.getInstance();
            object2 = ((UrlHelper)object3).getImageUrl((String)object2);
            ((da$a)object).n = object2;
            ((da$a)object).u = recyclerView$B;
            ((da$a)object).a();
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_closet_price_drop_image_row;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        hf1_0 hf1_02 = new hf1_0((View)viewGroup);
        return hf1_02;
    }
}

