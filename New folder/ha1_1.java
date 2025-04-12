/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ha1
 */
public final class ha1_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final List a(String list) {
        if (list == null) {
            return mz0_2.a;
        }
        Object object = et1_2.NONE;
        int n3 = 1;
        Object object2 = new dw0_2(n3);
        object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        int n4 = 0;
        object2 = null;
        block0: while (true) {
            if (n4 > (n3 = StringsKt.K((CharSequence)((Object)list)))) {
                boolean bl2 = object.isInitialized();
                if (!bl2) return mz0_2.a;
                return (List)object.getValue();
            }
            Object object3 = et1_2.NONE;
            Object object4 = new Object();
            object3 = yr1_2.a((et1_2)((Object)object3), (Function0)object4);
            int n7 = 0;
            object4 = null;
            int n8 = n4;
            while (true) {
                Object object5;
                Object object6;
                int n10;
                int n14;
                block20: {
                    Serializable serializable;
                    block16: {
                        int n15;
                        int n16;
                        String string2;
                        int n17;
                        block22: {
                            block24: {
                                ArrayList arrayList;
                                block17: {
                                    block18: {
                                        block23: {
                                            block14: {
                                                block15: {
                                                    int n18;
                                                    block21: {
                                                        block19: {
                                                            if (n8 > (n14 = StringsKt.K((CharSequence)((Object)list)))) break block17;
                                                            n14 = ((String)((Object)list)).charAt(n8);
                                                            if (n14 == (n10 = 44)) break block18;
                                                            n17 = 59;
                                                            if (n14 != n17) {
                                                                ++n8;
                                                                continue;
                                                            }
                                                            if (object4 == null) {
                                                                object4 = n8;
                                                            }
                                                            n14 = ++n8;
                                                            while (true) {
                                                                n18 = StringsKt.K((CharSequence)((Object)list));
                                                                string2 = "";
                                                                if (n14 > n18) break block14;
                                                                n18 = ((String)((Object)list)).charAt(n14);
                                                                if (n18 == n10 || n18 == n17) break block15;
                                                                n16 = 61;
                                                                if (n18 == n16) break;
                                                                ++n14;
                                                            }
                                                            n18 = n14 + 1;
                                                            n16 = ((String)((Object)list)).length();
                                                            if (n16 != n18) break block19;
                                                            object6 = n18;
                                                            object5 = new Pair(object6, string2);
                                                            break block20;
                                                        }
                                                        n15 = ((String)((Object)list)).charAt(n18);
                                                        if (n15 != (n16 = 34)) break block21;
                                                        n10 = n14 + 2;
                                                        serializable = new StringBuilder();
                                                        break block22;
                                                    }
                                                    for (n15 = n18; n15 <= (n16 = StringsKt.K((CharSequence)((Object)list))); ++n15) {
                                                        n16 = ((String)((Object)list)).charAt(n15);
                                                        if (n16 != n10 && n16 != n17) {
                                                            continue;
                                                        }
                                                        object6 = n15;
                                                        object5 = ha1_1.c(n18, n15, (String)((Object)list));
                                                        serializable = new Pair(object6, object5);
                                                        break block16;
                                                    }
                                                    object6 = n15;
                                                    object5 = ha1_1.c(n18, n15, (String)((Object)list));
                                                    serializable = new Pair(object6, object5);
                                                    break block16;
                                                }
                                                ha1_1.b((rq1_2)object3, (String)((Object)list), n8, n14, string2);
                                                break block23;
                                            }
                                            ha1_1.b((rq1_2)object3, (String)((Object)list), n8, n14, string2);
                                        }
                                        n8 = n14;
                                        continue;
                                    }
                                    arrayList = (ArrayList)object.getValue();
                                    n7 = object4 != null ? (Integer)object4 : n8;
                                    object2 = ha1_1.c(n4, n7, (String)((Object)list));
                                    n7 = (int)(object3.isInitialized() ? 1 : 0);
                                    object3 = n7 != 0 ? (List)object3.getValue() : mz0_2.a;
                                    object6 = new z31_0((String)object2, (List)object3);
                                    arrayList.add(object6);
                                    break block24;
                                }
                                arrayList = (ArrayList)object.getValue();
                                n7 = object4 != null ? (Integer)object4 : n8;
                                object2 = ha1_1.c(n4, n7, (String)((Object)list));
                                n7 = (int)(object3.isInitialized() ? 1 : 0);
                                object3 = n7 != 0 ? (List)object3.getValue() : mz0_2.a;
                                object6 = new z31_0((String)object2, (List)object3);
                                arrayList.add(object6);
                            }
                            n4 = ++n8;
                            continue block0;
                        }
                        while (n10 <= (n15 = StringsKt.K((CharSequence)((Object)list)))) {
                            int n19;
                            n15 = ((String)((Object)list)).charAt(n10);
                            if (n15 == n16) {
                                int n20;
                                int n21;
                                int n22;
                                for (n22 = n19 = n10 + 1; n22 < (n21 = ((String)((Object)list)).length()) && (n21 = (int)((String)((Object)list)).charAt(n22)) == (n20 = 32); ++n22) {
                                }
                                n21 = ((String)((Object)list)).length();
                                if (n22 == n21 || (n22 = (int)((String)((Object)list)).charAt(n22)) == n17) {
                                    object6 = n19;
                                    object5 = ((StringBuilder)serializable).toString();
                                    serializable = new Pair(object6, object5);
                                    break block16;
                                }
                            }
                            if (n15 == (n19 = 92) && n10 < (n19 = StringsKt.K((CharSequence)((Object)list)) + -2)) {
                                n15 = n10 + 1;
                                n15 = ((String)((Object)list)).charAt(n15);
                                ((StringBuilder)serializable).append((char)n15);
                                n10 += 2;
                                continue;
                            }
                            ((StringBuilder)serializable).append((char)n15);
                            ++n10;
                        }
                        object6 = n10;
                        object5 = ((StringBuilder)serializable).toString();
                        Intrinsics.checkNotNullExpressionValue(object5, "toString(...)");
                        string2 = "\"";
                        serializable = new StringBuilder(string2);
                        ((StringBuilder)serializable).append((String)object5);
                        object5 = ((StringBuilder)serializable).toString();
                        serializable = new Pair(object6, object5);
                    }
                    object5 = serializable;
                }
                object6 = (Number)((Pair)object5).a;
                n10 = ((Number)object6).intValue();
                object5 = (String)((Pair)object5).b;
                ha1_1.b((rq1_2)object3, (String)((Object)list), n8, n14, (String)object5);
                n8 = n10;
            }
            break;
        }
    }

    public static final void b(rq1_2 object, String string2, int n3, int n4, String string3) {
        if ((n3 = (string2 = ha1_1.c(n3, n4, string2)).length()) == 0) {
            return;
        }
        object = (ArrayList)object.getValue();
        a41_0 a41_02 = new a41_0(string2, string3);
        ((ArrayList)object).add(a41_02);
    }

    public static final String c(int n3, int n4, String string2) {
        String string3 = string2.substring(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        return ((Object)StringsKt.m0(string3)).toString();
    }
}

