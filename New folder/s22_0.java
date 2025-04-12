/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.util.CommonFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from S22
 */
public final class s22_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ q22_0 a;

    public s22_0(q22_0 q22_02, f80_0 f80_02) {
        this.a = q22_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q22_0 q22_02 = this.a;
        object = new s22_0(q22_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (s22_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((s22_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((q22_0)object).Xa().b;
        r22_0 r22_02 = new r22_0((q22_0)object);
        ((CommonFlow)object2).watch(r22_02);
        return Unit.a;
    }
}

