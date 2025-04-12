/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class QP1$a
extends Lambda
implements Function0 {
    public final /* synthetic */ QP1 c;

    public QP1$a(QP1 qP1) {
        this.c = qP1;
        super(0);
    }

    public final Object invoke() {
        OP1 oP1;
        Object object;
        Iterator iterator = this.c;
        int n3 = 0;
        eu_1 eu_12 = null;
        ((QP1)((Object)iterator)).f = false;
        HashSet hashSet = new HashSet();
        WR1 wR1 = ((QP1)((Object)iterator)).d;
        int n4 = wR1.c;
        Object[] objectArray = ((QP1)((Object)iterator)).e;
        if (n4 > 0) {
            object = wR1.a;
            int n7 = 0;
            oP1 = null;
            do {
                Object object2 = (xp1_0)object[n7];
                OP1 oP12 = (OP1)objectArray.a[n7];
                object2 = ((xp1_0)object2).y.e;
                boolean bl2 = ((LP1$c)object2).m;
                if (!bl2) continue;
                QP1.b((LP1$c)object2, oP12, hashSet);
            } while (++n7 < n4);
        }
        wR1.g();
        objectArray.g();
        wR1 = ((QP1)((Object)iterator)).b;
        n4 = wR1.c;
        iterator = ((QP1)((Object)iterator)).c;
        if (n4 > 0) {
            objectArray = wR1.a;
            do {
                object = (eu_1)objectArray[n3];
                oP1 = (OP1)((WR1)((Object)iterator)).a[n3];
                boolean bl3 = object.m;
                if (!bl3) continue;
                QP1.b((LP1$c)object, oP1, hashSet);
            } while (++n3 < n4);
        }
        wR1.g();
        ((WR1)((Object)iterator)).g();
        iterator = hashSet.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            eu_12 = (eu_1)iterator.next();
            eu_12.t1();
        }
        return Unit.a;
    }
}

