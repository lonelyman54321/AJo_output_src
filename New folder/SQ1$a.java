/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class SQ1$a
extends Lambda
implements Function0 {
    public final /* synthetic */ sq1_0 c;

    public SQ1$a(sq1_0 sq1_02) {
        this.c = sq1_02;
        super(0);
    }

    public final Object invoke() {
        float f5;
        Object object = this.c.e;
        boolean bl2 = ((ArrayList)object).isEmpty();
        if (bl2) {
            f5 = 0.0f;
            object = null;
        } else {
            bl2 = false;
            Object e2 = ((ArrayList)object).get(0);
            Object object2 = e2;
            object2 = ((um2)e2).a;
            float f6 = object2.b();
            int n3 = 1;
            int n4 = xx_2.h((List)object);
            if (n3 <= n4) {
                while (true) {
                    Object e5 = ((ArrayList)object).get(n3);
                    Object object3 = e5;
                    object3 = ((um2)e5).a;
                    float f7 = object3.b();
                    int n7 = Float.compare(f6, f7);
                    if (n7 < 0) {
                        e2 = e5;
                        f6 = f7;
                    }
                    if (n3 == n4) break;
                    ++n3;
                }
            }
            object = e2;
        }
        object = (um2)object;
        if (object != null && (object = ((um2)object).a) != null) {
            f5 = object.b();
        } else {
            f5 = 0.0f;
            object = null;
        }
        return Float.valueOf(f5);
    }
}

