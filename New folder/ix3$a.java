/*
 * Decompiled with CFR 0.152.
 */
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class ix3$a
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef c;

    public ix3$a(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(0);
    }

    public final Object invoke() {
        ((HttpsURLConnection)this.c.element).disconnect();
        return Unit.a;
    }
}

