/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Op3
 */
public final class op3_0 {
    public static final void a(qz1_2 qz1_22, ReturnRequest returnRequest, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Intrinsics.checkNotNullParameter(returnRequest, "returnRequest");
        object = object.g(-1943076259);
        double d2 = 0.5;
        float f5 = (float)d2;
        long l2 = xx_1.F;
        nz nz4 = oz_0.a(l2, f5);
        LP1$a lP1$a = LP1$a.b;
        float f6 = 16;
        Object object2 = j.c(h.i(lP1$a, f6, 0.0f, f6, f6, 2), 1.0f);
        int n4 = 48;
        float f7 = n4;
        LP1 lP1 = j.d((LP1)object2, f7);
        int n7 = 10;
        f5 = n7;
        rp2_0 rp2_02 = SP2.a(f5);
        Mp3 mp3 = new Mp3(qz1_22, returnRequest);
        u10 u102 = o20_0.a;
        lP1$a = null;
        int n8 = 806879280;
        f6 = 5.5297544E-10f;
        int n10 = 412;
        ME.b(mp3, lP1, false, rp2_02, nz4, null, null, u102, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new np3_0(qz1_22, returnRequest, n3);
        }
    }
}

