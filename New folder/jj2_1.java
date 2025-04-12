/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.SpotLightAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jj2
 */
public final class jj2_1
extends RecyclerView$f {
    public final List a;

    public jj2_1(Context context, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arrayList, "spotLightAttributeList");
        this.a = arrayList;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (jj2$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = (SpotLightAttribute)this.a.get(n3);
        TextView textView = ((jj2$a)recyclerView$B).b;
        String string2 = ((SpotLightAttribute)object).getAttributeName();
        textView.setText((CharSequence)string2);
        object = ((SpotLightAttribute)object).getAttributeValue();
        ((jj2$a)recyclerView$B).c.setText((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.pdp_spot_light_layout;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = new jj2$a((View)viewGroup);
        return object;
    }
}

