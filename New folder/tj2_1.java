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
 * Renamed from Tj2
 */
public final class tj2_1
extends RecyclerView$B {
    public final yv2_1 a;
    public final RecyclerView b;
    public final RecyclerView c;

    public tj2_1(View object, yv2_1 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "filterClickListener");
        super((View)object);
        this.a = object2;
        int n3 = R$id.quick_filters_rv;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.b = object2 = (RecyclerView)object2;
        n3 = R$id.selected_quick_filters_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (RecyclerView)object;
        this.c = object;
    }
}

