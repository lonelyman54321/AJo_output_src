/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

public final class a30$b
extends Lambda
implements Function2 {
    public final /* synthetic */ b30_0 c;

    public a30$b(b30_0 b30_02) {
        this.c = b30_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (LP1)object;
        int n3 = (object2 = (LP1$b)object2) instanceof Z20;
        if (n3 != 0) {
            object2 = ((Z20)object2).c;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            n3 = 3;
            object2 = (gx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object2, n3);
            LP1$a lP1$a = LP1$a.b;
            Integer n4 = 0;
            b30_0 b30_02 = this.c;
            object2 = (LP1)object2.invoke(lP1$a, b30_02, n4);
            object2 = a30_0.b(b30_02, (LP1)object2);
        }
        return object.then((LP1)object2);
    }
}

