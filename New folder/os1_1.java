/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OS1
 */
public final class os1_1 {
    public static final os1_1 a;
    public static final ArrayList b;
    public static final HashMap c;
    public static final AtomicBoolean d;
    public static final Integer[] e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block6: {
            int n3 = 1;
            object6 = new os1_1();
            a = object6;
            object5 = ((os1_1)object6).a();
            b = object5;
            boolean bl2 = td0.b(object6);
            object4 = null;
            if (!bl2) {
                try {
                    object5 = new OS1$e();
                    object3 = new OS1$e[n3];
                    object3[0] = object5;
                    object5 = xx_2.d((Object[])object3);
                    object3 = ((os1_1)object6).a();
                    ((ArrayList)object5).addAll(object3);
                    break block6;
                }
                catch (Throwable throwable) {
                    td0.a(object6, throwable);
                }
            }
            bl2 = false;
            object5 = null;
        }
        object6 = a;
        object6.getClass();
        boolean bl3 = td0.b(object6);
        if (!bl3) {
            try {
                object3 = new HashMap();
                object2 = new ArrayList();
                object = new OS1$e();
                ((ArrayList)object2).add(object);
                object = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
                ArrayList arrayList = b;
                ((HashMap)object3).put(object, arrayList);
                object = "com.facebook.platform.action.request.FEED_DIALOG";
                ((HashMap)object3).put(object, arrayList);
                object = "com.facebook.platform.action.request.LIKE_DIALOG";
                ((HashMap)object3).put(object, arrayList);
                object = "com.facebook.platform.action.request.APPINVITES_DIALOG";
                ((HashMap)object3).put(object, arrayList);
                object = "com.facebook.platform.action.request.MESSAGE_DIALOG";
                ((HashMap)object3).put(object, object2);
                object = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
                ((HashMap)object3).put(object, object2);
                object2 = "com.facebook.platform.action.request.CAMERA_EFFECT";
                ((HashMap)object3).put(object2, object5);
                object5 = "com.facebook.platform.action.request.SHARE_STORY";
                ((HashMap)object3).put(object5, arrayList);
                object4 = object3;
            }
            catch (Throwable throwable) {
                td0.a(object6, throwable);
            }
        }
        c = object4;
        d = object5 = new AtomicBoolean(false);
        object5 = 20210906;
        object6 = 20171115;
        object4 = 20170417;
        object3 = 20170411;
        object2 = 20170213;
        object = 20161017;
        Integer n4 = 20160327;
        Integer n7 = 20150702;
        Integer n8 = 20150401;
        Integer n10 = 20141218;
        Integer n14 = 20141107;
        Integer n15 = 20141028;
        Integer n16 = 20141001;
        Integer n17 = 20140701;
        Integer n18 = 20140324;
        Integer n19 = 20140313;
        Integer n20 = 20140204;
        Integer n21 = 20131107;
        Integer n22 = 20131024;
        Integer n24 = 20130618;
        Integer n25 = 20130502;
        Integer n26 = 20121101;
        Integer[] integerArray = new Integer[]{object5, object6, object4, object3, object2, object, n4, n7, n8, n10, n14, n15, n16, n17, n18, n19, n20, n21, n22, n24, n25, n26};
        e = integerArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int b(TreeSet object, int n3, int[] nArray) {
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        block6: {
            Class<os1_1> clazz = os1_1.class;
            n14 = td0.b(clazz);
            if (n14 != 0) {
                return 0;
            }
            String string2 = "versionSpec";
            try {
                Intrinsics.checkNotNullParameter(nArray, string2);
                n14 = -1;
                if (object == null) {
                    return n14;
                }
                n10 = nArray.length + -1;
                object = ((TreeSet)object).descendingIterator();
                n8 = -1;
                break block6;
            }
            catch (Throwable throwable) {}
            td0.a(clazz, throwable);
            return 0;
        }
        do {
            int n15;
            if ((n4 = object.hasNext()) == 0) return n14;
            object2 = object.next();
            object2 = (Integer)object2;
            String string3 = "fbAppVersion";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            n7 = (Integer)object2;
            n8 = Math.max(n8, n7);
            while (n10 >= 0 && (n7 = nArray[n10]) > (n15 = ((Integer)object2).intValue())) {
                n10 += -1;
            }
            if (n10 >= 0) continue;
            return n14;
        } while ((n7 = nArray[n10]) != (n4 = ((Integer)object2).intValue()));
        if ((n10 %= 2) != 0) return n14;
        return Math.min(n8, n3);
    }

