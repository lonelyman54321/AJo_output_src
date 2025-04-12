/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Qv2
 */
public final class qv2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;

    public qv2_1(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        boolean bl3;
        object = (rv2_1)object;
        Ref$ObjectRef ref$ObjectRef = this.c;
        Object object2 = ref$ObjectRef.element;
        if (object2 == null && (bl3 = ((rv2_1)object).q)) {
            ref$ObjectRef.element = object;
        } else if (object2 != null && (bl2 = ((rv2_1)object).p) && (bl2 = ((rv2_1)object).q)) {
            ref$ObjectRef.element = object;
        }
        return Boolean.TRUE;
    }
}

