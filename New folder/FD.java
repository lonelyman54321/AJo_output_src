/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class FD
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public FD(dr0_0 dr0_02, float f5, float f6) {
        this.a = dr0_02;
        this.b = f5;
        this.c = f6;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        Object object4 = ((Number)object3).intValue();
        Object object5 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        int n3 = object4 & 0x51;
        object4 = 16;
        if (n3 == object4 && (n3 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            object3 = ((dr0_0)object).D();
            object5 = FD$a.$EnumSwitchMapping$0;
            object4 = ((Enum)object3).ordinal();
            Object object6 = 1;
            if ((object4 = (Object)object5[object4]) != object6) {
                LP1$a lP1$a = LP1$a.b;
                object6 = 2;
                float f5 = this.c;
                float f6 = this.b;
                if (object4 != object6) {
                    object6 = 3;
                    if (object4 != object6) {
                        object6 = 4;
                        if (object4 != object6) {
                            n3 = 5;
                            if (object4 != n3) {
                                n3 = 1932474986;
                                object2.K(n3);
                                object2.E();
                            } else {
                                n3 = 1932378762;
                                object2.K(n3);
                                object2.E();
                            }
                        } else {
                            object4 = 1931822219;
                            object2.K((int)object4);
                            object5 = j.d(j.k(lP1$a, f6), f5);
                            object3 = new ED((dr0_0)object);
                            n3 = -406398310;
                            u10 u102 = v10.c(n3, (fx0_2)object3, (b30_0)object2);
                            int n4 = 3072;
                            int n7 = 6;
                            lP1$a = null;
                            float f7 = 0.0f;
                            OA.a((LP1)object5, null, false, u102, (b30_0)object2, n4, n7);
                            object2.E();
                        }
                    } else {
                        n3 = 1931711146;
                        object2.K(n3);
                        object2.E();
                    }
                } else {
                    n3 = 1931302597;
                    object2.K(n3);
                    float f8 = uq0_0.g;
                    Object var11_12 = null;
                    int n8 = 14;
                    boolean bl2 = false;
                    object = j.d(j.k(h.i(lP1$a, f8, 0.0f, 0.0f, 0.0f, n8), f6), f5);
                    object3 = SP2.a(uq0_0.e);
                    object = x20_0.f(QV.a((LP1)object, (i13)object3));
                    object4 = 0;
                    object3 = null;
                    HA.a((LP1)object, (b30_0)object2, 0);
                    object2.E();
                }
            } else {
                n3 = 1931196298;
                object2.K(n3);
                object2.E();
            }
        }
        return Unit.a;
    }
}

