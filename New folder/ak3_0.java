/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ak3
 */
public final class ak3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ck3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ wr1_1 f;
    public final /* synthetic */ ln0 g;
    public final /* synthetic */ i13 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;

    public ak3_0(ck3 ck32, boolean bl2, boolean bl3, wr1_1 wr1_12, ln0 ln02, i13 i132, float f5, float f6, int n3) {
        this.c = ck32;
        this.d = bl2;
        this.e = bl3;
        this.f = wr1_12;
        this.g = ln02;
        this.h = i132;
        this.i = f5;
        this.j = f6;
        this.k = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        ln0 ln02 = this.g;
        i13 i132 = this.h;
        ck3 ck32 = this.c;
        boolean bl2 = this.d;
        boolean bl3 = this.e;
        wr1_1 wr1_12 = this.f;
        float f5 = this.i;
        float f6 = this.j;
        ck32.a(bl2, bl3, wr1_12, ln02, i132, f5, f6, (b30_0)object3, n3);
        return Unit.a;
    }
}

