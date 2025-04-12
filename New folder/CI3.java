/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public abstract class CI3 {
    public final UUID a;
    public final EI3 b;
    public final Set c;

    public CI3(UUID uUID, EI3 eI3, Set set) {
        Intrinsics.checkNotNullParameter(uUID, "id");
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        Intrinsics.checkNotNullParameter(set, "tags");
        this.a = uUID;
        this.b = eI3;
        this.c = set;
    }
}

