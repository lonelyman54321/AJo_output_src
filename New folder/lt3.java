/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.fonts.FontVariationAxis
 */
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import androidx.core.provider.h$b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class lt3
extends gt3 {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public lt3() {
        Object object = null;
        Object object2 = "android.graphics.FontFamily";
        object2 = Class.forName((String)object2);
        Constructor constructor = ((Class)object2).getConstructor(null);
        Method method = lt3.n((Class)object2);
        int n3 = 5;
        Object object3 = new Class[n3];
        Object object4 = ByteBuffer.class;
        int n4 = 0;
        Object object5 = null;
        object3[0] = object4;
        object4 = Integer.TYPE;
        n4 = 1;
        object3[n4] = object4;
        object5 = FontVariationAxis[].class;
        int n7 = 2;
        object3[n7] = object5;
        n4 = 3;
        object3[n4] = object4;
        n4 = 4;
        object3[n4] = object4;
        object4 = "addFontFromBuffer";
        object3 = ((Class)object2).getMethod((String)object4, (Class<?>)object3);
        object4 = "freeze";
        object4 = ((Class)object2).getMethod((String)object4, null);
        object5 = "abortCreation";
        object5 = ((Class)object2).getMethod((String)object5, null);
        try {
            object = this.o((Class)object2);
            Object object6 = object2;
            object2 = object;
            object = object6;
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            object2 = null;
            constructor = null;
            method = null;
            n3 = 0;
            object3 = null;
            object4 = null;
            n4 = 0;
            object5 = null;
        }
        this.f = object;
        this.g = constructor;
        this.h = method;
        this.i = object3;
        this.j = object4;
        this.k = object5;
        this.l = object2;
    }

    public static Method n(Class clazz) {
        Class<Integer> clazz2 = Integer.TYPE;
        Class<Boolean> clazz3 = Boolean.TYPE;
        Class[] classArray = new Class[]{AssetManager.class, String.class, clazz2, clazz3, clazz2, clazz2, clazz2, FontVariationAxis[].class};
        return clazz.getMethod("addFontFromAssetManager", classArray);
    }

    public final Typeface a(Context context, iV0$b iV0$cArray, Resources object, int n3) {
        Method method = this.h;
        if (method != null) {
            object = this.m();
            n3 = 0;
            if (object == null) {
                return null;
            }
            iV0$cArray = iV0$cArray.a;
            int n4 = iV0$cArray.length;
            boolean bl2 = false;
            Object object2 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                object2 = iV0$cArray[i3];
                String string2 = ((iV0$c)object2).a;
                FontVariationAxis[] fontVariationAxisArray = FontVariationAxis.fromFontVariationSettings((String)((iV0$c)object2).d);
                int n7 = ((iV0$c)object2).b;
                int n8 = ((iV0$c)object2).c;
                int n10 = ((iV0$c)object2).e;
                object2 = this;
                bl2 = this.j(context, object, string2, n10, n7, n8, fontVariationAxisArray);
                if (bl2) continue;
                this.i(object);
                return null;
            }
            boolean bl3 = this.l(object);
            if (!bl3) {
                return null;
            }
            return this.k(object);
        }
        return super.a(context, (iV0$b)iV0$cArray, (Resources)object, n3);
    }

    /*
     * Exception decompiling
     */
    public final Typeface b(Context var1_1, h$b[] var2_3, int var3_5) {
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

    public final Typeface e(Context context, Resources object, int n3, String string2, int n4) {
        Method method = this.h;
        if (method != null) {
            object = this.m();
            n3 = 0;
            if (object == null) {
                return null;
            }
            int n7 = -1;
            int n8 = -1;
            boolean bl2 = this.j(context, object, string2, 0, n7, n8, null);
            if (!bl2) {
                this.i(object);
                return null;
            }
            bl2 = this.l(object);
            if (!bl2) {
                return null;
            }
            return this.k(object);
        }
        return super.e(context, (Resources)object, n3, string2, n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void i(Object object) {
        Method method = this.k;
        try {
            method.invoke(object, null);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }

    public final boolean j(Context object, Object object2, String string2, int n3, int n4, int n7, FontVariationAxis[] fontVariationAxisArray) {
        Method method = this.h;
        object = object.getAssets();
        Integer n8 = 0;
        Integer n10 = n3;
        Integer n14 = n4;
        Integer n15 = n7;
        int n16 = 8;
        Object[] objectArray = new Object[n16];
        objectArray[0] = object;
        int n17 = 1;
        objectArray[n17] = string2;
        n17 = 2;
        objectArray[n17] = n8;
        object = Boolean.FALSE;
        int n18 = 3;
        objectArray[n18] = object;
        n17 = 4;
        objectArray[n17] = n10;
        n17 = 5;
        objectArray[n17] = n14;
        n17 = 6;
        objectArray[n17] = n15;
        n17 = 7;
        objectArray[n17] = fontVariationAxisArray;
        object = method.invoke(object2, objectArray);
        object = (Boolean)object;
        try {
            return (Boolean)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    public Typeface k(Object object) {
        int n3 = 0;
        int n4 = 1;
        Object object2 = this.f;
        object2 = Array.newInstance(object2, n4);
        Array.set(object2, 0, object);
        object = this.l;
        int n7 = -1;
        Integer n8 = n7;
        Integer n10 = n7;
        int n14 = 3;
        Object[] objectArray = new Object[n14];
        objectArray[0] = object2;
        objectArray[n4] = n8;
        n3 = 2;
        objectArray[n3] = n10;
        object = ((Method)object).invoke(null, objectArray);
        try {
            return (Typeface)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    public final boolean l(Object object) {
        Method method = this.j;
        object = method.invoke(object, null);
        object = (Boolean)object;
        try {
            return (Boolean)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object m() {
        Object var1_1 = null;
        Constructor constructor = this.g;
        try {
            return constructor.newInstance(null);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            return var1_1;
        }
    }

    public Method o(Class genericDeclaration) {
        boolean bl2 = true;
        genericDeclaration = Array.newInstance(genericDeclaration, (int)(bl2 ? 1 : 0)).getClass();
        Class[] classArray = new Class[3];
        classArray[0] = genericDeclaration;
        genericDeclaration = Integer.TYPE;
        classArray[bl2] = genericDeclaration;
        classArray[2] = genericDeclaration;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", classArray);
        ((AccessibleObject)((Object)genericDeclaration)).setAccessible(bl2);
        return genericDeclaration;
    }
}

