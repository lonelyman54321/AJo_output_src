/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  org.json.JSONArray
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.sis.SisStoreList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;

/*
 * Renamed from hU1
 */
public final class hu1_2 {
    public static SisStoreList a;
    public static boolean b = false;
    public static boolean c = false;
    public static Boolean d;
    public static String e = "";

    public static SharedPreferences a() {
        AJIOApplication.Companion.getClass();
        SharedPreferences sharedPreferences2 = AJIOApplication$a.a().getSharedPreferences("PREFERENCE_NAME", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        return sharedPreferences2;
    }

    public static boolean b(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            String string3 = "https://luxe.ajio.com";
            bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2 || (bl4 = Intrinsics.areEqual(string2, string3 = "http://luxe.ajio.com"))) {
                bl3 = true;
            }
        } else {
            String string4 = "luxe.ajio.com";
            bl3 = StringsKt.F(string2, string4, false);
        }
        return bl3;
    }

    public static boolean c(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            String string3 = "https://www.ajio.com";
            bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2 || (bl4 = Intrinsics.areEqual(string2, string3 = "http://www.ajio.com"))) {
                bl3 = true;
            }
        } else {
            String string4 = "www.ajio.com";
            bl3 = StringsKt.F(string2, string4, false);
        }
        return bl3;
    }

    public static boolean d() {
        Boolean bl2;
        int n3 = 1;
        Object object = d;
        boolean bl3 = false;
        if (object == null) {
            Object object2;
            Object object3;
            Object object4;
            block7: {
                object = z40_0.Companion;
                object4 = AJIOApplication.Companion;
                object3 = Q.a((AJIOApplication$a)object4, (z40$a)object).a.b("cms_experiment_flags");
                object2 = new JSONArray((String)object3);
                object3 = h40_0.a;
                object = Q.a((AJIOApplication$a)object4, (z40$a)object).a;
                object4 = "navigation_experiment3";
                object = ((cw)object).d((String)object4);
                object3 = "experiments";
                if ((object = object.optJSONArray((String)object3)) != null) {
                    int n4 = object.length();
                    for (int i3 = 0; i3 < n4; i3 += n3) {
                        String string2 = object.get(i3).toString();
                        int n7 = object2.length();
                        for (int i8 = 0; i8 < n7; i8 += n3) {
                            Object object5 = object2.get(i8).toString();
                            boolean bl4 = kotlin.text.b.i(string2, (String)object5, n3 != 0);
                            if (!bl4) continue;
                            object5 = z40_0.Companion;
                            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                            object5 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object5).a;
                            bl4 = ((ao0_0)object5).a(string2);
                            if (!bl4) continue;
                            object = object.get(i3).toString();
                            break block7;
                        }
                    }
                }
                object = "";
            }
            object3 = h40_0.a;
            object3 = z40_0.Companion;
            object2 = AJIOApplication.Companion;
            object4 = Q.a((AJIOApplication$a)object2, (z40$a)object3).a.d((String)object4);
            object3 = "isEnabled";
            int n8 = object4.optBoolean((String)object3);
            if (n8 == 0 || (n8 = ((String)object).length()) <= 0) {
                n3 = 0;
                bl2 = null;
            }
            d = bl2 = Boolean.valueOf(n3 != 0);
            object4 = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(bl2, object4) ? 1 : 0);
            if (n3 != 0) {
                e = object;
            }
        }
        if ((bl2 = d) != null) {
            bl3 = bl2;
        }
        return bl3;
    }

    public static boolean e() {
        String string2;
        String string3;
        boolean bl2 = hu1_2.d();
        if (bl2 && ((bl2 = Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIO.getStoreId())) || (bl2 = Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId())))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public static boolean f(Boolean bl2) {
        Serializable serializable;
        int n3 = 1;
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        boolean n4 = ((ao0_0)object).a("is_interstitial");
        Calendar calendar = null;
        if (!n4) {
            return false;
        }
        object = hu1_2.a();
        boolean bl3 = object.contains((String)((Object)(serializable = "is_navigation_unlocked"))) ^ n3;
        if (bl3) {
            object = Calendar.getInstance();
            long l2 = ((Calendar)object).getTimeInMillis();
            hu1_2.g(l2, n3, bl2);
        } else {
            long l3;
            long l4;
            long l7;
            object = hu1_2.a();
            long l8 = Calendar.getInstance().getTimeInMillis();
            l8 = object.getLong("current_date_milestone", l8);
            object = hu1_2.a();
            int n7 = object.getInt("next_milestone", n3);
            Calendar calendar2 = Calendar.getInstance();
            long l12 = calendar2.getTimeInMillis() - l8;
            serializable = z40$a.a((Context)AJIOApplication$a.a()).a.b("interstitial_milestone_range");
            Object object2 = new JSONArray((String)((Object)serializable));
            serializable = new ArrayList();
            int n8 = object2.length();
            for (int i3 = 0; i3 < n8; i3 += n3) {
                Object object3 = object2.get(i3);
                String string2 = "null cannot be cast to non-null type kotlin.Int";
                Intrinsics.checkNotNull(object3, string2);
                object3 = (Integer)object3;
                ((ArrayList)serializable).add(object3);
            }
            object2 = TimeUnit.MILLISECONDS;
            long l14 = ((TimeUnit)((Object)object2)).toDays(l12);
            int n10 = ((ArrayList)serializable).size();
            if (n7 < n10 && (l7 = (l4 = l14 - (l3 = (long)((Number)(serializable = (Number)((ArrayList)serializable).get(n7))).intValue())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
                calendar = Calendar.getInstance();
                long l15 = calendar.getTimeInMillis();
                int n14 = n7 + n3;
                hu1_2.g(l15, n14, bl2);
            } else {
                n3 = 0;
            }
        }
        return n3 != 0;
    }

    public static void g(long l2, int n3, Boolean bl2) {
        Boolean bl3 = Boolean.TRUE;
        boolean bl4 = Intrinsics.areEqual(bl2, bl3);
        if (bl4) {
            return;
        }
        bl2 = hu1_2.a().edit();
        bl2.putBoolean("is_navigation_unlocked", true);
        bl2.putLong("current_date_milestone", l2);
        bl2.putInt("next_milestone", n3);
        bl2.apply();
    }
}

