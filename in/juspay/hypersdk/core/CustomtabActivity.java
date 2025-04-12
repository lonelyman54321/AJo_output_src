/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import in.juspay.hyper.core.JuspayLogger;
import java.util.ArrayList;

public class CustomtabActivity
extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabActivity";
    private Boolean isFirstResume;

    public CustomtabActivity() {
        Boolean bl2;
        this.isFirstResume = bl2 = Boolean.TRUE;
    }

    public static ArrayList getCustomTabsPackages(Context context, String iterator) {
        context = context.getPackageManager();
        iterator = Uri.parse((String)((Object)iterator));
        String string2 = "android.intent.action.VIEW";
        Object object = new Intent(string2, (Uri)iterator);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            n3 = 131072;
            iterator = context.queryIntentActivities((Intent)object, n3);
        } else {
            iterator = context.queryIntentActivities((Intent)object, 0);
        }
        object = new ArrayList();
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            string2 = (ResolveInfo)iterator.next();
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            String string3 = ((ResolveInfo)string2).activityInfo.packageName;
            intent.setPackage(string3);
            if ((intent = context.resolveService(intent, 0)) == null) continue;
            ((ArrayList)object).add(string2);
        }
        return object;
    }

    public static boolean isChromeInstalled(ArrayList object) {
        boolean bl2;
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = ((ResolveInfo)object.next()).activityInfo.packageName;
            String string3 = "com.android.chrome";
            bl2 = string2.equals(string3);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private void launchInBrowser(String string2) {
        string2 = Uri.parse((String)string2);
        Intent intent = new Intent("android.intent.action.VIEW", (Uri)string2);
        this.startActivity(intent);
    }

    public void launchIntentChooser(ArrayList parcelableArray, String string2) {
        boolean bl2;
        ArrayList<Intent> arrayList = new ArrayList<Intent>();
        parcelableArray = parcelableArray.iterator();
        while (bl2 = parcelableArray.hasNext()) {
            Object object = (ResolveInfo)parcelableArray.next();
            Uri uri = Uri.parse((String)string2);
            String string3 = "android.intent.action.VIEW";
            Intent intent = new Intent(string3, uri);
            object = object.activityInfo.packageName;
            intent.setPackage((String)object);
            arrayList.add(intent);
        }
        string2 = Intent.createChooser((Intent)((Intent)arrayList.remove(0)), (CharSequence)"Select app");
        parcelableArray = new Parcelable[]{};
        parcelableArray = arrayList.toArray(parcelableArray);
        string2.putExtra("android.intent.extra.INITIAL_INTENTS", parcelableArray);
        this.startActivity((Intent)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void loadUrl(String string2) {
        Exception exception2;
        Object object;
        Object object2;
        block4: {
            object2 = new CustomTabsIntent$e();
            object2 = ((CustomTabsIntent$e)object2).a();
            object = ((CustomTabsIntent)object2).intent;
            Object object3 = Uri.parse((String)string2);
            object.setData(object3);
            try {
                object = this.getBaseContext();
                object = CustomtabActivity.getCustomTabsPackages((Context)object, string2);
                int n3 = ((ArrayList)object).size();
                if (n3 <= 0) {
                    this.launchInBrowser(string2);
                    return;
                }
                n3 = (int)(CustomtabActivity.isChromeInstalled((ArrayList)object) ? 1 : 0);
                if (n3 != 0) {
                    object = ((CustomTabsIntent)object2).intent;
                    object3 = "com.android.chrome";
                    object.setPackage((String)object3);
                    string2 = Uri.parse((String)string2);
                    ((CustomTabsIntent)object2).launchUrl((Context)this, (Uri)string2);
                    return;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            this.launchIntentChooser((ArrayList)object, string2);
            return;
        }
        object2 = LOG_TAG;
        object = "Exception in customtab activity";
        JuspayLogger.e((String)object2, (String)object, exception2);
    }

    public void onCreate(Bundle object) {
        super.onCreate(object);
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent().getData();
            if (object != null && (object = object.getHost()) != null) {
                this.finish();
            } else {
                object = this.getIntent().getExtras();
                if (object == null) {
                    object = null;
                } else {
                    String string2 = "url";
                    object = object.getString(string2);
                }
                if (object != null) {
                    this.loadUrl((String)object);
                } else {
                    this.finish();
                }
            }
        } else {
            this.finish();
        }
    }

    public void onResume() {
        super.onResume();
        Boolean bl2 = this.isFirstResume;
        boolean bl3 = bl2;
        if (!bl3) {
            bl2 = new Intent(CUSTOMTAB_RESULT);
            String string2 = "CANCELLED";
            bl2.putExtra("status", string2);
            Xv1 xv1 = Xv1.a((Context)this);
            xv1.c((Intent)bl2);
            this.finish();
        } else {
            this.isFirstResume = bl2 = Boolean.FALSE;
        }
    }
}

