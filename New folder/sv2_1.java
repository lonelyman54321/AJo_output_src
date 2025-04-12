/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Sv2
 */
public final class sv2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;

    public sv2_1(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (rv2_1)object;
        Xr3 xr3 = Xr3.ContinueTraversal;
        boolean bl2 = ((rv2_1)object).q;
        if (bl2) {
            Ref$ObjectRef ref$ObjectRef = this.c;
            ref$ObjectRef.element = object;
            boolean bl3 = ((rv2_1)object).p;
            if (bl3) {
                xr3 = Xr3.SkipSubtreeAndContinueTraversal;
            }
        }
        return xr3;
    }
}

