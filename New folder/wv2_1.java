/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from WV2
 */
public final class wv2_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public wv2_1(es0_2 es0_22, Ref$ObjectRef ref$ObjectRef) {
        this.a = es0_22;
        this.b = ref$ObjectRef;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Ref$ObjectRef ref$ObjectRef = this.b;
        WV2$a wV2$a = new WV2$a((fs0_2)object, ref$ObjectRef);
        if ((object = this.a.collect(wV2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

