/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class eC1$b
extends Lambda
implements Function0 {
    public final /* synthetic */ ec1_0 c;

    public eC1$b(ec1_0 ec1_02) {
        this.c = ec1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Throwable throwable = (Throwable)this.c.c.getValue();
        if (throwable != null) {
            bl2 = true;
        } else {
            bl2 = false;
            throwable = null;
        }
        return bl2;
    }
}

