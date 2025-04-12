/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.io.TempFileCreator;
import com.google.common.io.TempFileCreator$1;
import com.google.common.io.TempFileCreator$JavaNioCreator$1;
import com.google.common.io.TempFileCreator$JavaNioCreator$PermissionSupplier;
import com.google.common.io.d;
import com.google.common.io.e;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.EnumSet;
import java.util.Objects;

final class TempFileCreator$JavaNioCreator
extends TempFileCreator {
    private static final TempFileCreator$JavaNioCreator$PermissionSupplier directoryPermissions;
    private static final TempFileCreator$JavaNioCreator$PermissionSupplier filePermissions;

    static {
        String string2;
        Object object = r01_0.a(q01_0.b());
        boolean bl2 = object.contains(string2 = "posix");
        if (bl2) {
            filePermissions = object = new Object();
            directoryPermissions = object = new Object();
        } else {
            string2 = "acl";
            boolean bl3 = object.contains(string2);
            if (bl3) {
                directoryPermissions = object = TempFileCreator$JavaNioCreator.userPermissions();
                filePermissions = object;
            } else {
                directoryPermissions = object = new Object();
                filePermissions = object;
            }
        }
    }

    private TempFileCreator$JavaNioCreator() {
        super(null);
    }

    public /* synthetic */ TempFileCreator$JavaNioCreator(TempFileCreator$1 tempFileCreator$1) {
        this();
    }

    public static /* synthetic */ FileAttribute a() {
        return TempFileCreator$JavaNioCreator.lambda$static$1();
    }

    public static /* synthetic */ TempFileCreator$JavaNioCreator$PermissionSupplier access$300() {
        return TempFileCreator$JavaNioCreator.userPermissions();
    }

    public static /* synthetic */ FileAttribute b() {
        return TempFileCreator$JavaNioCreator.lambda$static$0();
    }

    public static /* synthetic */ FileAttribute c(FileAttribute fileAttribute) {
        return fileAttribute;
    }

    public static /* synthetic */ FileAttribute d() {
        return TempFileCreator$JavaNioCreator.lambda$static$2();
    }

    public static /* synthetic */ FileAttribute e(IOException iOException) {
        return TempFileCreator$JavaNioCreator.lambda$userPermissions$4(iOException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String getUsername() {
        Object object = null;
        int n3 = 1;
        String string2 = StandardSystemProperty.USER_NAME.value();
        Objects.requireNonNull(string2);
        Object object2 = "java.lang.ProcessHandle";
        try {
            Class<Object> clazz;
            object2 = Class.forName((String)object2);
            Object object3 = "java.lang.ProcessHandle$Info";
            object3 = Class.forName((String)object3);
            Object object4 = "java.util.Optional";
            object4 = Class.forName((String)object4);
            Object object5 = "current";
            object5 = ((Class)object2).getMethod((String)object5, null);
            String string3 = "info";
            object2 = ((Class)object2).getMethod(string3, null);
            string3 = "user";
            object3 = ((Class)object3).getMethod(string3, null);
            string3 = "orElse";
            Class[] classArray = new Class[n3];
            classArray[0] = clazz = Object.class;
            object4 = ((Class)object4).getMethod(string3, classArray);
            object5 = ((Method)object5).invoke(null, null);
            object2 = ((Method)object2).invoke(object5, null);
            object2 = ((Method)object3).invoke(object2, null);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = ((Method)object4).invoke(object2, objectArray);
            Objects.requireNonNull(object);
            return (String)object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException | NoSuchMethodException reflectiveOperationException) {
            return string2;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return string2;
        }
        Throwable throwable = invocationTargetException.getCause();
        Throwables.throwIfUnchecked(throwable);
        return string2;
    }

    private static /* synthetic */ FileAttribute lambda$static$0() {
        return lj3_1.a(Ih0.b());
    }

    private static /* synthetic */ FileAttribute lambda$static$1() {
        return lj3_1.a(kj3_2.a());
    }

    private static /* synthetic */ FileAttribute lambda$static$2() {
        CharSequence charSequence = new StringBuilder("unrecognized FileSystem type ");
        FileSystem fileSystem = q01_0.b();
        charSequence.append(fileSystem);
        charSequence = charSequence.toString();
        IOException iOException = new IOException((String)charSequence);
        throw iOException;
    }

    private static /* synthetic */ FileAttribute lambda$userPermissions$4(IOException iOException) {
        IOException iOException2 = new IOException("Could not find user", iOException);
        throw iOException2;
    }

    private static TempFileCreator$JavaNioCreator$PermissionSupplier userPermissions() {
        Object object;
        Object object2;
        try {
            object2 = q01_0.b();
        }
        catch (IOException iOException) {
            object = new e(iOException);
            return object;
        }
        object2 = cj3_2.a((FileSystem)object2);
        object = TempFileCreator$JavaNioCreator.getUsername();
        object2 = dj3_2.a((UserPrincipalLookupService)object2, (String)object);
        object = dx2_0.b();
        Enum enum_ = ej3_1.a();
        object = fj3_1.a((AclEntry.Builder)object, (AclEntryType)enum_);
        object2 = h00.a((AclEntry.Builder)object, (UserPrincipal)object2);
        object = gj3_1.a();
        object = EnumSet.allOf(object);
        object2 = hj3_0.a((AclEntry.Builder)object2, object);
        int n3 = 2;
        object = new AclEntryFlag[n3];
        enum_ = ij3_1.a();
        int n4 = 0;
        object[0] = enum_;
        enum_ = nj3_1.a();
        n4 = 1;
        object[n4] = enum_;
        object2 = oj3_0.a((AclEntry.Builder)object2, object);
        object2 = bj3_2.a((AclEntry.Builder)object2);
        object2 = ImmutableList.of(object2);
        object = new TempFileCreator$JavaNioCreator$1((ImmutableList)object2);
        object2 = new d((FileAttribute)object);
        return object2;
    }

    public File createTempDir() {
        IllegalStateException illegalStateException;
        Object object;
        try {
            object = StandardSystemProperty.JAVA_IO_TMPDIR;
        }
        catch (IOException iOException) {
            illegalStateException = new IllegalStateException("Failed to create directory", iOException);
            throw illegalStateException;
        }
        object = object.value();
        illegalStateException = null;
        Object[] objectArray = new String[]{};
        object = aj3_2.a((String)object, (String[])objectArray);
        int n3 = 1;
        objectArray = new FileAttribute[n3];
        Object object2 = directoryPermissions;
        object2 = object2.get();
        objectArray[0] = object2;
        object = mj3_1.a((Path)object, (FileAttribute[])objectArray);
        return p01_0.b((Path)object);
    }

    public File createTempFile(String string2) {
        Object object = StandardSystemProperty.JAVA_IO_TMPDIR.value();
        Object[] objectArray = new String[]{};
        object = aj3_2.a((String)object, (String[])objectArray);
        objectArray = new FileAttribute[1];
        FileAttribute fileAttribute = filePermissions.get();
        objectArray[0] = fileAttribute;
        return p01_0.b(jj3_1.a((Path)object, string2, (FileAttribute[])objectArray));
    }
}

