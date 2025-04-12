/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from m70
 */
public final class m70_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Charset a(b41_0 object) {
        Charsets charsets;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((b41_0)object).a("charset");
        Object object2 = null;
        if (object == null) return object2;
        try {
            charsets = Charsets.a;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return object2;
        }
        Intrinsics.checkNotNullParameter(charsets, string2);
        string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        object = Charset.forName((String)object);
        string2 = "forName(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return object;
    }

    public static final k70_0 b(k70_0 k70_02, Charset object) {
        Intrinsics.checkNotNullParameter(k70_02, "<this>");
        Intrinsics.checkNotNullParameter(object, "charset");
        String string2 = k70_02.c;
        Object object2 = Locale.ROOT;
        string2 = string2.toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        object2 = "text";
        boolean bl2 = Intrinsics.areEqual(string2, object2);
        if (bl2) {
            object = os_2.b((Charset)object);
            k70_02 = k70_02.c((String)object);
        }
        return k70_02;
    }
}

