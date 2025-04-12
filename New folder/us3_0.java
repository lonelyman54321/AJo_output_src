/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
import android.location.Location;
import com.clevertap.android.sdk.LocalDataStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/*
 * Renamed from us3
 */
public final class us3_0 {
    public final LocalDataStore a;

    public us3_0(LocalDataStore localDataStore) {
        Intrinsics.checkNotNullParameter(localDataStore, "localDataStore");
        this.a = localDataStore;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(ts3_0 object, ts3_0 object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "expected");
        Intrinsics.checkNotNullParameter(object2, "actual");
        Object object3 = ((ts3_0)object2).c;
        Object object4 = ((ts3_0)object2).d;
        boolean bl3 = false;
        if (object3 != null && (object3 = ((ts3_0)object).c) != null) {
            Intrinsics.checkNotNull(object4);
            object = ((ts3_0)object).d;
            Intrinsics.checkNotNull(object);
            return StringsKt.F((CharSequence)object4, (CharSequence)object, false);
        }
        boolean bl4 = ((ts3_0)object).a();
        ArrayList arrayList = ((ts3_0)object).e;
        if (bl4 && (object3 = ((ts3_0)object2).c) != null) {
            boolean bl5;
            Intrinsics.checkNotNull(arrayList);
            object = kz2_1.f(CollectionsKt.E(arrayList));
            object2 = us3$b.c;
            object = kz2_1.e((Sequence)object, (Function1)object2);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            object2 = new UM0$a((um0_2)object);
            do {
                if (!(bl5 = ((UM0$a)object2).hasNext())) return bl3;
                object = (String)((UM0$a)object2).next();
                Intrinsics.checkNotNull(object4);
            } while (!(bl5 = StringsKt.F((CharSequence)object4, (CharSequence)object, false)));
            return true;
        }
        bl4 = ((ts3_0)object).a();
        object4 = ((ts3_0)object2).e;
        if (bl4 && (bl4 = ((ts3_0)object2).a())) {
            boolean bl6;
            Intrinsics.checkNotNull(object4);
            object = new ArrayList();
            object2 = object4.iterator();
            while (bl4 = object2.hasNext()) {
                object3 = object2.next();
                bl6 = object3 instanceof String;
                if (!bl6) continue;
                ((ArrayList)object).add(object3);
            }
            object = CollectionsKt.o0(object);
            Intrinsics.checkNotNull(arrayList);
            object2 = new ArrayList();
            object3 = arrayList.iterator();
            while (bl6 = object3.hasNext()) {
                object4 = object3.next();
                boolean bl7 = object4 instanceof String;
                if (!bl7) continue;
                ((ArrayList)object2).add(object4);
            }
            bl4 = ((ArrayList)object2).isEmpty();
            if (bl4) return bl3;
            object2 = ((ArrayList)object2).iterator();
            do {
                if (!(bl4 = object2.hasNext())) return bl3;
            } while (!(bl4 = object.contains(object3 = (String)object2.next())));
            return true;
        }
        boolean bl8 = ((ts3_0)object2).a();
        if (!bl8) return bl3;
        object2 = ((ts3_0)object).c;
        if (object2 == null) return bl3;
        Intrinsics.checkNotNull(object4);
        object2 = new ArrayList();
        object3 = object4.iterator();
        while (bl2 = object3.hasNext()) {
            object4 = object3.next();
            bl3 = object4 instanceof String;
            if (!bl3) continue;
            ((ArrayList)object2).add(object4);
        }
        object2 = CollectionsKt.o0((Iterable)object2);
        object = ((ts3_0)object).d;
        return CollectionsKt.F(object2, object);
    }

