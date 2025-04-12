/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gz3
 */
public final class gz3_0
implements Function2 {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ gz3_0(f72_0 f72_02) {
        this.a = f72_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (List)object2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "values");
        Object object3 = ja1_1.a;
        object3 = "Content-Length";
        boolean bl2 = Intrinsics.areEqual(object3, object);
        if (bl2) {
            object = Unit.a;
        } else {
            object3 = "Content-Type";
            bl2 = Intrinsics.areEqual(object3, object);
            if (bl2) {
                object = Unit.a;
            } else {
                object3 = Mz3.a;
                bl2 = object3.contains(object);
                Function2 function2 = this.a;
                if (bl2) {
                    object2 = ((Iterable)object2).iterator();
                    while (bl2 = object2.hasNext()) {
                        object3 = (String)object2.next();
                        function2.invoke(object, object3);
                    }
                } else {
                    object3 = "Cookie";
                    bl2 = Intrinsics.areEqual(object3, object);
                    object3 = bl2 ? "; " : ",";
                    Object object4 = object2;
                    object4 = (Iterable)object2;
                    int n3 = 62;
                    object2 = CollectionsKt.R((Iterable)object4, (String)object3, null, null, null, n3);
                    function2.invoke(object, object2);
                }
                object = Unit.a;
            }
        }
        return object;
    }
}

