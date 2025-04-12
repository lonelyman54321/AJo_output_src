/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class pr1$d
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;

    public pr1$d(int n3) {
        this.c = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((pr1$a)object).a;
        int n4 = this.c;
        return n3 - n4;
    }
}

