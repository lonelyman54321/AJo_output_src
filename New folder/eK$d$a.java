/*
 * Decompiled with CFR 0.152.
 */
import androidx.concurrent.futures.AbstractResolvableFuture;

public final class eK$d$a
extends AbstractResolvableFuture {
    public final /* synthetic */ eK$d a;

    public eK$d$a(eK$d eK$d) {
        this.a = eK$d;
    }

    public final String pendingToString() {
        Object object = (eK$a)this.a.a.get();
        if (object == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder stringBuilder = new StringBuilder("tag=[");
        object = ((eK$a)object).a;
        return fK.a(stringBuilder, object, "]");
    }
}

