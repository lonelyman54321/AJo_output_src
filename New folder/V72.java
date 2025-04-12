/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

public final class V72 {
    public boolean a;
    public final le_2 b;
    public final mb3_2 c;

    public V72(c80 i90_02, boolean bl2, Function2 function2, W72 w72) {
        this.a = bl2;
        Object object = he_2.SUSPEND;
        object = sr_2.a(-2, 4, object);
        this.b = object;
        super(w72, function2, this, null);
        i90_02 = Ae3.d(i90_02, null, null, (Function2)object, 3);
        this.c = i90_02;
    }

    public final void a() {
        CancellationException cancellationException = new CancellationException("onBack cancelled");
        this.b.k(cancellationException, true);
        this.c.d(null);
    }
}

