/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class VI$a
extends Lambda
implements Function0 {
    public final /* synthetic */ vi_0 c;

    public VI$a(vi_0 vi_02) {
        this.c = vi_02;
        super(0);
    }

    public final Object invoke() {
        T01 t01;
        Object object = this.c;
        wt2_1 wt2_12 = ((vi_0)object).p;
        if (wt2_12 == null) {
            ((vi_0)object).p = wt2_12 = new Object();
        }
        if ((t01 = wt2_12.b) == null) {
            object = go0.g((fo0)object).getGraphicsContext();
            wt2_12.c();
            wt2_12.b = object;
        }
        return wt2_12;
    }
}

