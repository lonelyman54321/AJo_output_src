/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.storages;

import android.content.Context;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.IsFirstForUserStorage;
import com.affise.attribution.storages.IsFirstForUserStorageImpl$Companion;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

public final class IsFirstForUserStorageImpl
implements IsFirstForUserStorage {
    public static final IsFirstForUserStorageImpl$Companion Companion;
    private static final String NAME = "first-for-user";
    private final Context context;
    private final LogsManager logsManager;

    static {
        IsFirstForUserStorageImpl$Companion isFirstForUserStorageImpl$Companion;
        Companion = isFirstForUserStorageImpl$Companion = new IsFirstForUserStorageImpl$Companion(null);
    }

    public IsFirstForUserStorageImpl(Context context, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.context = context;
        this.logsManager = logsManager2;
    }

    private final File getEventsFile() {
        boolean bl2;
        Object object = this.context;
        Object object2 = "affise-events";
        String string2 = null;
        boolean bl3 = ((File)(object = object.getDir((String)object2, 0))).exists();
        if (!bl3) {
            ((File)object).mkdir();
        }
        if (!(bl2 = ((File)(object2 = new File((File)object, string2 = NAME))).exists())) {
            ((File)object2).createNewFile();
        }
        return object2;
    }

    public void add(String object) {
        Intrinsics.checkNotNullParameter(object, "eventClass");
        File file = this.getEventsFile();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        char c2 = '\n';
        ((StringBuilder)object2).append(c2);
        object = ((StringBuilder)object2).toString();
        object2 = Charsets.UTF_8;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(file, string2);
        Intrinsics.checkNotNullParameter(object, "text");
        String string3 = "charset";
        Intrinsics.checkNotNullParameter(object2, string3);
        object = ((String)object).getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object, "getBytes(...)");
        Intrinsics.checkNotNullParameter(file, string2);
        Intrinsics.checkNotNullParameter(object, "array");
        boolean bl2 = true;
        object2 = new FileOutputStream(file, bl2);
        try {
            ((FileOutputStream)object2).write((byte[])object);
            object = Unit.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object2, throwable);
                throw throwable2;
            }
        }
        xj3_1.b((Closeable)object2, null);
    }

    public List getEventsNames() {
        Exception exception2;
        block14: {
            ArrayList<Object> arrayList;
            block13: {
                Object object = this.getEventsFile();
                object = om0_2.a((File)object);
                int n3 = 10;
                n3 = yx_2.o((Iterable)object, n3);
                try {
                    arrayList = new ArrayList<Object>(n3);
                    object = ((ArrayList)object).iterator();
                }
                catch (Exception exception2) {}
                while (true) {
                    n3 = (int)(object.hasNext() ? 1 : 0);
                    if (n3 == 0) break block13;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (String)object2;
                    object2 = StringsKt.m0(object2);
                    object2 = object2.toString();
                    arrayList.add(object2);
                    continue;
                }
                break block14;
            }
            return arrayList;
        }
        this.logsManager.addSdkError(exception2);
        return mz0_2.a;
    }
}

