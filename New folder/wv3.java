/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class wv3
implements gx0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ EE3 d;
    public final /* synthetic */ wr1_1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ ln0 k;
    public final /* synthetic */ i13 l;

    public wv3(String string2, boolean bl2, boolean bl3, EE3 eE3, wr1_1 wr1_12, boolean bl4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, ln0 ln02, i13 i132) {
        this.a = string2;
        this.b = bl2;
        this.c = bl3;
        this.d = eE3;
        this.e = wr1_12;
        this.f = bl4;
        this.g = function2;
        this.h = function22;
        this.i = function23;
        this.j = function24;
        this.k = ln02;
        this.l = i132;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        float f5;
        wv3 wv32 = this;
        Object object4 = object;
        object4 = (Function2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n4 = ((Number)object6).intValue();
        Object object7 = "innerTextField";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n7 = n4 & 0xE;
        if (n7 == 0) {
            n7 = (int)(object5.x(object4) ? 1 : 0);
            if (n7 != 0) {
                n7 = 4;
                f5 = 5.6E-45f;
            } else {
                n7 = 2;
                f5 = 2.8E-45f;
            }
            n4 |= n7;
        }
        if ((n7 = n4 & 0x5B) == (n3 = 18) && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Object object8 = ck3.a;
            f5 = uq0_0.b;
            nk2_0 nk2_02 = new nk2_0(f5, f5, f5, f5);
            i13 i132 = wv32.l;
            boolean bl2 = wv32.b;
            n3 = (int)(bl2 ? 1 : 0);
            boolean bl3 = wv32.f;
            Object object9 = wv32.e;
            wr1_1 wr1_12 = object9;
            Object object10 = wv32.k;
            ln0 ln02 = object10;
            boolean n8 = bl2;
            object7 = new vv3_0(bl2, bl3, (wr1_1)object9, (ln0)object10, i132);
            u10 u102 = v10.c(1860776775, (fx0_2)object7, (b30_0)object5);
            int n10 = n4 << 3 & 0x70;
            object10 = wv32.i;
            int n14 = 224256;
            object7 = wv32.a;
            boolean bl4 = wv32.c;
            EE3 eE3 = wv32.d;
            Function2 function2 = wv32.g;
            object9 = wv32.h;
            Function2 function22 = wv32.j;
            n4 = 0;
            nk2_0 nk2_03 = nk2_02;
            nk2_02 = null;
            object6 = object8;
            object8 = object5;
            object5 = nk2_03;
            ((ck3)object6).b((String)object7, (Function2)object4, bl2, bl4, eE3, wr1_12, bl3, function2, (Function2)object9, (Function2)object10, function22, null, ln02, nk2_03, u102, (b30_0)object8, n10, n14);
        }
        return Unit.a;
    }
}

