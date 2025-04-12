/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.content.pm.Signature
 *  android.os.Build$VERSION
 *  android.util.Log
 */
package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.EmojiCompat$c;
import androidx.emoji2.text.EmojiCompat$g;
import androidx.emoji2.text.a$a;
import androidx.emoji2.text.f;
import androidx.emoji2.text.f$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f a(Context context) {
        f f5;
        Object object;
        Object object2;
        block7: {
            void var10_13;
            int n3;
            String string2;
            int n4;
            Object object3;
            int n7;
            block8: {
                boolean bl2;
                block6: {
                    int n8 = Build.VERSION.SDK_INT;
                    n7 = 28;
                    object2 = n8 >= n7 ? new Object() : new Object();
                    object = context.getPackageManager();
                    B41.c(object, "Package manager required to locate emoji font provider");
                    object3 = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
                    n4 = 0;
                    string2 = null;
                    object3 = object.queryIntentContentProviders((Intent)object3, 0).iterator();
                    while (true) {
                        ApplicationInfo applicationInfo;
                        bl2 = object3.hasNext();
                        f5 = null;
                        if (!bl2) break block6;
                        ProviderInfo providerInfo = ((ResolveInfo)object3.next()).providerInfo;
                        if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null) continue;
                        n3 = applicationInfo.flags;
                        int n10 = 1;
                        if ((n3 &= n10) == n10) break;
                    }
                    break block8;
                }
                bl2 = false;
                Object var10_12 = null;
            }
            if (var10_13 != null) {
                try {
                    object3 = var10_13.authority;
                    String string3 = var10_13.packageName;
                    object2 = ((a$a)object2).a((PackageManager)object, string3);
                    object = new ArrayList();
                    n3 = ((Signature[])object2).length;
                    while (n4 < n3) {
                        Signature signature = object2[n4];
                        byte[] byArray = signature.toByteArray();
                        ((ArrayList)object).add(byArray);
                        ++n4;
                    }
                    object2 = Collections.singletonList(object);
                    string2 = "emojicompat-emoji-font";
                    object = new gV0((String)object3, string3, string2, (List)object2);
                    break block7;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = "emoji2.text.DefaultEmojiConfig";
                    Log.wtf((String)object, (Throwable)nameNotFoundException);
                }
            }
            n7 = 0;
            object = null;
        }
        if (object == null) {
            return f5;
        }
        object2 = new f$b(context, (gV0)object);
        return new EmojiCompat$c((EmojiCompat$g)object2);
    }
}

