/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.o;

final class et {
    private static final o a;
    private final Context b;
    private int c = -1;

    static {
        o o3;
        a = o3 = new o("PackageStateCache");
    }

    public et(Context context) {
        this.b = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                int n3 = this.c;
                int n4 = -1;
                if (n3 != n4) return this.c;
                n3 = 0;
                Object[] objectArray = null;
                Object object = this.b;
                object = object.getPackageName();
                Context context = this.b;
                context = context.getPackageManager();
                object = context.getPackageInfo((String)object, 0);
                this.c = n4 = object.versionCode;
                return this.c;
                {
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                    {
                        o o3 = a;
                        objectArray = new Object[]{};
                        String string2 = "The current version of the app could not be retrieved";
                        o3.b(string2, objectArray);
                        return this.c;
                    }
                }
            }
            throw throwable2;
        }
    }
}

