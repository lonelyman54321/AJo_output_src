/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class dy2 {
    public static hy2_0 a(String string2, cj2_0 cj2_02) {
        Object object = ir0_2.a;
        object = em0_2.b;
        Object object2 = be_1.a();
        object = d.a(((a)object).plus((CoroutineContext)object2));
        Intrinsics.checkNotNullParameter(string2, "name");
        cy2_2 cy2_22 = cy2_2.c;
        Intrinsics.checkNotNullParameter(cy2_22, "produceMigrations");
        Intrinsics.checkNotNullParameter(object, "scope");
        object2 = new hy2_0(string2, cj2_02, cy2_22, (i90_0)object);
        return object2;
    }
}

