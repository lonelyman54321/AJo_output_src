/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.reflect.ClassPath$ClassInfo;
import com.google.common.reflect.ClassPath$LocationInfo;
import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ClassPath {
    private static final String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR;
    private static final Logger logger;
    private final ImmutableSet resources;

    static {
        logger = Logger.getLogger(ClassPath.class.getName());
        CLASS_PATH_ATTRIBUTE_SEPARATOR = Splitter.on(" ").omitEmptyStrings();
    }

    private ClassPath(ImmutableSet immutableSet) {
        this.resources = immutableSet;
    }

    public static /* synthetic */ Logger access$000() {
        return logger;
    }

    public static ClassPath from(ClassLoader object) {
        Serializable serializable;
        boolean bl2;
        object = ClassPath.locationsFrom((ClassLoader)object);
        AbstractCollection abstractCollection = new AbstractCollection();
        Object object2 = ((ImmutableSet)object).iterator();
        while (bl2 = object2.hasNext()) {
            serializable = ((ClassPath$LocationInfo)object2.next()).file();
            abstractCollection.add(serializable);
        }
        object2 = ImmutableSet.builder();
        object = ((ImmutableSet)object).iterator();
        while (bl2 = object.hasNext()) {
            serializable = ((ClassPath$LocationInfo)object.next()).scanResources((Set)((Object)abstractCollection));
            ((ImmutableSet$Builder)object2).addAll((Iterable)((Object)serializable));
        }
        abstractCollection = ((ImmutableSet$Builder)object2).build();
        object = new ClassPath((ImmutableSet)abstractCollection);
        return object;
    }

    private static ImmutableList getClassLoaderUrls(ClassLoader classLoader) {
        boolean bl2 = classLoader instanceof URLClassLoader;
        if (bl2) {
            return ImmutableList.copyOf(((URLClassLoader)classLoader).getURLs());
        }
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
        boolean bl3 = classLoader.equals(classLoader2);
        if (bl3) {
            return ClassPath.parseJavaClassPath();
        }
        return ImmutableList.of();
    }

    public static String getClassName(String string2) {
        int n3 = string2.length() + -6;
        return string2.substring(0, n3).replace('/', '.');
    }

    public static ImmutableMap getClassPathEntries(ClassLoader classLoader) {
        boolean bl2;
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Object object = classLoader.getParent();
        if (object != null) {
            object = ClassPath.getClassPathEntries((ClassLoader)object);
            ((AbstractMap)linkedHashMap).putAll(object);
        }
        object = ClassPath.getClassLoaderUrls(classLoader).iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            Serializable serializable = (URL)object.next();
            String string3 = serializable.getProtocol();
            boolean bl3 = string3.equals(string2 = "file");
            if (!bl3 || (bl3 = ((AbstractMap)linkedHashMap).containsKey(serializable = ClassPath.toFile(serializable)))) continue;
            ((AbstractMap)linkedHashMap).put(serializable, classLoader);
        }
        return ImmutableMap.copyOf((Map)linkedHashMap);
    }

    public static URL getClassPathEntry(File serializable, String string2) {
        serializable = serializable.toURI().toURL();
        URL uRL = new URL((URL)serializable, string2);
        return uRL;
    }

    public static ImmutableSet getClassPathFromManifest(File file, Manifest iterator) {
        if (iterator == null) {
            return ImmutableSet.of();
        }
        ImmutableSet$Builder immutableSet$Builder = ImmutableSet.builder();
        iterator = ((Manifest)((Object)iterator)).getMainAttributes();
        Object object = Attributes.Name.CLASS_PATH.toString();
        if ((iterator = ((Attributes)((Object)iterator)).getValue((String)object)) != null) {
            boolean bl2;
            object = CLASS_PATH_ATTRIBUTE_SEPARATOR;
            iterator = ((Splitter)object).split((CharSequence)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                CharSequence charSequence;
                Object object2;
                object = (String)iterator.next();
                try {
                    object2 = ((URL)(object = ClassPath.getClassPathEntry(file, (String)object))).getProtocol();
                    boolean bl3 = ((String)object2).equals(charSequence = "file");
                    if (!bl3) continue;
                }
                catch (MalformedURLException malformedURLException) {
                    object2 = logger;
                    String string2 = "Invalid Class-Path entry: ";
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    ((Logger)object2).warning((String)object);
                    continue;
                }
                object = ClassPath.toFile((URL)object);
                immutableSet$Builder.add(object);
            }
        }
        return immutableSet$Builder.build();
    }

    public static ImmutableSet locationsFrom(ClassLoader object) {
        boolean bl2;
        ImmutableSet$Builder immutableSet$Builder = ImmutableSet.builder();
        object = ClassPath.getClassPathEntries((ClassLoader)object).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            File file = (File)object2.getKey();
            object2 = (ClassLoader)object2.getValue();
            ClassPath$LocationInfo classPath$LocationInfo = new ClassPath$LocationInfo(file, (ClassLoader)object2);
            immutableSet$Builder.add(classPath$LocationInfo);
        }
        return immutableSet$Builder.build();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ImmutableList parseJavaClassPath() {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        Object object = Splitter.on(StandardSystemProperty.PATH_SEPARATOR.value());
        String string2 = StandardSystemProperty.JAVA_CLASS_PATH.value();
        object = ((Splitter)object).split(string2).iterator();
        boolean bl2;
        while (bl2 = object.hasNext()) {
            StringBuilder stringBuilder;
            Object object2;
            Object object3;
            MalformedURLException malformedURLException2222222;
            string2 = (String)object.next();
            Serializable serializable = new File(string2);
            serializable = ((File)serializable).toURI();
            serializable = ((URI)serializable).toURL();
            immutableList$Builder.add(serializable);
            continue;
            {
                catch (MalformedURLException malformedURLException2222222) {
                }
                catch (SecurityException securityException) {}
                {
                    object3 = "file";
                    object2 = new File(string2);
                    object2 = ((File)object2).getAbsolutePath();
                    stringBuilder = null;
                    serializable = new URL((String)object3, null, (String)object2);
                    immutableList$Builder.add(serializable);
                    continue;
                }
            }
            object3 = logger;
            object2 = Level.WARNING;
            String string3 = "malformed classpath entry: ";
            stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            ((Logger)object3).log((Level)object2, string2, malformedURLException2222222);
        }
        return immutableList$Builder.build();
    }

    public static File toFile(URL object) {
        Object object2 = ((URL)object).getProtocol();
        Object object3 = "file";
        boolean bl2 = ((String)object2).equals(object3);
        Preconditions.checkArgument(bl2);
        try {
            object3 = ((URL)object).toURI();
        }
        catch (URISyntaxException uRISyntaxException) {
            object = ((URL)object).getPath();
            object2 = new File((String)object);
            return object2;
        }
        object2 = new File((URI)object3);
        return object2;
    }

    public ImmutableSet getAllClasses() {
        return FluentIterable.from(this.resources).filter(ClassPath$ClassInfo.class).toSet();
    }

    public ImmutableSet getResources() {
        return this.resources;
    }

    public ImmutableSet getTopLevelClasses() {
        FluentIterable fluentIterable = FluentIterable.from(this.resources).filter(ClassPath$ClassInfo.class);
        tu_1 tu_12 = new Object();
        return fluentIterable.filter(tu_12).toSet();
    }

    public ImmutableSet getTopLevelClasses(String string2) {
        boolean bl2;
        Preconditions.checkNotNull(string2);
        ImmutableSet$Builder immutableSet$Builder = ImmutableSet.builder();
        UnmodifiableIterator unmodifiableIterator = this.getTopLevelClasses().iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            ClassPath$ClassInfo classPath$ClassInfo = (ClassPath$ClassInfo)unmodifiableIterator.next();
            String string3 = classPath$ClassInfo.getPackageName();
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            immutableSet$Builder.add(classPath$ClassInfo);
        }
        return immutableSet$Builder.build();
    }

    public ImmutableSet getTopLevelClassesRecursive(String string2) {
        boolean bl2;
        Preconditions.checkNotNull(string2);
        Object object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        char c2 = '.';
        ((StringBuilder)object).append(c2);
        string2 = ((StringBuilder)object).toString();
        object = ImmutableSet.builder();
        UnmodifiableIterator unmodifiableIterator = this.getTopLevelClasses().iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            ClassPath$ClassInfo classPath$ClassInfo = (ClassPath$ClassInfo)unmodifiableIterator.next();
            String string3 = classPath$ClassInfo.getName();
            boolean bl3 = string3.startsWith(string2);
            if (!bl3) continue;
            ((ImmutableSet$Builder)object).add(classPath$ClassInfo);
        }
        return ((ImmutableSet$Builder)object).build();
    }
}

