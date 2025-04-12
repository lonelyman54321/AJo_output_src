/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.b;
import com.facebook.g$a;
import com.facebook.j;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from zI0
 */
public final class zi0_0
implements Callable {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        block23: {
            Object object4;
            Object object5;
            boolean bl3;
            boolean bl4;
            Object object6;
            block22: {
                block21: {
                    object3 = FacebookSdk.a;
                    object3 = b.f.a();
                    object2 = ((b)object3).b.a;
                    object6 = "com.facebook.AccessTokenManager.CachedAccessToken";
                    bl4 = object2.contains((String)object6);
                    if (bl4 && (object2 = object2.getString((String)object6, null)) != null) {
                        try {
                            object6 = new JSONObject((String)object2);
                            object2 = AccessToken.l;
                            object2 = AccessToken$b.a((JSONObject)object6);
                            break block21;
                        }
                        catch (JSONException jSONException) {}
                    }
                    bl2 = false;
                    object2 = null;
                }
                bl3 = false;
                object6 = null;
                if (object2 != null) {
                    ((b)object3).c((AccessToken)object2, false);
                }
                object3 = com.facebook.g.d;
                object2 = ((g$a)object3).a();
                object = object2.b.a;
                object5 = "com.facebook.ProfileManager.CachedProfile";
                if ((object = object.getString((String)object5, null)) != null) {
                    try {
                        object5 = new JSONObject((String)object);
                        object = new Profile((JSONObject)object5);
                        break block22;
                    }
                    catch (JSONException jSONException) {}
                }
                bl4 = false;
                object = null;
            }
            if (object != null) {
                object2.a((Profile)object, false);
            }
            object2 = AccessToken.l;
            bl2 = AccessToken$b.c();
            if (bl2 && (object2 = ((g$a)object3).a().c) == null && (object2 = AccessToken$b.b()) != null) {
                bl4 = AccessToken$b.c();
                if (!bl4) {
                    object3 = ((g$a)object3).a();
                    bl2 = true;
                    ((com.facebook.g)object3).a(null, bl2);
                } else {
                    object3 = new Object();
                    object2 = object2.e;
                    lz3_0.q(object3, (String)object2);
                }
            }
            object3 = FacebookSdk.a();
            object2 = FacebookSdk.e;
            object = "context";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            object5 = g.c;
            Intrinsics.checkNotNullParameter(object3, (String)object);
            boolean bl5 = j.c();
            if (bl5) {
                object5 = new g((Context)object3, (String)object2);
                object2 = g.b();
                if (object2 == null) {
                    object2 = "Required value was null.".toString();
                    object3 = new IllegalStateException((String)object2);
                    throw object3;
                }
                object4 = new co((Context)object3, (g)object5);
                object2.execute((Runnable)object4);
            }
            object3 = j.class;
            bl2 = td0.b(object3);
            if (!bl2) {
                Throwable throwable222;
                block25: {
                    block24: {
                        try {
                            object2 = FacebookSdk.a();
                            object5 = object2.getPackageManager();
                            object4 = object2.getPackageName();
                            int n3 = 128;
                            object5 = object5.getApplicationInfo((String)object4, n3);
                            object4 = "ctx.packageManager.getAp\u2026ageManager.GET_META_DATA)";
                            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                            object5 = ((ApplicationInfo)object5).metaData;
                            if (object5 == null || !(bl3 = object5.getBoolean((String)(object4 = "com.facebook.sdk.AutoAppLinkEnabled"), false))) break block23;
                            object6 = new g((Context)object2, null);
                            object2 = "loggerImpl";
                            Intrinsics.checkNotNullParameter(object6, (String)object2);
                            object2 = new Bundle();
                            bl5 = lz3_0.w();
                            if (bl5) break block24;
                            object5 = "SchemeWarning";
                            object4 = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
                            object2.putString((String)object5, (String)object4);
                        }
                        catch (Throwable throwable222) {
                            break block25;
                        }
                    }
                    object5 = "fb_auto_applink";
                    boolean bl6 = j.c();
                    if (bl6) {
                        ((g)object6).e((String)object5, (Bundle)object2);
                    }
                    break block23;
                }
                td0.a(object3, throwable222);
                break block23;
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
        }
        object3 = FacebookSdk.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object3, "getApplicationContext().applicationContext");
        Intrinsics.checkNotNullParameter(object3, (String)object);
        object2 = new AppEventsLogger((Context)object3);
        object3 = object2.a;
        object3.getClass();
        bl2 = td0.b(object3);
        if (bl2) {
            return null;
        }
        try {
            object2 = gt0_0.EXPLICIT;
            f.c((gt0_0)((Object)object2));
            return null;
        }
        catch (Throwable throwable) {
            td0.a(object3, throwable);
        }
        return null;
    }
}

