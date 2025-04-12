/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/*
 * Renamed from ts3
 */
public final class ts3_0 {
    public final Object a;
    public final List b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final Number f;

    public ts3_0() {
        this(null, 3);
    }

    public ts3_0(Object iterator, int n3) {
        boolean bl2;
        int n4 = 0;
        Object object = null;
        if ((n3 &= 1) != 0) {
            bl2 = false;
            iterator = null;
        }
        this.a = iterator;
        this.b = null;
        n3 = iterator instanceof String;
        String string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (n3 != 0) {
            iterator = (String)((Object)iterator);
            this.c = iterator;
            iterator = ((Object)StringsKt.m0((CharSequence)((Object)iterator))).toString();
            Locale locale = Locale.ROOT;
            iterator = ((String)((Object)iterator)).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(iterator, string2);
            this.d = iterator;
        } else {
            n3 = iterator instanceof Boolean;
            if (n3 != 0) {
                iterator = (Boolean)((Object)iterator);
                n3 = (int)(((Boolean)((Object)iterator)).booleanValue() ? 1 : 0);
                Object object2 = String.valueOf(n3 != 0);
                this.c = object2;
                bl2 = (Boolean)((Object)iterator);
                iterator = ((Object)StringsKt.m0(String.valueOf(bl2))).toString();
                object2 = Locale.ROOT;
                iterator = ((String)((Object)iterator)).toLowerCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(iterator, string2);
                this.d = iterator;
            } else {
                n3 = iterator instanceof Number;
                if (n3 != 0) {
                    iterator = (Number)((Object)iterator);
                    this.f = iterator;
                } else {
                    n3 = iterator instanceof List;
                    int n7 = 10;
                    if (n3 != 0) {
                        ArrayList arrayList = iterator;
                        arrayList = (List)((Object)iterator);
                        this.b = arrayList;
                        iterator = (Iterable)((Object)iterator);
                        n4 = yx_2.o((Iterable)((Object)iterator), n7);
                        arrayList = new ArrayList(n4);
                        iterator = iterator.iterator();
                        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                            object = iterator.next();
                            n7 = object instanceof String;
                            if (n7 != 0) {
                                object = ((Object)StringsKt.m0((String)object)).toString();
                                Locale locale = Locale.ROOT;
                                object = ((String)object).toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(object, string2);
                            }
                            arrayList.add(object);
                        }
                        this.e = arrayList;
                    } else {
                        n3 = iterator instanceof JSONArray;
                        if (n3 != 0) {
                            iterator = wm1_1.a((JSONArray)iterator);
                            this.b = iterator;
                            if (iterator != null) {
                                n3 = yx_2.o((Iterable)((Object)iterator), n7);
                                object = new ArrayList(n3);
                                iterator = ((ArrayList)((Object)iterator)).iterator();
                                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                    Object object3 = iterator.next();
                                    n7 = object3 instanceof String;
                                    if (n7 != 0) {
                                        object3 = ((Object)StringsKt.m0((String)object3)).toString();
                                        Locale locale = Locale.ROOT;
                                        object3 = ((String)object3).toLowerCase(locale);
                                        Intrinsics.checkNotNullExpressionValue(object3, string2);
                                    }
                                    ((ArrayList)object).add(object3);
                                }
                            }
                            this.e = object;
                        }
                    }
                }
            }
        }
    }

    public final boolean a() {
        boolean bl2;
        List list = this.b;
        if (list != null) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }
}

