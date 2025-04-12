/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.savedstate.R$id;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class ZD3 {
    public static final zs2_1 a(View object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ez2_1.d(zd3$a_0.c, object);
        zd3$b_0 zd3$b_0 = zd3$b_0.c;
        return (zs2_1)kz2_1.g(kz2_1.j((Sequence)object, zd3$b_0));
    }

    public static final void b(View view, zs2_1 zs2_12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int n3 = R$id.view_tree_saved_state_registry_owner;
        view.setTag(n3, (Object)zs2_12);
    }
}

