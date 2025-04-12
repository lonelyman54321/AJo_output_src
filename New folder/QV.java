/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.graphics.a;
import androidx.navigation.n;
import androidx.navigation.n$a;
import androidx.navigation.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class QV {
    public static final LP1 a(LP1 lP1, i13 i132) {
        return a.b(lP1, 0.0f, 0.0f, 0.0f, 0.0f, i132, true, 124927);
    }

    public static final LP1 b(LP1 lP1) {
        return a.b(lP1, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final n c(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "optionsBuilder");
        o o3 = new o();
        object.invoke(o3);
        int n3 = o3.b;
        n$a n$a = o3.a;
        n$a.a = n3;
        n$a.b = n3 = o3.c;
        object = o3.e;
        if (object != null) {
            boolean bl2 = o3.f;
            boolean bl3 = o3.g;
            n$a.d = object;
            n$a.c = n3 = -1;
            n$a.e = bl2;
            n$a.f = bl3;
        } else {
            n3 = o3.d;
            boolean bl4 = o3.f;
            boolean bl5 = o3.g;
            n$a.c = n3;
            n3 = 0;
            object = null;
            n$a.d = null;
            n$a.e = bl4;
            n$a.f = bl5;
        }
        return n$a.a();
    }
}

