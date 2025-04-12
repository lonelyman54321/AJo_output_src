/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Trace
 */
package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;

public class InitializationProvider
extends ContentProvider {
    public final int delete(Uri object, String string2, String[] stringArray) {
        object = new IllegalStateException("Not allowed.");
        throw object;
    }

    public final String getType(Uri object) {
        object = new IllegalStateException("Not allowed.");
        throw object;
    }

    public final Uri insert(Uri object, ContentValues contentValues) {
        object = new IllegalStateException("Not allowed.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onCreate() {
        Throwable throwable2222222;
        block5: {
            Object object = this.getContext();
            if (object == null) {
                object = new RuntimeException("Context cannot be null");
                throw object;
            }
            Object object2 = object.getApplicationContext();
            if (object2 == null) return true;
            object = Bo.c((Context)object);
            object2 = ((Object)((Object)this)).getClass();
            Context context = ((Bo)object).c;
            String string2 = "Startup";
            string2 = gp3_0.c(string2);
            Trace.beginSection((String)string2);
            string2 = new ComponentName(context, (Class)object2);
            object2 = context.getPackageManager();
            int n3 = 128;
            object2 = object2.getProviderInfo((ComponentName)string2, n3);
            object2 = object2.metaData;
            ((Bo)object).a((Bundle)object2);
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                {
                    object2 = new RuntimeException(nameNotFoundException);
                    throw object2;
                }
            }
            Trace.endSection();
            return true;
        }
        Trace.endSection();
        throw throwable2222222;
    }

    public final Cursor query(Uri object, String[] stringArray, String string2, String[] stringArray2, String string3) {
        object = new IllegalStateException("Not allowed.");
        throw object;
    }

    public final int update(Uri object, ContentValues contentValues, String string2, String[] stringArray) {
        object = new IllegalStateException("Not allowed.");
        throw object;
    }
}

