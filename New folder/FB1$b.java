/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class FB1$b
extends Lambda
implements Function0 {
    public final /* synthetic */ fb1_0 c;

    public FB1$b(fb1_0 fb1_02) {
        this.c = fb1_02;
        super(0);
    }

    public final Object invoke() {
        fb1_0 fb1_02 = this.c;
        Boolean bl2 = (Boolean)fb1_02.d.getValue();
        int n3 = bl2.booleanValue();
        float f5 = n3 != 0 && (n3 = fb1_02.m() % 2) == 0 ? -fb1_02.j() : fb1_02.j();
        return Float.valueOf(f5);
    }
}

