/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class K21$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Function0 c;

    public K21$b(Function0 function0) {
        this.c = function0;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        object = object.invoke();
        try {
            object = (List)object;
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            object = mz0_2.a;
        }
        return object;
    }
}

