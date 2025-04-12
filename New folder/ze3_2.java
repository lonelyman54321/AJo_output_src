/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ze3
 */
public final class ze3_2 {
    public static final void a(ve3_2 ve3_22, ve3_2 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(ve3_22, "<this>");
        Object object2 = "builder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((Iterable)object.entries()).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (List)object2.getValue();
            ve3_22.a(string2, (Iterable)object2);
        }
    }
}

