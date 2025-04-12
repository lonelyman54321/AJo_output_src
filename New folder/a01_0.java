/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.h;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from A01
 */
public final class a01_0 {
    public static final boolean b;
    public final h a;

    static {
        boolean bl2;
        cd2_2.a.getClass();
        Random random = cd2_2.b.e();
        double d2 = random.nextDouble();
        double d5 = 1.0E-4;
        double d7 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (d7 <= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            random = null;
        }
        b = bl2;
    }

    public a01_0(Context context) {
        h h3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = h3 = new h(context);
    }

    public final void a(Bundle bundle, String string2) {
        boolean bl2 = b;
        if (bl2) {
            h h3 = null;
            String string3 = "gps";
            bl2 = StringsKt.F(string2, string3, false);
            if (bl2) {
                h3 = this.a;
                h3.a(bundle, string2);
            }
        }
    }
}

