/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.ril.ajio.plp.PLPExtras;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Zn0
 */
public final class zn0_2 {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final PLPExtras b(ri2_0 ri2_02) {
        ri2_0 ri2_03 = ri2_02;
        Intrinsics.checkNotNullParameter(ri2_02, "pdpExtras");
        Integer n3 = ri2_02.c;
        String string2 = ri2_02.d;
        String string3 = ri2_02.i;
        String string4 = ri2_02.e;
        ri2_03 = ri2_02.l;
        PLPExtras pLPExtras = new PLPExtras(n3, null, null, null, string2, string3, null, null, null, string4, null, null, null, null, null, null, (Bundle)ri2_03, null, null, null, null, null, null, false, false, false, null, null, null, null, -262706, 3);
        return pLPExtras;
    }

    public static final void c(b30_0 b30_02, Function2 function2) {
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        function2 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2);
        Integer n3 = 1;
        function2.invoke(b30_02, n3);
    }

    public static LP1 d(LP1 lP1, wi wi2) {
        PointerHoverIconModifierElement pointerHoverIconModifierElement = new PointerHoverIconModifierElement(wi2, false);
        return lP1.then(pointerHoverIconModifierElement);
    }

    public static final /* synthetic */ Integer e(int n3) {
        Integer n4 = n3;
        int n7 = -1 << -1;
        if (n3 == n7) {
            n4 = null;
        }
        return n4;
    }
}

