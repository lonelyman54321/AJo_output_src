/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from L13
 */
public final class l13_0
implements Function1 {
    public final Object invoke(Object object) {
        object = (Throwable)object;
        yn3$a yn3$a = yn3_0.a;
        Object[] objectArray = new StringBuilder("Share exception..");
        objectArray.append(object);
        object = objectArray.toString();
        objectArray = new Object[]{};
        yn3$a.d((String)object, objectArray);
        return Unit.a;
    }
}

