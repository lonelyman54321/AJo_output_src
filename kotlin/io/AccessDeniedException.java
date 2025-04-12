/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.File;
import kotlin.io.FileSystemException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AccessDeniedException
extends FileSystemException {
    public AccessDeniedException(File object, File file, String string2, int n3, DefaultConstructorMarker object2) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            file = null;
        }
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        CharSequence charSequence = "file";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object = ((File)object).toString();
        super((String)object);
        if (file != null) {
            object2 = " -> ";
            object = new StringBuilder((String)object2);
            ((StringBuilder)object).append(file);
            object = ((StringBuilder)object).toString();
            ((StringBuilder)charSequence).append((String)object);
        }
        if (string2 != null) {
            object = ": ".concat(string2);
            ((StringBuilder)charSequence).append((String)object);
        }
        object = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        super((String)object);
    }
}

