/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from gT1
 */
public final class gt1_0 {
    public static final Pattern p = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern q = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final hh3_2 f;
    public final hh3_2 g;
    public final rq1_2 h;
    public boolean i;
    public final rq1_2 j;
    public final rq1_2 k;
    public final rq1_2 l;
    public final hh3_2 m;
    public final hh3_2 n;
    public final boolean o;

    public gt1_0(String string2) {
        this.a = string2;
        boolean bl2 = false;
        this.b = null;
        this.c = null;
        Object object = new ArrayList();
        this.d = object;
        Object object2 = new nt1_2(this);
        object2 = yr1_2.b((Function0)object2);
        this.f = object2;
        super(this);
        object2 = yr1_2.b((Function0)object2);
        this.g = object2;
        object2 = et1_2.NONE;
        Object object3 = new ot1_0(this);
        this.h = object3 = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        object3 = new it1_1(this);
        this.j = object3 = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        object3 = new ht1_1(this);
        this.k = object3 = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        object3 = new kT1(this);
        object2 = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        this.l = object2;
        super(this);
        object2 = yr1_2.b((Function0)object2);
        this.m = object2;
        super(this);
        object2 = yr1_2.b((Function0)object2);
        this.n = object2;
        if (string2 != null) {
            super("^");
            object3 = p.matcher(string2);
            boolean n3 = ((Matcher)object3).find();
            if (!n3) {
                object3 = "http[s]?://";
                ((StringBuilder)object2).append((String)object3);
            }
            object3 = Pattern.compile("(\\?|\\#|$)").matcher(string2);
            ((Matcher)object3).find();
            int n4 = ((Matcher)object3).start();
            string2 = string2.substring(0, n4);
            object3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
            gt1_0.a(string2, object, (StringBuilder)object2);
            string2 = ".*";
            bl2 = StringsKt.F((CharSequence)object2, string2, false);
            if (!bl2 && !(bl2 = StringsKt.F((CharSequence)object2, (CharSequence)(object = "([^/]+?)"), false))) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            this.o = bl2;
            ((StringBuilder)object2).append("($|(\\?(.)*)|(\\#(.)*))");
            object = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullExpressionValue(object, "uriRegex.toString()");
            object2 = "\\E.*\\Q";
            this.e = string2 = kotlin.text.b.n((String)object, string2, (String)object2, false);
        }
    }

