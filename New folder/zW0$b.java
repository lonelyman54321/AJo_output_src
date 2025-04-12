/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class zW0$b {
    public static final zW0$b c;
    public final Set a;
    public final LinkedHashMap b;

    static {
        zW0$b zW0$b;
        vz0_2 vz0_22 = vz0_2.a;
        nz0_2 nz0_22 = fh1_2.f();
        c = zW0$b = new zW0$b(vz0_22, nz0_22);
    }

    public zW0$b(Set linkedHashMap, nz0_2 nz0_22) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "flags");
        Intrinsics.checkNotNullParameter(nz0_22, "allowedViolations");
        this.a = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        nz0_22.getClass();
        vz0_2.a.getClass();
        lz0_2.a.getClass();
        this.b = linkedHashMap;
    }
}

