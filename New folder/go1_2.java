/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$NotFoundException
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from GO1
 */
public final class go1_2 {
    public static final go1_2 a;

    static {
        go1_2 go1_22;
        a = go1_22 = new go1_2();
    }

    public static final ArrayList a(View view) {
        Throwable throwable2;
        Class<go1_2> clazz;
        block14: {
            ArrayList arrayList;
            block13: {
                clazz = go1_2.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                arrayList = "view";
                Intrinsics.checkNotNullParameter(view, (String)((Object)arrayList));
                arrayList = new ArrayList();
                Object object = xc3_0.i(view);
                if (object == null) break block13;
                object = xc3_0.b((View)object);
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break block13;
                    break;
                }
                {
                    Object object2 = object.next();
                    if (view == (object2 = (View)object2)) continue;
                    go1_2 go1_22 = a;
                    object2 = go1_22.c((View)object2);
                    arrayList.addAll(object2);
                    continue;
                }
            }
            return arrayList;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ArrayList b(View object) {
        String string2;
        int n3;
        int n4;
        String[] stringArray;
        Object object2;
        block11: {
            Throwable throwable2;
            Class<go1_2> clazz;
            block10: {
                block9: {
                    clazz = go1_2.class;
                    boolean bl2 = td0.b(clazz);
                    if (bl2) {
                        return null;
                    }
                    object2 = "view";
                    try {
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object2 = new ArrayList();
                        stringArray = xc3_0.h((View)object);
                        ((ArrayList)object2).add(stringArray);
                        stringArray = object.getTag();
                        if (stringArray == null) break block9;
                        stringArray = stringArray.toString();
                        ((ArrayList)object2).add(stringArray);
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                if ((stringArray = object.getContentDescription()) != null) {
                    stringArray = stringArray.toString();
                    ((ArrayList)object2).add(stringArray);
                }
                try {
                    n4 = object.getId();
                    n3 = -1;
                    if (n4 == n3) break block11;
                    stringArray = object.getResources();
                    int n7 = object.getId();
                    object = stringArray.getResourceName(n7);
                    stringArray = "resourceName";
                    Intrinsics.checkNotNullExpressionValue(object, (String)stringArray);
                    string2 = "/";
                    stringArray = new Regex(string2);
                    object = stringArray.e((CharSequence)object);
                    object = (Collection)object;
                    n4 = 0;
                    stringArray = null;
                    stringArray = new String[]{};
                    object = object.toArray(stringArray);
                    object = (String[])object;
                    n4 = ((Object)object).length;
                    n3 = 2;
                    if (n4 == n3) {
                        n4 = 1;
                        object = object[n4];
                        ((ArrayList)object2).add(object);
                    }
                    break block11;
                }
                catch (Resources.NotFoundException notFoundException) {}
            }
            td0.a(clazz, throwable2);
            return null;
        }
        object = new ArrayList();
        object2 = ((ArrayList)object2).iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            int n8;
            stringArray = object2.next();
            n3 = (stringArray = (String)stringArray).length();
            if (n3 <= 0 || (n3 = stringArray.length()) > (n8 = 100)) continue;
            stringArray = stringArray.toLowerCase();
            string2 = "this as java.lang.String).toLowerCase()";
            Intrinsics.checkNotNullExpressionValue(stringArray, string2);
            ((ArrayList)object).add(stringArray);
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean d(ArrayList var0, ArrayList var1_2) {
        block9: {
            var2_3 = go1_2.class;
            var3_4 = td0.b(var2_3);
            if (var3_4) {
                return false;
            }
            var4_5 /* !! */  = "indicators";
            Intrinsics.checkNotNullParameter(var0, var4_5 /* !! */ );
            var4_5 /* !! */  = "keys";
            Intrinsics.checkNotNullParameter(var1_2, var4_5 /* !! */ );
            var0 = var0.iterator();
lbl11:
            // 4 sources

            while (var3_4 = var0.hasNext()) {
                var4_5 /* !! */  = var0.next();
                var5_7 = go1_2.a;
                var5_7.getClass();
                var6_8 = td0.b(var5_7);
                if (var6_8) {
                    continue;
                }
                ** GOTO lbl23
            }
            return false;
            {
                catch (Throwable var0_1) {
                    break block9;
                }
lbl23:
                // 1 sources

                try {
                    var7_9 = var1_2.iterator();
                    while (var8_10 = var7_9.hasNext()) {
                        var9_11 /* !! */  = var7_9.next();
                        var8_10 = StringsKt.F(var4_5 /* !! */ , var9_11 /* !! */  = (String)var9_11 /* !! */ , false);
                        if (!var8_10) continue;
                        return true;
                    }
                    ** GOTO lbl11
                }
                catch (Throwable var4_6) {}
                {
                    td0.a(var5_7, var4_6);
                    ** GOTO lbl11
                }
            }
        }
        td0.a(var2_3, var0_1);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList c(View object) {
        Throwable throwable2;
        block7: {
            ArrayList<Object> arrayList;
            boolean bl2 = td0.b(this);
            if (bl2) {
                return null;
            }
            try {
                arrayList = new ArrayList<Object>();
            }
            catch (Throwable throwable2) {
                break block7;
            }
            int n3 = object instanceof EditText;
            if (n3 != 0) {
                return arrayList;
            }
            n3 = object instanceof TextView;
            if (n3 != 0) {
                int n4;
                object = (TextView)object;
                object = object.getText();
                object = object.toString();
                n3 = ((String)object).length();
                if (n3 <= 0) return arrayList;
                n3 = ((String)object).length();
                if (n3 >= (n4 = 100)) return arrayList;
                object = ((String)object).toLowerCase();
                String string2 = "this as java.lang.String).toLowerCase()";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                arrayList.add(object);
                return arrayList;
            }
            object = xc3_0.b((View)object);
            object = ((ArrayList)object).iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object2 = object.next();
                object2 = (View)object2;
                object2 = this.c((View)object2);
                arrayList.addAll((Collection<Object>)object2);
            }
            return arrayList;
        }
        td0.a(this, throwable2);
        return null;
    }
}

