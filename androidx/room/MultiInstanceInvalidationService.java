/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.room.MultiInstanceInvalidationService$a;
import androidx.room.MultiInstanceInvalidationService$b;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class MultiInstanceInvalidationService
extends Service {
    public int a;
    public final LinkedHashMap b;
    public final MultiInstanceInvalidationService$b c;
    public final MultiInstanceInvalidationService$a d;

    public MultiInstanceInvalidationService() {
        Object object;
        this.b = object = new Object();
        super(this);
        this.c = object;
        super(this);
        this.d = object;
    }

    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.d;
    }
}

