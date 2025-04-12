/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.loader.ResourcesLoader
 *  android.content.res.loader.ResourcesProvider
 *  android.os.ParcelFileDescriptor
 *  android.system.Os
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ResourcesLoader create(Context object, Map object2) {
        void var0_5;
        block24: {
            Throwable throwable422222;
            ResourcesLoader resourcesLoader;
            FileOutputStream fileOutputStream;
            int n3;
            block23: {
                block22: {
                    block21: {
                        try {
                            object = ColorResourcesTableCreator.create(object, (Map)object2);
                            n3 = ((Context)object).length;
                            n3 = ((Context)object).length;
                            if (n3 != 0) break block21;
                            return null;
                        }
                        catch (Exception exception) {
                            return null;
                        }
                    }
                    object2 = jy_2.a();
                    if (object2 != null) break block22;
                    if (object2 == null) return null;
                    Os.close((FileDescriptor)object2);
                    return null;
                }
                fileOutputStream = new FileOutputStream((FileDescriptor)object2);
                ((OutputStream)fileOutputStream).write((byte[])object);
                object = ParcelFileDescriptor.dup((FileDescriptor)object2);
                ny_1.a();
                resourcesLoader = my_1.a();
                ResourcesProvider resourcesProvider = ky_1.a((ParcelFileDescriptor)object);
                ly_1.a(resourcesLoader, resourcesProvider);
                if (object == null) break block23;
                object.close();
            }
            ((OutputStream)fileOutputStream).close();
            Os.close((FileDescriptor)object2);
            return resourcesLoader;
            catch (Throwable throwable2) {
                if (object == null) throw throwable2;
                try {
                    object.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    try {
                        throwable2.addSuppressed(throwable3);
                        throw throwable2;
                    }
                    catch (Throwable throwable422222) {}
                }
            }
            try {
                ((OutputStream)fileOutputStream).close();
                throw throwable422222;
            }
            catch (Throwable throwable5) {
                try {
                    throwable422222.addSuppressed(throwable5);
                    throw throwable422222;
                }
                catch (Throwable throwable6) {}
            }
            break block24;
            catch (Throwable throwable7) {
                n3 = 0;
                object2 = null;
            }
        }
        if (object2 == null) throw var0_5;
        Os.close((FileDescriptor)object2);
        throw var0_5;
    }
}

