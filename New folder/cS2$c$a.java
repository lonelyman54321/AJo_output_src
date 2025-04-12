/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class cS2$c$a
extends Lambda
implements Function1 {
    public final /* synthetic */ cs2_1 c;

    public cS2$c$a(cs2_1 cs2_12) {
        this.c = cs2_12;
        super(1);
    }

    public final Object invoke(Object object) {
        iS2 iS22 = this.c.c;
        boolean bl2 = iS22 != null ? iS22.a(object) : true;
        return bl2;
    }
}

