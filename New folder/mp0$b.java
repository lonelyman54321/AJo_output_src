/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class mp0$b
extends Lambda
implements Function1 {
    public final /* synthetic */ mp0 c;
    public final /* synthetic */ Xi1 d;
    public final /* synthetic */ gr1_1 e;
    public final /* synthetic */ int f;

    public mp0$b(mp0 mp02, Xi1 xi1, gr1_1 gr1_12, int n3) {
        this.c = mp02;
        this.d = xi1;
        this.e = gr1_12;
        this.f = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = this.c;
        if (object != object2) {
            int n3 = object instanceof pb3_0;
            if (n3 != 0) {
                object2 = this.d;
                n3 = ((Xi1)object2).a;
                int n4 = this.f;
                n3 -= n4;
                gr1_1 gr1_12 = this.e;
                int n7 = gr1_12.b(object);
                if (n7 >= 0) {
                    int[] nArray = gr1_12.c;
                    n7 = nArray[n7];
                } else {
                    n7 = -1 >>> 1;
                }
                n3 = Math.min(n3, n7);
                gr1_12.h(object, n3);
            }
            return Unit.a;
        }
        object2 = "A derived state calculation cannot read itself".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

