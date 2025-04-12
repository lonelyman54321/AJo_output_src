/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Cc2
 */
public final class cc2_0
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ CartEntry b;

    public cc2_0(CartEntry cartEntry, boolean bl2) {
        this.a = bl2;
        this.b = cartEntry;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object = new Ref$ObjectRef();
            LP1$a lP1$a = LP1$a.b;
            float f5 = 4;
            n3 = 8;
            float f6 = n3;
            int n7 = 10;
            object2 = h.i(lP1$a, f5, 0.0f, f6, 0.0f, n7);
            float f7 = 75;
            object2 = j.d((LP1)object2, f7);
            f7 = 0.8f;
            ((Ref$ObjectRef)object).element = object2 = c.a((LP1)object2, f7);
            int n8 = this.a;
            if (n8 == 0) {
                n8 = 0x3F000000;
                f7 = 0.5f;
                ((Ref$ObjectRef)object).element = object2 = be_1.b((LP1)object2, f7);
            }
            object3 = this.b;
            object2 = new bc2_0((CartEntry)object3, (Ref$ObjectRef)object);
            n4 = 328149517;
            u10 u102 = v10.c(n4, (fx0_2)object2, (b30_0)object4);
            int n10 = 3072;
            int n14 = 7;
            f5 = 9.8E-45f;
            OA.a(null, null, false, u102, (b30_0)object4, n10, n14);
        }
        return Unit.a;
    }
}

