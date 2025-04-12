/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Ah1
 */
public final class ah1_2 {
    public static Thread a;

    public static final yh1_2 a(String string2, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(kSerializer, "primitiveSerializer");
        zh1_2 zh1_22 = new zh1_2(kSerializer);
        yh1_2 yh1_22 = new yh1_2(string2, zh1_22);
        return yh1_22;
    }
}

