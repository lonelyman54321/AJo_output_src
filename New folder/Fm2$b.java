/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class Fm2$b
extends fm2_2 {
    public final String a;
    public final x80_0 b;
    public final boolean c;

    public Fm2$b(String string2, boolean bl2) {
        vE$d vE$d = vE$d.a;
        Objects.requireNonNull(string2, "name == null");
        this.a = string2;
        this.b = vE$d;
        this.c = bl2;
    }

    public final void a(sj2_1 sj2_12, Object object) {
        if (object == null) {
            return;
        }
        Object object2 = this.b;
        if ((object = (String)object2.convert(object)) == null) {
            return;
        }
        object2 = this.a;
        boolean bl2 = this.c;
        sj2_12.a((String)object2, (String)object, bl2);
    }
}

