/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.d;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.window.PopupLayout;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Mi
 */
public final class mi_0
extends Lambda
implements Function2 {
    public final /* synthetic */ PopupLayout c;
    public final /* synthetic */ ib3_0 d;

    public mi_0(PopupLayout popupLayout, tr1_0 tr1_02) {
        this.c = popupLayout;
        this.d = tr1_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block11: {
            block10: {
                float f5;
                int n3;
                int n4;
                block9: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    n4 = ((Number)object2).intValue() & 3;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n4 != n3 || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block9;
                    object.D();
                    break block10;
                }
                n3 = 0;
                f5 = 0.0f;
                Object object3 = ji_0.d;
                object2 = new AppendedSemanticsElement((Function1)object3, false);
                Object object4 = this.c;
                int n7 = object.x(object4);
                Object object5 = object.v();
                if (n7 != 0 || object5 == (object3 = b30$a.a)) {
                    object5 = new ki_0((PopupLayout)((Object)object4));
                    object.o(object5);
                }
                object5 = (Function1)object5;
                object2 = androidx.compose.ui.layout.d.a((LP1)object2, (Function1)object5);
                n3 = (int)(((PopupLayout)((Object)object4)).getCanCalculatePosition() ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1065353216;
                    f5 = 1.0f;
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    object4 = null;
                }
                object2 = be_1.b((LP1)object2, f5);
                object3 = (tr1_0)this.d;
                object4 = new li_0((tr1_0)object3);
                n7 = 606497925;
                object4 = v10.c(n7, (fx0_2)object4, (b30_0)object);
                object3 = ni_0.a;
                int n8 = object.F();
                Object object6 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block11;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)((Object)serializable));
                } else {
                    object.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object6, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = object.v(), serializable = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                n4 = 6;
                object2 = n4;
                ((u10)object4).invoke(object, object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

