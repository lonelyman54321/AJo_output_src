/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Yo0 {
    public final String a;
    public final String b;

    public Yo0(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "workSpecId");
        Intrinsics.checkNotNullParameter(string3, "prerequisiteId");
        this.a = string2;
        this.b = string3;
    }
}

