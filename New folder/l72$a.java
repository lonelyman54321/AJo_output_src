/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l72$a
extends Lambda
implements Function1 {
    public final /* synthetic */ l72 c;
    public final /* synthetic */ dl1_1 d;
    public final /* synthetic */ Ns2 e;

    public l72$a(l72 l722, dl1_1 dl1_12, Ns2 ns2) {
        this.c = l722;
        this.d = dl1_12;
        this.e = ns2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Ns2$a)object;
        object = this.c;
        Object object3 = ((l72)object).n;
        dl1_1 dl1_12 = this.d;
        object3 = (Si1)object3.invoke(dl1_12);
        long l2 = ((Si1)object3).a;
        int n3 = ((l72)object).o;
        long l3 = 0xFFFFFFFFL;
        int n4 = 32;
        if (n3 != 0) {
            long l4 = l2 >> n4;
            n3 = (int)l4;
            int n7 = (int)(l2 &= l3);
            object3 = this.e;
            Ns2$a.g((Ns2$a)object2, (Ns2)object3, n3, n7);
        } else {
            long l7 = l2 >> n4;
            n3 = (int)l7;
            int n8 = (int)(l2 &= l3);
            object3 = this.e;
            n4 = 12;
            int n10 = n3;
            Ns2$a.j((Ns2$a)object2, (Ns2)object3, n3, n8, null, n4);
        }
        return Unit.a;
    }
}

