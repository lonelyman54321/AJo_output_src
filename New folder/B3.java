/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

public final class B3
extends x3 {
    public final int a;

    public B3() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        n3 = n3 >= n4 || n3 >= (n4 = 30) && (n3 = C3.a()) >= (n4 = 2) ? A3.a() : -1 >>> 1;
        this.a = n3;
        n4 = 1;
        if (n3 > n4) {
            return;
        }
        String string2 = "Max items must be higher than 1".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Intent a(Context object, Object object2) {
        boolean bl2;
        int n3;
        String string2;
        Object object3;
        zs2_0 zs2_02;
        block9: {
            block8: {
                int n4;
                int n7;
                zs2_02 = (zs2_0)object2;
                object3 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                string2 = "input";
                Intrinsics.checkNotNullParameter(zs2_02, string2);
                int n8 = Build.VERSION.SDK_INT;
                int n10 = 33;
                n3 = 1;
                if (n8 >= n10) break block8;
                int n14 = 30;
                bl2 = false;
                if (n8 < n14 || (n7 = C3.a()) < (n4 = 2)) break block9;
            }
            bl2 = true;
        }
        int n15 = this.a;
        if (bl2) {
            int n16;
            object = new Intent("android.provider.action.PICK_IMAGES");
            object3 = D3$a.b(zs2_02.a);
            object.setType((String)object3);
            int n18 = zs2_02.b;
            n18 = Math.min(n15, n18);
            if (n18 > n3 && n18 <= (n16 = A3.a())) {
                object.putExtra("android.provider.extra.PICK_IMAGES_MAX", n18);
                object3 = zs2_02.d;
                int n19 = ((D3$b)object3).a();
                object.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", n19);
                boolean bl3 = zs2_02.c;
                string2 = "android.provider.extra.PICK_IMAGES_IN_ORDER";
                object.putExtra(string2, bl3);
                boolean bl4 = zs2_02.e;
                if (!bl4) return object;
                long l2 = zs2_02.f;
                String string3 = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR";
                object.putExtra(string3, l2);
                return object;
            }
            String string4 = "Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()".toString();
            object = new IllegalArgumentException(string4);
            throw object;
        }
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = D3$a.a((Context)object);
        if (object3 == null) {
            object3 = "android.intent.action.OPEN_DOCUMENT";
            object = new Intent((String)object3);
            String string5 = D3$a.b(zs2_02.a);
            object.setType(string5);
            object.putExtra("android.intent.extra.ALLOW_MULTIPLE", n3 != 0);
            String string6 = object.getType();
            if (string6 != null) return object;
            object.setType("*/*");
            String[] stringArray = new String[]{"image/*", "video/*"};
            object3 = "android.intent.extra.MIME_TYPES";
            object.putExtra((String)object3, stringArray);
            return object;
        }
        if ((object = D3$a.a((Context)object)) == null) {
            String string7 = "Required value was null.".toString();
            object = new IllegalStateException(string7);
            throw object;
        }
        object = ((ResolveInfo)object).activityInfo;
        object3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        String string8 = ((ActivityInfo)object).applicationInfo.packageName;
        object = ((ActivityInfo)object).name;
        object3.setClassName(string8, (String)object);
        object = D3$a.b(zs2_02.a);
        object3.setType((String)object);
        int n21 = zs2_02.b;
        n21 = Math.min(n15, n21);
        if (n21 <= n3) {
            String string9 = "Max items must be greater than 1".toString();
            object = new IllegalArgumentException(string9);
            throw object;
        }
        object3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", n21);
        object = zs2_02.d;
        int n22 = ((D3$b)object).a();
        object3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", n22);
        boolean bl5 = zs2_02.c;
        string2 = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";
        object3.putExtra(string2, bl5);
        boolean bl6 = zs2_02.e;
        if (!bl6) return object3;
        long l3 = zs2_02.f;
        string2 = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
        object3.putExtra(string2, l3);
        return object3;
    }

    public final x3$a b(Context context, Object object) {
        object = (zs2_0)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        return null;
    }

    public final Object c(int n3, Intent object) {
        Serializable serializable;
        block10: {
            block9: {
                int n4 = -1;
                if (n3 != n4) {
                    object = null;
                }
                if (object == null) break block9;
                Intrinsics.checkNotNullParameter(object, "<this>");
                serializable = new LinkedHashSet();
                Uri uri = object.getData();
                if (uri != null) {
                    ((AbstractCollection)((Object)serializable)).add(uri);
                }
                if ((object = object.getClipData()) == null && (n4 = (int)(((AbstractCollection)((Object)serializable)).isEmpty() ? 1 : 0)) != 0) {
                    serializable = mz0_2.a;
                } else {
                    if (object != null) {
                        n4 = object.getItemCount();
                        for (int i3 = 0; i3 < n4; ++i3) {
                            Uri uri2 = object.getItemAt(i3).getUri();
                            if (uri2 == null) continue;
                            ((AbstractCollection)((Object)serializable)).add(uri2);
                        }
                    }
                    object = new ArrayList(serializable);
                    serializable = object;
                }
                if (serializable != null) break block10;
            }
            serializable = mz0_2.a;
        }
        return serializable;
    }
}

