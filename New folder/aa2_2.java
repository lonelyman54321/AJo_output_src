/*
 * Decompiled with CFR 0.152.
 */
import java.util.RandomAccess;

/*
 * Renamed from aa2
 */
public final class aa2_2
extends x0_0
implements RandomAccess {
    public static final /* synthetic */ int d;
    public final ff_2[] b;
    public final int[] c;

    public aa2_2(ff_2[] ff_2Array, int[] nArray) {
        this.b = ff_2Array;
        this.c = nArray;
    }

    public final int a() {
        return this.b.length;
    }

    public final Object get(int n3) {
        return this.b[n3];
    }
}

