/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ae0
 */
public final class ae0_1 {
    public Ae0$b a;
    public O b;
    public String c;
    public int d;

    public final String a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "cipherText");
        Intrinsics.checkNotNullParameter(string3, "key");
        Object object = "plainText";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Object object2 = StringsKt.d0(string2, '[');
        if (object2 && (object2 = StringsKt.I(string2, ']'))) {
            object = Ae0$c.$EnumSwitchMapping$0;
            int n3 = this.a.ordinal();
            object2 = object[n3];
            String string4 = this.c;
            O o3 = this.b;
            Object object3 = 1;
            if (object2 == object3) {
                object = q50_0.d;
                boolean bl2 = ((HashSet)object).contains(string3);
                if (bl2) {
                    return o3.Z(string2, string4);
                }
            } else {
                string2 = o3.Z(string2, string4);
            }
        }
        return string2;
    }

    public final String b(String string2, String object) {
        boolean bl2;
        String string3 = "plainText";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = Ae0$c.$EnumSwitchMapping$0;
        Ae0$b ae0$b = this.a;
        int n3 = ae0$b.ordinal();
        int n4 = object2[n3];
        n3 = 1;
        if (n4 == n3 && (bl2 = ((HashSet)(object2 = (Object)q50_0.d)).contains(object))) {
            Intrinsics.checkNotNullParameter(string2, string3);
            bl2 = StringsKt.d0(string2, '[');
            if (!bl2 || !(bl2 = StringsKt.I(string2, ']'))) {
                object = this.b;
                string3 = this.c;
                string2 = ((O)object).a0(string2, string3);
            }
        }
        return string2;
    }
}

