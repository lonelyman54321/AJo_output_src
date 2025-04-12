/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class eC1$d
extends Lambda
implements Function0 {
    public final /* synthetic */ ec1_0 c;

    public eC1$d(ec1_0 ec1_02) {
        this.c = ec1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        QB1 qB1 = (QB1)this.c.b.getValue();
        if (qB1 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            qB1 = null;
        }
        return bl2;
    }
}

