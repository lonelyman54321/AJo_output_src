/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lz
 */
public final class lz_0
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ Ns2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Ns2 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public lz_0(float f5, Ns2 ns2, int n3, int n4, int n7, Ns2 ns22, int n8, int n10) {
        this.c = f5;
        this.d = ns2;
        this.e = n3;
        this.f = n4;
        this.g = n7;
        this.h = ns22;
        this.i = n8;
        this.j = n10;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        float f5 = this.c;
        int n3 = 0;
        int n4 = this.g;
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object2 != false) {
            object2 = this.f + n4;
            n3 = this.e;
            Ns2 ns2 = this.d;
            Ns2$a.f((Ns2$a)object, ns2, n3, (int)object2);
        }
        object2 = this.j + n4;
        n3 = this.i;
        Ns2 ns2 = this.h;
        Ns2$a.f((Ns2$a)object, ns2, n3, (int)object2);
        return Unit.a;
    }
}

