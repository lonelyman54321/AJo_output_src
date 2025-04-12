/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nw
 */
public abstract class nw_1
extends RecyclerView$B {
    public nw_1(View view) {
        Intrinsics.checkNotNull(view);
        super(view);
    }

    public abstract void w(List var1, List var2, int var3);
}

