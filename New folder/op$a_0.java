/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oP$a
 */
public final class op$a_0
extends RecyclerView$s {
    public final /* synthetic */ op_2 a;

    public op$a_0(op_2 op_22) {
        this.a = op_22;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 == 0) {
            object = this.a;
            ArrayList arrayList = ((op_2)object).l;
            ((op_2)object).w(arrayList);
        }
    }
}

