/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UZ
 */
public final class uz_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (pj0_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((pj0_2)object).Ta();
                return;
            }
            case 0: 
        }
        object = (e00)object;
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((e00)object).v;
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }
}

