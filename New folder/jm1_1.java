/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jm1
 */
public final class jm1_1 {
    public static final void a(ml1_2 ml1_22, lm1_2 lm1_22, b03_0 b03_02, Object object) {
        Object object2 = "json";
        Intrinsics.checkNotNullParameter(ml1_22, (String)object2);
        Intrinsics.checkNotNullParameter(lm1_22, "writer");
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        pj3_2 pj3_22 = pj3_2.OBJ;
        int n3 = pj3_2.getEntries().size();
        km1_2[] km1_2Array = new km1_2[n3];
        Intrinsics.checkNotNullParameter(lm1_22, "output");
        Intrinsics.checkNotNullParameter(ml1_22, (String)object2);
        Intrinsics.checkNotNullParameter((Object)pj3_22, "mode");
        Intrinsics.checkNotNullParameter(km1_2Array, "modeReuseCache");
        String string2 = "sb";
        Intrinsics.checkNotNullParameter(lm1_22, string2);
        Intrinsics.checkNotNullParameter(ml1_22, (String)object2);
        object2 = ml1_22.a;
        boolean bl2 = ((sl1_2)object2).e;
        object2 = bl2 ? new q30_0(lm1_22, ml1_22) : new c30_0(lm1_22);
        de3_1 de3_12 = new de3_1((c30_0)object2, ml1_22, pj3_22, km1_2Array);
        de3_12.B(b03_02, object);
    }
}

