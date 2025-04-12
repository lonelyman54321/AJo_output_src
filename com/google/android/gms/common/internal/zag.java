/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Build
 */
package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zad;
import com.google.android.gms.common.internal.zae;
import com.google.android.gms.common.internal.zaf;

public abstract class zag
implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, Intent intent, int n3) {
        zad zad2 = new zad(intent, activity, n3);
        return zad2;
    }

    public static zag zac(Fragment fragment, Intent intent, int n3) {
        zae zae2 = new zae(intent, fragment, n3);
        return zae2;
    }

    public static zag zad(LifecycleFragment lifecycleFragment, Intent intent, int n3) {
        zaf zaf2 = new zaf(intent, lifecycleFragment, 2);
        return zaf2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(DialogInterface dialogInterface, int n3) {
        Throwable throwable2222222;
        block4: {
            this.zaa();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (ActivityNotFoundException activityNotFoundException) {}
                {
                    String string2 = Build.FINGERPRINT;
                    String string3 = "generic";
                    string2.contains(string3);
                }
            }
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
        throw throwable2222222;
    }

    public abstract void zaa();
}

