/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from uB1
 */
public final class ub1_0
implements bl1_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ tb1_0 f;

    public ub1_0(int n3, int n4, Map map2, Function1 function1, tb1_0 tb1_02) {
        this.a = n3;
        this.b = n4;
        this.c = map2;
        this.d = null;
        this.e = function1;
        this.f = tb1_02;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public final void j() {
        wb1_0 wb1_02 = this.f.i;
        this.e.invoke(wb1_02);
    }

    public final Function1 k() {
        return this.d;
    }

    public final Map p() {
        return this.c;
    }
}

