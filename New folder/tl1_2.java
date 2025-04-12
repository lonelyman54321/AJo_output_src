/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Tl1
 */
public final class tl1_2
implements l70_0 {
    public static final tl1_2 a;

    static {
        tl1_2 tl1_22;
        a = tl1_22 = new Object();
    }

    public final boolean a(k70_0 object) {
        boolean bl2;
        String string2 = "contentType";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = k70$a.a;
        boolean bl3 = ((k70_0)object).b((k70_0)object2);
        boolean bl4 = true;
        if (bl3) {
            return bl4;
        }
        object2 = ((b41_0)object).b;
        bl3 = object2.isEmpty();
        if (!bl3) {
            String string3 = ((k70_0)object).c;
            object = ((k70_0)object).d;
            mz0_2 mz0_22 = mz0_2.a;
            object = object2 = new k70_0(string3, (String)object, mz0_22);
        }
        object = ((b41_0)object).toString();
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = "application/";
        boolean bl5 = StringsKt.c0((CharSequence)object, string2, bl4);
        if (!bl5 || !(bl2 = b.h((String)object, string2 = "+json", bl4))) {
            bl4 = false;
        }
        return bl4;
    }
}

