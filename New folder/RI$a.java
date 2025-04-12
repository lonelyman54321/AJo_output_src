/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class RI$a
extends il2_2 {
    public final Rq0$c b;
    public final String c;
    public final String d;
    public final ie2_2 e;

    public RI$a(Rq0$c closeable, String object, String string2) {
        Intrinsics.checkNotNullParameter(closeable, "snapshot");
        this.b = closeable;
        this.c = object;
        this.d = string2;
        closeable = (a93_0)closeable.c.get(1);
        object = new RI$a$a((a93_0)closeable, this);
        closeable = o72_0.b((a93_0)object);
        this.e = closeable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long c() {
        long l2 = -1;
        String string2 = this.d;
        if (string2 == null) return l2;
        byte[] byArray = ez3.a;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        try {
            return Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public final jn1_0 d() {
        Object object = this.c;
        object = object != null ? JN1$a.b((String)object) : null;
        return object;
    }

    public final se_1 h() {
        return this.e;
    }
}

