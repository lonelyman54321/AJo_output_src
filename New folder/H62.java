/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class H62 {
    public static final void a(LP1$c object, Function0 function0) {
        Object object2;
        i62_0 i62_02 = ((LP1$c)object).g;
        if (i62_02 == null) {
            object2 = object;
            object2 = (G62)object;
            ((LP1$c)object).g = i62_02 = new i62_0((G62)object2);
        }
        object = go0.g((fo0)object).getSnapshotObserver();
        object2 = i62_0.b;
        ((ch2)object).a(i62_02, (Function1)object2, function0);
    }
}

