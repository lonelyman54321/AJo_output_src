/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class dq0
extends Lambda
implements Function2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ Collection d;
    public final /* synthetic */ int e;

    public dq0(p83_0 p83_02, Collection collection, int n3) {
        this.c = p83_02;
        this.d = collection;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        Collection collection = this.d;
        Wp0.b((p83_0)this.c, collection, (b30_0)object, n3);
        return Unit.a;
    }
}

