/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network.cache;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class CustomDiskCache {
    private final long CACHE_TTL;
    private final File cacheDir;
    private final Context context;

    public CustomDiskCache(Context object, long l2) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        this.context = object;
        this.CACHE_TTL = l2;
        object = object.getCacheDir();
        String string3 = "custom_cache";
        File file = new File((File)object, string3);
        boolean bl2 = file.exists();
        if (!bl2) {
            file.mkdirs();
        }
        this.cacheDir = file;
    }

    public final void clear() {
        block7: {
            File[] fileArray = this.cacheDir;
            fileArray = fileArray.listFiles();
            if (fileArray == null) break block7;
            int n3 = fileArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                File file = fileArray[i3];
                try {
                    file.delete();
                    continue;
                }
                catch (Exception exception) {
                    yn3$a yn3$a = yn3_0.a;
                    yn3$a.e(exception);
                    break;
                }
            }
        }
    }

    public final void clearFile(String fileArray) {
        block12: {
            Object object = "key";
            Intrinsics.checkNotNullParameter(fileArray, (String)object);
            File file = this.cacheDir;
            int n3 = fileArray.hashCode();
            fileArray = String.valueOf(n3);
            object = new File(file, (String)fileArray);
            fileArray = this.cacheDir;
            fileArray = fileArray.listFiles();
            if (fileArray == null) break block12;
            int n4 = fileArray.length;
            for (int i3 = 0; i3 < n4; ++i3) {
                File file2;
                try {
                    file2 = fileArray[i3];
                }
                catch (Exception exception) {}
                boolean bl2 = file2.equals(object);
                if (!bl2) continue;
                file2.delete();
                continue;
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
                break;
            }
        }
    }

    public final String getFromCache(String string2) {
        Object object;
        block10: {
            Exception exception22;
            Object object2;
            block11: {
                String string3;
                block9: {
                    int n3;
                    int n4;
                    int n7;
                    boolean bl2;
                    Intrinsics.checkNotNullParameter(string2, "key");
                    object = this.cacheDir;
                    string2 = String.valueOf(string2.hashCode());
                    object2 = new File((File)object, string2);
                    boolean n8 = ((File)object2).exists();
                    object = null;
                    if (!n8 || !(bl2 = ((File)object2).canRead())) break block10;
                    try {
                        string2 = om0_2.b((File)object2);
                        n7 = 6;
                        n4 = 124;
                        n3 = 0;
                    }
                    catch (Exception exception22) {}
                    n7 = StringsKt.N(string2, (char)n4, 0, false, n7);
                    n4 = n7 + 1;
                    string3 = le3_2.B(n4, string2);
                    n3 = -1;
                    if (n7 == n3) break block9;
                    string2 = le3_2.E(n7, string2);
                    long l2 = System.currentTimeMillis();
                    long l3 = Long.parseLong(string2);
                    l2 -= l3;
                    l3 = this.CACHE_TTL;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 <= 0) break block9;
                    this.clear();
                    return null;
                    break block11;
                }
                object = string3;
                break block10;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception22);
        }
        return object;
    }

    public final void put(String charSequence, String object) {
        Object object2 = "key";
        Intrinsics.checkNotNullParameter(charSequence, (String)object2);
        Object object3 = this.cacheDir;
        int n3 = ((String)charSequence).hashCode();
        charSequence = String.valueOf(n3);
        object2 = new File((File)object3, (String)charSequence);
        long l2 = System.currentTimeMillis();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(l2);
        object3 = "|";
        ((StringBuilder)charSequence).append((String)object3);
        charSequence = ((StringBuilder)charSequence).toString();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)charSequence);
        ((StringBuilder)object3).append((String)object);
        charSequence = ((StringBuilder)object3).toString();
        try {
            om0_2.c((File)object2, (String)charSequence);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
        }
    }
}

