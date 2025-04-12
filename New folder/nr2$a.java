/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nr2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Collection c;

    public nr2$a(Collection collection) {
        this.c = collection;
        super(1);
    }

    public final Object invoke(Object object) {
        return this.c.contains(object);
    }
}