    public static final Bundle c(FacebookException object) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block9: {
            Bundle bundle;
            block8: {
                String string2;
                clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                if (object == null) {
                    return null;
                }
                try {
                    bundle = new Bundle();
                    string2 = "error_description";
                }
                catch (Throwable throwable2) {}
                String string3 = ((FacebookException)object).toString();
                bundle.putString(string2, string3);
                boolean bl3 = object instanceof FacebookOperationCanceledException;
                if (!bl3) break block8;
                object = "error_type";
                string2 = "UserCanceled";
                bundle.putString((String)object, string2);
                break block9;
            }
            return bundle;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Intent e(Context var0) {
        block26: {
            block23: {
                var1_2 = "context";
                var2_3 = os1_1.class;
                var3_4 = td0.b(var2_3);
                if (var3_4) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(var0, var1_2);
                var4_5 = os1_1.b;
                var4_5 = var4_5.iterator();
                block20: do {
                    block25: {
                        block24: {
                            var5_6 = var4_5.hasNext();
                            if (!var5_6) break block23;
                            var6_7 = var4_5.next();
                            var6_7 = (OS1$e)var6_7;
                            var8_10 = "com.facebook.platform.PLATFORM_SERVICE";
                            var7_9 /* !! */  = new Intent(var8_10);
                            var6_7 = var6_7.c();
                            var6_7 = var7_9 /* !! */ .setPackage((String)var6_7);
                            var7_9 /* !! */  = "android.intent.category.DEFAULT";
                            var6_7 = var6_7.addCategory((String)var7_9 /* !! */ );
                            var9_11 = td0.b(var2_3);
                            if (!var9_11) break block24;
lbl31:
                            // 4 sources

                            while (true) {
                                var5_6 = false;
                                var6_7 = null;
                                continue block20;
                                break;
                            }
                        }
                        Intrinsics.checkNotNullParameter(var0, var1_2);
                        if (var6_7 == null) break block25;
                        var7_9 /* !! */  = var0.getPackageManager();
                        var8_10 = null;
                        var7_9 /* !! */  = var7_9 /* !! */ .resolveService((Intent)var6_7, 0);
                        if (var7_9 /* !! */  == null) ** GOTO lbl31
                        var7_9 /* !! */  = var7_9 /* !! */ .serviceInfo;
                        var7_9 /* !! */  = var7_9 /* !! */ .packageName;
                        var8_10 = "resolveInfo.serviceInfo.packageName";
                        Intrinsics.checkNotNullExpressionValue(var7_9 /* !! */ , var8_10);
                        try {
                            var9_11 = bi0_1.a(var0, (String)var7_9 /* !! */ );
                            if (var9_11) continue;
                            ** GOTO lbl31
                        }
                        catch (Throwable var6_8) {
                            td0.a(var2_3, var6_8);
                        }
                    }
                    ** continue;
                } while (var6_7 == null);
                return var6_7;
                {
                    catch (Throwable var0_1) {}
                }
                break block26;
            }
            return null;
        }
        td0.a(var2_3, var0_1);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Intent f(Intent object, Bundle bundle, FacebookException object2) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block6: {
            Intent intent;
            block5: {
                clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                Object object3 = "requestIntent";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = os1_1.i(object);
                    if (object3 == null) {
                        return null;
                    }
                    intent = new Intent();
                    String string2 = "com.facebook.platform.protocol.PROTOCOL_VERSION";
                    int n3 = os1_1.n(object);
                    intent.putExtra(string2, n3);
                    object = new Bundle();
                    string2 = "action_id";
                    object3 = ((UUID)object3).toString();
                    object.putString(string2, (String)object3);
                    if (object2 == null) break block5;
                    object3 = "error";
                    object2 = os1_1.c((FacebookException)object2);
                    object.putBundle((String)object3, (Bundle)object2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            object2 = "com.facebook.platform.protocol.BRIDGE_ARGS";
            intent.putExtra((String)object2, (Bundle)object);
            if (bundle != null) {
                object = "com.facebook.platform.protocol.RESULT_ARGS";
                intent.putExtra((String)object, bundle);
            }
            return intent;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final Bundle h(Intent intent) {
        Bundle bundle;
        block5: {
            Class<os1_1> clazz = os1_1.class;
            int n3 = td0.b(clazz);
            bundle = null;
            if (n3 != 0) {
                return null;
            }
            String string2 = "intent";
            try {
                Intrinsics.checkNotNullParameter(intent, string2);
                n3 = os1_1.n(intent);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
                return null;
            }
            n3 = (int)(os1_1.p(n3) ? 1 : 0);
            if (n3 == 0) break block5;
            string2 = "com.facebook.platform.protocol.BRIDGE_ARGS";
            bundle = intent.getBundleExtra(string2);
        }
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final UUID i(Intent object) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block9: {
            UUID uUID;
            block8: {
                block6: {
                    block7: {
                        clazz = os1_1.class;
                        int n3 = td0.b(clazz);
                        uUID = null;
                        if (n3 != 0) {
                            return null;
                        }
                        if (object == null) {
                            return null;
                        }
                        try {
                            n3 = os1_1.n(object);
                            n3 = (int)(os1_1.p(n3) ? 1 : 0);
                            if (n3 == 0) break block6;
                            String string2 = "com.facebook.platform.protocol.BRIDGE_ARGS";
                            if ((object = object.getBundleExtra(string2)) == null) break block7;
                            string2 = "action_id";
                            object = object.getString(string2);
                            break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    object = null;
                    break block8;
                }
                String string3 = "com.facebook.platform.protocol.CALL_ID";
                object = object.getStringExtra(string3);
            }
            if (object == null) return uUID;
            try {
                return UUID.fromString((String)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return uUID;
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final FacebookException j(Bundle object) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block6: {
            String string2;
            block5: {
                clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                if (object == null) {
                    return null;
                }
                string2 = "error_type";
                try {
                    string2 = object.getString(string2);
                    if (string2 != null) break block5;
                    string2 = "com.facebook.platform.status.ERROR_TYPE";
                    string2 = object.getString(string2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            String string3 = "error_description";
            if ((string3 = object.getString(string3)) == null) {
                string3 = "com.facebook.platform.status.ERROR_DESCRIPTION";
                string3 = object.getString(string3);
            }
            if (string2 == null) return new FacebookException(string3);
            object = "UserCanceled";
            boolean bl3 = string2.equalsIgnoreCase((String)object);
            if (!bl3) return new FacebookException(string3);
            return new FacebookException(string3);
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final int l() {
        Object object;
        Class<os1_1> clazz = os1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return 0;
        }
        try {
            object = e;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return 0;
        }
        object = object[0];
        return (Integer)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bundle m(Intent intent) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block4: {
            clazz = os1_1.class;
            int n3 = td0.b(clazz);
            if (n3 != 0) {
                return null;
            }
            String string2 = "intent";
            try {
                Intrinsics.checkNotNullParameter(intent, string2);
                n3 = os1_1.n(intent);
                n3 = (int)(os1_1.p(n3) ? 1 : 0);
                if (n3 == 0) {
                    return intent.getExtras();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            string2 = "com.facebook.platform.protocol.METHOD_ARGS";
            return intent.getBundleExtra(string2);
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final int n(Intent intent) {
        Class<os1_1> clazz = os1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return 0;
        }
        String string2 = "intent";
        try {
            Intrinsics.checkNotNullParameter(intent, string2);
            string2 = "com.facebook.platform.protocol.PROTOCOL_VERSION";
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return 0;
        }
        return intent.getIntExtra(string2, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean o(Intent object) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block4: {
            clazz = os1_1.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return false;
            }
            String string2 = "resultIntent";
            try {
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = os1_1.h(object);
                if (string2 != null) {
                    object = "error";
                    return string2.containsKey((String)object);
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            string2 = "com.facebook.platform.status.ERROR_TYPE";
            return object.hasExtra(string2);
        }
        td0.a(clazz, throwable2);
        return false;
    }

    public static final boolean p(int n3) {
        Object[] objectArray;
        Class<os1_1> clazz = os1_1.class;
        boolean bl2 = td0.b(clazz);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        try {
            objectArray = e;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return false;
        }
        Integer n4 = n3;
        int n7 = tp_2.w(objectArray, n4);
        if (n7 != 0 && n3 >= (n7 = 20140701)) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void q(Intent intent, String string2, String string3, int n3, Bundle bundle) {
        Throwable throwable2;
        Class<os1_1> clazz;
        block6: {
            String string4;
            block4: {
                block5: {
                    clazz = os1_1.class;
                    boolean bl2 = td0.b(clazz);
                    if (bl2) {
                        return;
                    }
                    String string5 = "intent";
                    try {
                        Intrinsics.checkNotNullParameter(intent, string5);
                        string5 = FacebookSdk.b();
                        Xz3.h();
                        string4 = FacebookSdk.f;
                        String string6 = "com.facebook.platform.protocol.PROTOCOL_VERSION";
                        string6 = intent.putExtra(string6, n3);
                        String string7 = "com.facebook.platform.protocol.PROTOCOL_ACTION";
                        string3 = string6.putExtra(string7, string3);
                        string6 = "com.facebook.platform.extra.APPLICATION_ID";
                        string3.putExtra(string6, string5);
                        boolean bl3 = os1_1.p(n3);
                        if (!bl3) break block4;
                        string3 = new Bundle();
                        String string8 = "action_id";
                        string3.putString(string8, string2);
                        string2 = "app_name";
                        lz3_0.H((Bundle)string3, string2, string4);
                        string2 = "com.facebook.platform.protocol.BRIDGE_ARGS";
                        intent.putExtra(string2, (Bundle)string3);
                        if (bundle != null) break block5;
                        bundle = new Bundle();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                string2 = "com.facebook.platform.protocol.METHOD_ARGS";
                intent.putExtra(string2, bundle);
                return;
            }
            string3 = "com.facebook.platform.protocol.CALL_ID";
            intent.putExtra(string3, string2);
            boolean bl4 = lz3_0.A(string4);
            if (!bl4) {
                string2 = "com.facebook.platform.extra.APPLICATION_NAME";
                intent.putExtra(string2, string4);
            }
            if (bundle == null) return;
            intent.putExtras(bundle);
            return;
        }
        td0.a(clazz, throwable2);
    }

    public static final void r() {
        ns1_1 ns1_12;
        Object object;
        block8: {
            boolean bl2;
            Class<os1_1> clazz = os1_1.class;
            boolean bl3 = td0.b(clazz);
            if (bl3) {
                return;
            }
            try {
                object = d;
                ns1_12 = null;
                bl2 = true;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
                return;
            }
            bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
            if (bl3) break block8;
            return;
        }
        object = FacebookSdk.d();
        ns1_12 = new Object();
        object.execute(ns1_12);
    }

    public static final Intent s(Context context, Intent intent) {
        String string2;
        String string3;
        block11: {
            block10: {
                Class<os1_1> clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                string3 = "context";
                try {
                    Intrinsics.checkNotNullParameter(context, string3);
                    if (intent != null) break block10;
                    return null;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                    return null;
                }
            }
            string3 = context.getPackageManager();
            string2 = null;
            string3 = string3.resolveActivity(intent, 0);
            if (string3 != null) break block11;
            return null;
        }
        string3 = ((ResolveInfo)string3).activityInfo;
        string3 = ((ActivityInfo)string3).packageName;
        string2 = "resolveInfo.activityInfo.packageName";
        Intrinsics.checkNotNullExpressionValue(string3, string2);
        boolean bl3 = bi0_1.a(context, string3);
        if (!bl3) {
            intent = null;
        }
        return intent;
    }

    public final ArrayList a() {
        OS1$c oS1$c;
        int n3 = (int)(td0.b(this) ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        try {
            oS1$c = new OS1$e();
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
        OS1$g oS1$g = new OS1$e();
        int n4 = 2;
        Object[] objectArray = new OS1$e[n4];
        objectArray[0] = oS1$c;
        n3 = 1;
        objectArray[n3] = oS1$g;
        return xx_2.d(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent d(OS1$e oS1$e, String string2, Collection collection, String string3, boolean bl2, dk0_0 dk0_02, String string4, String string5, boolean bl3, String string6, boolean bl4, LA1 lA1, boolean bl5, boolean bl6, String string7) {
        Throwable throwable2;
        block12: {
            String string8;
            boolean bl7;
            boolean bl8;
            Object object;
            String string9;
            block11: {
                boolean bl9 = td0.b(this);
                if (bl9) {
                    return null;
                }
                try {
                    string9 = oS1$e.b();
                    if (string9 == null) {
                        return null;
                    }
                    Object object2 = new Intent();
                    object = oS1$e.c();
                    string9 = object2.setClassName((String)object, string9);
                    object2 = "client_id";
                    object = string2;
                    string9 = string9.putExtra((String)object2, string2);
                    object2 = "Intent()\n            .se\u2026PP_ID_KEY, applicationId)";
                    Intrinsics.checkNotNullExpressionValue(string9, (String)object2);
                    object2 = "facebook_sdk_version";
                    object = FacebookSdk.a;
                    object = "18.0.2";
                    string9.putExtra((String)object2, (String)object);
                    object2 = lz3_0.a;
                    bl8 = true;
                    if (collection != null && !(bl7 = collection.isEmpty())) {
                        bl7 = false;
                        object = null;
                    } else {
                        bl7 = true;
                    }
                    if (bl7) break block11;
                    object = "scope";
                    string8 = ",";
                    Iterable iterable = collection;
                    iterable = collection;
                    string8 = TextUtils.join((CharSequence)string8, (Iterable)iterable);
                    string9.putExtra((String)object, string8);
                }
                catch (Throwable throwable2) {
                    os1_1 os1_12 = this;
                    break block12;
                }
            }
            if (!(bl7 = lz3_0.A(string3))) {
                object = "e2e";
                string8 = string3;
                string9.putExtra((String)object, string3);
            }
            object = "state";
            string8 = string4;
            string9.putExtra((String)object, string4);
            object = "response_type";
            string8 = oS1$e.d();
            string9.putExtra((String)object, string8);
            object = "nonce";
            string8 = string7;
            string9.putExtra((String)object, string7);
            object = "return_scopes";
            string8 = "true";
            string9.putExtra((String)object, string8);
            if (bl2) {
                object = "default_audience";
                string8 = dk0_02.getNativeProtocolAudience();
                string9.putExtra((String)object, string8);
            }
            object = "legacy_override";
            string8 = FacebookSdk.e();
            string9.putExtra((String)object, string8);
            object = "auth_type";
            string8 = string5;
            string9.putExtra((String)object, string5);
            if (bl3) {
                object = "fail_on_logged_out";
                string9.putExtra((String)object, bl8);
            }
            object = "messenger_page_id";
            string8 = string6;
            string9.putExtra((String)object, string6);
            object = "reset_messenger_state";
            string9.putExtra((String)object, bl4);
            if (bl5) {
                object = "fx_app";
                string8 = lA1.toString();
                string9.putExtra((String)object, string8);
            }
            if (bl6) {
                object = "skip_dedupe";
                string9.putExtra((String)object, bl8);
            }
            return string9;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final TreeSet g(OS1$e var1_1) {
        block21: {
            block23: {
                block22: {
                    var2_4 = ".provider.PlatformProvider";
                    var3_5 = "version";
                    var4_6 = td0.b(this);
                    if (var4_6) {
                        return null;
                    }
                    var5_7 = new TreeSet<Object>();
                    var6_8 /* !! */  = FacebookSdk.a();
                    var7_10 = var6_8 /* !! */ .getContentResolver();
                    var8_11 = new String[]{var3_5};
                    var6_8 /* !! */  = "content://";
                    var9_12 = td0.b(this);
                    if (var9_12) {
                    }
                    ** GOTO lbl22
                    {
                        catch (Throwable var1_3) {
                            break block21;
                        }
lbl18:
                        // 2 sources

                        while (true) {
                            var9_12 = false;
                            var10_13 /* !! */  = null;
                            break;
                        }
lbl22:
                        // 1 sources

                        try {
                            var10_13 /* !! */  = new StringBuilder((String)var6_8 /* !! */ );
                            var6_8 /* !! */  = var1_1.c();
                            var10_13 /* !! */ .append((String)var6_8 /* !! */ );
                            var6_8 /* !! */  = ".provider.PlatformProvider/versions";
                            var10_13 /* !! */ .append((String)var6_8 /* !! */ );
                            var6_8 /* !! */  = var10_13 /* !! */ .toString();
                            var6_8 /* !! */  = Uri.parse((String)var6_8 /* !! */ );
                            var10_13 /* !! */  = "parse(CONTENT_SCHEME + a\u2026ATFORM_PROVIDER_VERSIONS)";
                            Intrinsics.checkNotNullExpressionValue(var6_8 /* !! */ , (String)var10_13 /* !! */ );
                            var10_13 /* !! */  = var6_8 /* !! */ ;
                        }
                        catch (Throwable var6_9) {}
                        {
                            td0.a(this, var6_9);
                            ** continue;
                        }
                    }
                    try {
                        var6_8 /* !! */  = FacebookSdk.a();
                        var6_8 /* !! */  = var6_8 /* !! */ .getPackageManager();
                        var1_1 = var1_1.c();
                        var1_1 = var1_1.concat((String)var2_4);
                        var11_14 = 0;
                        var2_4 = null;
                        var1_1 = var6_8 /* !! */ .resolveContentProvider((String)var1_1, 0);
                        break block22;
                    }
                    catch (Throwable var1_2) {
                        var11_14 = 0;
                        var2_4 = null;
                        break block23;
                    }
                    catch (RuntimeException v0) {
                        var1_1 = null;
                    }
                }
                if (var1_1 != null) {
                    try {
                        var1_1 = var7_10.query((Uri)var10_13 /* !! */ , var8_11, null, null, null);
                    }
                    catch (IllegalArgumentException | NullPointerException | SecurityException v1) {
                        var1_1 = null;
                    }
                    if (var1_1 != null) {
                        try {
                            while ((var11_14 = var1_1.moveToNext()) != 0) {
                                var11_14 = var1_1.getColumnIndex(var3_5);
                                var11_14 = var1_1.getInt(var11_14);
                                var2_4 = var11_14;
                                var5_7.add(var2_4);
                            }
                        }
                        catch (Throwable var12_15) {
                            var2_4 = var1_1;
                            var1_1 = var12_15;
                            break block23;
                        }
                    }
                } else {
                    var1_1 = null;
                }
                if (var1_1 == null) return var5_7;
                var1_1.close();
                return var5_7;
            }
            if (var2_4 == null) throw var1_1;
            var2_4.close();
            throw var1_1;
        }
        td0.a(this, var1_3);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final OS1$f k(List object, int[] nArray) {
        int n3;
        Object object2;
        TreeSet treeSet;
        int n4;
        int n7;
        block6: {
            n7 = td0.b(this);
            if (n7 != 0) {
                return null;
            }
            try {
                os1_1.r();
                n7 = -1;
                if (object == null) {
                    object = new Object();
                    ((OS1$f)object).b = n7;
                    return object;
                }
                object = object.iterator();
                break block6;
            }
            catch (Throwable throwable) {}
            td0.a(this, throwable);
            return null;
        }
        do {
            boolean bl2;
            if (!(bl2 = object.hasNext())) {
                object = new Object();
                ((OS1$f)object).b = n7;
                return object;
            }
            object2 = object.next();
            object2 = (OS1$e)object2;
            treeSet = ((OS1$e)object2).a;
            if (treeSet != null && (n4 = treeSet.isEmpty()) == 0) continue;
            n4 = 0;
            treeSet = null;
            ((OS1$e)object2).a(false);
        } while ((n4 = os1_1.b(treeSet = ((OS1$e)object2).a, n3 = os1_1.l(), nArray)) == n7);
        object = new Object();
        ((OS1$f)object).a = object2;
        ((OS1$f)object).b = n4;
        return object;
    }
}

