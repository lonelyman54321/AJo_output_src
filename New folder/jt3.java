/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class jt3
extends Lambda
implements Function1 {
    public final /* synthetic */ Vo0 c;

    public jt3(Xo0 xo0) {
        super(1);
    }

    public final Object invoke(Object object) {
        object = (rv0_0)object;
        StringBuilder stringBuilder = new StringBuilder("'");
        String string2 = object.c();
        stringBuilder.append(string2);
        stringBuilder.append("' ");
        float f5 = object.b();
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

