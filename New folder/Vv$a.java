/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Vv$a
extends Lambda
implements Function0 {
    public final /* synthetic */ Wv c;
    public final /* synthetic */ Vv$b d;

    public Vv$a(Wv wv, Vv$b vv$b) {
        this.c = wv;
        this.d = vv$b;
        super(0);
    }

    public final Object invoke() {
        N50 n50 = this.c.a;
        Object object = this.d;
        n50.getClass();
        Intrinsics.checkNotNullParameter(object, "listener");
        Object object2 = n50.c;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                block7: {
                    LinkedHashSet linkedHashSet;
                    try {
                        linkedHashSet = n50.d;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    boolean bl2 = ((AbstractCollection)linkedHashSet).remove(object);
                    if (!bl2) break block7;
                    object = n50.d;
                    bl2 = ((AbstractCollection)object).isEmpty();
                    if (!bl2) break block7;
                    n50.d();
                }
                return Unit.a;
            }
            throw throwable2;
        }
    }
}

