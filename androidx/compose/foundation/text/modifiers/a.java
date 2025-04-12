/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class a
extends mo0_0
implements rp1_1,
it0_0,
c01_0 {
    public UX2 p;
    public final Function1 q;
    public final b r;

    public a() {
        throw null;
    }

    public a(Sl sl, xm3 xm32, RU0$a rU0$a, Function1 function1, int n3, boolean bl2, int n4, int n7, List list, Function1 function12, UX2 uX2, gy_1 gy_12) {
        b b2;
        this.p = uX2;
        this.q = null;
        Object object = b2;
        CharSequence charSequence = sl;
        b2 = new b(sl, xm32, rU0$a, function1, n3, bl2, n4, n7, list, function12, uX2, gy_12, null);
        this.r1(b2);
        this.r = b2;
        object = this.p;
        if (object != null) {
            return;
        }
        charSequence = "Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final /* synthetic */ void C0() {
    }

    public final void X(w32_0 object) {
        UX2 uX2 = this.p;
        if (uX2 != null) {
            wc3_1 wc3_12 = uX2.d;
            int n3 = 2;
            uX2.d = object = wc3_1.a(wc3_12, (w32_0)object, null, n3);
            object = uX2.b;
            object.f();
        }
    }

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return this.r.maxIntrinsicHeight(rj1, qj1, n3);
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return this.r.maxIntrinsicWidth(rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        return this.r.measure-3p2s80s(dl1_12, xk1_02, l2);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return this.r.minIntrinsicHeight(rj1, qj1, n3);
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return this.r.minIntrinsicWidth(rj1, qj1, n3);
    }

    public final void n(E60 e60) {
        this.r.n(e60);
    }
}

