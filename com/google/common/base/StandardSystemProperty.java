/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

public final class StandardSystemProperty
extends Enum {
    private static final /* synthetic */ StandardSystemProperty[] $VALUES;
    public static final /* enum */ StandardSystemProperty FILE_SEPARATOR;
    public static final /* enum */ StandardSystemProperty JAVA_CLASS_PATH;
    public static final /* enum */ StandardSystemProperty JAVA_CLASS_VERSION;
    public static final /* enum */ StandardSystemProperty JAVA_COMPILER;
    public static final /* enum */ StandardSystemProperty JAVA_EXT_DIRS;
    public static final /* enum */ StandardSystemProperty JAVA_HOME;
    public static final /* enum */ StandardSystemProperty JAVA_IO_TMPDIR;
    public static final /* enum */ StandardSystemProperty JAVA_LIBRARY_PATH;
    public static final /* enum */ StandardSystemProperty JAVA_SPECIFICATION_NAME;
    public static final /* enum */ StandardSystemProperty JAVA_SPECIFICATION_VENDOR;
    public static final /* enum */ StandardSystemProperty JAVA_SPECIFICATION_VERSION;
    public static final /* enum */ StandardSystemProperty JAVA_VENDOR;
    public static final /* enum */ StandardSystemProperty JAVA_VENDOR_URL;
    public static final /* enum */ StandardSystemProperty JAVA_VERSION;
    public static final /* enum */ StandardSystemProperty JAVA_VM_NAME;
    public static final /* enum */ StandardSystemProperty JAVA_VM_SPECIFICATION_NAME;
    public static final /* enum */ StandardSystemProperty JAVA_VM_SPECIFICATION_VENDOR;
    public static final /* enum */ StandardSystemProperty JAVA_VM_SPECIFICATION_VERSION;
    public static final /* enum */ StandardSystemProperty JAVA_VM_VENDOR;
    public static final /* enum */ StandardSystemProperty JAVA_VM_VERSION;
    public static final /* enum */ StandardSystemProperty LINE_SEPARATOR;
    public static final /* enum */ StandardSystemProperty OS_ARCH;
    public static final /* enum */ StandardSystemProperty OS_NAME;
    public static final /* enum */ StandardSystemProperty OS_VERSION;
    public static final /* enum */ StandardSystemProperty PATH_SEPARATOR;
    public static final /* enum */ StandardSystemProperty USER_DIR;
    public static final /* enum */ StandardSystemProperty USER_HOME;
    public static final /* enum */ StandardSystemProperty USER_NAME;
    private final String key;

    private static /* synthetic */ StandardSystemProperty[] $values() {
        StandardSystemProperty standardSystemProperty = JAVA_VERSION;
        standardSystemProperty = JAVA_VENDOR;
        standardSystemProperty = JAVA_VENDOR_URL;
        standardSystemProperty = JAVA_HOME;
        standardSystemProperty = JAVA_VM_SPECIFICATION_VERSION;
        standardSystemProperty = JAVA_VM_SPECIFICATION_VENDOR;
        standardSystemProperty = JAVA_VM_SPECIFICATION_NAME;
        standardSystemProperty = JAVA_VM_VERSION;
        standardSystemProperty = JAVA_VM_VENDOR;
        standardSystemProperty = JAVA_VM_NAME;
        standardSystemProperty = JAVA_SPECIFICATION_VERSION;
        standardSystemProperty = JAVA_SPECIFICATION_VENDOR;
        standardSystemProperty = JAVA_SPECIFICATION_NAME;
        standardSystemProperty = JAVA_CLASS_VERSION;
        standardSystemProperty = JAVA_CLASS_PATH;
        standardSystemProperty = JAVA_LIBRARY_PATH;
        standardSystemProperty = JAVA_IO_TMPDIR;
        standardSystemProperty = JAVA_COMPILER;
        standardSystemProperty = JAVA_EXT_DIRS;
        standardSystemProperty = OS_NAME;
        standardSystemProperty = OS_ARCH;
        standardSystemProperty = OS_VERSION;
        standardSystemProperty = FILE_SEPARATOR;
        standardSystemProperty = PATH_SEPARATOR;
        standardSystemProperty = LINE_SEPARATOR;
        standardSystemProperty = USER_NAME;
        standardSystemProperty = USER_HOME;
        standardSystemProperty = USER_DIR;
        StandardSystemProperty[] standardSystemPropertyArray = new StandardSystemProperty[]{standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty, standardSystemProperty};
        return standardSystemPropertyArray;
    }

    static {
        StandardSystemProperty standardSystemProperty;
        JAVA_VERSION = standardSystemProperty = new StandardSystemProperty("JAVA_VERSION", 0, "java.version");
        JAVA_VENDOR = standardSystemProperty = new StandardSystemProperty("JAVA_VENDOR", 1, "java.vendor");
        JAVA_VENDOR_URL = standardSystemProperty = new StandardSystemProperty("JAVA_VENDOR_URL", 2, "java.vendor.url");
        JAVA_HOME = standardSystemProperty = new StandardSystemProperty("JAVA_HOME", 3, "java.home");
        JAVA_VM_SPECIFICATION_VERSION = standardSystemProperty = new StandardSystemProperty("JAVA_VM_SPECIFICATION_VERSION", 4, "java.vm.specification.version");
        JAVA_VM_SPECIFICATION_VENDOR = standardSystemProperty = new StandardSystemProperty("JAVA_VM_SPECIFICATION_VENDOR", 5, "java.vm.specification.vendor");
        JAVA_VM_SPECIFICATION_NAME = standardSystemProperty = new StandardSystemProperty("JAVA_VM_SPECIFICATION_NAME", 6, "java.vm.specification.name");
        JAVA_VM_VERSION = standardSystemProperty = new StandardSystemProperty("JAVA_VM_VERSION", 7, "java.vm.version");
        JAVA_VM_VENDOR = standardSystemProperty = new StandardSystemProperty("JAVA_VM_VENDOR", 8, "java.vm.vendor");
        JAVA_VM_NAME = standardSystemProperty = new StandardSystemProperty("JAVA_VM_NAME", 9, "java.vm.name");
        JAVA_SPECIFICATION_VERSION = standardSystemProperty = new StandardSystemProperty("JAVA_SPECIFICATION_VERSION", 10, "java.specification.version");
        JAVA_SPECIFICATION_VENDOR = standardSystemProperty = new StandardSystemProperty("JAVA_SPECIFICATION_VENDOR", 11, "java.specification.vendor");
        JAVA_SPECIFICATION_NAME = standardSystemProperty = new StandardSystemProperty("JAVA_SPECIFICATION_NAME", 12, "java.specification.name");
        JAVA_CLASS_VERSION = standardSystemProperty = new StandardSystemProperty("JAVA_CLASS_VERSION", 13, "java.class.version");
        JAVA_CLASS_PATH = standardSystemProperty = new StandardSystemProperty("JAVA_CLASS_PATH", 14, "java.class.path");
        JAVA_LIBRARY_PATH = standardSystemProperty = new StandardSystemProperty("JAVA_LIBRARY_PATH", 15, "java.library.path");
        JAVA_IO_TMPDIR = standardSystemProperty = new StandardSystemProperty("JAVA_IO_TMPDIR", 16, "java.io.tmpdir");
        JAVA_COMPILER = standardSystemProperty = new StandardSystemProperty("JAVA_COMPILER", 17, "java.compiler");
        JAVA_EXT_DIRS = standardSystemProperty = new StandardSystemProperty("JAVA_EXT_DIRS", 18, "java.ext.dirs");
        OS_NAME = standardSystemProperty = new StandardSystemProperty("OS_NAME", 19, "os.name");
        OS_ARCH = standardSystemProperty = new StandardSystemProperty("OS_ARCH", 20, "os.arch");
        OS_VERSION = standardSystemProperty = new StandardSystemProperty("OS_VERSION", 21, "os.version");
        FILE_SEPARATOR = standardSystemProperty = new StandardSystemProperty("FILE_SEPARATOR", 22, "file.separator");
        PATH_SEPARATOR = standardSystemProperty = new StandardSystemProperty("PATH_SEPARATOR", 23, "path.separator");
        LINE_SEPARATOR = standardSystemProperty = new StandardSystemProperty("LINE_SEPARATOR", 24, "line.separator");
        USER_NAME = standardSystemProperty = new StandardSystemProperty("USER_NAME", 25, "user.name");
        USER_HOME = standardSystemProperty = new StandardSystemProperty("USER_HOME", 26, "user.home");
        USER_DIR = standardSystemProperty = new StandardSystemProperty("USER_DIR", 27, "user.dir");
        $VALUES = StandardSystemProperty.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private StandardSystemProperty() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.key = var3_2;
    }

    public static StandardSystemProperty valueOf(String string2) {
        return Enum.valueOf(StandardSystemProperty.class, string2);
    }

    public static StandardSystemProperty[] values() {
        return (StandardSystemProperty[])$VALUES.clone();
    }

    public String key() {
        return this.key;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.key();
        stringBuilder.append(string2);
        stringBuilder.append("=");
        string2 = this.value();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String value() {
        return System.getProperty(this.key);
    }
}

