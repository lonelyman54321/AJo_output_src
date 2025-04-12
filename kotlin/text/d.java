/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

public final class d
extends Lambda
implements Function2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public d(List list, boolean bl2) {
        this.c = list;
        this.d = bl2;
        super(2);
    }

    public final Pair a(CharSequence object, int n3) {
        Object object2;
        int n4;
        Pair pair;
        block14: {
            block15: {
                int n7;
                int n8;
                boolean bl2;
                Iterator iterator;
                int n10;
                Iterator iterator2;
                block17: {
                    Intrinsics.checkNotNullParameter(object, "$this$$receiver");
                    iterator2 = this.c;
                    n10 = 0;
                    iterator = null;
                    pair = null;
                    bl2 = this.d;
                    n8 = 1;
                    if (bl2 || (n7 = iterator2.size()) != n8) break block17;
                    n4 = StringsKt.O((CharSequence)object, (String)((Object)(iterator2 = (String)CollectionsKt.a0((Iterable)((Object)iterator2)))), n3, false, n8 = 4);
                    if (n4 < 0) break block15;
                    object = n4;
                    object2 = new Pair(object, iterator2);
                    break block14;
                }
                if (n3 < 0) {
                    n3 = 0;
                    object2 = null;
                }
                n10 = object.length();
                IntRange intRange = new c(n3, n10, n8);
                n10 = object instanceof String;
                int n14 = intRange.c;
                int n15 = intRange.b;
                if (n10 != 0) {
                    if (n14 > 0 && n3 <= n15 || n14 < 0 && n15 <= n3) {
                        while (true) {
                            String string2;
                            block13: {
                                iterator = iterator2;
                                iterator = ((Iterable)((Object)iterator2)).iterator();
                                while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                    String string3 = string2 = (String)iterator.next();
                                    string3 = string2;
                                    Object object3 = object;
                                    object3 = (String)object;
                                    int n16 = string3.length();
                                    Object var19_20 = null;
                                    n7 = n3;
                                    n8 = (int)(b.l(0, n3, n16, string3, (String)object3, bl2) ? 1 : 0);
                                    if (n8 == 0) continue;
                                    break block13;
                                }
                                string2 = null;
                            }
                            string2 = string2;
                            if (string2 != null) {
                                object = n3;
                                object2 = new Pair(object, string2);
                                break block14;
                            }
                            if (n3 != n15) {
                                n3 += n14;
                                continue;
                            }
                            break;
                        }
                    }
                } else if (n14 > 0 && n3 <= n15 || n14 < 0 && n15 <= n3) {
                    while (true) {
                        String string4;
                        block16: {
                            iterator = iterator2;
                            iterator = ((Iterable)((Object)iterator2)).iterator();
                            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                String string5 = string4 = (String)iterator.next();
                                string5 = string4;
                                int n17 = string5.length();
                                n7 = 0;
                                intRange = null;
                                n8 = (int)(StringsKt__StringsKt.x(string5, 0, (CharSequence)object, n3, n17, bl2) ? 1 : 0);
                                if (n8 == 0) continue;
                                break block16;
                            }
                            string4 = null;
                        }
                        string4 = string4;
                        if (string4 != null) {
                            object = n3;
                            object2 = new Pair(object, string4);
                            break block14;
                        }
                        if (n3 == n15) break;
                        n3 += n14;
                    }
                }
            }
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n4 = ((String)((Pair)object2).b).length();
            object = n4;
            object2 = ((Pair)object2).a;
            pair = new Pair(object2, object);
        }
        return pair;
    }
}

