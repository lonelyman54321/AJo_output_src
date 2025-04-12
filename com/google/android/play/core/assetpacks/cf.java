/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 */
package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.z;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

final class cf {
    private final aq a;

    public cf(aq aq2) {
        this.a = aq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream a(int n3, String charSequence, String object, int n4) {
        ExecutionException executionException2;
        Object object2;
        String string2;
        String string3;
        String string4;
        block5: {
            InterruptedException interruptedException2;
            block4: {
                Object object3;
                string4 = ", chunkNumber ";
                string3 = " sliceId ";
                string2 = " packName ";
                String string5 = "Corrupted ParcelFileDescriptor, session ";
                object2 = ((z)this.a.a()).a(n3, (String)charSequence, (String)object, n4);
                try {
                    object2 = Tasks.await((Task)object2);
                    object2 = (ParcelFileDescriptor)object2;
                    if (object2 != null && (object3 = object2.getFileDescriptor()) != null) {
                        return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor)object2);
                    }
                }
                catch (InterruptedException interruptedException2) {
                    break block4;
                }
                catch (ExecutionException executionException2) {
                    break block5;
                }
                object3 = new StringBuilder(string5);
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append((String)charSequence);
                ((StringBuilder)object3).append(string3);
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(string4);
                ((StringBuilder)object3).append(n4);
                string5 = ((StringBuilder)object3).toString();
                object2 = new cz(string5, n3);
                throw object2;
            }
            object = new cz("Extractor was interrupted while waiting for chunk file.", interruptedException2, n3);
            throw object;
        }
        charSequence = Fh3.a(n3, "Error opening chunk file, session ", string2, (String)charSequence, string3);
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(n4);
        charSequence = ((StringBuilder)charSequence).toString();
        object2 = new cz((String)charSequence, executionException2, n3);
        throw object2;
    }
}

