/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.TempFileCreator$1;
import com.google.common.io.TempFileCreator$JavaIoCreator;
import com.google.common.io.TempFileCreator$JavaNioCreator;
import com.google.common.io.TempFileCreator$ThrowingCreator;
import java.io.File;
import java.lang.reflect.Field;

abstract class TempFileCreator {
    static final TempFileCreator INSTANCE = TempFileCreator.pickSecureCreator();

    private TempFileCreator() {
    }

    public /* synthetic */ TempFileCreator(TempFileCreator$1 tempFileCreator$1) {
        this();
    }

    private static TempFileCreator pickSecureCreator() {
        Object object = "java.nio.file.Path";
        try {
            Class.forName((String)object);
        }
        catch (ClassNotFoundException classNotFoundException) {
            block18: {
                object = "android.os.Build$VERSION";
                object = Class.forName((String)object);
                Object object2 = "SDK_INT";
                object = ((Class)object).getField((String)object2);
                object = ((Field)object).get(null);
                object = (Integer)object;
                int n3 = (Integer)object;
                object2 = "android.os.Build$VERSION_CODES";
                object2 = Class.forName((String)object2);
                String string2 = "JELLY_BEAN";
                object2 = ((Class)object2).getField(string2);
                object2 = ((Field)object2).get(null);
                object2 = (Integer)object2;
                int n4 = (Integer)object2;
                if (n3 >= n4) break block18;
                try {
                    object = new TempFileCreator$ThrowingCreator(null);
                    return object;
                }
                catch (IllegalAccessException illegalAccessException) {
                    object = new TempFileCreator$ThrowingCreator(null);
                    return object;
                }
                catch (ClassNotFoundException classNotFoundException2) {
                    object = new TempFileCreator$ThrowingCreator(null);
                    return object;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    object = new TempFileCreator$ThrowingCreator(null);
                    return object;
                }
            }
            object = new TempFileCreator$JavaIoCreator(null);
            return object;
        }
        object = new TempFileCreator$JavaNioCreator(null);
        return object;
    }

    public static void testMakingUserPermissionsFromScratch() {
        TempFileCreator$JavaNioCreator.access$300().get();
    }

    public abstract File createTempDir();

    public abstract File createTempFile(String var1);
}

