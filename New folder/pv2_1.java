/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from pV2
 */
public final class pv2_1
implements Function2 {
    public final /* synthetic */ vv2_2 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ pv2_1(vv2_2 vv2_22, Ref$ObjectRef ref$ObjectRef) {
        this.a = vv2_22;
        this.b = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$screenName");
        Intrinsics.checkNotNullParameter(object, "eventType");
        Intrinsics.checkNotNullParameter(object2, "destinationStore");
        yw2_0 yw2_02 = ((vv2_2)object3).t;
        if (yw2_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
            yw2_02 = null;
        }
        object4 = (String)((Ref$ObjectRef)object4).element;
        object3 = ((vv2_2)object3).U;
        yw2_02.e((String)object4, (String)object, (String)object2, (String)object3);
        return Unit.a;
    }
}

