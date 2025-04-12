/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;

public final class oH1$a
extends x0_0 {
    public final /* synthetic */ oh1_1 b;

    public oH1$a(oh1_1 oh1_12) {
        this.b = oh1_12;
    }

    public final int a() {
        return this.b.a.groupCount() + 1;
    }

    public final Object get(int n3) {
        Matcher matcher = this.b.a;
        String string2 = matcher.group(n3);
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }
}

