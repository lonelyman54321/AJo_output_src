/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class P83$b
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Collection d;

    public P83$b(int n3, Collection collection) {
        this.c = n3;
        this.d = collection;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        int n3 = this.c;
        Collection collection = this.d;
        return object.addAll(n3, collection);
    }
}

