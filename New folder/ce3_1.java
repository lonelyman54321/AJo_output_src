/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ce3
 */
public class ce3_1 {
    public static void a(StringBuilder stringBuilder, Object object, Function1 function1) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(stringBuilder, string2);
        if (function1 != null) {
            object = (CharSequence)function1.invoke(object);
            stringBuilder.append((CharSequence)object);
        } else {
            boolean bl2 = object == null ? true : object instanceof CharSequence;
            if (bl2) {
                object = (CharSequence)object;
                stringBuilder.append((CharSequence)object);
            } else {
                bl2 = object instanceof Character;
                if (bl2) {
                    object = (Character)object;
                    char c2 = ((Character)object).charValue();
                    stringBuilder.append(c2);
                } else {
                    object = String.valueOf(object);
                    stringBuilder.append((CharSequence)object);
                }
            }
        }
    }
}

