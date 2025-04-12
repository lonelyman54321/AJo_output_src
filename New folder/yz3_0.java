/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyManager
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.variables.callbacks.VariablesChangedCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from yz3
 */
public final class yz3_0 {
    public static final Pattern a = Pattern.compile("\\s+");

    public static boolean a(String string2, HashSet object) {
        if (object != null && string2 != null) {
            boolean bl2;
            object = ((HashSet)object).iterator();
            while (bl2 = object.hasNext()) {
                String string3 = (String)object.next();
                bl2 = string2.equalsIgnoreCase(string3);
                if (!bl2) continue;
                return true;
            }
        }
        return false;
    }

    public static ArrayList b(JSONArray jSONArray) {
        int n3;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            String string2 = jSONArray.getString(i3);
            try {
                arrayList.add(string2);
                continue;
            }
            catch (JSONException jSONException) {
                jSONException.getMessage();
                b.j();
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap c(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            object = (String)object;
            Object object2 = jSONObject.get(object);
            boolean bl3 = object2 instanceof JSONObject;
            if (bl3) {
                object2 = (JSONObject)object2;
                object = yz3_0.c((JSONObject)object2);
                hashMap.putAll(object);
            }
            try {
                object2 = jSONObject.get(object);
                hashMap.put(object, object2);
            }
            catch (Throwable throwable) {
            }
        }
        return hashMap;
    }

    public static Bitmap d(Drawable drawable2) {
        int n3 = drawable2 instanceof BitmapDrawable;
        if (n3 != 0) {
            return ((BitmapDrawable)drawable2).getBitmap();
        }
        n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        Canvas canvas = new Canvas(bitmap);
        int n7 = canvas.getWidth();
        int n8 = canvas.getHeight();
        drawable2.setBounds(0, 0, n7, n8);
        drawable2.draw(canvas);
        return bitmap;
    }

    public static String e(Context context) {
        int n3;
        block14: {
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            if (telephonyManager == null) {
                return "Unavailable";
            }
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 30;
            if (n4 >= n7) {
                block15: {
                    block13: {
                        String string2 = "android.permission.READ_PHONE_STATE";
                        try {
                            n3 = t70.checkSelfPermission(context, string2);
                            if (n3 != 0) break block13;
                        }
                        catch (Throwable throwable) {}
                        try {
                            n3 = uv1_0.a(telephonyManager);
                            break block14;
                        }
                        catch (SecurityException securityException) {
                            securityException.getMessage();
                            b.c();
                            break block15;
                        }
                    }
                    b.c();
                }
                n3 = 0;
                context = null;
            } else {
                n3 = telephonyManager.getNetworkType();
            }
        }
        int n8 = 20;
        if (n3 != n8) {
            switch (n3) {
                default: {
                    return "Unknown";
                }
                case 13: {
                    return "4G";
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: {
                    return "3G";
                }
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: 
            }
            return "2G";
        }
        return "5G";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static rs0_1 f(boolean bl2, Context context, rs0_1 object) {
        Bitmap bitmap = ((rs0_1)object).a;
        if (bitmap != null) {
            return object;
        }
        if (!bl2) return object;
        Object object2 = "bitmap";
        try {
            object = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            object = object.getApplicationLogo(applicationInfo);
            if (object != null) {
                Bitmap bitmap2 = yz3_0.d((Drawable)object);
                Intrinsics.checkNotNullParameter(bitmap2, (String)object2);
                rs0$a_0 rs0$a_0 = rs0$a_0.SUCCESS;
                long l2 = 0L;
                Object object3 = object;
                return new rs0_1(bitmap2, rs0$a_0, l2, null);
            }
            String string2 = "Logo is null";
            object = new Exception(string2);
            throw object;
        }
        catch (Exception exception) {}
        object = context.getPackageManager();
        context = context.getApplicationInfo();
        context = object.getApplicationIcon((ApplicationInfo)context);
        Bitmap bitmap3 = yz3_0.d((Drawable)context);
        Intrinsics.checkNotNullParameter(bitmap3, (String)object2);
        rs0$a_0 rs0$a_0 = rs0$a_0.SUCCESS;
        long l3 = 0L;
        Object object4 = object2;
        object2 = new rs0_1(bitmap3, rs0$a_0, l3, null);
        return object2;
    }

    public static String g(String string2) {
        if (string2 == null) {
            return null;
        }
        string2 = a.matcher(string2).replaceAll("");
        Locale locale = Locale.ENGLISH;
        return string2.toLowerCase(locale);
    }

    public static int h(Context object, String string2) {
        if (object != null) {
            Resources resources = object.getResources();
            object = object.getPackageName();
            return resources.getIdentifier(string2, "drawable", (String)object);
        }
        return -1;
    }

    public static boolean i(Context serviceInfoArray, Class clazz) {
        if (clazz == null) {
            return false;
        }
        PackageManager packageManager = serviceInfoArray.getPackageManager();
        serviceInfoArray = serviceInfoArray.getPackageName();
        int n3 = 4;
        serviceInfoArray = packageManager.getPackageInfo((String)serviceInfoArray, n3);
        serviceInfoArray = serviceInfoArray.services;
        int n4 = serviceInfoArray.length;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object;
            try {
                object = serviceInfoArray[n3];
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object = ((ServiceInfo)object).name;
            String string2 = clazz.getName();
            boolean bl2 = ((String)object).equals(string2);
            if (!bl2) continue;
            b.j();
            return true;
            nameNotFoundException.getLocalizedMessage();
            b.c();
            break;
        }
        return false;
    }

    public static void j(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback != null) {
            Looper looper;
            Looper looper2 = Looper.myLooper();
            if (looper2 == (looper = Looper.getMainLooper())) {
                variablesChangedCallback.run();
            } else {
                looper = Looper.getMainLooper();
                looper2 = new Handler(looper);
                looper2.post((Runnable)variablesChangedCallback);
            }
        }
    }

    public static void k(Context object, Intent intent) {
        Object object2 = object.getPackageManager();
        boolean bl2 = false;
        String string2 = null;
        if ((object2 = object2.queryIntentActivities(intent, 0)) != null) {
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
}

