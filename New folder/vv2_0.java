/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from VV2
 */
public final class vv2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public vv2_0(es0_2 es0_22, Ref$ObjectRef ref$ObjectRef) {
        this.a = es0_22;
        this.b = ref$ObjectRef;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Ref$ObjectRef ref$ObjectRef = this.b;
        vv2$a_1 vv2$a_1 = new vv2$a_1((fs0_2)object, ref$ObjectRef);
        if ((object = this.a.collect(vv2$a_1, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

