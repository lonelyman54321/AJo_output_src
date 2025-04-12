/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.pm.PackageManager
 */
package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.core.app.b$d;

class ActivityCompat$1
implements Runnable {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public ActivityCompat$1(int n3, Activity activity, String[] stringArray) {
        this.a = stringArray;
        this.b = activity;
        this.c = n3;
    }

    public final void run() {
        String[] stringArray = this.a;
        int n3 = stringArray.length;
        int[] nArray = new int[n3];
        Object object = this.b;
        PackageManager packageManager = object.getPackageManager();
        String string2 = object.getPackageName();
        int n4 = stringArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            String string3 = stringArray[i3];
            nArray[i3] = n7 = packageManager.checkPermission(string3, string2);
        }
        object = (b$d)object;
        int n8 = this.c;
        object.onRequestPermissionsResult(n8, stringArray, nArray);
    }
}

