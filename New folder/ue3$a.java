/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ue3$a {
    public static void a(ue3_2 object, Function2 function2) {
        boolean bl2;
        Object object2 = "body";
        Intrinsics.checkNotNullParameter(function2, (String)object2);
        object = ((Iterable)object.entries()).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (List)object2.getValue();
            function2.invoke(string2, object2);
        }
    }
}

