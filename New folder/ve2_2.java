/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VE2
 */
public final class ve2_2
extends il2_2 {
    public final String b;
    public final long c;
    public final se_1 d;

    public ve2_2(String string2, long l2, ie2_2 ie2_22) {
        Intrinsics.checkNotNullParameter(ie2_22, "source");
        this.b = string2;
        this.c = l2;
        this.d = ie2_22;
    }

    public final long c() {
        return this.c;
    }

    public final jn1_0 d() {
        Object object = this.b;
        object = object != null ? JN1$a.b((String)object) : null;
        return object;
    }

    public final se_1 h() {
        return this.d;
    }
}

