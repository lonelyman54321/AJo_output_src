/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class eC1$c
extends Lambda
implements Function0 {
    public final /* synthetic */ ec1_0 c;

    public eC1$c(ec1_0 ec1_02) {
        this.c = ec1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        QB1 qB1 = (QB1)((ec1_0)object).b.getValue();
        if (qB1 == null && (object = (Throwable)((ec1_0)object).c.getValue()) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

