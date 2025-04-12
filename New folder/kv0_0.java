/*
 * Decompiled with CFR 0.152.
 */
import java.net.URLDecoder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/*
 * Renamed from KV0
 */
public final class kv0_0
extends Lambda
implements Function1 {
    public static final kv0_0 c;

    static {
        kv0_0 kv0_02;
        c = kv0_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        CharSequence charSequence;
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        Object object2 = new String[]{"="};
        object = StringsKt.a0((CharSequence)object, object2, false, 0, 6);
        object2 = (String)object.get(0);
        int n3 = object.size();
        int n4 = 1;
        if (n3 > n4) {
            object = (String)object.get(n4);
            charSequence = "UTF-8";
            object = URLDecoder.decode((String)object, (String)charSequence);
        } else {
            object = "";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object2);
        ((StringBuilder)charSequence).append(": ");
        ((StringBuilder)charSequence).append(object);
        return ((StringBuilder)charSequence).toString();
    }
}

