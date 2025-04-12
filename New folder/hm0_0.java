/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from Hm0
 */
public final class hm0_0
extends Cl2 {
    public static final ds2_0 H;
    public final ParcelableSnapshotMutableState G;

    static {
        Hm0$a hm0$a = Hm0$a.c;
        Hm0$b hm0$b = Hm0$b.c;
        H = sr0_2.a(hm0$a, hm0$b);
    }

    public hm0_0(int n3, float f5, Function0 function0) {
        super(n3, f5, null);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.G = parcelableSnapshotMutableState = J83.g(function0);
    }

    public final int m() {
        return ((Number)((Function0)this.G.getValue()).invoke()).intValue();
    }
}

