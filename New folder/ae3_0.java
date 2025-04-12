/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.viewmodel.R$id;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from aE3
 */
public final class ae3_0 {
    public static final sD3 a(View object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ez2_1.d(aE3$a.c, object);
        aE3$b aE3$b = aE3$b.c;
        return (sD3)kz2_1.g(kz2_1.j((Sequence)object, aE3$b));
    }

    public static final void b(View view, sD3 sD32) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int n3 = R$id.view_tree_view_model_store_owner;
        view.setTag(n3, (Object)sD32);
    }
}

