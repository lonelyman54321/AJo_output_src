/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tagmanager.TagManager;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdu;

public class PreviewActivity
extends Activity {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle object) {
        Exception exception2;
        block5: {
            zzbb zzbb2;
            CharSequence charSequence;
            CharSequence charSequence2;
            String string2;
            block4: {
                string2 = "No launch activity found for package name: ";
                charSequence2 = "Invoke the launch activity for package name: ";
                charSequence = "Cannot preview the app with the uri: ";
                try {
                    super.onCreate((Bundle)object);
                    object = "Preview activity";
                    zzbb2 = zzdc.zzb;
                    zzbb2.zzb((String)object);
                    object = this.getIntent();
                    object = object.getData();
                    if (object == null) {
                        return;
                    }
                    Object object2 = TagManager.getInstance((Context)this);
                    boolean bl2 = ((TagManager)object2).zzd((Uri)object);
                    if (bl2) break block4;
                    object = object.toString();
                    object2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)object2).append((String)object);
                    object = ". Launching current version instead.";
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    charSequence = "Preview failure";
                    object2 = "Continue";
                    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
                    builder = builder.create();
                    builder.setTitle(charSequence);
                    builder.setMessage((CharSequence)object);
                    object = new zzdu(this);
                    int n3 = -1;
                    builder.setButton(n3, (CharSequence)object2, (DialogInterface.OnClickListener)object);
                    builder.show();
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            object = this.getPackageManager();
            charSequence = this.getPackageName();
            if ((object = object.getLaunchIntentForPackage((String)charSequence)) != null) {
                string2 = this.getPackageName();
                charSequence = new StringBuilder((String)charSequence2);
                ((StringBuilder)charSequence).append(string2);
                string2 = ((StringBuilder)charSequence).toString();
                zzbb2.zzb(string2);
                this.startActivity((Intent)object);
                return;
            }
            object = this.getPackageName();
            charSequence2 = new StringBuilder(string2);
            ((StringBuilder)charSequence2).append((String)object);
            object = ((StringBuilder)charSequence2).toString();
            zzbb2.zzb((String)object);
            return;
        }
        String string3 = String.valueOf(exception2.getMessage());
        "Calling preview threw an exception: ".concat(string3);
    }
}

