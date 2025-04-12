/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Z53
extends Lambda
implements Function2 {
    public static final Z53 c;

    static {
        Z53 z53;
        c = z53 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (X53$a)object;
        object2 = (Throwable)object2;
        String string2 = "msg";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof X53$a$b;
        if (bl2) {
            object = ((X53$a$b)object).b;
            if (object2 == null) {
                string2 = "DataStore scope was cancelled before updateData could complete";
                object2 = new CancellationException(string2);
            }
            object.c((Throwable)object2);
        }
        return Unit.a;
    }
}

