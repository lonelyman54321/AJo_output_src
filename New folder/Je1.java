/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class Je1 {
    public static final void a(LP1 lP1, Object object, int n3, i70_0 i70_02, String string2, b30_0 b30_02, int n4, int n7) {
        ie1_1 ie1_12;
        CF2 cF2;
        int n8;
        Object object2 = object;
        int n10 = -2124576199;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n10);
        int n14 = n7 & 8;
        Object object5 = n14 != 0 ? (object3 = i70$a.b) : i70_02;
        object3 = AndroidCompositionLocals_androidKt.b;
        object3 = (Context)((j30_0)object4).j((H30)object3);
        Object object6 = new pe1$a_0((Context)object3);
        ((pe1$a_0)object6).c = object2;
        ((pe1$a_0)object6).b();
        Object object7 = B63.c;
        ((pe1$a_0)object6).d((B63)object7);
        object6 = ((pe1$a_0)object6).a();
        int n15 = 8;
        object6 = u63.a(object6, (b30_0)object4, n15);
        pq$a_0 pq$a_0 = ((pq_0)object6).a();
        int n16 = pq$a_0 instanceof pq$a$c;
        String string3 = "";
        int n17 = 57344;
        if ((n16 != 0 || (n16 = (pq$a_0 = ((pq_0)object6).a()) instanceof pq$a$b) != 0 || (n16 = (pq$a_0 = ((pq_0)object6).a()) instanceof pq$a$a) != 0) && object2 != null) {
            n8 = -1369419378;
            ((j30_0)object4).K(n8);
            object6 = new pe1$a_0((Context)object3);
            ((pe1$a_0)object6).c = object3 = Integer.valueOf(n3);
            ((pe1$a_0)object6).b();
            ((pe1$a_0)object6).d((B63)object7);
            object3 = ((pe1$a_0)object6).a();
            object6 = u63.a(object3, (b30_0)object4, n15);
            n14 = n4 >> 9 & 0x70;
            int n18 = n4 << 6 & 0x380;
            n14 |= n18;
            n18 = n4 << 3 & n17;
            int n19 = n14 | n18;
            cF2 = null;
            ie1_12 = null;
            n16 = 0;
            pq$a_0 = null;
            int n20 = 104;
            object7 = string3;
            Pd1.a((im2)object6, string3, lP1, null, (i70_0)object5, 0.0f, null, (b30_0)object4, n19, n20);
            ((j30_0)object4).T(false);
        } else {
            ((j30_0)object4).K(-1368999111);
            n14 = n4 >> 9 & 0x70;
            int n21 = n4 << 6 & 0x380;
            n14 |= n21;
            n21 = n4 << 3 & n17;
            int n22 = n14 | n21;
            cF2 = null;
            ie1_12 = null;
            n16 = 0;
            pq$a_0 = null;
            int n24 = 104;
            object7 = string3;
            Pd1.a((im2)object6, string3, lP1, null, (i70_0)object5, 0.0f, null, (b30_0)object4, n22, n24);
            ((j30_0)object4).T(false);
        }
        cF2 = ((j30_0)object4).X();
        if (cF2 != null) {
            object4 = ie1_12;
            object3 = lP1;
            object2 = object;
            n8 = n3;
            object7 = object5;
            n16 = n4;
            n17 = n7;
            ie1_12 = new ie1_1(lP1, object, n3, (i70_0)object5, string3, n4, n7);
            cF2.d = ie1_12;
        }
    }
}

