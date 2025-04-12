/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lU1
 */
public final class lu1_0
extends RR1 {
    public final RR1 o;
    public boolean p;

    public lu1_0(int n3, y83 y832, Function1 function1, Function1 function12, RR1 rR1) {
        super(n3, y832, function1, function12);
        this.o = rR1;
        rR1.k();
    }

    public final void c() {
        boolean bl2 = this.c;
        if (!bl2) {
            super.c();
            bl2 = this.p;
            if (!bl2) {
                this.p = bl2 = true;
                RR1 rR1 = this.o;
                rR1.l();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final w83_0 v() {
        int[] nArray;
        int n3;
        int n4;
        Object object;
        int n7;
        int n8;
        Object object2;
        int n10;
        Object object3;
        boolean bl2;
        block12: {
            block13: {
                Object object4;
                bl2 = true;
                object3 = this.o;
                n10 = ((RR1)object3).m;
                if (n10 != 0) return new w83_0();
                n10 = ((v83_0)object3).c;
                if (n10 != 0) return new w83_0();
                object2 = this.h;
                n8 = this.b;
                n7 = 0;
                object = null;
                if (object2 != null) {
                    object4 = ((v83_0)object3).e();
                    object3 = A83.c((RR1)object3, this, (y83)object4);
                } else {
                    n4 = 0;
                    object3 = null;
                }
                object4 = A83.c;
                // MONITORENTER : object4
                A83.d(this);
                if (object2 == null || (n3 = ((ft2_0)object2).d) == 0) break block12;
                Object object5 = this.o;
                n3 = ((v83_0)object5).d();
                Object object6 = this.o;
                if ((n3 = (int)(Intrinsics.areEqual(object3 = this.y(n3, (HashMap)object3, (y83)(object6 = ((v83_0)object6).e())), object5 = w83$b.a) ? 1 : 0)) != 0) break block13;
                return object3;
            }
            object3 = this.o;
            object3 = ((RR1)object3).w();
            if (object3 != null) {
                object = "elements";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((pr1_1)object3).i((ft2_0)object2);
            }
            object3 = this.o;
            ((RR1)object3).B((pr1_1)object2);
            this.h = null;
        }
        this.a();
        object3 = this.o;
        n4 = ((v83_0)object3).d();
        if (n4 < n8) {
            object3 = this.o;
            ((RR1)object3).u();
        }
        object3 = this.o;
        object2 = ((v83_0)object3).e();
        object2 = ((y83)object2).c(n8);
        object = this.j;
        object2 = ((y83)object2).a((y83)object);
        ((v83_0)object3).r((y83)object2);
        object3 = this.o;
        ((RR1)object3).z(n8);
        object3 = this.o;
        n10 = this.d;
        this.d = n8 = -1;
        if (n10 >= 0) {
            nArray = ((RR1)object3).k;
            object = "<this>";
            Intrinsics.checkNotNullParameter(nArray, (String)object);
            n7 = nArray.length;
            n3 = n7 + 1;
            nArray = Arrays.copyOf(nArray, n3);
            nArray[n7] = n10;
            Intrinsics.checkNotNull(nArray);
            ((RR1)object3).k = nArray;
        } else {
            object3.getClass();
        }
        object3 = this.o;
        object2 = this.j;
        ((RR1)object3).A((y83)object2);
        object3 = this.o;
        object2 = this.k;
        object3.getClass();
        n8 = ((Object)object2).length;
        if (n8 != 0) {
            nArray = ((RR1)object3).k;
            n7 = nArray.length;
            if (n7 != 0) {
                object2 = rp_1.r(nArray, (int[])object2);
            }
            ((RR1)object3).k = (int[])object2;
        }
        object3 = Unit.a;
        // MONITOREXIT : object4
        this.m = bl2;
        n4 = (int)(this.p ? 1 : 0);
        if (n4 != 0) return w83$b.a;
        this.p = bl2;
        RR1 rR1 = this.o;
        rR1.l();
        return w83$b.a;
    }
}

