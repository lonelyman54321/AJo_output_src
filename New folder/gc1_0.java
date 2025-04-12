/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gc1
 */
public final class gc1_0 {
    public final Context a;

    public gc1_0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static boolean a(ce_2 ce_22) {
        int n3;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(ce_22, "buffer");
        ce_2 ce_23 = new ce_2();
        long l2 = ce_22.b;
        long l3 = 64;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        long l7 = l4 < 0 ? l2 : l3;
        l3 = 0L;
        try {
            ce_22.k(ce_23, l3, l7);
            n7 = 0;
            ce_22 = null;
        }
        catch (EOFException eOFException) {
            return false;
        }
        do {
            n3 = 1;
            n7 += n3;
            n4 = ce_23.g();
            if (n4 != 0) break;
            n4 = ce_23.K();
            boolean bl2 = Character.isISOControl(n4);
            if (!bl2) continue;
            n4 = Character.isWhitespace(n4) ? 1 : 0;
            if (n4 != 0) continue;
            return false;
        } while (n7 < (n4 = 16));
        return n3 != 0;
    }
}

