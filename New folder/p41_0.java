/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from p41
 */
public final class p41_0
extends xe3_2 {
    public p41_0() {
        this(0);
    }

    public p41_0(int n3) {
        super(8);
    }

    public final void g(String string2) {
        int n3;
        Object object = "name";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        super.g(string2);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = null;
        char c2 = '\u0000';
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            String string3;
            n3 = string2.charAt(i3);
            char c3 = c2 + 1;
            int n4 = Intrinsics.compare(n3, 32);
            if (n4 > 0 && (n3 = (int)(StringsKt.G(string3 = "\"(),/:;<=>?@[\\]{}", (char)n3) ? 1 : 0)) == 0) {
                c2 = c3;
                continue;
            }
            Intrinsics.checkNotNullParameter(string2, "headerName");
            StringBuilder stringBuilder = Gn.a("Header name '", string2, "' contains illegal character '");
            c3 = string2.charAt(c2);
            stringBuilder.append(c3);
            stringBuilder.append("' (code ");
            int n7 = string2.charAt(c2) & 0xFF;
            string2 = tu.a(stringBuilder, n7, ')');
            object = new IllegalArgumentException(string2);
            throw object;
        }
    }

    public final void h(String string2) {
        int n3;
        Object object = "value";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        super.h(string2);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = null;
        char c2 = '\u0000';
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            n3 = string2.charAt(i3);
            char c3 = c2 + 1;
            int n4 = Intrinsics.compare(n3, 32);
            if (n4 < 0 && n3 != (n4 = 9)) {
                Intrinsics.checkNotNullParameter(string2, "headerValue");
                StringBuilder stringBuilder = Gn.a("Header value '", string2, "' contains illegal character '");
                c3 = string2.charAt(c2);
                stringBuilder.append(c3);
                stringBuilder.append("' (code ");
                int n7 = string2.charAt(c2) & 0xFF;
                string2 = tu.a(stringBuilder, n7, ')');
                object = new IllegalArgumentException(string2);
                throw object;
            }
            c2 = c3;
        }
    }

    public final q41_0 i() {
        Map map2 = this.b;
        Intrinsics.checkNotNullParameter(map2, "values");
        q41_0 q41_02 = new ye3_2(map2);
        return q41_02;
    }
}

