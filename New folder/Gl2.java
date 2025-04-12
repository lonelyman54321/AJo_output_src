/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Gl2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;

    public Gl2(int n3, float f5, Function0 function0) {
        this.c = n3;
        this.d = f5;
        this.e = function0;
        super(0);
    }

    public final Object invoke() {
        Function0 function0 = this.e;
        int n3 = this.c;
        float f5 = this.d;
        hm0_0 hm0_02 = new hm0_0(n3, f5, function0);
        return hm0_02;
    }
}

