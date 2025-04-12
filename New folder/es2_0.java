/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eS2
 */
public final class es2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ cs2_1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ cS2$c e;

    public es2_0(cS2$c cS2$c, cs2_1 cs2_12, Object object) {
        this.c = cs2_12;
        this.d = object;
        this.e = cS2$c;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((cs2_1)object).b;
        Object object3 = this.d;
        boolean bl2 = object2.containsKey(object3) ^ true;
        if (bl2) {
            ((cs2_1)object).a.remove(object3);
            object2 = ((cs2_1)object).b;
            cS2$c cS2$c = this.e;
            object2.put(object3, cS2$c);
            object2 = new ds2_1(cS2$c, (cs2_1)object, object3);
            return object2;
        }
        object = new StringBuilder("Key ");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(" was used multiple times ");
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

