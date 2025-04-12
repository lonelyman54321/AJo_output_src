/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class KI3 {
    public final String a;
    public final String b;

    public KI3(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "workSpecId");
        this.a = string2;
        this.b = string3;
    }
}

