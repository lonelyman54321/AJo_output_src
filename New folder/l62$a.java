/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l62$a
extends Lambda
implements Function1 {
    public final /* synthetic */ l62 c;

    public l62$a(l62 l622) {
        this.c = l622;
        super(1);
    }

    public final Object invoke(Object object) {
        l62 l622 = this.c;
        object = object == l622 ? "(this)" : String.valueOf(object);
        return object;
    }
}

