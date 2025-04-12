/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1$c
extends Lambda
implements Function1 {
    public final /* synthetic */ a1_0 c;

    public a1$c(a1_0 a1_02) {
        this.c = a1_02;
        super(1);
    }

    public final CharSequence a(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "it");
        a1_0 a1_02 = this.c;
        a1_02.getClass();
        StringBuilder stringBuilder = new StringBuilder();
        Object object = entry.getKey();
        String string2 = "(this Map)";
        object = object == a1_02 ? string2 : String.valueOf(object);
        stringBuilder.append((String)object);
        char c2 = '=';
        stringBuilder.append(c2);
        entry = entry.getValue();
        if (entry != a1_02) {
            string2 = String.valueOf(entry);
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

