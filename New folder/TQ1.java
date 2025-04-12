/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class TQ1 {
    public static final int a(int n3, ArrayList serializable) {
        tm2 tm22 = (tm2)CollectionsKt.S((List)((Object)serializable));
        int n4 = tm22.c;
        tm2 tm23 = (tm2)CollectionsKt.S((List)((Object)serializable));
        int n7 = tm23.c;
        if (n3 <= n7) {
            int n8;
            block8: {
                n4 = ((ArrayList)serializable).size();
                n7 = 1;
                n4 -= n7;
                int n10 = 0;
                while (n10 <= n4) {
                    int n14;
                    n8 = n10 + n4 >>> n7;
                    tm2 tm24 = (tm2)((ArrayList)serializable).get(n8);
                    int n15 = tm24.b;
                    if (n15 > n3) {
                        n14 = 1;
                    } else {
                        n14 = tm24.c;
                        if (n14 <= n3) {
                            n14 = -1;
                        } else {
                            n14 = 0;
                            tm24 = null;
                        }
                    }
                    if (n14 < 0) {
                        n10 = n8 + 1;
                        continue;
                    }
                    if (n14 > 0) {
                        n4 = n8 + -1;
                        continue;
                    }
                    break block8;
                }
                n8 = -(n10 += n7);
            }
            return n8;
        }
        String string2 = D70.b(n3, n4, "Index ", " should be less or equal than last line's end ");
        string2 = string2.toString();
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    public static final int b(int n3, List list) {
        int n4;
        block7: {
            int n7 = list.size();
            int n8 = 1;
            n7 -= n8;
            int n10 = 0;
            while (n10 <= n7) {
                int n14;
                n4 = n10 + n7 >>> n8;
                tm2 tm22 = (tm2)list.get(n4);
                int n15 = tm22.d;
                if (n15 > n3) {
                    n14 = 1;
                } else {
                    n14 = tm22.e;
                    if (n14 <= n3) {
                        n14 = -1;
                    } else {
                        n14 = 0;
                        tm22 = null;
                    }
                }
                if (n14 < 0) {
                    n10 = n4 + 1;
                    continue;
                }
                if (n14 > 0) {
                    n7 = n4 + -1;
                    continue;
                }
                break block7;
            }
            n4 = -(n10 += n8);
        }
        return n4;
    }

    public static final int c(float f5, List list) {
        int n3;
        block9: {
            float f6 = 0.0f;
            tm2 tm22 = null;
            float f7 = f5 - 0.0f;
            float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (f8 <= 0) {
                return 0;
            }
            tm22 = (tm2)CollectionsKt.S(list);
            f6 = tm22.g;
            float f11 = f5 - f6;
            f8 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (f8 >= 0) {
                return xx_2.h(list);
            }
            f8 = list.size();
            int n4 = 1;
            f8 -= n4;
            int n7 = 0;
            while (n7 <= f8) {
                float f12;
                int n8;
                n3 = n7 + f8 >>> n4;
                tm2 tm23 = (tm2)list.get(n3);
                float f14 = tm23.f;
                float f15 = f14 - f5;
                float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (f16 > 0) {
                    n8 = 1;
                    f12 = Float.MIN_VALUE;
                } else {
                    f12 = tm23.g;
                    float f17 = f12 - f5;
                    n8 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    if (n8 <= 0) {
                        n8 = -1;
                        f12 = 0.0f / 0.0f;
                    } else {
                        n8 = 0;
                        f12 = 0.0f;
                        tm23 = null;
                    }
                }
                if (n8 < 0) {
                    n7 = n3 + 1;
                    continue;
                }
                if (n8 > 0) {
                    f8 = n3 + -1;
                    continue;
                }
                break block9;
            }
            n3 = -(n7 += n4);
        }
        return n3;
    }

    public static final void d(ArrayList arrayList, long l2, Function1 function1) {
        int n3 = arrayList.size();
        for (int i3 = TQ1.a(mm3.e(l2), arrayList); i3 < n3; ++i3) {
            tm2 tm22 = (tm2)arrayList.get(i3);
            int n4 = tm22.b;
            int n7 = mm3.d(l2);
            if (n4 >= n7) break;
            n4 = tm22.b;
            n7 = tm22.c;
            if (n4 == n7) continue;
            function1.invoke(tm22);
        }
    }

    public static String e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object = "/switch-stores";
        boolean bl2 = StringsKt.F(string2, (CharSequence)object, false);
        if (bl2) {
            string2 = "switch-store-route";
        } else {
            object = "/feed";
            bl2 = StringsKt.F(string2, (CharSequence)object, false);
            if (bl2) {
                string2 = "feed?postId={postId}";
            } else {
                object = "/explore";
                bl2 = StringsKt.F(string2, (CharSequence)object, false);
                if (bl2) {
                    string2 = "explore-brands";
                } else {
                    object = "/my-account";
                    bl2 = StringsKt.F(string2, (CharSequence)object, false);
                    if (bl2) {
                        string2 = "account";
                    } else {
                        boolean bl3;
                        object = h40_0.a;
                        bl2 = h40_0.c();
                        string2 = bl2 && (bl2 = StringsKt.F(string2, (CharSequence)(object = "/home"), false)) ? "home-page" : ((bl2 = h40_0.c()) && (bl3 = StringsKt.F(string2, (CharSequence)(object = "/categories"), false)) ? "category-page" : "not-configured");
                    }
                }
            }
        }
        return string2;
    }
}

