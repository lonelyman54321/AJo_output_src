/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/*
 * Renamed from mT0
 */
public final class mt0_2
implements fs0_2 {
    public final /* synthetic */ Ref$ObjectRef a;

    public mt0_2(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        this.a.element = object;
        object = new AbortFlowException(this);
        throw object;
    }
}

