/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.http.BadContentTypeFormatException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class k70$b {
    public static k70_0 a(String object) {
        int n3;
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = b.k((CharSequence)object);
        if (bl2) {
            return k70_0.e;
        }
        object2 = (z31_0)CollectionsKt.S(ha1_1.a((String)object));
        String string2 = ((z31_0)object2).a;
        char c2 = '/';
        String string3 = null;
        int n4 = StringsKt.N(string2, c2, 0, false, 6);
        if (n4 == (n3 = -1)) {
            object2 = ((Object)StringsKt.m0(string2)).toString();
            bl2 = Intrinsics.areEqual(object2, string2 = "*");
            if (bl2) {
                return k70_0.e;
            }
            object2 = new BadContentTypeFormatException((String)object);
            throw object2;
        }
        string3 = string2.substring(0, n4);
        String string4 = "substring(...)";
        Intrinsics.checkNotNullExpressionValue(string3, string4);
        string3 = ((Object)StringsKt.m0(string3)).toString();
        int n7 = string3.length();
        if (n7 != 0) {
            string2 = string2.substring(++n4);
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            string2 = ((Object)StringsKt.m0(string2)).toString();
            n4 = 32;
            n3 = (int)(StringsKt.G(string3, (char)n4) ? 1 : 0);
            if (n3 == 0 && (n4 = (int)(StringsKt.G(string2, (char)n4) ? 1 : 0)) == 0) {
                n4 = string2.length();
                if (n4 != 0 && (n4 = (int)(StringsKt.G(string2, c2) ? 1 : 0)) == 0) {
                    object2 = ((z31_0)object2).b;
                    object = new k70_0(string3, string2, (List)object2);
                    return object;
                }
                object2 = new BadContentTypeFormatException((String)object);
                throw object2;
            }
            object2 = new BadContentTypeFormatException((String)object);
            throw object2;
        }
        object2 = new BadContentTypeFormatException((String)object);
        throw object2;
    }
}

