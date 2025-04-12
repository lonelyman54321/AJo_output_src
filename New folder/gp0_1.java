/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GP0
 */
public final class gp0_1 {
    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void b(Function0 function0, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(function0, "callback");
        l l2 = nu1_0.a(fragment);
        fp0_1 fp0_12 = new fp0_1(fragment, function0, null);
        Ae3.d(l2, null, null, fp0_12, 3);
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }
}

