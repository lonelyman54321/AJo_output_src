/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class SD2
implements Function1 {
    public final Object invoke(Object object) {
        object = (DataCallback)object;
        object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a("Successfully deleted images list", objectArray);
        return Unit.a;
    }
}

