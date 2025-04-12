/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dalvik.system.BaseDexClassLoader
 */
import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public final class JQ1 {
    public static final HashSet a;
    public static final boolean b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new HashSet();
        a = object;
        object = System.getProperty("java.vm.version");
        boolean bl2 = false;
        if (object != null) {
            StringTokenizer stringTokenizer = new StringTokenizer((String)object, ".");
            int n3 = stringTokenizer.hasMoreTokens();
            int n4 = 0;
            String string2 = null;
            if (n3 != 0) {
                object = stringTokenizer.nextToken();
            } else {
                n3 = 0;
                object = null;
            }
            int n7 = stringTokenizer.hasMoreTokens();
            if (n7 != 0) {
                string2 = stringTokenizer.nextToken();
            }
            if (object != null && string2 != null) {
                try {
                    n3 = Integer.parseInt((String)object);
                    int n8 = Integer.parseInt(string2);
                    n4 = 1;
                    n7 = 2;
                    if (n3 > n7 || n3 == n7 && n8 >= n4) {
                        bl2 = true;
                    }
                }
                catch (NumberFormatException numberFormatException) {}
            }
        }
        b = bl2;
    }

    public static void a(Context fileArray) {
        String string2;
        File file = new File((File)(fileArray = fileArray.getFilesDir()), string2 = "secondary-dexes");
        boolean bl2 = file.isDirectory();
        if (bl2) {
            file.getPath();
            fileArray = file.listFiles();
            if (fileArray == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArray) {
                file2.getPath();
                file2.length();
                boolean bl3 = file2.delete();
                if (!bl3) {
                    file2.getPath();
                    continue;
                }
                file2.getPath();
            }
            bl2 = file.delete();
            if (!bl2) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static void b(Context var0, File var1_3, File var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 34->39)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public static Field c(Object object, String charSequence) {
        Serializable serializable;
        for (serializable = object.getClass(); serializable != null; serializable = ((Class)serializable).getSuperclass()) {
            Field field;
            block5: {
                try {
                    field = ((Class)serializable).getDeclaredField((String)charSequence);
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    continue;
                }
                boolean bl2 = field.isAccessible();
                if (bl2) break block5;
                bl2 = true;
                ((AccessibleObject)field).setAccessible(bl2);
            }
            return field;
        }
        charSequence = Gn.a("Field ", (String)charSequence, " not found in ");
        object = object.getClass();
        ((StringBuilder)charSequence).append(object);
        object = ((StringBuilder)charSequence).toString();
        serializable = new NoSuchFieldException((String)object);
        throw serializable;
    }

    public static void d(Context context) {
        Comparable<StringBuilder> comparable;
        Object object;
        Object object2;
        boolean bl2 = b;
        if (bl2) {
            return;
        }
        try {
            object2 = context.getApplicationInfo();
        }
        catch (RuntimeException runtimeException) {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null) {
            return;
        }
        try {
            object = object2.sourceDir;
        }
        catch (Exception exception) {
            comparable = new Comparable<StringBuilder>("MultiDex installation failed (");
            String string2 = exception.getMessage();
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append(").");
            string2 = ((StringBuilder)comparable).toString();
            object2 = new RuntimeException(string2);
            throw object2;
        }
        comparable = new Comparable<StringBuilder>((String)object);
        object2 = object2.dataDir;
        object = new File((String)object2);
        JQ1.b(context, comparable, (File)object);
    }

    public static void e(BaseDexClassLoader object, File object2, ArrayList object3) {
        block11: {
            int n3 = 2;
            int n4 = 3;
            int n7 = 1;
            boolean bl2 = object3.isEmpty();
            if (!bl2) {
                object = JQ1.c(object, "pathList").get(object);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(object3);
                object3 = "makeDexElements";
                Class[] classArray = new Class[n4];
                Class clazz = ArrayList.class;
                classArray[0] = clazz;
                Object object4 = File.class;
                classArray[n7] = object4;
                classArray[n3] = clazz;
                for (clazz = object.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
                    block10: {
                        object4 = clazz.getDeclaredMethod((String)object3, classArray);
                        boolean bl3 = ((AccessibleObject)object4).isAccessible();
                        if (bl3) break block10;
                        try {
                            ((AccessibleObject)object4).setAccessible(n7 != 0);
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                            continue;
                        }
                    }
                    object3 = new Object[n4];
                    object3[0] = arrayList2;
                    object3[n7] = object2;
                    object3[n3] = arrayList;
                    object2 = (Object[])((Method)object4).invoke(object, (Object[])object3);
                    object3 = JQ1.c(object, "dexElements");
                    Object[] objectArray = (Object[])((Field)object3).get(object);
                    Object[] objectArray2 = objectArray.getClass().getComponentType();
                    n7 = objectArray.length;
                    int n8 = ((Object[])object2).length;
                    objectArray2 = (Object[])Array.newInstance(objectArray2, n7 += n8);
                    n7 = objectArray.length;
                    System.arraycopy(objectArray, 0, objectArray2, 0, n7);
                    n3 = objectArray.length;
                    n7 = ((Object[])object2).length;
                    System.arraycopy(object2, 0, objectArray2, n3, n7);
                    ((Field)object3).set(object, objectArray2);
                    int n10 = arrayList.size();
                    if (n10 > 0) {
                        int n14;
                        object2 = arrayList.iterator();
                        while ((n14 = object2.hasNext()) != 0) {
                            object3 = (IOException)object2.next();
                        }
                        object2 = JQ1.c(object, "dexElementsSuppressedExceptions");
                        object3 = (IOException[])((Field)object2).get(object);
                        if (object3 == null) {
                            n14 = arrayList.size();
                            object3 = new IOException[n14];
                            object3 = (IOException[])arrayList.toArray((T[])object3);
                        } else {
                            n3 = arrayList.size();
                            n4 = ((Object)object3).length;
                            objectArray = new IOException[n3 += n4];
                            arrayList.toArray(objectArray);
                            n4 = arrayList.size();
                            n7 = ((Object)object3).length;
                            System.arraycopy(object3, 0, objectArray, n4, n7);
                            object3 = objectArray;
                        }
                        ((Field)object2).set(object, object3);
                        object = new IOException("I/O exception during makeDexElement");
                        object2 = (Throwable)arrayList.get(0);
                        ((Throwable)object).initCause((Throwable)object2);
                        throw object;
                    }
                    break block11;
                }
                object3 = new StringBuilder("Method makeDexElements with parameters ");
                List<Class> list = Arrays.asList(classArray);
                ((StringBuilder)object3).append(list);
                ((StringBuilder)object3).append(" not found in ");
                object = object.getClass();
                ((StringBuilder)object3).append(object);
                object = ((StringBuilder)object3).toString();
                object2 = new NoSuchMethodException((String)object);
                throw object2;
            }
        }
    }

    public static void f(File object) {
        ((File)object).mkdir();
        boolean bl2 = ((File)object).isDirectory();
        if (!bl2) {
            Serializable serializable = ((File)object).getParentFile();
            if (serializable == null) {
                ((File)object).getPath();
            } else {
                ((File)object).getPath();
                ((File)serializable).isDirectory();
                ((File)serializable).isFile();
                ((File)serializable).exists();
                ((File)serializable).canRead();
                ((File)serializable).canWrite();
            }
            StringBuilder stringBuilder = new StringBuilder("Failed to create directory ");
            object = ((File)object).getPath();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            serializable = new IOException((String)object);
            throw serializable;
        }
    }
}