    public static boolean b(List object, Object object2) {
        boolean bl2 = object2 instanceof String;
        boolean bl3 = true;
        Object object3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        String string2 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>";
        if (bl2) {
            block8: {
                boolean bl4;
                Object object4;
                object = (Iterable)object;
                Object object5 = CollectionsKt.E((Iterable)object);
                Object object6 = us3$c.c;
                object5 = kz2_1.e((Sequence)object5, (Function1)object6);
                Intrinsics.checkNotNull(object5, string2);
                object6 = new UM0$a((um0_2)object5);
                while (bl2 = ((UM0$a)object6).hasNext()) {
                    object5 = (String)((UM0$a)object6).next();
                    object4 = object2;
                    object4 = ((Object)StringsKt.m0((String)object2)).toString();
                    Locale locale = Locale.ROOT;
                    object4 = ((String)object4).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                    bl2 = Intrinsics.areEqual(object5, object4);
                    if (!bl2) continue;
                    break block8;
                }
                object = CollectionsKt.E((Iterable)object);
                object5 = us3$d.c;
                object = kz2_1.e((Sequence)object, (Function1)object5);
                Intrinsics.checkNotNull(object, string2);
                object5 = new UM0$a((um0_2)object);
                while (bl4 = ((UM0$a)object5).hasNext()) {
                    double d2 = ((Number)((UM0$a)object5).next()).doubleValue();
                    object = object2;
                    object = ((Object)StringsKt.m0((String)object2)).toString();
                    object4 = Locale.ROOT;
                    object = ((String)object).toLowerCase((Locale)object4);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    bl4 = Intrinsics.areEqual(d2, (Double)(object = je3_2.d((String)object)));
                    if (!bl4) continue;
                    break block8;
                }
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object2 instanceof Number;
        if (bl2) {
            block9: {
                boolean bl5;
                Object object7;
                double d5 = ((Number)object2).doubleValue();
                object = (Iterable)object;
                object2 = CollectionsKt.E((Iterable)object);
                Object object8 = us3$e.c;
                object2 = kz2_1.e((Sequence)object2, (Function1)object8);
                Intrinsics.checkNotNull(object2, string2);
                object8 = new UM0$a((um0_2)object2);
                while (object7 = ((UM0$a)object8).hasNext()) {
                    object2 = (Number)((UM0$a)object8).next();
                    double d7 = ((Number)object2).doubleValue();
                    double d9 = d7 - d5;
                    object7 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                    if (object7) continue;
                    break block9;
                }
                object = CollectionsKt.E((Iterable)object);
                object2 = us3$f.c;
                object = kz2_1.e((Sequence)object, (Function1)object2);
                Intrinsics.checkNotNull(object, string2);
                object2 = new UM0$a((um0_2)object);
                while (bl5 = ((UM0$a)object2).hasNext()) {
                    object = ((Object)StringsKt.m0((String)((UM0$a)object2).next())).toString();
                    object8 = Locale.ROOT;
                    object = ((String)object).toLowerCase((Locale)object8);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    bl5 = Intrinsics.areEqual((Double)(object = je3_2.d((String)object)), d5);
                    if (!bl5) continue;
                    break block9;
                }
                bl3 = false;
            }
            return bl3;
        }
        bl2 = object2 instanceof Boolean;
        if (bl2) {
            block10: {
                boolean bl6;
                object = CollectionsKt.E((Iterable)object);
                Object object9 = us3$g.c;
                object = kz2_1.e((Sequence)object, (Function1)object9);
                Intrinsics.checkNotNull(object, string2);
                object9 = new UM0$a((um0_2)object);
                while (bl6 = ((UM0$a)object9).hasNext()) {
                    object = (String)((UM0$a)object9).next();
                    object3 = object2;
                    boolean bl7 = (Boolean)object2;
                    object3 = String.valueOf(bl7);
                    bl6 = Intrinsics.areEqual(object, object3);
                    if (!bl6) continue;
                    break block10;
                }
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    /*
     * Handled duff style switch with additional control
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static boolean c(ss3_0 object, ts3_0 object2, ts3_0 ts3_02) {
        void var2_4;
        Intrinsics.checkNotNullParameter(object, "op");
        Object object3 = "expected";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = "actual";
        Intrinsics.checkNotNullParameter(var2_4, (String)object4);
        Object object5 = var2_4.a;
        boolean bl2 = false;
        int n3 = 1;
        if (object5 == null) {
            ss3_0 ss3_02 = ss3_0.NotSet;
            if (object != ss3_02) return bl2;
            return true;
        }
        object5 = us3$a.$EnumSwitchMapping$0;
        int n4 = ((Enum)object).ordinal();
        Object object6 = object5[n4];
        int n7 = 0;
        block11: do {
            switch (n7 == 0 ? object6 : n7) {
                default: {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                case 8: {
                    boolean bl3 = us3_0.a(object2, (ts3_0)var2_4);
                    if (bl3) return bl2;
                    n7 = 1;
                    continue block11;
                }
                case 7: {
                    return us3_0.a(object2, (ts3_0)var2_4);
                }
                case 6: {
                    double d2;
                    double d5;
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    Intrinsics.checkNotNullParameter(var2_4, (String)object4);
                    object = object2.b;
                    if (object == null) return bl2;
                    int n8 = object.size();
                    int n10 = 2;
                    object4 = null;
                    if (n8 < n10) {
                        boolean bl4 = false;
                        object = null;
                    }
                    if (object == null) return bl2;
                    if ((object = CollectionsKt.f0((Iterable)object, n10)) == null) return bl2;
                    object = (Iterable)object;
                    n10 = yx_2.o((Iterable)object, 10);
                    ArrayList<Object> arrayList = new ArrayList<Object>(n10);
                    object = object.iterator();
                    while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        object3 = object.next();
                        boolean bl5 = object3 instanceof String;
                        if (bl5) {
                            object3 = je3_2.d((String)object3);
                        } else {
                            bl5 = object3 instanceof Number;
                            if (bl5) {
                                d5 = ((Number)object3).doubleValue();
                                object3 = d5;
                            } else {
                                n10 = 0;
                                object3 = null;
                            }
                        }
                        arrayList.add(object3);
                    }
                    boolean bl6 = arrayList.contains(null);
                    if (bl6) {
                        return bl2;
                    }
                    object = var2_4.f;
                    if (object != null) {
                        d2 = ((Number)object).doubleValue();
                    } else {
                        object = var2_4.c;
                        if (object != null) {
                            object4 = je3_2.d((String)object);
                        }
                        if (object4 == null) return bl2;
                        d2 = (Double)object4;
                    }
                    object = arrayList.get(0);
                    Intrinsics.checkNotNull(object);
                    d5 = ((Number)object).doubleValue();
                    object = arrayList.get(n3);
                    Intrinsics.checkNotNull(object);
                    object = (Number)object;
                    double d7 = ((Number)object).doubleValue();
                    double d9 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1);
                    if (d9 > 0) return bl2;
                    Object object7 = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
                    if (object7 > 0) return bl2;
                    n7 = 1;
                    continue block11;
                }
                case 5: {
                    boolean bl7 = us3_0.e(object2, (ts3_0)var2_4);
                    if (bl7) return bl2;
                }
                case 1: {
                    return true;
                }
                case 4: {
                    return us3_0.e(object2, (ts3_0)var2_4);
                }
                case 3: {
                    return us3_0.f(object2, (ts3_0)var2_4, false);
                }
                case 2: {
                    return us3_0.f(object2, (ts3_0)var2_4, n3 != 0);
                }
                case 9: 
            }
            return bl2;
        } while (true);
        return bl2;
    }

    public static boolean d(double d2, Location location, Location location2) {
        Intrinsics.checkNotNullParameter(location, "expected");
        Intrinsics.checkNotNullParameter(location2, "actual");
        double d5 = location.getLatitude();
        double d7 = Math.PI / 180;
        d5 *= d7;
        double d9 = location2.getLatitude() * d7;
        double d12 = location2.getLatitude();
        double d13 = location.getLatitude();
        d12 = (d12 - d13) * d7;
        d13 = location2.getLongitude();
        double d14 = location.getLongitude();
        d13 = (d13 - d14) * d7;
        d14 = 2.0;
        d7 = Math.sin(d12 /= d14);
        d13 /= d14;
        d14 = Math.sin(d13);
        d7 *= d7;
        d5 = Math.cos(d5);
        d9 = Math.cos(d9) * d5 * d14 * d14 + d7;
        d14 = Math.sqrt(d9);
        d5 = Math.sqrt(1.0 - d9);
        d14 = Math.atan2(d14, d5);
        d5 = 12756.4;
        double d15 = (d14 *= d5) - d2;
        double d16 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
        boolean bl2 = d16 <= 0;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(ts3_0 object, ts3_0 object2) {
        Intrinsics.checkNotNullParameter(object, "expected");
        Object object3 = "actual";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = ((ts3_0)object).a();
        Object object4 = ((ts3_0)object).e;
        if (bl2 && (bl2 = ((ts3_0)object2).a())) {
            Intrinsics.checkNotNull(object4);
            object = CollectionsKt.i0((Iterable)object4);
            object2 = ((ts3_0)object2).e;
            Intrinsics.checkNotNull(object2);
            object2 = CollectionsKt.i0((Iterable)object2);
            return Intrinsics.areEqual(object, object2);
        }
        bl2 = ((ts3_0)object2).a();
        if (bl2) {
            object2 = ((ts3_0)object2).e;
            Intrinsics.checkNotNull(object2);
            object = ((ts3_0)object).a;
            return us3_0.b((List)object2, object);
        }
        bl2 = ((ts3_0)object).a();
        if (bl2) {
            Intrinsics.checkNotNull(object4);
            object = ((ts3_0)object2).a;
            return us3_0.b((List)object4, object);
        }
        object3 = ((ts3_0)object).f;
        object4 = ((ts3_0)object2).d;
        Number number = ((ts3_0)object2).f;
        if (object3 != null) {
            double d2;
            if (number != null) {
                d2 = number.doubleValue();
            } else {
                if (object4 == null) return false;
                object = je3_2.d((String)object4);
                if (object == null) return false;
                d2 = (Double)object;
            }
            Intrinsics.checkNotNull(object3);
            double d5 = ((Number)object3).doubleValue();
            double d7 = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
            if (d7 != false) return false;
            return true;
        }
        object = ((ts3_0)object).d;
        if (number != null) {
            if (object == null) return false;
            if ((object = je3_2.d((String)object)) == null) return false;
            double d9 = (Double)object;
            Intrinsics.checkNotNull(number);
            double d12 = number.doubleValue();
            double d13 = d12 - d9;
            Object object5 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object5 != false) return false;
            return true;
        }
        object2 = ((ts3_0)object2).c;
        if (object2 == null) return false;
        return Intrinsics.areEqual(object, object4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean f(ts3_0 object, ts3_0 object2, boolean object3) {
        double d2;
        double d5;
        Intrinsics.checkNotNullParameter(object, "expected");
        Intrinsics.checkNotNullParameter(object2, "actual");
        Number number = ((ts3_0)object2).f;
        Double d7 = null;
        boolean bl2 = false;
        if (number != null) {
            d5 = number.doubleValue();
        } else {
            object2 = ((ts3_0)object2).c;
            object2 = object2 != null ? je3_2.d((String)object2) : null;
            if (object2 == null) return bl2;
            d5 = (Double)object2;
        }
        object2 = ((ts3_0)object).b;
        if (object2 != null && (object2 = CollectionsKt.firstOrNull((List)object2)) != null) {
            boolean bl3 = object2 instanceof String;
            if (bl3) {
                object2 = je3_2.d((String)object2);
            } else {
                bl3 = object2 instanceof Number;
                if (bl3) {
                    double d9 = ((Number)object2).doubleValue();
                    object2 = d9;
                } else {
                    object2 = null;
                }
            }
            if (object2 != null) {
                double d12 = ((Number)object2).doubleValue();
                if (object3 != 0) {
                    Object object4 = d5 == d12 ? 0 : (d5 < d12 ? -1 : 1);
                    if (object4 >= 0) return bl2;
                    return true;
                }
                Object object5 = d5 == d12 ? 0 : (d5 > d12 ? 1 : -1);
                if (object5 <= 0) return bl2;
                return true;
            }
        }
        if ((object2 = ((ts3_0)object).f) != null) {
            d2 = ((Number)object2).doubleValue();
        } else {
            object = ((ts3_0)object).c;
            if (object != null) {
                d7 = je3_2.d((String)object);
            }
            if (d7 == null) return bl2;
            d2 = d7;
        }
        if (object3 != 0) {
            Object object6 = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
            if (object6 >= 0) return bl2;
            return true;
        }
        Object object7 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (object7 <= 0) return bl2;
        return true;
    }
}

