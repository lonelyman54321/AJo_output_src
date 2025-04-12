/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from EZ2
 */
public class ez2_1
extends az2_1 {
    public static u50_0 b(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "<this>");
        bz2_2 bz2_22 = new bz2_2(iterator);
        return ez2_1.c(bz2_22);
    }

    public static u50_0 c(Sequence object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof u50_0;
        if (!bl2) {
            object = object2 = new u50_0((Sequence)object);
        }
        return (u50_0)object;
    }

    public static Sequence d(Function1 object, Object object2) {
        Object object3 = "nextFunction";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 == null) {
            object = uz0_2.a;
        } else {
            dz2_2 dz2_22 = new dz2_2(object2);
            object = object3 = new fz0_2(dz2_22, (Function1)object);
        }
        return object;
    }
}

