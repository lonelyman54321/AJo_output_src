/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.databinding.RtoImageRowBinding;
import kotlin.jvm.internal.Intrinsics;

public final class xQ2
extends RecyclerView$B {
    public final RtoImageRowBinding a;

    public xQ2(RtoImageRowBinding rtoImageRowBinding) {
        Intrinsics.checkNotNullParameter(rtoImageRowBinding, "binding");
        View view = rtoImageRowBinding.getRoot();
        super(view);
        this.a = rtoImageRowBinding;
    }
}

