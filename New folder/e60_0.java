/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e60
 */
public final class e60_0 {
    public static final e60_0 a;

    static {
        e60_0 e60_02;
        a = e60_02 = new Object();
    }

    public static final LP1 a(PA object) {
        Intrinsics.checkNotNullParameter(LP1$a.b, "<this>");
        Intrinsics.checkNotNullParameter(object, "boxConstraints");
        float f5 = object.f();
        float f6 = object.c();
        LP1 lP1 = j.l(f5, f6);
        f6 = object.g();
        float f7 = object.d();
        object = j.e(f6, f7);
        return kp1_0.a((up1_0)lP1, (LP1)object);
    }

    public static final LP1 b(LP1 lP1, float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object != false) {
            int n3 = 130815;
            lP1 = androidx.compose.ui.graphics.a.b(lP1, 0.0f, 0.0f, 0.0f, f5, null, false, n3);
        }
        return lP1;
    }
}

