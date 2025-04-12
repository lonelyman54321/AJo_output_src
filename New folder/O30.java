/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class O30 {
    public static final vc3_1 a;
    public static final vc3_1 b;
    public static final vc3_1 c;
    public static final vc3_1 d;
    public static final vc3_1 e;
    public static final vc3_1 f;
    public static final vc3_1 g;
    public static final vc3_1 h;
    public static final vc3_1 i;
    public static final vc3_1 j;
    public static final vc3_1 k;
    public static final vc3_1 l;
    public static final vc3_1 m;
    public static final vc3_1 n;
    public static final vc3_1 o;
    public static final vc3_1 p;
    public static final vc3_1 q;
    public static final vc3_1 r;
    public static final vc3_1 s;
    public static final nw0_1 t;

    static {
        vc3_1 vc3_12;
        Lambda lambda = O30$a.c;
        a = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$b.c;
        b = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$c.c;
        c = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$d.c;
        d = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$i.c;
        e = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$e.c;
        f = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$f.c;
        g = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$h.c;
        h = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$g.c;
        i = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$j.c;
        j = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$k.c;
        k = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$l.c;
        l = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$p.c;
        m = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$o.c;
        n = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$q.c;
        o = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$r.c;
        p = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$s.c;
        q = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$t.c;
        r = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = O30$m.c;
        s = vc3_12 = new H30((Function0)((Object)lambda));
        t = L30.c(O30$n.c);
    }

    public static final void a(sg2_0 sg2_02, Xw3 xw3, Function2 function2, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        Object object3 = sg2_02;
        Object object4 = xw3;
        Object object5 = function2;
        int n7 = n3;
        MB2 mB2 = null;
        int n8 = 874662829;
        Object object6 = b30_02;
        Object object7 = b30_02.g(n8);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = n3 & 8;
            n10 = n10 == 0 ? (int)(((j30_0)object7).J(sg2_02) ? 1 : 0) : (int)(((j30_0)object7).x(sg2_02) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x30;
        if (n14 == 0) {
            n14 = n7 & 0x40;
            n14 = n14 == 0 ? (int)(((j30_0)object7).J(object4) ? 1 : 0) : (int)(((j30_0)object7).x(object4) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x180) == 0) {
            n14 = ((j30_0)object7).x(object5) ? 1 : 0;
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n10 & 0x93) == (n4 = 146) && (n14 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            ((j30_0)object7).D();
            object4 = object5;
            object5 = object7;
        } else {
            Object object8 = sg2_02.getAccessibilityManager();
            object8 = a.c(object8);
            Object object9 = sg2_02.getAutofill();
            object9 = b.c(object9);
            MB2[] mB2Array = sg2_02.getAutofillTree();
            MB2 mB22 = c.c(mB2Array);
            mB2Array = sg2_02.getClipboardManager();
            MB2 mB23 = d.c(mB2Array);
            mB2Array = sg2_02.getDensity();
            object6 = f.c(mB2Array);
            mB2Array = sg2_02.getFocusOwner();
            MB2 mB24 = g.c(mB2Array);
            mB2Array = sg2_02.getFontLoader();
            object2 = h.c(mB2Array);
            ((MB2)object2).h = false;
            mB2Array = sg2_02.getFontFamilyResolver();
            MB2 mB25 = i.c(mB2Array);
            mB25.h = false;
            mB2Array = sg2_02.getHapticFeedBack();
            mB2 = j.c(mB2Array);
            mB2Array = sg2_02.getInputModeManager();
            object3 = k.c(mB2Array);
            mB2Array = sg2_02.getLayoutDirection();
            object = l.c(mB2Array);
            mB2Array = sg2_02.getTextInputService();
            object5 = m.c(mB2Array);
            mB2Array = sg2_02.getSoftwareKeyboardController();
            j30_0 j30_02 = object7;
            object7 = n.c(mB2Array);
            mB2Array = sg2_02.getTextToolbar();
            MB2 mB26 = o.c(mB2Array);
            mB2Array = p.c(object4);
            object4 = sg2_02.getViewConfiguration();
            MB2[] mB2Array2 = mB2Array;
            object4 = q.c(object4);
            mB2Array = sg2_02.getWindowInfo();
            Object object10 = object4;
            object4 = r.c(mB2Array);
            mB2Array = sg2_02.getPointerIconService();
            Object object11 = object4;
            object4 = s.c(mB2Array);
            mB2Array = sg2_02.getGraphicsContext();
            Object object12 = object4;
            object4 = e.c(mB2Array);
            int n15 = 19;
            mB2Array = new MB2[n15];
            mB2Array[0] = object8;
            mB2Array[1] = object9;
            n14 = 2;
            mB2Array[n14] = mB22;
            mB2Array[3] = mB23;
            mB2Array[4] = object6;
            mB2Array[5] = mB24;
            int n16 = 6;
            mB2Array[n16] = object2;
            mB2Array[7] = mB25;
            mB2Array[8] = mB2;
            int n17 = 9;
            mB2Array[n17] = object3;
            mB2Array[10] = object;
            mB2Array[11] = object5;
            mB2Array[12] = object7;
            mB2Array[13] = mB26;
            mB2Array[14] = mB2Array2;
            mB2Array[15] = object10;
            mB2Array[16] = object11;
            mB2Array[17] = object12;
            mB2Array[18] = object4;
            int n18 = n10 >> 3 & 0x70;
            int n19 = 8;
            object4 = function2;
            object5 = j30_02;
            L30.b(mB2Array, function2, j30_02, n18 |= n19);
        }
        object3 = ((j30_0)object5).X();
        if (object3 != null) {
            object = sg2_02;
            object2 = xw3;
            ((CF2)object3).d = object5 = new O30$u(sg2_02, xw3, (Function2)object4, n3);
        }
    }

    public static final void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder("CompositionLocal ");
        stringBuilder.append(string2);
        stringBuilder.append(" not present");
        string2 = stringBuilder.toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

