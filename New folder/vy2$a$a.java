/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public final class vy2$a$a {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public final /* synthetic */ vy2_0.a_0 e;

    public vy2$a$a(vy2_0.a_0 object, List object2) {
        this.e = object;
        this.a = object2;
        object = new List[object2.size()];
        this.b = object;
        object2 = (Collection)object2;
        boolean bl2 = object2.isEmpty() ^ true;
        if (bl2) {
            return;
        }
        object2 = "NestedPrefetchController shouldn't be created with no states".toString();
        super((String)object2);
        throw object;
    }
}

