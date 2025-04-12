/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath$ResourceInfo;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;

final class ClassPath$LocationInfo {
    private final ClassLoader classloader;
    final File home;

    public ClassPath$LocationInfo(File object, ClassLoader classLoader) {
        object = (File)Preconditions.checkNotNull(object);
        this.home = object;
        this.classloader = object = (ClassLoader)Preconditions.checkNotNull(classLoader);
    }

    private void scan(File object, Set set, ImmutableSet$Builder object2) {
        boolean bl2;
        block4: {
            try {
                bl2 = ((File)object).exists();
                if (bl2) break block4;
                return;
            }
            catch (SecurityException securityException) {
                object2 = ClassPath.access$000();
                StringBuilder stringBuilder = new StringBuilder("Cannot access ");
                stringBuilder.append(object);
                stringBuilder.append(": ");
                stringBuilder.append(securityException);
                object = stringBuilder.toString();
                ((Logger)object2).warning((String)object);
                return;
            }
        }
        bl2 = ((File)object).isDirectory();
        if (bl2) {
            this.scanDirectory((File)object, (ImmutableSet$Builder)object2);
        } else {
            this.scanJar((File)object, set, (ImmutableSet$Builder)object2);
        }
    }

    private void scanDirectory(File file, ImmutableSet$Builder immutableSet$Builder) {
        HashSet<File> hashSet = new HashSet<File>();
        File file2 = file.getCanonicalFile();
        hashSet.add(file2);
        this.scanDirectory(file, "", hashSet, immutableSet$Builder);
    }

    private void scanDirectory(File object, String object2, Set object3, ImmutableSet$Builder immutableSet$Builder) {
        File[] fileArray = ((File)object).listFiles();
        if (fileArray == null) {
            object2 = ClassPath.access$000();
            object3 = new StringBuilder("Cannot read directory ");
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            ((Logger)object2).warning((String)object);
            return;
        }
        for (File file : fileArray) {
            Object object4;
            String string2 = file.getName();
            boolean bl2 = file.isDirectory();
            if (bl2) {
                File file2 = file.getCanonicalFile();
                bl2 = object3.add(file2);
                if (!bl2) continue;
                object4 = "/";
                string2 = n1.a((String)object2, string2, (String)object4);
                this.scanDirectory(file2, string2, (Set)object3, immutableSet$Builder);
                object3.remove(file2);
                continue;
            }
            bl2 = (string2 = Ft2.a((String)object2, string2)).equals(object4 = "META-INF/MANIFEST.MF");
            if (bl2) continue;
            object4 = this.classloader;
            ClassPath$ResourceInfo classPath$ResourceInfo = ClassPath$ResourceInfo.of(file, string2, (ClassLoader)object4);
            immutableSet$Builder.add(classPath$ResourceInfo);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void scanJar(File object, Set set, ImmutableSet$Builder immutableSet$Builder) {
        Throwable throwable2222222;
        JarFile jarFile;
        block10: {
            block9: {
                jarFile = new JarFile((File)object);
                try {
                    boolean bl2;
                    Object object2 = jarFile.getManifest();
                    object = ClassPath.getClassPathFromManifest((File)object, (Manifest)object2);
                    object = ((ImmutableSet)object).iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = object.next();
                        File file = ((File)(object2 = (File)object2)).getCanonicalFile();
                        boolean bl3 = set.add(file);
                        if (!bl3) continue;
                        this.scan((File)object2, set, immutableSet$Builder);
                    }
                }
                catch (Throwable throwable2222222) {
                    break block9;
                }
                this.scanJarFile(jarFile, immutableSet$Builder);
                try {
                    jarFile.close();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
            try {}
            catch (IOException iOException) {
                throw throwable2222222;
            }
            break block10;
            catch (IOException iOException) {
                return;
            }
        }
        jarFile.close();
        throw throwable2222222;
    }

    private void scanJarFile(JarFile jarFile, ImmutableSet$Builder immutableSet$Builder) {
        boolean bl2;
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (bl2 = enumeration.hasMoreElements()) {
            Object object;
            Object object2;
            Object object3 = enumeration.nextElement();
            boolean bl3 = ((ZipEntry)object3).isDirectory();
            if (bl3 || (bl3 = ((String)(object2 = ((ZipEntry)object3).getName())).equals(object = "META-INF/MANIFEST.MF"))) continue;
            object = jarFile.getName();
            object2 = new File((String)object);
            object3 = ((ZipEntry)object3).getName();
            object = this.classloader;
            object3 = ClassPath$ResourceInfo.of((File)object2, (String)object3, (ClassLoader)object);
            immutableSet$Builder.add(object3);
        }
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof ClassPath$LocationInfo;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (ClassPath$LocationInfo)object;
            Object object2 = this.home;
            File file = ((ClassPath$LocationInfo)object).home;
            bl2 = ((File)object2).equals(file);
            if (bl2 && (bl4 = (object2 = this.classloader).equals(object = ((ClassPath$LocationInfo)object).classloader))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final File file() {
        return this.home;
    }

    public int hashCode() {
        return this.home.hashCode();
    }

    public ImmutableSet scanResources() {
        HashSet hashSet = new HashSet();
        return this.scanResources(hashSet);
    }

    public ImmutableSet scanResources(Set set) {
        ImmutableSet$Builder immutableSet$Builder = ImmutableSet.builder();
        File file = this.home;
        set.add(file);
        file = this.home;
        this.scan(file, set, immutableSet$Builder);
        return immutableSet$Builder.build();
    }

    public String toString() {
        return this.home.toString();
    }
}

