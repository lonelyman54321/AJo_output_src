/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jG2
 */
public abstract class jg2_0
extends RecyclerView$B {
    public final View a;

    public jg2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
    }

    public abstract void w(int var1, Object var2);
}

