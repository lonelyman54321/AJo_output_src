/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from k70
 */
public final class k70_0
extends b41_0 {
    public static final k70_0 e;
    public final String c;
    public final String d;

    static {
        k70_0 k70_02;
        mz0_2 mz0_22 = mz0_2.a;
        String string2 = "*";
        e = k70_02 = new k70_0(string2, string2, mz0_22);
    }

    public k70_0(String string2, String string3, String string4, List list) {
        super(string4, list);
        this.c = string2;
        this.d = string3;
    }

    public k70_0(String string2, String string3, List list) {
        Intrinsics.checkNotNullParameter(string2, "contentType");
        Intrinsics.checkNotNullParameter(string3, "contentSubtype");
        Intrinsics.checkNotNullParameter(list, "parameters");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string2);
        charSequence.append('/');
        charSequence.append(string3);
        charSequence = charSequence.toString();
        this(string2, string3, (String)charSequence, list);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b(k70_0 iterator) {
        Object object;
        Intrinsics.checkNotNullParameter(iterator, "pattern");
        Object object2 = ((k70_0)((Object)iterator)).c;
        String string2 = "*";
        boolean bl2 = Intrinsics.areEqual(object2, string2);
        boolean bl3 = true;
        if (!bl2 && !(bl2 = kotlin.text.b.i((String)(object2 = ((k70_0)((Object)iterator)).c), (String)(object = this.c), bl3))) {
            return false;
        }
        object2 = ((k70_0)((Object)iterator)).d;
        boolean bl4 = Intrinsics.areEqual(object2, string2);
        if (!bl4 && !(bl2 = kotlin.text.b.i((String)object2, (String)(object = this.d), bl3))) {
            return false;
        }
        iterator = ((b41_0)((Object)iterator)).b.iterator();
        do {
            block13: {
                block12: {
                    boolean bl5;
                    block11: {
                        if (!(bl2 = iterator.hasNext())) {
                            return bl3;
                        }
                        object2 = (a41_0)iterator.next();
                        object = ((a41_0)object2).a;
                        bl5 = Intrinsics.areEqual(object, string2);
                        object2 = ((a41_0)object2).b;
                        if (!bl5) break block11;
                        bl4 = Intrinsics.areEqual(object2, string2);
                        if (!bl4) {
                            Object object3;
                            object = this.b;
                            bl5 = object instanceof Collection;
                            if (bl5) {
                                object3 = object;
                                object3 = (Collection)object;
                                bl5 = object3.isEmpty();
                                if (bl5) return false;
                            }
                            object = ((Iterable)object).iterator();
                            do {
                                if (!(bl5 = object.hasNext())) return false;
                            } while (!(bl5 = kotlin.text.b.i((String)(object3 = ((a41_0)object.next()).b), (String)object2, bl3)));
                        }
                        break block12;
                    }
                    object = this.a((String)object);
                    bl5 = Intrinsics.areEqual(object2, string2);
                    if (!bl5) break block13;
                    if (object == null) return false;
                }
                bl2 = true;
                continue;
            }
            bl2 = kotlin.text.b.i((String)object, (String)object2, bl3);
        } while (bl2);
        return false;
    }

    public final k70_0 c(String object) {
        Object object2;
        Object object3;
        String string2;
        block6: {
            block5: {
                boolean bl2;
                boolean bl3;
                block7: {
                    Object object4;
                    boolean bl4;
                    block8: {
                        string2 = "charset";
                        Intrinsics.checkNotNullParameter(string2, "name");
                        Intrinsics.checkNotNullParameter(object, "value");
                        object3 = this.b;
                        boolean bl32 = object3.size();
                        if (!bl32) break block6;
                        bl3 = true;
                        if (bl32 == bl3) break block7;
                        object2 = object3;
                        object2 = (Iterable)object3;
                        bl4 = object2 instanceof Collection;
                        if (!bl4) break block8;
                        object4 = object2;
                        object4 = (Collection)object2;
                        bl4 = object4.isEmpty();
                        if (bl4) break block6;
                    }
                    object2 = ((Iterable)object2).iterator();
                    while (bl4 = object2.hasNext()) {
                        object4 = (a41_0)object2.next();
                        String string3 = ((a41_0)object4).a;
                        boolean bl5 = kotlin.text.b.i(string3, string2, bl3);
                        if (!bl5 || !(bl4 = kotlin.text.b.i((String)(object4 = ((a41_0)object4).b), (String)object, bl3))) continue;
                        break block5;
                    }
                    break block6;
                }
                boolean bl6 = false;
                object2 = (a41_0)object3.get(0);
                String string4 = ((a41_0)object2).a;
                boolean bl7 = kotlin.text.b.i(string4, string2, bl3);
                if (!bl7 || !(bl2 = kotlin.text.b.i((String)(object2 = ((a41_0)object2).b), (String)object, bl3))) break block6;
            }
            return this;
        }
        object3 = (Collection)object3;
        Object object5 = new a41_0(string2, (String)object);
        object = CollectionsKt.X(object3, object5);
        object3 = this.d;
        string2 = this.a;
        object5 = this.c;
        object2 = new k70_0((String)object5, (String)object3, string2, (List)object);
        return object2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block3: {
            block2: {
                boolean bl3;
                boolean bl4 = object instanceof k70_0;
                if (!bl4) break block2;
                object = (k70_0)object;
                String string2 = this.c;
                Object object2 = ((k70_0)object).c;
                bl2 = true;
                bl4 = kotlin.text.b.i(string2, (String)object2, bl2);
                if (bl4 && (bl4 = kotlin.text.b.i((String)(object2 = this.d), string2 = ((k70_0)object).d, bl2)) && (bl3 = Intrinsics.areEqual(object2 = this.b, object = ((b41_0)object).b))) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Object object = Locale.ROOT;
        String string2 = this.c.toLowerCase((Locale)object);
        String string3 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        int n3 = string2.hashCode();
        int n4 = n3 * 31;
        object = this.d.toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        int n7 = ((String)object).hashCode() + n4 + n3;
        return ((Object)this.b).hashCode() * 31 + n7;
    }
}

