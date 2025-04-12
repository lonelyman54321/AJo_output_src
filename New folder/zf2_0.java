/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zf2
 */
public final class zf2_0
extends RecyclerView$s {
    public final /* synthetic */ b a;

    public zf2_0(b b2) {
        this.a = b2;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 != 0) {
            object = this.a;
            n3 = (int)(((b)object).L ? 1 : 0);
            if (n3 != 0) {
                ((b)object).Pa();
            }
        }
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        object = this.a;
        object.getClass();
        n3 = 20;
        if (n4 > n3) {
            n3 = 1;
            ((b)object).L = n3;
        }
    }
}

