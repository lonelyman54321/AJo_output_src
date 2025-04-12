/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.utility.image;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

public final class CCClearCachedImageWorker
extends Worker {
    public CCClearCachedImageWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    public static boolean b(File file) {
        boolean bl2 = file.isDirectory();
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            Iterator iterator = ArrayIteratorKt.iterator(file.list());
            while (bl4 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                File file2 = new File(file, string2);
                bl4 = CCClearCachedImageWorker.b(file2);
                if (bl4) continue;
                return false;
            }
            return file.delete();
        }
        bl2 = file.isFile();
        if (bl2) {
            bl3 = file.delete();
        }
        return bl3;
    }

    public final c$a doWork() {
        Object object = this.getApplicationContext().getExternalCacheDir();
        if (object != null) {
            String string2 = "/ComplaintDetails";
            File file = new File((File)object, string2);
            boolean bl2 = file.exists();
            if (bl2 && (bl2 = CCClearCachedImageWorker.b(file))) {
                object = new c$a$c();
                Intrinsics.checkNotNull(object);
            } else {
                object = new c$a$a();
                Intrinsics.checkNotNull(object);
            }
            return object;
        }
        object = new c$a$a();
        Intrinsics.checkNotNullExpressionValue(object, "failure(...)");
        return object;
    }
}

