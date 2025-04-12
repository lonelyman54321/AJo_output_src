/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.engine.ClientEngineClosedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from oa1
 */
public final class oa1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ma1_1 b;
    public final /* synthetic */ eb1_2 c;

    public oa1_2(ma1_1 ma1_12, eb1_2 eb1_22, f80_0 f80_02) {
        this.b = ma1_12;
        this.c = eb1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ma1_1 ma1_12 = this.b;
        eb1_2 eb1_22 = this.c;
        object = new oa1_2(ma1_12, eb1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oa1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oa1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return object;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = object.getCoroutineContext();
        i$a i$a = i$a.a;
        object2 = (i)object2.get(i$a);
        i$a = null;
        if (object2 != null) {
            n3 = (int)(object2.isActive() ? 1 : 0);
        } else {
            n3 = 0;
            object2 = null;
        }
        if ((n3 ^= n4) == 0) {
            this.a = n4;
            object2 = this.c;
            if ((object = object.f0((eb1_2)object2, this)) != j90_02) return object;
            return j90_02;
        }
        object = new ClientEngineClosedException(0);
        throw object;
    }
}

