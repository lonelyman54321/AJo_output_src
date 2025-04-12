/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class T71 {
    public static final void a(FragmentManager fragmentManager, Function2 function2, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(function2, "getCommitFunction");
        int n4 = 725075815;
        object = object.g(n4);
        Object object2 = j.c;
        long l2 = nz_1.a;
        fG2$a fG2$a = fg2_1.a;
        LP1 lP1 = a.b((LP1)object2, l2, fG2$a);
        object2 = new T71$a(fragmentManager, function2);
        u10 u102 = v10.c(454106173, (fx0_2)object2, (b30_0)object);
        fG2$a = null;
        int n7 = 3078;
        int n8 = 6;
        OA.a(lP1, null, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new s71_0(fragmentManager, function2, n3);
        }
    }
}

