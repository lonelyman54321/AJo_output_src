/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.core.provider.h$b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public final class ht3
extends ot3 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Method method = null;
        int n3 = 1;
        Constructor constructor = null;
        Object object = "android.graphics.FontFamily";
        object = Class.forName((String)object);
        Constructor constructor2 = ((Class)object).getConstructor(null);
        Object object2 = "addFontWeightStyle";
        int n4 = 5;
        Object object3 = new Class[n4];
        Class clazz = ByteBuffer.class;
        object3[0] = clazz;
        clazz = Integer.TYPE;
        object3[n3] = clazz;
        Object object4 = List.class;
        int n7 = 2;
        object3[n7] = object4;
        int n8 = 3;
        object3[n8] = clazz;
        clazz = Boolean.TYPE;
        n8 = 4;
        object3[n8] = clazz;
        object2 = ((Class)object).getMethod((String)object2, (Class<?>)object3);
        object3 = Array.newInstance(object, n3);
        clazz = Typeface.class;
        object4 = "createFromFamiliesWithDefault";
        object3 = object3.getClass();
        Class[] classArray = new Class[n3];
        classArray[0] = object3;
        try {
            method = clazz.getMethod((String)object4, classArray);
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

    public static boolean g(Object object, ByteBuffer byteBuffer, int n3, int n4, boolean bl2) {
        Method method = c;
        Integer n7 = n3;
        Integer n8 = n4;
        Boolean bl3 = bl2;
        int n10 = 5;
        Object[] objectArray = new Object[n10];
        objectArray[0] = byteBuffer;
        int n14 = 1;
        objectArray[n14] = n7;
        n14 = 0;
        byteBuffer = null;
        n3 = 2;
        objectArray[n3] = null;
        n14 = 3;
        objectArray[n14] = n8;
        n14 = 4;
        objectArray[n14] = bl3;
        object = method.invoke(object, objectArray);
        object = (Boolean)object;
        try {
            return (Boolean)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    public static Typeface h(Object object) {
        int n3 = 1;
        Object object2 = a;
        object2 = Array.newInstance(object2, n3);
        Array.set(object2, 0, object);
        object = d;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object = ((Method)object).invoke(null, objectArray);
        try {
            return (Typeface)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public final Typeface a(Context var1_1, iV0$b var2_2, Resources var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Typeface b(Context context, h$b[] h$bArray, int n3) {
        Constructor constructor = b;
        try {
            constructor = constructor.newInstance(null);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        a53 a532 = new a53();
        for (h$b h$b : h$bArray) {
            Uri uri = h$b.a;
            ByteBuffer byteBuffer = (ByteBuffer)a532.get(uri);
            if (byteBuffer == null) {
                byteBuffer = pt3.e(context, uri);
                a532.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            int n4 = h$b.c;
            boolean bl2 = h$b.d;
            int n7 = h$b.b;
            if ((n7 = (int)(ht3.g(constructor, byteBuffer, n7, n4, bl2) ? 1 : 0)) != 0) continue;
            return null;
        }
        context = ht3.h(constructor);
        if (context == null) {
            return null;
        }
        return Typeface.create((Typeface)context, (int)n3);
    }
}

