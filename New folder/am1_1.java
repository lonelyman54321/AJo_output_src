/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Am1
 */
public final class am1_1
implements Function1 {
    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "<destruct>");
        String string2 = (String)object.getKey();
        object = (JsonElement)object.getValue();
        StringBuilder stringBuilder = new StringBuilder();
        oe3_2.a(string2, stringBuilder);
        stringBuilder.append(':');
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

