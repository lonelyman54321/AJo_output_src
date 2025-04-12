/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Sp1$b
implements bl1_0 {
    public final /* synthetic */ bl1_0 a;
    public final int b;
    public final int c;

    public Sp1$b(bl1_0 object, sp1_1 sp1_12) {
        int n3;
        this.a = object;
        object = sp1_12.R;
        Intrinsics.checkNotNull(object);
        this.b = n3 = ((Ns2)object).a;
        object = sp1_12.R;
        Intrinsics.checkNotNull(object);
        this.c = n3 = ((Ns2)object).b;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final void j() {
        this.a.j();
    }

    public final Function1 k() {
        return this.a.k();
    }

    public final Map p() {
        return this.a.p();
    }
}

