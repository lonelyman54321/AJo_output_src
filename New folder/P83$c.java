/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class P83$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Collection c;

    public P83$c(Collection collection) {
        this.c = collection;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        Collection collection = this.c;
        return object.retainAll(collection);
    }
}

