/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.Regex$b$a;

public final class Regex$b
implements Serializable {
    public static final Regex$b$a c;
    private static final long serialVersionUID;
    public final String a;
    public final int b;

    static {
        Regex$b$a regex$b$a;
        c = regex$b$a = new Regex$b$a(null);
    }

    public Regex$b(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "pattern");
        this.a = string2;
        this.b = n3;
    }

    private final Object readResolve() {
        Object object = this.a;
        int n3 = this.b;
        object = Pattern.compile((String)object, n3);
        Intrinsics.checkNotNullExpressionValue(object, "compile(...)");
        Regex regex = new Regex((Pattern)object);
        return regex;
    }
}

