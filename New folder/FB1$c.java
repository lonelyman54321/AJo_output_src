/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class FB1$c
extends Lambda
implements Function0 {
    public final /* synthetic */ fb1_0 c;

    public FB1$c(fb1_0 fb1_02) {
        this.c = fb1_02;
        super(0);
    }

    public final Object invoke() {
        float f5;
        float f6;
        float f7;
        boolean bl2;
        Number number;
        int n3;
        fb1_0 fb1_02 = this.c;
        int n4 = fb1_02.m();
        if (n4 == (n3 = (number = (Number)fb1_02.c.getValue()).intValue()) && !(bl2 = (f7 = (f6 = fb1_02.l()) - (f5 = fb1_02.h())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            fb1_02 = null;
        }
        return bl2;
    }
}

