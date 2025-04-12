/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Zr1
 */
public final class zr1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ xs1 c;
    public final /* synthetic */ Tr1 d;
    public final /* synthetic */ wf3 e;
    public final /* synthetic */ yy2_0 f;

    public zr1_2(xs1 xs12, Tr1 tr1, wf3 wf32, yy2_0 yy2_02) {
        this.c = xs12;
        this.d = tr1;
        this.e = wf32;
        this.f = yy2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Object object2 = this.f;
        Tr1 tr1 = this.d;
        wf3 wf32 = this.e;
        object = new vy2_0(tr1, wf32, (yy2_0)object2);
        object2 = this.c;
        ((xs1)object2).d = object;
        object = new yr1_1((xs1)object2);
        return object;
    }
}

