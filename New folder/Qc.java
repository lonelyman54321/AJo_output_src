/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Qc
extends Lambda
implements Function1 {
    public final /* synthetic */ Oc c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Ns2 h;
    public final /* synthetic */ int i;

    public Qc(Oc oc, float f5, int n3, int n4, int n7, Ns2 ns2, int n8) {
        this.c = oc;
        this.d = f5;
        this.e = n3;
        this.f = n4;
        this.g = n7;
        this.h = ns2;
        this.i = n8;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Ns2$a)object;
        Oc oc = this.c;
        int n4 = oc instanceof m91;
        Ns2 ns2 = this.h;
        int n7 = this.g;
        int n8 = this.e;
        float f5 = 0.0f / 0.0f;
        float f6 = this.d;
        if (n4 != 0) {
            n3 = 0;
        } else {
            n3 = xs0_0.a(f6, f5);
            if (n3 == 0) {
                n3 = n8;
            } else {
                n3 = this.f - n7;
                int n10 = ns2.a;
                n3 -= n10;
            }
        }
        if (n4 == 0) {
            n8 = 0;
        } else {
            n4 = xs0_0.a(f6, f5);
            if (n4 != 0) {
                n4 = this.i - n7;
                n7 = ns2.b;
                n8 = n4 - n7;
            }
        }
        Ns2$a.f((Ns2$a)object, ns2, n3, n8);
        return Unit.a;
    }
}

