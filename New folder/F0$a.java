/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class F0$a
extends Lambda
implements Function1 {
    public final /* synthetic */ f0_0 c;

    public F0$a(f0_0 f0_02) {
        this.c = f0_02;
        super(1);
    }

    public final CharSequence a(Object object) {
        f0_0 f0_02 = this.c;
        object = object == f0_02 ? "(this Collection)" : String.valueOf(object);
        return object;
    }
}

