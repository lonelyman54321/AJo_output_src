/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from T63
 */
public final class t63_0
implements Runnable {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ List c;

    public /* synthetic */ t63_0(O63 o63, RecyclerView recyclerView, ArrayList arrayList) {
        this.a = o63;
        this.b = recyclerView;
        this.c = arrayList;
    }

    public final void run() {
        O63 o63 = this.a;
        Intrinsics.checkNotNullParameter(o63, "this$0");
        RecyclerView recyclerView = this.b;
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        ArrayList arrayList = (ArrayList)this.c;
        O63.b(o63, recyclerView, arrayList);
    }
}