    public static void a(String string2, ArrayList arrayList, StringBuilder stringBuilder) {
        String string3;
        Matcher matcher = q.matcher(string2);
        int n3 = 0;
        String string4 = null;
        while (true) {
            int n4 = matcher.find();
            string3 = "substring(...)";
            if (n4 == 0) break;
            String string5 = matcher.group(1);
            String string6 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(string5, string6);
            arrayList.add(string5);
            n4 = matcher.start();
            if (n4 > n3) {
                n4 = matcher.start();
                string4 = string2.substring(n3, n4);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                string4 = Pattern.quote(string4);
                stringBuilder.append(string4);
            }
            string4 = "([^/]*?|)";
            stringBuilder.append(string4);
            n3 = matcher.end();
        }
        int n7 = string2.length();
        if (n3 < n7) {
            string2 = string2.substring(n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            string2 = Pattern.quote(string2);
            stringBuilder.append(string2);
        }
    }

    public static void g(Bundle bundle, String string2, String object, androidx.navigation.b object2) {
        if (object2 != null) {
            object2 = ((androidx.navigation.b)object2).a;
            object2.getClass();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(string2, "key");
            String string3 = "value";
            Intrinsics.checkNotNullParameter(object, string3);
            object = ((cU1)object2).d((String)object);
            ((cU1)object2).e(bundle, string2, object);
        } else {
            bundle.putString(string2, (String)object);
        }
    }

    public final int b(Uri object) {
        Object object2;
        if (object != null && (object2 = this.a) != null) {
            object = object.getPathSegments();
            object2 = Uri.parse((String)object2).getPathSegments();
            Intrinsics.checkNotNullExpressionValue(object, "requestedPathSegments");
            object = (Iterable)object;
            Intrinsics.checkNotNullExpressionValue(object2, "uriPathSegments");
            object2 = (Iterable)object2;
            return CollectionsKt.P((Iterable)object, (Iterable)object2).size();
        }
        return 0;
    }

    public final ArrayList c() {
        boolean bl2;
        ArrayList arrayList = this.d;
        Object object = ((Map)this.h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ArrayList arrayList3 = ((gT1$b)object.next()).b;
            cx_2.r(arrayList3, arrayList2);
        }
        arrayList = CollectionsKt.W(arrayList2, arrayList);
        return CollectionsKt.W((List)this.k.getValue(), arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle d(Uri object, Map map2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "deepLink");
        Intrinsics.checkNotNullParameter(map2, "arguments");
        Object object2 = (Pattern)this.f.getValue();
        if (object2 == null) return null;
        String string2 = object.toString();
        object2 = ((Pattern)object2).matcher(string2);
        if (object2 == null) {
            return null;
        }
        boolean bl4 = ((Matcher)object2).matches();
        if (!bl4) {
            return null;
        }
        string2 = new Bundle();
        boolean bl3 = this.e((Matcher)object2, (Bundle)string2, map2);
        if (!bl3) {
            return null;
        }
        object2 = (Boolean)this.g.getValue();
        bl3 = (Boolean)object2;
        if (bl3 && !(bl3 = this.f((Uri)object, (Bundle)string2, map2))) {
            return null;
        }
        object = object.getFragment();
        object2 = (Pattern)this.m.getValue();
        if (object2 != null) {
            object = String.valueOf(object);
            object = ((Pattern)object2).matcher((CharSequence)object);
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null && (bl3 = ((Matcher)object).matches())) {
            boolean bl5;
            object2 = (List)this.k.getValue();
            int n3 = yx_2.o((Iterable)object2, 10);
            ArrayList<Object> arrayList = new ArrayList<Object>(n3);
            object2 = object2.iterator();
            n3 = 0;
            Object object3 = null;
            while (bl5 = object2.hasNext()) {
                Object object4 = object2.next();
                int n4 = n3 + 1;
                if (n3 < 0) {
                    xx_2.n();
                    throw null;
                }
                object4 = (String)object4;
                object3 = Uri.decode((String)((Matcher)object).group(n4));
                androidx.navigation.b b2 = (androidx.navigation.b)map2.get(object4);
                String string3 = "value";
                try {
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    gt1_0.g((Bundle)string2, object4, (String)object3, b2);
                    object3 = Unit.a;
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                arrayList.add(object3);
                n3 = n4;
                continue;
                break;
            }
        }
        object = new gT1$c((Bundle)string2);
        object = RS1.a(map2, (Function1)object);
        bl2 = ((ArrayList)object).isEmpty() ^ true;
        if (!bl2) return string2;
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, Map map2) {
        boolean bl2;
        Object object = this.d;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        object = ((ArrayList)object).iterator();
        n3 = 0;
        int n4 = 0;
        Object object2 = null;
        while (bl2 = object.hasNext()) {
            Object object3 = object.next();
            int n7 = n4 + 1;
            if (n4 >= 0) {
                object3 = (String)object3;
                object2 = Uri.decode((String)matcher.group(n7));
                androidx.navigation.b b2 = (androidx.navigation.b)map2.get(object3);
                String string2 = "value";
                try {
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return false;
                }
                gt1_0.g(bundle, object3, (String)object2, b2);
                object2 = Unit.a;
                arrayList.add(object2);
                n4 = n7;
                continue;
            }
            xx_2.n();
            throw null;
        }
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = false;
        if (object != null && (bl2 = object instanceof gt1_0)) {
            boolean bl4;
            object = (gt1_0)object;
            String string2 = this.a;
            String string3 = ((gt1_0)object).a;
            bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2 && (bl2 = Intrinsics.areEqual(string3 = this.b, string2 = ((gt1_0)object).b)) && (bl4 = Intrinsics.areEqual(string3 = this.c, object = ((gt1_0)object).c))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean f(Uri uri, Bundle bundle, Map map2) {
        boolean bl2;
        gt1_0 gt1_02 = this;
        Map map3 = map2;
        Iterator iterator = ((Map)this.h.getValue()).entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            int n3;
            int n4;
            boolean bl4;
            Object object;
            Object object2;
            Object object3;
            boolean bl5;
            String string2;
            boolean bl6;
            Object object4;
            Object object5 = iterator.next();
            Iterator iterator2 = (String)object5.getKey();
            object5 = (gT1$b)object5.getValue();
            iterator2 = uri.getQueryParameters((String)((Object)iterator2));
            boolean bl7 = gt1_02.i;
            if (bl7 && (object4 = uri.getQuery()) != null && !(bl6 = Intrinsics.areEqual(object4, string2 = uri.toString()))) {
                iterator2 = kotlin.collections.a.b(object4);
            }
            Intrinsics.checkNotNullExpressionValue(iterator2, "inputParams");
            bl7 = false;
            object4 = null;
            string2 = DE.b(new Pair[0]);
            Object object6 = ((gT1$b)object5).b.iterator();
            while (bl5 = object6.hasNext()) {
                object3 = (String)object6.next();
                object2 = (androidx.navigation.b)map3.get(object3);
                if (object2 != null) {
                    object = ((androidx.navigation.b)object2).a;
                } else {
                    bl4 = false;
                    object = null;
                }
                if ((n4 = object instanceof vx_1) == 0 || (n3 = (int)(((androidx.navigation.b)object2).c ? 1 : 0)) != 0) continue;
                object2 = object;
                object2 = ((vx_1)object).h();
                ((cU1)object).e((Bundle)string2, (String)object3, object2);
            }
            iterator2 = ((Iterable)((Object)iterator2)).iterator();
            while (bl3 = iterator2.hasNext()) {
                object6 = (String)iterator2.next();
                object3 = ((gT1$b)object5).a;
                if (object3 != null) {
                    n3 = 32;
                    object3 = Pattern.compile((String)object3, n3);
                    object6 = ((Pattern)object3).matcher((CharSequence)object6);
                } else {
                    bl3 = false;
                    object6 = null;
                }
                if (object6 == null || !(bl5 = ((Matcher)object6).matches())) {
                    map3 = null;
                } else {
                    boolean bl8;
                    object3 = ((gT1$b)object5).b;
                    n4 = yx_2.o((Iterable)object3, 10);
                    object2 = new Object(n4);
                    object3 = ((ArrayList)object3).iterator();
                    n4 = 0;
                    String string3 = null;
                    while (bl8 = object3.hasNext()) {
                        Object object7 = object3.next();
                        int n7 = n4 + 1;
                        if (n4 >= 0) {
                            boolean bl9;
                            Object object8;
                            block29: {
                                block30: {
                                    block31: {
                                        boolean bl10;
                                        block28: {
                                            object7 = (String)object7;
                                            string3 = ((Matcher)object6).group(n7);
                                            if (string3 == null) {
                                                string3 = "";
                                            } else {
                                                object8 = "argMatcher.group(index + 1) ?: \"\"";
                                                Intrinsics.checkNotNullExpressionValue(string3, (String)object8);
                                            }
                                            object8 = (androidx.navigation.b)map3.get(object7);
                                            bl10 = string2.containsKey(object7);
                                            if (bl10) break block28;
                                            gt1_0.g((Bundle)string2, object7, string3, (androidx.navigation.b)object8);
                                            object8 = Unit.a;
                                        }
                                        bl10 = string2.containsKey(object7);
                                        if (!bl10) {
                                            bl9 = true;
                                            break block29;
                                        }
                                        if (object8 == null) break block30;
                                        object8 = ((androidx.navigation.b)object8).a;
                                        object4 = ((cU1)object8).a((Bundle)string2, (String)object7);
                                        object = "bundle";
                                        Intrinsics.checkNotNullParameter(string2, (String)object);
                                        object = "key";
                                        Intrinsics.checkNotNullParameter(object7, (String)object);
                                        bl4 = string2.containsKey(object7);
                                        if (!bl4) break block31;
                                        object4 = ((cU1)object8).c(object4, string3);
                                        ((cU1)object8).e((Bundle)string2, (String)object7, object4);
                                        break block30;
                                    }
                                    object4 = "There is no previous value in this bundle.";
                                    object8 = new IllegalArgumentException((String)object4);
                                    throw object8;
                                }
                                bl9 = false;
                                object8 = null;
                            }
                            try {
                                object8 = bl9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                object8 = Unit.a;
                            }
                            ((ArrayList)object2).add(object8);
                            n4 = n7;
                            bl7 = false;
                            object4 = null;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    continue;
                }
                return false;
            }
            object5 = bundle;
            bundle.putAll((Bundle)string2);
        }
        return true;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        String string2 = this.a;
        if (string2 != null) {
            n4 = string2.hashCode();
        } else {
            n4 = 0;
            string2 = null;
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }
}

