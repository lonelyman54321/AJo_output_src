/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import java.util.List;

/*
 * Renamed from Xf3
 */
public final class xf3_0
implements n60_0 {
    public final /* synthetic */ yf3_2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ xf3_0(yf3_2 yf3_22, long l2, int n3) {
        this.a = yf3_22;
        this.b = l2;
        this.c = n3;
    }

    public final void accept(Object object) {
        object = (We0)object;
        yf3_2 yf3_22 = this.a;
        ct3.h(yf3_22.i);
        Object object2 = ((We0)object).a;
        yf3_22.c.getClass();
        object2 = Te0.a(((We0)object).c, (List)object2);
        Xm2 xm2 = yf3_22.d;
        xm2.getClass();
        int n3 = ((Object)object2).length;
        xm2.G(n3, (byte[])object2);
        wp3 wp32 = yf3_22.a;
        int n4 = ((Object)object2).length;
        wp32.f(n4, xm2);
        long l2 = this.b;
        long l3 = -9223372036854775807L;
        long l4 = Long.MAX_VALUE;
        long l7 = ((We0)object).b;
        Object object3 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
        if (object3 == false) {
            object = yf3_22.i;
            l3 = ((d)object).t;
            long l8 = l3 - l4;
            object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object3 == false) {
                object3 = 1;
            } else {
                object3 = 0;
                object = null;
            }
            ct3.f((boolean)object3);
        } else {
            object = yf3_22.i;
            l3 = ((d)object).t;
            long l12 = l3 - l4;
            object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            l2 = object3 == false ? (l2 += l7) : l7 + l3;
        }
        int n7 = ((Object)object2).length;
        wp3 wp33 = yf3_22.a;
        int n8 = this.c;
        wp33.a(l2, n8, n7, 0, null);
    }
}

