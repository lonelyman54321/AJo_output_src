/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class G60$c$a$b
extends Lambda
implements Function0 {
    public final /* synthetic */ G60 c;
    public final /* synthetic */ tw3 d;
    public final /* synthetic */ UD e;

    public G60$c$a$b(G60 g60, tw3 tw32, UD uD) {
        this.c = g60;
        this.d = tw32;
        this.e = uD;
        super(0);
    }

    public final Object invoke() {
        float f5;
        int n3;
        Unit unit;
        int n4;
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        block7: {
            object3 = this.c;
            object2 = ((G60)object3).r;
            while (true) {
                object = ((LD)object2).a;
                bl2 = ((WR1)object).l();
                n4 = 1;
                if (!bl2) break block7;
                object = ((LD)object2).a;
                int n7 = ((WR1)object).k();
                if (n7 != 0) break;
                n7 = ((WR1)object).c - n4;
                Object[] objectArray = ((WR1)object).a;
                Object object4 = (aG2)((G60$a)objectArray[n7]).a.invoke();
                if (object4 == null) {
                    n7 = 1;
                } else {
                    long l2 = ((G60)object3).v;
                    n7 = (int)(((G60)object3).t1((aG2)object4, l2) ? 1 : 0);
                }
                if (n7 != 0) {
                    n7 = ((WR1)object).c - n4;
                    object = ((G60$a)((WR1)object).n((int)n7)).b;
                    unit = Unit.a;
                    object4 = tl2_2.b;
                    object.resumeWith(unit);
                    continue;
                }
                break block7;
                break;
            }
            object3 = new NoSuchElementException("MutableVector is empty.");
            throw object3;
        }
        if ((n3 = ((G60)object3).u) != 0) {
            long l3;
            object2 = ((G60)object3).s1();
            bl2 = false;
            object = null;
            if (object2 == null || (n3 = ((G60)object3).t1((aG2)object2, l3 = ((G60)object3).v)) != n4) {
                n4 = 0;
                unit = null;
            }
            if (n4 != 0) {
                ((G60)object3).u = false;
            }
        }
        object2 = this.e;
        this.d.e = f5 = G60.r1((G60)object3, (UD)object2);
        return Unit.a;
    }
}

