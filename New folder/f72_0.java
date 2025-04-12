/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F72
 */
public final class f72_0
implements Function2 {
    public final /* synthetic */ KJ2$a a;

    public /* synthetic */ f72_0(KJ2$a kJ2$a) {
        this.a = kJ2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        Object object3 = ja1_1.a;
        object3 = "Content-Length";
        boolean bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            object = Unit.a;
        } else {
            object3 = this.a;
            ((KJ2$a)object3).a((String)object, (String)object2);
            object = Unit.a;
        }
        return object;
    }
}

