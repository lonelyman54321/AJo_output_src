/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from JN1
 */
public final class jn1_0 {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String[] c;

    public jn1_0(String string2, String string3, String string4, String[] stringArray) {
        this.a = string2;
        this.b = string3;
        this.c = stringArray;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Charset a(Charset charset) {
        void var3_6;
        block7: {
            String string2 = "charset";
            Intrinsics.checkNotNullParameter(string2, "name");
            String[] stringArray = this.c;
            int n3 = stringArray.length + -1;
            int n4 = 0;
            int n7 = 2;
            n3 = vb2_1.a(0, n3, n7);
            if (n3 >= 0) {
                while (true) {
                    int n8;
                    String string3;
                    if ((n7 = (int)(kotlin.text.b.i(string3 = stringArray[n4], string2, (n8 = 1) != 0) ? 1 : 0)) != 0) {
                        String string4 = stringArray[n4 += n8];
                        break block7;
                    }
                    if (n4 == n3) break;
                    n4 += 2;
                }
            }
            Object var3_5 = null;
        }
        if (var3_6 == null) {
            return charset;
        }
        try {
            return Charset.forName((String)var3_6);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return charset;
        }
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = object instanceof jn1_0;
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((jn1_0)object).a, string2 = this.a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

