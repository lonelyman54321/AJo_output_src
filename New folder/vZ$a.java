/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class vZ$a
extends Lambda
implements Function0 {
    public final /* synthetic */ vZ c;

    public vZ$a(vZ vZ2) {
        this.c = vZ2;
        super(0);
    }

    public final Object invoke() {
        Function0 function0 = this.c.I;
        if (function0 != null) {
            function0.invoke();
        }
        return Boolean.TRUE;
    }
}

