/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvg;

public final class AdActivity
extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbvg zza;

    private final void zza() {
        zzbvg zzbvg2 = this.zza;
        if (zzbvg2 != null) {
            try {
                zzbvg2.zzx();
                return;
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        block3: {
            zzbvg zzbvg2 = this.zza;
            if (zzbvg2 == null) break block3;
            try {
                zzbvg2.zzh(n3, n4, intent);
            }
            catch (Exception exception) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, exception);
            }
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onBackPressed() {
        RemoteException remoteException3;
        String string2;
        block8: {
            block7: {
                zzbvg zzbvg2;
                block6: {
                    string2 = "#007 Could not call remote method.";
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block6;
                    try {
                        boolean bl2 = zzbvg2.zzH();
                        if (!bl2) break block7;
                    }
                    catch (RemoteException remoteException2) {
                        zzm.zzl(string2, remoteException2);
                    }
                }
                super.onBackPressed();
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block7;
                }
                catch (RemoteException remoteException3) {}
                zzbvg2.zzi();
                return;
                break block8;
            }
            return;
        }
        zzm.zzl(string2, remoteException3);
    }

    public final void onConfigurationChanged(Configuration object) {
        RemoteException remoteException2;
        block5: {
            block4: {
                zzbvg zzbvg2;
                super.onConfigurationChanged(object);
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block4;
                }
                catch (RemoteException remoteException2) {}
                object = ObjectWrapper.wrap(object);
                zzbvg2.zzk((IObjectWrapper)object);
                return;
                break block5;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void onCreate(Bundle bundle) {
        zzbvg zzbvg2;
        super.onCreate(bundle);
        this.zza = zzbvg2 = zzay.zza().zzo(this);
        String string2 = "#007 Could not call remote method.";
        if (zzbvg2 != null) {
            try {
                zzbvg2.zzl(bundle);
                return;
            }
            catch (RemoteException remoteException) {
                zzm.zzl(string2, remoteException);
                this.finish();
                return;
            }
        }
        zzm.zzl(string2, null);
        this.finish();
    }

    public final void onDestroy() {
        block3: {
            zzbvg zzbvg2 = this.zza;
            if (zzbvg2 == null) break block3;
            try {
                zzbvg2.zzm();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
        super.onDestroy();
    }

    public final void onPause() {
        block3: {
            zzbvg zzbvg2 = this.zza;
            if (zzbvg2 == null) break block3;
            try {
                zzbvg2.zzo();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
                this.finish();
            }
        }
        super.onPause();
    }

    public final void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbvg zzbvg2;
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbvg2.zzp(n3, stringArray, nArray);
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void onRestart() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbvg zzbvg2;
                super.onRestart();
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbvg2.zzq();
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
        this.finish();
    }

    public final void onResume() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbvg zzbvg2;
                super.onResume();
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbvg2.zzr();
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
        this.finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        block3: {
            zzbvg zzbvg2 = this.zza;
            if (zzbvg2 == null) break block3;
            try {
                zzbvg2.zzs(bundle);
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
                this.finish();
            }
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbvg zzbvg2;
                super.onStart();
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbvg2.zzt();
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
        this.finish();
    }

    public final void onStop() {
        block3: {
            zzbvg zzbvg2 = this.zza;
            if (zzbvg2 == null) break block3;
            try {
                zzbvg2.zzu();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
                this.finish();
            }
        }
        super.onStop();
    }

    public final void onUserLeaveHint() {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbvg zzbvg2;
                super.onUserLeaveHint();
                try {
                    zzbvg2 = this.zza;
                    if (zzbvg2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbvg2.zzv();
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setContentView(int n3) {
        super.setContentView(n3);
        this.zza();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        this.zza();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.zza();
    }
}

