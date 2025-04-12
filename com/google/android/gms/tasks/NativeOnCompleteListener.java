/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class NativeOnCompleteListener
implements OnCompleteListener {
    private final long zza;

    public NativeOnCompleteListener(long l2) {
        this.zza = l2;
    }

    public static void createAndAddCallback(Task task2, long l2) {
        NativeOnCompleteListener nativeOnCompleteListener = new NativeOnCompleteListener(l2);
        task2.addOnCompleteListener(nativeOnCompleteListener);
    }

    public native void nativeOnComplete(long var1, Object var3, boolean var4, boolean var5, String var6);

    public void onComplete(Task task2) {
        Object object;
        Object object2;
        boolean bl2 = task2.isSuccessful();
        if (bl2) {
            Object object3;
            object2 = object3 = task2.getResult();
            object = null;
        } else {
            Object object4;
            bl2 = task2.isCanceled();
            if (!bl2 && (object4 = task2.getException()) != null) {
                object = object4 = ((Throwable)object4).getMessage();
                object2 = null;
            } else {
                object2 = null;
                object = null;
            }
        }
        long l2 = this.zza;
        boolean bl3 = task2.isSuccessful();
        boolean bl4 = task2.isCanceled();
        this.nativeOnComplete(l2, object2, bl3, bl4, (String)object);
    }
}

