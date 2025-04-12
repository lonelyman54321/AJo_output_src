/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class H71
implements Runnable {
    public final /* synthetic */ i71_0 a;

    public /* synthetic */ H71(i71_0 i71_02) {
        this.a = i71_02;
    }

    public final void run() {
        int n3;
        int n4;
        i71_0 i71_02 = this.a;
        Intrinsics.checkNotNullParameter(i71_02, "this$0");
        Object object = i71_02.d;
        if (object != null) {
            n4 = i71_02.g;
            object = (UserUnratedItem)((ArrayList)object).remove(n4);
        }
        if ((object = i71_02.f) != null) {
            n4 = i71_02.g;
            ((RecyclerView$f)object).notifyItemRemoved(n4);
        }
        i71_02.j = n3 = 1;
        object = i71_02.c;
        if (object != null) {
            n4 = 8;
            object.setVisibility(n4);
        }
        n3 = i71_02.o;
        i71_02.Pa(n3);
    }
}

