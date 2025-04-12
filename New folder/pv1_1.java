/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pv1
 */
public abstract class pv1_1
extends RecyclerView$f {
    public Ov1 a;

    public static boolean g(Ov1 ov1) {
        boolean bl2;
        String string2 = "loadState";
        Intrinsics.checkNotNullParameter(ov1, string2);
        boolean bl3 = ov1 instanceof Ov1$b;
        if (!bl3 && !(bl2 = ov1 instanceof Ov1$a)) {
            bl2 = false;
            ov1 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int getItemCount() {
        return (int)(pv1_1.g(this.a) ? 1 : 0);
    }

    public final int getItemViewType(int n3) {
        Intrinsics.checkNotNullParameter(this.a, "loadState");
        return 0;
    }

    public abstract void h(RecyclerView$B var1, Ov1 var2);

    public abstract zl2_1 i(ViewGroup var1, Ov1 var2);

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Ov1 ov1 = this.a;
        this.h(recyclerView$B, ov1);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Ov1 ov1 = this.a;
        return this.i(viewGroup, ov1);
    }
}

