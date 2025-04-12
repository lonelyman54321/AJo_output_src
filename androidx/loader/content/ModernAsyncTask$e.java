/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package androidx.loader.content;

import android.os.Handler;
import android.os.Message;
import androidx.loader.content.ModernAsyncTask;
import androidx.loader.content.ModernAsyncTask$d;
import androidx.loader.content.ModernAsyncTask$f;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ModernAsyncTask$e
extends Handler {
    public final void handleMessage(Message object) {
        Object object2 = (ModernAsyncTask$d)((Message)object).obj;
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) {
                object = ((ModernAsyncTask$d)object2).a;
                object.getClass();
            }
        } else {
            object = ((ModernAsyncTask$d)object2).a;
            object2 = ((ModernAsyncTask$d)object2).b[0];
            AtomicBoolean atomicBoolean = ((ModernAsyncTask)object).d;
            n4 = (int)(atomicBoolean.get() ? 1 : 0);
            if (n4 != 0) {
                ((ModernAsyncTask)object).b(object2);
            } else {
                ((ModernAsyncTask)object).c(object2);
            }
            object2 = ModernAsyncTask$f.FINISHED;
            ((ModernAsyncTask)object).c = object2;
        }
    }
}

