/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class QY1$b
implements fs0_2 {
    public static final QY1$b a;

    static {
        QY1$b qY1$b;
        a = qY1$b = new Object();
    }

    public final Object emit(Object object, f80_0 objectArray) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        objectArray = null;
        if (bl2) {
            object = yn3_0.a;
            String string2 = "Closet sync completed";
            objectArray = new Object[]{};
            ((yn3$a)object).a(string2, objectArray);
        } else {
            object = yn3_0.a;
            String string3 = "Error in sync closet products";
            objectArray = new Object[]{};
            ((yn3$a)object).a(string3, objectArray);
        }
        return Unit.a;
    }
}

