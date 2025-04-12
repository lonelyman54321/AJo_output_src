/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Tv2
 */
public final class tv2_2
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;

    public tv2_2(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (rv2_1)object;
        boolean bl2 = ((rv2_1)object).p;
        if (bl2 && (bl2 = ((rv2_1)object).q)) {
            Ref$ObjectRef ref$ObjectRef = this.c;
            ref$ObjectRef.element = object;
        }
        return Boolean.TRUE;
    }
}

