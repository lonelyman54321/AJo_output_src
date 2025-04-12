/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Y32
 */
public final class y32_0
extends Lambda
implements Function0 {
    public final /* synthetic */ w32_0 c;
    public final /* synthetic */ LP1$c d;
    public final /* synthetic */ W32$e e;
    public final /* synthetic */ long f;
    public final /* synthetic */ C61 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;

    public y32_0(w32_0 w32_02, LP1$c lP1$c, W32$e w32$e, long l2, C61 c61, boolean bl2, boolean bl3, float f5) {
        this.c = w32_02;
        this.d = lP1$c;
        this.e = w32$e;
        this.f = l2;
        this.g = c61;
        this.h = bl2;
        this.i = bl3;
        this.j = f5;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.e.b();
        LP1$c lP1$c = Z32.a(this.d, n3);
        boolean bl2 = this.i;
        w32_0 w32_02 = this.c;
        Object object = this.e;
        long l2 = this.f;
        C61 c61 = this.g;
        boolean bl3 = this.h;
        if (lP1$c == null) {
            W32$e w32$e = object;
            object = c61;
            w32_02.o1(w32$e, l2, c61, bl3, bl2);
        } else {
            y32_0 y32_02;
            w32_02.getClass();
            float f5 = this.j;
            y32_0 y32_03 = y32_02;
            y32_02 = new y32_0(w32_02, lP1$c, (W32$e)object, l2, c61, bl3, bl2, f5);
            c61.c(lP1$c, f5, bl2, y32_02);
        }
        return Unit.a;
    }
}

