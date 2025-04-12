/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions$b;
import io.reactivex.internal.functions.Functions$c;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;

/*
 * Renamed from v62
 */
public final class v62_0
extends i1_0 {
    public final o60_0 b;
    public final o60_0 c;
    public final j2_0 d;
    public final j2_0 e;

    public v62_0(ObservableDebounceTimed observableDebounceTimed, Functions$c functions$c, we0_2 we0_22, Functions$b functions$b, Functions$b functions$b2) {
        super(observableDebounceTimed);
        this.b = functions$c;
        this.c = we0_22;
        this.d = functions$b;
        this.e = functions$b2;
    }

    public final void f(e62_0 e62_02) {
        o60_0 o60_02 = this.b;
        o60_0 o60_03 = this.c;
        j2_0 j2_02 = this.d;
        j2_0 j2_03 = this.e;
        v62$a_0 v62$a_0 = new v62$a_0(e62_02, o60_02, o60_03, j2_02, j2_03);
        this.a.c(v62$a_0);
    }
}

