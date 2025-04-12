/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.skydoves.balloon.Balloon;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U63
 */
public final class u63_0
extends RecyclerView$s {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ List b;

    public u63_0(O63 o63, ArrayList arrayList) {
        this.a = o63;
        this.b = arrayList;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        Object object = "recyclerView";
        Intrinsics.checkNotNullParameter(recyclerView, (String)object);
        if (n3 == 0) {
            object = this.a;
            boolean bl2 = ((O63)object).T;
            if (!bl2) {
                ArrayList arrayList = (ArrayList)this.b;
                t63_0 t63_02 = new t63_0((O63)object, recyclerView, arrayList);
                recyclerView.post(t63_02);
            }
        }
        super.onScrollStateChanged(recyclerView, n3);
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        Object object2;
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        object = this.a;
        n3 = (int)(((O63)object).T ? 1 : 0);
        if (n3 != 0 && (n4 = (int)((object2 = ((O63)object).a).c7() ? 1 : 0)) != 0 && (n4 = (int)(gv_1.b ? 1 : 0)) != 0) {
            int n7;
            object2 = object2.o5();
            Intrinsics.checkNotNullParameter(object2, "storeId");
            n3 = (int)(h40_0.t2((String)object2) ? 1 : 0);
            if (n3 != 0 && (object2 = gv_1.a) != null && (n4 = (int)(((Balloon)object2).f ? 1 : 0)) == (n7 = 1)) {
                ((Balloon)object2).h();
            }
            n3 = 0;
            object2 = null;
            ((O63)object).T = false;
        }
    }
}

