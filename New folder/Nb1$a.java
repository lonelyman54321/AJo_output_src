/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class Nb1$a
implements eL0$a {
    public final rq1_2 a;
    public final rq1_2 b;
    public final boolean c;

    public Nb1$a(hh3_2 hh3_22, hh3_2 hh3_23, boolean bl2) {
        this.a = hh3_22;
        this.b = hh3_23;
        this.c = bl2;
    }

    public final el0_0 a(Object object, ba2 ba22) {
        String string2;
        Object object2 = (object = (Uri)object).getScheme();
        boolean bl2 = Intrinsics.areEqual(object2, string2 = "http");
        if (!bl2 && !(bl2 = Intrinsics.areEqual(object2 = object.getScheme(), string2 = "https"))) {
            object = null;
        } else {
            nb1_1 nb1_12;
            string2 = object.toString();
            Object object3 = object = this.a;
            object3 = (hh3_2)object;
            Object object4 = object = this.b;
            object4 = (hh3_2)object;
            boolean bl3 = this.c;
            object2 = nb1_12;
            nb1_12 = new nb1_1(string2, ba22, (hh3_2)object3, (hh3_2)object4, bl3);
            object = nb1_12;
        }
        return object;
    }
}

