/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.i;

/*
 * Renamed from GE2
 */
public final class ge2_2
implements jb3_2,
es0_2,
ox0_2 {
    public final /* synthetic */ jb3_2 a;
    public final i b;

    public ge2_2(kb3_2 kb3_22, mb3_2 mb3_22) {
        this.a = kb3_22;
    }

    public final List c() {
        return this.a.c();
    }

    public final Object collect(fs0_2 fs0_22, f80_0 f80_02) {
        return this.a.collect(fs0_22, f80_02);
    }

    public final es0_2 e(CoroutineContext object, int n3, he_2 he_22) {
        he_2 he_23;
        int n4;
        object = (n3 >= 0 && n3 < (n4 = 2) || n3 == (n4 = -2)) && he_22 == (he_23 = he_2.DROP_OLDEST) ? this : k23_0.e(this, (CoroutineContext)object, n3, he_22);
        return object;
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}

