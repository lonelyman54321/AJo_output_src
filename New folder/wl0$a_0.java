/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WL0$a
 */
public final class wl0$a_0 {
    public static void a(Pair object, Pair object2) {
        Intrinsics.checkNotNullParameter(object, "urlMeta");
        Intrinsics.checkNotNullParameter(object2, "storePair");
        String string2 = (String)((Pair)object).a;
        long l2 = System.currentTimeMillis();
        long l3 = wl0_1.f;
        l2 += l3;
        fm0_0 fm0_02 = (fm0_0)((Pair)object2).a;
        object2 = (yf1_2)((Pair)object2).b;
        object = (ie0_0)((Object)((Pair)object).b);
        int[] nArray = WL0$a$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        String string3 = "url";
        if (n3 != n4 && n3 != (n4 = 2)) {
            int n7 = 3;
            if (n3 == n7) {
                fm0_02.getClass();
                Intrinsics.checkNotNullParameter(string2, string3);
                object = fm0_02.a;
                ((vi_2)object).g(l2, string2);
            }
        } else {
            object2.getClass();
            Intrinsics.checkNotNullParameter(string2, string3);
            ((yf1_2)object2).a.g(l2, string2);
            fm0_02.getClass();
            Intrinsics.checkNotNullParameter(string2, string3);
            object = fm0_02.a;
            ((vi_2)object).g(l2, string2);
        }
    }
}

