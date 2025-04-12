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
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D3
 */
public final class d3_0
extends x3 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Intent a(Context object, Object stringArray) {
        stringArray = (zs2_0)stringArray;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "input";
        Intrinsics.checkNotNullParameter(stringArray, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4 || n3 >= (n4 = 30) && (n3 = C3.a()) >= (n4 = 2)) {
            object = new Intent("android.provider.action.PICK_IMAGES");
            object2 = D3$a.b(stringArray.a);
            object.setType((String)object2);
            object2 = stringArray.d;
            int n7 = ((D3$b)object2).a();
            string2 = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB";
            object.putExtra(string2, n7);
            n7 = (int)(stringArray.e ? 1 : 0);
            if (n7 == 0) return object;
            long l2 = stringArray.f;
            stringArray = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR";
            object.putExtra((String)stringArray, l2);
            return object;
        } else {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = D3$a.a((Context)object);
            if (object2 != null) {
                if ((object = D3$a.a((Context)object)) != null) {
                    object = ((ResolveInfo)object).activityInfo;
                    object2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    string2 = ((ActivityInfo)object).applicationInfo.packageName;
                    object = ((ActivityInfo)object).name;
                    object2.setClassName(string2, (String)object);
                    object = D3$a.b(stringArray.a);
                    object2.setType((String)object);
                    object = stringArray.d;
                    int n8 = ((D3$b)object).a();
                    string2 = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";
                    object2.putExtra(string2, n8);
                    n8 = (int)(stringArray.e ? 1 : 0);
                    if (n8 == 0) return object2;
                    long l3 = stringArray.f;
                    string2 = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
                    object2.putExtra(string2, l3);
                    return object2;
                }
                stringArray = "Required value was null.".toString();
                object = new IllegalStateException((String)stringArray);
                throw object;
            }
            object2 = "android.intent.action.OPEN_DOCUMENT";
            object = new Intent((String)object2);
            stringArray = D3$a.b(stringArray.a);
            object.setType((String)stringArray);
            stringArray = object.getType();
            if (stringArray != null) return object;
            object.setType("*/*");
            stringArray = new String[]{"image/*", "video/*"};
            object2 = "android.intent.extra.MIME_TYPES";
            object.putExtra((String)object2, stringArray);
        }
        return object;
    }

    public final x3$a b(Context context, Object object) {
        object = (zs2_0)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        return null;
    }

    public final Object c(int n3, Intent object) {
        int n4 = -1;
        int n7 = 0;
        Uri uri = null;
        if (n3 != n4) {
            object = null;
        }
        if (object != null) {
            Object object2 = object.getData();
            if (object2 == null) {
                Intrinsics.checkNotNullParameter(object, "<this>");
                object2 = new LinkedHashSet();
                Uri uri2 = object.getData();
                if (uri2 != null) {
                    ((AbstractCollection)object2).add(uri2);
                }
                if ((object = object.getClipData()) == null && (n4 = (int)(((AbstractCollection)object2).isEmpty() ? 1 : 0)) != 0) {
                    object2 = mz0_2.a;
                } else {
                    if (object != null) {
                        n4 = object.getItemCount();
                        uri = null;
                        for (n7 = 0; n7 < n4; ++n7) {
                            Uri uri3 = object.getItemAt(n7).getUri();
                            if (uri3 == null) continue;
                            ((AbstractCollection)object2).add(uri3);
                        }
                    }
                    object = new ArrayList(object2);
                    object2 = object;
                }
                object2 = (Uri)CollectionsKt.firstOrNull((List)object2);
            }
            uri = object2;
        }
        return uri;
    }
}

