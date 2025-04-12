/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class hU2 {
    /*
     * Enabled aggressive block sorting
     */
    public static final LP1 a(LP1 lP1, dU2 dU22, pg2_0 pg2_02, boolean bl2, boolean bl3, TR0 tR0, wr1_1 wr1_12, wk2_1 wk2_12, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        boolean bl4;
        boolean bl5;
        wk2_1 wk2_13;
        pg2_0 pg2_03 = pg2_02;
        b30_0 b30_03 = b30_02;
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n4 = 0;
            Object var13_15 = null;
            wk2_13 = null;
        } else {
            wk2_13 = wk2_12;
        }
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        Context context = (Context)b30_03.j(vc3_12);
        Object object3 = Og2.a;
        object3 = (Ng2)b30_03.j((H30)object3);
        if (object3 != null) {
            b30_03.K(1586021609);
            bl5 = b30_03.J(context);
            bl4 = b30_03.J(object3);
            object2 = b30_02.v();
            if ((bl5 |= bl4) || object2 == (object = b30$a.a)) {
                object2 = new wh_0(context, (Ng2)object3);
                b30_03.o(object2);
            }
            object2 = (wh_0)object2;
            b30_02.E();
            object3 = object2;
        } else {
            n4 = 1586120933;
            b30_03.K(n4);
            b30_02.E();
            N32 n32 = N32.a;
            object3 = n32;
        }
        pg2_0 pg2_04 = pg2_0.Vertical;
        object = pg2_03 == pg2_04 ? RV.c : RV.b;
        object2 = lP1;
        object = lP1.then((LP1)object);
        object2 = object3.c();
        object = object.then((LP1)object2);
        object2 = O30.l;
        bp1_0 bp1_02 = (bp1_0)((Object)b30_03.j((H30)object2));
        bl4 = bl3 ^ true;
        bp1_0 bp1_03 = bp1_0.Rtl;
        if (bp1_02 == bp1_03 && pg2_03 != pg2_04) {
            bl4 = bl3;
        }
        Object object4 = object;
        dU2 dU23 = dU22;
        pg2_03 = pg2_02;
        bl5 = bl2;
        TR0 tR02 = tR0;
        return i.b((LP1)object, dU22, pg2_02, (Pg2)object3, bl2, bl4, tR0, wr1_12, wk2_13);
    }
}

