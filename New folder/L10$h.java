/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class L10$h
implements gx0_2 {
    public static final L10$h a;

    static {
        L10$h l10$h;
        a = l10$h = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                float f5;
                int n3;
                Object object4;
                int n4;
                Object object5;
                Object object6;
                Object object7;
                block6: {
                    object7 = object;
                    object7 = (wr1_2)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n4 = ((Number)object5).intValue();
                    object4 = "$this$item";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n3 = n4 & 0x51;
                    n4 = 16;
                    f5 = 2.2E-44f;
                    if (n3 != n4 || (n3 = (int)(object6.h() ? 1 : 0)) == 0) break block6;
                    object6.D();
                    break block7;
                }
                object7 = LP1$a.b;
                n4 = 1065353216;
                f5 = 1.0f;
                object7 = j.c((LP1)object7, f5);
                object5 = zp.c;
                object4 = Nc$a.m;
                boolean bl2 = false;
                object5 = oZ.a((zp$l)object5, (Gx$a)object4, (b30_0)object6, 0);
                int n7 = object6.F();
                Object object8 = object6.m();
                object7 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object6.i();
                boolean bl3 = mp2 instanceof mp;
                if (!bl3) break block8;
                object6.A();
                bl3 = object6.e();
                if (bl3) {
                    object6.C((Function0)((Object)serializable));
                } else {
                    object6.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object6, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object6, object8, (Function2)object5);
                object5 = N20$a.f;
                bl2 = object6.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = object6.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object6, n7, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object6, object7, (Function2)object5);
                object7 = AndroidCompositionLocals_androidKt.b;
                object7 = ((Context)object6.j((H30)object7)).getResources();
                n4 = R$string.no_reviews_to_display;
                object4 = object7.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object4, "getString(...)");
                object7 = Nc$a.n;
                object5 = new HorizontalAlignElement((Gx$a)object7);
                n3 = 20;
                float f6 = n3;
                object5 = h.e((LP1)object5, f6);
                int n8 = 124;
                long l2 = 0L;
                bl3 = false;
                mp2 = null;
                long l3 = 0L;
                long l4 = 0L;
                mm3_0.a((LP1)object5, (String)object4, l2, null, l3, null, l4, (b30_0)object6, 0, n8);
                object6.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

