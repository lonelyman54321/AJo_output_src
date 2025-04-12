/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ec
 */
public final class ec_2
extends qg3_2
implements Function2 {
    public ks1_1 a;
    public Dc$a b;
    public int c;
    public final /* synthetic */ Dc$a d;

    public ec_2(Dc$a dc$a, f80_0 f80_02) {
        this.d = dc$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Dc$a dc$a = this.d;
        object = new ec_2(dc$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ec_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ec_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        ks1_1 ks1_12;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object3 = this.b;
            ks1_12 = this.a;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = ks1_12 = dc_2.c;
            object = this.d;
            this.b = object;
            this.c = n4;
            object2 = ks1_12.d(this, null);
            if (object2 == object3) {
                return object3;
            }
            object3 = object;
        }
        try {
            object = dc_2.a;
            object2 = CollectionsKt.k0((Iterable)object);
            ((LinkedList)object).clear();
            object = dc_2.b;
            object2 = (Collection)object2;
            ((LinkedList)object).addAll(object2);
            dc_2.a((Dc$a)((Object)object3));
            object = Unit.a;
            return Unit.a;
        }
        finally {
            ks1_12.b(null);
        }
    }
}

