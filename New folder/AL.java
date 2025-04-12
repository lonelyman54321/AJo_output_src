/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;

public final class AL {
    public static final void a(LP1 lP1, Function1 function1, b30_0 object, int n3) {
        Object object2;
        object = object.g(-932836462);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = ((j30_0)object).J(lP1) ? 1 : 0;
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = ((j30_0)object).x(function1) ? 1 : 0;
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x13) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = a.a(lP1, function1);
            Q93.b((b30_0)object, (LP1)object2);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new AL$a(lP1, function1, n3);
        }
    }
}

