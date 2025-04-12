/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class rt1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ iS2 c;

    public rt1$a(iS2 iS22) {
        this.c = iS22;
        super(1);
    }

    public final Object invoke(Object object) {
        iS2 iS22 = this.c;
        boolean bl2 = iS22 != null ? iS22.a(object) : true;
        return bl2;
    }
}

