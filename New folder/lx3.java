/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

public final class lx3
extends Lambda
implements Function1 {
    public static final lx3 c;

    static {
        lx3 lx32;
        c = lx32 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        String string2 = null;
        Object object2 = Charsets.UTF_8;
        object2 = ((String)object).getBytes((Charset)object2);
        String string3 = "this as java.lang.String).getBytes(charset)";
        try {
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            object2 = UUID.nameUUIDFromBytes((byte[])object2);
        }
        catch (InternalError internalError) {
            String.valueOf(((String)object).hashCode());
            object2 = null;
        }
        if (object2 != null) {
            string2 = ((UUID)object2).toString();
        }
        if (string2 == null) {
            int n3 = ((String)object).hashCode();
            string2 = String.valueOf(n3);
        }
        return string2;
    }
}

