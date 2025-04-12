/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.system.OsConstants
 *  android.system.StructStat
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.provider.h$b;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class gt3
extends ot3 {
    public static Class a;
    public static Constructor b;
    public static Method c;
    public static Method d;
    public static boolean e = false;

    /*
     * WARNING - void declaration
     */
    public static boolean g(boolean bl2, String object, int n3, Object object2) {
        void var6_9;
        gt3.h();
        Method method = c;
        Integer n4 = n3;
        Object object3 = bl2;
        int n7 = 3;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object;
        int n8 = 1;
        objectArray[n8] = n4;
        n8 = 2;
        objectArray[n8] = object3;
        object3 = method.invoke(object2, objectArray);
        object3 = (Boolean)object3;
        try {
            return (Boolean)object3;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        object = new RuntimeException((Throwable)var6_9);
        throw object;
    }

    public static void h() {
        Method method = null;
        int n3 = 1;
        boolean bl2 = e;
        if (bl2) {
            return;
        }
        e = n3;
        bl2 = false;
        Constructor constructor = null;
        Object object = "android.graphics.FontFamily";
        object = Class.forName((String)object);
        Constructor constructor2 = ((Class)object).getConstructor(null);
        Object object2 = "addFontWeightStyle";
        int n4 = 3;
        Object object3 = new Class[n4];
        Class clazz = String.class;
        object3[0] = clazz;
        clazz = Integer.TYPE;
        object3[n3] = clazz;
        clazz = Boolean.TYPE;
        int n7 = 2;
        object3[n7] = clazz;
        object2 = ((Class)object).getMethod((String)object2, (Class<?>)object3);
        object3 = Array.newInstance(object, n3);
        clazz = Typeface.class;
        String string2 = "createFromFamiliesWithDefault";
        object3 = object3.getClass();
        Class[] classArray = new Class[n3];
        classArray[0] = object3;
        try {
            method = clazz.getMethod(string2, classArray);
            constructor = constructor2;
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            method = null;
            object = null;
            object2 = null;
        }
        b = constructor;
        a = object;
        c = object2;
        d = method;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface a(Context object, iV0$b object2, Resources objectArray, int n3) {
        void var1_5;
        int n7;
        Constructor constructor;
        int n4;
        block15: {
            void var1_9;
            n4 = 1;
            gt3.h();
            try {
                constructor = b;
                constructor = constructor.newInstance(null);
                object2 = ((iV0$b)object2).a;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            n7 = ((Object)object2).length;
            break block15;
            object2 = new RuntimeException((Throwable)var1_9);
            throw object2;
        }
        for (int i3 = 0; i3 < n7; i3 += n4) {
            Object iV0$c = object2[i3];
            File file = pt3.d((Context)object);
            if (file == null) {
                return null;
            }
            try {
                int n8 = ((iV0$c)iV0$c).f;
                n8 = (int)(pt3.b(file, (Resources)objectArray, n8) ? 1 : 0);
                if (n8 == 0) {
                    return null;
                }
                String string2 = file.getPath();
                int n10 = ((iV0$c)iV0$c).b;
                boolean bl2 = ((iV0$c)iV0$c).c;
                if (bl2 = gt3.g(bl2, string2, n10, constructor)) continue;
                return null;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
            finally {
                file.delete();
            }
        }
        gt3.h();
        try {
            object = a;
            object = Array.newInstance(object, n4);
            Array.set(object, 0, constructor);
            object2 = d;
            objectArray = new Object[n4];
            objectArray[0] = object;
            object = ((Method)object2).invoke(null, objectArray);
            return (Typeface)object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        object2 = new RuntimeException((Throwable)var1_5);
        throw object2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface b(Context context, h$b[] object, int n3) {
        Throwable throwable422222;
        Object object2;
        Object object3;
        block23: {
            block22: {
                int n4;
                block21: {
                    n4 = ((Uri)object).length;
                    int n7 = 1;
                    if (n4 < n7) {
                        return null;
                    }
                    object = this.f((h$b[])object, n3);
                    object3 = context.getContentResolver();
                    object = object.a;
                    object2 = "r";
                    object = object3.openFileDescriptor(object, (String)object2, null);
                    if (object == null) {
                        if (object == null) return null;
                        object.close();
                        return null;
                    }
                    object3 = "/proc/self/fd/";
                    {
                        catch (IOException iOException) {
                            return null;
                        }
                    }
                    try {
                        object2 = new StringBuilder((String)object3);
                        n3 = object.getFd();
                        ((StringBuilder)object2).append(n3);
                        object3 = ((StringBuilder)object2).toString();
                        object3 = Os.readlink((String)object3);
                        object2 = Os.stat((String)object3);
                        n4 = ((StructStat)object2).st_mode;
                        n4 = (int)(OsConstants.S_ISREG((int)n4) ? 1 : 0);
                        if (n4 == 0) break block21;
                        object2 = new File((String)object3);
                        break block22;
                    }
                    catch (ErrnoException errnoException) {}
                }
                n4 = 0;
                object2 = null;
            }
            if (object2 != null) {
                n3 = (int)(((File)object2).canRead() ? 1 : 0);
                if (n3 == 0) break block23;
                context = Typeface.createFromFile((File)object2);
                object.close();
                return context;
            }
        }
        object2 = object.getFileDescriptor();
        object3 = new FileInputStream((FileDescriptor)object2);
        context = this.d(context, (InputStream)object3);
        ((FileInputStream)object3).close();
        object.close();
        return context;
        catch (Throwable throwable2) {
            try {
                ((FileInputStream)object3).close();
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
            object.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }
}

