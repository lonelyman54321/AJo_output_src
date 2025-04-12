/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class tv0$f
extends Lambda
implements Function0 {
    public final /* synthetic */ rq1_2 c;

    public tv0$f(rq1_2 rq1_22) {
        this.c = rq1_22;
        super(0);
    }

    public final Object invoke() {
        Object object = (sD3)this.c.getValue();
        boolean bl2 = object instanceof f;
        object = bl2 ? (f)object : null;
        object = object != null ? object.getDefaultViewModelCreationExtras() : Wd0$a.b;
        return object;
    }
}

