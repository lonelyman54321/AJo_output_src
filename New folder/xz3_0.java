/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.ResolveInfo
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.service.notification.StatusBarNotification
 *  android.widget.RemoteViews
 *  org.json.JSONObject
 */
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/*
 * Renamed from xz3
 */
public final class xz3_0 {
    public static HashMap a(Bundle bundle) {
        boolean bl2;
        bundle.remove("config");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            Object object2 = (String)iterator.next();
            boolean bl3 = ((String)object2).contains((CharSequence)(object = "wzrk_"));
            if (!bl3 && !(bl3 = ((String)object2).equals(object = "pt_id"))) continue;
            object = bundle.get((String)object2);
            boolean bl4 = object instanceof Bundle;
            if (bl4) {
                object = (Bundle)object;
                object2 = xz3_0.a((Bundle)object);
                hashMap.putAll((Map<Object, Object>)object2);
                continue;
            }
            object = bundle.get((String)object2);
            hashMap.put(object2, object);
        }
        return hashMap;
    }

    public static void b(Context object, Intent object2) {
        object2 = object2.getStringExtra("wzrk_pid");
        object = object.getApplicationContext();
        Object object3 = new ContextWrapper((Context)object);
        object = object3.getDir("pt_dir", 0);
        object3 = ((File)object).getAbsolutePath();
        if ((object = ((File)object).list()) != null) {
            for (Object object4 : object) {
                boolean bl2;
                Object object5;
                boolean bl3;
                String string2 = "Failed to clean up the following file: ";
                String string3 = "/";
                if (object2 != null && (bl3 = ((String)object4).contains((CharSequence)object2))) {
                    object5 = new File(string3 = n1.a((String)object3, string3, (String)object4));
                    bl2 = ((File)object5).delete();
                    if (bl2) continue;
                    string2.concat((String)object4);
                    ak2_1.a();
                    continue;
                }
                if (object2 != null || !(bl3 = ((String)object4).contains((CharSequence)(object5 = "null"))) || (bl2 = ((File)(object5 = new File(string3 = n1.a((String)object3, string3, (String)object4)))).delete())) continue;
                string2.concat((String)object4);
                ak2_1.a();
            }
        }
    }

    public static void c(Context context) {
        NotificationChannel notificationChannel;
        String string2 = "notification";
        if ((context = (NotificationManager)context.getSystemService(string2)) == null) {
            return;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && (notificationChannel = nz3.a((NotificationManager)context)) != null) {
            notificationChannel = nz3.a((NotificationManager)context);
            if (n3 >= n4 && notificationChannel != null && (n3 = w42_0.a(notificationChannel)) != 0) {
                rz3.a((NotificationManager)context);
            }
        }
    }

    public static Bundle d(JSONObject jSONObject) {
        boolean bl2;
        Bundle bundle = new Bundle();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2;
            int n3;
            String string3 = (String)iterator.next();
            String[] stringArray = jSONObject.optJSONArray(string3);
            String[] stringArray2 = jSONObject.optString(string3);
            String string4 = null;
            if (stringArray != null && (n3 = stringArray.length()) <= 0) {
                stringArray = new String[]{};
                bundle.putStringArray(string3, stringArray);
                continue;
            }
            if (stringArray != null && (string2 = stringArray.optString(0)) != null) {
                int n4 = stringArray.length();
                stringArray2 = new String[n4];
                for (int i3 = 0; i3 < (n3 = stringArray.length()); ++i3) {
                    stringArray2[i3] = string2 = stringArray.optString(i3);
                }
                bundle.putStringArray(string3, stringArray2);
                continue;
            }
            if (stringArray2 != null) {
                bundle.putString(string3, (String)stringArray2);
                continue;
            }
            stringArray = System.err;
            string4 = "unable to transform json to bundle ";
            stringArray2 = new StringBuilder(string4);
            stringArray2.append(string3);
            string3 = stringArray2.toString();
            stringArray.println(string3);
        }
        return bundle;
    }

    public static String e(Context object) {
        ApplicationInfo applicationInfo = object.getApplicationInfo();
        int n3 = applicationInfo.labelRes;
        object = n3 == 0 ? applicationInfo.nonLocalizedLabel.toString() : object.getString(n3);
        return object;
    }

    public static ArrayList f(Bundle bundle) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            boolean bl3 = string3.contains(string2 = "pt_bt");
            if (!bl3) continue;
            string3 = bundle.getString(string3);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static Bitmap g(Context object, String object2) {
        ox_0 ox_02;
        long l2 = -1;
        int n3 = -1;
        Object object3 = ox_02;
        ox_02 = new ox_0((String)object2, false, (Context)object, null, l2, n3);
        object = u91_0.a(U91$a.DOWNLOAD_ANY_BITMAP, ox_02);
        object2 = object.b;
        object3 = rs0$a_0.SUCCESS;
        if (object2 == object3) {
            return object.a;
        }
        Objects.toString(object2);
        b.j();
        return null;
    }

    public static int h(String string2, String string3) {
        try {
            return Color.parseColor((String)string2);
        }
        catch (Exception exception) {
            ak2_1.a();
            return Color.parseColor((String)string3);
        }
    }

    public static ArrayList i(Bundle bundle) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            boolean bl3 = string3.contains(string2 = "pt_dl");
            if (!bl3) continue;
            string3 = bundle.getString(string3);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static String j(Bundle bundle) {
        boolean bl2;
        Iterator iterator = bundle.keySet().iterator();
        String string2 = null;
        while (bl2 = iterator.hasNext()) {
            String string3;
            String string4 = (String)iterator.next();
            boolean bl3 = string4.contains(string3 = "pt_event_name");
            if (!bl3) continue;
            string2 = bundle.getString(string4);
        }
        return string2;
    }

    public static ArrayList k(Bundle bundle) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            boolean bl3 = string3.contains(string2 = "pt_img");
            if (!bl3) continue;
            string3 = bundle.getString(string3);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static Bitmap l(Context context, String string2) {
        String string3;
        boolean bl2;
        Context context2 = null;
        if (string2 != null && !(bl2 = string2.equals(string3 = "")) && (context = xz3_0.g(context, string2)) != null) {
            context2 = context;
        }
        return context2;
    }

    public static Notification m(int n3, Context statusBarNotificationArray) {
        String string2 = "notification";
        for (StatusBarNotification statusBarNotification : u42_0.a((NotificationManager)statusBarNotificationArray.getSystemService(string2))) {
            int n4 = statusBarNotification.getId();
            if (n4 != n3) continue;
            return statusBarNotification.getNotification();
        }
        return null;
    }

    public static ArrayList n(Bundle bundle) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            boolean bl3 = string3.contains(string2 = "pt_price");
            if (!bl3 || (bl3 = string3.contains(string2 = "pt_price_list"))) continue;
            string3 = bundle.getString(string3);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static ArrayList o(Bundle bundle) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            boolean bl3 = string3.contains(string2 = "pt_st");
            if (!bl3) continue;
            string3 = bundle.getString(string3);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static void p(int n3, String string2, RemoteViews remoteViews, Context context) {
        System.currentTimeMillis();
        string2 = xz3_0.g(context, string2);
        context = null;
        Xv2.c = false;
        if (string2 != null) {
            remoteViews.setImageViewBitmap(n3, (Bitmap)string2);
            System.currentTimeMillis();
            ak2_1.b();
        } else {
            ak2_1.a();
            n3 = 1;
            Xv2.c = n3;
        }
    }

    public static void q(Context object, CleverTapInstanceConfig object2, HashMap hashMap) {
        object = object2 != null ? a.k((Context)object, (CleverTapInstanceConfig)object2) : a.g((Context)object);
        if (object != null) {
            object2 = "Rating Submitted";
            ((a)object).p((String)object2, hashMap);
        } else {
            ak2_1.a();
        }
    }

    public static Bitmap r(Context context, int n3, String string2) {
        int n4;
        if (string2 != null && (n4 = string2.isEmpty()) == 0) {
            int n7 = xz3_0.h(string2, "#A6A6A6");
            context = t70.getDrawable(context, n3);
            Objects.requireNonNull(context);
            context = context.mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(n7, mode);
            context.setColorFilter((ColorFilter)porterDuffColorFilter);
            n3 = context.getIntrinsicWidth();
            n7 = context.getIntrinsicHeight();
            mode = Bitmap.Config.ARGB_8888;
            porterDuffColorFilter = Bitmap.createBitmap((int)n3, (int)n7, (Bitmap.Config)mode);
            string2 = new Canvas((Bitmap)porterDuffColorFilter);
            n4 = string2.getWidth();
            int n8 = string2.getHeight();
            context.setBounds(0, 0, n4, n8);
            context.draw((Canvas)string2);
            return porterDuffColorFilter;
        }
        return null;
    }

    public static void s(Context object, Intent intent) {
        Object object2 = object.getPackageManager();
        boolean bl2 = false;
        String string2 = null;
        object2 = object2.queryIntentActivities(intent, 0);
        object = object.getPackageName();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            string2 = ((ResolveInfo)object2.next()).activityInfo.packageName;
            bl2 = ((String)object).equals(string2);
            if (!bl2) continue;
            intent.setPackage((String)object);
            break;
        }
    }
}

