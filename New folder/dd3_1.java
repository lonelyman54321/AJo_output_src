/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DD3
 */
public final class dd3_1
implements be2_2 {
    public final Function0 a;
    public Object b;

    public dd3_1(Object object, ed3$a_0 ed3$a_0) {
        Intrinsics.checkNotNullParameter(ed3$a_0, "invalidator");
        this.a = ed3$a_0;
        this.b = object;
    }

    public final void a(gn1_2 object, Object object2) {
        String string2 = "property";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.b;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2) {
            this.b = object2;
            object = this.a;
            object.invoke();
        }
    }

    public final Object b(gn1_2 gn1_22, Object object) {
        Intrinsics.checkNotNullParameter(gn1_22, "property");
        return this.b;
    }
}

