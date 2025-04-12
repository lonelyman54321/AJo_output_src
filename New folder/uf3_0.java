/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.Objects;

/*
 * Renamed from Uf3
 */
public final class uf3_0 {
    public static ye0_1 a(vf3_0 object, byte[] object2, int n3) {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        Vf3$b vf3$b = Vf3$b.c;
        Objects.requireNonNull(immutableList$Builder);
        tf3_1 tf3_12 = new tf3_1(immutableList$Builder);
        object.b((byte[])object2, 0, n3, vf3$b, tf3_12);
        object2 = immutableList$Builder.build();
        object = new ye0_1((ImmutableList)object2);
        return object;
    }
}

