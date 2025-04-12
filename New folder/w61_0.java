/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 */
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/*
 * Renamed from W61
 */
public final class w61_0 {
    public static String a = "";
    public static final UserInformation b = VX0.a(AJIOApplication.Companion);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a() {
        void var1_3;
        int n3;
        Object object;
        Object object2;
        Object object3 = ",";
        String string2 = "";
        try {
            object2 = z40_0.Companion;
            object = AJIOApplication.Companion;
            object.getClass();
            object = AJIOApplication$a.a();
            object2.getClass();
            object2 = z40$a.a((Context)object);
            object2 = ((z40_0)object2).a;
            object = "cms_experiment_flags";
            object2 = ((ao0_0)object2).b((String)object);
            object = new JSONArray((String)object2);
            n3 = object.length();
            if (n3 > 0) {
                String string3 = object.join((String)object3);
            }
        }
        catch (Exception exception) {}
        object3 = new String[]{object3};
        n3 = 6;
        object = null;
        object3 = StringsKt.a0((CharSequence)var1_3, (String[])object3, false, 0, n3);
        ArrayList arrayList = new ArrayList();
        object3 = object3.iterator();
        boolean bl2;
        while (bl2 = object3.hasNext()) {
            Object object4;
            Object object5;
            int n4;
            Object e2 = object3.next();
            object2 = e2;
            object2 = (String)e2;
            int n7 = ((String)object2).length();
            if (n7 >= (n4 = 2) && (n7 = (int)(Intrinsics.areEqual(object5 = String.valueOf(((String)object2).charAt(0)), object4 = "\"") ? 1 : 0)) != 0) {
                n7 = ((String)object2).length();
                int n8 = 1;
                n7 -= n8;
                object5 = String.valueOf(((String)object2).charAt(n7));
                if ((n7 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0)) != 0) {
                    n7 = ((String)object2).length() - n8;
                    object2 = ((String)object2).substring(n8, n7);
                    object5 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                }
            }
            object5 = z40_0.Companion;
            object4 = AJIOApplication.Companion;
            object5 = Q.a((AJIOApplication$a)object4, (z40$a)object5).a;
            n3 = (int)(((ao0_0)object5).a((String)object2) ? 1 : 0);
            if (n3 == 0) continue;
            arrayList.add(e2);
        }
        return CollectionsKt.R(arrayList, null, null, null, null, 63);
    }

    public static final boolean b(String string2) {
        boolean bl2;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string3 = "cms_url_list";
        a = object = ((ao0_0)object).b(string3);
        boolean bl3 = og1_1.c();
        if (bl3) {
            return w61_0.c(string2);
        }
        bl3 = og1_1.c();
        if (!bl3 && (bl2 = w61_0.c(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static boolean c(String string2) {
        boolean bl2;
        block17: {
            block18: {
                boolean bl3;
                ArrayList<Object> arrayList;
                block16: {
                    int n3;
                    int n4;
                    boolean bl4;
                    arrayList = UrlHelper.Companion;
                    boolean n32 = ((UrlHelper$Companion)((Object)arrayList)).getISPREVIEW();
                    bl2 = true;
                    if (n32 || (bl4 = li0_2.a) && (n4 = ((String)((Object)(arrayList = a))).length()) == 0) break block17;
                    if (string2 == null || (n3 = string2.length()) == 0) break block18;
                    arrayList = new ArrayList<Object>();
                    Iterator iterator = new Iterator();
                    iterator = ((TypeToken)((Object)iterator)).getType();
                    Object object = new Gson();
                    String string3 = a;
                    iterator = ((Gson)object).fromJson(string3, (Type)((Object)iterator));
                    iterator = (ArrayList)((Object)iterator);
                    if (iterator == null) break block16;
                    try {
                        iterator = iterator.iterator();
                    }
                    catch (Exception exception) {
                        object = yn3_0.a;
                        ((yn3$a)object).e(exception);
                    }
                    while (true) {
                        boolean bl5 = iterator.hasNext();
                        if (!bl5) break;
                        object = iterator.next();
                        if ((object = (String)object) == null) continue;
                        int n7 = ((String)object).length();
                        if (n7 == 0) continue;
                        arrayList.add(object);
                        continue;
                        break;
                    }
                }
                if (bl3 = arrayList.contains(string2)) break block17;
            }
            bl2 = false;
        }
        return bl2;
    }
}

