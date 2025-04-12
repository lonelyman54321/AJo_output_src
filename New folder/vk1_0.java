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
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vk1
 */
public final class vk1_0
extends RecyclerView$f {
    public static final vk1$a Companion;
    public final LinkedHashMap a;
    public final String b;

    static {
        vk1$a vk1$a;
        Companion = vk1$a = new Object();
    }

    public vk1_0(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "data");
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "itemType");
        this.a = linkedHashMap;
        this.b = string2;
    }

    public final int getItemCount() {
        return ((AbstractMap)this.a).size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        float f5;
        recyclerView$B = (vk1$b)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        Object object2 = ((LinkedHashMap)object).keySet();
        String string2 = "<get-keys>(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (String)CollectionsKt.I((Iterable)object2, n3);
        Iterable<Object> iterable = ((LinkedHashMap)object).keySet();
        Intrinsics.checkNotNullExpressionValue(iterable, string2);
        iterable = iterable;
        Object object3 = CollectionsKt.I(iterable, n3);
        object3 = (String)((LinkedHashMap)object).get(object3);
        object = ((vk1$b)recyclerView$B).b;
        object.setText((CharSequence)object2);
        if (object3 != null) {
            f5 = Float.parseFloat((String)object3);
        } else {
            n3 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        object3 = qz2_0.u(f5);
        ((vk1$b)recyclerView$B).c.setText((CharSequence)object3);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        String string2 = this.b;
        Object object = "horizontal";
        n3 = (int)(Intrinsics.areEqual(string2, object) ? 1 : 0);
        n3 = n3 != 0 ? R$layout.row_item_price_horizontal : R$layout.row_item_price_view;
        viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(n3, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = new vk1$b((View)viewGroup);
        return object;
    }
}

