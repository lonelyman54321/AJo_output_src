/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.runtime.R$id;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class VD3 {
    public static final mu1_1 a(View object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ez2_1.d(VD3$a.c, object);
        VD3$b vD3$b = VD3$b.c;
        return (mu1_1)kz2_1.g(kz2_1.j((Sequence)object, vD3$b));
    }

    public static final void b(View view, mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int n3 = R$id.view_tree_lifecycle_owner;
        view.setTag(n3, (Object)mu1_12);
    }
}

