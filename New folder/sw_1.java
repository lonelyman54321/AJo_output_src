/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.b;
import com.facebook.f;
import in.juspay.hypernfc.NfcActivity;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;

/*
 * Renamed from SW
 */
public final class sw_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sw_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Class<b> clazz;
        block20: {
            ViewIndexer viewIndexer;
            char c2;
            String string2;
            String string3;
            Object[] objectArray;
            Object object;
            Bundle bundle;
            Object object2;
            Object object3;
            int n3;
            boolean bl2;
            block19: {
                Object var1_1 = null;
                bl2 = true;
                n3 = this.a;
                switch (n3) {
                    default: {
                        NfcActivity.r2((NfcActivity)this.b);
                        return;
                    }
                    case 0: 
                }
                object3 = (Object[])this.b;
                object2 = "0";
                clazz = b.class;
                boolean bl3 = td0.b(clazz);
                if (bl3) {
                    return;
                }
                try {
                    bundle = new Bundle();
                    object = FacebookSdk.a();
                    object = Zq$a.a((Context)object);
                    objectArray = new JSONArray();
                    string3 = Build.MODEL;
                    string2 = "";
                    if (string3 == null) {
                        string3 = string2;
                    }
                    objectArray.put((Object)string3);
                    if (object != null) {
                        string3 = ((zq_0)object).a();
                    } else {
                        c2 = '\u0000';
                        string3 = null;
                    }
                    if (string3 != null) {
                        object = ((zq_0)object).a();
                        objectArray.put(object);
                    } else {
                        objectArray.put((Object)string2);
                    }
                    objectArray.put(object2);
                    bl3 = tn_0.c();
                    if (bl3) {
                        object2 = "1";
                    }
                    objectArray.put(object2);
                    object2 = lz3_0.a;
                    try {
                        object2 = FacebookSdk.a();
                        object2 = object2.getResources();
                        object2 = object2.getConfiguration();
                        object2 = ((Configuration)object2).locale;
                    }
                    catch (Exception exception) {
                        object2 = null;
                    }
                    if (object2 != null) break block19;
                    object2 = Locale.getDefault();
                    object = "getDefault()";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                }
                catch (Throwable throwable2) {
                    break block20;
                }
            }
            object = new StringBuilder();
            string3 = ((Locale)object2).getLanguage();
            ((StringBuilder)object).append(string3);
            c2 = '_';
            ((StringBuilder)object).append(c2);
            object2 = ((Locale)object2).getCountry();
            ((StringBuilder)object).append((String)object2);
            object2 = ((StringBuilder)object).toString();
            objectArray.put(object2);
            object2 = objectArray.toString();
            object = "extInfoArray.toString()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object = "device_session_id";
            objectArray = com.facebook.appevents.codeless.b.a();
            bundle.putString((String)object, (String)objectArray);
            object = "extinfo";
            bundle.putString((String)object, (String)object2);
            object2 = GraphRequest.j;
            object2 = StringCompanionObject.INSTANCE;
            object2 = Locale.US;
            object = "%s/app_indexing_session";
            objectArray = new Object[bl2];
            objectArray[0] = object3;
            object3 = Arrays.copyOf(objectArray, (int)(bl2 ? 1 : 0));
            string2 = String.format((Locale)object2, (String)object, (Object[])object3);
            object3 = "format(locale, format, *args)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
            Qa1 qa1 = Qa1.POST;
            int n4 = 32;
            c2 = '\u0000';
            string3 = null;
            objectArray = object3;
            object3 = new GraphRequest(null, string2, bundle, qa1, null, n4);
            object3 = ((GraphRequest)object3).c();
            object3 = ((f)object3).b;
            object2 = com.facebook.appevents.codeless.b.g;
            if (object3 == null || (n3 = (int)(object3.optBoolean((String)(object = "is_app_indexing_enabled"), false) ? 1 : 0)) == 0) {
                bl2 = false;
                viewIndexer = null;
            }
            ((AtomicBoolean)object2).set(bl2);
            bl2 = ((AtomicBoolean)object2).get();
            if (!bl2) {
                com.facebook.appevents.codeless.b.e = null;
            } else {
                viewIndexer = com.facebook.appevents.codeless.b.d;
                if (viewIndexer != null) {
                    viewIndexer.c();
                }
            }
            com.facebook.appevents.codeless.b.h = false;
            return;
        }
        td0.a(clazz, throwable2);
    }
}

